package com.p2082ss.avframework.transport;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.Transport;
import java.nio.Buffer;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.avframework.transport.NativeTransport */
public class NativeTransport extends Transport {
    static {
        Covode.recordClassIndex(100712);
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(2516);
        super.release();
        MethodCollector.m26664o(2516);
    }

    private static boolean isNativeTransportInstence(Object obj) {
        return obj instanceof NativeTransport;
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public void sendPacket(Buffer buffer, int i) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
