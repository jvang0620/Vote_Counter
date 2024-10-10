package votecounterproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 1.0
 * @author JV
 */
public class ArrayListVoteCounterTest {

    private ArrayListVoteCounter voteCounter;

    @Before
    public void setUp() throws Exception {
        this.voteCounter = new ArrayListVoteCounter();
        /*
         * Data Legend:
         * [0] = "Darth Sidius"
         * [1] = "Darth Maul"
         * [2] = "Darth Vader"
         * [3] = "Darth Plagueis"
         */
    }

    @Test
    public void recordVote() {
        String candidate = "Darth Sidius";

        // assert both the votes and spoiled votes lists are empty.
        assertEquals(0, voteCounter.getVotes().size());
        assertEquals(0, voteCounter.getSpoiledVotes().size());

        // record some votes for one of the candidates. Use the legend
        // above for clarification
        for (int i = 1; i <= 100; i++) {
            voteCounter.recordVote(candidate);
        }

        // using the getSithSenateMemberVotes method, make sure your candidate
        // actually recieved their votes
        assertEquals(100, voteCounter.getSithSenateMemberVotes(candidate));

        // assert that the size of the votes list has increased.
        assertEquals(100, voteCounter.getVotes().size());

    }

}