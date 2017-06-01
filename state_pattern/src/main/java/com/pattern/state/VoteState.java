package com.pattern.state;

/**
 * Created by piguanghua on 2017/6/1.
 */
public interface VoteState {
    void handler(String user, VoteManager voteManager, String  voteType);
}
