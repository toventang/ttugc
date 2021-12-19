package com.p2082ss.bytertc.engine.utils;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlUtil;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;

/* renamed from: com.ss.bytertc.engine.utils.TextureHelper */
public class TextureHelper {
    public static float[] TEX_MATRIX = new float[16];
    public final EglBase mEglBase;
    public int mFrameBufferId;
    private final Handler mHandler;
    public int mHeight;
    public boolean mIsQuitting;
    private boolean mIsRelease;
    public boolean mIsTextureInUse;
    private int mTextureCnt;
    public GlRectDrawer mTextureDrawer;
    private List<Integer> mTextureFreeQueue = new LinkedList();
    private List<Integer> mTextureUsedQueue = new LinkedList();
    public int mWidth;
    public YuvConverter mYuvConverter;

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    static {
        Covode.recordClassIndex(101164);
    }

    public EglBase.Context getEglBaseContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public long getNativeEglContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext().getNativeEglContext();
        }
        return 0;
    }

    public final /* synthetic */ void lambda$dispose$7$TextureHelper() {
        this.mIsQuitting = true;
        if (!this.mIsTextureInUse) {
            release();
        }
    }

    public int dequeueTexture() {
        int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new TextureHelper$$Lambda$3(this, iArr));
        return iArr[0];
    }

    public synchronized void dispose() {
        MethodCollector.m26663i(498);
        LogUtil.m147885d("TextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new TextureHelper$$Lambda$7(this));
        MethodCollector.m26664o(498);
    }

    public void release() {
        if (this.mHandler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.mIsTextureInUse || !this.mIsQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            this.mIsRelease = true;
            YuvConverter yuvConverter = this.mYuvConverter;
            if (yuvConverter != null) {
                yuvConverter.release();
            }
            List<Integer> list = this.mTextureFreeQueue;
            if (list != null && list.size() > 0) {
                Iterator<Integer> it = this.mTextureFreeQueue.iterator();
                while (it.hasNext()) {
                    GLES20.glDeleteTextures(1, new int[]{it.next().intValue()}, 0);
                }
            }
            this.mTextureFreeQueue.clear();
            List<Integer> list2 = this.mTextureUsedQueue;
            if (list2 != null && list2.size() > 0) {
                Iterator<Integer> it2 = this.mTextureUsedQueue.iterator();
                while (it2.hasNext()) {
                    GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
                }
            }
            this.mTextureUsedQueue.clear();
            GLES20.glDeleteFramebuffers(1, new int[]{this.mFrameBufferId}, 0);
            this.mFrameBufferId = 0;
            this.mEglBase.release();
            this.mHandler.getLooper().quit();
        }
    }

    public void post(Runnable runnable) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    static final /* synthetic */ void lambda$releaseTextureID$5$TextureHelper(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    public void queueTexture(int i) {
        this.mHandler.post(new TextureHelper$$Lambda$4(this, i));
    }

    public void releaseTextureID(int i) {
        if (i > 0 && !this.mIsQuitting && !this.mIsRelease) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new TextureHelper$$Lambda$5(i));
        }
    }

    public synchronized VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        VideoFrame.I420Buffer i420Buffer;
        MethodCollector.m26663i(453);
        final VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.bytertc.engine.utils.TextureHelper.RunnableC861072 */

            static {
                Covode.recordClassIndex(101174);
            }

            public void run() {
                TextureHelper.this.mIsTextureInUse = true;
                if (TextureHelper.this.mYuvConverter == null) {
                    TextureHelper.this.mYuvConverter = new YuvConverter();
                }
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                i420BufferArr[0] = TextureHelper.this.mYuvConverter.convert(textureBuffer);
                TextureHelper.this.mIsTextureInUse = false;
                if (TextureHelper.this.mIsQuitting) {
                    TextureHelper.this.release();
                }
            }
        });
        i420Buffer = i420BufferArr[0];
        MethodCollector.m26664o(453);
        return i420Buffer;
    }

    public final /* synthetic */ void lambda$queueTexture$4$TextureHelper(int i) {
        List<Integer> list = this.mTextureUsedQueue;
        if (list != null && list.contains(Integer.valueOf(i))) {
            this.mTextureUsedQueue.remove(new Integer(i));
            List<Integer> list2 = this.mTextureFreeQueue;
            if (list2 != null) {
                list2.add(Integer.valueOf(i));
            }
        }
    }

    public final /* synthetic */ void lambda$dequeueTexture$3$TextureHelper(int[] iArr) {
        List<Integer> list = this.mTextureFreeQueue;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            iArr[0] = generateTexture(3553, this.mWidth, this.mHeight);
            if (iArr[0] > 0) {
                this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
                return;
            }
            return;
        }
        iArr[0] = this.mTextureFreeQueue.get(0).intValue();
        this.mTextureFreeQueue.remove(0);
        this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
    }

    public void drawTexture(final int i, final int i2, final int i3) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.bytertc.engine.utils.TextureHelper.RunnableC861061 */

            static {
                Covode.recordClassIndex(101173);
            }

            public void run() {
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                TextureHelper.this.mEglBase.makeCurrent();
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, TextureHelper.this.mFrameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
                int i = i;
                if (i == 10) {
                    TextureHelper.this.mTextureDrawer.drawRgb(i2, TextureHelper.TEX_MATRIX, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                } else if (i != 11) {
                    LogUtil.m147886e("TextureHelper", "draw texture type error");
                } else {
                    TextureHelper.this.mTextureDrawer.drawOes(i2, TextureHelper.TEX_MATRIX, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
            }
        });
    }

    private int generateTexture(int i, int i2, int i3) {
        if (this.mTextureCnt == 4) {
            return 0;
        }
        return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new TextureHelper$$Lambda$6(this, i, i2, i3))).intValue();
    }

    public final /* synthetic */ Integer lambda$generateTexture$6$TextureHelper(int i, int i2, int i3) {
        int generateTexture = GlUtil.generateTexture(i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, generateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        if (GLES20.glGetError() != 0) {
            return 0;
        }
        this.mTextureCnt++;
        return Integer.valueOf(generateTexture);
    }

    public static TextureHelper create(String str, EGLContext eGLContext, int i, int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new TextureHelper$$Lambda$1(eGLContext, handler, i, i2, str));
    }

    public static TextureHelper create(String str, javax.microedition.khronos.egl.EGLContext eGLContext, int i, int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new TextureHelper$$Lambda$0(eGLContext, handler, i, i2, str));
    }

    public static TextureHelper create(String str, EglBase.Context context, int i, int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new TextureHelper$$Lambda$2(context, handler, i, i2, str));
    }

    private TextureHelper(Object obj, Handler handler, int i, int i2) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mHandler = handler;
            Matrix.setIdentityM(TEX_MATRIX, 0);
            if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
                this.mEglBase = EglBase$$CC.createEgl10$$STATIC$$((javax.microedition.khronos.egl.EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
            } else if (obj instanceof EGLContext) {
                this.mEglBase = EglBase$$CC.createEgl14$$STATIC$$((EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
            } else if (obj instanceof EglBase.Context) {
                this.mEglBase = EglBase$$CC.create$$STATIC$$((EglBase.Context) obj);
            } else {
                throw new RuntimeException("unknown shareContext:".concat(String.valueOf(obj)));
            }
            try {
                this.mEglBase.createPbufferSurface(this.mWidth, this.mHeight);
                this.mEglBase.makeCurrent();
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.mFrameBufferId = iArr[0];
                this.mTextureDrawer = new GlRectDrawer();
                GlUtil.checkNoGLES2Error("TextureHelper construct");
            } catch (RuntimeException e) {
                this.mEglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("TextureHelper must be created on the handler thread");
        }
    }

    static final /* synthetic */ TextureHelper lambda$create$0$TextureHelper(javax.microedition.khronos.egl.EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m147887e("TextureHelper", str + " create failure", e);
            return null;
        }
    }

    static final /* synthetic */ TextureHelper lambda$create$1$TextureHelper(EGLContext eGLContext, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m147887e("TextureHelper", str + " create failure", e);
            return null;
        }
    }

    static final /* synthetic */ TextureHelper lambda$create$2$TextureHelper(EglBase.Context context, Handler handler, int i, int i2, String str) {
        try {
            return new TextureHelper(context, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m147887e("TextureHelper", str + " create failure", e);
            return null;
        }
    }
}
