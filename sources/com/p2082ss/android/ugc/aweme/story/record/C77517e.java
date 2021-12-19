package com.p2082ss.android.ugc.aweme.story.record;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.C2559g;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.C14325c;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.p938a.C14117i;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.scene.navigation.C22239d;
import com.p2082ss.android.ugc.asve.recorder.C31217m;
import com.p2082ss.android.ugc.asve.recorder.VERecorderImpl;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.record.AbstractC66810d;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72783c;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75275d;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75314e;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f.p3995a.C75862b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76359j;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c;
import com.p2082ss.android.ugc.aweme.story.base.C76627e;
import com.p2082ss.android.ugc.aweme.story.base.p4020a.C76608b;
import com.p2082ss.android.ugc.aweme.story.base.p4023ui.StoryRootActivity;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.aweme.story.record.dockbar.AbstractC77500a;
import com.p2082ss.android.ugc.aweme.story.record.dockbar.C77501b;
import com.p2082ss.android.ugc.aweme.story.record.p4061a.AbstractC77466a;
import com.p2082ss.android.ugc.aweme.story.record.p4061a.C77467b;
import com.p2082ss.android.ugc.aweme.story.record.p4065e.C77551a;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.story.record.p4067g.AbstractC77563a;
import com.p2082ss.android.ugc.aweme.story.record.p4067g.C77564b;
import com.p2082ss.android.ugc.aweme.story.record.p4067g.C77570d;
import com.p2082ss.android.ugc.aweme.story.record.p4068h.AbstractC77583a;
import com.p2082ss.android.ugc.aweme.story.record.p4068h.C77584b;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77609c;
import com.p2082ss.android.ugc.aweme.story.record.recordcontrol.C77622c;
import com.p2082ss.android.ugc.aweme.story.record.recordcontrol.C77625e;
import com.p2082ss.android.ugc.aweme.story.record.recordcontrol.C77629f;
import com.p2082ss.android.ugc.aweme.story.record.recordcontrol.StoryWorkspaceImpl;
import com.p2082ss.android.ugc.aweme.story.record.toolbar.AbstractC77640a;
import com.p2082ss.android.ugc.aweme.story.record.toolbar.C77641b;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.view.AbstractC81298w;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.e */
public final class C77517e extends AbstractC81298w implements AbstractC33401b, AbstractC76616c, AbstractC84919c {

    /* renamed from: e */
    public static final C77520c f173874e = new C77520c((byte) 0);

    /* renamed from: b */
    public AbstractC77466a f173875b;

    /* renamed from: c */
    public AbstractC14330a f173876c;

    /* renamed from: d */
    public boolean f173877d;

    /* renamed from: i */
    private final AbstractC89244h f173878i;

    /* renamed from: j */
    private ViewGroup f173879j;

    /* renamed from: k */
    private final AbstractC89244h f173880k;

    /* renamed from: l */
    private SurfaceView f173881l;

    /* renamed from: t */
    private final ArrayList<AbstractC84918b> f173882t;

    /* renamed from: u */
    private ArrayList<AbstractC84917a> f173883u;

    /* renamed from: v */
    private final AbstractC89244h f173884v;

    /* renamed from: w */
    private boolean f173885w;

    /* renamed from: x */
    private boolean f173886x;

    /* renamed from: y */
    private boolean f173887y;

    /* renamed from: z */
    private final AbstractC89244h f173888z;

    static {
        Covode.recordClassIndex(90554);
    }

    /* renamed from: F */
    public final C21582f mo121094F() {
        return (C21582f) this.f173878i.getValue();
    }

    /* renamed from: G */
    public final C77561a mo121108G() {
        return (C77561a) this.f173880k.getValue();
    }

    /* renamed from: H */
    public final StoryRecordBaseViewModel mo121109H() {
        return (StoryRecordBaseViewModel) this.f173884v.getValue();
    }

