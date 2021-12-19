package com.p2082ss.avframework.mixer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.mixer.NativeMixer */
public abstract class NativeMixer extends Mixer {
    static {
        Covode.recordClassIndex(100643);
    }

    private native float nativeAvgCostTimePerFrameMs(long j);

    private native boolean nativeGetParameter(TEBundle tEBundle);

    private native boolean nativeSetParameter(TEBundle tEBundle);

    @Override // com.p2082ss.avframework.mixer.Mixer
    public boolean isNativeMixer() {
        return true;
    }

    public float getAvgCostTimePerFrameMs() {
        return nativeAvgCostTimePerFrameMs(this.mNativeObj);
    }

    @Override // com.p2082ss.avframework.mixer.Mixer
    public boolean getParameter(TEBundle tEBundle) {
        if (tEBundle != null) {
            return nativeGetParameter(tEBundle);
        }
        return false;
    }

    @Override // com.p2082ss.avframework.mixer.Mixer
    public boolean setParameter(TEBundle tEBundle) {
        if (tEBundle != null) {
            return nativeSetParameter(tEBundle);
        }
        return false;
    }
}
