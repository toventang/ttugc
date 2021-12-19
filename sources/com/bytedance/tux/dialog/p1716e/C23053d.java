package com.bytedance.tux.dialog.p1716e;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23023b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.e.d */
public final class C23053d {
    static {
        Covode.recordClassIndex(26973);
    }

    /* renamed from: a */
    public static /* synthetic */ C23023b m43470a(C23023b bVar, View view) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        bVar.mo37409a(new C23052c(bVar.f54592n, view));
        return bVar;
    }

    /* renamed from: a */
    public static final <T extends View> C23023b m43471a(C23023b bVar, T t, int i) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(t, "");
        C23052c cVar = new C23052c(bVar.f54592n, t);
        cVar.f54560a = i;
        bVar.mo37409a(cVar);
        return bVar;
    }
}
