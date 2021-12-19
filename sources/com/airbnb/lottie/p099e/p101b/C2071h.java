package com.airbnb.lottie.p099e.p101b;

import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p094a.AbstractC1993c;
import com.airbnb.lottie.p093a.p094a.C2002l;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.b.h */
public final class C2071h implements AbstractC2064b {

    /* renamed from: a */
    public final String f6213a;

    /* renamed from: b */
    public final EnumC2072a f6214b;

    static {
        Covode.recordClassIndex(2266);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f6214b + '}';
    }

    /* renamed from: com.airbnb.lottie.e.b.h$a */
    public enum EnumC2072a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        static {
            Covode.recordClassIndex(2267);
        }

        public static EnumC2072a forId(int i) {
            if (i == 1) {
                return Merge;
            }
            if (i == 2) {
                return Add;
            }
            if (i == 3) {
                return Subtract;
            }
            if (i == 4) {
                return Intersect;
            }
            if (i != 5) {
                return Merge;
            }
            return ExcludeIntersections;
        }
    }

    public C2071h(String str, EnumC2072a aVar) {
        this.f6213a = str;
        this.f6214b = aVar;
    }

    @Override // com.airbnb.lottie.p099e.p101b.AbstractC2064b
    /* renamed from: a */
    public final AbstractC1993c mo5951a(C2122g gVar, AbstractC2088a aVar) {
        if (gVar.f6407l) {
            return new C2002l(this);
        }
        C2041d.m6461a("Animation contains merge paths but they are disabled.");
        return null;
    }
}
