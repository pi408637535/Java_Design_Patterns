package com.pattern.state;

/**
 * Created by piguanghua on 2017/6/1.
 */
public class RepeatVosteState implements VoteState {
    public void handler(String user, VoteManager voteManager, String voteType) {
        System.out.println("Repeate !"+ user);
    }
}
