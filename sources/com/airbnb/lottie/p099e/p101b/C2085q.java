package com.airbnb.lottie.p099e.p101b;

import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p094a.AbstractC1993c;
import com.airbnb.lottie.p093a.p094a.C2011s;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.b.q */
public final class C2085q implements AbstractC2064b {

    /* renamed from: a */
    public final String f6261a;

    /* renamed from: b */
    public final EnumC2086a f6262b;

    /* renamed from: c */
    public final C2049b f6263c;

    /* renamed from: d */
    public final C2049b f6264d;

    /* renamed from: e */
    public final C2049b f6265e;

    static {
        Covode.recordClassIndex(2280);
    }

    /* renamed from: com.airbnb.lottie.e.b.q$a */
    public enum EnumC2086a {
        Simultaneously,
        Individually;

        static {
            Covode.recordClassIndex(2281);
        }

        public static EnumC2086a forId(int i) {
            if (i == 1) {
                return Simultaneously;
            }
            if (i == 2) {
                return Individually;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f6263c + ", end: " + this.f6264d + ", offset: " + this.f6265e + "}";
    }

    @Override // com.airbnb.lottie.p099e.p101b.AbstractC2064b
    /* renamed from: a */
    public final AbstractC1993c mo5951a(C2122g gVar, AbstractC2088a aVar) {
        return new C2011s(aVar, this);
    }

    public C2085q(String str, EnumC2086a aVar, C2049b bVar, C2049b bVar2, C2049b bVar3) {
        this.f6261a = str;
        this.f6262b = aVar;
        this.f6263c = bVar;
        this.f6264d = bVar2;
        this.f6265e = bVar3;
    }
}
