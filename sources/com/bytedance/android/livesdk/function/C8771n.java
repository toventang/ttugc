package com.bytedance.android.livesdk.function;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.event.C8461n;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11274k;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.function.n */
final /* synthetic */ class C8771n implements AbstractC88433f {

    /* renamed from: a */
    private final UserPermissionCheckWidget f21630a;

    static {
        Covode.recordClassIndex(9648);
    }

    C8771n(UserPermissionCheckWidget userPermissionCheckWidget) {
        this.f21630a = userPermissionCheckWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str;
        UserPermissionCheckWidget userPermissionCheckWidget = this.f21630a;
        C8461n nVar = (C8461n) obj;
        if (nVar != null && nVar.f20915a == AbstractC2994b.EnumC2995a.Login && userPermissionCheckWidget.f21605a != null) {
            long j = 0;
            if (userPermissionCheckWidget.f21605a.getId() > 0) {
                EnterRoomConfig enterRoomConfig = C11870f.C11871a.f28404a.mo19010a().f28391b;
                long id = userPermissionCheckWidget.f21605a.getId();
                String requestId = userPermissionCheckWidget.f21605a.getRequestId();
                String str2 = userPermissionCheckWidget.f21606b;
                String str3 = userPermissionCheckWidget.f21607c;
                String str4 = userPermissionCheckWidget.f21608d;
                if (enterRoomConfig == null) {
                    str = "";
                } else {
                    str = enterRoomConfig.f28232b.f28262f;
                }
                if ("draw".equals(str2) && "live_detail-hourly_rank".equals(str4)) {
                    str4 = str4 + str2;
                }
                HashMap<String, String> hashMap = new C11274k().mo18034a("common_label_list", str3).mo18034a("enter_source", str4).mo18034a("request_id", requestId).mo18034a("enter_type", str2).mo18034a("live_reason", str).f26963a;
                LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), EnumC11229b.CMAF);
                LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), EnumC11229b.QUIC);
                LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), EnumC11229b.RTS);
                if (C11115u.m19743a().mo17915b().mo13165e()) {
                    j = 1;
                }
                ((AbstractC11181z) ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).enterRoom(id, 1, j, hashMap).mo143271a(new C11191f()).mo143274a(WidgetExtendsKt.autoDispose(userPermissionCheckWidget))).mo17950a(C8772o.f21631a, new C8773p(userPermissionCheckWidget));
            }
        }
    }
}
