package com.p2082ss.android.ugc.aweme.music.p3476k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.k.e */
public final /* synthetic */ class C60827e implements IAVInfoService.IFilterMedia {

    /* renamed from: a */
    private final ArrayList f138238a;

    static {
        Covode.recordClassIndex(71384);
    }

    C60827e(ArrayList arrayList) {
        this.f138238a = arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia
    public final boolean filter(Object obj) {
        ArrayList arrayList = this.f138238a;
        Integer num = (Integer) obj;
        return ((Long) arrayList.get(num.intValue())).longValue() > 10000 && ((Long) arrayList.get(num.intValue())).longValue() < 600000;
    }
}
