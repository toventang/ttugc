package com.p2082ss.android.ugc.aweme.trending.p4148d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.trending.d.a */
public final class C79056a {

    /* renamed from: a */
    public static C49812b f177697a;

    /* renamed from: b */
    public static AbstractC79068c f177698b = new C79057a();

    /* renamed from: c */
    public static AbstractC79068c f177699c = new C79059c();

    /* renamed from: d */
    public static AbstractC79068c f177700d = new C79058b();

    /* renamed from: e */
    public static AbstractC79068c f177701e = new C79060d();

    /* renamed from: f */
    public static AbstractC79068c f177702f = new C79063g();

    /* renamed from: g */
    public static AbstractC79068c f177703g = new C79065i();

    /* renamed from: h */
    public static AbstractC79068c f177704h = new C79064h();

    /* renamed from: i */
    public static AbstractC79068c f177705i = new C79062f();

    /* renamed from: j */
    public static AbstractC79068c f177706j = new C79061e();

    /* renamed from: k */
    public static final C79056a f177707k = new C79056a();

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$a */
    public static final class C79057a extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92234);
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            return "trending_inflow_page";
        }

        C79057a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$b */
    public static final class C79058b extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92235);
        }

        C79058b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            String str;
            C49812b bVar = C79056a.f177697a;
            if (bVar == null || (str = bVar.getFromGroupId()) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$c */
    public static final class C79059c extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92236);
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            return "homepage_hot_trending_bar";
        }

        C79059c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$d */
    public static final class C79060d extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92237);
        }

        C79060d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            AwemeTrendingBar trendingBarFYP;
            String eventKeyword;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (eventKeyword = trendingBarFYP.getEventKeyword()) == null) {
                return "";
            }
            return eventKeyword;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$e */
    public static final class C79061e extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92238);
        }

        C79061e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            String str;
            AwemeTrendingBar trendingBarFYP;
            Map<String, String> trackMap;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (trackMap = trendingBarFYP.getTrackMap()) == null || (str = trackMap.get("topic_group_num")) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$f */
    public static final class C79062f extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92239);
        }

        C79062f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            String str;
            AwemeTrendingBar trendingBarFYP;
            Map<String, String> trackMap;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (trackMap = trendingBarFYP.getTrackMap()) == null || (str = trackMap.get("topic_group_rank")) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$g */
    public static final class C79063g extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92240);
        }

        C79063g() {
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            Object obj;
            AwemeTrendingBar trendingBarFYP;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null) {
                obj = "";
            } else {
                obj = Long.valueOf(trendingBarFYP.getEventKeywordId());
            }
            return obj.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$h */
    public static final class C79064h extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92241);
        }

        C79064h() {
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            String str;
            AwemeTrendingBar trendingBarFYP;
            Map<String, String> trackMap;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (trackMap = trendingBarFYP.getTrackMap()) == null || (str = trackMap.get("topic_rank")) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.d.a$i */
    public static final class C79065i extends AbstractC79068c {
        static {
            Covode.recordClassIndex(92242);
        }

        C79065i() {
        }

        @Override // com.p2082ss.android.ugc.aweme.trending.p4148d.AbstractC79068c
        /* renamed from: a */
        public final String mo122879a(Aweme aweme) {
            String str;
            AwemeTrendingBar trendingBarFYP;
            Map<String, String> trackMap;
            if (aweme == null || (trendingBarFYP = aweme.getTrendingBarFYP()) == null || (trackMap = trendingBarFYP.getTrackMap()) == null || (str = trackMap.get("trending_topic_source")) == null) {
                str = "";
            }
            return str.toString();
        }
    }

    private C79056a() {
    }

    static {
        Covode.recordClassIndex(92233);
    }
}
