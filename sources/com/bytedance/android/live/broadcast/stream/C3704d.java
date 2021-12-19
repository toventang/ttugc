package com.bytedance.android.live.broadcast.stream;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.stream.p205a.AbstractC3664a;
import com.bytedance.android.live.broadcast.stream.p205a.AbstractC3665b;
import com.bytedance.android.live.broadcast.stream.p206b.AbstractC3677a;
import com.bytedance.android.livesdk.model.C9593l;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.stream.d */
public final class C3704d {

    /* renamed from: A */
    boolean f10192A = true;

    /* renamed from: B */
    int f10193B;

    /* renamed from: C */
    boolean f10194C;

    /* renamed from: D */
    boolean f10195D;

    /* renamed from: E */
    String f10196E;

    /* renamed from: F */
    boolean f10197F;

    /* renamed from: G */
    String f10198G;

    /* renamed from: H */
    String f10199H;

    /* renamed from: I */
    AssetManager f10200I;

    /* renamed from: J */
    Object f10201J;

    /* renamed from: K */
    String f10202K;

    /* renamed from: L */
    boolean f10203L;

    /* renamed from: M */
    int f10204M;

    /* renamed from: N */
    String f10205N;

    /* renamed from: O */
    boolean f10206O;

    /* renamed from: a */
    Context f10207a;

    /* renamed from: b */
    String f10208b;

    /* renamed from: c */
    int f10209c;

    /* renamed from: d */
    int f10210d;

    /* renamed from: e */
    int f10211e;

    /* renamed from: f */
    int f10212f;

    /* renamed from: g */
    int f10213g;

    /* renamed from: h */
    int f10214h;

    /* renamed from: i */
    int f10215i;

    /* renamed from: j */
    int f10216j;

    /* renamed from: k */
    int f10217k;

    /* renamed from: l */
    boolean f10218l;

    /* renamed from: m */
    int f10219m;

    /* renamed from: n */
    int f10220n;

    /* renamed from: o */
    long f10221o;

    /* renamed from: p */
    int f10222p;

    /* renamed from: q */
    int f10223q;

    /* renamed from: r */
    AbstractC3664a f10224r;

    /* renamed from: s */
    AbstractC3677a f10225s;

    /* renamed from: t */
    AbstractC3665b f10226t;

    /* renamed from: u */
    Intent f10227u;

    /* renamed from: v */
    int f10228v;

    /* renamed from: w */
    int f10229w;

    /* renamed from: x */
    C9593l f10230x;

    /* renamed from: y */
    int f10231y;

    /* renamed from: z */
    float f10232z;

