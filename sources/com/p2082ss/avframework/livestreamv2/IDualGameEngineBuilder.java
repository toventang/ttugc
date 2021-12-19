package com.p2082ss.avframework.livestreamv2;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.livestreamv2.IDualGameEngine;
import com.p2082ss.avframework.livestreamv2.core.ILayerControlExt;

/* renamed from: com.ss.avframework.livestreamv2.IDualGameEngineBuilder */
public interface IDualGameEngineBuilder {
    static {
        Covode.recordClassIndex(100009);
    }

    IDualGameEngine create();

    IDualGameEngineBuilder setAdm(AudioDeviceModule audioDeviceModule);

    IDualGameEngineBuilder setBuilder(LiveStreamBuilder liveStreamBuilder);

    IDualGameEngineBuilder setHandler(Handler handler);

    IDualGameEngineBuilder setInputAudioStream(IInputAudioStream iInputAudioStream);

    IDualGameEngineBuilder setLayerControl(ILayerControlExt iLayerControlExt);

    IDualGameEngineBuilder setMediaEngineFactory(MediaEngineFactory mediaEngineFactory);

    IDualGameEngineBuilder setOnDualGameStatusChange(IDualGameEngine.IDualGameNotifierToLiveCore iDualGameNotifierToLiveCore);
}
