package com.google.p1971b.p1972a.p1993g.p1994a;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: com.google.b.a.g.a.a */
public final class C27165a {

    /* renamed from: a */
    public static final AbstractC27166b f64308a = new C27167c("-_.!~*'()@:$&,;=", false);

    /* renamed from: b */
    public static final AbstractC27166b f64309b = new C27167c("-_.!~*'():$&,;=", false);

    /* renamed from: c */
    public static final AbstractC27166b f64310c = new C27167c("-_.!~*'()@:$,;/?:", false);

    /* renamed from: d */
    private static final AbstractC27166b f64311d = new C27167c("-_.*", true);

    /* renamed from: e */
    private static final AbstractC27166b f64312e = new C27167c("-_.!~*'()@:$&,;=+/?", false);

    static {
        Covode.recordClassIndex(32745);
    }

    /* renamed from: a */
    public static String m53995a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
