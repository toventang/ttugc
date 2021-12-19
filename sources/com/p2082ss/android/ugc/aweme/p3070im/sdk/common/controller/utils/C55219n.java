package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.p3219a.C55703a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model.C55842a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n */
public final class C55219n {

    /* renamed from: c */
    private static C55219n f126295c;

    /* renamed from: d */
    private static volatile long f126296d;

    /* renamed from: a */
    public SharedPreferences f126297a = C34822d.m71158a(C17867d.m33078a(), "imbase_" + f126296d, 0);

    /* renamed from: b */
    public SharedPreferences f126298b = C34822d.m71158a(C17867d.m33078a(), "iuserstate", 0);

    /* renamed from: e */
    private SharedPreferences f126299e = C34822d.m71158a(C17867d.m33078a(), "imbase_bydid", 0);

    static {
        Covode.recordClassIndex(64966);
    }

    /* renamed from: b */
    public final int mo92205b() {
        return this.f126297a.getInt("notification_tips_show_times", 0);
    }

    /* renamed from: c */
    public final Set<String> mo92206c() {
        return this.f126297a.getStringSet("notification_shown_conversation", new HashSet());
    }

    /* renamed from: d */
    public final long mo92207d() {
        long j = this.f126297a.getLong("last_relation_fetch_max_time", 0);
        if (j >= 0) {
            return j;
        }
        return 0;
    }

    /* renamed from: e */
    public final long mo92208e() {
        return this.f126297a.getLong("last_relation_full_fetch_time", 0);
    }

    /* renamed from: f */
    public final long mo92209f() {
        return this.f126297a.getLong("last_relation_cold_up_diff_fetch_time", 0);
    }

    /* renamed from: g */
    public final long mo92210g() {
        return this.f126297a.getLong("last_relation_ws_diff_fetch_time", 0);
    }

    /* renamed from: h */
    public final long mo92211h() {
        return this.f126297a.getLong("last_relation_font_diff_fetch_time", 0);
    }

    /* renamed from: i */
    public final long mo92212i() {
        return this.f126297a.getLong("last_relation_loader_diff_fetch_time", 0);
    }

    /* renamed from: k */
    public final boolean mo92214k() {
        return this.f126297a.getBoolean("key_mt_inner_push_switch_on", true);
    }

    /* renamed from: m */
    public final int mo92216m() {
        return this.f126297a.getInt("chat_user_setting_open_count", 0);
    }

    /* renamed from: n */
    public final int mo92217n() {
        return this.f126297a.getInt("permission_updated_notice_show_count", 0);
    }

    /* renamed from: l */
    public final C55703a mo92215l() {
        try {
            return (C55703a) C55214j.m100957a(this.f126297a.getString("chat_user_setting", ""), C55703a.class);
        } catch (C28027t e) {
            e.printStackTrace();
            C56244a.m102190b("IMSPUtils", "No cached chat user settings");
            return null;
        }
    }

    private C55219n() {
        f126296d = C55197c.m100923e();
    }

    /* renamed from: a */
    public static synchronized C55219n m100965a() {
        C55219n nVar;
        synchronized (C55219n.class) {
            MethodCollector.m26663i(5192);
            long e = C55197c.m100923e();
            if (f126295c == null || e != f126296d) {
                synchronized (C55219n.class) {
                    try {
                        if (f126295c == null || e != f126296d) {
                            f126295c = new C55219n();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5192);
                        throw th;
                    }
                }
            }
            nVar = f126295c;
            MethodCollector.m26664o(5192);
        }
        return nVar;
    }

    /* renamed from: j */
    public final List<C55842a> mo92213j() {
        ArrayList arrayList = new ArrayList();
        try {
            Set<String> stringSet = this.f126297a.getStringSet("last_relation_fetch_missing_page_list", new HashSet());
            if (!C13603b.m24435a((Collection) stringSet)) {
                for (String str : stringSet) {
                    arrayList.add(C55214j.m100957a(str, C55842a.class));
                }
            }
        } catch (Throwable th) {
            C56244a.m102188a(th);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo92202a(long j) {
        this.f126297a.edit().putLong("last_relation_fetch_max_time", j).commit();
    }

    /* renamed from: a */
    public final int mo92201a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MAX_VALUE;
        }
        return this.f126297a.getInt("maf_user_show_count_".concat(String.valueOf(str)), 0);
    }

    /* renamed from: a */
    public final void mo92203a(C55703a aVar) {
        this.f126297a.edit().putString("chat_user_setting", C55214j.m100958a(aVar)).apply();
    }

    /* renamed from: a */
    public final void mo92204a(List<C55842a> list) {
        HashSet hashSet = new HashSet();
        try {
            if (!C13603b.m24435a((Collection) list)) {
                for (C55842a aVar : list) {
                    hashSet.add(C55214j.m100958a(aVar));
                }
            }
            this.f126297a.edit().putStringSet("last_relation_fetch_missing_page_list", hashSet).commit();
        } catch (Throwable th) {
            C56244a.m102188a(th);
        }
    }
}
