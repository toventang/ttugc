package com.p2082ss.android.ugc.aweme.compliance.privacy.settings;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39257p;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.a */
public final class C39699a {

    /* renamed from: a */
    public static final C39699a f93534a = new C39699a();

    private C39699a() {
    }

    static {
        Covode.recordClassIndex(47424);
    }

    /* renamed from: b */
    public static boolean m80587b() {
        boolean c = GuestModeServiceImpl.m65990d().mo57219c();
        if (!C39631a.m80488d() && !c) {
            return false;
        }
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean enableDownloadTtData = iESSettingsProxy.getEnableDownloadTtData();
            C89219l.m154716b(enableDownloadTtData, "");
            if (enableDownloadTtData.booleanValue() || c) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m80583a() {
        if (C39223a.m79593g().mo68662a() || GuestModeServiceImpl.m65990d().mo57219c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C39700a m80580a(int i) {
        boolean z = false;
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                z = true;
            } else {
                z2 = false;
            }
        }
        return new C39700a(z, z2);
    }

    /* renamed from: b */
    public static C39700a m80586b(C39256o oVar) {
        int i;
        if (oVar != null) {
            i = oVar.getShowType();
        } else {
            i = 0;
        }
        return m80580a(i);
    }

    /* renamed from: a */
    public static C39700a m80581a(C39256o oVar) {
        int i;
        if (oVar != null) {
            i = oVar.getShowType();
        } else {
            i = 0;
        }
        return m80580a(i);
    }

    /* renamed from: a */
    public static C39700a m80582a(C39257p pVar) {
        int i;
        if (pVar != null) {
            i = pVar.getShowType();
        } else {
            i = 0;
        }
        return m80580a(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.a$a */
    public static final class C39700a {

        /* renamed from: a */
        public final boolean f93535a;

        /* renamed from: b */
        public final boolean f93536b;

        static {
            Covode.recordClassIndex(47425);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39700a)) {
                return false;
            }
            C39700a aVar = (C39700a) obj;
            return this.f93535a == aVar.f93535a && this.f93536b == aVar.f93536b;
        }

        public final int hashCode() {
            boolean z = this.f93535a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            if (!this.f93536b) {
                i = 0;
            }
            return i5 + i;
        }

        public final String toString() {
            return "RestrictionViewStatus(isEnabled=" + this.f93535a + ", isVisible=" + this.f93536b + ")";
        }

        public C39700a(boolean z, boolean z2) {
            this.f93535a = z;
            this.f93536b = z2;
        }
    }

    /* renamed from: a */
    public static boolean m80584a(C39256o oVar, Context context) {
        C89219l.m154721d(context, "");
        if (oVar == null || oVar.getShowType() != 1) {
            return true;
        }
        if (oVar.getResType() != 2 || !(context instanceof Activity)) {
            return false;
        }
        new C23144b((Activity) context).mo37640e(R.string.br4).mo37637b();
        return false;
    }

    /* renamed from: a */
    public static boolean m80585a(C39257p pVar, Context context) {
        C89219l.m154721d(context, "");
        if (pVar == null || pVar.getShowType() != 1) {
            return true;
        }
        if (pVar.getResType() != 2 || !(context instanceof Activity)) {
            return false;
        }
        new C23144b((Activity) context).mo37640e(R.string.br4).mo37637b();
        return false;
    }
}
