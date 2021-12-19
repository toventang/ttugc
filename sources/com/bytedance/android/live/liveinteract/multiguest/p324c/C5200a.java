package com.bytedance.android.live.liveinteract.multiguest.p324c;

import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4432f;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.p367b.C5664b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC4432f(mo10206a = "LINK_LOGGER")
/* renamed from: com.bytedance.android.live.liveinteract.multiguest.c.a */
public final class C5200a extends C5664b {
    static {
        Covode.recordClassIndex(5792);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.p367b.C5664b
    /* renamed from: e */
    public final void mo10320e() {
        super.mo10320e();
        C5702a.m12456b("OnStartSuccess", "position:LinkIn_Anchor");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: k */
    public final void mo10987k(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        super.mo10987k(map);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: i */
    public final void mo10985i(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        super.mo10985i(map);
        LinkApi.EnumC7287e eVar = (LinkApi.EnumC7287e) map.get("source");
        if (eVar != null) {
            C89219l.m154721d(eVar, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "support_vendor", "12");
            C3866a.m9475a(jSONObject, "turn_on_source", eVar.value);
            C5714i.m12531a(C5714i.f14494j, true, "init_request", jSONObject);
            C5714i.f14486a = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: j */
    public final void mo10986j(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        super.mo10986j(map);
        LinkApi.EnumC7287e eVar = (LinkApi.EnumC7287e) map.get("source");
        Object obj = map.get("response");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (eVar != null) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(str, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "response", str);
            C3866a.m9475a(jSONObject, "turn_on_source", eVar.value);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14486a);
            C5714i.m12531a(C5714i.f14494j, true, "init_succeed", jSONObject);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: c */
    public final void mo10984c(Throwable th, Map<String, Object> map) {
        C89219l.m154721d(map, "");
        super.mo10984c(th, map);
        LinkApi.EnumC7287e eVar = (LinkApi.EnumC7287e) map.get("source");
        if (eVar != null) {
            C5714i.m12532a(eVar, th);
        }
    }
}
