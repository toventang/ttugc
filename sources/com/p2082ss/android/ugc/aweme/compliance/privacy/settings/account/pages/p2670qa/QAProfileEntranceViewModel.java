package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.p2670qa;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39742b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.p2670qa.C39929c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63498e;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel */
public final class QAProfileEntranceViewModel extends BasePrivacySettingViewModel {

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel$d */
    static final class C39919d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39919d f93895a = new C39919d();

        static {
            Covode.recordClassIndex(47668);
        }

        C39919d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(47662);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel$a */
    static final class C39914a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39914a f93890a = new C39914a();

        static {
            Covode.recordClassIndex(47663);
        }

        C39914a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C68348f fVar = (C68348f) obj;
            C40043a.m80998a("PRIVACY_SETTING_ALOG", new AbstractC89172b<C33743c, C33743c>() {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.p2670qa.QAProfileEntranceViewModel.C39914a.C399151 */

                static {
                    Covode.recordClassIndex(47664);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C33743c invoke(C33743c cVar) {
                    C33743c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    C40043a.m80991a(cVar2, "Fetch UserSetting success");
                    C68348f fVar = fVar;
                    C89219l.m154716b(fVar, "");
                    C40043a.m81000b(cVar2, C40043a.m80993a((BaseResponse) fVar));
                    C40043a.m80990a(cVar2, C40043a.m80997a());
                    C40043a.m80992a(cVar2, "from", "QAProfileEntrance");
                    C68348f fVar2 = fVar;
                    C89219l.m154716b(fVar2, "");
                    return C40043a.m80992a(cVar2, "user_setting", C40043a.m80995a(fVar2));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel$b */
    static final class C39916b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39916b f93892a = new C39916b();

        static {
            Covode.recordClassIndex(47665);
        }

        C39916b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            C40043a.m80998a("PRIVACY_SETTING_ALOG", new AbstractC89172b<C33743c, C33743c>() {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.p2670qa.QAProfileEntranceViewModel.C39916b.C399171 */

                static {
                    Covode.recordClassIndex(47666);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C33743c invoke(C33743c cVar) {
                    C33743c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    C40043a.m80991a(cVar2, "Fetch UserSetting fail");
                    Throwable th = th;
                    C89219l.m154716b(th, "");
                    C40043a.m81000b(cVar2, C40043a.m80996a(th));
                    C40043a.m80990a(cVar2, C40043a.m80997a());
                    C40043a.m80992a(cVar2, "from", "QAProfileEntrance");
                    Throwable th2 = th;
                    C89219l.m154716b(th2, "");
                    return C40043a.m80992a(cVar2, "cause", C40043a.m81001b(th2));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel$c */
    static final class C39918c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QAProfileEntranceViewModel f93894a;

        static {
            Covode.recordClassIndex(47667);
        }

        C39918c(QAProfileEntranceViewModel qAProfileEntranceViewModel) {
            this.f93894a = qAProfileEntranceViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C68348f fVar = (C68348f) obj;
            C89219l.m154716b(fVar, "");
            String str = fVar.f152946I;
            C89219l.m154716b(str, "");
            C39742b.m80625a(str);
            this.f93894a.f93798d.setValue(Integer.valueOf(fVar.f152979ao));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    /* renamed from: b */
    public final AbstractC88979t<BaseResponse> mo69142b(int i) {
        AbstractC88979t<BaseResponse> a = C39929c.f93906a.setQAStatus(i).mo143280b(C39929c.C39930a.f93908a).mo143264a(C39929c.C39931b.f93909a);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    /* renamed from: a */
    public final void mo69141a(int i, BaseResponse baseResponse) {
        C89219l.m154721d(baseResponse, "");
        super.mo69141a(i, baseResponse);
        AbstractC81915c.m141874a(new C63498e());
    }
}
