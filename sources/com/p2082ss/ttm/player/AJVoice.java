package com.p2082ss.ttm.player;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.ttm.p4406a.C86219b;
import com.p2082ss.ttm.p4406a.C86222e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.ss.ttm.player.AJVoice */
public class AJVoice implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: B */
    private static boolean f192482B = false;

    /* renamed from: C */
    private static String f192483C = null;

    /* renamed from: a */
    public static final String f192484a = AJVoice.class.getSimpleName();

    /* renamed from: c */
    private static final int f192485c = Build.VERSION.SDK_INT;

    /* renamed from: A */
    private long f192486A = -9223372036854775807L;

    /* renamed from: D */
    private long f192487D;

    /* renamed from: E */
    private int f192488E = 3;

    /* renamed from: F */
    private C86242d f192489F;

    /* renamed from: G */
    private int f192490G = -1;

    /* renamed from: H */
    private int f192491H;

    /* renamed from: I */
    private int f192492I = -1;

    /* renamed from: b */
    public ConditionVariable f192493b;

    /* renamed from: d */
    private AudioTrack f192494d;

    /* renamed from: e */
    private TTPlayer f192495e;

    /* renamed from: f */
    private int f192496f = 2048;

    /* renamed from: g */
    private int f192497g = 44100;

    /* renamed from: h */
    private int f192498h = 2;

    /* renamed from: i */
    private int f192499i = 2;

    /* renamed from: j */
    private int f192500j;

    /* renamed from: k */
    private int f192501k;

    /* renamed from: l */
    private AudioManager f192502l;

    /* renamed from: m */
    private int f192503m;
    private long mNativeObject;

    /* renamed from: n */
    private int f192504n = 2;

    /* renamed from: o */
    private float f192505o = -1.0f;

    /* renamed from: p */
    private int f192506p;

    /* renamed from: q */
    private volatile boolean f192507q = true;

    /* renamed from: r */
    private byte[] f192508r;

    /* renamed from: s */
    private int f192509s = -1;

    /* renamed from: t */
    private Method f192510t;

    /* renamed from: u */
    private int f192511u;

    /* renamed from: v */
    private int f192512v;

    /* renamed from: w */
    private int f192513w;

    /* renamed from: x */
    private long f192514x;

    /* renamed from: y */
    private long f192515y;

    /* renamed from: z */
    private long f192516z;

    public void onMarkerReached(AudioTrack audioTrack) {
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public int getMaxVolume() {
        return this.f192506p;
    }

    public int getTrackBufferSize() {
        return this.f192511u;
    }

    public int getSessionId() {
        AudioTrack audioTrack;
        int i = this.f192492I;
        if (i != -1 || (audioTrack = this.f192494d) == null) {
            return i;
        }
        return audioTrack.getAudioSessionId();
    }

    public void pause() {
        try {
            C86242d dVar = this.f192489F;
            if (dVar != null) {
                dVar.mo136798a();
            }
            this.f192494d.pause();
        } catch (Throwable unused) {
        }
    }

    static {
        Covode.recordClassIndex(101378);
    }

    /* renamed from: e */
    private long m148221e() {
        return ((this.f192515y / ((long) m148216a(this.f192504n, this.f192498h))) * 1000) / ((long) this.f192497g);
    }

    public void close() {
        final AudioTrack audioTrack = this.f192494d;
        if (audioTrack != null) {
            this.f192494d = null;
            try {
                C86239b.m148297a(new Runnable() {
                    /* class com.p2082ss.ttm.player.AJVoice.RunnableC862281 */

                    static {
                        Covode.recordClassIndex(101379);
                    }

                    public final void run() {
                        AJVoice.this.mo136655a(audioTrack);
                    }
                });
            } catch (Throwable unused) {
                mo136655a(audioTrack);
            }
        }
    }

    public void flush() {
        try {
            C86242d dVar = this.f192489F;
            if (dVar != null) {
                dVar.mo136800b();
            }
            this.f192490G = -1;
            this.f192494d.flush();
            if (this.f192515y > 0) {
                this.f192515y = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public void resume() {
        try {
            C86242d dVar = this.f192489F;
            if (dVar != null) {
                AudioTrack audioTrack = this.f192494d;
                int i = this.f192504n;
                dVar.mo136797a(audioTrack, i, m148216a(i, this.f192498h), this.f192511u);
                this.f192489F.f192658c.mo136791a();
            }
            this.f192494d.play();
        } catch (Throwable unused) {
        }
    }

    public void stop() {
        if (!this.f192507q) {
            this.f192507q = true;
            try {
                C86242d dVar = this.f192489F;
                if (dVar != null) {
                    dVar.mo136798a();
                }
                this.f192494d.pause();
            } catch (Throwable unused) {
            }
        }
    }

    public AJVoice() {
        if (f192483C == null) {
            String str = Build.DEVICE;
            f192483C = str;
            if (str.equals("OnePlus6T")) {
                f192482B = true;
            }
        }
    }

    /* renamed from: b */
    private int m148218b() {
        this.f192515y = 0;
        this.f192512v = 0;
        this.f192486A = -9223372036854775807L;
        this.f192514x = 0;
        this.f192516z = 0;
        this.f192505o = -1.0f;
        AudioTrack audioTrack = this.f192494d;
        this.f192494d = null;
        try {
            audioTrack.flush();
            audioTrack.release();
        } catch (Exception unused) {
        } catch (Throwable th) {
            m148215a();
            throw th;
        }
        return m148215a();
    }

    /* renamed from: c */
    private boolean m148219c() {
        if (this.f192486A == -9223372036854775807L || this.f192515y <= 0 || SystemClock.elapsedRealtime() - this.f192486A < 200) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private long m148220d() {
        int playState = this.f192494d.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f192494d.getPlaybackHeadPosition());
        if (playbackHeadPosition == 0 && this.f192516z > 0 && playState == 3) {
            if (this.f192486A == -9223372036854775807L) {
                this.f192486A = SystemClock.elapsedRealtime();
            }
            return this.f192516z;
        }
        this.f192486A = -9223372036854775807L;
        this.f192516z = playbackHeadPosition;
        return playbackHeadPosition;
    }

    public int getEOSDelayMs() {
        long j;
        long e = m148221e();
        long d = (m148220d() * 1000) / ((long) this.f192497g);
        if (getLatency() > 0) {
            j = (long) (this.f192512v - this.f192513w);
        } else {
            j = 0;
        }
        return (int) ((e - d) + j);
    }

    public float getVolume() {
        AudioManager audioManager;
        int i = 0;
        if (!(this.f192495e == null || this.f192505o != -1.0f || (audioManager = this.f192502l) == null)) {
            try {
                int streamMaxVolume = audioManager.getStreamMaxVolume(this.f192488E);
                try {
                    i = this.f192502l.getStreamVolume(this.f192488E);
                } catch (Exception unused) {
                }
                if (i < 0) {
                    if (streamMaxVolume > 0) {
                        return (float) (streamMaxVolume / 4);
                    }
                    return 10.0f;
                }
            } catch (Exception unused2) {
            }
        }
        return (float) i;
    }

    public int start() {
        if (this.f192494d == null) {
            return -2;
        }
        this.f192507q = false;
        try {
            C86242d dVar = this.f192489F;
            if (dVar != null) {
                AudioTrack audioTrack = this.f192494d;
                int i = this.f192504n;
                dVar.mo136797a(audioTrack, i, m148216a(i, this.f192498h), this.f192511u);
            }
            this.f192494d.play();
            this.f192509s = -1;
            if (f192482B) {
                this.f192487D = SystemClock.elapsedRealtime();
            }
            return 0;
        } catch (Throwable unused) {
            return -3;
        }
    }

    public int getLatency() {
        Object invoke;
        m148220d();
        if (this.f192510t != null) {
            long nanoTime = System.nanoTime() / 1000000;
            if (nanoTime - this.f192514x > 500) {
                try {
                    Method method = this.f192510t;
                    AudioTrack audioTrack = this.f192494d;
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{audioTrack, null}, 110000, "java.lang.Object", true, "com_ss_ttm_player_AJVoice_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        invoke = a.second;
                    } else {
                        invoke = method.invoke(audioTrack, null);
                        C15346a.m28242a(invoke, method, new Object[]{audioTrack, null}, "com_ss_ttm_player_AJVoice_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    }
                    int intValue = ((Integer) invoke).intValue();
                    this.f192512v = intValue;
                    int max = Math.max(intValue, 0);
                    this.f192512v = max;
                    if (max > 5000) {
                        this.f192512v = 0;
                    }
                } catch (Exception unused) {
                    this.f192510t = null;
                }
                this.f192514x = nanoTime;
            }
        }
        return this.f192512v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L_0x0021;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m148215a() {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.AJVoice.m148215a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        if (r14 != false) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentPositionMs() {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.AJVoice.getCurrentPositionMs():int");
    }

    public void setAudioTrackSmoothClock(int i) {
        if (C86222e.f192440a >= 21) {
            this.f192491H = i;
            if (i > 0) {
                this.f192489F = new C86242d();
                this.f192493b = new ConditionVariable(true);
            }
        }
    }

    public void setSessionId(int i) {
        this.f192492I = i;
        if (this.f192495e != null && m148218b() == 0) {
            start();
        }
    }

    public void setStreamType(int i) {
        this.f192488E = i;
        if (this.f192495e != null && m148218b() == 0) {
            start();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136655a(android.media.AudioTrack r7) {
        /*
            r6 = this;
            r5 = 5010(0x1392, float:7.02E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            if (r7 != 0) goto L_0x000b
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x000b:
            boolean r0 = com.p2082ss.ttm.player.AJVoice.f192482B     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x0020
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0020 }
            long r0 = r6.f192487D     // Catch:{ Exception -> 0x0020 }
            long r3 = r3 - r0
            r1 = 80
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0020
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            r7.release()     // Catch:{ Exception -> 0x0027 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x0027:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.AJVoice.mo136655a(android.media.AudioTrack):void");
    }

    public void setTrackVolume(float f, float f2) {
        AudioTrack audioTrack = this.f192494d;
        if (audioTrack != null) {
            audioTrack.setStereoVolume(f, f2);
        }
    }

    /* renamed from: a */
    private static int m148216a(int i, int i2) {
        if (i == 2) {
            return i2 * 2;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public int open(long j, TTPlayer tTPlayer) {
        this.f192495e = tTPlayer;
        int a = m148215a();
        if (a == 0) {
            float f = this.f192505o;
            if (f != -1.0f) {
                setVolume(f, f);
            }
            int i = Build.VERSION.SDK_INT;
            try {
                this.f192510t = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        return a;
    }

    public void setVolume(float f, float f2) {
        AudioTrack audioTrack;
        try {
            int i = this.f192506p;
            if (((float) i) < f) {
                f = (float) i;
            }
            if (f2 != -1048575.0f || (audioTrack = this.f192494d) == null) {
                AudioManager audioManager = this.f192502l;
                if (audioManager != null) {
                    audioManager.setStreamVolume(this.f192488E, (int) f, 0);
                }
            } else {
                audioTrack.setStereoVolume(f, f2);
            }
            this.f192505o = f;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static Object m148217a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5084);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(5084);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public int write(byte[] bArr, int i, int i2, int i3) {
        int start;
        if (bArr == null || bArr.length == 0) {
            C86219b.m148183b(f192484a, "buffer is nullpoint");
            return -10;
        } else if (this.f192507q) {
            return 0;
        } else {
            if (this.f192509s != i3) {
                this.f192509s = i3;
                if (this.f192515y > 0) {
                    this.f192494d.flush();
                }
            }
            try {
                int write = this.f192494d.write(bArr, i, i2);
                if (write < 0) {
                    return write;
                }
                this.f192515y += (long) write;
                if (!m148219c() || m148218b() != 0 || (start = start()) == 0) {
                    return write;
                }
                return start;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
    }

    public int write(byte[] bArr, int i, int i2, int i3, long j) {
        if (bArr == null || bArr.length == 0) {
            C86219b.m148183b(f192484a, "buffer is nullpoint");
            return -10;
        } else if (this.f192507q) {
            return 0;
        } else {
            if (this.f192509s != i3) {
                this.f192509s = i3;
                C86242d dVar = this.f192489F;
                if (dVar == null || this.f192493b == null) {
                    if (this.f192515y > 0) {
                        this.f192494d.flush();
                    }
                } else if (this.f192515y > 0) {
                    if (dVar.f192657b.getPlayState() == 3) {
                        this.f192494d.pause();
                    }
                    this.f192489F.mo136800b();
                    this.f192490G = -1;
                    this.f192493b.close();
                    this.f192515y = 0;
                    final AudioTrack audioTrack = this.f192494d;
                    this.f192494d = null;
                    C86239b.m148297a(new Runnable() {
                        /* class com.p2082ss.ttm.player.AJVoice.RunnableC862292 */

                        static {
                            Covode.recordClassIndex(101380);
                        }

                        public final void run() {
                            try {
                                audioTrack.flush();
                                audioTrack.release();
                            } finally {
                                AJVoice.this.f192493b.open();
                            }
                        }
                    });
                    this.f192493b.block();
                    m148215a();
                    start();
                    this.f192509s = i3;
                }
            }
            int i4 = this.f192490G;
            if (i4 == -1) {
                this.f192490G = (int) Math.max(0L, j);
            } else {
                long e = ((long) i4) + m148221e();
                if (Math.abs(e - j) > 200) {
                    this.f192490G = (int) (((long) this.f192490G) + (j - e));
                }
            }
            try {
                int write = this.f192494d.write(bArr, i, i2);
                if (write < 0) {
                    return write;
                }
                this.f192515y += (long) write;
                if (m148219c() && m148218b() == 0) {
                    int start = start();
                    this.f192509s = i3;
                    if (start == 0) {
                        return write;
                    }
                    return start;
                }
                return write;
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1;
            }
        }
    }

    public void setSampleInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f192497g = i2;
        this.f192498h = i3;
        this.f192496f = i4;
        this.f192499i = i6;
        this.f192500j = i;
        this.f192501k = i5;
    }
}
