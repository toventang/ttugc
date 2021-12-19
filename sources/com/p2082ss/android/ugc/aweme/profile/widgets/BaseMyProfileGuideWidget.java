package com.p2082ss.android.ugc.aweme.profile.widgets;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20379aq;
import com.bytedance.jedi.ext.adapter.C20624b;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g;
import com.p2082ss.android.ugc.aweme.commerce.C37484b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.p2716ct.C40760a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63416ac;
import com.p2082ss.android.ugc.aweme.profile.C63424aj;
import com.p2082ss.android.ugc.aweme.profile.C63493b;
import com.p2082ss.android.ugc.aweme.profile.C63504c;
import com.p2082ss.android.ugc.aweme.profile.C63506d;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63737c;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63740d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63496c;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.profile.survey.AbstractC63882c;
import com.p2082ss.android.ugc.aweme.profile.survey.AbstractView$OnClickListenerC63887g;
import com.p2082ss.android.ugc.aweme.profile.survey.C63881b;
import com.p2082ss.android.ugc.aweme.profile.survey.C63883d;
import com.p2082ss.android.ugc.aweme.profile.survey.C63885e;
import com.p2082ss.android.ugc.aweme.profile.survey.SurveyApi;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3582a.C64486b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget */
public class BaseMyProfileGuideWidget extends ProfileWidget implements AbstractC33974au, AbstractC34687g, AbstractC90252i, AbstractC90253j {

    /* renamed from: p */
    public static final C64432d f146028p = new C64432d((byte) 0);

    /* renamed from: t */
    private static final boolean f146029t = false;

    /* renamed from: g */
    public final String f146030g = "BaseMyProfileGuieWidget";

    /* renamed from: h */
    public View f146031h;

    /* renamed from: i */
    AbstractView$OnClickListenerC63887g f146032i;

    /* renamed from: j */
    final AbstractC89244h f146033j = C89250i.m154774a(EnumC89331m.NONE, new C64437i(this));

    /* renamed from: k */
    View f146034k;

    /* renamed from: l */
    public ObjectAnimator f146035l;

    /* renamed from: m */
    public View f146036m;

    /* renamed from: n */
    public AnimatorSet f146037n;

    /* renamed from: o */
    final C88411a f146038o;

    /* renamed from: r */
    private final AbstractC89244h f146039r = C89250i.m154774a(EnumC89331m.NONE, new C64443m(this));

    /* renamed from: s */
    private final WidgetLifecycleAwareLazy f146040s;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ac */
    public static final class C64417ac<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64417ac f146047a = new C64417ac();

        static {
            Covode.recordClassIndex(75878);
        }

        C64417ac() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$b */
    public static final class C64430b extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {
        public static final C64430b INSTANCE = new C64430b();

        static {
            Covode.recordClassIndex(75891);
        }

        public C64430b() {
            super(1);
        }

        public final MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            C89219l.m154719c(myProfileGuideState, "");
            return myProfileGuideState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$x */
    static final class C64465x<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64465x f146116a = new C64465x();

        static {
            Covode.recordClassIndex(75926);
        }

        C64465x() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$y */
    static final class C64466y<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64466y f146117a = new C64466y();

        static {
            Covode.recordClassIndex(75927);
        }

