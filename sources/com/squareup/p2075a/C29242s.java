package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

/* renamed from: com.squareup.a.s */
public final class C29242s {

    /* renamed from: a */
    private static final Pattern f69306a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b */
    private static final Pattern f69307b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c */
    private final String f69308c;

    public final String toString() {
        return this.f69308c;
    }

    public final int hashCode() {
        return this.f69308c.hashCode();
    }

    static {
        Covode.recordClassIndex(35591);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29242s) || !((C29242s) obj).f69308c.equals(this.f69308c)) {
            return false;
        }
        return true;
    }
}
