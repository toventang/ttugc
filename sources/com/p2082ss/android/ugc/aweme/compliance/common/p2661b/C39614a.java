package com.p2082ss.android.ugc.aweme.compliance.common.p2661b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AgeGateInfo;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39241b;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.model.Strategy;
import com.p2082ss.android.ugc.aweme.compliance.api.model.TrafficControl;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.b.a */
public final class C39614a {

    /* renamed from: g */
    public static final C39615a f93388g = new C39615a((byte) 0);

    /* renamed from: a */
    public final Keva f93389a;

    /* renamed from: b */
    public List<C39241b> f93390b;

    /* renamed from: c */
    public Boolean f93391c;

    /* renamed from: d */
    public Boolean f93392d;

    /* renamed from: e */
    public String f93393e;

    /* renamed from: f */
    public Long f93394f;

    /* renamed from: h */
    private ComplianceSetting f93395h;

    /* renamed from: i */
    private Integer f93396i;

    /* renamed from: j */
    private Integer f93397j;

    /* renamed from: k */
    private ComplianceSetting f93398k;

    /* renamed from: l */
    private int f93399l;

    /* renamed from: m */
    private Boolean f93400m;

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b.a$b */
    public static final class C39616b extends C27895a<List<? extends C39241b>> {
        static {
            Covode.recordClassIndex(47330);
        }
    }

    static {
        Covode.recordClassIndex(47328);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.b.a$a */
    public static final class C39615a {
        static {
            Covode.recordClassIndex(47329);
        }

        private C39615a() {
        }

        public /* synthetic */ C39615a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final ComplianceSetting mo69034c() {
        ComplianceSetting complianceSetting = this.f93398k;
        if (complianceSetting == null) {
            return m80442f();
        }
        return complianceSetting;
    }

    /* renamed from: d */
    public final int mo69035d() {
        return this.f93389a.getInt("vpa_content_choice", 0);
    }

    public C39614a() {
        Keva repo = Keva.getRepo("compliance_setting");
        C89219l.m154716b(repo, "");
        this.f93389a = repo;
    }

    /* renamed from: a */
    public final Integer mo69025a() {
        Integer num = this.f93396i;
        if (num != null) {
            return num;
        }
        return Integer.valueOf(this.f93389a.getInt("remove_photo_sensitive_status", 0));
    }

    /* renamed from: e */
    public final Boolean mo69036e() {
        Boolean bool = this.f93400m;
        if (bool != null) {
            return bool;
        }
        return Boolean.valueOf(this.f93389a.getBoolean("need_block_af_sharing", false));
    }

    /* renamed from: f */
    private final ComplianceSetting m80442f() {
        ComplianceSetting complianceSetting = this.f93395h;
        if (complianceSetting != null) {
            return complianceSetting;
        }
        String string = this.f93389a.getString("cached_setting", "");
        C89219l.m154716b(string, "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.f93395h = (ComplianceSetting) new C27910f().mo46670a(string, ComplianceSetting.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.f93395h;
    }

    /* renamed from: b */
    public final Integer mo69032b() {
        int i;
        AgeGateInfo ageGateInfo;
        Integer num = this.f93397j;
        if (num != null) {
            return num;
        }
        Keva keva = this.f93389a;
        ComplianceSetting c = mo69034c();
        if (c == null || (ageGateInfo = c.getAgeGateInfo()) == null) {
            i = 0;
        } else {
            i = ageGateInfo.getRegisterAgeGateAction();
        }
        return Integer.valueOf(keva.getInt("register_age_gate_action", i));
    }

    /* renamed from: a */
    public final void mo69026a(int i) {
        this.f93399l = i;
        this.f93389a.storeInt("vpa_content_choice", i);
    }

    /* renamed from: b */
    private final void m80441b(ComplianceSetting complianceSetting) {
        this.f93395h = complianceSetting;
        if (complianceSetting == null) {
            this.f93389a.clear();
        } else {
            this.f93389a.storeString("cached_setting", new C27910f().mo46674b(complianceSetting));
        }
    }

    /* renamed from: a */
    public final void mo69027a(ComplianceSetting complianceSetting) {
        TrafficControl trafficControl;
        this.f93398k = complianceSetting;
        C39608b.f93377h = true;
        if (complianceSetting != null) {
            trafficControl = complianceSetting.getTrafficControl();
        } else {
            trafficControl = null;
        }
        m80440a(trafficControl);
        if (complianceSetting != null) {
            complianceSetting.setTrafficControl(null);
        }
        m80441b(complianceSetting);
    }

    /* renamed from: a */
    private void m80440a(TrafficControl trafficControl) {
        List<Strategy> strategy;
        HashMap<String, Strategy> hashMap = new HashMap<>();
        if (trafficControl == null) {
            C39608b.f93376g = hashMap;
            this.f93389a.storeString("traffic_control", "");
            return;
        }
        if (C89219l.m154714a((Object) trafficControl.getBusiness(), (Object) "child_mode") && (strategy = trafficControl.getStrategy()) != null) {
            for (T t : strategy) {
                List<String> domains = t.getDomains();
                if (domains != null) {
                    Iterator<T> it = domains.iterator();
                    while (it.hasNext()) {
                        hashMap.put(it.next(), t);
                    }
                }
            }
        }
        C39608b.f93376g = hashMap;
        this.f93389a.storeString("traffic_control", C80342dg.m139300a().mo46674b(trafficControl));
    }

    /* renamed from: b */
    public final void mo69033b(Integer num) {
        this.f93397j = num;
        Keva keva = this.f93389a;
        if (num == null) {
            C89219l.m154715b();
        }
        keva.storeInt("register_age_gate_action", num.intValue());
    }

    /* renamed from: a */
    public final void mo69028a(Boolean bool) {
        boolean z;
        this.f93400m = bool;
        Keva keva = this.f93389a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        keva.storeBoolean("need_block_af_sharing", z);
    }

    /* renamed from: a */
    public final void mo69029a(Integer num) {
        int i;
        this.f93396i = num;
        Keva keva = this.f93389a;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        keva.storeInt("remove_photo_sensitive_status", i);
    }

    /* renamed from: a */
    public final void mo69030a(Long l) {
        long j;
        this.f93394f = l;
        Keva keva = this.f93389a;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        keva.storeLong("age_gate_block_device_register_expire_time", j);
    }

    /* renamed from: a */
    public final void mo69031a(List<C39241b> list) {
        this.f93390b = list;
        this.f93389a.storeString("account_banned_detail", new C27910f().mo46674b(list));
    }
}
