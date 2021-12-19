package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Path;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.p1501b.C21000h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.k */
public final class C20944k implements AbstractC20942i, AbstractC20946l {

    /* renamed from: a */
    private final Path f49601a = new Path();

    /* renamed from: b */
    private final Path f49602b = new Path();

    /* renamed from: c */
    private final Path f49603c = new Path();

    /* renamed from: d */
    private final String f49604d;

    /* renamed from: e */
    private final List<AbstractC20946l> f49605e = new ArrayList();

    /* renamed from: f */
    private final C21000h f49606f;

    static {
        Covode.recordClassIndex(24560);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49604d;
    }

    /* renamed from: com.bytedance.lottie.a.a.k$1 */
    static /* synthetic */ class C209451 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49607a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 24561(0x5ff1, float:3.4417E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.c.b.h$a[] r0 = com.bytedance.lottie.p1499c.p1501b.C21000h.EnumC21001a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.p1495a.p1496a.C20944k.C209451.f49607a = r2
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.p1499c.p1501b.C21000h.EnumC21001a.Merge     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.p1495a.p1496a.C20944k.C209451.f49607a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.p1499c.p1501b.C21000h.EnumC21001a.Add     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.lottie.p1495a.p1496a.C20944k.C209451.f49607a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.p1499c.p1501b.C21000h.EnumC21001a.Subtract     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.lottie.p1495a.p1496a.C20944k.C209451.f49607a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.p1499c.p1501b.C21000h.EnumC21001a.Intersect     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.lottie.p1495a.p1496a.C20944k.C209451.f49607a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.lottie.c.b.h$a r0 = com.bytedance.lottie.p1499c.p1501b.C21000h.EnumC21001a.ExcludeIntersections     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.p1495a.p1496a.C20944k.C209451.<clinit>():void");
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20946l
    /* renamed from: e */
    public final Path mo34460e() {
        this.f49603c.reset();
        int i = C209451.f49607a[this.f49606f.f49771b.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.f49605e.size(); i2++) {
                this.f49603c.addPath(this.f49605e.get(i2).mo34460e());
            }
        } else if (i == 2) {
            m39454a(Path.Op.UNION);
        } else if (i == 3) {
            m39454a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m39454a(Path.Op.INTERSECT);
        } else if (i == 5) {
            m39454a(Path.Op.XOR);
        }
        return this.f49603c;
    }

    public C20944k(C21000h hVar) {
        int i = Build.VERSION.SDK_INT;
        this.f49604d = hVar.f49770a;
        this.f49606f = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20942i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34461a(java.util.ListIterator<com.bytedance.lottie.p1495a.p1496a.AbstractC20935b> r3) {
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
            com.bytedance.lottie.a.a.b r1 = (com.bytedance.lottie.p1495a.p1496a.AbstractC20935b) r1
            boolean r0 = r1 instanceof com.bytedance.lottie.p1495a.p1496a.AbstractC20946l
            if (r0 == 0) goto L_0x000c
            java.util.List<com.bytedance.lottie.a.a.l> r0 = r2.f49605e
            r0.add(r1)
            r3.remove()
            goto L_0x000c
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.p1495a.p1496a.C20944k.mo34461a(java.util.ListIterator):void");
    }

    /* renamed from: a */
    private void m39454a(Path.Op op) {
        this.f49602b.reset();
        this.f49601a.reset();
        for (int size = this.f49605e.size() - 1; size > 0; size--) {
            AbstractC20946l lVar = this.f49605e.get(size);
            if (lVar instanceof C20936c) {
                C20936c cVar = (C20936c) lVar;
                List<AbstractC20946l> c = cVar.mo34458c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = c.get(size2).mo34460e();
                    e.transform(cVar.mo34459d());
                    this.f49602b.addPath(e);
                }
            } else {
                this.f49602b.addPath(lVar.mo34460e());
            }
        }
        AbstractC20946l lVar2 = this.f49605e.get(0);
        if (lVar2 instanceof C20936c) {
            C20936c cVar2 = (C20936c) lVar2;
            List<AbstractC20946l> c2 = cVar2.mo34458c();
            for (int i = 0; i < c2.size(); i++) {
                Path e2 = c2.get(i).mo34460e();
                e2.transform(cVar2.mo34459d());
                this.f49601a.addPath(e2);
            }
        } else {
            this.f49601a.set(lVar2.mo34460e());
        }
        this.f49603c.op(this.f49601a, this.f49602b, op);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        for (int i = 0; i < this.f49605e.size(); i++) {
            this.f49605e.get(i).mo34456a(list, list2);
        }
    }
}
