package com.airbnb.lottie;

import androidx.core.p036g.C0692e;
import androidx.p025c.C0486b;
import com.airbnb.lottie.p106i.C2191e;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.airbnb.lottie.o */
public class C2213o {

    /* renamed from: a */
    public boolean f6634a;

    /* renamed from: b */
    public boolean f6635b;

    /* renamed from: c */
    private final Set<Object> f6636c = new C0486b();

    /* renamed from: d */
    private final Map<String, C2191e> f6637d = new HashMap();

    /* renamed from: e */
    private final Comparator<C0692e<String, Float>> f6638e = new Comparator<C0692e<String, Float>>() {
        /* class com.airbnb.lottie.C2213o.C22141 */

        static {
            Covode.recordClassIndex(2409);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C0692e<String, Float> eVar, C0692e<String, Float> eVar2) {
            float floatValue = eVar.f2751b.floatValue();
            float floatValue2 = eVar2.f2751b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    static {
        Covode.recordClassIndex(2408);
    }

    /* renamed from: a */
    public final void mo6142a(String str, float f) {
        boolean z = this.f6635b;
        if (z || this.f6634a) {
            if (!this.f6634a || z) {
                C2191e eVar = this.f6637d.get(str);
                if (eVar == null) {
                    eVar = new C2191e();
                    this.f6637d.put(str, eVar);
                }
                eVar.f6547a += f;
                eVar.f6548b++;
                if (eVar.f6548b == Integer.MAX_VALUE) {
                    eVar.f6547a /= 2.0f;
                    eVar.f6548b /= 2;
                }
            }
            if (str.equals("__container")) {
                Iterator<Object> it = this.f6636c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
