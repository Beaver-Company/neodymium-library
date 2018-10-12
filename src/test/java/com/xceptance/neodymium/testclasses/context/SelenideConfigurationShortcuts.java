package com.xceptance.neodymium.testclasses.context;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Configuration.AssertionMode;
import com.xceptance.neodymium.NeodymiumRunner;
import com.xceptance.neodymium.module.statement.browser.multibrowser.Browser;
import com.xceptance.neodymium.util.Neodymium;

@RunWith(NeodymiumRunner.class)
@Browser("Chrome_headless")
public class SelenideConfigurationShortcuts
{
    @Test
    public void validateSoftAssertion()
    {
        Assert.assertEquals(Configuration.assertionMode, AssertionMode.STRICT);

        Neodymium.softAssertions(true);
        Assert.assertEquals(Configuration.assertionMode, AssertionMode.SOFT);

        Neodymium.softAssertions(false);
        Assert.assertEquals(Configuration.assertionMode, AssertionMode.STRICT);
    }

    @Test
    public void validateClickViaJs()
    {
        Assert.assertEquals(Configuration.clickViaJs, false);

        Neodymium.clickViaJs(true);
        Assert.assertEquals(Configuration.clickViaJs, true);

        Neodymium.clickViaJs(false);
        Assert.assertEquals(Configuration.clickViaJs, false);
    }

    @Test
    public void validateFastSetValue()
    {
        Assert.assertEquals(Configuration.fastSetValue, false);

        Neodymium.fastSetValue(true);
        Assert.assertEquals(Configuration.fastSetValue, true);

        Neodymium.fastSetValue(false);
        Assert.assertEquals(Configuration.fastSetValue, false);
    }

    @Test
    public void validateTimeout()
    {
        Assert.assertEquals(Configuration.timeout, 3000);

        Neodymium.timeout(1000);
        Assert.assertEquals(Configuration.timeout, 1000);

        Neodymium.timeout(2000);
        Assert.assertEquals(Configuration.timeout, 2000);
    }

    @Test
    public void validateCollectionsTimeout()
    {
        Assert.assertEquals(Configuration.collectionsTimeout, 6000);

        Neodymium.collectionsTimeout(1000);
        Assert.assertEquals(Configuration.collectionsTimeout, 1000);

        Neodymium.collectionsTimeout(2000);
        Assert.assertEquals(Configuration.collectionsTimeout, 2000);
    }
}
