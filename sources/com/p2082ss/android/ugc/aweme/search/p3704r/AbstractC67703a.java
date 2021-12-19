package com.p2082ss.android.ugc.aweme.search.p3704r;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.utils.C80633x;

/* renamed from: com.ss.android.ugc.aweme.search.r.a */
public abstract class AbstractC67703a implements C80633x.AbstractC80634a {
    static {
        Covode.recordClassIndex(79348);
    }

    /* renamed from: a */
    public abstract String mo106810a(Aweme aweme, String str, C67568r rVar);

    @Override // com.p2082ss.android.ugc.aweme.utils.C80633x.AbstractC80634a
    /* renamed from: a */
    public final boolean mo106812a(Aweme aweme, String str) {
        String str2;
        if (TextUtils.equals(str, "search_result") || TextUtils.equals(str, "general_search") || TextUtils.equals(str, "search_ecommerce")) {
            return true;
        }
        if (!TextUtils.equals(str, "trending_page") && !TextUtils.equals(str, "compilation_detail") && !TextUtils.equals(str, "from_city_card")) {
            return false;
        }
        AbstractC67567q a = C67486am.m119564a();
        if (a != null) {
            str2 = a.mo106431c().f151151a;
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r6 == null) goto L_0x000b;
     */
    @Override // com.p2082ss.android.ugc.aweme.utils.C80633x.AbstractC80634a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo106811a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, com.p2082ss.android.ugc.aweme.utils.AbstractC80348dm r6) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0058
            boolean r1 = r6 instanceof com.p2082ss.android.ugc.aweme.search.p3695k.C67568r
            if (r1 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.search.k.r r6 = (com.p2082ss.android.ugc.aweme.search.p3695k.C67568r) r6
            if (r6 != 0) goto L_0x0053
        L_0x000b:
            com.ss.android.ugc.aweme.search.k.q r1 = com.p2082ss.android.ugc.aweme.search.p3695k.C67486am.m119564a()
            if (r1 == 0) goto L_0x003c
            java.util.Map r2 = r1.mo106430b()
            if (r2 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.search.k.r$a r1 = com.p2082ss.android.ugc.aweme.search.p3695k.C67568r.f151299G
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L_0x003c
            boolean r1 = r2 instanceof java.lang.ref.WeakReference
            if (r1 == 0) goto L_0x003c
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x003c
            boolean r1 = r2 instanceof com.p2082ss.android.ugc.aweme.search.p3695k.C67568r
            if (r1 == 0) goto L_0x003c
            r6 = r2
            com.ss.android.ugc.aweme.search.k.r r6 = (com.p2082ss.android.ugc.aweme.search.p3695k.C67568r) r6
            if (r6 != 0) goto L_0x0053
        L_0x003c:
            if (r4 == 0) goto L_0x0053
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.ss.android.ugc.aweme.search.k.r>> r2 = com.p2082ss.android.ugc.aweme.search.p3704r.C67704b.f151780n
            java.lang.String r1 = r4.getAid()
            java.lang.Object r1 = r2.get(r1)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L_0x0052
            java.lang.Object r0 = r1.get()
            com.ss.android.ugc.aweme.search.k.r r0 = (com.p2082ss.android.ugc.aweme.search.p3695k.C67568r) r0
        L_0x0052:
            r6 = r0
        L_0x0053:
            java.lang.String r0 = r3.mo106810a(r4, r5, r6)
            return r0
        L_0x0058:
            r6 = r0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.p3704r.AbstractC67703a.mo106811a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, com.ss.android.ugc.aweme.utils.dm):java.lang.String");
    }
}
