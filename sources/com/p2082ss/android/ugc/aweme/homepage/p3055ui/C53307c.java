package com.p2082ss.android.ugc.aweme.homepage.p3055ui;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46720aw;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMainPageIcon;
import com.p2082ss.android.ugc.aweme.homepage.story.icon.X2CIconStory;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58216a;
import com.p2082ss.android.ugc.aweme.main.experiment.C59083d;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.c */
public final class C53307c {

    /* renamed from: a */
    public static final C53307c f122355a = new C53307c();

    private C53307c() {
    }

    static {
        Covode.recordClassIndex(62858);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.Class<? extends android.app.Activity>, java.lang.ref.WeakReference<android.app.Activity>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m98263a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar, "");
        C58216a aVar = C58221f.f132581e;
        C89219l.m154721d(eVar, "");
        aVar.f132565c.put(eVar.getClass(), new WeakReference(eVar));
        C58221f.C58225d e = C58221f.m105153e();
        e.mo95704a(new X2CFragmentMainPageIcon());
        if (!C67248d.m119175c()) {
            e.mo95704a(new X2CIconStory());
        } else if (C77260g.f173332a.mo120161i()) {
            e.mo95704a(new X2CIconStory());
        }
        if (C46720aw.m90103b()) {
            e.mo95704a(C59083d.f134486a.mo37197a());
            e.mo95704a(C59083d.f134486a.mo37198b());
            e.mo95704a(C59083d.f134486a.mo37199c());
        } else if (C46720aw.m90102a()) {
            e.mo95704a(C59083d.f134486a.mo37197a());
            e.mo95704a(C59083d.f134486a.mo37198b());
        }
        e.mo95706a();
    }
}
