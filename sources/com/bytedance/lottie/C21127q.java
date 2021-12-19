package com.bytedance.lottie;

import androidx.core.p036g.C0692e;
import androidx.p025c.C0486b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1505f.C21083e;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.lottie.q */
public class C21127q {

    /* renamed from: a */
    public boolean f50115a;

    /* renamed from: b */
    public boolean f50116b;

    /* renamed from: c */
    private final Set<AbstractC21129a> f50117c = new C0486b();

    /* renamed from: d */
    private final Map<String, C21083e> f50118d = new HashMap();

    /* renamed from: e */
    private final Comparator<C0692e<String, Float>> f50119e = new Comparator<C0692e<String, Float>>() {
        /* class com.bytedance.lottie.C21127q.C211281 */

        static {
            Covode.recordClassIndex(24744);
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

    /* renamed from: com.bytedance.lottie.q$a */
    public interface AbstractC21129a {
        static {
            Covode.recordClassIndex(24745);
        }

        /* renamed from: a */
        void mo30321a();
    }

    static {
        Covode.recordClassIndex(24743);
    }

    /* renamed from: a */
    public final void mo34626a(AbstractC21129a aVar) {
        this.f50117c.add(aVar);
    }

    /* renamed from: a */
    public final void mo34627a(String str, float f) {
        boolean z = this.f50116b;
        if (z || this.f50115a) {
            if (!this.f50115a || z) {
                C21083e eVar = this.f50118d.get(str);
                if (eVar == null) {
                    eVar = new C21083e();
                    this.f50118d.put(str, eVar);
                }
                eVar.f49959a += f;
                eVar.f49960b++;
                if (eVar.f49960b == Integer.MAX_VALUE) {
                    eVar.f49959a /= 2.0f;
                    eVar.f49960b /= 2;
                }
            }
            if (str.equals("__container")) {
                for (AbstractC21129a aVar : this.f50117c) {
                    aVar.mo30321a();
                }
            }
        }
    }
}
