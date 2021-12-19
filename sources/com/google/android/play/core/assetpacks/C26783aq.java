package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.common.C26972c;
import com.google.android.play.core.common.C26973d;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26917bh;
import com.google.android.play.core.p1963b.C26918bi;
import com.google.android.play.core.p1966e.C27006al;
import com.google.android.play.core.p1966e.C27007am;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.aq */
public final class C26783aq implements AbstractC26860e {

    /* renamed from: a */
    private final C26848da f63460a;

    /* renamed from: b */
    private AbstractC26920bk<Context> f63461b;

    /* renamed from: c */
    private AbstractC26920bk<C26827cg> f63462c;

    /* renamed from: d */
    private AbstractC26920bk<C26769ac> f63463d;

    /* renamed from: e */
    private AbstractC26920bk<C26791ay> f63464e;

    /* renamed from: f */
    private AbstractC26920bk<C26873r> f63465f;

    /* renamed from: g */
    private AbstractC26920bk<String> f63466g = C26918bi.m53470a(new C26854dg(this.f63461b));

    /* renamed from: h */
    private AbstractC26920bk<AbstractC26857dj> f63467h = new C26917bh();

    /* renamed from: i */
    private AbstractC26920bk<Executor> f63468i;

    /* renamed from: j */
    private AbstractC26920bk<C26806bm> f63469j;

    /* renamed from: k */
    private AbstractC26920bk<C26878w> f63470k;

    /* renamed from: l */
    private AbstractC26920bk<C26785as> f63471l;

    /* renamed from: m */
    private AbstractC26920bk<C26837cq> f63472m;

    /* renamed from: n */
    private AbstractC26920bk<C26821ca> f63473n;

    /* renamed from: o */
    private AbstractC26920bk<C26825ce> f63474o;

    /* renamed from: p */
    private AbstractC26920bk<C26830cj> f63475p;

    /* renamed from: q */
    private AbstractC26920bk<C26776aj> f63476q;

    /* renamed from: r */
    private AbstractC26920bk<C26809bp> f63477r;

    /* renamed from: s */
    private AbstractC26920bk<C26788av> f63478s;

    /* renamed from: t */
    private AbstractC26920bk<C26779am> f63479t;

    /* renamed from: u */
    private AbstractC26920bk<C26972c> f63480u;

    /* renamed from: v */
    private AbstractC26920bk<Executor> f63481v;

    /* renamed from: w */
    private AbstractC26920bk<C26814bu> f63482w;

    /* renamed from: x */
    private AbstractC26920bk<C27006al> f63483x;

    /* renamed from: y */
    private AbstractC26920bk<C26843cw> f63484y;

    /* renamed from: z */
    private AbstractC26920bk<Object> f63485z;

    static {
        Covode.recordClassIndex(32258);
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26860e
    /* renamed from: a */
    public final void mo44483a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f63412a = C26853df.m53319a(this.f63460a);
        assetPackExtractionService.f63413b = this.f63484y.mo44411a();
        assetPackExtractionService.f63414c = this.f63463d.mo44411a();
    }

    /* synthetic */ C26783aq(C26848da daVar) {
        this.f63460a = daVar;
        C26853df dfVar = new C26853df(daVar);
        this.f63461b = dfVar;
        AbstractC26920bk<C26827cg> a = C26918bi.m53470a(new C26828ch(dfVar));
        this.f63462c = a;
        this.f63463d = C26918bi.m53470a(new C26770ad(this.f63461b, a));
        AbstractC26920bk<C26791ay> a2 = C26918bi.m53470a(C26792az.f63532a);
        this.f63464e = a2;
        this.f63465f = C26918bi.m53470a(new C26874s(this.f63461b, a2));
        AbstractC26920bk<Executor> a3 = C26918bi.m53470a(C26849db.f63704a);
        this.f63468i = a3;
        this.f63469j = C26918bi.m53470a(new C26807bn(this.f63463d, this.f63467h, this.f63464e, a3));
        C26917bh bhVar = new C26917bh();
        this.f63470k = bhVar;
        this.f63471l = C26918bi.m53470a(new C26786at(this.f63463d, this.f63467h, bhVar, this.f63464e));
        this.f63472m = C26918bi.m53470a(new C26838cr(this.f63463d));
        this.f63473n = C26918bi.m53470a(new C26822cb(this.f63463d));
        this.f63474o = C26918bi.m53470a(new C26826cf(this.f63463d, this.f63467h, this.f63469j, this.f63468i, this.f63464e));
        this.f63475p = C26918bi.m53470a(new C26831ck(this.f63463d, this.f63467h));
        AbstractC26920bk<C26776aj> a4 = C26918bi.m53470a(new C26777ak(this.f63467h));
        this.f63476q = a4;
        AbstractC26920bk<C26809bp> a5 = C26918bi.m53470a(new C26810bq(this.f63469j, this.f63463d, a4));
        this.f63477r = a5;
        this.f63478s = C26918bi.m53470a(new C26789aw(this.f63469j, this.f63467h, this.f63471l, this.f63472m, this.f63473n, this.f63474o, this.f63475p, a5));
        this.f63479t = C26918bi.m53470a(C26780an.f63458a);
        this.f63480u = C26918bi.m53470a(C26973d.f63859a);
        AbstractC26920bk<Executor> a6 = C26918bi.m53470a(C26855dh.f63712a);
        this.f63481v = a6;
        C26917bh.m53468a(this.f63470k, C26918bi.m53470a(new C26879x(this.f63461b, this.f63469j, this.f63478s, this.f63467h, this.f63464e, this.f63479t, this.f63480u, this.f63468i, a6)));
        AbstractC26920bk<C26814bu> a7 = C26918bi.m53470a(new C26815bv(this.f63466g, this.f63470k, this.f63464e, this.f63461b, this.f63462c, this.f63468i));
        this.f63482w = a7;
        C26917bh.m53468a(this.f63467h, C26918bi.m53470a(new C26852de(this.f63461b, this.f63465f, a7)));
        AbstractC26920bk<C27006al> a8 = C26918bi.m53470a(C27007am.m53662a(this.f63461b));
        this.f63483x = a8;
        AbstractC26920bk<C26843cw> a9 = C26918bi.m53470a(new C26844cx(this.f63463d, this.f63467h, this.f63470k, a8, this.f63469j, this.f63464e, this.f63479t, this.f63468i));
        this.f63484y = a9;
        this.f63485z = C26918bi.m53470a(new C26851dd(a9, this.f63461b));
    }
}
