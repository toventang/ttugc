package com.p2082ss.avframework.engine;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.engine.SITICalculator */
public class SITICalculator extends NativeObject {
    private int mCurCplxCategory = -1;
    public ISITIEventObserver mISITIEventObserver;
    private final Handler mWorkHandler;

    /* renamed from: com.ss.avframework.engine.SITICalculator$ISITIEventObserver */
    public interface ISITIEventObserver {
        static {
            Covode.recordClassIndex(99979);
        }

        void onBitrateChanged(int i, String str);
    }

    static {
        Covode.recordClassIndex(99976);
    }

    private native void nativeCreate(int i, int i2, int i3);

    private native String nativeGetPerformance();

    private native void nativeSetParameters(TEBundle tEBundle);

    public int getCurPlxCategory() {
        return this.mCurCplxCategory;
    }

    public String GetPerformance() {
        MethodCollector.m26663i(1557);
        String nativeGetPerformance = nativeGetPerformance();
        MethodCollector.m26664o(1557);
        return nativeGetPerformance;
    }

    public boolean isValid() {
        if (this.mNativeObj != 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(1565);
        this.mWorkHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.SITICalculator.RunnableC856942 */

            static {
                Covode.recordClassIndex(99978);
            }

            public void run() {
                SITICalculator.super.release();
            }
        });
        MethodCollector.m26664o(1565);
    }

    public void setSITIEventObserver(ISITIEventObserver iSITIEventObserver) {
        this.mISITIEventObserver = iSITIEventObserver;
    }

    public void setParameters(TEBundle tEBundle) {
        MethodCollector.m26663i(1553);
        nativeSetParameters(tEBundle);
        MethodCollector.m26664o(1553);
    }

    public void onStrategyCalculated(final int i, final String str) {
        this.mCurCplxCategory = i;
        this.mWorkHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.engine.SITICalculator.RunnableC856931 */

            static {
                Covode.recordClassIndex(99977);
            }

            public void run() {
                if (SITICalculator.this.mISITIEventObserver != null) {
                    SITICalculator.this.mISITIEventObserver.onBitrateChanged(i, str);
                }
            }
        });
    }

    public SITICalculator(Handler handler, int i, int i2) {
        MethodCollector.m26663i(1420);
        nativeCreate(1, i, i2);
        this.mWorkHandler = handler;
        MethodCollector.m26664o(1420);
    }
}
