package com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C0576b;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34152h;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractView$OnAttachStateChangeListenerC34144b;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42435q;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42436r;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41902e;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42077d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49419b;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import com.p2082ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.h */
public final class C34131h extends AbstractC34152h implements AbstractC41814c {

    /* renamed from: c */
    public static final C34132a f80716c = new C34132a((byte) 0);

    /* renamed from: a */
    public int f80717a = -1;

    /* renamed from: b */
    final AbstractC89244h f80718b = C89250i.m154773a((AbstractC89171a) C34134c.f80723a);

    /* renamed from: k */
    private C42435q f80719k;

    /* renamed from: l */
    private final AbstractC89244h f80720l;

    static {
        Covode.recordClassIndex(41065);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C34127g mo60421j() {
        return (C34127g) this.f80720l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.h$a */
    public static final class C34132a {
        static {
            Covode.recordClassIndex(41066);
        }

        private C34132a() {
        }

        public /* synthetic */ C34132a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.h$c */
    static final class C34134c extends AbstractC89220m implements AbstractC89171a<C341351> {

        /* renamed from: a */
        public static final C34134c f80723a = new C34134c();

        static {
            Covode.recordClassIndex(41068);
        }

        C34134c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C341351 invoke() {
            return new AbstractC34259f() {
                /* class com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.C34131h.C34134c.C341351 */

                static {
                    Covode.recordClassIndex(41069);
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                /* renamed from: A */
                public final void mo60424A() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                /* renamed from: B */
                public final void mo60425B() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                public final boolean aZ_() {
                    return false;
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                public final void an_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                public final void bg_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                public final void bi_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
                /* renamed from: g */
                public final void mo60429g() {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final OnUIPlayListener getWrapperedListener() {
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBufferedPercent(String str, long j, int i) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBufferedTimeMs(String str, long j) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBuffering(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBuffering(boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onCompleteLoaded(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onDecoderBuffering(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onDecoderBuffering(boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPausePlay(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str, int i) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompletedFirstTime(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(C84208l lVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(String str, C84208l lVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayPause(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayPrepare(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayProgressChange(float f) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayProgressChange(String str, long j, long j2) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayRelease(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str, JSONObject jSONObject) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlaying(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreParePlay(String str, C84215n nVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreRenderSessionMissed(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreparePlay(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(C84216o oVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(String str, C84216o oVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrameFromResume(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderReady(C84215n nVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onResumePlay(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRetryOnError(C84208l lVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRetryOnError(String str, C84208l lVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onSeekEnd(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onSeekStart(String str, int i, float f) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onVideoSizeChanged(String str, int i, int i2) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                /* renamed from: z */
                public final View mo60468z() {
                    return null;
                }
            };
        }
    }

    /* renamed from: k */
    public final String mo60422k() {
        String str;
        C42435q qVar = this.f80719k;
        if (qVar == null || (str = qVar.f98895c) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: l */
    public final String mo60423l() {
        String str;
        C42435q qVar = this.f80719k;
        if (qVar == null || (str = qVar.f98896d) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.h$b */
    static final class C34133b extends AbstractC89220m implements AbstractC89171a<C34127g> {

        /* renamed from: a */
        final /* synthetic */ C34131h f80721a;

        /* renamed from: b */
        final /* synthetic */ C41827d f80722b;

        static {
            Covode.recordClassIndex(41067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34133b(C34131h hVar, C41827d dVar) {
            super(0);
            this.f80721a = hVar;
            this.f80722b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34127g invoke() {
            View view = this.f80722b.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C34131h hVar = this.f80721a;
            C34127g gVar = new C34127g(context, hVar, hVar, hVar.mo60489h().mo60498g(), this.f80721a.mo60489h().mo60497a(), this.f80721a.mo60484a(), (AbstractC34259f) this.f80721a.f80718b.getValue());
            this.f80721a.mo60485a(gVar);
            return gVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.h$d */
    public static final class C34136d extends AbstractC89220m implements AbstractC89172b<Aweme, String> {

        /* renamed from: a */
        final /* synthetic */ C34131h f80724a;

        static {
            Covode.recordClassIndex(41070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34136d(C34131h hVar) {
            super(1);
            this.f80724a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Aweme aweme) {
            return this.f80724a.mo60423l();
        }
    }

    /* renamed from: a */
    private final Bundle m69720a(Aweme aweme) {
        C67568r rVar = mo60421j().f80701b;
        String str = "general_search";
        if (!TextUtils.equals(rVar.f151312g, str)) {
            str = "search_result";
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_search_ad_no_request");
        bundle.putString("enter_from", str);
        bundle.putString("search_keyword", rVar.f151311f);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 70);
        bundle.putString("search_id", rVar.f151314i);
        bundle.putString("key_search_type", rVar.f151310e);
        bundle.putString("list_item_id", aweme.getAid());
        bundle.putString("search_result_id", aweme.getAuthorUid());
        return bundle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34131h(C41827d dVar, AbstractC51043a aVar, AbstractC51044b bVar) {
        super(dVar, aVar, bVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.f80720l = C89250i.m154773a((AbstractC89171a) new C34133b(this, dVar));
    }

    /* renamed from: a */
    public final void mo60419a(C42435q qVar, AwemeRawAd awemeRawAd, C67568r rVar) {
        String str;
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(rVar, "");
        List<? extends Aweme> list = qVar.f98893a;
        if (list == null) {
            list = C89086z.INSTANCE;
        }
        mo60487a(list);
        C41902e.m83943a(true, this.f80763f, 0);
        List<? extends Aweme> list2 = this.f80763f;
        if (list2 == null) {
            C89219l.m154715b();
        }
        super.mo70985a(list2, mo60421j());
        this.f80719k = qVar;
        mo60421j().f80700a = awemeRawAd;
        C34127g j = mo60421j();
        C42435q qVar2 = this.f80719k;
        if (qVar2 == null || (str = qVar2.f98896d) == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        j.f80702c = str;
        C34127g j2 = mo60421j();
        C89219l.m154721d(rVar, "");
        j2.f80701b = rVar;
        C34127g j3 = mo60421j();
        List<? extends Aweme> list3 = this.f80763f;
        if (list3 == null) {
            C89219l.m154715b();
        }
        j3.mo60376a(list3);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c
    /* renamed from: b */
    public final void mo60420b(int i, View view, Aweme aweme, List<? extends Aweme> list) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(list, "");
        View view2 = this.f97564j.itemView;
        C89219l.m154716b(view2, "");
        ((C67542d) ((C67542d) ((C67542d) ((C67542d) C42317b.m84679a(C42460j.C42461a.m84864a(view2)).mo106497x(mo60422k())).mo106491r("video")).mo106492s(aweme.getDesc()).mo106479a(Integer.valueOf(this.f80717a))).mo106490d(Integer.valueOf(i))).mo106495v(aweme.getAid()).mo106487g(mo60423l()).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c
    /* renamed from: a */
    public final void mo60417a(int i, View view, Aweme aweme, List<? extends Aweme> list) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(list, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        mo60418a(context, view, aweme, list);
        View view2 = this.f97564j.itemView;
        C89219l.m154716b(view2, "");
        ((C67542d) ((C67542d) ((C67496as) ((C67542d) C42317b.m84680b(C42460j.C42461a.m84864a(view2)).mo106497x(mo60422k())).mo106491r("video")).mo106440B("click_video").mo106492s(aweme.getDesc()).mo106479a(Integer.valueOf(this.f80717a))).mo106490d(Integer.valueOf(i))).mo106495v(aweme.getAid()).mo106487g(mo60423l()).mo96792f();
        C42467o.m84881a(view, "general_search", aweme, this.f97563i.f151311f, this.f80717a, mo60423l(), aweme.getAid(), "aladdin_card");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo60418a(Context context, View view, Aweme aweme, List<? extends Aweme> list) {
        C0576b bVar;
        Bundle bundle;
        C42436r rVar;
        C42436r rVar2;
        String str;
        String str2 = "";
        C89219l.m154721d(context, str2);
        C89219l.m154721d(aweme, str2);
        C89219l.m154721d(list, str2);
        Bundle a = m69720a(aweme);
        String str3 = null;
        if (view != null) {
            bVar = C0576b.m2193b(view, view.getWidth(), view.getHeight());
        } else {
            bVar = null;
        }
        C50540h.f116810b = list;
        C42077d dVar = new C42077d();
        dVar.mo71276a_(list);
        C50529ae.f116790a = dVar;
        SmartRoute withParam = new SmartRoute(context).withParam(a);
        if (bVar != null) {
            bundle = bVar.mo2564a();
        } else {
            bundle = null;
        }
        SmartRoute withParam2 = withParam.withBundleAnimation(bundle).withParam("activity_has_activity_options", true);
        C42435q qVar = this.f80719k;
        if (!(qVar == null || (rVar2 = qVar.f98894b) == null || (str = rVar2.f98897a) == null)) {
            str2 = str;
        }
        if (!TrendingDetailServiceImpl.m137898b().mo122881a() || TextUtils.isEmpty(str2)) {
            withParam2.withUrl("//aweme/detail");
        } else {
            this.f80761d = aweme;
            SmartRoute withParam3 = withParam2.withUrl("//trending/detail").withParam("outer_aweme_id", aweme.getAid()).withParam("is_from_trending_card", "1").withParam("trending_event_id", str2);
            C42435q qVar2 = this.f80719k;
            if (!(qVar2 == null || (rVar = qVar2.f98894b) == null)) {
                str3 = rVar.f98898b;
            }
            withParam3.withParam("trending_event_name", str3).withParam("video_from", "from_trending_inflow").withParam("search_result_id", mo60423l());
        }
        withParam2.open();
        C49419b.m92487a(aweme);
        C42435q qVar3 = this.f80719k;
        if (qVar3 != null && qVar3.f98894b != null) {
            this.f97563i.mo106508a(new C34136d(this));
            C67704b.m119869a(this.f97563i);
            AbstractView$OnAttachStateChangeListenerC34144b bVar2 = mo60489h().f80809d;
            if (bVar2 != null) {
                bVar2.mo60477a(true);
            }
            C34181a.f80834b = this.f80717a;
        }
    }
}
