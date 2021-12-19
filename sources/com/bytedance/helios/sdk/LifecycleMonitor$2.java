package com.bytedance.helios.sdk;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* access modifiers changed from: package-private */
public class LifecycleMonitor$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C15434f f37423a;

    static {
        Covode.recordClassIndex(17596);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStarted();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStopped();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStarted() {
        HandlerThreadC15486g.m28499b().removeCallbacks(this.f37423a.f37680i);
        this.f37423a.f37675d.set(true);
        this.f37423a.f37679h.set(false);
        this.f37423a.f37675d.get();
        C15484f.m28490a("Helios-Log-Page-State", "EnterForeground");
        this.f37423a.mo25166a(null, 7);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStopped() {
        this.f37423a.f37675d.set(false);
        HandlerThreadC15486g.m28499b().postDelayed(this.f37423a.f37680i, HeliosEnvImpl.INSTANCE.getBackgroundFreezeDuration());
        this.f37423a.f37675d.get();
        C15484f.m28490a("Helios-Log-Page-State", "EnterBackground");
        C15434f fVar = this.f37423a;
        fVar.f37677f = fVar.f37676e;
        C15434f fVar2 = this.f37423a;
        fVar2.f37681j = fVar2.f37678g;
        this.f37423a.f37676e = "null";
        this.f37423a.f37678g = 0;
        this.f37423a.mo25166a(null, 6);
    }

    LifecycleMonitor$2(C15434f fVar) {
        this.f37423a = fVar;
    }
}
