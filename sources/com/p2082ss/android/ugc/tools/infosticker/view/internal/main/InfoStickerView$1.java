package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerView$1 */
public final class InfoStickerView$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C84752l f189270a;

    static {
        Covode.recordClassIndex(98691);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f189270a.f189381A.isDisposed()) {
            this.f189270a.f189381A.dispose();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    InfoStickerView$1(C84752l lVar) {
        this.f189270a = lVar;
    }
}
