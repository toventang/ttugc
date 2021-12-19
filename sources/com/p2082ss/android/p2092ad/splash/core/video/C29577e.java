package com.p2082ss.android.p2092ad.splash.core.video;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ad.splash.core.video.e */
public final class C29577e implements AbstractC29557a {

    /* renamed from: a */
    FrameLayout f70476a;

    /* renamed from: b */
    TextView f70477b;

    /* renamed from: c */
    TextView f70478c;

    /* renamed from: d */
    ImageView f70479d;

    /* renamed from: e */
    public ImageView f70480e;

    /* renamed from: f */
    SSRenderSurfaceView f70481f;

    /* renamed from: g */
    View f70482g;

    /* renamed from: h */
    int f70483h;

    /* renamed from: i */
    int f70484i;

    /* renamed from: j */
    View f70485j;

    /* renamed from: k */
    Context f70486k;

    /* renamed from: l */
    public boolean f70487l;

    /* renamed from: m */
    public AbstractC29581a f70488m;

    /* renamed from: n */
    FrameLayout f70489n;

    /* renamed from: o */
    TextView f70490o;

    /* renamed from: p */
    Space f70491p;

    /* renamed from: q */
    TextView f70492q;

    /* renamed from: r */
    TextView f70493r;

    /* renamed from: s */
    public boolean f70494s;

    /* renamed from: t */
    private View.OnTouchListener f70495t = new View.OnTouchListener() {
        /* class com.p2082ss.android.p2092ad.splash.core.video.C29577e.View$OnTouchListenerC295803 */

        static {
            Covode.recordClassIndex(35975);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return true;
            }
            C29577e eVar = C29577e.this;
            if (!eVar.mo51825d()) {
                return true;
            }
            eVar.f70488m.mo51832a(motionEvent);
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ad.splash.core.video.e$a */
    public interface AbstractC29581a {
        static {
            Covode.recordClassIndex(35976);
        }

        /* renamed from: a */
        void mo51830a();

        /* renamed from: a */
        void mo51831a(int i, int i2, int i3);

        /* renamed from: a */
        void mo51832a(MotionEvent motionEvent);

        /* renamed from: a */
        void mo51833a(SurfaceHolder surfaceHolder);

        /* renamed from: b */
        void mo51834b();
    }

    static {
        Covode.recordClassIndex(35972);
    }

    /* renamed from: c */
    public final void mo51824c() {
        this.f70482g.setVisibility(8);
    }

    /* renamed from: d */
    public final boolean mo51825d() {
        if (this.f70488m != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final FrameLayout.LayoutParams mo51820a() {
        if (this.f70485j.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) this.f70485j.getLayoutParams();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo51822b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, (int) C29661o.m59767a(this.f70486k, 14.0f), (int) C29661o.m59767a(this.f70486k, 9.0f), 0);
        this.f70477b.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    public final void mo51826e() {
        mo51823b(8);
        this.f70478c.setVisibility(4);
        this.f70476a.setVisibility(8);
        this.f70477b.setVisibility(8);
        this.f70479d.setVisibility(8);
        this.f70480e.setVisibility(4);
        if (this.f70494s) {
            this.f70489n.setVisibility(8);
            this.f70492q.setVisibility(8);
            this.f70493r.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo51823b(int i) {
        C29661o.m59770a(this.f70485j, i);
    }

    /* renamed from: a */
    public final void mo51821a(int i) {
        this.f70485j.setVisibility(0);
        SSRenderSurfaceView sSRenderSurfaceView = this.f70481f;
        if (sSRenderSurfaceView != null) {
            sSRenderSurfaceView.setVisibility(i);
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.AbstractC29557a
    /* renamed from: b */
    public final void mo51775b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f70481f.getHolder()) {
            this.f70487l = false;
            if (mo51825d()) {
                this.f70488m.mo51830a();
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.AbstractC29557a
    /* renamed from: a */
    public final void mo51773a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f70481f.getHolder()) {
            this.f70487l = true;
            if (mo51825d()) {
                this.f70488m.mo51833a(surfaceHolder);
            }
        }
    }

    C29577e(Context context, View view) {
        mo51823b(8);
        this.f70486k = context;
        if (view != null) {
            this.f70478c = (TextView) view.findViewById(R.id.fx);
            this.f70476a = (FrameLayout) view.findViewById(R.id.fw);
            this.f70477b = (TextView) view.findViewById(R.id.fv);
            if (C29495h.f70246v != 0) {
                this.f70477b.setText(C29495h.f70246v);
            } else {
                this.f70477b.setText(R.string.g09);
            }
            this.f70480e = (ImageView) view.findViewById(R.id.fz);
            this.f70479d = (ImageView) view.findViewById(R.id.fy);
            this.f70490o = (TextView) view.findViewById(R.id.d2);
            this.f70489n = (FrameLayout) view.findViewById(R.id.d1);
            this.f70491p = (Space) view.findViewById(R.id.d0);
            this.f70492q = (TextView) view.findViewById(R.id.d4);
            this.f70493r = (TextView) view.findViewById(R.id.d3);
            if (C29495h.f70249y != 0) {
                this.f70478c.setText(C29495h.f70249y);
            } else {
                this.f70478c.setText(R.string.g06);
            }
            if (C29495h.f70179C != 0) {
                this.f70480e.setImageResource(C29495h.f70179C);
            } else {
                this.f70480e.setImageResource(2131233891);
            }
            if (C29495h.f70247w != 0) {
                this.f70478c.setBackgroundResource(C29495h.f70247w);
                this.f70490o.setBackgroundResource(C29495h.f70247w);
            }
            SSRenderSurfaceView sSRenderSurfaceView = (SSRenderSurfaceView) view.findViewById(R.id.fdp);
            this.f70481f = sSRenderSurfaceView;
            sSRenderSurfaceView.mo51768a(this);
            this.f70482g = view.findViewById(R.id.fd2);
            this.f70476a.setWillNotDraw(false);
            this.f70489n.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.p2092ad.splash.core.video.C29577e.View$OnClickListenerC295781 */

                static {
                    Covode.recordClassIndex(35973);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (C29577e.this.mo51825d()) {
                        C29577e.this.f70488m.mo51834b();
                    }
                }
            });
            this.f70478c.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.p2092ad.splash.core.video.C29577e.View$OnClickListenerC295792 */

                static {
                    Covode.recordClassIndex(35974);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    view.setVisibility(4);
                    C29577e.this.f70480e.setVisibility(0);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(800);
                    rotateAnimation.setRepeatCount(10);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    C29577e.this.f70480e.startAnimation(rotateAnimation);
                    if (C29577e.this.mo51825d()) {
                        C29577e.this.f70488m.mo51834b();
                    }
                }
            });
        }
        this.f70485j = view;
        if (view != null) {
            view.setOnTouchListener(this.f70495t);
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.AbstractC29557a
    /* renamed from: a */
    public final void mo51774a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == this.f70481f.getHolder() && mo51825d()) {
            this.f70488m.mo51831a(i, i2, i3);
        }
    }
}
