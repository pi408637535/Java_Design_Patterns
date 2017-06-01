package com.pattern.state;

/**
 * Created by piguanghua on 2017/6/1.
 */
public class Client {
    public static void main(String args[]){
        VoteManager voteManager = new VoteManager();

        for(int i = 0; i < 9; i++){
            voteManager.vote("Pi", "A");
        }
    }
}
