package com.bytedance.android.live.broadcast.api.p186d;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.android.live.broadcast.api.d.c */
public final class C3058c {

    /* renamed from: a */
    public static final List<Integer> f8898a = C89070n.m154522b(0, 4);

    /* renamed from: b */
    private static final Map<Integer, String> f8899b = C89041ag.m154421a(C89387v.m154943a(0, "normal"), C89387v.m154943a(1, "status_exception"), C89387v.m154943a(2, "video_capture_fail"), C89387v.m154943a(3, "audio_capture_fail"), C89387v.m154943a(4, "retry_max_times"), C89387v.m154943a(5, "video_encoder_fail"), C89387v.m154943a(6, "audio_encoder_fail"), C89387v.m154943a(7, "adm_recoder_fail"), C89387v.m154943a(8, "adm_play_fail"), C89387v.m154943a(10001, "click"), C89387v.m154943a(10002, "kick_out"), C89387v.m154943a(10003, "banned"), C89387v.m154943a(10004, "force_or_illegal"), C89387v.m154943a(10005, "room_not_exist"), C89387v.m154943a(10006, "user_not_in_room"), C89387v.m154943a(10007, "room_live_finish"), C89387v.m154943a(10008, "background_time_out"), C89387v.m154943a(10009, "back_main"));

    /* renamed from: a */
    public static final boolean m8399a(int i) {
        return i > 0 && 8 >= i;
    }

    static {
        Covode.recordClassIndex(3536);
    }

    /* renamed from: b */
    public static final String m8400b(int i) {
        String str = f8899b.get(Integer.valueOf(i));
        if (str == null) {
            return "unknown";
        }
        return str;
    }
}
