package com.google.android.datatransport.runtime;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.AbstractC25112e;
import com.google.android.datatransport.AbstractC25113f;
import com.google.android.datatransport.AbstractC25114g;
import com.google.android.datatransport.C25068b;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.l */
public final class C25164l implements AbstractC25114g {

    /* renamed from: a */
    private final Set<C25068b> f59602a;

    /* renamed from: b */
    private final AbstractC25162k f59603b;

    /* renamed from: c */
    private final AbstractC25167o f59604c;

    static {
        Covode.recordClassIndex(30530);
    }

    public C25164l(Set<C25068b> set, AbstractC25162k kVar, AbstractC25167o oVar) {
        this.f59602a = set;
        this.f59603b = kVar;
        this.f59604c = oVar;
    }

    @Override // com.google.android.datatransport.AbstractC25114g
    /* renamed from: a */
    public final <T> AbstractC25113f<T> mo41063a(String str, C25068b bVar, AbstractC25112e<T, byte[]> eVar) {
        if (this.f59602a.contains(bVar)) {
            return new C25165m(this.f59603b, str, bVar, eVar, this.f59604c);
        }
        throw new IllegalArgumentException(C1764a.m5928a("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f59602a}));
    }
}
