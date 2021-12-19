package com.p2082ss.android.ugc.aweme.setting.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b.C68546a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68386g;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68616a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.utils.d */
public final class C68689d {

    /* renamed from: a */
    public static final C68689d f153693a = new C68689d();

    private C68689d() {
    }

    static {
        Covode.recordClassIndex(80950);
    }

    /* renamed from: a */
    public static final void m121122a(C43047dm dmVar, List<String> list) {
        C89219l.m154721d(dmVar, "");
        C89219l.m154721d(list, "");
        List<AbstractC40931a<?>> a = dmVar.mo73245a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            AbstractC40931a<?> aVar = a.get(i);
            if (aVar instanceof C68616a) {
                Object obj = ((C68546a) aVar.mo70132l()).f153369f;
                if (obj == null) {
                    aVar.mo70127a(false);
                } else if (obj instanceof String) {
                    if (!TextUtils.isEmpty((CharSequence) obj) && !list.contains(obj)) {
                        aVar.mo70127a(false);
                    }
                } else if (obj instanceof C68386g.C68389a) {
                    String str = ((C68386g.C68389a) obj).f153111a;
                    if (!TextUtils.isEmpty(str) && !list.contains(str)) {
                        aVar.mo70127a(false);
                    }
                }
            }
        }
    }
}
