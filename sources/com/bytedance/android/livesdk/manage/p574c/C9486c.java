package com.bytedance.android.livesdk.manage.p574c;

import androidx.p025c.C0489d;
import com.bytedance.android.live.p408u.C6204h;
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
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.manage.c.c */
public final class C9486c extends AbstractC9484a {
    static {
        Covode.recordClassIndex(10995);
    }

    /* renamed from: com.bytedance.android.livesdk.manage.c.c$a */
    static final class RunnableC9487a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9486c f23032a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f23033b;

        /* renamed from: c */
        final /* synthetic */ int f23034c;

        static {
            Covode.recordClassIndex(10996);
        }

        RunnableC9487a(C9486c cVar, ArrayList arrayList, int i) {
            this.f23032a = cVar;
            this.f23033b = arrayList;
            this.f23034c = i;
        }

        public final void run() {
            C9486c.m17785a(this.f23033b, C89070n.m154590j(C9462a.C9465b.f23010a.f23004a), this.f23034c);
        }
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
        if (C6204h.m13482c()) {
            C6204h.m13479b(new RunnableC9487a(this, arrayList, i));
        } else {
            m17785a(arrayList, C9462a.C9465b.f23010a.f23004a, i);
        }
    }

    /* renamed from: a */
    public static void m17785a(ArrayList<Long> arrayList, List<? extends AssetsModel> list, int i) {
        ArrayList arrayList2 = new ArrayList();
        C0489d dVar = new C0489d();
        for (AssetsModel assetsModel : list) {
            if (arrayList.contains(Long.valueOf(assetsModel.getId())) && assetsModel.getResourceType() != 5) {
                dVar.mo2087c(assetsModel.getId(), Long.valueOf(System.currentTimeMillis()));
                arrayList2.add(assetsModel);
                C9462a.m17760a(assetsModel, (AbstractC8784a) null, i);
            }
        }
        C10310r.m18756a(arrayList2, dVar);
    }
}
