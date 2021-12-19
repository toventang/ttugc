package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.internal.C25550k;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.af */
final class C25369af extends AbstractRunnableC25378ao {

    /* renamed from: a */
    final /* synthetic */ C25368ae f60196a;

    /* renamed from: b */
    private final Map<C25335a.AbstractC25343f, C25370ag> f60197b;

    static {
        Covode.recordClassIndex(30768);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC25378ao
    /* renamed from: a */
    public final void mo41578a() {
        C25550k kVar = new C25550k(this.f60196a.f60178d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C25335a.AbstractC25343f fVar : this.f60197b.keySet()) {
            if (!this.f60197b.get(fVar).f60198a) {
                arrayList.add(fVar);
            } else {
                arrayList2.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                i = kVar.mo41823a(this.f60196a.f60177c, (C25335a.AbstractC25343f) obj);
                if (i == 0) {
                }
            }
            this.f60196a.f60175a.mo41600a(new C25372ai(this, this.f60196a, new ConnectionResult(i, null)));
            return;
        }
        int size2 = arrayList.size();
        while (true) {
            if (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                i = kVar.mo41823a(this.f60196a.f60177c, (C25335a.AbstractC25343f) obj2);
                if (i != 0) {
                    break;
                }
            } else if (i == 0) {
            }
        }
        this.f60196a.f60175a.mo41600a(new C25372ai(this, this.f60196a, new ConnectionResult(i, null)));
        return;
        if (this.f60196a.f60180f && this.f60196a.f60179e != null) {
            this.f60196a.f60179e.mo43684v();
        }
        for (C25335a.AbstractC25343f fVar2 : this.f60197b.keySet()) {
            C25370ag agVar = this.f60197b.get(fVar2);
            if (kVar.mo41823a(this.f60196a.f60177c, fVar2) != 0) {
                this.f60196a.f60175a.mo41600a(new C25371ah(this.f60196a, agVar));
            } else {
                fVar2.mo41487a(agVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25369af(C25368ae aeVar, Map<C25335a.AbstractC25343f, C25370ag> map) {
        super(aeVar, (byte) 0);
        this.f60196a = aeVar;
        this.f60197b = map;
    }
}
