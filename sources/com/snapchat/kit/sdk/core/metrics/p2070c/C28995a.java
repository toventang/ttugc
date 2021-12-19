package com.snapchat.kit.sdk.core.metrics.p2070c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.networking.C29030f;
import java.util.Locale;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c.a */
public class C28995a {

    /* renamed from: a */
    public String f68493a = "";

    /* renamed from: b */
    private final String f68494b;

    /* renamed from: c */
    private final KitPluginType f68495c;

    /* renamed from: d */
    private final boolean f68496d;

    static {
        Covode.recordClassIndex(35192);
    }

    /* renamed from: a */
    public final KitEventBase mo50371a() {
        return mo50372a(KitType.LOGIN_KIT, this.f68493a);
    }

    /* renamed from: a */
    public final KitEventBase mo50372a(KitType kitType, String str) {
        String locale;
        KitEventBase.Builder kit_user_agent = new KitEventBase.Builder().kit_variant(kitType).kit_variant_version(str).oauth_client_id(this.f68494b).kit_user_agent(C29030f.f68589a);
        Locale locale2 = Locale.getDefault();
        if (locale2 == null) {
            locale = "";
        } else {
            locale = locale2.toString();
        }
        return kit_user_agent.locale(locale).kit_client_timestamp_millis(Long.valueOf(System.currentTimeMillis())).kit_plugin_type(this.f68495c).is_from_react_native_plugin(Boolean.valueOf(this.f68496d)).build();
    }

    public C28995a(String str, KitPluginType kitPluginType, boolean z) {
        this.f68494b = str;
        this.f68495c = kitPluginType;
        this.f68496d = z;
    }
}
