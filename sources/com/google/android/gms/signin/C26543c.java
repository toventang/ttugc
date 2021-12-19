package com.google.android.gms.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C26546a;

/* renamed from: com.google.android.gms.signin.c */
public final class C26543c {

    /* renamed from: a */
    public static final C25335a.AbstractC25336a<C26546a, C26541a> f62635a;

    /* renamed from: b */
    public static final C25335a<C26541a> f62636b;

    /* renamed from: c */
    private static final C25335a.C25344g<C26546a> f62637c;

    /* renamed from: d */
    private static final C25335a.C25344g<C26546a> f62638d;

    /* renamed from: e */
    private static final C25335a.AbstractC25336a<C26546a, Object> f62639e;

    /* renamed from: f */
    private static final Scope f62640f = new Scope("profile");

    /* renamed from: g */
    private static final Scope f62641g = new Scope("email");

    /* renamed from: h */
    private static final C25335a<Object> f62642h;

    static {
        Covode.recordClassIndex(31971);
        C25335a.C25344g<C26546a> gVar = new C25335a.C25344g<>();
        f62637c = gVar;
        C25335a.C25344g<C26546a> gVar2 = new C25335a.C25344g<>();
        f62638d = gVar2;
        C26542b bVar = new C26542b();
        f62635a = bVar;
        C26545e eVar = new C26545e();
        f62639e = eVar;
        f62636b = new C25335a<>("SignIn.API", bVar, gVar);
        f62642h = new C25335a<>("SignIn.INTERNAL_API", eVar, gVar2);
    }
}
