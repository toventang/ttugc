package com.p2082ss.android.ugc.aweme.story.feed.common;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33946d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.metrics.C59240f;
import com.p2082ss.android.ugc.aweme.p2340at.C33968k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C77157f;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76619a;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76620b;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76626d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.p2082ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.p2082ss.android.ugc.aweme.story.feed.common.p4044a.C77189a;
import com.p2082ss.android.ugc.aweme.story.feed.common.p4045b.C77191a;
import com.p2082ss.android.ugc.aweme.story.feed.p4046ui.progress.StoryListProgressBar;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77302g;
import com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a;
import com.p2082ss.android.ugc.aweme.story.interaction.p4058c.C77311c;
import com.p2082ss.android.ugc.aweme.story.interaction.p4058c.C77315d;
import com.p2082ss.android.ugc.aweme.story.interaction.p4058c.C77318e;
import com.p2082ss.android.ugc.aweme.story.interaction.p4058c.C77320f;
import com.p2082ss.android.ugc.aweme.story.p4019b.AbstractC76591a;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76593c;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76603m;
import com.p2082ss.android.ugc.aweme.story.p4019b.EnumC76597g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76677d;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a;
import com.p2082ss.android.ugc.aweme.story.userstory.C77693b;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.C77698b;
import com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a;
import com.p2082ss.android.ugc.aweme.story.view.ReactionBubbleList;
import com.p2082ss.android.ugc.aweme.story.view.StoryHeaderView;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.trill.R;
import dmt.viewpager.DmtRtlViewPager;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.d */
public final class C77203d extends AbstractC77188a implements AbstractC1214u<C33942b> {

    /* renamed from: s */
    public static final C77206a f173198s = new C77206a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f173199A;

    /* renamed from: B */
    private final int f173200B;

    /* renamed from: C */
    private AbstractC77307a f173201C;

    /* renamed from: D */
    private final boolean f173202D;

    /* renamed from: E */
    private boolean f173203E;

    /* renamed from: F */
    private ViewPager.C1582h f173204F;

    /* renamed from: n */
    public final Context f173205n;

    /* renamed from: o */
    public final View f173206o;

    /* renamed from: p */
    public final StoryListProgressBar f173207p;

    /* renamed from: q */
    public final C77201c f173208q;

    /* renamed from: r */
    public boolean f173209r;

    /* renamed from: t */
    private StoryHeaderView f173210t;

    /* renamed from: u */
    private final C49812b f173211u;

    /* renamed from: v */
    private ReactionBubbleList f173212v;

    /* renamed from: w */
    private final AbstractC89244h f173213w;

    /* renamed from: x */
    private boolean f173214x;

    /* renamed from: y */
    private final AbstractC80347dl f173215y = new C77210e(this);

    /* renamed from: z */
    private final AbstractC49691s<C49672ag> f173216z;

    static {
        Covode.recordClassIndex(90215);
    }

    /* renamed from: m */
    public final StoryFeedViewModel mo120824m() {
        return (StoryFeedViewModel) this.f173213w.getValue();
    }

