package com.p2082ss.avframework.livestreamv2.core;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.GlTextureFrameBuffer;
import com.p2082ss.avframework.buffer.TextureBufferImpl;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.effect.EffectWrapper;
import com.p2082ss.avframework.livestreamv2.CanvasRenderView;
import com.p2082ss.avframework.livestreamv2.RenderView;
import com.p2082ss.avframework.livestreamv2.core.DirectVideoMixer;
import com.p2082ss.avframework.livestreamv2.core.IGameEngineExt;
import com.p2082ss.avframework.livestreamv2.core.ILayerControl;
import com.p2082ss.avframework.livestreamv2.core.ILayerControlExt;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.opengl.GlRenderDrawer;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.livestreamv2.core.LayerControl */
public class LayerControl implements View.OnTouchListener, ILayerControlExt {
    private static AtomicInteger mAtomicInteger = new AtomicInteger(0);
    private final String TAG = "LayerControl";
    private LayerEventListener mLayerEventListener;
    private List<ILayerControlExt.ILayerExt> mLayers;
    private String mOriginName;
    private RenderView mRenderView;
    private SurfaceHolder mSurfaceHolder;
    public DirectVideoMixer mVideoMixer;

    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$LayerEventListener */
    public interface LayerEventListener {
        static {
            Covode.recordClassIndex(100232);
        }

        void onHide();

        void onShow();

        boolean onTouch(View view, MotionEvent motionEvent);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer[] getLayers() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$GameLayer */
    public class GameLayer extends Layer {
        private EffectWrapper.AlgorithmResult mAlgorithmResult;
        public CountDownLatch mFrameFence = new CountDownLatch(1);
        private GlRenderDrawer mGlDrawer;
        private int mRandStreamId = LayerControl.getStreamId();
        private boolean mRelease = false;
        private TextureBufferImpl mTextureBuffer;
        private GlTextureFrameBuffer mTextureFrameBuffer;
        private IGameEngineExt.GameVideoSink mVideoSink;
        private int[] mYuvTex = {0, 0, 0};

