package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.RecordStage$startActivitySafely$1 */
public final class RecordStage$startActivitySafely$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ Context f165390a;

    /* renamed from: b */
    final /* synthetic */ AbstractC89171a f165391b;

    static {
        Covode.recordClassIndex(86323);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onActivityStart();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onActivityStart() {
        ((AbstractC1204m) this.f165390a).getLifecycle().mo4013b(this);
        this.f165391b.invoke();
    }

    RecordStage$startActivitySafely$1(Context context, AbstractC89171a aVar) {
        this.f165390a = context;
        this.f165391b = aVar;
    }
}
