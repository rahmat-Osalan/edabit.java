package very.easy.test;

import org.junit.Test;

import very.easy.UpvotesVsDownvotes;

public class UpvotesVsDownvotesT {
    @Test
    public void test1() {
        assert (UpvotesVsDownvotes.getVoteCount(13, 0) == 13);
    }

    @Test
    public void test2() {
        assert (UpvotesVsDownvotes.getVoteCount(2, 33) == -31);
    }

    @Test
    public void test3() {
        assert (UpvotesVsDownvotes.getVoteCount(132, 132) == 0);
    }

    @Test
    public void test4() {
        assert (UpvotesVsDownvotes.getVoteCount(0, 0) == 0);
    }

    @Test
    public void test5() {
        assert (UpvotesVsDownvotes.getVoteCount(5, 30) == -25);
    }
}
