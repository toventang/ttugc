package com.google.android.play.core.p1961a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.install.AbstractC27057b;
import com.google.android.play.core.p1964c.AbstractC26967a;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.google.android.play.core.tasks.C27071m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.a.h */
public final class C26746h implements AbstractC26739b {

    /* renamed from: a */
    private final C26757s f63361a;

    /* renamed from: b */
    private final C26743e f63362b;

    /* renamed from: c */
    private final Context f63363c;

    /* renamed from: d */
    private final Handler f63364d = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32218);
    }

    C26746h(C26757s sVar, C26743e eVar, Context context) {
        this.f63361a = sVar;
        this.f63362b = eVar;
        this.f63363c = context;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26739b
    /* renamed from: a */
    public final synchronized void mo44402a(AbstractC27057b bVar) {
        MethodCollector.m26663i(13185);
        this.f63362b.mo44660a((AbstractC26967a) bVar);
        MethodCollector.m26664o(13185);
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26739b
    /* renamed from: b */
    public final synchronized void mo44405b(AbstractC27057b bVar) {
        MethodCollector.m26663i(13186);
        this.f63362b.mo44664b(bVar);
        MethodCollector.m26664o(13186);
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26739b
    /* renamed from: a */
    public final AbstractC27062d<AbstractC26736a> mo44401a() {
        C26757s sVar = this.f63361a;
        String packageName = this.f63363c.getPackageName();
        if (sVar.f63385b == null) {
            return C26757s.m53133a();
        }
        C26757s.f63383a.mo44598d("requestUpdateInfo(%s)", packageName);
        C27071m mVar = new C27071m();
        sVar.f63385b.mo44652a(new C26752n(sVar, mVar, packageName, mVar));
        return mVar.f64055a;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26739b
    /* renamed from: a */
    public final boolean mo44403a(AbstractC26736a aVar, Activity activity) {
        AbstractC26741d b = AbstractC26741d.m53104c().mo44409b();
        C26745g gVar = new C26745g(activity);
        if (aVar.mo44386a(b) == null) {
            return false;
        }
        gVar.mo44412a(aVar.mo44386a(b).getIntentSender(), 19);
        return true;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26739b
    /* renamed from: b */
    public final AbstractC27062d<Void> mo44404b() {
        C26757s sVar = this.f63361a;
        String packageName = this.f63363c.getPackageName();
        if (sVar.f63385b == null) {
            return C26757s.m53133a();
        }
        C26757s.f63383a.mo44598d("completeUpdate(%s)", packageName);
        C27071m mVar = new C27071m();
        sVar.f63385b.mo44652a(new C26753o(sVar, mVar, mVar, packageName));
        return mVar.f64055a;
    }
}
