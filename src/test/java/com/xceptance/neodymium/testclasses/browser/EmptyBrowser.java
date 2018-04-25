package com.xceptance.neodymium.testclasses.browser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.xceptance.neodymium.NeodymiumRunner;
import com.xceptance.neodymium.multibrowser.Browser;

@RunWith(NeodymiumRunner.class)
@Browser(
    {
        ""
    })
public class EmptyBrowser
{

    @Test
    public void testName() throws Exception
    {
        Assert.fail();
    }
}
