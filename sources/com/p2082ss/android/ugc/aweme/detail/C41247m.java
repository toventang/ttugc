package com.p2082ss.android.ugc.aweme.detail;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.m */
public final class C41247m {

    /* renamed from: a */
    public static final C41247m f96355a = new C41247m();

    private C41247m() {
    }

    static {
        Covode.recordClassIndex(49130);
    }

    /* renamed from: a */
    public static boolean m83132a(float f, boolean z, AbstractC41102a aVar) {
        C39211a helper;
        C89219l.m154721d(aVar, "");
        ScrollableLayout scrollableLayout = aVar.f96084y;
        if ((scrollableLayout == null || (helper = scrollableLayout.getHelper()) == null || !helper.mo68100b()) && (!z || f >= 0.1f)) {
            return z;
        }
        aVar.f96079L.mo70358d();
        return false;
    }

    /* renamed from: a */
    public static boolean m83131a(float f, float f2, boolean z, AbstractC41102a aVar) {
        boolean z2;
        C39211a helper;
        C89219l.m154721d(aVar, "");
        aVar.mo70354p();
        ScrollableLayout scrollableLayout = aVar.f96084y;
        if (scrollableLayout == null || (helper = scrollableLayout.getHelper()) == null) {
            z2 = false;
        } else {
            z2 = helper.mo68100b();
        }
        if (z2) {
            return true;
        }
        if (Math.abs(f) >= Math.abs(f2)) {
            return z;
        }
        if (f2 > 30.0f) {
            aVar.f96079L.mo70359e();
        } else if (f2 < -30.0f) {
            return true;
        }
        return z;
    }
}
