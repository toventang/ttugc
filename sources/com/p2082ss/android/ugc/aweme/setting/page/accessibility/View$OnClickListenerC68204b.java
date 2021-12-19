package com.p2082ss.android.ugc.aweme.setting.page.accessibility;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2386be.C34794b;
import com.p2082ss.android.ugc.aweme.p2727db.C40933b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.accessibility.b */
public final class View$OnClickListenerC68204b extends C40933b implements View.OnClickListener {

    /* renamed from: a */
    private final String f152704a;

    /* renamed from: b */
    private final Fragment f152705b;

    static {
        Covode.recordClassIndex(80405);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40933b, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34794b mo70128b() {
        return mo70128b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40933b
    /* renamed from: a */
    public final C34794b mo70133a() {
        return new C34794b(this.f152704a, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC68204b(Fragment fragment) {
        super((byte) 0);
        C89219l.m154721d(fragment, "");
        this.f152705b = fragment;
        String string = fragment.getString(R.string.cxs);
        C89219l.m154716b(string, "");
        this.f152704a = string;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            C39162r.m79460a("live_photo_manage", new C33744d().mo59983a("enter_from", "accessibility").f79943a);
            SmartRouter.buildRoute(this.f152705b, "//livewallpaper").open();
        }
    }
}
