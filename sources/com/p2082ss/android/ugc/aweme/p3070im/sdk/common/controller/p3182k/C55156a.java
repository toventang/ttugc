package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3182k;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a;
import com.bytedance.ies.p1208im.core.api.p1220j.C17470b;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.C55836b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.p3228a.EnumC55835a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.k.a */
public final class C55156a implements AbstractC17469a {

    /* renamed from: a */
    public static final C55156a f126203a = new C55156a();

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27899a(String str) {
    }

    private C55156a() {
    }

    static {
        Covode.recordClassIndex(64884);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27898a(C17470b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27897a(WsChannelMsg wsChannelMsg, C19608bd bdVar) {
        C89219l.m154721d(wsChannelMsg, "");
        if (wsChannelMsg.f33468f != 1015 || wsChannelMsg.f33469g != 1) {
            return;
        }
        if (!C55197c.m100917a()) {
            C56244a.m102193e("IMBizWsBridge", "onReceivedMsg but not login");
            return;
        }
        try {
            byte[] a = wsChannelMsg.mo22159a();
            C89219l.m154716b(a, "");
            C55157b bVar = (C55157b) C55214j.m100957a(new String(a, C89338d.f202990a), C55157b.class);
            if (bVar == null) {
                C56244a.m102193e("IMBizWsBridge", "onReceivedMsg payload null");
                return;
            }
            C56244a.m102191c("IMBizWsBridge", "onReceivedMsg: " + bVar.getAction());
            if (bVar.getAction() != 1) {
                C56244a.m102193e("IMBizWsBridge", "Unknown action: " + bVar.getAction());
            } else {
                C55836b.m101604a(EnumC55835a.WS_DIFF, false);
            }
        } catch (Throwable th) {
            C56244a.m102187a("IMBizWsBridge", th);
        }
    }
}
