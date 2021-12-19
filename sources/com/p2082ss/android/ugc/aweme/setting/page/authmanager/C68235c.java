package com.p2082ss.android.ugc.aweme.setting.page.authmanager;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.p2727db.C40934c;
import com.p2082ss.android.ugc.aweme.setting.model.C68173c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.c */
public final class C68235c extends C40934c {

    /* renamed from: a */
    public final C68173c f152764a;

    /* renamed from: b */
    public final AbstractC68237d f152765b;

    static {
        Covode.recordClassIndex(80437);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34796d mo70128b() {
        return mo70128b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c
    /* renamed from: a */
    public final C34796d mo70133a() {
        String name = this.f152764a.getName();
        if (name == null) {
            name = "";
        }
        return new C34796d(name, null, new View$OnClickListenerC68236a(this), null, false, null, null, true, null, false, null, false, null, 130810);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.c$a */
    static final class View$OnClickListenerC68236a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68235c f152766a;

        static {
            Covode.recordClassIndex(80438);
        }

        View$OnClickListenerC68236a(C68235c cVar) {
            this.f152766a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f152766a.f152765b.mo108731a(this.f152766a.f152764a);
        }
    }

    public C68235c(C68173c cVar, AbstractC68237d dVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(dVar, "");
        this.f152764a = cVar;
        this.f152765b = dVar;
    }
}
