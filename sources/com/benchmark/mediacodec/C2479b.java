package com.benchmark.mediacodec;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.benchmark.mediacodec.b */
public class C2479b {

    /* renamed from: a */
    public static String f7450a = C2479b.class.getSimpleName();

    /* renamed from: b */
    public static boolean f7451b = true;

    /* renamed from: c */
    public static String f7452c;

    /* renamed from: f */
    private static String f7453f = "video/avc";

    /* renamed from: A */
    private int f7454A;

    /* renamed from: d */
    public Object f7455d;

    /* renamed from: e */
    public boolean f7456e;

    /* renamed from: g */
    private int f7457g;

    /* renamed from: h */
    private int f7458h;

    /* renamed from: i */
    private MediaFormat f7459i;

    /* renamed from: j */
    private boolean f7460j;

    /* renamed from: k */
    private int[] f7461k;

    /* renamed from: l */
    private SurfaceTexture f7462l;

    /* renamed from: m */
    private Surface f7463m;

    /* renamed from: n */
    private C2481a f7464n;

    /* renamed from: o */
    private MediaCodec.BufferInfo f7465o;

    /* renamed from: p */
    private ByteBuffer[] f7466p;

    /* renamed from: q */
    private MediaCodec f7467q;

    /* renamed from: r */
    private HandlerThread f7468r;

    /* renamed from: s */
    private Handler f7469s;

    /* renamed from: t */
    private int f7470t;

    /* renamed from: u */
    private int f7471u;

    /* renamed from: v */
    private SurfaceTexture.OnFrameAvailableListener f7472v;

    /* renamed from: w */
    private boolean f7473w;

    /* renamed from: x */
    private long f7474x;

    /* renamed from: y */
    private long f7475y;

    /* renamed from: z */
    private int f7476z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.benchmark.mediacodec.b$a */
    public static class C2481a {

        /* renamed from: a */
        FloatBuffer f7478a;

        /* renamed from: b */
        float[] f7479b = new float[16];

        /* renamed from: c */
        float[] f7480c = new float[16];

        /* renamed from: d */
        int f7481d;

        /* renamed from: e */
        int f7482e;

        /* renamed from: f */
        int f7483f;

        /* renamed from: g */
        int f7484g;

        /* renamed from: h */
        int f7485h;

        /* renamed from: i */
        int[] f7486i = new int[1];

        /* renamed from: j */
        int f7487j;

        /* renamed from: k */
        private final float[] f7488k;

        static {
            Covode.recordClassIndex(2837);
        }

        /* renamed from: a */
        public static void m7332a() {
            do {
            } while (GLES20.glGetError() != 0);
        }

