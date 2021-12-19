package com.p2082ss.android.ugc.aweme.tools.beauty.data;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.data.a */
public final class C77884a implements AbstractC77967m.AbstractC77969b {
    static {
        Covode.recordClassIndex(90973);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77969b
    /* renamed from: b */
    public final boolean mo121537b(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra) {
        C89219l.m154721d(beautyFilterConfig, "");
        C89219l.m154721d(beautyCategoryExtra, "");
        C77886a aVar = C77886a.f174762s;
        C89219l.m154721d(beautyCategoryExtra, "");
        if (aVar.f174775a) {
            return beautyCategoryExtra.getRegionT();
        }
        return beautyCategoryExtra.getRegionM();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77969b
    /* renamed from: a */
    public final boolean mo121535a(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra) {
        C89219l.m154721d(beautyFilterConfig, "");
        C89219l.m154721d(beautyCategoryExtra, "");
        if (C77878d.m135993a(beautyCategoryExtra.getAbGroup()) == beautyFilterConfig.getAbGroup() || beautyFilterConfig.getAbGroup() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77969b
    /* renamed from: a */
    public final boolean mo121536a(BeautyFilterConfig beautyFilterConfig, List<BeautyCategory> list) {
        T t;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C89219l.m154721d(beautyFilterConfig, "");
        C89219l.m154721d(list, "");
        Iterator<T> it = list.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
        } while (!C89219l.m154714a((Object) t.getBeautyCategoryExtra().getPanelType(), (Object) EnumC77817a.ALL.getFlag()));
        if (t != null) {
            z = true;
        } else {
            z = false;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (C89219l.m154714a((Object) next.getBeautyCategoryExtra().getPanelType(), (Object) EnumC77817a.MALE.getFlag())) {
                if (next != null) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            T next2 = it3.next();
            if (C89219l.m154714a((Object) next2.getBeautyCategoryExtra().getPanelType(), (Object) EnumC77817a.FEMALE.getFlag())) {
                if (next2 != null) {
                    z3 = true;
                }
            }
        }
        z3 = false;
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next3 = it4.next();
            if (mo121535a(beautyFilterConfig, next3.getBeautyCategoryExtra())) {
                if (next3 != null) {
                    z4 = true;
                }
            }
        }
        z4 = false;
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            T next4 = it5.next();
            if (mo121537b(beautyFilterConfig, next4.getBeautyCategoryExtra())) {
                if (next4 != null) {
                    z5 = true;
                }
            }
        }
        z5 = false;
        if (z || (z2 && z3)) {
            z6 = true;
        } else {
            z6 = false;
        }
        C41093a.m82765c("LJT isPanelValid: validG:" + z6 + " all:" + z + " m:" + z2 + " f:" + z3 + " group:" + z4 + " region:" + z5);
        if (!(!list.isEmpty()) || !z6 || !z4 || !z5) {
            return false;
        }
        return true;
    }
}
