package com.p2082ss.android.ugc.aweme.commercialize.live.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2587c.C38080a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.p2593a.C38098a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.p2593a.C38100c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.service.ILiveParasiticModuleLaunchServiceCommercializeImpl */
public final class ILiveParasiticModuleLaunchServiceCommercializeImpl implements ILiveParasiticModuleLaunchService {
    static {
        Covode.recordClassIndex(45617);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    /* renamed from: a */
    public final void mo66420a() {
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95840n().mo96044a(new C38080a());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("WebcastBALinkFullMessage", C38098a.class);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(C38098a.class, new C38100c());
        ILiveOuterService s2 = LiveOuterService.m107269s();
        C89219l.m154716b(s2, "");
        s2.mo95830d().mo13003a(linkedHashMap, linkedHashMap2);
    }
}
