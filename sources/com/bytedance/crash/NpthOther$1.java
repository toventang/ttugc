package com.bytedance.crash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.services.apm.api.IFdCheck;
import java.util.List;

class NpthOther$1 implements IFdCheck {
    static {
        Covode.recordClassIndex(15870);
    }

    NpthOther$1() {
    }

    @Override // com.bytedance.services.apm.api.IFdCheck
    public final List<String> getFdList() {
        return NativeTools.m25458a().mo22573d();
    }
}
