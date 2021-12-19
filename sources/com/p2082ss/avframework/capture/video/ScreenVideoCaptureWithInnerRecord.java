package com.p2082ss.avframework.capture.video;

import android.content.Intent;
import android.media.AudioRecord;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.avframework.capture.audio.AudioRecordThread;
import com.p2082ss.avframework.capture.video.VideoCapturer;

/* renamed from: com.ss.avframework.capture.video.ScreenVideoCaptureWithInnerRecord */
public class ScreenVideoCaptureWithInnerRecord extends ScreenVideoCapturer {
    private AudioRecord mAudioRecord;
    private AudioRecordThread mAudioRecordThread;
    private AudioRecordThread.IAudioRecordThreadObserver mIAudioRecordThreadObserver;

    static {
        Covode.recordClassIndex(99882);
    }

    /* renamed from: com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_release */
    private static void m147761xe8cb6dfb(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, audioRecord, new Object[0], 100405, "com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            C15346a.m28240a(null, audioRecord, new Object[0], 100403, "com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_stop */
    private static void m147762x7b7ea68e(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, audioRecord, new Object[0], 100404, "com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            audioRecord.stop();
            C15346a.m28240a(null, audioRecord, new Object[0], 100401, "com_ss_avframework_capture_video_ScreenVideoCaptureWithInnerRecord_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
        }
    }

    private void startAudioPlayBack() {
    }

    public void setAudioPlayBackObserver(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver) {
    }

    @Override // com.p2082ss.avframework.capture.video.ScreenVideoCapturer, com.p2082ss.avframework.engine.NativeObject
    public void release() {
        AudioRecord audioRecord = this.mAudioRecord;
        this.mAudioRecord = null;
        if (audioRecord != null) {
            m147761xe8cb6dfb(audioRecord);
        }
        this.mAudioRecordThread = null;
        super.release();
    }

    @Override // com.p2082ss.avframework.capture.video.ScreenVideoCapturer, com.p2082ss.avframework.capture.video.VideoCapturer
    public void stop() {
        this.mIAudioRecordThreadObserver = null;
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            m147762x7b7ea68e(audioRecord);
        }
        AudioRecordThread audioRecordThread = this.mAudioRecordThread;
        if (audioRecordThread != null) {
            audioRecordThread.stop();
        }
        super.stop();
    }

    public ScreenVideoCaptureWithInnerRecord(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
        super(intent, videoCapturerObserver);
    }
}
