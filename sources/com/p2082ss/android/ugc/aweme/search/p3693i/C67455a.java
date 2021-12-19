package com.p2082ss.android.ugc.aweme.search.p3693i;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.i.a */
public final class C67455a {

    /* renamed from: a */
    public final ActivityC0945e f151126a;

    /* renamed from: b */
    public final C42345d f151127b;

    /* renamed from: c */
    public final String f151128c;

    /* renamed from: d */
    public final int f151129d;

    /* renamed from: e */
    public final View f151130e;

    static {
        Covode.recordClassIndex(79092);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67455a)) {
            return false;
        }
        C67455a aVar = (C67455a) obj;
        return C89219l.m154714a(this.f151126a, aVar.f151126a) && C89219l.m154714a(this.f151127b, aVar.f151127b) && C89219l.m154714a(this.f151128c, aVar.f151128c) && this.f151129d == aVar.f151129d && C89219l.m154714a(this.f151130e, aVar.f151130e);
    }

    public final int hashCode() {
        ActivityC0945e eVar = this.f151126a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        C42345d dVar = this.f151127b;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str = this.f151128c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f151129d) * 31;
        View view = this.f151130e;
        if (view != null) {
            i = view.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "DynamicMaskData(activity=" + this.f151126a + ", patch=" + this.f151127b + ", scenario=" + this.f151128c + ", pageIndex=" + this.f151129d + ", rootView=" + this.f151130e + ")";
    }

    public C67455a(ActivityC0945e eVar, C42345d dVar, String str, int i, View view) {
        this.f151126a = eVar;
        this.f151127b = dVar;
        this.f151128c = str;
        this.f151129d = i;
        this.f151130e = view;
    }
}
