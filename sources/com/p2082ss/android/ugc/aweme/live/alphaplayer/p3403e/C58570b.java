package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.view.Surface;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.e.b */
public final class C58570b implements AbstractC58568a {

    /* renamed from: a */
    public static int f133405a = 36197;

    /* renamed from: A */
    private C58520a f133406A;

    /* renamed from: B */
    private Map<String, Map<String, C58522a.C58525c>> f133407B;

    /* renamed from: C */
    private C58528c f133408C = new C58528c();

    /* renamed from: b */
    private float[] f133409b = new float[8];

    /* renamed from: c */
    private float[] f133410c = new float[8];

    /* renamed from: d */
    private float[] f133411d = new float[8];

    /* renamed from: e */
    private FloatBuffer f133412e;

    /* renamed from: f */
    private FloatBuffer f133413f;

    /* renamed from: g */
    private FloatBuffer f133414g;

    /* renamed from: h */
    private int f133415h;

    /* renamed from: i */
    private int f133416i;

    /* renamed from: j */
    private int f133417j;

    /* renamed from: k */
    private int f133418k;

    /* renamed from: l */
    private int f133419l;

    /* renamed from: m */
    private SurfaceTexture f133420m;

    /* renamed from: n */
    private AtomicBoolean f133421n = new AtomicBoolean(false);

    /* renamed from: o */
    private AtomicBoolean f133422o = new AtomicBoolean(false);

    /* renamed from: p */
    private AtomicInteger f133423p = new AtomicInteger(0);

    /* renamed from: q */
    private AbstractC58568a.AbstractC58569a f133424q;

    /* renamed from: r */
    private AbstractC58567e f133425r;

    /* renamed from: s */
    private C58522a.EnumC58526d f133426s = C58522a.EnumC58526d.ScaleAspectFill;

    /* renamed from: t */
    private C58522a.C58523a f133427t;

    /* renamed from: u */
    private C58522a.C58523a f133428u;

    /* renamed from: v */
    private C58522a.C58523a f133429v;

    /* renamed from: w */
    private int f133430w;

    /* renamed from: x */
    private int f133431x;

    /* renamed from: y */
    private int f133432y;

    /* renamed from: z */
    private int f133433z;

    static {
        Covode.recordClassIndex(68865);
    }

