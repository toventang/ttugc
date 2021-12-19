package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ad */
final /* synthetic */ class C37012ad implements AbstractC89172b {

    /* renamed from: a */
    private final C37157k f87178a;

    /* renamed from: b */
    private final Resources f87179b;

    /* renamed from: c */
    private final AbstractC36421g f87180c;

    static {
        Covode.recordClassIndex(44366);
    }

    C37012ad(C37157k kVar, Resources resources, AbstractC36421g gVar) {
        this.f87178a = kVar;
        this.f87179b = resources;
        this.f87180c = gVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C37157k kVar = this.f87178a;
        Resources resources = this.f87179b;
        AbstractC36421g gVar = this.f87180c;
        C23025b bVar = (C23025b) obj;
        bVar.f54513b = true;
        bVar.mo37417a(resources.getString(R.string.al1), new C37029au(kVar, gVar));
        bVar.mo37419b(resources.getString(R.string.al0), new C37030av(kVar));
        return null;
    }
}
