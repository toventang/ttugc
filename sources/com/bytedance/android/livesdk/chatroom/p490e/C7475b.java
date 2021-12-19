package com.bytedance.android.livesdk.chatroom.p490e;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.model.message.C9603ag;
import com.bytedance.android.livesdk.model.message.C9675bh;
import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.android.livesdk.model.message.C9745d;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.b */
public final class C7475b extends AbstractC7501r<AbstractC7476a> implements OnMessageListener {

    /* renamed from: a */
    private final boolean f18574a;

    /* renamed from: b */
    private final Room f18575b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.b$a */
    public interface AbstractC7476a extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(8246);
        }

        /* renamed from: a */
        void mo13711a(C9603ag agVar);

        /* renamed from: a */
        void mo13712a(C9675bh bhVar);

        /* renamed from: a */
        void mo13713a(C9695c cVar);
    }

    static {
        Covode.recordClassIndex(8245);
    }

    /* renamed from: a */
    public final void mo10297a(AbstractC7476a aVar) {
        super.mo10297a((AbstractC8094bq) aVar);
        if (this.f18625x != null) {
            this.f18625x.addMessageListener(EnumC9596a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.D_H5_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.BANNER_UPDATE.getIntType(), this);
        }
    }

    /* renamed from: a */
    public final String mo13709a(String str) {
        String str2;
        String c = C6544e.m13989c();
        String valueOf = String.valueOf(C6544e.m13994h());
        String j = C6544e.m13996j();
        String k = C6544e.m13997k();
        C29844g gVar = new C29844g(str);
        gVar.mo52129a("room_id", this.f18575b.getId());
        gVar.mo52130a("mode", "live_room");
        gVar.mo52129a("anchor_id", this.f18575b.getOwner().getId());
        gVar.mo52130a("is_anchor", String.valueOf(this.f18574a));
        gVar.mo52130a("enter_from", "");
        gVar.mo52130a("source_v3", c);
        gVar.mo52130a("anchor_id", valueOf);
        gVar.mo52130a("log_pb", j);
        gVar.mo52130a("request_id", k);
        if (this.f18574a) {
            str2 = "live_take_detail";
        } else {
            str2 = "live_detail";
        }
        gVar.mo52130a("event_page", str2);
        gVar.mo52130a("event_belong", "live_interact");
        return gVar.mo52126a();
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (this.f38654y != null) {
            if (iMessage instanceof C9603ag) {
                C9603ag agVar = (C9603ag) iMessage;
                if (agVar.f23311f == 1) {
                    ((AbstractC7476a) this.f38654y).mo13711a(agVar);
                    return;
                }
            }
            if (iMessage instanceof C9675bh) {
                C9675bh bhVar = (C9675bh) iMessage;
                if (!TextUtils.isEmpty(bhVar.f23545f)) {
                    ((AbstractC7476a) this.f38654y).mo13712a(bhVar);
                }
            } else if (iMessage instanceof C9745d) {
                C9745d dVar = (C9745d) iMessage;
                if (dVar.f23725a != null) {
                    ((AbstractC7476a) this.f38654y).mo13713a(dVar.f23725a);
                }
            }
        }
    }

    public C7475b(Room room, boolean z) {
        this.f18575b = room;
        this.f18574a = z;
    }
}
