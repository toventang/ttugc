package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34322e;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod */
public final class RoutePushMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: d */
    public static final C89269g f110907d = C89271h.m154766a(50000, 60000);

    /* renamed from: e */
    public static final C47884a f110908e = new C47884a((byte) 0);

    /* renamed from: a */
    public final Map<Integer, BaseCommonJavaMethod.AbstractC47813a> f110909a;

    /* renamed from: b */
    public final C18288a f110910b;

    /* renamed from: f */
    private int f110911f;

    private RoutePushMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod$a */
    public static final class C47884a {
        static {
            Covode.recordClassIndex(56565);
        }

        private C47884a() {
        }

        public /* synthetic */ C47884a(byte b) {
            this();
        }
    }

    private /* synthetic */ RoutePushMethod() {
        this((C18288a) null);
    }

    static {
        Covode.recordClassIndex(56564);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod$b */
    public static final class C47885b implements AbstractC34467b {

        /* renamed from: a */
        final /* synthetic */ AbsActivityContainer f110912a;

        /* renamed from: b */
        final /* synthetic */ String f110913b;

        /* renamed from: c */
        final /* synthetic */ RoutePushMethod f110914c;

        /* renamed from: d */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110915d;

        static {
            Covode.recordClassIndex(56566);
        }

        /* renamed from: a */
        private static Bundle m90877a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b
        /* renamed from: a */
        public final boolean mo60905a(int i, int i2, Intent intent) {
            Bundle a;
            String string;
            if (i2 == 50000) {
                BaseCommonJavaMethod.AbstractC47813a remove = this.f110914c.f110909a.remove(Integer.valueOf(i));
                if (remove != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (!(intent == null || (a = m90877a(intent)) == null || (string = a.getString("serialized_data")) == null)) {
                        try {
                            JSONObject optJSONObject = new JSONObject(string).optJSONObject("data");
                            if (optJSONObject != null) {
                                C34322e.m70198a(jSONObject, optJSONObject);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    remove.mo79887a(jSONObject, 1, "push callback succeed");
                }
            } else {
                BaseCommonJavaMethod.AbstractC47813a remove2 = this.f110914c.f110909a.remove(Integer.valueOf(i));
                if (remove2 != null) {
                    remove2.mo79885a(-1, "resultCode = ".concat(String.valueOf(i2)));
                }
            }
            this.f110912a.mo69620b(this);
            return false;
        }

        C47885b(AbsActivityContainer absActivityContainer, String str, RoutePushMethod routePushMethod, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110912a = absActivityContainer;
            this.f110913b = str;
            this.f110914c = routePushMethod;
            this.f110915d = aVar;
        }
    }

    public RoutePushMethod(C18288a aVar) {
        super(aVar);
        this.f110910b = aVar;
        this.f110909a = new LinkedHashMap();
        this.f110911f = f110907d.f202927a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String optString;
        AbsActivityContainer a;
        if (jSONObject != null && (optString = jSONObject.optString("schema")) != null && (!TextUtils.isEmpty(optString)) && (a = mo79878a()) != null) {
            a.mo69615a(new C47885b(a, optString, this, aVar));
            if (a.mo69618a(optString, this.f110911f)) {
                if (aVar != null) {
                    this.f110909a.put(Integer.valueOf(this.f110911f), aVar);
                }
                int i = this.f110911f + 1;
                this.f110911f = i;
                C89269g gVar = f110907d;
                if (i > gVar.f202928b) {
                    this.f110911f = gVar.f202927a;
                }
            } else if (aVar != null) {
                aVar.mo79885a(-1, "router not supported");
            }
        } else if (aVar != null) {
            aVar.mo79885a(-1, "params not valid");
        }
    }
}
