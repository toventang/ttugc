package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchIntermediateView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.ui.j */
public final /* synthetic */ class C42872j implements SearchIntermediateView.AbstractC42577b {

    /* renamed from: a */
    private final AbstractC42715b f99971a;

    static {
        Covode.recordClassIndex(50977);
    }

    C42872j(AbstractC42715b bVar) {
        this.f99971a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchIntermediateView.AbstractC42577b
    /* renamed from: a */
    public final void mo72765a(MotionEvent motionEvent) {
        AbstractC42715b bVar = this.f99971a;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && bVar.f99641p != null && bVar.f99641p.canDismissKeyboardOnActionDown()) {
            KeyboardUtils.m70897c(bVar.f99631b);
            bVar.f99631b.setCursorVisible(false);
        }
    }
}
