package com.bytedance.android.livesdk.chatroom;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class LiveOntologyInfoManager$$Lambda$0 implements AbstractC1192f {

    /* renamed from: a */
    private final C7411d f18061a;

    static {
        Covode.recordClassIndex(8010);
    }

    public LiveOntologyInfoManager$$Lambda$0(C7411d dVar) {
        this.f18061a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C7411d dVar = this.f18061a;
        if ((mVar instanceof ActivityC0945e) && ((ActivityC0945e) mVar).isFinishing() && AbstractC1196i.EnumC1198a.ON_DESTROY.equals(aVar) && mVar.hashCode() == dVar.f18375c) {
            dVar.f18373a = false;
            dVar.f18374b = null;
            mVar.getLifecycle().mo4013b(dVar.f18376d);
            dVar.f18376d = null;
        }
    }
}
