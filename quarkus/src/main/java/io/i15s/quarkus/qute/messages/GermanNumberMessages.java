package io.i15s.quarkus.qute.messages;

import io.quarkus.qute.i18n.Localized;
import io.quarkus.qute.i18n.Message;
import io.quarkus.qute.i18n.MessageParam;

@Localized("de")
public interface GermanNumberMessages extends NumberMessages {

    @Override
    @Message("Die Nummer ist {number}")
    String number(@MessageParam("number") String number);
}
