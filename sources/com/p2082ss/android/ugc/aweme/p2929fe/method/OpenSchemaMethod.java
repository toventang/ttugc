package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod */
public final class OpenSchemaMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47872a f110884a = new C47872a((byte) 0);

    static {
        Covode.recordClassIndex(56541);
    }

    private OpenSchemaMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod$a */
    public static final class C47872a {
        static {
            Covode.recordClassIndex(56542);
        }

        private C47872a() {
        }

        public /* synthetic */ C47872a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenSchemaMethod() {
        this((C18288a) null);
    }

    public OpenSchemaMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        Context context;
        String str2;
        Context context2;
        if (jSONObject != null) {
            str = jSONObject.optString("schema");
        } else {
            str = null;
        }
        if (this.mJsBridge == null) {
            return;
        }
        if (this.mContextRef.get() == null) {
            C36125t.m73598a(C36125t.m73591a(), str);
        } else if (!C47962l.m90956c(str)) {
            Context context3 = (Context) this.mContextRef.get();
            if (!(context3 instanceof Activity)) {
                context = null;
            } else {
                context = context3;
            }
            Activity activity = (Activity) context;
            if (activity == null) {
                if (!(context3 instanceof MutableContextWrapper)) {
                    context3 = null;
                }
                MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context3;
                if (mutableContextWrapper != null) {
                    context2 = mutableContextWrapper.getBaseContext();
                } else {
                    context2 = null;
                }
                if (!(context2 instanceof Activity)) {
                    context2 = null;
                }
                activity = (Activity) context2;
            }
            if (!C36125t.m73596a(C36125t.m73591a(), activity, str)) {
                if (!TextUtils.isEmpty(str)) {
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    if (C89361p.m154908a((CharSequence) str, (CharSequence) "shoutouts/publish", false)) {
                        str2 = C89361p.m154873b(str, "aweme", "sslocal", false);
                        C33722d.C33723a.m69045a((Context) this.mContextRef.get(), str2, (String) null, false);
                    }
                }
                if (str != null) {
                    str2 = C89361p.m154869a(str, "aweme", "sslocal", false);
                } else {
                    str2 = null;
                }
                C33722d.C33723a.m69045a((Context) this.mContextRef.get(), str2, (String) null, false);
            }
        }
    }
}
