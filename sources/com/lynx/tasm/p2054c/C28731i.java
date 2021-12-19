package com.lynx.tasm.p2054c;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.lynx.tasm.c.i */
public class C28731i extends C28726d {

    /* renamed from: a */
    public C28732a f67744a;

    /* renamed from: b */
    public C28732a f67745b;

    /* renamed from: c */
    public C28732a f67746c;

    static {
        Covode.recordClassIndex(34825);
    }

    /* renamed from: com.lynx.tasm.c.i$a */
    public static class C28732a {

        /* renamed from: a */
        public float f67747a;

        /* renamed from: b */
        public float f67748b;

        static {
            Covode.recordClassIndex(34826);
        }

        public C28732a() {
        }

        public final int hashCode() {
            return Arrays.hashCode(new float[]{this.f67747a, this.f67748b});
        }

        public final String toString() {
            return "Point{x=" + this.f67747a + ", y=" + this.f67748b + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof C28732a)) {
                C28732a aVar = (C28732a) obj;
                if (Float.compare(aVar.f67747a, this.f67747a) == 0 && Float.compare(aVar.f67748b, this.f67748b) == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public C28732a(float f, float f2) {
            this.f67747a = f;
            this.f67748b = f2;
        }
    }

    public C28731i(int i, String str, C28732a aVar, C28732a aVar2, C28732a aVar3) {
        super(i, str);
        this.f67744a = aVar;
        this.f67745b = aVar2;
        this.f67746c = aVar3;
    }
}
