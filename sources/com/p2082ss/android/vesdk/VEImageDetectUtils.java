package com.p2082ss.android.vesdk;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.model.EnigmaResult;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.vesdk.runtime.VEEffectConfig;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.vesdk.VEImageDetectUtils */
public class VEImageDetectUtils {
    public static final String TAG = VEImageDetectUtils.class.getSimpleName();
    private IDetectImageEnigmaResultListener mDetectEnigmaResultListener;
    private IDetectImageResultListener mDetectResultListener;
    private IDetectImageResultWithNumListener mDetectResultWithNumListener;
    private boolean mInterruptDetectImageContent = true;
    private long mNativeHandler;

    /* renamed from: com.ss.android.vesdk.VEImageDetectUtils$IDetectImageEnigmaResultListener */
    public interface IDetectImageEnigmaResultListener {
        static {
            Covode.recordClassIndex(99293);
        }

        void onDetectResult(EnigmaResult enigmaResult);
    }

    /* renamed from: com.ss.android.vesdk.VEImageDetectUtils$IDetectImageResultListener */
    public interface IDetectImageResultListener {
        static {
            Covode.recordClassIndex(99294);
        }

        void onDetectResult(String str, String str2, String str3, boolean z);
    }

    /* renamed from: com.ss.android.vesdk.VEImageDetectUtils$IDetectImageResultWithNumListener */
    public interface IDetectImageResultWithNumListener {
        static {
            Covode.recordClassIndex(99295);
        }

        void onDetectResult(String str, String str2, String str3, int i);
    }

    private native int nativeDestroy(long j);

    private native int nativeDetectImageContent(long j, String str, String str2, String[] strArr, int i, int i2);

    private native int nativeDetectImageEnigma(long j, String str, int i, int i2);

    private native long nativeInit(int i, int i2, String str, String str2, boolean z, String str3);

    static {
        Covode.recordClassIndex(99292);
        C30731d.m63114a();
    }

    public synchronized void stopDetectImagesContentIfNeed() {
        MethodCollector.m26663i(4228);
        this.mInterruptDetectImageContent = true;
        MethodCollector.m26664o(4228);
    }

    public int destroy() {
        MethodCollector.m26663i(4170);
        long j = this.mNativeHandler;
        if (j == 0) {
            C85315al.m146641c(TAG, "invoke destroy() encounter handler == 0. Consider destroy() has been called already?");
            MethodCollector.m26664o(4170);
            return -1;
        }
        int nativeDestroy = nativeDestroy(j);
        if (nativeDestroy == 0) {
            this.mNativeHandler = 0;
            C85315al.m146637a(TAG, "NativeHandler destroy succeed.");
        }
        this.mDetectResultListener = null;
        MethodCollector.m26664o(4170);
        return nativeDestroy;
    }

    public int init() {
        MethodCollector.m26663i(4166);
        long nativeInit = nativeInit(0, 0, VERuntime.EnumC85549a.INSTANCE.f191667b.f191645d.mo131522a(), Build.DEVICE, false, VEEffectConfig.getCacheDir());
        if (nativeInit == 0) {
            MethodCollector.m26664o(4166);
            return -1;
        }
        this.mNativeHandler = nativeInit;
        MethodCollector.m26664o(4166);
        return 0;
    }

    public void setDetectImageContentListener(IDetectImageResultListener iDetectImageResultListener) {
        this.mDetectResultListener = iDetectImageResultListener;
    }

    public void setDetectImageContentWithNumListener(IDetectImageResultWithNumListener iDetectImageResultWithNumListener) {
        this.mDetectResultWithNumListener = iDetectImageResultWithNumListener;
    }

    public void setDetectImageEnigmaListener(IDetectImageEnigmaResultListener iDetectImageEnigmaResultListener) {
        this.mDetectEnigmaResultListener = iDetectImageEnigmaResultListener;
    }

