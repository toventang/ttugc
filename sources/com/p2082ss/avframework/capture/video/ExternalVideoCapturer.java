package com.p2082ss.avframework.capture.video;

import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.JavaI420Buffer;
import com.p2082ss.avframework.buffer.RoiInfo;
import com.p2082ss.avframework.buffer.TextureBufferImpl;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.capture.video.VideoCapturer;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.opengl.YuvConverter;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.capture.video.ExternalVideoCapturer */
public class ExternalVideoCapturer extends VideoCapturer implements TextureBufferImpl.ToI420Interface {
    protected boolean mBufferAlreadyReturn = true;
    protected int mFps;
    public Handler mHandler;
    protected boolean mHorizontalMirror;
    public int mOutHeight;
    public int mOutWidth;
    public boolean mSigBufferMode;
    protected int mStatus;
    protected boolean mVerticalMirror;
    private VideoCapturer.VideoCapturerObserver mVideoCapturerObserver;
    public YuvConverter mYuvConverter;

    static {
        Covode.recordClassIndex(99870);
    }

    /* access modifiers changed from: protected */
    public void blockingWaitBufferReturn(String str) {
    }

    /* access modifiers changed from: protected */
    public boolean isSigBufferMode() {
        return this.mSigBufferMode;
    }

    @Override // com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    /* access modifiers changed from: protected */
    public void returnTexture() {
        this.mBufferAlreadyReturn = true;
        if (this.mStatus != 1) {
            stop();
        }
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public void stop() {
        this.mStatus = 2;
        VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mVideoCapturerObserver;
        if (videoCapturerObserver != null) {
            videoCapturerObserver.onVideoCapturerStoped();
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(2012);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856595 */

            static {
                Covode.recordClassIndex(99881);
            }

            public void run() {
                ExternalVideoCapturer.this.mStatus = 2;
                if (ExternalVideoCapturer.this.mYuvConverter != null) {
                    ExternalVideoCapturer.this.mYuvConverter.release();
                    ExternalVideoCapturer.this.mYuvConverter = null;
                }
            }
        });
        super.release();
        MethodCollector.m26664o(2012);
    }

