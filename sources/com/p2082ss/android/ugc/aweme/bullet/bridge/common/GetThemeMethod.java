package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod */
public final class GetThemeMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35021a f82614b = new C35021a((byte) 0);

    /* renamed from: c */
    private final String f82615c = "getTheme";

    static {
        Covode.recordClassIndex(42111);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod$a */
    public static final class C35021a {
        static {
            Covode.recordClassIndex(42112);
        }

        private C35021a() {
        }

        public /* synthetic */ C35021a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82615c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetThemeMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f A[Catch:{ Exception -> 0x0038 }] */
    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61866a(org.json.JSONObject r6, com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a r7) {
        /*
            r5 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r1)
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r1)
            android.content.Context r0 = r5.mo26893e()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0025
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x0038 }
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)     // Catch:{ Exception -> 0x0038 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x0038 }
            int r0 = r0.uiMode     // Catch:{ Exception -> 0x0038 }
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0038 }
            r1.<init>()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = "isDarkMode"
            if (r2 == 0) goto L_0x0030
            r4 = 1
        L_0x0030:
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0038 }
            r0 = 0
            r7.mo61873a(r1, r3, r0)     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0038:
            r2 = move-exception
            r1 = -1
            java.lang.String r0 = "Had trouble in getting current uiMode"
            r7.mo61871a(r1, r0)
            r2.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod.mo61866a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
