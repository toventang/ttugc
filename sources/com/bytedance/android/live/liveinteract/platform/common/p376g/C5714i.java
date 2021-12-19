package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.i */
public final class C5714i extends C5708d {

    /* renamed from: a */
    public static long f14486a = System.currentTimeMillis();

    /* renamed from: b */
    public static boolean f14487b;

    /* renamed from: c */
    public static long f14488c = System.currentTimeMillis();

    /* renamed from: d */
    public static long f14489d = System.currentTimeMillis();

    /* renamed from: e */
    public static long f14490e = System.currentTimeMillis();

    /* renamed from: f */
    public static long f14491f = System.currentTimeMillis();

    /* renamed from: g */
    public static long f14492g = System.currentTimeMillis();

    /* renamed from: i */
    public static long f14493i = System.currentTimeMillis();

    /* renamed from: j */
    public static final C5714i f14494j = new C5714i();

    /* renamed from: k */
    private static long f14495k = System.currentTimeMillis();

    /* renamed from: l */
    private static long f14496l = System.currentTimeMillis();

    /* renamed from: m */
    private static long f14497m = System.currentTimeMillis();

    /* renamed from: h */
    private static String m12568h(boolean z) {
        return z ? "ttlive_client_guest_link_anchor_monitor" : "ttlive_client_guest_link_audience_monitor";
    }

    /* renamed from: i */
    private static String m12570i(boolean z) {
        return z ? "ttlive_client_multi_live_anchor_monitor" : "ttlive_client_multi_live_audience_monitor";
    }

    private C5714i() {
    }

