package com.p2082ss.bytertc.engine.utils;

import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.JavaI420Buffer;
import org.webrtc.NV21Buffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.bytertc.engine.utils.VideoFrameConverter */
public class VideoFrameConverter {
    private long gl420ConverterNativeHandle;
    private long glNativeHandle;
    private Handler mHandler = new Handler(this.mHandlerThread.getLooper());
    private HandlerThread mHandlerThread;
    private TextureHelper mI420TextureConverter;
    private boolean mIsStart = true;
    private TextureHelper mTextureHelper;

    static {
        Covode.recordClassIndex(101176);
    }

    public long getNativeEglContext(EGLContext eGLContext) {
        return 0;
    }

    public TextureHelper getTextureHelper() {
        return this.mTextureHelper;
    }

    public VideoFrameConverter() {
        HandlerThread handlerThread = new HandlerThread("video-frame-converter");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
    }

    public synchronized void dispose() {
        MethodCollector.m26663i(197);
        TextureHelper textureHelper = this.mTextureHelper;
        if (textureHelper != null) {
            textureHelper.dispose();
        }
        TextureHelper textureHelper2 = this.mI420TextureConverter;
        if (textureHelper2 != null) {
            textureHelper2.dispose();
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.mIsStart = false;
        MethodCollector.m26664o(197);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$convert2VideoFrame$0$VideoFrameConverter(RTCVideoFrame rTCVideoFrame) {
        this.mTextureHelper.queueTexture(rTCVideoFrame.textureId);
    }

    private long getNativeEglContext(android.opengl.EGLContext eGLContext) {
        if (Build.VERSION.SDK_INT >= 21) {
            return eGLContext.getNativeHandle();
        }
        return (long) eGLContext.getHandle();
    }

    public static ByteBuffer getExtendedData(RTCVideoFrame rTCVideoFrame) {
        if (rTCVideoFrame.extend_data == null || rTCVideoFrame.extend_data.isDirect()) {
            return rTCVideoFrame.extend_data;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rTCVideoFrame.extend_data.capacity());
        rTCVideoFrame.extend_data.rewind();
        allocateDirect.put(rTCVideoFrame.extend_data);
        rTCVideoFrame.extend_data.rewind();
        allocateDirect.order(rTCVideoFrame.extend_data.order());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static ByteBuffer getSupplementaryInfo(RTCVideoFrame rTCVideoFrame) {
        if (rTCVideoFrame.supplementary_info == null || rTCVideoFrame.supplementary_info.isDirect()) {
            return rTCVideoFrame.supplementary_info;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rTCVideoFrame.supplementary_info.capacity());
        rTCVideoFrame.supplementary_info.rewind();
        allocateDirect.put(rTCVideoFrame.supplementary_info);
        rTCVideoFrame.supplementary_info.rewind();
        allocateDirect.order(rTCVideoFrame.supplementary_info.order());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public synchronized void post(Runnable runnable) {
        MethodCollector.m26663i(196);
        if (!this.mIsStart) {
            MethodCollector.m26664o(196);
            return;
        }
        TextureHelper textureHelper = this.mTextureHelper;
        if (textureHelper != null) {
            textureHelper.post(runnable);
            MethodCollector.m26664o(196);
            return;
        }
        this.mHandler.post(runnable);
        MethodCollector.m26664o(196);
    }

    private VideoFrame allocateI420VideoFrame(RTCVideoFrame rTCVideoFrame) {
        int i = rTCVideoFrame.format;
        if (i == 1) {
            JavaI420Buffer allocate = JavaI420Buffer.allocate(rTCVideoFrame.stride, rTCVideoFrame.height);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            byte[] array = rTCVideoFrame.buffer.array();
            dataY.put(array, 0, rTCVideoFrame.stride * rTCVideoFrame.height);
            dataU.put(array, rTCVideoFrame.stride * rTCVideoFrame.height, (rTCVideoFrame.stride * rTCVideoFrame.height) / 4);
            dataV.put(array, (rTCVideoFrame.stride * rTCVideoFrame.height) + ((rTCVideoFrame.stride * rTCVideoFrame.height) / 4), (rTCVideoFrame.stride * rTCVideoFrame.height) / 4);
            return new VideoFrame(allocate, rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
        } else if (i == 3) {
            return new VideoFrame(new NV21Buffer(rTCVideoFrame.buffer.array(), rTCVideoFrame.stride, rTCVideoFrame.height, null), rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
        } else {
            if (i == 10 || i == 11) {
                return null;
            }
            LogUtil.m147889w("VideoFrameConverter", "texture or yuv picture format is not support");
            return null;
        }
    }

    public synchronized VideoFrame convert2I420Frame(RTCVideoFrame rTCVideoFrame) {
        MethodCollector.m26663i(2029);
        VideoFrame videoFrame = null;
        if (rTCVideoFrame == null || !this.mIsStart) {
            LogUtil.m147886e("VideoFrameConverter", "video frame convert2I420Frame error frame:" + rTCVideoFrame + " isStart:" + this.mIsStart);
            MethodCollector.m26664o(2029);
            return null;
        } else if (rTCVideoFrame.format == 11 || rTCVideoFrame.format == 10) {
            if (rTCVideoFrame.eglContext14 == null || !updateInnerI420Converter(rTCVideoFrame.eglContext14, rTCVideoFrame.stride, rTCVideoFrame.height)) {
                LogUtil.m147886e("VideoFrameConverter", "video frame  error frame eglContext14:" + rTCVideoFrame.eglContext14 + " isStart:" + this.mIsStart);
                MethodCollector.m26664o(2029);
                return null;
            }
            TextureHelper textureHelper = this.mI420TextureConverter;
            if (textureHelper != null) {
                videoFrame = allocateI420VideoFrame(rTCVideoFrame, textureHelper);
            }
            MethodCollector.m26664o(2029);
            return videoFrame;
        } else if (rTCVideoFrame.format == 3 || rTCVideoFrame.format == 1) {
            VideoFrame allocateI420VideoFrame = allocateI420VideoFrame(rTCVideoFrame);
            MethodCollector.m26664o(2029);
            return allocateI420VideoFrame;
        } else {
            LogUtil.m147889w("VideoFrameConverter", "pushExternalVideoFrame ExtVideoFrame type is not available");
            MethodCollector.m26664o(2029);
            return null;
        }
    }

    public synchronized VideoFrame convert2VideoFrame(RTCVideoFrame rTCVideoFrame) {
        MethodCollector.m26663i(2120);
        VideoFrame videoFrame = null;
        if (rTCVideoFrame == null) {
            LogUtil.m147889w("VideoFrameConverter", "convert2VideoFrame frame is null");
            MethodCollector.m26664o(2120);
            return null;
        } else if (rTCVideoFrame.format == 11 || rTCVideoFrame.format == 10) {
            if (rTCVideoFrame.eglContext14 != null) {
                updateEglContext(rTCVideoFrame.eglContext14, rTCVideoFrame.stride, rTCVideoFrame.height);
            } else if (rTCVideoFrame.eglContext11 != null) {
                updateEglContext(rTCVideoFrame.eglContext11, rTCVideoFrame.stride, rTCVideoFrame.height);
            }
            if (this.mTextureHelper != null) {
                if (rTCVideoFrame.hasReleaseCallback()) {
                    TextureHelper textureHelper = this.mTextureHelper;
                    rTCVideoFrame.getClass();
                    videoFrame = allocateVideoFrame(rTCVideoFrame, textureHelper, VideoFrameConverter$$Lambda$0.get$Lambda(rTCVideoFrame));
                } else {
                    int dequeueTexture = this.mTextureHelper.dequeueTexture();
                    if (dequeueTexture == 0) {
                        MethodCollector.m26664o(2120);
                        return null;
                    }
                    this.mTextureHelper.drawTexture(rTCVideoFrame.format, rTCVideoFrame.textureId, dequeueTexture);
                    rTCVideoFrame.textureId = dequeueTexture;
                    rTCVideoFrame.format = 10;
                    videoFrame = allocateVideoFrame(rTCVideoFrame, this.mTextureHelper, new VideoFrameConverter$$Lambda$1(this, rTCVideoFrame));
                }
            }
            MethodCollector.m26664o(2120);
            return videoFrame;
        } else if (rTCVideoFrame.format == 3 || rTCVideoFrame.format == 1) {
            VideoFrame allocateI420VideoFrame = allocateI420VideoFrame(rTCVideoFrame);
            MethodCollector.m26664o(2120);
            return allocateI420VideoFrame;
        } else {
            LogUtil.m147889w("VideoFrameConverter", "pushExternalVideoFrame ExtVideoFrame type is not available");
            MethodCollector.m26664o(2120);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public VideoFrame allocateI420VideoFrame(RTCVideoFrame rTCVideoFrame, TextureHelper textureHelper) {
        Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(rTCVideoFrame.transform);
        int i = rTCVideoFrame.format;
        if (i == 1 || i == 3) {
            return allocateVideoFrame(rTCVideoFrame, textureHelper, null);
        }
        if (i == 10) {
            return new VideoFrame(new TextureBufferImpl(rTCVideoFrame.stride, rTCVideoFrame.height, VideoFrame.TextureBuffer.Type.RGB, rTCVideoFrame.textureId, convertMatrixToAndroidGraphicsMatrix, textureHelper, null).toI420(), rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
        }
        if (i == 11) {
            return new VideoFrame(new TextureBufferImpl(rTCVideoFrame.stride, rTCVideoFrame.height, VideoFrame.TextureBuffer.Type.OES, rTCVideoFrame.textureId, convertMatrixToAndroidGraphicsMatrix, textureHelper, null).toI420(), rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
        }
        LogUtil.m147889w("VideoFrameConverter", "texture or yuv picture format is not support");
        return null;
    }

    private void updateEglContext(android.opengl.EGLContext eGLContext, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
            this.glNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.m147888i("VideoFrameConverter", "create  egl14 texture helper");
        } else if (this.glNativeHandle != getNativeEglContext(eGLContext) || this.mTextureHelper.getWidth() != i || this.mTextureHelper.getHeight() != i2) {
            this.glNativeHandle = getNativeEglContext(eGLContext);
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
            LogUtil.m147888i("VideoFrameConverter", "update egl14Context nativeHandle:" + this.glNativeHandle + " ,eglContext:" + eGLContext + "frame size width:" + i + "height :" + i2);
        }
    }

    private boolean updateInnerI420Converter(android.opengl.EGLContext eGLContext, int i, int i2) {
        if (this.mI420TextureConverter == null) {
            this.mI420TextureConverter = TextureHelper.create("EGLBaseTextureHelper", eGLContext, i, i2);
            this.gl420ConverterNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.m147888i("VideoFrameConverter", "create EglBase 420 texture converter");
            return true;
        } else if (this.gl420ConverterNativeHandle == getNativeEglContext(eGLContext)) {
            return true;
        } else {
            this.gl420ConverterNativeHandle = getNativeEglContext(eGLContext);
            this.mI420TextureConverter.dispose();
            this.mI420TextureConverter = TextureHelper.create("EGL14TextureConverter", eGLContext, i, i2);
            LogUtil.m147888i("VideoFrameConverter", "update egl14texture converter nativeHandle:" + this.glNativeHandle + " ,eglContext:" + eGLContext);
            return true;
        }
    }

    private void updateEglContext(EGLContext eGLContext, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGL10TextureHelper", eGLContext, i, i2);
            this.glNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.m147888i("VideoFrameConverter", "create  egl10 texture helper");
        } else if (this.glNativeHandle != getNativeEglContext(eGLContext) || this.mTextureHelper.getWidth() != i || this.mTextureHelper.getHeight() != i2) {
            this.glNativeHandle = getNativeEglContext(eGLContext);
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGL10TextureHelper", eGLContext, i, i2);
            LogUtil.m147888i("VideoFrameConverter", "update egl14Context nativeHandle:" + this.glNativeHandle + " ,eglContext:" + eGLContext + "frame size width:" + i + "height :" + i2);
        }
    }

    public VideoFrame allocateVideoFrame(RTCVideoFrame rTCVideoFrame, TextureHelper textureHelper, Runnable runnable) {
        int i = rTCVideoFrame.format;
        if (i == 1) {
            JavaI420Buffer allocate = JavaI420Buffer.allocate(rTCVideoFrame.stride, rTCVideoFrame.height);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            byte[] array = rTCVideoFrame.buffer.array();
            dataY.put(array, 0, rTCVideoFrame.stride * rTCVideoFrame.height);
            dataU.put(array, rTCVideoFrame.stride * rTCVideoFrame.height, rTCVideoFrame.stride);
            dataV.put(array, (rTCVideoFrame.stride * rTCVideoFrame.height) + rTCVideoFrame.stride, rTCVideoFrame.stride);
            return new VideoFrame(allocate, rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
        } else if (i == 3) {
            return new VideoFrame(new NV21Buffer(rTCVideoFrame.buffer.array(), rTCVideoFrame.stride, rTCVideoFrame.height, null), rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
        } else {
            if (i == 10) {
                TextureBufferImpl textureBufferImpl = new TextureBufferImpl(rTCVideoFrame.stride, rTCVideoFrame.height, VideoFrame.TextureBuffer.Type.RGB, rTCVideoFrame.textureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(rTCVideoFrame.transform), textureHelper, runnable);
                textureBufferImpl.setEglBaseContext(textureHelper.getEglBaseContext());
                return new VideoFrame(textureBufferImpl, rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
            } else if (i != 11) {
                LogUtil.m147889w("VideoFrameConverter", "texture or yuv picture format is not support");
                return null;
            } else {
                TextureBufferImpl textureBufferImpl2 = new TextureBufferImpl(rTCVideoFrame.stride, rTCVideoFrame.height, VideoFrame.TextureBuffer.Type.OES, rTCVideoFrame.textureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(rTCVideoFrame.transform), textureHelper, runnable);
                textureBufferImpl2.setEglBaseContext(textureHelper.getEglBaseContext());
                return new VideoFrame(textureBufferImpl2, rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
            }
        }
    }

    private void updateEglContext(EglBase eglBase, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGLBaseTextureHelper", eglBase.getEglBaseContext(), i, i2);
            this.glNativeHandle = eglBase.getEglBaseContext().getNativeEglContext();
            LogUtil.m147888i("VideoFrameConverter", "create EglBase texture helper");
        } else if (this.glNativeHandle != eglBase.getEglBaseContext().getNativeEglContext() || this.mTextureHelper.getWidth() != i || this.mTextureHelper.getHeight() != i2) {
            this.glNativeHandle = eglBase.getEglBaseContext().getNativeEglContext();
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGLBaseTextureHelper", eglBase.getEglBaseContext(), i, i2);
            LogUtil.m147888i("VideoFrameConverter", "update EglBase nativeHandle:" + this.glNativeHandle + " ,eglContext:" + eglBase + "frame size width:" + i + "height :" + i2);
        }
    }

    public void updateEglContext(EglBase.Context context, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGLBaseTextureHelper", context, i, i2);
            this.glNativeHandle = context.getNativeEglContext();
            LogUtil.m147888i("VideoFrameConverter", "create EglBase texture helper");
        } else if (this.glNativeHandle != context.getNativeEglContext() || this.mTextureHelper.getWidth() != i || this.mTextureHelper.getHeight() != i2) {
            this.glNativeHandle = context.getNativeEglContext();
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGLBaseTextureHelper", context, i, i2);
            LogUtil.m147888i("VideoFrameConverter", "update EglBase nativeHandle:" + this.glNativeHandle + " ,eglContext:" + context + "frame size width:" + i + "height :" + i2);
        }
    }
}
