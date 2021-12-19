package com.bytedance.android.livesdk.utils;

import android.net.Uri;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.p428c.C6520a;
import com.bytedance.android.livesdk.p561j.C9016aj;
import com.bytedance.android.livesdk.p561j.C9043bi;
import com.bytedance.android.livesdk.p561j.C9044bj;
import com.bytedance.android.livesdkapi.p675c.AbstractC11616a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.utils.a */
public final class C11199a {

    /* renamed from: a */
    public static final C11199a f26831a = new C11199a();

    private C11199a() {
    }

    static {
        Covode.recordClassIndex(12827);
    }

    /* renamed from: a */
    public static final boolean m19850a(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9016aj.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public static final void m19846a(Uri uri, EnterRoomConfig enterRoomConfig) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(enterRoomConfig, "");
        ((AbstractC11616a) C6193a.m13435a(AbstractC11616a.class)).mo18413a(uri, enterRoomConfig);
    }

    /* renamed from: a */
    public static final void m19847a(EnterRoomConfig enterRoomConfig, C6520a.C6521a aVar) {
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(aVar, "");
        if (enterRoomConfig.f28233c.f28359o) {
            aVar.mo12670a(enterRoomConfig.f28233c.f28356l);
            aVar.mo12671b(enterRoomConfig.f28233c.f28357m);
        }
    }

    /* renamed from: a */
    public static final void m19848a(DataChannel dataChannel, EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && dataChannel != null && enterRoomConfig.f28233c.f28359o) {
            enterRoomConfig.f28233c.f28359o = false;
            enterRoomConfig.f28233c.f28356l = new HashMap<>();
            enterRoomConfig.f28233c.f28357m = new HashMap<>();
            dataChannel.mo28311a(C9016aj.class, (Object) false);
            dataChannel.mo28311a(C9044bj.class, new HashMap());
            dataChannel.mo28311a(C9043bi.class, new HashMap());
        }
    }

    /* renamed from: a */
    public static final void m19849a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        ((AbstractC11616a) C6193a.m13435a(AbstractC11616a.class)).mo18414a(str, str2, map, map2);
    }
}
