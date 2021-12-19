package androidx.core.p037h;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.c */
public final class C0768c {

    /* renamed from: a */
    private final Object f2906a;

    static {
        Covode.recordClassIndex(849);
    }

    public final int hashCode() {
        Object obj = this.f2906a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2906a + "}";
    }

    C0768c(Object obj) {
        this.f2906a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0768c cVar = (C0768c) obj;
        Object obj2 = this.f2906a;
        if (obj2 != null) {
            return obj2.equals(cVar.f2906a);
        }
        if (cVar.f2906a == null) {
            return true;
        }
        return false;
    }
}
