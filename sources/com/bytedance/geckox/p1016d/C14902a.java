package com.bytedance.geckox.p1016d;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C28023p;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;

/* renamed from: com.bytedance.geckox.d.a */
public final class C14902a extends AbstractC28031v<Boolean> {
    static {
        Covode.recordClassIndex(17015);
    }

    /* renamed from: com.bytedance.geckox.d.a$1 */
    static /* synthetic */ class C149031 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36399a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 17016(0x4278, float:2.3844E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.p2020c.EnumC27899b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.geckox.p1016d.C14902a.C149031.f36399a = r2
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.geckox.p1016d.C14902a.C149031.f36399a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NULL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.geckox.p1016d.C14902a.C149031.f36399a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p1016d.C14902a.C149031.<clinit>():void");
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ Boolean read(C27897a aVar) {
        EnumC27899b f = aVar.mo46627f();
        int i = C149031.f36399a[f.ordinal()];
        boolean z = true;
        if (i == 1) {
            return Boolean.valueOf(aVar.mo46630j());
        }
        if (i == 2) {
            aVar.mo46631k();
            return null;
        } else if (i == 3) {
            if (aVar.mo46634n() == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else {
            throw new C28023p("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f)));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ void write(C27900c cVar, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null) {
            cVar.mo46654f();
        } else {
            cVar.mo46646a(bool2.booleanValue());
        }
    }
}
