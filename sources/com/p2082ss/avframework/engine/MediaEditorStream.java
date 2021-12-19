package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.mixer.AudioMixer;
import com.p2082ss.avframework.mixer.VideoMixer;

/* renamed from: com.ss.avframework.engine.MediaEditorStream */
public class MediaEditorStream {
    private AudioMixer mAudioMixer;
    private long mNativeObj;
    private VideoMixer mVideoMixer;

    static {
        Covode.recordClassIndex(99967);
    }

    private native long nativeGetAudioMixer(long j);

    private native long nativeGetVideoMixer(long j);

    private native boolean nativeSetAudioMixerDescription(long j, String str, AudioMixer.AudioMixerDescription audioMixerDescription);

    private native void nativeSetOriginAudioTrack(long j, String str);

    private native void nativeSetOriginVideoTrack(long j, String str);

    private native boolean nativeSetVideoMixerDescription(long j, String str, VideoMixer.VideoMixerDescription videoMixerDescription);

    public AudioMixer getAudioMixer() {
        MethodCollector.m26663i(1883);
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer == null) {
            audioMixer = new AudioMixer(nativeGetAudioMixer(this.mNativeObj));
            this.mAudioMixer = audioMixer;
        }
        MethodCollector.m26664o(1883);
        return audioMixer;
    }

    public VideoMixer getVideoMixer() {
        MethodCollector.m26663i(1832);
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer == null) {
            videoMixer = new VideoMixer(nativeGetVideoMixer(this.mNativeObj));
            this.mVideoMixer = videoMixer;
        }
        MethodCollector.m26664o(1832);
        return videoMixer;
    }

    public synchronized void release() {
        MethodCollector.m26663i(1828);
        if (this.mNativeObj == 0) {
            MethodCollector.m26664o(1828);
            return;
        }
        VideoMixer videoMixer = this.mVideoMixer;
        if (videoMixer != null) {
            videoMixer.release();
            this.mVideoMixer = null;
        }
        AudioMixer audioMixer = this.mAudioMixer;
        if (audioMixer != null) {
            audioMixer.release();
            this.mAudioMixer = null;
        }
        this.mNativeObj = 0;
        MethodCollector.m26664o(1828);
    }

    public MediaEditorStream(long j) {
        this.mNativeObj = j;
    }

    public void setOriginAudioTrack(String str) {
        MethodCollector.m26663i(2752);
        nativeSetOriginAudioTrack(this.mNativeObj, str);
        MethodCollector.m26664o(2752);
    }

    public void setOriginVideoTrack(String str) {
        MethodCollector.m26663i(2748);
        nativeSetOriginVideoTrack(this.mNativeObj, str);
        MethodCollector.m26664o(2748);
    }

    public boolean setAudioMixerDescription(String str, AudioMixer.AudioMixerDescription audioMixerDescription) {
        MethodCollector.m26663i(2616);
        boolean nativeSetAudioMixerDescription = nativeSetAudioMixerDescription(this.mNativeObj, str, audioMixerDescription);
        MethodCollector.m26664o(2616);
        return nativeSetAudioMixerDescription;
    }

    public boolean setVideoMixerDescription(String str, VideoMixer.VideoMixerDescription videoMixerDescription) {
        MethodCollector.m26663i(1907);
        boolean nativeSetVideoMixerDescription = nativeSetVideoMixerDescription(this.mNativeObj, str, videoMixerDescription);
        MethodCollector.m26664o(1907);
        return nativeSetVideoMixerDescription;
    }
}
