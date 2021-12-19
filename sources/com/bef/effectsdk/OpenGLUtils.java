package com.bef.effectsdk;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.Locale;

public class OpenGLUtils {
    private static final String FAIL_RES = C1764a.m5929a(Locale.US, "{%s: false}", new Object[]{"\"res\""});

    /* renamed from: com_bef_effectsdk_OpenGLUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m7247x2e014886(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bef_effectsdk_OpenGLUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m7248x2e014887(String str, String str2) {
        return 0;
    }

    public static void saveBitmap(Bitmap bitmap, String str) {
    }

    static {
        Covode.recordClassIndex(2695);
    }

    public static int getExternalOESTextureID() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String str2 = str + ": glError 0x" + Integer.toHexString(glGetError);
            m7248x2e014887("GLES", str2);
            throw new RuntimeException(str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[SYNTHETIC, Splitter:B:14:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002b A[SYNTHETIC, Splitter:B:23:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmap(java.lang.String r4) {
        /*
            r3 = 5536(0x15a0, float:7.758E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0028, all -> 0x001e }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0028, all -> 0x001e }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0028, all -> 0x001e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0028, all -> 0x001e }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ Exception -> 0x0029, all -> 0x001b }
            r1.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r0
        L_0x001b:
            r0 = move-exception
            r2 = r1
            goto L_0x001f
        L_0x001e:
            r0 = move-exception
        L_0x001f:
            if (r2 == 0) goto L_0x0024
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.OpenGLUtils.loadBitmap(java.lang.String):android.graphics.Bitmap");
    }

    public static String loadTexture(String str) {
        MethodCollector.m26663i(5665);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            String str2 = FAIL_RES;
            MethodCollector.m26664o(5665);
            return str2;
        }
        int loadTexture = loadTexture(decodeFile, -1, false);
        String a = C1764a.m5929a(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", new Object[]{"\"res\"", "\"width\"", Integer.valueOf(decodeFile.getWidth()), "\"height\"", Integer.valueOf(decodeFile.getHeight()), "\"textureId\"", Integer.valueOf(loadTexture)});
        MethodCollector.m26664o(5665);
        return a;
    }

    public static int loadTexture(Bitmap bitmap, int i) {
        return loadTexture(bitmap, i, false);
    }

    public static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    private static int loadShader(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        m7248x2e014887("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }

    public static int loadProgram(String str, String str2) {
        int[] iArr = new int[1];
        int loadShader = loadShader(str, 35633);
        if (loadShader == 0) {
            m7247x2e014886("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int loadShader2 = loadShader(str2, 35632);
        if (loadShader2 == 0) {
            m7247x2e014886("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            m7247x2e014886("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(loadShader);
        GLES20.glDeleteShader(loadShader2);
        return glCreateProgram;
    }

    static Bitmap loadBitmap(FileDescriptor fileDescriptor, long j, long j2) {
        MethodCollector.m26663i(5539);
        FileInputStream createInputStream = new AssetFileDescriptor(ParcelFileDescriptor.dup(fileDescriptor), j, j2).createInputStream();
        try {
            return BitmapFactory.decodeStream(createInputStream);
        } finally {
            createInputStream.close();
            MethodCollector.m26664o(5539);
        }
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean z) {
        if (bitmap == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static void byte2Bitmap(byte[] bArr, int i, int i2, String str) {
        MethodCollector.m26663i(5533);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-16776961);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        saveBitmap(createBitmap, str);
        MethodCollector.m26664o(5533);
    }

    public static int initEffectTexture(int i, int i2, int[] iArr, int i3) {
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i3, iArr[0]);
        GLES20.glTexParameterf(i3, 10240, 9729.0f);
        GLES20.glTexParameterf(i3, 10241, 9729.0f);
        GLES20.glTexParameterf(i3, 10242, 33071.0f);
        GLES20.glTexParameterf(i3, 10243, 33071.0f);
        GLES20.glTexImage2D(i3, 0, 6408, i, i2, 0, 6408, 5121, null);
        return iArr[0];
    }

    public static Bitmap loadBitmap(byte[] bArr, int i, int i2, boolean z) {
        MethodCollector.m26663i(5663);
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = Build.VERSION.SDK_INT;
        options.inPremultiplied = z;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
        if (!(decodeByteArray == null || decodeByteArray.getConfig() == Bitmap.Config.ARGB_8888)) {
            decodeByteArray = decodeByteArray.copy(Bitmap.Config.ARGB_8888, true);
        }
        MethodCollector.m26664o(5663);
        return decodeByteArray;
    }
}
