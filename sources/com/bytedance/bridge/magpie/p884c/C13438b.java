package com.bytedance.bridge.magpie.p884c;

import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.bridge.magpie.p883b.C13434c;
import com.bytedance.bridge.magpie.p885d.AbstractC13442a;
import com.bytedance.bridge.magpie.p885d.AbstractC13443b;
import com.bytedance.bridge.magpie.p885d.AbstractC13444c;
import com.bytedance.bridge.magpie.p885d.AbstractC13445d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.c.b */
public final class C13438b {

    /* renamed from: a */
    private HashMap<String, C13431b> f32762a = new HashMap<>();

    /* renamed from: b */
    private final String f32763b = "BridgeHandler";

    static {
        Covode.recordClassIndex(15438);
    }

    /* renamed from: a */
    public final C13431b mo21662a(String str) {
        C89219l.m154719c(str, "");
        return this.f32762a.get(str);
    }

    /* renamed from: b */
    public final void mo21665b(C13431b bVar) {
        C89219l.m154719c(bVar, "");
        this.f32762a.remove(bVar.f32745a);
    }

    /* renamed from: a */
    public final void mo21663a(C13431b bVar) {
        C89219l.m154719c(bVar, "");
        this.f32762a.put(bVar.f32745a, bVar);
    }

    /* renamed from: com.bytedance.bridge.magpie.c.b$a */
    public static final class C13439a implements AbstractC13445d {

        /* renamed from: a */
        final /* synthetic */ AbstractC13442a f32764a;

        /* renamed from: b */
        final /* synthetic */ C13428a f32765b;

        static {
            Covode.recordClassIndex(15439);
        }

        C13439a(AbstractC13442a aVar, C13428a aVar2) {
            this.f32764a = aVar;
            this.f32765b = aVar2;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13445d
        /* renamed from: a */
        public final void mo21666a(int i, String str, JSONObject jSONObject) {
            C89219l.m154719c(str, "");
            AbstractC13442a aVar = this.f32764a;
            C13434c cVar = new C13434c();
            cVar.f32753b = i;
            cVar.f32752a = jSONObject;
            cVar.mo21657a(str);
            aVar.mo21667a(cVar, this.f32765b);
        }
    }

    /* renamed from: a */
    public final boolean mo21664a(C13402a aVar, C13428a aVar2, AbstractC13442a aVar3) {
        AbstractC13444c cVar;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(aVar3, "");
        AbstractC13443b bVar = aVar.f32693b;
        if (bVar != null) {
            bVar.mo21669b(aVar2);
        }
        C13434c cVar2 = null;
        if (bVar != null) {
            cVar2 = bVar.mo21668a(aVar2);
        }
        if (cVar2 != null) {
            aVar3.mo21667a(cVar2, aVar2);
            return false;
        }
        C13431b bVar2 = this.f32762a.get(aVar2.f32733b);
        if (bVar2 == null || (cVar = bVar2.f32748d) == null) {
            C13434c cVar3 = new C13434c();
            cVar3.f32753b = -2;
            cVar3.mo21657a(aVar2.f32733b + " can not found,do you forget registered?");
            aVar3.mo21667a(cVar3, aVar2);
            return false;
        }
        cVar.mo21670a(aVar2.f32733b, aVar2.f32736e, new C13439a(aVar3, aVar2));
        return true;
    }
}
