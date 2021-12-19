package com.p2082ss.android.ugc.aweme.trending.p4148d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.util.Map;
import java.util.concurrent.Callable;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.d.b */
public final class C79066b {

    /* renamed from: a */
    public static final C79066b f177708a = new C79066b();

    private C79066b() {
    }

    static {
        Covode.recordClassIndex(92243);
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.b$a */
    public static final class CallableC79067a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f177709a;

        /* renamed from: b */
        final /* synthetic */ C49812b f177710b;

        /* renamed from: c */
        final /* synthetic */ String f177711c;

        /* renamed from: d */
        final /* synthetic */ Aweme f177712d;

        /* renamed from: e */
        final /* synthetic */ Aweme f177713e;

        static {
            Covode.recordClassIndex(92244);
        }

        public CallableC79067a(boolean z, C49812b bVar, String str, Aweme aweme, Aweme aweme2) {
            this.f177709a = z;
            this.f177710b = bVar;
            this.f177711c = str;
            this.f177712d = aweme;
            this.f177713e = aweme2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            String str3;
            if (this.f177709a) {
                str = "trending_slide_down";
            } else {
                str = "trending_slide_up";
            }
            C33744d a = new C33744d().mo59983a("search_id", this.f177710b.getSearchId()).mo59983a("enter_from", this.f177711c);
            Aweme aweme = this.f177712d;
            String str4 = null;
            if (aweme != null) {
                str2 = aweme.getAuthorUid();
            } else {
                str2 = null;
            }
            C33744d a2 = a.mo59983a("author_id", str2);
            Aweme aweme2 = this.f177712d;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            } else {
                str3 = null;
            }
            C33744d a3 = a2.mo59983a("from_group_id", str3);
            Aweme aweme3 = this.f177713e;
            if (aweme3 != null) {
                str4 = aweme3.getAid();
            }
            C33744d a4 = a3.mo59983a("to_group_id", str4);
            if (C80537hk.m139613a(this.f177710b.getIsFromTrendingCard())) {
                a4.mo59983a("is_from_trending_card", this.f177710b.getIsFromTrendingCard());
            }
            C39162r.m79460a(str, a4.f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m137889a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "click_fyp_trending_bar")) {
            C33744d a = new C33744d().mo59983a("enter_from", "trending_inflow_page").mo59983a("trending_entrance", "homepage_hot_trending_bar");
            C89219l.m154716b(a, "");
            m137890a("trending_inflow_panel_show", a);
        }
    }

    /* renamed from: a */
    public static void m137890a(String str, C33744d dVar) {
        C39162r.m79460a(str, dVar.f79943a);
    }

    /* renamed from: a */
    public static void m137891a(String str, C67590l lVar) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "click_fyp_trending_bar") && lVar != null) {
            Map<String, String> extraMap = lVar.getExtraMap();
            C33744d a = new C33744d().mo59983a("enter_from", "trending_inflow_page").mo59983a("enter_method", "click_bottom_topic_bar").mo59983a("trending_entrance", "homepage_hot_trending_bar").mo59983a("trending_topic", lVar.getTrendingName()).mo59983a("trending_topic_id", lVar.getEventId());
            String str2 = extraMap.get("trending_topic_source");
            if (str2 == null) {
                str2 = "";
            }
            C33744d a2 = a.mo59983a("trending_topic_source", str2);
            String str3 = extraMap.get("topic_rank");
            if (str3 == null) {
                str3 = "";
            }
            C33744d a3 = a2.mo59983a("topic_rank", str3);
            String str4 = extraMap.get("topic_group_num");
            if (str4 == null) {
                str4 = "";
            }
            C33744d a4 = a3.mo59983a("topic_group_num", str4);
            C89219l.m154716b(a4, "");
            m137890a("trending_inflow_topic_click", a4);
        }
    }

    /* renamed from: a */
    public static void m137892a(String str, C67590l lVar, Integer num, C49812b bVar) {
        String str2;
        C89219l.m154721d(bVar, "");
        C33744d a = new C33744d().mo59983a("search_id", bVar.getSearchId()).mo59983a("search_keyword", bVar.getSearchKeyword()).mo59983a("search_result_id", bVar.getSearchResultId()).mo59983a("enter_from", str);
        String str3 = null;
        if (lVar != null) {
            str2 = lVar.getTrendingName();
        } else {
            str2 = null;
        }
        C33744d a2 = a.mo59983a("trending_topic", str2);
        if (lVar != null) {
            str3 = lVar.getEventId();
        }
        C33744d a3 = a2.mo59983a("trending_topic_id", str3).mo59982a("rank", num);
        if (C80537hk.m139613a(bVar.getIsFromTrendingCard())) {
            a3.mo59983a("is_from_trending_card", bVar.getIsFromTrendingCard());
        }
        C39162r.m79460a("click_more_trending", a3.f79943a);
    }
}
