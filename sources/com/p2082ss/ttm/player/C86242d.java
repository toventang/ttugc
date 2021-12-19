package com.p2082ss.ttm.player;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.ttm.p4406a.C86222e;
import java.lang.reflect.Method;

/* renamed from: com.ss.ttm.player.d */
final class C86242d {

    /* renamed from: a */
    final long[] f192656a;

    /* renamed from: b */
    AudioTrack f192657b;

    /* renamed from: c */
    C86240c f192658c;

    /* renamed from: d */
    boolean f192659d;

    /* renamed from: e */
    long f192660e;

    /* renamed from: f */
    long f192661f;

    /* renamed from: g */
    long f192662g;

    /* renamed from: h */
    int f192663h;

    /* renamed from: i */
    int f192664i;

    /* renamed from: j */
    private final AbstractC86243a f192665j = null;

    /* renamed from: k */
    private int f192666k;

    /* renamed from: l */
    private int f192667l;

    /* renamed from: m */
    private int f192668m;

    /* renamed from: n */
    private long f192669n;

    /* renamed from: o */
    private Method f192670o;

    /* renamed from: p */
    private boolean f192671p;

    /* renamed from: q */
    private boolean f192672q;

    /* renamed from: r */
    private long f192673r;

    /* renamed from: s */
    private long f192674s;

    /* renamed from: t */
    private long f192675t;

    /* renamed from: u */
    private long f192676u;

    /* renamed from: v */
    private long f192677v;

    /* renamed from: w */
    private long f192678w;

    /* renamed from: x */
    private long f192679x;

    /* renamed from: y */
    private long f192680y;

    /* renamed from: com.ss.ttm.player.d$a */
    public interface AbstractC86243a {
        static {
            Covode.recordClassIndex(101420);
        }
    }

    static {
        Covode.recordClassIndex(101419);
    }

    /* renamed from: a */
    private static boolean m148304a(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    /* renamed from: d */
    private void m148306d() {
        this.f192660e = 0;
        this.f192664i = 0;
        this.f192663h = 0;
        this.f192661f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo136801c() {
        return mo136799b(m148307e());
    }

    public C86242d() {
        if (C86222e.f192440a >= 18) {
            try {
                this.f192670o = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f192656a = new long[10];
    }

    /* renamed from: a */
    public final boolean mo136798a() {
        m148306d();
        if (this.f192677v != -9223372036854775807L) {
            return false;
        }
        this.f192658c.mo136791a();
        return true;
    }

    /* renamed from: b */
    public final void mo136800b() {
        m148306d();
        this.f192657b = null;
        this.f192658c = null;
    }

    /* renamed from: e */
    private long m148307e() {
        AudioTrack audioTrack = this.f192657b;
        if (this.f192677v != -9223372036854775807L) {
            return Math.min(this.f192680y, this.f192679x + ((((SystemClock.elapsedRealtime() * 1000) - this.f192677v) * ((long) this.f192668m)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f192659d) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f192676u = this.f192674s;
            }
            playbackHeadPosition += this.f192676u;
        }
        if (C86222e.f192440a <= 28) {
            if (playbackHeadPosition == 0 && this.f192674s > 0 && playState == 3) {
                if (this.f192678w == -9223372036854775807L) {
                    this.f192678w = SystemClock.elapsedRealtime();
                }
                return this.f192674s;
            }
            this.f192678w = -9223372036854775807L;
        }
        if (this.f192674s > playbackHeadPosition) {
            this.f192675t++;
        }
        this.f192674s = playbackHeadPosition;
        return playbackHeadPosition + (this.f192675t << 32);
    }

    /* renamed from: b */
    private static boolean m148305b(int i) {
        if (C86222e.f192440a >= 23) {
            return false;
        }
        if (i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo136799b(long j) {
        return (j * 1000000) / ((long) this.f192668m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo136796a(long j) {
        Method method;
        Object invoke;
        if (this.f192672q && (method = this.f192670o) != null && j - this.f192673r >= 500000) {
            try {
                AudioTrack audioTrack = this.f192657b;
                Object[] objArr = new Object[0];
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{audioTrack, objArr}, 110000, "java.lang.Object", true, "com_ss_ttm_player_AudioTrackPositionTracker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    invoke = a.second;
                } else {
                    invoke = method.invoke(audioTrack, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{audioTrack, objArr}, "com_ss_ttm_player_AudioTrackPositionTracker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                long intValue = (((long) ((Integer) invoke).intValue()) * 1000) - this.f192669n;
                this.f192662g = intValue;
                long max = Math.max(intValue, 0L);
                this.f192662g = max;
                if (max > 5000000) {
                    this.f192662g = 0;
                }
            } catch (Exception unused) {
                this.f192670o = null;
            }
            this.f192673r = j;
        }
    }

    /* renamed from: a */
    public final void mo136797a(AudioTrack audioTrack, int i, int i2, int i3) {
        long j;
        this.f192657b = audioTrack;
        this.f192666k = i2;
        this.f192667l = i3;
        this.f192658c = new C86240c(audioTrack);
        this.f192668m = audioTrack.getSampleRate();
        this.f192659d = m148305b(i);
        boolean a = m148304a(i);
        this.f192672q = a;
        if (a) {
            j = mo136799b((long) (i3 / i2));
        } else {
            j = -9223372036854775807L;
        }
        this.f192669n = j;
        this.f192674s = 0;
        this.f192675t = 0;
        this.f192676u = 0;
        this.f192671p = false;
        this.f192677v = -9223372036854775807L;
        this.f192678w = -9223372036854775807L;
        this.f192662g = 0;
    }
}
