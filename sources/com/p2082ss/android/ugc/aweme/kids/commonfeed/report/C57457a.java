package com.p2082ss.android.ugc.aweme.kids.commonfeed.report;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.a */
public final class C57457a {

    /* renamed from: d */
    public static final C57458a f131020d = new C57458a((byte) 0);

    /* renamed from: a */
    List<String> f131021a;

    /* renamed from: b */
    Keva f131022b;

    /* renamed from: c */
    String[] f131023c;

    /* renamed from: e */
    private final String f131024e;

    static {
        Covode.recordClassIndex(67387);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.a$a */
    public static final class C57458a {
        static {
            Covode.recordClassIndex(67388);
        }

        private C57458a() {
        }

        public /* synthetic */ C57458a(byte b) {
            this();
        }
    }

    public C57457a() {
        String str;
        StringBuilder sb = new StringBuilder("report_aweme");
        AbstractC57153a b = KidsAccountServiceImpl.m104406h().mo94318b();
        if (b != null) {
            str = b.getUserId();
        } else {
            str = null;
        }
        String sb2 = sb.append(str).toString();
        this.f131024e = sb2;
        Keva repo = Keva.getRepo(sb2);
        C89219l.m154716b(repo, "");
        this.f131022b = repo;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] mo94732a() {
        /*
            r6 = this;
            java.util.List<java.lang.String> r1 = r6.f131021a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            r5 = 0
            if (r1 == 0) goto L_0x0013
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.Objects.requireNonNull(r0, r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0013:
            com.bytedance.keva.Keva r1 = r6.f131022b
            java.lang.String r0 = "report_aweme_list"
            r3 = 0
            java.lang.String[] r2 = r1.getStringArray(r0, r3)
            r1 = 1
            if (r2 == 0) goto L_0x0025
            int r0 = r2.length
            if (r0 != 0) goto L_0x002b
            r0 = 1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002d
            return r3
        L_0x0029:
            r0 = 0
            goto L_0x0026
        L_0x002b:
            r0 = 0
            goto L_0x0023
        L_0x002d:
            int r0 = r2.length
            if (r0 != 0) goto L_0x0035
            r0 = 1
        L_0x0031:
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0042
            goto L_0x0037
        L_0x0035:
            r0 = 0
            goto L_0x0031
        L_0x0037:
            java.util.List r0 = p4600h.p4601a.C89064i.m154509j(r2)     // Catch:{ Exception -> 0x003e }
            r6.f131021a = r0     // Catch:{ Exception -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            java.util.List<java.lang.String> r1 = r6.f131021a
            if (r1 == 0) goto L_0x0052
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.Objects.requireNonNull(r0, r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.report.C57457a.mo94732a():java.lang.String[]");
    }
}
