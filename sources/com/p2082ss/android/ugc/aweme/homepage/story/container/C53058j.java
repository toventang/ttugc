package com.p2082ss.android.ugc.aweme.homepage.story.container;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.BounceInterpolator;
import android.widget.RelativeLayout;
import androidx.core.app.ActivityC0580d;
import androidx.core.p030b.C0622a;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12768r;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.p797d.AbstractC12770b;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48316ak;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49673ah;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2976c.C50456b;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.story.container.C53042b;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.C53108b;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.C53111e;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.p2082ss.android.ugc.aweme.services.story.IStoryService;
import com.p2082ss.android.ugc.aweme.services.story.IStoryView;
import com.p2082ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j */
public final class C53058j extends RelativeLayout implements AbstractC12846h, AbstractC53045c {

    /* renamed from: p */
    public static final C53064f f122004p = new C53064f((byte) 0);

    /* renamed from: a */
    public StorySidebarFeedVM f122005a;

    /* renamed from: b */
    public ViewGroup f122006b;

    /* renamed from: c */
    public ViewGroup f122007c;

    /* renamed from: d */
    View f122008d;

    /* renamed from: e */
    public int f122009e;

    /* renamed from: f */
    public boolean f122010f;

    /* renamed from: g */
    final C53042b f122011g;

    /* renamed from: h */
    public IStoryView f122012h;

    /* renamed from: i */
    public Runnable f122013i;

    /* renamed from: j */
    public C89378p<Boolean, ? extends Aweme> f122014j;

    /* renamed from: k */
    public boolean f122015k;

    /* renamed from: l */
    public ObjectAnimator f122016l;

    /* renamed from: m */
    EnterStoryParam f122017m;

    /* renamed from: n */
    public boolean f122018n;

    /* renamed from: o */
    final C53048f f122019o;

    /* renamed from: q */
    private final AbstractC89244h f122020q;

    /* renamed from: r */
    private final AbstractC89244h f122021r;

    /* renamed from: s */
    private final AbstractC89244h f122022s;

    /* renamed from: t */
    private final AbstractC89244h f122023t;

    static {
        Covode.recordClassIndex(62603);
    }

    private final IStoryPublishService getStoryPublishService() {
        return (IStoryPublishService) this.f122023t.getValue();
    }

