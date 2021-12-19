package com.p2082ss.android.ugc.aweme.newfollow.p3506c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34596c;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34598e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.c.e */
public final class C61504e {

    /* renamed from: a */
    public volatile List<String> f139614a;

    /* renamed from: b */
    private List<String> f139615b;

    static {
        Covode.recordClassIndex(72161);
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.c.e$a */
    public static class C61505a {

        /* renamed from: a */
        public static final C61504e f139616a = new C61504e();

        static {
            Covode.recordClassIndex(72162);
        }
    }

    /* renamed from: d */
    private static C34598e m111361d() {
        return C34596c.m70633a(C17867d.m33078a(), "rec_user");
    }

    /* renamed from: e */
    private static void m111362e() {
        m111361d().mo61057b("to_report_rec_user_ids", "");
    }

    /* renamed from: f */
    private static String m111363f() {
        return m111361d().mo61051a("to_report_rec_user_ids", "");
    }

    /* renamed from: b */
    public final void mo99161b() {
        if (this.f139614a != null) {
            this.f139614a.clear();
        }
        List<String> list = this.f139615b;
        if (list != null) {
            list.clear();
        }
        m111362e();
    }

    /* renamed from: c */
    public final void mo99162c() {
        mo99159a();
        m111361d().mo61057b("to_report_rec_user_ids", mo99159a());
    }

    /* renamed from: g */
    private void m111364g() {
        if (!m111363f().isEmpty()) {
            for (Object obj : Arrays.asList(m111363f().split(","))) {
                if (this.f139614a.contains(obj)) {
                    this.f139614a.remove(obj);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo99159a() {
        String f = m111363f();
        if (this.f139614a == null || this.f139614a.size() == 0) {
            return f;
        }
        StringBuilder sb = new StringBuilder();
        if (!f.isEmpty()) {
            sb.append(f);
            sb.append(",");
        }
        m111364g();
        ArrayList arrayList = new ArrayList(this.f139614a);
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            sb.append(",");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",")) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    /* renamed from: a */
    public final void mo99160a(int i, String str) {
        if (this.f139615b == null) {
            this.f139615b = new ArrayList();
        }
        if (this.f139614a == null) {
            this.f139614a = new ArrayList();
        }
        String str2 = i + ":" + str;
        if (!this.f139615b.contains(str2)) {
            this.f139614a.add(str2);
            this.f139615b.add(str2);
        }
    }
}
