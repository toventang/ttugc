package com.p2082ss.android.ugc.aweme.search.p3686d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.d.a */
public final class C67362a {

    /* renamed from: a */
    public final View f150932a;

    /* renamed from: b */
    public final Aweme f150933b;

    /* renamed from: c */
    public final String f150934c;

    /* renamed from: d */
    public final C67568r f150935d;

    /* renamed from: e */
    public final C67394a f150936e;

    static {
        Covode.recordClassIndex(78992);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67362a)) {
            return false;
        }
        C67362a aVar = (C67362a) obj;
        return C89219l.m154714a(this.f150932a, aVar.f150932a) && C89219l.m154714a(this.f150933b, aVar.f150933b) && C89219l.m154714a(this.f150934c, aVar.f150934c) && C89219l.m154714a(this.f150935d, aVar.f150935d) && C89219l.m154714a(this.f150936e, aVar.f150936e);
    }

    public final int hashCode() {
        View view = this.f150932a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        Aweme aweme = this.f150933b;
        int hashCode2 = (hashCode + (aweme != null ? aweme.hashCode() : 0)) * 31;
        String str = this.f150934c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C67568r rVar = this.f150935d;
        int hashCode4 = (hashCode3 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C67394a aVar = this.f150936e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AwemeData(view=" + this.f150932a + ", aweme=" + this.f150933b + ", label=" + this.f150934c + ", itemMobParam=" + this.f150935d + ", product=" + this.f150936e + ")";
    }

    private /* synthetic */ C67362a() {
        this(null, null, null, null, null);
    }

    public C67362a(View view, Aweme aweme, String str, C67568r rVar, C67394a aVar) {
        this.f150932a = view;
        this.f150933b = aweme;
        this.f150934c = str;
        this.f150935d = rVar;
        this.f150936e = aVar;
    }
}
