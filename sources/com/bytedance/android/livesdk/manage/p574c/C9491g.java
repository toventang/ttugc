package com.bytedance.android.livesdk.manage.p574c;

import com.bytedance.android.livesdk.C10310r;
import com.bytedance.android.livesdk.gift.assets.AbstractC8784a;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.manage.C9462a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.manage.c.g */
public final class C9491g extends AbstractC9484a {
    static {
        Covode.recordClassIndex(11000);
    }

    @Override // com.bytedance.android.livesdk.manage.p574c.AbstractC9484a
    /* renamed from: a */
    public final void mo16302a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel assetsModel : C9462a.C9465b.f23010a.f23004a) {
            if (((double) (currentTimeMillis - C10310r.m18754a(assetsModel.getId()))) > this.f23031a && assetsModel.getResourceType() == 5) {
                C9462a.m17760a(assetsModel, (AbstractC8784a) null, i);
                C10310r.m18755a(assetsModel.getId(), currentTimeMillis);
            }
        }
    }
}
