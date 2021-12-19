package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

public interface LynxUISetter<T extends LynxBaseUI> extends Settable {
    static {
        Covode.recordClassIndex(34787);
    }

    void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar);
}
