package com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx.Api;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.lynx.d */
public final class C42424d {

    /* renamed from: a */
    public static C1731i<C42421a> f98844a;

    /* renamed from: b */
    static boolean f98845b;

    /* renamed from: c */
    public static final C42424d f98846c = new C42424d();

    private C42424d() {
    }

    static {
        Covode.recordClassIndex(50370);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.lynx.d$a */
    static final class C42425a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C42425a f98847a = new C42425a();

        static {
            Covode.recordClassIndex(50371);
        }

        C42425a() {
        }

        @Override // p077b.AbstractC1729g
        public final /* bridge */ /* synthetic */ Object then(C1731i iVar) {
            C42424d.f98845b = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m84790a(String str) {
        C89219l.m154721d(str, "");
        if (!f98845b) {
            f98845b = true;
            C1731i<C42421a> fetchSchema = Api.C42420a.f98836a.fetchSchema(str, 1);
            f98844a = fetchSchema;
            if (fetchSchema != null) {
                fetchSchema.mo5532a(C42425a.f98847a);
            }
        }
    }
}
