package com.p2082ss.lens.algorithm;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.lens.algorithm.PictureOCLSR */
public class PictureOCLSR {
    private static boolean isLibLoaded;
    private long mNativePtr;
    private int maxHeight = 1080;
    private int maxWidth = 600;
    private int minHeight = 500;
    private int minWidth = 360;

    static {
        Covode.recordClassIndex(101193);
    }

    /* renamed from: com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147894x40970d9d(String str, String str2) {
        return 0;
    }

    private native long nativeInitPictureOclSr(String str, int i, int i2, int i3);

    private native int nativePictureOclSrProcess(long j, Bitmap bitmap, Bitmap bitmap2);

    private native void nativeReleasePictureOclSr(long j);

    public void ReleasePictureOclSr() {
        MethodCollector.m26663i(5041);
        long j = this.mNativePtr;
        if (j == 0) {
            MethodCollector.m26664o(5041);
            return;
        }
        nativeReleasePictureOclSr(j);
        MethodCollector.m26664o(5041);
    }

    /* renamed from: com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147893x8cd096b6(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public synchronized boolean InitPictureOclSr(String str) {
        MethodCollector.m26663i(5003);
        if (!isLibLoaded) {
            try {
                m147893x8cd096b6("c++_shared");
                m147893x8cd096b6("bytenn");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                m147893x8cd096b6("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(5003);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.m26664o(5003);
            return false;
        }
        long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, 4);
        this.mNativePtr = nativeInitPictureOclSr;
        if (nativeInitPictureOclSr == 0) {
            MethodCollector.m26664o(5003);
            return false;
        }
        MethodCollector.m26664o(5003);
        return true;
    }

    public boolean IsSrSupport(Bitmap bitmap) {
        if (bitmap.getConfig() != Bitmap.Config.RGB_565) {
            m147894x40970d9d("vrsr_picture", "sr is not supported because input picture format is not support, only support format rgb_565");
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 != 0 || height % 2 != 0) {
            m147894x40970d9d("vrsr_picture", "sr is not supported because input size h " + height + " w " + width + " is not support");
            return false;
        } else if (width >= this.minWidth && width <= this.maxWidth && height >= this.minHeight && height <= this.maxHeight) {
            return true;
        } else {
            m147894x40970d9d("vrsr_picture", "sr is not supported because input size h " + height + " w " + width + " is not support");
            return false;
        }
    }

    public synchronized boolean InitPictureOclSr(String str, int i) {
        MethodCollector.m26663i(5009);
        if (!isLibLoaded) {
            try {
                m147893x8cd096b6("c++_shared");
                m147893x8cd096b6("bytenn");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                m147893x8cd096b6("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(5009);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.m26664o(5009);
            return false;
        }
        long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, i);
        this.mNativePtr = nativeInitPictureOclSr;
        if (nativeInitPictureOclSr == 0) {
            MethodCollector.m26664o(5009);
            return false;
        }
        MethodCollector.m26664o(5009);
        return true;
    }

    public synchronized int PictureOclSrProcess(Bitmap bitmap, Bitmap bitmap2) {
        MethodCollector.m26663i(5039);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 != 0 || height % 2 != 0) {
            m147894x40970d9d("vrsr_picture", "sr process failed because input size h " + height + " w " + width + " is not support");
            MethodCollector.m26664o(5039);
            return -1;
        } else if (width < this.minWidth || width > this.maxWidth || height < this.minHeight || height > this.maxHeight) {
            m147894x40970d9d("vrsr_picture", "sr is not supported because input size h " + height + " w " + width + " is not support");
            MethodCollector.m26664o(5039);
            return -1;
        } else {
            int nativePictureOclSrProcess = nativePictureOclSrProcess(this.mNativePtr, bitmap, bitmap2);
            if (nativePictureOclSrProcess != 0) {
                m147894x40970d9d("vrsr_picture", "sr process failed with error code " + Integer.valueOf(nativePictureOclSrProcess).toString());
                MethodCollector.m26664o(5039);
                return -1;
            }
            MethodCollector.m26664o(5039);
            return 0;
        }
    }

    public synchronized boolean InitPictureOclSr(String str, int i, int i2, int i3, int i4, int i5) {
        MethodCollector.m26663i(5016);
        if (i2 <= i3 && i4 <= i5 && i2 > 0) {
            if (i4 > 0) {
                if (!isLibLoaded) {
                    try {
                        m147893x8cd096b6("c++_shared");
                        m147893x8cd096b6("bytenn");
                    } catch (UnsatisfiedLinkError e) {
                        e.printStackTrace();
                    }
                    try {
                        m147893x8cd096b6("lens");
                        isLibLoaded = true;
                    } catch (UnsatisfiedLinkError e2) {
                        e2.printStackTrace();
                        MethodCollector.m26664o(5016);
                        return false;
                    }
                }
                this.maxHeight = i5;
                this.minHeight = i4;
                this.maxWidth = i3;
                this.minWidth = i2;
                if (str.isEmpty()) {
                    MethodCollector.m26664o(5016);
                    return false;
                }
                long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, i);
                this.mNativePtr = nativeInitPictureOclSr;
                if (nativeInitPictureOclSr == 0) {
                    MethodCollector.m26664o(5016);
                    return false;
                }
                MethodCollector.m26664o(5016);
                return true;
            }
        }
        MethodCollector.m26664o(5016);
        return false;
    }
}
