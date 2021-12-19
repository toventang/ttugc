package com.bytedance.android.livesdk.p594n;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.p250i.p252b.C4360b;
import com.bytedance.android.live.p250i.p252b.C4365d;
import com.bytedance.android.live.p379n.AbstractC5771e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.pullstream.DnsOptMethodSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkEnableTfoPreconnectSetting;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.optimizer.live.sdk.dns.C86137a;
import com.p2082ss.optimizer.live.sdk.dns.p4403b.C86153b;
import com.p2082ss.optimizer.live.sdk.p4400a.AbstractC86125b;
import com.p2082ss.optimizer.live.sdk.p4400a.C86126c;
import com.p2082ss.optimizer.live.sdk.p4400a.C86129d;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89392a;

/* renamed from: com.bytedance.android.livesdk.n.b */
public final class C9936b implements AbstractC5771e {

    /* renamed from: a */
    private C86137a f24075a;

    static {
        Covode.recordClassIndex(11486);
    }

    private C9936b() {
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5771e
    /* renamed from: b */
    public final C86137a mo11512b() {
        return this.f24075a;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5771e
    /* renamed from: a */
    public final void mo11510a() {
        String str;
        boolean z;
        try {
            if (!C89392a.m154946a(((IHostContext) C6193a.m13435a(IHostContext.class)).context())) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (DnsOptMethodSetting.INSTANCE.getValue() == 1 && C4365d.m10462g().mo10112c().mo11512b() == null) {
            if (C6193a.m13435a(IHostApp.class) == null || ((IHostApp) C6193a.m13435a(IHostApp.class)).isInMusicallyRegion()) {
                str = "https://hotapi-va.tiktokv.com";
            } else {
                str = "https://hotapi-sg.tiktokv.com";
            }
            C86126c.C86127a aVar = new C86126c.C86127a();
            aVar.f192051b = str;
            aVar.f192053d = ((IHostContext) C6193a.m13435a(IHostContext.class)).getUpdateVersionCode();
            aVar.f192054e = new AbstractC86125b() {
                /* class com.bytedance.android.livesdk.p594n.C9936b.C99371 */

                static {
                    Covode.recordClassIndex(11487);
                }

                @Override // com.p2082ss.optimizer.live.sdk.p4400a.AbstractC86125b
                /* renamed from: a */
                public final String mo16645a(String str) {
                    return new String(C5809h.m12739a().mo11584a(str, null, null).mo18908a().f28196e);
                }

                @Override // com.p2082ss.optimizer.live.sdk.p4400a.AbstractC86125b
                /* renamed from: a */
                public final String mo16646a(String str, byte[] bArr, String str2) {
                    return new String(C5809h.m12739a().mo11585a(str, null, str2, bArr).mo18908a().f28196e);
                }
            };
            aVar.f192056g = LiveSdkEnableTfoPreconnectSetting.INSTANCE.getValue();
            C86129d.m147927a().mo136403a(aVar.mo136402a());
            Context applicationContext = ((IHostContext) C6193a.m13435a(IHostContext.class)).context().getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C86137a aVar2 = new C86137a(applicationContext);
            aVar2.f192083a = new C9935a();
            C86153b.m147958a().f192131e = aVar2.f192083a;
            C86153b a = C86153b.m147958a();
            if (a.f192131e != null) {
                a.f192136j = ((Integer) a.f192131e.mo16644a("min_start_play_buffer", Integer.valueOf(C86153b.f192126a))).intValue();
                a.f192137k = ((Integer) a.f192131e.mo16644a("max_start_play_buffer", Integer.valueOf(C86153b.f192127b))).intValue();
                a.f192138l = ((Double) a.f192131e.mo16644a("attenuation_coefficient", Double.valueOf(C86153b.f192129d))).doubleValue();
                a.f192139m = ((Integer) a.f192131e.mo16644a("attenuation_time_offset", 1000)).intValue();
            }
            double d = 0.0d;
            double d2 = 0.0d;
            for (int i = 0; i < a.f192134h.length; i++) {
                d2 += Math.cbrt((double) (8 - a.f192134h[i]));
            }
            int i2 = a.f192137k - a.f192136j;
            int i3 = a.f192136j;
            int i4 = 1;
            while (i4 < a.f192134h.length) {
                d += Math.cbrt((double) (8 - a.f192134h[i4]));
                double d3 = (double) a.f192136j;
                double d4 = (double) i2;
                Double.isNaN(d4);
                Double.isNaN(d3);
                int i5 = (int) (d3 + ((d / d2) * d4));
                a.f192135i.put(Integer.valueOf(a.f192134h[i4 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(i5)));
                i4++;
                i3 = i5;
            }
            if (i4 == a.f192134h.length) {
                z = true;
                a.f192135i.put(Integer.valueOf(a.f192134h[i4 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(a.f192137k)));
            } else {
                z = true;
            }
            C4365d.m10462g().mo10112c().mo11511a(aVar2);
            try {
                aVar2.f192089h = z;
                C86137a.m147932a(aVar2.f192085c, aVar2.f192086d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                C86129d.m147927a().f192061c.mo136404a();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5771e
    /* renamed from: a */
    public final void mo11511a(C86137a aVar) {
        this.f24075a = aVar;
    }

    /* synthetic */ C9936b(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.livesdk.n.b$a */
    public static final class C9938a implements C4360b.AbstractC4362b<AbstractC5771e> {
        static {
            Covode.recordClassIndex(11488);
        }

        @Override // com.bytedance.android.live.p250i.p252b.C4360b.AbstractC4362b
        /* renamed from: a */
        public final C4360b.AbstractC4362b.C4363a<AbstractC5771e> mo10117a(C4360b.AbstractC4362b.C4363a<AbstractC5771e> aVar) {
            aVar.f11884a = (R) new C9936b((byte) 0);
            aVar.f11885b = true;
            return aVar;
        }
    }
}
