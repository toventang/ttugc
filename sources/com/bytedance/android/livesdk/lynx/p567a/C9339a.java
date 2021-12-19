package com.bytedance.android.livesdk.lynx.p567a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.p176b.C2940n;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6953a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.lynx.tasm.LynxEnv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.a.a */
public final class C9339a {

    /* renamed from: c */
    public static final C9340a f22812c = new C9340a((byte) 0);

    /* renamed from: a */
    public String f22813a = "{}";

    /* renamed from: b */
    public Map<String, ? extends Object> f22814b = new LinkedHashMap();

    /* renamed from: d */
    private final AbstractC89172b<C28022o, C89391z> f22815d;

    static {
        Covode.recordClassIndex(10843);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.a.a$a */
    public static final class C9340a {
        static {
            Covode.recordClassIndex(10844);
        }

        private C9340a() {
        }

        public /* synthetic */ C9340a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m17600a(C28022o oVar) {
            String str;
            User owner;
            String valueOf;
            Set<Map.Entry<String, String>> entrySet;
            C5809h a = C5809h.m12739a();
            C89219l.m154716b(a, "");
            Map<String, String> b = a.mo11588b();
            if (!(b == null || (entrySet = b.entrySet()) == null)) {
                for (T t : entrySet) {
                    oVar.mo46801a((String) t.getKey(), (String) t.getValue());
                    String str2 = (String) t.getKey();
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -102670958) {
                            if (hashCode != 96572) {
                                if (hashCode == 25209764 && str2.equals("device_id")) {
                                    oVar.mo46801a("deviceId", (String) t.getValue());
                                }
                            } else if (str2.equals("aid")) {
                                oVar.mo46801a("appId", (String) t.getValue());
                            }
                        } else if (str2.equals("version_name")) {
                            oVar.mo46801a("appVersion", (String) t.getValue());
                        }
                    }
                }
            }
            oVar.mo46800a("screenWidth", Float.valueOf(C3966y.m9668e(C3966y.m9664c())));
            oVar.mo46800a("screenHeight", Float.valueOf(C3966y.m9668e(C3966y.m9662b())));
            C89219l.m154716b(LynxEnv.m56706b(), "");
            oVar.mo46801a("lynx_version", "2.1.5-rc.22-cxxshared");
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            String str3 = "0";
            if (room == null || (str = String.valueOf(room.getId())) == null) {
                str = str3;
            }
            oVar.mo46801a("room_id", str);
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            oVar.mo46801a("user_id", String.valueOf(b2.mo13161c()));
            Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (!(room2 == null || (owner = room2.getOwner()) == null || (valueOf = String.valueOf(owner.getId())) == null)) {
                str3 = valueOf;
            }
            oVar.mo46801a("anchor_id", str3);
            oVar.mo46800a("status_bar_height", Float.valueOf(C3966y.m9668e(C3903ac.m9533a(C3966y.m9669e()))));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.google.gson.o, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9339a(AbstractC89172b<? super C28022o, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f22815d = bVar;
    }

    /* renamed from: a */
    public final void mo16224a(String str, AbstractC6953a aVar, AbstractC89172b<? super C28022o, C89391z> bVar, AbstractC89172b<? super Map<String, ? extends Object>, C89391z> bVar2) {
        Object obj;
        Map map;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C28022o oVar = new C28022o();
        C28022o oVar2 = new C28022o();
        C9340a.m17600a(oVar2);
        oVar2.mo46801a("location", str);
        this.f22815d.invoke(oVar2);
        bVar.invoke(oVar2);
        oVar.mo46797a("__globalProps", oVar2);
        try {
            obj = C89379q.m157068constructorimpl(C2940n.m8267a((AbstractC28019l) oVar));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = "{}";
        }
        this.f22813a = (String) obj;
        try {
            map = C89379q.m157068constructorimpl(C2940n.m8269a(oVar));
        } catch (Throwable th2) {
            map = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
        }
        Map a = C89041ag.m154415a();
        if (C89379q.m157073isFailureimpl(map)) {
            map = a;
        }
        this.f22814b = (Map) map;
    }
}
