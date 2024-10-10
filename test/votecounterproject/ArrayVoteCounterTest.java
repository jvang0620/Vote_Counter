package votecounterproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 1.0
 * @author JV
 */
public class ArrayVoteCounterTest {

    private ArrayVoteCounter voteCounter;

    @Before
    public void setUp() throws Exception {
        voteCounter = new ArrayVoteCounter();
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
        assertEquals(voteCounter.getVoteIndex(), 0);
        // Generate 20 votes for Darth Vader
        for (int i = 0; i < 20; i++) {
            voteCounter.recordVote("Darth Vader");
            assertEquals(voteCounter.getVoteIndex(), i + 1);
            assertEquals(voteCounter.getMemberVotes("Vader"), i + 1);
        }

    }

}