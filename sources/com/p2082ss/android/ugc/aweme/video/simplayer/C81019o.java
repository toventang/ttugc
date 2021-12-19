package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.o */
public final class C81019o implements AbstractC63037g {

    /* renamed from: a */
    public TTNetClientApi f181105a;

    /* renamed from: b */
    private C88411a f181106b = new C88411a();

    /* renamed from: c */
    private AbstractC18099f f181107c;

    /* renamed from: com.ss.android.ugc.aweme.video.simplayer.o$a */
    public static class C81022a {

        /* renamed from: a */
        JSONObject f181115a;

        /* renamed from: b */
        Exception f181116b;

        /* renamed from: c */
        int f181117c = -1;

        static {
            Covode.recordClassIndex(94340);
        }
    }

    static {
        Covode.recordClassIndex(94337);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g
    /* renamed from: a */
    public final Map mo101167a() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g
    /* renamed from: b */
    public final void mo101171b() {
        this.f181106b.mo142944a();
    }

    public C81019o(AbstractC18099f fVar) {
        this.f181107c = fVar;
        this.f181105a = (TTNetClientApi) fVar.mo28858a(TTNetClientApi.class);
    }

    /* renamed from: a */
    public static List<C22027b> m140629a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            arrayList.add(new C22027b(str, map.get(str)));
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g
    /* renamed from: a */
    public final void mo101168a(String str, AbstractC63037g.AbstractC63038a aVar) {
        m140630b(str, null, null, 0, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g
    /* renamed from: a */
    public final void mo101169a(String str, Map<String, String> map, AbstractC63037g.AbstractC63038a aVar) {
        m140630b(str, map, null, 0, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g
    /* renamed from: a */
    public final void mo101170a(String str, Map<String, String> map, JSONObject jSONObject, int i, AbstractC63037g.AbstractC63038a aVar) {
        m140630b(str, map, jSONObject, i, aVar);
    }

    /* renamed from: b */
    private void m140630b(final String str, final Map<String, String> map, final JSONObject jSONObject, final int i, final AbstractC63037g.AbstractC63038a aVar) {
        this.f181106b.mo142945a((AbstractC88412b) AbstractC88979t.m154314c(new Callable<C81022a>() {
            /* class com.p2082ss.android.ugc.aweme.video.simplayer.C81019o.CallableC810212 */

            static {
                Covode.recordClassIndex(94339);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C81022a call() {
                AbstractC21983b<String> post;
                C81022a aVar = new C81022a();
                try {
                    if (i != 1) {
                        post = C81019o.this.f181105a.get(str, C81019o.m140629a(map));
                    } else {
                        post = C81019o.this.f181105a.post(str, C81019o.m140629a(map), jSONObject);
                    }
                    C22099u<String> execute = post.execute();
                    try {
                        aVar.f181115a = new JSONObject((String) execute.f52262b);
                    } catch (Exception e) {
                        aVar.f181116b = e;
                        aVar.f181117c = -2;
                    }
                    if (aVar.f181116b == null && !execute.f52261a.mo35845a()) {
                        aVar.f181116b = new Exception("http fail");
                        aVar.f181117c = execute.f52261a.f52040b;
                    }
                } catch (Exception e2) {
                    aVar.f181116b = e2;
                }
                return aVar;
            }
        }).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143288c(new AbstractC88922b<C81022a>() {
            /* class com.p2082ss.android.ugc.aweme.video.simplayer.C81019o.C810201 */

            static {
                Covode.recordClassIndex(94338);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
                C62960a.m113384a("ttnet doTask startTask onComplete");
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                C62960a.m113386a("ttnet doTask startTask onError", th);
                aVar.mo101101a(null, new AbstractC63037g.C63039b(-1, "", th));
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final /* synthetic */ void onNext(Object obj) {
                String str;
                C81022a aVar = (C81022a) obj;
                if (C62960a.f142907a) {
                    StringBuilder sb = new StringBuilder("ttnet doTask startTask onNext:");
                    if (aVar.f181115a != null) {
                        str = aVar.f181115a.toString();
                    } else {
                        str = "json null.";
                    }
                    C62960a.m113384a(sb.append(str).toString());
                }
                if (aVar.f181116b == null) {
                    aVar.mo101101a(aVar.f181115a, null);
                } else {
                    aVar.mo101101a(aVar.f181115a, new AbstractC63037g.C63039b(aVar.f181117c, "", aVar.f181116b));
                }
            }
        }));
    }
}
