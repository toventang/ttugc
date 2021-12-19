package com.p2082ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerNewView$1 */
public final class InfoStickerNewView$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C84827b f189533a;

    static {
        Covode.recordClassIndex(98801);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f189533a.f189548a.isDisposed()) {
            this.f189533a.f189548a.dispose();
        }
    }
}
