package com.p2082ss.android.ugc.aweme.crossplatform.p2712e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17117i;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.p2147a.C29929b;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.utils.C80421fd;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.e.a */
public final class C40635a implements AbstractC17117i {

    /* renamed from: a */
    static C81577a.AbstractC81580c f95200a;

    /* renamed from: b */
    static final CommonApi f95201b;

    /* renamed from: c */
    public static final C40635a f95202c = new C40635a();

    private C40635a() {
    }

    static {
        Covode.recordClassIndex(48475);
        String str = Api.f79771d;
        C89219l.m154716b(str, "");
        f95201b = (CommonApi) C18097a.m33696a().mo28816a(str).mo28858a(CommonApi.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.a$a */
    static final class CallableC40636a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f95203a;

        /* renamed from: b */
        final /* synthetic */ Map f95204b;

        static {
            Covode.recordClassIndex(48476);
        }

        CallableC40636a(String str, Map map) {
            this.f95203a = str;
            this.f95204b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C40651d call() {
            String a = C40635a.m82001a(this.f95203a);
            C81577a.C81579b bVar = new C81577a.C81579b("get", C40635a.m82001a(this.f95203a), null);
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this.f95204b.entrySet()) {
                    arrayList.add(new C22027b((String) entry.getKey(), (String) entry.getValue()));
                }
                T t = C40635a.f95201b.doGet(a, (Map<String, String>) null, arrayList).execute().f52262b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("_raw", t);
                jSONObject.put("response", new JSONObject((String) t));
                return new C40651d(bVar, new C81577a.C81581d(jSONObject, null));
            } catch (C29929b e) {
                JSONObject jSONObject2 = new JSONObject();
                C40635a.m82002a(jSONObject2, e.getStatusCode(), e.getMessage(), "");
                return new C40651d(bVar, new C81577a.C81581d(jSONObject2, e));
            } catch (C34485a e2) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("_raw", e2.getResponse());
                } catch (JSONException unused) {
                }
                int errorCode = e2.getErrorCode();
                String errorMsg = e2.getErrorMsg();
                String prompt = e2.getPrompt();
                C89219l.m154716b(prompt, "");
                C40635a.m82002a(jSONObject3, errorCode, errorMsg, prompt);
                return new C40651d(bVar, new C81577a.C81581d(jSONObject3, e2));
            } catch (Exception e3) {
                JSONObject jSONObject4 = new JSONObject();
                C40635a.m82002a(jSONObject4, -408, e3.getMessage(), "");
                return new C40651d(bVar, new C81577a.C81581d(jSONObject4, e3));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.a$c */
    static final class CallableC40638c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f95206a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f95207b;

        /* renamed from: c */
        final /* synthetic */ String f95208c;

        /* renamed from: d */
        final /* synthetic */ Map f95209d;

        static {
            Covode.recordClassIndex(48478);
        }

        CallableC40638c(String str, JSONObject jSONObject, String str2, Map map) {
            this.f95206a = str;
            this.f95207b = jSONObject;
            this.f95208c = str2;
            this.f95209d = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C40651d call() {
            T t;
            ArrayList arrayList;
            String a = C40635a.m82001a(this.f95206a);
            C81577a.C81579b bVar = new C81577a.C81579b(UGCMonitor.TYPE_POST, C40635a.m82001a(this.f95206a), this.f95207b);
            try {
                if (this.f95208c != null) {
                    C80421fd fdVar = C80421fd.f179981a;
                    JSONObject jSONObject = this.f95207b;
                    String str = this.f95208c;
                    Map map = this.f95209d;
                    if (map != null) {
                        ArrayList arrayList2 = new ArrayList(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            arrayList2.add(new C22027b((String) entry.getKey(), (String) entry.getValue()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    t = fdVar.mo123729b(a, jSONObject, str, C89070n.m154585g((Collection) arrayList));
                } else {
                    Map<String, String> hashMap = new HashMap<>();
                    JSONObject jSONObject2 = this.f95207b;
                    if (jSONObject2 != null) {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString = this.f95207b.optString(next, "");
                            C89219l.m154716b(next, "");
                            C89219l.m154716b(optString, "");
                            hashMap.put(next, optString);
                        }
                    }
                    C29803q.m60037b(hashMap, true);
                    T t2 = C40635a.f95201b.doPost(this.f95206a, hashMap).execute().f52262b;
                    C89219l.m154716b(t2, "");
                    t = t2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("response", new JSONObject(t));
                jSONObject3.put("_raw", t);
                return new C40651d(bVar, new C81577a.C81581d(jSONObject3, null));
            } catch (C29929b e) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("code", 0);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("errCode", e.getStatusCode());
                    jSONObject5.put("message", e.getMessage());
                    jSONObject4.put("error", jSONObject5);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                return new C40651d(bVar, new C81577a.C81581d(jSONObject4, e));
            } catch (Exception e3) {
                JSONObject jSONObject6 = new JSONObject();
                try {
                    jSONObject6.put("code", 0);
                    jSONObject6.put("response", new JSONObject(""));
                    jSONObject6.put("_raw", "");
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                return new C40651d(bVar, new C81577a.C81581d(jSONObject6, e3));
            }
        }
    }

    /* renamed from: a */
    public static String m82001a(String str) {
        C29844g gVar = new C29844g(str);
        List<C29934d> list = gVar.f71191a;
        if (list != null && (!list.isEmpty())) {
            Iterator<C29934d> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C29934d next = it.next();
                C89219l.m154716b(next, "");
                if (C89361p.m154872a("request_tag_from", next.f71419a, true)) {
                    break;
                }
            }
            String a = gVar.mo52126a();
            C89219l.m154716b(a, "");
            return a;
        }
        gVar.mo52130a("request_tag_from", "h5");
        String a2 = gVar.mo52126a();
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.a$b */
    static final class C40637b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC17117i.AbstractC17118a f95205a;

        static {
            Covode.recordClassIndex(48477);
        }

        C40637b(AbstractC17117i.AbstractC17118a aVar) {
            this.f95205a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C81577a.C81581d dVar;
            JSONObject jSONObject;
            C81577a.C81579b bVar;
            C81577a.C81581d dVar2;
            C81577a.AbstractC81580c cVar = C40635a.f95200a;
            if (cVar != null) {
                C89219l.m154716b(iVar, "");
                if (iVar.mo5535a()) {
                    C40651d dVar3 = (C40651d) iVar.mo5545d();
                    if (dVar3 != null) {
                        bVar = dVar3.f95228a;
                    } else {
                        bVar = null;
                    }
                    C40651d dVar4 = (C40651d) iVar.mo5545d();
                    if (dVar4 != null) {
                        dVar2 = dVar4.f95229b;
                    } else {
                        dVar2 = null;
                    }
                    cVar.mo61885a(bVar, dVar2);
                }
            }
            C89219l.m154716b(iVar, "");
            C40651d dVar5 = (C40651d) iVar.mo5545d();
            if (!(dVar5 == null || (dVar = dVar5.f95229b) == null || (jSONObject = dVar.f182425a) == null)) {
                Object opt = jSONObject.opt("code");
                if ((opt instanceof Integer) && 1 == ((Integer) opt).intValue()) {
                    AbstractC17117i.AbstractC17118a aVar = this.f95205a;
                    AbstractC17117i.C17120c cVar2 = new AbstractC17117i.C17120c();
                    String obj = jSONObject.opt("response").toString();
                    Charset charset = C89338d.f202990a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = obj.getBytes(charset);
                    C89219l.m154716b(bytes, "");
                    cVar2.f40730a = bytes;
                    cVar2.f40732c = new HashMap();
                    aVar.mo26996a(cVar2);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.a$d */
    static final class C40639d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC17117i.AbstractC17118a f95210a;

        static {
            Covode.recordClassIndex(48479);
        }

        C40639d(AbstractC17117i.AbstractC17118a aVar) {
            this.f95210a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C81577a.C81581d dVar;
            JSONObject jSONObject;
            C81577a.C81579b bVar;
            C81577a.C81581d dVar2;
            C81577a.AbstractC81580c cVar = C40635a.f95200a;
            if (cVar != null) {
                C89219l.m154716b(iVar, "");
                C40651d dVar3 = (C40651d) iVar.mo5545d();
                if (dVar3 != null) {
                    bVar = dVar3.f95228a;
                } else {
                    bVar = null;
                }
                C40651d dVar4 = (C40651d) iVar.mo5545d();
                if (dVar4 != null) {
                    dVar2 = dVar4.f95229b;
                } else {
                    dVar2 = null;
                }
                cVar.mo61885a(bVar, dVar2);
            }
            C89219l.m154716b(iVar, "");
            C40651d dVar5 = (C40651d) iVar.mo5545d();
            if (!(dVar5 == null || (dVar = dVar5.f95229b) == null || (jSONObject = dVar.f182425a) == null)) {
                Object opt = jSONObject.opt("code");
                if ((opt instanceof Integer) && 1 == ((Integer) opt).intValue()) {
                    AbstractC17117i.AbstractC17118a aVar = this.f95210a;
                    AbstractC17117i.C17120c cVar2 = new AbstractC17117i.C17120c();
                    String obj = jSONObject.opt("response").toString();
                    Charset charset = C89338d.f202990a;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = obj.getBytes(charset);
                    C89219l.m154716b(bytes, "");
                    cVar2.f40730a = bytes;
                    cVar2.f40732c = new HashMap();
                    aVar.mo26996a(cVar2);
                }
            }
            return null;
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i
    /* renamed from: b */
    public final void mo27028b(String str, Map<String, String> map, AbstractC17117i.AbstractC17118a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(aVar, "");
        AbstractC17117i.C17119b.m31625a(this, str, map, aVar);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i
    /* renamed from: a */
    public final void mo27026a(String str, Map<String, String> map, AbstractC17117i.AbstractC17118a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(aVar, "");
        C1731i.m5640b(new CallableC40636a(str, map), C1731i.f5562a).mo5534a(new C40637b(aVar), C1731i.f5564c, null);
    }

    /* renamed from: a */
    public static void m82002a(JSONObject jSONObject, int i, String str, String str2) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errCode", i);
                jSONObject2.put("prompts", str2);
                if (str != null) {
                    jSONObject2.put("message", str);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jSONObject.put("response", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i
    /* renamed from: b */
    public final void mo27029b(String str, Map<String, String> map, String str2, JSONObject jSONObject, AbstractC17117i.AbstractC17118a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        AbstractC17117i.C17119b.m31626a(this, str, map, str2, jSONObject, aVar);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17117i
    /* renamed from: a */
    public final void mo27027a(String str, Map<String, String> map, String str2, JSONObject jSONObject, AbstractC17117i.AbstractC17118a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        C1731i.m5640b(new CallableC40638c(str, jSONObject, str2, map), C1731i.f5562a).mo5534a(new C40639d(aVar), C1731i.f5564c, null);
    }
}
