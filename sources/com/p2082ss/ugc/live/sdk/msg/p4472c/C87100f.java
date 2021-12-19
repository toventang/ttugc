package com.p2082ss.ugc.live.sdk.msg.p4472c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.msg.C87075a;
import com.p2082ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import com.p2082ss.ugc.live.sdk.msg.p4473d.C87104a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.sdk.msg.c.f */
public final class C87100f {

    /* renamed from: a */
    EnumC87101g f196366a;

    /* renamed from: b */
    EnumC87101g f196367b;

    /* renamed from: c */
    boolean f196368c;

    /* renamed from: d */
    boolean f196369d;

    /* renamed from: e */
    long f196370e;

    /* renamed from: f */
    long f196371f;

    /* renamed from: g */
    boolean f196372g;

    /* renamed from: h */
    int f196373h;

    /* renamed from: i */
    String f196374i = "";

    /* renamed from: j */
    private final long f196375j;

    /* renamed from: k */
    private final long f196376k;

    static {
        Covode.recordClassIndex(102896);
    }

    /* renamed from: a */
    public final void mo140813a(C87075a aVar) {
        C89219l.m154719c(aVar, "");
        if (this.f196371f > this.f196370e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service_id", this.f196376k);
            jSONObject.put("status_code", this.f196373h);
            jSONObject.put("expect_strategy", this.f196366a.getStrategy(this.f196368c));
            jSONObject.put("actual_strategy", this.f196367b.getStrategy(this.f196369d));
            jSONObject.put("ws_connected_on_send", this.f196368c);
            jSONObject.put("ws_connected_on_finish", this.f196369d);
            jSONObject.put("success", this.f196372g);
            long j = this.f196371f - this.f196370e;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("use_time", j);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("unique_id", this.f196375j);
            jSONObject3.put("status_message", this.f196374i);
            jSONObject3.put("send_time", this.f196370e);
            jSONObject3.put("finish_time", this.f196371f);
            aVar.monitorLatency("uplink_status_all", j, jSONObject, jSONObject2, jSONObject3);
            if (!this.f196372g) {
                aVar.monitor("uplink_status_error", jSONObject, jSONObject2, jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("category", jSONObject);
            jSONObject4.put("metric", jSONObject2);
            jSONObject4.put("extra", jSONObject3);
            C87104a.m150852a(aVar, "uplink stat: ".concat(String.valueOf(jSONObject4)));
        }
    }

    public C87100f(long j, long j2) {
        this.f196375j = j;
        this.f196376k = j2;
        EnumC87101g gVar = EnumC87101g.WS_MSG_ORIGIN;
        this.f196366a = gVar;
        this.f196367b = gVar;
    }

    /* renamed from: a */
    public final void mo140814a(SdkUplinkPacket sdkUplinkPacket, EnumC87101g gVar, boolean z) {
        C89219l.m154719c(sdkUplinkPacket, "");
        C89219l.m154719c(gVar, "");
        this.f196371f = System.currentTimeMillis();
        this.f196367b = gVar;
        this.f196369d = z;
        this.f196372g = true;
        Integer num = sdkUplinkPacket.statusCode;
        C89219l.m154709a((Object) num, "");
        this.f196373h = num.intValue();
        String str = sdkUplinkPacket.statusMessage;
        C89219l.m154709a((Object) str, "");
        this.f196374i = str;
    }

    /* renamed from: a */
    public final void mo140815a(Exception exc, EnumC87101g gVar, boolean z) {
        int i;
        C89219l.m154719c(exc, "");
        C89219l.m154719c(gVar, "");
        this.f196371f = System.currentTimeMillis();
        this.f196367b = gVar;
        this.f196369d = z;
        this.f196372g = false;
        if (exc instanceof C87097c) {
            i = ((C87097c) exc).getStatusCode();
        } else {
            i = -1;
        }
        this.f196373h = i;
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown Exception";
        }
        this.f196374i = message;
    }
}
