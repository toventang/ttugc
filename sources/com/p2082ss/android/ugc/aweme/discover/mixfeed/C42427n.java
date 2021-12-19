package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18079b;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.discover.api.C41854a;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.mob.C42469q;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42073a;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67603e;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67607i;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67608j;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a.C67598e;
import java.util.LinkedHashMap;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.n */
public final class C42427n implements AbstractC42073a {

    /* renamed from: z */
    public static final C42429b f98859z = new C42429b((byte) 0);

    /* renamed from: a */
    public C67678d f98860a;

    /* renamed from: b */
    public String f98861b;

    /* renamed from: c */
    public int f98862c;

    /* renamed from: d */
    public int f98863d;

    /* renamed from: e */
    public int f98864e;

    /* renamed from: f */
    public String f98865f;

    /* renamed from: g */
    public String f98866g;

    /* renamed from: h */
    public int f98867h;

    /* renamed from: i */
    public C67437b f98868i;

    /* renamed from: j */
    public String f98869j;

    /* renamed from: k */
    public int f98870k;

    /* renamed from: l */
    public Integer f98871l;

    /* renamed from: m */
    public Integer f98872m;

    /* renamed from: n */
    public Integer f98873n;

    /* renamed from: o */
    public int f98874o;

    /* renamed from: p */
    public int f98875p;

    /* renamed from: q */
    public String f98876q;

    /* renamed from: r */
    public String f98877r;

    /* renamed from: s */
    public int f98878s;

    /* renamed from: t */
    public String f98879t;

    /* renamed from: u */
    public String f98880u;

    /* renamed from: v */
    public String f98881v;

    /* renamed from: w */
    public C42174f f98882w;

    /* renamed from: x */
    public String f98883x;

    /* renamed from: y */
    public boolean f98884y;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.n$b */
    public static final class C42429b {
        static {
            Covode.recordClassIndex(50375);
        }

        private C42429b() {
        }

        public /* synthetic */ C42429b(byte b) {
            this();
        }
    }

    private C42427n() {
        this.f98861b = "";
        this.f98865f = "";
        this.f98869j = "";
        this.f98876q = "";
        this.f98877r = "";
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.n$a */
    public static final class C42428a {

        /* renamed from: a */
        public final C42427n f98885a;

        static {
            Covode.recordClassIndex(50374);
        }

        public C42428a() {
            C42427n nVar = new C42427n((byte) 0);
            this.f98885a = nVar;
            nVar.f98874o = C42434p.f98890a;
            nVar.f98875p = C42434p.f98891b;
        }

        /* renamed from: a */
        public final C42427n mo71625a() {
            if (this.f98885a.f98868i == null) {
                mo71622a((C67437b) null);
            }
            return this.f98885a;
        }

        /* renamed from: a */
        public final C42428a mo71621a(int i) {
            this.f98885a.f98862c = i;
            return this;
        }

        /* renamed from: b */
        public final C42428a mo71626b(int i) {
            this.f98885a.f98863d = i;
            return this;
        }

        /* renamed from: c */
        public final C42428a mo71628c(int i) {
            this.f98885a.f98864e = i;
            return this;
        }

        /* renamed from: d */
        public final C42428a mo71630d(int i) {
            this.f98885a.f98867h = i;
            return this;
        }

        /* renamed from: e */
        public final C42428a mo71632e(int i) {
            this.f98885a.f98870k = i;
            return this;
        }

        /* renamed from: g */
        public final C42428a mo71635g(String str) {
            this.f98885a.f98880u = str;
            return this;
        }

        /* renamed from: h */
        public final C42428a mo71636h(String str) {
            this.f98885a.f98879t = str;
            return this;
        }

        /* renamed from: a */
        public final C42428a mo71623a(C67678d dVar) {
            this.f98885a.f98860a = dVar;
            return this;
        }

        /* renamed from: b */
        public final C42428a mo71627b(String str) {
            C89219l.m154721d(str, "");
            this.f98885a.f98865f = str;
            return this;
        }

        /* renamed from: c */
        public final C42428a mo71629c(String str) {
            this.f98885a.f98866g = str;
            return this;
        }

        /* renamed from: d */
        public final C42428a mo71631d(String str) {
            C89219l.m154721d(str, "");
            this.f98885a.f98869j = str;
            return this;
        }

        /* renamed from: e */
        public final C42428a mo71633e(String str) {
            C89219l.m154721d(str, "");
            this.f98885a.f98876q = str;
            return this;
        }

        /* renamed from: f */
        public final C42428a mo71634f(String str) {
            C89219l.m154721d(str, "");
            this.f98885a.f98877r = str;
            return this;
        }

        /* renamed from: a */
        public final C42428a mo71624a(String str) {
            C89219l.m154721d(str, "");
            this.f98885a.f98861b = str;
            return this;
        }

        /* renamed from: a */
        public final C42428a mo71622a(C67437b bVar) {
            int i;
            if (bVar != null) {
                this.f98885a.f98868i = bVar;
                this.f98885a.f98872m = Integer.valueOf(bVar.getSortType());
                this.f98885a.f98873n = Integer.valueOf(bVar.getFilterBy());
                C42427n nVar = this.f98885a;
                if (!bVar.isDefaultOption()) {
                    i = 1;
                } else {
                    i = 0;
                }
                nVar.f98871l = Integer.valueOf(i);
            }
            return this;
        }
    }

    static {
        Covode.recordClassIndex(50373);
        Context a = C17867d.m33078a();
        if (C42434p.f98890a == 0) {
            C42434p.f98890a = C34728n.m70948b((double) C34723i.m70928b(a));
        }
        if (C42434p.f98891b == 0) {
            C42434p.f98891b = C34728n.m70948b((double) C34723i.m70924a(a));
        }
    }

    /* renamed from: a */
    public final C1731i<C42426m> mo71616a() {
        if (this.f98862c == 0) {
            C67605g.m119730a(this.f98860a).mo106582b();
            C67606h.m119736a(this.f98860a).mo106594a().mo106601b(0);
            C67592a.f151371d.mo106558a();
            C67592a.f151370c.mo106570a((Integer) 0);
            C42469q.m84884a(C67458j.f151133b);
            SearchMixFeedCollectionTypeAdapterFactory.f151106a = true;
            this.f98883x = C42047s.C42048a.m84150a().mo71202a();
        } else {
            SearchMixFeedCollectionTypeAdapterFactory.f151106a = false;
        }
        C1731i<C42426m> a = C42433o.m84811a(this);
        C1731i<TContinuationResult> b = a.mo5537b(new C42430c(this, a));
        C89219l.m154716b(b, "");
        return b;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = ((((((((((((((this.f98861b.hashCode() * 31) + this.f98862c) * 31) + this.f98863d) * 31) + this.f98864e) * 31) + this.f98865f.hashCode()) * 31) + this.f98867h) * 31) + this.f98869j.hashCode()) * 31) + this.f98870k) * 31;
        Integer num = this.f98871l;
        int i3 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        int i4 = (hashCode + i) * 31;
        Integer num2 = this.f98872m;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = -1;
        }
        int i5 = (i4 + i2) * 31;
        Integer num3 = this.f98873n;
        if (num3 != null) {
            i3 = num3.intValue();
        }
        return i5 + i3;
    }

