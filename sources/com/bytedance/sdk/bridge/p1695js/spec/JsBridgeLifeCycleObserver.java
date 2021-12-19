package com.bytedance.sdk.bridge.p1695js.spec;

import android.util.Log;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.sdk.bridge.C22700c;
import com.bytedance.sdk.bridge.C22701d;
import com.bytedance.sdk.bridge.C22703f;
import com.bytedance.sdk.bridge.C22704g;
import com.bytedance.sdk.bridge.C22705h;
import com.bytedance.sdk.bridge.p1693a.C22687a;
import com.bytedance.sdk.bridge.p1694b.C22694a;
import com.bytedance.sdk.bridge.p1694b.C22698c;
import com.bytedance.sdk.bridge.p1695js.C22706a;
import com.bytedance.sdk.bridge.p1695js.p1696a.C22707a;
import com.bytedance.services.apm.api.IApmAgent;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bridge.js.spec.JsBridgeLifeCycleObserver */
public final class JsBridgeLifeCycleObserver implements AbstractC33974au {

    /* renamed from: a */
    private final Object f53663a;

    /* renamed from: b */
    private final AbstractC1196i f53664b;

    static {
        Covode.recordClassIndex(26529);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_ANY)
    public final void onAny() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        onAny();
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestory$js_bridge_release();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        Object obj = this.f53663a;
        AbstractC1196i iVar = this.f53664b;
        C89219l.m154719c(obj, "");
        C22704g.m42795a(C22706a.f53645a, " disableJsBridgeMethods " + obj.getClass().getSimpleName());
        C22705h a = C22687a.m42781a(obj.getClass());
        if (a != null) {
            for (C22701d dVar : a.mo36990a()) {
                C89219l.m154709a((Object) dVar, "");
                String str = dVar.f53626b;
                C22694a a2 = C22703f.m42794a(C22706a.f53646b.get(str), iVar);
                if (a2 != null) {
                    a2.f53609c = false;
                }
                C22704g.m42795a(C22706a.f53645a, " disable  " + str + '\n');
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        Object obj = this.f53663a;
        AbstractC1196i iVar = this.f53664b;
        C89219l.m154719c(obj, "");
        C22704g.m42795a(C22706a.f53645a, " enableJsBridgeMethods " + obj.getClass().getSimpleName());
        C22705h a = C22687a.m42781a(obj.getClass());
        if (a != null) {
            for (C22701d dVar : a.mo36990a()) {
                C89219l.m154709a((Object) dVar, "");
                String str = dVar.f53626b;
                C22694a a2 = C22703f.m42794a(C22706a.f53646b.get(str), iVar);
                if (a2 != null) {
                    a2.f53609c = true;
                }
                C22704g.m42795a(C22706a.f53645a, " enable  " + str + '\n');
            }
        }
        C22707a.f53654a.size();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestory$js_bridge_release() {
        MethodCollector.m26663i(1813);
        Object obj = this.f53663a;
        AbstractC1196i iVar = this.f53664b;
        C89219l.m154719c(obj, "");
        C89219l.m154719c(iVar, "");
        C22704g.m42795a(C22706a.f53645a, " unregister " + obj.getClass().getSimpleName());
        C22705h a = C22687a.m42781a(obj.getClass());
        if (a != null) {
            try {
                for (C22701d dVar : a.mo36990a()) {
                    C89219l.m154709a((Object) dVar, "");
                    String str = dVar.f53626b;
                    List<C22694a> list = C22706a.f53646b.get(str);
                    if (list != null && C22706a.f53648d.contains(str)) {
                        C22706a.f53648d.remove(str);
                    }
                    C22694a a2 = C22703f.m42794a(list, iVar);
                    if (!(list == null || a2 == null)) {
                        list.remove(a2);
                        C22704g.m42795a(C22706a.f53645a, "unregister  " + iVar + " -- " + str);
                    }
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_msg", Log.getStackTraceString(e));
                jSONObject.put("error_code", 1);
                jSONObject.put("event_type", "exception");
                JSONObject jSONObject2 = new JSONObject();
                C89219l.m154719c("exception", "");
                C89219l.m154719c(jSONObject, "");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("exception", 1);
                IApmAgent iApmAgent = (IApmAgent) C21520c.m40424a(IApmAgent.class);
                if (iApmAgent != null) {
                    iApmAgent.monitorEvent("component_bridge_sdk_monitor", jSONObject3, jSONObject2, jSONObject);
                }
                if (C22700c.f53620a.f53593b != null) {
                    try {
                        if (jSONObject.has("error_msg")) {
                            jSONObject.optString("error_msg");
                        }
                        if (jSONObject.has("error_url")) {
                            jSONObject.optString("error_url");
                        }
                        if (jSONObject.has("event_type")) {
                            jSONObject.optString("event_type");
                        }
                        if (jSONObject.has("bridge_name")) {
                            jSONObject.optString("bridge_name");
                        }
                        if (jSONObject.has("error_activity")) {
                            jSONObject.optString("error_activity");
                        }
                        if (jSONObject.has("error_code")) {
                            jSONObject.optInt("error_code");
                        }
                        if (jSONObject.has("is_sync")) {
                            jSONObject.optInt("is_sync");
                        }
                        if (jSONObject.has("extra_params")) {
                            jSONObject.optJSONObject("extra_params");
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        synchronized (C22706a.f53647c) {
            try {
                Iterator<C22698c> it = C22706a.f53647c.iterator();
                C89219l.m154709a((Object) it, "");
                while (it.hasNext()) {
                    C22698c next = it.next();
                    if (C89219l.m154714a(obj, next.f53617a)) {
                        C22706a.f53647c.remove(next);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(1813);
                throw th;
            }
        }
        C22706a.m42799a();
        MethodCollector.m26664o(1813);
    }
}
