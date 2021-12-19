package emotes.p4558b;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.b.a */
public final class C88366a {

    /* renamed from: a */
    public static final C88366a f200602a = new C88366a();

    private C88366a() {
    }

    static {
        Covode.recordClassIndex(104406);
    }

    /* renamed from: a */
    public static void m153561a(String str) {
        C89219l.m154721d(str, "");
        if (DataChannelGlobal.f42558d.mo28324b(C9009ac.class) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_entrance", str);
            m153562a(hashMap);
            C6501b.C6502a.m13948a("livesdk_subscribe_icon_show").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* renamed from: b */
    public static void m153563b(String str) {
        C89219l.m154721d(str, "");
        if (DataChannelGlobal.f42558d.mo28324b(C9009ac.class) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("click_position", str);
            m153562a(hashMap);
            hashMap.put("action_type", "click");
            C6501b.C6502a.m13948a("livesdk_subscribe_icon_click").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* renamed from: a */
    public static void m153562a(Map<String, String> map) {
        String str;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            C89219l.m154716b(idStr, "");
            map.put("room_id", idStr);
            map.put("enter_method", C6544e.m13990d());
            map.put("enter_from_merge", C6544e.m13987a());
            map.put("action_type", C6544e.m13991e());
            map.put("request_id", C6544e.m13997k());
            map.put("video_id", C6544e.m13992f());
            if (room.getOwner() != null) {
                if (room.getOwner().isFollowing()) {
                    str = "1";
                } else {
                    str = "0";
                }
                map.put("is_follow", str);
            }
        }
    }
}
