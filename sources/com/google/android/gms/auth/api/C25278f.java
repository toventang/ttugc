package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C25307g;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.internal.C25539d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.f */
final class C25278f extends C25335a.AbstractC25336a<C25307g, GoogleSignInOptions> {
    static {
        Covode.recordClassIndex(30655);
    }

    C25278f() {
    }

    @Override // com.google.android.gms.common.api.C25335a.AbstractC25342e
    /* renamed from: a */
    public final /* synthetic */ List mo41327a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo41369a();
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, java.lang.Object, com.google.android.gms.common.api.i$b, com.google.android.gms.common.api.i$c] */
    @Override // com.google.android.gms.common.api.C25335a.AbstractC25336a
    /* renamed from: a */
    public final /* synthetic */ C25307g mo41299a(Context context, Looper looper, C25539d dVar, GoogleSignInOptions googleSignInOptions, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar) {
        return new C25307g(context, looper, dVar, googleSignInOptions, bVar, cVar);
    }
}
