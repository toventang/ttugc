package com.bytedance.android.livesdk.chatroom.end;

import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.h */
public class C7526h extends C10935a {

    /* renamed from: d */
    protected Room f18697d;

    /* renamed from: e */
    protected boolean f18698e;

    /* renamed from: f */
    protected boolean f18699f;

    /* renamed from: g */
    protected String f18700g;

    /* renamed from: h */
    public String f18701h;

    static {
        Covode.recordClassIndex(8298);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    /* renamed from: d */
    protected static void m15496d() {
        C6779a.m14563a().mo13053a(new C7400q(5));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo13780c() {
        Room room = this.f18697d;
        if (room != null && room.getOwner() != null) {
            User owner = this.f18697d.getOwner();
            AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
            if (aVar != null && aVar.isMicRoomForRoom(this.f18697d) && aVar.isMicAudienceForRoom(this.f18697d)) {
                Room room2 = this.f18697d;
                owner = (room2 == null || room2.officialChannelInfo == null || this.f18697d.officialChannelInfo.f23136a == null) ? this.f18697d.getOwner() : this.f18697d.officialChannelInfo.f23136a;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("log_enter_live_source", this.f18700g);
            hashMap.put("sec_user_id", owner.getSecUid());
            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).showUserProfile(owner.getId(), null, hashMap);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13779a(Room room) {
        this.f18697d = room;
        mo13780c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo13778a(int i) {
        if (getView() == null) {
            return null;
        }
        return (T) getView().findViewById(i);
    }
}
