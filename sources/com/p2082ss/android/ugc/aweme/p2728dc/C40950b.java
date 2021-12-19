package com.p2082ss.android.ugc.aweme.p2728dc;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.main.C59050ba;
import java.util.Collection;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.dc.b */
public final class C40950b {

    /* renamed from: a */
    public static final C40950b f95782a = new C40950b();

    /* renamed from: b */
    private static final AbstractC89244h f95783b = C89250i.m154773a((AbstractC89171a) C40951a.f95784a);

    /* renamed from: a */
    public static C59050ba m82455a() {
        return (C59050ba) f95783b.getValue();
    }

    private C40950b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.dc.b$a */
    static final class C40951a extends AbstractC89220m implements AbstractC89171a<C59050ba> {

        /* renamed from: a */
        public static final C40951a f95784a = new C40951a();

        static {
            Covode.recordClassIndex(48803);
        }

        C40951a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C59050ba invoke() {
            return new C59050ba();
        }
    }

    static {
        Covode.recordClassIndex(48802);
    }

    /* renamed from: a */
    public static boolean m82456a(List<String> list, String str, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        boolean z2 = false;
        if (C13603b.m24435a((Collection) list)) {
            return false;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            String str2 = list.get(size);
            if (TextUtils.equals(str2, "zh-hant")) {
                list.set(size, "zh-Hant");
            }
            if (C89361p.m154872a(str2, str, true)) {
                if (z) {
                    list.remove(str2);
                }
                z2 = true;
            }
        }
        return z2;
    }
}
