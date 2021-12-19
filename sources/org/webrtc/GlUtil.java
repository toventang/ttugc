package org.webrtc;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GlUtil {
    static {
        Covode.recordClassIndex(106643);
    }

    public static int org_webrtc_GlUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int org_webrtc_GlUtil_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    private GlUtil() {
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void clearGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            org_webrtc_GlUtil_com_ss_android_ugc_aweme_lancet_LogLancet_w("clearGLES2Error", str + "clear opengl error: " + glGetError);
            RXLogging.m41315w("clearGLES2Error", str + "clear opengl error: " + glGetError);
        }
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i2;
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            org_webrtc_GlUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("checkNoGLES2Error", str + "error: " + glGetError);
            RXLogging.m41311e("checkNoGLES2Error", str + "error: " + glGetError);
            throw new RuntimeException(str + ": GLES20 error: " + glGetError);
        }
    }
}
