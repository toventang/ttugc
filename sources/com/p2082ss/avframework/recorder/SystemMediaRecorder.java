package com.p2082ss.avframework.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.utils.AVLog;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.recorder.SystemMediaRecorder */
public class SystemMediaRecorder implements MediaRecorder {
    private String mFileName;
    private int mFormat;
    private MediaMuxer mMediaMuxer;

    static {
        Covode.recordClassIndex(100697);
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public int start() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer == null) {
            return -1;
        }
        try {
            mediaMuxer.start();
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public void release() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.release();
            } catch (Exception e) {
                AVLog.m147809w("SystemMediaRecorder", e.toString());
            }
            this.mMediaMuxer = null;
        }
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public int stop() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer == null) {
            return 0;
        }
        try {
            mediaMuxer.stop();
            return 0;
        } catch (Exception e) {
            AVLog.m147809w("SystemMediaRecorder", e.toString());
            return 0;
        }
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public int addTrack(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            return mediaMuxer.addTrack(mediaFormat);
        }
        return -1;
    }

    public SystemMediaRecorder(String str, int i) {
        this.mFileName = str;
        this.mFormat = i;
        try {
            int i2 = Build.VERSION.SDK_INT;
            this.mMediaMuxer = new MediaMuxer(this.mFileName, this.mFormat);
        } catch (IOException unused) {
            this.mMediaMuxer = null;
        }
    }

    @Override // com.p2082ss.avframework.recorder.MediaRecorder
    public int writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer == null) {
            return 0;
        }
        try {
            mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
            return 0;
        } catch (Exception e) {
            AVLog.m147806e("SystemMediaRecorder", e.toString());
            return -1;
        }
    }
}
