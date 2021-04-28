package io.i15s.quarkus.qute.messages;

import io.quarkus.qute.i18n.Message;
import io.quarkus.qute.i18n.MessageBundle;
import io.quarkus.qute.i18n.MessageParam;

@MessageBundle("numbers")
public interface NumberMessages {

    @Message("The number is {number}")
    String number(@MessageParam("number") String number);
}
