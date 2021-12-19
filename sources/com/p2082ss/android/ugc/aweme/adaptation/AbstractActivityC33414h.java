package com.p2082ss.android.ugc.aweme.adaptation;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.C69830ah;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;

/* renamed from: com.ss.android.ugc.aweme.adaptation.h */
public abstract class AbstractActivityC33414h extends ActivityC33402b {

    /* renamed from: d */
    public boolean f79438d = true;

    /* renamed from: e */
    private boolean f79439e = true;

    /* renamed from: f */
    private boolean f79440f = true;

    /* renamed from: g */
    private View f79441g;

    /* renamed from: h */
    private int f79442h;

    /* renamed from: i */
    private View.OnLayoutChangeListener f79443i = new View$OnLayoutChangeListenerC33415i(this);

    static {
        Covode.recordClassIndex(40271);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59490a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo59491a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo59493b(boolean z);

    /* access modifiers changed from: protected */
    public boolean cC_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo59496h();

    public final void cB_() {
        mo59496h();
        mo87538j();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onDestroy() {
        super.onDestroy();
        View view = this.f79441g;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f79443i);
            this.f79443i = null;
        }
    }

    /* renamed from: j */
    private void mo87538j() {
        switch (C33398a.f79357a.mo59448a()) {
            case 1:
            case 4:
                mo59491a(true);
                mo59493b(true);
                return;
            case 2:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                mo59491a(false);
                mo59493b(true);
                return;
            case 3:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                mo59491a(true);
                mo59493b(false);
                return;
            default:
                mo59491a(false);
                mo59493b(false);
                return;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onResume() {
        super.onResume();
        if (this.f79440f) {
            this.f79440f = false;
            int d = C70636dh.m124835d(this);
            this.f79442h = d;
            if (d != C33398a.f79357a.mo59451b()) {
                C33398a.f79357a.mo59449a(this.f79442h);
            }
            cB_();
            if (this.f79438d) {
                this.f79441g.addOnLayoutChangeListener(this.f79443i);
            } else {
                this.f79441g.removeOnLayoutChangeListener(this.f79443i);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        super.onStart();
        if (this.f79439e) {
            this.f79439e = false;
            getWindow().clearFlags(1024);
            C69830ah.m123395a(this);
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            getWindow().getDecorView().setBackgroundColor(-16777216);
            mo59490a(C70636dh.m124833c(this), C33398a.m68487c());
            this.f79441g = findViewById(16908290);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f79438d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo59492b(int i, int i2) {
        int d;
        if (i != i2 && cC_() && this.f79442h != (d = C70636dh.m124835d(this))) {
            this.f79442h = d;
            C33398a.f79357a.mo59449a(d);
            cB_();
        }
    }
}
