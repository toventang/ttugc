package com.p2082ss.android.ugc.aweme.p3452ml.data;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p1782z.p1783a.p1784a.C23723b;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.android.p2160ml.C30076d;
import com.p2082ss.android.ugc.aweme.language.C58073f;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeaturePhoneTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59981e;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.video.C80750l;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.data.c */
public final class C60032c implements C30076d.AbstractC30077a {

    /* renamed from: a */
    public static boolean f136747a = C59975a.f136570a;

    /* renamed from: b */
    public static ArrayList<String> f136748b = C89070n.m154525d("hour", "access", "signal", "country", "p_dev", "sp_dev", "tcp_rtt", "tcp_band", "http_rtt", "net_quality_lv", "is_wifi", "is_charge", "battery_pct");

    /* renamed from: c */
    public static final C60033a f136749c = new C60033a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.ml.data.c$a */
    public static final class C60033a {
        static {
            Covode.recordClassIndex(70498);
        }

        private C60033a() {
        }

        public /* synthetic */ C60033a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ml.data.c$b */
    public static final class C60034b {

        /* renamed from: a */
        static C60032c f136750a = new C60032c((byte) 0);

        /* renamed from: b */
        public static final C60034b f136751b = new C60034b();

        private C60034b() {
        }

        static {
            Covode.recordClassIndex(70499);
        }
    }

    private C60032c() {
    }

    static {
        Covode.recordClassIndex(70497);
    }

    public /* synthetic */ C60032c(byte b) {
        this();
    }

    @Override // com.p2082ss.android.p2160ml.C30076d.AbstractC30077a
    /* renamed from: a */
    public final Object mo53445a(String str) {
        boolean z;
        int i = 1;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && str != null) {
            switch (str.hashCode()) {
                case -1483091692:
                    if (str.equals("tcp_rtt")) {
                        return Integer.valueOf(C59981e.m109502b(System.currentTimeMillis()).f35574a);
                    }
                    break;
                case -1423461020:
                    if (str.equals("access")) {
                        return C59981e.m109501a(System.currentTimeMillis());
                    }
                    break;
                case -902467928:
                    if (str.equals("signal")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - C59981e.f136583e > 30000) {
                            Context a = C17867d.m33078a();
                            C59981e.f136582d = C80750l.m140052a(a).mo123955b(a);
                            C59981e.f136583e = currentTimeMillis;
                        }
                        return Integer.valueOf(C59981e.f136582d);
                    }
                    break;
                case -897593495:
                    if (str.equals("is_charge")) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (currentTimeMillis2 - C59981e.f136587i > 30000) {
                            AbstractC23724c a2 = C23723b.m44832a(C17867d.m33078a());
                            if (a2 != null) {
                                C59981e.f136586h = a2.mo39166c();
                            }
                            C59981e.f136587i = currentTimeMillis2;
                        }
                        return Integer.valueOf(C59981e.f136586h ? 1 : 0);
                    }
                    break;
                case -896251085:
                    if (str.equals("sp_dev")) {
                        return Integer.valueOf(C62845i.m113259b() ? 1 : 0);
                    }
                    break;
                case -481815380:
                    if (str.equals("net_quality_lv")) {
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (currentTimeMillis3 - C59981e.f136585g > 30000) {
                            int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                            C59981e.f136584f = effectiveConnectionType;
                            if (effectiveConnectionType < 0) {
                                C59981e.f136584f = 0;
                            }
                            C59981e.f136585g = currentTimeMillis3;
                        }
                        return Integer.valueOf(C59981e.f136584f);
                    }
                    break;
                case -132747717:
                    if (str.equals("http_rtt")) {
                        return Integer.valueOf(C59981e.m109502b(System.currentTimeMillis()).f35575b);
                    }
                    break;
                case 3208676:
                    if (str.equals("hour")) {
                        long currentTimeMillis4 = System.currentTimeMillis();
                        if (currentTimeMillis4 - C59981e.f136581c > 900000) {
                            C59981e.f136581c = currentTimeMillis4;
                            Calendar instance = Calendar.getInstance();
                            instance.setTimeInMillis(C59981e.f136581c);
                            C59981e.f136580b = instance.get(11);
                        }
                        return Integer.valueOf(C59981e.f136580b);
                    }
                    break;
                case 106363846:
                    if (str.equals("p_dev")) {
                        return Integer.valueOf(C62845i.m113257a() ? 1 : 0);
                    }
                    break;
                case 957831062:
                    if (str.equals("country")) {
                        if (C59981e.f136579a == null) {
                            C59981e.f136579a = C58073f.m104920a();
                        }
                        return C59981e.f136579a;
                    }
                    break;
                case 1268302803:
                    if (str.equals("tcp_band")) {
                        return Integer.valueOf(C59981e.m109502b(System.currentTimeMillis()).f35576c);
                    }
                    break;
                case 2023669679:
                    if (str.equals("battery_pct")) {
                        long currentTimeMillis5 = System.currentTimeMillis();
                        if (currentTimeMillis5 - C59981e.f136589k > 30000) {
                            AbstractC23724c a3 = C23723b.m44832a(C17867d.m33078a());
                            if (a3 != null) {
                                C59981e.f136588j = a3.mo39168e();
                            }
                            C59981e.f136589k = currentTimeMillis5;
                        }
                        return Integer.valueOf(C59981e.f136588j);
                    }
                    break;
                case 2082342154:
                    if (str.equals("is_wifi")) {
                        String a4 = C59981e.m109501a(System.currentTimeMillis());
                        if (TextUtils.isEmpty(a4) || !a4.contains("wifi")) {
                            i = 0;
                        }
                        return Integer.valueOf(i);
                    }
                    break;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo97487a(Map<String, Object> map, FeaturePhoneTypeConfig featurePhoneTypeConfig) {
        if (map == null || featurePhoneTypeConfig == null || !featurePhoneTypeConfig.getEnable()) {
            return false;
        }
        if (featurePhoneTypeConfig.isNeedAllPhoneFeatures()) {
            Iterator<String> it = f136748b.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Object a = mo53445a(next);
                if (a != null) {
                    C89219l.m154716b(next, "");
                    map.put(next, a);
                }
            }
            return true;
        }
        List<String> phoneFeatureList = featurePhoneTypeConfig.getPhoneFeatureList();
        if (phoneFeatureList != null) {
            for (String str : phoneFeatureList) {
                Object a2 = mo53445a(str);
                if (a2 != null) {
                    map.put(str, a2);
                }
            }
        }
        return true;
    }
}
