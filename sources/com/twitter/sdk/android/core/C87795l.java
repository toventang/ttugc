package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27917g;
import com.twitter.sdk.android.core.internal.C87750q;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.C87801c;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.C90208y;
import p4640l.C89782m;
import p4640l.p4641a.p4642a.C89710a;

/* renamed from: com.twitter.sdk.android.core.l */
public final class C87795l {

    /* renamed from: a */
    public final ConcurrentHashMap<Class, Object> f199427a;

    /* renamed from: b */
    public final C89782m f199428b;

    static {
        Covode.recordClassIndex(103793);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C87795l() {
        /*
            r3 = this;
            com.twitter.sdk.android.core.q r0 = com.twitter.sdk.android.core.C87808q.m152816a()
            com.twitter.sdk.android.core.e r2 = r0.mo142272b()
            okhttp3.y$a r1 = new okhttp3.y$a
            r1.<init>()
            okhttp3.g r0 = com.twitter.sdk.android.core.internal.p4498a.C87716e.m152644a()
            okhttp3.y$a r1 = r1.mo145092a(r0)
            com.twitter.sdk.android.core.internal.a.c r0 = new com.twitter.sdk.android.core.internal.a.c
            r0.<init>(r2)
            r1.f204948r = r0
            com.twitter.sdk.android.core.internal.a.a r0 = new com.twitter.sdk.android.core.internal.a.a
            r0.<init>(r2)
            okhttp3.y$a r1 = r1.mo145096a(r0)
            com.twitter.sdk.android.core.internal.a.b r0 = new com.twitter.sdk.android.core.internal.a.b
            r0.<init>()
            okhttp3.y$a r0 = r1.mo145100b(r0)
            okhttp3.y r1 = r0.mo145103d()
            com.twitter.sdk.android.core.internal.q r0 = new com.twitter.sdk.android.core.internal.q
            r0.<init>()
            r3.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.C87795l.<init>():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C87795l(com.twitter.sdk.android.core.C87814u r4) {
        /*
            r3 = this;
            com.twitter.sdk.android.core.q r0 = com.twitter.sdk.android.core.C87808q.m152816a()
            com.twitter.sdk.android.core.TwitterAuthConfig r2 = r0.f199464e
            if (r4 == 0) goto L_0x002b
            okhttp3.y$a r1 = new okhttp3.y$a
            r1.<init>()
            okhttp3.g r0 = com.twitter.sdk.android.core.internal.p4498a.C87716e.m152644a()
            okhttp3.y$a r1 = r1.mo145092a(r0)
            com.twitter.sdk.android.core.internal.a.d r0 = new com.twitter.sdk.android.core.internal.a.d
            r0.<init>(r4, r2)
            okhttp3.y$a r0 = r1.mo145096a(r0)
            okhttp3.y r1 = r0.mo145103d()
            com.twitter.sdk.android.core.internal.q r0 = new com.twitter.sdk.android.core.internal.q
            r0.<init>()
            r3.<init>(r1, r0)
            return
        L_0x002b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Session must not be null."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.C87795l.<init>(com.twitter.sdk.android.core.u):void");
    }

    private C87795l(C90208y yVar, C87750q qVar) {
        this.f199427a = new ConcurrentHashMap<>();
        this.f199428b = new C89782m.C89784a().mo144325a(yVar).mo144323a(qVar.f199302a).mo144324a(C89710a.m155747a(new C27917g().mo46679a(new SafeListAdapter()).mo46679a(new SafeMapAdapter()).mo46681a((Type) C87801c.class, (Object) new BindingValuesAdapter()).mo46682b())).mo144326a();
    }
}
