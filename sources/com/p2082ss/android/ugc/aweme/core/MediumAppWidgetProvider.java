package com.p2082ss.android.ugc.aweme.core;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C33492am;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.core.MediumAppWidgetProvider */
public final class MediumAppWidgetProvider extends AbstractC40236a {
    static {
        Covode.recordClassIndex(48035);
    }

    @Override // com.p2082ss.android.ugc.aweme.core.AbstractC40236a
    /* renamed from: b */
    public final int mo69441b() {
        return R.layout.cq;
    }

    @Override // com.p2082ss.android.ugc.aweme.core.AbstractC40236a
    /* renamed from: d */
    public final float mo69443d() {
        return 1.0952381f;
    }

    @Override // com.p2082ss.android.ugc.aweme.core.AbstractC40236a
    /* renamed from: e */
    public final String mo69444e() {
        return "hashtag_m";
    }

    @Override // com.p2082ss.android.ugc.aweme.core.AbstractC40236a
    /* renamed from: a */
    public final int mo69440a() {
        return C33492am.f79563c;
    }

    @Override // com.p2082ss.android.ugc.aweme.core.AbstractC40236a
    /* renamed from: c */
    public final int[] mo69442c() {
        return new int[]{R.id.c1_, R.id.c1a, R.id.c1b, R.id.c1c};
    }

    @Override // com.p2082ss.android.ugc.aweme.core.AbstractC40236a
    /* renamed from: f */
    public final int[] mo69445f() {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        return new int[]{C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics())), C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()))};
    }

    @Override // com.p2082ss.android.ugc.aweme.core.AbstractC40236a
    /* renamed from: g */
    public final int[] mo69446g() {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        return new int[]{C89241a.m154730a(TypedValue.applyDimension(1, 63.0f, system.getDisplayMetrics())), C89241a.m154730a(TypedValue.applyDimension(1, 69.0f, system2.getDisplayMetrics()))};
    }
}
