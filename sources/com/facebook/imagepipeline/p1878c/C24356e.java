package com.facebook.imagepipeline.p1878c;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1887l.AbstractC24469g;
import com.facebook.p1870h.C24313b;

/* renamed from: com.facebook.imagepipeline.c.e */
public class C24356e extends AbstractC24357f {

    /* renamed from: a */
    private static final String f57746a = C24356e.class.getSimpleName();

    /* renamed from: b */
    private final C24353b f57747b;

    /* renamed from: c */
    private final AbstractC24469g f57748c;

    /* renamed from: d */
    private boolean f57749d;

    static {
        Covode.recordClassIndex(28498);
    }

    public C24356e(C24353b bVar, AbstractC24469g gVar) {
        this.f57747b = bVar;
        this.f57748c = gVar;
    }

    /* renamed from: c */
    private static C24117a<Bitmap> m46352c(int i, int i2, Bitmap.Config config) {
        MethodCollector.m26663i(3741);
        C24117a<Bitmap> a = C24117a.m45707a(Bitmap.createBitmap(i, i2, config), C24359g.m46366a());
        MethodCollector.m26664o(3741);
        return a;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1878c.AbstractC24357f
    /* renamed from: a */
    public final C24117a<Bitmap> mo40148a(int i, int i2, Bitmap.Config config) {
        if (this.f57749d) {
            return m46352c(i, i2, config);
        }
        C24117a<AbstractC24111h> a = this.f57747b.mo40149a((short) i, (short) i2);
        try {
            C24456e eVar = new C24456e(a);
            eVar.f58096c = C24313b.f57651a;
            try {
                C24117a<Bitmap> decodeJPEGFromEncodedImage = this.f57748c.decodeJPEGFromEncodedImage(eVar, config, null, a.mo39695a().mo39673a());
                if (!decodeJPEGFromEncodedImage.mo39695a().isMutable()) {
                    C24117a.m45712c(decodeJPEGFromEncodedImage);
                    this.f57749d = true;
                    String str = f57746a;
                    if (C24099a.f57025a.mo39656b(6)) {
                        C24099a.f57025a.mo39661e(str, "Immutable bitmap returned by decoder");
                    }
                    C24117a<Bitmap> c = m46352c(i, i2, config);
                    C24456e.m46681d(eVar);
                    return c;
                }
                decodeJPEGFromEncodedImage.mo39695a().setHasAlpha(true);
                decodeJPEGFromEncodedImage.mo39695a().eraseColor(0);
                C24456e.m46681d(eVar);
                a.close();
                return decodeJPEGFromEncodedImage;
            } catch (Throwable th) {
                C24456e.m46681d(eVar);
                throw th;
            }
        } finally {
            a.close();
        }
    }
}
