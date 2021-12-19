package com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C27910f;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.C40091a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.AbstractC40105b;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.C40104a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.MinorSettingData;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40128l;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89247c;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a */
public final class C40074a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f94126a = {new C89225r(C40074a.class, "restrictModeState", "getRestrictModeState()Lcom/ss/android/ugc/aweme/compliance/protection/digitalwellbeing/RestrictModeState;", 0)};

    /* renamed from: b */
    public static C40104a f94127b = m81043f();

    /* renamed from: c */
    public static String f94128c = "";

    /* renamed from: d */
    public static boolean f94129d;

    /* renamed from: e */
    public static final C40074a f94130e = new C40074a();

    /* renamed from: f */
    private static final AbstractC40105b f94131f;

    /* renamed from: g */
    private static final AbstractC89249e f94132g;

    /* renamed from: a */
    public static void m81037a(EnumC40076b bVar) {
        C89219l.m154721d(bVar, "");
        f94132g.mo143655a(f94126a[0], bVar);
    }

    /* renamed from: a */
    public final EnumC40076b mo69221a() {
        return (EnumC40076b) f94132g.mo23374a(this, f94126a[0]);
    }

    private C40074a() {
    }

    /* renamed from: b */
    public static boolean m81039b() {
        C40104a aVar = f94127b;
        if (aVar != null) {
            return aVar.isRestrictModeSelf();
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m81040c() {
        if (m81041d() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m81041d() {
        C40104a aVar = f94127b;
        if (aVar != null) {
            return aVar.getTimeLockSelfInMin();
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m81042e() {
        if (m81039b() || m81040c()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static C40104a m81043f() {
        String a = f94131f.mo60941a();
        C89219l.m154716b(a, "");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return (C40104a) new C27910f().mo46670a(a, C40104a.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0030, code lost:
        if (r1 != null) goto L_0x0032;
     */
    static {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a.<clinit>():void");
    }

    /* renamed from: a */
    public static void m81038a(C40104a aVar) {
        f94131f.mo60942a(new C27910f().mo46674b(aVar));
        Bundle bundle = new Bundle();
        bundle.putInt("filter_warn", C40061a.m81024d());
        AppLog.setCustomerHeader(bundle);
    }

    /* renamed from: a */
    public static String m81035a(String str) {
        C89219l.m154721d(str, "");
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int parseInt = Integer.parseInt(str);
            String str2 = String.valueOf(parseInt * parseInt) + "dmt";
            Charset forName = Charset.forName("UTF-8");
            C89219l.m154716b(forName, "");
            if (str2 != null) {
                byte[] bytes = str2.getBytes(forName);
                C89219l.m154716b(bytes, "");
                int length = bytes.length;
                for (int i = 0; i < length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ 5);
                }
                String a = C13607d.m24440a(bytes, bytes.length);
                C89219l.m154716b(a, "");
                return a;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a$a */
    public static final class C40075a extends AbstractC89247c<EnumC40076b> {

        /* renamed from: a */
        final /* synthetic */ Object f94133a;

        static {
            Covode.recordClassIndex(47847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40075a(Object obj, Object obj2) {
            super(obj2);
            this.f94133a = obj;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, EnumC40076b bVar, EnumC40076b bVar2) {
            C89219l.m154721d(iVar, "");
            bVar.name();
            bVar2.name();
        }
    }

    /* renamed from: a */
    public static void m81036a(ActivityC0945e eVar, int i, boolean z) {
        int i2;
        if (z) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.gdk).mo123053a();
        } else {
            if (i != 0) {
                C40104a aVar = f94127b;
                if (aVar != null) {
                    aVar.setRestrictModeSelf(true);
                }
                if (C40091a.m81077a()) {
                    m81037a(EnumC40076b.OPEN);
                }
                C33744d dVar = new C33744d();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                C39162r.m79460a("open_teen_mode_finish", dVar.mo59980a("is_login", g.isLogin() ? 1 : 0).f79943a);
                new C79459a(C17867d.m33078a()).mo123050a(R.string.fbz).mo123053a();
                C40061a.m81025e();
                C40061a.m81020a(null);
            } else if (eVar != null) {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.gdq).mo123053a();
                AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class);
                C89219l.m154716b(a, "");
                C1213t<C40128l.C40131a> tVar = ((TimeLockOptionViewModel) a).f94261a;
                C89219l.m154716b(tVar, "");
                C40128l.C40131a value = tVar.getValue();
                C40104a aVar2 = f94127b;
                int i3 = 0;
                if (aVar2 != null) {
                    if (value != null) {
                        i2 = value.f94225b;
                    } else {
                        i2 = 0;
                    }
                    aVar2.setTimeLockSelfInMin(i2);
                }
                C33744d dVar2 = new C33744d();
                if (value != null) {
                    i3 = value.f94225b;
                }
                C39162r.m79460a("open_time_lock_finish", dVar2.mo59980a("set_time", i3).f79943a);
            }
            m81038a(f94127b);
        }
        if (eVar != null) {
            C40106a.m81127a(eVar, i);
        }
    }

    /* renamed from: a */
    public static String m81034a(int i, boolean z, String str, boolean z2, ActivityC0945e eVar) {
        int i2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
        if (z2) {
            String a = m81035a(str);
            MinorSettingData minorSettingData = new MinorSettingData();
            minorSettingData.setEventType(3);
            minorSettingData.setEventValue(a);
            minorSettingData.setPassword(m81035a(f94128c));
            String b = new C27910f().mo46674b(C89070n.m154516a(minorSettingData));
            C89219l.m154716b(b, "");
            return b;
        } else if (i == 0) {
            String a2 = m81035a(str);
            MinorSettingData minorSettingData2 = new MinorSettingData();
            minorSettingData2.setEventType(2);
            if (z) {
                AbstractC1174ac a3 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class);
                C89219l.m154716b(a3, "");
                C1213t<C40128l.C40131a> tVar = ((TimeLockOptionViewModel) a3).f94261a;
                C89219l.m154716b(tVar, "");
                C40128l.C40131a value = tVar.getValue();
                if (value != null) {
                    i2 = value.f94225b;
                    minorSettingData2.setEventValue(String.valueOf(i2));
                    minorSettingData2.setPassword(a2);
                    String b2 = new C27910f().mo46674b(C89070n.m154516a(minorSettingData2));
                    C89219l.m154716b(b2, "");
                    return b2;
                }
            }
            i2 = 0;
            minorSettingData2.setEventValue(String.valueOf(i2));
            minorSettingData2.setPassword(a2);
            String b22 = new C27910f().mo46674b(C89070n.m154516a(minorSettingData2));
            C89219l.m154716b(b22, "");
            return b22;
        } else {
            String a4 = m81035a(str);
            MinorSettingData minorSettingData3 = new MinorSettingData();
            minorSettingData3.setEventType(1);
            minorSettingData3.setEventValue(String.valueOf(z ? 1 : 0));
            minorSettingData3.setPassword(a4);
            ArrayList arrayList = new ArrayList();
            arrayList.add(minorSettingData3);
            String b3 = new C27910f().mo46674b(arrayList);
            C89219l.m154716b(b3, "");
            return b3;
        }
    }
}
