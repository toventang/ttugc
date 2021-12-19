package com.p2082ss.android.ugc.aweme.photo;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.photo.PhotoCanvasEnterEditNextImpl$startActivitySafely$1 */
public final class PhotoCanvasEnterEditNextImpl$startActivitySafely$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ Context f142532a;

    /* renamed from: b */
    final /* synthetic */ AbstractC89171a f142533b;

    static {
        Covode.recordClassIndex(73681);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onActivityStart();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onActivityStart() {
        ((AbstractC1204m) this.f142532a).getLifecycle().mo4013b(this);
        this.f142533b.invoke();
    }

    PhotoCanvasEnterEditNextImpl$startActivitySafely$1(Context context, AbstractC89171a aVar) {
        this.f142532a = context;
        this.f142533b = aVar;
    }
}
