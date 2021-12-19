package com.p2082ss.avframework.mixer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.JavaI420Buffer;
import com.p2082ss.avframework.buffer.TextureBufferImpl;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.opengl.YuvConverter;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.mixer.VideoMixer */
public class VideoMixer extends NativeMixer implements TextureBufferImpl.ToI420Interface {
    public static int TEXTURE_TYPE_2D = 1;
    public static int TEXTURE_TYPE_OES = 2;
    public static int TEXTURE_TYPE_UNKNOWN;
    public static int TEXTURE_TYPE_YUV = 3;
    private boolean mHaveNativeObj;
    private final long mWeakNativeThis;
    private YuvConverter mYuvConverter;

    private native void nativeAddVideoSink(VideoSink videoSink);

    private native void nativeCreate();

    private native void nativeRemoveVideoSink(VideoSink videoSink);

    private native void nativeSetIsGameMixer(boolean z);

    private native void nativeSetWPublishMode(boolean z);

    private native VideoMixerTexture nativeUploadI420ImageToTexture(long j, int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5);

    private native void nativeVideoMixerRelease(long j);

    @Override // com.p2082ss.avframework.mixer.Mixer
    public boolean isAudioMixer() {
        return false;
    }

    /* access modifiers changed from: protected */
    public native int nativeMixFrame(boolean z, int i, VideoFrame videoFrame);

    /* access modifiers changed from: protected */
    public native int nativeMixFrameTex(boolean z, int i, int i2, int i3, int i4, int i5, int[] iArr, float[] fArr);

    public native void nativeReleaseTexture();

    /* renamed from: com.ss.avframework.mixer.VideoMixer$VideoMixerDescription */
    public static class VideoMixerDescription {
        public float bottom;
        public long flags;
        public float left;
        public float right;
        public float top;
        public int zOrder;

        static {
            Covode.recordClassIndex(100647);
        }

        public float getBottom() {
            return this.bottom;
        }

        public long getFlags() {
            return this.flags;
        }

        public float getLeft() {
            return this.left;
        }

        public float getRight() {
            return this.right;
        }

        public float getTop() {
            return this.top;
        }

        public int getzOrder() {
            return this.zOrder;
        }

        public static VideoMixerDescription builder() {
            return new VideoMixerDescription();
        }

        public static VideoMixerDescription FILL() {
            return new VideoMixerDescription(0.0f, 0.0f, 1.0f, 1.0f, 1, 1);
        }

        public static VideoMixerDescription LEFT_DOWN() {
            return new VideoMixerDescription(0.0f, 0.5f, 0.5f, 1.0f, 1, 1);
        }

        public static VideoMixerDescription LEFT_HALF() {
            return new VideoMixerDescription(0.0f, 0.0f, 0.5f, 1.0f, 1, 1);
        }

        public static VideoMixerDescription LEFT_UP() {
            return new VideoMixerDescription(0.0f, 0.0f, 0.5f, 0.5f, 1, 1);
        }

        public static VideoMixerDescription RIGHT_HALF() {
            return new VideoMixerDescription(0.5f, 0.0f, 1.0f, 1.0f, 1, 1);
        }

        public static VideoMixerDescription RIGHT_UP() {
            return new VideoMixerDescription(0.5f, 0.0f, 1.0f, 0.5f, 1, 1);
        }

        public int getMode() {
            if ((this.flags & 1) != 0) {
                return 1;
            }
            return 2;
        }

        public boolean isEnableAlphaMode() {
            if ((this.flags & 16) == 0) {
                return true;
            }
            return false;
        }

        public boolean isVisible() {
            if ((this.flags & 8) == 0) {
                return true;
            }
            return false;
        }

        public VideoMixerDescription() {
            this.flags = 1;
            this.right = 1.0f;
            this.bottom = 1.0f;
            this.zOrder = 1;
        }

        public static VideoMixerDescription CENTER() {
            return new VideoMixerDescription(0.25f, 0.25f, 0.75f, 0.75f, 1, 1);
        }

