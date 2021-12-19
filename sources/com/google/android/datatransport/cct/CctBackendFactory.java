package com.google.android.datatransport.cct;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.AbstractC25128d;
import com.google.android.datatransport.runtime.backends.AbstractC25134h;
import com.google.android.datatransport.runtime.backends.AbstractC25140m;

public class CctBackendFactory implements AbstractC25128d {
    static {
        Covode.recordClassIndex(30434);
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25128d
    public AbstractC25140m create(AbstractC25134h hVar) {
        return new C25107d(hVar.mo41110a(), hVar.mo41111b(), hVar.mo41112c());
    }
}
