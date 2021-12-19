package com.p2082ss.android.ugc.aweme.bullet.p2418f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17117i;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.client.C22027b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.utils.C80421fd;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.bullet.f.d */
public final class C35153d implements AbstractC17117i {

    /* renamed from: a */
    public final CommonApi f82947a = ((CommonApi) RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(CommonApi.class));

    static {
        Covode.recordClassIndex(42308);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.d$a */
    static final class CallableC35154a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C35153d f82948a;

        /* renamed from: b */
        final /* synthetic */ Map f82949b;

        /* renamed from: c */
        final /* synthetic */ String f82950c;

        static {
            Covode.recordClassIndex(42309);
        }

        CallableC35154a(C35153d dVar, Map map, String str) {
            this.f82948a = dVar;
            this.f82949b = map;
            this.f82950c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C35149a call() {
            try {
                ArrayList arrayList = new ArrayList();
                Map map = this.f82949b;
                if (map != null && (!map.isEmpty())) {
                    for (Map.Entry entry : this.f82949b.entrySet()) {
                        arrayList.add(new C22027b((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                T t = this.f82948a.f82947a.doGet(this.f82950c, Collections.emptyMap(), arrayList).execute().f52262b;
                C89219l.m154716b(t, "");
                Charset charset = C89338d.f202990a;
                if (t != null) {
                    byte[] bytes = t.getBytes(charset);
                    C89219l.m154716b(bytes, "");
                    return new C35149a(true, bytes, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Throwable th) {
                return new C35149a(false, null, th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.d$c */
    static final class CallableC35156c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C35153d f82952a;

        /* renamed from: b */
        final /* synthetic */ String f82953b;

        /* renamed from: c */
        final /* synthetic */ String f82954c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f82955d;

        /* renamed from: e */
        final /* synthetic */ Map f82956e;

        static {
            Covode.recordClassIndex(42311);
        }

        CallableC35156c(C35153d dVar, String str, String str2, JSONObject jSONObject, Map map) {
            this.f82952a = dVar;
            this.f82953b = str;
            this.f82954c = str2;
            this.f82955d = jSONObject;
            this.f82956e = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C35149a call() {
            T t;
            ArrayList arrayList;
            try {
                if (this.f82953b != null) {
                    C80421fd fdVar = C80421fd.f179981a;
                    String str = this.f82954c;
                    JSONObject jSONObject = this.f82955d;
                    String str2 = this.f82953b;
                    Map map = this.f82956e;
                    if (map != null) {
                        ArrayList arrayList2 = new ArrayList(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            arrayList2.add(new C22027b((String) entry.getKey(), (String) entry.getValue()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    t = fdVar.mo123729b(str, jSONObject, str2, C89070n.m154585g((Collection) arrayList));
                } else {
                    Map<String, String> hashMap = new HashMap<>();
                    JSONObject jSONObject2 = this.f82955d;
                    if (jSONObject2 != null) {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString = this.f82955d.optString(next, "");
                            C89219l.m154716b(next, "");
                            C89219l.m154716b(optString, "");
                            hashMap.put(next, optString);
                        }
                    }
                    T t2 = this.f82952a.f82947a.doPost(this.f82954c, hashMap).execute().f52262b;
                    C89219l.m154716b(t2, "");
                    t = t2;
                }
                Charset charset = C89338d.f202990a;
                if (t != null) {
                    byte[] bytes = t.getBytes(charset);
                    C89219l.m154716b(bytes, "");
                    return new C35149a(true, bytes, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Throwable th) {
                return new C35149a(false, null, th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.d$b */
    static final class C35155b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC17117i.AbstractC17118a f82951a;

        static {
            Covode.recordClassIndex(42310);
        }

        C35155b(AbstractC17117i.AbstractC17118a aVar) {
            this.f82951a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            C35149a aVar = (C35149a) iVar.mo5545d();
            if (aVar.f82942a) {
                AbstractC17117i.AbstractC17118a aVar2 = this.f82951a;
                AbstractC17117i.C17120c cVar = new AbstractC17117i.C17120c();
                byte[] bArr = aVar.f82943b;
                if (bArr == null) {
                    C89219l.m154715b();
                }
                cVar.f40730a = bArr;
                cVar.f40732c = new HashMap();
                aVar2.mo26996a(cVar);
            } else {
                AbstractC17117i.AbstractC17118a aVar3 = this.f82951a;
                Throwable th = aVar.f82944c;
                if (th == null) {
                    C89219l.m154715b();
                }
                aVar3.mo26997a(th);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.d$d */
    static final class C35157d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC17117i.AbstractC17118a f82957a;

        static {
            Covode.recordClassIndex(42312);
        }

        C35157d(AbstractC17117i.AbstractC17118a aVar) {
            this.f82957a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            C35149a aVar = (C35149a) iVar.mo5545d();
            if (aVar.f82942a) {
                AbstractC17117i.AbstractC17118a aVar2 = this.f82957a;
                AbstractC17117i.C17120c cVar = new AbstractC17117i.C17120c();
                byte[] bArr = aVar.f82943b;
                if (bArr == null) {
                    C89219l.m154715b();
                }
                cVar.f40730a = bArr;
                cVar.f40732c = new HashMap();
                aVar2.mo26996a(cVar);
            } else {
                AbstractC17117i.AbstractC17118a aVar3 = this.f82957a;
                Throwable th = aVar.f82944c;
                if (th == null) {
                    C89219l.m154715b();
                }
                aVar3.mo26997a(th);
            }
            return C89391z.f203057a;
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
        C1731i.m5640b(new CallableC35154a(this, map, str), C1731i.f5562a).mo5534a(new C35155b(aVar), C1731i.f5564c, null);
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
        C1731i.m5640b(new CallableC35156c(this, str2, str, jSONObject, map), C1731i.f5562a).mo5534a(new C35157d(aVar), C1731i.f5564c, null);
    }
}
