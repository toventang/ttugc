package com.p2082ss.android.ugc.aweme.view;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69830ah;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;

/* renamed from: com.ss.android.ugc.aweme.view.w */
public abstract class AbstractC81298w extends AbstractC22186b {

    /* renamed from: b */
    private boolean f181622b = true;

    /* renamed from: c */
    private boolean f181623c = true;

    /* renamed from: d */
    private View f181624d;

    /* renamed from: e */
    private final View.OnLayoutChangeListener f181625e = new View$OnLayoutChangeListenerC81299a(this);

    /* renamed from: f */
    public boolean f181626f = true;

    /* renamed from: g */
    public boolean f181627g = true;

    /* renamed from: h */
    public int f181628h;

    static {
        Covode.recordClassIndex(94628);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo62771E();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo120625a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo120626a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo120627b(boolean z);

    /* renamed from: M */
    public final void mo124762M() {
        mo62771E();
        mo121094F();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public void mo22713n_() {
        super.mo22713n_();
        m141024c(false);
    }

    /* renamed from: F */
    private final void mo121094F() {
        switch (C33398a.f79357a.mo59448a()) {
            case 1:
            case 4:
                mo120626a(true);
                mo120627b(true);
                return;
            case 2:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                mo120626a(false);
                mo120627b(true);
                return;
            case 3:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                mo120626a(true);
                mo120627b(false);
                return;
            default:
                mo120626a(false);
                mo120627b(false);
                return;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        if (this.f181623c) {
            this.f181623c = false;
            int d = C70636dh.m124835d(this.f52549m);
            this.f181628h = d;
            if (d != C33398a.f79357a.mo59451b()) {
                C33398a.f79357a.mo59449a(this.f181628h);
            }
            mo124762M();
            m141024c(this.f181626f);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: v */
    public final void mo36489v() {
        View view;
        Window window;
        View decorView;
        Activity activity;
        Window window2;
        Window window3;
        super.mo36489v();
        if (this.f181622b) {
            this.f181622b = false;
            Activity activity2 = this.f52549m;
            if (!(activity2 == null || (window3 = activity2.getWindow()) == null)) {
                window3.clearFlags(1024);
            }
            C69830ah.m123395a(this.f52549m);
            if (!(Build.VERSION.SDK_INT < 21 || (activity = this.f52549m) == null || (window2 = activity.getWindow()) == null)) {
                window2.setNavigationBarColor(-16777216);
            }
            Activity activity3 = this.f52549m;
            if (!(activity3 == null || (window = activity3.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                decorView.setBackgroundColor(-16777216);
            }
            mo120625a(C70636dh.m124833c(this.f52549m), C33398a.m68487c());
            Activity activity4 = this.f52549m;
            if (activity4 != null) {
                view = activity4.findViewById(16908290);
            } else {
                view = null;
            }
            this.f181624d = view;
        }
    }

    /* renamed from: c */
    private final void m141024c(boolean z) {
        if (z) {
            View view = this.f181624d;
            if (view != null) {
                view.addOnLayoutChangeListener(this.f181625e);
                return;
            }
            return;
        }
        View view2 = this.f181624d;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.f181625e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.w$a */
    static final class View$OnLayoutChangeListenerC81299a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC81298w f181629a;

        static {
            Covode.recordClassIndex(94629);
        }

        View$OnLayoutChangeListenerC81299a(AbstractC81298w wVar) {
            this.f181629a = wVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int d;
            if (i4 != i8 && this.f181629a.f181627g && this.f181629a.f181628h != (d = C70636dh.m124835d(this.f181629a.f52549m))) {
                this.f181629a.f181628h = d;
                C33398a.f79357a.mo59449a(d);
                this.f181629a.mo124762M();
            }
        }
    }
}
