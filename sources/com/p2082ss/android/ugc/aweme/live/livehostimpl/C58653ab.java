package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.application.C33914o;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.ab */
public final class C58653ab implements IHostPlugin {
    static {
        Covode.recordClassIndex(68955);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean checkPluginInstalled(String str) {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final String getHostModeFilePath() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final String getHostPackageName() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final int getPluginAttributeMinVersion(String str) {
        return 0;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final void preload(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean isFull() {
        LiveHostOuterService.m107232p();
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader) {
        JSONObject jSONObject;
        try {
            if (C33914o.f80220b.get(str2) == null) {
                Librarian.m38962a(str2);
            }
            return true;
        } catch (Throwable unused) {
        }
        C12290b.m22060a("plugin_bug_track", 1, jSONObject);
        return false;
    }
}
