package com.p2082ss.android.ugc.aweme.music.service;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.music.service.MusicRecordService$2 */
class MusicRecordService$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C61068e f138543a;

    static {
        Covode.recordClassIndex(71661);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f138543a.f138544a = false;
        this.f138543a.f138548e.mo98758b();
    }

    MusicRecordService$2(C61068e eVar) {
        this.f138543a = eVar;
    }
}
