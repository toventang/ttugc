package com.lynx.tasm.behavior.p2048a;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.p2054c.C28723a;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.a.a */
public interface AbstractC28464a {
    static {
        Covode.recordClassIndex(34462);
    }

    boolean blockNativeEvent();

    Map<String, C28723a> getEvents();

    int getSign();

    boolean ignoreFocus();

    boolean isFocusable();

    void offResponseChain();

    void onFocusChanged(boolean z, boolean z2);

    void onResponseChain();

    AbstractC28464a parent();
}
