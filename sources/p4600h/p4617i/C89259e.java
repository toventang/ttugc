package p4600h.p4617i;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: h.i.e */
public final class C89259e extends AbstractC89255c implements Serializable {

    /* renamed from: g */
    private static final C89260a f202914g = new C89260a((byte) 0);
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private int f202915a;

    /* renamed from: b */
    private int f202916b;

    /* renamed from: c */
    private int f202917c;

    /* renamed from: d */
    private int f202918d;

    /* renamed from: e */
    private int f202919e;

    /* renamed from: f */
    private int f202920f;

    static {
        Covode.recordClassIndex(105343);
    }

    /* renamed from: h.i.e$a */
    static final class C89260a {
        static {
            Covode.recordClassIndex(105344);
        }

        private C89260a() {
        }

        public /* synthetic */ C89260a(byte b) {
            this();
        }
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public final int nextInt() {
        int i = this.f202915a;
        int i2 = i ^ (i >>> 2);
        this.f202915a = this.f202916b;
        this.f202916b = this.f202917c;
        this.f202917c = this.f202918d;
        int i3 = this.f202919e;
        this.f202918d = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f202919e = i4;
        int i5 = this.f202920f + 362437;
        this.f202920f = i5;
        return i4 + i5;
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public final int nextBits(int i) {
        return C89258d.m154744a(nextInt(), i);
    }

    public C89259e(int i, int i2) {
        this(i, i2, 0, 0, i ^ -1, (i << 10) ^ (i2 >>> 4));
    }

    public C89259e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f202915a = i;
        this.f202916b = i2;
        this.f202917c = i3;
        this.f202918d = i4;
        this.f202919e = i5;
        this.f202920f = i6;
        int i7 = 0;
        if ((i | i2 | i3 | i4 | i5) != 0) {
            do {
                nextInt();
                i7++;
            } while (i7 < 64);
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }
}
