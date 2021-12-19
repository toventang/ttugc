package com.p2082ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58527b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.b */
public final class C58514b extends TextureView$SurfaceTextureListenerC58540d implements AbstractC58567e {

    /* renamed from: a */
    public volatile boolean f133196a;

    /* renamed from: b */
    public float f133197b;

    /* renamed from: c */
    public float f133198c;

    /* renamed from: d */
    public AbstractC58568a f133199d;

    /* renamed from: e */
    public AbstractC58539a f133200e;

    /* renamed from: f */
    public Surface f133201f;

    /* renamed from: q */
    private C58522a.EnumC58526d f133202q;

    /* renamed from: r */
    private AbstractC58568a.AbstractC58569a f133203r = new AbstractC58568a.AbstractC58569a() {
        /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58514b.C585195 */

        static {
            Covode.recordClassIndex(68810);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a.AbstractC58569a
        /* renamed from: b */
        public final int mo95904b() {
            return C58514b.this.f133200e.mo16782j();
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a.AbstractC58569a
        /* renamed from: a */
        public final void mo95902a() {
            if (C58514b.this.f133201f != null) {
                C58514b.this.f133201f.release();
            }
            C58514b.this.f133196a = false;
            C58514b.this.f133201f = null;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a.AbstractC58569a
        /* renamed from: a */
        public final void mo95903a(Surface surface) {
            if (surface.isValid()) {
                if (C58514b.this.f133201f != null) {
                    C58514b.this.f133201f.release();
                }
                C58514b.this.f133201f = surface;
                C58514b.this.f133196a = true;
                try {
                    C58514b.this.f133200e.mo16765a(C58514b.this.f133201f);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C58514b.this.f133200e.mo16776e();
            }
        }
    };

    static {
        Covode.recordClassIndex(68805);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final View getView() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: c */
    public final boolean mo95889c() {
        return this.f133196a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final C58522a.EnumC58526d getScaleType() {
        return this.f133202q;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: a */
    public final void mo95883a() {
        this.f133199d.mo16798a();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: b */
    public final void mo95887b() {
        this.f133199d.mo16803b();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: d */
    public final void mo95890d() {
        AbstractC58568a.AbstractC58569a aVar = this.f133203r;
        if (aVar != null) {
            aVar.mo95902a();
        }
    }

    /* renamed from: e */
    private void m107430e() {
        AbstractC58568a aVar = this.f133199d;
        if (aVar != null) {
            aVar.mo16801a(this.f133203r);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.TextureView$SurfaceTextureListenerC58540d
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo95970a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58514b.RunnableC585184 */

            static {
                Covode.recordClassIndex(68809);
            }

            public final void run() {
                Thread currentThread = Thread.currentThread();
                currentThread.setName("alpha-play-" + currentThread.getName());
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final void setPlayerController(AbstractC58539a aVar) {
        this.f133200e = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: a */
    public final void mo95885a(final List<C58527b> list) {
        mo95970a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58514b.RunnableC585173 */

            static {
                Covode.recordClassIndex(68808);
            }

            public final void run() {
                if (C58514b.this.f133199d != null) {
                    C58514b.this.f133199d.mo16802a(list);
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final void setVideoRenderer(AbstractC58568a aVar) {
        this.f133199d = aVar;
        setRenderer(aVar);
        m107430e();
        setRenderMode(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: b */
    public final boolean mo95888b(ViewGroup viewGroup) {
        MethodCollector.m26663i(519);
        if (viewGroup == null) {
            MethodCollector.m26664o(519);
            return false;
        }
        viewGroup.removeView(this);
        MethodCollector.m26664o(519);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    public final void setConfigParams(final C58522a.C58524b bVar) {
        this.f133202q = bVar.f133245b;
        if (this.f133199d != null) {
            mo95970a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58514b.RunnableC585151 */

                static {
                    Covode.recordClassIndex(68806);
                }

                public final void run() {
                    C58514b.this.f133199d.mo16800a(bVar);
                }
            });
        }
    }

    public C58514b(Context context) {
        super(context);
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(new TextureView$SurfaceTextureListenerC58540d.C58542b(8, 16));
            m107430e();
            setPreserveEGLContextOnPause(true);
            setOpaque(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: a */
    public final boolean mo95886a(ViewGroup viewGroup) {
        MethodCollector.m26663i(518);
        if (viewGroup == null) {
            MethodCollector.m26664o(518);
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        if (viewGroup2 == viewGroup) {
            MethodCollector.m26664o(518);
            return true;
        }
        mo95888b(viewGroup2);
        if (viewGroup.indexOfChild(this) == -1) {
            viewGroup.addView(this);
            MethodCollector.m26664o(518);
            return true;
        }
        MethodCollector.m26664o(518);
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo95884a(this.f133197b, this.f133198c);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.AbstractC58567e
    /* renamed from: a */
    public final void mo95884a(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.f133197b = f;
            this.f133198c = f2;
        }
        if (this.f133199d != null) {
            final float measuredWidth = (float) getMeasuredWidth();
            final float measuredHeight = (float) getMeasuredHeight();
            mo95970a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.C58514b.RunnableC585162 */

                static {
                    Covode.recordClassIndex(68807);
                }

                public final void run() {
                    C58514b.this.f133199d.mo16799a(measuredWidth, measuredHeight, C58514b.this.f133197b, C58514b.this.f133198c);
                }
            });
        }
    }
}
