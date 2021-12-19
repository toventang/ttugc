package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.viewmodel;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39251l;
import com.p2082ss.android.ugc.aweme.compliance.api.p2637a.EnumC39224a;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.AbstractC39336b;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.C39335a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel */
public final class NewAppealDialogViewModel extends AbstractC1174ac {

    /* renamed from: f */
    public static final C39352a f92890f = new C39352a((byte) 0);

    /* renamed from: a */
    public final C1213t<AbstractC39336b.C39338b> f92891a = new C1213t<>();

    /* renamed from: b */
    public boolean f92892b;

    /* renamed from: c */
    public AbstractC88412b f92893c;

    /* renamed from: d */
    public final Context f92894d;

    /* renamed from: e */
    public final AppealStatusResponse f92895e;

    /* renamed from: g */
    private final AbstractC89171a<C89391z> f92896g;

    static {
        Covode.recordClassIndex(47035);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$a */
    public static final class C39352a {
        static {
            Covode.recordClassIndex(47036);
        }

        private C39352a() {
        }

        public /* synthetic */ C39352a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo68791a() {
        if (this.f92895e.getAppealType() != 12) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        AbstractC88412b bVar = this.f92893c;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onCleared();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$h */
    public static final class C39359h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92908a;

        /* renamed from: b */
        final /* synthetic */ int f92909b;

        static {
            Covode.recordClassIndex(47043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39359h(NewAppealDialogViewModel newAppealDialogViewModel, int i) {
            super(0);
            this.f92908a = newAppealDialogViewModel;
            this.f92909b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            NewAppealDialogViewModel newAppealDialogViewModel = this.f92908a;
            int i = this.f92909b;
            if (i == 0) {
                NewAppealDialogViewModel.m79999a("pop_appeal_restored", newAppealDialogViewModel.mo68791a());
            } else if (i == 1) {
                newAppealDialogViewModel.mo68795c("0");
            } else if (i == 3) {
                NewAppealDialogViewModel.m79999a("pop_appeal_failed", newAppealDialogViewModel.mo68791a());
            } else if (i == 4) {
                NewAppealDialogViewModel.m79999a("pop_appeal_expired", newAppealDialogViewModel.mo68791a());
            } else if (i == 6) {
                newAppealDialogViewModel.mo68795c("1");
            } else if (i == 7) {
                newAppealDialogViewModel.mo68795c("2");
            } else if (i == 8) {
                newAppealDialogViewModel.mo68795c("3");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$l */
    public static final class C39363l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92913a;

        static {
            Covode.recordClassIndex(47047);
        }

        public C39363l(NewAppealDialogViewModel newAppealDialogViewModel) {
            this.f92913a = newAppealDialogViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C1213t<AbstractC39336b.C39338b> tVar = this.f92913a.f92891a;
            NewAppealDialogViewModel newAppealDialogViewModel = this.f92913a;
            tVar.postValue(newAppealDialogViewModel.mo68792a(NewAppealDialogViewModel.m79997a(newAppealDialogViewModel.f92895e).getStatus(), false));
        }
    }

    /* renamed from: b */
    public final void mo68794b(String str) {
        SmartRouter.buildRoute(this.f92894d, "//webview").withParam(Uri.parse(str)).open(17);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$i */
    public static final class C39360i extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92910a;

        static {
            Covode.recordClassIndex(47044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39360i(NewAppealDialogViewModel newAppealDialogViewModel) {
            super(1);
            this.f92910a = newAppealDialogViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f92910a.f92894d, "//webview").withParam("url", "https://www.tiktok.com/web-inapp/download-your-data?enter_from=banned&hide_nav_bar=1&banned=1").withParam("hide_nav_bar", true).open();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$j */
    public static final class C39361j<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C39361j f92911a = new C39361j();

        static {
            Covode.recordClassIndex(47045);
        }

        C39361j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
            if (r2.getInt("status_code") == 0) goto L_0x0022;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                int r1 = r5.length()
                r3 = 1
                r0 = 0
                if (r1 <= 0) goto L_0x0027
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>(r5)
                java.lang.String r1 = "status_code"
                boolean r0 = r2.has(r1)
                if (r0 == 0) goto L_0x0027
                int r0 = r2.getInt(r1)
                if (r0 != 0) goto L_0x0027
            L_0x0022:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x0027:
                r3 = 0
                goto L_0x0022
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel.C39361j.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$k */
    public static final class C39362k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92912a;

        static {
            Covode.recordClassIndex(47046);
        }

        public C39362k(NewAppealDialogViewModel newAppealDialogViewModel) {
            this.f92912a = newAppealDialogViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C1213t<AbstractC39336b.C39338b> tVar = this.f92912a.f92891a;
            NewAppealDialogViewModel newAppealDialogViewModel = this.f92912a;
            int status = NewAppealDialogViewModel.m79997a(newAppealDialogViewModel.f92895e).getStatus();
            C89219l.m154716b(bool, "");
            tVar.postValue(newAppealDialogViewModel.mo68792a(status, bool.booleanValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo68795c(String str) {
        C33744d a = new C33744d().mo59983a("appeal_type", str).mo59980a("ban_appeal_type", mo68791a());
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C39162r.m79460a("pop_appeal", a.mo59983a("user_id", g.getCurUserId()).f79943a);
    }

    /* renamed from: a */
    public static AppealStatusResponse m79997a(AppealStatusResponse appealStatusResponse) {
        int status;
        C89219l.m154721d(appealStatusResponse, "");
        if (appealStatusResponse.getStatus() != 5) {
            status = appealStatusResponse.getStatus();
        } else if (appealStatusResponse.getBanType() == 4) {
            status = 8;
        } else if (appealStatusResponse.getBanType() == 1 && appealStatusResponse.getBanTime() < 31536000) {
            status = 7;
        } else if (appealStatusResponse.getBanTime() > 31536000) {
            status = 6;
        } else {
            status = appealStatusResponse.getStatus();
        }
        return AppealStatusResponse.copy$default(appealStatusResponse, status, 0, 0, 0, null, null, null, null, 254, null);
    }

    /* renamed from: a */
    private final C39335a m79998a(C39251l lVar) {
        if (lVar == null) {
            return null;
        }
        Integer num = lVar.f92730c;
        int ordinal = EnumC39224a.EXTERNAL_WEB.ordinal();
        if (num != null && num.intValue() == ordinal) {
            return new C39335a(lVar.f92728a, new C39353b(this, lVar));
        }
        int ordinal2 = EnumC39224a.LOGOUT.ordinal();
        if (num != null && num.intValue() == ordinal2) {
            return new C39335a(lVar.f92728a, new C39354c(this));
        }
        int ordinal3 = EnumC39224a.INTERNAL_WEB.ordinal();
        if (num != null && num.intValue() == ordinal3) {
            return new C39335a(lVar.f92728a, new C39355d(this, lVar));
        }
        int ordinal4 = EnumC39224a.EXTERNAL_APPEAL_WEB.ordinal();
        if (num != null && num.intValue() == ordinal4) {
            return new C39335a(lVar.f92728a, new C39356e(this, lVar));
        }
        int ordinal5 = EnumC39224a.INTERNAL_APPEAL_WEB.ordinal();
        if (num != null && num.intValue() == ordinal5) {
            return new C39335a(lVar.f92728a, new C39357f(this, lVar));
        }
        return new C39335a(lVar.f92728a, new C39358g(this, lVar));
    }

    /* renamed from: a */
    public final void mo68793a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            Context context = this.f92894d;
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            this.f92896g.invoke();
        } catch (ActivityNotFoundException unused) {
            SmartRouter.buildRoute(this.f92894d, "//webview").withParam(Uri.parse(str)).open(17);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$b */
    public static final class C39353b extends AbstractC89220m implements AbstractC89183m<DialogInterface, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92897a;

        /* renamed from: b */
        final /* synthetic */ C39251l f92898b;

        static {
            Covode.recordClassIndex(47037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39353b(NewAppealDialogViewModel newAppealDialogViewModel, C39251l lVar) {
            super(2);
            this.f92897a = newAppealDialogViewModel;
            this.f92898b = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            C89219l.m154721d(dialogInterface2, "");
            dialogInterface2.dismiss();
            this.f92897a.mo68793a(this.f92898b.f92729b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$d */
    public static final class C39355d extends AbstractC89220m implements AbstractC89183m<DialogInterface, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92900a;

        /* renamed from: b */
        final /* synthetic */ C39251l f92901b;

        static {
            Covode.recordClassIndex(47039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39355d(NewAppealDialogViewModel newAppealDialogViewModel, C39251l lVar) {
            super(2);
            this.f92900a = newAppealDialogViewModel;
            this.f92901b = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            C89219l.m154721d(dialogInterface2, "");
            dialogInterface2.dismiss();
            this.f92900a.mo68794b(this.f92901b.f92729b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$c */
    public static final class C39354c extends AbstractC89220m implements AbstractC89183m<DialogInterface, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92899a;

        static {
            Covode.recordClassIndex(47038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39354c(NewAppealDialogViewModel newAppealDialogViewModel) {
            super(2);
            this.f92899a = newAppealDialogViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            C89219l.m154721d(dialogInterface2, "");
            if (this.f92899a.f92892b) {
                NewAppealDialogViewModel.m79999a("cancel_appeal", 1);
            }
            dialogInterface2.dismiss();
            C31575b.m65860b().logout("user_banned", "user_banned");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$e */
    public static final class C39356e extends AbstractC89220m implements AbstractC89183m<DialogInterface, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92902a;

        /* renamed from: b */
        final /* synthetic */ C39251l f92903b;

        static {
            Covode.recordClassIndex(47040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39356e(NewAppealDialogViewModel newAppealDialogViewModel, C39251l lVar) {
            super(2);
            this.f92902a = newAppealDialogViewModel;
            this.f92903b = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            C89219l.m154721d(dialogInterface2, "");
            NewAppealDialogViewModel.m79999a("click_appeal", this.f92902a.mo68791a());
            dialogInterface2.dismiss();
            this.f92902a.mo68793a(this.f92903b.f92729b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$f */
    public static final class C39357f extends AbstractC89220m implements AbstractC89183m<DialogInterface, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92904a;

        /* renamed from: b */
        final /* synthetic */ C39251l f92905b;

        static {
            Covode.recordClassIndex(47041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39357f(NewAppealDialogViewModel newAppealDialogViewModel, C39251l lVar) {
            super(2);
            this.f92904a = newAppealDialogViewModel;
            this.f92905b = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            C89219l.m154721d(dialogInterface2, "");
            NewAppealDialogViewModel.m79999a("click_appeal", this.f92904a.mo68791a());
            dialogInterface2.dismiss();
            this.f92904a.mo68794b(this.f92905b.f92729b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel$g */
    public static final class C39358g extends AbstractC89220m implements AbstractC89183m<DialogInterface, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewAppealDialogViewModel f92906a;

        /* renamed from: b */
        final /* synthetic */ C39251l f92907b;

        static {
            Covode.recordClassIndex(47042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39358g(NewAppealDialogViewModel newAppealDialogViewModel, C39251l lVar) {
            super(2);
            this.f92906a = newAppealDialogViewModel;
            this.f92907b = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            C89219l.m154721d(dialogInterface2, "");
            dialogInterface2.dismiss();
            SmartRouter.buildRoute(this.f92906a.f92894d, "//aweme").withParam(Uri.parse(this.f92907b.f92729b)).open(17);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m79999a(String str, int i) {
        C33744d a = new C33744d().mo59980a("ban_appeal_type", i);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C39162r.m79460a(str, a.mo59983a("user_id", g.getCurUserId()).f79943a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r2.intValue() != r1) goto L_0x0052;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.AbstractC39336b.C39338b mo68792a(int r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel.mo68792a(int, boolean):com.ss.android.ugc.aweme.compliance.business.banappeal.c.b$b");
    }

    public NewAppealDialogViewModel(Context context, AppealStatusResponse appealStatusResponse, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(appealStatusResponse, "");
        C89219l.m154721d(aVar, "");
        this.f92894d = context;
        this.f92895e = appealStatusResponse;
        this.f92896g = aVar;
    }
}
