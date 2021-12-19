package com.bytedance.android.livesdk.share;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9122eg;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LiveShareWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    boolean f25919a;

    /* renamed from: b */
    public Room f25920b;

    /* renamed from: c */
    User f25921c;

    /* renamed from: d */
    private final C88411a f25922d = new C88411a();

    static {
        Covode.recordClassIndex(12361);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.f25922d.mo142944a();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f25919a = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f25920b = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f25921c = (User) this.dataChannel.mo28318b(C9101dm.class);
        this.dataChannel.mo28309a((AbstractC1204m) this, C9122eg.class, (AbstractC89172b) new C10763a(this));
    }
}
