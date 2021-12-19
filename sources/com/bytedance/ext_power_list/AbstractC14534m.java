package com.bytedance.ext_power_list;

import android.view.View;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ext_power_list.m */
public abstract class AbstractC14534m<VM extends AssemListViewModel<?, ?, ?>> extends AbstractC12769a {
    static {
        Covode.recordClassIndex(16621);
    }

    /* renamed from: v */
    public abstract VM mo23378v();

    /* renamed from: w */
    public abstract PowerList mo23379w();

    /* renamed from: x */
    public abstract C17693c mo23380x();

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public void mo20630b(View view) {
        C89219l.m154719c(view, "");
        mo23379w().setListConfig(mo23380x());
        VM v = mo23378v();
        C17656f<ITEM> fVar = (C17656f<ITEM>) mo23379w().getState();
        C89219l.m154709a((Object) fVar, "");
        C89219l.m154719c(fVar, "");
        v.f35033j = fVar;
        mo23379w().mo28082a((AbstractC17692b) new C14535n(v).get());
    }
}
