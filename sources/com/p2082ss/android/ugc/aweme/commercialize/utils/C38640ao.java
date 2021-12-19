package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37587b;
import com.p2082ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38247o;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38253r;
import com.p2082ss.android.ugc.aweme.commercialize.p2600m.C38206a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38647aq;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49751h;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import p077b.C1731i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao */
public final class C38640ao implements AbstractC38674ba {

    /* renamed from: a */
    static WeakReference<AbstractC49815a> f91303a;

    /* renamed from: b */
    static volatile int f91304b = -1;

    /* renamed from: c */
    static volatile long f91305c;

    /* renamed from: d */
    public static final C38640ao f91306d = new C38640ao();

    /* renamed from: e */
    private static Timer f91307e;

    /* renamed from: f */
    private static volatile boolean f91308f;

    /* renamed from: g */
    private static volatile int f91309g = -1;

    /* renamed from: h */
    private static final Set<Integer> f91310h = new LinkedHashSet();

    /* renamed from: i */
    private static volatile boolean f91311i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao$c */
    public static final class C38645c extends TimerTask {
        static {
            Covode.recordClassIndex(46186);
        }

        C38645c() {
        }

        public final void run() {
            AbstractC49815a aVar;
            WeakReference<AbstractC49815a> weakReference = C38640ao.f91303a;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                C89219l.m154716b(aVar, "");
                int aE = aVar.mo81110aE();
                AbstractC48191b bVar = aVar.f114768W;
                C89219l.m154716b(bVar, "");
                C38640ao.m78398a(aE, new ArrayList(bVar.mo80288e()));
            }
        }
    }

    private C38640ao() {
    }

    /* renamed from: e */
    private static C38253r m78401e() {
        C38253r rVar = C38206a.f90250b;
        if (rVar == null) {
            return C38206a.f90249a;
        }
        return rVar;
    }

    /* renamed from: b */
    public static void m78399b() {
        Timer timer = f91307e;
        if (timer != null) {
            timer.cancel();
        }
        f91307e = null;
    }

    /* renamed from: d */
    public static boolean m78400d() {
        if (m78401e().f90392b) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(46181);
    }

    /* renamed from: a */
    public static void m78396a() {
        long millis = TimeUnit.SECONDS.toMillis(C37587b.m75844a().getRequestPeriod());
        f91307e = new Timer();
        C38645c cVar = new C38645c();
        Timer timer = f91307e;
        if (timer != null) {
            timer.schedule(cVar, millis, millis);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38674ba
    /* renamed from: c */
    public final void mo67218c() {
        if (m78401e().f90391a && f91311i) {
            f91303a = null;
            f91311i = false;
            f91309g = -1;
            f91304b = -1;
            f91310h.clear();
            m78399b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao$a */
    static final class C38641a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C38641a f91312a = new C38641a();

        static {
            Covode.recordClassIndex(46182);
        }

        C38641a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC49815a aVar;
            WeakReference<AbstractC49815a> weakReference = C38640ao.f91303a;
            if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                long j = 0;
                if (C38640ao.f91305c != 0) {
                    j = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - C38640ao.f91305c);
                }
                if (j > C37587b.m75844a().getRequestPeriod()) {
                    C89219l.m154716b(aVar, "");
                    int aE = aVar.mo81110aE();
                    AbstractC48191b bVar = aVar.f114768W;
                    C89219l.m154716b(bVar, "");
                    if (C38640ao.m78398a(aE, new ArrayList(bVar.mo80288e()))) {
                        C38640ao.m78399b();
                        C38640ao.m78396a();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao$b */
    public static final class C38642b implements AwemeAdRankApi.AbstractC37605a {

        /* renamed from: a */
        final /* synthetic */ List f91313a;

        /* renamed from: b */
        final /* synthetic */ Map f91314b;

        /* renamed from: c */
        final /* synthetic */ int f91315c;

        /* renamed from: d */
        final /* synthetic */ long f91316d;

        /* renamed from: e */
        final /* synthetic */ int f91317e;

        /* renamed from: f */
        final /* synthetic */ int f91318f;

        /* renamed from: g */
        final /* synthetic */ int f91319g;

        /* renamed from: h */
        final /* synthetic */ List f91320h;

        static {
            Covode.recordClassIndex(46183);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao$b$a */
        static final class C38643a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C38642b f91321a;

            /* renamed from: b */
            final /* synthetic */ List f91322b;

            /* renamed from: c */
            final /* synthetic */ String f91323c;

            static {
                Covode.recordClassIndex(46184);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38643a(C38642b bVar, List list, String str) {
                super(0);
                this.f91321a = bVar;
                this.f91322b = list;
                this.f91323c = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC49815a aVar;
                WeakReference<AbstractC49815a> weakReference = C38640ao.f91303a;
                AbstractC49751h hVar = null;
                if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                    int aE = aVar.mo81110aE();
                    int aF = aVar.mo81111aF();
                    if (this.f91321a.f91317e == aE && this.f91321a.f91317e == C38640ao.f91304b && aF == this.f91321a.f91318f) {
                        if (aVar instanceof AbstractC49751h) {
                            hVar = aVar;
                        }
                        AbstractC49751h hVar2 = hVar;
                        if (hVar2 != null) {
                            hVar2.mo84307a(this.f91322b, this.f91321a.f91315c, this.f91321a.f91319g, new AbstractC49751h.AbstractC49752a(this) {
                                /* class com.p2082ss.android.ugc.aweme.commercialize.utils.C38640ao.C38642b.C38643a.C386441 */

                                /* renamed from: a */
                                final /* synthetic */ C38643a f91324a;

                                static {
                                    Covode.recordClassIndex(46185);
                                }

                                /* JADX WARN: Incorrect args count in method signature: ()V */
                                {
                                    this.f91324a = r1;
                                }

                                @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49751h.AbstractC49752a
                                /* renamed from: a */
                                public final void mo67219a(String str, Exception exc) {
                                    if (C38640ao.m78400d()) {
                                        String valueOf = String.valueOf(str);
                                        List<Aweme> list = this.f91324a.f91321a.f91320h;
                                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                                        for (Aweme aweme : list) {
                                            arrayList.add(aweme.getAid());
                                        }
                                        C38646ap.m78408a("fail", valueOf);
                                    }
                                }
                            });
                        } else if (C38640ao.m78400d()) {
                            List<Aweme> list = this.f91321a.f91320h;
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                            for (Aweme aweme : list) {
                                arrayList.add(aweme.getAid());
                            }
                            C38646ap.m78408a("fail", "unsupported_page");
                        }
                    } else if (C38640ao.m78400d()) {
                        List<Aweme> list2 = this.f91321a.f91320h;
                        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                        for (Aweme aweme2 : list2) {
                            arrayList2.add(aweme2.getAid());
                        }
                        C38646ap.m78408a("fail", "current_item_changed");
                    }
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.AbstractC37605a
        /* renamed from: a */
        public final void mo65516a(String str) {
            C89219l.m154721d(str, "");
            if (C38640ao.m78400d()) {
                List<Aweme> list = this.f91320h;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (Aweme aweme : list) {
                    arrayList.add(aweme.getAid());
                }
                C38646ap.m78408a("fail", str);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.AbstractC37605a
        /* renamed from: a */
        public final void mo65517a(String str, Exception exc) {
            String str2;
            C89219l.m154721d(str, "");
            if (C38640ao.m78400d()) {
                StringBuilder append = new StringBuilder().append(str).append(' ');
                if (exc != null) {
                    str2 = exc.getMessage();
                } else {
                    str2 = null;
                }
                String sb = append.append(str2).toString();
                List<Aweme> list = this.f91320h;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (Aweme aweme : list) {
                    arrayList.add(aweme.getAid());
                }
                C38646ap.m78408a("fail", sb);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.AbstractC37605a
        /* renamed from: a */
        public final void mo65518a(List<C38247o> list, String str) {
            AbstractC33368e a;
            Aweme repackAweme;
            C89219l.m154721d(list, "");
            List<Aweme> g = C89070n.m154585g((Collection) this.f91313a);
            for (T t : list) {
                Aweme repackAweme2 = t.getRepackAweme();
                if (!(repackAweme2 == null || !repackAweme2.isAd() || (repackAweme = t.getRepackAweme()) == null)) {
                    C38189j.m77504b(C17867d.m33078a(), repackAweme);
                    C18129a.m33746a("draw_ad", "receive", repackAweme.getAwemeRawAd()).mo28902c();
                }
            }
            ArrayList arrayList = new ArrayList();
            for (T t2 : list) {
                Object repackAweme3 = t2.getRepackAweme();
                if (repackAweme3 != null || (repackAweme3 = this.f91314b.get(t2.getAwemeId())) != null) {
                    arrayList.add(repackAweme3);
                }
            }
            ArrayList arrayList2 = arrayList;
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                Aweme aweme = (Aweme) obj;
                aweme.awemePosition = this.f91315c + i;
                aweme.setFeedCount(this.f91316d);
                if (aweme.isAd()) {
                    g.remove(aweme);
                }
                i = i2;
            }
            for (Aweme aweme2 : g) {
                C38640ao.m78397a(aweme2);
            }
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (!(f == null || (a = f.mo59376a()) == null)) {
                a.mo59412a(arrayList2);
            }
            C38647aq.m78409a(new C38643a(this, arrayList2, str));
        }

        C38642b(List list, Map map, int i, long j, int i2, int i3, int i4, List list2) {
            this.f91313a = list;
            this.f91314b = map;
            this.f91315c = i;
            this.f91316d = j;
            this.f91317e = i2;
            this.f91318f = i3;
            this.f91319g = i4;
            this.f91320h = list2;
        }
    }

    /* renamed from: a */
    public static void m78397a(Aweme aweme) {
        Context a = C17867d.m33078a();
        C38189j.m77510b(a, "delete", aweme, C38189j.m77468a(a, aweme, false, (Map<String, String>) null));
        C18129a.m33746a("draw_ad", "delete", aweme.getAwemeRawAd()).mo28902c();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38674ba
    /* renamed from: a */
    public final void mo67217a(Object obj, int i) {
        C89219l.m154721d(obj, "");
        f91304b = Math.max(f91304b, i);
        if (m78401e().f90391a) {
            if (!f91311i) {
                f91303a = new WeakReference<>(obj);
                f91311i = true;
                m78396a();
            }
            C38641a aVar = C38641a.f91312a;
            C89219l.m154721d(aVar, "");
            C1731i.m5640b(new C38647aq.CallableC38649b(aVar), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public static boolean m78398a(int i, List<? extends Aweme> list) {
        boolean z;
        boolean z2;
        C89219l.m154721d(list, "");
        if (!f91308f || i == f91309g || i < f91304b) {
            return false;
        }
        Set<Integer> set = f91310h;
        if (set.contains(Integer.valueOf(i)) || (list.size() - i) - 1 <= 2) {
            return false;
        }
        long b = C38740e.m78580b();
        if (b <= 0) {
            return false;
        }
        if (C38647aq.m78410a((Aweme) list.get(i + 1)) || C38647aq.m78410a((Aweme) list.get(i + 2)) || b < C37587b.m75844a().getVisitAdMaxInterval() - 1) {
            z = false;
        } else {
            z = true;
        }
        int i2 = i + 2;
        if (!C38647aq.m78410a((Aweme) list.get(i2)) || b > C37587b.m75844a().getVisitAdMinInterval() + 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(z || z2)) {
            return false;
        }
        f91309g = i;
        set.add(Integer.valueOf(i));
        f91305c = System.currentTimeMillis();
        int size = list.size() - 1;
        int size2 = list.size();
        long feedCount = ((Aweme) list.get(i2)).getFeedCount();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(C89387v.m154943a(t.getAid(), t));
        }
        Map a = C89041ag.m154417a(arrayList);
        C89269g gVar = new C89269g(i2, size);
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a(gVar, 10));
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(list.get(((AbstractC89040af) it).mo143429a()));
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((Aweme) obj).isAd()) {
                arrayList4.add(obj);
            }
        }
        AwemeAdRankApi.m75861a(arrayList3, b, new C38642b(arrayList4, a, i2, feedCount, i, size2, size, arrayList3));
        return true;
    }
}
