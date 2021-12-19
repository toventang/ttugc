package com.p2082ss.android.ugc.aweme.trending.p4149ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.trending.p4148d.C79066b;
import com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel;
import java.util.List;
import java.util.Map;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.ui.b */
public final class C79080b extends C41178b {

    /* renamed from: F */
    private static final C79081a f177739F = new C79081a((byte) 0);

    /* renamed from: a */
    private TrendingMainViewModel f177740a;

    static {
        Covode.recordClassIndex(92261);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: m */
    public final void mo70387m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.b$a */
    static final class C79081a {
        static {
            Covode.recordClassIndex(92262);
        }

        private C79081a() {
        }

        public /* synthetic */ C79081a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: p */
    public final void mo70407p() {
        super.mo70407p();
        this.f114768W.f111624b = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: t */
    public final boolean mo70515t() {
        TrendingMainViewModel trendingMainViewModel = this.f177740a;
        if (trendingMainViewModel == null) {
            return true;
        }
        trendingMainViewModel.f177842a = mo70429y();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: b */
    public final void mo70476b(List<Aweme> list) {
        TrendingMainViewModel trendingMainViewModel = this.f177740a;
        if (trendingMainViewModel == null || !trendingMainViewModel.f177849k) {
            this.f114759N.mo67973a(0, false);
        } else {
            super.mo70476b(list);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public final void mo59512a(List<Aweme> list, boolean z) {
        super.mo59512a(list, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public final void mo70393a(View view, Bundle bundle) {
        super.mo70393a(view, bundle);
        Object obj = this.f114830be;
        if (!(obj instanceof TrendingMainViewModel)) {
            obj = null;
        }
        this.f177740a = (TrendingMainViewModel) obj;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo84699a(boolean z, Aweme aweme, Aweme aweme2) {
        String str;
        super.mo84699a(z, aweme, aweme2);
        String g = mo81096g(true);
        C49812b bVar = this.f114782aJ;
        C89219l.m154716b(bVar, "");
        mo84766bs();
        C89219l.m154721d(bVar, "");
        C1731i.m5640b(new C79066b.CallableC79067a(!z, bVar, g, aweme, aweme2), C39162r.m79452a());
        TrendingMainViewModel trendingMainViewModel = this.f177740a;
        if (trendingMainViewModel == null || (str = trendingMainViewModel.f177844c) == null) {
            str = "";
        }
        boolean z2 = !z;
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "click_fyp_trending_bar") && aweme != null && aweme.getTrendingBarFYP() != null && aweme2 != null && aweme2.getTrendingBarFYP() != null) {
            AwemeTrendingBar trendingBarFYP = aweme.getTrendingBarFYP();
            Map<String, String> trackMap = aweme.getTrendingBarFYP().getTrackMap();
            AwemeTrendingBar trendingBarFYP2 = aweme2.getTrendingBarFYP();
            Map<String, String> trackMap2 = aweme2.getTrendingBarFYP().getTrackMap();
            C33744d a = new C33744d().mo59983a("enter_from", "trending_inflow_page").mo59983a("trending_entrance", "homepage_hot_trending_bar");
            String groupId = aweme.getGroupId();
            if (groupId == null) {
                groupId = "";
            }
            C33744d a2 = a.mo59983a("from_group_id", groupId).mo59983a("from_trending_topic", trendingBarFYP.getEventKeyword()).mo59983a("from_trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
            String str2 = trackMap.get("trending_topic_source");
            if (str2 == null) {
                str2 = "";
            }
            C33744d a3 = a2.mo59983a("from_trending_topic_source", str2);
            String str3 = trackMap.get("topic_rank");
            if (str3 == null) {
                str3 = "";
            }
            C33744d a4 = a3.mo59983a("from_topic_rank", str3);
            String str4 = trackMap.get("topic_group_rank");
            if (str4 == null) {
                str4 = "";
            }
            C33744d a5 = a4.mo59983a("from_topic_group_rank", str4);
            String str5 = trackMap.get("topic_group_num");
            if (str5 == null) {
                str5 = "";
            }
            C33744d a6 = a5.mo59983a("from_topic_group_num", str5);
            String groupId2 = aweme2.getGroupId();
            if (groupId2 == null) {
                groupId2 = "";
            }
            C33744d a7 = a6.mo59983a("to_group_id", groupId2).mo59983a("to_trending_topic", trendingBarFYP2.getEventKeyword()).mo59983a("to_trending_topic_id", String.valueOf(trendingBarFYP2.getEventKeywordId()));
            String str6 = trackMap2.get("trending_topic_source");
            if (str6 == null) {
                str6 = "";
            }
            C33744d a8 = a7.mo59983a("to_trending_topic_source", str6);
            String str7 = trackMap2.get("topic_rank");
            if (str7 == null) {
                str7 = "";
            }
            C33744d a9 = a8.mo59983a("to_topic_rank", str7);
            String str8 = trackMap2.get("topic_group_rank");
            if (str8 == null) {
                str8 = "";
            }
            C33744d a10 = a9.mo59983a("to_topic_group_rank", str8);
            String str9 = trackMap2.get("topic_group_num");
            if (str9 == null) {
                str9 = "";
            }
            C33744d a11 = a10.mo59983a("to_topic_group_num", str9);
            if (z2) {
                C89219l.m154716b(a11, "");
                C79066b.m137890a("trending_inflow_slide_down", a11);
                return;
            }
            C89219l.m154716b(a11, "");
            C79066b.m137890a("trending_inflow_slide_up", a11);
        }
    }
}
