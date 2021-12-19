package com.p2082ss.android.ugc.aweme.p4173ug.p4180f;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2141e.C29905b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.deeplink.C41058p;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.f.b */
public final class C79629b implements AbstractC79622e {

    /* renamed from: a */
    public static final C79629b f178667a = new C79629b();

    /* renamed from: b */
    private static boolean f178668b = true;

    /* renamed from: c */
    private static AbstractC79622e.EnumC79623a f178669c;

    /* renamed from: d */
    private static Application f178670d;

    /* renamed from: e */
    private static Map<Uri, C79630a> f178671e = new LinkedHashMap();

    private C79629b() {
    }

    /* renamed from: c */
    private static int m138436c() {
        if (!f178668b) {
            return 0;
        }
        f178668b = false;
        return 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.f.b$a */
    public static final class C79630a {

        /* renamed from: a */
        public final boolean f178672a;

        /* renamed from: b */
        public final long f178673b;

        /* renamed from: c */
        public final boolean f178674c;

        static {
            Covode.recordClassIndex(92842);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C79630a)) {
                return false;
            }
            C79630a aVar = (C79630a) obj;
            return this.f178672a == aVar.f178672a && this.f178673b == aVar.f178673b && this.f178674c == aVar.f178674c;
        }

        public final String toString() {
            return "DeepLinkMobParams(isLongLink=" + this.f178672a + ", shortToLongDuration=" + this.f178673b + ", isShortToLongEndOnBackground=" + this.f178674c + ")";
        }

