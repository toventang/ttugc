package com.p2082ss.bytertc.base.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.bytertc.base.media.RTCSurfaceHelper */
public class RTCSurfaceHelper {
    static {
        Covode.recordClassIndex(100852);
    }

    /* renamed from: com.ss.bytertc.base.media.RTCSurfaceHelper$RTCSurfaceTextureListener */
    static class RTCSurfaceTextureListener implements TextureView.SurfaceTextureListener {
        private long nativeCallbackHandle;
        private Surface surface;

        static {
            Covode.recordClassIndex(100853);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void resetCallback() {
            this.nativeCallbackHandle = 0;
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            MethodCollector.m26663i(494);
            long j = this.nativeCallbackHandle;
            if (j != 0) {
                RTCNativeFunctions.nativeNotifySurfaceDestroyed(j, this.surface, true);
            }
            this.surface = null;
            MethodCollector.m26664o(494);
            return true;
        }

        RTCSurfaceTextureListener(SurfaceTexture surfaceTexture, long j) {
            Surface surface2;
            MethodCollector.m26663i(490);
            if (surfaceTexture != null) {
                surface2 = new Surface(surfaceTexture);
            } else {
                surface2 = null;
            }
            this.surface = surface2;
            this.nativeCallbackHandle = j;
            if (!(surface2 == null || j == 0)) {
                RTCNativeFunctions.nativeNotifySurfaceAvailable(j, surface2, true);
            }
            MethodCollector.m26664o(490);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            MethodCollector.m26663i(491);
            if (this.nativeCallbackHandle != 0) {
                Surface surface2 = new Surface(surfaceTexture);
                this.surface = surface2;
                RTCNativeFunctions.nativeNotifySurfaceAvailable(this.nativeCallbackHandle, surface2, true);
            }
            MethodCollector.m26664o(491);
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            MethodCollector.m26663i(492);
            long j = this.nativeCallbackHandle;
            if (j != 0) {
                RTCNativeFunctions.nativeNotifySurfaceSizeChanged(j);
            }
            MethodCollector.m26664o(492);
        }
    }

    /* renamed from: com.ss.bytertc.base.media.RTCSurfaceHelper$RTCSurfaceViewListener */
    static class RTCSurfaceViewListener implements SurfaceHolder.Callback {
        private long nativeCallbackHandle;
        private Surface surface;

        static {
            Covode.recordClassIndex(100854);
        }

        public void resetCallback() {
            this.nativeCallbackHandle = 0;
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            MethodCollector.m26663i(565);
            if (this.nativeCallbackHandle != 0) {
                Surface surface2 = surfaceHolder.getSurface();
                this.surface = surface2;
                RTCNativeFunctions.nativeNotifySurfaceAvailable(this.nativeCallbackHandle, surface2, false);
            }
            MethodCollector.m26664o(565);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            MethodCollector.m26663i(568);
            long j = this.nativeCallbackHandle;
            if (j != 0) {
                RTCNativeFunctions.nativeNotifySurfaceDestroyed(j, surfaceHolder.getSurface(), false);
            }
            this.surface = null;
            MethodCollector.m26664o(568);
        }

        RTCSurfaceViewListener(Surface surface2, long j) {
            MethodCollector.m26663i(524);
            this.surface = surface2;
            this.nativeCallbackHandle = j;
            if (!(surface2 == null || j == 0)) {
                RTCNativeFunctions.nativeNotifySurfaceAvailable(j, surface2, false);
            }
            MethodCollector.m26664o(524);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            MethodCollector.m26663i(566);
            long j = this.nativeCallbackHandle;
            if (j != 0) {
                RTCNativeFunctions.nativeNotifySurfaceSizeChanged(j);
            }
            MethodCollector.m26664o(566);
        }
    }

    public static Object registerSurfaceCallback(Object obj, long j) {
        if (obj instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) obj;
            RTCSurfaceViewListener rTCSurfaceViewListener = new RTCSurfaceViewListener(surfaceView.getHolder().getSurface(), j);
            surfaceView.getHolder().addCallback(rTCSurfaceViewListener);
            return rTCSurfaceViewListener;
        } else if (!(obj instanceof TextureView)) {
            return null;
        } else {
            TextureView textureView = (TextureView) obj;
            RTCSurfaceTextureListener rTCSurfaceTextureListener = new RTCSurfaceTextureListener(textureView.getSurfaceTexture(), j);
            textureView.setSurfaceTextureListener(rTCSurfaceTextureListener);
            return rTCSurfaceTextureListener;
        }
    }

    public static void unRegisterSurfaceCallback(View view, Object obj) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            if (obj != null) {
                ((RTCSurfaceTextureListener) obj).resetCallback();
            }
            textureView.setSurfaceTextureListener(null);
        } else if (view instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) view;
            if (obj != null) {
                ((RTCSurfaceViewListener) obj).resetCallback();
            }
            surfaceView.getHolder().removeCallback((SurfaceHolder.Callback) obj);
        }
    }
}
