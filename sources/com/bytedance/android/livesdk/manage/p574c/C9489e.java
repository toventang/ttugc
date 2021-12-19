package com.bytedance.android.livesdk.manage.p574c;

import androidx.p025c.C0489d;
import com.bytedance.android.livesdk.C10310r;
import com.bytedance.android.livesdk.gift.assets.AbstractC8784a;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.manage.C9462a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.manage.c.e */
public final class C9489e extends AbstractC9484a {
    static {
        Covode.recordClassIndex(10998);
    }

    @Override // com.bytedance.android.livesdk.manage.p574c.AbstractC9484a
    /* renamed from: a */
    public final void mo16302a(int i) {
        List<? extends AssetsModel> list = C9462a.C9465b.f23010a.f23004a;
        C0489d dVar = new C0489d();
        ArrayList arrayList = new ArrayList();
        for (AssetsModel assetsModel : list) {
            if (assetsModel.getResourceType() == 1 || assetsModel.getResourceType() == 2) {
                arrayList.add(assetsModel);
                dVar.mo2087c(assetsModel.getId(), Long.valueOf(System.currentTimeMillis()));
                C9462a.m17760a(assetsModel, (AbstractC8784a) null, i);
            }
        }
        C10310r.m18756a(arrayList, dVar);
    }
}
