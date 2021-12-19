package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;

public interface ShadowNodeSetter<T extends ShadowNode> extends Settable {
    static {
        Covode.recordClassIndex(34793);
    }

    /* renamed from: a */
    void mo30605a(ShadowNode shadowNode, String str, C28716v vVar);
}
