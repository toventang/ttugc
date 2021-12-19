package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.a.d */
public final class C29217d {

    /* renamed from: a */
    public static final C29217d f69213a;

    /* renamed from: b */
    public static final C29217d f69214b;

    /* renamed from: c */
    public final boolean f69215c;

    /* renamed from: d */
    public final boolean f69216d;

    /* renamed from: e */
    public final int f69217e;

    /* renamed from: f */
    public final int f69218f;

    /* renamed from: g */
    public final boolean f69219g;

    /* renamed from: h */
    public final boolean f69220h;

    /* renamed from: i */
    public final boolean f69221i;

    /* renamed from: j */
    public final int f69222j;

    /* renamed from: k */
    public final int f69223k;

    /* renamed from: l */
    public final boolean f69224l;

    /* renamed from: m */
    public final boolean f69225m;

    /* renamed from: n */
    String f69226n;

    /* renamed from: com.squareup.a.d$a */
    public static final class C29218a {

        /* renamed from: a */
        boolean f69227a;

        /* renamed from: b */
        boolean f69228b;

        /* renamed from: c */
        int f69229c = -1;

        /* renamed from: d */
        int f69230d = -1;

        /* renamed from: e */
        int f69231e = -1;

        /* renamed from: f */
        boolean f69232f;

        /* renamed from: g */
        boolean f69233g;

        static {
            Covode.recordClassIndex(35567);
        }

        /* renamed from: a */
        public final C29218a mo50951a() {
            this.f69227a = true;
            return this;
        }

        /* renamed from: b */
        public final C29218a mo50952b() {
            this.f69228b = true;
            return this;
        }

        /* renamed from: c */
        public final C29217d mo50953c() {
            return new C29217d(this, (byte) 0);
        }
    }

    static {
        int i;
        Covode.recordClassIndex(35566);
        C29218a aVar = new C29218a();
        aVar.f69227a = true;
        f69213a = aVar.mo50953c();
        C29218a aVar2 = new C29218a();
        aVar2.f69232f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        if (seconds > 2147483647L) {
            i = Integer.MAX_VALUE;
        } else {
            i = (int) seconds;
        }
        aVar2.f69230d = i;
        f69214b = aVar2.mo50953c();
    }

    public final String toString() {
        String sb;
        String str = this.f69226n;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f69215c) {
            sb2.append("no-cache, ");
        }
        if (this.f69216d) {
            sb2.append("no-store, ");
        }
        if (this.f69217e != -1) {
            sb2.append("max-age=").append(this.f69217e).append(", ");
        }
        if (this.f69218f != -1) {
            sb2.append("s-maxage=").append(this.f69218f).append(", ");
        }
        if (this.f69219g) {
            sb2.append("private, ");
        }
        if (this.f69220h) {
            sb2.append("public, ");
        }
        if (this.f69221i) {
            sb2.append("must-revalidate, ");
        }
        if (this.f69222j != -1) {
            sb2.append("max-stale=").append(this.f69222j).append(", ");
        }
        if (this.f69223k != -1) {
            sb2.append("min-fresh=").append(this.f69223k).append(", ");
        }
        if (this.f69224l) {
            sb2.append("only-if-cached, ");
        }
        if (this.f69225m) {
            sb2.append("no-transform, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.f69226n = sb;
        return sb;
    }

    private C29217d(C29218a aVar) {
        this.f69215c = aVar.f69227a;
        this.f69216d = aVar.f69228b;
        this.f69217e = aVar.f69229c;
        this.f69218f = -1;
        this.f69222j = aVar.f69230d;
        this.f69223k = aVar.f69231e;
        this.f69224l = aVar.f69232f;
        this.f69225m = aVar.f69233g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.p2075a.C29217d m58471a(com.squareup.p2075a.C29235p r20) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.C29217d.m58471a(com.squareup.a.p):com.squareup.a.d");
    }

    /* synthetic */ C29217d(C29218a aVar, byte b) {
        this(aVar);
    }

    private C29217d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.f69215c = z;
        this.f69216d = z2;
        this.f69217e = i;
        this.f69218f = i2;
        this.f69219g = z3;
        this.f69220h = z4;
        this.f69221i = z5;
        this.f69222j = i3;
        this.f69223k = i4;
        this.f69224l = z6;
        this.f69225m = z7;
        this.f69226n = str;
    }
}
