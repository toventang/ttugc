package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.az */
public final /* synthetic */ class View$OnClickListenerC37034az implements View.OnClickListener {

    /* renamed from: a */
    private final C37157k f87223a;

    static {
        Covode.recordClassIndex(44388);
    }

    View$OnClickListenerC37034az(C37157k kVar) {
        this.f87223a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37157k kVar = this.f87223a;
        if (kVar.f87567I != null) {
            kVar.f87567I.mo64780a().postValue(false);
            C34729o.m70956a(false, kVar.f87631o, kVar.f87634r);
            C34729o.m70956a(true, kVar.f87625e);
            kVar.f87569K.mo63714b(false);
            if (kVar.mo64727t()) {
                C34729o.m70959b(true, kVar.f87630n);
            }
            kVar.mo64726s();
        }
        C39162r.onEventV3("comment_batch_management_done_ck");
    }
}
