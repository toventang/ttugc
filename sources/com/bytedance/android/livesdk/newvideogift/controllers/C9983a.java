package com.bytedance.android.livesdk.newvideogift.controllers;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3400b.C58520a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58527b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58528c;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58573b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f.C58577d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.bytedance.android.livesdk.newvideogift.controllers.a */
public final class C9983a implements AbstractC58568a {

    /* renamed from: a */
    public static int f24229a = 36197;

    /* renamed from: A */
    private C58520a f24230A;

    /* renamed from: B */
    private Map<String, Map<String, C58522a.C58525c>> f24231B;

    /* renamed from: C */
    private C58528c f24232C = new C58528c();

    /* renamed from: D */
    private long f24233D = 0;

    /* renamed from: E */
    private int f24234E = 0;

    /* renamed from: b */
    private float[] f24235b = new float[8];

    /* renamed from: c */
    private float[] f24236c = new float[8];

    /* renamed from: d */
    private float[] f24237d = new float[8];

    /* renamed from: e */
    private FloatBuffer f24238e;

    /* renamed from: f */
    private FloatBuffer f24239f;

    /* renamed from: g */
    private FloatBuffer f24240g;

    /* renamed from: h */
    private int f24241h;

    /* renamed from: i */
    private int f24242i;

    /* renamed from: j */
    private int f24243j;

    /* renamed from: k */
    private int f24244k;

    /* renamed from: l */
    private int f24245l;

    /* renamed from: m */
    private SurfaceTexture f24246m;

    /* renamed from: n */
    private AtomicBoolean f24247n = new AtomicBoolean(false);

    /* renamed from: o */
    private AtomicBoolean f24248o = new AtomicBoolean(false);

    /* renamed from: p */
    private AtomicInteger f24249p = new AtomicInteger(0);

    /* renamed from: q */
    private AbstractC58568a.AbstractC58569a f24250q;

    /* renamed from: r */
    private AbstractC58567e f24251r;

    /* renamed from: s */
    private C58522a.EnumC58526d f24252s = C58522a.EnumC58526d.ScaleAspectFill;

    /* renamed from: t */
    private C58522a.C58523a f24253t;

    /* renamed from: u */
    private C58522a.C58523a f24254u;

    /* renamed from: v */
    private C58522a.C58523a f24255v;

    /* renamed from: w */
    private int f24256w;

    /* renamed from: x */
    private int f24257x;

    /* renamed from: y */
    private int f24258y;

    /* renamed from: z */
    private int f24259z;

    static {
        Covode.recordClassIndex(11537);
    }

