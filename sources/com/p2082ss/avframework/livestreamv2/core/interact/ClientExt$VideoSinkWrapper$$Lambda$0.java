package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.ClientExt;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$VideoSinkWrapper$$Lambda$0 */
final /* synthetic */ class ClientExt$VideoSinkWrapper$$Lambda$0 implements Runnable {
    private final ClientExt.VideoSinkWrapper arg$1;
    private final int arg$2;
    private final int arg$3;

    static {
        Covode.recordClassIndex(100318);
    }

    ClientExt$VideoSinkWrapper$$Lambda$0(ClientExt.VideoSinkWrapper videoSinkWrapper, int i, int i2) {
        this.arg$1 = videoSinkWrapper;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.mo133776x33397ccb(this.arg$2, this.arg$3);
    }
}
