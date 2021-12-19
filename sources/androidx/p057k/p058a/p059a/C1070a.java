package androidx.p057k.p058a.p059a;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: androidx.k.a.a.a */
public final class C1070a extends C1072c {
    static {
        Covode.recordClassIndex(1163);
    }

    /* renamed from: f */
    public final int mo3823f() {
        int b = mo3828b(16);
        if (b != 0) {
            return mo3829c(b);
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo3816a() {
        int b = mo3828b(4);
        if (b != 0) {
            return this.f3716c.getInt(b + this.f3715b);
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo3819b() {
        int b = mo3828b(6);
        if (b == 0 || this.f3716c.get(b + this.f3715b) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final short mo3820c() {
        int b = mo3828b(8);
        if (b != 0) {
            return this.f3716c.getShort(b + this.f3715b);
        }
        return 0;
    }

    /* renamed from: d */
    public final short mo3821d() {
        int b = mo3828b(12);
        if (b != 0) {
            return this.f3716c.getShort(b + this.f3715b);
        }
        return 0;
    }

    /* renamed from: e */
    public final short mo3822e() {
        int b = mo3828b(14);
        if (b != 0) {
            return this.f3716c.getShort(b + this.f3715b);
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo3817a(int i) {
        int b = mo3828b(16);
        if (b != 0) {
            return this.f3716c.getInt(mo3830d(b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: a */
    public final C1070a mo3818a(int i, ByteBuffer byteBuffer) {
        this.f3715b = i;
        this.f3716c = byteBuffer;
        return this;
    }
}
