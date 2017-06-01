package com.pattern.state;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by piguanghua on 2017/6/1.
 */
public class VoteManager {
    private VoteState voteState;

    //用户--投票个数
    private Map<String, Integer> mapVote = new HashMap<String, Integer>();

    //用户--投票类型
    private Map<String, String> mapVoteType = new HashMap<String, String>();;

    public Map<String, String> getMapVoteType() {
        return mapVoteType;
    }

    public void setMapVoteType(Map<String, String> mapVoteType) {
        this.mapVoteType = mapVoteType;
    }

    public VoteState getVoteState() {
        return voteState;
    }

    public void setVoteState(VoteState voteState) {
        this.voteState = voteState;
    }

    public Map<String, Integer> getMapVote() {
        return mapVote;
    }

    public void setMapVote(Map<String, Integer> mapVote) {
        this.mapVote = mapVote;
    }

    public void vote(String user, String voteItem){
        Integer number = mapVote.get(user);
        if(number == null){
            mapVoteType.put(user, voteItem);
            voteState = new NormalVoteState();
            number = 0;
        }else {
            if(number == 2)
                voteState = new RepeatVosteState();
            if(number > 2)
                voteState = new BlackVoteState();
        }
        number++;
        this.getMapVote().put(user, number);
        voteState.handler(user, this, voteItem);
    }
}
