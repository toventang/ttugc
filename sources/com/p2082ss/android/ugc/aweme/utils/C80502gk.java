package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C28027t;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;

/* renamed from: com.ss.android.ugc.aweme.utils.gk */
public final class C80502gk extends AbstractC28031v<String> {
    static {
        Covode.recordClassIndex(93775);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gk$1 */
    static /* synthetic */ class C805031 {

        /* renamed from: a */
        static final /* synthetic */ int[] f180102a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 93776(0x16e50, float:1.31408E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.p2020c.EnumC27899b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.utils.C80502gk.C805031.f180102a = r2
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NULL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.utils.C80502gk.C805031.f180102a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.STRING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80502gk.C805031.<clinit>():void");
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ String read(C27897a aVar) {
        EnumC27899b f = aVar.mo46627f();
        int i = C805031.f180102a[f.ordinal()];
        if (i == 1) {
            aVar.mo46631k();
            return null;
        } else if (i == 2) {
            String i2 = aVar.mo46629i();
            if (i2.contains("\r\n")) {
                return i2.replaceAll("\r\n", "\n");
            }
            return i2;
        } else {
            throw new C28027t("expect STRING, but got " + f.name() + " at " + aVar.mo46636p());
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ void write(C27900c cVar, String str) {
        cVar.mo46648b(str);
    }
}
