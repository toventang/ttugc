package com.p2082ss.android.ugc.aweme.p2352aw;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53446g;
import com.p2082ss.android.ugc.aweme.utils.C80429fh;

/* renamed from: com.ss.android.ugc.aweme.aw.b */
final /* synthetic */ class C34268b implements C80429fh.AbstractC80433a {

    /* renamed from: a */
    private final C34267a f81041a;

    static {
        Covode.recordClassIndex(41205);
    }

    C34268b(C34267a aVar) {
        this.f81041a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.C80429fh.AbstractC80433a
    /* renamed from: a */
    public final void mo60676a() {
        C34267a aVar = this.f81041a;
        C53446g gVar = C53446g.C53447a.f122670a;
        Activity activity = aVar.f81040b;
        gVar.f122665c = true;
        gVar.mo90013b(activity);
        if (!C49907s.m93685a().booleanValue() && !aVar.f81039a) {
            ContentLanguageServiceImpl.m81266f().mo69370a(aVar.f81040b);
        }
    }
}
