package com.p2082ss.android.ugc.aweme.discover.lynx.p2782d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2782d.C42213c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.utils.C80403es;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.d.b */
public final class C42212b {

    /* renamed from: a */
    public long f98381a;

    static {
        Covode.recordClassIndex(50152);
    }

    /* renamed from: a */
    public static void m84488a(C42186b bVar, String str, int i, int i2) {
        String str2;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C42345d dVar = bVar.f98326h;
        if (dVar != null) {
            str2 = dVar.getSchema();
        } else {
            str2 = null;
        }
        int a = C42213c.C42214a.m84500a(str2);
        C42213c c = new C42213c().mo71412a("load_failed").mo71415b(str2).mo71417d(String.valueOf(bVar.f98325g)).mo71416c(str);
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        c.mo71420g(String.valueOf(i3)).mo71414b(i2).mo71411a(a).mo96792f();
        C42213c.C42214a.m84502b(str2);
    }

    /* renamed from: a */
    public final void mo71410a(C42186b bVar, boolean z, int i, int i2, boolean z2) {
        String str;
        C89219l.m154721d(bVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f98381a;
        C42345d dVar = bVar.f98326h;
        if (dVar != null) {
            str = dVar.getSchema();
        } else {
            str = null;
        }
        int a = C42213c.C42214a.m84500a(str);
        C42213c a2 = new C42213c().mo71412a("load_success").mo71415b(str).mo71417d(String.valueOf(bVar.f98325g)).mo71419f(String.valueOf(j)).mo71418e(String.valueOf(z ? 1 : 0)).mo71413a(z2);
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        a2.mo71420g(String.valueOf(i3)).mo71414b(i2).mo71411a(a).mo96792f();
        C42213c.C42214a.m84502b(str);
        Uri parse = Uri.parse(str);
        if (bVar.f98333o != null) {
            Object obj = bVar.f98333o;
            if (obj == null) {
                C89219l.m154715b();
            }
            C80403es a3 = C80403es.C80404a.m139387a(obj);
            C89219l.m154716b(parse, "");
            a3.mo123720a(parse, new C80403es.C80405b(this.f98381a, currentTimeMillis));
        }
    }
}
