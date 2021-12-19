package com.p2082ss.android.ugc.aweme.search.p3695k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.k.c */
public class C67540c<T extends C67540c<T>> extends C67511b<T> {

    /* renamed from: d */
    public static final C67541a f151269d = new C67541a((byte) 0);

    static {
        Covode.recordClassIndex(79177);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.k.c$a */
    public static final class C67541a {
        static {
            Covode.recordClassIndex(79178);
        }

        private C67541a() {
        }

        public /* synthetic */ C67541a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final T mo106480a(String str) {
        mo106452c("search_id", str);
        return this;
    }

    /* renamed from: b */
    public final T mo106482b(String str) {
        mo106452c("search_keyword", str);
        return this;
    }

    /* renamed from: c */
    public final T mo106483c(String str) {
        mo106452c("log_pb", str);
        return this;
    }

    /* renamed from: d */
    public final T mo106484d(String str) {
        mo106452c("impr_id", str);
        return this;
    }

    /* renamed from: e */
    public final T mo106485e(String str) {
        mo106452c("anchor_id", str);
        return this;
    }

    /* renamed from: f */
    public final T mo106486f(String str) {
        mo106452c("search_type", str);
        return this;
    }

    /* renamed from: g */
    public final T mo106487g(String str) {
        mo106449b("search_result_id", str);
        return this;
    }

    /* renamed from: q */
    public final T mo106488q(String str) {
        mo106452c("action_type", str);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67540c(String str) {
        super(str);
        C89219l.m154721d(str, "");
    }

    /* renamed from: a */
    public final T mo106479a(Integer num) {
        mo106452c("rank", String.valueOf(num));
        return this;
    }

    /* renamed from: b */
    public final T mo106481b(Integer num) {
        mo106452c("order", String.valueOf(num));
        return this;
    }
}
