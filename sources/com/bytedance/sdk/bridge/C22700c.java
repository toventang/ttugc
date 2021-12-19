package com.bytedance.sdk.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.sdk.bridge.C22685a;
import com.bytedance.sdk.bridge.api.BridgeService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bridge.c */
public final class C22700c {

    /* renamed from: a */
    public static C22685a f53620a = null;

    /* renamed from: b */
    public static final C22700c f53621b = new C22700c();

    /* renamed from: c */
    private static final String f53622c = f53622c;

    /* renamed from: d */
    private static final boolean f53623d = true;

    /* renamed from: e */
    private static BridgeService f53624e;

    private C22700c() {
    }

    static {
        C22685a aVar;
        Covode.recordClassIndex(26521);
        BridgeService bridgeService = (BridgeService) C21520c.m40424a(BridgeService.class);
        f53624e = bridgeService;
        if (bridgeService == null || (aVar = bridgeService.initBridgeConfig()) == null) {
            aVar = new C22685a.C22686a().mo36968a((Boolean) false).mo36969a(f53622c).mo36971b(true).mo36972c(false).mo36973d(false).mo36970a();
            C89219l.m154709a((Object) aVar, "");
        }
        f53620a = aVar;
    }
}
