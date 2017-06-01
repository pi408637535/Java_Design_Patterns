package com.pattern.state;

/**
 * Created by piguanghua on 2017/6/1.
 */
public class NormalVoteState implements VoteState {
    public void handler(String user, VoteManager voteManager, String  voteType) {
        voteManager.getMapVoteType().put(user, voteType);
        System.out.println("Congratulation ！");
    }
}
