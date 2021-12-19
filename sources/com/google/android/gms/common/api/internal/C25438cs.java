package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25446d;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.common.util.p1939a.ExecutorC25596a;
import com.google.android.gms.signin.AbstractC26544d;
import com.google.android.gms.signin.C26541a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.cs */
public final class C25438cs implements AbstractC25400bj {

    /* renamed from: a */
    final Map<C25335a.C25338c<?>, C25439ct<?>> f60362a = new HashMap();

    /* renamed from: b */
    final Map<C25335a.C25338c<?>, C25439ct<?>> f60363b = new HashMap();

    /* renamed from: c */
    final C25380aq f60364c;

    /* renamed from: d */
    final Lock f60365d;

    /* renamed from: e */
    final Condition f60366e;

    /* renamed from: f */
    final boolean f60367f;

    /* renamed from: g */
    boolean f60368g;

    /* renamed from: h */
    Map<C25390b<?>, ConnectionResult> f60369h;

    /* renamed from: i */
    Map<C25390b<?>, ConnectionResult> f60370i;

    /* renamed from: j */
    ConnectionResult f60371j;

    /* renamed from: k */
    private final Map<C25335a<?>, Boolean> f60372k;

    /* renamed from: l */
    private final C25450f f60373l;

    /* renamed from: m */
    private final Looper f60374m;

    /* renamed from: n */
    private final C25497c f60375n;

    /* renamed from: o */
    private final C25539d f60376o;

    /* renamed from: p */
    private final boolean f60377p;

    /* renamed from: q */
    private final Queue<C25446d.AbstractC25447a<?, ?>> f60378q = new LinkedList();

    /* renamed from: r */
    private C25471u f60379r;

