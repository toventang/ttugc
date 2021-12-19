package com.bytedance.android.livesdk.live.data;

import android.text.TextUtils;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.model.C9304c;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

public class RoomStatsViewModel extends RxViewModel {

    /* renamed from: a */
    public final C1213t<Map<String, C9304c>> f22730a = new C1213t<>();

    static {
        Covode.recordClassIndex(10218);
    }

    /* renamed from: a */
    public final void mo15396a(List<Room> list) {
        if (C13617h.m24465a(list)) {
            this.f22730a.setValue(new HashMap());
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Room room : list) {
            if (room != null) {
                linkedList.add(Long.valueOf(room.getId()));
            }
        }
        ((RoomStatApi) C5805e.m12718a().mo11572a(RoomStatApi.class)).checkRoom(TextUtils.join(",", linkedList)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9297a(this), new C9298b(this));
    }
}
