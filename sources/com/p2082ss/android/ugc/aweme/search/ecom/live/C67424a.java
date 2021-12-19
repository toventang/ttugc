package com.p2082ss.android.ugc.aweme.search.ecom.live;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2346b.C34105h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67404c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.live.a */
public final class C67424a {

    /* renamed from: a */
    public final C67425b f151051a;

    /* renamed from: b */
    public final C34105h f151052b;

    /* renamed from: c */
    public final C42815b.AbstractC42817b f151053c;

    /* renamed from: d */
    public final Context f151054d;

    /* renamed from: e */
    public final String f151055e;

    /* renamed from: f */
    public final int f151056f;

    static {
        Covode.recordClassIndex(79058);
    }

    /* renamed from: a */
    public final void mo106336a(C67394a aVar) {
        Aweme aweme;
        C67568r rVar;
        C67425b bVar = this.f151051a;
        if (bVar == null || (aweme = bVar.f151057a) == null) {
            aweme = new Aweme();
        }
        C34105h hVar = this.f151052b;
        if (hVar != null) {
            rVar = hVar.f80638b;
        } else {
            rVar = null;
        }
        C39162r.m79460a("livesdk_tiktokec_product_entrance_show", C67404c.m119441b(aweme, aVar, rVar));
    }

    public C67424a(C67425b bVar, C34105h hVar, C42815b.AbstractC42817b bVar2, Context context, String str, int i) {
        C89219l.m154721d(context, "");
        this.f151051a = bVar;
        this.f151052b = hVar;
        this.f151053c = bVar2;
        this.f151054d = context;
        this.f151055e = str;
        this.f151056f = i;
    }
}
