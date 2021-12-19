package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RequestPermissionMethod */
public final class RequestPermissionMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47881a f110900a = new C47881a((byte) 0);

    static {
        Covode.recordClassIndex(56557);
    }

    private RequestPermissionMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RequestPermissionMethod$a */
    public static final class C47881a {
        static {
            Covode.recordClassIndex(56558);
        }

        private C47881a() {
        }

        public /* synthetic */ C47881a(byte b) {
            this();
        }
    }

    private /* synthetic */ RequestPermissionMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RequestPermissionMethod$b */
    public static final class C47882b implements C80611a.AbstractC80613a {

        /* renamed from: a */
        final /* synthetic */ Activity f110901a;

        /* renamed from: b */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110902b;

        static {
            Covode.recordClassIndex(56559);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80611a.AbstractC80613a
        /* renamed from: a */
        public final void mo79924a() {
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110902b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            aVar.mo79886a((Object) jSONObject);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80611a.AbstractC80613a
        /* renamed from: b */
        public final void mo79925b() {
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110902b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            aVar.mo79886a((Object) jSONObject);
        }

        C47882b(Activity activity, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110901a = activity;
            this.f110902b = aVar;
        }
    }

    public RequestPermissionMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static void m90874a(int i, List<String> list) {
        String[] strArr = C47964n.f111082a.get(Integer.valueOf(i));
        if (strArr != null) {
            for (String str : strArr) {
                list.add(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        JSONArray optJSONArray;
        if (jSONObject != null && aVar != null) {
            Context actContext = getActContext();
            if (!(actContext instanceof Activity)) {
                actContext = null;
            }
            Activity activity = (Activity) actContext;
            if (activity != null && (optJSONArray = jSONObject.optJSONArray("permission_list")) != null) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = optJSONArray.get(i);
                    if (obj instanceof Integer) {
                        m90874a(((Number) obj).intValue(), arrayList);
                    }
                }
                int size = arrayList.size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = "";
                }
                String[] strArr2 = (String[]) arrayList.toArray(strArr);
                if (strArr2 != null) {
                    C47882b bVar = new C47882b(activity, aVar);
                    List<String> a = C80611a.m139765a(activity, strArr2);
                    if (a == null || a.isEmpty()) {
                        bVar.mo79924a();
                    } else {
                        C35444b.m72473a(activity, strArr2, new C35444b.AbstractC35447b(bVar) {
                            /* class com.p2082ss.android.ugc.aweme.utils.permission.C80611a.C806121 */

                            /* renamed from: a */
                            final /* synthetic */ AbstractC80613a f180261a;

                            static {
                                Covode.recordClassIndex(93886);
                            }

                            {
                                this.f180261a = r1;
                            }

                            @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
                            /* renamed from: a */
                            public final void mo53515a(String[] strArr, int[] iArr) {
                                if (this.f180261a == null) {
                                    return;
                                }
                                if (C80611a.m139768a(iArr)) {
                                    this.f180261a.mo79924a();
                                } else {
                                    this.f180261a.mo79925b();
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
