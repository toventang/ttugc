package com.p2082ss.avframework.buffer;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.buffer.GlTextureFrameBuffer */
public class GlTextureFrameBuffer {
    private int frameBufferId;
    private int height;
    private final int pixelFormat;
    private int textureId;
    private int width;

    static {
        Covode.recordClassIndex(99827);
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        int i = this.frameBufferId;
        if (i > 0) {
            GLES20.glBindFramebuffer(36160, i);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        }
        int i2 = this.textureId;
        if (i2 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        }
        this.frameBufferId = 0;
        this.textureId = 0;
        this.width = 0;
        this.height = 0;
    }

    public GlTextureFrameBuffer(int i) {
        String str;
        switch (i) {
            case 6407:
            case 6408:
            case 6409:
                this.pixelFormat = i;
                try {
                    this.textureId = GlUtil.generateTexture(3553);
                } catch (Exception e) {
                    String str2 = "";
                    if (e.getMessage() != null) {
                        str = "exception:" + e.getMessage();
                    } else {
                        str = str2;
                    }
                    this.textureId = -1;
                    Thread currentThread = Thread.currentThread();
                    str2 = currentThread != null ? currentThread.getName() : str2;
                    String str3 = "none";
                    int i2 = Build.VERSION.SDK_INT;
                    try {
                        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                        if (eglGetCurrentContext != null) {
                            str3 = eglGetCurrentContext + " handle " + GLThreadManager.toNativeEGLContext(eglGetCurrentContext);
                        }
                    } catch (Exception e2) {
                        AVLog.ioe("OpenGL", "some error occurs:" + e2.getCause());
                    }
                    String a = C1764a.m5928a("[thread:%s context info:%s] create texture failed:%s", new Object[]{str3, str2, Log.getStackTraceString(new Throwable())});
                    AVLog.ioe("OpenGL", a);
                    int glGetError = GLES20.glGetError();
                    int i3 = 0;
                    while (glGetError != 0) {
                        str = str + ", error code:" + glGetError;
                        glGetError = GLES20.glGetError();
                        i3++;
                        if (i3 >= 10) {
                            AVLog.logKibana(6, "OpenGL", a + ", [opengl errors:" + str + "],loopCount:" + i3, null);
                        }
                    }
                    AVLog.logKibana(6, "OpenGL", a + ", [opengl errors:" + str + "],loopCount:" + i3, null);
                }
                if (this.textureId == -1) {
                    this.textureId = GlUtil.generateTexture(3553);
                }
                this.width = 0;
                this.height = 0;
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
                return;
            default:
                throw new IllegalArgumentException("Invalid pixel format: ".concat(String.valueOf(i)));
        }
    }

    public void setSize(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw new IllegalArgumentException("Invalid size: " + i + "x" + i2);
        } else if (i != this.width || i2 != this.height) {
            this.width = i;
            this.height = i2;
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.textureId);
            int i3 = this.pixelFormat;
            GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, null);
            GLES20.glBindTexture(3553, 0);
            GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, 0);
                return;
            }
            throw new IllegalStateException("Framebuffer not complete, status: ".concat(String.valueOf(glCheckFramebufferStatus)));
        }
    }
}
