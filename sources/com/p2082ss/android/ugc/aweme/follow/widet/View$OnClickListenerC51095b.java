package com.p2082ss.android.ugc.aweme.follow.widet;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.follow.widet.b */
public final /* synthetic */ class View$OnClickListenerC51095b implements View.OnClickListener {

    /* renamed from: a */
    private final C51086a f117888a;

    /* renamed from: b */
    private final User f117889b;

    static {
        Covode.recordClassIndex(60292);
    }

    View$OnClickListenerC51095b(C51086a aVar, User user) {
        this.f117888a = aVar;
        this.f117889b = user;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C51086a aVar = this.f117888a;
        User user = this.f117889b;
        if (!C58001a.m104815a(view, 300)) {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = C51086a.m95513a();
            }
            if (!C58029j.f132256h) {
                new C23144b(view).mo37640e(R.string.dcq).mo37637b();
            } else if (aVar.f117879e != null && aVar.f117879e.mo63341a(user.getFollowStatus())) {
            } else {
                if (!C31575b.m65865g().isLogin()) {
                    C58957c.m108321a(aVar.f117875a, aVar.f117876b.getEnterFrom(), aVar.f117876b.getEnterMethod(), new C51101h(aVar, user));
                    return;
                }
                if (aVar.f117878d != null) {
                    aVar.f117878d.mo63342a();
                }
                aVar.mo86510b(user);
            }
        }
    }
}
