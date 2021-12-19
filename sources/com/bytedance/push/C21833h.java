package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1590c.AbstractC21776g;
import com.bytedance.push.p1590c.AbstractC21778i;
import com.bytedance.push.p1590c.AbstractC21781l;
import com.bytedance.push.p1598i.RunnableC21837b;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.AbstractC21920d;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.pushmanager.setting.C30220a;
import com.p2082ss.android.pushmanager.setting.C30221b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.push.h */
public final class C21833h implements AbstractC21781l {

    /* renamed from: b */
    private final AbstractC21778i f51727b;

    /* renamed from: c */
    private final AbstractC21776g f51728c;

    /* renamed from: d */
    private final C21767c f51729d;

    static {
        Covode.recordClassIndex(25485);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21781l
    /* renamed from: a */
    public final String mo35457a() {
        C21767c cVar = this.f51729d;
        if (cVar == null || TextUtils.isEmpty(cVar.f51602v)) {
            return "payload";
        }
        return this.f51729d.f51602v;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21781l
    /* renamed from: a */
    public final void mo35459a(Context context, AbstractC21920d dVar) {
        RunnableC13596e.m24423a(new RunnableC21837b(context, dVar));
    }

    C21833h(AbstractC21778i iVar, AbstractC21776g gVar, C21767c cVar) {
        this.f51727b = iVar;
        this.f51728c = gVar;
        this.f51729d = cVar;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21781l
    /* renamed from: a */
    public final void mo35458a(Context context, final int i, final String str) {
        if (C30062a.m60803a(context)) {
            C21798f.m40814b().mo35459a(context, new AbstractC21920d() {
                /* class com.bytedance.push.C21833h.C218341 */

                static {
                    Covode.recordClassIndex(25486);
                }

                @Override // com.bytedance.push.third.AbstractC21920d
                /* renamed from: a */
                public final String mo35510a() {
                    return str;
                }

                @Override // com.bytedance.push.third.AbstractC21920d
                /* renamed from: b */
                public final int mo35511b() {
                    return i;
                }
            });
        }
        if (((PushOnlineSettings) C21895h.m41120a(C30061a.f71748a, PushOnlineSettings.class)).mo35611i() <= 0) {
            Application application = C30061a.f71748a;
            C30221b.m61148b();
            String b = C30220a.m61144a().mo53665b();
            if (!TextUtils.isEmpty(b)) {
                AbstractC21778i iVar = this.f51727b;
                Context applicationContext = application.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                iVar.mo35439a(applicationContext, b, i);
            }
        }
    }
}
