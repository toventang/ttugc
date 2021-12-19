package com.bytedance.push.frontier.p1595b;

import android.content.Context;
import com.bytedance.common.wschannel.AbstractC13750h;
import com.bytedance.common.wschannel.C13642a;
import com.bytedance.common.wschannel.C13756k;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.C21767c;
import com.bytedance.push.C21798f;
import com.bytedance.push.frontier.C21813c;
import com.bytedance.push.frontier.p1594a.AbstractC21807b;
import com.bytedance.push.frontier.p1594a.AbstractC21808c;
import com.bytedance.push.frontier.p1594a.AbstractC21809d;
import com.bytedance.push.frontier.setting.C21815a;
import com.p2082ss.android.pushmanager.setting.C30220a;
import com.p2082ss.android.pushmanager.setting.C30221b;
import java.util.HashMap;

/* renamed from: com.bytedance.push.frontier.b.a */
public class C21811a implements AbstractC21807b {

    /* renamed from: e */
    private static volatile C21811a f51689e;

    /* renamed from: a */
    public C21815a f51690a;

    /* renamed from: b */
    public AbstractC13750h f51691b;

    /* renamed from: c */
    public String f51692c;

    /* renamed from: d */
    private Context f51693d;

    static {
        Covode.recordClassIndex(25461);
    }

    @Override // com.bytedance.push.frontier.p1594a.AbstractC21807b
    /* renamed from: a */
    public final void mo35489a() {
        AbstractC13750h hVar = this.f51691b;
        if (hVar != null) {
            hVar.mo22104a();
        }
    }

    /* renamed from: a */
    public final C13642a mo35493a(C21815a aVar) {
        if (aVar != null && aVar.mo35502b()) {
            this.f51690a = aVar;
            HashMap hashMap = new HashMap();
            C30221b.m61148b();
            C30220a.m61144a().mo53664a(hashMap);
            String str = (String) hashMap.get("install_id");
            String str2 = (String) hashMap.get("device_id");
            C21767c h = C21798f.f51646a.mo35451h();
            if (h == null) {
                return null;
            }
            try {
                C13642a.C13643a a = C13642a.C13643a.m24565a(10006);
                a.f33159c = aVar.f51703a;
                a.f33163g = str2;
                a.f33164h = str;
                a.f33160d = aVar.f51704b;
                a.f33162f = aVar.f51705c;
                a.f33161e = 30203;
                return a.mo21922a(aVar.f51706d).mo21921a("host_aid", String.valueOf(h.f51582b)).mo21921a("host_version", String.valueOf(h.f51583c)).mo21921a("sid", this.f51692c).mo21924a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.bytedance.push.frontier.p1594a.AbstractC21807b
    /* renamed from: a */
    public final synchronized void mo35490a(final AbstractC13651e eVar) {
        MethodCollector.m26663i(7994);
        C21815a aVar = this.f51690a;
        if (aVar != null) {
            mo35494a(aVar, eVar);
            MethodCollector.m26664o(7994);
            return;
        }
        AbstractC21808c b = C21813c.m40850a().mo35495b();
        if (b == null) {
            MethodCollector.m26664o(7994);
            return;
        }
        b.mo35491a(this.f51693d, new AbstractC21809d() {
            /* class com.bytedance.push.frontier.p1595b.C21811a.C218121 */

            static {
                Covode.recordClassIndex(25462);
            }

            @Override // com.bytedance.push.frontier.p1594a.AbstractC21809d
            /* renamed from: a */
            public final void mo35492a(C21815a aVar) {
                C21811a.this.mo35494a(aVar, eVar);
            }
        });
        MethodCollector.m26664o(7994);
    }

    private C21811a(Context context, String str) {
        this.f51693d = context;
        this.f51692c = str;
    }

    /* renamed from: a */
    public final void mo35494a(C21815a aVar, AbstractC13651e eVar) {
        C13642a a = mo35493a(aVar);
        if (a != null) {
            AbstractC13750h hVar = this.f51691b;
            if (hVar != null) {
                hVar.mo22105a(a);
            } else {
                this.f51691b = C13756k.m24805a(this.f51693d, a, eVar);
            }
        }
    }

    /* renamed from: a */
    public static C21811a m40844a(Context context, String str) {
        MethodCollector.m26663i(7992);
        if (f51689e == null) {
            synchronized (C21811a.class) {
                try {
                    if (f51689e == null) {
                        f51689e = new C21811a(context, str);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7992);
                    throw th;
                }
            }
        }
        C21811a aVar = f51689e;
        MethodCollector.m26664o(7992);
        return aVar;
    }
}
