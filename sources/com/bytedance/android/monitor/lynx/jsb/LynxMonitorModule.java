package com.bytedance.android.monitor.lynx.jsb;

import android.content.Context;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11989f;
import com.bytedance.android.monitor.p714l.C11948b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.C28355a;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxView;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxMonitorModule extends LynxModule {
    public static final C11997a Companion = new C11997a((byte) 0);
    private final C27910f gson = new C27910f();

    static {
        Covode.recordClassIndex(13723);
    }

    /* renamed from: com.bytedance.android.monitor.lynx.jsb.LynxMonitorModule$a */
    public static final class C11997a {
        static {
            Covode.recordClassIndex(13724);
        }

        private C11997a() {
        }

        public /* synthetic */ C11997a(byte b) {
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
            C11948b.m21086a();
            return jSONObject;
        }
    }

    private final C11989f getError(ReadableMap readableMap) {
        C11989f fVar = new C11989f();
        try {
            fVar.f28724b = "lynx_error_custom";
            fVar.f28725c = 201;
            fVar.f28726d = String.valueOf(convertJson(readableMap));
            return fVar;
        } catch (Exception unused) {
            C11948b.m21086a();
            return fVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxMonitorModule(Context context, Object obj) {
        super(context, obj);
        C89219l.m154719c(context, "");
        C89219l.m154719c(obj, "");
    }

    @AbstractC28359d
    public final void reportJSError(ReadableMap readableMap, Callback callback) {
        if (readableMap != null && this.mParam != null) {
            WritableMap b = C28355a.m56665b();
            b.putInt("errorCode", -1);
            if (this.mParam instanceof C11998a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((C11998a) obj).f28743a;
                    if (lynxView != null) {
                        C11969b.f28620f.mo19181a(lynxView, getError(readableMap));
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
        boolean z;
        if (readableMap != null && this.mParam != null) {
            WritableMap b = C28355a.m56665b();
            b.putInt("errorCode", -1);
            if (this.mParam instanceof C11998a) {
                Object obj = this.mParam;
                if (obj != null) {
                    LynxView lynxView = ((C11998a) obj).f28743a;
                    if (lynxView != null) {
                        try {
                            String string = readableMap.getString("eventName", "");
                            ReadableMap map = readableMap.getMap("category");
                            ReadableMap map2 = readableMap.getMap("metrics");
                            ReadableMap map3 = readableMap.getMap("timing");
                            ReadableMap map4 = readableMap.getMap("extra");
                            int i = readableMap.getInt("canSample", 1);
                            C11969b bVar = C11969b.f28620f;
                            String templateUrl = lynxView.getTemplateUrl();
                            JSONObject convertJson = convertJson(map);
                            JSONObject convertJson2 = convertJson(map2);
                            JSONObject convertJson3 = convertJson(map4);
                            JSONObject convertJson4 = convertJson(map3);
                            if (i == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bVar.mo19183a(lynxView, string, templateUrl, convertJson, convertJson2, convertJson3, convertJson4, null, z);
                            b.putInt("errorCode", 0);
                        } catch (Exception e) {
                            b.putString("errorMessage", "cause: " + e.getMessage());
                            C11948b.m21086a();
                        }
                    } else {
                        b.putString("errorMessage", "view is empty.");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                b.putString("errorMessage", "mParam is not MonitorViewProvider.");
            }
            if (callback != null) {
                callback.invoke(b);
            }
        }
    }
}
