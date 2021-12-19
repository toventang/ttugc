package com.p2082ss.avframework.transport;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.Transport;
import com.p2082ss.avframework.statics.StaticsReport;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.transport.RTMPTransport */
public class RTMPTransport extends NativeTransport {
    static {
        Covode.recordClassIndex(100713);
    }

    private native void nativeCreateNative(boolean z, boolean z2);

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native void nativeReleaseNative();

    private native boolean nativeSetupUrl(String str);

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

    @Override // com.p2082ss.avframework.statics.StaticsReport.StaticReportInterface, com.p2082ss.avframework.engine.Transport
    public boolean getStaticsReport(StaticsReport staticsReport) {
        MethodCollector.m26663i(2698);
        super.getStaticsReport(staticsReport);
        boolean nativeGetStaticsReport = nativeGetStaticsReport(staticsReport);
        MethodCollector.m26664o(2698);
        return nativeGetStaticsReport;
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public boolean setupUrl(String str) {
        boolean z;
        MethodCollector.m26663i(2558);
        if (str != null) {
            z = nativeSetupUrl(str);
        } else {
            z = false;
        }
        MethodCollector.m26664o(2558);
        return z;
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }

    public RTMPTransport(boolean z, boolean z2) {
        MethodCollector.m26663i(2513);
        nativeCreateNative(z, z2);
        MethodCollector.m26664o(2513);
    }
}
