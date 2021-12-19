package com.lynx.p2032b.p2033a.p2035b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.b.a.b.a */
public final class C28222a {

    /* renamed from: a */
    public static final C28222a f66126a;

    /* renamed from: b */
    public static final C28222a f66127b;

    /* renamed from: c */
    public static final C28222a f66128c;

    /* renamed from: d */
    public static final C28222a f66129d;

    /* renamed from: e */
    public static final C28222a f66130e;

    /* renamed from: f */
    public static final C28222a f66131f;

    /* renamed from: g */
    public static final C28222a f66132g;

    /* renamed from: h */
    public static final C28222a f66133h;

    /* renamed from: i */
    public static final C28222a f66134i;

    /* renamed from: j */
    public static final C28222a f66135j;

    /* renamed from: k */
    public static final C28222a f66136k;

    /* renamed from: l */
    public static final C28222a f66137l;

    /* renamed from: o */
    public static final C28222a[] f66138o;

    /* renamed from: m */
    public final int f66139m;

    /* renamed from: n */
    public final boolean f66140n;

    /* renamed from: b */
    public final C28222a mo48301b() {
        if (!this.f66140n) {
            return f66138o[this.f66139m + 1];
        }
        return this;
    }

    /* renamed from: a */
    public final C28222a mo48299a() {
        if (!this.f66140n) {
            return this;
        }
        C28222a aVar = f66138o[this.f66139m - 1];
        if (!aVar.f66140n) {
            return aVar;
        }
        return f66126a;
    }

    static {
        Covode.recordClassIndex(34168);
        C28222a aVar = new C28222a(0, false);
        f66126a = aVar;
        C28222a aVar2 = new C28222a(1, true);
        f66127b = aVar2;
        C28222a aVar3 = new C28222a(2, false);
        f66128c = aVar3;
        C28222a aVar4 = new C28222a(3, true);
        f66129d = aVar4;
        C28222a aVar5 = new C28222a(4, false);
        f66130e = aVar5;
        C28222a aVar6 = new C28222a(5, true);
        f66131f = aVar6;
        C28222a aVar7 = new C28222a(6, false);
        f66132g = aVar7;
        C28222a aVar8 = new C28222a(7, true);
        f66133h = aVar8;
        C28222a aVar9 = new C28222a(8, false);
        f66134i = aVar9;
        C28222a aVar10 = new C28222a(9, true);
        f66135j = aVar10;
        C28222a aVar11 = new C28222a(10, false);
        f66136k = aVar11;
        C28222a aVar12 = new C28222a(10, true);
        f66137l = aVar12;
        f66138o = new C28222a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
    }

    /* renamed from: a */
    public final boolean mo48300a(C28222a aVar) {
        int i = this.f66139m;
        int i2 = aVar.f66139m;
        if (i < i2) {
            return true;
        }
        if ((!this.f66140n || f66135j == this) && i == i2) {
            return true;
        }
        return false;
    }

    private C28222a(int i, boolean z) {
        this.f66139m = i;
        this.f66140n = z;
    }
}
