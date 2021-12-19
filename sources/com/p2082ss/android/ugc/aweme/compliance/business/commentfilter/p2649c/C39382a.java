package com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2649c;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.api.CommentFilterApi;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.c.a */
public final class C39382a implements AbstractC68342a {

    /* renamed from: a */
    public static final C39382a f92963a = new C39382a();

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60119a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.c.a$a */
    public static final class C39383a implements AbstractC88986z<BaseResponse> {
        static {
            Covode.recordClassIndex(47069);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C39383a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            C89219l.m154721d(baseResponse, "");
        }
    }

    private C39382a() {
    }

    static {
        Covode.recordClassIndex(47068);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60118a(C68348f fVar) {
        Integer a;
        C89219l.m154721d(fVar, "");
        C47809e eVar = C47809e.C47810a.f110762a;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        if (g2.isLogin() && !TextUtils.isEmpty(curUserId)) {
            if (C89219l.m154714a((Object) eVar.mo79873a("settings_times_".concat(String.valueOf(curUserId)), ""), (Object) "") || C89219l.m154714a((Object) eVar.mo79873a("not_now_times_".concat(String.valueOf(curUserId)), ""), (Object) "") || !eVar.mo79871a("comment_filter_function_open_".concat(String.valueOf(curUserId)), (Boolean) false).booleanValue()) {
                eVar.mo79877b("settings_times_".concat(String.valueOf(curUserId)), "0");
                eVar.mo79877b("not_now_times_".concat(String.valueOf(curUserId)), "0");
                eVar.mo79875b("comment_filter_function_open_".concat(String.valueOf(curUserId)), (Boolean) true);
            }
            Boolean a2 = eVar.mo79871a("comment_filter_function_open_".concat(String.valueOf(curUserId)), (Boolean) false);
            C89219l.m154716b(a2, "");
            if (a2.booleanValue() && (a = eVar.mo79872a("comment_filter_status_".concat(String.valueOf(curUserId)), (Integer) 0)) != null && a.intValue() == 0 && fVar.f152952O > 0) {
                eVar.mo79877b("settings_times_".concat(String.valueOf(curUserId)), "1");
                eVar.mo79877b("not_now_times_".concat(String.valueOf(curUserId)), "2");
            }
            eVar.mo79876b("comment_filter_status_".concat(String.valueOf(curUserId)), Integer.valueOf(fVar.f152952O));
            eVar.mo79876b("comment_offensive_filter_".concat(String.valueOf(curUserId)), Integer.valueOf(fVar.f152953P));
            eVar.mo79875b("author_review_all_comments_".concat(String.valueOf(curUserId)), Boolean.valueOf(fVar.f152954Q));
            eVar.mo79875b("filter_comment_manager_visible_".concat(String.valueOf(curUserId)), Boolean.valueOf(fVar.f152955R));
            if (!eVar.mo79871a("comment_filter_status_synced_".concat(String.valueOf(curUserId)), (Boolean) false).booleanValue()) {
                if (fVar.f152952O == 1) {
                    CommentFilterApi.f92956a.triggerSyncServerCommentFilter().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C39383a());
                }
                eVar.mo79875b("comment_filter_status_synced_".concat(String.valueOf(curUserId)), (Boolean) true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.c.a$c */
    public static final class DialogInterface$OnClickListenerC39385c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47809e f92967a;

        /* renamed from: b */
        final /* synthetic */ String f92968b;

        static {
            Covode.recordClassIndex(47071);
        }

        public DialogInterface$OnClickListenerC39385c(C47809e eVar, String str) {
            this.f92967a = eVar;
            this.f92968b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String a = this.f92967a.mo79873a("not_now_times_" + this.f92968b, "0");
            C89219l.m154716b(a, "");
            this.f92967a.mo79877b("not_now_times_" + this.f92968b, String.valueOf(Integer.parseInt(a) + 1));
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.c.a$b */
    public static final class DialogInterface$OnClickListenerC39384b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47809e f92964a;

        /* renamed from: b */
        final /* synthetic */ String f92965b;

        /* renamed from: c */
        final /* synthetic */ Activity f92966c;

        static {
            Covode.recordClassIndex(47070);
        }

        public DialogInterface$OnClickListenerC39384b(C47809e eVar, String str, Activity activity) {
            this.f92964a = eVar;
            this.f92965b = str;
            this.f92966c = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String a = this.f92964a.mo79873a("settings_times_" + this.f92965b, "0");
            C89219l.m154716b(a, "");
            this.f92964a.mo79877b("settings_times_" + this.f92965b, String.valueOf(Integer.parseInt(a) + 1));
            SmartRouter.buildRoute(this.f92966c, "aweme://filtercomments").open();
            C39162r.m79460a("enter_filter_comment", new C33744d().mo59983a("enter_from", "comment_panel").f79943a);
        }
    }
}