    /* renamed from: b */
    public final C1731i<C18079b<C42426m>> mo71617b() {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        String str3;
        String str4;
        LinkedHashMap<String, Integer> linkedHashMap;
        C67678d dVar;
        if (this.f98862c == 0) {
            C67605g.m119730a(this.f98860a).mo106582b();
            C67606h.m119736a(this.f98860a).mo106594a().mo106601b(1);
            C67592a.f151371d.mo106560a((Integer) 1);
            C42469q.m84884a(C67458j.f151133b);
        }
        SearchMixFeedCollectionTypeAdapterFactory.f151106a = false;
        SearchApiNew.RealApi realApi = SearchApiNew.RealApi.C41840a.f97604a;
        String str5 = this.f98861b;
        int i4 = this.f98862c;
        int i5 = this.f98863d;
        if (!TextUtils.isEmpty(this.f98869j)) {
            str = this.f98869j;
        } else {
            str = null;
        }
        int i6 = this.f98870k;
        if (!TextUtils.isEmpty(this.f98865f)) {
            str2 = this.f98865f;
        } else {
            str2 = null;
        }
        String str6 = this.f98866g;
        int i7 = this.f98867h;
        int i8 = this.f98878s;
        String str7 = this.f98879t;
        String str8 = this.f98880u;
        Integer num = this.f98871l;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = this.f98873n;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        Integer num3 = this.f98872m;
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = 0;
        }
        C42174f fVar = this.f98882w;
        if (fVar == null || (dVar = fVar.f98301r) == null) {
            str3 = null;
        } else {
            str3 = dVar.getGuideSearchBaseWord();
        }
        C67678d dVar2 = this.f98860a;
        if (dVar2 != null) {
            str4 = dVar2.getTrendingEventId();
        } else {
            str4 = null;
        }
        C67437b bVar = this.f98868i;
        if (bVar == null || (linkedHashMap = bVar.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        return realApi.searchMTMixFeedListByChunk(str5, i4, i5, str, i6, str2, str6, i7, i8, str7, str8, i, i2, i3, str3, str4, linkedHashMap);
    }

    public final String toString() {
        return "SearchMixFeedRequest(keyword='" + this.f98861b + "', cursor=" + this.f98862c + ", count=" + this.f98863d + ", pullRefresh=" + this.f98864e + ", searchId='" + this.f98865f + "', correctType=" + this.f98867h + ", searchSource='" + this.f98869j + "', hotSearchSource=" + this.f98870k + ", sortType=" + this.f98872m + ", filterBy=" + this.f98873n + ", clientWidth=" + this.f98874o + ')';
    }

    public /* synthetic */ C42427n(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.n$d */
    public static final class C42432d extends AbstractC89220m implements AbstractC89172b<C67598e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f98889a;

        static {
            Covode.recordClassIndex(50378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42432d(String str) {
            super(1);
            this.f98889a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C67598e eVar) {
            C67598e eVar2 = eVar;
            String str = "";
            C89219l.m154721d(eVar2, str);
            String str2 = this.f98889a;
            if (str2 != null) {
                str = str2;
            }
            eVar2.mo106569a(2, str);
            return C89391z.f203057a;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C89219l.m154714a(getClass(), obj.getClass()))) {
            return false;
        }
        C42427n nVar = (C42427n) obj;
        if (this.f98862c == nVar.f98862c && this.f98863d == nVar.f98863d && this.f98864e == nVar.f98864e && this.f98867h == nVar.f98867h && this.f98870k == nVar.f98870k && !(!C89219l.m154714a(this.f98872m, nVar.f98872m)) && !(!C89219l.m154714a(this.f98873n, nVar.f98873n)) && !(!C89219l.m154714a((Object) this.f98861b, (Object) nVar.f98861b)) && !(!C89219l.m154714a((Object) this.f98865f, (Object) nVar.f98865f)) && !(!C89219l.m154714a((Object) this.f98869j, (Object) nVar.f98869j))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.n$c */
    public static final class C42430c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C42427n f98886a;

        /* renamed from: b */
        final /* synthetic */ C1731i f98887b;

        static {
            Covode.recordClassIndex(50376);
        }

        C42430c(C42427n nVar, C1731i iVar) {
            this.f98886a = nVar;
            this.f98887b = iVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            int i;
            int i2;
            C67603e d = C67605g.m119730a(this.f98886a.f98860a).mo106587d();
            C67607i b = C67606h.m119736a(this.f98886a.f98860a).mo106600b();
            C42469q.m84885b(C67458j.f151133b);
            if (this.f98887b.mo5544c()) {
                final Exception e = this.f98887b.mo5546e();
                C41854a.f97649a = null;
                d.mo106583b(1).mo106584b(e.getMessage());
                b.mo106604c(1).mo106602b(e.getMessage());
                C67592a.m119682a((AbstractC89172b<? super C67598e, C89391z>) new AbstractC89172b<C67598e, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.C42427n.C42430c.C424311 */

                    static {
                        Covode.recordClassIndex(50377);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C67598e eVar) {
                        C67598e eVar2 = eVar;
                        C89219l.m154721d(eVar2, "");
                        eVar2.mo106572a(e);
                        return C89391z.f203057a;
                    }
                });
            } else if (this.f98887b.mo5539b()) {
                C41854a.f97649a = null;
                d.mo106583b(2).mo106592g();
                b.mo106604c(2).mo106610f();
            } else {
                C42426m mVar = (C42426m) this.f98887b.mo5545d();
                C89219l.m154716b(mVar, "");
                C41854a.m83838a(mVar.f98851e);
                List<C42411h> list = mVar.f98850c;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                d.mo106586c(i).mo106580a(mVar.getRequestId()).mo106579a(mVar).mo106583b(0);
                List<C42411h> list2 = mVar.f98850c;
                if (list2 != null) {
                    i2 = list2.size();
                } else {
                    i2 = 0;
                }
                C67607i a = b.mo106608e(i2).mo106599a(mVar.getRequestId());
                Integer valueOf = Integer.valueOf(mVar.f98848a);
                if (!C89219l.m154714a(a, C67608j.f151482a)) {
                    a.f151478v = valueOf;
                }
                a.mo106598a(mVar).mo106604c(0);
            }
            if (this.f98886a.f98884y) {
                return null;
            }
            return iVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42073a
    /* renamed from: a */
    public final void mo71269a(int i, String str) {
        this.f98884y = true;
        C67605g.m119730a(this.f98860a).mo106587d().mo106583b(2).mo106592g();
        C67606h.m119736a(this.f98860a).mo106600b().mo106604c(2).mo106606d(i).mo106610f();
        C67592a.m119682a((AbstractC89172b<? super C67598e, C89391z>) new C42432d(str));
    }
}
