package com.bytedance.nita.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.C21521a;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.nita.p1558f.AbstractC21563b;
import com.bytedance.nita.p1558f.C21562a;
import com.bytedance.nita.p1558f.C21564c;
import com.bytedance.nita.p1558f.C21565d;
import com.p084a.p088b.C1870c;
import com.p084a.p088b.C1873d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.api.a */
public final class C21523a implements AbstractC21525c {

    /* renamed from: a */
    public final String f51104a;

    /* renamed from: b */
    public final int[] f51105b;

    /* renamed from: c */
    public final EnumC21528e f51106c;

    /* renamed from: d */
    public final EnumC21530g f51107d;

    /* renamed from: e */
    public final EnumC21529f f51108e;

    /* renamed from: f */
    public final int f51109f;

    /* renamed from: g */
    public final int f51110g;

    static {
        Covode.recordClassIndex(25164);
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: a */
    public final void mo35188a(View view, Activity activity) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(activity, "");
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: a */
    public final String mo35178a() {
        return this.f51104a;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: c */
    public final EnumC21528e mo35180c() {
        return this.f51106c;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: d */
    public final int[] mo35193d() {
        return this.f51105b;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: e */
    public final int mo35189e() {
        return this.f51109f;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: f */
    public final EnumC21530g mo35194f() {
        return this.f51107d;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: g */
    public final EnumC21529f mo35195g() {
        return this.f51108e;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: b */
    public final AbstractC21563b mo35179b() {
        if (C1870c.f5679b != null) {
            C1873d dVar = C1870c.f5679b;
            C89219l.m154709a((Object) dVar, "");
            if (dVar.f5682c) {
                return C21564c.f51168a;
            }
        }
        return C21562a.f51167a;
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: b */
    public final ViewGroup mo35192b(Context context) {
        C89219l.m154719c(context, "");
        return AbstractC21525c.C21526a.m40463a(context);
    }

    /* renamed from: a */
    public final void mo35191a(Context context) {
        C21521a.f51099c.mo35182a(this.f51104a, this.f51110g, context);
    }

    /* renamed from: a */
    public final View mo35190a(int i, Activity activity) {
        C89219l.m154719c(activity, "");
        return (View) C21565d.m40499a(this.f51104a, i, activity);
    }

    public C21523a(String str, int[] iArr, EnumC21528e eVar, EnumC21530g gVar, EnumC21529f fVar, int i, int i2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(iArr, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(fVar, "");
        this.f51104a = str;
        this.f51105b = iArr;
        this.f51106c = eVar;
        this.f51107d = gVar;
        this.f51108e = fVar;
        this.f51109f = i;
        this.f51110g = i2;
    }
}
