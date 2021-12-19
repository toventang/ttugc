package com.bytedance.android.live.liveinteract.match.widget;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public abstract class SubWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: A */
    public boolean f13294A;

    /* renamed from: y */
    public C4384b f13295y;

    /* renamed from: z */
    public Room f13296z;

    static {
        Covode.recordClassIndex(5713);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f13295y = C4384b.C4385a.m10496a();
        this.f13296z = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f13294A = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
    }

    public SubWidget(View view) {
        this.contentView = view;
    }
}
