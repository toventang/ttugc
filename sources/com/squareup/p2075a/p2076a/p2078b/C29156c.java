package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import java.util.Date;

/* renamed from: com.squareup.a.a.b.c */
public final class C29156c {

    /* renamed from: a */
    public final C29246v f69006a;

    /* renamed from: b */
    public final C29249x f69007b;

    static {
        Covode.recordClassIndex(35505);
    }

    /* renamed from: com.squareup.a.a.b.c$a */
    public static class C29157a {

        /* renamed from: a */
        public final long f69008a;

        /* renamed from: b */
        public final C29246v f69009b;

        /* renamed from: c */
        public final C29249x f69010c;

        /* renamed from: d */
        public Date f69011d;

        /* renamed from: e */
        public String f69012e;

        /* renamed from: f */
        public Date f69013f;

        /* renamed from: g */
        public String f69014g;

        /* renamed from: h */
        public Date f69015h;

        /* renamed from: i */
        public long f69016i;

        /* renamed from: j */
        public long f69017j;

        /* renamed from: k */
        public String f69018k;

        /* renamed from: l */
        public int f69019l = -1;

        static {
            Covode.recordClassIndex(35506);
        }

        /* renamed from: a */
        public static boolean m58267a(C29246v vVar) {
            if (vVar.mo51016a("If-Modified-Since") == null && vVar.mo51016a("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        public C29157a(long j, C29246v vVar, C29249x xVar) {
            this.f69008a = j;
            this.f69009b = vVar;
            this.f69010c = xVar;
            if (xVar != null) {
                C29235p pVar = xVar.f69355f;
                int length = pVar.f69280a.length / 2;
                for (int i = 0; i < length; i++) {
                    String a = pVar.mo50977a(i);
                    String b = pVar.mo50979b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.f69011d = C29168g.m58296a(b);
                        this.f69012e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.f69015h = C29168g.m58296a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f69013f = C29168g.m58296a(b);
                        this.f69014g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.f69018k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.f69019l = C29158d.m58270b(b, -1);
                    } else if (C29176k.f69092b.equalsIgnoreCase(a)) {
                        this.f69016i = Long.parseLong(b);
                    } else if (C29176k.f69093c.equalsIgnoreCase(a)) {
                        this.f69017j = Long.parseLong(b);
                    }
                }
            }
        }
    }

    private C29156c(C29246v vVar, C29249x xVar) {
        this.f69006a = vVar;
        this.f69007b = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r3.mo51033c().f69219g == false) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m58266a(com.squareup.p2075a.C29249x r3, com.squareup.p2075a.C29246v r4) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2078b.C29156c.m58266a(com.squareup.a.x, com.squareup.a.v):boolean");
    }

    public /* synthetic */ C29156c(C29246v vVar, C29249x xVar, byte b) {
        this(vVar, xVar);
    }
}
