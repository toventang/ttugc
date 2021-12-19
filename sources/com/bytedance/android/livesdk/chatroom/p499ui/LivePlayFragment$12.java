package com.bytedance.android.livesdk.chatroom.p499ui;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$12 */
public class LivePlayFragment$12 implements AbstractC1192f {

    /* renamed from: a */
    final /* synthetic */ C7822br f19082a;

    static {
        Covode.recordClassIndex(8487);
    }

    LivePlayFragment$12(C7822br brVar) {
        this.f19082a = brVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        ActivityC0945e activity;
        if (aVar.equals(AbstractC1196i.EnumC1198a.ON_START) && this.f19082a.f19411J != null && (activity = this.f19082a.getActivity()) != null && activity.getWindow() != null && this.f19082a.f19506n == 1 && this.f19082a.f19411J != null && this.f19082a.mo14088C().mo12704e() != null) {
            this.f19082a.mo14088C().mo12704e().mo15452a(true);
        }
    }
}
