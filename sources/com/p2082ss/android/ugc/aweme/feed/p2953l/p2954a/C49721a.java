package com.p2082ss.android.ugc.aweme.feed.p2953l.p2954a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.AbstractC49728a;
import com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.AbstractC49737d;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.l.a.a */
public final class C49721a {

    /* renamed from: a */
    public static final C49721a f114427a = new C49721a();

    private C49721a() {
    }

    static {
        Covode.recordClassIndex(58570);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.l.a.a$a */
    public static final class C49722a implements AbstractC49737d {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f114428a;

        /* renamed from: b */
        final /* synthetic */ Aweme f114429b;

        /* renamed from: c */
        final /* synthetic */ String f114430c;

        /* renamed from: d */
        final /* synthetic */ C49812b f114431d;

        static {
            Covode.recordClassIndex(58571);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.l.a.a$a$a */
        static final class View$OnClickListenerC49723a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C49722a f114432a;

            /* renamed from: b */
            final /* synthetic */ ViewGroup f114433b;

            /* renamed from: c */
            final /* synthetic */ AwemeTrendingBar f114434c;

            /* renamed from: d */
            final /* synthetic */ String f114435d;

            static {
                Covode.recordClassIndex(58572);
            }

            View$OnClickListenerC49723a(C49722a aVar, ViewGroup viewGroup, AwemeTrendingBar awemeTrendingBar, String str) {
                this.f114432a = aVar;
                this.f114433b = viewGroup;
                this.f114434c = awemeTrendingBar;
                this.f114435d = str;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                SmartRoute withParam = SmartRouter.buildRoute(this.f114433b.getContext(), this.f114434c.getSchema()).withParam("enter_from", this.f114435d);
                C49812b bVar = this.f114432a.f114431d;
                String str4 = null;
                if (bVar != null) {
                    str = bVar.getSearchId();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C49812b bVar2 = this.f114432a.f114431d;
                    if (bVar2 != null) {
                        str3 = bVar2.getSearchId();
                    } else {
                        str3 = null;
                    }
                    withParam.withParam("search_id", str3);
                }
                C49812b bVar3 = this.f114432a.f114431d;
                if (bVar3 != null) {
                    str2 = bVar3.getSearchKeyword();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    C49812b bVar4 = this.f114432a.f114431d;
                    if (bVar4 != null) {
                        str4 = bVar4.getSearchKeyword();
                    }
                    withParam.withParam("search_keyword", str4);
                }
                withParam.open();
                this.f114432a.mo81466a("click", this.f114435d);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.AbstractC49737d
        /* renamed from: a */
        public final void mo81465a(AbstractC49728a aVar) {
            C89219l.m154721d(aVar, "");
            if (!this.f114429b.hasTrendingBar() || this.f114429b.disableSearchTrendingBar) {
                aVar.mo81471a();
                return;
            }
            C1764a.m5927a(LayoutInflater.from(this.f114428a.getContext()), R.layout.th, this.f114428a, true);
            ViewGroup viewGroup = this.f114428a;
            AwemeTrendingBar trendingBar = this.f114429b.getTrendingBar();
            C89219l.m154716b(trendingBar, "");
            String str = this.f114430c;
            C17191a aVar2 = new C17191a.C17192a().mo27177a(trendingBar.getDisplay()).f40973a;
            View findViewById = viewGroup.findViewById(R.id.acq);
            C89219l.m154716b(findViewById, "");
            ((TuxTextView) findViewById).setText(aVar2);
            C20766v a = C20761r.m39060a(C34735v.m70965a(trendingBar.getIconUrl()));
            a.f49125v = EnumC20767w.CENTER;
            a.f49093F = (ImageView) viewGroup.findViewById(R.id.bi5);
            a.mo34186c();
            viewGroup.setOnClickListener(new View$OnClickListenerC49723a(this, viewGroup, trendingBar, str));
            mo81466a("show", this.f114430c);
        }

        /* renamed from: a */
        public final void mo81466a(String str, String str2) {
            String str3;
            if (this.f114429b.getTrendingBar() != null) {
                Map<String, String> trackMap = this.f114429b.getTrendingBar().getTrackMap();
                String logPbString = this.f114429b.getLogPbString();
                C89219l.m154716b(logPbString, "");
                trackMap.put("log_pd", logPbString);
                trackMap.put("action_type", str);
                trackMap.put("enter_from", str2);
                m93135a("group_id", this.f114429b.getGroupId(), trackMap);
                trackMap.put("event_keyword", this.f114429b.getTrendingBar().getEventKeyword());
                trackMap.put("event_keyword_id", String.valueOf(this.f114429b.getTrendingBar().getEventKeywordId()));
                if (this.f114429b.getAuthor() != null) {
                    User author = this.f114429b.getAuthor();
                    String str4 = null;
                    if (author != null) {
                        str3 = author.getUid();
                    } else {
                        str3 = null;
                    }
                    m93135a("author_id", str3, trackMap);
                    if (author != null) {
                        str4 = String.valueOf(author.getFollowStatus());
                    }
                    m93135a("follow_status", str4, trackMap);
                }
                C39162r.m79460a("hot_search_video_guide", trackMap);
            }
        }

        /* renamed from: a */
        private static void m93135a(String str, String str2, Map<String, String> map) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2 == null) {
                    C89219l.m154715b();
                }
                map.put(str, str2);
            }
        }

        public C49722a(ViewGroup viewGroup, Aweme aweme, String str, C49812b bVar) {
            this.f114428a = viewGroup;
            this.f114429b = aweme;
            this.f114430c = str;
            this.f114431d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.l.a.a$b */
    public static final class C49724b implements AbstractC49737d {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f114436a;

        /* renamed from: b */
        final /* synthetic */ Aweme f114437b;

        /* renamed from: c */
        final /* synthetic */ String f114438c;

        /* renamed from: d */
        final /* synthetic */ C49812b f114439d;

        static {
            Covode.recordClassIndex(58573);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.l.a.a$b$a */
        static final class View$OnClickListenerC49725a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C49724b f114440a;

            /* renamed from: b */
            final /* synthetic */ ViewGroup f114441b;

            /* renamed from: c */
            final /* synthetic */ AwemeTrendingBar f114442c;

            /* renamed from: d */
            final /* synthetic */ String f114443d;

            static {
                Covode.recordClassIndex(58574);
            }

            View$OnClickListenerC49725a(C49724b bVar, ViewGroup viewGroup, AwemeTrendingBar awemeTrendingBar, String str) {
                this.f114440a = bVar;
                this.f114441b = viewGroup;
                this.f114442c = awemeTrendingBar;
                this.f114443d = str;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                SmartRoute withParam = SmartRouter.buildRoute(this.f114441b.getContext(), this.f114442c.getSchema()).withParam("enter_from", this.f114443d);
                String groupId = this.f114440a.f114437b.getGroupId();
                if (groupId == null) {
                    groupId = "";
                }
                SmartRoute withParam2 = withParam.withParam("from_group_id", groupId);
                C49812b bVar = this.f114440a.f114439d;
                String str4 = null;
                if (bVar != null) {
                    str = bVar.getSearchId();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C49812b bVar2 = this.f114440a.f114439d;
                    if (bVar2 != null) {
                        str3 = bVar2.getSearchId();
                    } else {
                        str3 = null;
                    }
                    withParam2.withParam("search_id", str3);
                }
                C49812b bVar3 = this.f114440a.f114439d;
                if (bVar3 != null) {
                    str2 = bVar3.getSearchKeyword();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    C49812b bVar4 = this.f114440a.f114439d;
                    if (bVar4 != null) {
                        str4 = bVar4.getSearchKeyword();
                    }
                    withParam2.withParam("search_keyword", str4);
                }
                withParam2.open();
                this.f114440a.mo81468a("trending_bar_click");
                C49724b bVar5 = this.f114440a;
                if (bVar5.f114437b.getTrendingBarFYP() != null) {
                    bVar5.f114437b.getTrendingBarFYP().getTrackMap();
                    C33744d a = new C33744d().mo59983a("enter_from", "trending_inflow_page").mo59983a("trending_entrance", "homepage_hot_trending_bar");
                    String groupId2 = bVar5.f114437b.getGroupId();
                    if (groupId2 == null) {
                        groupId2 = "";
                    }
                    C39162r.m79460a("trending_inflow_page_show", a.mo59983a("from_group_id", groupId2).mo59983a("search_keyword", "").mo59983a("search_keyword_id", "").f79943a);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.AbstractC49737d
        /* renamed from: a */
        public final void mo81465a(AbstractC49728a aVar) {
            C89219l.m154721d(aVar, "");
            if (!this.f114437b.hasTrendingBarFYP() || !this.f114437b.disableSearchTrendingBar) {
                aVar.mo81471a();
                return;
            }
            C1764a.m5927a(LayoutInflater.from(this.f114436a.getContext()), R.layout.ti, this.f114436a, true);
            ViewGroup viewGroup = this.f114436a;
            AwemeTrendingBar trendingBarFYP = this.f114437b.getTrendingBarFYP();
            C89219l.m154716b(trendingBarFYP, "");
            String str = this.f114438c;
            C17191a aVar2 = new C17191a.C17192a().mo27177a(trendingBarFYP.getDisplay()).f40973a;
            View findViewById = viewGroup.findViewById(R.id.acq);
            C89219l.m154716b(findViewById, "");
            ((TuxTextView) findViewById).setText(aVar2);
            C20766v a = C20761r.m39060a(C34735v.m70965a(trendingBarFYP.getIconUrl()));
            a.f49125v = EnumC20767w.CENTER;
            a.f49093F = (ImageView) viewGroup.findViewById(R.id.bi5);
            a.mo34186c();
            viewGroup.setOnClickListener(new View$OnClickListenerC49725a(this, viewGroup, trendingBarFYP, str));
            mo81468a("trending_bar_show");
        }

        /* renamed from: a */
        public final void mo81468a(String str) {
            String str2;
            String str3;
            AwemeTrendingBar trendingBarFYP = this.f114437b.getTrendingBarFYP();
            if (trendingBarFYP != null) {
                Map<String, String> trackMap = trendingBarFYP.getTrackMap();
                if (C89219l.m154714a((Object) str, (Object) "trending_bar_click")) {
                    trackMap.put("enter_method", "click_trending_bar");
                } else {
                    trackMap.put("position", "bottom_bar");
                }
                C49812b bVar = this.f114439d;
                if (bVar == null || (str2 = bVar.getEventType()) == null) {
                    str2 = "";
                }
                trackMap.put("enter_from", str2);
                m93138a("group_id", this.f114437b.getGroupId(), trackMap);
                trackMap.put("trending_topic", trendingBarFYP.getEventKeyword());
                trackMap.put("trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
                if (this.f114437b.getAuthor() != null) {
                    User author = this.f114437b.getAuthor();
                    String str4 = null;
                    if (author != null) {
                        str3 = author.getUid();
                    } else {
                        str3 = null;
                    }
                    m93138a("author_id", str3, trackMap);
                    if (author != null) {
                        str4 = String.valueOf(author.getFollowStatus());
                    }
                    m93138a("follow_status", str4, trackMap);
                }
                C39162r.m79460a(str, trackMap);
            }
        }

        /* renamed from: a */
        private static void m93138a(String str, String str2, Map<String, String> map) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2 == null) {
                    C89219l.m154715b();
                }
                map.put(str, str2);
            }
        }

        public C49724b(ViewGroup viewGroup, Aweme aweme, String str, C49812b bVar) {
            this.f114436a = viewGroup;
            this.f114437b = aweme;
            this.f114438c = str;
            this.f114439d = bVar;
        }
    }
}
