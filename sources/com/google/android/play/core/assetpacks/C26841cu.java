package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.AbstractC27060b;
import java.io.File;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.cu */
final /* synthetic */ class C26841cu implements AbstractC27060b {

    /* renamed from: a */
    private final C26769ac f63681a;

    static {
        Covode.recordClassIndex(32316);
    }

    C26841cu(C26769ac acVar) {
        this.f63681a = acVar;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27060b
    /* renamed from: a */
    public final void mo35009a(Object obj) {
        C26769ac acVar = this.f63681a;
        List list = (List) obj;
        int a = acVar.f63429b.mo44516a();
        for (File file : acVar.mo44448b()) {
            if (!list.contains(file.getName()) && C26769ac.m53177b(file) != ((long) a)) {
                C26769ac.m53178c(file);
            }
        }
    }
}