        static {
            Covode.recordClassIndex(100225);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer
        public void dispose() {
        }

        public int getRtcId() {
            return this.mRandStreamId;
        }

        /* access modifiers changed from: private */
        /* renamed from: releaseTextureOnGlThread */
        public void lambda$release$2$LayerControl$GameLayer() {
            releaseYuvTexturesOnGlThread();
            GlRenderDrawer glRenderDrawer = this.mGlDrawer;
            if (glRenderDrawer != null) {
                glRenderDrawer.release();
                this.mGlDrawer = null;
            }
            GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
            if (glTextureFrameBuffer != null) {
                glTextureFrameBuffer.release();
                this.mTextureFrameBuffer = null;
            }
            this.mRelease = true;
        }

        private void releaseYuvTexturesOnGlThread() {
            int[] iArr = this.mYuvTex;
            if (iArr[0] > 0) {
                GLES20.glDeleteTextures(iArr.length, iArr, 0);
                int i = 0;
                while (true) {
                    int[] iArr2 = this.mYuvTex;
                    if (i < iArr2.length) {
                        iArr2[i] = 0;
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer
        public void release() {
            super.dispose();
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new LayerControl$GameLayer$$Lambda$2(this));
            EffectWrapper.AlgorithmResult algorithmResult = this.mAlgorithmResult;
            if (algorithmResult != null) {
                algorithmResult.release();
                this.mAlgorithmResult = null;
            }
        }

        public void setVideoFrameCallback(IGameEngineExt.GameVideoSink gameVideoSink) {
            this.mVideoSink = gameVideoSink;
        }

        private ByteBuffer toDirectBuffer(ByteBuffer byteBuffer) {
            if (byteBuffer == null || byteBuffer.isDirect()) {
                return byteBuffer;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            allocateDirect.put(byteBuffer);
            return allocateDirect;
        }

        private void createTexture(int i, int i2) {
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new LayerControl$GameLayer$$Lambda$1(this, i, i2));
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$createTexture$1$LayerControl$GameLayer(int i, int i2) {
            if (!this.mRelease) {
                if (this.mGlDrawer == null) {
                    this.mGlDrawer = new GlRenderDrawer();
                }
                GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
                if (glTextureFrameBuffer != null) {
                    glTextureFrameBuffer.setSize(i, i2);
                } else {
                    GlTextureFrameBuffer glTextureFrameBuffer2 = new GlTextureFrameBuffer(6408);
                    this.mTextureFrameBuffer = glTextureFrameBuffer2;
                    glTextureFrameBuffer2.setSize(i, i2);
                }
                int i3 = (i + 1) >> 1;
                int i4 = (i2 + 1) >> 1;
                releaseYuvTexturesOnGlThread();
                this.mYuvTex[0] = genTextureWithInit(33984, i, i2);
                this.mYuvTex[1] = genTextureWithInit(33985, i3, i4);
                this.mYuvTex[2] = genTextureWithInit(33986, i3, i4);
                this.mWidth = i;
                this.mHeight = i2;
            }
        }

        private boolean loadYuvAndDraw(ByteBuffer byteBuffer, int i, int i2) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (this.mTextureFrameBuffer == null || this.mGlDrawer == null || this.mYuvTex[0] <= 0) {
                return atomicBoolean.get();
            }
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), new LayerControl$GameLayer$$Lambda$0(this, byteBuffer, i, i2, atomicBoolean));
            return atomicBoolean.get();
        }

        private int genTextureWithInit(int i, int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glActiveTexture(i);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10241, (float) GlUtil.getFilterType(9729));
            GLES20.glTexParameterf(3553, 10240, (float) GlUtil.getFilterType(9729));
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, null);
            return iArr[0];
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$loadYuvAndDraw$0$LayerControl$GameLayer(ByteBuffer byteBuffer, int i, int i2, AtomicBoolean atomicBoolean) {
            if (!this.mRelease) {
                int i3 = i * i2;
                if (byteBuffer.capacity() >= (i3 * 3) / 2) {
                    int i4 = i3 / 4;
                    byteBuffer.position(0);
                    byteBuffer.limit(i3);
                    ByteBuffer slice = byteBuffer.slice();
                    byteBuffer.position(i3);
                    int i5 = i3 + i4;
                    byteBuffer.limit(i5);
                    ByteBuffer slice2 = byteBuffer.slice();
                    byteBuffer.position(i5);
                    byteBuffer.limit(i5 + i4);
                    updateI420Image(this.mYuvTex, i, i2, slice, slice2, byteBuffer.slice(), null);
                    this.mTextureFrameBuffer.setSize(i, i2);
                    GLES20.glBindFramebuffer(36160, this.mTextureFrameBuffer.getFrameBufferId());
                    this.mGlDrawer.drawYuv(this.mYuvTex, RendererCommon.identityMatrix(), RendererCommon.identityMatrix(), 0, 0, i, i2, 0);
                    GLES20.glFinish();
                    GLES20.glBindFramebuffer(36160, 0);
                    atomicBoolean.set(true);
                }
            }
        }

        public void onByteBufferVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
            onByteBufferVideoFrame(byteBuffer, i, i2, i3, j, null);
        }

        private void updateTexSubImage(int i, int i2, int i3, int i4, ByteBuffer byteBuffer) {
            GLES20.glActiveTexture(i);
            GLES20.glBindTexture(3553, i2);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
        }

        public GameLayer(String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
            super(str, i, i2, videoMixerDescription);
        }

        public void onTextureVideoFrame(int i, int i2, int i3, float[] fArr, int i4, long j) {
            onTextureVideoFrame(i, i2, i3, fArr, i4, j, null);
        }

        private void drawYuvAndRender(ByteBuffer byteBuffer, int i, int i2, int i3, long j, ByteBuffer byteBuffer2) {
            GlTextureFrameBuffer glTextureFrameBuffer;
            if (loadYuvAndDraw(byteBuffer, i, i2) && (glTextureFrameBuffer = this.mTextureFrameBuffer) != null) {
                onTextureVideoFrame(glTextureFrameBuffer.getTextureId(), i, i2, null, i3, j, byteBuffer2);
            }
        }

        public void onByteBufferVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, ByteBuffer byteBuffer2) {
            if (!(this.mGlDrawer != null && i == this.mWidth && i2 == this.mHeight)) {
                createTexture(i, i2);
            }
            drawYuvAndRender(toDirectBuffer(byteBuffer), i, i2, i3, j, toDirectBuffer(byteBuffer2));
        }

        private void updateI420Image(int[] iArr, int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int[] iArr2) {
            int i3 = (i + 1) >> 1;
            int i4 = (i2 + 1) >> 1;
            updateTexSubImage(33984, iArr[0], i, i2, byteBuffer);
            updateTexSubImage(33985, iArr[1], i3, i4, byteBuffer2);
            updateTexSubImage(33986, iArr[2], i3, i4, byteBuffer3);
        }

