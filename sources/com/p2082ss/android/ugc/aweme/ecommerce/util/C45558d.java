package com.p2082ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.d */
public final class C45558d extends AbstractC28031v<Object> {

    /* renamed from: a */
    private final AbstractC28031v<Object> f106098a = new C27910f().mo46665a(Object.class);

    static {
        Covode.recordClassIndex(54051);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.util.d$1 */
    static /* synthetic */ class C455591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f106099a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 54052(0xd324, float:7.5743E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.p2020c.EnumC27899b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.ecommerce.util.C45558d.C455591.f106099a = r2
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.util.C45558d.C455591.f106099a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.util.C45558d.C455591.f106099a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.util.C45558d.C455591.f106099a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.STRING     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.util.C45558d.C455591.f106099a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.util.C45558d.C455591.f106099a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.google.gson.c.b r0 = com.google.gson.p2020c.EnumC27899b.NULL     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.util.C45558d.C455591.<clinit>():void");
        }
    }

    @Override // com.google.gson.AbstractC28031v
    public final Object read(C27897a aVar) {
        switch (C455591.f106099a[aVar.mo46627f().ordinal()]) {
            case 1:
                HashMap hashMap = new HashMap();
                aVar.mo46623c();
                while (aVar.mo46626e()) {
                    hashMap.put(aVar.mo46628h(), read(aVar));
                }
                aVar.mo46625d();
                return hashMap;
            case 2:
                ArrayList arrayList = new ArrayList();
                aVar.mo46621a();
                while (aVar.mo46626e()) {
                    arrayList.add(read(aVar));
                }
                aVar.mo46622b();
                return arrayList;
            case 3:
                String i = aVar.mo46629i();
                if (i.indexOf(46) != -1) {
                    return Double.valueOf(Double.parseDouble(i));
                }
                return Long.valueOf(Long.parseLong(i));
            case 4:
                return aVar.mo46629i();
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return Boolean.valueOf(aVar.mo46630j());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                aVar.mo46631k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.AbstractC28031v
    public final void write(C27900c cVar, Object obj) {
        this.f106098a.write(cVar, obj);
    }
}
