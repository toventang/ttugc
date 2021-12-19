package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25446d;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.p1945d.HandlerC25727g;
import com.google.android.gms.signin.AbstractC26544d;
import com.google.android.gms.signin.C26541a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.cn */
public final class C25433cn implements AbstractC25400bj {

    /* renamed from: a */
    final C25386aw f60345a;

    /* renamed from: b */
    final C25386aw f60346b;

    /* renamed from: c */
    Bundle f60347c;

    /* renamed from: d */
    ConnectionResult f60348d = null;

    /* renamed from: e */
    ConnectionResult f60349e = null;

    /* renamed from: f */
    boolean f60350f = false;

    /* renamed from: g */
    final Lock f60351g;

    /* renamed from: h */
    private final Context f60352h;

    /* renamed from: i */
    private final C25380aq f60353i;

    /* renamed from: j */
    private final Looper f60354j;

    /* renamed from: k */
    private final Map<C25335a.C25338c<?>, C25386aw> f60355k;

    /* renamed from: l */
    private final Set<AbstractC25465p> f60356l = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: m */
    private final C25335a.AbstractC25343f f60357m;

    /* renamed from: n */
    private int f60358n = 0;

    static {
        Covode.recordClassIndex(30832);
    }

    /* renamed from: h */
    private final boolean m49020h() {
        ConnectionResult connectionResult = this.f60349e;
        if (connectionResult == null || connectionResult.f60082b != 4) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: f */
    public final void mo41608f() {
        this.f60345a.mo41608f();
        this.f60346b.mo41608f();
    }

    /* renamed from: c */
    private boolean m49017c() {
        boolean z;
        this.f60351g.lock();
        try {
            if (this.f60358n == 2) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f60351g.unlock();
        }
    }

    /* renamed from: g */
    private final void m49019g() {
        for (AbstractC25465p pVar : this.f60356l) {
            pVar.mo41409f();
        }
        this.f60356l.clear();
    }

    /* renamed from: i */
    private final PendingIntent m49021i() {
        if (this.f60357m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f60352h, System.identityHashCode(this.f60353i), this.f60357m.mo41415d(), 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final void mo41597a() {
        this.f60358n = 2;
        this.f60350f = false;
        this.f60349e = null;
        this.f60348d = null;
        this.f60345a.mo41597a();
        this.f60346b.mo41597a();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: b */
    public final void mo41604b() {
        this.f60349e = null;
        this.f60348d = null;
        this.f60358n = 0;
        this.f60345a.mo41604b();
        this.f60346b.mo41604b();
        m49019g();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: d */
    public final boolean mo41606d() {
        this.f60351g.lock();
        try {
            boolean z = true;
            if (this.f60345a.mo41606d()) {
                if (!this.f60346b.mo41606d() && !m49020h()) {
                    if (this.f60358n == 1) {
                    }
                }
                return z;
            }
            z = false;
            return z;
        } finally {
            this.f60351g.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: e */
    public final void mo41607e() {
        this.f60351g.lock();
        try {
            boolean c = m49017c();
            this.f60346b.mo41604b();
            this.f60349e = new ConnectionResult(4);
            if (c) {
                new HandlerC25727g(this.f60354j).post(new RunnableC25436cq(this));
            } else {
                m49019g();
            }
        } finally {
            this.f60351g.unlock();
        }
    }

    /* renamed from: b */
    private static boolean m49016b(ConnectionResult connectionResult) {
        if (connectionResult == null || !connectionResult.mo41434b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m49013a(ConnectionResult connectionResult) {
        int i = this.f60358n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f60358n = 0;
            }
            this.f60353i.mo41586a(connectionResult);
        }
        m49019g();
        this.f60358n = 0;
    }

    /* renamed from: c */
    private final boolean m49018c(C25446d.AbstractC25447a<? extends AbstractC25485p, ? extends C25335a.AbstractC25337b> aVar) {
        C25335a.C25338c<A> cVar = aVar.f60401a;
        C25565r.m49325b(this.f60355k.containsKey(cVar), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f60355k.get(cVar).equals(this.f60346b);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: b */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41603b(T t) {
        if (!m49018c(t)) {
            return (T) this.f60345a.mo41603b(t);
        }
        if (!m49020h()) {
            return (T) this.f60346b.mo41603b(t);
        }
        t.mo41682b(new Status(4, null, m49021i()));
        return t;
    }

    /* renamed from: a */
    static /* synthetic */ void m49014a(C25433cn cnVar) {
        if (m49016b(cnVar.f60348d)) {
            if (m49016b(cnVar.f60349e) || cnVar.m49020h()) {
                int i = cnVar.f60358n;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        cnVar.f60358n = 0;
                        return;
                    }
                    cnVar.f60353i.mo41585a(cnVar.f60347c);
                }
                cnVar.m49019g();
                cnVar.f60358n = 0;
                return;
            }
            ConnectionResult connectionResult = cnVar.f60349e;
            if (connectionResult == null) {
                return;
            }
            if (cnVar.f60358n == 1) {
                cnVar.m49019g();
                return;
            }
            cnVar.m49013a(connectionResult);
            cnVar.f60345a.mo41604b();
        } else if (cnVar.f60348d == null || !m49016b(cnVar.f60349e)) {
            ConnectionResult connectionResult2 = cnVar.f60348d;
            if (connectionResult2 != null && cnVar.f60349e != null) {
                if (cnVar.f60346b.f60252l < cnVar.f60345a.f60252l) {
                    connectionResult2 = cnVar.f60349e;
                }
                cnVar.m49013a(connectionResult2);
            }
        } else {
            cnVar.f60346b.mo41604b();
            cnVar.m49013a(cnVar.f60348d);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41596a(T t) {
        if (!m49018c(t)) {
            return (T) this.f60345a.mo41596a(t);
        }
        if (!m49020h()) {
            return (T) this.f60346b.mo41596a(t);
        }
        t.mo41682b(new Status(4, null, m49021i()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final boolean mo41602a(AbstractC25465p pVar) {
        this.f60351g.lock();
        try {
            if ((m49017c() || mo41606d()) && !this.f60346b.mo41606d()) {
                this.f60356l.add(pVar);
                if (this.f60358n == 0) {
                    this.f60358n = 1;
                }
                this.f60349e = null;
                this.f60346b.mo41597a();
                return true;
            }
            this.f60351g.unlock();
            return false;
        } finally {
            this.f60351g.unlock();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m49015a(C25433cn cnVar, int i, boolean z) {
        cnVar.f60353i.mo41584a(i, z);
        cnVar.f60349e = null;
        cnVar.f60348d = null;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final void mo41601a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f60346b.mo41601a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f60345a.mo41601a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public static C25433cn m49012a(Context context, C25380aq aqVar, Lock lock, Looper looper, C25497c cVar, Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> map, C25539d dVar, Map<C25335a<?>, Boolean> map2, C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar, ArrayList<C25432cm> arrayList) {
        C0484a aVar2 = new C0484a();
        C0484a aVar3 = new C0484a();
        C25335a.AbstractC25343f fVar = null;
        for (Map.Entry<C25335a.C25338c<?>, C25335a.AbstractC25343f> entry : map.entrySet()) {
            C25335a.AbstractC25343f value = entry.getValue();
            if (value.mo41414c()) {
                fVar = value;
            }
            if (value.mo41494i()) {
                aVar2.put(entry.getKey(), value);
            } else {
                aVar3.put(entry.getKey(), value);
            }
        }
        C25565r.m49321a(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C0484a aVar4 = new C0484a();
        C0484a aVar5 = new C0484a();
        for (C25335a<?> aVar6 : map2.keySet()) {
            C25335a.C25338c<?> b = aVar6.mo41483b();
            if (aVar2.containsKey(b)) {
                aVar4.put(aVar6, map2.get(aVar6));
            } else if (aVar3.containsKey(b)) {
                aVar5.put(aVar6, map2.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C25432cm cmVar = arrayList.get(i);
            i++;
            C25432cm cmVar2 = cmVar;
            if (aVar4.containsKey(cmVar2.f60342a)) {
                arrayList2.add(cmVar2);
            } else if (aVar5.containsKey(cmVar2.f60342a)) {
                arrayList3.add(cmVar2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C25433cn(context, aqVar, lock, looper, cVar, aVar2, aVar3, dVar, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
    }

    private C25433cn(Context context, C25380aq aqVar, Lock lock, Looper looper, C25497c cVar, Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> map, Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> map2, C25539d dVar, C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar, C25335a.AbstractC25343f fVar, ArrayList<C25432cm> arrayList, ArrayList<C25432cm> arrayList2, Map<C25335a<?>, Boolean> map3, Map<C25335a<?>, Boolean> map4) {
        this.f60352h = context;
        this.f60353i = aqVar;
        this.f60351g = lock;
        this.f60354j = looper;
        this.f60357m = fVar;
        this.f60345a = new C25386aw(context, aqVar, lock, looper, cVar, map2, null, map4, null, arrayList2, new C25435cp(this, (byte) 0));
        this.f60346b = new C25386aw(context, aqVar, lock, looper, cVar, map, dVar, map3, aVar, arrayList, new C25437cr(this, (byte) 0));
        C0484a aVar2 = new C0484a();
        for (C25335a.C25338c<?> cVar2 : map2.keySet()) {
            aVar2.put(cVar2, this.f60345a);
        }
        for (C25335a.C25338c<?> cVar3 : map.keySet()) {
            aVar2.put(cVar3, this.f60346b);
        }
        this.f60355k = Collections.unmodifiableMap(aVar2);
    }
}