        public C2481a(SurfaceTexture surfaceTexture) {
            float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            this.f7488k = fArr;
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f7478a = asFloatBuffer;
            asFloatBuffer.put(fArr).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f7480c);
            } else {
                Matrix.setIdentityM(this.f7480c, 0);
            }
        }

        /* renamed from: a */
        static int m7331a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            do {
            } while (GLES20.glGetError() != 0);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
    }

    static {
        Covode.recordClassIndex(2835);
    }

    public C2479b() {
        this.f7460j = true;
        this.f7461k = new int[1];
        this.f7465o = new MediaCodec.BufferInfo();
        this.f7470t = 30;
        this.f7471u = 0;
        this.f7455d = new Object();
        this.f7456e = false;
        this.f7472v = new SurfaceTexture.OnFrameAvailableListener() {
            /* class com.benchmark.mediacodec.C2479b.C24801 */

            static {
                Covode.recordClassIndex(2836);
            }

            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                MethodCollector.m26663i(6950);
                synchronized (C2479b.this.f7455d) {
                    try {
                        C2479b.this.f7456e = true;
                        C2479b.this.f7455d.notify();
                    } finally {
                        MethodCollector.m26664o(6950);
                    }
                }
            }
        };
        this.f7473w = false;
        this.f7474x = 10000;
        this.f7475y = 10000;
        this.f7476z = 0;
        this.f7454A = 0;
        HandlerThread handlerThread = new HandlerThread(f7450a);
        this.f7468r = handlerThread;
        handlerThread.start();
        this.f7469s = new Handler(this.f7468r.getLooper());
    }

    /* renamed from: a */
    public final int mo6876a() {
        try {
            this.f7467q.stop();
        } catch (Exception unused) {
        }
        this.f7467q.release();
        this.f7468r.quit();
        if (this.f7460j) {
            C2481a aVar = this.f7464n;
            if (aVar.f7481d != 0) {
                GLES20.glDeleteProgram(aVar.f7481d);
                aVar.f7481d = 0;
            }
            if (aVar.f7486i[0] != 0) {
                GLES20.glDeleteFramebuffers(1, aVar.f7486i, 0);
            }
            this.f7463m.release();
            this.f7462l.release();
            int[] iArr = this.f7461k;
            if (iArr[0] != 0) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.f7461k[0] = 0;
            }
        }
        return C2478a.f7436c;
    }

    /* renamed from: a */
    private static MediaCodecInfo m7327a(String str) {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public C2479b(boolean z, String str, String str2) {
        this();
        f7451b = z;
        f7452c = str;
        f7453f = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (m7327a(com.benchmark.mediacodec.C2479b.f7453f) == null) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m7326a(byte[] r9, int r10, byte[] r11, int r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.C2479b.m7326a(byte[], int, byte[], int, int, int):int");
    }

    /* renamed from: a */
    public final int mo6877a(byte[] bArr, int i, long j, byte[] bArr2, int i2, int i3, int i4) {
        ByteBuffer byteBuffer;
        MethodCollector.m26663i(6606);
        int i5 = C2478a.f7436c;
        if (!this.f7473w) {
            try {
                int dequeueInputBuffer = this.f7467q.dequeueInputBuffer(this.f7474x);
                if (dequeueInputBuffer < 0) {
                    i5 = C2478a.f7445l;
                } else if (i <= 0) {
                    this.f7467q.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                    this.f7473w = true;
                } else {
                    try {
                        if (Build.VERSION.SDK_INT >= 21) {
                            byteBuffer = this.f7467q.getInputBuffer(dequeueInputBuffer);
                        } else {
                            byteBuffer = this.f7467q.getInputBuffers()[dequeueInputBuffer];
                        }
                        byteBuffer.clear();
                        byteBuffer.position(0);
                        byteBuffer.put(bArr, 0, i);
                        this.f7467q.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                        this.f7454A++;
                    } catch (Exception e) {
                        e.getMessage();
                        int i6 = C2478a.f7449p;
                        MethodCollector.m26664o(6606);
                        return i6;
                    }
                }
            } catch (Exception e2) {
                e2.getMessage();
                int i7 = C2478a.f7449p;
                MethodCollector.m26664o(6606);
                return i7;
            }
        } else {
            if (this.f7471u > 1) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
            this.f7471u++;
        }
        int dequeueOutputBuffer = this.f7467q.dequeueOutputBuffer(this.f7465o, this.f7475y);
        if (dequeueOutputBuffer == -3) {
            this.f7466p = this.f7467q.getOutputBuffers();
        } else if (!(dequeueOutputBuffer == -2 || dequeueOutputBuffer == -1)) {
            if ((this.f7465o.flags & 4) != 0) {
                int i8 = C2478a.f7437d;
                MethodCollector.m26664o(6606);
                return i8;
            }
            if (this.f7473w) {
                this.f7471u = 0;
            }
            this.f7476z++;
            if (i5 != C2478a.f7445l) {
                i5 = C2478a.f7438e;
            }
            if (this.f7460j) {
                try {
                    this.f7467q.releaseOutputBuffer(dequeueOutputBuffer, true);
                    synchronized (this.f7455d) {
                        try {
                            if (!this.f7456e) {
                                try {
                                    this.f7455d.wait();
                                } catch (InterruptedException e4) {
                                    e4.printStackTrace();
                                }
                                this.f7456e = false;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(6606);
                            throw th;
                        }
                    }
                    this.f7462l.updateTexImage();
                    C2481a aVar = this.f7464n;
                    int i9 = this.f7461k[0];
                    GLES20.glViewport(0, 0, i3, i4);
                    GLES20.glBindTexture(3553, i2);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glBindFramebuffer(36160, aVar.f7486i[0]);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
                    do {
                    } while (GLES20.glGetError() != 0);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
                    GLES20.glClear(16640);
                    GLES20.glUseProgram(aVar.f7481d);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, i9);
                    do {
                    } while (GLES20.glGetError() != 0);
                    aVar.f7478a.position(0);
                    GLES20.glVertexAttribPointer(aVar.f7484g, 3, 5126, false, 20, (Buffer) aVar.f7478a);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glEnableVertexAttribArray(aVar.f7484g);
                    do {
                    } while (GLES20.glGetError() != 0);
                    aVar.f7478a.position(3);
                    GLES20.glVertexAttribPointer(aVar.f7485h, 2, 5126, false, 20, (Buffer) aVar.f7478a);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glEnableVertexAttribArray(aVar.f7485h);
                    do {
                    } while (GLES20.glGetError() != 0);
                    Matrix.setIdentityM(aVar.f7479b, 0);
                    GLES20.glUniformMatrix4fv(aVar.f7482e, 1, false, aVar.f7479b, 0);
                    GLES20.glUniformMatrix4fv(aVar.f7483f, 1, false, aVar.f7480c, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    do {
                    } while (GLES20.glGetError() != 0);
                    GLES20.glDisableVertexAttribArray(aVar.f7484g);
                    GLES20.glDisableVertexAttribArray(aVar.f7485h);
                    GLES20.glBindTexture(36197, 0);
                    GLES20.glBindTexture(3553, 0);
                    if (f7451b && !TextUtils.isEmpty(f7452c)) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(3686400);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        allocateDirect.position(0);
                        GLES20.glReadPixels(0, 0, 720, 1280, 6408, 5121, allocateDirect);
                        Bitmap createBitmap = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        aVar.f7487j++;
                        try {
                            File file = new File(f7452c + "decode" + aVar.f7487j + ".jpg");
                            if (!file.exists()) {
                                file.getParentFile().mkdirs();
                                file.createNewFile();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        } catch (Throwable th2) {
                            createBitmap.recycle();
                            MethodCollector.m26664o(6606);
                            throw th2;
                        }
                        createBitmap.recycle();
                    }
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glFinish();
                } catch (Exception e6) {
                    e6.getMessage();
                    if (i5 != C2478a.f7445l) {
                        int i10 = C2478a.f7449p;
                        MethodCollector.m26664o(6606);
                        return i10;
                    }
                }
            } else {
                if (this.f7466p == null) {
                    this.f7466p = this.f7467q.getOutputBuffers();
                }
                ByteBuffer byteBuffer2 = this.f7466p[dequeueOutputBuffer];
                int length = bArr2.length;
                byteBuffer2.remaining();
                byteBuffer2.get(bArr2, 0, Math.min(bArr2.length, byteBuffer2.remaining()));
                this.f7467q.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        }
        if (!this.f7473w || this.f7471u != this.f7470t) {
            MethodCollector.m26664o(6606);
            return i5;
        } else if (this.f7476z >= this.f7454A) {
            int i11 = C2478a.f7435b;
            MethodCollector.m26664o(6606);
            return i11;
        } else {
            int i12 = C2478a.f7434a;
            MethodCollector.m26664o(6606);
            return i12;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c A[Catch:{ Exception -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb A[Catch:{ Exception -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0172 A[Catch:{ Exception -> 0x0189 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6878a(byte[] r11, int r12, byte[] r13, int r14, int r15, int r16, boolean r17) {
        /*
        // Method dump skipped, instructions count: 424
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.C2479b.mo6878a(byte[], int, byte[], int, int, int, boolean):int");
    }
}
