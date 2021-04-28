package io.i15s.quarkus.qute;

import io.quarkus.qute.TemplateExtension;
import io.quarkus.qute.i18n.MessageBundles;
import io.quarkus.qute.i18n.MessageParam;

import java.text.DecimalFormat;
import java.util.Locale;

@TemplateExtension(namespace = "ext")
public class TemplateExtensions {

    public static String formatNumber(float number, @TemplateExtension.TemplateAttribute(MessageBundles.ATTRIBUTE_LOCALE) Object locale) {
        var formatter = DecimalFormat.getNumberInstance((Locale) locale);
        formatter.setMaximumFractionDigits(2);
        return formatter.format(number);
    }
}
