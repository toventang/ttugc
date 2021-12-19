package com.p2082ss.android.ugc.aweme.kids.homepage.compliance;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.c */
public final class C57640c {

    /* renamed from: e */
    public static final C57641a f131558e = new C57641a((byte) 0);

    /* renamed from: a */
    KidsComplianceSettings f131559a;

    /* renamed from: b */
    final Keva f131560b;

    /* renamed from: c */
    KidsComplianceSettings f131561c;

    /* renamed from: d */
    String f131562d;

    static {
        Covode.recordClassIndex(67603);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.c$a */
    public static final class C57641a {
        static {
            Covode.recordClassIndex(67604);
        }

        private C57641a() {
        }

        public /* synthetic */ C57641a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final KidsComplianceSettings mo94945a() {
        KidsComplianceSettings kidsComplianceSettings = this.f131561c;
        if (kidsComplianceSettings == null) {
            return m104367b();
        }
        return kidsComplianceSettings;
    }

    public C57640c() {
        Keva repo = Keva.getRepo("compliance_setting");
        C89219l.m154716b(repo, "");
        this.f131560b = repo;
    }

    /* renamed from: b */
    private final KidsComplianceSettings m104367b() {
        KidsComplianceSettings kidsComplianceSettings = this.f131559a;
        if (kidsComplianceSettings != null) {
            return kidsComplianceSettings;
        }
        String string = this.f131560b.getString("cached_setting", "");
        C89219l.m154716b(string, "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.f131559a = (KidsComplianceSettings) new C27910f().mo46670a(string, KidsComplianceSettings.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.f131559a;
    }
}
