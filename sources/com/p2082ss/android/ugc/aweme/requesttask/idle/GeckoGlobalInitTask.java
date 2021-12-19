package com.p2082ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.aweme.storage.p108a.C2355a;
import com.aweme.storage.p108a.C2356b;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14871a;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.p1023j.C14960b;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.sdk.webview.C30260f;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.utils.C80338dd;
import com.p2082ss.android.ugc.aweme.utils.gecko.C80490d;
import com.p2082ss.android.ugc.aweme.utils.gecko.GeckoExperimentsType;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoGlobalInitTask */
public final class GeckoGlobalInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(78796);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        int availableStorageFull;
        boolean useGeckoSettings;
        C89219l.m154721d(context, "");
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(new DeviceRegisterManager.AbstractC29864a() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80333dc.C803374 */

            static {
                Covode.recordClassIndex(93605);
            }

            @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
            /* renamed from: a */
            public final void mo29065a(boolean z) {
                C80333dc.m139290k();
            }

            @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
            /* renamed from: a */
            public final void mo29064a(String str, String str2) {
                C80333dc.m139290k();
            }

            @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
            /* renamed from: a */
            public final void mo29066a(boolean z, boolean z2) {
                C80333dc.m139290k();
            }
        });
        C14930f.m27473a().mo24028a(C81631k.f182525a.mo125297c(), C81631k.m141476b().getAbsolutePath());
        HashMap hashMap = new HashMap();
        hashMap.put("business_version", C80338dd.f179868a);
        C14930f.m27473a().mo24029a(C81631k.f182525a.mo125297c(), hashMap);
        C14871a.m27298a().f36325d = (Map) SettingsManager.m29616a().mo25397a("geckox_resource_clean_channel_list", Map.class, C30260f.f72193a);
        if (C2355a.f7165a) {
            C14871a.m27298a().f36322a = true;
            C14871a.m27298a().f36323b = C2356b.f7167a;
        }
        GeckoExperimentsType geckoExperimentsType = (GeckoExperimentsType) C16048b.m29633a().mo25416a(true, "gecko_experiments", GeckoExperimentsType.class, C80490d.f180083a);
        C14871a a = C14871a.m27298a();
        int i = 200;
        if (geckoExperimentsType == null) {
            availableStorageFull = 200;
        } else {
            availableStorageFull = geckoExperimentsType.getAvailableStorageFull();
        }
        a.f36326e = availableStorageFull;
        C14871a a2 = C14871a.m27298a();
        if (geckoExperimentsType != null) {
            i = geckoExperimentsType.getAvailableStoragePatch();
        }
        a2.f36327f = i;
        C14871a.m27298a().f36328g = C80333dc.m139288i();
        if (geckoExperimentsType == null) {
            useGeckoSettings = true;
        } else {
            useGeckoSettings = geckoExperimentsType.getUseGeckoSettings();
        }
        C80333dc.f179864a = useGeckoSettings;
        if (useGeckoSettings) {
            C14930f a3 = C14930f.m27473a();
            a3.mo24038i();
            if (a3.f36478d != null) {
                a3.mo24039j();
                a3.mo24035f();
                if (C14930f.f36473i) {
                    a3.f36479e.mo24250a(1);
                    long currentTimeMillis = System.currentTimeMillis();
                    C14871a a4 = C14871a.m27298a();
                    C89219l.m154709a((Object) a4, "");
                    C14960b.f36545d = a4.f36322a;
                    C14871a a5 = C14871a.m27298a();
                    C89219l.m154709a((Object) a5, "");
                    C14960b.f36546e = a5.f36323b;
                    C14871a a6 = C14871a.m27298a();
                    C89219l.m154709a((Object) a6, "");
                    C14960b.f36547f = a6.f36324c;
                    C14871a a7 = C14871a.m27298a();
                    C89219l.m154709a((Object) a7, "");
                    C14960b.f36548g = a7.f36325d;
                    if (C14960b.f36545d && C14960b.f36548g != null) {
                        C14960b.f36549h.mo24086a(new C14960b.C14961a(currentTimeMillis), 0, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Please init GeckoGlobalConfig first");
        }
    }
}
