package com.p2082ss.android.ugc.aweme.compliance.business.banappeal;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34574e;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d;
import com.p2082ss.android.ugc.aweme.main.AbstractC59104k;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b */
public class C39319b implements AbstractC39232c, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    AbstractC39233d f92811a;

    /* renamed from: b */
    boolean f92812b;

    /* renamed from: c */
    AtomicBoolean f92813c = new AtomicBoolean(false);

    /* renamed from: d */
    private ActivityC17312a f92814d;

    /* renamed from: e */
    private boolean f92815e = false;

    /* renamed from: f */
    private boolean f92816f = true;

    static {
        Covode.recordClassIndex(46999);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c
    /* renamed from: c */
    public final void mo68115c() {
        this.f92812b = false;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(345, new RunnableC90250g(C39319b.class, "onUserBannedEvent", C34574e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c
    /* renamed from: d */
    public final void mo68116d() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: e */
    private static void m79966e() {
        C31575b.m65860b().logout("user_banned", "user_banned");
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c
    /* renamed from: a */
    public final void mo68111a() {
        EventBus.m156966a(EventBus.m156962a(), this);
        C40780g.m82241a().execute(RunnableC39342e.f92871a);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c
    /* renamed from: b */
    public final void mo68114b() {
        this.f92812b = true;
        AbstractC39233d dVar = this.f92811a;
        if (dVar != null && dVar.mo68117a() && !((AbstractC59104k) this.f92814d).isADShowing()) {
            this.f92811a.mo68120d();
        }
        AbstractC39233d dVar2 = this.f92811a;
        if (dVar2 != null && dVar2.mo68119c() && C31575b.m65865g().isLogin()) {
            m79966e();
        }
    }

    public C39319b(Activity activity) {
        this.f92814d = (ActivityC17312a) activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c
    /* renamed from: a */
    public final void mo68112a(boolean z) {
        this.f92815e = false;
        if (z) {
            C39223a.m79594h().mo68583b();
            if (this.f92816f) {
                this.f92816f = false;
                this.f92815e = true;
            }
        }
        if (!this.f92815e) {
            C39223a.m79593g().mo68661a(this.f92814d, C39334c.f92849a);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onUserBannedEvent(C34574e eVar) {
        AbstractC39233d dVar = this.f92811a;
        if ((dVar == null || !dVar.mo68121e()) && this.f92812b && !((AbstractC59104k) this.f92814d).isADShowing() && this.f92813c.compareAndSet(false, true)) {
            try {
                C39223a.m79589c().mo68604a(C31575b.m65865g().getCurUserId(), new C39341d(this, this.f92814d));
            } catch (Exception unused) {
                this.f92813c.set(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c
    /* renamed from: a */
    public final boolean mo68113a(int i, int i2, Intent intent) {
        if (i2 == 10) {
            if (intent.getIntExtra("result", -1) == 0) {
                new C23144b(this.f92814d).mo37640e(R.string.eqs).mo37637b();
            }
            return true;
        } else if (i != 17) {
            return false;
        } else {
            m79966e();
            return true;
        }
    }
}
