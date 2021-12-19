package com.google.android.gms.common.api.internal;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25352f;
import com.google.android.gms.common.api.C25354h;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.u */
final class C25471u implements AbstractC25626c<Map<C25390b<?>, String>> {

    /* renamed from: a */
    private AbstractC25465p f60460a;

    /* renamed from: b */
    private final /* synthetic */ C25438cs f60461b;

    static {
        Covode.recordClassIndex(30870);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41716a() {
        this.f60460a.mo41409f();
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h<Map<C25390b<?>, String>> hVar) {
        this.f60461b.f60365d.lock();
        try {
            if (!this.f60461b.f60368g) {
                this.f60460a.mo41409f();
                return;
            }
            if (hVar.mo41882b()) {
                this.f60461b.f60370i = new C0484a(this.f60461b.f60363b.size());
                for (C25439ct<?> ctVar : this.f60461b.f60363b.values()) {
                    this.f60461b.f60370i.put(ctVar.f60121d, ConnectionResult.f60081a);
                }
            } else if (hVar.mo41887e() instanceof C25352f) {
                C25352f fVar = (C25352f) hVar.mo41887e();
                if (this.f60461b.f60367f) {
                    this.f60461b.f60370i = new C0484a(this.f60461b.f60363b.size());
                    for (C25439ct<?> ctVar2 : this.f60461b.f60363b.values()) {
                        C25390b<O> bVar = ctVar2.f60121d;
                        ConnectionResult connectionResult = fVar.getConnectionResult((C25354h<? extends C25335a.AbstractC25339d>) ctVar2);
                        if (this.f60461b.mo41662a(ctVar2, connectionResult)) {
                            this.f60461b.f60370i.put(bVar, new ConnectionResult(16));
                        } else {
                            this.f60461b.f60370i.put(bVar, connectionResult);
                        }
                    }
                } else {
                    this.f60461b.f60370i = fVar.zaj();
                }
            } else {
                hVar.mo41887e();
                this.f60461b.f60370i = Collections.emptyMap();
            }
            if (this.f60461b.mo41606d()) {
                this.f60461b.f60369h.putAll(this.f60461b.f60370i);
                if (this.f60461b.mo41665h() == null) {
                    this.f60461b.mo41663c();
                    this.f60461b.mo41664g();
                    this.f60461b.f60366e.signalAll();
                }
            }
            this.f60460a.mo41409f();
            this.f60461b.f60365d.unlock();
        } finally {
            this.f60461b.f60365d.unlock();
        }
    }

    C25471u(C25438cs csVar, AbstractC25465p pVar) {
        this.f60461b = csVar;
        this.f60460a = pVar;
    }
}
