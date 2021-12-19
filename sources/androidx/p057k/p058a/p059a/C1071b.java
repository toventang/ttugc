package androidx.p057k.p058a.p059a;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: androidx.k.a.a.b */
public final class C1071b extends C1072c {
    static {
        Covode.recordClassIndex(1164);
    }

    /* renamed from: b */
    public final int mo3827b() {
        int b = mo3828b(6);
        if (b != 0) {
            return mo3829c(b);
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo3824a() {
        int b = mo3828b(4);
        if (b != 0) {
            return this.f3716c.getInt(b + this.f3715b);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo3826a(int i, ByteBuffer byteBuffer) {
        this.f3715b = i;
        this.f3716c = byteBuffer;
    }

    /* renamed from: a */
    public final C1070a mo3825a(C1070a aVar, int i) {
        int b = mo3828b(6);
        if (b == 0) {
            return null;
        }
        int d = mo3830d(b) + (i * 4);
        return aVar.mo3818a(d + this.f3716c.getInt(d), this.f3716c);
    }
}