    static {
        Covode.recordClassIndex(4217);
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.d$a */
    public static class C3705a {

        /* renamed from: A */
        public boolean f10233A;

        /* renamed from: B */
        public String f10234B;

        /* renamed from: C */
        public boolean f10235C = true;

        /* renamed from: D */
        public String f10236D;

        /* renamed from: E */
        public AbstractC3664a f10237E;

        /* renamed from: F */
        public AbstractC3677a f10238F;

        /* renamed from: G */
        AssetManager f10239G;

        /* renamed from: H */
        public String f10240H;

        /* renamed from: I */
        public Object f10241I;

        /* renamed from: J */
        public boolean f10242J;

        /* renamed from: K */
        int f10243K;

        /* renamed from: L */
        int f10244L;

        /* renamed from: M */
        public int f10245M = 2;

        /* renamed from: N */
        public String f10246N;

        /* renamed from: O */
        public boolean f10247O;

        /* renamed from: a */
        Context f10248a;

        /* renamed from: b */
        String f10249b;

        /* renamed from: c */
        public int f10250c;

        /* renamed from: d */
        public int f10251d;

        /* renamed from: e */
        public int f10252e;

        /* renamed from: f */
        public int f10253f;

        /* renamed from: g */
        public int f10254g;

        /* renamed from: h */
        public int f10255h;

        /* renamed from: i */
        public int f10256i;

        /* renamed from: j */
        public boolean f10257j;

        /* renamed from: k */
        public int f10258k;

        /* renamed from: l */
        int f10259l;

        /* renamed from: m */
        public long f10260m;

        /* renamed from: n */
        int f10261n;

        /* renamed from: o */
        public int f10262o;

        /* renamed from: p */
        public Intent f10263p;

        /* renamed from: q */
        public int f10264q = -1;

        /* renamed from: r */
        public int f10265r = -1;

        /* renamed from: s */
        public C9593l f10266s;

        /* renamed from: t */
        public AbstractC3665b f10267t;

        /* renamed from: u */
        public int f10268u;

        /* renamed from: v */
        public String f10269v;

        /* renamed from: w */
        public float f10270w;

        /* renamed from: x */
        public boolean f10271x;

        /* renamed from: y */
        public int f10272y;

        /* renamed from: z */
        public boolean f10273z;

        static {
            Covode.recordClassIndex(4218);
        }

        /* renamed from: a */
        public final C3704d mo9021a() {
            String str;
            int min;
            String str2;
            int i = this.f10251d;
            if (i == 0) {
                i = 500;
            }
            this.f10251d = i;
            int i2 = this.f10252e;
            if (i2 == 0) {
                i2 = 200;
            }
            this.f10252e = i2;
            int i3 = this.f10253f;
            if (i3 == 0) {
                i3 = 800;
            }
            this.f10253f = i3;
            int i4 = this.f10255h;
            if (i4 == 0) {
                i4 = 360;
            }
            this.f10255h = i4;
            int i5 = this.f10256i;
            if (i5 == 0) {
                i5 = 640;
            }
            this.f10256i = i5;
            int i6 = this.f10254g;
            if (i6 == 0) {
                i6 = 15;
            }
            this.f10254g = i6;
            int i7 = this.f10259l;
            if (i7 == 0) {
                i7 = 9;
            }
            this.f10259l = i7;
            long j = this.f10260m;
            if (j == 0) {
                j = 60000;
            }
            this.f10260m = j;
            int i8 = this.f10261n;
            if (i8 == 0) {
                i8 = 44100;
            }
            this.f10261n = i8;
            int i9 = 2;
            int i10 = 1;
            if (this.f10262o != 2) {
                i9 = 1;
            }
            this.f10262o = i9;
            String str3 = "";
            if (TextUtils.isEmpty(this.f10249b)) {
                str = str3;
            } else {
                str = this.f10249b;
            }
            this.f10249b = str;
            int i11 = this.f10258k;
            if (i11 == 0) {
                min = 1;
            } else {
                min = Math.min(i11, 3);
            }
            this.f10258k = min;
            int i12 = this.f10264q;
            if (i12 == -1) {
                i12 = 4;
            }
            this.f10264q = i12;
            int i13 = this.f10265r;
            if (i13 == -1) {
                i13 = 1;
            }
            this.f10265r = i13;
            if (str3.equals(this.f10269v)) {
                str2 = "live-stream-sdk";
            } else {
                str2 = this.f10269v;
            }
            this.f10269v = str2;
            int i14 = this.f10272y;
            if (i14 != 0) {
                i10 = i14;
            }
            this.f10272y = i10;
            float f = this.f10270w;
            if (f == 0.0f) {
                f = 2.0f;
            }
            this.f10270w = f;
            String str4 = this.f10236D;
            if (str4 == null) {
                str4 = str3;
            }
            this.f10236D = str4;
            String str5 = this.f10234B;
            if (str5 != null) {
                str3 = str5;
            }
            this.f10234B = str3;
            return new C3704d(this);
        }

        public C3705a(Context context) {
            this.f10248a = context;
        }

        /* renamed from: a */
        public final C3705a mo9020a(int i, int i2) {
            this.f10243K = i;
            this.f10244L = i2;
            return this;
        }
    }

    C3704d(C3705a aVar) {
        this.f10207a = aVar.f10248a;
        this.f10208b = aVar.f10249b;
        this.f10209c = aVar.f10250c;
        this.f10210d = aVar.f10251d;
        this.f10211e = aVar.f10252e;
        this.f10212f = aVar.f10253f;
        this.f10213g = aVar.f10254g;
        this.f10216j = aVar.f10255h;
        this.f10217k = aVar.f10256i;
        this.f10218l = aVar.f10257j;
        this.f10219m = aVar.f10258k;
        this.f10220n = aVar.f10259l;
        this.f10221o = aVar.f10260m;
        this.f10222p = aVar.f10261n;
        this.f10223q = aVar.f10262o;
        this.f10224r = aVar.f10237E;
        this.f10226t = aVar.f10267t;
        this.f10225s = aVar.f10238F;
        this.f10227u = aVar.f10263p;
        this.f10228v = aVar.f10264q;
        this.f10229w = aVar.f10265r;
        this.f10230x = aVar.f10266s;
        this.f10231y = aVar.f10268u;
        this.f10198G = aVar.f10269v;
        this.f10232z = aVar.f10270w;
        this.f10192A = aVar.f10271x;
        this.f10193B = aVar.f10272y;
        this.f10194C = aVar.f10273z;
        this.f10195D = aVar.f10233A;
        this.f10196E = aVar.f10234B;
        this.f10197F = aVar.f10235C;
        this.f10199H = aVar.f10236D;
        this.f10200I = aVar.f10239G;
        this.f10202K = aVar.f10240H;
        this.f10201J = aVar.f10241I;
        this.f10203L = aVar.f10242J;
        this.f10215i = aVar.f10244L;
        this.f10214h = aVar.f10243K;
        this.f10204M = aVar.f10245M;
        this.f10205N = aVar.f10246N;
        this.f10206O = aVar.f10247O;
    }
}
