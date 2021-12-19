package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;

public class ByteAudioOutputStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioOutputSinkProxy sinkProxy;
    public int stream_id;

    static {
        Covode.recordClassIndex(14985);
    }

    public long getID() {
        MethodCollector.m26663i(716);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long nativeOutputStreamGetId = ByteAudioNativeFunctions.nativeOutputStreamGetId(j);
            MethodCollector.m26664o(716);
            return nativeOutputStreamGetId;
        }
        MethodCollector.m26664o(716);
        return -1;
    }

    public String getName() {
        MethodCollector.m26663i(712);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            String nativeOutputStreamGetName = ByteAudioNativeFunctions.nativeOutputStreamGetName(j);
            MethodCollector.m26664o(712);
            return nativeOutputStreamGetName;
        }
        MethodCollector.m26664o(712);
        return null;
    }

    public LinkedHashMap getStatsReport() {
        MethodCollector.m26663i(707);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            LinkedHashMap nativeOutputStreamGetStatsReport = ByteAudioNativeFunctions.nativeOutputStreamGetStatsReport(j);
            MethodCollector.m26664o(707);
            return nativeOutputStreamGetStatsReport;
        }
        MethodCollector.m26664o(707);
        return null;
    }

    public void releaseStream() {
        MethodCollector.m26663i(589);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long j2 = this.nativeEnginePtr;
            if (j2 != 0) {
                ByteAudioNativeFunctions.nativeDestroyOutputStream(j2, j);
                this.nativeStreamPtr = 0;
            }
        }
        MethodCollector.m26664o(589);
    }

    public int startStream() {
        MethodCollector.m26663i(594);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeOutputStreamStart = ByteAudioNativeFunctions.nativeOutputStreamStart(j);
            MethodCollector.m26664o(594);
            return nativeOutputStreamStart;
        }
        MethodCollector.m26664o(594);
        return -1;
    }

    public int stopStream() {
        MethodCollector.m26663i(596);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeOutputStreamStop = ByteAudioNativeFunctions.nativeOutputStreamStop(j);
            MethodCollector.m26664o(596);
            return nativeOutputStreamStop;
        }
        MethodCollector.m26664o(596);
        return -1;
    }

    public ByteAudioStreamOption outputStreamGetValue(int i) {
        MethodCollector.m26663i(702);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioStreamOption nativeOutputStreamGetValue = ByteAudioNativeFunctions.nativeOutputStreamGetValue(j, i);
            MethodCollector.m26664o(702);
            return nativeOutputStreamGetValue;
        }
        MethodCollector.m26664o(702);
        return null;
    }

    public int setGain(int i) {
        MethodCollector.m26663i(600);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            this.gain = i;
            int nativeOutputStreamSetGain = ByteAudioNativeFunctions.nativeOutputStreamSetGain(j, i);
            MethodCollector.m26664o(600);
            return nativeOutputStreamSetGain;
        }
        MethodCollector.m26664o(600);
        return -1;
    }

    public int setMute(boolean z) {
        MethodCollector.m26663i(720);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeOutputStreamSetMute = ByteAudioNativeFunctions.nativeOutputStreamSetMute(j, z);
            MethodCollector.m26664o(720);
            return nativeOutputStreamSetMute;
        }
        MethodCollector.m26664o(720);
        return -1;
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioOutputSink byteAudioOutputSink) {
        MethodCollector.m26663i(704);
        ByteAudioOutputSinkProxy byteAudioOutputSinkProxy = new ByteAudioOutputSinkProxy(byteAudioOutputSink, this);
        this.sinkProxy = byteAudioOutputSinkProxy;
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeOutputStreamSetSink(j, byteAudioOutputSinkProxy);
        }
        MethodCollector.m26664o(704);
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        MethodCollector.m26663i(682);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeOutputStreamSetFormat = ByteAudioNativeFunctions.nativeOutputStreamSetFormat(j, byteAudioStreamFormat);
            MethodCollector.m26664o(682);
            return nativeOutputStreamSetFormat;
        }
        MethodCollector.m26664o(682);
        return -1;
    }

    public ByteAudioOutputStream(long j, String str) {
        MethodCollector.m26663i(575);
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateOutputStream(j, str);
        }
        MethodCollector.m26664o(575);
    }

    public int outputStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        MethodCollector.m26663i(699);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeOutputStreamSetValue = ByteAudioNativeFunctions.nativeOutputStreamSetValue(j, i, byteAudioStreamOption);
            MethodCollector.m26664o(699);
            return nativeOutputStreamSetValue;
        }
        MethodCollector.m26664o(699);
        return -1;
    }

    public int setGain(int i, int i2) {
        MethodCollector.m26663i(676);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            this.gain = i;
            int nativeOutputStreamSetGainWithFade = ByteAudioNativeFunctions.nativeOutputStreamSetGainWithFade(j, i, i2);
            MethodCollector.m26664o(676);
            return nativeOutputStreamSetGainWithFade;
        }
        MethodCollector.m26664o(676);
        return -1;
    }
}
