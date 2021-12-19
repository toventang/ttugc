package com.p2082ss.android.ugc.aweme.discover.helper;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42201a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.ai */
public final class C41989ai {

    /* renamed from: a */
    public static C41984ad f97918a;

    /* renamed from: b */
    public static final C41989ai f97919b = new C41989ai();

    /* renamed from: c */
    private static List<C42201a> f97920c = new ArrayList();

    /* renamed from: d */
    private static String f97921d = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-sounds/template.js&prefix=online/lynx/search-card&use_bdx=1";

    /* renamed from: e */
    private static String f97922e = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=sounds-from-artist/template.js&prefix=online/lynx/search-card&use_bdx=1";

    /* renamed from: f */
    private static String f97923f = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-live/template.js&prefix=online/lynx/search-card&use_bdx=1";

    /* renamed from: g */
    private static String f97924g = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=vertical-shopping/template.js&use_bdx=1";

    private C41989ai() {
    }

    static {
        Covode.recordClassIndex(49919);
    }

    /* renamed from: a */
    public static C42345d m84052a() {
        String str;
        C28022o oVar;
        AbstractC28019l c;
        try {
            C41984ad adVar = (C41984ad) SettingsManager.m29616a().mo25397a("search_result_config", C41984ad.class, f97918a);
            f97918a = adVar;
            if (adVar == null || (oVar = adVar.f97914d) == null || (c = oVar.mo46803c("schema")) == null || (str = c.mo46689c()) == null) {
                str = f97923f;
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            C89219l.m154716b(buildUpon, "");
            C42345d dVar = new C42345d();
            dVar.setSchema(buildUpon.toString());
            return dVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static List<C42201a> m84053a(String str) {
        String str2;
        C28022o oVar;
        AbstractC28019l c;
        try {
            C41984ad adVar = (C41984ad) SettingsManager.m29616a().mo25397a("search_result_config", C41984ad.class, f97918a);
            f97918a = adVar;
            if (adVar == null || (oVar = adVar.f97912b) == null || (c = oVar.mo46803c("schema")) == null || (str2 = c.mo46689c()) == null) {
                str2 = f97922e;
            }
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            C89219l.m154716b(buildUpon, "");
            buildUpon.appendQueryParameter("keyword", str);
            C42345d dVar = new C42345d();
            dVar.setSchema(buildUpon.toString());
            f97920c = C89070n.m154524c(new C42201a(dVar));
        } catch (Throwable unused) {
        }
        return f97920c;
    }

    /* renamed from: b */
    public static List<C42201a> m84055b(String str, String str2, String str3) {
        String str4;
        C28022o oVar;
        AbstractC28019l c;
        try {
            C41984ad adVar = (C41984ad) SettingsManager.m29616a().mo25397a("search_result_config", C41984ad.class, f97918a);
            f97918a = adVar;
            if (adVar == null || (oVar = adVar.f97913c) == null || (c = oVar.mo46803c("schema")) == null || (str4 = c.mo46689c()) == null) {
                str4 = f97924g;
            }
            Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
            C89219l.m154716b(buildUpon, "");
            buildUpon.appendQueryParameter("keyword", str).appendQueryParameter("search_context", str3).appendQueryParameter("search_source", str2);
            C42345d dVar = new C42345d();
            dVar.setSchema(buildUpon.toString());
            f97920c = C89070n.m154524c(new C42201a(dVar));
        } catch (Throwable unused) {
        }
        return f97920c;
    }

    /* renamed from: a */
    public static List<C42201a> m84054a(String str, String str2, String str3) {
        String str4;
        C28022o oVar;
        AbstractC28019l c;
        try {
            C41984ad adVar = (C41984ad) SettingsManager.m29616a().mo25397a("search_result_config", C41984ad.class, f97918a);
            f97918a = adVar;
            if (adVar == null || (oVar = adVar.f97911a) == null || (c = oVar.mo46803c("schema")) == null || (str4 = c.mo46689c()) == null) {
                str4 = f97921d;
            }
            Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
            C89219l.m154716b(buildUpon, "");
            buildUpon.appendQueryParameter("keyword", str).appendQueryParameter("search_context", str3).appendQueryParameter("search_source", str2);
            C42345d dVar = new C42345d();
            dVar.setSchema(buildUpon.toString());
            f97920c = C89070n.m154524c(new C42201a(dVar));
        } catch (Throwable unused) {
        }
        return f97920c;
    }
}
