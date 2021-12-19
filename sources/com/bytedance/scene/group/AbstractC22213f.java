package com.bytedance.scene.group;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.group.f */
public abstract class AbstractC22213f extends AbstractC22186b {

    /* renamed from: b */
    public final C22214g f52518b = new C22214g();

    /* renamed from: c */
    public boolean f52519c = true;

    /* renamed from: d */
    public boolean f52520d = false;

    /* renamed from: e */
    public boolean f52521e = false;

    /* renamed from: f */
    private final AbstractC1203l f52522f = new UserVisibleHintGroupScene$1(this);

    static {
        Covode.recordClassIndex(26019);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public void mo22713n_() {
        super.mo22713n_();
        getLifecycle().mo4013b(this.f52522f);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: z */
    public final boolean mo36460z() {
        if (!super.mo36460z() || !this.f52519c) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: e */
    public final void mo36416e(Bundle bundle) {
        super.mo36416e(bundle);
        if (bundle != null) {
            this.f52519c = bundle.getBoolean("bd-scene-nav:scene_user_visible_hint");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: f */
    public final void mo36419f(Bundle bundle) {
        super.mo36419f(bundle);
        bundle.putBoolean("bd-scene-nav:scene_user_visible_hint", this.f52519c);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        this.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_CREATE);
        getLifecycle().mo4012a(this.f52522f);
    }

    /* renamed from: a */
    public void mo36459a(boolean z) {
        if (this.f52519c != z) {
            this.f52519c = z;
            mo36470A();
            if (this.f52519c) {
                if (this.f52521e) {
                    this.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_START);
                }
                if (this.f52520d) {
                    this.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_RESUME);
                    return;
                }
                return;
            }
            if (this.f52520d) {
                this.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_PAUSE);
            }
            if (this.f52521e) {
                this.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_STOP);
            }
        }
    }
}
