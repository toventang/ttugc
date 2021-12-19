package com.bytedance.android.livesdk.function;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.C6888ay;
import com.bytedance.android.livesdk.chatroom.detail.C7445j;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4560f.p4561a.p4565b.AbstractC88412b;

public class UserPermissionCheckWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    Room f21605a;

    /* renamed from: b */
    String f21606b;

    /* renamed from: c */
    String f21607c;

    /* renamed from: d */
    String f21608d;

    /* renamed from: e */
    private C7445j f21609e;

    /* renamed from: f */
    private AbstractC88412b f21610f;

    static {
        Covode.recordClassIndex(9632);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        AbstractC88412b bVar = this.f21610f;
        if (bVar != null && !bVar.isDisposed()) {
            this.f21610f.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        this.f21605a = (Room) this.dataChannel.mo28318b(C9093de.class);
        C7445j jVar = (C7445j) this.dataChannel.mo28318b(C6888ay.class);
        this.f21609e = jVar;
        if (jVar != null) {
            this.f21606b = jVar.f18512t;
            this.f21607c = this.f21609e.f18500h;
            this.f21608d = this.f21609e.f18513u;
        }
        this.f21610f = C11115u.m19743a().mo17915b().mo13168h().mo143202b(new C8771n(this));
    }
}
