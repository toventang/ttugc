package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.internal.C25446d;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.signin.AbstractC26544d;
import com.google.android.gms.signin.C26541a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.ae */
public final class C25368ae implements AbstractC25383at {

    /* renamed from: a */
    final C25386aw f60175a;

    /* renamed from: b */
    final Lock f60176b;

    /* renamed from: c */
    final Context f60177c;

    /* renamed from: d */
    final C25497c f60178d;

    /* renamed from: e */
    AbstractC26544d f60179e;

    /* renamed from: f */
    boolean f60180f;

    /* renamed from: g */
    boolean f60181g;

    /* renamed from: h */
    AbstractC25551l f60182h;

    /* renamed from: i */
    boolean f60183i;

    /* renamed from: j */
    boolean f60184j;

    /* renamed from: k */
    final C25539d f60185k;

    /* renamed from: l */
    private ConnectionResult f60186l;

    /* renamed from: m */
    private int f60187m;

    /* renamed from: n */
    private int f60188n;

    /* renamed from: o */
    private int f60189o;

    /* renamed from: p */
    private final Bundle f60190p = new Bundle();

    /* renamed from: q */
    private final Set<C25335a.C25338c> f60191q = new HashSet();

    /* renamed from: r */
    private boolean f60192r;

    /* renamed from: s */
    private final Map<C25335a<?>, Boolean> f60193s;

    /* renamed from: t */
    private final C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> f60194t;

    /* renamed from: u */
    private ArrayList<Future<?>> f60195u = new ArrayList<>();

    static {
        Covode.recordClassIndex(30767);
    }

