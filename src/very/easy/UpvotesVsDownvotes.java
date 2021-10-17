// https://edabit.com/challenge/XJxu5LCnqN9K8SXm5
package very.easy;

/* Given an object containing counts of both upvotes and downvotes,
        return what vote count should be displayed. */
public class UpvotesVsDownvotes {
    public static int getVoteCount(int upvotes, int downvotes) {
        // This is calculated by subtracting the number of downvotes from upvotes.
        return upvotes - downvotes;
    }
}
