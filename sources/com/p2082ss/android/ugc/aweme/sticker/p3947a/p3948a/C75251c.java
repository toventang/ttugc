package com.p2082ss.android.ugc.aweme.sticker.p3947a.p3948a;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.common.p2631c.C39089a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.a.c */
public final class C75251c extends AbstractC75248a {

    /* renamed from: b */
    public static final C75252a f169194b = new C75252a((byte) 0);

    /* renamed from: c */
    private String f169195c = "download";

    /* renamed from: d */
    private boolean f169196d = true;

    static {
        Covode.recordClassIndex(88153);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.a.c$a */
    public static final class C75252a {
        static {
            Covode.recordClassIndex(88154);
        }

        private C75252a() {
        }

        public /* synthetic */ C75252a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.a.c$c */
    public static final class C75254c extends C27895a<List<? extends C75249a>> {
        static {
            Covode.recordClassIndex(88156);
        }

        C75254c() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: a */
    public final String mo118587a() {
        return this.f169195c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: b */
    public final boolean mo118590b() {
        return this.f169196d;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.a.c$b */
    public static final class C75253b extends C39089a {

        /* renamed from: a */
        final /* synthetic */ C75251c f169197a;

        /* renamed from: b */
        final /* synthetic */ C75249a f169198b;

        /* renamed from: c */
        final /* synthetic */ HashMap f169199c;

        /* renamed from: d */
        final /* synthetic */ int f169200d;

        /* renamed from: e */
        final /* synthetic */ int f169201e;

        static {
            Covode.recordClassIndex(88155);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2631c.C39089a
        /* renamed from: a */
        public final void mo67843a() {
            if (this.f169201e < this.f169198b.f169191b.size() - 1) {
                this.f169197a.mo118597a(this.f169200d, this.f169198b, this.f169201e + 1, this.f169199c);
                return;
            }
            this.f169199c.put(this.f169198b, new C75250b("", 0));
            this.f169197a.mo118598a(this.f169200d, this.f169199c);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2631c.C39089a
        /* renamed from: a */
        public final void mo67844a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (this.f169198b.f169190a == 1) {
                HashMap hashMap = this.f169199c;
                C75249a aVar = this.f169198b;
                String str3 = C89361p.m154931f(str2, ".zip") + "_unzip";
                C80313cs.m139234c(str3);
                C84915u.m145938a(new File(str2), new File(str3));
                C80313cs.m139234c(str2);
                hashMap.put(aVar, new C75250b(str3, 1));
            } else {
                this.f169199c.put(this.f169198b, new C75250b(str2, 1));
            }
            this.f169197a.mo118598a(this.f169200d, this.f169199c);
        }

        C75253b(C75251c cVar, C75249a aVar, HashMap hashMap, int i, int i2) {
            this.f169197a = cVar;
            this.f169198b = aVar;
            this.f169199c = hashMap;
            this.f169200d = i;
            this.f169201e = i2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75251c(AbstractC14177d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: a */
    public final void mo118588a(int i, String str) {
        JSONArray optJSONArray;
        if (!(str == null || (optJSONArray = new JSONObject(str).optJSONArray("data")) == null)) {
            HashMap<C75249a, C75250b> hashMap = new HashMap<>();
            Object a = C63238c.f143575b.mo46671a(optJSONArray.toString(), new C75254c().type);
            C89219l.m154716b(a, "");
            for (C75249a aVar : (Iterable) a) {
                hashMap.put(aVar, null);
                mo118597a(i, aVar, 0, hashMap);
            }
        }
    }

    /* renamed from: a */
    public final void mo118598a(int i, HashMap<C75249a, C75250b> hashMap) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<C75249a, C75250b> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                C75250b value = entry.getValue();
                if (value == null) {
                    C89219l.m154715b();
                }
                C75250b bVar = value;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", bVar.f169192a);
                jSONObject.put("success", bVar.f169193b);
                jSONArray.put(jSONObject);
            } else {
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interface", this.f169195c);
        jSONObject2.put("file_paths", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        C89219l.m154716b(jSONObject3, "");
        mo118589a((long) i, jSONObject3);
    }

    /* renamed from: a */
    public final void mo118597a(int i, C75249a aVar, int i2, HashMap<C75249a, C75250b> hashMap) {
        if (i2 < aVar.f169191b.size()) {
            String str = aVar.f169191b.get(i2);
            C63244g.m114602a().mo73283k().downloadFile(str, C70638dj.f158117t + ((int) ((short) str.hashCode())) + File.separator, (String) C89070n.m154586h(C89361p.m154921c(str, new String[]{"/"})), new C75253b(this, aVar, hashMap, i, i2));
        }
    }
}
