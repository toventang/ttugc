package com.p2082ss.android.ugc.aweme.setting.page.security;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell;
import com.p2082ss.android.ugc.aweme.setting.services.C68431e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityDeviceCell */
public final class SecurityDeviceCell extends RightTextCell<C68333b> {
    static {
        Covode.recordClassIndex(80534);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        View view = this.itemView;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView = (CommonItemView) view;
        if (commonItemView != null) {
            commonItemView.setRightIconRes(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        super.onClick(view);
        C39162r.onEventV3("click_your_device");
        String c = C68431e.f153187a.mo108855c();
        if (c != null) {
            C29844g gVar = new C29844g(c);
            gVar.mo52130a("locale", C53438a.m98623b());
            gVar.mo52128a("aid", C17867d.f42590n);
            gVar.mo52130a("enter_from", "setting_security");
            SmartRouter.buildRoute(((RightTextCell) this).f152793a, "aweme://webview").withParam("url", gVar.mo52126a()).withParam("hide_nav_bar", true).open();
        }
    }
}
