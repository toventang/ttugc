package com.bytedance.android.livesdk.p522f;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.airbnb.lottie.AbstractC2038c;
import com.airbnb.lottie.AbstractC2212n;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2152h;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.livesdk.p672z.C11604a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.f.a */
public final class C8464a {

    /* renamed from: a */
    public static Map<String, C2044e> f20920a = new WeakHashMap();

    /* renamed from: b */
    public static final C8464a f20921b = new C8464a();

    private C8464a() {
    }

    static {
        Covode.recordClassIndex(9312);
    }

    /* renamed from: com.bytedance.android.livesdk.f.a$a */
    public static final class C8465a implements AbstractC2038c {

        /* renamed from: a */
        final /* synthetic */ HashMap f20922a;

        static {
            Covode.recordClassIndex(9313);
        }

        public C8465a(HashMap hashMap) {
            this.f20922a = hashMap;
        }

        @Override // com.airbnb.lottie.AbstractC2038c
        /* renamed from: a */
        public final Bitmap mo5937a(C2152h hVar) {
            Bitmap bitmap;
            if (hVar == null) {
                return null;
            }
            String str = hVar.f6512d;
            if (TextUtils.isEmpty(str) || !this.f20922a.containsKey(str) || (bitmap = (Bitmap) this.f20922a.get(str)) == null || bitmap.isRecycled()) {
                return null;
            }
            return bitmap;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.f.a$b */
    public static final class C8466b implements AbstractC2212n {

        /* renamed from: a */
        final /* synthetic */ C11604a f20923a;

        /* renamed from: b */
        final /* synthetic */ LottieAnimationView f20924b;

        /* renamed from: c */
        final /* synthetic */ boolean f20925c = true;

        static {
            Covode.recordClassIndex(9314);
        }

        public C8466b(C11604a aVar, LottieAnimationView lottieAnimationView) {
            this.f20923a = aVar;
            this.f20924b = lottieAnimationView;
        }

        @Override // com.airbnb.lottie.AbstractC2212n
        /* renamed from: a */
        public final void mo6141a(C2044e eVar) {
            if (eVar != null) {
                try {
                    Map<String, C2044e> map = C8464a.f20920a;
                    String str = this.f20923a.f27762b;
                    C89219l.m154716b(str, "");
                    map.put(str, eVar);
                    this.f20924b.setComposition(eVar);
                    if (this.f20925c) {
                        this.f20924b.mo5826a();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
