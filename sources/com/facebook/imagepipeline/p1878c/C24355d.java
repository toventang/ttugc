package com.facebook.imagepipeline.p1878c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1840l.AbstractC24135a;
import com.facebook.imagepipeline.memory.C24479ac;
import com.facebook.imagepipeline.memory.C24496n;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.p1870h.C24313b;

/* renamed from: com.facebook.imagepipeline.c.d */
public final class C24355d implements AbstractC24135a {

    /* renamed from: a */
    private final C24353b f57744a;

    /* renamed from: b */
    private final C24496n f57745b;

    static {
        Covode.recordClassIndex(28497);
    }

    public C24355d(C24479ac acVar) {
        this.f57745b = acVar.mo40355b();
        this.f57744a = new C24353b(acVar.mo40353a(0));
    }

    @Override // com.facebook.common.p1840l.AbstractC24135a
    /* renamed from: a */
    public final Bitmap mo39724a(int i, int i2, Bitmap.Config config) {
        C24456e eVar;
        Throwable th;
        MethodCollector.m26663i(3813);
        C24117a<AbstractC24111h> a = this.f57744a.mo40149a((short) i, (short) i2);
        C24117a<byte[]> aVar = null;
        try {
            eVar = new C24456e(a);
            try {
                eVar.f58096c = C24313b.f57651a;
                int i3 = eVar.f58101h;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDither = true;
                options.inPreferredConfig = config;
                options.inPurgeable = true;
                options.inInputShareable = true;
                options.inSampleSize = i3;
                int i4 = Build.VERSION.SDK_INT;
                options.inMutable = true;
                int a2 = a.mo39695a().mo39673a();
                aVar = this.f57745b.mo40374a(a2 + 2);
                byte[] a3 = aVar.mo39695a();
                a.mo39695a().mo39674a(0, a3, 0, a2);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a3, 0, a2, options);
                decodeByteArray.setHasAlpha(true);
                decodeByteArray.eraseColor(0);
                C24117a.m45712c(aVar);
                C24456e.m46681d(eVar);
                C24117a.m45712c(a);
                MethodCollector.m26664o(3813);
                return decodeByteArray;
            } catch (Throwable th2) {
                th = th2;
                C24117a.m45712c(aVar);
                C24456e.m46681d(eVar);
                C24117a.m45712c(a);
                MethodCollector.m26664o(3813);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            eVar = null;
            C24117a.m45712c(aVar);
            C24456e.m46681d(eVar);
            C24117a.m45712c(a);
            MethodCollector.m26664o(3813);
            throw th;
        }
    }
}
