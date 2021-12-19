package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.engine.AudioProcessor */
public abstract class AudioProcessor extends NativeObject {
    static {
        Covode.recordClassIndex(99962);
    }

    /* access modifiers changed from: protected */
    public abstract Buffer process(Buffer buffer, int i, int i2, int i3, long j);
}
