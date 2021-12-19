package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35672z;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39127c;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.discover.C41484a;
import com.p2082ss.android.ugc.aweme.discover.DiscoverAllServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41711c;
import com.p2082ss.android.ugc.aweme.discover.model.AdLabel;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41945e;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41948f;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51453d;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.metrics.C59216ak;
import com.p2082ss.android.ugc.aweme.metrics.C59248m;
import com.p2082ss.android.ugc.aweme.metrics.C59253r;
import com.p2082ss.android.ugc.aweme.metrics.ChallengeUtilApi;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder */
public final class TrendingTopicViewHolder extends JediSimpleViewHolder<DiscoverSectionItem> implements C39127c.AbstractC39131d, C41711c.AbstractC41715c, AbstractC42534b, AbstractC42534b {

    /* renamed from: F */
    private static final TrendingTopic f96973F = new TrendingTopic(0, null, null, null, null, null, null, null, null, 511, null);

    /* renamed from: m */
    public static final AbstractC89244h f96974m = C89250i.m154773a((AbstractC89171a) C41582c.f97002a);

    /* renamed from: n */
    public static final C41581b f96975n = new C41581b((byte) 0);

    /* renamed from: A */
    private final C35672z f96976A;

    /* renamed from: B */
    private View f96977B;

    /* renamed from: C */
    private final AbstractC89244h f96978C;

    /* renamed from: D */
    private final AbstractC89244h f96979D;

    /* renamed from: E */
    private final AbstractC89244h f96980E;

    /* renamed from: f */
    public final AbstractC42534b f96981f;

    /* renamed from: g */
    public final RecyclerView f96982g;

    /* renamed from: j */
    public final Context f96983j;

    /* renamed from: k */
    public AbstractC41583d f96984k;

    /* renamed from: l */
    public final RecyclerView.RecycledViewPool f96985l;

    /* renamed from: o */
    private final WrapLinearLayoutManager f96986o;

    /* renamed from: p */
    private final RemoteImageView f96987p;

    /* renamed from: q */
    private final TextView f96988q;

    /* renamed from: r */
    private final TextView f96989r;

    /* renamed from: s */
    private final TextView f96990s;

    /* renamed from: t */
    private final TextView f96991t;

    /* renamed from: u */
    private final View f96992u;

    /* renamed from: v */
    private final ViewStub f96993v;

    /* renamed from: w */
    private final ImageView f96994w;

    /* renamed from: x */
    private TrendingTopic f96995x;

    /* renamed from: y */
    private boolean f96996y;

    /* renamed from: z */
    private C41711c f96997z;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$d */
    public interface AbstractC41583d {
        static {
            Covode.recordClassIndex(49496);
        }

