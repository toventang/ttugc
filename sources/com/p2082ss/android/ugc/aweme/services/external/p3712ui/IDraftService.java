package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.IDraftService */
public interface IDraftService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.IDraftService$OnGetRecoverDraftCallback */
    public interface OnGetRecoverDraftCallback {
        static {
            Covode.recordClassIndex(79858);
        }

        void onFail();

        void onSuccess(C43223c cVar);
    }

    static {
        Covode.recordClassIndex(79857);
    }

    void enterDraftBoxActivity(Context context, Bundle bundle);

    void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback);

    void removeRecoverDraft();
}
