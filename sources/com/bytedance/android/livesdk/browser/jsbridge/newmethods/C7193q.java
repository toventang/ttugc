package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.p873a.p874a.C13386a;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.ies.web.jsbridge2.EnumC18323ah;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.q */
public final class C7193q extends AbstractC18334e<JSONObject, JSONObject> {
    static {
        Covode.recordClassIndex(7939);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18332c
    public final EnumC18323ah getPermissionGroup() {
        return EnumC18323ah.PRIVATE;
    }

    /* renamed from: a */
    private static Object m15100a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7206);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(7206);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(gVar, "");
        String optString = jSONObject2.optString("content", "");
        if (optString == null || optString.length() == 0) {
            finishWithFailure();
            return;
        }
        try {
            Object a = m15100a(gVar.f43859a, "clipboard");
            if (a != null) {
                ClipData newPlainText = ClipData.newPlainText(optString, optString);
                C89219l.m154716b(newPlainText, "");
                C13386a.C13387a.m24072a((ClipboardManager) a, newPlainText, PrivacyCert.Builder.Companion.with("bpea-593").usage("").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).tag("").build());
                finishWithSuccess();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        } catch (Exception unused) {
            finishWithFailure();
        }
    }
}
