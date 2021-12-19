package com.p2082ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.publish.s */
public final /* synthetic */ class C65686s implements AbstractC1729g {

    /* renamed from: a */
    private final IDraftService.OnGetRecoverDraftCallback f148007a;

    static {
        Covode.recordClassIndex(77177);
    }

    public C65686s(IDraftService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        this.f148007a = onGetRecoverDraftCallback;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        IDraftService.OnGetRecoverDraftCallback onGetRecoverDraftCallback = this.f148007a;
        C43223c cVar = (C43223c) iVar.mo5545d();
        if (cVar != null) {
            onGetRecoverDraftCallback.onSuccess(cVar);
            return null;
        }
        onGetRecoverDraftCallback.onFail();
        return null;
    }
}