    /* renamed from: c */
    private void m18446c() {
        C58520a aVar = this.f24230A;
        if (aVar != null) {
            aVar.mo95914b();
            this.f24230A = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16798a() {
        this.f24249p.set(0);
        this.f24248o.compareAndSet(false, true);
        this.f24233D = SystemClock.currentThreadTimeMillis();
        this.f24234E = 0;
        this.f24251r.requestRender();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: b */
    public final void mo16803b() {
        String str;
        AbstractC2994b a;
        this.f24248o.compareAndSet(true, false);
        float currentThreadTimeMillis = ((float) this.f24234E) / ((((float) SystemClock.currentThreadTimeMillis()) - ((float) this.f24233D)) / 100.0f);
        HashMap hashMap = new HashMap();
        hashMap.put("average", String.valueOf(currentThreadTimeMillis));
        hashMap.put("tag", "ttlive_sdk");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b == null || (a = b.mo13147a()) == null || (str = String.valueOf(a.getId())) == null) {
            str = "0";
        }
        hashMap.put("user_id", str);
        C3868c.m9489a("ttlive_gift_video_fps", 0, (long) currentThreadTimeMillis, hashMap);
        C6501b.C6502a.m13948a("ttlive_gift_video_fps").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
        this.f24251r.requestRender();
        m18446c();
        this.f24231B = null;
    }

    /* renamed from: com.bytedance.android.livesdk.newvideogift.controllers.a$1 */
    static /* synthetic */ class C99841 {

        /* renamed from: a */
        static final /* synthetic */ int[] f24260a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.controllers.C9983a.C99841.<clinit>():void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16801a(AbstractC58568a.AbstractC58569a aVar) {
        this.f24250q = aVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f24247n.compareAndSet(false, true);
        this.f24234E++;
        this.f24251r.requestRender();
    }

    public C9983a(AbstractC58567e eVar) {
        this.f24251r = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16802a(List<C58527b> list) {
        if (this.f24231B != null && list != null && !list.isEmpty()) {
            this.f24230A = new C58520a(this.f24251r.getContext(), list);
            if (this.f24251r.mo95889c()) {
                this.f24230A.mo95912a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58553m
    public final void onDrawFrame(GL10 gl10) {
        Map<String, C58522a.C58525c> map;
        if (this.f24247n.compareAndSet(true, false)) {
            try {
                this.f24246m.updateTexImage();
            } catch (Exception unused) {
            }
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (!this.f24248o.get()) {
            GLES20.glFinish();
            return;
        }
        this.f24249p.addAndGet(1);
        if (!(this.f24238e == null || this.f24239f == null || this.f24240g == null)) {
            GLES20.glUseProgram(this.f24242i);
            this.f24238e.position(0);
            GLES20.glVertexAttribPointer(this.f24243j, 2, 5126, false, 0, (Buffer) this.f24238e);
            GLES20.glEnableVertexAttribArray(this.f24243j);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(f24229a, this.f24241h);
            this.f24239f.position(0);
            GLES20.glVertexAttribPointer(this.f24244k, 2, 5126, false, 0, (Buffer) this.f24239f);
            GLES20.glEnableVertexAttribArray(this.f24244k);
            this.f24240g.position(0);
            GLES20.glVertexAttribPointer(this.f24245l, 2, 5126, false, 0, (Buffer) this.f24240g);
            GLES20.glEnableVertexAttribArray(this.f24245l);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.f24230A != null) {
            int i = this.f24249p.get();
            int b = this.f24250q.mo95904b();
            if (b > i + 2) {
                this.f24249p.set(b);
                i = b;
            }
            Map<String, Map<String, C58522a.C58525c>> map2 = this.f24231B;
            if (!(map2 == null || (map = map2.get(String.valueOf(i))) == null)) {
                for (Map.Entry<String, C58522a.C58525c> entry : map.entrySet()) {
                    C58520a aVar = this.f24230A;
                    if (aVar != null) {
                        aVar.mo95913a(this.f24241h, this.f24256w, this.f24257x, this.f24258y, this.f24259z, this.f24232C, entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        GLES20.glFinish();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16800a(C58522a.C58524b bVar) {
        this.f24252s = bVar.f133245b;
        this.f24256w = bVar.f133249f;
        this.f24257x = bVar.f133250g;
        this.f24258y = bVar.f133251h;
        this.f24259z = bVar.f133252i;
        if (bVar.mo95938a()) {
            this.f24254u = bVar.f133248e.mo95924a((float) bVar.f133249f, (float) bVar.f133250g);
            this.f24253t = bVar.f133247d.mo95924a((float) bVar.f133249f, (float) bVar.f133250g);
        } else {
            this.f24254u = new C58522a.C58523a(0.5f, 0.0f, 1.0f, 1.0f);
            this.f24253t = new C58522a.C58523a(0.0f, 0.0f, 0.5f, 1.0f);
        }
        this.f24255v = new C58522a.C58523a(0.0f, 0.0f, 1.0f, 1.0f);
        if (bVar.mo95941b()) {
            this.f24231B = bVar.f133254k;
        } else {
            this.f24231B = null;
        }
        C58573b.m107676a(this.f24255v);
        C58573b.m107678a(this.f24235b, this.f24255v.f133240a, this.f24255v.f133241b, this.f24255v.f133242c, this.f24255v.f133243d);
        FloatBuffer put = ByteBuffer.allocateDirect(this.f24235b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f24235b);
        this.f24238e = put;
        put.position(0);
        C58573b.m107678a(this.f24236c, this.f24254u.f133240a, this.f24254u.f133241b, this.f24254u.f133242c, this.f24254u.f133243d);
        FloatBuffer put2 = ByteBuffer.allocateDirect(this.f24236c.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f24236c);
        this.f24239f = put2;
        put2.position(0);
        C58573b.m107678a(this.f24237d, this.f24253t.f133240a, this.f24253t.f133241b, this.f24253t.f133242c, this.f24253t.f133243d);
        FloatBuffer put3 = ByteBuffer.allocateDirect(this.f24237d.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f24237d);
        this.f24240g = put3;
        put3.position(0);
        this.f24232C.mo95951b();
        m18446c();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58553m
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int a = C58577d.m107686a(C58577d.m107687a("video/video_vertex.sh", this.f24251r.getResources()), C58577d.m107687a("video/video_frag.sh", this.f24251r.getResources()));
        this.f24242i = a;
        if (a != 0) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(a, "aPosition");
            this.f24243j = glGetAttribLocation;
            if (glGetAttribLocation != -1) {
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f24242i, "aTextureCoord");
                this.f24244k = glGetAttribLocation2;
                if (glGetAttribLocation2 != -1) {
                    int glGetAttribLocation3 = GLES20.glGetAttribLocation(this.f24242i, "aAlphaTextureCoord");
                    this.f24245l = glGetAttribLocation3;
                    if (glGetAttribLocation3 == -1) {
                        throw new RuntimeException("Could not get attrib location for aAlphaTextureCoord");
                    }
                } else {
                    throw new RuntimeException("Could not get attrib location for aTextureCoord");
                }
            } else {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f24241h = i;
        GLES20.glBindTexture(f24229a, i);
        GLES20.glTexParameterf(f24229a, 10241, 9728.0f);
        GLES20.glTexParameterf(f24229a, 10240, 9729.0f);
        this.f24246m = new SurfaceTexture(this.f24241h);
        int i2 = Build.VERSION.SDK_INT;
        this.f24246m.setDefaultBufferSize(this.f24251r.getMeasuredWidth(), this.f24251r.getMeasuredHeight());
        this.f24246m.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.f24246m);
        AbstractC58568a.AbstractC58569a aVar = this.f24250q;
        if (aVar != null) {
            aVar.mo95903a(surface);
        }
        this.f24247n.compareAndSet(true, false);
        C58520a aVar2 = this.f24230A;
        if (aVar2 != null) {
            aVar2.mo95912a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58553m
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    /* renamed from: b */
    private void m18445b(float f, float f2, float f3, float f4) {
        if (this.f24238e != null) {
            this.f24232C.mo95949a(f, f2, f3, f4);
            C58573b.m107678a(this.f24235b, this.f24255v.f133240a + (f * 2.0f), this.f24255v.f133241b - (f2 * 2.0f), this.f24255v.f133242c - (f3 * 2.0f), this.f24255v.f133243d + (f4 * 2.0f));
            this.f24238e.position(0);
            this.f24238e.put(this.f24235b);
        }
    }

    /* renamed from: c */
    private void m18447c(float f, float f2, float f3, float f4) {
        if (this.f24239f != null && this.f24254u != null && this.f24240g != null && this.f24253t != null) {
            float f5 = (1.0f - f3) - f;
            float f6 = (1.0f - f2) - f4;
            this.f24232C.mo95949a((-f) / f5, (-f2) / f6, (-f3) / f5, (-f4) / f6);
            C58573b.m107678a(this.f24236c, this.f24254u.f133240a + (this.f24254u.mo95923a() * f), this.f24254u.f133241b + (this.f24254u.mo95929b() * f2), this.f24254u.f133242c - (this.f24254u.mo95923a() * f3), this.f24254u.f133243d - (this.f24254u.mo95929b() * f4));
            this.f24239f.position(0);
            this.f24239f.put(this.f24236c);
            C58573b.m107678a(this.f24237d, this.f24253t.f133240a + (f * this.f24253t.mo95923a()), this.f24253t.f133241b + (f2 * this.f24253t.mo95929b()), this.f24253t.f133242c - (f3 * this.f24253t.mo95923a()), this.f24253t.f133243d - (f4 * this.f24253t.mo95929b()));
            this.f24240g.position(0);
            this.f24240g.put(this.f24237d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16799a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            float f9 = f / f2;
            float f10 = f3 / f4;
            if (f9 > f10) {
                f6 = (1.0f - (f2 / (f / f10))) / 2.0f;
                f5 = 0.0f;
            } else {
                f5 = (1.0f - (f / (f2 * f10))) / 2.0f;
                f6 = 0.0f;
            }
            switch (C99841.f24260a[this.f24252s.ordinal()]) {
                case 1:
                    m18447c(0.0f, 0.0f, 0.0f, 0.0f);
                    return;
                case 2:
                    if (f9 > f10) {
                        f8 = (1.0f - ((f2 * f10) / f)) / 2.0f;
                        f7 = 0.0f;
                    } else {
                        f7 = (1.0f - ((f / f10) / f2)) / 2.0f;
                    }
                    m18445b(f8, f7, f8, f7);
                    return;
                case 3:
                    m18447c(f5, f6, f5, f6);
                    return;
                case 4:
                    m18447c(f5, 0.0f, f5, f6 * 2.0f);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    m18447c(f5, f6 * 2.0f, f5, 0.0f);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    m18447c(0.0f, f6, f5 * 2.0f, f6);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    m18447c(f5 * 2.0f, f6, 0.0f, f6);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    m18445b(0.0f, 0.0f, 0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    m18445b(0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    m18445b(0.0f, 0.0f, ((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    m18445b(((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    return;
                default:
                    return;
            }
        }
    }
}
