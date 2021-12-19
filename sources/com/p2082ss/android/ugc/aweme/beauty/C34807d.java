package com.p2082ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.StrArray;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.d */
public final class C34807d {
    static {
        Covode.recordClassIndex(41811);
    }

    /* renamed from: a */
    public static final BeautyMobParam m71116a(List<ComposerBeauty> list) {
        boolean z;
        C89219l.m154721d(list, "");
        StrArray strArray = new StrArray();
        StrArray strArray2 = new StrArray();
        StrArray strArray3 = new StrArray();
        StrArray strArray4 = new StrArray();
        StrArray strArray5 = new StrArray();
        StrArray strArray6 = new StrArray();
        for (T t : list) {
            String parentId = t.getParentId();
            if (parentId == null || parentId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                strArray4.add(t.getEffect().getEffectId());
                strArray5.add(t.getEffect().getName());
                strArray6.add(String.valueOf(((float) t.getProgressValue()) / 100.0f));
            } else {
                strArray.add(t.getEffect().getEffectId());
                strArray2.add(t.getEffect().getName());
                strArray3.add(String.valueOf(((float) t.getProgressValue()) / 100.0f));
            }
        }
        String strArray7 = strArray.toString();
        C89219l.m154716b(strArray7, "");
        String strArray8 = strArray2.toString();
        C89219l.m154716b(strArray8, "");
        String strArray9 = strArray3.toString();
        C89219l.m154716b(strArray9, "");
        String strArray10 = strArray4.toString();
        C89219l.m154716b(strArray10, "");
        String strArray11 = strArray5.toString();
        C89219l.m154716b(strArray11, "");
        String strArray12 = strArray6.toString();
        C89219l.m154716b(strArray12, "");
        return new BeautyMobParam(strArray7, strArray8, strArray9, strArray10, strArray11, strArray12);
    }

    /* renamed from: a */
    public static final C84425b m71117a(C84425b bVar, BeautyMobParam beautyMobParam) {
        BeautyMobParam beautyMobParam2 = beautyMobParam;
        C89219l.m154721d(bVar, "");
        if (beautyMobParam2 == null) {
            beautyMobParam2 = new BeautyMobParam(null, null, null, null, null, null, 63, null);
        }
        C84425b a = bVar.mo129406a("beautify_child_id_list", beautyMobParam2.getBeautifyChildIdListStr()).mo129406a("beautify_child_name_list", beautyMobParam2.getBeautifyChildNameListStr()).mo129406a("beautify_child_value_list", beautyMobParam2.getBeautifyChildValueListStr()).mo129406a("beautify_parent_id_list", beautyMobParam2.getBeautifyParentIdListStr()).mo129406a("beautify_parent_name_list", beautyMobParam2.getBeautifyParentNameListStr()).mo129406a("beautify_parent_value_list", beautyMobParam2.getBeautifyParentValueListStr());
        C89219l.m154716b(a, "");
        return a;
    }
}
