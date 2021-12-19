package com.p2082ss.android.ugc.aweme.p2352aw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.AbstractC34895bp;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34596c;
import com.p2082ss.android.ugc.aweme.main.p3433f.C59090b;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61538b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.aw.a */
public final class C34267a implements AbstractC34895bp {

    /* renamed from: a */
    boolean f81039a;

    /* renamed from: b */
    Activity f81040b;

    static {
        Covode.recordClassIndex(41204);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34895bp
    /* renamed from: a */
    public final void mo60673a() {
        this.f81039a = this.f81040b.getIntent().getBooleanExtra("restart_from_logout", false);
        if (C61538b.m111451b()) {
            C61542b.m111459a().mo99299a();
            if (C31575b.m65860b().isEnableMultiAccountLogin()) {
                C61542b.m111462a(C31575b.m65865g().allUidList(), "cold_start");
            } else {
                C61542b.m111462a(Collections.singletonList(C31575b.m65865g().getCurUserId()), "cold_start");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34895bp
    /* renamed from: b */
    public final void mo60675b() {
        C29339a.m58752a(new Runnable(this.f81040b, new C34268b(this)) {
            /* class com.p2082ss.android.ugc.aweme.utils.C80429fh.RunnableC804301 */

            /* renamed from: a */
            final /* synthetic */ Context f179990a;

            /* renamed from: b */
            final /* synthetic */ AbstractC80433a f179991b;

            static {
                Covode.recordClassIndex(93698);
            }

            public final void run() {
                C80429fh.m139440a(this.f179990a, false, this.f179991b, false);
            }

            {
                this.f179990a = r1;
                this.f179991b = r2;
            }
        });
        SharePrefCache.inst().getIsContactDialogShown().mo59940b(true);
        SharePrefCache.inst().getHasEnterBindPhone().mo59940b(true);
        SharePrefCache.inst().getIsProfileBubbleShown().mo59940b(false);
        C34596c.m70633a(C17867d.m33078a(), "story").mo61058b("open", false);
        if (!C61538b.m111451b() && C31575b.m65860b().isEnableMultiAccountLogin()) {
            C61542b.m111462a(C31575b.m65865g().allUidList(), "boot_delay");
        }
    }

    public C34267a(Activity activity) {
        this.f81040b = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34895bp
    /* renamed from: a */
    public final void mo60674a(Intent intent) {
        AbstractC81915c.m141874a(new C59090b(intent));
    }
}
