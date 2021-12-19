package com.p2082ss.avframework.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioSink;
import com.p2082ss.avframework.utils.AVLog;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.player.TTPlayerHelper */
public class TTPlayerHelper {
    private static final String TAG = TTPlayerHelper.class.getSimpleName();

    public static native void nativeCloseAudio(long j, boolean z);

    public static native long nativeCreateTTAudioSink(Object obj, int i, int i2);

    public static native int nativeReadTTAudioBuffer(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    /* renamed from: com.ss.avframework.player.TTPlayerHelper$NativeAudioSink */
    public static class NativeAudioSink extends AudioSink {
        private AudioSink mSink;

        static {
            Covode.recordClassIndex(100693);
        }

        @Override // com.p2082ss.avframework.engine.AudioSink
        public void onNoData() {
        }

        @Override // com.p2082ss.avframework.engine.NativeObject
        public void finalize() {
            release();
        }

        @Override // com.p2082ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.m26663i(1859);
            MethodCollector.m26664o(1859);
        }

        public long getNativeObject() {
            long j = this.mNativeObj;
            if (j < 0) {
                return j & 4294967295L;
            }
            return this.mNativeObj;
        }

        public void setAudioSink(AudioSink audioSink) {
            this.mSink = audioSink;
        }

        public void closeAudio(boolean z) {
            MethodCollector.m26663i(1872);
            if (this.mNativeObj != 0) {
                TTPlayerHelper.nativeCloseAudio(this.mNativeObj, z);
            }
            MethodCollector.m26664o(1872);
        }

        public NativeAudioSink(int i, int i2) {
            MethodCollector.m26663i(1854);
            setNativeObj(TTPlayerHelper.nativeCreateTTAudioSink(this, i, i2));
            MethodCollector.m26664o(1854);
        }

        public int readAudioBuffer(ByteBuffer byteBuffer, int i, int i2, int i3) {
            MethodCollector.m26663i(1864);
            if (byteBuffer == null || this.mNativeObj == 0) {
                MethodCollector.m26664o(1864);
                return -1;
            }
            int nativeReadTTAudioBuffer = TTPlayerHelper.nativeReadTTAudioBuffer(this.mNativeObj, byteBuffer, i, i2, i3);
            MethodCollector.m26664o(1864);
            return nativeReadTTAudioBuffer;
        }

        @Override // com.p2082ss.avframework.engine.AudioSink
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            AudioSink audioSink = this.mSink;
            if (audioSink != null) {
                audioSink.onData(buffer, i, i2, i3, j);
            }
        }
    }

    static {
        Covode.recordClassIndex(100692);
    }

    public static String getTTVideoEngineVersion() {
        Throwable th;
        Method method;
        try {
            Class<?> cls = Class.forName("com.ss.ttvideoengine.TTVideoEngine");
            if (cls != null && (method = cls.getMethod("getEngineVersion", new Class[0])) != null) {
                return (String) method.invoke(null, new Object[0]);
            }
            th = null;
            AVLog.ioe(TAG, "probe TTVideoEngine failed", th);
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static NativeAudioSink createAudioPlayer(int i, int i2) {
        String tTVideoEngineVersion = getTTVideoEngineVersion();
        if (tTVideoEngineVersion == null) {
            return null;
        }
        AVLog.iow(TAG, "Create TTAudioPlayer with engine version " + tTVideoEngineVersion + " sampleHZ " + i + " channel " + i2);
        return new NativeAudioSink(i, i2);
    }
}
