package com.airbnb.lottie.p099e.p101b;

import android.graphics.Paint;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p094a.AbstractC1993c;
import com.airbnb.lottie.p093a.p094a.C2010r;
import com.airbnb.lottie.p099e.p100a.C2048a;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.b.p */
public final class C2081p implements AbstractC2064b {

    /* renamed from: a */
    public final String f6248a;

    /* renamed from: b */
    public final C2049b f6249b;

    /* renamed from: c */
    public final List<C2049b> f6250c;

    /* renamed from: d */
    public final C2048a f6251d;

    /* renamed from: e */
    public final C2051d f6252e;

    /* renamed from: f */
    public final C2049b f6253f;

    /* renamed from: g */
    public final EnumC2083a f6254g;

    /* renamed from: h */
    public final EnumC2084b f6255h;

    /* renamed from: i */
    public final float f6256i;

    static {
        Covode.recordClassIndex(2276);
    }

    /* renamed from: com.airbnb.lottie.e.b.p$a */
    public enum EnumC2083a {
        Butt,
        Round,
        Unknown;

        public final Paint.Cap toPaintCap() {
            int i = C20821.f6257a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        static {
            Covode.recordClassIndex(2278);
        }
    }

    /* renamed from: com.airbnb.lottie.e.b.p$b */
    public enum EnumC2084b {
        Miter,
        Round,
        Bevel;

        public final Paint.Join toPaintJoin() {
            int i = C20821.f6258b[ordinal()];
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
            Covode.recordClassIndex(2279);
        }
    }

    /* renamed from: com.airbnb.lottie.e.b.p$1 */
    static /* synthetic */ class C20821 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6257a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6258b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
        static {
            /*
                r0 = 2277(0x8e5, float:3.191E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.e.b.p$b[] r0 = com.airbnb.lottie.p099e.p101b.C2081p.EnumC2084b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.airbnb.lottie.p099e.p101b.C2081p.C20821.f6258b = r1
                r4 = 1
                com.airbnb.lottie.e.b.p$b r0 = com.airbnb.lottie.p099e.p101b.C2081p.EnumC2084b.Bevel     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r3 = 2
                int[] r1 = com.airbnb.lottie.p099e.p101b.C2081p.C20821.f6258b     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.e.b.p$b r0 = com.airbnb.lottie.p099e.p101b.C2081p.EnumC2084b.Miter     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r2 = 3
                int[] r1 = com.airbnb.lottie.p099e.p101b.C2081p.C20821.f6258b     // Catch:{ NoSuchFieldError -> 0x002d }
                com.airbnb.lottie.e.b.p$b r0 = com.airbnb.lottie.p099e.p101b.C2081p.EnumC2084b.Round     // Catch:{ NoSuchFieldError -> 0x002d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                com.airbnb.lottie.e.b.p$a[] r0 = com.airbnb.lottie.p099e.p101b.C2081p.EnumC2083a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.airbnb.lottie.p099e.p101b.C2081p.C20821.f6257a = r1
                com.airbnb.lottie.e.b.p$a r0 = com.airbnb.lottie.p099e.p101b.C2081p.EnumC2083a.Butt     // Catch:{ NoSuchFieldError -> 0x003e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r1 = com.airbnb.lottie.p099e.p101b.C2081p.C20821.f6257a     // Catch:{ NoSuchFieldError -> 0x0048 }
                com.airbnb.lottie.e.b.p$a r0 = com.airbnb.lottie.p099e.p101b.C2081p.EnumC2083a.Round     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r1 = com.airbnb.lottie.p099e.p101b.C2081p.C20821.f6257a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.airbnb.lottie.e.b.p$a r0 = com.airbnb.lottie.p099e.p101b.C2081p.EnumC2083a.Unknown     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p099e.p101b.C2081p.C20821.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.p099e.p101b.AbstractC2064b
    /* renamed from: a */
    public final AbstractC1993c mo5951a(C2122g gVar, AbstractC2088a aVar) {
        return new C2010r(gVar, aVar, this);
    }

    public C2081p(String str, C2049b bVar, List<C2049b> list, C2048a aVar, C2051d dVar, C2049b bVar2, EnumC2083a aVar2, EnumC2084b bVar3, float f) {
        this.f6248a = str;
        this.f6249b = bVar;
        this.f6250c = list;
        this.f6251d = aVar;
        this.f6252e = dVar;
        this.f6253f = bVar2;
        this.f6254g = aVar2;
        this.f6255h = bVar3;
        this.f6256i = f;
    }
}
