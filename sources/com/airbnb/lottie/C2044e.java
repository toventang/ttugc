package com.airbnb.lottie;

import android.graphics.Rect;
import android.util.JsonReader;
import androidx.p025c.C0489d;
import androidx.p025c.C0498h;
import com.airbnb.lottie.p099e.C2087c;
import com.airbnb.lottie.p099e.C2103d;
import com.airbnb.lottie.p099e.p102c.C2094d;
import com.bytedance.covode.number.Covode;
import java.io.StringReader;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.e */
public class C2044e {

    /* renamed from: a */
    public final C2213o f6137a = new C2213o();

    /* renamed from: b */
    public Map<String, List<C2094d>> f6138b;

    /* renamed from: c */
    public Map<String, C2152h> f6139c;

    /* renamed from: d */
    public Map<String, C2087c> f6140d;

    /* renamed from: e */
    public C0498h<C2103d> f6141e;

    /* renamed from: f */
    C0489d<C2094d> f6142f;

    /* renamed from: g */
    public List<C2094d> f6143g;

    /* renamed from: h */
    public Rect f6144h;

    /* renamed from: i */
    public float f6145i;

    /* renamed from: j */
    public float f6146j;

    /* renamed from: k */
    public float f6147k;

    /* renamed from: l */
    public String f6148l = "";

    /* renamed from: m */
    private final HashSet<String> f6149m = new HashSet<>();

    static {
        Covode.recordClassIndex(2239);
    }

    /* renamed from: b */
    public final float mo5945b() {
        return this.f6146j - this.f6145i;
    }

    /* renamed from: a */
    public final float mo5941a() {
        return (float) ((long) ((mo5945b() / this.f6147k) * 1000.0f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C2094d dVar : this.f6143g) {
            sb.append(dVar.mo5973a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: com.airbnb.lottie.e$a */
    public static class C2045a {
        static {
            Covode.recordClassIndex(2240);
        }

        /* renamed from: com.airbnb.lottie.e$a$a */
        static final class C2046a implements AbstractC1988a, AbstractC2186i<C2044e> {

            /* renamed from: a */
            private final AbstractC2212n f6150a;

            /* renamed from: b */
            private boolean f6151b;

            static {
                Covode.recordClassIndex(2241);
            }

            private C2046a(AbstractC2212n nVar) {
                this.f6150a = nVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.airbnb.lottie.AbstractC2186i
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5889a(C2044e eVar) {
                C2044e eVar2 = eVar;
                if (!this.f6151b) {
                    this.f6150a.mo6141a(eVar2);
                }
            }

            /* synthetic */ C2046a(AbstractC2212n nVar, byte b) {
                this(nVar);
            }
        }

        /* renamed from: a */
        public static AbstractC1988a m6473a(String str, AbstractC2212n nVar) {
            C2046a aVar = new C2046a(nVar, (byte) 0);
            C2108f.m6594a((String) null, new Callable<C2207l<C2044e>>(str) {
                /* class com.airbnb.lottie.C2108f.CallableC21157 */

                /* renamed from: a */
                final /* synthetic */ String f6375a;

                /* renamed from: b */
                final /* synthetic */ String f6376b = null;

                static {
                    Covode.recordClassIndex(2310);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ C2207l<C2044e> call() {
                    String str = this.f6375a;
                    return C2108f.m6600b(new JsonReader(new StringReader(str)), this.f6376b);
                }

                {
                    this.f6375a = r2;
                }
            }).mo6130a((AbstractC2186i<C2044e>) aVar);
            return aVar;
        }
    }

    /* renamed from: a */
    public final void mo5943a(String str) {
        this.f6149m.add(str);
    }

    /* renamed from: a */
    public final C2094d mo5942a(long j) {
        return this.f6142f.mo2078a(j, null);
    }

    /* renamed from: a */
    public final void mo5944a(boolean z) {
        this.f6137a.f6635b = z;
    }
}
