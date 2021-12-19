package com.bytedance.android.livesdk.browser;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.util.Map;
import java.util.Set;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.f */
public final class C7015f {

    /* renamed from: a */
    public static final C7015f f17613a = new C7015f();

    private C7015f() {
    }

    static {
        Covode.recordClassIndex(7754);
    }

    /* renamed from: a */
    private static C28022o m14966a(String str) {
        User owner;
        String valueOf;
        String str2;
        C28022o oVar = new C28022o();
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                oVar.mo46801a(t, parse.getQueryParameter(t));
                String str3 = "0";
                if (!oVar.mo46802b("room_id")) {
                    Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                    if (room == null || (str2 = String.valueOf(room.getId())) == null) {
                        str2 = str3;
                    }
                    oVar.mo46801a("room_id", str2);
                }
                if (!oVar.mo46802b("user_id")) {
                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                    C89219l.m154716b(b, "");
                    oVar.mo46801a("user_id", String.valueOf(b.mo13161c()));
                }
                if (!oVar.mo46802b("anchor_id")) {
                    Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                    if (!(room2 == null || (owner = room2.getOwner()) == null || (valueOf = String.valueOf(owner.getId())) == null)) {
                        str3 = valueOf;
                    }
                    oVar.mo46801a("anchor_id", str3);
                }
            }
            C89379q.m157068constructorimpl(parse);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return oVar;
    }

    /* renamed from: a */
    public static String m14967a(Context context, String str, String str2, boolean z) {
        String str3;
        int i;
        AbstractC28019l lVar;
        Resources resources;
        Configuration configuration;
        User owner;
        String valueOf;
        Set<Map.Entry<String, String>> entrySet;
        C89219l.m154721d(str2, "");
        C28022o oVar = new C28022o();
        C5809h a = C5809h.m12739a();
        C89219l.m154716b(a, "");
        Map<String, String> b = a.mo11588b();
        if (!(b == null || (entrySet = b.entrySet()) == null)) {
            for (T t : entrySet) {
                oVar.mo46801a((String) t.getKey(), (String) t.getValue());
                String str4 = (String) t.getKey();
                if (str4 != null) {
                    int hashCode = str4.hashCode();
                    if (hashCode != -102670958) {
                        if (hashCode != 96572) {
                            if (hashCode == 25209764 && str4.equals("device_id")) {
                                oVar.mo46801a("deviceId", (String) t.getValue());
                            }
                        } else if (str4.equals("aid")) {
                            oVar.mo46801a("appId", (String) t.getValue());
                        }
                    } else if (str4.equals("version_name")) {
                        oVar.mo46801a("appVersion", (String) t.getValue());
                    }
                }
            }
        }
        oVar.mo46800a("screenWidth", Float.valueOf(C3966y.m9668e(C3966y.m9664c())));
        oVar.mo46800a("screenHeight", Float.valueOf(C3966y.m9668e(C3966y.m9662b())));
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        String str5 = "0";
        if (room == null || (str3 = String.valueOf(room.getId())) == null) {
            str3 = str5;
        }
        oVar.mo46801a("room_id", str3);
        AbstractC6872f b2 = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b2, "");
        oVar.mo46801a("user_id", String.valueOf(b2.mo13161c()));
        Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (!(room2 == null || (owner = room2.getOwner()) == null || (valueOf = String.valueOf(owner.getId())) == null)) {
            str5 = valueOf;
        }
        oVar.mo46801a("anchor_id", str5);
        oVar.mo46800a("status_bar_height", Float.valueOf(C3966y.m9668e(C3903ac.m9533a(C3966y.m9669e()))));
        oVar.mo46801a("initTimestamp", String.valueOf(System.currentTimeMillis()));
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) {
            i = 0;
        } else {
            i = 1;
        }
        oVar.mo46800a("orientation", Integer.valueOf(i));
        if (str == null || str.length() == 0) {
            lVar = null;
        } else {
            lVar = m14966a(str);
        }
        oVar.mo46797a("queryItems", lVar);
        oVar.mo46801a("containerID", str2);
        oVar.mo46800a("offline", Integer.valueOf(z ? 1 : 0));
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        return oVar2;
    }
}
