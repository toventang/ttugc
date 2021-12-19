package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.p1107a.AbstractC15513i;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;

/* renamed from: com.bytedance.hybrid.spark.d.l */
public final class C15559l implements AbstractC15510f {

    /* renamed from: a */
    public static final C15560a f37928a = new C15560a((byte) 0);

    /* renamed from: b */
    private final C21136a f37929b;

    /* renamed from: c */
    private final AbstractC15513i f37930c;

    static {
        Covode.recordClassIndex(17821);
    }

    /* renamed from: com.bytedance.hybrid.spark.d.l$a */
    public static final class C15560a {

        /* renamed from: com.bytedance.hybrid.spark.d.l$a$a */
        public enum EnumC15561a {
            TYPE_NONE,
            TYPE_REPORT,
            TYPE_SHARE,
            TYPE_COLLECT;

            static {
                Covode.recordClassIndex(17823);
            }
        }

        static {
            Covode.recordClassIndex(17822);
        }

        private C15560a() {
        }

        public /* synthetic */ C15560a(byte b) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25251a() {
        /*
            r3 = this;
            com.bytedance.lynx.a.a.b.a r0 = r3.f37929b
            if (r0 == 0) goto L_0x000a
            java.lang.String r2 = r0.getNavBtnType()
            if (r2 != 0) goto L_0x0014
        L_0x000a:
            com.bytedance.hybrid.spark.d.l$a$a r1 = com.bytedance.hybrid.spark.p1110d.C15559l.C15560a.EnumC15561a.TYPE_NONE
        L_0x000c:
            com.bytedance.hybrid.spark.a.i r0 = r3.f37930c
            if (r0 == 0) goto L_0x0013
            r0.mo25259a(r1)
        L_0x0013:
            return
        L_0x0014:
            int r1 = r2.hashCode()
            r0 = -934521548(0xffffffffc84c5534, float:-209236.81)
            if (r1 == r0) goto L_0x003e
            r0 = 109400031(0x6854fdf, float:5.01464E-35)
            if (r1 == r0) goto L_0x0033
            r0 = 949444906(0x3897612a, float:7.218339E-5)
            if (r1 == r0) goto L_0x0028
            goto L_0x000a
        L_0x0028:
            java.lang.String r0 = "collect"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            com.bytedance.hybrid.spark.d.l$a$a r1 = com.bytedance.hybrid.spark.p1110d.C15559l.C15560a.EnumC15561a.TYPE_COLLECT
            goto L_0x000c
        L_0x0033:
            java.lang.String r0 = "share"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            com.bytedance.hybrid.spark.d.l$a$a r1 = com.bytedance.hybrid.spark.p1110d.C15559l.C15560a.EnumC15561a.TYPE_SHARE
            goto L_0x000c
        L_0x003e:
            java.lang.String r0 = "report"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            com.bytedance.hybrid.spark.d.l$a$a r1 = com.bytedance.hybrid.spark.p1110d.C15559l.C15560a.EnumC15561a.TYPE_REPORT
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.p1110d.C15559l.mo25251a():void");
    }

    public C15559l(C21136a aVar, AbstractC15513i iVar) {
        this.f37929b = aVar;
        this.f37930c = iVar;
    }
}
