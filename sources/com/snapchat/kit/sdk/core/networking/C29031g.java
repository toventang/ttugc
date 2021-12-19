package com.snapchat.kit.sdk.core.networking;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C28023p;
import com.snapchat.kit.sdk.C29073m;
import com.snapchat.kit.sdk.core.controller.C28971b;
import com.snapchat.kit.sdk.core.p2067a.C28959g;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

/* renamed from: com.snapchat.kit.sdk.core.networking.g */
public class C29031g extends AbstractC29036k {

    /* renamed from: a */
    private final C29073m f68590a;

    /* renamed from: b */
    private final C28971b f68591b;

    /* renamed from: c */
    private final C27910f f68592c;

    static {
        Covode.recordClassIndex(35364);
    }

    /* renamed from: com.snapchat.kit.sdk.core.networking.g$1 */
    static /* synthetic */ class C290321 {

        /* renamed from: a */
        static final /* synthetic */ int[] f68593a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002d */
        static {
            /*
                r0 = 35365(0x8a25, float:4.9557E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                int[] r0 = com.snapchat.kit.sdk.C29073m.EnumC29084c.m58079a()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.snapchat.kit.sdk.core.networking.C29031g.C290321.f68593a = r1
                r3 = 1
                int r0 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68745e     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r0 = r0 - r3
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r2 = com.snapchat.kit.sdk.core.networking.C29031g.C290321.f68593a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68741a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1 - r3
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.snapchat.kit.sdk.core.networking.C29031g.C290321.f68593a     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68742b     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = r1 - r3
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                int[] r2 = com.snapchat.kit.sdk.core.networking.C29031g.C290321.f68593a     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68743c     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r1 - r3
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.snapchat.kit.sdk.core.networking.C29031g.C290321.f68593a     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68744d     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1 - r3
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.networking.C29031g.C290321.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.snapchat.kit.sdk.core.networking.AbstractC29036k
    /* renamed from: a */
    public Request.C90016a mo50702a(AbstractC90202u.AbstractC90203a aVar) {
        C29073m mVar = this.f68590a;
        if (mVar.f68720m.mo50734b()) {
            mVar.mo50741a();
        }
        Request.C90016a a = super.mo50702a(aVar);
        a.mo144692a("authorization", "Bearer " + this.f68590a.f68720m.mo50736d());
        return a;
    }

    @Override // com.snapchat.kit.sdk.core.networking.AbstractC29036k, okhttp3.AbstractC90202u
    public C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        boolean z;
        C90029ac intercept = super.intercept(aVar);
        if (!(intercept == null || intercept.f204111g == null || intercept.f204107c != 401)) {
            C28959g gVar = null;
            try {
                gVar = (C28959g) this.f68592c.mo46669a(intercept.f204111g.charStream(), C28959g.class);
            } catch (C28023p unused) {
            }
            boolean z2 = false;
            if (gVar == null || TextUtils.isEmpty(gVar.f68425a) || !TextUtils.equals(gVar.f68425a.toLowerCase(), "invalid_token")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i = C290321.f68593a[this.f68590a.mo50741a() - 1];
                if (i == 2 || i == 3) {
                    this.f68590a.clearToken();
                    this.f68591b.mo50337e();
                }
            } else {
                if (gVar != null && !TextUtils.isEmpty(gVar.f68425a) && TextUtils.equals(gVar.f68425a.toLowerCase(), "force_logout")) {
                    z2 = true;
                }
                if (z2) {
                    this.f68590a.clearToken();
                    this.f68591b.mo50337e();
                }
            }
        }
        return intercept;
    }

    C29031g(C29073m mVar, C28971b bVar, String str, C27910f fVar) {
        super(str);
        this.f68590a = mVar;
        this.f68591b = bVar;
        this.f68592c = fVar;
    }
}
