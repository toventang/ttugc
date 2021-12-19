package com.airbnb.lottie.p103f;

import android.content.Context;
import androidx.core.p036g.C0692e;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2108f;
import com.airbnb.lottie.C2207l;
import com.airbnb.lottie.C2208m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.f.c */
public final class C2120c {

    /* renamed from: a */
    private final Context f6383a;

    /* renamed from: b */
    private final String f6384b;

    /* renamed from: c */
    private final C2119b f6385c;

    static {
        Covode.recordClassIndex(2315);
    }

    /* renamed from: b */
    private C2208m<C2044e> m6609b() {
        return new C2208m<>(new Callable<C2207l<C2044e>>() {
            /* class com.airbnb.lottie.p103f.C2120c.CallableC21211 */

            static {
                Covode.recordClassIndex(2316);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C2207l<C2044e> call() {
                return C2120c.this.mo6001a();
            }
        });
    }

    /* renamed from: a */
    public final C2207l<C2044e> mo6001a() {
        C2207l<C2044e> a;
        V v;
        MethodCollector.m26663i(13087);
        C0692e<EnumC2118a, InputStream> a2 = this.f6385c.mo5999a();
        if (a2 != null) {
            F f = a2.f2750a;
            S s = a2.f2751b;
            if (f == EnumC2118a.Zip) {
                a = C2108f.m6590a(new ZipInputStream(s), this.f6384b);
            } else {
                a = C2108f.m6589a(s, this.f6384b, true);
            }
            if (!(a.f6621a == null || (v = a.f6621a) == null)) {
                C2207l<C2044e> lVar = new C2207l<>((C2044e) v);
                MethodCollector.m26664o(13087);
                return lVar;
            }
        }
        C2207l<C2044e> c = m6610c();
        MethodCollector.m26664o(13087);
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[Catch:{ IOException -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097 A[Catch:{ IOException -> 0x019c }, LOOP:0: B:28:0x0091->B:30:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a1 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.airbnb.lottie.C2207l<com.airbnb.lottie.C2044e> m6610c() {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p103f.C2120c.m6610c():com.airbnb.lottie.l");
    }

    /* renamed from: a */
    public static C2208m<C2044e> m6608a(Context context, String str) {
        return new C2120c(context, str).m6609b();
    }

    public C2120c(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f6383a = applicationContext;
        this.f6384b = str;
        this.f6385c = new C2119b(applicationContext, str);
    }
}