    /* renamed from: a */
    public static final void m12541a(List<? extends C7666e> list) {
        C89219l.m154721d(list, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "response", list.toString());
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f14495k);
        m12550a(true, "list_succeed", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12539a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        m12488a(jSONObject, th);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f14495k);
        m12550a(true, "list_failed", jSONObject, 1);
    }

    /* renamed from: a */
    public static final void m12544a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        C3866a.m9475a(jSONObject, "rtc_ext_info", a.f17262g);
        m12550a(z, "rtc_join_channel_start", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12546a(boolean z, long j, String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "guest_user_id", j);
        C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
        m12543a(jSONObject, Long.valueOf(j), str);
        m12550a(z, "rtc_user_joined", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12545a(boolean z, int i, String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "error_code", 104L);
        C3866a.m9474a(jSONObject, "error_msg", (long) i);
        C3866a.m9475a(jSONObject, "error_detail", str);
        m12550a(z, "rtc_error", jSONObject, 0);
        C5736v.m12596e(C5710e.m12494a(jSONObject));
    }

    /* renamed from: a */
    public static final void m12542a(List<C5153d.C5157d> list, C5153d.EnumC5155b bVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        try {
            if (!(bVar != C5153d.EnumC5155b.NONE)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (z) {
                JSONObject jSONObject = new JSONObject();
                C3866a.m9475a(jSONObject, "source", bVar.getContent());
                C3866a.m9475a(jSONObject, "user_list", list.toString());
                m12550a(true, "refresh_user_list", jSONObject, 0);
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m12547a(boolean z, String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "request_source", str);
        m12550a(z, "rtc_stop", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12534a(C9606aj ajVar, long j, String str, long j2) {
        C89219l.m154721d(ajVar, "");
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        m12485a(jSONObject, ajVar);
        m12543a(jSONObject, Long.valueOf(j), str);
        C3866a.m9474a(jSONObject, "guest_user_id", j);
        C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
        C3866a.m9474a(jSONObject, "reply_status", j2);
        m12543a(jSONObject, Long.valueOf(j), str);
        m12550a(true, "reply_message", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12540a(Throwable th, long j, long j2, String str) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "error_code", 101L);
        C3866a.m9474a(jSONObject, "reply_status", j);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f14496l);
        m12488a(jSONObject, th);
        m12543a(jSONObject, Long.valueOf(j2), str);
        m12550a(false, "reply_failed", jSONObject, 1);
    }

    /* renamed from: a */
    public static final void m12535a(String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, StringSet.type, str);
        m12550a(false, "leave_click", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12537a(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "request_source", str);
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            m12487a(jSONObject, entry.getKey(), entry.getValue());
        }
        m12550a(false, "leave_request", jSONObject, 0);
        f14497m = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static final void m12536a(String str, Throwable th, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "request_source", str);
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            m12487a(jSONObject, entry.getKey(), entry.getValue());
        }
        m12488a(jSONObject, th);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f14497m);
        m12550a(false, "leave_failed", jSONObject, 1);
    }

    /* renamed from: a */
    public static final void m12548a(boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        C3866a.m9475a(jSONObject, "msg_id", str);
        if (str2 == null) {
            str2 = "";
        }
        C3866a.m9475a(jSONObject, "msg", str2);
        m12550a(z, "multilive_rtc_message_send", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12549a(boolean z, String str, String str2, long j) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        C3866a.m9475a(jSONObject, "msg_id", str);
        C3866a.m9474a(jSONObject, "cost", j);
        if (str2 == null) {
            str2 = "";
        }
        C3866a.m9475a(jSONObject, "msg", str2);
        m12550a(z, "multilive_rtc_message_received", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12551a(boolean z, HashMap<String, Object> hashMap) {
        C89219l.m154721d(hashMap, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            m12487a(jSONObject, entry.getKey(), entry.getValue());
        }
        m12550a(z, "multilive_rtc_message_send_fail", jSONObject, 0);
    }

    /* renamed from: a */
    public static void m12543a(JSONObject jSONObject, Long l, String str) {
        C3866a.m9474a(jSONObject, "remote_user_id", l != null ? l.longValue() : 0);
        C3866a.m9475a(jSONObject, "remote_linkmic_id", str);
    }

    /* renamed from: a */
    public static void m12550a(boolean z, String str, JSONObject jSONObject, int i) {
        C3866a.m9475a(jSONObject, "event_id", str);
        if (!z) {
            C3866a.m9475a(jSONObject, "join_channel_removed", String.valueOf(MultiLiveServerAutoJoinChannel.INSTANCE.getValue() ? 1 : 0));
        }
        m12489a(z, jSONObject);
        C3866a.m9475a(jSONObject, "report_id", String.valueOf(C6894d.m14753a().f17270q));
        C6894d.m14753a().f17270q++;
        C3868c.m9492a(m12566g(z), i, jSONObject);
    }

    /* renamed from: a */
    public static final void m12538a(String str, boolean z) {
        C89219l.m154721d(str, "");
        long a = C6898g.C6899a.f17285a.mo13195a(str);
        long j = 0;
        if (a > 0) {
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "guest_user_id", a);
            C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
            m12543a(jSONObject, Long.valueOf(a), str);
            long b = C6894d.m14753a().mo13187b(a);
            int i = 1;
            if (!C6894d.m14753a().f17268o) {
                j = System.currentTimeMillis() - b;
                C6894d.m14753a().f17268o = true;
            } else {
                i = 0;
            }
            C3866a.m9474a(jSONObject, "cost", j);
            C3866a.m9475a(jSONObject, "first_joined", String.valueOf(i));
            m12550a(z, "rtc_first_remote_video", jSONObject, 0);
        }
    }

    /* renamed from: c */
    public static final void m12558c() {
        m12550a(true, "disconnect_popup_show", new JSONObject(), 0);
    }

    /* renamed from: e */
    public static final void m12562e() {
        m12550a(false, "camera_preview_view_show", new JSONObject(), 0);
    }

    /* renamed from: f */
    public static final void m12564f() {
        m12550a(false, "apply_click", new JSONObject(), 0);
    }

    /* renamed from: h */
    public static final void m12569h() {
        m12550a(false, "leave_popup_show", new JSONObject(), 0);
    }

    /* renamed from: a */
    public static final void m12526a() {
        m12550a(true, "list_request", new JSONObject(), 0);
        f14495k = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m12552b() {
        m12550a(false, "join_channel_request", new JSONObject(), 0);
        f14489d = System.currentTimeMillis();
    }

    /* renamed from: g */
    public static final void m12567g() {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "support_vendor", "12");
        m12550a(false, "apply_request", jSONObject, 0);
        f14493i = System.currentTimeMillis();
    }

    static {
        Covode.recordClassIndex(6312);
    }

    /* renamed from: d */
    public static final void m12561d(boolean z) {
        m12550a(z, "rtc_push_stream", new JSONObject(), 0);
    }

    /* renamed from: g */
    private static String m12566g(boolean z) {
        if (f14487b) {
            return m12570i(z);
        }
        return m12568h(z);
    }

    /* renamed from: e */
    public static final void m12563e(boolean z) {
        m12550a(z, "rtc_offline", new JSONObject(), 0);
    }

    /* renamed from: f */
    public static final void m12565f(boolean z) {
        m12550a(z, "multilive_rtc_message_send_succeed", new JSONObject(), 0);
    }

    /* renamed from: a */
    public static final void m12527a(int i) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, StringSet.type, String.valueOf(i));
        m12550a(true, "disconnect_popup_click", jSONObject, 0);
    }

    /* renamed from: b */
    public static final void m12553b(int i) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, StringSet.type, String.valueOf(i));
        m12550a(false, "leave_popup_click", jSONObject, 0);
    }

    /* renamed from: c */
    public static final void m12560c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        long j = C6894d.m14753a().f17264i;
        if (j > 0) {
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - j);
        }
        m12550a(z, "rtc_join_channel_succeed", jSONObject, 0);
    }

    /* renamed from: c */
    public static final void m12559c(String str, boolean z) {
        int i;
        C89219l.m154721d(str, "");
        long a = C6898g.C6899a.f17285a.mo13195a(str);
        long j = 0;
        if (a > 0) {
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "guest_user_id", a);
            C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
            m12543a(jSONObject, Long.valueOf(a), str);
            long b = C6894d.m14753a().mo13187b(a);
            if (b > 0) {
                j = System.currentTimeMillis() - b;
                i = 1;
            } else {
                i = 0;
            }
            C3866a.m9474a(jSONObject, "cost", j);
            C3866a.m9475a(jSONObject, "first_joined", String.valueOf(i));
            m12550a(z, "rtc_first_remote_audio", jSONObject, 0);
        }
    }

    /* renamed from: b */
    public static final void m12555b(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            m12487a(jSONObject, entry.getKey(), entry.getValue());
        }
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f14497m);
        C3866a.m9475a(jSONObject, "request_source", str);
        m12550a(false, "leave_succeed", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12530a(long j, String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "guest_user_id", j);
        C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
        m12543a(jSONObject, Long.valueOf(j), str);
        m12550a(true, "cancel_invite", jSONObject, 0);
    }

    /* renamed from: b */
    public static final void m12556b(String str, boolean z) {
        long j;
        C89219l.m154721d(str, "");
        long a = C6898g.C6899a.f17285a.mo13195a(str);
        if (a > 0) {
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "guest_user_id", a);
            C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
            m12543a(jSONObject, Long.valueOf(a), str);
            long b = C6894d.m14753a().mo13187b(a);
            int i = 1;
            if (!C6894d.m14753a().f17269p) {
                j = System.currentTimeMillis() - b;
                C6894d.m14753a().f17269p = true;
            } else {
                j = 0;
                i = 0;
            }
            C3866a.m9474a(jSONObject, "cost", j);
            C3866a.m9475a(jSONObject, "first_joined", String.valueOf(i));
            m12550a(z, "rtc_first_frame_render", jSONObject, 0);
            if (b > 0) {
                C3868c.m9494a("ttlive_client_guest_link_first_frame", j, C5710e.m12494a(jSONObject));
                C5736v.m12595d(C5710e.m12494a(jSONObject));
            }
        }
    }

    /* renamed from: a */
    public static final void m12532a(LinkApi.EnumC7287e eVar, Throwable th) {
        C89219l.m154721d(eVar, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "turn_on_source", eVar.value);
        m12488a(jSONObject, th);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f14486a);
        m12550a(true, "init_failed", jSONObject, 1);
    }

    /* renamed from: a */
    public static final void m12528a(int i, long j, String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "status", String.valueOf(i));
        C3866a.m9474a(jSONObject, "guest_user_id", j);
        C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
        m12543a(jSONObject, Long.valueOf(j), str);
        m12550a(true, "agree_guest_click", jSONObject, 0);
    }

    /* renamed from: b */
    public static final void m12554b(long j, long j2, String str) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "reply_status", j);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f14496l);
        m12543a(jSONObject, Long.valueOf(j2), str);
        m12550a(false, "reply_succeed", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12529a(long j, long j2, String str) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "reply_status", j);
        C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
        m12543a(jSONObject, Long.valueOf(j2), str);
        m12550a(false, "reply_request", jSONObject, 0);
        f14496l = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m12557b(boolean z, long j, String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "guest_user_id", j);
        C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
        m12543a(jSONObject, Long.valueOf(j), str);
        m12550a(z, "rtc_user_leaved", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m12533a(C9606aj ajVar, long j, long j2) {
        C89219l.m154721d(ajVar, "");
        JSONObject jSONObject = new JSONObject();
        m12485a(jSONObject, ajVar);
        C3866a.m9474a(jSONObject, "message_available_time", ajVar.mo16565f());
        C3866a.m9474a(jSONObject, "at_least_available_time", j);
        C3866a.m9474a(jSONObject, "limit_time", j2);
        C3866a.m9475a(jSONObject, "remote_linkmic_id", ajVar.f23323i.f23799g.f23821h);
        m12550a(false, "permit_message_delay", jSONObject, 0);
    }
}
