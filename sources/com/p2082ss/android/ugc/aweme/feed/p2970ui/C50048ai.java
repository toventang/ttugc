package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ai */
final /* synthetic */ class C50048ai implements AbstractC1214u {

    /* renamed from: a */
    private final C50041af f115533a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f115534b;

    static {
        Covode.recordClassIndex(59174);
    }

    C50048ai(C50041af afVar, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f115533a = afVar;
        this.f115534b = scrollSwitchStateManager;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C50041af afVar = this.f115533a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f115534b;
        Integer num = (Integer) obj;
        if (num != null && !TextUtils.equals(scrollSwitchStateManager.mo89335a(num.intValue()), "page_feed")) {
            afVar.f115519n.mo70464a(0, 0);
        }
    }
}
