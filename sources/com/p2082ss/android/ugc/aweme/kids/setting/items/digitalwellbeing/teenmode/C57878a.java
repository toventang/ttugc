package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode;

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
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34507d;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.AbstractC57884a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.MinorSettingData;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.C57887b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.AbstractActivityC57888a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57906e;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57913i;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.nio.charset.Charset;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a */
public final class C57878a {

    /* renamed from: a */
    public static TeenageModeSetting f131951a = m104641d();

    /* renamed from: b */
    public static String f131952b = "";

    /* renamed from: c */
    public static final C57878a f131953c = new C57878a();

    /* renamed from: d */
    private static final AbstractC57884a f131954d;

    private C57878a() {
    }

    /* renamed from: b */
    public static int m104639b() {
        TeenageModeSetting teenageModeSetting = f131951a;
        if (teenageModeSetting != null) {
            return teenageModeSetting.getTimeLockSelfInMin();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m104640c() {
        if (m104638a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m104638a() {
        if (m104639b() > 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(67889);
        Object a = C34507d.m70492a(C17867d.m33078a(), AbstractC57884a.class);
        C89219l.m154716b(a, "");
        f131954d = (AbstractC57884a) a;
    }

    /* renamed from: d */
    private static TeenageModeSetting m104641d() {
        String a = f131954d.mo60948a();
        C89219l.m154716b(a, "");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return (TeenageModeSetting) new C27910f().mo46670a(a, TeenageModeSetting.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m104637a(TeenageModeSetting teenageModeSetting) {
        f131954d.mo60949a(new C27910f().mo46674b(teenageModeSetting));
    }

    /* renamed from: a */
    public static String m104634a(String str) {
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

    /* renamed from: a */
    public static void m104636a(ActivityC0945e eVar, boolean z) {
        int i;
        if (z) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.gdk).mo123053a();
        } else {
            if (eVar != null) {
                new C79459a(C17867d.m33078a()).mo123052a(eVar.getResources().getString(R.string.gdq)).mo123053a();
                AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class);
                C89219l.m154716b(a, "");
                C1213t<C57906e.C57909a> tVar = ((TimeLockOptionViewModel) a).f132036a;
                C89219l.m154716b(tVar, "");
                C57906e.C57909a value = tVar.getValue();
                TeenageModeSetting teenageModeSetting = f131951a;
                if (teenageModeSetting != null) {
                    if (value != null) {
                        i = value.f132004b;
                    } else {
                        i = 0;
                    }
                    teenageModeSetting.setTimeLockSelfInMin(i);
                }
            }
            m104637a(f131951a);
        }
        if (eVar != null) {
            C57887b.m104656a(eVar);
            ((AbstractActivityC57888a) eVar).mo95214a(C57913i.m104702b());
        }
    }

    /* renamed from: a */
    public static String m104635a(boolean z, String str, boolean z2, ActivityC0945e eVar) {
        int i;
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
        if (z2) {
            String a = m104634a(str);
            MinorSettingData minorSettingData = new MinorSettingData();
            minorSettingData.setEventType(2);
            minorSettingData.setEventValue(a);
            minorSettingData.setPassword(m104634a(f131952b));
            String b = new C27910f().mo46674b(C89070n.m154516a(minorSettingData));
            C89219l.m154716b(b, "");
            return b;
        }
        String a2 = m104634a(str);
        MinorSettingData minorSettingData2 = new MinorSettingData();
        minorSettingData2.setEventType(1);
        if (z) {
            AbstractC1174ac a3 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class);
            C89219l.m154716b(a3, "");
            C1213t<C57906e.C57909a> tVar = ((TimeLockOptionViewModel) a3).f132036a;
            C89219l.m154716b(tVar, "");
            C57906e.C57909a value = tVar.getValue();
            if (value != null) {
                i = value.f132004b;
                minorSettingData2.setEventValue(String.valueOf(i));
                minorSettingData2.setPassword(a2);
                String b2 = new C27910f().mo46674b(C89070n.m154516a(minorSettingData2));
                C89219l.m154716b(b2, "");
                return b2;
            }
        }
        i = 0;
        minorSettingData2.setEventValue(String.valueOf(i));
        minorSettingData2.setPassword(a2);
        String b22 = new C27910f().mo46674b(C89070n.m154516a(minorSettingData2));
        C89219l.m154716b(b22, "");
        return b22;
    }
}
