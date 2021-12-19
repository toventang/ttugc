package com.p2082ss.android.ugc.aweme.p2929fe.base;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.sdk.webview.C30245c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40522d;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod */
public abstract class BaseCommonJavaMethod implements AbstractC18293d, AbstractC33974au {

    /* renamed from: c */
    protected WeakReference<C30245c> f110764c;
    public WeakReference<Context> mContextRef;
    public C18288a mJsBridge;

    /* renamed from: com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a */
    public interface AbstractC47813a {
        static {
            Covode.recordClassIndex(56440);
        }

        /* renamed from: a */
        void mo79885a(int i, String str);

        /* renamed from: a */
        void mo79886a(Object obj);

        /* renamed from: a */
        void mo79887a(Object obj, int i, String str);

        /* renamed from: a */
        void mo79888a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(56438);
    }

    public abstract void handle(JSONObject jSONObject, AbstractC47813a aVar);

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    public BaseCommonJavaMethod() {
    }

    /* renamed from: c */
    private C30245c mo79916c() {
        WeakReference<C30245c> weakReference = this.f110764c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbsActivityContainer mo79878a() {
        C30245c c = mo79916c();
        if (c != null) {
            return (AbsActivityContainer) c.mo53698a(AbsActivityContainer.class);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C34337k mo79881b() {
        C30245c c = mo79916c();
        if (c != null) {
            return (C34337k) c.mo53698a(C34337k.class);
        }
        return null;
    }

    public Context getActContext() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            return null;
        }
        Activity a = C34729o.m70950a(weakReference.get());
        if (a == null) {
            return this.mContextRef.get();
        }
        return a;
    }

    public BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        this.mContextRef = weakReference;
        return this;
    }

    public BaseCommonJavaMethod(C18288a aVar) {
        this.mJsBridge = aVar;
    }

    public BaseCommonJavaMethod attach(C30245c cVar) {
        if (cVar != null) {
            this.f110764c = new WeakReference<>(cVar);
        }
        return this;
    }

    public Context getActContext(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        Activity a = C34729o.m70950a(weakReference.get());
        if (a == null) {
            return weakReference.get();
        }
        return a;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        try {
            C40522d.C40523a.f94795a.mo69606a();
            JSONObject jSONObject2 = hVar.f43671d;
            if (jSONObject2 != null) {
                jSONObject2.put("func", hVar.f43670c);
                jSONObject2.put("permissionGroup", hVar.f43675h);
            }
            final String str = hVar.f43669b;
            hVar.f43676i = false;
            final String str2 = hVar.f43674g;
            handle(jSONObject2, new AbstractC47813a() {
                /* class com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.C478121 */

                static {
                    Covode.recordClassIndex(56439);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.AbstractC47813a
                /* renamed from: a */
                public final void mo79886a(Object obj) {
                    if (BaseCommonJavaMethod.this.mJsBridge != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 1);
                            jSONObject.put("data", obj);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            BaseCommonJavaMethod.this.mJsBridge.mo29248a(str2, str, jSONObject);
                        } else {
                            BaseCommonJavaMethod.this.mJsBridge.mo29249a(str, jSONObject);
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.AbstractC47813a
                /* renamed from: a */
                public final void mo79888a(JSONObject jSONObject) {
                    if (BaseCommonJavaMethod.this.mJsBridge == null) {
                        return;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        BaseCommonJavaMethod.this.mJsBridge.mo29248a(str2, str, jSONObject);
                    } else {
                        BaseCommonJavaMethod.this.mJsBridge.mo29249a(str, jSONObject);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.AbstractC47813a
                /* renamed from: a */
                public final void mo79885a(int i, String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        BaseCommonJavaMethod.this.mJsBridge.mo29248a(str2, str, jSONObject);
                    } else {
                        BaseCommonJavaMethod.this.mJsBridge.mo29249a(str, jSONObject);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.AbstractC47813a
                /* renamed from: a */
                public final void mo79887a(Object obj, int i, String str) {
                    if (BaseCommonJavaMethod.this.mJsBridge != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", i);
                            jSONObject.put("msg", str);
                            jSONObject.put("data", obj);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            BaseCommonJavaMethod.this.mJsBridge.mo29248a(str2, str, jSONObject);
                        } else {
                            BaseCommonJavaMethod.this.mJsBridge.mo29249a(str, jSONObject);
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void sendEvent(String str, JSONObject jSONObject, int i) {
        C18288a aVar;
        if ((i == 1 || i == 3) && (aVar = this.mJsBridge) != null) {
            aVar.mo29252b(str, jSONObject);
        }
    }
}
