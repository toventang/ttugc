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

/* renamed from: com.google.android.gms.common.api.internal.cu */
final class C25440cu implements AbstractC25626c<Map<C25390b<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C25438cs f60384a;

    static {
        Covode.recordClassIndex(30839);
    }

    private C25440cu(C25438cs csVar) {
        this.f60384a = csVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25626c
    /* renamed from: a */
    public final void mo36732a(AbstractC25631h<Map<C25390b<?>, String>> hVar) {
        this.f60384a.f60365d.lock();
        try {
            if (this.f60384a.f60368g) {
                if (hVar.mo41882b()) {
                    this.f60384a.f60369h = new C0484a(this.f60384a.f60362a.size());
                    for (C25439ct<?> ctVar : this.f60384a.f60362a.values()) {
                        this.f60384a.f60369h.put(ctVar.f60121d, ConnectionResult.f60081a);
                    }
                } else if (hVar.mo41887e() instanceof C25352f) {
                    C25352f fVar = (C25352f) hVar.mo41887e();
                    if (this.f60384a.f60367f) {
                        this.f60384a.f60369h = new C0484a(this.f60384a.f60362a.size());
                        for (C25439ct<?> ctVar2 : this.f60384a.f60362a.values()) {
                            C25390b<O> bVar = ctVar2.f60121d;
                            ConnectionResult connectionResult = fVar.getConnectionResult((C25354h<? extends C25335a.AbstractC25339d>) ctVar2);
                            if (this.f60384a.mo41662a(ctVar2, connectionResult)) {
                                this.f60384a.f60369h.put(bVar, new ConnectionResult(16));
                            } else {
                                this.f60384a.f60369h.put(bVar, connectionResult);
                            }
                        }
                    } else {
                        this.f60384a.f60369h = fVar.zaj();
                    }
                    C25438cs csVar = this.f60384a;
                    csVar.f60371j = csVar.mo41665h();
                } else {
                    hVar.mo41887e();
                    this.f60384a.f60369h = Collections.emptyMap();
                    this.f60384a.f60371j = new ConnectionResult(8);
                }
                if (this.f60384a.f60370i != null) {
                    this.f60384a.f60369h.putAll(this.f60384a.f60370i);
                    C25438cs csVar2 = this.f60384a;
                    csVar2.f60371j = csVar2.mo41665h();
                }
                if (this.f60384a.f60371j == null) {
                    this.f60384a.mo41663c();
                    this.f60384a.mo41664g();
                } else {
                    this.f60384a.f60368g = false;
                    this.f60384a.f60364c.mo41586a(this.f60384a.f60371j);
                }
                this.f60384a.f60366e.signalAll();
                this.f60384a.f60365d.unlock();
            }
        } finally {
            this.f60384a.f60365d.unlock();
        }
    }

    /* synthetic */ C25440cu(C25438cs csVar, byte b) {
        this(csVar);
    }
}
