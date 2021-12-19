package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;

public interface NestedState<SUB extends AbstractC20368af> extends AbstractC20368af {
    static {
        Covode.recordClassIndex(23873);
    }

    SUB getSubstate();

    NestedState<SUB> newSubstate(SUB sub);
}
