package com.google.firebase.messaging;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.s */
public final /* synthetic */ class RunnableC27881s implements Runnable {

    /* renamed from: a */
    private final C27880r f65469a;

    static {
        Covode.recordClassIndex(33474);
    }

    RunnableC27881s(C27880r rVar) {
        this.f65469a = rVar;
    }

    public final void run() {
        MethodCollector.m26663i(13142);
        C27880r rVar = this.f65469a;
        synchronized (rVar.f65466d) {
            try {
                SharedPreferences.Editor edit = rVar.f65463a.edit();
                String str = rVar.f65464b;
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = rVar.f65466d.iterator();
                while (it.hasNext()) {
                    sb.append(it.next()).append(rVar.f65465c);
                }
                edit.putString(str, sb.toString()).commit();
            } finally {
                MethodCollector.m26664o(13142);
            }
        }
    }
}
