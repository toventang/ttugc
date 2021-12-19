package com.facebook.imagepipeline.p1887l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.memory.C24496n;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

/* renamed from: com.facebook.imagepipeline.l.d */
public final class C24466d extends DalvikPurgeableDecoder {

    /* renamed from: a */
    private final C24496n f58116a;

    static {
        Covode.recordClassIndex(28609);
    }

    public C24466d(C24496n nVar) {
        this.f58116a = nVar;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeByteArrayAsPurgeable(C24117a<AbstractC24111h> aVar, BitmapFactory.Options options) {
        MethodCollector.m26663i(4848);
        AbstractC24111h a = aVar.mo39695a();
        int a2 = a.mo39673a();
        C24117a<byte[]> a3 = this.f58116a.mo40374a(a2);
        try {
            byte[] a4 = a3.mo39695a();
            a.mo39674a(0, a4, 0, a2);
            return (Bitmap) C24091i.m45618a(BitmapFactory.decodeByteArray(a4, 0, a2, options), "BitmapFactory returned null");
        } finally {
            C24117a.m45712c(a3);
            MethodCollector.m26664o(4848);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeJPEGByteArrayAsPurgeable(C24117a<AbstractC24111h> aVar, int i, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z;
        MethodCollector.m26663i(4855);
        if (endsWithEOI(aVar, i)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        AbstractC24111h a = aVar.mo39695a();
        if (i <= a.mo39673a()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        int i2 = i + 2;
        C24117a<byte[]> a2 = this.f58116a.mo40374a(i2);
        try {
            byte[] a3 = a2.mo39695a();
            a.mo39674a(0, a3, 0, i);
            if (bArr != null) {
                a3[i] = -1;
                a3[i + 1] = -39;
                i = i2;
            }
            return (Bitmap) C24091i.m45618a(BitmapFactory.decodeByteArray(a3, 0, i, options), "BitmapFactory returned null");
        } finally {
            C24117a.m45712c(a2);
            MethodCollector.m26664o(4855);
        }
    }
}
