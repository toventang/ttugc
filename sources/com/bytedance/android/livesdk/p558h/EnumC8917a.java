package com.bytedance.android.livesdk.p558h;

import android.content.Context;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.h.a */
public enum EnumC8917a {
    LiveResource("com.ss.android.ies.live.liveresource") {
        @Override // com.bytedance.android.livesdk.p558h.EnumC8917a
        public final void load(Context context, boolean z) {
            try {
                IHostPlugin iHostPlugin = (IHostPlugin) C6193a.m13435a(IHostPlugin.class);
                if (z) {
                    try {
                        iHostPlugin.loadLibrary(0, context, EnumC8917a.LiveResource.getPackageName(), "lens", getClass().getClassLoader());
                    } catch (Throwable unused) {
                    }
                    try {
                        iHostPlugin.loadLibrary(0, context, EnumC8917a.LiveResource.getPackageName(), "ttquic", getClass().getClassLoader());
                    } catch (Throwable unused2) {
                    }
                    iHostPlugin.loadLibrary(0, context, EnumC8917a.LiveResource.getPackageName(), "avframework", getClass().getClassLoader());
                    iHostPlugin.loadLibrary(0, context, EnumC8917a.LiveResource.getPackageName(), "ies_render", getClass().getClassLoader());
                    try {
                        iHostPlugin.loadLibrary(0, context, EnumC8917a.LiveResource.getPackageName(), "bytertc", getClass().getClassLoader());
                    } catch (Throwable unused3) {
                    }
                }
            } catch (Throwable unused4) {
            }
        }
    },
    Camera("camera", true, "com.ss.android.ugc.live.liveshortvideo_so"),
    LiveSDK("live_sdk", true, "com.ss.android.ies.live.sdk"),
    Player("player", false, "com.ss.android.ugc.live.player"),
    XGPlayer("player", false, "com.ss.ttm"),
    LITE_PLAYER_CONTAINER("player", false, "com.bytedance.common.plugin.lite"),
    Live("liveplugin", false, "com.bytedance.android.liveplugin");
    

    /* renamed from: a */
    private final String f21979a;

    /* renamed from: b */
    private final String f21980b;

    /* renamed from: c */
    private final boolean f21981c;

    public void load(Context context, boolean z) {
    }

    public String getPackageName() {
        return this.f21980b;
    }

    public String getType() {
        return this.f21979a;
    }

    public boolean isNeedPreload() {
        return this.f21981c;
    }

    public void preload() {
        ((IHostPlugin) C6193a.m13435a(IHostPlugin.class)).preload(getPackageName());
    }

    public boolean isInstalled() {
        IHostPlugin iHostPlugin = (IHostPlugin) C6193a.m13435a(IHostPlugin.class);
        if (iHostPlugin.isFull() || iHostPlugin.checkPluginInstalled(getPackageName())) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(9802);
    }

    public static JSONObject generateFinalExtra(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "2150");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void checkInstall(Context context, IHostPlugin.AbstractC11790a aVar) {
        checkInstall(context, "", aVar);
    }

    public void checkInstall(Context context, String str, IHostPlugin.AbstractC11790a aVar) {
        if (isInstalled() && aVar != null) {
            aVar.mo8919a(getPackageName());
        }
    }

    /* synthetic */ EnumC8917a(String str) {
        this(r8, true, str);
    }

    private EnumC8917a(String str, boolean z, String str2) {
        this.f21979a = str;
        this.f21981c = z;
        this.f21980b = str2;
    }
}
