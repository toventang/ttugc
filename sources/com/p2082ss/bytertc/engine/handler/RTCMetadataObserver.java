package com.p2082ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.IMetadataObserver;
import com.p2082ss.bytertc.engine.engineimpl.RTCEngineImpl;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.bytertc.engine.handler.RTCMetadataObserver */
public class RTCMetadataObserver {
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;

    static {
        Covode.recordClassIndex(101062);
    }

    public RTCMetadataObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public byte[] onReadyToSendMetadata(long j) {
        IMetadataObserver metadataObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl == null || (metadataObserver = rTCEngineImpl.getMetadataObserver()) == null) {
            return null;
        }
        return metadataObserver.onReadyToSendMetadata(j);
    }

    /* access modifiers changed from: package-private */
    public void onMetadataReceived(byte[] bArr, String str, long j) {
        IMetadataObserver metadataObserver;
        RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
        if (rTCEngineImpl != null && (metadataObserver = rTCEngineImpl.getMetadataObserver()) != null) {
            metadataObserver.onMetadataReceived(bArr, str, j);
        }
    }
}
