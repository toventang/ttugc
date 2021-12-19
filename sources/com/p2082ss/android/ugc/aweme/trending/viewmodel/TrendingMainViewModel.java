package com.p2082ss.android.ugc.aweme.trending.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.search.C67647m;
import com.p2082ss.android.ugc.aweme.trending.p4148d.C79066b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel */
public final class TrendingMainViewModel extends CommonListViewModel<Aweme, TrendingMainState> {

    /* renamed from: m */
    public static final C79132a f177841m = new C79132a((byte) 0);

    /* renamed from: a */
    public Aweme f177842a;

    /* renamed from: b */
    public long f177843b = System.currentTimeMillis();

    /* renamed from: c */
    public String f177844c = "";

    /* renamed from: d */
    public boolean f177845d;

    /* renamed from: e */
    public final C33943c<Boolean> f177846e = new C33943c<>();

    /* renamed from: f */
    public final C33943c<ArrayList<C67590l>> f177847f = new C33943c<>();

    /* renamed from: g */
    public boolean f177848g;

    /* renamed from: k */
    public boolean f177849k = true;

    /* renamed from: l */
    public C49812b f177850l = new C49812b();

    /* renamed from: n */
    private C79156c f177851n = new C79156c();

    static {
        Covode.recordClassIndex(92317);
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$a */
    public static final class C79132a {
        static {
            Covode.recordClassIndex(92318);
        }

        private C79132a() {
        }

        public /* synthetic */ C79132a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: a */
    public final AbstractC89172b<TrendingMainState, AbstractC88979t<C89378p<List<Aweme>, C20465o>>> mo33725a() {
        return new C79136d(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: b */
    public final AbstractC89172b<TrendingMainState, AbstractC88979t<C89378p<List<Aweme>, C20465o>>> mo33726b() {
        return new C79135c(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new TrendingMainState(null, null, null, null, null, null, false, 127, null);
    }

    /* renamed from: m */
    public final ArrayList<C67590l> mo122947m() {
        ArrayList<C67590l> value = this.f177847f.getValue();
        if (value == null) {
            return new ArrayList<>();
        }
        return value;
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        String str;
        String str2;
        super.onCleared();
        Aweme aweme = this.f177842a;
        if (aweme != null) {
            if (this.f177845d) {
                str = "click_arrow";
            } else {
                str = "slide_rightward";
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f177843b;
            String str3 = this.f177844c;
            C49812b bVar = this.f177850l;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str, "");
            if (C89219l.m154714a((Object) str3, (Object) "click_fyp_trending_bar") && aweme.getTrendingBarFYP() != null) {
                AwemeTrendingBar trendingBarFYP = aweme.getTrendingBarFYP();
                Map<String, String> trackMap = trendingBarFYP.getTrackMap();
                C33744d a = new C33744d().mo59983a("enter_from", "trending_inflow_page").mo59983a("enter_method", str);
                if (bVar == null || (str2 = bVar.getFromGroupId()) == null) {
                    str2 = "";
                }
                C33744d a2 = a.mo59983a("from_group_id", str2);
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                C33744d a3 = a2.mo59983a("group_id", aid).mo59983a("trending_topic", trendingBarFYP.getEventKeyword()).mo59983a("trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
                String str4 = trackMap.get("trending_topic_source");
                if (str4 == null) {
                    str4 = "";
                }
                C33744d a4 = a3.mo59983a("trending_topic_source", str4);
                String str5 = trackMap.get("topic_rank");
                if (str5 == null) {
                    str5 = "";
                }
                C33744d a5 = a4.mo59983a("topic_rank", str5);
                String str6 = trackMap.get("topic_group_rank");
                if (str6 == null) {
                    str6 = "";
                }
                C33744d a6 = a5.mo59983a("topic_group_rank", str6);
                String str7 = trackMap.get("topic_group_num");
                if (str7 == null) {
                    str7 = "";
                }
                C33744d a7 = a6.mo59983a("topic_group_num", str7).mo59981a("inflow_stay_duration", currentTimeMillis);
                C89219l.m154716b(a7, "");
                C79066b.m137890a("trending_inflow_page_quit", a7);
            }
        }
    }

    /* renamed from: a */
    public final void mo122945a(C67590l lVar) {
        C89219l.m154721d(lVar, "");
        mo33689c(new C79138f(lVar));
    }

    /* renamed from: b */
    public final void mo122946b(C67590l lVar) {
        C89219l.m154721d(lVar, "");
        mo33689c(new C79140h(lVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$c */
    static final class C79135c extends AbstractC89220m implements AbstractC89172b<TrendingMainState, AbstractC88979t<C89378p<? extends List<? extends Aweme>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ TrendingMainViewModel f177861a;

        static {
            Covode.recordClassIndex(92321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79135c(TrendingMainViewModel trendingMainViewModel) {
            super(1);
            this.f177861a = trendingMainViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Aweme>, ? extends C20465o>> invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            C89219l.m154721d(trendingMainState2, "");
            TrendingMainViewModel trendingMainViewModel = this.f177861a;
            return trendingMainViewModel.mo122944a(false, trendingMainState2, trendingMainViewModel.f177850l.getOutAwemeId(), trendingMainState2.getLoadingTrending());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$d */
    static final class C79136d extends AbstractC89220m implements AbstractC89172b<TrendingMainState, AbstractC88979t<C89378p<? extends List<? extends Aweme>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ TrendingMainViewModel f177862a;

        static {
            Covode.recordClassIndex(92322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79136d(TrendingMainViewModel trendingMainViewModel) {
            super(1);
            this.f177862a = trendingMainViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Aweme>, ? extends C20465o>> invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            C89219l.m154721d(trendingMainState2, "");
            TrendingMainViewModel trendingMainViewModel = this.f177862a;
            return trendingMainViewModel.mo122944a(true, trendingMainState2, trendingMainViewModel.f177850l.getOutAwemeId(), trendingMainState2.getLoadingTrending());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$e */
    public static final class C79137e extends AbstractC89220m implements AbstractC89172b<TrendingMainState, TrendingMainState> {

        /* renamed from: a */
        public static final C79137e f177863a = new C79137e();

        static {
            Covode.recordClassIndex(92323);
        }

        C79137e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            C89219l.m154721d(trendingMainState2, "");
            return TrendingMainState.copy$default(trendingMainState2, null, null, null, null, null, null, false, 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$f */
    static final class C79138f extends AbstractC89220m implements AbstractC89172b<TrendingMainState, TrendingMainState> {

        /* renamed from: a */
        final /* synthetic */ C67590l f177864a;

        static {
            Covode.recordClassIndex(92324);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79138f(C67590l lVar) {
            super(1);
            this.f177864a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            C89219l.m154721d(trendingMainState2, "");
            return TrendingMainState.copy$default(trendingMainState2, null, this.f177864a, null, null, null, null, false, 125, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$g */
    public static final class C79139g extends AbstractC89220m implements AbstractC89172b<TrendingMainState, TrendingMainState> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f177865a;

        static {
            Covode.recordClassIndex(92325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79139g(ArrayList arrayList) {
            super(1);
            this.f177865a = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            C89219l.m154721d(trendingMainState2, "");
            return TrendingMainState.copy$default(trendingMainState2, null, null, null, this.f177865a, null, null, false, 119, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$h */
    static final class C79140h extends AbstractC89220m implements AbstractC89172b<TrendingMainState, TrendingMainState> {

        /* renamed from: a */
        final /* synthetic */ C67590l f177866a;

        static {
            Covode.recordClassIndex(92326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79140h(C67590l lVar) {
            super(1);
            this.f177866a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            C89219l.m154721d(trendingMainState2, "");
            return TrendingMainState.copy$default(trendingMainState2, null, null, this.f177866a, null, null, null, false, 123, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$b */
    public static final class C79133b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ TrendingMainViewModel f177852a;

        /* renamed from: b */
        final /* synthetic */ boolean f177853b;

        /* renamed from: c */
        final /* synthetic */ String f177854c;

        /* renamed from: d */
        final /* synthetic */ C67590l f177855d;

        /* renamed from: e */
        final /* synthetic */ String f177856e;

        static {
            Covode.recordClassIndex(92319);
        }

        C79133b(TrendingMainViewModel trendingMainViewModel, boolean z, String str, C67590l lVar, String str2) {
            this.f177852a = trendingMainViewModel;
            this.f177853b = z;
            this.f177854c = str;
            this.f177855d = lVar;
            this.f177856e = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            int i;
            boolean z;
            final C67647m mVar = (C67647m) obj;
            C89219l.m154721d(mVar, "");
            this.f177852a.f177848g = !this.f177853b;
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            int i2 = 0;
            if (mVar.mo106639a()) {
                String str = mVar.f151552c;
                if (str == null) {
                    str = this.f177854c;
                }
                eVar.element = (T) C79158e.m137991b(str, mVar.f151551b);
                if (eVar.element == null) {
                    eVar.element = (T) this.f177855d;
                }
                i = mVar.f151555f;
            } else {
                String str2 = mVar.f151552c;
                if (str2 == null) {
                    str2 = this.f177854c;
                }
                eVar.element = (T) C79158e.m137993d(str2, mVar.f151551b);
                i = 0;
            }
            final C89233z.C89238e eVar2 = new C89233z.C89238e();
            String str3 = mVar.f151552c;
            if (str3 == null) {
                str3 = this.f177854c;
            }
            eVar2.element = (T) C79158e.m137991b(str3, mVar.f151551b);
            if (eVar2.element == null) {
                T t = (T) new C67590l();
                t.setEventId(this.f177854c);
                t.setTrendingName(this.f177856e);
                eVar2.element = t;
            }
            if (mVar.mo106639a() || eVar.element != null) {
                z = true;
            } else {
                z = false;
            }
            String.valueOf(eVar.element);
            final StringBuilder sb = new StringBuilder();
            ArrayList<C67590l> arrayList = mVar.f151551b;
            if (arrayList != null) {
                this.f177852a.f177847f.postValue(arrayList);
                for (T t2 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    String eventId = t2.getEventId();
                    if (eventId != null) {
                        sb.append(eventId);
                        if (i2 != arrayList.size() - 1) {
                            sb.append(",");
                        }
                    }
                    i2 = i3;
                }
            }
            this.f177852a.mo33689c(new AbstractC89172b<TrendingMainState, TrendingMainState>() {
                /* class com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel.C79133b.C791341 */

                static {
                    Covode.recordClassIndex(92320);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
                    boolean z;
                    TrendingMainState trendingMainState2 = trendingMainState;
                    C89219l.m154721d(trendingMainState2, "");
                    ArrayList<C67590l> arrayList = mVar.f151551b;
                    T t = eVar2.element;
                    T t2 = eVar.element;
                    String sb = sb.toString();
                    List<? extends Aweme> list = mVar.f151550a;
                    if (list == null || list.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return TrendingMainState.copy$default(trendingMainState2, null, t, t2, null, arrayList, sb, z, 9, null);
                }
            });
            List<? extends Aweme> list = mVar.f151550a;
            if (list != null) {
                for (T t3 : list) {
                    String str4 = mVar.f151552c;
                    if (str4 == null) {
                        str4 = this.f177854c;
                    }
                    t3.setTrendingId(str4);
                    String trendingName = eVar2.element.getTrendingName();
                    if (trendingName == null) {
                        trendingName = "";
                    }
                    t3.setTrendingName(trendingName);
                    t3.setFromTrendingCard(this.f177852a.f177850l.getIsFromTrendingCard());
                }
            }
            List<? extends Aweme> list2 = mVar.f151550a;
            if (list2 != null) {
                Integer.valueOf(list2.size());
            }
            Object obj2 = mVar.f151550a;
            if (obj2 == null) {
                obj2 = C89086z.INSTANCE;
            }
            return C89387v.m154943a(obj2, new C20465o(z, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r17 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r6 = r18.getSubstate().getPayload();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r0 = r16.f177851n;
        r5 = new com.p2082ss.android.ugc.aweme.trending.viewmodel.C79157d(r6, r7, r19, r18.getTrendingIdList(), r16.f177844c, (byte) 0);
        p4600h.p4611f.p4613b.C89219l.m154721d(r5, "");
        r0 = r0.f177902b.mo33487c(r5).mo143278b(p4560f.p4561a.p4587h.C88925a.m154180b(p4560f.p4561a.p4590k.C88946a.f201991c)).mo143292d(new com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel.C79133b(r16, r17, r7, r20, r15));
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r20 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r15 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r15 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r6 = new com.bytedance.jedi.arch.ext.list.C20465o(false, 3, (byte) 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4560f.p4561a.AbstractC88979t<p4600h.C89378p<java.util.List<com.p2082ss.android.ugc.aweme.feed.model.Aweme>, com.bytedance.jedi.arch.ext.list.C20465o>> mo122944a(boolean r17, com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainState r18, java.lang.String r19, com.p2082ss.android.ugc.aweme.search.C67590l r20) {
        /*
            r16 = this;
            r3 = r16
            java.lang.String r2 = ""
            r4 = r18
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r2)
            r14 = r20
            if (r14 == 0) goto L_0x0013
            java.lang.String r7 = r14.getEventId()
            if (r7 != 0) goto L_0x0016
        L_0x0013:
            r7 = r2
            if (r14 == 0) goto L_0x001c
        L_0x0016:
            java.lang.String r15 = r14.getTrendingName()
            if (r15 != 0) goto L_0x001d
        L_0x001c:
            r15 = r2
        L_0x001d:
            com.bytedance.jedi.arch.ext.list.o r6 = new com.bytedance.jedi.arch.ext.list.o
            r1 = 3
            r0 = 0
            r6.<init>(r0, r1, r0)
            r12 = r17
            if (r12 != 0) goto L_0x0030
            com.bytedance.jedi.arch.ext.list.ListState r0 = r4.getSubstate()
            com.bytedance.jedi.arch.ext.list.o r6 = r0.getPayload()
        L_0x0030:
            com.ss.android.ugc.aweme.trending.viewmodel.c r0 = r3.f177851n
            com.ss.android.ugc.aweme.trending.viewmodel.d r5 = new com.ss.android.ugc.aweme.trending.viewmodel.d
            java.lang.String r9 = r4.getTrendingIdList()
            java.lang.String r10 = r3.f177844c
            r11 = 0
            r8 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r2)
            com.ss.android.ugc.aweme.trending.viewmodel.a r0 = r0.f177902b
            f.a.t r1 = r0.mo33487c(r5)
            f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c
            f.a.aa r0 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)
            f.a.t r0 = r1.mo143278b(r0)
            com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$b r10 = new com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$b
            r11 = r16
            r13 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            f.a.t r0 = r0.mo143292d(r10)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel.mo122944a(boolean, com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState, java.lang.String, com.ss.android.ugc.aweme.search.l):f.a.t");
    }
}
