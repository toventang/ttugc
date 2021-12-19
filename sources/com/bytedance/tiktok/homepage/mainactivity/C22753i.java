package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C57058z;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.i */
public class C22753i {

    /* renamed from: a */
    final Activity f53740a;

    /* renamed from: b */
    public boolean f53741b;

    /* renamed from: c */
    public Future<?> f53742c;

    static {
        Covode.recordClassIndex(26646);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37071b() {
        boolean z = false;
        if (AbstractC56869p.C56870a.m103133a().mo94055h() || (this.f53740a.getIntent() != null && this.f53740a.getIntent().getBooleanExtra("from_new_user_journey", false))) {
            z = true;
        }
        this.f53741b = z;
    }

    /* renamed from: a */
    public final void mo37070a() {
        C58945a.C58947b.f134185a.mo96425a("method_create_calculate_newuser_value", false);
        if (!C67214a.m119163m()) {
            C57058z zVar = C57058z.f129923a;
            Activity activity = this.f53740a;
            zVar.mo57263a(activity, activity.getIntent());
            mo37071b();
        } else {
            try {
                Future<?> future = this.f53742c;
                if (future != null) {
                    future.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        C58945a.C58947b.f134185a.mo96429b("method_create_calculate_newuser_value", false);
        C58945a.C58947b.f134185a.mo96425a("method_create_welcome_duration", false);
        if (((int) C17867d.m33083d()) > C33842s.C33843a.f80132a.mo60078v().mo59941c().intValue()) {
            Keva.getRepo("repo_new_version_journey").storeBoolean("key_new_version", true);
            Keva repo = Keva.getRepo("repo_story_cold_start");
            if (repo.getBoolean("key_new_user", false)) {
                repo.storeBoolean("key_new_user", false);
            } else {
                repo.storeBoolean("key_new_version", true);
            }
        }
        AbstractC56869p.C56870a.m103133a().mo70122a(AbstractC56869p.C56870a.m103135a(this.f53740a.getIntent()));
        if (AbstractC56869p.C56870a.m103133a().mo94055h()) {
            C57058z.f129923a.mo57264a(this.f53740a, true, false);
        }
        C58945a.C58947b.f134185a.mo96429b("method_create_welcome_duration", false);
    }

    public C22753i(Activity activity) {
        this.f53740a = activity;
    }
}
