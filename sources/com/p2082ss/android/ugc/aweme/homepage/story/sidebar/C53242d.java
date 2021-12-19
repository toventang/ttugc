package com.p2082ss.android.ugc.aweme.homepage.story.sidebar;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.C53110d;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.p2082ss.android.ugc.aweme.main.IMainPageFragment;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79646c;
import com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.AbstractC76621c;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76619a;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76620b;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76626d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.p2082ss.android.ugc.aweme.story.userstory.C77693b;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d */
public final class C53242d extends AbstractC14534m<StorySidebarListVM> implements AbstractC53047e, IStoryPublishAnimateListener, AbstractC76618d, AbstractC90252i, AbstractC90253j {

    /* renamed from: l */
    public static boolean f122276l = true;

    /* renamed from: m */
    public static final C53244aa f122277m = new C53244aa((byte) 0);

    /* renamed from: j */
    final AbstractC89244h f122278j;

    /* renamed from: k */
    public boolean f122279k;

    /* renamed from: n */
    private final AbstractC89244h f122280n = C89250i.m154773a((AbstractC89171a) new C53246ac(this));

    /* renamed from: o */
    private final C12642a f122281o;

    /* renamed from: p */
    private final C12814b f122282p;

    /* renamed from: q */
    private final AbstractC89244h f122283q;

    /* renamed from: r */
    private final AbstractC89244h f122284r;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ah */
    public static final class C53251ah<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C53251ah f122294a = new C53251ah();

