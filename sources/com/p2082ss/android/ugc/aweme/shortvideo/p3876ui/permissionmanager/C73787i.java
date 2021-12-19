package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.i */
public final class C73787i implements AbstractC73764a {

    /* renamed from: a */
    public static final C73787i f165654a = new C73787i();

    private C73787i() {
    }

    static {
        Covode.recordClassIndex(86526);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.AbstractC73764a
    /* renamed from: a */
    public final boolean mo116239a(Context context) {
        C89219l.m154721d(context, "");
        return m129844a(context, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.AbstractC73764a
    /* renamed from: a */
    public final void mo116238a(ActivityC0945e eVar, AbstractC63264v.AbstractC63265a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C63238c.f143565C.mo73274b().mo101758a(eVar, aVar, "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: a */
    public static boolean m129844a(Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C89219l.m154721d(context, "");
        boolean a = C46981gn.m90261a();
        if (z || C63238c.f143566D.mo73307c().mo101673b(context) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a || C63238c.f143566D.mo73307c().mo101757a(context) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C63238c.f143566D.mo73307c().mo101674c(context) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }
}
