package com.p2082ss.android.ugc.gamora.recorder.sticker.support;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bef.effectsdk.view.BEFView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.support.StickerSupportLogicComponent$lifecycleObserver$1 */
public final class StickerSupportLogicComponent$lifecycleObserver$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C84103b f187687a;

    static {
        Covode.recordClassIndex(97997);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        BEFView bEFView = this.f187687a.f187689b;
        if (bEFView != null) {
            bEFView.onPause();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        BEFView bEFView = this.f187687a.f187689b;
        if (bEFView != null) {
            bEFView.onResume();
        }
        this.f187687a.mo128933b();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    StickerSupportLogicComponent$lifecycleObserver$1(C84103b bVar) {
        this.f187687a = bVar;
    }
}
