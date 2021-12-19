package com.bytedance.android.livesdk.chatroom.p499ui;

import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11659m;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$16 */
public class LivePlayFragment$16 implements AbstractC1192f {

    /* renamed from: a */
    final /* synthetic */ C7822br f19083a;

    static {
        Covode.recordClassIndex(8488);
    }

    LivePlayFragment$16(C7822br brVar) {
        this.f19083a = brVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar.equals(AbstractC1196i.EnumC1198a.ON_START) && this.f19083a.mo14088C().mo12704e() != null) {
            AbstractC11659m e = this.f19083a.mo14088C().mo12704e();
            this.f19083a.f19413L.getView();
            e.mo15451a();
        }
    }
}
