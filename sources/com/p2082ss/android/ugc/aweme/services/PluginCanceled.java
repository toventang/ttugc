package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.PluginCanceled */
public final class PluginCanceled extends PluginState {
    public static final PluginCanceled INSTANCE = new PluginCanceled();

    private PluginCanceled() {
        super(null);
    }

    static {
        Covode.recordClassIndex(79700);
    }
}
