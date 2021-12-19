package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.aa */
final /* synthetic */ class C35881aa implements IAVInfoService.IFilterMedia {

    /* renamed from: a */
    private final ArrayList f84675a;

    static {
        Covode.recordClassIndex(43121);
    }

    C35881aa(ArrayList arrayList) {
        this.f84675a = arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia
    public final boolean filter(Object obj) {
        ArrayList arrayList = this.f84675a;
        Integer num = (Integer) obj;
        return ((Long) arrayList.get(num.intValue())).longValue() > 10000 && ((Long) arrayList.get(num.intValue())).longValue() < 600000;
    }
}
