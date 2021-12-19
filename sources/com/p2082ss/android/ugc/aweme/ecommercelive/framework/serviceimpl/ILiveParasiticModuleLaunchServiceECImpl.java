package com.p2082ss.android.ugc.aweme.ecommercelive.framework.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45781b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45783d;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45785f;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45786g;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45787h;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45788i;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2870c.C45796a;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ILiveParasiticModuleLaunchServiceECImpl */
public final class ILiveParasiticModuleLaunchServiceECImpl implements ILiveParasiticModuleLaunchService {
    static {
        Covode.recordClassIndex(54339);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    /* renamed from: a */
    public final void mo66420a() {
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95840n().mo96044a(new C45796a());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("WebcastOecLiveShoppingMessage", C45781b.class);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(C45781b.class, new C45786g());
        linkedHashMap2.put(C45783d.class, new C45787h());
        linkedHashMap2.put(C45785f.class, new C45788i());
        ILiveOuterService s2 = LiveOuterService.m107269s();
        C89219l.m154716b(s2, "");
        s2.mo95830d().mo13003a(linkedHashMap, linkedHashMap2);
    }
}
