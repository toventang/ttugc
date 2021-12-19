package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38751k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod */
public final class OpenAdUrlMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34987a f82538b = new C34987a((byte) 0);

    /* renamed from: c */
    private final String f82539c = "openAdUrl";

    static {
        Covode.recordClassIndex(42047);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod$a */
    public static final class C34987a {
        static {
            Covode.recordClassIndex(42048);
        }

        private C34987a() {
        }

        public /* synthetic */ C34987a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82539c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAdUrlMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod$b */
    static final class C34988b implements AbstractC38757n.AbstractC38758a {

        /* renamed from: a */
        final /* synthetic */ C38751k f82540a;

        /* renamed from: b */
        final /* synthetic */ OpenAdUrlMethod f82541b;

        static {
            Covode.recordClassIndex(42049);
        }

        C34988b(C38751k kVar, OpenAdUrlMethod openAdUrlMethod) {
            this.f82540a = kVar;
            this.f82541b = openAdUrlMethod;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
        public final void sendLog(boolean z) {
            String str;
            C38182f.C38184b a = C38182f.m77418a();
            a.f90211a = "draw_ad";
            String str2 = "deeplink_success";
            if (z) {
                str = str2;
            } else {
                str = "deeplink_failed";
            }
            a.f90212b = str;
            a.mo66490a(Long.valueOf(this.f82540a.f91510a)).mo66506e(this.f82540a.f91511b).mo66499b(Long.valueOf(this.f82540a.f91512c)).mo66495a(this.f82541b.mo26893e());
            if (!z) {
                str2 = "deeplink_failed";
            }
            C18129a.m33747a("draw_ad", str2, String.valueOf(this.f82540a.f91510a), this.f82540a.f91511b, String.valueOf(this.f82540a.f91512c)).mo28902c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        if (r4 != null) goto L_0x015f;
     */
    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61866a(org.json.JSONObject r19, com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.AbstractC34965a r20) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.OpenAdUrlMethod.mo61866a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
