package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.C26909b;
import java.io.File;

/* renamed from: com.google.android.play.core.assetpacks.as */
final class C26785as {

    /* renamed from: a */
    static final C26909b f63495a = new C26909b("ExtractChunkTaskHandler");

    /* renamed from: b */
    final byte[] f63496b = new byte[8192];

    /* renamed from: c */
    final C26769ac f63497c;

    /* renamed from: d */
    final AbstractC26916bg<AbstractC26857dj> f63498d;

    /* renamed from: e */
    final AbstractC26916bg<C26878w> f63499e;

    /* renamed from: f */
    final C26791ay f63500f;

    static {
        Covode.recordClassIndex(32260);
    }

    C26785as(C26769ac acVar, AbstractC26916bg<AbstractC26857dj> bgVar, AbstractC26916bg<C26878w> bgVar2, C26791ay ayVar) {
        this.f63497c = acVar;
        this.f63498d = bgVar;
        this.f63499e = bgVar2;
        this.f63500f = ayVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo44485a(C26784ar arVar) {
        File a = this.f63497c.mo44443a(arVar.f63575k, arVar.f63486a, arVar.f63487b, arVar.f63488c);
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }
}
