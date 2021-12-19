package com.p2082ss.android.ugc.aweme.settingsrequest;

import android.content.SharedPreferences;
import android.os.Looper;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.experiment.C46967gd;
import com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52913d;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3740c.C68788c;
import java.util.concurrent.ExecutorService;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.f */
public abstract class AbstractC68806f implements AbstractC52909a {

    /* renamed from: c */
    private static volatile AbstractC68806f f153886c;

    /* renamed from: a */
    public C56256i f153887a;

    /* renamed from: b */
    protected C27910f f153888b = new C27910f();

    static {
        Covode.recordClassIndex(81083);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo109263b(IESSettingsProxy iESSettingsProxy);

    /* renamed from: a */
    public static AbstractC68806f m121278a() {
        if (f153886c == null) {
            synchronized (AbstractC68806f.class) {
                if (f153886c == null) {
                    f153886c = new C68813m();
                }
            }
        }
        return f153886c;
    }

    /* renamed from: e */
    private static void m121279e(IESSettingsProxy iESSettingsProxy) {
        AVExternalServiceImpl.m113114a().configService().updateServerSettings(iESSettingsProxy);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo109265d(IESSettingsProxy iESSettingsProxy) {
        C52913d.m97751a().mo88580a(true);
        mo109263b(iESSettingsProxy);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo109264c(IESSettingsProxy iESSettingsProxy) {
        SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
        if (C68788c.m121257a()) {
            AbstractC88410b.m153642b(new CallableC68810j(this, edit, iESSettingsProxy)).mo142941b(C88925a.m154180b(C88946a.f201991c)).cN_();
        } else {
            this.f153887a = SettingsRequestServiceImpl.m65417i().mo57273a(edit, iESSettingsProxy);
        }
        m121279e(iESSettingsProxy);
    }

    @Override // com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a
    /* renamed from: a */
    public final void mo61665a(IESSettingsProxy iESSettingsProxy) {
        boolean z;
        if (C46967gd.m90247a()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            AbstractC88979t a = AbstractC88979t.m154294a(new C68807g(this, iESSettingsProxy));
            if (C12895a.f31386a == null) {
                C40787l.C40788a a2 = C40787l.m82269a(EnumC40793o.FIXED);
                a2.f95505c = 1;
                C12895a.f31386a = C40780g.m82242a(a2.mo70028a());
            }
            ExecutorService executorService = C12895a.f31386a;
            if (executorService == null) {
                C89219l.m154707a();
            }
            AbstractC88979t b = a.mo143278b(C88946a.m154209a(executorService));
            if (z) {
                b = b.mo143261a(C88391a.m153580a(C88392a.f200660a));
            }
            b.mo143254a(new C68808h(this, iESSettingsProxy), C68809i.f153893a);
            return;
        }
        mo109264c(iESSettingsProxy);
        C52913d.m97751a().mo88580a(true);
        mo109263b(iESSettingsProxy);
    }
}
