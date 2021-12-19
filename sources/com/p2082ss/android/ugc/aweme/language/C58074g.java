package com.p2082ss.android.ugc.aweme.language;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.language.g */
public class C58074g implements Serializable {

    /* renamed from: a */
    private static HashMap<String, String> f132312a;

    private C58074g() {
    }

    public static C58074g get() {
        return EnumC58075a.INSTANCE.f132315b;
    }

    /* renamed from: com.ss.android.ugc.aweme.language.g$a */
    enum EnumC58075a {
        INSTANCE;
        

        /* renamed from: b */
        C58074g f132315b = new C58074g((byte) 0);

        static {
            Covode.recordClassIndex(68118);
        }

        private EnumC58075a(String str) {
        }
    }

    public String getStoreIdc() {
        String g = C58071d.m104913g();
        if (!TextUtils.isEmpty(g)) {
            return f132312a.get(g);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(68117);
        HashMap<String, String> hashMap = new HashMap<>();
        f132312a = hashMap;
        hashMap.put("AG", "maliva");
        f132312a.put("AI", "maliva");
        f132312a.put("BB", "maliva");
        f132312a.put("BM", "maliva");
        f132312a.put("BS", "maliva");
        f132312a.put("BZ", "maliva");
        f132312a.put("CA", "maliva");
        f132312a.put("CC", "maliva");
        f132312a.put("CR", "maliva");
        f132312a.put("CU", "maliva");
        f132312a.put("GD", "maliva");
        f132312a.put("GT", "maliva");
        f132312a.put("HN", "maliva");
        f132312a.put("HT", "maliva");
        f132312a.put("JM", "maliva");
        f132312a.put("MX", "maliva");
        f132312a.put("NI", "maliva");
        f132312a.put("PA", "maliva");
        f132312a.put("US", "maliva");
        f132312a.put("VE", "maliva");
        f132312a.put("AU", "maliva");
        f132312a.put("CK", "maliva");
        f132312a.put("CX", "maliva");
        f132312a.put("FJ", "maliva");
        f132312a.put("GU", "maliva");
        f132312a.put("NZ", "maliva");
        f132312a.put("PG", "maliva");
        f132312a.put("TO", "maliva");
        f132312a.put("AO", "maliva");
        f132312a.put("BF", "maliva");
        f132312a.put("BI", "maliva");
        f132312a.put("BJ", "maliva");
        f132312a.put("BW", "maliva");
        f132312a.put("CF", "maliva");
        f132312a.put("CG", "maliva");
        f132312a.put("CM", "maliva");
        f132312a.put("CV", "maliva");
        f132312a.put("DZ", "maliva");
        f132312a.put("EG", "maliva");
        f132312a.put("ET", "maliva");
        f132312a.put("GA", "maliva");
        f132312a.put("GH", "maliva");
        f132312a.put("GM", "maliva");
        f132312a.put("GN", "maliva");
        f132312a.put("GQ", "maliva");
        f132312a.put("KE", "maliva");
        f132312a.put("LY", "maliva");
        f132312a.put("MA", "maliva");
        f132312a.put("MG", "maliva");
        f132312a.put("MR", "maliva");
        f132312a.put("MU", "maliva");
        f132312a.put("MW", "maliva");
        f132312a.put("MZ", "maliva");
        f132312a.put("NA", "maliva");
        f132312a.put("NG", "maliva");
        f132312a.put("RW", "maliva");
        f132312a.put("SD", "maliva");
        f132312a.put("SN", "maliva");
        f132312a.put("SO", "maliva");
        f132312a.put("TN", "maliva");
        f132312a.put("TZ", "maliva");
        f132312a.put("UG", "maliva");
        f132312a.put("ZA", "maliva");
        f132312a.put("ZM", "maliva");
        f132312a.put("ZR", "maliva");
        f132312a.put("ZW", "maliva");
        f132312a.put("AQ", "maliva");
        f132312a.put("BV", "maliva");
        f132312a.put("AR", "maliva");
        f132312a.put("AW", "maliva");
        f132312a.put("BO", "maliva");
        f132312a.put("BR", "maliva");
        f132312a.put("CL", "maliva");
        f132312a.put("CO", "maliva");
        f132312a.put("EC", "maliva");
        f132312a.put("GY", "maliva");
        f132312a.put("PE", "maliva");
        f132312a.put("PY", "maliva");
        f132312a.put("UY", "maliva");
        f132312a.put("AD", "maliva");
        f132312a.put("AM", "maliva");
        f132312a.put("AT", "maliva");
        f132312a.put("BA", "maliva");
        f132312a.put("BE", "maliva");
        f132312a.put("BG", "maliva");
        f132312a.put("BY", "maliva");
        f132312a.put("CH", "maliva");
        f132312a.put("CZ", "maliva");
        f132312a.put("DE", "maliva");
        f132312a.put("DK", "maliva");
        f132312a.put("EE", "maliva");
        f132312a.put("ES", "maliva");
        f132312a.put("FI", "maliva");
        f132312a.put("FR", "maliva");
        f132312a.put("GB", "maliva");
        f132312a.put("GR", "maliva");
        f132312a.put("HR", "maliva");
        f132312a.put("HU", "maliva");
        f132312a.put("IE", "maliva");
        f132312a.put("IS", "maliva");
        f132312a.put("IT", "maliva");
        f132312a.put("LT", "maliva");
        f132312a.put("LV", "maliva");
        f132312a.put("MC", "maliva");
        f132312a.put("MD", "maliva");
        f132312a.put("MT", "maliva");
        f132312a.put("NL", "maliva");
        f132312a.put("NO", "maliva");
        f132312a.put("PL", "maliva");
        f132312a.put("PT", "maliva");
        f132312a.put("RO", "maliva");
        f132312a.put("RU", "maliva");
        f132312a.put("SE", "maliva");
        f132312a.put("SK", "maliva");
        f132312a.put("SM", "maliva");
        f132312a.put("UA", "maliva");
        f132312a.put("UK", "maliva");
        f132312a.put("YU", "maliva");
        f132312a.put("AE", "maliva");
        f132312a.put("AF", "maliva");
        f132312a.put("AL", "maliva");
        f132312a.put("AZ", "maliva");
        f132312a.put("BH", "maliva");
        f132312a.put("BN", "maliva");
        f132312a.put("BT", "maliva");
        f132312a.put("KZ", "maliva");
        f132312a.put("CY", "maliva");
        f132312a.put("IL", "maliva");
        f132312a.put("IQ", "maliva");
        f132312a.put("IR", "maliva");
        f132312a.put("JO", "maliva");
        f132312a.put("KP", "maliva");
        f132312a.put("KW", "maliva");
        f132312a.put("LB", "maliva");
        f132312a.put("LU", "maliva");
        f132312a.put("MN", "maliva");
        f132312a.put("MV", "maliva");
        f132312a.put("OM", "maliva");
        f132312a.put("QA", "maliva");
        f132312a.put("SA", "maliva");
        f132312a.put("SG", "maliva");
        f132312a.put("SY", "maliva");
        f132312a.put("TJ", "maliva");
        f132312a.put("TM", "maliva");
        f132312a.put("VA", "maliva");
        f132312a.put("YE", "maliva");
        f132312a.put("CN", "alisg");
        f132312a.put("HK", "alisg");
        f132312a.put("ID", "alisg");
        f132312a.put("IN", "alisg");
        f132312a.put("JP", "alisg");
        f132312a.put("KH", "alisg");
        f132312a.put("KR", "alisg");
        f132312a.put("LA", "alisg");
        f132312a.put("MO", "alisg");
        f132312a.put("MY", "alisg");
        f132312a.put("NP", "alisg");
        f132312a.put("PH", "alisg");
        f132312a.put("PK", "alisg");
        f132312a.put("TH", "alisg");
        f132312a.put("TW", "alisg");
        f132312a.put("VN", "alisg");
        f132312a.put("LK", "alisg");
        f132312a.put("MM", "alisg");
        f132312a.put("BD", "alisg");
    }

    /* synthetic */ C58074g(byte b) {
        this();
    }
}
