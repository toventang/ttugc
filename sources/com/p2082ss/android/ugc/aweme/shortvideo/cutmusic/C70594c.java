package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.AbstractC70604g;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.View$OnTouchListenerC70606h;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.c */
public final class C70594c implements AbstractC70604g, View$OnTouchListenerC70606h.AbstractC70608a, View$OnTouchListenerC70606h.AbstractC70609b {

    /* renamed from: a */
    public C70625d f157965a;

    /* renamed from: b */
    private View f157966b;

    /* renamed from: c */
    private FrameLayout f157967c;

    /* renamed from: d */
    private View$OnTouchListenerC70606h f157968d;

    /* renamed from: e */
    private AbstractC70604g.AbstractC70605a f157969e;

    static {
        Covode.recordClassIndex(83060);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.AbstractC70604g
    /* renamed from: a */
    public final boolean mo111388a() {
        MethodCollector.m26663i(10381);
        View view = this.f157966b;
        if (view != null) {
            this.f157967c.removeView(view);
            this.f157966b = null;
            MethodCollector.m26664o(10381);
            return true;
        }
        MethodCollector.m26664o(10381);
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.View$OnTouchListenerC70606h.AbstractC70609b
    /* renamed from: b */
    public final void mo111389b(int i) {
        this.f157969e.mo88312d(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.View$OnTouchListenerC70606h.AbstractC70608a
    /* renamed from: c */
    public final void mo111390c(int i) {
        mo111388a();
        this.f157969e.mo88313e(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.AbstractC70604g
    /* renamed from: a */
    public final void mo111386a(int i) {
        View$OnTouchListenerC70606h hVar = this.f157968d;
        if (hVar != null && hVar.f158022f != null && hVar.f158022f.getVisibility() == 0) {
            hVar.f158022f.mo111355b((((float) (i - hVar.f158024h)) * 1.0f) / ((float) hVar.f158025i));
        }
    }

    public C70594c(FrameLayout frameLayout, AbstractC70604g.AbstractC70605a aVar) {
        this.f157967c = frameLayout;
        this.f157969e = aVar;
    }

    /* renamed from: a */
    public final void mo111387a(int i, int i2, int i3) {
        MethodCollector.m26663i(10234);
        View a = C1764a.m5927a(LayoutInflater.from(this.f157967c.getContext()), R.layout.aee, this.f157967c, false);
        this.f157966b = a;
        this.f157967c.addView(a);
        View$OnTouchListenerC70606h a2 = View$OnTouchListenerC70606h.m124731a(this.f157966b, i, i2, i3);
        a2.f158026j = this;
        a2.f158027k = this;
        this.f157968d = a2;
        a2.mo111411a(C70612k.m124745a(this.f157965a), i, i2);
        this.f157966b.setAlpha(0.0f);
        this.f157966b.animate().alpha(1.0f).setDuration(200).start();
        MethodCollector.m26664o(10234);
    }
}
