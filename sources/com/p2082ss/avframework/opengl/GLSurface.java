package com.p2082ss.avframework.opengl;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.NativeObject;

/* renamed from: com.ss.avframework.opengl.GLSurface */
public class GLSurface extends NativeObject {
    static {
        Covode.recordClassIndex(100656);
    }

    public native boolean nativeDoneCurrent();

    public native boolean nativeMakeCurrent();

    public native boolean nativeMakeDefaultCurrent();

    public native boolean nativeSurfaceChanged(int i, int i2, int i3);

    public native boolean nativeSurfaceCreate(int i, int i2, Surface surface);

    public native boolean nativeSurfaceDestroy();

    public native void nativeSwapBuffers();

    public boolean surfaceDestroy() {
        MethodCollector.m26663i(2362);
        if (this.mNativeObj != 0) {
            boolean nativeSurfaceDestroy = nativeSurfaceDestroy();
            MethodCollector.m26664o(2362);
            return nativeSurfaceDestroy;
        }
        MethodCollector.m26664o(2362);
        return false;
    }
}