    public final DrawerViewModel getDrawerViewModel() {
        return (DrawerViewModel) this.f122020q.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final HomePageDataViewModel getHomeViewModel() {
        return (HomePageDataViewModel) this.f122021r.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final IStoryService getStoryToolsService() {
        return (IStoryService) this.f122022s.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$f */
    public static final class C53064f {
        static {
            Covode.recordClassIndex(62609);
        }

        private C53064f() {
        }

        public /* synthetic */ C53064f(byte b) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    public final C53042b getEvent() {
        return this.f122011g;
    }

    public final boolean getHasData() {
        return this.f122010f;
    }

    public final C53048f getStoryContainer() {
        return this.f122019o;
    }

    /* renamed from: a */
    public final void mo89572a(boolean z) {
        Aweme aweme;
        Aweme aweme2;
        String aid;
        if (this.f122014j.getFirst().booleanValue() != z) {
            if (!z) {
                aweme = (Aweme) this.f122014j.getSecond();
                aweme2 = null;
            } else {
                aweme = getHomeViewModel().f121745k;
                aweme2 = aweme;
            }
            AbstractC81915c.m141874a(new C50456b(z, aweme, 2));
            if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                AbstractC81915c.m141874a(new C49673ah(z, aid));
            }
            this.f122014j = this.f122014j.copy(Boolean.valueOf(z), aweme2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53045c
    /* renamed from: a */
    public final boolean mo89560a() {
        IStoryView iStoryView;
        boolean z = false;
        if (this.f122012h != null && this.f122019o.mo89487c() && (!C89219l.m154714a((Object) getDrawerViewModel().f121919c.getValue(), (Object) true) || this.f122008d.getVisibility() != 0 || (iStoryView = this.f122012h) == null || !(z = iStoryView.onBackPressed()))) {
            this.f122019o.mo89484b();
        }
        return z;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$p */
    static final class C53076p extends AbstractC89220m implements AbstractC89171a<IStoryPublishService> {

        /* renamed from: a */
        public static final C53076p f122048a = new C53076p();

        static {
            Covode.recordClassIndex(62621);
        }

        C53076p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IStoryPublishService invoke() {
            return StoryPublishServiceImpl.m135314a();
        }
    }

    /* renamed from: c */
    public final void mo89575c() {
        this.f122008d.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C53055h.f121995a = this;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$c */
    public static final class C53061c implements AbstractC53047e {

        /* renamed from: a */
        final /* synthetic */ C53058j f122028a;

        /* renamed from: b */
        final /* synthetic */ Context f122029b;

        static {
            Covode.recordClassIndex(62606);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37184a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37185a(float f) {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: b */
        public final void mo37187b() {
            Runnable runnable = this.f122028a.f122013i;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
        /* renamed from: c */
        public final void mo37189c() {
            StorySidebarFeedVM storySidebarFeedVM = this.f122028a.f122005a;
            if (storySidebarFeedVM != null) {
                storySidebarFeedVM.mo89614a(0);
            }
            this.f122028a.mo89572a(false);
            C53042b event = this.f122028a.getEvent();
            C39162r.m79460a("close_westwindow", new C33744d().mo59983a("enter_from", event.f121977a).mo59983a("enter_method", event.f121980d).f79943a);
            C53042b event2 = this.f122028a.getEvent();
            long j = event2.f121981e;
            if (j != 0) {
                event2.f121981e = 0;
                C39162r.m79460a("westwindow_stay_time", new C33744d().mo59983a("enter_from", "westwindow").mo59981a("duration", System.currentTimeMillis() - j).f79943a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
        /* renamed from: d */
        public final void mo37190d() {
            StorySidebarFeedVM storySidebarFeedVM = this.f122028a.f122005a;
            if (storySidebarFeedVM != null) {
                storySidebarFeedVM.mo89614a(1);
            }
            this.f122028a.mo89572a(true);
            this.f122028a.getEvent().f121981e = System.currentTimeMillis();
            C53042b event = this.f122028a.getEvent();
            String str = this.f122028a.getDrawerViewModel().f121925i;
            String str2 = this.f122028a.getDrawerViewModel().f121926j;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C39162r.m79460a("enter_westwindow", new C33744d().mo59983a("enter_from", event.f121977a).mo59983a("enter_method", event.f121979c).mo59983a("notice_type", str).mo59983a("author_id", str2).f79943a);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
        /* renamed from: b */
        public final void mo37188b(float f) {
            if ((!C89219l.m154714a((Object) this.f122028a.getDrawerViewModel().f121918b.getValue(), (Object) true)) && f > 0.4f && (this.f122028a.f122009e & 2) == 0) {
                this.f122028a.f122009e |= 2;
                StorySidebarFeedVM storySidebarFeedVM = this.f122028a.f122005a;
                if (storySidebarFeedVM != null) {
                    storySidebarFeedVM.mo89614a(1);
                }
            }
        }

        C53061c(C53058j jVar, Context context) {
            this.f122028a = jVar;
            this.f122029b = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37186a(int i, boolean z, boolean z2) {
            StorySidebarFeedVM storySidebarFeedVM;
            if (i == 0 && !z2 && (storySidebarFeedVM = this.f122028a.f122005a) != null) {
                storySidebarFeedVM.mo89614a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$d */
    public static final class C53062d implements AbstractC53046d {

        /* renamed from: a */
        final /* synthetic */ C53058j f122030a;

        /* renamed from: b */
        final /* synthetic */ Context f122031b;

        static {
            Covode.recordClassIndex(62607);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37184a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: b */
        public final void mo37187b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53046d
        /* renamed from: c */
        public final void mo89457c() {
            this.f122030a.mo89578d(true);
            this.f122030a.mo89574b(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53046d
        /* renamed from: d */
        public final void mo89458d() {
            IStoryView iStoryView;
            this.f122030a.mo89578d(false);
            this.f122030a.mo89573b();
            if ((this.f122030a.f122009e & 1) == 0 && (iStoryView = this.f122030a.f122012h) != null) {
                iStoryView.onSlideExitStoryShoot();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01bd  */
        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo37185a(float r23) {
            /*
            // Method dump skipped, instructions count: 563
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.container.C53058j.C53062d.mo37185a(float):void");
        }

        C53062d(C53058j jVar, Context context) {
            this.f122030a = jVar;
            this.f122031b = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37186a(int i, boolean z, boolean z2) {
            if (i == 0) {
                if (!this.f122030a.getStoryContainer().mo89487c() || ((z2 || !z) && (!C89219l.m154714a((Object) this.f122030a.getDrawerViewModel().f121919c.getValue(), (Object) true)))) {
                    this.f122030a.mo89578d(false);
                    this.f122030a.mo89573b();
                }
                if (!((this.f122030a.f122009e & 16) == 0 || (this.f122030a.f122009e & 32) == 0 || (this.f122030a.f122009e & 4) == 0)) {
                    this.f122030a.mo89571a(this.f122031b);
                }
                if (this.f122030a.f122018n) {
                    this.f122030a.f122018n = false;
                    C48316ak.m91753a("exit", "slide");
                }
                this.f122030a.mo89580e(true);
            } else if (i == 1) {
                this.f122030a.f122009e |= 32;
                this.f122030a.getEvent().mo89559c("slide_left");
                this.f122030a.getEvent().mo89558b("slide");
                this.f122030a.getEvent().mo89557a("slide_right");
                DrawerViewModel drawerViewModel = this.f122030a.getDrawerViewModel();
                C89219l.m154721d("slide", "");
                drawerViewModel.f121924h = "slide";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$l */
    static final class C53072l extends AbstractC89220m implements AbstractC89171a<DrawerViewModel> {

        /* renamed from: a */
        final /* synthetic */ Context f122042a;

        static {
            Covode.recordClassIndex(62617);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53072l(Context context) {
            super(0);
            this.f122042a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DrawerViewModel invoke() {
            Context context = this.f122042a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return DrawerViewModel.C53032a.m97961a((ActivityC0945e) context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$n */
    static final class C53074n extends AbstractC89220m implements AbstractC89171a<HomePageDataViewModel> {

        /* renamed from: a */
        final /* synthetic */ Context f122044a;

        static {
            Covode.recordClassIndex(62619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53074n(Context context) {
            super(0);
            this.f122044a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HomePageDataViewModel invoke() {
            Context context = this.f122044a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return HomePageDataViewModel.C52942a.m97777a((ActivityC0945e) context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$q */
    static final class C53077q extends AbstractC89220m implements AbstractC89171a<IStoryService> {

        /* renamed from: a */
        public static final C53077q f122049a = new C53077q();

        static {
            Covode.recordClassIndex(62622);
        }

        C53077q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IStoryService invoke() {
            return AVExternalServiceImpl.m113114a().storyService();
        }
    }

    private final float getDensity() {
        Resources resources = getResources();
        C89219l.m154716b(resources, "");
        return resources.getDisplayMetrics().density;
    }

    /* renamed from: d */
    public final void mo89577d() {
        ViewGroup viewGroup;
        int i;
        if (this.f122010f) {
            viewGroup = this.f122006b;
            i = 0;
        } else {
            viewGroup = this.f122006b;
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    public final int getSideBarViewWidth() {
        return (int) ((getDensity() * 92.0f) + 0.5f);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C53055h.f121995a = null;
        mo89579e();
    }

    /* renamed from: e */
    public final void mo89579e() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f122016l;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.f122016l) != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1196i lifecycle = ((ActivityC0580d) context).getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$o */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC53075o implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C53058j f122045a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f122046b;

        /* renamed from: c */
        final /* synthetic */ boolean f122047c = false;

        static {
            Covode.recordClassIndex(62620);
        }

        public final void onGlobalLayout() {
            if (this.f122045a.getHasData()) {
                this.f122046b.element = this.f122045a.getSideBarViewWidth();
            }
            this.f122045a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f122045a.mo89570a(this.f122046b.element, this.f122047c);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC53075o(C53058j jVar, C89233z.C89236c cVar) {
            this.f122045a = jVar;
            this.f122046b = cVar;
        }
    }

    /* renamed from: b */
    public final void mo89573b() {
        Fragment asFragment;
        IStoryView iStoryView = this.f122012h;
        if (iStoryView != null && (asFragment = iStoryView.asFragment()) != null && !asFragment.isDetached()) {
            this.f122019o.getHostFragment().getChildFragmentManager().mo3552a().mo3475d(asFragment).mo3473c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$g */
    public static final class C53065g implements AbstractC1214u<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53058j f122034a;

        static {
            Covode.recordClassIndex(62610);
        }

        C53065g(C53058j jVar) {
            this.f122034a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C89391z zVar) {
            if (zVar != null) {
                this.f122034a.getStoryContainer().mo89484b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$k */
    public static final class C53071k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C53058j f122041a;

        static {
            Covode.recordClassIndex(62616);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53071k(C53058j jVar) {
            this.f122041a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f122041a.getStoryContainer().mo89492d();
            this.f122041a.f122006b.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo89571a(Context context) {
        C89219l.m154721d(context, "");
        IStoryService storyToolsService = getStoryToolsService();
        if (storyToolsService != null) {
            storyToolsService.showPublishingToast(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$e */
    static final class C53063e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C53058j f122032a;

        /* renamed from: b */
        final /* synthetic */ Context f122033b;

        static {
            Covode.recordClassIndex(62608);
        }

        C53063e(C53058j jVar, Context context) {
            this.f122032a = jVar;
            this.f122033b = context;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                C53058j jVar = this.f122032a;
                jVar.f122014j = jVar.f122014j.copy(false, null);
            }
        }
    }

    /* renamed from: d */
    public final void mo89578d(boolean z) {
        mo89580e(false);
        if (z) {
            this.f122006b.setVisibility(8);
            mo89575c();
            return;
        }
        mo89577d();
        this.f122008d.setVisibility(8);
    }

    public final void setLockReleaseStep(boolean z) {
        if (this.f122019o.f121942d != z) {
            C53055h.m98052a("StorySidebarContainer >>> setLockReleaseStep: ".concat(String.valueOf(z)));
            this.f122019o.setLockReleaseStep(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$a */
    static final class C53059a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C53058j f122024a;

        /* renamed from: b */
        final /* synthetic */ Context f122025b;

        static {
            Covode.recordClassIndex(62604);
        }

        C53059a(C53058j jVar, Context context) {
            this.f122024a = jVar;
            this.f122025b = context;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup.LayoutParams layoutParams = this.f122024a.f122007c.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null && num != null && num.intValue() != layoutParams2.bottomMargin) {
                layoutParams2.bottomMargin = num.intValue();
                this.f122024a.f122007c.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$h */
    static final class C53066h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C53058j f122035a;

        static {
            Covode.recordClassIndex(62611);
        }

        C53066h(C53058j jVar) {
            this.f122035a = jVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            IStoryView iStoryView;
            C89386u uVar = (C89386u) obj;
            if (uVar != null && (iStoryView = this.f122035a.f122012h) != null) {
                iStoryView.onActivityResult(((Number) uVar.getFirst()).intValue(), ((Number) uVar.getSecond()).intValue(), (Intent) uVar.getThird());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$j */
    static final class C53069j extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f122039a;

        static {
            Covode.recordClassIndex(62614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53069j(ActivityC0945e eVar) {
            super(1);
            this.f122039a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            ActivityC0945e eVar = this.f122039a;
            C530701 r1 = C530701.f122040a;
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(r1, "");
            AssemSupervisor assemSupervisor = assembler2.f30994a.get(eVar);
            if (assemSupervisor != null) {
                C12768r rVar = new C12768r();
                r1.invoke(rVar);
                AbstractC12770b b = rVar.mo20601a();
                Assembler.m22922a(rVar.f31057c, b, assemSupervisor.f30985g);
                assemSupervisor.mo20569a(b);
                assemSupervisor.mo20570b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final boolean mo89576c(boolean z) {
        IStoryPublishService storyPublishService = getStoryPublishService();
        Context context = getContext();
        C89219l.m154716b(context, "");
        boolean isPublishing = storyPublishService.isPublishing(context);
        if (isPublishing && z) {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            mo89571a(context2);
        }
        if (isPublishing) {
            return true;
        }
        ObjectAnimator objectAnimator = this.f122016l;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo89580e(boolean z) {
        int i;
        this.f122008d.setAlpha(1.0f);
        this.f122006b.setAlpha(1.0f);
        if (z) {
            i = 0;
        } else {
            i = this.f122009e & 53;
        }
        this.f122009e = i;
    }

    /* renamed from: b */
    public final void mo89574b(boolean z) {
        Fragment asFragment;
        IStoryView iStoryView;
        IStoryView iStoryView2 = this.f122012h;
        if (iStoryView2 != null && (asFragment = iStoryView2.asFragment()) != null) {
            if (asFragment.isDetached()) {
                EnterStoryParam enterStoryParam = this.f122017m;
                if (!(enterStoryParam == null || (iStoryView = this.f122012h) == null)) {
                    String str = this.f122011g.f121977a;
                    if (str == null) {
                        str = "unknown";
                    }
                    iStoryView.updateEnterStoryParam(EnterStoryParam.copy$default(enterStoryParam, null, this.f122011g.f121978b, str, false, false, this.f122010f, false, 89, null));
                }
                this.f122019o.getHostFragment().getChildFragmentManager().mo3552a().mo3477e(asFragment).mo3473c();
            } else if (!z) {
                IStoryView iStoryView3 = this.f122012h;
                if (iStoryView3 != null) {
                    iStoryView3.onOpenCompletely();
                }
                if (C53055h.f121998d) {
                    this.f122015k = true;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$b */
    static final class C53060b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C53058j f122026a;

        /* renamed from: b */
        final /* synthetic */ Context f122027b;

        static {
            Covode.recordClassIndex(62605);
        }

        C53060b(C53058j jVar, Context context) {
            this.f122026a = jVar;
            this.f122027b = context;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int left;
            ObjectAnimator objectAnimator;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                return;
            }
            if (bool.booleanValue()) {
                C53058j jVar = this.f122026a;
                ObjectAnimator objectAnimator2 = jVar.f122016l;
                if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = jVar.f122016l) == null)) {
                    objectAnimator.cancel();
                }
                Context context = jVar.getContext();
                C89219l.m154716b(context, "");
                boolean a = C23163i.m43663a(context);
                int sideBarViewWidth = jVar.getSideBarViewWidth();
                jVar.f122006b.setVisibility(0);
                if (a) {
                    left = jVar.getLeft() - (sideBarViewWidth / 2);
                } else {
                    left = jVar.getLeft() + (sideBarViewWidth / 2);
                }
                jVar.f122016l = ObjectAnimator.ofInt(jVar.f122019o, "fakeLeft", jVar.getLeft(), left, jVar.getLeft()).setDuration(1200L);
                ObjectAnimator objectAnimator3 = jVar.f122016l;
                if (objectAnimator3 != null) {
                    objectAnimator3.setRepeatCount(10);
                }
                ObjectAnimator objectAnimator4 = jVar.f122016l;
                if (objectAnimator4 != null) {
                    objectAnimator4.setRepeatMode(1);
                }
                ObjectAnimator objectAnimator5 = jVar.f122016l;
                if (objectAnimator5 != null) {
                    objectAnimator5.setInterpolator(new BounceInterpolator());
                }
                ObjectAnimator objectAnimator6 = jVar.f122016l;
                if (objectAnimator6 != null) {
                    objectAnimator6.start();
                }
                ObjectAnimator objectAnimator7 = jVar.f122016l;
                if (objectAnimator7 != null) {
                    objectAnimator7.addListener(new C53071k(jVar));
                    return;
                }
                return;
            }
            this.f122026a.mo89579e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$m */
    static final class C53073m extends AbstractC89220m implements AbstractC89183m<C53042b.EnumC53044b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53058j f122043a;

        static {
            Covode.recordClassIndex(62618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53073m(C53058j jVar) {
            super(2);
            this.f122043a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C53042b.EnumC53044b bVar, String str) {
            C53111e eVar;
            StorySidebarFeedVM storySidebarFeedVM;
            C53111e eVar2;
            C53042b.EnumC53044b bVar2 = bVar;
            String str2 = str;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(str2, "");
            int i = C53078k.f122050a[bVar2.ordinal()];
            if (i == 1) {
                StorySidebarFeedVM storySidebarFeedVM2 = this.f122043a.f122005a;
                if (!(storySidebarFeedVM2 == null || (eVar = storySidebarFeedVM2.f122080j) == null)) {
                    C89219l.m154721d(str2, "");
                    eVar.f122133a = str2;
                }
            } else if (!(i != 2 || (storySidebarFeedVM = this.f122043a.f122005a) == null || (eVar2 = storySidebarFeedVM.f122080j) == null)) {
                C89219l.m154721d(str2, "");
                eVar2.f122134b = str2;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m98056a(C53058j jVar, boolean z) {
        jVar.f122010f = z;
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = 0;
        if (jVar.getWidth() > 0) {
            if (jVar.f122010f) {
                cVar.element = jVar.getSideBarViewWidth();
            }
            jVar.mo89570a(cVar.element, false);
            return;
        }
        jVar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC53075o(jVar, cVar));
    }

    /* renamed from: a */
    public static Object m98055a(Activity activity, String str) {
        Object obj;
        MethodCollector.m26663i(3288);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3288);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.j$i */
    static final class C53067i extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends C53108b>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53058j f122036a;

        static {
            Covode.recordClassIndex(62612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53067i(C53058j jVar) {
            super(2);
            this.f122036a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends C53108b> aVar) {
            boolean z;
            StorySidebarFeedVM storySidebarFeedVM;
            C12776a<? extends C53108b> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar2, "");
            T t = aVar2.f31085a;
            final boolean z2 = t.f122122a;
            if (C89219l.m154714a((Object) this.f122036a.getDrawerViewModel().f121917a.getValue(), (Object) true) || (this.f122036a.f122009e & 2) != 0) {
                z = true;
                this.f122036a.f122013i = new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.homepage.story.container.C53058j.C53067i.RunnableC530681 */

                    /* renamed from: a */
                    final /* synthetic */ C53067i f122037a;

                    static {
                        Covode.recordClassIndex(62613);
                    }

                    {
                        this.f122037a = r1;
                    }

                    public final void run() {
                        C53058j.m98056a(this.f122037a.f122036a, z2);
                    }
                };
            } else {
                z = false;
                this.f122036a.f122013i = null;
                C53058j.m98056a(this.f122036a, z2);
            }
            if (C53078k.f122051b[t.f122123b.ordinal()] == 1 && (storySidebarFeedVM = this.f122036a.f122005a) != null) {
                storySidebarFeedVM.mo20662a(StorySidebarFeedVM.C53094k.f122106a);
            }
            C53055h.m98052a("StorySidebarContainer >>> hasData:" + this.f122036a.getHasData() + " , newData:" + z2 + " , needPending:" + z);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C53058j(Context context, C53048f fVar) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(fVar, "");
        ActivityC0945e eVar = null;
        MethodCollector.m26663i(3428);
        this.f122019o = fVar;
        this.f122020q = C89250i.m154773a((AbstractC89171a) new C53072l(context));
        this.f122021r = C89250i.m154773a((AbstractC89171a) new C53074n(context));
        this.f122011g = new C53042b(new C53073m(this));
        this.f122022s = C89250i.m154773a((AbstractC89171a) C53077q.f122049a);
        this.f122014j = new C89378p<>(false, null);
        this.f122023t = C89250i.m154773a((AbstractC89171a) C53076p.f122048a);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.a3u, this, true);
        View findViewById = findViewById(R.id.e12);
        C89219l.m154716b(findViewById, "");
        this.f122007c = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.e11);
        C89219l.m154716b(findViewById2, "");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.f122006b = viewGroup;
        viewGroup.getLayoutParams().width = getSideBarViewWidth();
        View findViewById3 = findViewById(R.id.cyt);
        C89219l.m154716b(findViewById3, "");
        this.f122008d = findViewById3;
        mo89578d(false);
        this.f122006b.setVisibility(4);
        ActivityC0945e eVar2 = context instanceof ActivityC0945e ? context : eVar;
        if (eVar2 != null) {
            C33403c.f79380p.observe(eVar2, new C53059a(this, context));
            getDrawerViewModel().f121920d.observe(eVar2, new C53060b(this, context));
            getDrawerViewModel().mo89467a(new C53061c(this, context));
            getDrawerViewModel().mo89467a(new C53062d(this, context));
            getHomeViewModel().mo89325a().observe(eVar2, new C53063e(this, context));
            MethodCollector.m26664o(3428);
            return;
        }
        MethodCollector.m26664o(3428);
    }

    /* renamed from: a */
    public final void mo89570a(int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof StepDrawerContainer.C53038c)) {
            layoutParams = null;
        }
        StepDrawerContainer.C53038c cVar = (StepDrawerContainer.C53038c) layoutParams;
        if (cVar != null) {
            int a = C0622a.m2312a(i, 0, getWidth());
            if (a == 0) {
                cVar.f121968a = null;
            } else {
                cVar.f121968a = new C89386u<>(Float.valueOf(((float) a) / ((float) getWidth())), Integer.valueOf(a), Boolean.valueOf(z));
            }
            if (cVar.f121968a != null || !z) {
                this.f122019o.mo89561a((C53048f) false, false, "set:StepSlideOffset");
            } else {
                this.f122019o.mo89561a((C53048f) true, false, "set:StepSlideOffset");
            }
        }
    }

    public /* synthetic */ C53058j(Context context, C53048f fVar, byte b) {
        this(context, fVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
