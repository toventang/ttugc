package com.lynx.tasm.p2062ui.image.p2064b;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import java.util.List;

/* renamed from: com.lynx.tasm.ui.image.b.d */
public final class C28886d {
    static {
        Covode.recordClassIndex(35009);
    }

    /* renamed from: com.lynx.tasm.ui.image.b.d$a */
    public static class C28887a {

        /* renamed from: a */
        public final C28885c f68255a;

        /* renamed from: b */
        public final C28885c f68256b;

        static {
            Covode.recordClassIndex(35010);
        }

        private C28887a(C28885c cVar, C28885c cVar2) {
            this.f68255a = cVar;
            this.f68256b = cVar2;
        }

        /* synthetic */ C28887a(C28885c cVar, C28885c cVar2, byte b) {
            this(cVar, cVar2);
        }
    }

    /* renamed from: a */
    public static C28887a m57866a(int i, int i2, List<C28885c> list) {
        C28885c cVar = null;
        if (list.isEmpty()) {
            return new C28887a(null, null, (byte) 0);
        }
        if (list.size() == 1) {
            return new C28887a(list.get(0), null, (byte) 0);
        }
        if (i <= 0 || i2 <= 0) {
            return new C28887a(null, null, (byte) 0);
        }
        C24413h e = C24428k.m46551a().mo40247e();
        double d = (double) (i * i2);
        double d2 = 1.0d;
        Double.isNaN(d);
        double d3 = d * 1.0d;
        double d4 = Double.MAX_VALUE;
        C28885c cVar2 = null;
        double d5 = Double.MAX_VALUE;
        for (C28885c cVar3 : list) {
            double abs = Math.abs(d2 - (cVar3.f68252b / d3));
            if (abs < d4) {
                d4 = abs;
                cVar2 = cVar3;
            }
            if (abs < d5 && (e.mo40231b(cVar3.mo50100a()) || e.mo40234c(cVar3.mo50100a()))) {
                d5 = abs;
                cVar = cVar3;
            }
            d2 = 1.0d;
        }
        if (!(cVar == null || cVar2 == null || !cVar.f68251a.equals(cVar2.f68251a))) {
            cVar = null;
        }
        return new C28887a(cVar2, cVar, (byte) 0);
    }
}
