package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.livesdk.browser.C6969d;
import com.bytedance.android.livesdk.browser.C7005e;
import com.bytedance.android.livesdk.browser.C7021g;
import com.bytedance.android.livesdk.browser.p463d.C6972a;
import com.bytedance.android.livesdk.container.AbstractC8241e;
import com.bytedance.android.livesdk.container.p513j.C8273c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n */
public final class C7186n extends AbstractC18337f<JSONObject, Object> {

    /* renamed from: a */
    private DialogInterface$OnCancelListenerC0944d f17890a;

    /* renamed from: b */
    private Activity f17891b;

    /* renamed from: c */
    private C8273c f17892c;

    static {
        Covode.recordClassIndex(7932);
    }

    public C7186n(Activity activity) {
        this.f17891b = activity;
    }

    public C7186n(DialogInterface$OnCancelListenerC0944d dVar) {
        this.f17890a = dVar;
    }

    public C7186n(C8273c cVar) {
        this.f17892c = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, C18338g gVar) {
        Activity activity;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("container_list");
        String optString = jSONObject2.optString("animation_type");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            C8273c cVar = this.f17892c;
            if (cVar != null) {
                cVar.mo14465b();
            } else {
                DialogInterface$OnCancelListenerC0944d dVar = this.f17890a;
                if (dVar != null) {
                    dVar.dismissAllowingStateLoss();
                } else {
                    Activity activity2 = this.f17891b;
                    if (activity2 != null) {
                        activity2.finish();
                    } else {
                        terminate();
                    }
                }
            }
        } else {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString2 = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString2)) {
                    View a = C7021g.C7023b.f17618a.mo13328a(optString2);
                    if (a != null) {
                        C89219l.m154721d(a, "");
                        ((C8273c) a).mo14465b();
                    }
                    C4031a b = C6969d.C6971b.f17440a.mo7676b(optString2);
                    if (b != null) {
                        if (b instanceof C6972a) {
                            C6972a aVar = (C6972a) b;
                            if (!TextUtils.isEmpty(optString)) {
                                aVar.f17497w = optString;
                            }
                        }
                        if (b instanceof AbstractC8241e) {
                            ((AbstractC8241e) b).mo14593a(optString);
                        }
                        View view = b.getView();
                        if (view != null) {
                            b.getClass();
                            view.post(new RunnableC7187o(b));
                        } else {
                            b.dismissAllowingStateLoss();
                        }
                    }
                    C7005e eVar = C7005e.C7007b.f17591a;
                    C89219l.m154721d(optString2, "");
                    WeakReference<Activity> weakReference = eVar.f17590a.get(optString2);
                    if (!(weakReference == null || weakReference.get() == null)) {
                        C7005e eVar2 = C7005e.C7007b.f17591a;
                        C89219l.m154721d(optString2, "");
                        WeakReference<Activity> weakReference2 = eVar2.f17590a.get(optString2);
                        if (!(weakReference2 == null || (activity = weakReference2.get()) == null)) {
                            activity.finish();
                        }
                    }
                }
            }
        }
        return null;
    }
}
