package com.p2082ss.avframework.transport;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.Transport;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.transport.MP4Transport */
public class MP4Transport extends NativeTransport {
    static {
        Covode.recordClassIndex(100711);
    }

    private native void nativeCreateNative(boolean z, boolean z2);

    /* access modifiers changed from: protected */
    public native void nativeStartRecord();

    /* access modifiers changed from: protected */
    public native void nativeStopRecord();

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.NativeObject
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }

    public MP4Transport(boolean z, boolean z2) {
        MethodCollector.m26663i(1270);
        nativeCreateNative(z, z2);
        MethodCollector.m26664o(1270);
    }
}
