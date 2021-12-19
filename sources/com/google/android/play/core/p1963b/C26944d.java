package com.google.android.play.core.p1963b;

import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.C27071m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.b.d */
public final /* synthetic */ class C26944d implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final C26952l f63818a;

    static {
        Covode.recordClassIndex(32419);
    }

    C26944d(C26952l lVar) {
        this.f63818a = lVar;
    }

    public final void binderDied() {
        C26952l lVar = this.f63818a;
        lVar.f63828b.mo44598d("reportBinderDeath", new Object[0]);
        if (lVar.f63834h.get() == null) {
            lVar.f63828b.mo44598d("%s : Binder has died.", lVar.f63829c);
            for (AbstractRunnableC26936c cVar : lVar.f63830d) {
                C27071m<?> mVar = cVar.f63817g;
                if (mVar != null) {
                    int i = Build.VERSION.SDK_INT;
                    mVar.mo44784b(new RemoteException(String.valueOf(lVar.f63829c).concat(" : Binder has died.")));
                }
            }
            lVar.f63830d.clear();
            return;
        }
        lVar.f63828b.mo44598d("calling onBinderDied", new Object[0]);
    }
}
