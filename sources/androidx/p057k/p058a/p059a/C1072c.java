package androidx.p057k.p058a.p059a;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* renamed from: androidx.k.a.a.c */
public class C1072c {

    /* renamed from: a */
    public static final ThreadLocal<Charset> f3712a = new ThreadLocal<Charset>() {
        /* class androidx.p057k.p058a.p059a.C1072c.C10742 */

        static {
            Covode.recordClassIndex(1167);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    };

    /* renamed from: d */
    private static final ThreadLocal<CharsetDecoder> f3713d = new ThreadLocal<CharsetDecoder>() {
        /* class androidx.p057k.p058a.p059a.C1072c.C10731 */

        static {
            Covode.recordClassIndex(1166);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder();
        }
    };

    /* renamed from: e */
    private static final ThreadLocal<CharBuffer> f3714e = new ThreadLocal<>();

    /* renamed from: b */
    protected int f3715b;

    /* renamed from: c */
    public ByteBuffer f3716c;

    static {
        Covode.recordClassIndex(1165);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo3830d(int i) {
        int i2 = i + this.f3715b;
        return i2 + this.f3716c.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo3828b(int i) {
        int i2 = this.f3715b;
        int i3 = i2 - this.f3716c.getInt(i2);
        if (i < this.f3716c.getShort(i3)) {
            return this.f3716c.getShort(i3 + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo3829c(int i) {
        int i2 = i + this.f3715b;
        return this.f3716c.getInt(i2 + this.f3716c.getInt(i2));
    }
}