    static {
        Covode.recordClassIndex(30837);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final void mo41601a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: f */
    public final void mo41608f() {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: d */
    public final boolean mo41606d() {
        boolean z;
        this.f60365d.lock();
        try {
            if (this.f60369h == null || this.f60371j != null) {
                z = false;
            } else {
                z = true;
            }
            return z;
        } finally {
            this.f60365d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo41664g() {
        while (!this.f60378q.isEmpty()) {
            mo41603b(this.f60378q.remove());
        }
        this.f60364c.mo41585a((Bundle) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ all -> 0x0044 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m49040i() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f60365d
            r0.lock()
            boolean r0 = r3.f60368g     // Catch:{ all -> 0x0044 }
            r2 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.f60377p     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x000f
            goto L_0x003e
        L_0x000f:
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.internal.ct<?>> r0 = r3.f60363b     // Catch:{ all -> 0x0044 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0044 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0019:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.api.a$c r0 = (com.google.android.gms.common.api.C25335a.C25338c) r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.ConnectionResult r0 = r3.m49038a(r0)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.mo41434b()     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0019
        L_0x0031:
            java.util.concurrent.locks.Lock r0 = r3.f60365d
            r0.unlock()
            return r2
        L_0x0037:
            java.util.concurrent.locks.Lock r0 = r3.f60365d
            r0.unlock()
            r0 = 1
            return r0
        L_0x003e:
            java.util.concurrent.locks.Lock r0 = r3.f60365d
            r0.unlock()
            return r2
        L_0x0044:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.f60365d
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C25438cs.m49040i():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: b */
    public final void mo41604b() {
        this.f60365d.lock();
        try {
            this.f60368g = false;
            this.f60369h = null;
            this.f60370i = null;
            C25471u uVar = this.f60379r;
            if (uVar != null) {
                uVar.mo41716a();
                this.f60379r = null;
            }
            this.f60371j = null;
            while (!this.f60378q.isEmpty()) {
                C25446d.AbstractC25447a<?, ?> remove = this.f60378q.remove();
                remove.mo41540a((AbstractC25419ca) null);
                remove.mo41539a();
            }
            this.f60366e.signalAll();
        } finally {
            this.f60365d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41663c() {
        if (this.f60376o == null) {
            this.f60364c.f60216e = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f60376o.f60586b);
        Map<C25335a<?>, C25539d.C25541b> map = this.f60376o.f60588d;
        for (C25335a<?> aVar : map.keySet()) {
            ConnectionResult a = m49038a(aVar.mo41483b());
            if (a != null && a.mo41434b()) {
                hashSet.addAll(map.get(aVar).f60605a);
            }
        }
        this.f60364c.f60216e = hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: e */
    public final void mo41607e() {
        this.f60365d.lock();
        try {
            C25450f fVar = this.f60373l;
            fVar.f60414k.incrementAndGet();
            fVar.f60418o.sendMessage(fVar.f60418o.obtainMessage(10));
            C25471u uVar = this.f60379r;
            if (uVar != null) {
                uVar.mo41716a();
                this.f60379r = null;
            }
            if (this.f60370i == null) {
                this.f60370i = new C0484a(this.f60363b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (C25439ct<?> ctVar : this.f60363b.values()) {
                this.f60370i.put(ctVar.f60121d, connectionResult);
            }
            Map<C25390b<?>, ConnectionResult> map = this.f60369h;
            if (map != null) {
                map.putAll(this.f60370i);
            }
        } finally {
            this.f60365d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final ConnectionResult mo41665h() {
        char c = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        char c2 = 0;
        for (C25439ct<?> ctVar : this.f60362a.values()) {
            C25335a<O> aVar = ctVar.f60119b;
            ConnectionResult connectionResult3 = this.f60369h.get(ctVar.f60121d);
            if (!connectionResult3.mo41434b() && (!this.f60372k.get(aVar).booleanValue() || connectionResult3.mo41433a() || this.f60375n.isUserResolvableError(connectionResult3.f60082b))) {
                if (connectionResult3.f60082b != 4 || !this.f60377p) {
                    if (connectionResult == null || c > 65535) {
                        connectionResult = connectionResult3;
                        c = 65535;
                    }
                } else if (connectionResult2 == null || c2 > 65535) {
                    connectionResult2 = connectionResult3;
                    c2 = 65535;
                }
            }
        }
        if (connectionResult == null || connectionResult2 == null || c <= c2) {
            return connectionResult;
        }
        return connectionResult2;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final void mo41597a() {
        this.f60365d.lock();
        try {
            if (!this.f60368g) {
                this.f60368g = true;
                this.f60369h = null;
                this.f60370i = null;
                this.f60379r = null;
                this.f60371j = null;
                this.f60373l.mo41690c();
                this.f60373l.mo41685a(this.f60362a.values()).mo41873a(new ExecutorC25596a(this.f60374m), new C25440cu(this, (byte) 0));
                this.f60365d.unlock();
            }
        } finally {
            this.f60365d.unlock();
        }
    }

    /* renamed from: a */
    private final ConnectionResult m49038a(C25335a.C25338c<?> cVar) {
        this.f60365d.lock();
        try {
            C25439ct<?> ctVar = this.f60362a.get(cVar);
            Map<C25390b<?>, ConnectionResult> map = this.f60369h;
            if (map != null && ctVar != null) {
                return map.get(ctVar.f60121d);
            }
            this.f60365d.unlock();
            return null;
        } finally {
            this.f60365d.unlock();
        }
    }

    /* renamed from: c */
    private final <T extends C25446d.AbstractC25447a<? extends AbstractC25485p, ? extends C25335a.AbstractC25337b>> boolean m49039c(T t) {
        C25335a.C25338c<A> cVar = t.f60401a;
        ConnectionResult a = m49038a((C25335a.C25338c<?>) cVar);
        if (a == null || a.f60082b != 4) {
            return false;
        }
        t.mo41682b(new Status(4, null, this.f60373l.mo41684a((C25390b<?>) this.f60362a.get(cVar).f60121d, System.identityHashCode(this.f60364c))));
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: b */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41603b(T t) {
        C25335a.C25338c<A> cVar = t.f60401a;
        if (this.f60377p && m49039c(t)) {
            return t;
        }
        this.f60364c.f60218g.mo41638a(t);
        return (T) this.f60362a.get(cVar).mo41511b(t);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41596a(T t) {
        if (this.f60377p && m49039c(t)) {
            return t;
        }
        if (!mo41606d()) {
            this.f60378q.add(t);
            return t;
        }
        this.f60364c.f60218g.mo41638a(t);
        return (T) this.f60362a.get(t.f60401a).mo41509a(t);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC25400bj
    /* renamed from: a */
    public final boolean mo41602a(AbstractC25465p pVar) {
        this.f60365d.lock();
        try {
            if (!this.f60368g || m49040i()) {
                this.f60365d.unlock();
                return false;
            }
            this.f60373l.mo41690c();
            this.f60379r = new C25471u(this, pVar);
            this.f60373l.mo41685a(this.f60363b.values()).mo41873a(new ExecutorC25596a(this.f60374m), this.f60379r);
            this.f60365d.unlock();
            return true;
        } catch (Throwable th) {
            this.f60365d.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41662a(C25439ct<?> ctVar, ConnectionResult connectionResult) {
        if (connectionResult.mo41434b() || connectionResult.mo41433a() || !this.f60372k.get(ctVar.f60119b).booleanValue() || !this.f60375n.isUserResolvableError(connectionResult.f60082b)) {
            return false;
        }
        return true;
    }

    public C25438cs(Context context, Lock lock, Looper looper, C25497c cVar, Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> map, C25539d dVar, Map<C25335a<?>, Boolean> map2, C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar, ArrayList<C25432cm> arrayList, C25380aq aqVar, boolean z) {
        this.f60365d = lock;
        this.f60374m = looper;
        this.f60366e = lock.newCondition();
        this.f60375n = cVar;
        this.f60364c = aqVar;
        this.f60372k = map2;
        this.f60376o = dVar;
        this.f60377p = z;
        HashMap hashMap = new HashMap();
        for (C25335a<?> aVar2 : map2.keySet()) {
            hashMap.put(aVar2.mo41483b(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C25432cm cmVar = arrayList.get(i);
            i++;
            C25432cm cmVar2 = cmVar;
            hashMap2.put(cmVar2.f60342a, cmVar2);
        }
        for (Map.Entry<C25335a.C25338c<?>, C25335a.AbstractC25343f> entry : map.entrySet()) {
            C25335a aVar3 = (C25335a) hashMap.get(entry.getKey());
            C25335a.AbstractC25343f value = entry.getValue();
            this.f60372k.get(aVar3).booleanValue();
            C25439ct<?> ctVar = new C25439ct<>(context, aVar3, looper, value, (C25432cm) hashMap2.get(aVar3), dVar, aVar);
            this.f60362a.put(entry.getKey(), ctVar);
            if (value.mo41494i()) {
                this.f60363b.put(entry.getKey(), ctVar);
            }
        }
        this.f60367f = false;
        this.f60373l = C25450f.m49077a();
    }
}