        public final int hashCode() {
            boolean z = this.f178672a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            long j = this.f178673b;
            int i5 = ((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            if (!this.f178674c) {
                i = 0;
            }
            return i5 + i;
        }

        public C79630a(boolean z, long j, boolean z2) {
            this.f178672a = z;
            this.f178673b = j;
            this.f178674c = z2;
        }
    }

    static {
        Covode.recordClassIndex(92841);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e
    /* renamed from: a */
    public final void mo123164a() {
        C39162r.m79460a("deep_link_short2long_launch", new C33744d().mo59982a("is_cold_launch", Boolean.valueOf(f178668b)).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e
    /* renamed from: b */
    public final void mo123170b() {
        C39162r.m79460a("launch_log", new C33744d().mo59983a("launch_method", "link_direct").mo59983a("c_launch_method", "deep_link_short_link_fallback").mo59980a("is_cold_launch", m138436c()).mo59983a("from_channel", "short_link").f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e
    /* renamed from: a */
    public final void mo123169a(boolean z) {
        C39162r.m79460a("deep_link_short2long_success", new C33744d().mo59982a("is_cold_launch", Boolean.valueOf(f178668b)).mo59980a("is_bg", z ? 1 : 0).f79943a);
    }

    /* renamed from: a */
    private static void m138435a(String str, C33744d dVar) {
        C39162r.m79460a("launch_log", dVar.mo59983a("launch_method", str).mo59983a("c_launch_method", str).mo59980a("is_cold_launch", m138436c()).mo59983a("from_channel", "user").f79943a);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e
    /* renamed from: a */
    public final void mo123165a(Application application, String str) {
        AbstractC79622e.EnumC79623a aVar;
        C89219l.m154721d(application, "");
        C89219l.m154721d(str, "");
        f178670d = application;
        if (f178669c == null) {
            switch (str.hashCode()) {
                case -2110102721:
                    if (str.equals("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity")) {
                        aVar = AbstractC79622e.EnumC79623a.WIDGET;
                        break;
                    }
                    aVar = AbstractC79622e.EnumC79623a.NONE;
                    break;
                case -1915565709:
                    if (str.equals("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity")) {
                        aVar = AbstractC79622e.EnumC79623a.SHORTCUT;
                        break;
                    }
                    aVar = AbstractC79622e.EnumC79623a.NONE;
                    break;
                case -1122151764:
                    if (str.equals("com.ss.android.ugc.aweme.share.SystemShareActivity")) {
                        aVar = AbstractC79622e.EnumC79623a.OPEN_SHARE;
                        break;
                    }
                    aVar = AbstractC79622e.EnumC79623a.NONE;
                    break;
                case 163197832:
                    if (str.equals("com.ss.android.ugc.aweme.journey.StubMainActivity")) {
                        aVar = AbstractC79622e.EnumC79623a.MAIN;
                        break;
                    }
                    aVar = AbstractC79622e.EnumC79623a.NONE;
                    break;
                case 683138905:
                    if (str.equals("com.ss.android.ugc.aweme.main.MainActivity")) {
                        aVar = AbstractC79622e.EnumC79623a.MAIN;
                        break;
                    }
                    aVar = AbstractC79622e.EnumC79623a.NONE;
                    break;
                case 1231814645:
                    if (str.equals("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2")) {
                        aVar = AbstractC79622e.EnumC79623a.DEEP_LINK;
                        break;
                    }
                    aVar = AbstractC79622e.EnumC79623a.NONE;
                    break;
                default:
                    aVar = AbstractC79622e.EnumC79623a.NONE;
                    break;
            }
            if (aVar == AbstractC79622e.EnumC79623a.NONE) {
                C39162r.m79460a("unknown_launch_method", new C33744d().mo59983a("class_name", str).f79943a);
                aVar = AbstractC79622e.EnumC79623a.MAIN;
            }
            f178669c = aVar;
            if (aVar == AbstractC79622e.EnumC79623a.MAIN && f178668b) {
                m138435a("enter_launch", new C33744d());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e
    /* renamed from: a */
    public final void mo123168a(AbstractC79622e.EnumC79623a aVar, String str) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        String value = aVar.getValue();
        C33744d a = new C33744d().mo59983a("launch_from", str);
        C89219l.m154716b(a, "");
        m138435a(value, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e
    /* renamed from: a */
    public final void mo123166a(Uri uri, boolean z, long j, boolean z2) {
        C89219l.m154721d(uri, "");
        f178671e.put(uri, new C79630a(z, j, z2));
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e
    /* renamed from: a */
    public final void mo123167a(Uri uri, boolean z, C41058p pVar, boolean z2, long j, boolean z3) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(pVar, "");
        C79630a aVar = f178671e.get(uri);
        if (aVar == null) {
            aVar = new C79630a(z2, j, z3);
        }
        if (aVar.f178672a) {
            C29905b.m60282a(C17867d.m33078a()).mo52217a(m138434a(uri, z, "deep_link", (C41058p) null, false, false));
        } else {
            C29905b.m60282a(C17867d.m33078a()).mo52217a(m138434a(uri, z, "deep_link_short_link", pVar, true, aVar.f178674c));
        }
        f178671e.remove(uri);
    }

    /* renamed from: a */
    private static Uri m138434a(Uri uri, boolean z, String str, C41058p pVar, boolean z2, boolean z3) {
        boolean z4;
        String str2;
        String queryParameter = uri.getQueryParameter("gd_label");
        if (queryParameter == null || queryParameter.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            queryParameter = uri.getQueryParameter("launch_method");
        }
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = "link_direct";
        }
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("launch_method", queryParameter).appendQueryParameter("c_launch_method", str).appendQueryParameter("is_cold_launch", String.valueOf(m138436c())).appendQueryParameter("is_from_noti", String.valueOf(z)).appendQueryParameter("needlaunchlog", "true");
        if (pVar != null) {
            appendQueryParameter.appendQueryParameter("page_source", pVar.f95977b);
            appendQueryParameter.appendQueryParameter("enter_to", pVar.f95978c);
            appendQueryParameter.appendQueryParameter("platform", pVar.f95979d);
            appendQueryParameter.appendQueryParameter("from_user_id", pVar.f95980e);
            if (C80537hk.m139613a(pVar.f95982g)) {
                appendQueryParameter.appendQueryParameter("link_id", pVar.f95982g);
            }
            if (C80537hk.m139613a(pVar.f95983h)) {
                appendQueryParameter.appendQueryParameter("referrer_url", pVar.f95983h);
            }
            if (C80537hk.m139613a(pVar.f95984i)) {
                appendQueryParameter.appendQueryParameter("params_url", pVar.f95984i);
            }
            if (C80537hk.m139613a(pVar.f95981f)) {
                appendQueryParameter.appendQueryParameter("to_user_id", pVar.f95981f);
            }
        }
        if (z2) {
            if (z3) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            appendQueryParameter.appendQueryParameter("c_short_link_is_bg", str2);
        }
        Uri build = appendQueryParameter.build();
        C89219l.m154716b(build, "");
        return build;
    }
}
