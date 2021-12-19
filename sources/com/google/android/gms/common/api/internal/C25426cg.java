package com.google.android.gms.common.api.internal;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25477j;
import com.google.android.gms.common.api.C25352f;
import com.google.android.gms.p1940d.C25632i;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.cg */
public final class C25426cg {

    /* renamed from: a */
    final C0484a<C25390b<?>, ConnectionResult> f60327a = new C0484a<>();

    /* renamed from: b */
    final C25632i<Map<C25390b<?>, String>> f60328b = new C25632i<>();

    /* renamed from: c */
    private final C0484a<C25390b<?>, String> f60329c = new C0484a<>();

    /* renamed from: d */
    private int f60330d;

    /* renamed from: e */
    private boolean f60331e = false;

    static {
        Covode.recordClassIndex(30825);
    }

    public C25426cg(Iterable<? extends AbstractC25477j<?>> iterable) {
        Iterator<? extends AbstractC25477j<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f60327a.put(((AbstractC25477j) it.next()).mo41513c(), null);
        }
        this.f60330d = this.f60327a.keySet().size();
    }

    /* renamed from: a */
    public final void mo41655a(C25390b<?> bVar, ConnectionResult connectionResult, String str) {
        this.f60327a.put(bVar, connectionResult);
        this.f60329c.put(bVar, str);
        this.f60330d--;
        if (!connectionResult.mo41434b()) {
            this.f60331e = true;
        }
        if (this.f60330d != 0) {
            return;
        }
        if (this.f60331e) {
            this.f60328b.mo41893a(new C25352f(this.f60327a));
            return;
        }
        this.f60328b.mo41894a(this.f60329c);
    }
}
