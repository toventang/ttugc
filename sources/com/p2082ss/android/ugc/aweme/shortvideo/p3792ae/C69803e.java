package com.p2082ss.android.ugc.aweme.shortvideo.p3792ae;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C71852g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ae.e */
public final class C69803e implements AbstractC27235f<AVChallenge, C71852g> {

    /* renamed from: a */
    public static final C69804a f155986a = new C69804a((byte) 0);

    static {
        Covode.recordClassIndex(82209);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ae.e$a */
    public static final class C69804a {
        static {
            Covode.recordClassIndex(82210);
        }

        private C69804a() {
        }

        public /* synthetic */ C69804a(byte b) {
            this();
        }

        /* renamed from: a */
        public static ArrayList<C71852g> m123334a(List<? extends AVChallenge> list) {
            if (list == null) {
                return new ArrayList<>();
            }
            return C27404ap.m54807a((Iterable) C27404ap.m54811a(list, new C69803e()));
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* synthetic */ C71852g mo45319a(AVChallenge aVChallenge) {
        AVChallenge aVChallenge2 = aVChallenge;
        if (aVChallenge2 == null) {
            return null;
        }
        C71852g gVar = new C71852g();
        gVar.f161024a = aVChallenge2;
        return gVar;
    }
}
