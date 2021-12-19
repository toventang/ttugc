package com.bytedance.android.livesdk.chatroom.backroom.p482a;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.a.a */
public final class C7333a {

    /* renamed from: a */
    public Room f18203a;

    /* renamed from: b */
    public Map<String, String> f18204b;

    static {
        Covode.recordClassIndex(8097);
    }

    public C7333a(Room room, byte b) {
        this(room);
    }

    private /* synthetic */ C7333a(Room room) {
        this(room, new HashMap());
    }

    private C7333a(Room room, Map<String, String> map) {
        C89219l.m154721d(map, "");
        this.f18203a = room;
        this.f18204b = map;
    }
}
