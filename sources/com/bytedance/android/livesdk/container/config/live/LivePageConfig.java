package com.bytedance.android.livesdk.container.config.live;

import com.bytedance.android.livesdk.container.p503a.AbstractC8211a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class LivePageConfig extends LiveHybridConfig {
    @AbstractC8211a(mo14464a = "soft_input_mode")
    private String softInputMode = "adjustNothing";

    static {
        Covode.recordClassIndex(9065);
    }

    public final String getSoftInputMode() {
        return this.softInputMode;
    }

    public final void setSoftInputMode(String str) {
        C89219l.m154721d(str, "");
        this.softInputMode = str;
    }
}
