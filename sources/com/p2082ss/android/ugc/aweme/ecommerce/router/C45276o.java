package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.o */
public final class C45276o implements AbstractC45262h {

    /* renamed from: a */
    public static final C45277a f105525a = new C45277a((byte) 0);

    /* renamed from: b */
    private AbstractC89171a<? extends AbstractC45271m> f105526b;

    /* renamed from: c */
    private AbstractC89171a<? extends AbstractC45271m> f105527c;

    static {
        Covode.recordClassIndex(53728);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.o$a */
    public static final class C45277a {
        static {
            Covode.recordClassIndex(53729);
        }

        private C45277a() {
        }

        public /* synthetic */ C45277a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45262h
    /* renamed from: a */
    public final AbstractC45262h mo76349a(AbstractC89171a<? extends AbstractC45271m> aVar) {
        C89219l.m154721d(aVar, "");
        this.f105526b = aVar;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45262h
    /* renamed from: b */
    public final AbstractC45262h mo76351b(AbstractC89171a<? extends AbstractC45271m> aVar) {
        C89219l.m154721d(aVar, "");
        this.f105527c = aVar;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if ("echybrid".equals(r3.getAuthority()) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if ("webview".equals(r3.getAuthority()) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        r5 = new android.net.Uri.Builder().scheme("bullet").encodedAuthority("bullet");
        p4600h.p4611f.p4613b.C89219l.m154716b(r3, "");
        r0 = r3.getQueryParameterNames();
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r4.hasNext() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r1 = r4.next();
        r5.appendQueryParameter(r1, r3.getQueryParameter(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
        if ("bullet".equals(r3.getAuthority()) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
        r3 = r5.build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r1 = r3.getQueryParameter("url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r1.length() != 0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cc, code lost:
        p4600h.p4611f.p4613b.C89219l.m154716b(r3, "");
        r3 = m87857a(r3, p4600h.p4601a.C89070n.m154516a("url"));
        r5 = android.net.Uri.parse(r1);
        p4600h.p4611f.p4613b.C89219l.m154716b(r5, "");
        r4 = m87857a(r5, null);
        r0 = r9.getQueryParameterNames();
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
        r2 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        if (r2.hasNext() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fd, code lost:
        if ("fallback".equals(r1) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0107, code lost:
        if (r5.getQueryParameterNames().contains(r1) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r4.appendQueryParameter(r1, r9.getQueryParameter(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        r3.appendQueryParameter("url", r4.toString());
        r1 = r8.f105527c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011a, code lost:
        if (r1 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        p4600h.p4611f.p4613b.C89219l.m154710a("fallbackStrategyFactory");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0121, code lost:
        r1 = (com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m) r1.invoke();
        r1.mo76358a(com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m.EnumC45273b.FALLBACK);
        r1.f105514i = r3.build();
        r1.f105513h = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        return r1;
     */
    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45262h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m mo76350a(android.net.Uri r9) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.router.C45276o.mo76350a(android.net.Uri):com.ss.android.ugc.aweme.ecommerce.router.m");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Uri.Builder m87857a(Uri uri, List<String> list) {
        boolean z;
        Uri.Builder encodedPath = new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                encodedPath.appendQueryParameter(t, uri.getQueryParameter(t));
            }
        } else {
            Set<String> queryParameterNames2 = uri.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames2, "");
            for (T t2 : queryParameterNames2) {
                if (!list.contains(t2)) {
                    encodedPath.appendQueryParameter(t2, uri.getQueryParameter(t2));
                }
            }
        }
        C89219l.m154716b(encodedPath, "");
        return encodedPath;
    }
}
