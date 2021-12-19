package com.p2082ss.android.ugc.aweme.setting.page.security;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityPermissionsCell */
public final class SecurityPermissionsCell extends RightTextCell<C68335d> {

    /* renamed from: b */
    private final AbstractC89244h f152913b = C89250i.m154773a((AbstractC89171a) new C68326a(this));

    static {
        Covode.recordClassIndex(80547);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityPermissionsCell$a */
    static final class C68326a extends AbstractC89220m implements AbstractC89171a<SecurityViewModel> {

        /* renamed from: a */
        final /* synthetic */ SecurityPermissionsCell f152914a;

        static {
            Covode.recordClassIndex(80548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68326a(SecurityPermissionsCell securityPermissionsCell) {
            super(0);
            this.f152914a = securityPermissionsCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SecurityViewModel invoke() {
            return PowerCell.m32713b(this.f152914a, SecurityViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        SecurityViewModel securityViewModel = (SecurityViewModel) this.f152913b.getValue();
        if (securityViewModel != null) {
            securityViewModel.f152922b = true;
        }
        C39162r.m79460a("enter_manage_apps_permissions", new C33744d().mo59983a("previous_page", "security and login").mo59983a("setting_security", "settings_security").f79943a);
        SmartRouter.buildRoute(((RightTextCell) this).f152793a, "//authmanagement").open();
    }
}
