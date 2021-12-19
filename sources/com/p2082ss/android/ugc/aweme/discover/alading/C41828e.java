package com.p2082ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e;
import com.p2082ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.p2082ss.android.ugc.aweme.discover.helper.C42058x;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67498at;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67558l;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.e */
public final class C41828e extends C41817e {

    /* renamed from: a */
    public SearchChallenge f97568a;

    /* renamed from: b */
    public AbstractC89171a<C89391z> f97569b;

    /* renamed from: c */
    public AbstractC89171a<Integer> f97570c;

    /* renamed from: f */
    private final AbstractC89244h f97571f = C89250i.m154773a((AbstractC89171a) new C41829a(this));

    static {
        Covode.recordClassIndex(49744);
    }

    /* renamed from: f */
    private final C42058x m83792f() {
        return (C42058x) this.f97571f.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: b */
    public final String mo70975b() {
        return "hot_challenge";
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: c */
    public final int mo70976c() {
        return 65456;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: d */
    public final String mo70977d() {
        return "video";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.alading.e$a */
    public static final class C41829a extends AbstractC89220m implements AbstractC89171a<C42058x> {

        /* renamed from: a */
        final /* synthetic */ C41828e f97572a;

        static {
            Covode.recordClassIndex(49745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41829a(C41828e eVar) {
            super(0);
            this.f97572a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42058x invoke() {
            return C42058x.C42059a.m84178a(new C42058x.AbstractC42060b(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.alading.C41828e.C41829a.C418301 */

                /* renamed from: a */
                final /* synthetic */ C41829a f97573a;

                static {
                    Covode.recordClassIndex(49746);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                public final int aU_() {
                    return 10;
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                public final Object aR_() {
                    return this.f97573a.f97572a.f97568a;
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                public final List<Aweme> aS_() {
                    List<Aweme> awemes;
                    SearchChallenge searchChallenge = this.f97573a.f97572a.f97568a;
                    if (!(searchChallenge == null || (awemes = searchChallenge.getAwemes()) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : awemes) {
                            T t2 = t;
                            C89219l.m154716b(t2, "");
                            if (!t2.isLive()) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2 != null) {
                            return C89070n.m154585g((Collection) arrayList2);
                        }
                    }
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                public final List<Aweme> aT_() {
                    List<Aweme> awemes;
                    SearchChallenge searchChallenge = this.f97573a.f97572a.f97568a;
                    if (!(searchChallenge == null || (awemes = searchChallenge.getAwemes()) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : awemes) {
                            T t2 = t;
                            C89219l.m154716b(t2, "");
                            if (t2.isLive()) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2 != null) {
                            return C89070n.m154585g((Collection) arrayList2);
                        }
                    }
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f97573a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
                /* renamed from: a */
                public final boolean mo70987a(Aweme aweme) {
                    C89219l.m154721d(aweme, "");
                    List<Aweme> aS_ = aS_();
                    if (aS_ == null) {
                        return false;
                    }
                    Iterator<T> it = aS_.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(it.next().getAid(), aweme.getAid())) {
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: e */
    public final String mo70978e() {
        String str;
        Challenge challenge;
        SearchChallenge searchChallenge = this.f97568a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str = null;
        } else {
            str = challenge.getCid();
        }
        return String.valueOf(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final void mo70970a() {
        String str;
        int i;
        Integer invoke;
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        C36125t a = C36125t.m73591a();
        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
        SearchChallenge searchChallenge = this.f97568a;
        if (searchChallenge == null) {
            C89219l.m154715b();
        }
        C36131u a2 = C36131u.m73602a(sb.append(searchChallenge.getChallenge().getCid()).toString()).mo63248a("enter_from", this.f97563i.f151312g).mo63248a("process_id", uuid);
        ICommerceChallengeService e = CommerceChallengeServiceImpl.m75741e();
        SearchChallenge searchChallenge2 = this.f97568a;
        if (searchChallenge2 == null) {
            C89219l.m154715b();
        }
        if (e.mo65392b(searchChallenge2.getChallenge())) {
            str = "1";
        } else {
            str = "0";
        }
        C36131u a3 = a2.mo63248a("is_commerce", str);
        SearchChallenge searchChallenge3 = this.f97568a;
        if (searchChallenge3 == null) {
            C89219l.m154715b();
        }
        C36125t.m73598a(a, a3.mo63247a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", searchChallenge3.getChallenge().getSubType()).mo63249a());
        View view = this.f97564j.itemView;
        C89219l.m154716b(view, "");
        C67496as B = ((C67496as) ((C67542d) C42317b.m84680b(C42460j.C42461a.m84864a(view)).mo106497x("hot_challenge").mo106487g(mo70978e())).mo106496w("1")).mo106440B("click_see_all");
        AbstractC89171a<Integer> aVar = this.f97570c;
        if (aVar == null || (invoke = aVar.invoke()) == null) {
            i = 0;
        } else {
            i = invoke.intValue();
        }
        B.mo106479a(Integer.valueOf(i)).mo96792f();
        AbstractC89171a<C89391z> aVar2 = this.f97569b;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41828e(C41827d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final C67558l mo70969a(Aweme aweme, View view) {
        String str;
        Challenge challenge;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(view, "");
        C67558l a = super.mo70969a(aweme, view);
        SearchChallenge searchChallenge = this.f97568a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str = null;
        } else {
            str = challenge.getCid();
        }
        a.mo106487g(str);
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.e$b */
    static final class C41831b extends AbstractC89220m implements AbstractC89183m<Aweme, List<Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41828e f97574a;

        /* renamed from: b */
        final /* synthetic */ C49672ag f97575b;

        static {
            Covode.recordClassIndex(49747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41831b(C41828e eVar, C49672ag agVar) {
            super(2);
            this.f97574a = eVar;
            this.f97575b = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Aweme aweme, List<Aweme> list) {
            Aweme aweme2 = aweme;
            List<Aweme> list2 = list;
            C89219l.m154721d(aweme2, "");
            SearchChallenge searchChallenge = this.f97574a.f97568a;
            if (searchChallenge != null) {
                if (list2 != null) {
                    searchChallenge.setAwemes(list2);
                    this.f97574a.mo70973a(list2);
                }
                C41828e.super.mo70971a((C41828e) this.f97575b, (C49672ag) aweme2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: b */
    public final Bundle mo70974b(Aweme aweme, View view) {
        String str;
        Challenge challenge;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(view, "");
        Bundle b = super.mo70974b(aweme, view);
        SearchChallenge searchChallenge = this.f97568a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str = null;
        } else {
            str = challenge.getCid();
        }
        b.putString("search_result_id", str);
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final C67498at mo70968a(Aweme aweme, Integer num) {
        String str;
        Challenge challenge;
        C67498at a = super.mo70968a(aweme, num);
        SearchChallenge searchChallenge = this.f97568a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str = null;
        } else {
            str = challenge.getChallengeName();
        }
        return (C67498at) a.mo106452c("hashtags_name", String.valueOf(str));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final void mo70971a(C49672ag agVar, Aweme aweme) {
        C89219l.m154721d(agVar, "");
        C89219l.m154721d(aweme, "");
        C42058x f = m83792f();
        if (f != null) {
            f.mo71225a(agVar, aweme, new C41831b(this, agVar));
        } else {
            super.mo70971a(agVar, aweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final C67496as mo70967a(Aweme aweme, Integer num, String str) {
        String str2;
        Challenge challenge;
        C89219l.m154721d(str, "");
        C67496as a = super.mo70967a(aweme, num, str);
        SearchChallenge searchChallenge = this.f97568a;
        if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
            str2 = null;
        } else {
            str2 = challenge.getChallengeName();
        }
        return (C67496as) a.mo106452c("hashtags_name", String.valueOf(str2));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final void mo70972a(Aweme aweme, View view, List<? extends Aweme> list) {
        String str;
        Challenge challenge;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(list, "");
        C67568r a = C42460j.C42461a.m84864a(view);
        C42058x f = m83792f();
        if (f != null) {
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            Bundle b = mo70974b(aweme, view);
            SearchContinuousLoadingApi.C41847b bVar = new SearchContinuousLoadingApi.C41847b();
            bVar.f97616a = a.f151311f;
            SearchChallenge searchChallenge = this.f97568a;
            if (searchChallenge == null || (challenge = searchChallenge.getChallenge()) == null) {
                str = null;
            } else {
                str = challenge.getCid();
            }
            bVar.f97618c = str;
            bVar.f97617b = 2;
            f.mo71224a(context, b, bVar);
            return;
        }
        super.mo70972a(aweme, view, list);
    }
}
