package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC35418cb;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32176a;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32182c;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32209i;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.p2082ss.android.ugc.aweme.user.C80036a;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.TwoStepVerificationService */
public final class TwoStepVerificationService implements AbstractC35418cb {
    public static final Companion Companion = new Companion(null);
    private static final String REPO_NAME = "2sv_enhancements";
    public static final AbstractC89244h isNewTo2svEnhancements$delegate = C89250i.m154773a((AbstractC89171a) TwoStepVerificationService$Companion$isNewTo2svEnhancements$2.INSTANCE);
    public static final Keva keva = Keva.getRepo("2sv_enhancements");
    private final AbstractC89244h pushChallengeKeva$delegate = C89250i.m154773a((AbstractC89171a) TwoStepVerificationService$pushChallengeKeva$2.INSTANCE);
    private final AbstractC89244h response$delegate = C89250i.m154773a((AbstractC89171a) TwoStepVerificationService$response$2.INSTANCE);
    private C1731i<C32176a> task;

    private final Keva getPushChallengeKeva() {
        return (Keva) this.pushChallengeKeva$delegate.getValue();
    }

    public final HashMap<String, C32176a> getResponse() {
        return (HashMap) this.response$delegate.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.TwoStepVerificationService$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79734);
        }

        public final boolean isNewTo2svEnhancements() {
            return ((Boolean) TwoStepVerificationService.isNewTo2svEnhancements$delegate.getValue()).booleanValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final C1731i<C32176a> getTask() {
        return this.task;
    }

    public final C1731i<C32182c> getAvailableWays() {
        return TwoStepAuthApi.m66501a().getAvailableWays();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35418cb
    public final C1731i<Boolean> getSafeInfo() {
        C1731i<TContinuationResult> b = TwoStepAuthApi.m66501a().getUnusualInfo().mo5537b(TwoStepVerificationService$getSafeInfo$1.INSTANCE);
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35418cb
    public final int getTwoStepVerificationStatusFromLocal() {
        String b = C36085cj.m73548b();
        C89219l.m154716b(b, "");
        C89219l.m154721d(b, "");
        Integer a = C80036a.m138776a(b, "tow_sv_status");
        if (a != null) {
            return a.intValue();
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35418cb
    public final C1731i<Boolean> getTwoStepVerificationStatusFromNetwork() {
        C1731i<C32176a> twoStepStatus = getTwoStepStatus(false);
        this.task = twoStepStatus;
        if (twoStepStatus == null) {
            C89219l.m154715b();
        }
        C1731i<TContinuationResult> b = twoStepStatus.mo5537b(new C67877xa85d9220(this));
        C89219l.m154716b(b, "");
        return b;
    }

    static {
        Covode.recordClassIndex(79733);
    }

    public final C32176a getTwoStepVerificationResponseFromCache() {
        if (!Companion.isNewTo2svEnhancements()) {
            return getResponse().get(C36085cj.m73548b());
        }
        keva.storeBoolean("is_new_to_2sv_enhancements", false);
        return null;
    }

    public final Boolean getTwoStepVerificationStatusFromCache() {
        C32176a.C32177a data;
        String default_verify_way;
        C32176a aVar = getResponse().get(C36085cj.m73548b());
        if (aVar == null || (data = aVar.getData()) == null || (default_verify_way = data.getDefault_verify_way()) == null) {
            return null;
        }
        return Boolean.valueOf(!TextUtils.isEmpty(default_verify_way));
    }

    public final void setTask(C1731i<C32176a> iVar) {
        this.task = iVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35418cb
    public final void onOpenPushChallengePage(String str) {
        C89219l.m154721d(str, "");
        C32209i.m66575a(str);
    }

    public final C1731i<C32176a> getTwoStepStatus(boolean z) {
        if (!z || this.task == null || Companion.isNewTo2svEnhancements()) {
            this.task = TwoStepAuthApi.m66501a().getVerification();
        }
        C1731i<C32176a> iVar = this.task;
        if (iVar == null) {
            C89219l.m154715b();
        }
        return iVar;
    }

    public final void setTwoStepVerificationResponseToCache(C32176a aVar) {
        String str;
        C32176a.C32177a data;
        C89219l.m154721d(aVar, "");
        HashMap<String, C32176a> response = getResponse();
        String b = C36085cj.m73548b();
        C89219l.m154716b(b, "");
        response.put(b, aVar);
        C32176a aVar2 = getResponse().get(C36085cj.m73548b());
        if (aVar2 == null || (data = aVar2.getData()) == null) {
            str = null;
        } else {
            str = data.getDefault_verify_way();
        }
        String b2 = C36085cj.m73548b();
        C89219l.m154716b(b2, "");
        int i = !TextUtils.isEmpty(str) ? 1 : 0;
        C89219l.m154721d(b2, "");
        C80036a.m138777a(b2, "tow_sv_status", i);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_TwoStepVerificationService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m120119x24a4289a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35418cb
    public final void openTwoStepVerificationManageActivity(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        Intent intent = new Intent(activity, TwoStepVerificationManageActivity.class);
        intent.putExtra("enter_from", str);
        m120119x24a4289a(activity, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35418cb
    public final void handlePushChallengeInfo(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C32209i iVar = C32209i.f76863d;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !C32209i.m66573a().contains(str)) {
            try {
                Intent buildIntent = SmartRouter.buildRoute(C17867d.m33078a(), "//main/deep_link_handler").buildIntent();
                C89219l.m154716b(buildIntent, "");
                buildIntent.setData(Uri.parse(str2));
                buildIntent.addFlags(268435456);
                if (ActivityStack.isAppBackGround()) {
                    C32209i.f76860a = System.currentTimeMillis();
                    C32209i.f76861b = buildIntent;
                    C32209i.f76862c = str;
                    Context a = C17867d.m33078a();
                    if (a != null) {
                        ((Application) a).registerActivityLifecycleCallbacks(iVar);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
                }
                buildIntent.addFlags(536870912);
                C32209i.m66575a(str);
                C32209i.m66574a(C17867d.m33078a(), buildIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