    /* renamed from: I */
    public final boolean mo121110I() {
        return ((Boolean) this.f173888z.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: b */
    public final void mo120627b(boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$c */
    public static final class C77520c {
        static {
            Covode.recordClassIndex(90557);
        }

        private C77520c() {
        }

        public /* synthetic */ C77520c(byte b) {
            this();
        }

        /* renamed from: a */
        public static C77517e m135547a(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            C77517e eVar = new C77517e((byte) 0);
            eVar.f52554r = bundle;
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$t */
    static final class C77547t extends AbstractC89220m implements AbstractC89171a<C21582f> {

        /* renamed from: a */
        final /* synthetic */ C77517e f173924a;

        static {
            Covode.recordClassIndex(90584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77547t(C77517e eVar) {
            super(0);
            this.f173924a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C21582f invoke() {
            return C2552c.m7462a(this.f173924a).f7697e;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: c */
    public final void mo120321c() {
        C77609c.m135600b(mo121108G(), "slide_left");
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C72479d.m127866a(C72477c.f162474a).mo114738a("at_shoot_page");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$m */
    static final class C77540m extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C77517e f173916a;

        static {
            Covode.recordClassIndex(90577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77540m(C77517e eVar) {
            super(0);
            this.f173916a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "story_slide_opt_enable", 0) != C76608b.f171938b || (this.f173916a.f52549m instanceof StoryRootActivity)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$w */
    static final class C77550w extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77517e f173927a;

        static {
            Covode.recordClassIndex(90587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77550w(C77517e eVar) {
            super(0);
            this.f173927a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a = C20531t.m38716a(C22228c.m41832b(this.f173927a)).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: E */
    public final void mo62771E() {
        C33398a.f79357a.mo59450a(this.f173881l, mo121108G().f173959k.f155647c, mo121108G().f173959k.f155648d);
    }

    /* renamed from: L */
    public final boolean mo121113L() {
        if (!this.f173887y) {
            Context s = mo36485s();
            C89219l.m154716b(s, "");
            this.f173887y = C77570d.m135569a(s);
        }
        return this.f173887y;
    }

    /* renamed from: J */
    public final void mo121111J() {
        AbstractC77466a aVar = this.f173875b;
        if (aVar != null) {
            aVar.mo22740a(false, PrivacyCert.Builder.Companion.with("bpea-288").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b
    /* renamed from: f */
    public final Analysis mo59474f() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("story_shoot_page");
        analysis.setMinValidStayDuration(1000);
        analysis.setExtraMap(C89041ag.m154427b(C89387v.m154943a("creation_id", mo121108G().f173950b), C89387v.m154943a("is_story_shoot", "1")));
        return analysis;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$n */
    static final class RunnableC77541n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C77517e f173917a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f173918b;

        static {
            Covode.recordClassIndex(90578);
        }

        RunnableC77541n(C77517e eVar, FrameLayout frameLayout) {
            this.f173917a = eVar;
            this.f173918b = frameLayout;
        }

        public final void run() {
            Context r = this.f173917a.mo36484r();
            if (r != null) {
                DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(r, this.f173917a, null, this.f173918b);
                AbstractC66810d l = C63244g.m114602a().mo73284l();
                AbstractC77466a aVar = this.f173917a.f173875b;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                AbstractC31193a effectController = aVar.mo22747A().getEffectController();
                AbstractC77466a aVar2 = this.f173917a.f173875b;
                if (aVar2 == null) {
                    C89219l.m154715b();
                }
                ViewGroup.LayoutParams layoutParams = aVar2.mo22750D().getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                defaultGesturePresenter.mo23040a(1, l.getARGestureDelegateListener(effectController, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams)));
            }
        }
    }

    private C77517e() {
        this.f173878i = C89250i.m154773a((AbstractC89171a) new C77547t(this));
        this.f173880k = C89250i.m154773a((AbstractC89171a) new C77549v(this));
        this.f173882t = new ArrayList<>();
        this.f173883u = new ArrayList<>();
        this.f173884v = C89250i.m154773a((AbstractC89171a) new C77550w(this));
        this.f173885w = true;
        this.f173888z = C89250i.m154773a((AbstractC89171a) new C77540m(this));
    }

    /* renamed from: N */
    private final void m135522N() {
        ASCameraView A;
        mo121108G().mo121124c();
        AbstractC77466a aVar = this.f173875b;
        if (!(aVar == null || (A = aVar.mo22747A()) == null)) {
            C31217m mVar = new C31217m(new C72783c(mo121108G().mo121123b()));
            File e = mo121108G().mo121123b().mo110096e();
            C89219l.m154716b(e, "");
            String absolutePath = e.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            A.mo56913a(mVar, absolutePath);
        }
        AbstractC77466a aVar2 = this.f173875b;
        if (aVar2 != null) {
            aVar2.mo22838z();
        }
        AbstractC14330a aVar3 = this.f173876c;
        if (aVar3 != null) {
            aVar3.mo23134p();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: b */
    public final boolean mo120320b() {
        ArrayList<AbstractC84917a> arrayList = this.f173883u;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        C22239d a = C22227b.m41825a(this);
        if (a != null && a.mo36524E()) {
            return true;
        }
        C77609c.m135600b(mo121108G(), "system_back_button");
        mo121109H().mo121089a();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$v */
    static final class C77549v extends AbstractC89220m implements AbstractC89171a<C77561a> {

        /* renamed from: a */
        final /* synthetic */ C77517e f173926a;

        static {
            Covode.recordClassIndex(90586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77549v(C77517e eVar) {
            super(0);
            this.f173926a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77561a invoke() {
            EnterStoryParam enterStoryParam;
            String str;
            Bundle bundle = this.f173926a.f52554r;
            C77561a aVar = new C77561a(new CameraComponentModel(0));
            if (!(bundle == null || (enterStoryParam = (EnterStoryParam) bundle.getParcelable("enter_story_param")) == null)) {
                String shootWay = enterStoryParam.getShootWay();
                if (shootWay == null) {
                    shootWay = "story";
                }
                aVar.f173951c = shootWay;
                aVar.f173952d = enterStoryParam.getEnterMethod();
                aVar.f173953e = enterStoryParam.getEnterFrom();
                aVar.f173954f = enterStoryParam.getNeedPublishWithAnim();
                if (!C89219l.m154714a((Object) enterStoryParam.getEnterMethod(), (Object) "slide_right")) {
                    str = "";
                } else if (enterStoryParam.isWestWindowExist()) {
                    str = "1";
                } else {
                    str = "0";
                }
                aVar.mo121122a(str);
            }
            StoryWorkspaceImpl storyWorkspaceImpl = new StoryWorkspaceImpl(aVar.mo121120a());
            aVar.f173955g = storyWorkspaceImpl;
            Workspace workspace = new Workspace(storyWorkspaceImpl);
            storyWorkspaceImpl.mo110071a(workspace);
            C89219l.m154721d(workspace, "");
            aVar.f173959k.f155652h = workspace;
            aVar.f173959k.f155647c = C63244g.m114602a().mo73280h().getVideoWidth();
            aVar.f173959k.f155648d = C63244g.m114602a().mo73280h().getVideoHeight();
            aVar.f173959k.f155646b = C77622c.f174113a.mo116636a(aVar.f173959k);
            return aVar;
        }
    }

    /* renamed from: K */
    public final void mo121112K() {
        AbstractC14177d dVar;
        VERecorderImpl B;
        AbstractC76115b bVar;
        AbstractC84089j jVar;
        AbstractC14330a aVar;
        AbstractC75655o t;
        AbstractC75718w c;
        AbstractC75720y j;
        List<EffectCategoryModel> a;
        T t2;
        String key;
        if (this.f173885w) {
            if (mo121110I()) {
                mo121111J();
            }
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93868b()) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin2, "");
                createIAVServiceProxybyMonsterPlugin2.getStoryService().mo93865a(C22228c.m41828a(this));
            } else if (C63253l.f143623a.mo73323s().mo93852a("key_enter_story_record_first", true)) {
                if (!C89070n.m154556a((Iterable) C89070n.m154522b("click_intro", "click_fullscreen_intro", "click_story_label"), (Object) mo121108G().f173952d)) {
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin3 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    C89219l.m154716b(createIAVServiceProxybyMonsterPlugin3, "");
                    createIAVServiceProxybyMonsterPlugin3.getStoryService().mo93865a(C22228c.m41828a(this));
                }
                C63253l.f143623a.mo73323s().mo93855b("key_enter_story_record_first", false);
            }
            C76627e.f171965b.mo120335b();
            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C77548u(null), 3);
            this.f173885w = false;
            return;
        }
        C21582f F = mo121094F();
        if (!(F == null || (aVar = (AbstractC14330a) F.mo35249a(AbstractC14330a.class, (String) null)) == null || (t = aVar.mo23167t()) == null || (c = t.mo119291c()) == null || (j = c.mo119464j()) == null || (a = C75723b.m132877a(j)) == null)) {
            Iterator<T> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (C75862b.m133014a(t2)) {
                    break;
                }
            }
            T t3 = t2;
            if (!(t3 == null || (key = t3.getKey()) == null || key.length() == 0)) {
                j.mo119467a(key);
            }
        }
        C21582f F2 = mo121094F();
        if (!(F2 == null || (jVar = (AbstractC84089j) F2.mo35249a(AbstractC84089j.class, (String) null)) == null)) {
            jVar.mo128899G();
        }
        C21582f F3 = mo121094F();
        if (!(F3 == null || (bVar = (AbstractC76115b) F3.mo35249a(AbstractC76115b.class, (String) null)) == null || !(bVar.mo119858a("sticker_category:search") instanceof C76359j))) {
            AbstractC76114a a2 = bVar.mo119858a("sticker_category:search");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerCategoryTabView");
            EditText editText = ((C76359j) a2).mo120076a().f171398c;
            if (editText == null) {
                C89219l.m154710a("etSearchInput");
            }
            editText.setText((CharSequence) null);
        }
        C21582f F4 = mo121094F();
        if (F4 != null && (dVar = (AbstractC14177d) F4.mo35247a(AbstractC14177d.class)) != null && (B = dVar.mo22748B()) != null) {
            B.mo56554l();
        }
    }

    public /* synthetic */ C77517e(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$l */
    static final class C77529l extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77517e f173906a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f173907b;

        static {
            Covode.recordClassIndex(90566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77529l(C77517e eVar, ShortVideoContext shortVideoContext) {
            super(1);
            this.f173906a = eVar;
            this.f173907b = shortVideoContext;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$a */
        public static final class C77530a extends AbstractC21603p<ActivityC0218d> {

            /* renamed from: a */
            final /* synthetic */ C77529l f173908a;

            static {
                Covode.recordClassIndex(90567);
            }

            public C77530a(C77529l lVar) {
                this.f173908a = lVar;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [androidx.appcompat.app.d, java.lang.Object, android.app.Activity] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.p1559o.AbstractC21603p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final androidx.appcompat.app.ActivityC0218d get(com.bytedance.p1559o.C21582f r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
                    com.ss.android.ugc.aweme.story.record.e$l r0 = r2.f173908a
                    com.ss.android.ugc.aweme.story.record.e r0 = r0.f173906a
                    android.app.Activity r1 = r0.mo36486t()
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.C77517e.C77529l.C77530a.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$b */
        public static final class C77531b extends AbstractC21603p<Context> {

            /* renamed from: a */
            final /* synthetic */ C77529l f173909a;

            static {
                Covode.recordClassIndex(90568);
            }

            public C77531b(C77529l lVar) {
                this.f173909a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final Context get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                Activity t = this.f173909a.f173906a.mo36486t();
                C89219l.m154716b(t, "");
                return t;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$c */
        public static final class C77532c extends AbstractC21603p<Context> {

            /* renamed from: a */
            final /* synthetic */ C77529l f173910a;

            static {
                Covode.recordClassIndex(90569);
            }

            public C77532c(C77529l lVar) {
                this.f173910a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final Context get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                Activity t = this.f173910a.f173906a.mo36486t();
                C89219l.m154716b(t, "");
                return t;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$d */
        public static final class C77533d extends AbstractC21603p<AbstractC1204m> {

            /* renamed from: a */
            final /* synthetic */ C77529l f173911a;

            static {
                Covode.recordClassIndex(90570);
            }

            public C77533d(C77529l lVar) {
                this.f173911a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC1204m get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f173911a.f173906a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$e */
        public static final class C77534e extends AbstractC21603p<AbstractC84919c> {

            /* renamed from: a */
            final /* synthetic */ C77529l f173912a;

            static {
                Covode.recordClassIndex(90571);
            }

            public C77534e(C77529l lVar) {
                this.f173912a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC84919c get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f173912a.f173906a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$f */
        public static final class C77535f extends AbstractC21603p<C77561a> {

            /* renamed from: a */
            final /* synthetic */ C77529l f173913a;

            static {
                Covode.recordClassIndex(90572);
            }

            public C77535f(C77529l lVar) {
                this.f173913a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C77561a get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f173913a.f173906a.mo121108G();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$g */
        public static final class C77536g extends AbstractC21603p<ShortVideoContext> {

            /* renamed from: a */
            final /* synthetic */ C77529l f173914a;

            static {
                Covode.recordClassIndex(90573);
            }

            public C77536g(C77529l lVar) {
                this.f173914a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ShortVideoContext get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f173914a.f173907b;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$h */
        public static final class C77537h extends AbstractC21603p<AbstractC84398d> {
            static {
                Covode.recordClassIndex(90574);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC84398d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                return C46404c.m89554a(application, C77539j.f173915a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$i */
        public static final class C77538i extends AbstractC21603p<StickerPreferences> {
            static {
                Covode.recordClassIndex(90575);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences, java.lang.Object] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.p1559o.AbstractC21603p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences get(com.bytedance.p1559o.C21582f r5) {
                /*
                    r4 = this;
                    java.lang.String r3 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
                    com.bytedance.cukaie.closet.a r2 = new com.bytedance.cukaie.closet.a
                    com.bytedance.cukaie.closet.internal.d r0 = new com.bytedance.cukaie.closet.internal.d
                    r0.<init>()
                    r2.<init>(r0)
                    android.app.Application r1 = com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a
                    p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
                    java.lang.Class<com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences> r0 = com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences.class
                    java.lang.Object r0 = r2.mo23215a(r1, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.C77517e.C77529l.C77538i.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$j */
        static final class C77539j extends AbstractC89220m implements AbstractC89172b<EffectPlatformBuilder, C89391z> {

            /* renamed from: a */
            public static final C77539j f173915a = new C77539j();

            static {
                Covode.recordClassIndex(90576);
            }

            C77539j() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(EffectPlatformBuilder effectPlatformBuilder) {
                EffectPlatformBuilder effectPlatformBuilder2 = effectPlatformBuilder;
                C89219l.m154721d(effectPlatformBuilder2, "");
                effectPlatformBuilder2.setEnableKNEffectPlatform(true);
                effectPlatformBuilder2.setMonitorExtraParams(C89041ag.m154412a(C89387v.m154943a("is_story", 1)));
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C21597n.C21600a a = nVar2.mo35260a(ActivityC0218d.class, (String) null, (AbstractC21603p) new C77530a(this));
            C89219l.m154716b(a, "");
            a.mo35263a(Activity.class).mo35263a(ActivityC0945e.class);
            C89219l.m154716b(nVar2.mo35260a(Context.class, (String) null, (AbstractC21603p) new C77531b(this)), "");
            C89219l.m154716b(nVar2.mo35260a(Context.class, "applicationContext", (AbstractC21603p) new C77532c(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC1204m.class, (String) null, (AbstractC21603p) new C77533d(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC84919c.class, (String) null, (AbstractC21603p) new C77534e(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C77561a.class, (String) null, (AbstractC21603p) new C77535f(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ShortVideoContext.class, (String) null, (AbstractC21603p) new C77536g(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC84398d.class, (String) null, (AbstractC21603p) new C77537h()), "");
            C89219l.m154716b(nVar2.mo35260a(StickerPreferences.class, (String) null, (AbstractC21603p) new C77538i()), "");
            C63244g.m114602a().mo73284l().registerNeededObjects(C22228c.m41832b(this.f173906a), nVar2, this.f173907b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$a */
    public static final class C77518a extends AbstractC21603p<C14117i> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173889a;

        static {
            Covode.recordClassIndex(90555);
        }

        public C77518a(C2553d dVar) {
            this.f173889a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14117i get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C14117i generateBeautyComponent = C63244g.m114602a().mo73284l().generateBeautyComponent(fVar);
            generateBeautyComponent.mo22652c();
            return generateBeautyComponent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$b */
    public static final class C77519b extends AbstractC21603p<C77625e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173890a;

        static {
            Covode.recordClassIndex(90556);
        }

        public C77519b(C2553d dVar) {
            this.f173890a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77625e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(fVar, "");
            return new C77625e(fVar, new C77629f.C77630a((ActivityC0945e) fVar.mo35249a(ActivityC0945e.class, (String) null), (AbstractC77466a) fVar.mo35249a(AbstractC77466a.class, (String) null)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$f */
    public static final class C77523f extends AbstractC21603p<C77641b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173894a;

        /* renamed from: b */
        final /* synthetic */ C77517e f173895b;

        static {
            Covode.recordClassIndex(90560);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77641b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77641b(this.f173895b, fVar);
        }

        public C77523f(C2553d dVar, C77517e eVar) {
            this.f173894a = dVar;
            this.f173895b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$g */
    public static final class C77524g extends AbstractC21603p<C77584b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173896a;

        /* renamed from: b */
        final /* synthetic */ C77517e f173897b;

        static {
            Covode.recordClassIndex(90561);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77584b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77584b(this.f173897b, fVar);
        }

        public C77524g(C2553d dVar, C77517e eVar) {
            this.f173896a = dVar;
            this.f173897b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$i */
    public static final class C77526i extends AbstractC21603p<C77551a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173900a;

        /* renamed from: b */
        final /* synthetic */ C77517e f173901b;

        static {
            Covode.recordClassIndex(90563);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77551a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77551a(this.f173901b, fVar);
        }

        public C77526i(C2553d dVar, C77517e eVar) {
            this.f173900a = dVar;
            this.f173901b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$j */
    public static final class C77527j extends AbstractC21603p<C77501b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173902a;

        /* renamed from: b */
        final /* synthetic */ C77517e f173903b;

        static {
            Covode.recordClassIndex(90564);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77501b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77501b(this.f173903b, fVar);
        }

        public C77527j(C2553d dVar, C77517e eVar) {
            this.f173902a = dVar;
            this.f173903b = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87531a(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
        this.f173883u.add(0, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87533b(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
        this.f173883u.add(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$e */
    static final class C77522e implements C75972r.AbstractC75974b {

        /* renamed from: a */
        final /* synthetic */ C77517e f173893a;

        static {
            Covode.recordClassIndex(90559);
        }

        C77522e(C77517e eVar) {
            this.f173893a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r.AbstractC75974b
        /* renamed from: a */
        public final void mo23198a(boolean z) {
            this.f173893a.mo121109H().mo33689c(new StoryRecordBaseViewModel.C77460i(!z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$k */
    public static final class C77528k extends AbstractC21603p<C77564b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173904a;

        /* renamed from: b */
        final /* synthetic */ C77517e f173905b;

        static {
            Covode.recordClassIndex(90565);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77564b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77564b(C22228c.m41832b(this.f173905b), this.f173905b, fVar);
        }

        public C77528k(C2553d dVar, C77517e eVar) {
            this.f173904a = dVar;
            this.f173905b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$q */
    static final class C77544q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77517e f173921a;

        static {
            Covode.recordClassIndex(90581);
        }

        C77544q(C77517e eVar) {
            this.f173921a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj instanceof AbstractC75275d.C75280e) {
                this.f173921a.mo121109H().mo121091a(true);
            } else if (obj instanceof AbstractC75275d.C75276a) {
                this.f173921a.mo121109H().mo121091a(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.record.e$u */
    public static final class C77548u extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f173925a;

        static {
            Covode.recordClassIndex(90585);
        }

        C77548u(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C77548u(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C77548u) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f173925a == 0) {
                C89382r.m154942a(obj);
                C63244g.m114602a().mo73284l().cleanStoryCache();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87532a(AbstractC84918b bVar) {
        C89219l.m154721d(bVar, "");
        this.f173882t.add(bVar);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: c */
    public final void mo87535c(AbstractC84917a aVar) {
        C89219l.m154721d(aVar, "");
        this.f173883u.remove(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$d */
    public static final class C77521d extends AbstractC21603p<C77467b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173891a;

        /* renamed from: b */
        final /* synthetic */ C77517e f173892b;

        static {
            Covode.recordClassIndex(90558);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C77467b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C77467b((ViewGroup) this.f173892b.mo36475c(R.id.a0u), fVar, this.f173892b.mo121108G().f173959k, this.f173892b.mo121108G().f173950b);
        }

        public C77521d(C2553d dVar, C77517e eVar) {
            this.f173891a = dVar;
            this.f173892b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$h */
    public static final class C77525h extends AbstractC21603p<C14325c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f173898a;

        /* renamed from: b */
        final /* synthetic */ C77517e f173899b;

        static {
            Covode.recordClassIndex(90562);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14325c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C14325c cVar = new C14325c(this.f173899b, fVar, R.id.b_c);
            PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-289").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            C89219l.m154721d(build, "");
            cVar.f34692h = build;
            return cVar;
        }

        public C77525h(C2553d dVar, C77517e eVar) {
            this.f173898a = dVar;
            this.f173899b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$s */
    static final class C77546s<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C77517e f173923a;

        static {
            Covode.recordClassIndex(90583);
        }

        C77546s(C77517e eVar) {
            this.f173923a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC1196i lifecycle = this.f173923a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                if (!this.f173923a.mo121110I()) {
                    this.f173923a.mo121111J();
                }
                if (this.f173923a.f173877d) {
                    this.f173923a.mo121112K();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: a */
    public final void mo120319a(EnterStoryParam enterStoryParam) {
        String str = "";
        C89219l.m154721d(enterStoryParam, str);
        C77561a G = mo121108G();
        G.f173952d = enterStoryParam.getEnterMethod();
        G.f173953e = enterStoryParam.getEnterFrom();
        if (C89219l.m154714a((Object) enterStoryParam.getEnterMethod(), (Object) "slide_right")) {
            if (enterStoryParam.isWestWindowExist()) {
                str = "1";
            } else {
                str = "0";
            }
        }
        G.mo121122a(str);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87534b(AbstractC84918b bVar) {
        C89219l.m154721d(bVar, "");
        this.f173882t.remove(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$p */
    static final class C77543p extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77517e f173920a;

        static {
            Covode.recordClassIndex(90580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77543p(C77517e eVar) {
            super(1);
            this.f173920a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            Effect effect;
            AbstractC14333c cVar;
            C77551a aVar;
            C89219l.m154721d(pVar, "");
            this.f173920a.f173877d = false;
            C21582f F = this.f173920a.mo121094F();
            if (!(F == null || (aVar = (C77551a) F.mo35252b(C77551a.class, null)) == null || !aVar.f173931d)) {
                aVar.mo121119e();
            }
            AbstractC14330a aVar2 = this.f173920a.f173876c;
            if (!(aVar2 == null || C75346e.m132154a(aVar2) == null)) {
                AbstractC14330a aVar3 = this.f173920a.f173876c;
                if (aVar3 != null) {
                    effect = C75346e.m132154a(aVar3);
                } else {
                    effect = null;
                }
                if (C75466g.m132368t(effect)) {
                    this.f173920a.mo120320b();
                    C21582f F2 = this.f173920a.mo121094F();
                    if (!(F2 == null || (cVar = (AbstractC14333c) F2.mo35249a((Type) AbstractC14333c.class, (String) null)) == null)) {
                        cVar.mo23139a(false);
                    }
                }
                AbstractC14330a aVar4 = this.f173920a.f173876c;
                if (aVar4 != null) {
                    C75346e.m132156a(aVar4, (Effect) null);
                }
            }
            C77561a G = this.f173920a.mo121108G();
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            C89219l.m154721d(uuid, "");
            G.f173950b = uuid;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$r */
    static final class C77545r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C77517e f173922a;

        static {
            Covode.recordClassIndex(90582);
        }

        C77545r(C77517e eVar) {
            this.f173922a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f173922a.mo121109H().mo121091a(true);
                return;
            }
            AbstractC14330a aVar = this.f173922a.f173876c;
            if (aVar != null) {
                effect = C75346e.m132154a(aVar);
            } else {
                effect = null;
            }
            if (C75466g.m132369u(effect)) {
                this.f173922a.mo121109H().mo121093c(true);
                return;
            }
            this.f173922a.mo121109H().mo121093c(false);
            this.f173922a.mo121109H().mo121091a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$o */
    static final class C77542o extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77517e f173919a;

        static {
            Covode.recordClassIndex(90579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77542o(C77517e eVar) {
            super(1);
            this.f173919a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            this.f173919a.f173877d = true;
            if (this.f173919a.mo121113L()) {
                this.f173919a.mo121112K();
            }
            this.f173919a.mo121108G().f173958j = System.currentTimeMillis();
            C77561a G = this.f173919a.mo121108G();
            C89219l.m154721d(G, "");
            C77609c.f174065a = -1;
            C77609c.f174066b = "";
            C77609c.f174065a = System.currentTimeMillis();
            C77609c.m135599a("enter_video_shoot_page");
            Map<String, String> map = new C84425b().mo129406a("creation_id", G.f173950b).mo129406a("shoot_way", "story").mo129406a("shoot_entrance", "story").mo129406a("shoot_page", "story_shoot_page").mo129406a("is_westwindow_exist", G.f173957i).mo129406a("enter_method", G.f173952d).mo129406a("enter_from", G.f173953e).mo129406a("last_group_id", C70747dv.f158358b).mo129406a("last_gid_from", C70747dv.f158359c).f188764a;
            C80322d.m139251a("shoot", map);
            C80322d.m139251a("enter_video_shoot_page", map);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.AbstractC81298w
    /* renamed from: a */
    public final void mo120626a(boolean z) {
        AbstractC77563a aVar;
        AbstractC77640a aVar2;
        if (!this.f173886x) {
            C21582f F = mo121094F();
            if (!(F == null || (aVar2 = (AbstractC77640a) F.mo35249a(AbstractC77640a.class, (String) null)) == null)) {
                aVar2.mo121171a();
            }
            C21582f F2 = mo121094F();
            if (!(F2 == null || (aVar = (AbstractC77563a) F2.mo35252b(AbstractC77563a.class, null)) == null)) {
                aVar.mo121128a();
            }
            this.f173886x = true;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        AbstractC77466a aVar;
        AbstractC14330a aVar2;
        SurfaceView surfaceView;
        C21582f F;
        C77564b bVar;
        C1213t<Boolean> tVar;
        C2559g<Boolean> d;
        AbstractC75314e eVar;
        C2559g<AbstractC75275d> a;
        super.mo22704a(bundle);
        C2556g.m7472a(this, new C77529l(this, mo121108G().mo121126e()));
        C2551b bVar2 = new C2551b(C2552c.m7462a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar2.f7720a;
        alsLogicContainer.f7696d.mo35260a(C77467b.class, (String) null, (AbstractC21603p) new C77521d(dVar, this));
        alsLogicContainer.mo7005a(AbstractC77466a.class, C77467b.class);
        C63244g.m114602a().mo73284l().attachStickerComponent(bVar2, this, R.id.dgc, new C77522e(this));
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar2.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C14117i.class, (String) null, (AbstractC21603p) new C77518a(dVar2));
        alsLogicContainer2.mo7005a(AbstractC14099a.class, C14117i.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar2.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C77641b.class, (String) null, (AbstractC21603p) new C77523f(dVar3, this));
        alsLogicContainer3.mo7005a(AbstractC77640a.class, C77641b.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar2.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C77625e.class, (String) null, (AbstractC21603p) new C77519b(dVar4));
        alsLogicContainer4.mo7005a(AbstractC14193m.class, C77625e.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar2.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C77584b.class, (String) null, (AbstractC21603p) new C77524g(dVar5, this));
        alsLogicContainer5.mo7005a(AbstractC77583a.class, C77584b.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar2.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C14325c.class, (String) null, (AbstractC21603p) new C77525h(dVar6, this));
        alsLogicContainer6.mo7005a(AbstractC14315b.class, C14325c.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar2.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C77551a.class, (String) null, (AbstractC21603p) new C77526i(dVar7, this));
        alsLogicContainer7.mo7005a(AbstractC2547b.class, C77551a.class);
        C2553d dVar8 = new C2553d();
        AlsLogicContainer alsLogicContainer8 = bVar2.f7720a;
        alsLogicContainer8.f7696d.mo35260a(C77501b.class, (String) null, (AbstractC21603p) new C77527j(dVar8, this));
        alsLogicContainer8.mo7005a(AbstractC77500a.class, C77501b.class);
        if (!mo121113L()) {
            C2553d dVar9 = new C2553d();
            AlsLogicContainer alsLogicContainer9 = bVar2.f7720a;
            alsLogicContainer9.f7696d.mo35260a(C77564b.class, (String) null, (AbstractC21603p) new C77528k(dVar9, this));
            alsLogicContainer9.mo7005a(AbstractC77563a.class, C77564b.class);
        }
        bVar2.mo7031a();
        C21582f F2 = mo121094F();
        if (F2 != null) {
            aVar = (AbstractC77466a) F2.mo35249a(AbstractC77466a.class, (String) null);
        } else {
            aVar = null;
        }
        this.f173875b = aVar;
        C21582f F3 = mo121094F();
        if (F3 != null) {
            aVar2 = (AbstractC14330a) F3.mo35249a(AbstractC14330a.class, (String) null);
        } else {
            aVar2 = null;
        }
        this.f173876c = aVar2;
        getLifecycle().mo4012a(new AnalysisActivityComponent(mo36485s(), this));
        AbstractC77466a aVar3 = this.f173875b;
        if (aVar3 != null) {
            surfaceView = aVar3.mo22749C();
        } else {
            surfaceView = null;
        }
        this.f173881l = surfaceView;
        View c = mo36475c(R.id.c48);
        C89219l.m154716b(c, "");
        FrameLayout frameLayout = (FrameLayout) c;
        frameLayout.post(new RunnableC77541n(this, frameLayout));
        AbstractC88412b unused = mo121109H().mo33677a(this, C77560f.f173948a, new C20370ah(), new C77542o(this));
        AbstractC88412b unused2 = mo121109H().mo33677a(this, C77562g.f173960a, new C20370ah(), new C77543p(this));
        C21582f F4 = mo121094F();
        if (!(F4 == null || (eVar = (AbstractC75314e) F4.mo35252b(AbstractC75314e.class, null)) == null || (a = eVar.mo118896a()) == null)) {
            a.mo6997a(this, new C77544q(this));
        }
        AbstractC14330a aVar4 = this.f173876c;
        if (!(aVar4 == null || (d = aVar4.mo23122d()) == null)) {
            d.mo6997a(this, new C77545r(this));
        }
        if (!(mo121113L() || (F = mo121094F()) == null || (bVar = (C77564b) F.mo35249a(C77564b.class, (String) null)) == null || (tVar = bVar.f173961a) == null)) {
            tVar.observe(this, new C77546s(this));
        }
        if (!mo121110I() && mo121113L()) {
            mo121111J();
        }
        C72479d.m127866a(C72477c.f162474a).mo114739a("at_shoot_page", false);
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b25, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        this.f173879j = viewGroup2;
        return viewGroup2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120318a(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 531(0x213, float:7.44E-43)
            if (r3 != r0) goto L_0x0039
            com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel r0 = r2.mo121109H()
            r0.mo121090a(r4)
            r0 = 10
            if (r4 == r0) goto L_0x0039
            com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel r1 = r2.mo121109H()
            androidx.fragment.app.e r0 = com.bytedance.scene.ktx.C22228c.m41832b(r2)
            com.bytedance.jedi.arch.af r0 = r1.mo33676a(r0)
            com.ss.android.ugc.aweme.story.record.StoryRecordBaseState r0 = (com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseState) r0
            com.bytedance.jedi.arch.k r0 = r0.getOpenAlbum()
            if (r0 == 0) goto L_0x0036
            T r0 = r0.f48283b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto L_0x0036
            com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel r1 = r2.mo121109H()
            r0 = 0
            r1.mo121092b(r0)
        L_0x0036:
            r2.m135522N()
        L_0x0039:
            java.util.ArrayList<com.ss.android.ugc.tools.view.a.b> r0 = r2.f173882t
            java.util.Iterator r1 = r0.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.tools.view.a.b r0 = (com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b) r0
            boolean r0 = r0.mo62778a(r3, r4, r5)
            if (r0 == 0) goto L_0x003f
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.C77517e.mo120318a(int, int, android.content.Intent):void");
    }
}
