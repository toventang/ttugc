package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.ttnet.INetworkApi;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.settings.C68729ad;
import com.p2082ss.android.ugc.aweme.settings.C68730ae;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventMethod */
public final class SendAnalyticsEventMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47886a f110916a = new C47886a((byte) 0);

    /* renamed from: b */
    private final String f110917b;

    /* renamed from: d */
    private final List<String> f110918d;

    static {
        Covode.recordClassIndex(56568);
    }

    private SendAnalyticsEventMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventMethod$a */
    public static final class C47886a {
        static {
            Covode.recordClassIndex(56569);
        }

        private C47886a() {
        }

        public /* synthetic */ C47886a(byte b) {
            this();
        }
    }

    private /* synthetic */ SendAnalyticsEventMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventMethod$b */
    public static final class C47887b implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110919a;

        static {
            Covode.recordClassIndex(56570);
        }

        C47887b(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110919a = aVar;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            T t;
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110919a;
            if (aVar != null) {
                if (uVar != null) {
                    t = uVar.f52262b;
                } else {
                    t = null;
                }
                aVar.mo79886a((Object) t);
            }
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            String str;
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110919a;
            if (aVar != null) {
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                aVar.mo79885a(1, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventMethod$c */
    public static final class C47888c implements AbstractC22030d<String> {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110920a;

        static {
            Covode.recordClassIndex(56571);
        }

        C47888c(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110920a = aVar;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
            T t;
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110920a;
            if (aVar != null) {
                if (uVar != null) {
                    t = uVar.f52262b;
                } else {
                    t = null;
                }
                aVar.mo79886a((Object) t);
            }
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
            String str;
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110920a;
            if (aVar != null) {
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                aVar.mo79885a(1, str);
            }
        }
    }

    public SendAnalyticsEventMethod(C18288a aVar) {
        super(aVar);
        String str;
        C68729ad a = C68730ae.m121164a();
        List<String> list = null;
        if (a != null) {
            str = a.f153748a;
        } else {
            str = null;
        }
        this.f110917b = str;
        C68729ad a2 = C68730ae.m121164a();
        this.f110918d = a2 != null ? a2.f153749b : list;
    }

    /* renamed from: a */
    private static Map<String, String> m90879a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            C89219l.m154716b(next, "");
            linkedHashMap.put(next, jSONObject.get(next).toString());
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    private static List<C22027b> m90880b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(new C22027b(next, jSONObject.getString(next)));
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        if (jSONObject != null) {
            String optString = jSONObject.optString("path");
            C89219l.m154716b(optString, "");
            List<String> list = this.f110918d;
            if (list != null && list.contains(optString)) {
                String optString2 = jSONObject.optString("method");
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                C27910f fVar = new C27910f();
                JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                if (optJSONObject2 != null) {
                    str = optJSONObject2.toString();
                } else {
                    str = null;
                }
                C28022o oVar = (C28022o) fVar.mo46670a(str, C28022o.class);
                JSONObject optJSONObject3 = jSONObject.optJSONObject("header");
                if (TextUtils.equals(optString2, "GET")) {
                    List<C22027b> b = m90880b(optJSONObject3);
                    String str2 = this.f110917b;
                    if (str2 != null && !C89361p.m154870a((CharSequence) str2)) {
                        Map<String, String> a = m90879a(optJSONObject);
                        try {
                            List<C22027b> c = C89070n.m154524c(new C22027b("X-SS-No-Cookie", "true"));
                            if (b != null && !b.isEmpty()) {
                                c.addAll(b);
                            }
                            ((INetworkApi) C18097a.m33699b(this.f110917b).mo28823a().mo28832d().mo28858a(INetworkApi.class)).doGet(false, -1, optString, a, c, null).enqueue(new C47887b(aVar));
                        } catch (Exception e) {
                            if (aVar != null) {
                                aVar.mo79885a(1, e.getMessage());
                            }
                        }
                    } else if (aVar != null) {
                        aVar.mo79885a(0, "base url is empty!");
                    }
                } else if (TextUtils.equals(optString2, "POST")) {
                    List<C22027b> b2 = m90880b(optJSONObject3);
                    String str3 = this.f110917b;
                    if (str3 != null && !C89361p.m154870a((CharSequence) str3)) {
                        try {
                            List<C22027b> c2 = C89070n.m154524c(new C22027b("X-SS-No-Cookie", "true"));
                            if (b2 != null && !b2.isEmpty()) {
                                c2.addAll(b2);
                            }
                            ((SendAnalyticsEventApi) C18097a.m33699b(this.f110917b).mo28823a().mo28832d().mo28858a(SendAnalyticsEventApi.class)).doPost(false, -1, optString, m90879a(optJSONObject), oVar, c2, null).enqueue(new C47888c(aVar));
                        } catch (Exception e2) {
                            if (aVar != null) {
                                aVar.mo79885a(1, e2.getMessage());
                            }
                        }
                    } else if (aVar != null) {
                        aVar.mo79885a(0, "base url is empty!");
                    }
                } else if (aVar != null) {
                    aVar.mo79885a(0, "method is neither GET nor POST");
                }
            } else if (aVar != null) {
                aVar.mo79885a(0, "path doesn't match!");
            }
        } else if (aVar != null) {
            aVar.mo79885a(0, "no params!");
        }
    }
}
