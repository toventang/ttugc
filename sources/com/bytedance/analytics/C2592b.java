package com.bytedance.analytics;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.analytics.C2576a;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.analytics.page.C2603g;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.analytics.b */
public final class C2592b {

    /* renamed from: a */
    public static final C2592b f7807a = new C2592b();

    /* renamed from: b */
    public static String f7808b;

    static {
        Covode.recordClassIndex(2979);
    }

    private C2592b() {
    }

    /* renamed from: a */
    public static final void m7536a(C2576a aVar) {
        C89219l.m154721d(aVar, "");
        if (TextUtils.isEmpty(aVar.f7762b)) {
            throw new Exception("id attribute in PageObject can not be null");
        } else if (TextUtils.isEmpty(aVar.f7763c)) {
            throw new Exception("name attribute in PageObject can not be null");
        } else if (aVar.f7764d == C2576a.EnumC2579c.Fragment && aVar.f7765e == null) {
            throw new Exception("Fragment page,fragment attribute in PageObject can not be null");
        } else {
            C2603g.m7551a(aVar);
        }
    }

    /* renamed from: a */
    public static final void m7537a(AbstractC2597b bVar) {
        C89219l.m154721d(bVar, "");
        C2576a.C2577a aVar = new C2576a.C2577a();
        aVar.mo7057a(bVar.ag_());
        aVar.mo7058b(bVar.bv_());
        aVar.f7776g = bVar.mo7085c();
        if (bVar instanceof Activity) {
            aVar.mo7056a(C2576a.EnumC2579c.Activity);
        } else if (bVar instanceof Fragment) {
            aVar.mo7056a(C2576a.EnumC2579c.Fragment);
            aVar.f7773d = (Fragment) bVar;
            if (bVar instanceof AbstractC2599d) {
                aVar.f7774e = true;
                String ah_ = ((AbstractC2599d) bVar).ah_();
                C89219l.m154721d(ah_, "");
                aVar.f7775f = ah_;
            }
        }
        m7536a(aVar.mo7055a());
    }
}
