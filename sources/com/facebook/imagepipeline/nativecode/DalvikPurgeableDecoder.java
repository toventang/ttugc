package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1832d.C24098m;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24365f;
import com.facebook.imagepipeline.memory.C24482b;
import com.facebook.imagepipeline.memory.C24484c;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1887l.AbstractC24469g;
import com.facebook.imageutils.C24656a;
import com.facebook.imageutils.C24658b;
import java.util.Locale;

public abstract class DalvikPurgeableDecoder implements AbstractC24469g {
    protected static final byte[] EOI = {-1, -39};
    private final C24482b mUnpooledBitmapsCounter = C24484c.m46766a();

    private static native void nativePinBitmap(Bitmap bitmap);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeByteArrayAsPurgeable(C24117a<AbstractC24111h> aVar, BitmapFactory.Options options);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(C24117a<AbstractC24111h> aVar, int i, BitmapFactory.Options options);

    static {
        Covode.recordClassIndex(28776);
        C24658b.m47175a("imagepipeline");
    }

    public C24117a<Bitmap> pinBitmap(Bitmap bitmap) {
        C24091i.m45617a(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.mo40360a(bitmap)) {
                return C24117a.m45707a(bitmap, this.mUnpooledBitmapsCounter.f58174a);
            }
            int a = C24656a.m47171a(bitmap);
            bitmap.recycle();
            throw new C24365f(C1764a.m5929a(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(a), Integer.valueOf(this.mUnpooledBitmapsCounter.mo40359a()), Long.valueOf(this.mUnpooledBitmapsCounter.mo40361b()), Integer.valueOf(this.mUnpooledBitmapsCounter.mo40363c()), Integer.valueOf(this.mUnpooledBitmapsCounter.mo40364d())}));
        } catch (Exception e) {
            bitmap.recycle();
            throw C24098m.m45632b(e);
        }
    }

    public static boolean endsWithEOI(C24117a<AbstractC24111h> aVar, int i) {
        AbstractC24111h a = aVar.mo39695a();
        if (i >= 2 && a.mo39672a(i - 2) == -1 && a.mo39672a(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public static BitmapFactory.Options getBitmapFactoryOptions(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        int i2 = Build.VERSION.SDK_INT;
        options.inMutable = true;
        return options;
    }

    public C24117a<Bitmap> decodeFromEncodedImage(C24456e eVar, Bitmap.Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(eVar, config, rect, false);
    }

    @Override // com.facebook.imagepipeline.p1887l.AbstractC24469g
    public C24117a<Bitmap> decodeJPEGFromEncodedImage(C24456e eVar, Bitmap.Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i, false);
    }

    @Override // com.facebook.imagepipeline.p1887l.AbstractC24469g
    public C24117a<Bitmap> decodeFromEncodedImageWithColorSpace(C24456e eVar, Bitmap.Config config, Rect rect, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(eVar.f58101h, config);
        C24117a<AbstractC24111h> b = C24117a.m45711b(eVar.f58094a);
        C24091i.m45617a(b);
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(b, bitmapFactoryOptions));
        } finally {
            C24117a.m45712c(b);
        }
    }

    @Override // com.facebook.imagepipeline.p1887l.AbstractC24469g
    public C24117a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C24456e eVar, Bitmap.Config config, Rect rect, int i, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(eVar.f58101h, config);
        C24117a<AbstractC24111h> b = C24117a.m45711b(eVar.f58094a);
        C24091i.m45617a(b);
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(b, i, bitmapFactoryOptions));
        } finally {
            C24117a.m45712c(b);
        }
    }
}
