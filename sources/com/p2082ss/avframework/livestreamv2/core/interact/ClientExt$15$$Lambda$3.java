package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.ClientExt;
import com.p2082ss.bytertc.engine.data.RemoteStreamKey;
import com.p2082ss.bytertc.engine.data.VideoFrameInfo;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$15$$Lambda$3 */
final /* synthetic */ class ClientExt$15$$Lambda$3 implements Runnable {
    private final ClientExt.C8582615 arg$1;
    private final RemoteStreamKey arg$2;
    private final VideoFrameInfo arg$3;

    static {
        Covode.recordClassIndex(100297);
    }

    ClientExt$15$$Lambda$3(ClientExt.C8582615 r1, RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        this.arg$1 = r1;
        this.arg$2 = remoteStreamKey;
        this.arg$3 = videoFrameInfo;
    }

    public final void run() {
        this.arg$1.lambda$onFirstRemoteVideoFrameRendered$3$ClientExt$15(this.arg$2, this.arg$3);
    }
}
