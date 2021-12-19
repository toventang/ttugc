package androidx.work.impl.p073b;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.b.d */
public final class C1637d {

    /* renamed from: a */
    public final String f5297a;

    /* renamed from: b */
    public final int f5298b;

    static {
        Covode.recordClassIndex(1793);
    }

    public final int hashCode() {
        return (this.f5297a.hashCode() * 31) + this.f5298b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1637d dVar = (C1637d) obj;
        if (this.f5298b != dVar.f5298b) {
            return false;
        }
        return this.f5297a.equals(dVar.f5297a);
    }

    public C1637d(String str, int i) {
        this.f5297a = str;
        this.f5298b = i;
    }
}