    public void onNativeCallback_onDetectImageEnigma(EnigmaResult enigmaResult) {
        IDetectImageEnigmaResultListener iDetectImageEnigmaResultListener = this.mDetectEnigmaResultListener;
        if (iDetectImageEnigmaResultListener == null) {
            C85315al.m146641c(TAG, "Native callback onDetectImageEnigma encounter no listener handle?");
        } else {
            iDetectImageEnigmaResultListener.onDetectResult(enigmaResult);
        }
    }

    public int detectImageEnigma(String str, int i, int i2) {
        MethodCollector.m26663i(4227);
        if (str.startsWith("content") || new File(str).exists()) {
            C85315al.m146637a(TAG, "detectImageEnigma..., imagePath=" + str + ", maxWidth=" + i + ", maxHeight=" + i);
            int nativeDetectImageEnigma = nativeDetectImageEnigma(this.mNativeHandler, str, i, i2);
            MethodCollector.m26664o(4227);
            return nativeDetectImageEnigma;
        }
        C85315al.m146642d(TAG, "Illegal argument. file: \"" + str + "\" is not exist.");
        MethodCollector.m26664o(4227);
        return -100;
    }

    public void detectImagesContent(String str, List<String> list, List<String> list2) {
        int i;
        MethodCollector.m26663i(4223);
        synchronized (this) {
            try {
                this.mInterruptDetectImageContent = false;
            } finally {
                MethodCollector.m26664o(4223);
            }
        }
        if (list2.isEmpty()) {
            C85315al.m146641c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            MethodCollector.m26664o(4223);
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i = 0; i < size && !this.mInterruptDetectImageContent; i++) {
            String str2 = list.get(i);
            if (str2.startsWith("content") || new File(str2).exists()) {
                nativeDetectImageContent(this.mNativeHandler, str, list.get(i), strArr, -1, -1);
            } else {
                C85315al.m146642d(TAG, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            }
        }
    }

    public void onNativeCallback_onDetectImageContent(String str, String str2, String str3, boolean z, int i) {
        IDetectImageResultListener iDetectImageResultListener = this.mDetectResultListener;
        if (iDetectImageResultListener != null) {
            iDetectImageResultListener.onDetectResult(str, str2, str3, z);
        } else if (this.mDetectResultWithNumListener == null) {
            C85315al.m146641c(TAG, "Native callback onDetectImageContent encounter no listener handle?");
            return;
        }
        IDetectImageResultWithNumListener iDetectImageResultWithNumListener = this.mDetectResultWithNumListener;
        if (iDetectImageResultWithNumListener != null) {
            iDetectImageResultWithNumListener.onDetectResult(str, str2, str3, i);
        }
    }

    public int detectImageContent(String str, String str2, List<String> list, int i, int i2) {
        MethodCollector.m26663i(4197);
        if (!str2.startsWith("content") && !new File(str2).exists()) {
            C85315al.m146642d(TAG, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            MethodCollector.m26664o(4197);
            return -100;
        } else if (list.isEmpty()) {
            C85315al.m146641c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            MethodCollector.m26664o(4197);
            return -100;
        } else {
            C85315al.m146641c(TAG, "detectImageContent... stickerId:" + str + ", imagePath=" + str2 + ", maxWidth=" + i + ", maxHeight=" + i);
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            int nativeDetectImageContent = nativeDetectImageContent(this.mNativeHandler, str, str2, strArr, i, i2);
            MethodCollector.m26664o(4197);
            return nativeDetectImageContent;
        }
    }

    public void detectImagesContentWithSize(String str, List<String> list, List<String> list2, int i, int i2) {
        MethodCollector.m26663i(4211);
        synchronized (this) {
            try {
                this.mInterruptDetectImageContent = false;
            } finally {
                MethodCollector.m26664o(4211);
            }
        }
        if (list2.isEmpty()) {
            C85315al.m146641c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            MethodCollector.m26664o(4211);
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (int i3 = 0; i3 < size && !this.mInterruptDetectImageContent; i3++) {
            String str2 = list.get(i3);
            if (str2.startsWith("content") || new File(str2).exists()) {
                nativeDetectImageContent(this.mNativeHandler, str, list.get(i3), strArr, i, i2);
            } else {
                C85315al.m146642d(TAG, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            }
        }
    }
}
