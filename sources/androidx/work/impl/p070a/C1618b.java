package androidx.work.impl.p070a;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.a.b */
public final class C1618b {

    /* renamed from: a */
    public boolean f5249a;

    /* renamed from: b */
    public boolean f5250b;

    /* renamed from: c */
    public boolean f5251c;

    /* renamed from: d */
    public boolean f5252d;

    static {
        Covode.recordClassIndex(1774);
    }

    public final int hashCode() {
        int i;
        if (this.f5249a) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f5250b) {
            i += 16;
        }
        if (this.f5251c) {
            i += 256;
        }
        if (this.f5252d) {
            return i + 4096;
        }
        return i;
    }

    public final String toString() {
        return C1764a.m5928a("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f5249a), Boolean.valueOf(this.f5250b), Boolean.valueOf(this.f5251c), Boolean.valueOf(this.f5252d)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1618b bVar = (C1618b) obj;
            if (this.f5249a == bVar.f5249a && this.f5250b == bVar.f5250b && this.f5251c == bVar.f5251c && this.f5252d == bVar.f5252d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1618b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5249a = z;
        this.f5250b = z2;
        this.f5251c = z3;
        this.f5252d = z4;
    }
}
