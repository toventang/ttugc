package com.google.android.datatransport;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.b */
public final class C25068b {

    /* renamed from: a */
    public final String f59446a;

    static {
        Covode.recordClassIndex(30432);
    }

    public final int hashCode() {
        return this.f59446a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.f59446a + "\"}";
    }

    /* renamed from: a */
    public static C25068b m48045a(String str) {
        return new C25068b(str);
    }

    private C25068b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f59446a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25068b)) {
            return false;
        }
        return this.f59446a.equals(((C25068b) obj).f59446a);
    }
}
