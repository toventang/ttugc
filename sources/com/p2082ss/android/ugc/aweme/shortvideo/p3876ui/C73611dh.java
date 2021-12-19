package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dh */
final /* synthetic */ class C73611dh implements AbstractC2565m {

    /* renamed from: a */
    private final C73560cj f165430a;

    /* renamed from: b */
    private final C2564l f165431b;

    static {
        Covode.recordClassIndex(86349);
    }

    C73611dh(C73560cj cjVar, C2564l lVar) {
        this.f165430a = cjVar;
        this.f165431b = lVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        C73560cj cjVar = this.f165430a;
        C2564l lVar = this.f165431b;
        Boolean bool = (Boolean) obj;
        C84911q.m145921a("VideoPublishFragment -> onResume: fromPublishSettingPanel = ".concat(String.valueOf(bool)));
        if (bool.booleanValue()) {
            CommonItemView commonItemView = cjVar.f165266I.f162851m;
            if (commonItemView != null) {
                commonItemView.setDesc(null);
            }
            lVar.mo7019b(false);
        }
    }
}
