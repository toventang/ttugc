package com.p2082ss.android.ugc.aweme.setting.page.accessibility;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.accessibility.c */
public final class C68205c extends C40945h {

    /* renamed from: a */
    private final String f152706a;

    /* renamed from: b */
    private final String f152707b;

    static {
        Covode.recordClassIndex(80406);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34800h mo70128b() {
        return mo70128b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h
    /* renamed from: a */
    public final C34800h mo70133a() {
        String str = this.f152706a;
        String str2 = this.f152707b;
        boolean z = true;
        if (C39223a.m79590d().mo68623h() != 1) {
            z = false;
        }
        return new C34800h(z, str, new View$OnClickListenerC68206a(this), false, null, null, null, null, str2, false, 15352);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.accessibility.c$a */
    static final class View$OnClickListenerC68206a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68205c f152708a;

        static {
            Covode.recordClassIndex(80407);
        }

        View$OnClickListenerC68206a(C68205c cVar) {
            this.f152708a = cVar;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            this.f152708a.mo70138g();
            boolean z = ((C34800h) this.f152708a.mo70132l()).f82200c;
            IComplianceBusinessService d = C39223a.m79590d();
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            d.mo68615a(i, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.page.accessibility.C68205c.View$OnClickListenerC68206a.C682071 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC68206a f152709a;

                static {
                    Covode.recordClassIndex(80408);
                }

                {
                    this.f152709a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f152709a.f152708a.mo70138g();
                    return C89391z.f203057a;
                }
            });
        }
    }

    public C68205c(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        String string = fragment.getString(R.string.dp2);
        C89219l.m154716b(string, "");
        this.f152706a = string;
        String string2 = fragment.getString(R.string.dp0);
        C89219l.m154716b(string2, "");
        this.f152707b = string2;
    }
}
