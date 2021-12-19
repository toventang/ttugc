package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38751k;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod */
public final class AdCommonJsMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C81552a f182359b = new C81552a((byte) 0);

    /* renamed from: a */
    public final WeakReference<Context> f182360a;

    /* renamed from: d */
    private final C30248e f182361d;

    static {
        Covode.recordClassIndex(94930);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$a */
    public static final class C81552a {
        static {
            Covode.recordClassIndex(94931);
        }

        private C81552a() {
        }

        public /* synthetic */ C81552a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$b */
    static final class C81553b implements AbstractC38757n.AbstractC38758a {

        /* renamed from: a */
        final /* synthetic */ C38751k f182362a;

        /* renamed from: b */
        final /* synthetic */ AdCommonJsMethod f182363b;

        /* renamed from: c */
        final /* synthetic */ C38751k f182364c;

        static {
            Covode.recordClassIndex(94932);
        }

        C81553b(C38751k kVar, AdCommonJsMethod adCommonJsMethod, C38751k kVar2) {
            this.f182362a = kVar;
            this.f182363b = adCommonJsMethod;
            this.f182364c = kVar2;
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
            a.mo66490a(Long.valueOf(this.f182362a.f91510a)).mo66506e(this.f182362a.f91511b).mo66499b(Long.valueOf(this.f182362a.f91512c)).mo66495a(this.f182363b.f182360a.get());
            if (!z) {
                str2 = "deeplink_failed";
            }
            C18129a.m33747a("draw_ad", str2, String.valueOf(this.f182362a.f91510a), this.f182362a.f91511b, String.valueOf(this.f182362a.f91512c)).mo28902c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$c */
    static final class C81554c extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ C38751k f182365a;

        static {
            Covode.recordClassIndex(94933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81554c(C38751k kVar) {
            super(2);
            this.f182365a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(this.f182365a.f91522m);
            } else {
                a = bVar2.mo66488a(this.f182365a.f91522m);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AdCommonJsMethod(java.lang.ref.WeakReference<android.content.Context> r6, com.p2082ss.android.sdk.webview.C30248e r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x002c
            com.bytedance.ies.web.a.a r0 = r7.f72166b
        L_0x0004:
            r5.<init>(r0)
            r5.f182360a = r6
            r5.f182361d = r7
            java.lang.String r4 = "openAdUrl"
            java.lang.String r3 = "messageTip"
            java.lang.String r2 = "sendAdLog"
            if (r7 == 0) goto L_0x002b
            com.bytedance.ies.web.a.a r1 = r7.f72166b
            if (r1 == 0) goto L_0x0021
            r0 = r5
            r1.mo29245a(r2, r0)
            r1.mo29245a(r3, r0)
            r1.mo29245a(r4, r0)
        L_0x0021:
            r0 = r5
            r7.mo53711a(r2, r0)
            r7.mo53711a(r3, r0)
            r7.mo53711a(r4, r0)
        L_0x002b:
            return
        L_0x002c:
            r0 = 0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod.<init>(java.lang.ref.WeakReference, com.ss.android.sdk.webview.e):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a9, code lost:
        if (r7 != null) goto L_0x0198;
     */
    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handle(org.json.JSONObject r18, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.AbstractC47813a r19) {
        /*
        // Method dump skipped, instructions count: 891
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod.handle(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    public /* synthetic */ AdCommonJsMethod(WeakReference weakReference, C30248e eVar, byte b) {
        this(weakReference, eVar);
    }
}