    /* renamed from: n */
    public final DmtRtlViewPager mo120825n() {
        return (DmtRtlViewPager) this.f173199A.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$a */
    public static final class C77206a {
        static {
            Covode.recordClassIndex(90218);
        }

        private C77206a() {
        }

        public /* synthetic */ C77206a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: h */
    public final AbstractC77713a mo80278h() {
        return this.f173212v;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public final void mo80268a(Aweme aweme, int i) {
        AbstractC89277c a;
        C89219l.m154721d(aweme, "");
        super.mo80268a(aweme, i);
        this.f173153b = null;
        this.f173163l.clear();
        C76598h.m134185b("auto");
        this.f173209r = true;
        UserStory userStory = aweme.getUserStory();
        if (userStory != null) {
            C89219l.m154716b(userStory, "");
            C77260g gVar = C77260g.f173332a;
            String str = this.f173164m.f111753j;
            C49812b bVar = this.f173164m.f111748e.param;
            C89219l.m154716b(bVar, "");
            mo80269a(gVar.mo120137a(str, bVar.getFrom()));
            this.f173158g = userStory;
            mo120824m();
            mo120800c(StoryFeedViewModel.m134856a(aweme));
            StoryFeedViewModel m = mo120824m();
            String str2 = this.f173161j;
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(str2, "");
            UserStory userStory2 = aweme.getUserStory();
            if (userStory2 != null) {
                C89219l.m154716b(userStory2, "");
                m.f173109c.put(str2, aweme);
                if (m.mo120792g(str2)) {
                    m.mo120782a(str2, userStory2);
                    C77698b.m135721a(new StoryFeedViewModel.C77176h(userStory2));
                }
                m.mo120790f(str2);
                C89219l.m154721d(str2, "");
                if (StoryFeedViewModel.m134861h(str2) && !m.f173113g && !m.mo120791f() && !m.mo120787d()) {
                    AbstractC89290k[] kVarArr = new AbstractC89290k[0];
                    C77693b bVar2 = C77693b.f174258c;
                    if (C89219l.m154714a(C89204ab.m154669a(C76620b.class), C89204ab.m154669a(C76620b.class))) {
                        a = C89204ab.m154669a(C76620b.class);
                    } else {
                        a = C89204ab.m154669a(C76619a.class);
                    }
                    StoryReceiver storyReceiver = new StoryReceiver(str2, m, bVar2);
                    if (C89219l.m154714a(a, C89204ab.m154669a(C76620b.class))) {
                        bVar2.mo120328a((AbstractC76618d) m, storyReceiver);
                    }
                    AbstractC88412b a2 = bVar2.mo120326a().mo143268a(new StoryFeedViewModel.C77177i(str2, bVar2)).mo143292d(new StoryFeedViewModel.C77178j(kVarArr)).mo143263a(bVar2.f171955b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new StoryFeedViewModel.C77179k(m, str2), StoryFeedViewModel.C77182l.f173145a);
                    C89219l.m154716b(a2, "");
                    C76626d.m134214a(a2, storyReceiver);
                    m.f173113g = true;
                }
            }
            this.f173157f = aweme;
            this.f173155d = i;
            List<Aweme> d = mo120824m().mo120786d(this.f173161j);
            if (d != null) {
                int a3 = mo120824m().mo120779a(this.f173161j, (List<? extends Aweme>) d);
                this.f173208q.mo80286a(d);
                if (d.size() > 0 && a3 >= 0) {
                    this.f173203E = true;
                    DmtRtlViewPager n = mo120825n();
                    C89219l.m154716b(n, "");
                    n.setCurrentItem(a3);
                    if (this.f173203E) {
                        mo120795a(i, false);
                    }
                }
                this.f173207p.mo120843a(d.size());
            }
            this.f173209r = false;
            mo120797a(new C77207b(aweme, i));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77188a, com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public final void mo80269a(EnumC76739a aVar) {
        Story story;
        C89219l.m154721d(aVar, "");
        C77201c cVar = this.f173208q;
        DmtRtlViewPager n = mo120825n();
        C89219l.m154716b(n, "");
        Aweme c = cVar.mo80287c(n.getCurrentItem());
        if (c == null || (story = c.getStory()) == null || !story.isPublishing()) {
            super.mo80269a(aVar);
        } else {
            mo120798b(EnumC76739a.LOOP_CURRENT_VIDEO);
        }
    }

    /* renamed from: o */
    public final boolean mo120826o() {
        if (this.f173164m.f111756m == 12) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$k */
    static final class C77216k extends AbstractC89220m implements AbstractC89171a<DmtRtlViewPager> {

        /* renamed from: a */
        final /* synthetic */ C77203d f173236a;

        static {
            Covode.recordClassIndex(90228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77216k(C77203d dVar) {
            super(0);
            this.f173236a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtRtlViewPager invoke() {
            View view = this.f173236a.f173206o;
            C89219l.m154716b(view, "");
            return view.findViewById(R.id.fh7);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77188a
    /* renamed from: k */
    public final int mo120802k() {
        if (mo120824m().mo120785c(this.f173161j)) {
            return this.f173208q.getCount() - 1;
        }
        return this.f173208q.getCount();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo120828q() {
        if (mo120824m().mo120780a().isRunning()) {
            mo120824m().mo120780a().cancel();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77188a
    /* renamed from: l */
    public final int mo120803l() {
        int count;
        int currentItem;
        if (mo120824m().mo120785c(this.f173161j)) {
            count = this.f173208q.getCount() - 2;
            DmtRtlViewPager n = mo120825n();
            C89219l.m154716b(n, "");
            currentItem = n.getCurrentItem();
        } else {
            count = this.f173208q.getCount() - 1;
            DmtRtlViewPager n2 = mo120825n();
            C89219l.m154716b(n2, "");
            currentItem = n2.getCurrentItem();
        }
        return count - currentItem;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$c */
    public static final class C77208c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77203d f173223a;

        /* renamed from: b */
        final /* synthetic */ Aweme f173224b;

        static {
            Covode.recordClassIndex(90220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77208c(C77203d dVar, Aweme aweme) {
            super(0);
            this.f173223a = dVar;
            this.f173224b = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C59240f f = new C59240f().mo96797a(this.f173223a.f173164m.f111753j).mo96749g(this.f173224b);
            String str = "";
            if (this.f173224b.getAuthor() != null) {
                User author = this.f173224b.getAuthor();
                C89219l.m154716b(author, str);
                str = author.getUid();
            }
            f.f135190b = str;
            f.f135222V = C76598h.m134176a(this.f173224b.getAuthor());
            f.f135199u = true;
            f.f135200v = C76706a.m134276b(this.f173224b);
            f.mo96792f();
            DataCenter dataCenter = this.f173223a.f111526a;
            if (dataCenter != null) {
                dataCenter.mo60191a("video_share_click", (Object) null);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$l */
    static final class C77217l extends AbstractC89220m implements AbstractC89171a<StoryFeedViewModel> {

        /* renamed from: a */
        final /* synthetic */ C48238ce f173237a;

        static {
            Covode.recordClassIndex(90229);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77217l(C48238ce ceVar) {
            super(0);
            this.f173237a = ceVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryFeedViewModel invoke() {
            AbstractC1174ac a;
            Fragment fragment = this.f173237a.f111746c;
            Fragment fragment2 = this.f173237a.f111746c;
            C49812b bVar = this.f173237a.f111748e.param;
            C89219l.m154716b(bVar, "");
            C89219l.m154721d(fragment, "");
            C89219l.m154721d(fragment2, "");
            C89219l.m154721d(bVar, "");
            C77228o oVar = new C77228o(fragment, bVar);
            C33946d.m69513a(C33946d.m69512a(fragment));
            C1175ad adVar = new C1175ad(fragment2.getViewModelStore(), oVar);
            String eventType = bVar.getEventType();
            if (StoryFeedViewModel.class.equals(ScopeViewModel.class)) {
                a = adVar.mo3984a(eventType, StoryFeedViewModel.class);
            } else {
                a = adVar.mo3984a(eventType, StoryFeedViewModel.class);
                C1171ab.m3870a(a, adVar);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: d */
    public final AbstractC48149ai mo80274d() {
        DmtRtlViewPager n = mo120825n();
        C89219l.m154716b(n, "");
        if (m134971a(n.getCurrentItem(), this.f173153b)) {
            return this.f173153b;
        }
        DmtRtlViewPager n2 = mo120825n();
        C89219l.m154716b(n2, "");
        for (int childCount = n2.getChildCount() - 1; childCount >= 0; childCount--) {
            Object tag = mo120825n().getChildAt(childCount).getTag(R.id.b0u);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            AbstractC48149ai aiVar = (AbstractC48149ai) tag;
            DmtRtlViewPager n3 = mo120825n();
            C89219l.m154716b(n3, "");
            if (m134971a(n3.getCurrentItem(), aiVar)) {
                UserStory userStory = this.f173158g;
                if (userStory != null) {
                    DmtRtlViewPager n4 = mo120825n();
                    C89219l.m154716b(n4, "");
                    int currentItem = n4.getCurrentItem();
                    mo120824m();
                    C77229p.m135002a(this.f173161j, userStory, Integer.valueOf(currentItem), this.f173208q.mo80287c(currentItem));
                }
                return aiVar;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: f */
    public final void mo80276f() {
        AbstractC48148ah v;
        int count = this.f173208q.getCount();
        if (count > 0) {
            C76598h.m134185b("click");
            DmtRtlViewPager n = mo120825n();
            C89219l.m154716b(n, "");
            if (n.getCurrentItem() + 1 < count) {
                AbstractC48149ai aiVar = this.f173153b;
                if (!((aiVar == null && (aiVar = mo80274d()) == null) || (v = aiVar.mo80231v()) == null)) {
                    v.mo80185aa();
                }
                DmtRtlViewPager n2 = mo120825n();
                DmtRtlViewPager n3 = mo120825n();
                C89219l.m154716b(n3, "");
                n2.mo61355a(n3.getCurrentItem() + 1, false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: g */
    public final void mo80277g() {
        AbstractC48148ah v;
        if (this.f173208q.getCount() > 0) {
            C76598h.m134185b("click");
            DmtRtlViewPager n = mo120825n();
            C89219l.m154716b(n, "");
            if (n.getCurrentItem() - 1 >= 0) {
                AbstractC48149ai aiVar = this.f173153b;
                if (!((aiVar == null && (aiVar = mo80274d()) == null) || (v = aiVar.mo80231v()) == null)) {
                    v.mo80185aa();
                }
                DmtRtlViewPager n2 = mo120825n();
                DmtRtlViewPager n3 = mo120825n();
                C89219l.m154716b(n3, "");
                n2.mo61355a(n3.getCurrentItem() - 1, false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: i */
    public final void mo80279i() {
        super.mo80279i();
        mo120801d("story_collection_play_end");
        DmtRtlViewPager n = mo120825n();
        C89219l.m154716b(n, "");
        for (int childCount = n.getChildCount() - 1; childCount >= 0; childCount--) {
            Object tag = mo120825n().getChildAt(childCount).getTag(R.id.b0u);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            ((AbstractC48149ai) tag).mo70620j();
        }
        AbstractC80321cz b = C80330da.C80331a.m139267b("story_horizontally_viewpager");
        if (b != null) {
            b.mo123701c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77188a, com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: e */
    public final void mo80275e() {
        int a;
        mo120825n().mo61358b(this.f173204F);
        AbstractC80321cz b = C80330da.C80331a.m139267b("story_horizontally_viewpager");
        if (b != null) {
            b.mo123701c();
        }
        this.f173214x = false;
        AbstractC77307a aVar = this.f173201C;
        if (aVar != null) {
            aVar.mo120910c();
        }
        mo120801d("story_collection_play_end");
        if (mo120824m().mo120783b() || mo120824m().mo120784c()) {
            mo120824m();
            if (StoryFeedViewModel.m134861h(this.f173161j) && (a = mo120824m().mo120779a(this.f173161j, (List<? extends Aweme>) this.f173208q.mo80288e())) >= 0) {
                mo120825n().mo61355a(a, false);
            }
        }
        mo120828q();
        super.mo80275e();
    }

    /* renamed from: p */
    public final void mo120827p() {
        int count = this.f173208q.getCount();
        if (count > 0) {
            int i = C77218e.f173239b[this.f173154c.ordinal()];
            if (i == 2) {
                DmtRtlViewPager n = mo120825n();
                C89219l.m154716b(n, "");
                if (n.getCurrentItem() + 1 >= count) {
                    DmtRtlViewPager n2 = mo120825n();
                    C89219l.m154716b(n2, "");
                    n2.setCurrentItem(0);
                    mo120796a(EnumC76597g.ON_SHOULD_SCROLL_TO_NEXT_USER, (AbstractC76591a) null);
                    DataCenter dataCenter = this.f111526a;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("on_should_scroll_to_next_user", (Object) null);
                        return;
                    }
                    return;
                }
            } else if (i == 3) {
                DmtRtlViewPager n3 = mo120825n();
                C89219l.m154716b(n3, "");
                if (n3.getCurrentItem() + 1 >= count) {
                    mo120825n().mo61355a(0, false);
                    return;
                }
            } else if (i == 4) {
                DmtRtlViewPager n4 = mo120825n();
                C89219l.m154716b(n4, "");
                if (n4.getCurrentItem() + 1 >= count) {
                    ActivityC0945e activity = this.f173164m.f111746c.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            DmtRtlViewPager n5 = mo120825n();
            DmtRtlViewPager n6 = mo120825n();
            C89219l.m154716b(n6, "");
            n5.mo61355a(n6.getCurrentItem() + 1, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public final void mo80266a() {
        super.mo80266a();
        this.f173157f = null;
        AbstractC77307a aVar = this.f173201C;
        if (aVar != null) {
            aVar.mo120910c();
        }
        this.f173201C = null;
        this.f173153b = null;
        this.f173208q.mo80286a(C89086z.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$d */
    public static final class C77209d implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C77203d f173225a;

        /* renamed from: b */
        private int f173226b;

        static {
            Covode.recordClassIndex(90221);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77209d(C77203d dVar) {
            this.f173225a = dVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            C77203d dVar = this.f173225a;
            dVar.mo120795a(i, !dVar.f173209r);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            AbstractC48148ah v;
            this.f173226b = i;
            if (i == 1) {
                AbstractC48149ai aiVar = this.f173225a.f173153b;
                if (!((aiVar == null && (aiVar = this.f173225a.mo80274d()) == null) || (v = aiVar.mo80231v()) == null)) {
                    v.mo80185aa();
                }
                this.f173225a.mo80269a(EnumC76739a.LOOP_CURRENT_VIDEO);
            } else if (i == 0) {
                C77203d dVar = this.f173225a;
                C77260g gVar = C77260g.f173332a;
                String str = this.f173225a.f173164m.f111753j;
                C49812b bVar = this.f173225a.f173164m.f111748e.param;
                C89219l.m154716b(bVar, "");
                dVar.mo80269a(gVar.mo120137a(str, bVar.getFrom()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$e */
    public static final class C77210e implements AbstractC80347dl {

        /* renamed from: a */
        final /* synthetic */ C77203d f173227a;

        static {
            Covode.recordClassIndex(90222);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl
        /* renamed from: b */
        public final void mo70709b(String str) {
            C89219l.m154721d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77210e(C77203d dVar) {
            this.f173227a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl
        /* renamed from: a */
        public final void mo70708a(String str) {
            C89219l.m154721d(str, "");
            AbstractC80321cz b = C80330da.C80331a.m139267b(str);
            if (b != null) {
                String str2 = this.f173227a.f173159h;
                C89219l.m154716b(str2, "");
                b.mo123696a("enter_from", str2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$h */
    public static final class C77213h extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ AbstractC80321cz f173232a;

        static {
            Covode.recordClassIndex(90225);
        }

        C77213h(AbstractC80321cz czVar) {
            this.f173232a = czVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f173232a.mo123700b();
            } else if (i != 1) {
                this.f173232a.mo123697a();
            } else {
                this.f173232a.mo123697a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$f */
    static final class C77211f extends AbstractC89220m implements AbstractC89172b<AbstractC77190b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f173228a;

        /* renamed from: b */
        final /* synthetic */ boolean f173229b;

        static {
            Covode.recordClassIndex(90223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77211f(int i, boolean z) {
            super(1);
            this.f173228a = i;
            this.f173229b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC77190b bVar) {
            AbstractC77190b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo120804a(this.f173228a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$g */
    static final class C77212g extends AbstractC89220m implements AbstractC89172b<AbstractC77190b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f173230a;

        /* renamed from: b */
        final /* synthetic */ boolean f173231b;

        static {
            Covode.recordClassIndex(90224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77212g(int i, boolean z) {
            super(1);
            this.f173230a = i;
            this.f173231b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC77190b bVar) {
            AbstractC77190b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo120806b(this.f173230a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$b */
    static final class C77207b extends AbstractC89220m implements AbstractC89172b<AbstractC77190b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Aweme f173221a;

        /* renamed from: b */
        final /* synthetic */ int f173222b;

        static {
            Covode.recordClassIndex(90219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77207b(Aweme aweme, int i) {
            super(1);
            this.f173221a = aweme;
            this.f173222b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC77190b bVar) {
            AbstractC77190b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo120805a(this.f173221a, this.f173222b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m134968a(ViewGroup viewGroup) {
        View a = C1764a.m5927a(LayoutInflater.from(this.f173205n), R.layout.b1p, viewGroup, true);
        C89219l.m154716b(a, "");
        this.f173212v = (ReactionBubbleList) a.findViewById(R.id.zf);
    }

    /* renamed from: f */
    private final void m134976f(Aweme aweme) {
        if (this.f173214x && mo120803l() == 0) {
            mo120824m();
            C77229p.m135001a(aweme.getAuthorUid(), aweme.getUserStory());
        }
    }

    /* renamed from: c */
    private final void m134972c(Aweme aweme) {
        String str;
        aweme.getAid();
        ReactionBubbleList reactionBubbleList = this.f173212v;
        if (reactionBubbleList != null) {
            AbstractC77307a aVar = this.f173201C;
            if (aVar != null) {
                aVar.mo120910c();
            }
            String str2 = this.f173164m.f111753j;
            String groupId = aweme.getGroupId();
            int a = C76598h.m134176a(aweme.getAuthor());
            if (C76706a.m134281g(aweme)) {
                str = "story";
            } else {
                str = UGCMonitor.TYPE_POST;
            }
            reactionBubbleList.setMobEventParam(new C77302g(aweme, str2, groupId, a, str, C76706a.m134276b(aweme)));
            AbstractC77307a aVar2 = this.f173201C;
            if (aVar2 != null) {
                aVar2.mo120905a(aweme);
            }
        }
    }

    /* renamed from: d */
    private final void m134973d(Aweme aweme) {
        if (C76706a.m134279e(aweme)) {
            AbstractC77307a aVar = this.f173201C;
            if (aVar != null) {
                aVar.mo120910c();
            }
            StoryHeaderView storyHeaderView = this.f173210t;
            if (storyHeaderView != null) {
                storyHeaderView.setVisibility(4);
            }
        } else if (C76706a.m134282h(aweme)) {
            AbstractC77307a aVar2 = this.f173201C;
            if (aVar2 != null) {
                aVar2.mo120910c();
            }
            m134969a(aweme);
        } else if (!TextUtils.isEmpty(aweme.getAid())) {
            m134969a(aweme);
            m134972c(aweme);
        } else {
            AbstractC77307a aVar3 = this.f173201C;
            if (aVar3 != null) {
                aVar3.mo120910c();
            }
        }
    }

    /* renamed from: e */
    private final int m134974e(String str) {
        List<Aweme> d = this.f173208q.mo80327d();
        int i = 0;
        for (Aweme aweme : d) {
            if (!C89219l.m154714a((Object) aweme.getAid(), (Object) str)) {
                i++;
            } else if (i < 0) {
                return i;
            } else {
                d.remove(i);
                return i;
            }
        }
        return -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$i */
    static final class C77214i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C77203d f173233a;

        static {
            Covode.recordClassIndex(90226);
        }

        C77214i(C77203d dVar) {
            this.f173233a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            StoryListProgressBar storyListProgressBar = this.f173233a.f173207p;
            DmtRtlViewPager n = this.f173233a.mo120825n();
            C89219l.m154716b(n, "");
            int currentItem = n.getCurrentItem();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (!(animatedValue instanceof Float)) {
                animatedValue = null;
            }
            Float f2 = (Float) animatedValue;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = 0.0f;
            }
            storyListProgressBar.mo120844a(currentItem, f, 0);
            if (C89219l.m154714a(valueAnimator.getAnimatedValue(), Float.valueOf(1.0f))) {
                if (this.f173233a.mo120824m().mo120783b()) {
                    C76598h.m134181a("auto");
                    ActivityC0945e activity = this.f173233a.f173164m.f111746c.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
                if (this.f173233a.mo120824m().mo120785c(this.f173233a.f173161j)) {
                    this.f173233a.mo120827p();
                }
            }
        }
    }

    /* renamed from: e */
    private final void m134975e(Aweme aweme) {
        Story story;
        Story story2;
        if (this.f173214x && (story = aweme.getStory()) != null && !story.getViewed()) {
            Story story3 = aweme.getStory();
            if (story3 == null || story3.isFaked() || (story2 = aweme.getStory()) == null || story2.isPublishing()) {
                Story story4 = aweme.getStory();
                if (story4 != null) {
                    story4.setViewed(true);
                }
                aweme.getAid();
                return;
            }
            String aid = aweme.getAid();
            if (aid != null) {
                Story story5 = aweme.getStory();
                if (story5 != null) {
                    story5.setViewed(true);
                }
                C77260g.f173332a.mo120155c(aid);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public final AbstractC48149ai mo80265a(String str) {
        if (str == null) {
            return null;
        }
        DmtRtlViewPager n = mo120825n();
        C89219l.m154716b(n, "");
        int childCount = n.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = mo120825n().getChildAt(i).getTag(R.id.b0u);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            AbstractC48149ai aiVar = (AbstractC48149ai) tag;
            if (!(aiVar == null || aiVar.mo80089O() == null)) {
                Aweme O = aiVar.mo80089O();
                C89219l.m154716b(O, "");
                if (TextUtils.equals(O.getAid(), str)) {
                    return aiVar;
                }
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77188a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        StoryListProgressBar storyListProgressBar = this.f173207p;
        DmtRtlViewPager n = mo120825n();
        C89219l.m154716b(n, "");
        storyListProgressBar.mo120844a((StoryListProgressBar) n.getCurrentItem(), 1.0f, 4.2E-43f);
        C76598h.m134185b("auto");
        if (mo120824m().mo120785c(this.f173161j)) {
            DmtRtlViewPager n2 = mo120825n();
            C89219l.m154716b(n2, "");
            if (n2.getCurrentItem() == this.f173208q.getCount() - 2) {
                mo120801d("story_collection_play_finish");
            }
        } else {
            DmtRtlViewPager n3 = mo120825n();
            C89219l.m154716b(n3, "");
            if (n3.getCurrentItem() == this.f173208q.getCount() - 1) {
                mo120801d("story_collection_play_finish");
            }
        }
        mo120827p();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.d$j */
    static final class C77215j<T> implements AbstractC49691s {

        /* renamed from: a */
        final /* synthetic */ C77203d f173234a;

        /* renamed from: b */
        final /* synthetic */ C48238ce f173235b;

        static {
            Covode.recordClassIndex(90227);
        }

        C77215j(C77203d dVar, C48238ce ceVar) {
            this.f173234a = dVar;
            this.f173235b = ceVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v7, types: [com.ss.android.ugc.aweme.story.b.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo63634a(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 222
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.feed.common.C77203d.C77215j.mo63634a(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    private final void m134970a(UserStoryCurrentInfo userStoryCurrentInfo) {
        Integer num;
        List<Aweme> d = mo120824m().mo120786d(this.f173161j);
        if (d != null) {
            DmtRtlViewPager n = mo120825n();
            C89219l.m154716b(n, "");
            int currentItem = n.getCurrentItem();
            this.f173208q.mo80286a(d);
            this.f173207p.mo120843a(d.size());
            if (d.size() != 0) {
                if (userStoryCurrentInfo != null) {
                    num = userStoryCurrentInfo.getCurrentIndex();
                } else {
                    num = null;
                }
                if (num != null) {
                    Integer currentIndex = userStoryCurrentInfo.getCurrentIndex();
                    if (currentIndex != null) {
                        currentItem = currentIndex.intValue();
                    } else {
                        currentItem = 0;
                    }
                    if (currentItem >= d.size() || currentItem < 0) {
                        currentItem = d.size() - 1;
                        mo120825n().mo61355a(currentItem, false);
                    } else {
                        mo120825n().mo61355a(currentItem, false);
                    }
                } else if (currentItem >= d.size() || currentItem < 0) {
                    currentItem = d.size() - 1;
                    mo120825n().mo61355a(currentItem, false);
                } else {
                    mo120825n().mo61355a(currentItem, false);
                }
                mo120824m();
                C77229p.m135002a(this.f173161j, this.f173158g, Integer.valueOf(currentItem), d.get(currentItem));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80271b(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.feed.common.C77203d.mo80271b(java.lang.String):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        int currentItem;
        UserStoryCurrentInfo currentInfo;
        Integer currentIndex;
        DataCenter dataCenter;
        C33942b bVar2 = bVar;
        Aweme aweme = this.f173157f;
        if (aweme != null && bVar2 != null && (str = bVar2.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 291667849) {
                if (hashCode == 1211050238 && str.equals("LOAD_USER_STORY_SUCCESS")) {
                    UserStory userStory = (UserStory) bVar2.mo60212a();
                    if (C89219l.m154714a(aweme.getUserStory(), userStory)) {
                        this.f173158g = userStory;
                        C89219l.m154716b(userStory, "");
                        if (C76706a.m134273a(userStory)) {
                            mo120796a(EnumC76597g.ON_DELETE_COLLECTION, new C76603m(this.f173155d));
                            return;
                        }
                        m134970a(userStory.getCurrentInfo());
                        DmtRtlViewPager n = mo120825n();
                        C89219l.m154716b(n, "");
                        mo120795a(n.getCurrentItem(), true);
                        m134976f(aweme);
                        C77201c cVar = this.f173208q;
                        DmtRtlViewPager n2 = mo120825n();
                        C89219l.m154716b(n2, "");
                        Aweme c = cVar.mo80287c(n2.getCurrentItem());
                        if (!(c == null || (dataCenter = this.f111526a) == null)) {
                            dataCenter.mo60191a("ON_STORY_DATA_CHANGED", new C76593c(c));
                        }
                        StoryFeedViewModel m = mo120824m();
                        String str2 = this.f173161j;
                        DmtRtlViewPager n3 = mo120825n();
                        C89219l.m154716b(n3, "");
                        m.mo120781a(str2, n3.getCurrentItem(), this.f173208q.mo80288e());
                    }
                }
            } else if (str.equals("ON_CURRENT_INFO_CHANGED")) {
                UserStory userStory2 = (UserStory) bVar2.mo60212a();
                if (C89219l.m154714a(aweme.getUserStory(), userStory2)) {
                    this.f173158g = userStory2;
                    DmtRtlViewPager n4 = mo120825n();
                    C89219l.m154716b(n4, "");
                    if (userStory2 == null || (currentInfo = userStory2.getCurrentInfo()) == null || (currentIndex = currentInfo.getCurrentIndex()) == null) {
                        DmtRtlViewPager n5 = mo120825n();
                        C89219l.m154716b(n5, "");
                        currentItem = n5.getCurrentItem();
                    } else {
                        currentItem = currentIndex.intValue();
                    }
                    n4.setCurrentItem(currentItem);
                    StoryFeedViewModel m2 = mo120824m();
                    String str3 = this.f173161j;
                    DmtRtlViewPager n6 = mo120825n();
                    C89219l.m154716b(n6, "");
                    m2.mo120781a(str3, n6.getCurrentItem(), this.f173208q.mo80288e());
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77188a, com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public final void mo80267a(int i) {
        Aweme aweme;
        AbstractC77307a dVar;
        UserStory userStory;
        DmtRtlViewPager n = mo120825n();
        if (n != null) {
            AbstractC80321cz a = C80330da.C80331a.m139266a("story_horizontally_viewpager").mo123695a(this.f173215y);
            C33968k.m69560a("story_horizontally_viewpager");
            C77213h hVar = new C77213h(a);
            this.f173204F = hVar;
            n.mo61356a(hVar);
        }
        this.f173214x = true;
        this.f173163l.clear();
        AbstractC77307a aVar = this.f173201C;
        if (aVar != null) {
            aVar.mo120910c();
        }
        ReactionBubbleList reactionBubbleList = this.f173212v;
        if (reactionBubbleList != null) {
            AbstractC77307a aVar2 = null;
            String str = null;
            String str2 = null;
            aVar2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            C77320f fVar = null;
            String str7 = null;
            if (mo120826o()) {
                int i2 = this.f173200B;
                if (i2 == 1) {
                    reactionBubbleList.mo121209d(false);
                    if (!mo120824m().mo120787d()) {
                        Aweme aweme2 = this.f173157f;
                        if (aweme2 != null) {
                            str6 = aweme2.getAid();
                        }
                        fVar = new C77320f(str6, this.f173164m, reactionBubbleList);
                    }
                    this.f173201C = fVar;
                } else if (i2 == 2) {
                    reactionBubbleList.mo121209d(false);
                    CommentService e = CommentServiceImpl.m73664e();
                    Aweme aweme3 = this.f173157f;
                    if (aweme3 == null || (userStory = aweme3.getUserStory()) == null) {
                        aweme = null;
                    } else {
                        aweme = UserStoryKt.currentStory(userStory);
                    }
                    if (e.mo63307c(aweme)) {
                        Aweme aweme4 = this.f173157f;
                        if (aweme4 != null) {
                            str3 = aweme4.getAid();
                        }
                        dVar = new C77320f(str3, this.f173164m, reactionBubbleList);
                    } else if (mo120824m().mo120787d()) {
                        Aweme aweme5 = this.f173157f;
                        if (aweme5 != null) {
                            str4 = aweme5.getAid();
                        }
                        dVar = new C77318e(str4, this.f173164m, reactionBubbleList);
                    } else {
                        Aweme aweme6 = this.f173157f;
                        if (aweme6 != null) {
                            str5 = aweme6.getAid();
                        }
                        dVar = new C77315d(str5, this.f173164m, reactionBubbleList);
                    }
                    aVar2 = dVar;
                } else if (!mo120824m().mo120788e()) {
                    if (mo120824m().mo120787d()) {
                        Aweme aweme7 = this.f173157f;
                        if (aweme7 != null) {
                            str = aweme7.getAid();
                        }
                        this.f173201C = new C77318e(str, this.f173164m, reactionBubbleList);
                        reactionBubbleList.mo121209d(true);
                    } else {
                        Aweme aweme8 = this.f173157f;
                        if (aweme8 != null) {
                            str2 = aweme8.getAid();
                        }
                        this.f173201C = new C77311c(str2, this.f173164m, reactionBubbleList);
                        reactionBubbleList.mo121209d(true);
                    }
                }
                reactionBubbleList.setBubbleListManager(this.f173201C);
            } else if (this.f173200B == 2) {
                Aweme aweme9 = this.f173157f;
                if (aweme9 != null) {
                    str7 = aweme9.getAid();
                }
                aVar2 = new C77318e(str7, this.f173164m, reactionBubbleList);
            }
            this.f173201C = aVar2;
            reactionBubbleList.setBubbleListManager(this.f173201C);
        }
        this.f173207p.mo120843a(this.f173208q.getCount());
        mo120801d("story_collection_play");
        DmtRtlViewPager n2 = mo120825n();
        C89219l.m154716b(n2, "");
        mo120795a(n2.getCurrentItem(), false);
        super.mo80267a(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x03f3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m134969a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
        // Method dump skipped, instructions count: 1074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.feed.common.C77203d.m134969a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    private final boolean m134971a(int i, AbstractC48149ai aiVar) {
        Aweme d;
        Aweme O;
        if (aiVar == null || (d = this.f173208q.mo80326d(i)) == null || (O = aiVar.mo80089O()) == null) {
            return false;
        }
        if (C76706a.m134277c(d)) {
            return TextUtils.equals(d.getAid(), O.getAid());
        }
        return C89219l.m154714a((Object) d.getAid(), (Object) O.getAid());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016f, code lost:
        if (r6 != null) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0145  */
    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77188a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120795a(int r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 398
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.feed.common.C77203d.mo120795a(int, boolean):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        String str2;
        if (j2 != 0) {
            C77201c cVar = this.f173208q;
            DmtRtlViewPager n = mo120825n();
            C89219l.m154716b(n, "");
            Aweme c = cVar.mo80287c(n.getCurrentItem());
            if (c != null) {
                str2 = c.getAid();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str, str2)) {
                long j3 = j2 - j;
                if (j3 <= 300) {
                    j = j2;
                } else {
                    j3 = 300;
                }
                double d = (double) j;
                double d2 = (double) j2;
                Double.isNaN(d);
                Double.isNaN(d2);
                StoryListProgressBar storyListProgressBar = this.f173207p;
                DmtRtlViewPager n2 = mo120825n();
                C89219l.m154716b(n2, "");
                storyListProgressBar.mo120844a(n2.getCurrentItem(), (float) (d / d2), j3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77203d(ViewGroup viewGroup, AbstractC84295k kVar, final C48238ce ceVar, ViewGroup viewGroup2, final ViewGroup viewGroup3, ViewGroup viewGroup4, AbstractC89172b<? super String, ? extends View> bVar) {
        super(viewGroup, kVar, ceVar);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ceVar, "");
        C89219l.m154721d(viewGroup2, "");
        C89219l.m154721d(viewGroup3, "");
        C89219l.m154721d(viewGroup4, "");
        MethodCollector.m26663i(5076);
        Context context = viewGroup.getContext();
        this.f173205n = context;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b1j, viewGroup, true);
        this.f173206o = a;
        C49812b bVar2 = ceVar.f111748e.param;
        this.f173211u = bVar2;
        this.f173213w = C89250i.m154773a((AbstractC89171a) new C77217l(ceVar));
        C77215j jVar = new C77215j(this, ceVar);
        this.f173216z = jVar;
        C89219l.m154716b(context, "");
        LayoutInflater from = LayoutInflater.from(context);
        C89219l.m154716b(from, "");
        C77201c cVar = new C77201c(context, from, jVar, ceVar.f111746c, ceVar.f111747d, ceVar.f111748e, ceVar.f111749f);
        cVar.f111626d = bVar;
        this.f173208q = cVar;
        this.f173199A = C89250i.m154773a((AbstractC89171a) new C77216k(this));
        int a2 = C76660b.m134241a();
        this.f173200B = a2;
        String str = this.f173159h;
        C89219l.m154716b(str, "");
        boolean a3 = C77157f.m134768a(str);
        this.f173202D = a3;
        StoryFeedViewModel m = mo120824m();
        m.mo60189a("LOAD_USER_STORY_SUCCESS", (AbstractC1214u<C33942b>) this);
        m.mo60189a("LOAD_USER_STORY_FAIL", (AbstractC1214u<C33942b>) this);
        m.mo60189a("SUBSCRIBE_MINE_STORY_CHANGED", (AbstractC1214u<C33942b>) this);
        m.mo60189a("ON_CURRENT_INFO_CHANGED", (AbstractC1214u<C33942b>) this);
        viewGroup2.setVisibility(0);
        View a4 = C1764a.m5927a(LayoutInflater.from(context), R.layout.b1k, viewGroup2, true);
        C89219l.m154716b(a4, "");
        StoryListProgressBar storyListProgressBar = (StoryListProgressBar) a4.findViewById(R.id.d_6);
        C89219l.m154716b(storyListProgressBar, "");
        this.f173207p = storyListProgressBar;
        if (!C76677d.m134255a()) {
            viewGroup4.setVisibility(0);
            m134968a(viewGroup4);
        } else if (!mo120826o() ? a2 != 2 : a2 == 1 ? mo120824m().mo120787d() : a2 != 2 && mo120824m().mo120788e()) {
            viewGroup4.setVisibility(8);
        } else {
            viewGroup4.setVisibility(0);
            m134968a(viewGroup4);
        }
        C89219l.m154716b(bVar2, "");
        if (bVar2.getStoryType() == 1) {
            storyListProgressBar.setVisibility(8);
        }
        if (C33403c.f79377m == 0) {
            int a5 = C18247a.m33946a(context);
            C89219l.m154716b(a, "");
            View findViewById = a.findViewById(R.id.e7_);
            C89219l.m154716b(findViewById, "");
            findViewById.getLayoutParams().height = a5;
        } else {
            C89219l.m154716b(a, "");
            View findViewById2 = a.findViewById(R.id.e7_);
            C89219l.m154716b(findViewById2, "");
            findViewById2.getLayoutParams().height = 0;
        }
        if (!C76677d.m134255a() || C76660b.m134242b()) {
            C89219l.m154716b(a, "");
            View inflate = ((ViewStub) a.findViewById(R.id.be0)).inflate();
            StoryHeaderView storyHeaderView = (StoryHeaderView) (!(inflate instanceof StoryHeaderView) ? null : inflate);
            this.f173210t = storyHeaderView;
            if (storyHeaderView != null) {
                SmartImageView smartImageView = (SmartImageView) storyHeaderView.mo9603b(R.id.o3);
                C89219l.m154716b(smartImageView, "");
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
                    TuxIconView tuxIconView = (TuxIconView) storyHeaderView.mo9603b(R.id.clf);
                    C89219l.m154716b(tuxIconView, "");
                    ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
                    if (layoutParams2 != null) {
                        ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
                        if (a3) {
                            Resources system = Resources.getSystem();
                            C89219l.m154709a((Object) system, "");
                            aVar.setMarginStart(C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics())));
                            Resources system2 = Resources.getSystem();
                            C89219l.m154709a((Object) system2, "");
                            aVar2.setMarginEnd(C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics())));
                        } else {
                            Resources system3 = Resources.getSystem();
                            C89219l.m154709a((Object) system3, "");
                            aVar.setMarginStart(C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system3.getDisplayMetrics())));
                            Resources system4 = Resources.getSystem();
                            C89219l.m154709a((Object) system4, "");
                            aVar2.setMarginEnd(C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system4.getDisplayMetrics())));
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        MethodCollector.m26664o(5076);
                        throw nullPointerException;
                    }
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    MethodCollector.m26664o(5076);
                    throw nullPointerException2;
                }
            }
        }
        DmtRtlViewPager n = mo120825n();
        C89219l.m154716b(n, "");
        n.setAdapter(cVar);
        mo120825n().mo61356a(new C77209d(this));
        mo120799b(new AbstractC89172b<List<AbstractC77190b>, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.story.feed.common.C77203d.C772041 */

            /* renamed from: a */
            final /* synthetic */ C77203d f173217a;

            static {
                Covode.recordClassIndex(90216);
            }

            {
                this.f173217a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<AbstractC77190b> list) {
                List<AbstractC77190b> list2 = list;
                C89219l.m154721d(list2, "");
                if (!C76677d.m134255a()) {
                    C77203d.m134920a(list2, new C77191a(viewGroup3));
                } else if (this.f173217a.mo120826o()) {
                    C77203d.m134920a(list2, new C77191a(viewGroup3));
                }
                C77203d.m134920a(list2, new C77189a());
                return C89391z.f203057a;
            }
        });
        mo120797a(new AbstractC89172b<AbstractC77190b, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.story.feed.common.C77203d.C772052 */

            /* renamed from: a */
            final /* synthetic */ C77203d f173219a;

            static {
                Covode.recordClassIndex(90217);
            }

            {
                this.f173219a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC77190b bVar) {
                AbstractC77190b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                C77201c cVar = this.f173219a.f173208q;
                C77203d dVar = this.f173219a;
                StoryFeedViewModel m = dVar.mo120824m();
                DmtRtlViewPager n = this.f173219a.mo120825n();
                C89219l.m154716b(n, "");
                Context context = this.f173219a.f173205n;
                C89219l.m154716b(context, "");
                StoryListProgressBar storyListProgressBar = this.f173219a.f173207p;
                C48238ce ceVar = ceVar;
                View view = this.f173219a.f173206o;
                C89219l.m154716b(view, "");
                C89219l.m154721d(cVar, "");
                C89219l.m154721d(n, "");
                C89219l.m154721d(m, "");
                C89219l.m154721d(dVar, "");
                C89219l.m154721d(context, "");
                C89219l.m154721d(storyListProgressBar, "");
                C89219l.m154721d(ceVar, "");
                C89219l.m154721d(view, "");
                bVar2.f173166a = cVar;
                bVar2.f173167b = n;
                bVar2.f173168c = m;
                bVar2.f173169d = dVar;
                bVar2.f173170e = context;
                bVar2.f173171f = storyListProgressBar;
                bVar2.f173172g = ceVar;
                bVar2.f173173h = view;
                bVar2.mo120807g();
                return C89391z.f203057a;
            }
        });
        MethodCollector.m26664o(5076);
    }
}
