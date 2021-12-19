package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34152h;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import com.p2082ss.android.ugc.aweme.xsearch.C81687b;
import com.p2082ss.android.ugc.aweme.xsearch.C81688c;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.k */
public final class C81729k extends AbstractC34152h implements AbstractC41814c {

    /* renamed from: k */
    public static final C81730a f182758k = new C81730a((byte) 0);

    /* renamed from: a */
    public C81703f f182759a;

    /* renamed from: b */
    public final C81723j f182760b;

    /* renamed from: c */
    public final C51060g f182761c = mo60489h().mo60497a();

    /* renamed from: l */
    private final AbstractC89244h f182762l;

    /* renamed from: m */
    private C81702e f182763m;

    /* renamed from: n */
    private final AbstractC89244h f182764n;

    static {
        Covode.recordClassIndex(95134);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34152h
    /* renamed from: a */
    public final RecyclerView mo60484a() {
        return (RecyclerView) this.f182762l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c
    /* renamed from: a */
    public final void mo60417a(int i, View view, Aweme aweme, List<? extends Aweme> list) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(list, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c
    /* renamed from: b */
    public final void mo60420b(int i, View view, Aweme aweme, List<? extends Aweme> list) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(list, "");
    }

    /* renamed from: j */
    public final C81733l mo60489h() {
        return (C81733l) this.f182764n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.k$a */
    public static final class C81730a {
        static {
            Covode.recordClassIndex(95135);
        }

        private C81730a() {
        }

        public /* synthetic */ C81730a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.k$b */
    static final class C81731b extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C41827d f182765a;

        static {
            Covode.recordClassIndex(95136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81731b(C41827d dVar) {
            super(0);
            this.f182765a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ RecyclerView invoke() {
            return this.f182765a.f97566a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.k$c */
    static final class C81732c extends AbstractC89220m implements AbstractC89171a<C81733l> {

        /* renamed from: a */
        final /* synthetic */ C81729k f182766a;

        /* renamed from: b */
        final /* synthetic */ AbstractC51044b f182767b;

        /* renamed from: c */
        final /* synthetic */ AbstractC51043a f182768c;

        static {
            Covode.recordClassIndex(95137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81732c(C81729k kVar, AbstractC51044b bVar, AbstractC51043a aVar) {
            super(0);
            this.f182766a = kVar;
            this.f182767b = bVar;
            this.f182768c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C81733l invoke() {
            return new C81733l(this.f182766a.mo60484a(), this.f182766a.mo60490i(), this.f182767b, this.f182768c, (byte) 0);
        }
    }

    /* renamed from: k */
    private final void m141596k() {
        C81687b bVar;
        C81702e eVar = this.f182763m;
        if (eVar != null) {
            mo60484a().mo4418b(eVar);
        }
        C81703f fVar = this.f182759a;
        if (fVar != null && (bVar = fVar.f182697b) != null) {
            C81702e eVar2 = new C81702e(bVar);
            this.f182763m = eVar2;
            mo60484a().mo4405a(eVar2);
        }
    }

    /* renamed from: a */
    private final int m141595a(String str) {
        C81703f fVar;
        C81688c cVar;
        C42345d dVar;
        List<Aweme> awemeList;
        if (!(str == null || (fVar = this.f182759a) == null || (cVar = fVar.f182698c) == null || (dVar = cVar.f182656j) == null || (awemeList = dVar.getAwemeList()) == null)) {
            int size = awemeList.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = awemeList.get(i);
                C89219l.m154716b(aweme, "");
                if (C89219l.m154714a((Object) aweme.getAid(), (Object) str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo125402a(C81703f fVar) {
        this.f182759a = fVar;
        this.f182760b.f182750g = fVar;
        mo60489h().mo125405a(fVar);
        m141596k();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34152h
    public final void onVideoEvent(C49672ag agVar) {
        C89219l.m154721d(agVar, "");
        if (C0792v.m2791y(this.f97564j.itemView)) {
            int i = agVar.f114315a;
            if (i == 13) {
                Object obj = agVar.f114316b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    for (T t : this.f182760b.mo125400f()) {
                        if (C89219l.m154714a((Object) t.getAid(), (Object) str)) {
                            Bundle bundle = agVar.f114317c;
                            if (bundle != null) {
                                int i2 = bundle.getInt("user_digged");
                                t.setUserDigg(i2);
                                if (t.getStatistics() != null) {
                                    AwemeStatistics statistics = t.getStatistics();
                                    if (statistics == null) {
                                        C89219l.m154715b();
                                    }
                                    long diggCount = statistics.getDiggCount();
                                    if (i2 == 1) {
                                        AwemeStatistics statistics2 = t.getStatistics();
                                        C89219l.m154716b(statistics2, "");
                                        statistics2.setDiggCount(diggCount + 1);
                                    } else {
                                        AwemeStatistics statistics3 = t.getStatistics();
                                        C89219l.m154716b(statistics3, "");
                                        statistics3.setDiggCount(diggCount - 1);
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            } else if (i == 21) {
                Aweme aweme = null;
                if (mo60490i() != null) {
                    C67704b.m119869a(null);
                }
                Object obj2 = agVar.f114316b;
                if (obj2 instanceof Aweme) {
                    aweme = obj2;
                }
                Aweme aweme2 = aweme;
                if (aweme2 != null) {
                    int a = m141595a(aweme2.getAid());
                    if (a >= 0 || (a = m141595a(this.f80762e)) >= 0) {
                        mo60488g().mo4347a(a, 0);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo125403a(List<C81701d> list, C67568r rVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(rVar, "");
        this.f97564j.mo70986a(this.f182760b);
        this.f182760b.f182744a = rVar;
        this.f182760b.mo125399b(list);
        mo70984a(rVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81729k(C41827d dVar, AbstractC51043a aVar, AbstractC51044b bVar) {
        super(dVar, aVar, bVar);
        C89219l.m154721d(dVar, "");
        this.f182762l = C89250i.m154773a((AbstractC89171a) new C81731b(dVar));
        this.f182764n = C89250i.m154773a((AbstractC89171a) new C81732c(this, bVar, aVar));
        View view = dVar.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C81723j jVar = new C81723j(context, this, mo60489h().mo60498g(), mo60489h().mo60497a(), mo60484a(), this.f182759a);
        this.f182760b = jVar;
        mo60485a(jVar);
    }
}
