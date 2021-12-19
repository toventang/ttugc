package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.internal.p1942authapi.C25704z;

/* renamed from: com.google.android.gms.auth.api.e */
final class C25277e extends C25335a.AbstractC25336a<C25704z, C25253a.C25254a> {
    static {
        Covode.recordClassIndex(30654);
    }

    C25277e() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, java.lang.Object, com.google.android.gms.common.api.i$b, com.google.android.gms.common.api.i$c] */
    @Override // com.google.android.gms.common.api.C25335a.AbstractC25336a
    /* renamed from: a */
    public final /* synthetic */ C25704z mo41299a(Context context, Looper looper, C25539d dVar, C25253a.C25254a aVar, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar) {
        return new C25704z(context, looper, dVar, aVar, bVar, cVar);
    }
}
