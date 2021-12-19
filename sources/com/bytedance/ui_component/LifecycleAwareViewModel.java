package com.bytedance.ui_component;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.JediViewModel;
import p4600h.p4611f.p4613b.C89219l;

public abstract class LifecycleAwareViewModel<T extends AbstractC20368af> extends JediViewModel<T> implements AbstractC1204m {

    /* renamed from: k */
    public AbstractC1196i f55719k;

    static {
        Covode.recordClassIndex(27551);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        AbstractC1196i iVar = this.f55719k;
        if (iVar == null) {
            C89219l.m154710a("_lifecycle");
        }
        return iVar;
    }
}
