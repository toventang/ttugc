package com.google.gson;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: com.google.gson.d */
public enum EnumC27902d implements AbstractC27909e {
    IDENTITY {
        @Override // com.google.gson.AbstractC27909e
        /* renamed from: a */
        public final String mo46658a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        @Override // com.google.gson.AbstractC27909e
        /* renamed from: a */
        public final String mo46658a(Field field) {
            return m55905a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        @Override // com.google.gson.AbstractC27909e
        /* renamed from: a */
        public final String mo46658a(Field field) {
            return m55905a(m55906a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        @Override // com.google.gson.AbstractC27909e
        /* renamed from: a */
        public final String mo46658a(Field field) {
            return m55906a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        @Override // com.google.gson.AbstractC27909e
        /* renamed from: a */
        public final String mo46658a(Field field) {
            return m55906a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        @Override // com.google.gson.AbstractC27909e
        /* renamed from: a */
        public final String mo46658a(Field field) {
            return m55906a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    static {
        Covode.recordClassIndex(33496);
    }

    /* renamed from: a */
    static String m55905a(String str) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i2 = i + 1;
        if (i2 < str.length()) {
            valueOf = upperCase + str.substring(i2);
        } else {
            valueOf = String.valueOf(upperCase);
        }
        return sb.append(valueOf).toString();
    }

    /* renamed from: a */
    static String m55906a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* synthetic */ EnumC27902d(byte b) {
        this();
    }
}
