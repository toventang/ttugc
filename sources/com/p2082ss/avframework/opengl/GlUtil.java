package com.p2082ss.avframework.opengl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.avframework.opengl.GlUtil */
public class GlUtil {
    private static int sFilterType = -1;

    protected static native int nativeAttachThreadToOpenGl(long j, int i, long j2);

    public static native void nativeDetachThreadToOpenGl();

    public static native boolean nativeIsOpenGlThread();

    private GlUtil() {
    }

    static {
        Covode.recordClassIndex(100666);
    }

    public static boolean nativeAttachThreadToOpenGl() {
        MethodCollector.m26663i(1381);
        if (nativeAttachThreadToOpenGl(GLThreadManager.getNativeEGLContext(), 0, 0) != 0) {
            MethodCollector.m26664o(1381);
            return true;
        }
        MethodCollector.m26664o(1381);
        return false;
    }

    public static int getFilterType(int i) {
        int i2 = sFilterType;
        if (i2 == 9729 || i2 == 9728) {
            return i2;
        }
        return i;
    }

    public static void setFilterType(int i) {
        if (i == 9729 || i == 9728) {
            sFilterType = i;
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new RuntimeException(str + ": GLES20 error: " + glGetError);
        }
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, (float) getFilterType(9729));
        GLES20.glTexParameterf(i, 10240, (float) getFilterType(9729));
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        GLES20.glPixelStorei(3317, 2);
        checkNoGLES2Error("generateTexture");
        return i2;
    }

    public static void checkAnyGLES2Error(String str) {
        int i = Build.VERSION.SDK_INT;
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new AndroidRuntimeException("EGL error: " + str + " (code :" + eglGetError + ")");
        } else if (EGL14.eglGetCurrentDisplay() == EGL14.EGL_NO_DISPLAY) {
            throw new AndroidRuntimeException("Bad EGL display:".concat(String.valueOf(str)));
        } else if (EGL14.eglGetCurrentContext() != EGL14.EGL_NO_CONTEXT) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                throw new AndroidRuntimeException("GLES error:" + str + " (code :" + glGetError + ")");
            }
        } else {
            throw new AndroidRuntimeException("Bad EGL context:".concat(String.valueOf(str)));
        }
    }
}
