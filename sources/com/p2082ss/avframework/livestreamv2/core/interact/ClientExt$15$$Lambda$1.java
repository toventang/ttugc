package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.ClientExt;
import com.p2082ss.bytertc.engine.UserInfo;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$15$$Lambda$1 */
final /* synthetic */ class ClientExt$15$$Lambda$1 implements Runnable {
    private final ClientExt.C8582615 arg$1;
    private final UserInfo arg$2;

    static {
        Covode.recordClassIndex(100295);
    }

    ClientExt$15$$Lambda$1(ClientExt.C8582615 r1, UserInfo userInfo) {
        this.arg$1 = r1;
        this.arg$2 = userInfo;
    }

    public final void run() {
        this.arg$1.lambda$onUserJoined$1$ClientExt$15(this.arg$2);
    }
}
