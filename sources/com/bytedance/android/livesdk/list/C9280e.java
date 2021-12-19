package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.list.e */
public final /* synthetic */ class C9280e implements AbstractC88433f {

    /* renamed from: a */
    private final MultiRoomIdListProvider f22679a;

    /* renamed from: b */
    private final List f22680b;

    static {
        Covode.recordClassIndex(10198);
    }

    C9280e(MultiRoomIdListProvider multiRoomIdListProvider, List list) {
        this.f22679a = multiRoomIdListProvider;
        this.f22680b = list;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str;
        MultiRoomIdListProvider multiRoomIdListProvider = this.f22679a;
        List list = this.f22680b;
        C5832d dVar = (C5832d) obj;
        if (!(dVar == null || dVar.data == null)) {
            Map map = (Map) dVar.data;
            ArrayList<Room> arrayList = new ArrayList();
            boolean z = false;
            String str2 = "";
            if (multiRoomIdListProvider.f22668b != null) {
                str2 = multiRoomIdListProvider.f22668b.f28232b.f28257a;
                str = multiRoomIdListProvider.f22668b.f28232b.f28263g;
            } else {
                str = str2;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RoomInfo roomInfo = (RoomInfo) it.next();
                if (roomInfo == null || !map.containsKey(String.valueOf(roomInfo.getRoomId()))) {
                    z = true;
                } else {
                    arrayList.add(map.get(String.valueOf(roomInfo.getRoomId())));
                }
            }
            z = true;
            for (Room room : arrayList) {
                room.setLog_pb(str);
                room.setRequestId(str2);
            }
            if (!z) {
                multiRoomIdListProvider.f22667a = new ArrayList(arrayList);
                multiRoomIdListProvider.mo15378a(multiRoomIdListProvider.f22667a);
            }
        }
    }
}
