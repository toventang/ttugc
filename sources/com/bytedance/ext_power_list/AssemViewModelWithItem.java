package com.bytedance.ext_power_list;

import com.bytedance.assem.arch.p795b.AbstractC12659j;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;

public abstract class AssemViewModelWithItem<S extends AbstractC12853j, ITEM> extends AssemViewModel<S> {

    /* renamed from: j */
    public AbstractC12659j f35095j;

    static {
        Covode.recordClassIndex(16600);
    }

    /* renamed from: g */
    public final ITEM mo23342g() {
        AbstractC12659j jVar = this.f35095j;
        ITEM item = jVar != null ? (ITEM) jVar.mo20471a() : null;
        if (!(item instanceof Object)) {
            return null;
        }
        return item;
    }
}
