package com.bytedance.android.livesdk.service.p625c.p634i;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.model.message.C9896z;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.service.p625c.p631f.C10751e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.i.a */
public final class C10754a {

    /* renamed from: a */
    public static final C10754a f25908a = new C10754a();

    private C10754a() {
    }

    static {
        Covode.recordClassIndex(12351);
    }

    /* renamed from: a */
    public static void m19352a(String str) {
        C89219l.m154721d(str, "");
        C6501b.C6502a.m13948a("gift_tray_gift_click").mo12639a().mo12651a("click_type", str).mo12655b();
    }

    /* renamed from: b */
    private static long m19353b(C8871a aVar) {
        C89219l.m154721d(aVar, "");
        C9895y yVar = aVar.f21835C;
        String str = null;
        if (yVar != null && yVar.f23948w != null) {
            return aVar.f21835C.f23948w.f23953e;
        }
        C9895y yVar2 = aVar.f21835C;
        if (yVar2 != null) {
            str = yVar2.f23947v;
        }
        try {
            String str2 = C10751e.m19341a(str).get("send_gift_req_start_ms");
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static Map<String, String> m19350a(C8871a aVar) {
        String str;
        C9895y yVar = aVar.f21835C;
        String str2 = null;
        if (yVar == null || yVar.f23948w == null) {
            C9895y yVar2 = aVar.f21835C;
            if (yVar2 != null) {
                str2 = yVar2.f23947v;
            }
            return C10751e.m19341a(str2);
        }
        C9895y yVar3 = aVar.f21835C;
        C9896z zVar = yVar3.f23948w;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(zVar.f23949a));
        User user = yVar3.f23932g;
        C89219l.m154716b(user, "");
        hashMap.put("from_user_id", String.valueOf(user.getId()));
        hashMap.put("gift_id", String.valueOf(yVar3.f23934i));
        hashMap.put("msg_id", String.valueOf(yVar3.getMessageId()));
        hashMap.put("profitapi_message_dur", String.valueOf(zVar.f23950b));
        hashMap.put("repeat_count", String.valueOf(yVar3.f23935j));
        hashMap.put("repeat_end", String.valueOf(yVar3.f23938m));
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        C89219l.m154716b(str, "");
        hashMap.put("room_id", str);
        hashMap.put("send_gift_profit_api_start_ms", String.valueOf(zVar.f23951c));
        hashMap.put("send_gift_profit_core_start_ms", String.valueOf(zVar.f23952d));
        hashMap.put("send_gift_req_start_ms", String.valueOf(zVar.f23953e));
        hashMap.put("send_gift_send_message_success_ms", String.valueOf(zVar.f23954f));
        hashMap.put("send_profitapi_dur", String.valueOf(zVar.f23955g));
        hashMap.put("to_user_id", String.valueOf(zVar.f23956h));
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19351a(com.bytedance.android.livesdk.gifttray.p554a.C8871a r11, int r12) {
        /*
        // Method dump skipped, instructions count: 403
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.p625c.p634i.C10754a.m19351a(com.bytedance.android.livesdk.gifttray.a.a, int):void");
    }
}
