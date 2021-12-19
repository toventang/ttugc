package com.p2082ss.avframework.livestreamv2.audioeffect;

import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.livestreamv2.ILiveStream;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioCatcher */
public class AudioCatcher {
    static {
        Covode.recordClassIndex(100100);
    }

    public static void CatchAudio(AudioDeviceModule audioDeviceModule, Handler handler, Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
    }

    public static void Stop(Handler handler) {
    }
}
