package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.sdk.webview.p2176di.C30247a;
import com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RecordParamMethod */
public final class RecordParamMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35083a f82784b = new C35083a((byte) 0);

    static {
        Covode.recordClassIndex(42213);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return "openRecord";
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RecordParamMethod$a */
    public static final class C35083a {
        static {
            Covode.recordClassIndex(42214);
        }

        private C35083a() {
        }

        public /* synthetic */ C35083a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordParamMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    private static Activity m71725a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    private final void m71726a(JSONObject jSONObject, C29844g gVar) {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    gVar.mo52128a(next, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    gVar.mo52129a(next, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    gVar.mo52127a(next, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    gVar.mo52130a(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    gVar.mo52130a(next, obj.toString());
                } else if (obj instanceof JSONObject) {
                    m71726a((JSONObject) obj, gVar);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Activity activity;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String string = jSONObject.getString(StringSet.type);
        C89219l.m154716b(string, "");
        if (TextUtils.equals("goods_order_share", string)) {
            new WeakReference(mo26893e());
            return;
        }
        new JSONObject();
        jSONObject.put(StringSet.type, "openRecord");
        if (jSONObject.has("args")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            C89219l.m154716b(jSONObject2, "");
            jSONObject2.put("recordOrigin", "jsBridge");
            if (C89219l.m154714a((Object) "challenge", (Object) string)) {
                jSONObject2.put("id", jSONObject2.get("challenge_id"));
                jSONObject2.put("recordParam", "challenge");
            } else if (C89219l.m154714a((Object) "music", (Object) string)) {
                jSONObject2.put("id", jSONObject2.get("music_id"));
                jSONObject2.put("recordParam", "music");
            } else if (C89219l.m154714a((Object) "effect", (Object) string)) {
                if (jSONObject2.has("effect_id")) {
                    jSONObject2.put("id", jSONObject2.get("effect_id"));
                }
                jSONObject2.put("recordParam", "sticker");
                if (jSONObject2.has("effect_meta_info")) {
                    jSONObject2.put("effect_meta_info", jSONObject2.getJSONObject("effect_meta_info").toString());
                }
                if (jSONObject2.has("effect_image")) {
                    jSONObject2.put("effect_image", jSONObject2.getJSONObject("effect_image").toString());
                }
            } else if (C89219l.m154714a((Object) "donation", (Object) string)) {
                jSONObject2.put("id", jSONObject2.get("charity_id"));
                jSONObject2.put("recordParam", "donation");
            } else if (C89219l.m154714a((Object) "star_atlas", (Object) string)) {
                jSONObject2.put("id", jSONObject2.get("star_atlas_id"));
                jSONObject2.put("recordParam", "star_atlas");
                jSONObject2.put("star_atlas_object", jSONObject.getJSONObject("args").toString());
            } else if (C89219l.m154714a((Object) "tcm", (Object) string)) {
                jSONObject2.put("recordParam", "tcm");
                jSONObject2.put("star_atlas_object", jSONObject.getJSONObject("args").toString());
            }
            jSONObject2.put("group", "1");
        }
        try {
            Context e = mo26893e();
            if ((((e instanceof Activity) && (activity = (Activity) e) != null) || (activity = m71725a(e)) != null) && C33067a.m67726a(activity, true)) {
                String optString = jSONObject.optString(StringSet.type);
                if (!C13627m.m24498a(optString)) {
                    C89219l.m154716b(optString, "");
                    if (C89361p.m154882a((CharSequence) optString, ':', 0, false, 6) < 0) {
                        StringBuilder sb = new StringBuilder();
                        IMainServiceForJsb iMainServiceForJsb = C30247a.m61216a().f72163a;
                        C89219l.m154716b(iMainServiceForJsb, "");
                        C29844g gVar = new C29844g(sb.append(iMainServiceForJsb.getSSLocalScheme()).append("://").append(optString).toString());
                        m71726a(jSONObject.optJSONObject("args"), gVar);
                        C30247a.m61216a().f72163a.startAdsAppActivity(activity, gVar.mo52126a());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
