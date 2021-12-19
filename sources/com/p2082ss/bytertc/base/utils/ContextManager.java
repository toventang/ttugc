package com.p2082ss.bytertc.base.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.bytertc.base.utils.ContextManager */
public class ContextManager {
    private WeakReference<Context> mContextWeakReference;

    static {
        Covode.recordClassIndex(100857);
    }

    /* renamed from: com.ss.bytertc.base.utils.ContextManager$SingletonHelper */
    static class SingletonHelper {
        public static final ContextManager INSTANCE = new ContextManager();

        private SingletonHelper() {
        }

        static {
            Covode.recordClassIndex(100858);
        }
    }

    public static ContextManager instance() {
        return SingletonHelper.INSTANCE;
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.mContextWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.mContextWeakReference.get();
    }

    public void setContext(Context context) {
        if (this.mContextWeakReference != null) {
            this.mContextWeakReference = null;
        }
        this.mContextWeakReference = new WeakReference<>(context);
    }
}
