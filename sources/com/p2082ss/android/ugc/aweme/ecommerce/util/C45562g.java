package com.p2082ss.android.ugc.aweme.ecommerce.util;

import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.g */
public final class C45562g {

    /* renamed from: a */
    public static final C20745e f106103a;

    /* renamed from: b */
    public static final C45562g f106104b = new C45562g();

    private C45562g() {
    }

    static {
        Covode.recordClassIndex(54055);
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48958b = C13628n.m24520b(C17879g.m33104a(), 0.5f);
        aVar.f48961e = C13628n.m24520b(C17879g.m33104a(), 2.0f);
        aVar.f48959c = C0643b.m2378c(C17879g.m33104a(), R.color.b6);
        C20745e a = aVar.mo34169a();
        C89219l.m154716b(a, "");
        f106103a = a;
    }

    /* renamed from: a */
    public static C20766v m88108a(Image image) {
        List<String> thumbUrls;
        List<String> urls;
        if (image == null || (((thumbUrls = image.getThumbUrls()) == null || thumbUrls.isEmpty()) && ((urls = image.getUrls()) == null || urls.isEmpty()))) {
            C20766v a = C20761r.m39061a(" ");
            C89219l.m154716b(a, "");
            return a;
        }
        C20766v a2 = C20761r.m39058a(image.toThumbFirstImageUrlModel());
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: a */
    public static C20766v m88109a(Object obj) {
        if (obj instanceof Image) {
            C20766v a = C20761r.m39058a(((Image) obj).toImageUrlModel());
            C89219l.m154716b(a, "");
            return a;
        } else if (obj instanceof String) {
            C20766v a2 = C20761r.m39061a((String) obj);
            C89219l.m154716b(a2, "");
            return a2;
        } else if (obj instanceof Integer) {
            C20766v a3 = C20761r.m39056a(((Number) obj).intValue());
            C89219l.m154716b(a3, "");
            return a3;
        } else if (obj instanceof C20714a) {
            C20766v a4 = C20761r.m39058a((C20714a) obj);
            C89219l.m154716b(a4, "");
            return a4;
        } else {
            C20766v a5 = C20761r.m39061a(" ");
            C89219l.m154716b(a5, "");
            return a5;
        }
    }
}
