package com.p2082ss.android.ugc.aweme.editSticker.compile;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import java.io.File;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.editSticker.compile.e */
final /* synthetic */ class C45862e implements AbstractC1729g {

    /* renamed from: a */
    private final String f106837a;

    /* renamed from: b */
    private final View f106838b;

    static {
        Covode.recordClassIndex(54386);
    }

    C45862e(String str, View view) {
        this.f106837a = str;
        this.f106838b = view;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        String str = this.f106837a;
        C45859b bVar = C84891c.m145848a(((C45864g) iVar.mo5545d()).f106843a, new File(str), 100, Bitmap.CompressFormat.PNG) ? new C45859b(str, ((C45864g) iVar.mo5545d()).f106844b.intValue(), this.f106838b.hashCode()) : null;
        C84891c.m145846a(((C45864g) iVar.mo5545d()).f106843a);
        return bVar;
    }
}
