package com.p2082ss.android.ugc.aweme.setting.page.accessibility;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34593a;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35502b;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.aweme.setting.C68193o;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.accessibility.a */
public final class C68202a extends C40945h {

    /* renamed from: a */
    public final Context f152701a;

    /* renamed from: b */
    private final String f152702b;

    static {
        Covode.recordClassIndex(80403);
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
        return new C34800h(C68193o.m120445a(), this.f152702b, new View$OnClickListenerC68203a(this), false, null, null, null, null, null, false, 16376);
    }

    public C68202a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f152701a = fragment.getContext();
        String string = fragment.getString(R.string.bek);
        C89219l.m154716b(string, "");
        this.f152702b = string;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.accessibility.a$a */
    static final class View$OnClickListenerC68203a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68202a f152703a;

        static {
            Covode.recordClassIndex(80404);
        }

        View$OnClickListenerC68203a(C68202a aVar) {
            this.f152703a = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f152703a.mo70138g();
            boolean z = ((C34800h) this.f152703a.mo70132l()).f82200c;
            Context context = this.f152703a.f152701a;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            C29823c.m60080a(context, "dynamic_cover", str);
            C34822d.m71158a(C17867d.m33078a(), "aweme_app", 0).edit().putBoolean("use_dynamic_cover", z).apply();
            C34593a.f81640a.put(C34593a.m70630b("aweme_app", "use_dynamic_cover"), Boolean.valueOf(z));
            AbstractC81915c.m141874a(new C35502b(!z));
        }
    }
}
