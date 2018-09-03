package state.vote.impl;

import state.vote.VoteManager;
import state.vote.VoteState;

/**
 * 　　具体状态类——重复投票
 * @author: songdewei
 * @date: 2018/9/3
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }
}
