package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2730de.C40983r;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.KTVView;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.h */
public final class View$OnTouchListenerC70606h implements View.OnTouchListener {

    /* renamed from: a */
    ImageView f158017a;

    /* renamed from: b */
    KTVView f158018b;

    /* renamed from: c */
    TextView f158019c;

    /* renamed from: d */
    TextView f158020d;

    /* renamed from: e */
    String f158021e;

    /* renamed from: f */
    C70592b f158022f;

    /* renamed from: g */
    RelativeLayout f158023g;

    /* renamed from: h */
    public int f158024h;

    /* renamed from: i */
    public int f158025i;

    /* renamed from: j */
    AbstractC70608a f158026j;

    /* renamed from: k */
    public AbstractC70609b f158027k;

    /* renamed from: l */
    private View f158028l;

    /* renamed from: m */
    private int f158029m;

    /* renamed from: n */
    private float f158030n;

    /* renamed from: o */
    private float f158031o;

    /* renamed from: p */
    private boolean f158032p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.h$a */
    public interface AbstractC70608a {
        static {
            Covode.recordClassIndex(83074);
        }

        /* renamed from: c */
        void mo111390c(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.h$b */
    public interface AbstractC70609b {
        static {
            Covode.recordClassIndex(83075);
        }

        /* renamed from: b */
        void mo111389b(int i);
    }

    static {
        Covode.recordClassIndex(83072);
    }

    /* renamed from: c */
    private int m124735c() {
        if (this.f158029m >= this.f158025i) {
            return (int) (((((float) this.f158018b.getWidth()) * 1.0f) * 15000.0f) / ((float) this.f158025i));
        }
        double width = (double) this.f158018b.getWidth();
        Double.isNaN(width);
        double d = (double) this.f158029m;
        Double.isNaN(d);
        double d2 = width * 1.0d * d;
        double d3 = (double) this.f158025i;
        Double.isNaN(d3);
        return (int) (d2 / d3);
    }

    /* renamed from: b */
    private void m124733b() {
        MethodCollector.m26663i(10389);
        this.f158020d.setText(C40983r.m82524a(this.f158025i));
        this.f158019c.setText(this.f158021e);
        ImageView imageView = new ImageView(this.f158028l.getContext());
        this.f158017a = imageView;
        imageView.setImageResource(2131232187);
        this.f158017a.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f158023g.addView(this.f158017a);
        this.f158017a.setX(this.f158018b.getX() - ((float) (this.f158017a.getWidth() / 2)));
        this.f158018b.setLength(mo111410a());
        this.f158017a.setOnTouchListener(this);
        C70592b bVar = this.f158022f;
        bVar.setBubbleTextViewAttribute(C70612k.C70614b.m124756a(bVar.getContext()));
        this.f158022f.setScrollListener(new C70598f.AbstractC70599a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.View$OnTouchListenerC70606h.C706071 */

            static {
                Covode.recordClassIndex(83073);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f.AbstractC70599a
            /* renamed from: b */
            public final void mo87819b(float f) {
                View$OnTouchListenerC70606h.this.f158022f.setTimeBubble((int) (f * ((float) View$OnTouchListenerC70606h.this.f158025i)));
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f.AbstractC70599a
            /* renamed from: a */
            public final void mo87818a(float f) {
                View$OnTouchListenerC70606h hVar = View$OnTouchListenerC70606h.this;
                hVar.f158024h = (int) (f * ((float) hVar.f158025i));
                if (View$OnTouchListenerC70606h.this.f158027k != null) {
                    View$OnTouchListenerC70606h.this.f158027k.mo111389b(View$OnTouchListenerC70606h.this.f158024h);
                }
            }
        });
        this.f158022f.mo111354a((((float) this.f158024h) * 1.0f) / ((float) this.f158025i));
        this.f158022f.setTimeBubble(this.f158024h);
        MethodCollector.m26664o(10389);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo111410a() {
        if (this.f158029m >= this.f158025i || this.f158032p) {
            return this.f158018b.getWidth();
        }
        double width = (double) this.f158018b.getWidth();
        Double.isNaN(width);
        double d = (double) this.f158029m;
        Double.isNaN(d);
        double d2 = width * 1.0d * d;
        double d3 = (double) this.f158025i;
        Double.isNaN(d3);
        return (int) (d2 / d3);
    }

    /* renamed from: a */
    private View$OnTouchListenerC70606h m124730a(View view) {
        this.f158028l = view;
        m124734b(view);
        m124733b();
        this.f158028l.bringToFront();
        int i = this.f158025i;
        int i2 = this.f158029m;
        if (i > i2 && i < i2 + 1000) {
            this.f158032p = true;
        }
        return this;
    }

    /* renamed from: a */
    private void m124732a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        ImageView imageView = this.f158017a;
        int i5 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        KTVView kTVView = this.f158018b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        kTVView.setVisibility(i2);
        TextView textView = this.f158019c;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        TextView textView2 = this.f158020d;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        C70592b bVar = this.f158022f;
        if (z) {
            i5 = 8;
        }
        bVar.setVisibility(i5);
        C80322d.m139251a("tool_performance_show_music_wave", new C84425b().mo129406a("scene", "MusicDragView").mo129403a("status", !z ? 1 : 0).f188764a);
    }

    /* renamed from: b */
    private void m124734b(View view) {
        this.f158018b = (KTVView) view.findViewById(R.id.c2i);
        this.f158019c = (TextView) view.findViewById(R.id.f4_);
        this.f158020d = (TextView) view.findViewById(R.id.evs);
        this.f158022f = (C70592b) view.findViewById(R.id.aha);
        this.f158023g = (RelativeLayout) view.findViewById(R.id.e2o);
        this.f158021e = view.getContext().getResources().getString(R.string.ggb);
        view.findViewById(R.id.buu).setOnClickListener(new View$OnClickListenerC70611j(this));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                int x = (int) ((this.f158017a.getX() - this.f158018b.getX()) + ((float) (this.f158017a.getWidth() / 2)));
                if (x >= 0) {
                    i = x;
                }
                double d = (double) i;
                Double.isNaN(d);
                double width = (double) this.f158018b.getWidth();
                Double.isNaN(width);
                double d2 = (d * 1.0d) / width;
                double d3 = (double) this.f158025i;
                Double.isNaN(d3);
                int i2 = (int) (d2 * d3);
                this.f158024h = i2;
                AbstractC70609b bVar = this.f158027k;
                if (bVar != null) {
                    bVar.mo111389b(i2);
                }
            } else if (action == 2 && !this.f158032p) {
                float rawX = this.f158031o + (motionEvent.getRawX() - this.f158030n);
                if (rawX < this.f158018b.getX() - ((float) (this.f158017a.getWidth() / 2))) {
                    rawX = this.f158018b.getX() - ((float) (this.f158017a.getWidth() / 2));
                }
                if ((rawX - this.f158018b.getX()) + ((float) (this.f158017a.getWidth() / 2)) >= ((float) (this.f158018b.getWidth() - m124735c()))) {
                    rawX = ((this.f158018b.getX() - ((float) (this.f158017a.getWidth() / 2))) + ((float) this.f158018b.getWidth())) - ((float) m124735c());
                }
                if (rawX < 0.0f) {
                    rawX = 0.0f;
                }
                this.f158017a.animate().x(rawX).setDuration(0).start();
                int x2 = (int) ((this.f158017a.getX() + ((float) (this.f158017a.getWidth() / 2))) - this.f158018b.getX());
                if (x2 < 0 || this.f158032p) {
                    x2 = 0;
                }
                this.f158018b.setStart(x2);
                this.f158018b.setLength(mo111410a());
                TextView textView = this.f158019c;
                double x3 = (double) this.f158017a.getX();
                Double.isNaN(x3);
                double x4 = (double) this.f158018b.getX();
                Double.isNaN(x4);
                double d4 = (x3 * 1.0d) - x4;
                double width2 = (double) (this.f158017a.getWidth() / 2);
                Double.isNaN(width2);
                double d5 = d4 + width2;
                double width3 = (double) this.f158018b.getWidth();
                Double.isNaN(width3);
                double d6 = d5 / width3;
                int i3 = this.f158025i;
                double d7 = (double) i3;
                Double.isNaN(d7);
                int i4 = (int) (d6 * d7);
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 <= i3) {
                    i = i4;
                }
                textView.setText(C40983r.m82524a(i));
            }
        } else {
            this.f158030n = motionEvent.getRawX();
            this.f158031o = this.f158017a.getX();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo111411a(C70625d dVar, int i, int i2) {
        C70612k.f158036f.mo111418a(dVar, (long) i, (long) i2);
        C70612k.m124749b(dVar);
        if (dVar == null || this.f158022f == null) {
            m124732a(true);
            return;
        }
        m124732a(false);
        this.f158022f.setAudioWaveViewData(dVar);
    }

    /* renamed from: a */
    public static View$OnTouchListenerC70606h m124731a(View view, int i, int i2, int i3) {
        View$OnTouchListenerC70606h hVar = new View$OnTouchListenerC70606h();
        hVar.f158029m = i;
        hVar.f158024h = i3;
        hVar.f158025i = i2;
        hVar.m124730a(view);
        view.post(RunnableC70610i.m124742a(hVar));
        AbstractC70609b bVar = hVar.f158027k;
        if (bVar != null) {
            bVar.mo111389b(i3);
        }
        return hVar;
    }
}
