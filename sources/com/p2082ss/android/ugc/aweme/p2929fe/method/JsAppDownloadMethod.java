package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2324e.p2326b.AbstractC33737c;
import com.p2082ss.android.ugc.aweme.app.p2324e.p2326b.C33735a;
import com.p2082ss.android.ugc.aweme.app.p2324e.p2326b.C33736b;
import com.p2082ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod */
public class JsAppDownloadMethod extends BaseCommonJavaMethod implements AbstractC33737c, AbstractC33974au {

    /* renamed from: a */
    private C33736b f110829a;

    static {
        Covode.recordClassIndex(56492);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        if (this.f110829a != null && this.mContextRef != null && this.mContextRef.get() != null) {
            this.f110829a = null;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        if (this.f110829a != null && this.mContextRef != null && this.mContextRef.get() != null) {
            this.mContextRef.get();
        }
    }

    public JsAppDownloadMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof AbstractC1204m) {
            ((AbstractC1204m) context).getLifecycle().mo4012a(this);
        }
        return super.attach(weakReference);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (this.mContextRef != null && this.mContextRef.get() != null) {
            if (this.f110829a == null) {
                this.mContextRef.get();
                this.f110829a = new C33736b(this);
            }
            String optString = jSONObject.optString("func");
            if (TextUtils.equals("subscribe_app_ad", optString)) {
                if (this.mContextRef.get() != null) {
                    new C33735a().mo59969a(jSONObject.optJSONObject("data"));
                }
            } else if (TextUtils.equals("unsubscribe_app_ad", optString)) {
                if (this.f110829a != null) {
                    new C33735a().mo59969a(jSONObject.optJSONObject("data"));
                }
            } else if (TextUtils.equals("download_app_ad", optString)) {
                if (this.f110829a != null && this.mContextRef.get() != null) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    new C33735a().mo59969a(optJSONObject);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("extParam");
                    if (optJSONObject2 != null) {
                        optJSONObject2.optString("refer");
                        optJSONObject2.optJSONObject("ad_extra_data");
                    }
                    new AdCardClose(-1).post();
                }
            } else if (TextUtils.equals("cancel_download_app_ad", optString)) {
                C33736b bVar = this.f110829a;
                if (bVar != null && bVar.f79927b != null) {
                    new C33735a().mo59969a(jSONObject.optJSONObject("data"));
                }
            } else if (TextUtils.equals("get_download_pause_task", optString)) {
                if (this.f110829a == null) {
                }
            } else if (TextUtils.equals("get_downloading_task", optString)) {
                if (this.f110829a == null) {
                }
            } else if (TextUtils.equals("get_install_status", optString) && this.f110829a != null && jSONObject.length() != 0) {
                jSONObject.optJSONArray("task_list");
            }
        }
    }
}
