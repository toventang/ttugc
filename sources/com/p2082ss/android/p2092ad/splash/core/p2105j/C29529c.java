package com.p2082ss.android.p2092ad.splash.core.p2105j;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.AbstractC29541p;
import com.p2082ss.android.p2092ad.splash.core.p2099d.AbstractC29450b;
import com.p2082ss.android.p2092ad.splash.core.p2099d.C29448a;
import com.p2082ss.android.p2092ad.splash.core.p2099d.C29451c;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29622h;

/* renamed from: com.ss.android.ad.splash.core.j.c */
public final class C29529c extends RelativeLayout {

    /* renamed from: a */
    public C29451c f70347a;

    /* renamed from: b */
    public C29448a f70348b;

    /* renamed from: c */
    public AbstractC29450b f70349c;

    /* renamed from: d */
    public AbstractC29541p f70350d;

    /* renamed from: e */
    public C29455b f70351e;

    /* renamed from: f */
    public int f70352f = 1;

    /* renamed from: g */
    public int f70353g = -1;

    static {
        Covode.recordClassIndex(35923);
    }

    /* renamed from: b */
    public final void mo51627b() {
        C29448a aVar = this.f70348b;
        if (aVar != null) {
            aVar.mo51524a();
        }
    }

    public final AbstractC29621g getBDAVideoController() {
        return getController();
    }

    private AbstractC29621g getController() {
        C29448a aVar = this.f70348b;
        if (aVar != null) {
            return aVar.mo51523a(this.f70352f);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo51626a() {
        if (getController() != null) {
            this.f70353g = 2;
            getController().mo51863b();
        }
        AbstractC29541p pVar = this.f70350d;
        if (pVar != null) {
            pVar.mo51660a(this.f70351e, 2 - this.f70352f);
        }
    }

    public final void setBreakReason(int i) {
        this.f70353g = i;
    }

    public final void setSplashAdInteraction(AbstractC29541p pVar) {
        this.f70350d = pVar;
    }

    public final void setGestureDetector(GestureDetector gestureDetector) {
        this.f70347a.setGestureDetector(gestureDetector);
    }

    public final void setOnPageChangeListener(AbstractC29450b bVar) {
        if (bVar != null) {
            this.f70349c = bVar;
        }
    }

    public final void setMute(boolean z) {
        if (getController() != null) {
            getController().mo51860a(z);
        }
    }

    public C29529c(Context context) {
        super(context);
        MethodCollector.m26663i(12829);
        MethodCollector.m26664o(12829);
    }

    public final void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        for (AbstractC29622h hVar : this.f70348b.f69963b) {
            hVar.setSurfaceLayoutParams(layoutParams);
        }
    }
}
