package com.facebook.imagepipeline.p1887l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.memory.AbstractC24485d;
import com.facebook.imagepipeline.p1885j.C24456e;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.l.b */
public abstract class AbstractC24464b implements AbstractC24469g {

    /* renamed from: b */
    private static final Class<?> f58110b = AbstractC24464b.class;

    /* renamed from: d */
    private static final byte[] f58111d = {-1, -39};

    /* renamed from: a */
    final C0693f.C0696c<ByteBuffer> f58112a;

    /* renamed from: c */
    private final AbstractC24485d f58113c;

    /* renamed from: a */
    public abstract int mo40317a(int i, int i2, BitmapFactory.Options options);

    static {
        Covode.recordClassIndex(28607);
    }

    /* renamed from: a */
    private static BitmapFactory.Options m46708a(C24456e eVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = eVar.f58101h;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.mo40301b(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    public AbstractC24464b(AbstractC24485d dVar, int i, C0693f.C0696c cVar) {
        this.f58113c = dVar;
        this.f58112a = cVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f58112a.release(ByteBuffer.allocate(16384));
        }
    }

    @Override // com.facebook.imagepipeline.p1887l.AbstractC24469g
    public C24117a<Bitmap> decodeJPEGFromEncodedImage(C24456e eVar, Bitmap.Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i, false);
    }

    @Override // com.facebook.imagepipeline.p1887l.AbstractC24469g
    public C24117a<Bitmap> decodeFromEncodedImageWithColorSpace(C24456e eVar, Bitmap.Config config, Rect rect, boolean z) {
        boolean z2;
        BitmapFactory.Options a = m46708a(eVar, config);
        if (a.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return m46709a(eVar.mo40301b(), a, rect, z);
        } catch (RuntimeException e) {
            if (z2) {
                return decodeFromEncodedImageWithColorSpace(eVar, Bitmap.Config.ARGB_8888, rect, z);
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        com.facebook.common.p1833e.C24099a.m45656c(com.facebook.imagepipeline.p1887l.AbstractC24464b.f58110b, "Could not decode region %s, decoding full bitmap instead.", r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r7 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        if (r7 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.p1836h.C24117a<android.graphics.Bitmap> m46709a(java.io.InputStream r15, android.graphics.BitmapFactory.Options r16, android.graphics.Rect r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1887l.AbstractC24464b.m46709a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, boolean):com.facebook.common.h.a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo40318a(InputStream inputStream, BitmapFactory.Options options, int i, int i2, Bitmap bitmap) {
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.facebook.imagepipeline.p1887l.AbstractC24469g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.p1836h.C24117a<android.graphics.Bitmap> decodeJPEGFromEncodedImageWithColorSpace(com.facebook.imagepipeline.p1885j.C24456e r11, android.graphics.Bitmap.Config r12, android.graphics.Rect r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1887l.AbstractC24464b.decodeJPEGFromEncodedImageWithColorSpace(com.facebook.imagepipeline.j.e, android.graphics.Bitmap$Config, android.graphics.Rect, int, boolean):com.facebook.common.h.a");
    }
}
