package com.facebook.imagepipeline.p1882g;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24082a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24459h;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.imagepipeline.p1887l.AbstractC24469g;
import com.facebook.imagepipeline.p1893r.AbstractC24655a;
import com.facebook.p1870h.C24313b;
import com.facebook.p1870h.C24314c;
import com.facebook.p1870h.C24316d;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.g.b */
public final class C24440b implements AbstractC24442c {

    /* renamed from: a */
    final AbstractC24442c f58067a;

    /* renamed from: b */
    final AbstractC24442c f58068b;

    /* renamed from: c */
    private final AbstractC24442c f58069c;

    /* renamed from: d */
    private final AbstractC24469g f58070d;

    /* renamed from: e */
    private final AbstractC24442c f58071e;

    /* renamed from: f */
    private final Map<C24314c, AbstractC24442c> f58072f;

    static {
        Covode.recordClassIndex(28583);
    }

    /* renamed from: a */
    private static void m46641a(AbstractC24655a aVar, C24117a<Bitmap> aVar2) {
        if (aVar != null) {
            Bitmap a = aVar2.mo39695a();
            int i = Build.VERSION.SDK_INT;
            if (aVar.mo40488a()) {
                a.setHasAlpha(true);
            }
        }
    }

    /* renamed from: a */
    public final C24455d mo40281a(C24456e eVar, C24361b bVar) {
        C24117a<Bitmap> decodeFromEncodedImageWithColorSpace = this.f58070d.decodeFromEncodedImageWithColorSpace(eVar, bVar.f57774i, null, bVar.f57773h);
        try {
            m46641a(bVar.f57776k, decodeFromEncodedImageWithColorSpace);
            return new C24455d(decodeFromEncodedImageWithColorSpace, C24458g.f58105a, eVar.mo40305d(), eVar.mo40306e());
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }

    public C24440b(AbstractC24442c cVar, AbstractC24442c cVar2, AbstractC24442c cVar3, AbstractC24469g gVar) {
        this(cVar, cVar2, cVar3, gVar, null);
    }

    @Override // com.facebook.imagepipeline.p1882g.AbstractC24442c
    /* renamed from: a */
    public final AbstractC24454c mo34187a(C24456e eVar, int i, AbstractC24459h hVar, C24361b bVar) {
        AbstractC24442c cVar;
        if (bVar.f57775j != null) {
            return bVar.f57775j.mo34187a(eVar, i, hVar, bVar);
        }
        C24314c c = eVar.mo40303c();
        if (c == null || c == C24314c.f57663a) {
            c = C24316d.m46270a(eVar.mo40301b());
            eVar.f58096c = c;
        }
        Map<C24314c, AbstractC24442c> map = this.f58072f;
        if (map == null || (cVar = map.get(c)) == null) {
            return this.f58071e.mo34187a(eVar, i, hVar, bVar);
        }
        return cVar.mo34187a(eVar, i, hVar, bVar);
    }

    /* renamed from: b */
    public final C24455d mo40282b(C24456e eVar, int i, AbstractC24459h hVar, C24361b bVar) {
        C24117a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace = this.f58070d.decodeJPEGFromEncodedImageWithColorSpace(eVar, bVar.f57774i, null, i, bVar.f57773h);
        try {
            m46641a(bVar.f57776k, decodeJPEGFromEncodedImageWithColorSpace);
            return new C24455d(decodeJPEGFromEncodedImageWithColorSpace, hVar, eVar.mo40305d(), eVar.mo40306e());
        } finally {
            decodeJPEGFromEncodedImageWithColorSpace.close();
        }
    }

    public C24440b(AbstractC24442c cVar, AbstractC24442c cVar2, AbstractC24442c cVar3, AbstractC24469g gVar, Map<C24314c, AbstractC24442c> map) {
        this.f58071e = new AbstractC24442c() {
            /* class com.facebook.imagepipeline.p1882g.C24440b.C244411 */

            static {
                Covode.recordClassIndex(28584);
            }

            @Override // com.facebook.imagepipeline.p1882g.AbstractC24442c
            /* renamed from: a */
            public final AbstractC24454c mo34187a(C24456e eVar, int i, AbstractC24459h hVar, C24361b bVar) {
                String str;
                C24314c c = eVar.mo40303c();
                if (c == C24313b.f57651a) {
                    return C24440b.this.mo40282b(eVar, i, hVar, bVar);
                }
                if (c == C24313b.f57653c) {
                    C24440b bVar2 = C24440b.this;
                    if (bVar.f57772g || bVar2.f58067a == null) {
                        return bVar2.mo40281a(eVar, bVar);
                    }
                    return bVar2.f58067a.mo34187a(eVar, i, hVar, bVar);
                } else if (c == C24313b.f57660j) {
                    return C24440b.this.f58068b.mo34187a(eVar, i, hVar, bVar);
                } else {
                    if (c != C24314c.f57663a) {
                        return C24440b.this.mo40281a(eVar, bVar);
                    }
                    try {
                        byte[] bArr = new byte[22];
                        C24082a.m45597a(eVar.mo40301b(), bArr, 22);
                        StringBuilder sb = new StringBuilder(44);
                        int i2 = 0;
                        while (true) {
                            String hexString = Integer.toHexString(bArr[i2] & 255);
                            if (hexString.length() < 2) {
                                sb.append('0');
                            }
                            sb.append(hexString.toLowerCase());
                            i2++;
                            if (i2 >= 22) {
                                break;
                            }
                        }
                        str = sb.toString();
                    } catch (Throwable unused) {
                        str = "unknow";
                    }
                    throw new C24439a("unknown image format, errorHead: ".concat(String.valueOf(str)), eVar);
                }
            }
        };
        this.f58067a = cVar;
        this.f58068b = cVar2;
        this.f58069c = cVar3;
        this.f58070d = gVar;
        this.f58072f = map;
    }
}
