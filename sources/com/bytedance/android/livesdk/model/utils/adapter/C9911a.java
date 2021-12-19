package com.bytedance.android.livesdk.model.utils.adapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C28023p;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;

/* renamed from: com.bytedance.android.livesdk.model.utils.adapter.a */
public final class C9911a extends AbstractC28031v<Boolean> {
    static {
        Covode.recordClassIndex(11459);
    }

    /* renamed from: com.bytedance.android.livesdk.model.utils.adapter.a$1 */
    static /* synthetic */ class C99121 {

        /* renamed from: a */
        static final /* synthetic */ int[] f24028a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 11460(0x2cc4, float:1.6059E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.p2020c.EnumC27899b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.model.utils.adapter.C9911a.C99121.f24028a = r2
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.model.utils.adapter.C9911a.C99121.f24028a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NULL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.model.utils.adapter.C9911a.C99121.f24028a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.utils.adapter.C9911a.C99121.<clinit>():void");
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ Boolean read(C27897a aVar) {
        EnumC27899b f = aVar.mo46627f();
        int i = C99121.f24028a[f.ordinal()];
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
            cVar.mo46643a(bool2);
        }
    }
}
