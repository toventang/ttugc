package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.internal.p4499b.AbstractC87720b;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.c */
public final class C87724c {

    /* renamed from: a */
    final AbstractC87720b f199241a;

    /* renamed from: b */
    private final Context f199242b;

    static {
        Covode.recordClassIndex(103713);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C87718b mo142171a() {
        C87718b a = new C87726e(this.f199242b).mo142174a();
        m152660b(a);
        C87794k.m152811c().mo142113b();
        return a;
    }

    /* renamed from: b */
    static boolean m152660b(C87718b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f199234a)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo142172a(C87718b bVar) {
        if (m152660b(bVar)) {
            AbstractC87720b bVar2 = this.f199241a;
            bVar2.mo142167a(bVar2.mo142168b().putString("advertising_id", bVar.f199234a).putBoolean("limit_ad_tracking_enabled", bVar.f199235b));
            return;
        }
        AbstractC87720b bVar3 = this.f199241a;
        bVar3.mo142167a(bVar3.mo142168b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }

    C87724c(Context context, AbstractC87720b bVar) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f199242b = applicationContext;
        this.f199241a = bVar;
    }
}
