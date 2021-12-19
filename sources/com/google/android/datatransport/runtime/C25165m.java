package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.AbstractC25069c;
import com.google.android.datatransport.AbstractC25112e;
import com.google.android.datatransport.AbstractC25113f;
import com.google.android.datatransport.C25068b;
import com.google.android.datatransport.runtime.C25119b;

/* renamed from: com.google.android.datatransport.runtime.m */
final class C25165m<T> implements AbstractC25113f<T> {

    /* renamed from: a */
    private final AbstractC25162k f59605a;

    /* renamed from: b */
    private final String f59606b;

    /* renamed from: c */
    private final C25068b f59607c;

    /* renamed from: d */
    private final AbstractC25112e<T, byte[]> f59608d;

    /* renamed from: e */
    private final AbstractC25167o f59609e;

    static {
        Covode.recordClassIndex(30531);
    }

    @Override // com.google.android.datatransport.AbstractC25113f
    /* renamed from: a */
    public final void mo41062a(AbstractC25069c<T> cVar) {
        this.f59609e.mo41147a(new C25119b.C25120a().mo41092a(this.f59605a).mo41090a((AbstractC25069c<?>) cVar).mo41093a(this.f59606b).mo41091a((AbstractC25112e<?, byte[]>) this.f59608d).mo41089a(this.f59607c).mo41094a(), C25166n.f59610a);
    }

    C25165m(AbstractC25162k kVar, String str, C25068b bVar, AbstractC25112e<T, byte[]> eVar, AbstractC25167o oVar) {
        this.f59605a = kVar;
        this.f59606b = str;
        this.f59607c = bVar;
        this.f59608d = eVar;
        this.f59609e = oVar;
    }
}
