package emotes.p4559c;

import com.bytedance.covode.number.Covode;

/* renamed from: emotes.c.h */
public final class C88379h {

    /* renamed from: a */
    public boolean f200635a;

    /* renamed from: b */
    public boolean f200636b;

    static {
        Covode.recordClassIndex(104419);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88379h)) {
            return false;
        }
        C88379h hVar = (C88379h) obj;
        return this.f200635a == hVar.f200635a && this.f200636b == hVar.f200636b;
    }

    public final int hashCode() {
        boolean z = this.f200635a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f200636b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "EmoteHeaderItem(isFollow=" + this.f200635a + ", isSubscribe=" + this.f200636b + ")";
    }

    public C88379h(boolean z, boolean z2) {
        this.f200635a = z;
        this.f200636b = z2;
    }
}
