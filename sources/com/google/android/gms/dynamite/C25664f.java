package com.google.android.gms.dynamite;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
final class C25664f implements DynamiteModule.AbstractC25654b {
    static {
        Covode.recordClassIndex(31078);
    }

    C25664f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.AbstractC25654b
    /* renamed from: a */
    public final DynamiteModule.AbstractC25654b.C25655a mo41908a(Context context, String str, DynamiteModule.AbstractC25654b.AbstractC25656b bVar) {
        DynamiteModule.AbstractC25654b.C25655a aVar = new DynamiteModule.AbstractC25654b.C25655a();
        aVar.f60806a = bVar.mo41909a(context, str);
        if (aVar.f60806a != 0) {
            aVar.f60807b = bVar.mo41910a(context, str, false);
        } else {
            aVar.f60807b = bVar.mo41910a(context, str, true);
        }
        if (aVar.f60806a == 0 && aVar.f60807b == 0) {
            aVar.f60808c = 0;
        } else if (aVar.f60807b >= aVar.f60806a) {
            aVar.f60808c = 1;
        } else {
            aVar.f60808c = -1;
        }
        return aVar;
    }
}
