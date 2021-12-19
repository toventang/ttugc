package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod */
public final class UserInfoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35101a f82833b = new C35101a((byte) 0);

    /* renamed from: c */
    private final String f82834c = "userInfo";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f82835d = AbstractC16183k.EnumC16184a.PROTECT;

    static {
        Covode.recordClassIndex(42241);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod$a */
    public static final class C35101a {
        static {
            Covode.recordClassIndex(42242);
        }

        private C35101a() {
        }

        public /* synthetic */ C35101a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82835d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82834c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82835d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserInfoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ea  */
    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61866a(org.json.JSONObject r17, com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a r18) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod.mo61866a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
