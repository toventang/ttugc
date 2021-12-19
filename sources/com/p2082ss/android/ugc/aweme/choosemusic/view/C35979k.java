package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.choosemusic.view.SearchResultView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.k */
public final /* synthetic */ class C35979k implements SearchResultView.AbstractC35951a {

    /* renamed from: a */
    private final AbstractC35966c f84949a;

    static {
        Covode.recordClassIndex(43225);
    }

    C35979k(AbstractC35966c cVar) {
        this.f84949a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.SearchResultView.AbstractC35951a
    /* renamed from: a */
    public final void mo63078a(MotionEvent motionEvent) {
        AbstractC35966c cVar = this.f84949a;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && cVar.f84926t != null) {
            Boolean value = cVar.f84926t.mo62739e().getValue();
            if (value == null || value.booleanValue()) {
                KeyboardUtils.m70897c(cVar.f84916j);
            }
        }
    }
}
