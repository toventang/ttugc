package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.w */
public final class C42056w {

    /* renamed from: a */
    public static final C42056w f98051a = new C42056w();

    /* renamed from: b */
    private static final AbstractC89244h f98052b = C89250i.m154773a((AbstractC89171a) C42057a.f98053a);

    private C42056w() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.w$a */
    static final class C42057a extends AbstractC89220m implements AbstractC89171a<IAwemeService> {

        /* renamed from: a */
        public static final C42057a f98053a = new C42057a();

        static {
            Covode.recordClassIndex(49987);
        }

        C42057a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAwemeService invoke() {
            return AwemeService.m70060b();
        }
    }

    static {
        Covode.recordClassIndex(49986);
    }

    /* renamed from: a */
    public static final void m84171a(List<? extends SearchChallenge> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<Aweme> awemes = it.next().getAwemes();
                if (awemes != null) {
                    int i = 0;
                    for (T t : awemes) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C89070n.m154520a();
                        }
                        awemes.set(i, ((IAwemeService) f98052b.getValue()).mo60677a((Aweme) t));
                        i = i2;
                    }
                }
            }
        }
    }
}
