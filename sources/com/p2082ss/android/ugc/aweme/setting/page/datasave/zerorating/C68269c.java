package com.p2082ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.AbstractC22526b;
import com.p2082ss.android.ugc.aweme.api.AbstractC33535d;
import com.p2082ss.android.ugc.aweme.api.IZeroRatingService;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.c */
public final class C68269c extends C40945h {

    /* renamed from: a */
    public final Context f152833a;

    /* renamed from: b */
    private final String f152834b;

    /* renamed from: c */
    private final String f152835c;

    static {
        Covode.recordClassIndex(80481);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34800h mo70128b() {
        return mo70128b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40940e, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    public final void cl_() {
        IZeroRatingService f = ZeroRatingServiceImpl.m141669f();
        C89219l.m154716b(f, "");
        f.mo59646c().mo59657c();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h
    /* renamed from: a */
    public final C34800h mo70133a() {
        String str = this.f152834b;
        String str2 = this.f152835c;
        IZeroRatingService f = ZeroRatingServiceImpl.m141669f();
        C89219l.m154716b(f, "");
        return new C34800h(f.mo59645b(), str, new View$OnClickListenerC68270a(this), false, null, null, null, null, str2, false, 15352);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.c$a */
    static final class View$OnClickListenerC68270a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68269c f152836a;

        static {
            Covode.recordClassIndex(80482);
        }

        View$OnClickListenerC68270a(C68269c cVar) {
            this.f152836a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f152836a.mo70138g();
            final boolean z = ((C34800h) this.f152836a.mo70132l()).f82200c;
            ZeroRatingServiceImpl.m141669f().mo59644a(z, new AbstractC22526b.AbstractC22527a(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.page.datasave.zerorating.C68269c.View$OnClickListenerC68270a.C682711 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC68270a f152837a;

                static {
                    Covode.recordClassIndex(80483);
                }

                @Override // com.bytedance.sdk.p1665b.AbstractC22526b.AbstractC22527a
                /* renamed from: a */
                public final void mo36803a() {
                    String str;
                    IZeroRatingService f = ZeroRatingServiceImpl.m141669f();
                    C89219l.m154716b(f, "");
                    AbstractC33535d c = f.mo59646c();
                    if (z) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    c.mo59653a(str);
                }

                @Override // com.bytedance.sdk.p1665b.AbstractC22526b.AbstractC22527a
                /* renamed from: b */
                public final void mo36804b() {
                    this.f152837a.f152836a.mo70138g();
                    new C79459a(this.f152837a.f152836a.f152833a).mo123050a(R.string.bof).mo123053a();
                }

                {
                    this.f152837a = r1;
                }
            });
        }
    }

    public C68269c(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        String string = fragment.getString(R.string.dpf);
        C89219l.m154716b(string, "");
        this.f152834b = string;
        String string2 = fragment.getString(R.string.g95);
        C89219l.m154716b(string2, "");
        this.f152835c = string2;
        this.f152833a = fragment.getContext();
    }
}
