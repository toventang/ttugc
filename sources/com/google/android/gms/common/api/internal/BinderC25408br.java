package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.signin.AbstractC26544d;
import com.google.android.gms.signin.C26541a;
import com.google.android.gms.signin.C26543c;
import com.google.android.gms.signin.internal.BinderC26549d;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.br */
public final class BinderC25408br extends BinderC26549d implements AbstractC25357i.AbstractC25359b, AbstractC25357i.AbstractC25360c {

    /* renamed from: d */
    private static C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> f60282d = C26543c.f62635a;

    /* renamed from: a */
    Set<Scope> f60283a;

    /* renamed from: b */
    public AbstractC26544d f60284b;

    /* renamed from: c */
    AbstractC25409bs f60285c;

    /* renamed from: e */
    private final Context f60286e;

    /* renamed from: f */
    private final Handler f60287f;

    /* renamed from: g */
    private final C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> f60288g;

    /* renamed from: h */
    private C25539d f60289h;

    /* renamed from: a */
    public final void mo41626a() {
        AbstractC26544d dVar = this.f60284b;
        if (dVar != null) {
            dVar.mo41491f();
        }
    }

    static {
        Covode.recordClassIndex(30807);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: b */
    public final void mo34349b(int i) {
        this.f60284b.mo41491f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: a */
    public final void mo34348a(Bundle bundle) {
        this.f60284b.mo43682a(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25462m
    /* renamed from: a */
    public final void mo41581a(ConnectionResult connectionResult) {
        this.f60285c.mo41629b(connectionResult);
    }

    @Override // com.google.android.gms.signin.internal.BinderC26549d, com.google.android.gms.signin.internal.AbstractC26548c
    /* renamed from: a */
    public final void mo41580a(zak zak) {
        this.f60287f.post(new RunnableC25410bt(this, zak));
    }

    /* renamed from: a */
    public final void mo41627a(AbstractC25409bs bsVar) {
        AbstractC26544d dVar = this.f60284b;
        if (dVar != null) {
            dVar.mo41491f();
        }
        this.f60289h.f60595k = Integer.valueOf(System.identityHashCode(this));
        C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar = this.f60288g;
        Context context = this.f60286e;
        Looper looper = this.f60287f.getLooper();
        C25539d dVar2 = this.f60289h;
        this.f60284b = (AbstractC26544d) aVar.mo41299a(context, looper, dVar2, dVar2.f60593i, (AbstractC25357i.AbstractC25359b) this, (AbstractC25357i.AbstractC25360c) this);
        this.f60285c = bsVar;
        Set<Scope> set = this.f60283a;
        if (set == null || set.isEmpty()) {
            this.f60287f.post(new RunnableC25407bq(this));
        } else {
            this.f60284b.mo43684v();
        }
    }

    public BinderC25408br(Context context, Handler handler, C25539d dVar) {
        this(context, handler, dVar, f60282d);
    }

    public BinderC25408br(Context context, Handler handler, C25539d dVar, C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar) {
        this.f60286e = context;
        this.f60287f = handler;
        this.f60289h = (C25539d) C25565r.m49315a(dVar, "ClientSettings must not be null");
        this.f60283a = dVar.f60586b;
        this.f60288g = aVar;
    }
}
