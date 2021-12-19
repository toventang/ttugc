package com.p2082ss.avframework.livestreamv2.capture;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$RadioModeWrapper$$Lambda$0 */
public final /* synthetic */ class LiveStreamVideoCapture$RadioModeWrapper$$Lambda$0 implements Runnable {
    private final LiveStreamVideoCapture.RadioModeWrapper arg$1;

    static {
        Covode.recordClassIndex(100170);
    }

    LiveStreamVideoCapture$RadioModeWrapper$$Lambda$0(LiveStreamVideoCapture.RadioModeWrapper radioModeWrapper) {
        this.arg$1 = radioModeWrapper;
    }

    public final void run() {
        this.arg$1.lambda$new$0$LiveStreamVideoCapture$RadioModeWrapper();
    }
}
