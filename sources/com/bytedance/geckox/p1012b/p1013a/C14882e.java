package com.bytedance.geckox.p1012b.p1013a;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1012b.C14884b;
import com.bytedance.geckox.utils.C15052e;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.geckox.b.a.e */
final class C14882e extends AbstractC14879b {
    static {
        Covode.recordClassIndex(16993);
    }

    C14882e() {
    }

    @Override // com.bytedance.geckox.p1012b.p1013a.AbstractC14879b
    /* renamed from: a */
    public final void mo23963a() {
        for (String str : this.f36358f) {
            List<File> b = C15052e.m27713b(new File(this.f36357e, str));
            if (b != null && b.size() > this.f36356d.f36347a) {
                for (File file : b.subList(0, b.size() - this.f36356d.f36347a)) {
                    C14884b.m27329a(file.getAbsolutePath());
                    if (this.f36356d.f36349c != null) {
                        file.getName();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.geckox.p1012b.p1013a.AbstractC14879b
    /* renamed from: a */
    public final void mo23964a(C14877a aVar, File file, List<String> list) {
        super.mo23964a(aVar, file, list);
    }
}
