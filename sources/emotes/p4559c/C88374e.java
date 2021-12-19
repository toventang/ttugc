package emotes.p4559c;

import com.bytedance.covode.number.Covode;

/* renamed from: emotes.c.e */
public final class C88374e {

    /* renamed from: a */
    public boolean f200622a;

    /* renamed from: b */
    public boolean f200623b;

    static {
        Covode.recordClassIndex(104414);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88374e)) {
            return false;
        }
        C88374e eVar = (C88374e) obj;
        return this.f200622a == eVar.f200622a && this.f200623b == eVar.f200623b;
    }

    public final int hashCode() {
        boolean z = this.f200622a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f200623b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "EmoteFooterItem(isFollow=" + this.f200622a + ", isSubscribe=" + this.f200623b + ")";
    }

    public C88374e(boolean z, boolean z2) {
        this.f200622a = z;
        this.f200623b = z2;
    }
}
