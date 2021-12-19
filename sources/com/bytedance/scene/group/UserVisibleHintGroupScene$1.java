package com.bytedance.scene.group;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* access modifiers changed from: package-private */
public class UserVisibleHintGroupScene$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC22213f f52445a;

    static {
        Covode.recordClassIndex(25990);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f52445a.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        this.f52445a.f52520d = false;
        if (this.f52445a.f52519c) {
            this.f52445a.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        this.f52445a.f52520d = true;
        if (this.f52445a.f52519c) {
            this.f52445a.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_RESUME);
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
        this.f52445a.f52521e = true;
        if (this.f52445a.f52519c) {
            this.f52445a.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_START);
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        this.f52445a.f52521e = false;
        if (this.f52445a.f52519c) {
            this.f52445a.f52518b.mo36461a(AbstractC1196i.EnumC1198a.ON_STOP);
        }
    }

    UserVisibleHintGroupScene$1(AbstractC22213f fVar) {
        this.f52445a = fVar;
    }
}
