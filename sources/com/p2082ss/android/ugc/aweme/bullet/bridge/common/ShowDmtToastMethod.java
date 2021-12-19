package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod */
public final class ShowDmtToastMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35050a f82677b = new C35050a((byte) 0);

    /* renamed from: c */
    private final String f82678c = "showDmtToast";

    static {
        Covode.recordClassIndex(42159);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod$a */
    public static final class C35050a {
        static {
            Covode.recordClassIndex(42160);
        }

        private C35050a() {
        }

        public /* synthetic */ C35050a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82678c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowDmtToastMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61866a(org.json.JSONObject r5, com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
            android.content.Context r2 = r4.mo26893e()
            java.lang.String r1 = "msg"
            boolean r0 = r5.has(r1)
            if (r0 != 0) goto L_0x001b
            r1 = 0
            java.lang.String r0 = "no params found"
            r6.mo61871a(r1, r0)
            return
        L_0x001b:
            java.lang.String r1 = r5.optString(r1)
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            r0 = 0
            if (r2 == 0) goto L_0x0039
        L_0x0025:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x003a
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0039
            com.bytedance.tux.g.b r0 = new com.bytedance.tux.g.b
            r0.<init>(r2)
            com.bytedance.tux.g.b r0 = r0.mo37635a(r1)
            r0.mo37637b()
        L_0x0039:
            return
        L_0x003a:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0039
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            if (r2 == 0) goto L_0x0039
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod.mo61866a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
