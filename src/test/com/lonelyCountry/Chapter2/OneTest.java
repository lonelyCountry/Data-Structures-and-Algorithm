package com.lonelyCountry.Chapter2;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * One Tester.
 *
 * @author YeFan
 * @version 1.0
 * @since <pre>09/24/2017</pre>
 */
public class OneTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: maxSubSum1(int[] arr)
     */
    @Test
    public void testMaxSubSum1() throws Exception {
        int[] arr = {-20, 100, 40, -80, 23};
        System.out.println(One.maxSubSum1(arr));

        System.out.println(One.maxSubSum2(arr));
    }


} 
