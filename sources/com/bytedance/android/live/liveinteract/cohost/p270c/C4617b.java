package com.bytedance.android.live.liveinteract.cohost.p270c;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5708d;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9753c;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9754d;
import com.bytedance.android.livesdk.model.message.p580d.p591k.C9780a;
import com.bytedance.android.livesdk.model.message.p580d.p591k.C9781b;
import com.bytedance.android.livesdk.model.message.p580d.p591k.C9782c;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.c.b */
public final class C4617b extends C5708d {

    /* renamed from: a */
    public static long f12259a = System.currentTimeMillis();

    /* renamed from: b */
    static long f12260b = System.currentTimeMillis();

    /* renamed from: c */
    static long f12261c = System.currentTimeMillis();

    /* renamed from: d */
    static long f12262d = System.currentTimeMillis();

    /* renamed from: e */
    public static final C4617b f12263e = new C4617b();

    private C4617b() {
    }

    /* renamed from: a */
    public static void m10742a(String str, JSONObject jSONObject, int i) {
        m12491b(jSONObject);
        C3866a.m9475a(jSONObject, "event_id", str);
        if (jSONObject.optLong("channel_id") > 0) {
            C3866a.m9475a(jSONObject, "report_id", String.valueOf(C4384b.C4385a.m10496a().f11934X));
            C4384b.C4385a.m10496a().f11934X++;
        }
        C3868c.m9492a("ttlive_client_anchor_link_mic_monitor", i, jSONObject);
    }

    /* renamed from: a */
    public static final void m10735a() {
        m10742a("reply_error", new JSONObject(), 0);
    }

    /* renamed from: c */
    public static final void m10746c() {
        m10742a("rtc_stop", new JSONObject(), 0);
    }

    /* renamed from: b */
    public static final void m10744b() {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "rtc_ext_info", C4384b.C4385a.m10496a().f11974v);
        m10742a("rtc_join_channel_start", jSONObject, 0);
    }

    static {
        Covode.recordClassIndex(5193);
    }

    /* renamed from: a */
    public static final void m10743a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "push_stream_advance", String.valueOf(z));
        m10742a("rtc_push_stream", jSONObject, 0);
    }

    /* renamed from: a */
    private static final String m10734a(C9754d dVar) {
        if (dVar == null) {
            return "unknow";
        }
        int i = dVar.f23758b;
        if (i == 1) {
            return C5737w.m12598a(EnumC4442m.FOLLOW_INVITE);
        }
        if (i == 2) {
            return C5737w.m12598a(EnumC4442m.RECOMMEND_INVITE);
        }
        if (i != 3) {
            return C5737w.m12598a(EnumC4442m.NONE);
        }
        return C5737w.m12598a(EnumC4442m.RANDOM_LINK_MIC_INVITE);
    }

    /* renamed from: b */
    public static final void m10745b(C9606aj ajVar) {
        C89219l.m154721d(ajVar, "");
        JSONObject jSONObject = new JSONObject();
        m12485a(jSONObject, ajVar);
        m10742a("cancel_message", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m10739a(C9606aj ajVar) {
        long j;
        long j2;
        C9782c cVar;
        C9781b bVar;
        String valueOf;
        String str = "";
        C89219l.m154721d(ajVar, str);
        JSONObject jSONObject = new JSONObject();
        C9780a aVar = ajVar.f23323i;
        if (aVar != null) {
            j = (long) aVar.f23801i;
        } else {
            j = -1;
        }
        C3866a.m9474a(jSONObject, "reply_status", j);
        C9780a aVar2 = ajVar.f23323i;
        if (!(aVar2 == null || (bVar = aVar2.f23802j) == null || (valueOf = String.valueOf(bVar.f23813f)) == null)) {
            str = valueOf;
        }
        C3866a.m9475a(jSONObject, "VENDOR", str);
        C9780a aVar3 = ajVar.f23323i;
        if (aVar3 == null || (cVar = aVar3.f23796d) == null) {
            j2 = 0;
        } else {
            j2 = cVar.f23815b;
        }
        C3866a.m9474a(jSONObject, "LINK_MIC_ID", j2);
        m12485a(jSONObject, ajVar);
        m10742a("reply_message", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m10737a(int i, Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "reply_status", String.valueOf(i));
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                m12487a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        m10742a("reply_request", jSONObject, 0);
        f12260b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static final void m10741a(C9606aj ajVar, C9754d dVar) {
        String str;
        long j;
        C89219l.m154721d(ajVar, "");
        JSONObject jSONObject = new JSONObject();
        m12485a(jSONObject, ajVar);
        C9753c cVar = ajVar.f23322h;
        if (cVar != null) {
            str = String.valueOf(cVar.f23749e);
        } else {
            str = null;
        }
        C3866a.m9475a(jSONObject, "vendor", str);
        C3866a.m9475a(jSONObject, "message_from", String.valueOf(ajVar.getMessageFrom()));
        C9753c cVar2 = ajVar.f23322h;
        if (cVar2 != null) {
            j = cVar2.f23745a;
        } else {
            j = 0;
        }
        C3866a.m9474a(jSONObject, "guest_user_id", j);
        C3866a.m9474a(jSONObject, "message_expired_time", ajVar.f23334t);
        C3866a.m9474a(jSONObject, "message_available_time", ajVar.mo16565f());
        C3866a.m9475a(jSONObject, "message", C4139e.C4140a.f11575b.mo46674b(ajVar));
        C3866a.m9475a(jSONObject, "invitee_list", m10734a(dVar));
        m10742a("invite_message", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m10736a(int i, C5832d<?> dVar, Map<String, ? extends Object> map) {
        C89219l.m154721d(dVar, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "answer", String.valueOf(i));
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f12260b);
        m12484a(jSONObject, dVar);
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                m12487a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        m10742a("reply_succeed", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m10740a(C9606aj ajVar, long j, long j2, C9754d dVar) {
        String str;
        long j3;
        C89219l.m154721d(ajVar, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "channel_id", ajVar.f23320f);
        C9753c cVar = ajVar.f23322h;
        if (cVar != null) {
            str = String.valueOf(cVar.f23749e);
        } else {
            str = null;
        }
        C3866a.m9475a(jSONObject, "vendor", str);
        C9753c cVar2 = ajVar.f23322h;
        if (cVar2 != null) {
            j3 = cVar2.f23745a;
        } else {
            j3 = 0;
        }
        C3866a.m9474a(jSONObject, "guest_user_id", j3);
        C3866a.m9474a(jSONObject, "message_available_time", ajVar.mo16565f());
        C3866a.m9474a(jSONObject, "at_least_available_time", j);
        C3866a.m9474a(jSONObject, "limit_time", j2);
        C3866a.m9475a(jSONObject, "invitee_list", m10734a(dVar));
        m10742a("invite_message_delay", jSONObject, 0);
    }
}
