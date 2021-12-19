package com.p2082ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58527b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.a */
public final class C58504a extends GLSurfaceView implements AbstractC58567e {

    /* renamed from: a */
    public volatile boolean f133179a;

    /* renamed from: b */
    public float f133180b;

    /* renamed from: c */
    public float f133181c;

    /* renamed from: d */
    public AbstractC58568a f133182d;

    /* renamed from: e */
    public AbstractC58539a f133183e;

    /* renamed from: f */
    public Surface f133184f;

    /* renamed from: g */
    private C58522a.EnumC58526d f133185g;

    /* renamed from: h */
    private AbstractC58568a.AbstractC58569a f133186h = new AbstractC58568a.AbstractC58569a() {
        /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58504a.C585095 */

        static {
            Covode.recordClassIndex(68800);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a.AbstractC58569a
        /* renamed from: b */
        public final int mo95904b() {
            return C58504a.this.f133183e.mo16782j();
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a.AbstractC58569a
        /* renamed from: a */
        public final void mo95902a() {
            if (C58504a.this.f133184f != null) {
                C58504a.this.f133184f.release();
            }
            C58504a.this.f133179a = false;
            C58504a.this.f133184f = null;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a.AbstractC58569a
        /* renamed from: a */
        public final void mo95903a(Surface surface) {
            if (surface.isValid()) {
                if (C58504a.this.f133184f != null) {
                    C58504a.this.f133184f.release();
                }
                C58504a.this.f133184f = surface;
                C58504a.this.f133179a = true;
                try {
                    C58504a.this.f133183e.mo16765a(C58504a.this.f133184f);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C58504a.this.f133183e.mo16776e();
            }
        }
    };

    static {
        Covode.recordClassIndex(68795);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final View getView() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: c */
    public final boolean mo95889c() {
        return this.f133179a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final C58522a.EnumC58526d getScaleType() {
        return this.f133185g;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: a */
    public final void mo95883a() {
        this.f133182d.mo16798a();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: b */
    public final void mo95887b() {
        this.f133182d.mo16803b();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: d */
    public final void mo95890d() {
        AbstractC58568a.AbstractC58569a aVar = this.f133186h;
        if (aVar != null) {
            aVar.mo95902a();
        }
    }

    /* renamed from: e */
    private void m107411e() {
        AbstractC58568a aVar = this.f133182d;
        if (aVar != null) {
            aVar.mo16801a(this.f133186h);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        queueEvent(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58504a.RunnableC585084 */

            static {
                Covode.recordClassIndex(68799);
            }

            public final void run() {
                Thread currentThread = Thread.currentThread();
                currentThread.setName("alpha-play-" + currentThread.getName());
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final void setPlayerController(AbstractC58539a aVar) {
        this.f133183e = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: a */
    public final void mo95885a(final List<C58527b> list) {
        queueEvent(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58504a.RunnableC585073 */

            static {
                Covode.recordClassIndex(68798);
            }

            public final void run() {
                if (C58504a.this.f133182d != null) {
                    C58504a.this.f133182d.mo16802a(list);
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final void setVideoRenderer(AbstractC58568a aVar) {
        this.f133182d = aVar;
        setRenderer(aVar);
        m107411e();
        setRenderMode(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: b */
    public final boolean mo95888b(ViewGroup viewGroup) {
        MethodCollector.m26663i(1184);
        if (viewGroup == null) {
            MethodCollector.m26664o(1184);
            return false;
        }
        viewGroup.removeView(this);
        MethodCollector.m26664o(1184);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final void setConfigParams(final C58522a.C58524b bVar) {
        this.f133185g = bVar.f133245b;
        if (this.f133182d != null) {
            queueEvent(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58504a.RunnableC585051 */

                static {
                    Covode.recordClassIndex(68796);
                }

                public final void run() {
                    C58504a.this.f133182d.mo16800a(bVar);
                }
            });
        }
    }

    public C58504a(Context context) {
        super(context, null);
        MethodCollector.m26663i(1125);
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(-3);
            m107411e();
            setZOrderOnTop(true);
            setPreserveEGLContextOnPause(true);
        }
        MethodCollector.m26664o(1125);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: a */
    public final boolean mo95886a(ViewGroup viewGroup) {
        MethodCollector.m26663i(1181);
        if (viewGroup == null) {
            MethodCollector.m26664o(1181);
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        if (viewGroup2 == viewGroup) {
            MethodCollector.m26664o(1181);
            return true;
        }
        mo95888b(viewGroup2);
        if (viewGroup.indexOfChild(this) == -1) {
            viewGroup.addView(this);
            MethodCollector.m26664o(1181);
            return true;
        }
        MethodCollector.m26664o(1181);
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(1166);
        super.onMeasure(i, i2);
        mo95884a(this.f133180b, this.f133181c);
        MethodCollector.m26664o(1166);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: a */
    public final void mo95884a(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.f133180b = f;
            this.f133181c = f2;
        }
        if (this.f133182d != null) {
            final float measuredWidth = (float) getMeasuredWidth();
            final float measuredHeight = (float) getMeasuredHeight();
            queueEvent(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58504a.RunnableC585062 */

                static {
                    Covode.recordClassIndex(68797);
                }

                public final void run() {
                    C58504a.this.f133182d.mo16799a(measuredWidth, measuredHeight, C58504a.this.f133180b, C58504a.this.f133181c);
                }
            });
        }
    }
}
