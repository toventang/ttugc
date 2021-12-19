package com.p2082ss.android.ugc.aweme.discover.model;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.discover.model.KeyboardModel */
public final class KeyboardModel extends AbstractC1174ac {
    private final AbstractC89244h keyboardStatus$delegate = C89250i.m154773a((AbstractC89171a) KeyboardModel$keyboardStatus$2.INSTANCE);

    static {
        Covode.recordClassIndex(50461);
    }

    public final C33943c<Integer> getKeyboardStatus() {
        return (C33943c) this.keyboardStatus$delegate.getValue();
    }
}
