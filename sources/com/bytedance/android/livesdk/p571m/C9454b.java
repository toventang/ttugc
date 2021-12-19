package com.bytedance.android.livesdk.p571m;

import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.watch.chatroom.C11324b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.m.b */
public final class C9454b {

    /* renamed from: a */
    public static final C9454b f22988a = new C9454b();

    /* renamed from: com.bytedance.android.livesdk.m.b$a */
    public enum EnumC9455a {
        LONG_PRESS,
        SHARING_PANEL;

        static {
            Covode.recordClassIndex(10963);
        }
    }

    private C9454b() {
    }

    static {
        Covode.recordClassIndex(10962);
    }

    /* renamed from: a */
    public static void m17755a(Room room, String str, String str2, EnumC9455a aVar) {
        String str3;
        Long l;
        C89219l.m154721d(room, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aVar, "");
        int i = C9456c.f22990a[aVar.ordinal()];
        if (i == 1) {
            str3 = "long_press";
        } else if (i == 2) {
            str3 = "sharing_panel";
        } else {
            throw new C89376n();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C11324b.m20079a(linkedHashMap, room, str, str2, "");
        C6501b a = C6501b.C6502a.m13948a("dislike").mo12639a();
        Hashtag hashtag = room.hashtag;
        String str4 = null;
        if (hashtag != null) {
            l = hashtag.f23083id;
        } else {
            l = null;
        }
        C6501b a2 = a.mo12650a("hashtag_id", (Number) l);
        Hashtag hashtag2 = room.hashtag;
        if (hashtag2 != null) {
            str4 = hashtag2.title;
        }
        a2.mo12651a("hashtag_type", str4).mo12652a((Map<String, String>) linkedHashMap).mo12651a("request_page", str3).mo12655b();
    }
}
