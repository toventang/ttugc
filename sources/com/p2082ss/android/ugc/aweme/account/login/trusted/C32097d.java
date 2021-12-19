package com.p2082ss.android.ugc.aweme.account.login.trusted;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.d */
public final class C32097d {

    /* renamed from: a */
    public static final C32097d f76590a = new C32097d();

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.d$a */
    static final class DialogInterface$OnClickListenerC32098a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC32098a f76591a = new DialogInterface$OnClickListenerC32098a();

        static {
            Covode.recordClassIndex(38857);
        }

        DialogInterface$OnClickListenerC32098a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    private C32097d() {
    }

    static {
        Covode.recordClassIndex(38856);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.d$d */
    public static final class C32101d implements AbstractC17207b.AbstractC17211c {

        /* renamed from: a */
        final /* synthetic */ Activity f76594a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f76595b;

        static {
            Covode.recordClassIndex(38860);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            Activity activity = this.f76594a;
            AbstractC89171a aVar = this.f76595b;
            C39162r.m79460a("remember_login_info_notify", new C33744d().mo59983a("user_id", C36085cj.f85262b.mo57069e().getCurUserId()).mo59983a("enter_from", "login").f79943a);
            C17197a.C17200a aVar2 = new C17197a.C17200a(activity);
            SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(activity);
            C20766v a = C20761r.m39060a(C34735v.m70965a(C36085cj.f85262b.mo57069e().getCurUser().getAvatarThumb()));
            a.f49092E = smartAvatarImageView;
            a.mo34186c();
            aVar2.mo27191a(smartAvatarImageView, 48, 48);
            aVar2.f41067M = false;
            aVar2.mo27189a(R.string.bt).mo27194b(R.string.bq).mo27195b(R.string.br, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC32098a.f76591a, false).mo27190a(R.string.bs, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC32099b.f76592a, false).f41083n = new DialogInterface$OnDismissListenerC32100c(aVar);
            aVar2.mo27193a().mo27185c();
            Keva.getRepo("save_info_keva_repo").storeLong("key_last_show_time", System.currentTimeMillis());
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
            if (list != null) {
                Integer.valueOf(list.size());
            }
        }

        public C32101d(Activity activity, AbstractC89171a aVar) {
            this.f76594a = activity;
            this.f76595b = aVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
            if (list != null) {
                Integer.valueOf(list.size());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.d$c */
    static final class DialogInterface$OnDismissListenerC32100c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f76593a;

        static {
            Covode.recordClassIndex(38859);
        }

        DialogInterface$OnDismissListenerC32100c(AbstractC89171a aVar) {
            this.f76593a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f76593a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.d$b */
    static final class DialogInterface$OnClickListenerC32099b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC32099b f76592a = new DialogInterface$OnClickListenerC32099b();

        static {
            Covode.recordClassIndex(38858);
        }

        DialogInterface$OnClickListenerC32099b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C36085cj.f85262b.mo57075k().updateMethodInfo("allow_one_key_login", true);
            C33744d dVar = new C33744d();
            IAccountUserService e = C36085cj.f85262b.mo57069e();
            C89219l.m154716b(e, "");
            C39162r.m79460a("remember_login_info_confirm", dVar.mo59983a("user_id", e.getCurUserId()).mo59983a("enter_from", "login").f79943a);
        }
    }
}
