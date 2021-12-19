package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.internal.C25446d;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.signin.AbstractC26544d;
import com.google.android.gms.signin.C26541a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.aw */
public final class C25386aw implements AbstractC25400bj, AbstractC25434co {

    /* renamed from: a */
    final Lock f60241a;

    /* renamed from: b */
    final Condition f60242b;

    /* renamed from: c */
    final Context f60243c;

    /* renamed from: d */
    final C25497c f60244d;

    /* renamed from: e */
    final HandlerC25388ay f60245e;

    /* renamed from: f */
    final Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> f60246f;

    /* renamed from: g */
    final Map<C25335a.C25338c<?>, ConnectionResult> f60247g = new HashMap();

    /* renamed from: h */
    final C25539d f60248h;

    /* renamed from: i */
    final Map<C25335a<?>, Boolean> f60249i;

    /* renamed from: j */
    final C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> f60250j;

    /* renamed from: k */
    volatile AbstractC25383at f60251k;

    /* renamed from: l */
    int f60252l;

    /* renamed from: m */
    final C25380aq f60253m;

    /* renamed from: n */
    final AbstractC25401bk f60254n;

    /* renamed from: o */
    private ConnectionResult f60255o = null;

    static {
        Covode.recordClassIndex(30785);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final boolean mo41602a(AbstractC25465p pVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: e */
    public final void mo41607e() {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final void mo41597a() {
        this.f60251k.mo41574c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: d */
    public final boolean mo41606d() {
        return this.f60251k instanceof C25476z;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: b */
    public final void mo41604b() {
        if (this.f60251k.mo41572b()) {
            this.f60247g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: f */
    public final void mo41608f() {
        if (mo41606d()) {
            C25476z zVar = (C25476z) this.f60251k;
            if (zVar.f60471b) {
                zVar.f60471b = false;
                zVar.f60470a.f60253m.f60218g.mo41637a();
                zVar.mo41572b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41605c() {
        this.f60241a.lock();
        try {
            this.f60253m.mo41588i();
            this.f60251k = new C25476z(this);
            this.f60251k.mo41564a();
            this.f60242b.signalAll();
        } finally {
            this.f60241a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41596a(T t) {
        t.mo41548e();
        return (T) this.f60251k.mo41563a(t);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: b */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41603b(T t) {
        t.mo41548e();
        return (T) this.f60251k.mo41569b(t);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: a */
    public final void mo34348a(Bundle bundle) {
        this.f60241a.lock();
        try {
            this.f60251k.mo41566a(bundle);
        } finally {
            this.f60241a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41598a(ConnectionResult connectionResult) {
        this.f60241a.lock();
        try {
            this.f60255o = connectionResult;
            this.f60251k = new C25377an(this);
            this.f60251k.mo41564a();
            this.f60242b.signalAll();
        } finally {
            this.f60241a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: b */
    public final void mo34349b(int i) {
        this.f60241a.lock();
        try {
            this.f60251k.mo41565a(i);
        } finally {
            this.f60241a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41600a(AbstractC25385av avVar) {
        this.f60245e.sendMessage(this.f60245e.obtainMessage(1, avVar));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25434co
    /* renamed from: a */
    public final void mo41599a(ConnectionResult connectionResult, C25335a<?> aVar, boolean z) {
        this.f60241a.lock();
        try {
            this.f60251k.mo41567a(connectionResult, aVar, z);
        } finally {
            this.f60241a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final void mo41601a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f60251k);
        for (C25335a<?> aVar : this.f60249i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.f60112b).println(":");
            this.f60246f.get(aVar.mo41483b()).mo41490a(concat, printWriter);
        }
    }

    public C25386aw(Context context, C25380aq aqVar, Lock lock, Looper looper, C25497c cVar, Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> map, C25539d dVar, Map<C25335a<?>, Boolean> map2, C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar, ArrayList<C25432cm> arrayList, AbstractC25401bk bkVar) {
        this.f60243c = context;
        this.f60241a = lock;
        this.f60244d = cVar;
        this.f60246f = map;
        this.f60248h = dVar;
        this.f60249i = map2;
        this.f60250j = aVar;
        this.f60253m = aqVar;
        this.f60254n = bkVar;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C25432cm cmVar = arrayList.get(i);
            i++;
            cmVar.f60343b = this;
        }
        this.f60245e = new HandlerC25388ay(this, looper);
        this.f60242b = lock.newCondition();
        this.f60251k = new C25377an(this);
    }
}