        public void onTextureVideoFrame(int i, int i2, int i3, float[] fArr, int i4, long j, ByteBuffer byteBuffer) {
            VideoFrame videoFrame;
            renderFrame(new VideoMixer.VideoMixerTexture(i2, i3, LiveFeedRefreshTimeSetting.DEFAULT, VideoMixer.TEXTURE_TYPE_2D, new int[]{i, 0, 0}, null));
            if (this.mVideoSink != null && !this.mRelease) {
                TextureBufferImpl textureBufferImpl = this.mTextureBuffer;
                if (textureBufferImpl == null || textureBufferImpl.getTextureId() != i) {
                    this.mTextureBuffer = new TextureBufferImpl(i2, i3, VideoFrame.TextureBuffer.Type.RGB, i, new Matrix(), new TextureBufferImpl.ToI420Interface() {
                        /* class com.p2082ss.avframework.livestreamv2.core.LayerControl.GameLayer.C857931 */

                        static {
                            Covode.recordClassIndex(100229);
                        }

                        @Override // com.p2082ss.avframework.buffer.TextureBufferImpl.ToI420Interface
                        public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
                            return null;
                        }
                    }, new Runnable() {
                        /* class com.p2082ss.avframework.livestreamv2.core.LayerControl.GameLayer.RunnableC857942 */

                        static {
                            Covode.recordClassIndex(100230);
                        }

                        public void run() {
                            GameLayer.this.mFrameFence.countDown();
                        }
                    });
                    videoFrame = new VideoFrame(this.mTextureBuffer, 0, j * 1000 * 1000);
                } else {
                    this.mTextureBuffer.retain();
                    this.mFrameFence = new CountDownLatch(1);
                    videoFrame = new VideoFrame(this.mTextureBuffer, 0, j * 1000 * 1000);
                }
                if (byteBuffer != null) {
                    EffectWrapper.AlgorithmResult parseParcel = EffectWrapper.AlgorithmResult.parseParcel(i2, i3, toDirectBuffer(byteBuffer), this.mAlgorithmResult);
                    this.mTextureBuffer.updateExtraData(parseParcel);
                    if (parseParcel != null) {
                        this.mAlgorithmResult = parseParcel;
                    }
                }
                this.mVideoSink.onVideoFrame(this.mRandStreamId, videoFrame, 2);
                videoFrame.release();
                try {
                    this.mFrameFence.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$Layer */
    public class Layer implements ILayerControlExt.ILayerExt {
        private int mAnimationMode;
        private FrameAnimationBase mCurrentAnimation;
        private boolean mFirstFrame = true;
        protected int mHeight;
        protected String mName;
        private FrameAnimationBase mNextAnimation;
        protected boolean mPause;
        protected int mTrackId;
        protected VideoMixer.VideoMixerDescription mVideoMixerDescription;
        protected int mWidth;

        static {
            Covode.recordClassIndex(100231);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public int getRealFps() {
            return 0;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public Canvas lockCanvas() {
            return null;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void pause() {
            this.mPause = true;
        }

        public void release() {
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void resume() {
            this.mPause = false;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void unlockCanvasAndPost(Canvas canvas, long j) {
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public int getHeight() {
            return this.mHeight;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public VideoMixer.VideoMixerDescription getLayerDescription() {
            return this.mVideoMixerDescription;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public int getWidth() {
            return this.mWidth;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public String name() {
            return this.mName;
        }

        /* access modifiers changed from: protected */
        public void createMixerTrack() {
            if (LayerControl.this.mVideoMixer != null) {
                this.mTrackId = LayerControl.this.mVideoMixer.createTrack();
                this.mVideoMixerDescription = LayerControl.this.mVideoMixer.getDescription(this.mTrackId);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void dispose() {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.removeTrack(this.mTrackId);
                LayerControl.this.removeLayer(this);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public int getMixerOutHeight() {
            if (LayerControl.this.mVideoMixer != null) {
                return LayerControl.this.mVideoMixer.getHeight();
            }
            return -1;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public int getMixerOutWidth() {
            if (LayerControl.this.mVideoMixer != null) {
                return LayerControl.this.mVideoMixer.getWidth();
            }
            return -1;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public boolean isEnable() {
            if (LayerControl.this.mVideoMixer == null || !LayerControl.this.mVideoMixer.isEnable(this.mTrackId)) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void setVisibility(int i) {
            throw new AndroidRuntimeException("Support later version");
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void setEnable(boolean z) {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.setEnable(this.mTrackId, z);
            }
        }

        private void animationUpdateOnPerFrame(VideoFrame videoFrame) {
            if (this.mNextAnimation != null) {
                FrameAnimationBase frameAnimationBase = this.mCurrentAnimation;
                if (frameAnimationBase != null) {
                    frameAnimationBase.restore();
                    this.mCurrentAnimation = null;
                }
                this.mCurrentAnimation = this.mNextAnimation;
                this.mNextAnimation = null;
            }
            FrameAnimationBase frameAnimationBase2 = this.mCurrentAnimation;
            if (frameAnimationBase2 == null) {
                return;
            }
            if (frameAnimationBase2.valid()) {
                this.mCurrentAnimation.update(videoFrame);
                return;
            }
            this.mCurrentAnimation.restore();
            this.mCurrentAnimation = null;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoFrame videoFrame) {
            animationUpdateOnPerFrame(videoFrame);
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (this.mFirstFrame) {
                updateFrameInfo(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                this.mFirstFrame = false;
            }
            if (!this.mPause && directVideoMixer != null) {
                directVideoMixer.onFrame(this.mTrackId, videoFrame);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
            VideoMixer.VideoMixerDescription videoMixerDescription2;
            MethodCollector.m26663i(2078);
            if (!(videoMixerDescription == null || (videoMixerDescription2 = this.mVideoMixerDescription) == null)) {
                videoMixerDescription2.copy(videoMixerDescription);
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (directVideoMixer != null) {
                    synchronized (directVideoMixer) {
                        try {
                            directVideoMixer.updateDescription(this.mTrackId, this.mVideoMixerDescription);
                        } finally {
                            MethodCollector.m26664o(2078);
                        }
                    }
                    return;
                }
            }
            MethodCollector.m26664o(2078);
        }

        private void animationUpdateOnPerFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            if (this.mNextAnimation != null) {
                FrameAnimationBase frameAnimationBase = this.mCurrentAnimation;
                if (frameAnimationBase != null) {
                    frameAnimationBase.restore();
                    this.mCurrentAnimation = null;
                }
                this.mCurrentAnimation = this.mNextAnimation;
                this.mNextAnimation = null;
            }
            FrameAnimationBase frameAnimationBase2 = this.mCurrentAnimation;
            if (frameAnimationBase2 == null) {
                return;
            }
            if (frameAnimationBase2.valid()) {
                this.mCurrentAnimation.update(videoMixerTexture);
                return;
            }
            this.mCurrentAnimation.restore();
            this.mCurrentAnimation = null;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            animationUpdateOnPerFrame(videoMixerTexture);
            if (this.mFirstFrame) {
                updateFrameInfo(videoMixerTexture.getWidth(), videoMixerTexture.getHeight());
                this.mFirstFrame = false;
            }
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (!this.mPause && directVideoMixer != null) {
                directVideoMixer.onFrame(this.mTrackId, videoMixerTexture);
            }
        }

        private void updateFrameInfo(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer
        public void setAnimationMode(int i, long j, RectF rectF) {
            this.mNextAnimation = FrameAnimationFactory.create(i, this, j, rectF, 30);
            this.mAnimationMode = i;
        }

        public Layer(String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
            this.mName = str;
            this.mWidth = i;
            this.mHeight = i2;
            createMixerTrack();
            updateDescription(videoMixerDescription);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public RenderView getRenderView() {
        return this.mRenderView;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceHolder;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public VideoMixer getVideoMixer() {
        return this.mVideoMixer;
    }

    public static int getStreamId() {
        return mAtomicInteger.incrementAndGet();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer getLocalOriginLayer() {
        return findLayer(this.mOriginName);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl
    public int layerSize() {
        return this.mLayers.size();
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public void pause() {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            layerEventListener.onHide();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public void resume() {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            layerEventListener.onShow();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$DirectLayer */
    public class DirectLayer extends Layer {
        static {
            Covode.recordClassIndex(100224);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer
        public void createMixerTrack() {
            this.mTrackId = -1;
            this.mVideoMixerDescription = VideoMixer.VideoMixerDescription.FILL();
            setEnable(false);
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer
        public void dispose() {
            if (LayerControl.this.mVideoMixer != null) {
                LayerControl.this.mVideoMixer.enableDirectRender(false);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer
        public boolean isEnable() {
            if (this.mVideoMixerDescription == null || (this.mVideoMixerDescription.flags & 8) != 0) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer, com.p2082ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoMixer.VideoMixerTexture videoMixerTexture) {
            throw new AndroidRuntimeException("later support");
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer
        public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
            if (videoMixerDescription != null) {
                this.mVideoMixerDescription.copy(videoMixerDescription);
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer, com.p2082ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt
        public void renderFrame(VideoFrame videoFrame) {
            if (isEnable()) {
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (!this.mPause && directVideoMixer != null) {
                    directVideoMixer.onDirectFrame(videoFrame);
                }
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl.ILayer, com.p2082ss.avframework.livestreamv2.core.LayerControl.Layer
        public void setEnable(boolean z) {
            if (this.mVideoMixerDescription != null) {
                if (z) {
                    this.mVideoMixerDescription.flags &= -9;
                } else {
                    this.mVideoMixerDescription.flags |= 8;
                }
            }
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.enableDirectRender(z);
            }
        }

        public DirectLayer(String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
            super(str, i, i2, videoMixerDescription);
        }
    }

    static {
        Covode.recordClassIndex(100222);
    }

    private void releaseSurface() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            this.mSurfaceHolder = null;
            renderView.release();
            this.mRenderView = null;
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl
    public float getRealRenderFps() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.getRealRatePerSeconds();
        }
        return 0.0f;
    }

    public boolean isDirectRenderMode() {
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            return directVideoMixer.isDirectRenderMode();
        }
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public boolean isFitMode() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isFitMode();
        }
        return false;
    }

    LayerControl() {
        AVLog.ioi("LayerControl", "Construct ".concat(String.valueOf(this)));
        this.mLayers = new ArrayList();
    }

    public void dump() {
        MethodCollector.m26663i(2930);
        synchronized (this.mLayers) {
            try {
                for (ILayerControlExt.ILayerExt iLayerExt : this.mLayers) {
                    AVLog.ioi("LayerControl", "Dump Layer(name:" + iLayerExt.name() + ",w:" + iLayerExt.getWidth() + ",h:" + iLayerExt.getHeight() + "," + iLayerExt.getLayerDescription().toString());
                }
            } finally {
                MethodCollector.m26664o(2930);
            }
        }
    }

    public void release() {
        MethodCollector.m26663i(2944);
        AVLog.ioi("LayerControl", "Release ".concat(String.valueOf(this)));
        dump();
        synchronized (this.mLayers) {
            try {
                Iterator<ILayerControlExt.ILayerExt> it = this.mLayers.iterator();
                while (it.hasNext()) {
                    ((Layer) it.next()).release();
                }
                this.mLayers.clear();
            } finally {
                MethodCollector.m26664o(2944);
            }
        }
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.release();
            this.mRenderView = null;
        }
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            synchronized (directVideoMixer) {
                try {
                    this.mVideoMixer.release();
                    this.mVideoMixer = null;
                } finally {
                    MethodCollector.m26664o(2944);
                }
            }
            return;
        }
        MethodCollector.m26664o(2944);
    }

    public void setEventListener(LayerEventListener layerEventListener) {
        this.mLayerEventListener = layerEventListener;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public void setLocalOrigin(String str) {
        this.mOriginName = str;
    }

    private void removeLayer(String str) {
        removeLayer(findLayer(str));
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer getLayer(String str) {
        return findLayer(str);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public void setFitMode(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setFitMode(z);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public boolean isMirror(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isMirror(z);
        }
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl
    public void setOriginTriggering(String str) {
        ILayerControlExt.ILayerExt findLayer = findLayer(str);
        if (findLayer != null) {
            this.mVideoMixer.setOriginTrackIndex(((Layer) findLayer).mTrackId);
        }
    }

    private ILayerControlExt.ILayerExt findLayer(String str) {
        MethodCollector.m26663i(1882);
        if (str == null) {
            MethodCollector.m26664o(1882);
            return null;
        }
        synchronized (this.mLayers) {
            try {
                for (ILayerControlExt.ILayerExt iLayerExt : this.mLayers) {
                    if (iLayerExt.name().equals(str)) {
                        return iLayerExt;
                    }
                }
                MethodCollector.m26664o(1882);
                return null;
            } finally {
                MethodCollector.m26664o(1882);
            }
        }
    }

    private void addLayer(ILayerControlExt.ILayerExt iLayerExt) {
        MethodCollector.m26663i(1869);
        synchronized (this.mLayers) {
            try {
                AVLog.ioi("LayerControl", "Create Layer(name:" + iLayerExt.name() + ",w:" + iLayerExt.getWidth() + ",h:" + iLayerExt.getHeight() + ")");
                if (!this.mLayers.contains(iLayerExt)) {
                    this.mLayers.add(iLayerExt);
                } else {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
                    MethodCollector.m26664o(1869);
                    throw androidRuntimeException;
                }
            } finally {
                MethodCollector.m26664o(1869);
            }
        }
    }

    public void removeLayer(ILayerControlExt.ILayerExt iLayerExt) {
        MethodCollector.m26663i(2906);
        if (iLayerExt != null) {
            synchronized (this.mLayers) {
                try {
                    AVLog.ioi("LayerControl", "Remove Layer(name:" + iLayerExt.name() + ",w:" + iLayerExt.getWidth() + ",h:" + iLayerExt.getHeight() + ")");
                    this.mLayers.remove(iLayerExt);
                } finally {
                    MethodCollector.m26664o(2906);
                }
            }
            return;
        }
        MethodCollector.m26664o(2906);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public void setMirror(boolean z, boolean z2) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setMirror(z, z2);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        LayerEventListener layerEventListener = this.mLayerEventListener;
        if (layerEventListener != null) {
            return layerEventListener.onTouch(view, motionEvent);
        }
        return false;
    }

    public void setDisplay(View view, long j) {
        RenderView canvasRenderView;
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer == null) {
            DirectVideoMixer directVideoMixer2 = new DirectVideoMixer();
            this.mVideoMixer = directVideoMixer2;
            directVideoMixer2.setEnable(false);
            directVideoMixer = this.mVideoMixer;
        }
        if (view == null) {
            directVideoMixer.updateView(null);
            releaseSurface();
            return;
        }
        if ((j & 1) != 0) {
            canvasRenderView = new DirectVideoMixer.SurfaceViewWithoutCallback(view, directVideoMixer);
        } else if ((j & 16) == 0 && (j & 32) == 0 && (j & 64) == 0 && (j & 128) == 0) {
            canvasRenderView = new DirectVideoMixer.MixerRenderView(view, directVideoMixer);
        } else if (view instanceof SurfaceView) {
            canvasRenderView = new CanvasRenderView((SurfaceView) view);
        } else {
            throw new AndroidRuntimeException("BUG!Can only support canvas render for SurfaceView");
        }
        if ((j & 2) == 0 && (j & 32) == 0) {
            canvasRenderView.setFitMode(false);
        } else {
            canvasRenderView.setFitMode(true);
        }
        if ((j & 4) == 0 && (j & 64) == 0) {
            canvasRenderView.setMirror(false, true);
        } else {
            canvasRenderView.setMirror(true, true);
        }
        if ((j & 8) == 0 && (j & 128) == 0) {
            canvasRenderView.setMirror(false, false);
        } else {
            canvasRenderView.setMirror(true, false);
        }
        if (view instanceof SurfaceView) {
            this.mSurfaceHolder = ((SurfaceView) view).getHolder();
        }
        directVideoMixer.updateView(canvasRenderView);
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.release();
        }
        this.mRenderView = canvasRenderView;
        view.setOnTouchListener(this);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControl
    public ILayerControl.ILayer createLayer(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i, int i2) {
        return createLayerExt(str, videoMixerDescription, i, i2, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer */
    public class CanvasLayer extends Layer {
        static {
            Covode.recordClassIndex(100223);
        }

        public CanvasLayer(String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
            super(str, i, i2, videoMixerDescription);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.ILayerControlExt
    public ILayerControlExt.ILayerExt createLayerExt(String str, VideoMixer.VideoMixerDescription videoMixerDescription, int i, int i2, int i3) {
        ILayerControlExt.ILayerExt canvasLayer;
        if (findLayer(str) != null) {
            InvalidParameterException invalidParameterException = new InvalidParameterException("Layer name '" + str + "' already exist.");
            AVLog.ioe("LayerControl", invalidParameterException.getMessage(), invalidParameterException);
            return null;
        }
        if (i3 == 1) {
            canvasLayer = new CanvasLayer(str, i, i2, videoMixerDescription);
        } else if (i3 == 3) {
            canvasLayer = new GameLayer(str, i, i2, videoMixerDescription);
        } else if (i3 != 4) {
            canvasLayer = new Layer(str, i, i2, videoMixerDescription);
        } else {
            canvasLayer = new DirectLayer(str, i, i2, videoMixerDescription);
        }
        addLayer(canvasLayer);
        return canvasLayer;
    }
}