        static {
            Covode.recordClassIndex(62802);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$aq */
    static final class C53263aq extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C53263aq f122307a = new C53263aq();

        static {
            Covode.recordClassIndex(62814);
        }

        C53263aq() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_sidebar_list";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$l */
    public static final class C53274l extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {
        public static final C53274l INSTANCE = new C53274l();

        static {
            Covode.recordClassIndex(62825);
        }

        public C53274l() {
            super(1);
        }

        public final C53110d invoke(C53110d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$u */
    public static final class C53283u extends AbstractC89220m implements AbstractC89172b<C53297m, C53297m> {
        public static final C53283u INSTANCE = new C53283u();

        static {
            Covode.recordClassIndex(62834);
        }

        public C53283u() {
            super(1);
        }

        public final C53297m invoke(C53297m mVar) {
            C89219l.m154719c(mVar, "");
            return mVar;
        }
    }

    /* renamed from: D */
    private final DrawerViewModel m98221D() {
        return (DrawerViewModel) this.f122283q.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final IMainPageFragment mo89694A() {
        return (IMainPageFragment) this.f122284r.getValue();
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
    /* renamed from: a */
    public final void mo37186a(int i, boolean z, boolean z2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
    /* renamed from: b */
    public final void mo37187b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
    /* renamed from: b */
    public final void mo37188b(float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
    /* renamed from: c */
    public final void mo37189c() {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(364, new RunnableC90250g(C53242d.class, "onFeedRefreshEvent", C79646c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: w */
    public final PowerList mo23379w() {
        return (PowerList) this.f122280n.getValue();
    }

    /* renamed from: y */
    public final StorySidebarListVM mo23378v() {
        return (StorySidebarListVM) this.f122281o.getValue();
    }

    /* renamed from: z */
    public final StorySidebarFeedVM mo89699z() {
        return (StorySidebarFeedVM) this.f122282p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$aa */
    public static final class C53244aa {
        static {
            Covode.recordClassIndex(62795);
        }

        private C53244aa() {
        }

        public /* synthetic */ C53244aa(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$h */
    public static final class C53270h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122312a;

        static {
            Covode.recordClassIndex(62821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53270h(AbstractC12748a aVar) {
            super(0);
            this.f122312a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f122312a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$y */
    public static final class C53287y extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f122323a;

        static {
            Covode.recordClassIndex(62838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53287y(AbstractC1204m mVar) {
            super(0);
            this.f122323a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f122323a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
    /* renamed from: d */
    public final void mo37190d() {
        mo89696C();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ad */
    static final class C53247ad extends AbstractC89220m implements AbstractC89171a<IMainPageFragment> {

        /* renamed from: a */
        public static final C53247ad f122288a = new C53247ad();

        static {
            Covode.recordClassIndex(62798);
        }

        C53247ad() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IMainPageFragment invoke() {
            return MainPageFragmentImpl.m43110j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$d */
    public static final class C53266d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53266d INSTANCE = new C53266d();

        static {
            Covode.recordClassIndex(62817);
        }

        public C53266d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$g */
    public static final class C53269g extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53269g INSTANCE = new C53269g();

        static {
            Covode.recordClassIndex(62820);
        }

        public C53269g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$i */
    public static final class C53271i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122313a;

        static {
            Covode.recordClassIndex(62822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53271i(AbstractC12748a aVar) {
            super(0);
            this.f122313a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f122313a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$j */
    public static final class C53272j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122314a;

        static {
            Covode.recordClassIndex(62823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53272j(AbstractC12748a aVar) {
            super(0);
            this.f122314a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f122314a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$n */
    public static final class C53276n extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53276n INSTANCE = new C53276n();

        static {
            Covode.recordClassIndex(62827);
        }

        public C53276n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$q */
    public static final class C53279q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53279q INSTANCE = new C53279q();

        static {
            Covode.recordClassIndex(62830);
        }

        public C53279q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$t */
    public static final class C53282t extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53282t INSTANCE = new C53282t();

        static {
            Covode.recordClassIndex(62833);
        }

        public C53282t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$x */
    public static final class C53286x extends AbstractC89220m implements AbstractC89171a<C12874b<C53297m>> {
        public static final C53286x INSTANCE = new C53286x();

        static {
            Covode.recordClassIndex(62837);
        }

        public C53286x() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53297m> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$z */
    public static final class C53288z extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53288z INSTANCE = new C53288z();

        static {
            Covode.recordClassIndex(62839);
        }

        public C53288z() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ab */
    static final class C53245ab extends AbstractC89220m implements AbstractC89171a<DrawerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122286a;

        static {
            Covode.recordClassIndex(62796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53245ab(C53242d dVar) {
            super(0);
            this.f122286a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DrawerViewModel invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122286a);
            if (b != null) {
                return DrawerViewModel.C53032a.m97961a(b);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ac */
    static final class C53246ac extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122287a;

        static {
            Covode.recordClassIndex(62797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53246ac(C53242d dVar) {
            super(0);
            this.f122287a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            return this.f122287a.mo20528t().findViewById(R.id.f_y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$al */
    static final class C53256al extends AbstractC89220m implements AbstractC89171a<IAVPublishService> {

        /* renamed from: a */
        public static final C53256al f122300a = new C53256al();

        static {
            Covode.recordClassIndex(62807);
        }

        C53256al() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAVPublishService invoke() {
            return AVExternalServiceImpl.m113114a().publishService();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$k */
    public static final class C53273k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122315a;

        static {
            Covode.recordClassIndex(62824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53273k(AbstractC12748a aVar) {
            super(0);
            this.f122315a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f122315a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$m */
    public static final class C53275m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122316a;

        static {
            Covode.recordClassIndex(62826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53275m(AbstractC12748a aVar) {
            super(0);
            this.f122316a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f122316a.bD_().f30985g;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateFinish() {
        mo23378v().mo89685a(1.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateStart() {
        mo23378v().mo89685a(0.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$a */
    public static final class C53243a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f122285a;

        static {
            Covode.recordClassIndex(62794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53243a(AbstractC89277c cVar) {
            super(0);
            this.f122285a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f122285a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$b */
    public static final class C53264b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122308a;

        static {
            Covode.recordClassIndex(62815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53264b(AbstractC12748a aVar) {
            super(0);
            this.f122308a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122308a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$c */
    public static final class C53265c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122309a;

        static {
            Covode.recordClassIndex(62816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53265c(AbstractC12748a aVar) {
            super(0);
            this.f122309a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122309a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$o */
    public static final class C53277o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122317a;

        static {
            Covode.recordClassIndex(62828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53277o(AbstractC12748a aVar) {
            super(0);
            this.f122317a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122317a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$p */
    public static final class C53278p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122318a;

        static {
            Covode.recordClassIndex(62829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53278p(AbstractC12748a aVar) {
            super(0);
            this.f122318a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122318a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$r */
    public static final class C53280r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122319a;

        static {
            Covode.recordClassIndex(62831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53280r(AbstractC12748a aVar) {
            super(0);
            this.f122319a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122319a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$s */
    public static final class C53281s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122320a;

        static {
            Covode.recordClassIndex(62832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53281s(AbstractC12748a aVar) {
            super(0);
            this.f122320a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122320a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$v */
    public static final class C53284v extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122321a;

        static {
            Covode.recordClassIndex(62835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53284v(AbstractC12748a aVar) {
            super(0);
            this.f122321a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122321a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$w */
    public static final class C53285w extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122322a;

        static {
            Covode.recordClassIndex(62836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53285w(AbstractC12748a aVar) {
            super(0);
            this.f122322a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122322a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    static {
        Covode.recordClassIndex(62793);
    }

    /* renamed from: B */
    public final void mo89695B() {
        mo23378v().mo89686a(mo89699z().f122083m.f122124a, mo89699z().mo23343h());
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        C80298cg.m139205b(this);
        StoryPublishServiceImpl.m135314a().removePublishAnimateListener(this);
        mo23378v().f122237n = null;
        DrawerViewModel D = m98221D();
        if (D != null) {
            D.mo89468b(this);
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: x */
    public final C17693c mo23380x() {
        C17693c cVar = new C17693c();
        cVar.f42320b = false;
        cVar.f42319a = 8;
        return cVar.mo28182a(LoadingFooterCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$e */
    public static final class C53267e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122310a;

        static {
            Covode.recordClassIndex(62818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53267e(AbstractC12748a aVar) {
            super(0);
            this.f122310a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122310a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$f */
    public static final class C53268f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122311a;

        static {
            Covode.recordClassIndex(62819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53268f(AbstractC12748a aVar) {
            super(0);
            this.f122311a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122311a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: C */
    public final void mo89696C() {
        int k;
        int m;
        RecyclerView.AbstractC1362i layoutManager = mo23379w().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && (k = linearLayoutManager.mo4371k()) != -1 && k <= (m = linearLayoutManager.mo4373m())) {
            while (true) {
                RecyclerView.ViewHolder f = mo23379w().mo4451f(k);
                if (!(f instanceof StorySidebarListCell)) {
                    f = null;
                }
                StorySidebarListCell storySidebarListCell = (StorySidebarListCell) f;
                if (storySidebarListCell != null) {
                    storySidebarListCell.mo89674a("story_show");
                }
                if (k != m) {
                    k++;
                } else {
                    return;
                }
            }
        }
    }

    public C53242d() {
        C12814b bVar;
        C53263aq aqVar = C53263aq.f122307a;
        this.f122281o = new C12642a(C89204ab.m154669a(StorySidebarListVM.class), aqVar, C53286x.INSTANCE, new C53287y(this), C53288z.INSTANCE, C53283u.INSTANCE, new C53284v(this), new C53285w(this));
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(StorySidebarFeedVM.class);
        C53243a aVar2 = new C53243a(a);
        C53274l lVar = C53274l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C53276n.INSTANCE, new C53277o(this), new C53278p(this), C53279q.INSTANCE, lVar, new C53280r(this), new C53281s(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C53282t.INSTANCE, new C53264b(this), new C53265c(this), C53266d.INSTANCE, lVar, new C53267e(this), new C53268f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C53269g.INSTANCE, new C53270h(this), new C53271i(this), new C53272j(this), lVar, new C53273k(this), new C53275m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f122282p = bVar;
        this.f122283q = C89250i.m154773a((AbstractC89171a) new C53245ab(this));
        this.f122284r = C89250i.m154773a((AbstractC89171a) C53247ad.f122288a);
        this.f122278j = C89250i.m154773a((AbstractC89171a) C53256al.f122300a);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        AbstractC89277c a;
        super.mo20518f();
        C80298cg.m139204a(this);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        AbstractC89290k[] kVarArr = new AbstractC89290k[0];
        C77693b bVar = C77693b.f174258c;
        if (C89219l.m154714a(C89204ab.m154669a(C76619a.class), C89204ab.m154669a(C76620b.class))) {
            a = C89204ab.m154669a(C76620b.class);
        } else {
            a = C89204ab.m154669a(C76619a.class);
        }
        StoryReceiver storyReceiver = new StoryReceiver(curUserId, this, bVar);
        if (C89219l.m154714a(a, C89204ab.m154669a(C76620b.class))) {
            bVar.mo120328a((AbstractC76618d) this, storyReceiver);
        }
        AbstractC88412b a2 = bVar.mo120326a().mo143268a(new C53248ae(curUserId, bVar)).mo143292d(new C53249af(kVarArr)).mo143263a(bVar.f171955b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C53250ag(this, curUserId), C53251ah.f122294a);
        C89219l.m154716b(a2, "");
        C76626d.m134214a(a2, storyReceiver);
        StoryPublishServiceImpl.m135314a().addPublishAnimateListener(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateUpdate(float f) {
        mo23378v().mo89685a(f);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$af */
    public static final class C53249af<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k[] f122291a;

        static {
            Covode.recordClassIndex(62800);
        }

        public C53249af(AbstractC89290k[] kVarArr) {
            this.f122291a = kVarArr;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            return AbstractC76621c.C76622a.m134212a(aVar.f171957a, aVar.f171958b, aVar.f171959c, this.f122291a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ao */
    static final class C53259ao extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122303a;

        static {
            Covode.recordClassIndex(62810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53259ao(C53242d dVar) {
            super(1);
            this.f122303a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            C53242d.m22977a(this.f122303a.mo23378v(), new AbstractC89172b<C53297m, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.homepage.story.sidebar.C53242d.C53259ao.C532601 */

                /* renamed from: a */
                final /* synthetic */ C53259ao f122304a;

                static {
                    Covode.recordClassIndex(62811);
                }

                {
                    this.f122304a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C53297m mVar) {
                    C53297m mVar2 = mVar;
                    C89219l.m154721d(mVar2, "");
                    List<ITEM> list = mVar2.f122332a.f35099d;
                    if (list != null && !list.isEmpty() && this.f122304a.f122303a.f122279k) {
                        this.f122304a.f122303a.mo20528t().post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.homepage.story.sidebar.C53242d.C53259ao.C532601.RunnableC532611 */

                            /* renamed from: a */
                            final /* synthetic */ C532601 f122305a;

                            static {
                                Covode.recordClassIndex(62812);
                            }

                            {
                                this.f122305a = r1;
                            }

                            public final void run() {
                                this.f122305a.f122304a.f122303a.mo23379w().mo4413b(0);
                            }
                        });
                        this.f122304a.f122303a.f122279k = false;
                    }
                    this.f122304a.f122303a.mo89696C();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ae */
    public static final class C53248ae<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ Object f122289a;

        /* renamed from: b */
        final /* synthetic */ AbstractC76621c f122290b;

        static {
            Covode.recordClassIndex(62799);
        }

        public C53248ae(Object obj, AbstractC76621c cVar) {
            this.f122289a = obj;
            this.f122290b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            if (!C89219l.m154714a(this.f122290b.mo120327a((Object) aVar.f171958b, (Object) aVar.f171959c), this.f122289a) || !(!aVar.f171957a.isEmpty())) {
                return false;
            }
            return true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onFeedRefreshEvent(C79646c cVar) {
        String str = "";
        C89219l.m154721d(cVar, str);
        int i = cVar.f178729a;
        if (i == 0) {
            str = "pull down in feed";
        } else if (i == 1) {
            str = "home tab in feed";
        } else if (i == 2) {
            str = "for you in feed";
        }
        if (C80537hk.m139613a(str)) {
            mo89699z().mo89615a(str);
            this.f122279k = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ag */
    public static final class C53250ag<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C53242d f122292a;

        /* renamed from: b */
        final /* synthetic */ String f122293b;

        static {
            Covode.recordClassIndex(62801);
        }

        public C53250ag(C53242d dVar, String str) {
            this.f122292a = dVar;
            this.f122293b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int intValue;
            List i;
            Aweme clone = ((AbstractC76621c.C76622a) obj).f171959c.clone();
            C89219l.m154716b(clone, "");
            UserStory userStory = clone.getUserStory();
            if (userStory != null && C76706a.m134273a(userStory)) {
                StorySidebarListVM y = this.f122292a.mo23378v();
                String str = this.f122293b;
                C89219l.m154716b(str, "");
                C89219l.m154721d(str, "");
                List i2 = y.mo23344i();
                if (i2 != null) {
                    Iterator it = i2.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        } else if (C89219l.m154714a((Object) str, (Object) ((C53296l) it.next()).f122331a.getAuthorUid())) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i3);
                    if (valueOf != null && (intValue = valueOf.intValue()) >= 0 && (i = this.f122292a.mo23378v().mo23344i()) != null && intValue < i.size()) {
                        this.f122292a.mo23378v().mo23332a(intValue);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        mo23379w().mo28083a(StorySidebarListCell.class);
        mo23379w().setItemAnimator(null);
        super.mo20630b(view);
        AbstractC12818f.C12819a.m23063a(this, mo89699z(), C53289e.f122324a, (C12854k) null, new C53252ai(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo89699z(), C53290f.f122325a, (C12854k) null, new C53253aj(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo89699z(), C53291g.f122326a, C12856l.m23100a(), new C53255ak(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C53293i.f122328a, (C12854k) null, new C53258an(this), 6);
        AssemViewModel.m23030a(mo23378v(), C53294j.f122329a, null, null, null, new C53259ao(this), 14);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C53295k.f122330a, (C12854k) null, new C53262ap(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C53292h.f122327a, C12856l.m23100a(), new C53257am(this), 4);
        if (f122276l) {
            f122276l = false;
        } else {
            mo89699z().mo89615a("hot start");
        }
        DrawerViewModel D = m98221D();
        if (D != null) {
            D.mo89467a(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ak */
    static final class C53255ak extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122299a;

        static {
            Covode.recordClassIndex(62806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53255ak(C53242d dVar) {
            super(2);
            this.f122299a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends String> aVar) {
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar, "");
            this.f122299a.f122279k = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$aj */
    static final class C53253aj extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122296a;

        static {
            Covode.recordClassIndex(62804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53253aj(C53242d dVar) {
            super(2);
            this.f122296a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
            final int intValue = num.intValue();
            C89219l.m154721d(pVar, "");
            AbstractC12766p.m22977a(this.f122296a.mo89699z(), new AbstractC89172b<C53110d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.homepage.story.sidebar.C53242d.C53253aj.C532541 */

                /* renamed from: a */
                final /* synthetic */ C53253aj f122297a;

                static {
                    Covode.recordClassIndex(62805);
                }

                {
                    this.f122297a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C53110d dVar) {
                    C53110d dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    int i = intValue;
                    if ((i & 2) > 0) {
                        if (i == 6) {
                            this.f122297a.f122296a.mo23378v().f122238o.clear();
                        }
                        if (dVar2.f122127a == 1) {
                            this.f122297a.f122296a.mo89695B();
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$am */
    static final class C53257am extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122301a;

        static {
            Covode.recordClassIndex(62808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53257am(C53242d dVar) {
            super(2);
            this.f122301a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Integer> aVar) {
            C12776a<? extends Integer> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2.f31085a.intValue() == 0) {
                StorySidebarListVM y = this.f122301a.mo23378v();
                if (y.mo89688j()) {
                    y.mo23339a(Long.valueOf(y.f122236m));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ap */
    static final class C53262ap extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122306a;

        static {
            Covode.recordClassIndex(62813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53262ap(C53242d dVar) {
            super(2);
            this.f122306a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(pVar, "");
            int b = this.f122306a.mo23379w().getState().mo28134b();
            if (intValue >= 0 && b > intValue) {
                this.f122306a.mo23379w().mo4413b(intValue);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$ai */
    static final class C53252ai extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122295a;

        static {
            Covode.recordClassIndex(62803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53252ai(C53242d dVar) {
            super(2);
            this.f122295a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
            ActivityC0945e b;
            int intValue = num.intValue();
            C89219l.m154721d(pVar, "");
            C53242d dVar = this.f122295a;
            if (intValue == 1) {
                dVar.mo89695B();
                if (!dVar.mo89699z().mo89618a(true)) {
                    dVar.mo89699z().mo89615a("cache expired upon open sidebar");
                }
            }
            if (((IAVPublishService) dVar.f122278j.getValue()).isPublishing() && (b = C12777b.m23004b(dVar)) != null) {
                if (intValue == 1) {
                    dVar.mo89694A().mo37204a(b);
                } else if (intValue == 0) {
                    dVar.mo89694A().mo37209b(b);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$an */
    static final class C53258an extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C14515a<C53296l>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53242d f122302a;

        static {
            Covode.recordClassIndex(62809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53258an(C53242d dVar) {
            super(2);
            this.f122302a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C14515a<C53296l> aVar) {
            ArrayList arrayList;
            C14515a<C53296l> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            if (this.f122302a.mo89699z().mo23342g()) {
                List<ITEM> list = aVar2.f35099d;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a(list, 10));
                    for (ITEM item : list) {
                        arrayList2.add(item.f122331a);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = C89086z.INSTANCE;
                }
                this.f122302a.mo89699z().mo89616a(arrayList);
            }
            return C89391z.f203057a;
        }
    }
}
