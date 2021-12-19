package com.bytedance.android.livesdk.lynx.bridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C18362v;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class TTLiveLynxBridgeModule extends LynxModule {
    private final C9350c bridge;
    private final ConcurrentHashMap<C18362v, Callback> callRegistry = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(10852);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTLiveLynxBridgeModule(Context context, Object obj) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(obj, "");
        C9350c cVar = (C9350c) (!(obj instanceof C9350c) ? null : obj);
        this.bridge = cVar;
        if (cVar != null) {
            cVar.mo16234a(this);
            AbstractC89172b<? super TTLiveLynxBridgeModule, C89391z> bVar = cVar.f22826c;
            if (bVar != null) {
                bVar.invoke(this);
            }
        }
    }

    public final void invokeCallback$livehybrid_impl_release(JSONObject jSONObject, C18362v vVar) {
        C89391z zVar;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(vVar, "");
        try {
            Object remove = jSONObject.remove("__params");
            if (remove != null && (remove instanceof JSONObject)) {
                ((JSONObject) remove).remove("__data");
                ((JSONObject) remove).remove("__msg_type");
                String optString = ((JSONObject) remove).optString("__callback_id", "0");
                C89219l.m154716b(optString, "");
                jSONObject.put("eventId", Long.parseLong(optString));
                if (((JSONObject) remove).has("___error___")) {
                    jSONObject.put("code", 0);
                    jSONObject.put("errMsg", ((JSONObject) remove).remove("___error___"));
                } else {
                    jSONObject.put("code", ((JSONObject) remove).remove("code"));
                }
                jSONObject.put("data", remove);
            }
            WritableMap a = C9348a.m17620a(jSONObject);
            Callback remove2 = this.callRegistry.remove(vVar);
            if (remove2 != null) {
                remove2.invoke(a);
                zVar = C89391z.f203057a;
            } else {
                zVar = null;
            }
            C89379q.m157068constructorimpl(zVar);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    @AbstractC28359d
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        C18362v vVar;
        String str2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(readableMap, "");
        C89219l.m154721d(callback, "");
        try {
            JSONObject a = C9348a.m17622a(readableMap);
            C9350c cVar = this.bridge;
            if (cVar != null) {
                JSONObject optJSONObject = a.optJSONObject("data");
                if (optJSONObject == null || (str2 = optJSONObject.toString()) == null) {
                    str2 = "{}";
                }
                C89219l.m154716b(str2, "");
                String optString = a.optString("namespace", "webcast");
                C89219l.m154716b(optString, "");
                String optString2 = a.optString("eventId", "lynx");
                C89219l.m154716b(optString2, "");
                vVar = cVar.mo16232a(str, str2, optString, optString2);
                if (vVar != null) {
                    this.callRegistry.put(vVar, callback);
                    C89379q.m157068constructorimpl(vVar);
                }
            }
            vVar = null;
            C89379q.m157068constructorimpl(vVar);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }
}
