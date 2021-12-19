package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.ttm.player.AudioProcessor */
public abstract class AudioProcessor extends NativeObject {
    static {
        Covode.recordClassIndex(101384);
    }

    public abstract void audioClose();

    public abstract void audioOpen(int i, int i2, int i3, int i4);

    public abstract void audioProcess(ByteBuffer[] byteBufferArr, int i, long j);

    public abstract void audioRelease(int i);
}
