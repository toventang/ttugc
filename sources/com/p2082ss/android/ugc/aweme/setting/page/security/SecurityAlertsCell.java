package com.p2082ss.android.ugc.aweme.setting.page.security;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell */
public final class SecurityAlertsCell extends RightTextCell<C68332a> {
    static {
        Covode.recordClassIndex(80532);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell
    /* renamed from: a */
    public final void mo108752a() {
        C68332a aVar;
        View view = this.itemView;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView = (CommonItemView) view;
        if (commonItemView != null && (aVar = (C68332a) this.f42160d) != null) {
            commonItemView.setRightIconRes(aVar.f152923e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell$a */
    static final class C68315a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SecurityAlertsCell f152900a;

        static {
            Covode.recordClassIndex(80533);
        }

        C68315a(SecurityAlertsCell securityAlertsCell) {
            this.f152900a = securityAlertsCell;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Boolean> iVar) {
            if (!C80214ai.m139043a(iVar)) {
                return null;
            }
            C89219l.m154716b(iVar, "");
            Boolean d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            if (d.booleanValue()) {
                C68332a aVar = (C68332a) this.f152900a.f42160d;
                if (aVar != null) {
                    aVar.f152923e = 2131233763;
                }
                this.f152900a.mo108752a();
            }
            return null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final void mo28067a(Object obj) {
        super.mo28072k();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsItem");
        this.f42160d = (C68332a) obj;
        C31575b.m65859a();
        C31575b.f75524a.mo57077m().getSafeInfo().mo5534a(new C68315a(this), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        super.onClick(view);
        String a = SettingsManager.m29616a().mo25398a("security_center", "");
        C89219l.m154716b(a, "");
        C39162r.onEventV3("click_security_alert");
        C29844g gVar = new C29844g(a);
        gVar.mo52130a("lang", LocalServiceImpl.m108272a().mo96421a(((RightTextCell) this).f152793a));
        gVar.mo52130a("locale", C53438a.m98623b());
        gVar.mo52128a("aid", C17867d.f42590n);
        gVar.mo52128a("alerts_direct", 1);
        gVar.mo52130a("enter_from", "setting_security");
        SmartRouter.buildRoute(((RightTextCell) this).f152793a, "aweme://webview").withParam("url", gVar.mo52126a()).withParam("hide_nav_bar", true).open();
    }
}
