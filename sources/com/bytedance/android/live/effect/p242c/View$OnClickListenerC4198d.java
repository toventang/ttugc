package com.bytedance.android.live.effect.p242c;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p242c.C4195c;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.effect.c.d */
final /* synthetic */ class View$OnClickListenerC4198d implements View.OnClickListener {

    /* renamed from: a */
    private final C4195c f11662a;

    /* renamed from: b */
    private final int f11663b;

    /* renamed from: c */
    private final C4195c.C4197b f11664c;

    static {
        Covode.recordClassIndex(4768);
    }

    View$OnClickListenerC4198d(C4195c cVar, int i, C4195c.C4197b bVar) {
        this.f11662a = cVar;
        this.f11663b = i;
        this.f11664c = bVar;
    }

    public final void onClick(View view) {
        C4195c cVar = this.f11662a;
        int i = this.f11663b;
        C4195c.C4197b bVar = this.f11664c;
        if (cVar.f11654c != null) {
            cVar.f11653b = i;
            if (!(cVar.f11652a == null || cVar.f11652a.size() <= i || cVar.f11652a.get(i).getEffect() == null)) {
                if (bVar != null) {
                    bVar.mo9916a();
                }
                cVar.f11652a.get(i).setNew(false);
                C4208j jVar = C4208j.C4212b.f11691a;
                String id = cVar.f11652a.get(i).getEffect().getId();
                if (jVar.f11679a != null && !TextUtils.isEmpty(id)) {
                    for (FilterModel filterModel : jVar.f11679a) {
                        if (filterModel.getEffect() != null && id.equals(filterModel.getEffect().getId())) {
                            filterModel.setNew(false);
                            jVar.mo9922a(id, filterModel.getEffect().getTagsUpdatedAt());
                        }
                    }
                }
            }
            cVar.f11654c.mo9915a(i);
            cVar.notifyDataSetChanged();
        }
    }
}
