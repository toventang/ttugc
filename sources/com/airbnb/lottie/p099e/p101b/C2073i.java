package com.airbnb.lottie.p099e.p101b;

import android.graphics.PointF;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p094a.AbstractC1993c;
import com.airbnb.lottie.p093a.p094a.C2005n;
import com.airbnb.lottie.p099e.p100a.AbstractC2060m;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.b.i */
public final class C2073i implements AbstractC2064b {

    /* renamed from: a */
    public final String f6216a;

    /* renamed from: b */
    public final EnumC2074a f6217b;

    /* renamed from: c */
    public final C2049b f6218c;

    /* renamed from: d */
    public final AbstractC2060m<PointF, PointF> f6219d;

    /* renamed from: e */
    public final C2049b f6220e;

    /* renamed from: f */
    public final C2049b f6221f;

    /* renamed from: g */
    public final C2049b f6222g;

    /* renamed from: h */
    public final C2049b f6223h;

    /* renamed from: i */
    public final C2049b f6224i;

    static {
        Covode.recordClassIndex(2268);
    }

    /* renamed from: com.airbnb.lottie.e.b.i$a */
    public enum EnumC2074a {
        Star(1),
        Polygon(2);
        

        /* renamed from: a */
        private final int f6226a;

        static {
            Covode.recordClassIndex(2269);
        }

        public static EnumC2074a forValue(int i) {
            EnumC2074a[] values = values();
            for (EnumC2074a aVar : values) {
                if (aVar.f6226a == i) {
                    return aVar;
                }
            }
            return null;
        }

        private EnumC2074a(int i) {
            this.f6226a = i;
        }
    }

    @Override // com.airbnb.lottie.p099e.p101b.AbstractC2064b
    /* renamed from: a */
    public final AbstractC1993c mo5951a(C2122g gVar, AbstractC2088a aVar) {
        return new C2005n(gVar, aVar, this);
    }

    public C2073i(String str, EnumC2074a aVar, C2049b bVar, AbstractC2060m<PointF, PointF> mVar, C2049b bVar2, C2049b bVar3, C2049b bVar4, C2049b bVar5, C2049b bVar6) {
        this.f6216a = str;
        this.f6217b = aVar;
        this.f6218c = bVar;
        this.f6219d = mVar;
        this.f6220e = bVar2;
        this.f6221f = bVar3;
        this.f6222g = bVar4;
        this.f6223h = bVar5;
        this.f6224i = bVar6;
    }
}