    public void enableSigalMode(boolean z) {
        this.mSigBufferMode = z;
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mHorizontalMirror;
        }
        return this.mVerticalMirror;
    }

    @Override // com.p2082ss.avframework.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(final VideoFrame.TextureBuffer textureBuffer) {
        if (this.mStatus != 1) {
            return GetBlackFrameBuffer(textureBuffer.getWidth(), textureBuffer.getHeight());
        }
        final VideoFrame.I420Buffer[] i420BufferArr = {null};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856491 */

            static {
                Covode.recordClassIndex(99871);
            }

            public void run() {
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    i420BufferArr[0] = ExternalVideoCapturer.this.GetBlackFrameBuffer(textureBuffer.getWidth(), textureBuffer.getHeight());
                    return;
                }
                if (ExternalVideoCapturer.this.mYuvConverter == null) {
                    ExternalVideoCapturer.this.mYuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = ExternalVideoCapturer.this.mYuvConverter.convert(textureBuffer);
            }
        });
        return i420BufferArr[0];
    }

    public void enableMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
    }

    public ExternalVideoCapturer(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler) {
        this.mVideoCapturerObserver = videoCapturerObserver;
        this.mHandler = handler;
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        this.mOutHeight = i2;
        this.mOutWidth = i;
        this.mFps = i3;
        this.mStatus = 1;
        VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mVideoCapturerObserver;
        if (videoCapturerObserver != null) {
            videoCapturerObserver.onVideoCapturerStarted();
        }
    }

    public int pushVideoFrame(final ByteBuffer byteBuffer, final int i, final int i2, int i3, final long j, final long j2) {
        final JavaI420Buffer[] javaI420BufferArr = {null};
        final int i4 = (i + 1) / 2;
        int i5 = (i * i2) + 0;
        int i6 = ((i2 + 1) / 2) * i4;
        int i7 = i5 + i6;
        byteBuffer.position(0);
        byteBuffer.limit(i5);
        final ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i5);
        byteBuffer.limit(i7);
        final ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer.position(i7);
        byteBuffer.limit(i7 + i6);
        final ByteBuffer slice3 = byteBuffer.slice();
        final int[] iArr = {0};
        blockingWaitBufferReturn("Push ByteBuffer");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856502 */

            static {
                Covode.recordClassIndex(99872);
            }

            public void run() {
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    String str = "mStatus " + ExternalVideoCapturer.this.mStatus;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str)), null, "ExternalVideoCapturer.java:pushVideoFrame5: ".concat(String.valueOf(str)), 10000);
                    iArr[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    if (byteBuffer.isDirect()) {
                        JavaI420Buffer[] javaI420BufferArr = javaI420BufferArr;
                        int i = i;
                        int i2 = i2;
                        ByteBuffer byteBuffer = slice;
                        ByteBuffer byteBuffer2 = slice2;
                        int i3 = i4;
                        javaI420BufferArr[0] = JavaI420Buffer.wrap(i, i2, byteBuffer, i, byteBuffer2, i3, slice3, i3, j2, new Runnable() {
                            /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856502.RunnableC856511 */

                            static {
                                Covode.recordClassIndex(99873);
                            }

                            public void run() {
                                ExternalVideoCapturer.this.mHandler.post(new Runnable() {
                                    /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856502.RunnableC856511.RunnableC856521 */

                                    static {
                                        Covode.recordClassIndex(99874);
                                    }

                                    public void run() {
                                        ExternalVideoCapturer.this.mBufferAlreadyReturn = true;
                                    }
                                });
                            }
                        });
                    } else {
                        javaI420BufferArr[0] = JavaI420Buffer.allocate(i, i2);
                        javaI420BufferArr[0].getDataY().put(slice);
                        javaI420BufferArr[0].getDataU().put(slice2);
                        javaI420BufferArr[0].getDataV().put(slice3);
                        javaI420BufferArr[0].updateCaptureMs(j2);
                    }
                    if (javaI420BufferArr[0] == null) {
                        AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: buffer is null", null, "ExternalVideoCapturer.java:pushVideoFrame7", 10000);
                        iArr[0] = -3;
                        return;
                    }
                    ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                    iArr[0] = ExternalVideoCapturer.this.onFrame(javaI420BufferArr[0], i, i2, 0, j);
                    javaI420BufferArr[0].release();
                } else {
                    String str2 = "!mBufferAlreadyReturn " + (true ^ ExternalVideoCapturer.this.mBufferAlreadyReturn) + ", mSigBufferMode " + ExternalVideoCapturer.this.mSigBufferMode;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str2)), null, "ExternalVideoCapturer.java:pushVideoFrame6: ".concat(String.valueOf(str2)), 10000);
                    iArr[0] = -2;
                }
            }
        });
        return -1;
    }

    public int pushVideoFrame(final int i, final boolean z, final int i2, final int i3, final Matrix matrix, final long j, final Bundle bundle, final long j2) {
        final int[] iArr = {0};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856533 */

            static {
                Covode.recordClassIndex(99875);
            }

            public void run() {
                VideoFrame.TextureBuffer.Type type;
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    String str = "mStatus " + ExternalVideoCapturer.this.mStatus;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str)), null, "ExternalVideoCapturer.java:pushVideoFrame1: ".concat(String.valueOf(str)), 10000);
                    iArr[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    RoiInfo roiInfo = null;
                    if (bundle != null) {
                        roiInfo = new RoiInfo(((Integer) m147759xd74b4923(bundle, "roi_center_pos_x")).intValue(), ((Integer) m147759xd74b4923(bundle, "roi_center_pos_y")).intValue(), ((Integer) m147759xd74b4923(bundle, "roi_width")).intValue(), ((Integer) m147759xd74b4923(bundle, "roi_height")).intValue(), ((Float) m147759xd74b4923(bundle, "roi_yaw")).floatValue(), ((Float) m147759xd74b4923(bundle, "roi_pitch")).floatValue(), ((Float) m147759xd74b4923(bundle, "roi_roll")).floatValue());
                    }
                    if (z) {
                        type = VideoFrame.TextureBuffer.Type.OES;
                    } else {
                        type = VideoFrame.TextureBuffer.Type.RGB;
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i2, i3, type, i, matrix, this, new Runnable() {
                        /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856533.RunnableC856541 */

                        static {
                            Covode.recordClassIndex(99876);
                        }

                        public void run() {
                            ExternalVideoCapturer.this.mHandler.post(new Runnable() {
                                /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856533.RunnableC856541.RunnableC856551 */

                                static {
                                    Covode.recordClassIndex(99877);
                                }

                                public void run() {
                                    ExternalVideoCapturer.this.returnTexture();
                                }
                            });
                        }
                    });
                    textureBufferImpl.updateCaptureMs(j2);
                    textureBufferImpl.setROIInfo(roiInfo);
                    ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                    iArr[0] = ExternalVideoCapturer.this.onFrame(textureBufferImpl, i2, i3, 0, j);
                    textureBufferImpl.release();
                } else {
                    String str2 = "!mBufferAlreadyReturn " + (true ^ ExternalVideoCapturer.this.mBufferAlreadyReturn) + ", mSigBufferMode " + ExternalVideoCapturer.this.mSigBufferMode;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str2)), null, "ExternalVideoCapturer.java:pushVideoFrame2: ".concat(String.valueOf(str2)), 10000);
                    iArr[0] = -2;
                }
            }

            /* renamed from: com_ss_avframework_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
            public static Object m147759xd74b4923(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception | OutOfMemoryError unused) {
                    return null;
                }
            }
        });
        return iArr[0];
    }

    public int pushVideoFrame(final int i, final boolean z, final int i2, final int i3, final int i4, final float[] fArr, final long j, final Bundle bundle, final long j2) {
        final int[] iArr = {0};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856564 */

            static {
                Covode.recordClassIndex(99878);
            }

            public void run() {
                Matrix matrix;
                int i;
                float f;
                VideoFrame.TextureBuffer.Type type;
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    String str = "mStatus " + ExternalVideoCapturer.this.mStatus;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str)), null, "ExternalVideoCapturer.java:pushVideoFrame3: ".concat(String.valueOf(str)), 10000);
                    iArr[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    float[] fArr = fArr;
                    RoiInfo roiInfo = null;
                    if (fArr != null) {
                        matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
                    } else {
                        matrix = null;
                    }
                    int i2 = i4;
                    Matrix matrix2 = new Matrix();
                    matrix2.reset();
                    int i3 = i2;
                    int i4 = i3;
                    if (i2 % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
                        i = i4;
                    } else {
                        i = i3;
                        i3 = i4;
                    }
                    matrix2.preTranslate(0.5f, 0.5f);
                    matrix2.preRotate((float) (-i2));
                    float f2 = -1.0f;
                    if (ExternalVideoCapturer.this.mHorizontalMirror) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (!ExternalVideoCapturer.this.mVerticalMirror) {
                        f2 = 1.0f;
                    }
                    matrix2.preScale(f, f2);
                    matrix2.preTranslate(-0.5f, -0.5f);
                    if (matrix != null) {
                        matrix2.preConcat(matrix);
                    }
                    if (bundle != null) {
                        roiInfo = new RoiInfo(((Integer) m147760xc8f4ef42(bundle, "roi_center_pos_x")).intValue(), ((Integer) m147760xc8f4ef42(bundle, "roi_center_pos_y")).intValue(), ((Integer) m147760xc8f4ef42(bundle, "roi_width")).intValue(), ((Integer) m147760xc8f4ef42(bundle, "roi_height")).intValue(), ((Float) m147760xc8f4ef42(bundle, "roi_yaw")).floatValue(), ((Float) m147760xc8f4ef42(bundle, "roi_pitch")).floatValue(), ((Float) m147760xc8f4ef42(bundle, "roi_roll")).floatValue());
                    }
                    if (z) {
                        type = VideoFrame.TextureBuffer.Type.OES;
                    } else {
                        type = VideoFrame.TextureBuffer.Type.RGB;
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i, i3, type, i, matrix2, this, new Runnable() {
                        /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856564.RunnableC856571 */

                        static {
                            Covode.recordClassIndex(99879);
                        }

                        public void run() {
                            ExternalVideoCapturer.this.mHandler.post(new Runnable() {
                                /* class com.p2082ss.avframework.capture.video.ExternalVideoCapturer.RunnableC856564.RunnableC856571.RunnableC856581 */

                                static {
                                    Covode.recordClassIndex(99880);
                                }

                                public void run() {
                                    ExternalVideoCapturer.this.returnTexture();
                                }
                            });
                        }
                    });
                    textureBufferImpl.setROIInfo(roiInfo);
                    textureBufferImpl.updateCaptureMs(j2);
                    ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                    iArr[0] = ExternalVideoCapturer.this.onFrame(textureBufferImpl, i, i3, 0, j);
                    textureBufferImpl.release();
                } else {
                    String str2 = "!mBufferAlreadyReturn " + (true ^ ExternalVideoCapturer.this.mBufferAlreadyReturn) + ", mSigBufferMode " + ExternalVideoCapturer.this.mSigBufferMode;
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: ".concat(String.valueOf(str2)), null, "ExternalVideoCapturer.java:pushVideoFrame4: ".concat(String.valueOf(str2)), 10000);
                    iArr[0] = -2;
                }
            }

            /* renamed from: com_ss_avframework_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
            public static Object m147760xc8f4ef42(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception | OutOfMemoryError unused) {
                    return null;
                }
            }
        });
        return iArr[0];
    }
}
