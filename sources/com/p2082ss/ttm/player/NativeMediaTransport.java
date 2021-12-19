package com.p2082ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttm.player.MediaTransport;

/* renamed from: com.ss.ttm.player.NativeMediaTransport */
public class NativeMediaTransport extends MediaTransport {
    static {
        Covode.recordClassIndex(101398);
    }

    private static boolean isNativeMediaTransport(MediaTransport mediaTransport) {
        return mediaTransport instanceof NativeMediaTransport;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.MediaTransport
    public void sendPacket(MediaTransport.MediaPacket mediaPacket) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
