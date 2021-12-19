package com.google.android.datatransport.cct;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.C25107d;
import com.google.android.datatransport.runtime.p1924a.C25118a;
import com.google.android.datatransport.runtime.p1925b.AbstractC25123c;
import java.net.URL;

/* renamed from: com.google.android.datatransport.cct.c */
final /* synthetic */ class C25106c implements AbstractC25123c {

    /* renamed from: a */
    static final C25106c f59515a = new C25106c();

    static {
        Covode.recordClassIndex(30471);
    }

    private C25106c() {
    }

    @Override // com.google.android.datatransport.runtime.p1925b.AbstractC25123c
    /* renamed from: a */
    public final Object mo41057a(Object obj, Object obj2) {
        C25107d.C25108a aVar = (C25107d.C25108a) obj;
        C25107d.C25109b bVar = (C25107d.C25109b) obj2;
        URL url = bVar.f59526b;
        if (url == null) {
            return null;
        }
        C25118a.m48159a("CctTransportBackend", "Following redirect to: %s", url);
        return new C25107d.C25108a(bVar.f59526b, aVar.f59523b, aVar.f59524c);
    }
}
