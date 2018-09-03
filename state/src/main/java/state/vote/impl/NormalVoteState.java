package state.vote.impl;

import state.vote.VoteManager;
import state.vote.VoteState;

/**
 * 　　具体状态类——重复投票
 * @author: songdewei
 * @date: 2018/9/3
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }
}
