package com.bytedance.android.livesdk.hashtag;

import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashtagAudienceShowEntranceSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9025as;
import com.bytedance.android.livesdk.p561j.C9091dc;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4613b.C89219l;

public final class AudienceHashTagWidget extends BaseHashTagWidget implements AbstractC33974au {

    /* renamed from: d */
    private boolean f21987d;

    /* renamed from: e */
    private boolean f21988e;

    static {
        Covode.recordClassIndex(9805);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /* renamed from: a */
    public final void mo15186a(Hashtag hashtag) {
        C89219l.m154721d(hashtag, "");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        return LiveHashtagAudienceShowEntranceSetting.INSTANCE.enable();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /* renamed from: a */
    public final void mo15184a() {
        C6501b.C6502a.m13948a("livesdk_viewer_topic_click").mo12643a(this.dataChannel).mo12655b();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /* renamed from: b */
    public final void mo15187b() {
        if (this.f21988e && !this.f21987d) {
            this.f21987d = true;
            C6501b.C6502a.m13948a("livesdk_viewer_topic_show").mo12643a(this.dataChannel).mo12655b();
        }
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        attach();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /* renamed from: a */
    public final void mo15185a(AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        C8946h hVar = new C8946h();
        String simpleName = BaseHashTagWidget.class.getSimpleName();
        C89219l.m154716b(simpleName, "");
        hVar.show(iVar, simpleName);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        this.f21988e = z;
        if (!z) {
            this.f21987d = false;
        }
        if (isShowing()) {
            mo15187b();
        }
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool;
        super.onLoad(objArr);
        AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        if (aVar != null) {
            bool = Boolean.valueOf(aVar.isMicRoomForCurrentRoom());
        } else {
            bool = null;
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            this.dataChannel.mo28311a(C9025as.class, (Object) false);
            hide();
        } else {
            this.dataChannel.mo28311a(C9025as.class, (Object) true);
            mo15189c();
        }
        this.dataChannel.mo28319c(C9091dc.class);
    }
}
