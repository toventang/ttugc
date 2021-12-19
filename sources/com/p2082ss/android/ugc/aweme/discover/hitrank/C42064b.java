package com.p2082ss.android.ugc.aweme.discover.hitrank;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.b */
public final class C42064b {

    /* renamed from: a */
    public static boolean f98061a;

    /* renamed from: b */
    public static String f98062b = "";

    /* renamed from: c */
    public static String f98063c = "";

    /* renamed from: d */
    public static final C42064b f98064d = new C42064b();

    /* renamed from: e */
    private static boolean f98065e;

    private C42064b() {
    }

    static {
        Covode.recordClassIndex(49998);
    }

    /* renamed from: a */
    public static void m84190a(BaseShortVideoContext baseShortVideoContext) {
        C89219l.m154721d(baseShortVideoContext, "");
        List<AVTextExtraStruct> list = baseShortVideoContext.structList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                C89219l.m154716b(aVTextExtraStruct, "");
                if (aVTextExtraStruct.getType() == 1) {
                    String hashTagName = aVTextExtraStruct.getHashTagName();
                    C89219l.m154716b(hashTagName, "");
                    arrayList.add(hashTagName);
                }
            }
            if (f98065e && arrayList.size() > 0 && !TextUtils.isEmpty(f98062b)) {
                C42066d.m84194a(f98062b, f98063c, 9, arrayList);
            }
        }
        f98065e = false;
    }
}
