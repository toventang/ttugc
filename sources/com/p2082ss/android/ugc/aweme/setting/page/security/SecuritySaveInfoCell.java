package com.p2082ss.android.ugc.aweme.setting.page.security;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.AbstractC34889bn;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.page.base.C68262d;
import com.p2082ss.android.ugc.aweme.setting.page.base.SwitchCell;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell */
public final class SecuritySaveInfoCell extends SwitchCell<C68336e> {

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell$a */
    static final class DialogInterface$OnClickListenerC68327a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC68327a f152915a = new DialogInterface$OnClickListenerC68327a();

        static {
            Covode.recordClassIndex(80550);
        }

        DialogInterface$OnClickListenerC68327a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        Covode.recordClassIndex(80549);
    }

    /* renamed from: a */
    public final void mo64272a(boolean z) {
        C39162r.m79460a("switch_login_save", new C33744d().mo59980a("state", z ? 1 : 0).f79943a);
        C31575b.m65859a();
        C31575b.f75524a.mo57075k().updateMethodInfo("allow_one_key_login", Boolean.valueOf(z));
        C68262d dVar = (C68262d) this.f42160d;
        if (dVar != null) {
            dVar.f152812c = z;
        }
        mo108754a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.base.SwitchCell
    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        super.onClick(view);
        C31575b.m65859a();
        AbstractC34889bn k = C31575b.f75524a.mo57075k();
        if (!k.getSaveLoginStatus()) {
            mo64272a(true);
        } else if (k.isOneKeyLoginExprimentEnable()) {
            C33744d dVar = new C33744d();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            C39162r.m79460a("remove_login_info_notify", dVar.mo59983a("user_id", g.getCurUserId()).f79943a);
            C17197a.C17200a aVar = new C17197a.C17200a(((SwitchCell) this).f152794a);
            aVar.mo27189a(R.string.fd);
            aVar.f41067M = false;
            aVar.mo27194b(R.string.fa).mo27195b(R.string.fb, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC68327a.f152915a, false).mo27190a(R.string.fc, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC68328b(this), false).mo27193a().mo27185c();
        } else {
            mo64272a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell$b */
    static final class DialogInterface$OnClickListenerC68328b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SecuritySaveInfoCell f152916a;

        static {
            Covode.recordClassIndex(80551);
        }

        DialogInterface$OnClickListenerC68328b(SecuritySaveInfoCell securitySaveInfoCell) {
            this.f152916a = securitySaveInfoCell;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C33744d dVar = new C33744d();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            C39162r.m79460a("remove_login_info_confirm", dVar.mo59983a("user_id", g.getCurUserId()).f79943a);
            this.f152916a.mo64272a(false);
        }
    }
}
