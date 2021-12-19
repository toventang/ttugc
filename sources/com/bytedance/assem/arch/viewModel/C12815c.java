package com.bytedance.assem.arch.viewModel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.viewModel.c */
public final class C12815c implements C1175ad.AbstractC1177b {
    static {
        Covode.recordClassIndex(14647);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        if (AssemViewModel.class.isAssignableFrom(cls)) {
            try {
                return cls.newInstance();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
            }
        } else {
            throw new IllegalArgumentException("Custom ViewModel must be a subclass of LifeAwareViewModel.");
        }
    }
}
