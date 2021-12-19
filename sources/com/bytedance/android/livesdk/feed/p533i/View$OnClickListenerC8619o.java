package com.bytedance.android.livesdk.feed.p533i;

import android.view.View;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.feed.p532h.C8595a;
import com.bytedance.android.livesdk.feed.p533i.C8614m;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.p691g.C11772k;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.feed.i.o */
final /* synthetic */ class View$OnClickListenerC8619o implements View.OnClickListener {

    /* renamed from: a */
    private final C8614m.C8616b f21314a;

    /* renamed from: b */
    private final FeedItem f21315b;

    static {
        Covode.recordClassIndex(9476);
    }

    View$OnClickListenerC8619o(C8614m.C8616b bVar, FeedItem feedItem) {
        this.f21314a = bVar;
        this.f21315b = feedItem;
    }

    public final void onClick(View view) {
        C8614m.C8616b bVar = this.f21314a;
        FeedItem feedItem = this.f21315b;
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = C8614m.C8616b.m16873d();
        }
        if (!C58029j.f132253e) {
            C11226ao.m19882a(C8614m.this.f21303c, (int) R.string.gkv);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (FeedItem feedItem2 : C8614m.this.f21302b) {
            if (feedItem2.item instanceof Room) {
                Room room = (Room) feedItem2.item;
                room.setRequestId(feedItem2.requestId());
                room.setLog_pb(feedItem2.logPb());
                arrayList.add(room);
            }
        }
        int max = Math.max(arrayList.indexOf(feedItem.item), 0);
        C11772k.f28126a.f28127b = new C8595a(arrayList);
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28295L = "follow_live";
        enterRoomConfig.f28232b.f28259c = "";
        enterRoomConfig.f28232b.f28267k = 2;
        enterRoomConfig.f28232b.f28257a = ((Room) arrayList.get(max)).getRequestId();
        enterRoomConfig.f28232b.f28263g = ((Room) arrayList.get(max)).getLog_pb();
        enterRoomConfig.f28233c.f28293J = "live_merge";
        enterRoomConfig.f28233c.f28304U = true;
        enterRoomConfig.f28233c.f28305V = max;
        enterRoomConfig.f28233c.f28307X = "live";
        enterRoomConfig.f28233c.f28287D = String.valueOf(((Room) arrayList.get(max)).getOwnerUserId());
        enterRoomConfig.f28233c.f28301R = ((Room) arrayList.get(max)).getId();
        enterRoomConfig.f28233c.f28302S = ((Room) arrayList.get(max)).getStreamType();
        ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18880b(C8614m.this.f21303c, enterRoomConfig);
    }
}
