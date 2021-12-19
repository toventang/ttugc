package com.google.p1970ar.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* renamed from: com.google.ar.core.AugmentedImageDatabase */
public class AugmentedImageDatabase {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32571);
    }

    private native int nativeAddImage(long j, long j2, String str, ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeAddImageWithPhysicalSize(long j, long j2, String str, ByteBuffer byteBuffer, int i, int i2, int i3, float f);

    private static native long nativeCreate(long j);

    private static native long nativeDeserialize(long j, ByteBuffer byteBuffer);

    private native int nativeGetNumImages(long j, long j2);

    private native void nativeReleaseDatabase(long j, long j2);

    private native ByteBuffer nativeSerialize(long j, long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(13322);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseDatabase(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(13322);
    }

    public int getNumImages() {
        MethodCollector.m26663i(13199);
        int nativeGetNumImages = nativeGetNumImages(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(13199);
        return nativeGetNumImages;
    }

    public AugmentedImageDatabase(Session session2) {
        this(session2, nativeCreate(session2.nativeWrapperHandle));
        MethodCollector.m26663i(12324);
        MethodCollector.m26664o(12324);
    }

    public void serialize(OutputStream outputStream) {
        MethodCollector.m26663i(13263);
        Channels.newChannel(outputStream).write(nativeSerialize(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13263);
    }

    private static ByteBuffer loadDirectByteBuffer(InputStream inputStream) {
        MethodCollector.m26663i(13454);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray.length);
                allocateDirect.put(byteArray);
                MethodCollector.m26664o(13454);
                return allocateDirect;
            }
        }
    }

    static ByteBuffer convertBitmapToGrayscaleDirectBuffer(Bitmap bitmap) {
        MethodCollector.m26663i(13381);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getWidth() * bitmap.getHeight());
        for (int i = 0; i < bitmap.getHeight(); i++) {
            for (int i2 = 0; i2 < bitmap.getWidth(); i2++) {
                allocateDirect.put((bitmap.getWidth() * i) + i2, (byte) Color.red(createBitmap.getPixel(i2, i)));
            }
        }
        MethodCollector.m26664o(13381);
        return allocateDirect;
    }

    AugmentedImageDatabase(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public static AugmentedImageDatabase deserialize(Session session2, InputStream inputStream) {
        MethodCollector.m26663i(12174);
        AugmentedImageDatabase augmentedImageDatabase = new AugmentedImageDatabase(session2, nativeDeserialize(session2.nativeWrapperHandle, loadDirectByteBuffer(inputStream)));
        MethodCollector.m26664o(12174);
        return augmentedImageDatabase;
    }

    public int addImage(String str, Bitmap bitmap) {
        MethodCollector.m26663i(12557);
        int nativeAddImage = nativeAddImage(this.session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
        MethodCollector.m26664o(12557);
        return nativeAddImage;
    }

    public int addImage(String str, Bitmap bitmap, float f) {
        MethodCollector.m26663i(12559);
        int nativeAddImageWithPhysicalSize = nativeAddImageWithPhysicalSize(this.session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), f);
        MethodCollector.m26664o(12559);
        return nativeAddImageWithPhysicalSize;
    }
}