        C64466y() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: s */
    private final ViewStub m116316s() {
        return (ViewStub) this.f146039r.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo104038a(NoticeView noticeView) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C89386u<Boolean, Boolean, AbstractC89171a<C89391z>>[] mo104040a(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
        C89219l.m154721d(profileState, "");
        C89219l.m154721d(myProfileGuideState, "");
        return new C89386u[0];
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(275, new RunnableC90250g(BaseMyProfileGuideWidget.class, "onProfilePageScrolledEvent", C64486b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(276, new RunnableC90250g(BaseMyProfileGuideWidget.class, "onI18nRecommendUserDialogDissmissEvent", C63496c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: n */
    public final MyProfileGuideViewModel mo104045n() {
        return (MyProfileGuideViewModel) this.f146040s.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$d */
    public static final class C64432d {
        static {
            Covode.recordClassIndex(75893);
        }

        private C64432d() {
        }

        public /* synthetic */ C64432d(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ab */
    public static final class C64416ab implements NoticeView.AbstractC42575a {

        /* renamed from: a */
        final /* synthetic */ NoticeView f146046a;

        static {
            Covode.recordClassIndex(75877);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: a */
        public final void mo72753a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: b */
        public final void mo72754b() {
            this.f146046a.setVisibility(8);
        }

        C64416ab(NoticeView noticeView) {
            this.f146046a = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$k */
    public static final class C64441k implements AbstractC63882c {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146084a;

        /* renamed from: b */
        final /* synthetic */ AbstractView$OnClickListenerC63887g f146085b;

        static {
            Covode.recordClassIndex(75902);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.survey.AbstractC63882c
        /* renamed from: a */
        public final void mo103420a() {
            this.f146085b.mo103426b();
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.survey.AbstractC63882c
        /* renamed from: a */
        public final void mo103421a(C40760a aVar) {
            String str;
            C89219l.m154721d(aVar, "");
            C33744d a = new C33744d().mo59983a("pop_survey_id", String.valueOf(aVar.f95416a));
            if (!TextUtils.isEmpty(aVar.f95423h)) {
                str = aVar.f95423h;
            } else {
                str = aVar.f95418c;
            }
            C39162r.m79460a("pop_survey_show", a.mo59983a("pop_survey_question", str).mo59980a("original_id", aVar.f95424i).f79943a);
        }

        C64441k(BaseMyProfileGuideWidget baseMyProfileGuideWidget, AbstractView$OnClickListenerC63887g gVar) {
            this.f146084a = baseMyProfileGuideWidget;
            this.f146085b = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.survey.AbstractC63882c
        /* renamed from: a */
        public final void mo103422a(C40760a aVar, int i, String str) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(str, "");
            if (i == 1) {
                this.f146085b.mo103427c();
            } else if (i == 2) {
                this.f146085b.mo103427c();
            } else if (i == 3) {
                this.f146085b.mo103426b();
            }
            C63883d.m115581a();
            C63883d.m115582a(new C63881b(i, aVar.f95416a, aVar.f95424i));
            C80214ai.m139042a(new RunnableC64442l(i, aVar, str), this.f146084a.f146030g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ak */
    public static final class C64425ak implements NoticeView.AbstractC42575a {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146063a;

        /* renamed from: b */
        final /* synthetic */ String f146064b;

        /* renamed from: c */
        final /* synthetic */ NoticeView f146065c;

        /* renamed from: d */
        final /* synthetic */ String f146066d;

        static {
            Covode.recordClassIndex(75886);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: a */
        public final void mo72753a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: b */
        public final void mo72754b() {
            C65083p.m116809a();
            this.f146065c.setVisibility(8);
            C64314y.m116187c("close");
        }

        C64425ak(BaseMyProfileGuideWidget baseMyProfileGuideWidget, String str, NoticeView noticeView, String str2) {
            this.f146063a = baseMyProfileGuideWidget;
            this.f146064b = str;
            this.f146065c = noticeView;
            this.f146066d = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$am */
    public static final class C64427am implements NoticeView.AbstractC42575a {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146068a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f146069b;

        static {
            Covode.recordClassIndex(75888);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: b */
        public final void mo72754b() {
            this.f146069b.setVisibility(8);
            BaseMyProfileGuideWidget.m116302a(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: a */
        public final void mo72753a() {
            this.f146069b.setVisibility(8);
            SmartRouter.buildRoute(C20624b.m38846b(this.f146068a), "aweme://privacy/setting").open();
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Boolean> shouldShowPrivateAccountTipInProfile = inst.getShouldShowPrivateAccountTipInProfile();
            C89219l.m154716b(shouldShowPrivateAccountTipInProfile, "");
            shouldShowPrivateAccountTipInProfile.mo59940b(false);
            C39162r.m79460a("privacy_floating_bar_click", new C33744d().f79943a);
            BaseMyProfileGuideWidget.m116302a(false);
        }

        C64427am(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeView noticeView) {
            this.f146068a = baseMyProfileGuideWidget;
            this.f146069b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$z */
    public static final class C64467z implements NoticeView.AbstractC42575a {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146118a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f146119b;

        static {
            Covode.recordClassIndex(75928);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: b */
        public final void mo72754b() {
            C63873h.f144797a.logShowProfileDiskManagerGuideView();
            this.f146119b.setVisibility(8);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: a */
        public final void mo72753a() {
            C63873h.f144797a.logShowProfileDiskManagerGuideView();
            C63873h.f144797a.startDiskManagerActivity(C20624b.m38846b(this.f146118a));
            this.f146119b.setVisibility(8);
        }

        C64467z(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeView noticeView) {
            this.f146118a = baseMyProfileGuideWidget;
            this.f146119b = noticeView;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$e */
    public static final class CallableC64433e<V> implements Callable {

        /* renamed from: a */
        public static final CallableC64433e f146076a = new CallableC64433e();

        static {
            Covode.recordClassIndex(75894);
        }

        CallableC64433e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Keva repo = Keva.getRepo("keva_repo_profile_component");
            int i = repo.getInt("show_yt_removed_toast", -1);
            if (i == 1) {
                repo.storeInt("show_yt_removed_toast", 0);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$i */
    static final class C64437i extends AbstractC89220m implements AbstractC89171a<ViewStub> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146080a;

        static {
            Covode.recordClassIndex(75898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64437i(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(0);
            this.f146080a = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewStub invoke() {
            View view = this.f146080a.f56005e;
            if (view == null) {
                C89219l.m154715b();
            }
            return view.findViewById(R.id.cpe);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$m */
    static final class C64443m extends AbstractC89220m implements AbstractC89171a<ViewStub> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146089a;

        static {
            Covode.recordClassIndex(75904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64443m(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(0);
            this.f146089a = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewStub invoke() {
            View view = this.f146089a.f56005e;
            if (view == null) {
                C89219l.m154715b();
            }
            return view.findViewById(R.id.ct9);
        }
    }

    static {
        Covode.recordClassIndex(75874);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final NoticeView mo60928k() {
        View view = this.f56005e;
        if (view == null) {
            C89219l.m154715b();
        }
        return (NoticeView) view.findViewById(R.id.ffg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final NoticeButtonView mo104043l() {
        View view = this.f56005e;
        if (view == null) {
            C89219l.m154715b();
        }
        return (NoticeButtonView) view.findViewById(R.id.ffx);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final NoticeButtonView mo104044m() {
        View view = this.f56005e;
        if (view == null) {
            C89219l.m154715b();
        }
        return (NoticeButtonView) view.findViewById(R.id.feo);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$a */
    public static final class C64414a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ Widget f146041a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f146042b;

        static {
            Covode.recordClassIndex(75875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64414a(Widget widget, AbstractC89277c cVar) {
            super(0);
            this.f146041a = widget;
            this.f146042b = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return this.f146041a.getClass().getName() + '_' + C89170a.m154665a(this.f146042b).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ag */
    static final class RunnableC64421ag implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146053a;

        /* renamed from: b */
        final /* synthetic */ View f146054b;

        static {
            Covode.recordClassIndex(75882);
        }

        RunnableC64421ag(BaseMyProfileGuideWidget baseMyProfileGuideWidget, View view) {
            this.f146053a = baseMyProfileGuideWidget;
            this.f146054b = view;
        }

        public final void run() {
            ObjectAnimator duration;
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = this.f146053a;
            View view = this.f146054b;
            C89219l.m154716b(C33403c.C33406b.f79409a, "");
            baseMyProfileGuideWidget.f146035l = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -((float) C33403c.m68502a()));
            ObjectAnimator objectAnimator = this.f146053a.f146035l;
            if (objectAnimator != null && (duration = objectAnimator.setDuration(200L)) != null) {
                duration.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ah */
    public static final class C64422ah implements NoticeButtonView.AbstractC64330b {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146055a;

        /* renamed from: b */
        final /* synthetic */ NoticeButtonView f146056b;

        static {
            Covode.recordClassIndex(75883);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: b */
        public final void mo103847b() {
            this.f146056b.setVisibility(8);
            C63504c.m115069a().mo102138b(true);
            C39162r.m79460a("banner_click", new C33744d().mo59983a("banner_type", "coupon_fission").mo59983a("banner_name", "tiktok_rewards").mo59983a("enter_from", "personal_homepage").mo59983a("click_position", "cross").f79943a);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: c */
        public final void mo103848c() {
            new StringBuilder("onTextClick").append(this.f146056b.getTitleTextView().getText()).append("  ").append(this.f146056b.getContextTextView().getText());
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: a */
        public final void mo103846a() {
            UgProfileActivityButton profileActivityButton;
            this.f146056b.setVisibility(8);
            C63504c.m115069a().mo102138b(true);
            C39162r.m79460a("banner_click", new C33744d().mo59983a("banner_type", "coupon_fission").mo59983a("banner_name", "tiktok_rewards").mo59983a("enter_from", "personal_homepage").mo59983a("click_position", "join").f79943a);
            SmartRoute buildRoute = SmartRouter.buildRoute(C20624b.m38846b(this.f146055a), "//webview");
            String str = null;
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                if (!(awemeActivitySetting == null || (profileActivityButton = awemeActivitySetting.getProfileActivityButton()) == null)) {
                    str = profileActivityButton.getH5Link();
                }
            } catch (C16041a unused) {
            }
            buildRoute.withParam("url", str).withParam("hide_nav_bar", true).addFlags(268435456).open();
        }

        C64422ah(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeButtonView noticeButtonView) {
            this.f146055a = baseMyProfileGuideWidget;
            this.f146056b = noticeButtonView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$w */
    public static final class C64464w implements NoticeButtonView.AbstractC64330b {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146112a;

        /* renamed from: b */
        final /* synthetic */ NoticeButtonView f146113b;

        /* renamed from: c */
        final /* synthetic */ C37484b f146114c;

        /* renamed from: d */
        final /* synthetic */ User f146115d;

        static {
            Covode.recordClassIndex(75925);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: b */
        public final void mo103847b() {
            this.f146113b.setVisibility(8);
            C39162r.m79460a("ttelite_BA_acq_profile_msg_x_click", new C33744d().mo59983a("message_id", this.f146114c.getMessageId()).mo59983a("user_id", this.f146115d.getUid()).f79943a);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: c */
        public final void mo103848c() {
            this.f146113b.setVisibility(8);
            SmartRouter.buildRoute(C20624b.m38846b(this.f146112a), this.f146114c.getLandingPageSchema()).addFlags(268435456).open();
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.NoticeButtonView.AbstractC64330b
        /* renamed from: a */
        public final void mo103846a() {
            this.f146113b.setVisibility(8);
            C39162r.m79460a("ttelite_BA_acq_profile_msg_cta_click", new C33744d().mo59983a("message_id", this.f146114c.getMessageId()).mo59983a("user_id", this.f146115d.getUid()).mo59983a("cta_url", this.f146114c.getLandingPageSchema()).f79943a);
            SmartRouter.buildRoute(C20624b.m38846b(this.f146112a), this.f146114c.getLandingPageSchema()).addFlags(268435456).open();
        }

        C64464w(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeButtonView noticeButtonView, C37484b bVar, User user) {
            this.f146112a = baseMyProfileGuideWidget;
            this.f146113b = noticeButtonView;
            this.f146114c = bVar;
            this.f146115d = user;
        }
    }

    /* renamed from: u */
    private final void m116318u() {
        MethodCollector.m26663i(7288);
        if (this.f146031h != null) {
            MethodCollector.m26664o(7288);
            return;
        }
        View inflate = m116316s().inflate();
        this.f146031h = inflate;
        if (inflate != null) {
            inflate.setVisibility(0);
            MethodCollector.m26664o(7288);
            return;
        }
        MethodCollector.m26664o(7288);
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: i */
    public void mo39087i() {
        super.mo39087i();
        C63883d.m115581a().f144817b = null;
        EventBus.m156962a().mo145395b(this);
        Activity q = mo104064q();
        Objects.requireNonNull(q, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        TabChangeManager a = TabChangeManager.C59002a.m108439a((ActivityC0945e) q);
        if (a.f134311c.contains(this)) {
            a.f134311c.remove(this);
        }
        this.f146038o.dispose();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ae */
    public static final class C64419ae implements NoticeView.AbstractC42575a {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146049a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f146050b;

        static {
            Covode.recordClassIndex(75880);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: a */
        public final void mo72753a() {
            this.f146050b.setVisibility(8);
            SmartRouter.buildRoute(C20624b.m38846b(this.f146049a), "//webview").withParam("url", "https://www.tiktok.com/aweme/inapp/v2/c_feedback").withParam("hide_nav_bar", true).open();
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33594aj<Long> s = sVar.mo60075s();
            C89219l.m154716b(s, "");
            s.mo59940b(Long.valueOf(System.currentTimeMillis()));
            C33842s sVar2 = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar2, "");
            C33594aj<Long> t = sVar2.mo60076t();
            C89219l.m154716b(t, "");
            Long c = t.mo59941c();
            if (c != null && c.longValue() == 0) {
                C33842s sVar3 = C33842s.C33843a.f80132a;
                C89219l.m154716b(sVar3, "");
                C33594aj<Long> t2 = sVar3.mo60076t();
                C89219l.m154716b(t2, "");
                t2.mo59940b(Long.valueOf(System.currentTimeMillis()));
            }
            BaseMyProfileGuideWidget.m116302a(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: b */
        public final void mo72754b() {
            this.f146050b.setVisibility(8);
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33594aj<Long> s = sVar.mo60075s();
            C89219l.m154716b(s, "");
            s.mo59940b(Long.valueOf(System.currentTimeMillis()));
            C33842s sVar2 = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar2, "");
            C33594aj<Long> t = sVar2.mo60076t();
            C89219l.m154716b(t, "");
            Long c = t.mo59941c();
            if (c != null && c.longValue() == 0) {
                C33842s sVar3 = C33842s.C33843a.f80132a;
                C89219l.m154716b(sVar3, "");
                C33594aj<Long> t2 = sVar3.mo60076t();
                C89219l.m154716b(t2, "");
                t2.mo59940b(Long.valueOf(System.currentTimeMillis()));
            }
            BaseMyProfileGuideWidget.m116302a(false);
        }

        C64419ae(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeView noticeView) {
            this.f146049a = baseMyProfileGuideWidget;
            this.f146050b = noticeView;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ai */
    public static final class RunnableC64423ai implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146057a;

        /* renamed from: b */
        final /* synthetic */ View f146058b;

        static {
            Covode.recordClassIndex(75884);
        }

        RunnableC64423ai(BaseMyProfileGuideWidget baseMyProfileGuideWidget, View view) {
            this.f146057a = baseMyProfileGuideWidget;
            this.f146058b = view;
        }

        public final void run() {
            this.f146057a.f146037n = new AnimatorSet();
            View view = this.f146057a.f146036m;
            if (view == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(C33403c.C33406b.f79409a, "");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) C33403c.m68502a(), 0.0f);
            View view2 = this.f146057a.f146036m;
            if (view2 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet = this.f146057a.f146037n;
            if (animatorSet != null) {
                animatorSet.playTogether(ofFloat2, ofFloat);
            }
            AnimatorSet animatorSet2 = this.f146057a.f146037n;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(200L);
            }
            AnimatorSet animatorSet3 = this.f146057a.f146037n;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            this.f146058b.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$c */
    public static final class C64431c extends AbstractC89220m implements AbstractC89171a<MyProfileGuideViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f146072a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f146073b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f146074c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f146075d;

        static {
            Covode.recordClassIndex(75892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64431c(Widget widget, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89172b bVar) {
            super(0);
            this.f146072a = widget;
            this.f146073b = aVar;
            this.f146074c = cVar;
            this.f146075d = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.widget.Widget r0 = r3.f146072a
                com.bytedance.widget.b r0 = r0.mo39088j()
                java.lang.Object r1 = r0.mo39098b()
                boolean r0 = r1 instanceof androidx.fragment.app.Fragment
                if (r0 == 0) goto L_0x0048
                androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                com.bytedance.widget.Widget r0 = r3.f146072a
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
            L_0x001c:
                h.f.a.a r0 = r3.f146073b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f146074c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m116348xf9743dec(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel> r0 = com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0042
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0042:
                h.f.a.b r0 = r3.f146075d
                r2.mo33686a_(r0)
                return r2
            L_0x0048:
                boolean r0 = r1 instanceof androidx.fragment.app.ActivityC0945e
                if (r0 == 0) goto L_0x005b
                androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                com.bytedance.widget.Widget r0 = r3.f146072a
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                goto L_0x001c
            L_0x005b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.C64431c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_profile_widgets_BaseMyProfileGuideWidget$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m116348xf9743dec(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: t */
    private final void m116317t() {
        MethodCollector.m26663i(7147);
        Activity q = mo104064q();
        m116318u();
        View view = this.f146031h;
        if (view == null) {
            MethodCollector.m26664o(7147);
            return;
        }
        view.setLayerType(2, null);
        Animation loadAnimation = AnimationUtils.loadAnimation(q, R.anim.d6);
        C89219l.m154716b(loadAnimation, "");
        loadAnimation.setRepeatMode(2);
        loadAnimation.setRepeatCount(-1);
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC64429ao(this));
        View view2 = this.f146031h;
        if (view2 != null) {
            view2.startAnimation(loadAnimation);
            MethodCollector.m26664o(7147);
            return;
        }
        MethodCollector.m26664o(7147);
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: g */
    public final void mo39085g() {
        Animation animation;
        Animation animation2;
        super.mo39085g();
        View view = this.f146031h;
        if (!(view == null || (animation2 = view.getAnimation()) == null)) {
            animation2.cancel();
            animation2.reset();
        }
        int i = Build.VERSION.SDK_INT;
        ObjectAnimator objectAnimator = this.f146035l;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.pause();
        }
        View view2 = this.f146036m;
        if (!(view2 == null || (animation = view2.getAnimation()) == null)) {
            animation.cancel();
            animation.reset();
        }
        int i2 = Build.VERSION.SDK_INT;
        AnimatorSet animatorSet = this.f146037n;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
    }

    /* renamed from: o */
    public final void mo104046o() {
        NoticeButtonView l;
        NoticeButtonView l2;
        C63504c a = C63504c.m115069a();
        C89219l.m154716b(a, "");
        a.mo102140c();
        NoticeButtonView l3 = mo104043l();
        if (l3 != null && l3.getVisibility() == 0) {
            C63504c a2 = C63504c.m115069a();
            C89219l.m154716b(a2, "");
            if (a2.mo102142e() && (l2 = mo104043l()) != null) {
                l2.setVisibility(8);
            }
            C63504c.m115069a().mo102141d();
            C63504c a3 = C63504c.m115069a();
            C89219l.m154716b(a3, "");
            a3.mo102140c();
            C63504c a4 = C63504c.m115069a();
            C89219l.m154716b(a4, "");
            if (a4.mo102142e() && (l = mo104043l()) != null) {
                l.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo104049p() {
        int i;
        AbstractView$OnClickListenerC63887g gVar = this.f146032i;
        if (gVar != null && gVar.f144834n) {
            AbstractView$OnClickListenerC63887g gVar2 = this.f146032i;
            if (gVar2 == null) {
                C89219l.m154715b();
            }
            gVar2.mo103426b();
            C63883d.m115581a();
            AbstractView$OnClickListenerC63887g gVar3 = this.f146032i;
            if (gVar3 == null) {
                C89219l.m154715b();
            }
            int i2 = 0;
            if (gVar3.f144832l != null) {
                i = gVar3.f144832l.f95416a;
            } else {
                i = 0;
            }
            AbstractView$OnClickListenerC63887g gVar4 = this.f146032i;
            if (gVar4 == null) {
                C89219l.m154715b();
            }
            if (gVar4.f144832l != null) {
                i2 = gVar4.f144832l.f95424i;
            }
            C63883d.m115582a(new C63881b(3, i, i2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$l */
    static final class RunnableC64442l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f146086a;

        /* renamed from: b */
        final /* synthetic */ C40760a f146087b;

        /* renamed from: c */
        final /* synthetic */ String f146088c;

        static {
            Covode.recordClassIndex(75903);
        }

        RunnableC64442l(int i, C40760a aVar, String str) {
            this.f146086a = i;
            this.f146087b = aVar;
            this.f146088c = str;
        }

        public final void run() {
            String str;
            String str2;
            int i = this.f146086a;
            if (i == 3) {
                C33744d a = new C33744d().mo59983a("pop_survey_id", String.valueOf(this.f146087b.f95416a));
                if (!TextUtils.isEmpty(this.f146087b.f95423h)) {
                    str2 = this.f146087b.f95423h;
                } else {
                    str2 = this.f146087b.f95418c;
                }
                C39162r.m79460a("pop_survey_close", a.mo59983a("pop_survey_question", str2).mo59980a("original_id", this.f146087b.f95424i).f79943a);
            } else if (i == 1 || i == 2) {
                C33744d a2 = new C33744d().mo59983a("pop_survey_id", String.valueOf(this.f146087b.f95416a));
                if (!TextUtils.isEmpty(this.f146087b.f95423h)) {
                    str = this.f146087b.f95423h;
                } else {
                    str = this.f146087b.f95418c;
                }
                C39162r.m79460a("pop_survey_answer", a2.mo59983a("pop_survey_question", str).mo59980a("original_id", this.f146087b.f95424i).mo59983a("pop_survey_answer", this.f146088c).f79943a);
            }
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: f */
    public final void mo39084f() {
        View view;
        Animation animation;
        View view2;
        super.mo39084f();
        View view3 = this.f146031h;
        Object obj = null;
        if (view3 != null && view3.getVisibility() == 0) {
            m116317t();
        }
        int i = Build.VERSION.SDK_INT;
        ObjectAnimator objectAnimator = this.f146035l;
        if (objectAnimator != null && (view2 = this.f146034k) != null && view2.getVisibility() == 0 && objectAnimator.isPaused()) {
            objectAnimator.resume();
        }
        View view4 = this.f146036m;
        if (!(view4 == null || view4.getVisibility() != 0 || (animation = view4.getAnimation()) == null)) {
            animation.start();
        }
        int i2 = Build.VERSION.SDK_INT;
        AnimatorSet animatorSet = this.f146037n;
        if (animatorSet != null && (view = this.f146036m) != null && view.getVisibility() == 0 && animatorSet.isPaused()) {
            animatorSet.resume();
        }
        mo104046o();
        NoticeView k = mo60928k();
        if (k != null && k.getVisibility() == 0) {
            NoticeView k2 = mo60928k();
            if (k2 != null) {
                obj = k2.getTag();
            }
            if (C89219l.m154714a(obj, (Object) "tag_guide_private_account")) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                if (curUser.isSecret() || curUser.getAccountType() == 3) {
                    NoticeView k3 = mo60928k();
                    if (k3 != null) {
                        k3.setVisibility(8);
                    }
                    NoticeView k4 = mo60928k();
                    if (k4 != null) {
                        k4.setTag("");
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.ProfileWidget, com.bytedance.widget.Widget
    /* renamed from: c */
    public void mo39080c() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super.mo39080c();
        EventBus.m156966a(EventBus.m156962a(), this);
        Activity q = mo104064q();
        Objects.requireNonNull(q, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        TabChangeManager.C59002a.m108439a((ActivityC0945e) q).mo96531a(this);
        AbstractC88412b unused = selectSubscribe(mo104065r(), C64484a.f146143a, C64667e.f146391a, C64684f.f146416a, C64769g.f146532a, new C20370ah(), new C64453r(this));
        AbstractC88412b unused2 = selectSubscribe(mo104065r(), C64869h.f146657a, new C20370ah(), new C64458s(this));
        AbstractC88412b unused3 = selectSubscribe(mo104065r(), C64872i.f146671a, new C20370ah(), new C64460t(this));
        AbstractC88412b unused4 = selectSubscribe(mo104065r(), C64512b.f146179a, new C20370ah(), new C64444n(this));
        AbstractC88412b unused5 = selectSubscribe(mo104065r(), C64554c.f146254a, new C20370ah(), new C64446o(this));
        AbstractC88412b unused6 = selectSubscribe(mo104065r(), C64648d.f146361a, new C20370ah(), new C64448p(this));
        AbstractC88412b unused7 = subscribe(mo104045n(), new C20370ah(), new C64449q(this));
        if (C39223a.m79601o().mo68703a()) {
            mo104045n().mo75829g(C64435g.f146078a);
        } else {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isChildrenMode()) {
                mo104045n().mo75829g(C64436h.f146079a);
            } else {
                C63883d.m115581a().f144817b = new C65084q(mo104045n());
                C63883d a = C63883d.m115581a();
                C1731i<C40760a> a2 = SurveyApi.m115576a();
                if (a2 != null) {
                    a2.mo5532a(new C63885e(a));
                }
            }
        }
        C63873h.f144797a.needShowDiskManagerGuideView().mo143062b(new C64438j(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        C1731i.m5640b(CallableC64433e.f146076a, C1731i.f5562a).mo5534a(new C64434f(this), C1731i.f5564c, null);
        MyProfileGuideViewModel n = mo104045n();
        C89219l.m154721d(n, "");
        C63416ac.f143968b = new WeakReference<>(n);
        NoticeView k = mo60928k();
        if (k != null) {
            layoutParams = k.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams2 != null) {
            C89219l.m154716b(C33403c.C33406b.f79409a, "");
            marginLayoutParams2.bottomMargin = C33403c.m68502a();
        }
        NoticeButtonView l = mo104043l();
        if (l != null) {
            layoutParams2 = l.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
        if (marginLayoutParams3 != null) {
            C89219l.m154716b(C33403c.C33406b.f79409a, "");
            marginLayoutParams3.bottomMargin = C33403c.m68502a();
        }
        NoticeView k2 = mo60928k();
        if (k2 != null) {
            k2.setNoticeBackgroundColor(C0643b.m2378c(mo104064q(), R.color.c9));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$q */
    public static final class C64449q extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, MyProfileGuideState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146095a;

        static {
            Covode.recordClassIndex(75910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64449q(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.f146095a = baseMyProfileGuideWidget;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$q$b */
        static final /* synthetic */ class C64452b extends C89217j implements AbstractC89172b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C64452b f146098a = new C64452b();

            static {
                Covode.recordClassIndex(75913);
            }

            C64452b() {
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

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$q$a */
        static final class C64451a extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            public static final C64451a f146097a = new C64451a();

            static {
                Covode.recordClassIndex(75912);
            }

            C64451a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                C89219l.m154721d(myProfileGuideState2, "");
                return MyProfileGuideState.copy$default(myProfileGuideState2, true, false, false, false, null, null, null, false, false, false, null, null, null, null, 16382, null);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, MyProfileGuideState myProfileGuideState) {
            AbstractC20477i iVar2 = iVar;
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(myProfileGuideState2, "");
            if (!((MyProfileGuideState) iVar2.withState(this.f146095a.mo104045n(), C644501.f146096a)).getHasGuideShowed()) {
                myProfileGuideState2.getCurrentDownloadSetting();
                myProfileGuideState2.getPostListHasLoaded();
                myProfileGuideState2.getAvatarHasLoaded();
                myProfileGuideState2.getHasSurveyDetermined();
                myProfileGuideState2.getNeedShowDiskManagerGuide();
                C89386u<Boolean, Boolean, AbstractC89171a<C89391z>>[] a = this.f146095a.mo104040a((ProfileState) iVar2.withState(this.f146095a.mo104065r(), C64452b.f146098a), myProfileGuideState2);
                int length = a.length;
                int i = 0;
                boolean z = true;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C89386u<Boolean, Boolean, AbstractC89171a<C89391z>> uVar = a[i];
                    if (z) {
                        if (uVar.getFirst().booleanValue() && uVar.getSecond().booleanValue()) {
                            AbstractC89171a<C89391z> third = uVar.getThird();
                            if (third != null) {
                                this.f146095a.mo104045n().mo75829g(C64451a.f146097a);
                                third.invoke();
                            }
                        } else if (uVar.getFirst().booleanValue()) {
                            z = true;
                            i++;
                        }
                    }
                    z = false;
                    i++;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$an */
    static final /* synthetic */ class C64428an extends C89217j implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C64428an f146070a = new C64428an();

        static {
            Covode.recordClassIndex(75889);
        }

        C64428an() {
            super(1, C63506d.class, "identity", "identity(Ljava/lang/Object;)Ljava/lang/Object;", 1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(myProfileGuideState2, "");
            return myProfileGuideState2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ao  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC64429ao implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146071a;

        static {
            Covode.recordClassIndex(75890);
        }

        public final void onAnimationRepeat(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        animationAnimation$AnimationListenerC64429ao(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            this.f146071a = baseMyProfileGuideWidget;
        }

        public final void onAnimationEnd(Animation animation) {
            C89219l.m154721d(animation, "");
            View view = this.f146071a.f146031h;
            if (view != null) {
                view.setLayerType(0, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$j */
    public static final class C64438j implements AbstractC88986z<Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146081a;

        static {
            Covode.recordClassIndex(75899);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64438j(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            this.f146081a = baseMyProfileGuideWidget;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f146081a.mo104045n().mo75829g(C64439a.f146082a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Boolean bool) {
            this.f146081a.mo104045n().mo75829g(new C64440b(bool.booleanValue()));
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$j$a */
        static final class C64439a extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            public static final C64439a f146082a = new C64439a();

            static {
                Covode.recordClassIndex(75900);
            }

            C64439a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                C89219l.m154721d(myProfileGuideState2, "");
                return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, false, null, false, false, false, null, null, null, null, 16351, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$j$b */
        static final class C64440b extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            final /* synthetic */ boolean f146083a;

            static {
                Covode.recordClassIndex(75901);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C64440b(boolean z) {
                super(1);
                this.f146083a = z;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                C89219l.m154721d(myProfileGuideState2, "");
                return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, Boolean.valueOf(this.f146083a), null, false, false, false, null, null, null, null, 16351, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104037a(View view) {
        this.f146036m = view;
        if (view != null) {
            view.post(new RunnableC64423ai(this, view));
        }
    }

    @AbstractC90264r
    public final void onI18nRecommendUserDialogDissmissEvent(C63496c cVar) {
        C89219l.m154721d(cVar, "");
        mo104045n().mo75829g(C64462u.f146108a);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$aa */
    public static final class C64415aa extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146043a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f146044b;

        /* renamed from: c */
        final /* synthetic */ MyProfileGuideState f146045c;

        static {
            Covode.recordClassIndex(75876);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(C20624b.m38846b(this.f146043a), R.color.bh));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f146044b.setVisibility(8);
            C63873h hVar = C63873h.f144797a;
            ActivityC0945e b = C20624b.m38846b(this.f146043a);
            Integer currentDownloadSetting = this.f146045c.getCurrentDownloadSetting();
            if (currentDownloadSetting == null) {
                C89219l.m154715b();
            }
            hVar.startDownloadControlSettingActivity(b, currentDownloadSetting.intValue());
        }

        C64415aa(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeView noticeView, MyProfileGuideState myProfileGuideState) {
            this.f146043a = baseMyProfileGuideWidget;
            this.f146044b = noticeView;
            this.f146045c = myProfileGuideState;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$ad */
    public static final class C64418ad<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64418ad f146048a = new C64418ad();

        static {
            Covode.recordClassIndex(75879);
        }

        C64418ad() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (!(th instanceof Exception)) {
                th = null;
            }
            Exception exc = (Exception) th;
            if (exc != null) {
                C51423a.m95788a("", exc);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$aj */
    public static final class C64424aj extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146059a;

        /* renamed from: b */
        final /* synthetic */ String f146060b;

        /* renamed from: c */
        final /* synthetic */ NoticeView f146061c;

        /* renamed from: d */
        final /* synthetic */ String f146062d;

        static {
            Covode.recordClassIndex(75885);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(C20624b.m38846b(this.f146059a), R.color.bh));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C65083p.m116809a();
            this.f146061c.setVisibility(8);
            SmartRouter.buildRoute(C20624b.m38846b(this.f146059a), "//privacy/setting").withParam("highlight_private_account_item", true).open();
            C64314y.m116187c("enter");
        }

        C64424aj(BaseMyProfileGuideWidget baseMyProfileGuideWidget, String str, NoticeView noticeView, String str2) {
            this.f146059a = baseMyProfileGuideWidget;
            this.f146060b = str;
            this.f146061c = noticeView;
            this.f146062d = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$al */
    static final class C64426al extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C64426al f146067a = new C64426al();

        static {
            Covode.recordClassIndex(75887);
        }

        C64426al() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, true, false, null, null, null, null, 16127, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$g */
    public static final class C64435g extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C64435g f146078a = new C64435g();

        static {
            Covode.recordClassIndex(75896);
        }

        C64435g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, true, null, null, null, false, false, false, null, null, null, null, 16359, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$h */
    public static final class C64436h extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C64436h f146079a = new C64436h();

        static {
            Covode.recordClassIndex(75897);
        }

        C64436h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, true, null, null, null, false, false, false, null, null, null, null, 16359, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$u */
    static final class C64462u extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C64462u f146108a = new C64462u();

        static {
            Covode.recordClassIndex(75923);
        }

        C64462u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, null, null, null, null, 15871, null);
        }
    }

    /* renamed from: d */
    protected static boolean m116312d(ProfileState profileState) {
        C89219l.m154721d(profileState, "");
        if (!C89219l.m154714a((Object) profileState.isPostGuideShow(), (Object) false) || !m116313e(profileState)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    protected static boolean m116314f(ProfileState profileState) {
        C89219l.m154721d(profileState, "");
        if (!C89219l.m154714a((Object) profileState.getFrom(), (Object) "from_main") || !C39223a.m79589c().mo68605a()) {
            return false;
        }
        return true;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onProfilePageScrolledEvent(C64486b bVar) {
        C89219l.m154721d(bVar, "");
        NoticeButtonView m = mo104044m();
        if (m != null) {
            m.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$af */
    static final class View$OnClickListenerC64420af implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146051a;

        /* renamed from: b */
        final /* synthetic */ View f146052b;

        static {
            Covode.recordClassIndex(75881);
        }

        View$OnClickListenerC64420af(BaseMyProfileGuideWidget baseMyProfileGuideWidget, View view) {
            this.f146051a = baseMyProfileGuideWidget;
            this.f146052b = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                View view2 = this.f146052b;
                C89219l.m154716b(view2, "");
                view2.setVisibility(8);
                C39223a.m79589c().mo68601a((Context) C20624b.m38846b(this.f146051a));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$f */
    public static final class C64434f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146077a;

        static {
            Covode.recordClassIndex(75895);
        }

        C64434f(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            this.f146077a = baseMyProfileGuideWidget;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                Integer num = (Integer) iVar.mo5545d();
                if (num != null && num.intValue() == 1) {
                    new C79459a(C20624b.m38846b(this.f146077a)).mo123050a(R.string.ew1).mo123053a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$v */
    static final class View$OnClickListenerC64463v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146109a;

        /* renamed from: b */
        final /* synthetic */ NoticeButtonView f146110b;

        /* renamed from: c */
        final /* synthetic */ C37484b f146111c;

        static {
            Covode.recordClassIndex(75924);
        }

        View$OnClickListenerC64463v(BaseMyProfileGuideWidget baseMyProfileGuideWidget, NoticeButtonView noticeButtonView, C37484b bVar) {
            this.f146109a = baseMyProfileGuideWidget;
            this.f146110b = noticeButtonView;
            this.f146111c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f146110b.setVisibility(8);
            SmartRouter.buildRoute(C20624b.m38846b(this.f146109a), this.f146111c.getLandingPageSchema()).addFlags(268435456).open();
        }
    }

    /* renamed from: a */
    public static void m116302a(boolean z) {
        Keva repo = Keva.getRepo("account_security_keva_name");
        C89219l.m154721d("prior_to_safe_info", "");
        StringBuilder append = new StringBuilder().append("prior_to_safe_info").append('_');
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        repo.storeBoolean(append.append(g.getCurUserId()).toString(), z);
        AbstractC81915c.m141874a(new C63424aj(z));
    }

    /* renamed from: b */
    private static boolean m116306b(int i) {
        boolean z;
        boolean z2;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        if (i < 1000) {
            z = true;
        } else {
            z = false;
        }
        C89219l.m154716b(curUser, "");
        if (curUser.getAccountType() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || curUser.isSecret() || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    protected static boolean m116315g(ProfileState profileState) {
        int i;
        C89219l.m154721d(profileState, "");
        try {
            i = SettingsManager.m29616a().mo25394a("download_setting_enable", 0);
        } catch (C16041a unused) {
            i = 0;
        }
        if (!C89219l.m154714a((Object) profileState.getFrom(), (Object) "from_main") || !C89219l.m154714a((Object) profileState.isPostAwemeEmpty(), (Object) false) || profileState.getCurrentDownloadSetting() == null || C80580in.m139687c() || i != 1) {
            return false;
        }
        return true;
    }

    public BaseMyProfileGuideWidget(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f56005e = viewGroup;
        AbstractC89277c a = C89204ab.m154669a(MyProfileGuideViewModel.class);
        C64414a aVar = new C64414a(this, a);
        this.f146040s = new WidgetLifecycleAwareLazy(this, aVar, new C64431c(this, aVar, a, C64430b.INSTANCE));
        this.f146038o = new C88411a();
    }

    /* renamed from: b */
    private static boolean m116307b(MyProfileGuideState myProfileGuideState) {
        List<Aweme> d;
        List<Aweme> firstRefreshPublishAwemeList = myProfileGuideState.getFirstRefreshPublishAwemeList();
        if (!(firstRefreshPublishAwemeList == null || (d = C89070n.m154571d((Iterable) firstRefreshPublishAwemeList, 10)) == null || ((d instanceof Collection) && d.isEmpty()))) {
            for (Aweme aweme : d) {
                AwemeStatus status = aweme.getStatus();
                if (status != null && status.getPrivateStatus() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    protected static boolean m116310c(ProfileState profileState) {
        UgProfileActivityButton profileActivityButton;
        String h5Link;
        C89219l.m154721d(profileState, "");
        if (C89219l.m154714a((Object) profileState.getFrom(), (Object) "from_main")) {
            Boolean bool = C63493b.f144111a;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue() && !C80580in.m139687c()) {
                C63504c a = C63504c.m115069a();
                C89219l.m154716b(a, "");
                if (!a.mo102142e()) {
                    C63504c a2 = C63504c.m115069a();
                    if (a2.f144127b.contains("show_bubble") && !a2.f144127b.getBoolean("show_bar", false)) {
                        try {
                            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                            C89219l.m154716b(iESSettingsProxy, "");
                            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                            if (awemeActivitySetting == null || (profileActivityButton = awemeActivitySetting.getProfileActivityButton()) == null || (h5Link = profileActivityButton.getH5Link()) == null || h5Link.length() == 0) {
                                return false;
                            }
                            return true;
                        } catch (C16041a unused) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r0.getAwemeCount() == 0) goto L_0x004b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static boolean m116313e(com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileState r4) {
        /*
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r3)
            boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80580in.m139687c()
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = r4.getFrom()
            java.lang.String r0 = "from_main"
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            if (r0 == 0) goto L_0x005c
            java.lang.Boolean r1 = r4.isPostAwemeEmpty()
            r2 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            if (r0 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0039
            int r0 = r0.getAwemeCount()
            if (r0 == 0) goto L_0x004b
        L_0x0039:
            boolean r0 = com.p2082ss.android.ugc.aweme.profile.experiment.C63753j.f144516a
            if (r0 == 0) goto L_0x005c
            java.lang.Boolean r1 = r4.isPostAwemeEmptyWhenPrivateShow()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            if (r0 == 0) goto L_0x005c
        L_0x004b:
            boolean r0 = com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o.m115355e()
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService r0 = com.p2082ss.android.ugc.aweme.compliance.api.C39223a.m79589c()
            boolean r0 = r0.mo68606a(r2)
            if (r0 != 0) goto L_0x005c
            return r2
        L_0x005c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.m116313e(com.ss.android.ugc.aweme.profile.viewmodel.ProfileState):boolean");
    }

    /* renamed from: a */
    protected static boolean m116305a(ProfileState profileState) {
        C89219l.m154721d(profileState, "");
        if ((!C89219l.m154714a((Object) profileState.getFrom(), (Object) "from_main")) || !C80580in.m139687c()) {
            return false;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        if (curUser.getUserPeriod() != 1) {
            return false;
        }
        C33842s sVar = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar, "");
        C33594aj<Long> t = sVar.mo60076t();
        C89219l.m154716b(t, "");
        Long c = t.mo59941c();
        if (c == null || c.longValue() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C89219l.m154716b(c, "");
            if (currentTimeMillis - c.longValue() > TimeUnit.DAYS.toMillis(30)) {
                return false;
            }
        }
        C33842s sVar2 = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar2, "");
        C33594aj<Long> s = sVar2.mo60075s();
        C89219l.m154716b(s, "");
        Long c2 = s.mo59941c();
        long currentTimeMillis2 = System.currentTimeMillis();
        C89219l.m154716b(c2, "");
        if (currentTimeMillis2 - c2.longValue() > TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    protected static boolean m116308b(ProfileState profileState) {
        C89219l.m154721d(profileState, "");
        if (!C89219l.m154714a((Object) profileState.getFrom(), (Object) "from_main")) {
            return false;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            return false;
        }
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        User curUser = g2.getCurUser();
        C89219l.m154716b(curUser, "");
        if (!curUser.isSecret()) {
            return false;
        }
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<Boolean> shouldShowPrivateAccountTipInProfile = inst.getShouldShowPrivateAccountTipInProfile();
        C89219l.m154716b(shouldShowPrivateAccountTipInProfile, "");
        Boolean c = shouldShowPrivateAccountTipInProfile.mo59941c();
        C89219l.m154716b(c, "");
        if (c.booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo104042c(NoticeView noticeView) {
        C89219l.m154721d(noticeView, "");
        String string = mo104064q().getString(R.string.gwz);
        C89219l.m154716b(string, "");
        String string2 = mo104064q().getString(R.string.c4j);
        C89219l.m154716b(string2, "");
        String str = string + ' ' + string2;
        noticeView.setIconImage(R.raw.icon_private_account);
        SpannableString spannableString = new SpannableString(str);
        C64424aj ajVar = new C64424aj(this, str, noticeView, string2);
        int a = C89361p.m154888a((CharSequence) str, string2, 0, false, 6);
        if (a < 0) {
            a = str.length();
        }
        spannableString.setSpan(ajVar, a, str.length(), 17);
        noticeView.setTitleText(spannableString);
        TextView textView = (TextView) noticeView.findViewById(R.id.f63);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View findViewById = noticeView.findViewById(R.id.eja);
        if (findViewById != null) {
            findViewById.setClickable(false);
        }
        noticeView.setOnInternalClickListener(new C64425ak(this, str, noticeView, string2));
        noticeView.setTag("tag_guide_private_account");
        mo104037a((View) noticeView);
        C65083p.f146933a.storeInt(C65083p.m116810b() + "-guide_showed_times", C65083p.f146933a.getInt(C65083p.m116810b() + "-guide_showed_times", 0) + 1);
        C65083p.f146933a.storeLong(C65083p.m116810b() + "-guide_last_showed_time_stamp", System.currentTimeMillis());
        C39162r.m79460a("show_private_guide_pop_up", new C33744d().mo59983a("enter_from", "personal_homepage").f79943a);
    }

    /* renamed from: a */
    protected static boolean m116303a(MyProfileGuideState myProfileGuideState) {
        int i;
        boolean z;
        boolean z2;
        List<Aweme> firstRefreshPrivateAwemeList;
        Aweme aweme;
        C89219l.m154721d(myProfileGuideState, "");
        if (!C65083p.f146933a.getBoolean(C65083p.m116810b() + "-guide_disabled", false)) {
            if (System.currentTimeMillis() - C65083p.f146933a.getLong(C65083p.m116810b() + "-guide_last_showed_time_stamp", 0) >= 86400000 && C65083p.f146933a.getInt(C65083p.m116810b() + "-guide_showed_times", 0) < 5) {
                Integer followerCount = myProfileGuideState.getFollowerCount();
                if (followerCount != null) {
                    i = followerCount.intValue();
                } else {
                    i = 0;
                }
                if (((Boolean) C63737c.f144490a.getValue()).booleanValue()) {
                    Integer currentCommentSetting = myProfileGuideState.getCurrentCommentSetting();
                    if (currentCommentSetting != null && currentCommentSetting.intValue() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C63737c.m115267a() != 1) {
                        if (myProfileGuideState.getFirstRefreshPublishAwemeList() == null || myProfileGuideState.getFirstRefreshPublishAwemeList().isEmpty()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (C63737c.m115267a() == 2) {
                            if (!m116306b(i) || !z2) {
                                return false;
                            }
                            return true;
                        }
                    } else if (!m116306b(i) || (!m116307b(myProfileGuideState) && (((firstRefreshPrivateAwemeList = myProfileGuideState.getFirstRefreshPrivateAwemeList()) == null || (aweme = (Aweme) C89070n.m154583g((List) firstRefreshPrivateAwemeList)) == null || aweme.getCreateTime() * 1000 <= System.currentTimeMillis() - 604800000) && !z))) {
                        return false;
                    } else {
                        return true;
                    }
                }
                if (((Boolean) C63740d.f144496b.getValue()).booleanValue()) {
                    return m116306b(i);
                }
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo104036a(int i) {
        if (i == 0) {
            View view = this.f146031h;
            if (view == null || view.getVisibility() != 0) {
                m116318u();
                View view2 = this.f146031h;
                if (view2 != null) {
                    view2.setVisibility(i);
                    view2.setScaleX(0.8f);
                    view2.setScaleY(0.8f);
                    m116317t();
                    return;
                }
                return;
            }
            return;
        }
        View view3 = this.f146031h;
        if (view3 != null) {
            view3.setVisibility(i);
            View view4 = this.f146031h;
            if (view4 != null) {
                view4.clearAnimation();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo104041b(NoticeView noticeView) {
        C89219l.m154721d(noticeView, "");
        noticeView.setIconImage(2131233403);
        noticeView.setTitleText(R.string.fnj);
        String string = mo104064q().getString(R.string.fne);
        C89219l.m154716b(string, "");
        SpannableString spannableString = new SpannableString(new C89350l("(.)").replace(string, "⁠"));
        spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(mo104064q(), R.color.al)), 0, spannableString.length(), 18);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
        noticeView.setTitleText(new SpannableStringBuilder(mo104064q().getString(R.string.fnj)).append((CharSequence) spannableString));
        noticeView.setOnInternalClickListener(new C64467z(this, noticeView));
        noticeView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$n */
    public static final class C64444n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146090a;

        static {
            Covode.recordClassIndex(75905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64444n(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.f146090a = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Aweme> list) {
            final List<? extends Aweme> list2 = list;
            C89219l.m154721d(iVar, "");
            this.f146090a.mo104045n().mo75829g(new AbstractC89172b<MyProfileGuideState, MyProfileGuideState>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.C64444n.C644451 */

                static {
                    Covode.recordClassIndex(75906);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                    MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                    C89219l.m154721d(myProfileGuideState2, "");
                    return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, null, null, list2, null, 12287, null);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$o */
    public static final class C64446o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146092a;

        static {
            Covode.recordClassIndex(75907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64446o(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.f146092a = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Aweme> list) {
            final List<? extends Aweme> list2 = list;
            C89219l.m154721d(iVar, "");
            this.f146092a.mo104045n().mo75829g(new AbstractC89172b<MyProfileGuideState, MyProfileGuideState>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.C64446o.C644471 */

                static {
                    Covode.recordClassIndex(75908);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                    MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                    C89219l.m154721d(myProfileGuideState2, "");
                    return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, null, null, null, list2, 8191, null);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$p */
    public static final class C64448p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146094a;

        static {
            Covode.recordClassIndex(75909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64448p(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.f146094a = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f146094a.mo104049p();
            } else {
                this.f146094a.mo104046o();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$s */
    public static final class C64458s extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146104a;

        static {
            Covode.recordClassIndex(75919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64458s(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.f146104a = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            final Integer num2 = num;
            C89219l.m154721d(iVar, "");
            this.f146104a.mo104045n().mo75829g(new AbstractC89172b<MyProfileGuideState, MyProfileGuideState>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.C64458s.C644591 */

                static {
                    Covode.recordClassIndex(75920);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                    MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                    C89219l.m154721d(myProfileGuideState2, "");
                    return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, null, num2, null, null, 14335, null);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$t */
    public static final class C64460t extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, User, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146106a;

        static {
            Covode.recordClassIndex(75921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64460t(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(2);
            this.f146106a = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, User user) {
            final User user2 = user;
            C89219l.m154721d(iVar, "");
            this.f146106a.mo104045n().mo75829g(new AbstractC89172b<MyProfileGuideState, MyProfileGuideState>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.C64460t.C644611 */

                static {
                    Covode.recordClassIndex(75922);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                    int i;
                    MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                    C89219l.m154721d(myProfileGuideState2, "");
                    User user = user2;
                    if (user != null) {
                        i = user.getFollowerCount();
                    } else {
                        i = 0;
                    }
                    return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, false, false, Integer.valueOf(i), null, null, null, 15359, null);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    protected static boolean m116311c(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
        C89219l.m154721d(profileState, "");
        C89219l.m154721d(myProfileGuideState, "");
        if (!C89219l.m154714a((Object) profileState.getFrom(), (Object) "from_main") || !C63873h.f144797a.isEnableSettingDiskManager() || !C89219l.m154714a((Object) myProfileGuideState.getNeedShowDiskManagerGuide(), (Object) true)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    protected static boolean m116304a(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        C89219l.m154721d(myProfileGuideState, "");
        C89219l.m154721d(profileState, "");
        if (!myProfileGuideState.getNeedCheckI18nRecommendUserDialog() || !C89219l.m154714a((Object) profileState.getFrom(), (Object) "from_main") || !C63867b.f144793a.shouldShowI18nRecommendUserDialogOnMyPrifile()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    protected static boolean m116309b(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
        C89219l.m154721d(profileState, "");
        C89219l.m154721d(myProfileGuideState, "");
        if (!C89219l.m154714a((Object) profileState.getFrom(), (Object) "from_main") || C39223a.m79601o().mo68703a() || !AbstractView$OnClickListenerC63887g.m115585a(myProfileGuideState.getSurveyData())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo104039a(NoticeView noticeView, MyProfileGuideState myProfileGuideState) {
        C89219l.m154721d(noticeView, "");
        C89219l.m154721d(myProfileGuideState, "");
        String string = mo104064q().getString(R.string.erj);
        C89219l.m154716b(string, "");
        String string2 = mo104064q().getString(R.string.erk);
        C89219l.m154716b(string2, "");
        noticeView.setIconImage(2131233407);
        noticeView.setTitleText(R.string.erj);
        SpannableString spannableString = new SpannableString(string);
        C64415aa aaVar = new C64415aa(this, noticeView, myProfileGuideState);
        int a = C89361p.m154888a((CharSequence) string, string2, 0, false, 6);
        if (a < 0) {
            a = string.length();
        }
        spannableString.setSpan(aaVar, a, string.length(), 17);
        noticeView.setTitleText(spannableString);
        TextView textView = (TextView) noticeView.findViewById(R.id.f63);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View findViewById = noticeView.findViewById(R.id.eja);
        if (findViewById != null) {
            findViewById.setClickable(false);
        }
        noticeView.setOnInternalClickListener(new C64416ab(noticeView));
        C63873h.f144797a.setPrivateSettingItem("download_prompt", 1).mo142915a(C64417ac.f146047a, C64418ad.f146048a);
        mo104037a((View) noticeView);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g
    /* renamed from: a */
    public final void mo61348a(String str, String str2, boolean z, boolean z2) {
        NoticeView k;
        Object obj;
        if (C89219l.m154714a((Object) str2, (Object) "USER") && (k = mo60928k()) != null && k.getVisibility() == 0) {
            NoticeView k2 = mo60928k();
            if (k2 != null) {
                obj = k2.getTag();
            } else {
                obj = null;
            }
            if (C89219l.m154714a(obj, (Object) "tag_guide_private_account")) {
                NoticeView k3 = mo60928k();
                if (k3 != null) {
                    k3.setTag("");
                }
                NoticeView k4 = mo60928k();
                if (k4 != null) {
                    k4.setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget$r */
    public static final class C64453r extends AbstractC89220m implements AbstractC89189s<AbstractC20477i, Boolean, AbstractC20362a<? extends C89378p<? extends UrlModel, ? extends C20758o>>, String, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseMyProfileGuideWidget f146099a;

        static {
            Covode.recordClassIndex(75914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64453r(BaseMyProfileGuideWidget baseMyProfileGuideWidget) {
            super(5);
            this.f146099a = baseMyProfileGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89189s
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool, AbstractC20362a<? extends C89378p<? extends UrlModel, ? extends C20758o>> aVar, String str, Integer num) {
            AbstractC20477i iVar2 = iVar;
            final Boolean bool2 = bool;
            final AbstractC20362a<? extends C89378p<? extends UrlModel, ? extends C20758o>> aVar2 = aVar;
            final Integer num2 = num;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(aVar2, "");
            if (!((MyProfileGuideState) iVar2.withState(this.f146099a.mo104045n(), C644541.f146100a)).getHasGuideShowed() && !(!C89219l.m154714a((Object) str, (Object) "from_main"))) {
                this.f146099a.mo104045n().mo75829g(new AbstractC89172b<MyProfileGuideState, MyProfileGuideState>() {
                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.C64453r.C644552 */

                    static {
                        Covode.recordClassIndex(75916);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        boolean z;
                        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                        C89219l.m154721d(myProfileGuideState2, "");
                        if (bool2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return MyProfileGuideState.copy$default(myProfileGuideState2, false, z, false, false, null, null, null, false, false, false, null, null, null, null, 16381, null);
                    }
                });
                this.f146099a.mo104045n().mo75829g(new AbstractC89172b<MyProfileGuideState, MyProfileGuideState>() {
                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.C64453r.C644563 */

                    static {
                        Covode.recordClassIndex(75917);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                        C89219l.m154721d(myProfileGuideState2, "");
                        return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, !(aVar2 instanceof C20379aq), false, null, null, null, false, false, false, null, null, null, null, 16379, null);
                    }
                });
                this.f146099a.mo104045n().mo75829g(new AbstractC89172b<MyProfileGuideState, MyProfileGuideState>() {
                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget.C64453r.C644574 */

                    static {
                        Covode.recordClassIndex(75918);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
                        C89219l.m154721d(myProfileGuideState2, "");
                        return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, num2, false, false, false, null, null, null, null, 16319, null);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }
}