    /* renamed from: c */
    private static String m48815c(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: c */
    public final void mo41574c() {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: b */
    public final boolean mo41572b() {
        m48817h();
        m48814a(true);
        this.f60175a.mo41598a((ConnectionResult) null);
        return true;
    }

    /* renamed from: h */
    private final void m48817h() {
        ArrayList<Future<?>> arrayList = this.f60195u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.f60195u.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo41575d() {
        int i = this.f60189o - 1;
        this.f60189o = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.f60175a.f60253m.mo41590k();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            mo41570b(new ConnectionResult(8, null));
            return false;
        } else if (this.f60186l == null) {
            return true;
        } else {
            this.f60175a.f60252l = this.f60187m;
            mo41570b(this.f60186l);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo41577f() {
        this.f60180f = false;
        this.f60175a.f60253m.f60216e = Collections.emptySet();
        for (C25335a.C25338c<?> cVar : this.f60191q) {
            if (!this.f60175a.f60247g.containsKey(cVar)) {
                this.f60175a.f60247g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: g */
    private final void m48816g() {
        Bundle bundle;
        this.f60175a.mo41605c();
        C25387ax.f60256a.execute(new RunnableC25367ad(this));
        AbstractC26544d dVar = this.f60179e;
        if (dVar != null) {
            if (this.f60183i) {
                dVar.mo43681a(this.f60182h, this.f60184j);
            }
            m48814a(false);
        }
        for (C25335a.C25338c<?> cVar : this.f60175a.f60247g.keySet()) {
            this.f60175a.f60246f.get(cVar).mo41491f();
        }
        if (this.f60190p.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f60190p;
        }
        this.f60175a.f60254n.mo41585a(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo41576e() {
        if (this.f60189o == 0) {
            if (!this.f60180f || this.f60181g) {
                ArrayList arrayList = new ArrayList();
                this.f60188n = 1;
                this.f60189o = this.f60175a.f60246f.size();
                for (C25335a.C25338c<?> cVar : this.f60175a.f60246f.keySet()) {
                    if (!this.f60175a.f60247g.containsKey(cVar)) {
                        arrayList.add(this.f60175a.f60246f.get(cVar));
                    } else if (mo41575d()) {
                        m48816g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f60195u.add(C25387ax.f60256a.submit(new C25374ak(this, arrayList)));
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41564a() {
        this.f60175a.f60247g.clear();
        this.f60180f = false;
        this.f60186l = null;
        this.f60188n = 0;
        this.f60192r = true;
        this.f60181g = false;
        this.f60183i = false;
        HashMap hashMap = new HashMap();
        for (C25335a<?> aVar : this.f60193s.keySet()) {
            C25335a.AbstractC25343f fVar = this.f60175a.f60246f.get(aVar.mo41483b());
            boolean booleanValue = this.f60193s.get(aVar).booleanValue();
            if (fVar.mo41494i()) {
                this.f60180f = true;
                if (booleanValue) {
                    this.f60191q.add(aVar.mo41483b());
                } else {
                    this.f60192r = false;
                }
            }
            hashMap.put(fVar, new C25370ag(this, aVar, booleanValue));
        }
        if (this.f60180f) {
            this.f60185k.f60595k = Integer.valueOf(System.identityHashCode(this.f60175a.f60253m));
            C25375al alVar = new C25375al(this, (byte) 0);
            C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar2 = this.f60194t;
            Context context = this.f60177c;
            Looper c = this.f60175a.f60253m.mo41529c();
            C25539d dVar = this.f60185k;
            this.f60179e = (AbstractC26544d) aVar2.mo41299a(context, c, dVar, dVar.f60593i, (AbstractC25357i.AbstractC25359b) alVar, (AbstractC25357i.AbstractC25360c) alVar);
        }
        this.f60189o = this.f60175a.f60246f.size();
        this.f60195u.add(C25387ax.f60256a.submit(new C25369af(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: b */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41569b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41563a(T t) {
        this.f60175a.f60253m.f60214c.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41565a(int i) {
        mo41570b(new ConnectionResult(8, null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41570b(ConnectionResult connectionResult) {
        m48817h();
        m48814a(!connectionResult.mo41433a());
        this.f60175a.mo41598a(connectionResult);
        this.f60175a.f60254n.mo41586a(connectionResult);
    }

    /* renamed from: a */
    private final void m48814a(boolean z) {
        AbstractC26544d dVar = this.f60179e;
        if (dVar != null) {
            if (dVar.mo41492g() && z) {
                this.f60179e.mo43683u();
            }
            this.f60179e.mo41491f();
            if (this.f60185k.f60594j) {
                this.f60179e = null;
            }
            this.f60182h = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41566a(Bundle bundle) {
        if (mo41573b(1)) {
            if (bundle != null) {
                this.f60190p.putAll(bundle);
            }
            if (mo41575d()) {
                m48816g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo41573b(int i) {
        if (this.f60188n == i) {
            return true;
        }
        this.f60175a.f60253m.mo41590k();
        String.valueOf(String.valueOf(this)).length();
        String c = m48815c(this.f60188n);
        String c2 = m48815c(i);
        String.valueOf(c).length();
        String.valueOf(c2).length();
        new Exception();
        mo41570b(new ConnectionResult(8, null));
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41568a(ConnectionResult connectionResult) {
        if (!this.f60192r || connectionResult.mo41433a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41571b(ConnectionResult connectionResult, C25335a<?> aVar, boolean z) {
        if ((!z || connectionResult.mo41433a() || this.f60178d.getErrorResolutionIntent(connectionResult.f60082b) != null) && (this.f60186l == null || Integer.MAX_VALUE < this.f60187m)) {
            this.f60186l = connectionResult;
            this.f60187m = Integer.MAX_VALUE;
        }
        this.f60175a.f60247g.put(aVar.mo41483b(), connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41567a(ConnectionResult connectionResult, C25335a<?> aVar, boolean z) {
        if (mo41573b(1)) {
            mo41571b(connectionResult, aVar, z);
            if (mo41575d()) {
                m48816g();
            }
        }
    }

    public C25368ae(C25386aw awVar, C25539d dVar, Map<C25335a<?>, Boolean> map, C25497c cVar, C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar, Lock lock, Context context) {
        this.f60175a = awVar;
        this.f60185k = dVar;
        this.f60193s = map;
        this.f60178d = cVar;
        this.f60194t = aVar;
        this.f60176b = lock;
        this.f60177c = context;
    }
}
