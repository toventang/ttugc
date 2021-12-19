package com.p2082ss.avframework.buffer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.SurfaceTextureHelper;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.ThreadUtils;

/* renamed from: com.ss.avframework.buffer.SurfaceTextureSharedHandler */
public class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
    public static final String TAG = SurfaceTextureSharedHandler.class.getSimpleName();
    private SurfaceInternal surface;

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.buffer.SurfaceTextureHelper
    public void handlerExit() {
    }

    /* renamed from: com.ss.avframework.buffer.SurfaceTextureSharedHandler$SurfaceInternal */
    public static class SurfaceInternal extends Surface implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
        private final int mHeight;
        private SurfaceTextureHelper.OnTextureFrameAvailableListener mListerne;
        private SurfaceTextureSharedHandler mParent;
        private final int mWidth;

        static {
            Covode.recordClassIndex(99847);
        }

        public int getHeight() {
            return this.mHeight;
        }

        public SurfaceTextureHelper getSurfaceTextureHelper() {
            return this.mParent;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public void release() {
            super.release();
            SurfaceTextureSharedHandler surfaceTextureSharedHandler = this.mParent;
            if (surfaceTextureSharedHandler != null) {
                surfaceTextureSharedHandler.dispose();
                this.mParent = null;
            }
            AVLog.iow(SurfaceTextureSharedHandler.TAG, "Release surface " + this + " with w " + this.mWidth + " h " + this.mHeight);
        }

        public void setListener(SurfaceTextureHelper.OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
            this.mListerne = onTextureFrameAvailableListener;
        }

        @Override // com.p2082ss.avframework.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
        public void onTextureFrameAvailable(int i, float[] fArr, long j) {
            SurfaceTextureHelper.OnTextureFrameAvailableListener onTextureFrameAvailableListener = this.mListerne;
            if (onTextureFrameAvailableListener != null) {
                onTextureFrameAvailableListener.onTextureFrameAvailable(i, fArr, j);
            }
            this.mParent.returnTextureFrame();
        }

        public SurfaceInternal(SurfaceTexture surfaceTexture, SurfaceTextureSharedHandler surfaceTextureSharedHandler, int i, int i2) {
            super(surfaceTexture);
            this.mParent = surfaceTextureSharedHandler;
            surfaceTextureSharedHandler.startListening(this);
            this.mWidth = i;
            this.mHeight = i2;
        }
    }

    static {
        Covode.recordClassIndex(99845);
    }

    @Override // com.p2082ss.avframework.buffer.SurfaceTextureHelper
    public void dispose() {
        super.dispose();
        GLThreadManager.get().decrementRef();
    }

    public SurfaceTextureSharedHandler(Handler handler) {
        super(handler, true);
    }

    public static Surface createSurface(int i, int i2) {
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager == null) {
            return null;
        }
        gLThreadManager.addRef();
        final Handler mainGlHandle = GLThreadManager.getMainGlHandle();
        final SurfaceTextureSharedHandler[] surfaceTextureSharedHandlerArr = new SurfaceTextureSharedHandler[1];
        ThreadUtils.invokeAtFrontUninterruptibly(mainGlHandle, new Runnable() {
            /* class com.p2082ss.avframework.buffer.SurfaceTextureSharedHandler.RunnableC856441 */

            static {
                Covode.recordClassIndex(99846);
            }

            public final void run() {
                surfaceTextureSharedHandlerArr[0] = new SurfaceTextureSharedHandler(mainGlHandle);
            }
        });
        return surfaceTextureSharedHandlerArr[0].getSurface(i, i2);
    }

    public synchronized Surface getSurface(int i, int i2) {
        SurfaceInternal surfaceInternal;
        MethodCollector.m26663i(2166);
        if (this.surface == null) {
            int i3 = Build.VERSION.SDK_INT;
            getSurfaceTexture().setDefaultBufferSize(i, i2);
            this.surface = new SurfaceInternal(getSurfaceTexture(), this, i, i2);
            AVLog.iow(TAG, "Create surface " + this.surface + " with w " + i + " h " + i2 + " tex " + getTextureId());
        }
        surfaceInternal = this.surface;
        MethodCollector.m26664o(2166);
        return surfaceInternal;
    }
}
