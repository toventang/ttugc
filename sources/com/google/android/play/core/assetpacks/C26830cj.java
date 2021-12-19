package com.google.android.play.core.assetpacks;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.C26896an;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1963b.C26915bf;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.cj */
public final class C26830cj {

    /* renamed from: a */
    private static final C26909b f63647a = new C26909b("PatchSliceTaskHandler");

    /* renamed from: b */
    private final C26769ac f63648b;

    /* renamed from: c */
    private final AbstractC26916bg<AbstractC26857dj> f63649c;

    static {
        Covode.recordClassIndex(32305);
    }

    C26830cj(C26769ac acVar, AbstractC26916bg<AbstractC26857dj> bgVar) {
        this.f63648b = acVar;
        this.f63649c = bgVar;
    }

    /* renamed from: a */
    public final void mo44517a(C26829ci ciVar) {
        MethodCollector.m26663i(13671);
        File a = this.f63648b.mo44442a(ciVar.f63575k, ciVar.f63639a, ciVar.f63640b);
        C26769ac acVar = this.f63648b;
        String str = ciVar.f63575k;
        int i = ciVar.f63639a;
        long j = ciVar.f63640b;
        File file = new File(acVar.mo44446b(str, i, j), ciVar.f63644f);
        try {
            InputStream inputStream = ciVar.f63646h;
            if (ciVar.f63643e == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            try {
                C26772af afVar = new C26772af(a, file);
                File a2 = this.f63648b.mo44443a(ciVar.f63575k, ciVar.f63641c, ciVar.f63642d, ciVar.f63644f);
                if (!a2.exists()) {
                    a2.mkdirs();
                }
                C26833cm cmVar = new C26833cm(this.f63648b, ciVar.f63575k, ciVar.f63641c, ciVar.f63642d, ciVar.f63644f);
                C26896an.m53418a(afVar, inputStream, new C26790ax(a2, cmVar), ciVar.f63645g);
                cmVar.mo44530b(0);
                inputStream.close();
                f63647a.mo44598d("Patching and extraction finished for slice %s of pack %s.", ciVar.f63644f, ciVar.f63575k);
                this.f63649c.mo44603a().mo44506a(ciVar.f63574j, ciVar.f63575k, ciVar.f63644f, 0);
                try {
                    ciVar.f63646h.close();
                    MethodCollector.m26664o(13671);
                    return;
                } catch (IOException unused) {
                    f63647a.mo44599e("Could not close file for slice %s of pack %s.", ciVar.f63644f, ciVar.f63575k);
                    MethodCollector.m26664o(13671);
                    return;
                }
            } catch (Throwable th) {
                C26915bf.m53466a(th, th);
            }
            MethodCollector.m26664o(13671);
            throw th;
        } catch (IOException e) {
            f63647a.mo44596b("IOException during patching %s.", e.getMessage());
            C26787au auVar = new C26787au(C1764a.m5928a("Error patching slice %s of pack %s.", new Object[]{ciVar.f63644f, ciVar.f63575k}), e, ciVar.f63574j);
            MethodCollector.m26664o(13671);
            throw auVar;
        }
    }
}
