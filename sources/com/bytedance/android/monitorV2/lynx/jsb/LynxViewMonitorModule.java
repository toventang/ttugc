package com.bytedance.android.monitorV2.lynx.jsb;

import android.content.Context;
import com.bytedance.android.monitorV2.lynx.C12155c;
import com.bytedance.android.monitorV2.lynx.p742b.C12154d;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12169e;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12126c;
import com.bytedance.android.monitorV2.p740l.C12128e;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.C28355a;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxView;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxViewMonitorModule extends LynxModule {
    public static final C12177a Companion = new C12177a((byte) 0);
    private final C27910f gson = new C27910f();

    static {
        Covode.recordClassIndex(13906);
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.jsb.LynxViewMonitorModule$a */
    public static final class C12177a {
        static {
            Covode.recordClassIndex(13907);
        }

        private C12177a() {
        }

        public /* synthetic */ C12177a(byte b) {
            this();
        }
    }

    private final JSONObject convertJson(ReadableMap readableMap) {
        JSONObject jSONObject = null;
        if (readableMap == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(this.gson.mo46674b(readableMap));
            return jSONObject;
        } catch (Throwable unused) {
            C12126c.m21636a();
            return jSONObject;
        }
    }

    private final C12169e getError(ReadableMap readableMap) {
        C12169e eVar = new C12169e();
        try {
            eVar.f29289b = "lynx_error_custom";
            eVar.f29290c = 201;
            eVar.f29291d = String.valueOf(convertJson(readableMap));
            return eVar;
        } catch (Exception unused) {
            C12126c.m21636a();
            return eVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxViewMonitorModule(Context context, Object obj) {
        super(context, obj);
        C89219l.m154719c(context, "");
        C89219l.m154719c(obj, "");
    }

    @AbstractC28359d
    public final void reportJSError(ReadableMap readableMap, Callback callback) {
        C12115b.m21583b("LynxViewMonitorModule", "reportJSError");
        if (readableMap != null && this.mParam != null) {
            WritableMap b = C28355a.m56665b();
            b.putInt("errorCode", -1);
            if (this.mParam instanceof C12178a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((C12178a) obj).f29308a;
                    if (lynxView != null) {
                        C12155c.f29212j.mo19522a(lynxView, getError(readableMap));
                        b.putInt("errorCode", 0);
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            if (callback != null) {
                callback.invoke(b);
            }
        }
    }

    @AbstractC28359d
    public final void config(ReadableMap readableMap, Callback callback) {
        C12115b.m21583b("LynxViewMonitorModule", "config");
        if (this.mParam != null) {
            WritableMap b = C28355a.m56665b();
            b.putInt("errorCode", -1);
            if (this.mParam instanceof C12178a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((C12178a) obj).f29308a;
                    if (lynxView != null) {
                        if (readableMap != null && readableMap.hasKey("bid")) {
                            String string = readableMap.getString("bid");
                            C12155c cVar = C12155c.f29212j;
                            C89219l.m154709a((Object) string, "");
                            cVar.mo19524a(lynxView, string);
                        }
                        C12155c cVar2 = C12155c.f29212j;
                        JSONObject a = C12128e.C12129a.m21646a(convertJson(readableMap));
                        C89219l.m154719c(lynxView, "");
                        C89219l.m154719c(a, "");
                        if (lynxView.getTemplateUrl() != null) {
                            C12154d dVar = cVar2.f29216b;
                            String templateUrl = lynxView.getTemplateUrl();
                            Map<String, JSONObject> map = dVar.f29211a;
                            if (map == null) {
                                throw new C89388w("null cannot be cast to non-null type");
                            } else if (map.containsKey(templateUrl)) {
                                JSONObject b2 = C12130f.m21656b(cVar2.f29216b.mo19517a(lynxView.getTemplateUrl()), a);
                                C12154d dVar2 = cVar2.f29216b;
                                String templateUrl2 = lynxView.getTemplateUrl();
                                C89219l.m154709a((Object) b2, "");
                                dVar2.mo19518a(templateUrl2, b2);
                            } else {
                                cVar2.f29216b.mo19518a(lynxView.getTemplateUrl(), a);
                            }
                        }
                        b.putInt("errorCode", 0);
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            if (callback != null) {
                callback.invoke(b);
            }
        }
    }

    @AbstractC28359d
    public final void customReport(ReadableMap readableMap, Callback callback) {
        C12115b.m21583b("LynxViewMonitorModule", "customReport");
        if (readableMap != null && this.mParam != null) {
            WritableMap b = C28355a.m56665b();
            b.putInt("errorCode", -1);
            if (this.mParam instanceof C12178a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((C12178a) obj).f29308a;
                    if (lynxView != null) {
                        try {
                            String string = readableMap.getString("eventName", "");
                            ReadableMap map = readableMap.getMap("category");
                            ReadableMap map2 = readableMap.getMap("metrics");
                            ReadableMap map3 = readableMap.getMap("timing");
                            ReadableMap map4 = readableMap.getMap("extra");
                            C12155c.f29212j.mo19525a(lynxView, string, lynxView.getTemplateUrl(), convertJson(map), convertJson(map2), convertJson(map4), convertJson(map3), readableMap.getInt("canSample", 0));
                            b.putInt("errorCode", 0);
                        } catch (Exception e) {
                            b.putString("errorMessage", "cause: " + e.getMessage());
                            C12126c.m21636a();
                        }
                    } else {
                        b.putString("errorMessage", "view is empty.");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                b.putString("errorMessage", "mParam is not LynxViewProvider.");
            }
            if (callback != null) {
                callback.invoke(b);
            }
        }
    }
}
