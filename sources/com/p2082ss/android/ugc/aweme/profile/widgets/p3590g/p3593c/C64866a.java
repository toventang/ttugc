package com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3593c;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.c.a */
public final class C64866a extends AbstractC12769a {

    /* renamed from: j */
    private View f146655j;

    static {
        Covode.recordClassIndex(76333);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        super.mo20525j();
        m116658c(mo20528t());
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        m116658c(view);
    }

    /* renamed from: c */
    private final void m116658c(View view) {
        ViewStub viewStub;
        MethodCollector.m26663i(7600);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        if (curUser.isSecret()) {
            if (!(this.f146655j != null || view == null || (viewStub = (ViewStub) view.findViewById(R.id.d9p)) == null)) {
                this.f146655j = viewStub.inflate();
            }
            View view2 = this.f146655j;
            if (view2 != null) {
                view2.setVisibility(0);
                MethodCollector.m26664o(7600);
                return;
            }
            MethodCollector.m26664o(7600);
            return;
        }
        View view3 = this.f146655j;
        if (view3 != null) {
            view3.setVisibility(8);
            MethodCollector.m26664o(7600);
            return;
        }
        MethodCollector.m26664o(7600);
    }
}
