package com.snapchat.kit.sdk.core.metrics.p2070c;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
import com.snapchat.kit.sdk.core.p2067a.C28958f;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c.f */
public final class C29001f {

    /* renamed from: a */
    private final C28995a f68511a;

    static {
        Covode.recordClassIndex(35198);
    }

    C29001f(C28995a aVar) {
        this.f68511a = aVar;
    }

    /* renamed from: a */
    private static ServerEvent m58008a(ServerEventData serverEventData) {
        return new ServerEvent.Builder().event_data(serverEventData).build();
    }

    /* renamed from: a */
    private LoginKitEventBase m58007a(boolean z) {
        return new LoginKitEventBase.Builder().kit_event_base(this.f68511a.mo50371a()).is_for_firebase_authentication(Boolean.valueOf(z)).build();
    }

    /* renamed from: a */
    public final ServerEvent mo50373a(C28958f fVar, boolean z) {
        String str;
        ServerEventData.Builder builder = new ServerEventData.Builder();
        LoginKitAuthStart.Builder log_kit_event_base = new LoginKitAuthStart.Builder().log_kit_event_base(m58007a(z));
        if (fVar.f68424a) {
            str = "PROFILE_LINK";
        } else {
            str = null;
        }
        return m58008a(builder.login_kit_auth_start(log_kit_event_base.features_requested_string_list(str).build()).build());
    }

    /* renamed from: a */
    public final ServerEvent mo50374a(boolean z, boolean z2) {
        return m58008a(new ServerEventData.Builder().login_kit_auth_complete(new LoginKitAuthComplete.Builder().log_kit_event_base(m58007a(z2)).is_success(Boolean.valueOf(z)).build()).build());
    }
}
