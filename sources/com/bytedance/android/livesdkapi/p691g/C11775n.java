package com.bytedance.android.livesdkapi.p691g;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.g.n */
public final class C11775n {
    static {
        Covode.recordClassIndex(13465);
    }

    /* renamed from: a */
    public static Room m20754a(long j) {
        if (C11772k.f28126a.f28127b == null || C11772k.f28126a.f28127b.mo14902b() == null) {
            return null;
        }
        Room a = m20755a(C11772k.f28126a.f28127b.mo14902b(), j);
        if (a == null) {
            return m20755a(C11772k.f28126a.f28127b.mo15379d(), j);
        }
        return a;
    }

    /* renamed from: a */
    private static Room m20755a(List<Room> list, long j) {
        if (C13617h.m24465a(list)) {
            return null;
        }
        for (Room room : list) {
            if (room.getId() == j) {
                return room;
            }
        }
        return null;
    }
}
