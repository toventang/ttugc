package com.p2082ss.android.medialib.p2158qr;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.utils.BitmapLoader;

/* renamed from: com.ss.android.medialib.qr.PicScanner */
public class PicScanner {
    public long handle = nativeCreate();
    private AbstractC30054a listener;
    private boolean success;

    /* renamed from: com.ss.android.medialib.qr.PicScanner$a */
    public interface AbstractC30054a {
        static {
            Covode.recordClassIndex(36542);
        }
    }

    private native long nativeCreate();

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native void nativeRelease(long j);

    private native int nativeStart(long j, Bitmap bitmap, ScanSettings scanSettings);

    private native void nativeStop(long j);

    public void onResult(boolean z) {
    }

    public boolean isSuccess() {
        return this.success;
    }

    static {
        Covode.recordClassIndex(36541);
        C30731d.m63118c();
    }

    public boolean isValid() {
        if (this.handle != 0) {
            return true;
        }
        return false;
    }

    public PicScanner() {
        MethodCollector.m26663i(2325);
        MethodCollector.m26664o(2325);
    }

    public void stop() {
        MethodCollector.m26663i(2460);
        long j = this.handle;
        if (j == 0) {
            MethodCollector.m26664o(2460);
            return;
        }
        nativeStop(j);
        MethodCollector.m26664o(2460);
    }

    public EnigmaResult getEnigmaResult() {
        MethodCollector.m26663i(2509);
        long j = this.handle;
        if (j == 0) {
            MethodCollector.m26664o(2509);
            return null;
        }
        EnigmaResult nativeGetEnigmaResult = nativeGetEnigmaResult(j);
        if (!(nativeGetEnigmaResult == null || nativeGetEnigmaResult.getResult() == null)) {
            this.success = true;
        }
        MethodCollector.m26664o(2509);
        return nativeGetEnigmaResult;
    }

    public synchronized void release() {
        MethodCollector.m26663i(2505);
        C85315al.m146637a("PicScanner", "release");
        long j = this.handle;
        if (j == 0) {
            C85315al.m146641c("PicScanner", "release skip");
            MethodCollector.m26664o(2505);
            return;
        }
        nativeRelease(j);
        this.handle = 0;
        MethodCollector.m26664o(2505);
    }

    public void setListener(AbstractC30054a aVar) {
        this.listener = aVar;
    }

    public int start(Bitmap bitmap, ScanSettings scanSettings) {
        MethodCollector.m26663i(2457);
        if (bitmap == null) {
            MethodCollector.m26664o(2457);
            return -1;
        }
        this.success = false;
        nativeStart(this.handle, bitmap, scanSettings);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        MethodCollector.m26664o(2457);
        return 0;
    }

    public int start(String str, ScanSettings scanSettings) {
        MethodCollector.m26663i(2344);
        if (this.handle == 0) {
            MethodCollector.m26664o(2344);
            return -1;
        }
        Bitmap bitmap = null;
        try {
            Bitmap loadBitmap = BitmapLoader.loadBitmap(str, scanSettings.width, scanSettings.height);
            if (loadBitmap != null) {
                int width = loadBitmap.getWidth();
                int height = loadBitmap.getHeight();
                if (width * height > 4000000) {
                    float sqrt = (float) (1.0d / Math.sqrt((double) ((((float) width) * ((float) height)) / 4000000.0f)));
                    Matrix matrix = new Matrix();
                    matrix.postScale(sqrt, sqrt);
                    bitmap = Bitmap.createBitmap(loadBitmap, 0, 0, width, height, matrix, true);
                } else {
                    bitmap = loadBitmap.copy(Bitmap.Config.ARGB_8888, true);
                }
                if (!loadBitmap.isRecycled()) {
                    loadBitmap.recycle();
                }
            }
            int start = start(bitmap, scanSettings);
            MethodCollector.m26664o(2344);
            return start;
        } catch (Exception unused) {
            MethodCollector.m26664o(2344);
            return -2;
        } catch (OutOfMemoryError unused2) {
            MethodCollector.m26664o(2344);
            return -3;
        }
    }
}
