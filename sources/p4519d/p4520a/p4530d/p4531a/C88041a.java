package p4519d.p4520a.p4530d.p4531a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.d.a.a */
public class C88041a {

    /* renamed from: c */
    public static final int f199945c = f199945c;

    /* renamed from: d */
    public static final C88042a f199946d = new C88042a((byte) 0);

    /* renamed from: a */
    public byte[] f199947a;

    /* renamed from: b */
    public int f199948b;

    /* renamed from: d.a.d.a.a$a */
    public static final class C88042a {
        static {
            Covode.recordClassIndex(104068);
        }

        private C88042a() {
        }

        public /* synthetic */ C88042a(byte b) {
            this();
        }
    }

    public /* synthetic */ C88041a() {
        this(32);
    }

    public String toString() {
        return this.f199947a.toString();
    }

    static {
        Covode.recordClassIndex(104067);
    }

    public C88041a(int i) {
        if (i >= 0) {
            this.f199947a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Negative initial size: ".concat(String.valueOf(i)).toString());
    }

    /* renamed from: a */
    public final void mo142609a(byte[] bArr, int i, int i2) {
        C89219l.m154719c(bArr, "");
        if (i >= 0 && i <= bArr.length && i2 >= 0) {
            int i3 = i + i2;
            if (i3 - bArr.length <= 0) {
                int i4 = this.f199948b + i2;
                byte[] bArr2 = this.f199947a;
                if (i4 - bArr2.length > 0) {
                    int length = bArr2.length << 1;
                    if (length - i4 < 0) {
                        length = i4;
                    }
                    int i5 = f199945c;
                    if (length - i5 > 0) {
                        if (i4 < 0) {
                            throw new IllegalStateException("out of memory!".toString());
                        } else if (i4 > i5) {
                            length = Integer.MAX_VALUE;
                        } else {
                            length = i5;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, length);
                    C89219l.m154709a((Object) copyOf, "");
                    this.f199947a = copyOf;
                }
                C89064i.m154468a(bArr, this.f199947a, this.f199948b, i, i3);
                this.f199948b += i2;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
