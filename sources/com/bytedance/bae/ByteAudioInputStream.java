package com.bytedance.bae;

import com.bytedance.bae.ByteAudioSinkInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;

public class ByteAudioInputStream {
    public int gain;
    public boolean mute;
    public long nativeEnginePtr;
    public long nativeStreamPtr;
    public ByteAudioInputSinkProxy sinkProxy;
    public int stream_id;

    static {
        Covode.recordClassIndex(14982);
    }

    public long getID() {
        MethodCollector.m26663i(2439);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long nativeInputStreamGetId = ByteAudioNativeFunctions.nativeInputStreamGetId(j);
            MethodCollector.m26664o(2439);
            return nativeInputStreamGetId;
        }
        MethodCollector.m26664o(2439);
        return -1;
    }

    public String getName() {
        MethodCollector.m26663i(2417);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            String nativeInputStreamGetName = ByteAudioNativeFunctions.nativeInputStreamGetName(j);
            MethodCollector.m26664o(2417);
            return nativeInputStreamGetName;
        }
        MethodCollector.m26664o(2417);
        return null;
    }

    public LinkedHashMap getStatsReport() {
        MethodCollector.m26663i(2414);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            LinkedHashMap nativeInputStreamGetStatsReport = ByteAudioNativeFunctions.nativeInputStreamGetStatsReport(j);
            MethodCollector.m26664o(2414);
            return nativeInputStreamGetStatsReport;
        }
        MethodCollector.m26664o(2414);
        return null;
    }

    public void releaseStream() {
        MethodCollector.m26663i(1950);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            long j2 = this.nativeEnginePtr;
            if (j2 != 0) {
                ByteAudioNativeFunctions.nativeDestroyInputStream(j2, j);
                this.nativeStreamPtr = 0;
            }
        }
        MethodCollector.m26664o(1950);
    }

    public int startStream() {
        MethodCollector.m26663i(1958);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeInputStreamStart = ByteAudioNativeFunctions.nativeInputStreamStart(j);
            MethodCollector.m26664o(1958);
            return nativeInputStreamStart;
        }
        MethodCollector.m26664o(1958);
        return -1;
    }

    public int stopStream() {
        MethodCollector.m26663i(1961);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeInputStreamStop = ByteAudioNativeFunctions.nativeInputStreamStop(j);
            MethodCollector.m26664o(1961);
            return nativeInputStreamStop;
        }
        MethodCollector.m26664o(1961);
        return -1;
    }

    public ByteAudioStreamOption inputStreamGetValue(int i) {
        MethodCollector.m26663i(2074);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioStreamOption nativeInputStreamGetValue = ByteAudioNativeFunctions.nativeInputStreamGetValue(j, i);
            MethodCollector.m26664o(2074);
            return nativeInputStreamGetValue;
        }
        MethodCollector.m26664o(2074);
        return null;
    }

    public int setGain(int i) {
        MethodCollector.m26663i(1965);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            this.gain = i;
            int nativeInputStreamSetGain = ByteAudioNativeFunctions.nativeInputStreamSetGain(j, i);
            MethodCollector.m26664o(1965);
            return nativeInputStreamSetGain;
        }
        MethodCollector.m26664o(1965);
        return -1;
    }

    public int setMute(boolean z) {
        MethodCollector.m26663i(2448);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeInputStreamSetMute = ByteAudioNativeFunctions.nativeInputStreamSetMute(j, z);
            MethodCollector.m26664o(2448);
            return nativeInputStreamSetMute;
        }
        MethodCollector.m26664o(2448);
        return -1;
    }

    public void setSink(ByteAudioSinkInterface.ByteAudioInputSink byteAudioInputSink) {
        MethodCollector.m26663i(2081);
        ByteAudioInputSinkProxy byteAudioInputSinkProxy = new ByteAudioInputSinkProxy(byteAudioInputSink, this);
        this.sinkProxy = byteAudioInputSinkProxy;
        long j = this.nativeStreamPtr;
        if (j != 0) {
            ByteAudioNativeFunctions.nativeInputStreamSetSink(j, byteAudioInputSinkProxy);
            MethodCollector.m26664o(2081);
            return;
        }
        MethodCollector.m26664o(2081);
    }

    public int setStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        MethodCollector.m26663i(1971);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeInputStreamSetFormat = ByteAudioNativeFunctions.nativeInputStreamSetFormat(j, byteAudioStreamFormat);
            MethodCollector.m26664o(1971);
            return nativeInputStreamSetFormat;
        }
        MethodCollector.m26664o(1971);
        return -1;
    }

    public int updateStreamFormat(ByteAudioStreamFormat byteAudioStreamFormat) {
        MethodCollector.m26663i(2068);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeInputStreamUpdateFormat = ByteAudioNativeFunctions.nativeInputStreamUpdateFormat(j, byteAudioStreamFormat);
            MethodCollector.m26664o(2068);
            return nativeInputStreamUpdateFormat;
        }
        MethodCollector.m26664o(2068);
        return -1;
    }

    public ByteAudioInputStream(long j, String str) {
        MethodCollector.m26663i(1942);
        this.nativeEnginePtr = j;
        if (j != 0) {
            this.nativeStreamPtr = ByteAudioNativeFunctions.nativeCreateInputStream(j, str);
        }
        MethodCollector.m26664o(1942);
    }

    public int inputStreamSetValue(int i, ByteAudioStreamOption byteAudioStreamOption) {
        MethodCollector.m26663i(2071);
        long j = this.nativeStreamPtr;
        if (j != 0) {
            int nativeInputStreamSetValue = ByteAudioNativeFunctions.nativeInputStreamSetValue(j, i, byteAudioStreamOption);
            MethodCollector.m26664o(2071);
            return nativeInputStreamSetValue;
        }
        MethodCollector.m26664o(2071);
        return -1;
    }
}
