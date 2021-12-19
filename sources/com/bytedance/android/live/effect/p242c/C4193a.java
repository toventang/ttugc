package com.bytedance.android.live.effect.p242c;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.LocalFilterModel;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.c.a */
public final class C4193a implements AbstractC4157j.AbstractC4158a<FilterModel> {
    static {
        Covode.recordClassIndex(4763);
    }

    /* renamed from: a */
    private static FilterModel.C4308a m10274a(String str) {
        C28022o oVar;
        int i;
        int i2;
        int i3;
        AbstractC28019l c;
        AbstractC28019l c2;
        AbstractC28019l c3;
        try {
            AbstractC28019l a = C28024q.m56139a(str);
            C89219l.m154716b(a, "");
            AbstractC28019l c4 = a.mo46789j().mo46803c("filterconfig");
            if (c4 != null) {
                oVar = c4.mo46789j();
            } else {
                oVar = null;
            }
            FilterModel.C4308a aVar = new FilterModel.C4308a();
            if (oVar == null || (c3 = oVar.mo46803c("max")) == null) {
                i = 100;
            } else {
                i = c3.mo46694g();
            }
            aVar.f11842a = i;
            if (oVar == null || (c2 = oVar.mo46803c("min")) == null) {
                i2 = 0;
            } else {
                i2 = c2.mo46694g();
            }
            aVar.f11843b = i2;
            if (oVar == null || (c = oVar.mo46803c("value")) == null) {
                i3 = 50;
            } else {
                i3 = c.mo46694g();
            }
            aVar.f11844c = i3;
            return aVar;
        } catch (Throwable unused) {
            return new FilterModel.C4308a();
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4158a
    /* renamed from: a */
    public final List<C4315e<FilterModel>> mo9866a(EffectChannelResponse effectChannelResponse) {
        List list;
        List<Effect> allCategoryEffects;
        if (effectChannelResponse == null || (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) == null) {
            list = new ArrayList();
        } else {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) allCategoryEffects, 10));
            for (T t : allCategoryEffects) {
                FilterModel filterModel = new FilterModel();
                filterModel.setFilterType(2);
                filterModel.setEffect(t);
                C89219l.m154716b(t, "");
                filterModel.setTags(t.getTags());
                filterModel.filterConfig = m10274a(t.getExtra());
                arrayList.add(filterModel);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                FilterModel filterModel2 = (FilterModel) obj;
                if (!LiveNewEffectPanelSetting.INSTANCE.useNewPanel() || filterModel2.filterConfig != null) {
                    arrayList2.add(obj);
                }
            }
            list = C89070n.m154585g((Collection) arrayList2);
        }
        FilterModel filterModel3 = new FilterModel();
        filterModel3.setFilterType(0);
        LocalFilterModel localFilterModel = new LocalFilterModel();
        localFilterModel.setId("0");
        localFilterModel.setName(C3966y.m9657a((int) R.string.e1b));
        localFilterModel.setCoverResId(2131234744);
        localFilterModel.setFilterFilePath("");
        filterModel3.filterConfig = new FilterModel.C4308a();
        filterModel3.setLocalFilter(localFilterModel);
        list.add(0, filterModel3);
        String str = C4147a.f11587e;
        C89219l.m154716b(str, "");
        return C89070n.m154516a(new C4315e(str, list));
    }
}
