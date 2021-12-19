package com.facebook.imagepipeline.common;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1839k.C24128b;
import java.util.regex.Pattern;

/* renamed from: com.facebook.imagepipeline.common.a */
public class C24360a {

    /* renamed from: c */
    private static Pattern f57763c;

    /* renamed from: a */
    public final int f57764a;

    /* renamed from: b */
    public final int f57765b;

    static {
        Covode.recordClassIndex(28503);
    }

    public int hashCode() {
        return C24128b.m45730a(this.f57764a, this.f57765b);
    }

    public String toString() {
        return C1764a.m5929a(null, "%s-%s", new Object[]{m46371a(this.f57764a), m46371a(this.f57765b)});
    }

    /* renamed from: a */
    public static String m46371a(int i) {
        if (i == Integer.MAX_VALUE) {
            return "";
        }
        return Integer.toString(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24360a)) {
            return false;
        }
        C24360a aVar = (C24360a) obj;
        if (this.f57764a == aVar.f57764a && this.f57765b == aVar.f57765b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C24360a m46370a(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (str == null) {
            return null;
        }
        if (f57763c == null) {
            f57763c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f57763c.split(str);
            if (split.length == 4) {
                z = true;
            } else {
                z = false;
            }
            C24091i.m45620a(z);
            C24091i.m45620a(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            if (parseInt2 > parseInt) {
                z2 = true;
            } else {
                z2 = false;
            }
            C24091i.m45620a(z2);
            if (parseInt3 > parseInt2) {
                z3 = true;
            } else {
                z3 = false;
            }
            C24091i.m45620a(z3);
            if (parseInt2 < parseInt3 - 1) {
                return new C24360a(parseInt, parseInt2);
            }
            return new C24360a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(C1764a.m5929a(null, "Invalid Content-Range header value: \"%s\"", new Object[]{str}), e);
        }
    }

    public C24360a(int i, int i2) {
        this.f57764a = i;
        this.f57765b = i2;
    }
}
