package com.p2082ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.SafeVerityCallbackManager */
public class SafeVerityCallbackManager {
    private static final Object LOCK = new Object();
    private static volatile SafeVerityCallbackManager sInstance;
    private SafeVerityCallback mCallback;

    private SafeVerityCallbackManager() {
    }

    static {
        Covode.recordClassIndex(79892);
    }

    public static SafeVerityCallbackManager getInstance() {
        MethodCollector.m26663i(12097);
        if (sInstance == null) {
            synchronized (SafeVerityCallbackManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SafeVerityCallbackManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12097);
                    throw th;
                }
            }
        }
        SafeVerityCallbackManager safeVerityCallbackManager = sInstance;
        MethodCollector.m26664o(12097);
        return safeVerityCallbackManager;
    }

    public void notifyResult(SafeVerityResponse safeVerityResponse) {
        MethodCollector.m26663i(12242);
        synchronized (LOCK) {
            try {
                SafeVerityCallback safeVerityCallback = this.mCallback;
                if (safeVerityCallback != null) {
                    safeVerityCallback.onComplete(safeVerityResponse);
                    this.mCallback = null;
                }
            } finally {
                MethodCollector.m26664o(12242);
            }
        }
    }

    public void register(SafeVerityCallback safeVerityCallback) {
        MethodCollector.m26663i(12241);
        if (safeVerityCallback == null) {
            MethodCollector.m26664o(12241);
            return;
        }
        synchronized (LOCK) {
            try {
                this.mCallback = safeVerityCallback;
            } finally {
                MethodCollector.m26664o(12241);
            }
        }
    }
}
