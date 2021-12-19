package com.p2082ss.android.ugc.aweme.compliance.business.banappeal;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.p2082ss.android.ugc.aweme.main.AbstractC59104k;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.d */
final /* synthetic */ class C39341d implements AbstractC1729g {

    /* renamed from: a */
    private final C39319b f92869a;

    /* renamed from: b */
    private final Activity f92870b;

    static {
        Covode.recordClassIndex(47021);
    }

    C39341d(C39319b bVar, Activity activity) {
        this.f92869a = bVar;
        this.f92870b = activity;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C39319b bVar = this.f92869a;
        Activity activity = this.f92870b;
        if (iVar == null || iVar.mo5539b() || iVar.mo5544c()) {
            bVar.f92813c.set(false);
            return null;
        } else if (!iVar.mo5535a() || iVar.mo5545d() == null) {
            return null;
        } else {
            bVar.f92811a = C39223a.m79589c().mo68600a(activity, (AppealStatusResponse) iVar.mo5545d());
            if (!bVar.f92812b || ((AbstractC59104k) activity).isADShowing()) {
                bVar.f92811a.mo68118b();
                return null;
            }
            bVar.f92811a.mo68120d();
            return null;
        }
    }
}