        /* renamed from: a */
        void mo70811a(String str, String str2, String str3, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$l */
    public static final class View$OnClickListenerC41592l implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC41592l f97015a = new View$OnClickListenerC41592l();

        static {
            Covode.recordClassIndex(49505);
        }

        View$OnClickListenerC41592l() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: c */
    private static String m83518c(boolean z) {
        return z ? "cell_slide" : "cell_click";
    }

    /* renamed from: d */
    private static String m83519d(boolean z) {
        return z ? "into" : "header_click";
    }

    /* renamed from: q */
    private final int m83520q() {
        return ((Number) this.f96980E.getValue()).intValue();
    }

    /* renamed from: m */
    public final TrendsTabViewModel mo63351m() {
        return (TrendsTabViewModel) this.f96978C.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$b */
    public static final class C41581b {
        static {
            Covode.recordClassIndex(49494);
        }

        private C41581b() {
        }

        public /* synthetic */ C41581b(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(DiscoverSectionItem discoverSectionItem) {
        AdLabel adLabel;
        MethodCollector.m26663i(5179);
        DiscoverSectionItem discoverSectionItem2 = discoverSectionItem;
        C89219l.m154721d(discoverSectionItem2, "");
        TrendingTopic trendingTopic = ((DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem2).trendingTopicOrAd.topic;
        if (trendingTopic != null) {
            if (trendingTopic == f96973F) {
                if (this.f96977B == null) {
                    this.f96977B = this.f96993v.inflate();
                }
                C34729o.m70955a(this.f96977B, 0);
                C34729o.m70955a(this.f96992u, 8);
            } else {
                C34729o.m70955a(this.f96993v, 8);
                C34729o.m70955a(this.f96992u, 0);
                if (C41948f.m83988a().f97839a) {
                    if (((Boolean) f96974m.getValue()).booleanValue()) {
                        C34729o.m70955a(this.f96991t, 8);
                    }
                } else if (C80580in.m139687c()) {
                    C34729o.m70955a(this.f96991t, 8);
                }
                this.f96995x = trendingTopic;
                Challenge challenge = trendingTopic.getChallenge();
                Music music = trendingTopic.getMusic();
                C75445g effect = trendingTopic.getEffect();
                if (this.f96997z == null) {
                    C41711c cVar = new C41711c(this);
                    this.f96997z = cVar;
                    cVar.f97314e = trendingTopic;
                    View view = new View(this.f96983j);
                    view.setLayoutParams(new ViewGroup.LayoutParams((int) C13628n.m24520b(this.f96983j, 14.0f), -1));
                    C41711c cVar2 = this.f96997z;
                    if (cVar2 == null) {
                        C89219l.m154715b();
                    }
                    cVar2.mo61480a(view);
                    this.f96982g.setAdapter(this.f96997z);
                    if (C41945e.m83984a()) {
                        C51423a.m95791b(4, "TrendingTopicViewHolder", "should use a common pool");
                        RecyclerView.RecycledViewPool recycledViewPool = this.f96985l;
                        if (recycledViewPool != null) {
                            this.f96982g.setRecycledViewPool(recycledViewPool);
                            C51423a.m95791b(4, "TrendingTopicViewHolder", "use a common pool");
                        }
                    }
                    C41711c cVar3 = this.f96997z;
                    if (cVar3 == null) {
                        C89219l.m154715b();
                    }
                    cVar3.f97313d = this;
                }
                String str = null;
                if (challenge != null) {
                    this.f96994w.setVisibility(8);
                    DiscoverAllServiceImpl.m83412b();
                    this.f96987p.setImageResource(2131231915);
                    String desc = trendingTopic.getDesc();
                    TrendingTopicsAdInfo adData = trendingTopic.getAdData();
                    if (!(adData == null || (adLabel = adData.getAdLabel()) == null)) {
                        str = adLabel.text;
                    }
                    m83517a(desc, str);
                    this.f96991t.setText(C53437b.m98615a(challenge.getDisplayCount()));
                    if (CommerceChallengeServiceImpl.m75741e().mo65376a(challenge.getChallengeName(), challenge.isCommerce(), false) == null) {
                        this.f96996y = false;
                        this.f96988q.setText(challenge.getChallengeName());
                    } else {
                        this.f96996y = true;
                        CommerceChallengeServiceImpl.m75741e().mo65389a(this.f96983j, challenge.getChallengeName(), challenge.isCommerce(), this.f96988q, false, "discover_hashtag_list");
                    }
                    C41711c cVar4 = this.f96997z;
                    if (cVar4 == null) {
                        C89219l.m154715b();
                    }
                    cVar4.f97316g = challenge.getCid();
                    C41711c cVar5 = this.f96997z;
                    if (cVar5 == null) {
                        C89219l.m154715b();
                    }
                    cVar5.f97315f = 0;
                    if (trendingTopic.isAd()) {
                        C41711c cVar6 = this.f96997z;
                        if (cVar6 == null) {
                            C89219l.m154715b();
                        }
                        cVar6.f97314e = trendingTopic;
                    }
                } else if (music != null) {
                    this.f96987p.setImageResource(2131231911);
                    this.f96994w.setVisibility(8);
                    this.f96991t.setText(C53437b.m98615a((long) music.getUserCount()));
                    this.f96988q.setText(music.getMusicName());
                    m83517a(trendingTopic.getDesc(), (String) null);
                    C41711c cVar7 = this.f96997z;
                    if (cVar7 == null) {
                        C89219l.m154715b();
                    }
                    cVar7.f97316g = String.valueOf(music.getId());
                    C41711c cVar8 = this.f96997z;
                    if (cVar8 == null) {
                        C89219l.m154715b();
                    }
                    cVar8.f97315f = 1;
                } else if (effect != null) {
                    this.f96987p.setImageResource(2131231910);
                    this.f96994w.setVisibility(8);
                    this.f96991t.setText(C53437b.m98615a(effect.userCount));
                    this.f96988q.setText(effect.name);
                    m83517a(trendingTopic.getDesc(), (String) null);
                    C41711c cVar9 = this.f96997z;
                    if (cVar9 == null) {
                        C89219l.m154715b();
                    }
                    cVar9.f97316g = effect.f169545id;
                    C41711c cVar10 = this.f96997z;
                    if (cVar10 == null) {
                        C89219l.m154715b();
                    }
                    cVar10.f97315f = 3;
                }
                C41711c cVar11 = this.f96997z;
                if (cVar11 == null) {
                    C89219l.m154715b();
                }
                cVar11.mo62377b_(trendingTopic.getItems());
                C41711c cVar12 = this.f96997z;
                if (cVar12 == null) {
                    C89219l.m154715b();
                }
                cVar12.f97318i = getAdapterPosition();
            }
        }
        if (C41948f.m83988a().f97840b) {
            C1731i.m5640b(new CallableC41588i(this), C1731i.f5562a);
            MethodCollector.m26664o(5179);
            return;
        }
        withState(mo63351m(), new C41590j(this));
        MethodCollector.m26664o(5179);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2636h.C39127c.AbstractC39131d
    /* renamed from: a */
    public final void mo67889a(int i, int i2) {
        TrendingTopic trendingTopic;
        if (i == 0 && i2 != 0 && (trendingTopic = this.f96995x) != null) {
            Challenge challenge = trendingTopic.getChallenge();
            Music music = trendingTopic.getMusic();
            C75445g effect = trendingTopic.getEffect();
            if (C41948f.m83988a().f97840b || effect != null) {
                C1731i.m5640b(new CallableC41591k(this, effect, challenge, trendingTopic, music), C1731i.f5562a);
            } else if (challenge != null) {
                CommerceChallengeServiceImpl.m75741e().mo65387a(challenge.getSchema(), challenge.getCid());
                this.f96982g.getContext();
                C39162r.m79455a("show_challenge", "discovery", challenge.getCid(), 0);
                C59216ak akVar = new C59216ak();
                akVar.f134873a = "discovery";
                akVar.f134874b = challenge.getCid();
                akVar.mo96792f();
                C39162r.m79460a("cell_show", new C33744d().mo59983a("enter_from", "discovery").mo59983a("tag_id", challenge.getCid()).mo59980a("client_order", mo70809p()).f79943a);
                AbstractC41583d dVar = this.f96984k;
                if (dVar != null) {
                    dVar.mo70811a(m83513a(trendingTopic), trendingTopic.getDesc(), "discovery", mo70809p());
                }
                if (trendingTopic.isAd()) {
                    C41484a.m83436c(this.f96983j, trendingTopic);
                }
            } else if (music != null) {
                this.f96982g.getContext();
                C39162r.m79455a("show_music", "discovery", music.getMid(), 0);
                C39162r.m79460a("cell_show", new C33744d().mo59983a("enter_from", "discovery").mo59983a("music_id", music.getMid()).mo59980a("client_order", mo70809p()).f79943a);
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cd_() {
        super.cd_();
        mo70808o();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b
    /* renamed from: l */
    public final void mo70806l() {
        this.f96981f.mo70806l();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$c */
    static final class C41582c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C41582c f97002a = new C41582c();

        static {
            Covode.recordClassIndex(49495);
        }

        C41582c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C80580in.m139687c());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.C41711c.AbstractC41715c
    /* renamed from: a */
    public final void mo70802a() {
        mo70804a(true);
        this.f96981f.mo70806l();
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void ay_() {
        super.ay_();
        withState(mo63351m(), new C41584e(this));
    }

    /* renamed from: n */
    public final void mo70807n() {
        C35672z zVar = this.f96976A;
        if (zVar != null) {
            zVar.mo62697a(this.f96982g, false);
        }
    }

    /* renamed from: o */
    public final void mo70808o() {
        if (this.f96976A != null) {
            C35672z.m72819a(this.f96982g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$f */
    static final class C41585f extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ View f97004a;

        static {
            Covode.recordClassIndex(49498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41585f(View view) {
            super(0);
            this.f97004a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f97004a.getContext(), 2.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$g */
    static final class C41586g extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ View f97005a;

        static {
            Covode.recordClassIndex(49499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41586g(View view) {
            super(0);
            this.f97005a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f97005a.getContext(), 20.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$i */
    static final class CallableC41588i<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ TrendingTopicViewHolder f97007a;

        static {
            Covode.recordClassIndex(49501);
        }

        CallableC41588i(TrendingTopicViewHolder trendingTopicViewHolder) {
            this.f97007a = trendingTopicViewHolder;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            TrendingTopicViewHolder trendingTopicViewHolder = this.f97007a;
            trendingTopicViewHolder.withState(trendingTopicViewHolder.mo63351m(), new AbstractC89172b<TrendsTabState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.CallableC41588i.C415891 */

                /* renamed from: a */
                final /* synthetic */ CallableC41588i f97008a;

                static {
                    Covode.recordClassIndex(49502);
                }

                {
                    this.f97008a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
                    TrendsTabState trendsTabState2 = trendsTabState;
                    C89219l.m154721d(trendsTabState2, "");
                    this.f97008a.f97007a.mo70805b(!trendsTabState2.isTabHidden());
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: p */
    public final int mo70809p() {
        return ((Number) withState(mo63351m(), new C41587h(this))).intValue();
    }

    static {
        Covode.recordClassIndex(49490);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$a */
    public static final class C41580a extends AbstractC89220m implements AbstractC89171a<TrendsTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f96999a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f97000b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f97001c;

        static {
            Covode.recordClassIndex(49493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41580a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f96999a = jediViewHolder;
            this.f97000b = cVar;
            this.f97001c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.C41580a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_discover_adapter_TrendingTopicViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m83533x72e5ac9d(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$k */
    static final class CallableC41591k<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ TrendingTopicViewHolder f97010a;

        /* renamed from: b */
        final /* synthetic */ C75445g f97011b;

        /* renamed from: c */
        final /* synthetic */ Challenge f97012c;

        /* renamed from: d */
        final /* synthetic */ TrendingTopic f97013d;

        /* renamed from: e */
        final /* synthetic */ Music f97014e;

        static {
            Covode.recordClassIndex(49504);
        }

        CallableC41591k(TrendingTopicViewHolder trendingTopicViewHolder, C75445g gVar, Challenge challenge, TrendingTopic trendingTopic, Music music) {
            this.f97010a = trendingTopicViewHolder;
            this.f97011b = gVar;
            this.f97012c = challenge;
            this.f97013d = trendingTopic;
            this.f97014e = music;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (this.f97011b != null) {
                C39162r.m79460a("show_effect", new C33744d().mo59983a("prop_id", this.f97011b.effectId).mo59980a("client_order", this.f97010a.mo70809p()).f79943a);
            } else if (this.f97012c != null) {
                CommerceChallengeServiceImpl.m75741e().mo65387a(this.f97012c.getSchema(), this.f97012c.getCid());
                this.f97010a.f96982g.getContext();
                C39162r.m79455a("show_challenge", "discovery", this.f97012c.getCid(), 0);
                C59216ak akVar = new C59216ak();
                akVar.f134873a = "discovery";
                akVar.f134874b = this.f97012c.getCid();
                akVar.mo96792f();
                C39162r.m79460a("cell_show", new C33744d().mo59983a("enter_from", "discovery").mo59983a("tag_id", this.f97012c.getCid()).mo59980a("client_order", this.f97010a.mo70809p()).f79943a);
                AbstractC41583d dVar = this.f97010a.f96984k;
                if (dVar != null) {
                    dVar.mo70811a(TrendingTopicViewHolder.m83513a(this.f97013d), this.f97013d.getDesc(), "discovery", this.f97010a.mo70809p());
                }
                if (this.f97013d.isAd()) {
                    C41484a.m83436c(this.f97010a.f96983j, this.f97013d);
                }
            } else if (this.f97014e != null) {
                this.f97010a.f96982g.getContext();
                C39162r.m79455a("show_music", "discovery", this.f97014e.getMid(), 0);
                C39162r.m79460a("cell_show", new C33744d().mo59983a("enter_from", "discovery").mo59983a("music_id", this.f97014e.getMid()).mo59980a("client_order", this.f97010a.mo70809p()).f79943a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo70803a(AbstractC41583d dVar) {
        C89219l.m154721d(dVar, "");
        this.f96984k = dVar;
    }

    /* renamed from: b */
    public final void mo70805b(boolean z) {
        C41711c cVar = this.f96997z;
        if (cVar != null) {
            cVar.f97317h = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$e */
    static final class C41584e extends AbstractC89220m implements AbstractC89172b<TrendsTabState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TrendingTopicViewHolder f97003a;

        static {
            Covode.recordClassIndex(49497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41584e(TrendingTopicViewHolder trendingTopicViewHolder) {
            super(1);
            this.f97003a = trendingTopicViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            if (!trendsTabState2.isTabHidden()) {
                this.f97003a.mo70807n();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$j */
    static final class C41590j extends AbstractC89220m implements AbstractC89172b<TrendsTabState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TrendingTopicViewHolder f97009a;

        static {
            Covode.recordClassIndex(49503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41590j(TrendingTopicViewHolder trendingTopicViewHolder) {
            super(1);
            this.f97009a = trendingTopicViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            this.f97009a.mo70805b(!trendsTabState2.isTabHidden());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder$h */
    public static final class C41587h extends AbstractC89220m implements AbstractC89172b<TrendsTabState, Integer> {

        /* renamed from: a */
        final /* synthetic */ TrendingTopicViewHolder f97006a;

        static {
            Covode.recordClassIndex(49500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41587h(TrendingTopicViewHolder trendingTopicViewHolder) {
            super(1);
            this.f97006a = trendingTopicViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            Iterator<DiscoverSectionItem> it = trendsTabState2.getSubstate().getList().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next() instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
                    break;
                } else {
                    i++;
                }
            }
            return Integer.valueOf((this.f97006a.getAdapterPosition() - i) + 1);
        }
    }

    /* renamed from: a */
    public final void mo70804a(boolean z) {
        TrendingTopic trendingTopic;
        if (C80580in.m139687c() || (trendingTopic = this.f96995x) == null) {
            return;
        }
        if (trendingTopic.getChallenge() != null) {
            m83514a(trendingTopic.getChallenge(), z);
        } else if (trendingTopic.getMusic() != null) {
            m83515a(trendingTopic.getMusic(), z);
        } else if (trendingTopic.getEffect() != null) {
            m83516a(trendingTopic.getEffect(), z);
        }
    }

    /* renamed from: a */
    public static String m83513a(TrendingTopic trendingTopic) {
        if (trendingTopic.getChallenge() != null) {
            Challenge challenge = trendingTopic.getChallenge();
            if (challenge == null) {
                C89219l.m154715b();
            }
            String cid = challenge.getCid();
            C89219l.m154716b(cid, "");
            return cid;
        } else if (trendingTopic.getMusic() != null) {
            Music music = trendingTopic.getMusic();
            if (music == null) {
                C89219l.m154715b();
            }
            return String.valueOf(music.getId());
        } else if (trendingTopic.getEffect() == null) {
            return "";
        } else {
            C75445g effect = trendingTopic.getEffect();
            if (effect == null) {
                C89219l.m154715b();
            }
            String str = effect.f169545id;
            C89219l.m154716b(str, "");
            return str;
        }
    }

    /* renamed from: a */
    private final void m83516a(C75445g gVar, boolean z) {
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//stickers/detail");
        if (gVar == null) {
            C89219l.m154715b();
        }
        buildRoute.withParam("id", gVar.effectId).withParam("process_id", uuid).withParam("shoot_enter_from", "discovery").open();
        C39162r.m79460a("cell_click", new C33744d().mo59983a("enter_from", "discovery").mo59983a("enter_method", "click_discovery_cover").mo59983a("prop_id", gVar.f169545id).mo59980a("client_order", mo70809p()).f79943a);
        C39162r.onEvent(MobClick.obtain().setEventName(m83518c(z)).setLabelName(m83519d(z)).setValue(gVar.f169545id).setJsonObject(new C33743c().mo59976a("cell_type", "effect").mo59977a()));
        C39162r.m79460a("enter_prop_detail", new C33744d().mo59983a("group_id", "").mo59983a("author_id", "").mo59983a("impr_type", "").mo59983a("prop_id", gVar.f169545id).mo59983a("enter_from", "discovery").mo59983a("enter_method", "click_discovery_cover").f79943a);
        C49907s.m93686a(EnumC48310af.STICKER);
    }

    /* renamed from: a */
    private final void m83514a(Challenge challenge, boolean z) {
        String str;
        String str2;
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        DiscoverAllServiceImpl.m83412b();
        C18285c.m34003a("cd_start_activity_to_request_net_duration");
        C18285c.m34003a("cd_start_activity_to_show_header_duration");
        C18285c.m34003a("cd_start_activity_to_show_list_duration");
        if (MSAdaptionService.m97895c().mo89377c(this.f96983j)) {
            str = "//duo";
        } else {
            str = "//challenge/detail";
        }
        if (challenge == null) {
            try {
                C89219l.m154715b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ChallengeUtilApi.m108746a(challenge.getCid());
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), str);
        if (challenge == null) {
            C89219l.m154715b();
        }
        SmartRoute withParam = buildRoute.withParam("id", challenge.getCid()).withParam("enter_from", "discovery").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).withParam("process_id", uuid);
        if (CommerceChallengeServiceImpl.m75741e().mo65392b(challenge)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        SmartRoute withParam2 = withParam.withParam("is_commerce", str2).withParam("shoot_enter_from", "discovery").withParam("is_bundled", !TextUtils.isEmpty(null) ? 1 : 0);
        if (MSAdaptionService.m97895c().mo89377c(this.f96983j)) {
            withParam2.withParam("duo_type", "duo_challenge");
        }
        withParam2.open();
        C39162r.m79460a("cell_click", new C33744d().mo59983a("enter_from", "discovery").mo59983a("tag_id", challenge.getCid()).mo59980a("client_order", mo70809p()).f79943a);
        C39162r.onEvent(MobClick.obtain().setEventName(m83518c(z)).setLabelName(m83519d(z)).setValue(challenge.getCid()).setJsonObject(new C33743c().mo59976a("cell_type", "challenge").mo59977a()));
        C39162r.m79460a("enter_tag_detail", new C33744d().mo59983a("enter_from", "trending cell").mo59983a("enter_method", "click_trending_cell").mo59983a("process_id", UUID.randomUUID().toString()).mo59983a("tag_id", challenge.getCid()).mo59983a("shoot_enter_from", "discovery").mo59980a("is_bundled", !TextUtils.isEmpty(null) ? 1 : 0).f79943a);
        TrendingTopic trendingTopic = this.f96995x;
        if (trendingTopic == null) {
            C89219l.m154715b();
        }
        if (trendingTopic.isAd()) {
            if (z) {
                C41484a.m83434a(this.f96983j, this.f96995x);
            } else {
                C41484a.m83435b(this.f96983j, this.f96995x);
            }
        }
        if (this.f96996y) {
            CommerceChallengeServiceImpl.m75741e().mo65391b("discover_hashtag_list", challenge.getChallengeName());
        }
        C59253r rVar = (C59253r) new C59253r().mo96827o("discovery").mo96741a("click_discovery_cover");
        rVar.f135340q = challenge.getCid();
        rVar.f135341r = uuid;
        TrendingTopic trendingTopic2 = this.f96995x;
        if (trendingTopic2 == null) {
            C89219l.m154715b();
        }
        rVar.f135342s = trendingTopic2.getDesc();
        rVar.mo96802d(String.valueOf(mo70809p())).mo96792f();
        C49907s.m93686a(EnumC48310af.CHALLENGE);
    }

    /* renamed from: a */
    private final void m83515a(Music music, boolean z) {
        if (music == null) {
            C89219l.m154715b();
        }
        if (!MusicService.m81198m().mo69308a(music.convertToMusicModel(), this.f96983j, true)) {
            C39162r.m79460a("enter_music_detail_failed", new C33744d().mo59983a("group_id", "").mo59983a("author_id", "").mo59983a("music_id", music.getMid()).mo59983a("enter_from", "discovery").f79943a);
            return;
        }
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        if (MSAdaptionService.m97895c().mo89377c(this.f96983j)) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            SmartRouter.buildRoute(view.getContext(), "//duo").withParam("duo_type", "duo_music_detail").withParam("id", music.getMid()).withParam("process_id", uuid).withParam("shoot_enter_from", "discovery").open();
        } else {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "//music/detail").withParam("id", music.getMid()).withParam("process_id", uuid).open();
        }
        C39162r.m79460a("cell_click", new C33744d().mo59983a("enter_from", "discovery").mo59983a("music_id", music.getMid()).mo59980a("client_order", mo70809p()).f79943a);
        C39162r.onEvent(MobClick.obtain().setEventName(m83518c(z)).setLabelName(m83519d(z)).setValue(music.getMid().toString()).setJsonObject(new C33743c().mo59976a("cell_type", "music").mo59977a()));
        C59248m o = new C59248m().mo96819o("discovery");
        o.f135272p = music.getMid();
        o.f135274r = uuid;
        o.mo96741a("click_discovery_cover").mo96792f();
        C49907s.m93686a(EnumC48310af.MUSICAL);
    }

    /* renamed from: a */
    private final void m83517a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f96990s.setText(str2);
            this.f96990s.setVisibility(0);
            this.f96990s.setOnClickListener(View$OnClickListenerC41592l.f97015a);
            this.f96989r.setVisibility(8);
        } else if (!TextUtils.isEmpty(str)) {
            this.f96989r.setText(str);
            this.f96990s.setVisibility(8);
            this.f96989r.setVisibility(0);
        } else {
            this.f96990s.setVisibility(8);
            this.f96989r.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f96988q.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.C0547a) layoutParams).topMargin = m83520q();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrendingTopicViewHolder(View view, RecyclerView.RecycledViewPool recycledViewPool, AbstractC42534b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f96985l = recycledViewPool;
        this.f96981f = bVar;
        View findViewById = view.findViewById(R.id.c0t);
        C89219l.m154716b(findViewById, "");
        this.f96987p = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f63);
        C89219l.m154716b(findViewById2, "");
        this.f96988q = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f6k);
        C89219l.m154716b(findViewById3, "");
        this.f96989r = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.g9);
        C89219l.m154716b(findViewById4, "");
        this.f96990s = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.eue);
        C89219l.m154716b(findViewById5, "");
        this.f96991t = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dof);
        C89219l.m154716b(findViewById6, "");
        RecyclerView recyclerView = (RecyclerView) findViewById6;
        this.f96982g = recyclerView;
        View findViewById7 = view.findViewById(R.id.dnb);
        C89219l.m154716b(findViewById7, "");
        this.f96992u = findViewById7;
        View findViewById8 = view.findViewById(R.id.fhm);
        C89219l.m154716b(findViewById8, "");
        this.f96993v = (ViewStub) findViewById8;
        View findViewById9 = view.findViewById(R.id.alv);
        C89219l.m154716b(findViewById9, "");
        this.f96994w = (ImageView) findViewById9;
        AbstractC89277c a = C89204ab.m154669a(TrendsTabViewModel.class);
        this.f96978C = C89250i.m154773a((AbstractC89171a) new C41580a(this, a, a));
        AbstractC89244h a2 = C89250i.m154774a(EnumC89331m.NONE, new C41585f(view));
        this.f96979D = a2;
        this.f96980E = C89250i.m154774a(EnumC89331m.NONE, new C41586g(view));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.View$OnClickListenerC415781 */

            /* renamed from: a */
            final /* synthetic */ TrendingTopicViewHolder f96998a;

            static {
                Covode.recordClassIndex(49491);
            }

            {
                this.f96998a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f96998a.mo70804a(false);
                this.f96998a.f96981f.mo70806l();
            }
        });
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f96983j = context;
        C35672z zVar = new C35672z();
        this.f96976A = zVar;
        Context context2 = view.getContext();
        C89219l.m154716b(context2, "");
        int color = context2.getResources().getColor(R.color.l);
        view.getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(0);
        this.f96986o = wrapLinearLayoutManager;
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        if (wrapLinearLayoutManager.f4480E) {
            wrapLinearLayoutManager.f4480E = false;
            wrapLinearLayoutManager.f4481F = 0;
            if (wrapLinearLayoutManager.f4490w != null) {
                wrapLinearLayoutManager.f4490w.f4435e.mo4763b();
            }
        }
        recyclerView.mo4402a(new C51453d(color, ((Number) a2.getValue()).intValue(), 0));
        recyclerView.mo4405a(zVar);
        recyclerView.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.C415792 */

            static {
                Covode.recordClassIndex(49492);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                C89219l.m154721d(recyclerView, "");
                super.mo4753a(recyclerView, i);
                if (i == 0) {
                    C39162r.m79454a("cell_slide", "slide", 0);
                }
            }
        });
    }
}
