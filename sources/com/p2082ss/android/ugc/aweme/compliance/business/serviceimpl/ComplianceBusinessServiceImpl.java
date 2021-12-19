package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c;
import com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.C39319b;
import com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2649c.C39382a;
import com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2650ui.C39386a;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2661b.C39614a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl */
public final class ComplianceBusinessServiceImpl implements IComplianceBusinessService {

    /* renamed from: a */
    public static final C39525a f93226a = new C39525a((byte) 0);

    static {
        Covode.recordClassIndex(47222);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl$a */
    public static final class C39525a {
        static {
            Covode.recordClassIndex(47223);
        }

        private C39525a() {
        }

        public /* synthetic */ C39525a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl$b */
    public static final class C39526b implements AbstractC68342a {
        static {
            Covode.recordClassIndex(47224);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
        /* renamed from: a */
        public final void mo60119a(Exception exc) {
            C89219l.m154721d(exc, "");
        }

        C39526b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
        /* renamed from: a */
        public final void mo60118a(C68348f fVar) {
            C89219l.m154721d(fVar, "");
            C39608b.m80409a(fVar.f152969ae);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: a */
    public final Object mo68614a() {
        return C39382a.f92963a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: b */
    public final List<String> mo68617b() {
        return C39608b.m80424j();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: d */
    public final String mo68619d() {
        return C39608b.m80425k();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: g */
    public final boolean mo68622g() {
        return C39608b.m80418d();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: j */
    public final /* synthetic */ Object mo68625j() {
        return new C39526b();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl$c */
    public static final class C39527c implements AbstractC68350b {

        /* renamed from: a */
        final /* synthetic */ int f93227a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f93228b;

        /* renamed from: c */
        final /* synthetic */ int f93229c;

        static {
            Covode.recordClassIndex(47225);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
        public final void aD_() {
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
        public final void cm_() {
            C39608b.m80409a(this.f93227a);
            AbstractC89171a aVar = this.f93228b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        C39527c(int i, AbstractC89171a aVar, int i2) {
            this.f93227a = i;
            this.f93228b = aVar;
            this.f93229c = i2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: h */
    public final int mo68623h() {
        Integer a = C39608b.f93371b.mo69025a();
        if (a != null) {
            return a.intValue();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: e */
    public final String mo68620e() {
        String privacyPolicyUrl;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (privacyPolicyUrl = c.getPrivacyPolicyUrl()) == null) {
            return "";
        }
        return privacyPolicyUrl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: i */
    public final int mo68624i() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            return 2;
        }
        return 0;
    }

    /* renamed from: k */
    public static IComplianceBusinessService m80241k() {
        MethodCollector.m26663i(10608);
        Object a = C81908b.m141854a(IComplianceBusinessService.class, false);
        if (a != null) {
            IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) a;
            MethodCollector.m26664o(10608);
            return iComplianceBusinessService;
        }
        if (C81908b.f183147aC == null) {
            synchronized (IComplianceBusinessService.class) {
                try {
                    if (C81908b.f183147aC == null) {
                        C81908b.f183147aC = new ComplianceBusinessServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10608);
                    throw th;
                }
            }
        }
        ComplianceBusinessServiceImpl complianceBusinessServiceImpl = (ComplianceBusinessServiceImpl) C81908b.f183147aC;
        MethodCollector.m26664o(10608);
        return complianceBusinessServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: c */
    public final boolean mo68618c() {
        Integer enableImpressum;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (enableImpressum = c.getEnableImpressum()) == null || enableImpressum.intValue() == 0 || TextUtils.isEmpty(C39608b.m80425k())) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: f */
    public final String mo68621f() {
        String str;
        String string;
        C39614a aVar = C39608b.f93371b;
        if (aVar.f93393e != null) {
            string = aVar.f93393e;
        } else {
            Keva keva = aVar.f93389a;
            ComplianceSetting c = aVar.mo69034c();
            if (c != null) {
                str = c.getComplianceEncrypt();
            } else {
                str = null;
            }
            string = keva.getString("cmpl_enc", str);
        }
        if (string == null) {
            return "unknown";
        }
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: a */
    public final AbstractC39232c mo68612a(Activity activity) {
        C89219l.m154721d(activity, "");
        return new C39319b(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: a */
    public final View mo68611a(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        return new C39386a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: a */
    public final C39256o mo68613a(int i, String str) {
        C89219l.m154721d(str, "");
        return C39223a.m79605s().mo68677a(i, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: a */
    public final void mo68615a(int i, AbstractC89171a<C89391z> aVar) {
        int i2;
        Integer a = C39608b.f93371b.mo69025a();
        if (a != null) {
            i2 = a.intValue();
        } else {
            i2 = 0;
        }
        C39608b.m80409a(i);
        C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePushSettingChangePresenter = C68432f.f153189a.providePushSettingChangePresenter();
        providePushSettingChangePresenter.mo67839a_(new C39527c(i2, aVar, i));
        providePushSettingChangePresenter.mo57616a("photosensitive_videos_setting", Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService
    /* renamed from: a */
    public final void mo68616a(Activity activity, Aweme aweme, Comment comment) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(comment, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(comment, "");
        if (activity != null && !activity.isFinishing()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            C47809e eVar = C47809e.C47810a.f110762a;
            StringBuilder sb = new StringBuilder("comment_filter_function_open_");
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            Boolean a = eVar.mo79871a(sb.append(g2.getCurUserId()).toString(), (Boolean) false);
            C89219l.m154716b(a, "");
            if (a.booleanValue() && TextUtils.equals(aweme.getAuthorUid(), curUserId)) {
                User user = comment.getUser();
                C89219l.m154716b(user, "");
                if (!TextUtils.equals(user.getUid(), curUserId)) {
                    C47809e eVar2 = C47809e.C47810a.f110762a;
                    String a2 = eVar2.mo79873a("settings_times_".concat(String.valueOf(curUserId)), "0");
                    C89219l.m154716b(a2, "");
                    if (Integer.parseInt(a2) <= 0) {
                        String a3 = eVar2.mo79873a("not_now_times_".concat(String.valueOf(curUserId)), "0");
                        C89219l.m154716b(a3, "");
                        if (Integer.parseInt(a3) <= 1) {
                            Dialog b = new C17197a.C17200a(activity).mo27194b(R.string.b5m).mo27192a(activity.getString(R.string.c4j), (DialogInterface.OnClickListener) new C39382a.DialogInterface$OnClickListenerC39384b(eVar2, curUserId, activity), false).mo27196b(activity.getString(R.string.dhl), (DialogInterface.OnClickListener) new C39382a.DialogInterface$OnClickListenerC39385c(eVar2, curUserId), false).mo27193a().mo27184b();
                            b.setCanceledOnTouchOutside(false);
                            b.setCancelable(false);
                        }
                    }
                }
            }
        }
    }
}
