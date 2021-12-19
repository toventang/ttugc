package com.airbnb.lottie.p093a.p094a;

import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.p099e.p101b.C2071h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.l */
public final class C2002l implements AbstractC2000j, AbstractC2004m {

    /* renamed from: a */
    private final Path f6006a = new Path();

    /* renamed from: b */
    private final Path f6007b = new Path();

    /* renamed from: c */
    private final Path f6008c = new Path();

    /* renamed from: d */
    private final String f6009d;

    /* renamed from: e */
    private final List<AbstractC2004m> f6010e = new ArrayList();

    /* renamed from: f */
    private final C2071h f6011f;

    static {
        Covode.recordClassIndex(2197);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f6009d;
    }

    /* renamed from: com.airbnb.lottie.a.a.l$1 */
    static /* synthetic */ class C20031 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6012a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 2198(0x896, float:3.08E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.e.b.h$a[] r0 = com.airbnb.lottie.p099e.p101b.C2071h.EnumC2072a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.p093a.p094a.C2002l.C20031.f6012a = r2
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.p099e.p101b.C2071h.EnumC2072a.Merge     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.p093a.p094a.C2002l.C20031.f6012a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.p099e.p101b.C2071h.EnumC2072a.Add     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.airbnb.lottie.p093a.p094a.C2002l.C20031.f6012a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.p099e.p101b.C2071h.EnumC2072a.Subtract     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.airbnb.lottie.p093a.p094a.C2002l.C20031.f6012a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.p099e.p101b.C2071h.EnumC2072a.Intersect     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.airbnb.lottie.p093a.p094a.C2002l.C20031.f6012a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.e.b.h$a r0 = com.airbnb.lottie.p099e.p101b.C2071h.EnumC2072a.ExcludeIntersections     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p093a.p094a.C2002l.C20031.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2004m
    /* renamed from: e */
    public final Path mo5906e() {
        this.f6008c.reset();
        int i = C20031.f6012a[this.f6011f.f6214b.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.f6010e.size(); i2++) {
                this.f6008c.addPath(this.f6010e.get(i2).mo5906e());
            }
        } else if (i == 2) {
            m6355a(Path.Op.UNION);
        } else if (i == 3) {
            m6355a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m6355a(Path.Op.INTERSECT);
        } else if (i == 5) {
            m6355a(Path.Op.XOR);
        }
        return this.f6008c;
    }

    public C2002l(C2071h hVar) {
        int i = Build.VERSION.SDK_INT;
        this.f6009d = hVar.f6213a;
        this.f6011f = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2000j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5907a(java.util.ListIterator<com.airbnb.lottie.p093a.p094a.AbstractC1993c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r3.previous()
            if (r0 != r2) goto L_0x0000
        L_0x000c:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r3.previous()
            com.airbnb.lottie.a.a.c r1 = (com.airbnb.lottie.p093a.p094a.AbstractC1993c) r1
            boolean r0 = r1 instanceof com.airbnb.lottie.p093a.p094a.AbstractC2004m
            if (r0 == 0) goto L_0x000c
            java.util.List<com.airbnb.lottie.a.a.m> r0 = r2.f6010e
            r0.add(r1)
            r3.remove()
            goto L_0x000c
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p093a.p094a.C2002l.mo5907a(java.util.ListIterator):void");
    }

    /* renamed from: a */
    private void m6355a(Path.Op op) {
        this.f6007b.reset();
        this.f6006a.reset();
        for (int size = this.f6010e.size() - 1; size > 0; size--) {
            AbstractC2004m mVar = this.f6010e.get(size);
            if (mVar instanceof C1994d) {
                C1994d dVar = (C1994d) mVar;
                List<AbstractC2004m> c = dVar.mo5904c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = c.get(size2).mo5906e();
                    e.transform(dVar.mo5905d());
                    this.f6007b.addPath(e);
                }
            } else {
                this.f6007b.addPath(mVar.mo5906e());
            }
        }
        AbstractC2004m mVar2 = this.f6010e.get(0);
        if (mVar2 instanceof C1994d) {
            C1994d dVar2 = (C1994d) mVar2;
            List<AbstractC2004m> c2 = dVar2.mo5904c();
            for (int i = 0; i < c2.size(); i++) {
                Path e2 = c2.get(i).mo5906e();
                e2.transform(dVar2.mo5905d());
                this.f6006a.addPath(e2);
            }
        } else {
            this.f6006a.set(mVar2.mo5906e());
        }
        this.f6008c.op(this.f6006a, this.f6007b, op);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        for (int i = 0; i < this.f6010e.size(); i++) {
            this.f6010e.get(i).mo5900a(list, list2);
        }
    }
}
