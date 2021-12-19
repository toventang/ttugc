package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.b */
public final /* synthetic */ class C7292b implements AbstractC88433f {

    /* renamed from: a */
    private final Handler f18127a;

    static {
        Covode.recordClassIndex(8055);
    }

    public C7292b(Handler handler) {
        this.f18127a = handler;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Handler handler = this.f18127a;
        C5827a aVar = (C5827a) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(22);
            try {
                List<Room> list = aVar.f14684b;
                if (list == null) {
                    list = new ArrayList(1);
                }
                for (Room room : list) {
                    try {
                        room.setRequestId(((C2965a) aVar.f14685c).f8720f);
                        room.setLog_pb(((C2965a) aVar.f14685c).mo7786a().toString());
                    } catch (Exception unused) {
                    }
                }
                obtainMessage.obj = list;
            } catch (Exception unused2) {
            }
            handler.sendMessage(obtainMessage);
        }
    }
}