        public static VideoMixerDescription RIGHT_DOWN() {
            return new VideoMixerDescription(0.5f, 0.5f, 1.0f, 1.0f, 1, 1);
        }

        public String toString() {
            return "VideoDescription(this:" + super.toString() + ",l:" + this.left + ",r:" + this.right + ",t:" + this.top + ",b:" + this.bottom + ",z:" + this.zOrder + ",f:" + this.flags + ")";
        }

        public VideoMixerDescription setBottom(float f) {
            this.bottom = f;
            return this;
        }

        public VideoMixerDescription setLeft(float f) {
            this.left = f;
            return this;
        }

        public VideoMixerDescription setRight(float f) {
            this.right = f;
            return this;
        }

        public VideoMixerDescription setTop(float f) {
            this.top = f;
            return this;
        }

        public VideoMixerDescription setzOrder(int i) {
            this.zOrder = i;
            return this;
        }

        public void copy(VideoMixerDescription videoMixerDescription) {
            this.left = videoMixerDescription.left;
            this.right = videoMixerDescription.right;
            this.top = videoMixerDescription.top;
            this.bottom = videoMixerDescription.bottom;
            this.zOrder = videoMixerDescription.zOrder;
            this.flags = videoMixerDescription.flags;
        }

        public boolean isMirror(boolean z) {
            long j = this.flags;
            if (z) {
                if ((j & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((j & 4) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public void setAutoFillOnFit(boolean z) {
            if (z) {
                this.flags |= 32;
            } else {
                this.flags &= -33;
            }
        }

        public VideoMixerDescription setEnableAlphaMode(boolean z) {
            if (z) {
                this.flags &= -17;
            } else {
                this.flags |= 16;
            }
            return this;
        }

        public VideoMixerDescription setMode(int i) {
            if (i == 1) {
                this.flags |= 1;
            } else if (i == 2) {
                this.flags &= -2;
            }
            return this;
        }

        public VideoMixerDescription setVisibility(boolean z) {
            if (z) {
                this.flags &= -9;
            } else {
                this.flags |= 8;
            }
            return this;
        }

        public VideoMixerDescription setMirror(boolean z, boolean z2) {
            if (z) {
                if (z2) {
                    this.flags |= 2;
                } else {
                    this.flags &= -3;
                }
            } else if (z2) {
                this.flags |= 4;
            } else {
                this.flags &= -5;
            }
            return this;
        }

        public VideoMixerDescription(float f, float f2, float f3, float f4, int i, long j) {
            this.flags = 1;
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
            this.zOrder = i;
            this.flags = j;
        }
    }

    /* renamed from: com.ss.avframework.mixer.VideoMixer$VideoMixerTexture */
    public static class VideoMixerTexture {
        int height;
        int rotation;
        float[] texMatrix;
        int[] textures;
        int type;
        int width;

        static {
            Covode.recordClassIndex(100648);
        }

        public VideoMixerTexture() {
        }

        public int getHeight() {
            return this.height;
        }

        public int getRotation() {
            return this.rotation;
        }

        public float[] getTexMatrix() {
            return this.texMatrix;
        }

        public int[] getTextures() {
            return this.textures;
        }

        public int getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public VideoMixerTexture(int i, int i2, int i3, int i4, int[] iArr, float[] fArr) {
            this.textures = iArr;
            this.width = i;
            this.height = i2;
            this.rotation = i3;
            this.type = i4;
            if (i3 != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                if (i3 % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
                    this.width = i2;
                    this.height = i;
                }
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preRotate((float) (-i3));
                matrix.preTranslate(-0.5f, -0.5f);
                if (fArr != null) {
                    matrix.preConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
                }
                this.texMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
                return;
            }
            this.texMatrix = fArr == null ? RendererCommon.identityMatrix() : fArr;
        }
    }

    private boolean isHaveNativeObj() {
        return this.mHaveNativeObj;
    }

    static {
        Covode.recordClassIndex(100644);
    }

    public int createTrack() {
        return super.nativeCreateTrack(VideoMixerDescription.builder());
    }

    public VideoMixer() {
        MethodCollector.m26663i(2883);
        this.mHaveNativeObj = true;
        nativeCreate();
        this.mWeakNativeThis = this.mNativeObj;
        MethodCollector.m26664o(2883);
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(2909);
        if (this.mHaveNativeObj) {
            super.release();
        } else if (this.mNativeObj != 0) {
            nativeVideoMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0;
        MethodCollector.m26664o(2909);
    }

    public int createTrack(VideoMixerDescription videoMixerDescription) {
        return super.nativeCreateTrack(videoMixerDescription);
    }

    public VideoMixerDescription getDescription(int i) {
        return (VideoMixerDescription) super.nativeGetDescription(i);
    }

    public VideoMixer(long j) {
        setNativeObj(j);
        this.mWeakNativeThis = j;
    }

    public void AddVideoSink(VideoSink videoSink) {
        MethodCollector.m26663i(2912);
        if (videoSink != null) {
            nativeAddVideoSink(videoSink);
        }
        MethodCollector.m26664o(2912);
    }

    public void RemoveVideoSink(VideoSink videoSink) {
        MethodCollector.m26663i(2922);
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
        MethodCollector.m26664o(2922);
    }

    public void addVideoSink(VideoSink videoSink) {
        MethodCollector.m26663i(2920);
        if (videoSink != null) {
            nativeAddVideoSink(videoSink);
        }
        MethodCollector.m26664o(2920);
    }

    public void removeVideoSink(VideoSink videoSink) {
        MethodCollector.m26663i(2923);
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
        MethodCollector.m26664o(2923);
    }

    public void setIsGameMixer(boolean z) {
        MethodCollector.m26663i(3249);
        nativeSetIsGameMixer(z);
        MethodCollector.m26664o(3249);
    }

    public void setWPublishMode(boolean z) {
        MethodCollector.m26663i(3253);
        nativeSetWPublishMode(z);
        MethodCollector.m26664o(3253);
    }

    @Override // com.p2082ss.avframework.mixer.Mixer
    public boolean isEnable(int i) {
        VideoMixerDescription description = getDescription(i);
        if (description == null || (description.flags & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.avframework.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        if (this.mYuvConverter == null) {
            this.mYuvConverter = new YuvConverter();
        }
        return this.mYuvConverter.convert(textureBuffer);
    }

    /* access modifiers changed from: protected */
    public VideoFrame.Buffer wrapperTextureBuffer(VideoMixerTexture videoMixerTexture) {
        Matrix matrix;
        if (videoMixerTexture.texMatrix != null) {
            matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoMixerTexture.texMatrix);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        return new TextureBufferImpl(videoMixerTexture.width, videoMixerTexture.height, VideoFrame.TextureBuffer.Type.RGB, videoMixerTexture.getTextures()[0], matrix, this, new Runnable() {
            /* class com.p2082ss.avframework.mixer.VideoMixer.RunnableC860241 */

            static {
                Covode.recordClassIndex(100645);
            }

            public void run() {
                MethodCollector.m26663i(1496);
                VideoMixer.this.nativeReleaseTexture();
                MethodCollector.m26664o(1496);
            }
        });
    }

    /* access modifiers changed from: protected */
    public VideoMixerTexture getVideoMixerTexture(VideoFrame videoFrame) {
        int i;
        MethodCollector.m26663i(2899);
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        VideoMixerTexture videoMixerTexture = new VideoMixerTexture();
        if (buffer instanceof VideoFrame.TextureBuffer) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                i = TEXTURE_TYPE_OES;
            } else {
                i = TEXTURE_TYPE_2D;
            }
            videoMixerTexture.type = i;
            videoMixerTexture.width = buffer.getWidth();
            videoMixerTexture.height = buffer.getHeight();
            videoMixerTexture.rotation = videoFrame.getRotation();
            videoMixerTexture.texMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
            videoMixerTexture.textures = new int[1];
            videoMixerTexture.textures[0] = textureBuffer.getTextureId();
            MethodCollector.m26664o(2899);
            return videoMixerTexture;
        } else if (buffer instanceof JavaI420Buffer) {
            JavaI420Buffer javaI420Buffer = (JavaI420Buffer) buffer;
            VideoMixerTexture nativeUploadI420ImageToTexture = nativeUploadI420ImageToTexture(this.mWeakNativeThis, javaI420Buffer.getWidth(), javaI420Buffer.getHeight(), javaI420Buffer.getDataY(), javaI420Buffer.getStrideY(), javaI420Buffer.getDataU(), javaI420Buffer.getStrideU(), javaI420Buffer.getDataV(), javaI420Buffer.getStrideV());
            if (nativeUploadI420ImageToTexture != null) {
                nativeUploadI420ImageToTexture.texMatrix = RendererCommon.multiplyMatrices(nativeUploadI420ImageToTexture.texMatrix, RendererCommon.verticalFlipMatrix());
            }
            MethodCollector.m26664o(2899);
            return nativeUploadI420ImageToTexture;
        } else {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("No implement.");
            MethodCollector.m26664o(2899);
            throw androidRuntimeException;
        }
    }

    public void updateDescription(int i, VideoMixerDescription videoMixerDescription) {
        super.nativeUpdateDescription(i, videoMixerDescription);
    }

    public int mixFrame(int i, VideoFrame videoFrame) {
        MethodCollector.m26663i(3248);
        int nativeMixFrame = nativeMixFrame(this.mHaveNativeObj, i, videoFrame);
        MethodCollector.m26664o(3248);
        return nativeMixFrame;
    }

    @Override // com.p2082ss.avframework.mixer.Mixer
    public void setEnable(int i, boolean z) {
        VideoMixerDescription description = getDescription(i);
        if (description != null) {
            if (z) {
                description.flags &= -9;
            } else {
                description.flags |= 8;
            }
            updateDescription(i, description);
        }
    }

    public int mixFrame(int i, VideoMixerTexture videoMixerTexture) {
        MethodCollector.m26663i(3247);
        if (videoMixerTexture.rotation != 0) {
            videoMixerTexture = new VideoMixerTexture(videoMixerTexture.width, videoMixerTexture.height, videoMixerTexture.rotation, videoMixerTexture.type, videoMixerTexture.textures, videoMixerTexture.texMatrix);
        }
        int nativeMixFrameTex = nativeMixFrameTex(this.mHaveNativeObj, i, videoMixerTexture.width, videoMixerTexture.height, videoMixerTexture.rotation, videoMixerTexture.type, videoMixerTexture.textures, videoMixerTexture.texMatrix);
        MethodCollector.m26664o(3247);
        return nativeMixFrameTex;
    }

    /* access modifiers changed from: protected */
    public VideoFrame wrapperTextureBuffer(int i, int i2, int i3, int i4, int i5, long j) {
        return wrapperTextureBuffer(i, i2, i3, i4, i5, null, j);
    }

    /* access modifiers changed from: protected */
    public VideoFrame wrapperTextureBuffer(int i, int i2, int i3, int i4, int i5, float[] fArr, long j) {
        Matrix matrix;
        if (fArr != null) {
            matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        return new VideoFrame(new TextureBufferImpl(i, i2, VideoFrame.TextureBuffer.Type.RGB, i5, matrix, this, new Runnable() {
            /* class com.p2082ss.avframework.mixer.VideoMixer.RunnableC860252 */

            static {
                Covode.recordClassIndex(100646);
            }

            public void run() {
                MethodCollector.m26663i(1252);
                VideoMixer.this.nativeReleaseTexture();
                MethodCollector.m26664o(1252);
            }
        }), i3, j);
    }
}
