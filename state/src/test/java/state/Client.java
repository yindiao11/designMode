package state;

import state.vote.VoteManager;

/**
 * @author: songdewei
 * @date: 2018/9/3
 */
public class Client {
    public static void main(String[] args) {

        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
