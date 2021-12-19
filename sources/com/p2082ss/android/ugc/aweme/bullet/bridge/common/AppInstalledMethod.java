package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod */
public final class AppInstalledMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35000a f82573b = new C35000a((byte) 0);

    /* renamed from: c */
    private final String f82574c = "isAppInstalled";

    static {
        Covode.recordClassIndex(42078);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod$a */
    public static final class C35000a {
        static {
            Covode.recordClassIndex(42079);
        }

        private C35000a() {
        }

        public /* synthetic */ C35000a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82574c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppInstalledMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r2 != true) goto L_0x002e;
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61866a(org.json.JSONObject r7, com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
            java.lang.String r0 = "pkg_name"
            java.lang.String r5 = r7.optString(r0)
            java.lang.String r0 = "open_url"
            java.lang.String r4 = r7.optString(r0)
            com.bytedance.ies.bullet.c.e.a.b r1 = r6.f38923a
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r3 = r1.mo25832c(r0)
            android.content.Context r3 = (android.content.Context) r3
            r2 = -1
            if (r3 == 0) goto L_0x0046
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x002e
            boolean r2 = com.p2082ss.android.common.util.C29843f.m60133b(r3, r5)
            r0 = 1
            if (r2 == r0) goto L_0x0046
        L_0x002e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0046
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.<init>(r0)
            android.net.Uri r0 = android.net.Uri.parse(r4)
            r1.setData(r0)
            boolean r2 = com.p2082ss.android.common.util.C29843f.m60130a(r3, r1)
        L_0x0046:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "installed"
            r1.put(r0, r2)
            r8.mo61874a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod.mo61866a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
