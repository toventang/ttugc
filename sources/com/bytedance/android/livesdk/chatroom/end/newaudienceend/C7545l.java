package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.os.Message;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.end.C7523g;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l */
public final class C7545l implements AbstractC11623a, WeakHandler.IHandler {

    /* renamed from: a */
    WeakHandler f18756a = new WeakHandler(this);

    /* renamed from: b */
    public AbstractC7549a f18757b;

    /* renamed from: c */
    public AbstractC11623a f18758c;

    /* renamed from: d */
    C7523g f18759d = new C7523g();

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$a */
    public interface AbstractC7549a {
        static {
            Covode.recordClassIndex(8322);
        }

        /* renamed from: a */
        void mo13786a(List<Room> list);

        /* renamed from: b */
        void mo13787b();

        /* renamed from: b */
        void mo13789b(Room room);

        /* renamed from: c */
        void mo13790c(Room room);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$b */
    interface AbstractC7550b {
        static {
            Covode.recordClassIndex(8323);
        }

        /* renamed from: a */
        void mo13795a(User user);
    }

    static {
        Covode.recordClassIndex(8318);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a
    /* renamed from: i_ */
    public final boolean mo13772i_() {
        AbstractC11623a aVar = this.f18758c;
        if (aVar == null || !aVar.mo13772i_()) {
            return false;
        }
        return true;
    }

    C7545l(AbstractC7549a aVar) {
        this.f18757b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13804a(long j) {
        if (this.f18756a != null) {
            C7307f.f18161a.mo13558a(this.f18756a, false, j, 4, 12);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        AbstractC7549a aVar;
        int i = message.what;
        if (message.obj instanceof Exception) {
            if (!(i == 21 || i == 22 || !(message.obj instanceof C2912a))) {
                C11226ao.m19883a(C3966y.m9669e(), ((C2912a) message.obj).getPrompt(), 0);
            }
        } else if (22 == i) {
            if (message.obj instanceof List) {
                try {
                    List<Room> list = (List) message.obj;
                    AbstractC7549a aVar2 = this.f18757b;
                    if (aVar2 != null) {
                        aVar2.mo13786a(list);
                        StringBuilder sb = new StringBuilder();
                        for (Room room : list) {
                            sb.append(room.getIdStr()).append(":").append(room.getOwnerUserId()).append(";");
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("room", sb.toString());
                        C3868c.m9491a("ttlive_live_end_recommend_live", 0, hashMap);
                    }
                } catch (Throwable th) {
                    C3854a.m9458a("LiveEnd", th);
                }
            }
        } else if (i == 12 && (message.obj instanceof Room) && (aVar = this.f18757b) != null) {
            aVar.mo13789b((Room) message.obj);
            this.f18757b.mo13790c((Room) message.obj);
        }
    }
}
