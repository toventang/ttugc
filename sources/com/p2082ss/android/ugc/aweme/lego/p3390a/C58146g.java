package com.p2082ss.android.ugc.aweme.lego.p3390a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.lego.a.g */
public final class C58146g {

    /* renamed from: a */
    public static final C58146g f132405a = new C58146g();

    /* renamed from: b */
    public Map<Object, EnumC58150ad> f132406b = new HashMap();

    static {
        Covode.recordClassIndex(68212);
    }

    private C58146g() {
        EnumC58151ae[] values = EnumC58151ae.values();
        for (EnumC58151ae aeVar : values) {
            this.f132406b.put(aeVar, EnumC58150ad.values()[aeVar.ordinal()]);
        }
        EnumC58147aa[] values2 = EnumC58147aa.values();
        for (EnumC58147aa aaVar : values2) {
            this.f132406b.put(aaVar, EnumC58150ad.values()[aaVar.ordinal() + 6]);
        }
        EnumC58151ae[] values3 = EnumC58151ae.values();
        for (EnumC58151ae aeVar2 : values3) {
            this.f132406b.put("service" + aeVar2.name(), EnumC58150ad.values()[aeVar2.ordinal() + 11]);
        }
    }

    /* renamed from: a */
    public final EnumC58150ad mo95660a(EnumC58147aa aaVar) {
        return this.f132406b.get(aaVar);
    }

    /* renamed from: a */
    public final EnumC58150ad mo95661a(EnumC58151ae aeVar) {
        return this.f132406b.get(aeVar);
    }
}
