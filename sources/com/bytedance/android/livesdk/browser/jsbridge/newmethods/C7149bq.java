package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88522ad;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88542g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bq */
final /* synthetic */ class C7149bq implements AbstractC88434g {

    /* renamed from: a */
    private final C7144bo f17817a;

    /* renamed from: b */
    private final byte[] f17818b;

    static {
        Covode.recordClassIndex(7895);
    }

    C7149bq(C7144bo boVar, byte[] bArr) {
        this.f17817a = boVar;
        this.f17818b = bArr;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        C7144bo boVar = this.f17817a;
        if (this.f17818b.length <= 0 && boVar.f17796c <= 10) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            AbstractC88398aa a = C88925a.m154160a(C88946a.f201990b);
            C88466b.m153697a((Object) timeUnit, "unit is null");
            C88466b.m153697a((Object) a, "scheduler is null");
            C88925a.m154168a(new C88522ad(Math.max(0L, 500L), timeUnit, a));
        }
        C88466b.m153697a(obj, "throwable is null");
        Callable a2 = C88446a.m153690a(obj);
        C88466b.m153697a((Object) a2, "errorSupplier is null");
        return C88925a.m154168a(new C88542g(a2));
    }
}
