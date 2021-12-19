package com.p2082ss.android.ugc.aweme.discover.mob.helpers;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mob.C42465m;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67507ay;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper */
public final class SearchSugMobHelper extends AbstractC1174ac {

    /* renamed from: f */
    public static final C42457a f98976f = new C42457a((byte) 0);

    /* renamed from: a */
    public LogPbBean f98977a;

    /* renamed from: b */
    public String f98978b;

    /* renamed from: c */
    public String f98979c;

    /* renamed from: d */
    public RecommendWordMob f98980d;

    /* renamed from: e */
    public AbstractC89171a<Integer> f98981e;

    static {
        Covode.recordClassIndex(50405);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper$a */
    public static final class C42457a {
        static {
            Covode.recordClassIndex(50406);
        }

        private C42457a() {
        }

        public /* synthetic */ C42457a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo71676a(String str, Integer num, String str2, C67679e eVar) {
        int i;
        Integer invoke;
        C89219l.m154721d(eVar, "");
        C67540c cVar = (C67540c) new C67507ay().mo106459o(this.f98979c).mo106460p("sug");
        AbstractC89171a<Integer> aVar = this.f98981e;
        if (aVar == null || (invoke = aVar.invoke()) == null) {
            i = C67458j.f151133b;
        } else {
            i = invoke.intValue();
        }
        ((C67540c) ((C67530bj) ((C67530bj) cVar.mo106486f(C42465m.m84870b(i))).mo106464A(str).mo106488q(str2)).mo106465B(this.f98978b).mo106482b(eVar.f151667b).mo106453i(eVar.f151671f.getId())).mo106481b(num).mo96792f();
    }
}
