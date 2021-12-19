package androidx.constraintlayout.p026a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.h */
public final class C0545h {

    /* renamed from: a */
    static int f2185a = 1;

    /* renamed from: l */
    private static int f2186l = 1;

    /* renamed from: m */
    private static int f2187m = 1;

    /* renamed from: n */
    private static int f2188n = 1;

    /* renamed from: o */
    private static int f2189o = 1;

    /* renamed from: b */
    public String f2190b;

    /* renamed from: c */
    public int f2191c = -1;

    /* renamed from: d */
    int f2192d = -1;

    /* renamed from: e */
    public int f2193e;

    /* renamed from: f */
    public float f2194f;

    /* renamed from: g */
    float[] f2195g = new float[7];

    /* renamed from: h */
    EnumC0546a f2196h;

    /* renamed from: i */
    C0536b[] f2197i = new C0536b[8];

    /* renamed from: j */
    int f2198j;

    /* renamed from: k */
    public int f2199k;

    static {
        Covode.recordClassIndex(612);
    }

    /* renamed from: a */
    public final void mo2385a() {
        this.f2190b = null;
        this.f2196h = EnumC0546a.UNKNOWN;
        this.f2193e = 0;
        this.f2191c = -1;
        this.f2192d = -1;
        this.f2194f = 0.0f;
        this.f2198j = 0;
        this.f2199k = 0;
    }

    public final String toString() {
        return "" + this.f2190b;
    }

    /* renamed from: androidx.constraintlayout.a.h$a */
    public enum EnumC0546a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN;

        static {
            Covode.recordClassIndex(613);
        }
    }

    public C0545h(EnumC0546a aVar) {
        this.f2196h = aVar;
    }

    /* renamed from: c */
    public final void mo2388c(C0536b bVar) {
        int i = this.f2198j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2197i[i2].f2130d.mo2267a(this.f2197i[i2], bVar);
        }
        this.f2198j = 0;
    }

    /* renamed from: a */
    public final void mo2386a(C0536b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f2198j;
            if (i >= i2) {
                C0536b[] bVarArr = this.f2197i;
                if (i2 >= bVarArr.length) {
                    this.f2197i = (C0536b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0536b[] bVarArr2 = this.f2197i;
                int i3 = this.f2198j;
                bVarArr2[i3] = bVar;
                this.f2198j = i3 + 1;
                return;
            } else if (this.f2197i[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo2387b(C0536b bVar) {
        int i = this.f2198j;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2197i[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0536b[] bVarArr = this.f2197i;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f2198j--;
                return;
            }
        }
    }
}
