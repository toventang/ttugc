package com.p2082ss.android.ugc.aweme.ecommerce.preloader;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45096d;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloader$Queue$2 */
public final class ImagePreloader$Queue$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C45096d.C45099c f105127a;

    static {
        Covode.recordClassIndex(53515);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            resume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            pause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void pause() {
        this.f105127a.f105160a = false;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void destroy() {
        this.f105127a.clear();
        C45096d.f105153a.remove(this.f105127a);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void resume() {
        this.f105127a.f105160a = true;
        if (this.f105127a.size() > 0) {
            C45096d.m87748b();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ImagePreloader$Queue$2(C45096d.C45099c cVar) {
        this.f105127a = cVar;
    }
}
