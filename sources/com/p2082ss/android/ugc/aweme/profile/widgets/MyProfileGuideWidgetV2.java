package com.p2082ss.android.ugc.aweme.profile.widgets;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37484b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2716ct.C40760a;
import com.p2082ss.android.ugc.aweme.profile.C63416ac;
import com.p2082ss.android.ugc.aweme.profile.C63506d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63785n;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.profile.settings.C63874a;
import com.p2082ss.android.ugc.aweme.profile.survey.AbstractView$OnClickListenerC63887g;
import com.p2082ss.android.ugc.aweme.profile.survey.C63880a;
import com.p2082ss.android.ugc.aweme.profile.survey.ViewTreeObserver$OnGlobalLayoutListenerC63890h;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.p2082ss.android.ugc.aweme.profile.widgets.api.BAProfileGrowthShowApi;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.trill.R;
import java.util.Random;
import org.greenrobot.eventbus.AbstractC90253j;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2 */
public final class MyProfileGuideWidgetV2 extends BaseMyProfileGuideWidget implements AbstractC33974au, AbstractC68351c, AbstractC90253j {

    /* renamed from: r */
    private C39088c<AbstractC39085b<C68348f>, AbstractC68351c> f146120r;

    static {
        Covode.recordClassIndex(75929);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68832a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget, com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$j */
    static final class C64477j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C64477j f146130a = new C64477j();

        static {
            Covode.recordClassIndex(75939);
        }

        C64477j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$h */
    static final class C64475h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146128a;

        static {
            Covode.recordClassIndex(75937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64475h(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146128a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            BaseMyProfileGuideWidget.m116302a(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$c */
    static final class C64470c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146123a;

        static {
            Covode.recordClassIndex(75932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64470c(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146123a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146123a;
            myProfileGuideWidgetV2.mo104038a(myProfileGuideWidgetV2.mo60928k());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$i */
    static final class C64476i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146129a;

        static {
            Covode.recordClassIndex(75938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64476i(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146129a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f146129a.mo104045n().mo75829g(BaseMyProfileGuideWidget.C64426al.f146067a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: h */
    public final void mo39086h() {
        super.mo39086h();
        if (!C17873f.f42636l) {
            mo104049p();
        }
    }

    @Override // com.bytedance.widget.Widget, com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
    /* renamed from: i */
    public final void mo39087i() {
        super.mo39087i();
        C39088c<AbstractC39085b<C68348f>, AbstractC68351c> cVar = this.f146120r;
        if (cVar != null) {
            cVar.ck_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$e */
    static final class C64472e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146125a;

        static {
            Covode.recordClassIndex(75934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64472e(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146125a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146125a;
            NoticeView k = myProfileGuideWidgetV2.mo60928k();
            if (k == null) {
                C89219l.m154715b();
            }
            myProfileGuideWidgetV2.mo104041b(k);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$l */
    static final class C64479l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146132a;

        /* renamed from: b */
        final /* synthetic */ MyProfileGuideState f146133b;

        static {
            Covode.recordClassIndex(75941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64479l(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, MyProfileGuideState myProfileGuideState) {
            super(0);
            this.f146132a = myProfileGuideWidgetV2;
            this.f146133b = myProfileGuideState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146132a;
            NoticeView k = myProfileGuideWidgetV2.mo60928k();
            if (k == null) {
                C89219l.m154715b();
            }
            myProfileGuideWidgetV2.mo104039a(k, this.f146133b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$m */
    static final class C64480m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146134a;

        static {
            Covode.recordClassIndex(75942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64480m(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146134a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146134a;
            NoticeView k = myProfileGuideWidgetV2.mo60928k();
            if (k == null) {
                C89219l.m154715b();
            }
            myProfileGuideWidgetV2.mo104042c(k);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$a */
    static final class C64468a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146121a;

        static {
            Covode.recordClassIndex(75930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64468a(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146121a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146121a;
            NoticeView k = myProfileGuideWidgetV2.mo60928k();
            if (k == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(k, "");
            k.setIconImage(R.drawable.b8u);
            k.setTitleText(R.string.d7c);
            k.setOnInternalClickListener(new BaseMyProfileGuideWidget.C64419ae(myProfileGuideWidgetV2, k));
            myProfileGuideWidgetV2.mo104037a((View) k);
            BaseMyProfileGuideWidget.m116302a(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$f */
    static final class C64473f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146126a;

        static {
            Covode.recordClassIndex(75935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64473f(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146126a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146126a;
            NoticeView k = myProfileGuideWidgetV2.mo60928k();
            if (k == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(k, "");
            k.setIconImage(2131233407);
            k.setTitleText(R.string.bnb);
            k.setOnInternalClickListener(new BaseMyProfileGuideWidget.C64427am(myProfileGuideWidgetV2, k));
            myProfileGuideWidgetV2.mo104037a((View) k);
            C39162r.m79460a("privacy_floating_bar_show", new C33744d().f79943a);
            BaseMyProfileGuideWidget.m116302a(true);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget, com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
    /* renamed from: c */
    public final void mo39080c() {
        super.mo39080c();
        C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter = C68432f.f153189a.providePushSettingFetchPresenter();
        this.f146120r = providePushSettingFetchPresenter;
        if (providePushSettingFetchPresenter == null) {
            C89219l.m154715b();
        }
        providePushSettingFetchPresenter.mo67839a_(this);
        C39088c<AbstractC39085b<C68348f>, AbstractC68351c> cVar = this.f146120r;
        if (cVar == null) {
            C89219l.m154715b();
        }
        cVar.mo57616a(new Object[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$b */
    static final class C64469b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146122a;

        static {
            Covode.recordClassIndex(75931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64469b(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146122a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MethodCollector.m26663i(7485);
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146122a;
            try {
                View inflate = ((ViewStub) myProfileGuideWidgetV2.f146033j.getValue()).inflate();
                myProfileGuideWidgetV2.f146034k = inflate;
                TextView textView = (TextView) inflate.findViewById(R.id.ewr);
                C89219l.m154716b(textView, "");
                textView.setText(C39223a.m79589c().mo68607b());
                inflate.setOnClickListener(new BaseMyProfileGuideWidget.View$OnClickListenerC64420af(myProfileGuideWidgetV2, inflate));
                C89219l.m154716b(inflate, "");
                inflate.setVisibility(0);
                inflate.post(new BaseMyProfileGuideWidget.RunnableC64421ag(myProfileGuideWidgetV2, inflate));
                C39223a.m79589c().mo68608c();
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7485);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$k */
    static final class C64478k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146131a;

        static {
            Covode.recordClassIndex(75940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64478k(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146131a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146131a;
            NoticeButtonView l = myProfileGuideWidgetV2.mo104043l();
            if (l == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(l, "");
            l.setOnInternalClickListener(new BaseMyProfileGuideWidget.C64422ah(myProfileGuideWidgetV2, l));
            myProfileGuideWidgetV2.mo104037a((View) l);
            C39162r.m79460a("banner_show", new C33744d().mo59983a("banner_type", "coupon_fission").mo59983a("banner_name", "tiktok_rewards").mo59983a("enter_from", "personal_homepage").f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$g */
    static final class C64474g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146127a;

        static {
            Covode.recordClassIndex(75936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64474g(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146127a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146127a;
            NoticeButtonView m = myProfileGuideWidgetV2.mo104044m();
            if (m == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(m, "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            C37484b a = C63874a.m115570a();
            if (a != null) {
                String title = a.getTitle();
                if (title != null) {
                    m.setTitleText(title);
                }
                String bodyText = a.getBodyText();
                if (bodyText != null) {
                    m.setContextText(bodyText);
                }
                String buttonText = a.getButtonText();
                if (buttonText != null) {
                    m.setItemText(buttonText);
                }
                m.setOnClickListener(new BaseMyProfileGuideWidget.View$OnClickListenerC64463v(myProfileGuideWidgetV2, m, a));
                m.setOnInternalClickListener(new BaseMyProfileGuideWidget.C64464w(myProfileGuideWidgetV2, m, a, curUser));
                myProfileGuideWidgetV2.mo104037a((View) m);
                C39162r.m79460a("ttelite_BA_acq_profile_msg_show", new C33744d().mo59983a("message_id", a.getMessageId()).mo59983a("user_id", curUser.getUid()).mo59980a("user_status", curUser.getAccountType()).f79943a);
                String messageId = a.getMessageId();
                if (messageId != null) {
                    C88411a aVar = myProfileGuideWidgetV2.f146038o;
                    Object a2 = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(BAProfileGrowthShowApi.class);
                    C89219l.m154716b(a2, "");
                    aVar.mo142945a(((BAProfileGrowthShowApi) a2).sendMessageIsShown(messageId).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(BaseMyProfileGuideWidget.C64465x.f146116a, BaseMyProfileGuideWidget.C64466y.f146117a));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$d */
    static final class C64471d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidgetV2 f146124a;

        static {
            Covode.recordClassIndex(75933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64471d(MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
            super(0);
            this.f146124a = myProfileGuideWidgetV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            String str2;
            MethodCollector.m26663i(7136);
            MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = this.f146124a;
            View view = myProfileGuideWidgetV2.f56005e;
            if (view == null) {
                C89219l.m154715b();
            }
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.cpf);
            if (viewStub == null) {
                C51423a.m95786a(new Exception("find my_profile_survey_stub is null"));
            }
            C89219l.m154716b(viewStub, "");
            C63880a aVar = new C63880a(viewStub);
            myProfileGuideWidgetV2.f146032i = aVar;
            aVar.f144831k = new BaseMyProfileGuideWidget.C64441k(myProfileGuideWidgetV2, aVar);
            AbstractView$OnClickListenerC63887g gVar = myProfileGuideWidgetV2.f146032i;
            if (gVar == null) {
                C89219l.m154715b();
            }
            gVar.f144832l = ((MyProfileGuideState) myProfileGuideWidgetV2.withState(myProfileGuideWidgetV2.mo104045n(), BaseMyProfileGuideWidget.C64428an.f146070a)).getSurveyData();
            AbstractView$OnClickListenerC63887g gVar2 = myProfileGuideWidgetV2.f146032i;
            if (gVar2 == null) {
                C89219l.m154715b();
            }
            if (gVar2.f144821a != null && AbstractView$OnClickListenerC63887g.m115585a(gVar2.f144832l)) {
                if (gVar2.f144822b == null) {
                    gVar2.f144822b = gVar2.f144821a.inflate();
                    View view2 = gVar2.f144822b;
                    gVar2.f144823c = view2.findViewById(R.id.ect);
                    gVar2.f144824d = (TextView) gVar2.f144823c.findViewById(R.id.ed1);
                    gVar2.f144825e = (TextView) gVar2.f144823c.findViewById(R.id.ecu);
                    gVar2.f144829i = (TextView) gVar2.f144823c.findViewById(R.id.ecs);
                    gVar2.f144830j = (TextView) gVar2.f144823c.findViewById(R.id.ecw);
                    gVar2.f144826f = view2.findViewById(R.id.ecz);
                    gVar2.f144827g = (TextView) gVar2.f144826f.findViewById(R.id.ed0);
                    gVar2.f144828h = (TextView) gVar2.f144826f.findViewById(R.id.ecy);
                    View findViewById = gVar2.f144823c.findViewById(R.id.ecq);
                    View findViewById2 = gVar2.f144826f.findViewById(R.id.ecv);
                    findViewById.setOnClickListener(gVar2);
                    findViewById2.setOnClickListener(gVar2);
                    gVar2.f144829i.setOnClickListener(gVar2);
                    gVar2.f144830j.setOnClickListener(gVar2);
                    C17235c.m31810a(findViewById, 0.75f);
                    C17235c.m31810a(findViewById2, 0.75f);
                }
                boolean z = false;
                gVar2.f144835o = false;
                C40760a aVar2 = gVar2.f144832l;
                if (aVar2 != null) {
                    gVar2.f144824d.setText(aVar2.f95417b);
                    gVar2.f144825e.setText(aVar2.f95418c);
                    if (new Random().nextInt(2) == 1) {
                        z = true;
                    }
                    gVar2.f144836p = z;
                    TextView textView = gVar2.f144829i;
                    if (gVar2.f144836p) {
                        str = aVar2.f95420e;
                    } else {
                        str = aVar2.f95419d;
                    }
                    textView.setText(str);
                    TextView textView2 = gVar2.f144830j;
                    if (gVar2.f144836p) {
                        str2 = aVar2.f95419d;
                    } else {
                        str2 = aVar2.f95420e;
                    }
                    textView2.setText(str2);
                    gVar2.f144827g.setText(aVar2.f95421f);
                    gVar2.f144828h.setText(aVar2.f95422g);
                }
                if (gVar2.f144822b.getHeight() > 0) {
                    gVar2.mo103425a();
                } else {
                    View view3 = gVar2.f144822b;
                    ViewTreeObserver$OnGlobalLayoutListenerC63890h hVar = new ViewTreeObserver$OnGlobalLayoutListenerC63890h(gVar2);
                    if (view3 != null) {
                        ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                        viewTreeObserver.addOnGlobalLayoutListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0166: INVOKE  
                              (r1v3 'viewTreeObserver' android.view.ViewTreeObserver)
                              (wrap: com.ss.android.ugc.aweme.base.utils.o$2 : 0x0163: CONSTRUCTOR  (r0v14 com.ss.android.ugc.aweme.base.utils.o$2) = 
                              (r1v3 'viewTreeObserver' android.view.ViewTreeObserver)
                              (r3v2 'view3' android.view.View)
                              (r2v4 'hVar' com.ss.android.ugc.aweme.profile.survey.h)
                             call: com.ss.android.ugc.aweme.base.utils.o.2.<init>(android.view.ViewTreeObserver, android.view.View, android.view.ViewTreeObserver$OnGlobalLayoutListener):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.view.ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener):void in method: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2.d.invoke():h.z, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0163: CONSTRUCTOR  (r0v14 com.ss.android.ugc.aweme.base.utils.o$2) = 
                              (r1v3 'viewTreeObserver' android.view.ViewTreeObserver)
                              (r3v2 'view3' android.view.View)
                              (r2v4 'hVar' com.ss.android.ugc.aweme.profile.survey.h)
                             call: com.ss.android.ugc.aweme.base.utils.o.2.<init>(android.view.ViewTreeObserver, android.view.View, android.view.ViewTreeObserver$OnGlobalLayoutListener):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2.d.invoke():h.z, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 29 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.base.utils.o, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 35 more
                            */
                        /*
                        // Method dump skipped, instructions count: 368
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2.C64471d.invoke():java.lang.Object");
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$n */
                public static final class C64481n extends AbstractC89220m implements AbstractC89189s<AbstractC20477i, Integer, Boolean, Boolean, Boolean, C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ MyProfileGuideWidgetV2 f146135a;

                    /* renamed from: b */
                    final /* synthetic */ NoticeView f146136b;

                    static {
                        Covode.recordClassIndex(75943);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C64481n(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, NoticeView noticeView) {
                        super(5);
                        this.f146135a = myProfileGuideWidgetV2;
                        this.f146136b = noticeView;
                    }

                    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2$n$a */
                    static final /* synthetic */ class C64482a extends C89217j implements AbstractC89172b<ProfileState, ProfileState> {

                        /* renamed from: a */
                        public static final C64482a f146137a = new C64482a();

                        static {
                            Covode.recordClassIndex(75944);
                        }

                        C64482a() {
                            super(1, C63506d.class, "identity", "identity(Ljava/lang/Object;)Ljava/lang/Object;", 1);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
                            ProfileState profileState2 = profileState;
                            C89219l.m154721d(profileState2, "");
                            return profileState2;
                        }
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89189s
                    public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
                        AbstractC20477i iVar2 = iVar;
                        int intValue = num.intValue();
                        C89219l.m154721d(iVar2, "");
                        ProfileState profileState = (ProfileState) iVar2.withState(this.f146135a.mo104065r(), C64482a.f146137a);
                        profileState.isPostAwemeEmpty();
                        if (intValue != 0 || !MyProfileGuideWidgetV2.m116313e(profileState)) {
                            this.f146135a.mo104036a(8);
                            NoticeView noticeView = this.f146136b;
                            if (noticeView != null) {
                                noticeView.setVisibility(4);
                            }
                            C63786o.f144584d = false;
                        } else {
                            this.f146135a.mo104036a(0);
                            C63785n.m115346a();
                            C63786o.f144584d = true;
                            NoticeView noticeView2 = this.f146136b;
                            if (noticeView2 != null) {
                                noticeView2.setVisibility(4);
                            }
                        }
                        return C89391z.f203057a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public MyProfileGuideWidgetV2(ViewGroup viewGroup) {
                    super(viewGroup);
                    C89219l.m154721d(viewGroup, "");
                }

                /* access modifiers changed from: protected */
                @Override // com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
                /* renamed from: a */
                public final void mo104038a(NoticeView noticeView) {
                    AbstractC88412b unused = selectSubscribe(mo104065r(), C64913l.f146731a, C64923m.f146744a, C64934n.f146755a, C65082o.f146932a, new C20370ah(), new C64481n(this, noticeView));
                    C63785n.m115346a();
                    C63786o.f144584d = true;
                }

                @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
                /* renamed from: a */
                public final void mo68831a(C68348f fVar) {
                    if (fVar != null) {
                        if (fVar.f153001w == 1) {
                            mo104065r().mo33689c(new ProfileViewModel.C64402d(fVar.f153000v));
                        }
                        mo104065r().mo33689c(new ProfileViewModel.C64401c(fVar.f152996r));
                    }
                }

                /* access modifiers changed from: protected */
                @Override // com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget
                /* renamed from: a */
                public final C89386u<Boolean, Boolean, AbstractC89171a<C89391z>>[] mo104040a(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
                    boolean z;
                    boolean z2;
                    C89219l.m154721d(profileState, "");
                    C89219l.m154721d(myProfileGuideState, "");
                    C89386u<Boolean, Boolean, AbstractC89171a<C89391z>>[] uVarArr = new C89386u[13];
                    boolean z3 = true;
                    uVarArr[0] = new C89386u<>(true, Boolean.valueOf(m116305a(profileState)), new C64468a(this));
                    uVarArr[1] = new C89386u<>(true, Boolean.valueOf(m116308b(profileState)), new C64473f(this));
                    C37484b a = C63874a.m115570a();
                    if (a != null && !TextUtils.isEmpty(a.getLandingPageSchema())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    uVarArr[2] = new C89386u<>(true, Boolean.valueOf(z), new C64474g(this));
                    uVarArr[3] = new C89386u<>(true, Boolean.valueOf(C63867b.f144793a.needShowSafeInfoNotice()), new C64475h(this));
                    uVarArr[4] = new C89386u<>(true, Boolean.valueOf(C63416ac.f143967a), new C64476i(this));
                    uVarArr[5] = new C89386u<>(true, Boolean.valueOf(m116304a(myProfileGuideState, profileState)), C64477j.f146130a);
                    uVarArr[6] = new C89386u<>(true, Boolean.valueOf(m116310c(profileState)), new C64478k(this));
                    uVarArr[7] = new C89386u<>(Boolean.valueOf(myProfileGuideState.getPostListHasLoaded()), Boolean.valueOf(m116315g(profileState)), new C64479l(this, myProfileGuideState));
                    uVarArr[8] = new C89386u<>(true, Boolean.valueOf(m116303a(myProfileGuideState)), new C64480m(this));
                    uVarArr[9] = new C89386u<>(true, Boolean.valueOf(m116314f(profileState)), new C64469b(this));
                    if (!myProfileGuideState.getPostListHasLoaded() || profileState.isPostGuideShow() == null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    uVarArr[10] = new C89386u<>(Boolean.valueOf(z2), Boolean.valueOf(m116312d(profileState)), new C64470c(this));
                    uVarArr[11] = new C89386u<>(Boolean.valueOf(myProfileGuideState.getHasSurveyDetermined()), Boolean.valueOf(m116309b(profileState, myProfileGuideState)), new C64471d(this));
                    if (myProfileGuideState.getNeedShowDiskManagerGuide() == null) {
                        z3 = false;
                    }
                    uVarArr[12] = new C89386u<>(Boolean.valueOf(z3), Boolean.valueOf(m116311c(profileState, myProfileGuideState)), new C64472e(this));
                    return uVarArr;
                }
            }
