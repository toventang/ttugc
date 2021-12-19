package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.viewmodel;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.AbstractC39336b;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.C39335a;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.C39339c;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.C39340d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogAgsStyleViewModel */
public final class AppealDialogAgsStyleViewModel extends AppealDialogViewModel<AbstractC39336b.C39337a> {

    /* renamed from: a */
    final Context f92880a;

    /* renamed from: b */
    public final AppealStatusResponse f92881b;

    static {
        Covode.recordClassIndex(47028);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogAgsStyleViewModel$c */
    static final class C39349c extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AppealDialogAgsStyleViewModel f92884a;

        static {
            Covode.recordClassIndex(47031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39349c(AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel) {
            super(1);
            this.f92884a = appealDialogAgsStyleViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f92884a.f92880a, "//webview").withParam(Uri.parse(this.f92884a.f92881b.getAppealUrl()).buildUpon().appendQueryParameter("enter_from", "popup_perm").build()).open(17);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogAgsStyleViewModel$d */
    public static final class C39350d extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AppealDialogAgsStyleViewModel f92885a;

        static {
            Covode.recordClassIndex(47032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39350d(AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel) {
            super(1);
            this.f92885a = appealDialogAgsStyleViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f92885a.f92880a, "//webview").withParam("url", "https://www.tiktok.com/web-inapp/download-your-data?enter_from=banned&hide_nav_bar=1&banned=1").withParam("hide_nav_bar", true).open();
            return C89391z.f203057a;
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.compliance.business.banappeal.c.b' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogViewModel
    /* renamed from: a */
    public final /* synthetic */ AbstractC39336b.C39337a mo68790a(AppealStatusResponse appealStatusResponse) {
        int status;
        AbstractC39336b.C39337a aVar;
        C39339c cVar;
        C89219l.m154721d(appealStatusResponse, "");
        AppealStatusResponse appealStatusResponse2 = this.f92881b;
        C89219l.m154721d(appealStatusResponse2, "");
        if (appealStatusResponse2.getStatus() != 5) {
            status = appealStatusResponse2.getStatus();
        } else if (appealStatusResponse2.getBanType() == 4) {
            status = 8;
        } else if (appealStatusResponse2.getBanType() == 1 && appealStatusResponse2.getBanTime() < 31536000) {
            status = 7;
        } else if (appealStatusResponse2.getBanTime() > 31536000) {
            status = 6;
        } else {
            status = appealStatusResponse2.getStatus();
        }
        int status2 = AppealStatusResponse.copy$default(appealStatusResponse2, status, 0, 0, 0, null, null, null, null, 254, null).getStatus();
        if (status2 == 1 || status2 == 5) {
            String popTitle = this.f92881b.getPopTitle();
            String popContent = this.f92881b.getPopContent();
            if (popContent == null) {
                popContent = "";
            }
            String string = this.f92880a.getString(R.string.bef, "");
            C89219l.m154716b(string, "");
            String string2 = this.f92880a.getString(R.string.beg);
            C89219l.m154716b(string2, "");
            aVar = new AbstractC39336b.C39337a(popTitle, popContent, m79994a(string, string2), new C39335a(this.f92880a.getString(R.string.h_a), new C39347a(this)), null);
        } else {
            String popTitle2 = this.f92881b.getPopTitle();
            String popContent2 = this.f92881b.getPopContent();
            if (popContent2 == null) {
                popContent2 = "";
            }
            String string3 = this.f92880a.getString(R.string.bef, "");
            C89219l.m154716b(string3, "");
            String string4 = this.f92880a.getString(R.string.beg);
            C89219l.m154716b(string4, "");
            C39340d a = m79994a(string3, string4);
            C39335a aVar2 = new C39335a(this.f92880a.getString(R.string.beh), new C39348b(this));
            String appealUrl = this.f92881b.getAppealUrl();
            if (appealUrl == null || appealUrl.length() <= 0) {
                cVar = null;
            } else {
                String string5 = this.f92880a.getString(R.string.h_6);
                C89219l.m154716b(string5, "");
                cVar = new C39339c(string5, new C39349c(this));
            }
            aVar = new AbstractC39336b.C39337a(popTitle2, popContent2, a, aVar2, cVar);
        }
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppealDialogAgsStyleViewModel(Context context, AppealStatusResponse appealStatusResponse) {
        super(context, appealStatusResponse);
        C89219l.m154721d(context, "");
        C89219l.m154721d(appealStatusResponse, "");
        this.f92880a = context;
        this.f92881b = appealStatusResponse;
    }

    /* renamed from: a */
    private final C39340d m79994a(String str, String str2) {
        return new C39340d(str, str2, new C39350d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogAgsStyleViewModel$b */
    static final class C39348b extends AbstractC89220m implements AbstractC89183m<DialogInterface, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AppealDialogAgsStyleViewModel f92883a;

        static {
            Covode.recordClassIndex(47030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39348b(AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel) {
            super(2);
            this.f92883a = appealDialogAgsStyleViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            C89219l.m154721d(dialogInterface2, "");
            dialogInterface2.dismiss();
            C31575b.m65860b().logout("user_banned", "user_banned");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogAgsStyleViewModel$a */
    static final class C39347a extends AbstractC89220m implements AbstractC89183m<DialogInterface, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AppealDialogAgsStyleViewModel f92882a;

        static {
            Covode.recordClassIndex(47029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39347a(AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel) {
            super(2);
            this.f92882a = appealDialogAgsStyleViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(DialogInterface dialogInterface, Integer num) {
            num.intValue();
            C89219l.m154721d(dialogInterface, "");
            SmartRouter.buildRoute(this.f92882a.f92880a, "//webview").withParam(Uri.parse(this.f92882a.f92881b.getAppealUrl())).open(17);
            return C89391z.f203057a;
        }
    }
}
