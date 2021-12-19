package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.l */
public final class C68124l {

    /* renamed from: a */
    public static final C68124l f152532a = new C68124l();

    private C68124l() {
    }

    static {
        Covode.recordClassIndex(80320);
    }

    /* renamed from: c */
    public static boolean m120413c() {
        if (C16048b.m29633a().mo25412a(true, "data_saver_mode", 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m120414d() {
        if (m120412b() != 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m120412b() {
        if (!m120410a() || C51426a.m95802a(C17867d.m33078a())) {
            return 0;
        }
        return C16048b.m29633a().mo25412a(true, "data_saver_mode", 0);
    }

    /* renamed from: a */
    public static boolean m120410a() {
        C33842s sVar = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar, "");
        C33594aj<Integer> y = sVar.mo60081y();
        C89219l.m154716b(y, "");
        Integer c = y.mo59941c();
        if (c == null) {
            return false;
        }
        if (c.intValue() == 0) {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                c = iESSettingsProxy.getDataSaverSetting();
                C33842s sVar2 = C33842s.C33843a.f80132a;
                C89219l.m154716b(sVar2, "");
                C33594aj<Integer> y2 = sVar2.mo60081y();
                C89219l.m154716b(y2, "");
                y2.mo59940b(c);
            } catch (C16041a unused) {
                c = 2;
            }
            if (c == null) {
                return false;
            }
        }
        if (c.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m120411a(int i) {
        try {
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33594aj<Integer> y = sVar.mo60081y();
            C89219l.m154716b(y, "");
            y.mo59940b(Integer.valueOf(i));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