    /* renamed from: c */
    private void m107667c() {
        C58520a aVar = this.f133406A;
        if (aVar != null) {
            aVar.mo95914b();
            this.f133406A = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16798a() {
        this.f133423p.set(0);
        this.f133422o.compareAndSet(false, true);
        this.f133422o.get();
        this.f133425r.requestRender();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: b */
    public final void mo16803b() {
        this.f133422o.compareAndSet(true, false);
        this.f133422o.get();
        this.f133425r.requestRender();
        m107667c();
        this.f133407B = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.e.b$1 */
    static /* synthetic */ class C585711 {

        /* renamed from: a */
        static final /* synthetic */ int[] f133434a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 139
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.C58570b.C585711.<clinit>():void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16801a(AbstractC58568a.AbstractC58569a aVar) {
        this.f133424q = aVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f133421n.compareAndSet(false, true);
        this.f133425r.requestRender();
    }

    public C58570b(AbstractC58567e eVar) {
        this.f133425r = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16802a(List<C58527b> list) {
        if (this.f133407B != null && list != null && !list.isEmpty()) {
            this.f133406A = new C58520a(this.f133425r.getContext(), list);
            if (this.f133425r.mo95889c()) {
                this.f133406A.mo95912a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58553m
    public final void onDrawFrame(GL10 gl10) {
        Map<String, C58522a.C58525c> map;
        if (this.f133421n.compareAndSet(true, false)) {
            try {
                this.f133420m.updateTexImage();
            } catch (Exception unused) {
            }
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (!this.f133422o.get()) {
            GLES20.glFinish();
            return;
        }
        this.f133423p.addAndGet(1);
        if (!(this.f133412e == null || this.f133413f == null || this.f133414g == null)) {
            GLES20.glUseProgram(this.f133416i);
            GLES20.glGetError();
            this.f133412e.position(0);
            GLES20.glVertexAttribPointer(this.f133417j, 2, 5126, false, 0, (Buffer) this.f133412e);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.f133417j);
            GLES20.glGetError();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(f133405a, this.f133415h);
            this.f133413f.position(0);
            GLES20.glVertexAttribPointer(this.f133418k, 2, 5126, false, 0, (Buffer) this.f133413f);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.f133418k);
            GLES20.glGetError();
            this.f133414g.position(0);
            GLES20.glVertexAttribPointer(this.f133419l, 2, 5126, false, 0, (Buffer) this.f133414g);
            GLES20.glGetError();
            GLES20.glEnableVertexAttribArray(this.f133419l);
            GLES20.glGetError();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glGetError();
        }
        if (this.f133406A != null) {
            int i = this.f133423p.get();
            int b = this.f133424q.mo95904b();
            if (b > i + 2) {
                this.f133423p.set(b);
                i = b;
            }
            Map<String, Map<String, C58522a.C58525c>> map2 = this.f133407B;
            if (!(map2 == null || (map = map2.get(String.valueOf(i))) == null)) {
                for (Map.Entry<String, C58522a.C58525c> entry : map.entrySet()) {
                    C58520a aVar = this.f133406A;
                    if (aVar != null) {
                        aVar.mo95913a(this.f133415h, this.f133430w, this.f133431x, this.f133432y, this.f133433z, this.f133408C, entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        GLES20.glFinish();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a
    /* renamed from: a */
    public final void mo16800a(C58522a.C58524b bVar) {
        this.f133426s = bVar.f133245b;
        this.f133430w = bVar.f133249f;
        this.f133431x = bVar.f133250g;
        this.f133432y = bVar.f133251h;
        this.f133433z = bVar.f133252i;
        if (bVar.mo95938a()) {
            this.f133428u = bVar.f133248e.mo95924a((float) bVar.f133249f, (float) bVar.f133250g);
            this.f133427t = bVar.f133247d.mo95924a((float) bVar.f133249f, (float) bVar.f133250g);
        } else {
            this.f133428u = new C58522a.C58523a(0.5f, 0.0f, 1.0f, 1.0f);
            this.f133427t = new C58522a.C58523a(0.0f, 0.0f, 0.5f, 1.0f);
        }
        this.f133429v = new C58522a.C58523a(0.0f, 0.0f, 1.0f, 1.0f);
        if (bVar.mo95941b()) {
            this.f133407B = bVar.f133254k;
        } else {
            this.f133407B = null;
        }
        C58573b.m107676a(this.f133429v);
        C58573b.m107678a(this.f133409b, this.f133429v.f133240a, this.f133429v.f133241b, this.f133429v.f133242c, this.f133429v.f133243d);
        FloatBuffer put = ByteBuffer.allocateDirect(this.f133409b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f133409b);
        this.f133412e = put;
        put.position(0);
        C58573b.m107678a(this.f133410c, this.f133428u.f133240a, this.f133428u.f133241b, this.f133428u.f133242c, this.f133428u.f133243d);
        FloatBuffer put2 = ByteBuffer.allocateDirect(this.f133410c.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f133410c);
        this.f133413f = put2;
        put2.position(0);
        C58573b.m107678a(this.f133411d, this.f133427t.f133240a, this.f133427t.f133241b, this.f133427t.f133242c, this.f133427t.f133243d);
        FloatBuffer put3 = ByteBuffer.allocateDirect(this.f133411d.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f133411d);
        this.f133414g = put3;
        put3.position(0);
        this.f133408C.mo95951b();
        m107667c();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58553m
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int a = C58577d.m107686a(C58577d.m107687a("video/video_vertex.sh", this.f133425r.getResources()), C58577d.m107687a("video/video_frag.sh", this.f133425r.getResources()));
        this.f133416i = a;
        if (a != 0) {
            this.f133417j = GLES20.glGetAttribLocation(a, "aPosition");
            GLES20.glGetError();
            if (this.f133417j != -1) {
                this.f133418k = GLES20.glGetAttribLocation(this.f133416i, "aTextureCoord");
                GLES20.glGetError();
                if (this.f133418k != -1) {
                    this.f133419l = GLES20.glGetAttribLocation(this.f133416i, "aAlphaTextureCoord");
                    GLES20.glGetError();
                    if (this.f133419l == -1) {
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
        this.f133415h = i;
        GLES20.glBindTexture(f133405a, i);
        GLES20.glGetError();
        GLES20.glTexParameterf(f133405a, 10241, 9728.0f);
        GLES20.glTexParameterf(f133405a, 10240, 9729.0f);
        this.f133420m = new SurfaceTexture(this.f133415h);
        int i2 = Build.VERSION.SDK_INT;
        this.f133420m.setDefaultBufferSize(this.f133425r.getMeasuredWidth(), this.f133425r.getMeasuredHeight());
        this.f133420m.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.f133420m);
        AbstractC58568a.AbstractC58569a aVar = this.f133424q;
        if (aVar != null) {
            aVar.mo95903a(surface);
        }
        this.f133421n.compareAndSet(true, false);
        C58520a aVar2 = this.f133406A;
        if (aVar2 != null) {
            aVar2.mo95912a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d.AbstractC58553m
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    /* renamed from: b */
    private void m107666b(float f, float f2, float f3, float f4) {
        if (this.f133412e != null) {
            this.f133408C.mo95949a(f, f2, f3, f4);
            C58573b.m107678a(this.f133409b, this.f133429v.f133240a + (f * 2.0f), this.f133429v.f133241b - (f2 * 2.0f), this.f133429v.f133242c - (f3 * 2.0f), this.f133429v.f133243d + (f4 * 2.0f));
            this.f133412e.position(0);
            this.f133412e.put(this.f133409b);
        }
    }

    /* renamed from: c */
    private void m107668c(float f, float f2, float f3, float f4) {
        if (this.f133413f != null && this.f133428u != null && this.f133414g != null && this.f133427t != null) {
            float f5 = (1.0f - f3) - f;
            float f6 = (1.0f - f2) - f4;
            this.f133408C.mo95949a((-f) / f5, (-f2) / f6, (-f3) / f5, (-f4) / f6);
            C58573b.m107678a(this.f133410c, this.f133428u.f133240a + (this.f133428u.mo95923a() * f), this.f133428u.f133241b + (this.f133428u.mo95929b() * f2), this.f133428u.f133242c - (this.f133428u.mo95923a() * f3), this.f133428u.f133243d - (this.f133428u.mo95929b() * f4));
            this.f133413f.position(0);
            this.f133413f.put(this.f133410c);
            C58573b.m107678a(this.f133411d, this.f133427t.f133240a + (f * this.f133427t.mo95923a()), this.f133427t.f133241b + (f2 * this.f133427t.mo95929b()), this.f133427t.f133242c - (f3 * this.f133427t.mo95923a()), this.f133427t.f133243d - (f4 * this.f133427t.mo95929b()));
            this.f133414g.position(0);
            this.f133414g.put(this.f133411d);
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
            switch (C585711.f133434a[this.f133426s.ordinal()]) {
                case 1:
                    m107668c(0.0f, 0.0f, 0.0f, 0.0f);
                    return;
                case 2:
                    if (f9 > f10) {
                        f8 = (1.0f - ((f2 * f10) / f)) / 2.0f;
                        f7 = 0.0f;
                    } else {
                        f7 = (1.0f - ((f / f10) / f2)) / 2.0f;
                    }
                    m107666b(f8, f7, f8, f7);
                    return;
                case 3:
                    m107668c(f5, f6, f5, f6);
                    return;
                case 4:
                    m107668c(f5, 0.0f, f5, f6 * 2.0f);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    m107668c(f5, f6 * 2.0f, f5, 0.0f);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    m107668c(0.0f, f6, f5 * 2.0f, f6);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    m107668c(f5 * 2.0f, f6, 0.0f, f6);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    m107666b(0.0f, 0.0f, 0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    m107666b(0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    m107666b(0.0f, 0.0f, ((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    m107666b(((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    return;
                default:
                    return;
            }
        }
    }
}
