package com.p2082ss.android.ugc.aweme.story.base.p4023ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.services.story.IStoryView;
import com.p2082ss.android.ugc.aweme.story.base.C76605a;
import com.p2082ss.android.ugc.aweme.story.base.p4020a.C76608b;
import com.p2082ss.android.ugc.aweme.story.base.widget.C76653a;
import com.p2082ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77607a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.ui.a */
public final class C76640a extends Fragment implements IStoryView, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C76641a f172014c = new C76641a((byte) 0);

    /* renamed from: a */
    public final C1213t<C89391z> f172015a = new C1213t<>();

    /* renamed from: b */
    public boolean f172016b = true;

    /* renamed from: d */
    private final C1213t<Boolean> f172017d = new C1213t<>();

    /* renamed from: e */
    private final AbstractC89244h f172018e = C89250i.m154773a((AbstractC89171a) new C76648h(this));

    /* renamed from: f */
    private final AbstractC89244h f172019f = C89250i.m154773a((AbstractC89171a) new C76647g(this));

    /* renamed from: g */
    private View f172020g;

    /* renamed from: h */
    private boolean f172021h;

    /* renamed from: i */
    private final AbstractC89244h f172022i = C89250i.m154773a((AbstractC89171a) C76646f.f172032a);

    /* renamed from: j */
    private final AbstractC89244h f172023j = C89250i.m154773a((AbstractC89171a) new C76642b(this));

    /* renamed from: k */
    private HashMap f172024k;

    static {
        Covode.recordClassIndex(89632);
    }

    /* renamed from: b */
    private final StoryRecordBaseViewModel m134235b() {
        return (StoryRecordBaseViewModel) this.f172018e.getValue();
    }

    /* renamed from: c */
    private final C76605a m134236c() {
        return (C76605a) this.f172019f.getValue();
    }

    /* renamed from: d */
    private final EnterStoryParam m134237d() {
        return (EnterStoryParam) this.f172023j.getValue();
    }

    /* renamed from: a */
    public final StorySlideFragmentLifecycleDispatcher mo120406a() {
        return (StorySlideFragmentLifecycleDispatcher) this.f172022i.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(254, new RunnableC90250g(C76640a.class, "onPublishStarted", C77607a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$a */
    public static final class C76641a {
        static {
            Covode.recordClassIndex(89633);
        }

        private C76641a() {
        }

        public /* synthetic */ C76641a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryView
    public final Fragment asFragment() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryView
    public final LiveData<C89391z> getCloseEvent() {
        return this.f172015a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryView
    public final LiveData<Boolean> getForbidDrawerScrollEvent() {
        return this.f172017d;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$f */
    static final class C76646f extends AbstractC89220m implements AbstractC89171a<StorySlideFragmentLifecycleDispatcher> {

        /* renamed from: a */
        public static final C76646f f172032a = new C76646f();

        static {
            Covode.recordClassIndex(89638);
        }

        C76646f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StorySlideFragmentLifecycleDispatcher invoke() {
            return new StorySlideFragmentLifecycleDispatcher();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryView
    public final void onSlideExitStoryShoot() {
        m134236c().mo120321c();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryView
    public final boolean onBackPressed() {
        return m134236c().mo120320b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f172024k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$b */
    static final class C76642b extends AbstractC89220m implements AbstractC89171a<EnterStoryParam> {

        /* renamed from: a */
        final /* synthetic */ C76640a f172025a;

        static {
            Covode.recordClassIndex(89634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76642b(C76640a aVar) {
            super(0);
            this.f172025a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EnterStoryParam invoke() {
            Bundle arguments = this.f172025a.getArguments();
            if (arguments != null) {
                return arguments.getParcelable("enter_story_param");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$h */
    static final class C76648h extends AbstractC89220m implements AbstractC89171a<StoryRecordBaseViewModel> {

        /* renamed from: a */
        final /* synthetic */ C76640a f172034a;

        static {
            Covode.recordClassIndex(89640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76648h(C76640a aVar) {
            super(0);
            this.f172034a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            ActivityC0945e activity = this.f172034a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            JediViewModel a = C20531t.m38716a(activity).mo33800a(StoryRecordBaseViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryView
    public final void onOpenCompletely() {
        if (getActivity() != null) {
            m134235b().mo33689c(StoryRecordBaseViewModel.C77458g.f173786a);
            C63244g.m114602a().mo73286n().mo120440a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$g */
    static final class C76647g extends AbstractC89220m implements AbstractC89171a<C76605a> {

        /* renamed from: a */
        final /* synthetic */ C76640a f172033a;

        static {
            Covode.recordClassIndex(89639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76647g(C76640a aVar) {
            super(0);
            this.f172033a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76605a invoke() {
            boolean z = this.f172033a.f172016b;
            boolean z2 = true;
            if (C16048b.m29633a().mo25412a(true, "story_slide_opt_enable", 0) != C76608b.f171937a || (this.f172033a.getActivity() instanceof StoryRootActivity)) {
                z2 = false;
            }
            Bundle arguments = this.f172033a.getArguments();
            if (arguments == null) {
                arguments = Bundle.EMPTY;
            }
            C89219l.m154716b(arguments, "");
            return new C76605a(z, z2, arguments);
        }
    }

    @AbstractC90264r
    public final void onPublishStarted(C77607a aVar) {
        C89219l.m154721d(aVar, "");
        mo120406a().mo120404b(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        mo120406a().mo120403a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryView
    public final void updateEnterStoryParam(EnterStoryParam enterStoryParam) {
        C89219l.m154721d(enterStoryParam, "");
        m134236c().mo120319a(enterStoryParam);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$c */
    static final class C76643c extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76640a f172026a;

        /* renamed from: b */
        final /* synthetic */ Bundle f172027b;

        static {
            Covode.recordClassIndex(89635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76643c(C76640a aVar, Bundle bundle) {
            super(1);
            this.f172026a = aVar;
            this.f172027b = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            this.f172026a.f172015a.setValue(C89391z.f203057a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$d */
    static final class C76644d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76640a f172028a;

        /* renamed from: b */
        final /* synthetic */ Bundle f172029b;

        static {
            Covode.recordClassIndex(89636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76644d(C76640a aVar, Bundle bundle) {
            super(1);
            this.f172028a = aVar;
            this.f172029b = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C76653a aVar = this.f172028a.mo120406a().f172006b;
            if (aVar != null) {
                aVar.f172042c = booleanValue;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$e */
    static final class C76645e extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76640a f172030a;

        /* renamed from: b */
        final /* synthetic */ Bundle f172031b;

        static {
            Covode.recordClassIndex(89637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76645e(C76640a aVar, Bundle bundle) {
            super(1);
            this.f172030a = aVar;
            this.f172031b = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            ActivityC0945e activity = this.f172030a.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        StorySlideFragmentLifecycleDispatcher a = mo120406a();
        C89219l.m154721d(bundle, "");
        C76653a aVar = a.f172006b;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        MethodCollector.m26663i(6506);
        super.onActivityCreated(bundle);
        if (!this.f172021h) {
            EnterStoryParam d = m134237d();
            if (d != null) {
                z = d.isStory();
            } else {
                z = true;
            }
            this.f172016b = z;
            View view = getView();
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                StorySlideFragmentLifecycleDispatcher a = mo120406a();
                AbstractC22219j a2 = m134236c().mo120317a();
                C89219l.m154721d(this, "");
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(a2, "");
                if (!a.f172005a) {
                    a.f172008d = bundle;
                    a.f172007c = a2;
                    Context context = viewGroup.getContext();
                    C89219l.m154716b(context, "");
                    C76653a aVar = new C76653a(context, (byte) 0);
                    viewGroup.addView(aVar, new ViewGroup.LayoutParams(-1, -1));
                    a.f172006b = aVar;
                    a.mo120402a();
                    getLifecycle().mo4012a(a);
                    a.f172005a = true;
                    mo120406a().mo120403a(true);
                    AbstractC88412b unused = m134235b().mo33677a(this, C76649b.f172035a, new C20370ah(), new C76643c(this, bundle));
                    AbstractC88412b unused2 = m134235b().mo33677a(this, C76650c.f172036a, new C20370ah(), new C76644d(this, bundle));
                    EnterStoryParam d2 = m134237d();
                    if (d2 != null && d2.getLaunchAsActivity()) {
                        AbstractC88412b unused3 = m134235b().mo33677a(this, C76651d.f172037a, new C20370ah(), new C76645e(this, bundle));
                    } else if (this.f172016b) {
                        EventBus.m156966a(EventBus.m156962a(), this);
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("the dispatcher " + a + " had been setup before.");
                    MethodCollector.m26664o(6506);
                    throw illegalStateException;
                }
            }
            this.f172021h = true;
        }
        m134235b().mo33689c(StoryRecordBaseViewModel.C77457f.f173785a);
        C63244g.m114602a().mo73286n().mo120440a(true);
        MethodCollector.m26664o(6506);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryView, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m134236c().mo120318a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        if (this.f172020g == null) {
            this.f172020g = C1764a.m5927a(layoutInflater, R.layout.b1b, viewGroup, false);
        }
        mo120406a().mo120404b(false);
        return this.f172020g;
    }
}
