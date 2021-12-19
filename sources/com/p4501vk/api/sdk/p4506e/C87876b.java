package com.p4501vk.api.sdk.p4506e;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.AbstractC87874e;
import com.p4501vk.api.sdk.C87831b;
import com.p4501vk.api.sdk.C87860d;
import com.p4501vk.api.sdk.C87897i;
import com.p4501vk.api.sdk.internal.AbstractC87900a;
import com.p4501vk.api.sdk.p4503b.AbstractC87840b;
import com.p4501vk.api.sdk.p4503b.C87839a;
import com.p4501vk.api.sdk.p4503b.C87841c;
import com.p4501vk.api.sdk.p4503b.C87842d;
import com.p4501vk.api.sdk.p4503b.C87843e;
import com.p4501vk.api.sdk.p4503b.C87845g;
import com.p4501vk.api.sdk.p4503b.C87847h;
import com.p4501vk.api.sdk.p4504c.C87854b;
import com.p4501vk.api.sdk.p4505d.C87866b;
import com.p4501vk.api.sdk.p4505d.C87871d;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.e.b */
public class C87876b<T> extends AbstractC87900a<T> implements AbstractC87874e<T> {

    /* renamed from: c */
    public static final C87877a f199603c = new C87877a((byte) 0);

    /* renamed from: a */
    public final LinkedHashMap<String, String> f199604a = new LinkedHashMap<>();

    /* renamed from: b */
    public String f199605b;

    static {
        Covode.recordClassIndex(103886);
    }

    /* renamed from: com.vk.api.sdk.e.b$a */
    public static final class C87877a {
        static {
            Covode.recordClassIndex(103887);
        }

        private C87877a() {
        }

        public /* synthetic */ C87877a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: org.json.JSONObject */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public T mo142356a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        return jSONObject;
    }

    public C87876b(String str) {
        C89219l.m154719c(str, "");
        this.f199605b = str;
    }

    @Override // com.p4501vk.api.sdk.AbstractC87874e
    /* renamed from: a */
    public final T mo142355a(String str) {
        C89219l.m154719c(str, "");
        try {
            return mo142356a(new JSONObject(str));
        } catch (Throwable th) {
            throw new C87854b(-2, this.f199605b, true, "[" + this.f199605b + "] " + th.getLocalizedMessage(), null, null, null, 112, null);
        }
    }

    @Override // com.p4501vk.api.sdk.internal.AbstractC87900a
    /* renamed from: b */
    public final T mo142357b(C87860d dVar) {
        C89219l.m154719c(dVar, "");
        C87831b bVar = dVar.f199567c;
        this.f199604a.put("lang", bVar.f199530p);
        this.f199604a.put("device_id", bVar.f199518d.getValue());
        this.f199604a.put("v", bVar.f199519e);
        C89219l.m154719c(bVar, "");
        C87897i.C87898a aVar = new C87897i.C87898a();
        LinkedHashMap<String, String> linkedHashMap = this.f199604a;
        C89219l.m154719c(linkedHashMap, "");
        aVar.f199641c.putAll(linkedHashMap);
        String str = this.f199605b;
        C89219l.m154719c(str, "");
        aVar.f199639a = str;
        String str2 = bVar.f199519e;
        C89219l.m154719c(str2, "");
        aVar.f199640b = str2;
        C87897i a = aVar.mo142376a();
        C89219l.m154719c(a, "");
        C89219l.m154719c(a, "");
        C87866b a2 = dVar.mo142339a();
        C87871d.C87872a aVar2 = new C87871d.C87872a();
        C89219l.m154719c(a, "");
        String str3 = a.f199634a;
        C89219l.m154719c(str3, "");
        aVar2.f199595a = str3;
        String str4 = a.f199635b;
        C89219l.m154719c(str4, "");
        aVar2.f199596b = str4;
        Map<String, String> map = a.f199636c;
        C89219l.m154719c(map, "");
        aVar2.f199597c.putAll(map);
        AbstractC87840b eVar = new C87843e(dVar, a2, aVar2, dVar.f199567c.f199518d.getValue(), dVar.f199567c.f199530p, this);
        C89219l.m154719c(a, "");
        C89219l.m154719c(eVar, "");
        if (!a.f199638e) {
            eVar = new C87847h(dVar, a.f199637d, eVar);
        }
        AbstractC87840b gVar = new C87845g(dVar, a.f199637d, new C87842d(dVar, eVar));
        if (a.f199637d > 0) {
            gVar = new C87841c(dVar, a.f199637d, gVar);
        }
        C89219l.m154719c(gVar, "");
        T t = (T) gVar.mo142304a(new C87839a());
        if (t == null) {
            C89219l.m154707a();
        }
        return t;
    }
}
