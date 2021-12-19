package com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1542m.p1543a.C21399b;
import com.bytedance.tux.dialog.C23048e;
import com.google.android.play.core.p1966e.AbstractC27034f;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31332l;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31333m;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31310a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31316c;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31317d;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.b.a */
public final class C31305a extends AbstractC31332l<C31308d> {
    static {
        Covode.recordClassIndex(38005);
    }

    /* renamed from: b */
    private static boolean m65482b() {
        try {
            if (C17867d.m33078a().getPackageManager().getPackageInfo("com.android.vending", 0).versionCode < 81510000) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31332l
    /* renamed from: a */
    public final boolean mo57300a() {
        Activity validTopActivity;
        C31308d dVar = (C31308d) this.f75058a;
        C31317d.m65518a(dVar);
        Locale locale = dVar.f75022q;
        if (m65481a(locale)) {
            C31316c.m65516a(dVar, 5);
            dVar.mo57344d();
            return true;
        }
        AbstractC27034f a = C31309e.m65492a(locale.getLanguage());
        if (a != null) {
            C31316c.m65516a(dVar, a.mo44735b());
            if (a.mo44735b() == 2 || a.mo44735b() == 4) {
                AbstractC31333m<?> b = C31310a.m65494a().mo57317b(dVar.f75088l);
                if (b != null) {
                    b.mo57334b(dVar);
                }
                return false;
            }
        } else {
            C31316c.m65516a(dVar, 0);
        }
        if (!TextUtils.equals("ceb", locale.getLanguage()) || !m65482b()) {
            C31310a.m65494a().mo57316a(dVar.f75088l, this.f75059b);
            C31310a.m65494a().mo57313a(dVar);
            return false;
        }
        if (!dVar.f75077a && (validTopActivity = ActivityStack.getValidTopActivity()) != null) {
            ((C23048e) new C23048e(validTopActivity).mo37483b(R.string.dpl)).mo37443a(R.string.as0, null).mo37442a().mo37396b().show();
        }
        dVar.mo57339a((AbstractC31339n) 3, (int) dVar.f75077a);
        return false;
    }

    public C31305a(C31308d dVar) {
        super(dVar, new C31306b(dVar.f75088l));
    }

    /* renamed from: a */
    public static boolean m65481a(Locale locale) {
        String language = locale.getLanguage();
        if (TextUtils.equals("en", language)) {
            return true;
        }
        return C21399b.m40170b().f50774c.mo44705a().contains(language);
    }
}
