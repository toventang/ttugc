package com.facebook.webpsupport;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1840l.AbstractC24135a;
import com.facebook.common.p1840l.AbstractC24136b;
import com.facebook.common.p1840l.C24138c;
import com.facebook.imagepipeline.nativecode.C24632b;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebpBitmapFactoryImpl implements AbstractC24136b {
    public static final boolean IN_BITMAP_SUPPORTED = true;
    private static AbstractC24135a mBitmapCreator;
    private static AbstractC24136b.AbstractC24137a mWebpErrorLogger;

    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    private static void sendWebpErrorLog(String str) {
    }

    static {
        Covode.recordClassIndex(30364);
        int i = Build.VERSION.SDK_INT;
    }

    @Override // com.facebook.common.p1840l.AbstractC24136b
    public void setBitmapCreator(AbstractC24135a aVar) {
        mBitmapCreator = aVar;
    }

    @Override // com.facebook.common.p1840l.AbstractC24136b
    public void setWebpErrorLogger(AbstractC24136b.AbstractC24137a aVar) {
        mWebpErrorLogger = aVar;
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        if (options == null || options.inTempStorage == null) {
            return new byte[8192];
        }
        return options.inTempStorage;
    }

    private static Bitmap originalDecodeFile(String str) {
        MethodCollector.m26663i(8033);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        MethodCollector.m26664o(8033);
        return decodeFile;
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        MethodCollector.m26663i(8469);
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
        MethodCollector.m26664o(8469);
        return decodeFileDescriptor;
    }

    private static Bitmap originalDecodeStream(InputStream inputStream) {
        MethodCollector.m26663i(7108);
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        MethodCollector.m26664o(7108);
        return decodeStream;
    }

    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        int i = Build.VERSION.SDK_INT;
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        int i4 = options.inScreenDensity;
        if (i2 == 0 || i3 == 0 || i2 == i4) {
            return f;
        }
        return ((float) i3) / ((float) i2);
    }

    private static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        MethodCollector.m26663i(6211);
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        MethodCollector.m26664o(6211);
        return inputStream;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    public Bitmap decodeFile(String str, BitmapFactory.Options options) {
        return hookDecodeFile(str, options);
    }

    private static Bitmap originalDecodeResource(Resources resources, int i) {
        MethodCollector.m26663i(7740);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        MethodCollector.m26664o(7740);
        return decodeResource;
    }

    private static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        MethodCollector.m26663i(7886);
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        MethodCollector.m26664o(7886);
        return decodeFile;
    }

    private static byte[] getWebpHeader(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        MethodCollector.m26663i(6370);
        inputStream.mark(20);
        if (options == null || options.inTempStorage == null || options.inTempStorage.length < 20) {
            bArr = new byte[20];
        } else {
            bArr = options.inTempStorage;
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            MethodCollector.m26664o(6370);
            return bArr;
        } catch (IOException unused) {
            MethodCollector.m26664o(6370);
            return null;
        }
    }

    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        MethodCollector.m26663i(7252);
        Bitmap bitmap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmap = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                MethodCollector.m26664o(7252);
                throw th;
            }
        } catch (Exception unused) {
        }
        MethodCollector.m26664o(7252);
        return bitmap;
    }

    private static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (i2 != 0 && i != i2 && i != options.inScreenDensity && options.inScaled) {
                    bitmap.setDensity(i2);
                }
            } else if (IN_BITMAP_SUPPORTED && options.inBitmap != null) {
                int i3 = Resources.getSystem().getDisplayMetrics().densityDpi;
                if (i3 != 0) {
                    bitmap.setDensity(i3);
                } else {
                    bitmap.setDensity(160);
                }
            }
        }
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @Override // com.facebook.common.p1840l.AbstractC24136b
    public Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @Override // com.facebook.common.p1840l.AbstractC24136b
    public Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return hookDecodeStream(inputStream, rect, options);
    }

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(6809);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2);
        MethodCollector.m26664o(6809);
        return decodeByteArray;
    }

    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        if (!IN_BITMAP_SUPPORTED || options == null || options.inBitmap == null || !options.inBitmap.isMutable()) {
            return mBitmapCreator.mo39724a(i, i2, Bitmap.Config.ARGB_8888);
        }
        return options.inBitmap;
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        MethodCollector.m26663i(8322);
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
        MethodCollector.m26664o(8322);
        return decodeFileDescriptor;
    }

    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        MethodCollector.m26663i(7739);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
        MethodCollector.m26664o(7739);
        return decodeResource;
    }

    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        MethodCollector.m26663i(7104);
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, rect, options);
        MethodCollector.m26664o(7104);
        return decodeStream;
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmap;
        MethodCollector.m26663i(8175);
        C24632b.m47148a();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(new FileInputStream(fileDescriptor));
            try {
                byte[] webpHeader = getWebpHeader(wrapToMarkSupportedStream, options);
                if (!C24138c.f57082a || !C24138c.m45746a(webpHeader, 0, 20)) {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    bitmap = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                    if (bitmap == null) {
                        sendWebpErrorLog("webp_direct_decode_fd_failed_on_no_webp");
                    }
                } else {
                    bitmap = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    if (bitmap == null) {
                        sendWebpErrorLog("webp_direct_decode_fd");
                    }
                    setPaddingDefaultValues(rect);
                    setWebpBitmapOptions(bitmap, options);
                }
                try {
                    wrapToMarkSupportedStream.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        } else {
            bitmap = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
        }
        MethodCollector.m26664o(8175);
        return bitmap;
        MethodCollector.m26664o(8175);
        throw th;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        MethodCollector.m26663i(7564);
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } catch (Throwable th) {
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                MethodCollector.m26664o(7564);
                throw th;
            }
        } catch (Exception unused) {
        }
        if (!IN_BITMAP_SUPPORTED || bitmap != null || options == null || options.inBitmap == null) {
            MethodCollector.m26664o(7564);
            return bitmap;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Problem decoding into existing bitmap");
        MethodCollector.m26664o(7564);
        throw illegalArgumentException;
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Bitmap originalDecodeStream;
        MethodCollector.m26663i(6954);
        C24632b.m47148a();
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        byte[] webpHeader = getWebpHeader(wrapToMarkSupportedStream, options);
        if ((C24138c.f57082a || Build.VERSION.SDK_INT == 28) && C24138c.m45746a(webpHeader, 0, 20) && options.inPreferredConfig == Bitmap.Config.ARGB_8888) {
            originalDecodeStream = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (originalDecodeStream == null) {
                sendWebpErrorLog("webp_direct_decode_stream");
            }
            setWebpBitmapOptions(originalDecodeStream, options);
            setPaddingDefaultValues(rect);
        } else {
            originalDecodeStream = originalDecodeStream(wrapToMarkSupportedStream, rect, options);
            if (originalDecodeStream == null) {
                sendWebpErrorLog("webp_direct_decode_stream_failed_on_no_webp");
            }
        }
        MethodCollector.m26664o(6954);
        return originalDecodeStream;
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return hookDecodeByteArray(bArr, i, i2, options);
    }

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        MethodCollector.m26663i(6671);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
        MethodCollector.m26664o(6671);
        return decodeByteArray;
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        Bitmap originalDecodeByteArray;
        MethodCollector.m26663i(6521);
        C24632b.m47148a();
        if (!C24138c.f57082a || !C24138c.m45746a(bArr, i, i2)) {
            originalDecodeByteArray = originalDecodeByteArray(bArr, i, i2, options);
            if (originalDecodeByteArray == null) {
                sendWebpErrorLog("webp_direct_decode_array_failed_on_no_webp");
            }
        } else {
            originalDecodeByteArray = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (originalDecodeByteArray == null) {
                sendWebpErrorLog("webp_direct_decode_array");
            }
            setWebpBitmapOptions(originalDecodeByteArray, options);
        }
        MethodCollector.m26664o(6521);
        return originalDecodeByteArray;
    }

    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        MethodCollector.m26663i(7404);
        Bitmap decodeResourceStream = BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
        MethodCollector.m26664o(7404);
        return decodeResourceStream;
    }

    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }
}
