package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import p4632k.C89427i;

/* renamed from: com.squareup.a.l */
public final class C29230l {
    static {
        Covode.recordClassIndex(35579);
    }

    /* renamed from: a */
    public static String m58490a(String str, String str2) {
        try {
            return "Basic ".concat(String.valueOf(C89427i.m155136of((str + ":" + str2).getBytes("ISO-8859-1")).base64()));
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
