package com.p2082ss.android.ugc.aweme.i18n.language.p3063a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.h */
public final /* synthetic */ class CallableC53448h implements Callable {

    /* renamed from: a */
    private final C53446g f122671a;

    /* renamed from: b */
    private final Context f122672b;

    /* renamed from: c */
    private final String[] f122673c;

    static {
        Covode.recordClassIndex(63017);
    }

    CallableC53448h(C53446g gVar, Context context, String[] strArr) {
        this.f122671a = gVar;
        this.f122672b = context;
        this.f122673c = strArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C53446g gVar = this.f122671a;
        Context context = this.f122672b;
        String[] strArr = this.f122673c;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        if (gVar.f122666d == null) {
            gVar.f122666d = new DialogC53439a(context, strArr);
        }
        if (!gVar.f122666d.isShowing()) {
            gVar.f122666d.show();
        }
        gVar.f122663a = false;
        return null;
    }
}
