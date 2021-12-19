package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.p1940d.AbstractC25631h;
import java.util.Map;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.ah */
public final class C27763ah {

    /* renamed from: a */
    private final Executor f65231a;

    /* renamed from: b */
    private final Map<Pair<String, String>, AbstractC25631h<AbstractC27807v>> f65232b = new C0484a();

    /* renamed from: com.google.firebase.iid.ah$a */
    interface AbstractC27764a {
        static {
            Covode.recordClassIndex(33352);
        }

        /* renamed from: a */
        AbstractC25631h<AbstractC27807v> mo46418a();
    }

    static {
        Covode.recordClassIndex(33351);
    }

    C27763ah(Executor executor) {
        this.f65231a = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ AbstractC25631h mo46416a(Pair pair, AbstractC25631h hVar) {
        MethodCollector.m26663i(13542);
        synchronized (this) {
            try {
                this.f65232b.remove(pair);
            } finally {
                MethodCollector.m26664o(13542);
            }
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized AbstractC25631h<AbstractC27807v> mo46417a(String str, String str2, AbstractC27764a aVar) {
        MethodCollector.m26663i(13541);
        Pair<String, String> pair = new Pair<>(str, str2);
        AbstractC25631h<AbstractC27807v> hVar = this.f65232b.get(pair);
        if (hVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String.valueOf(String.valueOf(pair)).length();
            }
            MethodCollector.m26664o(13541);
            return hVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(pair)).length();
        }
        AbstractC25631h<TContinuationResult> b = aVar.mo46418a().mo41881b(this.f65231a, new C27765ai(this, pair));
        this.f65232b.put(pair, b);
        MethodCollector.m26664o(13541);
        return b;
    }
}
