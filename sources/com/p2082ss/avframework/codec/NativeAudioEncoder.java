package com.p2082ss.avframework.codec;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioEncoder;
import com.p2082ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.codec.NativeAudioEncoder */
public class NativeAudioEncoder extends AudioEncoder {
    static {
        Covode.recordClassIndex(99917);
    }

    private static boolean isNativeAudioEncoderInstance(Object obj) {
        return obj instanceof NativeAudioEncoder;
    }

    private NativeAudioEncoder(long j) {
        this.mNativeObj = j;
    }

    @Override // com.p2082ss.avframework.engine.AudioEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.p2082ss.avframework.engine.AudioEncoder
    public int Encode(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Native direct mode");
    }
}
