package com.bytedance.android.livesdk.manage.p574c;

import com.bytedance.android.livesdk.C10310r;
import com.bytedance.android.livesdk.gift.assets.AbstractC8784a;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.manage.C9462a;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.manage.c.b */
public final class C9485b extends AbstractC9484a {
    static {
        Covode.recordClassIndex(10994);
    }

    @Override // com.bytedance.android.livesdk.manage.p574c.AbstractC9484a
    /* renamed from: a */
    public final void mo16302a(int i) {
        GiftManager inst = GiftManager.inst();
        C89219l.m154716b(inst, "");
        List<GiftPage> giftPageList = inst.getGiftPageList();
        ArrayList arrayList = new ArrayList();
        for (GiftPage giftPage : giftPageList) {
            for (C9904t tVar : giftPage.gifts) {
                C89219l.m154716b(tVar, "");
                if (tVar.f24008m && tVar.f24009n != 0) {
                    arrayList.add(Long.valueOf(tVar.f24009n));
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel assetsModel : C9462a.C9465b.f23010a.f23004a) {
            if (arrayList.contains(Long.valueOf(assetsModel.getId())) && ((double) (currentTimeMillis - C10310r.m18754a(assetsModel.getId()))) > this.f23031a && assetsModel.getResourceType() != 5) {
                C9462a.m17760a(assetsModel, (AbstractC8784a) null, i);
                C10310r.m18755a(assetsModel.getId(), currentTimeMillis);
            }
        }
    }
}
