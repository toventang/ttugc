package com.google.android.play.core.p1963b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.C27071m;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.b.e */
public final class C26945e extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ AbstractRunnableC26936c f63819a;

    /* renamed from: b */
    final /* synthetic */ C26952l f63820b;

    static {
        Covode.recordClassIndex(32420);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26945e(C26952l lVar, C27071m mVar, AbstractRunnableC26936c cVar) {
        super(mVar);
        this.f63820b = lVar;
        this.f63819a = cVar;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        boolean z;
        C26952l lVar = this.f63820b;
        AbstractRunnableC26936c cVar = this.f63819a;
        if (lVar.f63837k == null && !lVar.f63831e) {
            lVar.f63828b.mo44598d("Initiate binding to the service.", new Object[0]);
            lVar.f63830d.add(cVar);
            lVar.f63836j = new ServiceConnectionC26951k(lVar);
            lVar.f63831e = true;
            Context context = lVar.f63827a;
            Intent intent = lVar.f63832f;
            ServiceConnection serviceConnection = lVar.f63836j;
            if (context == null || !(context instanceof Context)) {
                z = context.bindService(intent, serviceConnection, 1);
            } else if (!C65713d.m117625a(context, intent)) {
                z = context.bindService(intent, serviceConnection, 1);
            } else {
                return;
            }
            if (!z) {
                lVar.f63828b.mo44598d("Failed to bind to the service.", new Object[0]);
                lVar.f63831e = false;
                for (AbstractRunnableC26936c cVar2 : lVar.f63830d) {
                    C27071m<?> mVar = cVar2.f63817g;
                    if (mVar != null) {
                        mVar.mo44784b(new C26953m());
                    }
                }
                lVar.f63830d.clear();
            }
        } else if (lVar.f63831e) {
            lVar.f63828b.mo44598d("Waiting to bind to the service.", new Object[0]);
            lVar.f63830d.add(cVar);
        } else {
            cVar.run();
        }
    }
}
