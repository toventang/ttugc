package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtSeekBar;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.q */
public final class C71962q {

    /* renamed from: a */
    public View f161261a;

    /* renamed from: b */
    public TextView f161262b;

    /* renamed from: c */
    public TextView f161263c;

    /* renamed from: d */
    public int f161264d = 100;

    /* renamed from: e */
    public int f161265e = 100;

    /* renamed from: f */
    public boolean f161266f;

    /* renamed from: g */
    public AbstractC71966a f161267g;

    /* renamed from: h */
    public AbstractC71967b f161268h;

    /* renamed from: i */
    public View f161269i = null;

    /* renamed from: j */
    private AVDmtSeekBar f161270j;

    /* renamed from: k */
    private AVDmtSeekBar f161271k;

    /* renamed from: l */
    private View f161272l;

    /* renamed from: m */
    private ActivityC0945e f161273m;

    /* renamed from: n */
    private VideoPublishEditModel f161274n;

    /* renamed from: o */
    private AbstractC84919c f161275o;

    /* renamed from: p */
    private AbstractC84917a f161276p = new C71968r(this);

    /* renamed from: q */
    private boolean f161277q = false;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.q$a */
    public interface AbstractC71966a {
        static {
            Covode.recordClassIndex(84515);
        }

        /* renamed from: a */
        void mo88207a(float f);

        /* renamed from: b */
        void mo88208b(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.q$b */
    public interface AbstractC71967b {
        static {
            Covode.recordClassIndex(84516);
        }

        /* renamed from: a */
        void mo88209a();
    }

    static {
        Covode.recordClassIndex(84511);
    }

    /* renamed from: g */
    private void m127049g() {
        this.f161261a.setVisibility(4);
    }

    /* renamed from: b */
    private void m127043b() {
        if (this.f161266f) {
            this.f161271k.setProgress(this.f161264d);
        }
    }

    /* renamed from: c */
    private void m127044c() {
        if (this.f161266f) {
            this.f161270j.setProgress(this.f161265e);
        }
    }

    /* renamed from: e */
    private void m127046e() {
        View view;
        this.f161271k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.C719631 */

            static {
                Covode.recordClassIndex(84512);
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                float f = (((float) i) * 1.0f) / 100.0f;
                if (C71962q.this.f161267g != null) {
                    C71962q.this.f161267g.mo88208b(f);
                }
                C71962q.this.f161264d = i;
            }
        });
        this.f161270j.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.C719642 */

            static {
                Covode.recordClassIndex(84513);
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                float f = (((float) i) * 1.0f) / 100.0f;
                if (C71962q.this.f161267g != null) {
                    C71962q.this.f161267g.mo88207a(f);
                }
                C71962q.this.f161265e = i;
            }
        });
        View view2 = this.f161272l;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.View$OnClickListenerC719653 */

                static {
                    Covode.recordClassIndex(84514);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C71962q.this.mo113605a();
                }
            });
        }
        if (this.f161277q && (view = this.f161269i) != null) {
            view.setOnClickListener(new View$OnClickListenerC71969s(this));
            View view3 = this.f161261a;
            if (view3 != null) {
                view3.setOnClickListener(View$OnClickListenerC71970t.f161283a);
            }
        }
    }

    /* renamed from: f */
    private void m127047f() {
        this.f161261a.setVisibility(0);
        this.f161261a.setTranslationY(C30745b.m63132b(this.f161273m, 400.0f));
        this.f161261a.animate().translationY(0.0f).setDuration(400).start();
    }

    /* renamed from: a */
    public final void mo113605a() {
        AbstractC71967b bVar = this.f161268h;
        if (bVar != null) {
            bVar.mo88209a();
        }
        try {
            C40982q.m82521a("aweme_short_video_volume_set", (String) null, new JSONObject().put("mVoiceVolume", this.f161265e).put("mMusicVolume", this.f161264d));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m127045d() {
        this.f161270j = (AVDmtSeekBar) this.f161261a.findViewById(R.id.dtr);
        this.f161271k = (AVDmtSeekBar) this.f161261a.findViewById(R.id.dts);
        this.f161270j.setDisplayPercent(true);
        this.f161271k.setDisplayPercent(true);
        this.f161262b = (TextView) this.f161261a.findViewById(R.id.f0t);
        this.f161263c = (TextView) this.f161261a.findViewById(R.id.f0u);
        this.f161272l = this.f161261a.findViewById(R.id.btt);
        this.f161270j.setMax(200);
        this.f161271k.setMax(200);
    }

    /* renamed from: a */
    public final C71962q mo113604a(int i) {
        this.f161264d = i;
        m127043b();
        return this;
    }

    /* renamed from: b */
    public final C71962q mo113608b(int i) {
        this.f161265e = i;
        m127044c();
        return this;
    }

    public C71962q(VideoPublishEditModel videoPublishEditModel) {
        this.f161274n = videoPublishEditModel;
    }

    /* renamed from: a */
    public final void mo113607a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 100;
        }
        this.f161265e = i;
    }

    /* renamed from: b */
    public final void mo113609b(boolean z) {
        if (!this.f161266f) {
            this.f161277q = z;
            m127045d();
            m127046e();
            this.f161266f = true;
        }
    }

    /* renamed from: d */
    public final C71962q mo113611d(boolean z) {
        float f;
        if (this.f161266f) {
            this.f161271k.setEnabled(z);
            AVDmtSeekBar aVDmtSeekBar = this.f161271k;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            aVDmtSeekBar.setAlpha(f);
            if (!z) {
                this.f161271k.setProgress(0);
            }
        }
        return this;
    }

    /* renamed from: c */
    public final C71962q mo113610c(boolean z) {
        float f;
        if (this.f161266f) {
            this.f161270j.setEnabled(z);
            AVDmtSeekBar aVDmtSeekBar = this.f161270j;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            aVDmtSeekBar.setAlpha(f);
            if (!z) {
                this.f161270j.setProgress(0);
            }
        }
        m127048f(z);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m127048f(boolean r4) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71962q.m127048f(boolean):void");
    }

    /* renamed from: e */
    public final void mo113612e(boolean z) {
        if (this.f161266f) {
            if (z) {
                m127047f();
                AbstractC84919c cVar = this.f161275o;
                if (cVar != null) {
                    cVar.mo87535c(this.f161276p);
                    this.f161275o.mo87533b(this.f161276p);
                    return;
                }
                return;
            }
            m127049g();
            AbstractC84919c cVar2 = this.f161275o;
            if (cVar2 != null) {
                cVar2.mo87535c(this.f161276p);
            }
        }
    }

    /* renamed from: a */
    public final void mo113606a(ActivityC0945e eVar, AbstractC84919c cVar) {
        this.f161273m = eVar;
        this.f161275o = cVar;
    }
}
