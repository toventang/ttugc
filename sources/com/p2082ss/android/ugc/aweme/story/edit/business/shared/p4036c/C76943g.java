package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4036c;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtSeekBar;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g */
public final class C76943g {

    /* renamed from: k */
    public static final C76944a f172640k = new C76944a((byte) 0);

    /* renamed from: a */
    public TextView f172641a;

    /* renamed from: b */
    public TextView f172642b;

    /* renamed from: c */
    View f172643c;

    /* renamed from: d */
    AVDmtSeekBar f172644d;

    /* renamed from: e */
    AVDmtSeekBar f172645e;

    /* renamed from: f */
    public int f172646f = 100;

    /* renamed from: g */
    public int f172647g = 100;

    /* renamed from: h */
    public boolean f172648h;

    /* renamed from: i */
    public AbstractC76945b f172649i;

    /* renamed from: j */
    public AbstractC76946c f172650j;

    /* renamed from: l */
    private final AbstractC84917a f172651l = new C76950g(this);

    /* renamed from: m */
    private final AbstractC84919c f172652m;

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g$b */
    public interface AbstractC76945b {
        static {
            Covode.recordClassIndex(89941);
        }

        /* renamed from: a */
        void mo120499a(float f);

        /* renamed from: b */
        void mo120500b(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g$c */
    public interface AbstractC76946c {
        static {
            Covode.recordClassIndex(89942);
        }
    }

    static {
        Covode.recordClassIndex(89939);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g$a */
    public static final class C76944a {
        static {
            Covode.recordClassIndex(89940);
        }

        private C76944a() {
        }

        public /* synthetic */ C76944a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private void m134556a() {
        if (this.f172648h) {
            AVDmtSeekBar aVDmtSeekBar = this.f172645e;
            if (aVDmtSeekBar == null) {
                C89219l.m154710a("mMusicSeekBar");
            }
            aVDmtSeekBar.setProgress(this.f172646f);
        }
    }

    /* renamed from: b */
    private void m134557b() {
        if (this.f172648h) {
            AVDmtSeekBar aVDmtSeekBar = this.f172644d;
            if (aVDmtSeekBar == null) {
                C89219l.m154710a("mVoiceSeekBar");
            }
            aVDmtSeekBar.setProgress(this.f172647g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g$d */
    public static final class C76947d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C76943g f172653a;

        static {
            Covode.recordClassIndex(89943);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            C89219l.m154721d(seekBar, "");
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            C89219l.m154721d(seekBar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76947d(C76943g gVar) {
            this.f172653a = gVar;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C89219l.m154721d(seekBar, "");
            float f = (((float) i) * 1.0f) / 100.0f;
            AbstractC76945b bVar = this.f172653a.f172649i;
            if (bVar != null) {
                bVar.mo120500b(f);
            }
            this.f172653a.f172646f = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g$e */
    public static final class C76948e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C76943g f172654a;

        static {
            Covode.recordClassIndex(89944);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            C89219l.m154721d(seekBar, "");
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            C89219l.m154721d(seekBar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76948e(C76943g gVar) {
            this.f172654a = gVar;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C89219l.m154721d(seekBar, "");
            float f = (((float) i) * 1.0f) / 100.0f;
            AbstractC76945b bVar = this.f172654a.f172649i;
            if (bVar != null) {
                bVar.mo120499a(f);
            }
            this.f172654a.f172647g = i;
        }
    }

    /* renamed from: a */
    public final void mo120501a(int i) {
        this.f172646f = i;
        m134556a();
    }

    /* renamed from: b */
    public final void mo120503b(int i) {
        this.f172647g = i;
        m134557b();
    }

    public C76943g(AbstractC84919c cVar) {
        this.f172652m = cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g$f */
    static final class View$OnClickListenerC76949f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76943g f172655a;

        static {
            Covode.recordClassIndex(89945);
        }

        View$OnClickListenerC76949f(C76943g gVar) {
            this.f172655a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C76943g gVar = this.f172655a;
            try {
                C40982q.m82521a("aweme_short_video_volume_set", (String) null, new JSONObject().put("mVoiceVolume", gVar.f172647g).put("mMusicVolume", gVar.f172646f));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo120502a(boolean z) {
        float f;
        if (this.f172648h) {
            AVDmtSeekBar aVDmtSeekBar = this.f172644d;
            if (aVDmtSeekBar == null) {
                C89219l.m154710a("mVoiceSeekBar");
            }
            aVDmtSeekBar.setEnabled(z);
            AVDmtSeekBar aVDmtSeekBar2 = this.f172644d;
            if (aVDmtSeekBar2 == null) {
                C89219l.m154710a("mVoiceSeekBar");
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            aVDmtSeekBar2.setAlpha(f);
            if (!z) {
                AVDmtSeekBar aVDmtSeekBar3 = this.f172644d;
                if (aVDmtSeekBar3 == null) {
                    C89219l.m154710a("mVoiceSeekBar");
                }
                aVDmtSeekBar3.setProgress(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo120504b(boolean z) {
        float f;
        if (this.f172648h) {
            AVDmtSeekBar aVDmtSeekBar = this.f172645e;
            if (aVDmtSeekBar == null) {
                C89219l.m154710a("mMusicSeekBar");
            }
            aVDmtSeekBar.setEnabled(z);
            AVDmtSeekBar aVDmtSeekBar2 = this.f172645e;
            if (aVDmtSeekBar2 == null) {
                C89219l.m154710a("mMusicSeekBar");
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            aVDmtSeekBar2.setAlpha(f);
            if (!z) {
                AVDmtSeekBar aVDmtSeekBar3 = this.f172645e;
                if (aVDmtSeekBar3 == null) {
                    C89219l.m154710a("mMusicSeekBar");
                }
                aVDmtSeekBar3.setProgress(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.c.g$g */
    static final class C76950g implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C76943g f172656a;

        static {
            Covode.recordClassIndex(89946);
        }

        C76950g(C76943g gVar) {
            this.f172656a = gVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f172656a.f172648h || this.f172656a.f172650j == null) {
                return false;
            }
            return true;
        }
    }
}
