package com.xceptance.neodymium.util;

import static org.aeonbits.owner.Config.DisableableFeature.VARIABLE_EXPANSION;

import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Mutable;

import com.xceptance.neodymium.NeodymiumRunner.DescriptionMode;

@LoadPolicy(LoadType.MERGE)
@Sources(
{
  "file:config/test.properties", "file:config/credentials.properties"
})
public interface NeodymiumConfiguration extends Mutable
{
    @Key("neodymium.debugUtils.highlight")
    @DefaultValue("false")
    public boolean debuggingHighlightSelectedElements();

    @Key("neodymium.debugUtils.highlight.duration")
    @DefaultValue("100")
    public long debuggingHighlightDuration();

    // standard timeout for selenide interaction
    @Key("neodymium.selenide.timeout")
    @DefaultValue("3000")
    public long selenideTimeout();

    @Key("neodymium.selenideAddons.staleElement.retry.count")
    @DefaultValue("3")
    public int staleElementRetryCount();

    @Key("neodymium.selenideAddons.staleElement.retry.timeout")
    @DefaultValue("500")
    public int staleElementRetryTimeout();

    @Key("neodymium.javaScriptUtils.timeout")
    @DefaultValue("2000")
    public int javaScriptTimeout();

    @Key("neodymium.javaScriptUtils.pollingInterval")
    @DefaultValue("200")
    public int javaScriptPollingInterval();

    @Key("neodymium.javaScriptUtils.loading.jQueryIsRequired")
    @DefaultValue("true")
    public boolean javascriptLoadingJQueryIsRequired();

    @Key("neodymium.javaScriptUtils.loading.animationSelector")
    public String javascriptLoadingAnimationSelector();

    @Key("neodymium.url")
    public String url();

    @Key("neodymium.url.protocol")
    public String protocol();

    @Key("neodymium.url.host")
    public String host();

    @Key("neodymium.url.path")
    public String path();

    @Key("neodymium.url.path")
    @DisableFeature(
    {
      VARIABLE_EXPANSION
    })
    public String rawPath();

    @Key("neodymium.url.site")
    public String site();

    @Key("neodymium.basicauth.username")
    public String basicAuthUsername();

    @Key("neodymium.basicauth.password")
    public String basicAuthPassword();

    @Key("neodymium.locale")
    @DefaultValue("en_US")
    public String locale();

    @Key("neodymium.localization.file")
    @DefaultValue("config/localization.yaml")
    public String localizationFile();

    @Key("neodymium.allureAddons.screenshots.perstep.always")
    @DefaultValue("false")
    public boolean screenshotPerStep();

    @Key("neodymium.context.device.breakpoint.small")
    @DefaultValue("544")
    public int smallDeviceBreakpoint();

    @Key("neodymium.context.device.breakpoint.medium")
    @DefaultValue("769")
    public int mediumDeviceBreakpoint();

    @Key("neodymium.context.device.breakpoint.large")
    @DefaultValue("992")
    public int largeDeviceBreakpoint();

    @Key("neodymium.context.device.breakpoint.xlarge")
    @DefaultValue("1200")
    public int xlargeDeviceBreakpoint();

    @Key("neodymium.dataUtils.email.domain")
    @DefaultValue("varmail.de")
    public String dataUtilsEmailDomain();

    @Key("neodymium.dataUtils.email.local.prefix")
    @DefaultValue("test")
    public String dataUtilsEmailLocalPrefix();

    @Key("neodymium.dataUtils.password.uppercaseCharAmount")
    @DefaultValue("2")
    public int dataUtilsPasswordUppercaseCharAmount();

    @Key("neodymium.dataUtils.password.lowercaseCharAmount")
    @DefaultValue("5")
    public int dataUtilsPasswordLowercaseCharAmount();

    @Key("neodymium.dataUtils.password.digitAmount")
    @DefaultValue("2")
    public int dataUtilsPasswordDigitAmount();

    @Key("neodymium.dataUtils.password.specialCharAmount")
    @DefaultValue("2")
    public int dataUtilsPasswordSpecialCharAmount();

    @Key("neodymium.dataUtils.password.specialChars")
    @DefaultValue("+-#$%%&.;,_")
    public String dataUtilsPasswordSpecialChars();

    @Key("neodymium.junit.viewmode")
    @DefaultValue("tree")
    public DescriptionMode junitViewMode();
}
