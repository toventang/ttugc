package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55271a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55804c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55731b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55735d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56248b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56250c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56231a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.b */
public final class C55278b implements AbstractC56231a {

    /* renamed from: a */
    private Map<String, Integer> f126387a = new LinkedHashMap();

    /* renamed from: b */
    private final C55731b f126388b = C55731b.f127107c;

    static {
        Covode.recordClassIndex(65033);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56231a
    /* renamed from: a */
    public final void mo92288a() {
        if (C55197c.m100917a()) {
            C55804c.m101584a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56231a
    /* renamed from: b */
    public final C56250c mo92290b(C56248b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
        return new C56250c();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56231a
    /* renamed from: a */
    public final void mo92289a(C56248b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56231a
    /* renamed from: a */
    public final String mo92287a(String str, String str2, IMUser iMUser) {
        C89219l.m154721d(str, "");
        if (this.f126387a.isEmpty()) {
            C55271a.m101036a();
            Map<String, Integer> c = C55271a.m101038c();
            Map<String, Integer> map = this.f126387a;
            C89219l.m154716b(c, "");
            map.putAll(c);
        }
        if (iMUser == null && (iMUser = C55085g.m100757b(str, str2)) == null) {
            return "";
        }
        C55735d[] dVarArr = C55731b.f127106b;
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (C55735d dVar : dVarArr) {
            int i = dVar.f127124a;
            Integer num = this.f126387a.get(iMUser.getSecUid());
            if (num != null && i == num.intValue()) {
                return dVar.f127125b;
            }
            arrayList.add(C89391z.f203057a);
        }
        return "";
    }
}
