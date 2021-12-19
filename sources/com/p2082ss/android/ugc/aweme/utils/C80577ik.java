package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

/* renamed from: com.ss.android.ugc.aweme.utils.ik */
public final class C80577ik {

    /* renamed from: a */
    public static final C80577ik f180194a = new C80577ik();

    private C80577ik() {
    }

    static {
        Covode.recordClassIndex(93850);
    }

    /* renamed from: b */
    public static Phonenumber.PhoneNumber m139672b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return PhoneNumberUtil.getInstance().parse(str, null);
        } catch (NumberParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static final String m139671a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Phonenumber.PhoneNumber parse = PhoneNumberUtil.getInstance().parse(str, null);
                if (parse != null) {
                    return String.valueOf(parse.getNationalNumber());
                }
            } catch (NumberParseException e) {
                e.printStackTrace();
            }
            if (str == null) {
                return "";
            }
            return str;
        } else if (str == null) {
            return "";
        } else {
            return str;
        }
    }
}
