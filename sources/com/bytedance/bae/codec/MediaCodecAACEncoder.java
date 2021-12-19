package com.bytedance.bae.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class MediaCodecAACEncoder {
    private MediaCodec mAACEncoder;
    private int mBitrate = 64000;
    private MediaCodec.BufferInfo mBufferInfo;
    private int mChannels = 1;
    private byte[] mEncodedData;
    private int mFrameSize = 1024;
    private ByteBuffer[] mInputBuffers;
    private String mMimeType = "audio/mp4a-latm";
    private ByteBuffer[] mOutputBuffers;
    private int mProfile = 2;
    private int mSampleRate = 44100;

    static {
        Covode.recordClassIndex(15030);
    }

    public byte[] getEncodedData() {
        return this.mEncodedData;
    }

    public int getFrameSize() {
        return this.mFrameSize;
    }

    MediaCodecAACEncoder() {
        BaeLogging.m23626e("MediaCodecAACEncoder", "MediaCodecAAC Encoder Created");
    }

    public void closeEncoder() {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACEncoder.release();
                this.mAACEncoder = null;
                BaeLogging.m23626e("MediaCodecAACEncoder", "close AAC encoder success");
            }
        } catch (Exception e) {
            e.printStackTrace();
            BaeLogging.m23626e("MediaCodecAACEncoder", "close AAC encoder failed");
        }
    }

    public boolean openEncoder() {
        try {
            this.mAACEncoder = MediaCodec.createEncoderByType(this.mMimeType);
            BaeLogging.m23626e("MediaCodecAACEncoder", "open AAC encoder success");
            if (this.mAACEncoder != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            this.mAACEncoder = null;
            BaeLogging.m23626e("MediaCodecAACEncoder", "Open AAC encoder failed");
            return false;
        }
    }

    public boolean configAndStartEncoder() {
        try {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            createAudioFormat.setInteger("bitrate", this.mBitrate);
            createAudioFormat.setInteger("aac-profile", this.mProfile);
            createAudioFormat.setInteger("max-input-size", this.mChannels * this.mFrameSize * 100);
            this.mAACEncoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            BaeLogging.m23626e("MediaCodecAACEncoder", "config AAC encoder success");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            BaeLogging.m23626e("MediaCodecAACEncoder", "Config and Start Encoder Error");
            return false;
        }
    }

    public void setBitRateValue(int i) {
        this.mBitrate = i;
    }

    public void setChannelsValue(int i) {
        this.mChannels = i;
    }

    public void setSampeRateValue(int i) {
        this.mSampleRate = i;
    }

    public boolean setBitrate(int i) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.stop();
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            createAudioFormat.setInteger("bitrate", i);
            createAudioFormat.setInteger("aac-profile", this.mProfile);
            this.mAACEncoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBitrate = i;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            BaeLogging.m23626e("MediaCodecAACEncoder", "Config and Start Encoder Error");
            return false;
        }
    }

    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
            this.mFrameSize = 2048;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
            this.mFrameSize = 2048;
        } else {
            this.mProfile = 2;
            this.mFrameSize = 1024;
        }
    }

    public boolean encodeProcess(byte[] bArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mEncodedData = null;
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(300);
            if (dequeueInputBuffer >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mAACEncoder.getInputBuffer(dequeueInputBuffer);
                } else {
                    ByteBuffer[] inputBuffers = this.mAACEncoder.getInputBuffers();
                    this.mInputBuffers = inputBuffers;
                    byteBuffer2 = inputBuffers[dequeueInputBuffer];
                    byteBuffer2.limit(bArr.length);
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mAACEncoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0, 0);
            }
            int dequeueOutputBuffer = this.mAACEncoder.dequeueOutputBuffer(this.mBufferInfo, 0);
            int i = this.mBufferInfo.size;
            if (i > 0 && dequeueOutputBuffer >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = this.mAACEncoder.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    ByteBuffer[] outputBuffers = this.mAACEncoder.getOutputBuffers();
                    this.mOutputBuffers = outputBuffers;
                    byteBuffer = outputBuffers[dequeueOutputBuffer];
                    byteBuffer.limit(this.mBufferInfo.size);
                }
                byte[] bArr2 = new byte[i];
                this.mEncodedData = bArr2;
                byteBuffer.get(bArr2, this.mBufferInfo.offset, i);
                byteBuffer.clear();
                this.mAACEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            BaeLogging.m23626e("MediaCodecAACEncoder", "AAC Encoder Encode failed");
            return false;
        }
    }
}
