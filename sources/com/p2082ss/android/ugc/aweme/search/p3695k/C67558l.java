package com.p2082ss.android.ugc.aweme.search.p3695k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.search.k.l */
public final class C67558l extends C67542d<C67558l> {

    /* renamed from: e */
    public static final C67559a f151288e = new C67559a((byte) 0);

    static {
        Covode.recordClassIndex(79195);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.k.l$a */
    public static final class C67559a {
        static {
            Covode.recordClassIndex(79196);
        }

        private C67559a() {
        }

        public /* synthetic */ C67559a(byte b) {
            this();
        }
    }

    public C67558l(C67568r rVar) {
        super("feed_enter", rVar);
    }

    /* renamed from: f */
    public final C67558l mo106503f(Aweme aweme) {
        if (aweme != null) {
            mo106454j(aweme.getAuthorUid());
            mo106453i(aweme.getGroupId());
            mo106458n(aweme.getRequestId());
            if (aweme.getRank() != -1) {
                mo106479a(Integer.valueOf(aweme.getRank()));
            }
        }
        return this;
    }
}
