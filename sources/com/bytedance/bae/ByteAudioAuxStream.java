package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ByteAudioAuxStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioAuxSinkProxy sinkProxy;
    public int stream_id;

    static {
        Covode.recordClassIndex(14974);
    }

    public void clearInputStreamNameForMix() {
        MethodCollector.m26663i(1098);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeClearInputStreamNameForMix(j);
        }
        MethodCollector.m26664o(1098);
    }

    public long getID() {
        MethodCollector.m26663i(1014);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long nativeAuxStreamGetId = ByteAudioNativeFunctions.nativeAuxStreamGetId(j);
            MethodCollector.m26664o(1014);
            return nativeAuxStreamGetId;
        }
        MethodCollector.m26664o(1014);
        return -1;
    }

    public String getName() {
        MethodCollector.m26663i(1010);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            String nativeAuxStreamGetName = ByteAudioNativeFunctions.nativeAuxStreamGetName(j);
            MethodCollector.m26664o(1010);
            return nativeAuxStreamGetName;
        }
        MethodCollector.m26664o(1010);
        return null;
    }

    public int pauseStream() {
        MethodCollector.m26663i(929);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeAuxStreamPause = ByteAudioNativeFunctions.nativeAuxStreamPause(j);
            MethodCollector.m26664o(929);
            return nativeAuxStreamPause;
        }
        MethodCollector.m26664o(929);
        return -1;
    }

    public void releaseStream() {
        MethodCollector.m26663i(797);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long j2 = this.nativeEnginePtr;
            if (j2 != 0) {
                ByteAudioNativeFunctions.nativeDestroyAuxStream(j2, j);
                this.nativeStreamPtr = 0;
            }
        }
        MethodCollector.m26664o(797);
    }

    public int resumeStream() {
        MethodCollector.m26663i(930);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeAuxStreamResume = ByteAudioNativeFunctions.nativeAuxStreamResume(j);
            MethodCollector.m26664o(930);
            return nativeAuxStreamResume;
        }
        MethodCollector.m26664o(930);
        return -1;
    }

    public int startStream() {
        MethodCollector.m26663i(883);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeAuxStreamStart = ByteAudioNativeFunctions.nativeAuxStreamStart(j);
            MethodCollector.m26664o(883);
            return nativeAuxStreamStart;
        }
        MethodCollector.m26664o(883);
        return -1;
    }

    public int stopStream() {
        MethodCollector.m26663i(912);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeAuxStreamStop = ByteAudioNativeFunctions.nativeAuxStreamStop(j);
            MethodCollector.m26664o(912);
            return nativeAuxStreamStop;
        }
        MethodCollector.m26664o(912);
        return -1;
    }

    public void addInputStreamNameForMix(String str) {
        MethodCollector.m26663i(1017);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeAddInputStreamNameForMix(j, str);
        }
        MethodCollector.m26664o(1017);
    }

    public ByteAudioStreamOption auxStreamGetValue(int i) {
        MethodCollector.m26663i(999);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioStreamOption nativeAuxStreamGetValue = ByteAudioNativeFunctions.nativeAuxStreamGetValue(j, i);
            MethodCollector.m26664o(999);
            return nativeAuxStreamGetValue;
        }
        MethodCollector.m26664o(999);
        return null;
    }

    public int setGain(int i) {
        MethodCollector.m26663i(976);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            this.gain = i;
            int nativeAuxStreamSetGain = ByteAudioNativeFunctions.nativeAuxStreamSetGain(j, i);
            MethodCollector.m26664o(976);
            return nativeAuxStreamSetGain;
        }
        MethodCollector.m26664o(976);
        return -1;
    }

    public void setPath(String str) {
        MethodCollector.m26663i(1007);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeAuxStreamSetPath(j, str);
        }
        MethodCollector.m26664o(1007);
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioAuxSink byteAudioAuxSink) {
        MethodCollector.m26663i(1002);
        ByteAudioAuxSinkProxy byteAudioAuxSinkProxy = new ByteAudioAuxSinkProxy(byteAudioAuxSink, this);
        this.sinkProxy = byteAudioAuxSinkProxy;
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeAuxStreamSetSink(j, byteAudioAuxSinkProxy);
        }
        MethodCollector.m26664o(1002);
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        MethodCollector.m26663i(992);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeAuxStreamSetFormat = ByteAudioNativeFunctions.nativeAuxStreamSetFormat(j, byteAudioStreamFormat);
            MethodCollector.m26664o(992);
            return nativeAuxStreamSetFormat;
        }
        MethodCollector.m26664o(992);
        return -1;
    }

    public ByteAudioAuxStream(long j, String str) {
        MethodCollector.m26663i(792);
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateAuxStream(j, str);
        }
        MethodCollector.m26664o(792);
    }

    public int auxStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        MethodCollector.m26663i(997);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeAuxStreamSetValue = ByteAudioNativeFunctions.nativeAuxStreamSetValue(j, i, byteAudioStreamOption);
            MethodCollector.m26664o(997);
            return nativeAuxStreamSetValue;
        }
        MethodCollector.m26664o(997);
        return -1;
    }
}
