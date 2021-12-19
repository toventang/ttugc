package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;

public class StackLeakChecker {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mCheckerEnabled;
    private static ArrayList<StackLeakItem> mLeakList = new ArrayList<>();
    private static int mLeakThreadThreshold = 10;
    private static ArrayList<StackLeakListener> mListeners = new ArrayList<>();
    private static long mStackCheckInterval = 60000000;

    public interface StackLeakListener {
        static {
            Covode.recordClassIndex(26589);
        }

        void onLeakReport(ArrayList<StackLeakItem> arrayList);
    }

    /* renamed from: com_bytedance_sysoptimizer_StackLeakChecker_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42846xd0cfed64(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean setEnable(boolean z, int i, int i2, long j, String[] strArr);

    private StackLeakChecker() {
    }

    public static synchronized void disableChecker() {
        synchronized (StackLeakChecker.class) {
            MethodCollector.m26663i(7494);
            if (mCheckerEnabled) {
                setEnable(false, 0, 0, 0, null);
            }
            MethodCollector.m26664o(7494);
        }
    }

    private static void reportLeak() {
        Iterator<StackLeakListener> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().onLeakReport(mLeakList);
        }
        mLeakList.clear();
    }

    static {
        Covode.recordClassIndex(26588);
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void registerStackLeakListener(StackLeakListener stackLeakListener) {
        synchronized (StackLeakChecker.class) {
            MethodCollector.m26663i(7492);
            if (stackLeakListener != null) {
                mListeners.add(stackLeakListener);
            }
            MethodCollector.m26664o(7492);
        }
    }

    public static synchronized boolean enableChecker(Context context, String[] strArr) {
        synchronized (StackLeakChecker.class) {
            MethodCollector.m26663i(7493);
            if (mCheckerEnabled) {
                MethodCollector.m26664o(7493);
                return true;
            } else if (loadOptimizerOnNeed(context)) {
                try {
                    boolean enable = setEnable(true, Build.VERSION.SDK_INT, mLeakThreadThreshold, mStackCheckInterval, strArr);
                    mCheckerEnabled = enable;
                    MethodCollector.m26664o(7493);
                    return enable;
                } catch (UnsatisfiedLinkError e) {
                    m42846xd0cfed64(TAG, "UnsatisfiedLinkError", e);
                    MethodCollector.m26664o(7493);
                    return false;
                }
            } else {
                MethodCollector.m26664o(7493);
                return false;
            }
        }
    }

    public static synchronized void setInterval(int i, long j) {
        long j2;
        int i2 = i;
        synchronized (StackLeakChecker.class) {
            MethodCollector.m26663i(7495);
            if (i2 <= 0) {
                i2 = 10;
            }
            mLeakThreadThreshold = i2;
            if (j > 10000000) {
                j2 = (j / 10000000) * 10000000;
            } else {
                j2 = 10000000;
            }
            mStackCheckInterval = j2;
            if (mCheckerEnabled) {
                setEnable(true, 0, i2, j2, null);
            }
            MethodCollector.m26664o(7495);
        }
    }

    private static void addLeakItem(int i, long j, long j2, long j3, String str, String str2) {
        mLeakList.add(new StackLeakItem(i, j, j2, j3, str, str2));
    }
}
