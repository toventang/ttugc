package kotlinx.coroutines;

import p4600h.p4603c.AbstractC89125e;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.ag */
public final class C89506ag {

    /* renamed from: a */
    static final boolean f203222a;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2.equals("on") != false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r2.equals("") != false) goto L_0x000e;
     */
    static {
        /*
            r0 = 105595(0x19c7b, float:1.4797E-40)
            com.bytedance.covode.number.Covode.recordClassIndex(r0)
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r2 = kotlinx.coroutines.internal.C89661x.m155638a(r0)
            if (r2 != 0) goto L_0x0012
        L_0x000e:
            r0 = 1
        L_0x000f:
            kotlinx.coroutines.C89506ag.f203222a = r0
            return
        L_0x0012:
            int r1 = r2.hashCode()
            if (r1 == 0) goto L_0x0034
            r0 = 3551(0xddf, float:4.976E-42)
            if (r1 == r0) goto L_0x002b
            r0 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r0) goto L_0x003d
            java.lang.String r0 = "off"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 0
            goto L_0x000f
        L_0x002b:
            java.lang.String r0 = "on"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            goto L_0x000e
        L_0x0034:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003d
            goto L_0x000e
        L_0x003d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            r0 = 39
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C89506ag.<clinit>():void");
    }

    /* renamed from: a */
    public static final AbstractC89127f m155440a(AbstractC89516am amVar, AbstractC89127f fVar) {
        AbstractC89127f fVar2;
        AbstractC89127f plus = amVar.mo20678a().plus(fVar);
        if (C89527ar.f203244b) {
            fVar2 = plus.plus(new C89512ak(C89527ar.f203246d.incrementAndGet()));
        } else {
            fVar2 = plus;
        }
        if (plus == C89546bf.f203266a || plus.get(AbstractC89125e.f202840b) != null) {
            return fVar2;
        }
        return fVar2.plus(C89546bf.f203266a);
    }
}
