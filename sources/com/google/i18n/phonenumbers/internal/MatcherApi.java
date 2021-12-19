package com.google.i18n.phonenumbers.internal;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.Phonemetadata;

public interface MatcherApi {
    static {
        Covode.recordClassIndex(33693);
    }

    boolean matchNationalNumber(CharSequence charSequence, Phonemetadata.PhoneNumberDesc phoneNumberDesc, boolean z);
}
