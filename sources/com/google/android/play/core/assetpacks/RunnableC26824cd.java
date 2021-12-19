package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.play.core.assetpacks.cd */
final /* synthetic */ class RunnableC26824cd implements Runnable {

    /* renamed from: a */
    private final C26769ac f63624a;

    static {
        Covode.recordClassIndex(32299);
    }

    RunnableC26824cd(C26769ac acVar) {
        this.f63624a = acVar;
    }

    public final void run() {
        C26769ac acVar = this.f63624a;
        for (File file : acVar.mo44448b()) {
            if (file.listFiles() != null) {
                C26769ac.m53176a(file);
                long b = C26769ac.m53177b(file);
                if (((long) acVar.f63429b.mo44516a()) != b) {
                    try {
                        new File(new File(file, String.valueOf(b)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        C26769ac.f63426a.mo44596b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    C26769ac.m53176a(file2);
                }
            }
        }
    }
}
