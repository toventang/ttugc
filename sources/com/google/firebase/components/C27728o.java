package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.o */
public final class C27728o extends C27729p {

    /* renamed from: a */
    private final List<C27710b<?>> f65160a;

    static {
        Covode.recordClassIndex(33311);
    }

    public final List<C27710b<?>> getComponentsInCycle() {
        return this.f65160a;
    }

    public C27728o(List<C27710b<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f65160a = list;
    }
}
