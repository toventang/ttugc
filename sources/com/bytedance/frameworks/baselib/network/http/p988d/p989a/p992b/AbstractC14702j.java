package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14690a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.j */
public abstract class AbstractC14702j extends AbstractC14690a {

    /* renamed from: m */
    private static final String f35736m = AbstractC14702j.class.getSimpleName();

    /* renamed from: l */
    public boolean f35737l;

    /* renamed from: a */
    public abstract AbstractC14690a.EnumC14691a mo23701a(String str, List<String> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo23702a(JSONObject jSONObject, List<Boolean> list);

    /* renamed from: b */
    public abstract int mo23703b();

    static {
        Covode.recordClassIndex(16799);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14690a
    /* renamed from: a */
    public final boolean mo23697a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, false);
        boolean a = mo23702a(jSONObject, arrayList);
        this.f35737l = arrayList.get(0).booleanValue();
        return a;
    }

    /* renamed from: a */
    public final AbstractC14690a.EnumC14691a mo23704a(C14705l lVar, String str, List<String> list, List<C14694d> list2) {
        if (!mo23696a(lVar) || TextUtils.isEmpty(str)) {
            list.set(0, str);
            return AbstractC14690a.EnumC14691a.DISPATCH_NONE;
        }
        AbstractC14690a.EnumC14691a a = mo23701a(str, list);
        C14694d dVar = new C14694d();
        if (a != AbstractC14690a.EnumC14691a.DISPATCH_NONE) {
            dVar.f35712d = true;
            dVar.f35710b = this.f35697h;
            dVar.f35711c = this.f35696g;
            dVar.f35713e = mo23703b();
            dVar.f35709a = this.f35698i;
            if (a == AbstractC14690a.EnumC14691a.DISPATCH_HIT) {
                dVar.f35715g = list.get(0);
                dVar.f35714f = this.f35737l;
            }
            lVar.f35756c = this.f35699j;
        }
        list2.add(dVar);
        return a;
    }
}
