package com.bytedance.lottie.p1499c.p1501b;

import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20935b;
import com.bytedance.lottie.p1495a.p1496a.C20952q;
import com.bytedance.lottie.p1499c.p1500a.C20977a;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.b.p */
public final class C21010p implements AbstractC20993b {

    /* renamed from: a */
    public final String f49805a;

    /* renamed from: b */
    public final C20978b f49806b;

    /* renamed from: c */
    public final List<C20978b> f49807c;

    /* renamed from: d */
    public final C20977a f49808d;

    /* renamed from: e */
    public final C20980d f49809e;

    /* renamed from: f */
    public final C20978b f49810f;

    /* renamed from: g */
    public final EnumC21012a f49811g;

    /* renamed from: h */
    public final EnumC21013b f49812h;

    /* renamed from: i */
    public final float f49813i;

    static {
        Covode.recordClassIndex(24626);
    }

    /* renamed from: com.bytedance.lottie.c.b.p$a */
    public enum EnumC21012a {
        Butt,
        Round,
        Unknown;

        public final Paint.Cap toPaintCap() {
            int i = C210111.f49814a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        static {
            Covode.recordClassIndex(24628);
        }
    }

    /* renamed from: com.bytedance.lottie.c.b.p$b */
    public enum EnumC21013b {
        Miter,
        Round,
        Bevel;

        public final Paint.Join toPaintJoin() {
            int i = C210111.f49815b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }

        static {
            Covode.recordClassIndex(24629);
        }
    }

    /* renamed from: com.bytedance.lottie.c.b.p$1 */
    static /* synthetic */ class C210111 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49814a;

        /* renamed from: b */
        static final /* synthetic */ int[] f49815b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
        static {
            /*
                r0 = 24627(0x6033, float:3.451E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.c.b.p$b[] r0 = com.bytedance.lottie.p1499c.p1501b.C21010p.EnumC21013b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.bytedance.lottie.p1499c.p1501b.C21010p.C210111.f49815b = r1
                r4 = 1
                com.bytedance.lottie.c.b.p$b r0 = com.bytedance.lottie.p1499c.p1501b.C21010p.EnumC21013b.Bevel     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r3 = 2
                int[] r1 = com.bytedance.lottie.p1499c.p1501b.C21010p.C210111.f49815b     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.c.b.p$b r0 = com.bytedance.lottie.p1499c.p1501b.C21010p.EnumC21013b.Miter     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r2 = 3
                int[] r1 = com.bytedance.lottie.p1499c.p1501b.C21010p.C210111.f49815b     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.lottie.c.b.p$b r0 = com.bytedance.lottie.p1499c.p1501b.C21010p.EnumC21013b.Round     // Catch:{ NoSuchFieldError -> 0x002d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                com.bytedance.lottie.c.b.p$a[] r0 = com.bytedance.lottie.p1499c.p1501b.C21010p.EnumC21012a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.bytedance.lottie.p1499c.p1501b.C21010p.C210111.f49814a = r1
                com.bytedance.lottie.c.b.p$a r0 = com.bytedance.lottie.p1499c.p1501b.C21010p.EnumC21012a.Butt     // Catch:{ NoSuchFieldError -> 0x003e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r1 = com.bytedance.lottie.p1499c.p1501b.C21010p.C210111.f49814a     // Catch:{ NoSuchFieldError -> 0x0048 }
                com.bytedance.lottie.c.b.p$a r0 = com.bytedance.lottie.p1499c.p1501b.C21010p.EnumC21012a.Round     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r1 = com.bytedance.lottie.p1499c.p1501b.C21010p.C210111.f49814a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.bytedance.lottie.c.b.p$a r0 = com.bytedance.lottie.p1499c.p1501b.C21010p.EnumC21012a.Unknown     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.p1499c.p1501b.C21010p.C210111.<clinit>():void");
        }
    }

    @Override // com.bytedance.lottie.p1499c.p1501b.AbstractC20993b
    /* renamed from: a */
    public final AbstractC20935b mo34483a(C21106i iVar, AbstractC21017a aVar) {
        return new C20952q(iVar, aVar, this);
    }

    public C21010p(String str, C20978b bVar, List<C20978b> list, C20977a aVar, C20980d dVar, C20978b bVar2, EnumC21012a aVar2, EnumC21013b bVar3, float f) {
        this.f49805a = str;
        this.f49806b = bVar;
        this.f49807c = list;
        this.f49808d = aVar;
        this.f49809e = dVar;
        this.f49810f = bVar2;
        this.f49811g = aVar2;
        this.f49812h = bVar3;
        this.f49813i = f;
    }
}
