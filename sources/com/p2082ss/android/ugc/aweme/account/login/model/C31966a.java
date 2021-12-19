package com.p2082ss.android.ugc.aweme.account.login.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2001c.AbstractC27540z;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32865l;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.a */
public final class C31966a {

    /* renamed from: f */
    public static final C31966a f76328f = new C31966a(R.string.h17, "U", "US", "+1");

    /* renamed from: g */
    public static final C31966a f76329g = new C31966a(R.string.ad0, "C", "CN", "+86");

    /* renamed from: h */
    public static AbstractC27540z<C31966a> f76330h;

    /* renamed from: i */
    public static final C31967a f76331i = new C31967a((byte) 0);

    /* renamed from: a */
    public final int f76332a;

    /* renamed from: b */
    public String f76333b;

    /* renamed from: c */
    public final String f76334c;

    /* renamed from: d */
    public final String f76335d;

    /* renamed from: e */
    public final String f76336e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31966a)) {
            return false;
        }
        C31966a aVar = (C31966a) obj;
        return this.f76332a == aVar.f76332a && C89219l.m154714a(this.f76333b, aVar.f76333b) && C89219l.m154714a(this.f76334c, aVar.f76334c) && C89219l.m154714a(this.f76335d, aVar.f76335d) && C89219l.m154714a(this.f76336e, aVar.f76336e);
    }

    public final int hashCode() {
        int i = this.f76332a * 31;
        String str = this.f76333b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f76334c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76335d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f76336e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "CountryCode(nameRes=" + this.f76332a + ", nameIndex=" + this.f76333b + ", alpha2=" + this.f76334c + ", code=" + this.f76335d + ", countryName=" + this.f76336e + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.a$a */
    public static final class C31967a {
        static {
            Covode.recordClassIndex(38721);
        }

        private C31967a() {
        }

        public /* synthetic */ C31967a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C31966a m66337a(int i) {
            AbstractC27540z<C31966a> zVar = C31966a.f76330h;
            if (zVar != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : zVar) {
                    if (t.mo57951a() == i) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    return (C31966a) arrayList2.get(0);
                }
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(38720);
        AbstractC27540z<C31966a> of = AbstractC27540z.m55074of(new C31966a(R.string.q5, "A", "AF", "+93"), new C31966a(R.string.hct, "A", "AX", "+358 18"), new C31966a(R.string.r1, "A", "AL", "+355"), new C31966a(R.string.s7, "A", "DZ", "+213"), new C31966a(R.string.tf, "A", "AS", "+1 684"), new C31966a(R.string.tp, "A", "AD", "+376"), new C31966a(R.string.tq, "A", "AO", "+244"), new C31966a(R.string.tr, "A", "AI", "+1 264"), new C31966a(R.string.tv, "A", "AG", "+1 268"), new C31966a(R.string.v5, "A", "AR", "+54"), new C31966a(R.string.v6, "A", "AM", "+374"), new C31966a(R.string.v7, "A", "AW", "+297"), new C31966a(R.string.v8, "A", "SH", "+247"), new C31966a(R.string.vo, "A", "AU", "+61"), new C31966a(R.string.vq, "A", "AT", "+43"), new C31966a(R.string.a1n, "A", "AZ", "+994"), new C31966a(R.string.a27, "B", "BS", "+1 242"), new C31966a(R.string.a28, "B", "BH", "+973"), new C31966a(R.string.a29, "B", "BD", "+880"), new C31966a(R.string.a2b, "B", "BB", "+1 246"), new C31966a(R.string.a2c, "B", "AG", "+1 268"), new C31966a(R.string.a3t, "B", "BY", "+375"), new C31966a(R.string.a3u, "B", "BE", "+32"), new C31966a(R.string.a3v, "B", "BZ", "+501"), new C31966a(R.string.a4h, "B", "BJ", "+229"), new C31966a(R.string.f98, "B", "BM", "+1 441"), new C31966a(R.string.a4k, "B", "BT", "+975"), new C31966a(R.string.a6h, "B", "BO", "+591"), new C31966a(R.string.a6i, "B", "BA", "+387"), new C31966a(R.string.a6j, "B", "BW", "+267"), new C31966a(R.string.a6s, "B", "BR", "+55"), new C31966a(R.string.a6u, "B", "IO", "+246"), new C31966a(R.string.a6v, "B", "VG", "+1 284"), new C31966a(R.string.a6z, "B", "BN", "+673"), new C31966a(R.string.a76, "B", "BG", "+359"), new C31966a(R.string.a78, "B", "BF", "+226"), new C31966a(R.string.a79, "B", "BI", "+257"), new C31966a(R.string.a8j, "C", "KH", "+855"), new C31966a(R.string.a8q, "C", "CM", "+237"), new C31966a(R.string.a8x, "C", "CA", "+1"), new C31966a(R.string.a9k, "C", "CV", "+238"), new C31966a(R.string.a9s, "C", "BQ", "+599 7"), new C31966a(R.string.a_c, "C", "KY", "+1 345"), new C31966a(R.string.a_m, "C", "CF", "+236"), new C31966a(R.string.a_p, "C", "TD", "+235"), new C31966a(R.string.acz, "C", "CL", "+56"), new C31966a(R.string.ad0, "C", "CN", "+86"), new C31966a(R.string.ads, "C", "CX", "+61"), new C31966a(R.string.agt, "C", "CC", "+61"), new C31966a(R.string.ahb, "C", "CO", "+57"), new C31966a(R.string.aro, "C", "KM", "+269"), new C31966a(R.string.f99, "C", "CG", "+242"), new C31966a(R.string.asb, "C", "CD", "+243"), new C31966a(R.string.au0, "C", "CK", "+682"), new C31966a(R.string.auc, "C", "CR", "+506"), new C31966a(R.string.b3e, "C", "HR", "+385"), new C31966a(R.string.b3g, "C", "CW", "+599 9"), new C31966a(R.string.b3m, "C", "CY", "+357"), new C31966a(R.string.f9_, "C", "CZ", "+420"), new C31966a(R.string.b3p, "C", "CI", "+225"), new C31966a(R.string.b5t, "D", "DK", "+45"), new C31966a(R.string.b6r, "D", "DG", "+246"), new C31966a(R.string.b8v, "D", "DJ", "+253"), new C31966a(R.string.ba5, "D", "DM", "+1 767"), new C31966a(R.string.ba6, "D", "DO", "+1"), new C31966a(R.string.bir, "E", "EC", "+593"), new C31966a(R.string.blo, "E", "EG", "+20"), new C31966a(R.string.blp, "E", "SV", "+503"), new C31966a(R.string.boa, "E", "GQ", "+240"), new C31966a(R.string.bob, "E", "ER", "+291"), new C31966a(R.string.bou, "E", "EE", "+372"), new C31966a(R.string.bov, "E", "SZ", "+268"), new C31966a(R.string.bow, "E", "ET", "+251"), new C31966a(R.string.bqu, "F", "FK", "+500"), new C31966a(R.string.brp, "F", "FO", "+298"), new C31966a(R.string.bvs, "F", "FJ", "+679"), new C31966a(R.string.bxi, "F", "FI", "+358"), new C31966a(R.string.c08, "F", "FR", "+33"), new C31966a(R.string.c0d, "F", "GF", "+594"), new C31966a(R.string.c0e, "F", "PF", "+689"), new C31966a(R.string.c2u, "G", "GA", "+241"), new C31966a(R.string.c2v, "G", "GM", "+220"), new C31966a(R.string.c3n, "G", "GE", "+995"), new C31966a(R.string.c3o, "G", "DE", "+49"), new C31966a(R.string.c3u, "G", "GH", "+233"), new C31966a(R.string.c3v, "G", "GI", "+350"), new C31966a(R.string.c51, "G", "GR", "+30"), new C31966a(R.string.c5e, "G", "GL", "+299"), new C31966a(R.string.c5f, "G", "GD", "+1 473"), new C31966a(R.string.c93, "G", "GP", "+590"), new C31966a(R.string.c94, "G", "GU", "+1 671"), new C31966a(R.string.c95, "G", "GT", "+502"), new C31966a(R.string.c96, "G", "GG", "+44"), new C31966a(R.string.c9r, "G", "GN", "+224"), new C31966a(R.string.c9s, "G", "GW", "+245"), new C31966a(R.string.c9t, "G", "GY", "+592"), new C31966a(R.string.c9u, "H", "HT", "+509"), new C31966a(R.string.cab, "H", "HN", "+504"), new C31966a(R.string.f9a, "H", "HK", "+852"), new C31966a(R.string.cay, "H", "HU", "+36"), new C31966a(R.string.cbd, "I", "IS", "+354"), new C31966a(R.string.clq, "I", "IN", "+91"), new C31966a(R.string.clr, "I", "ID", "+62"), new C31966a(R.string.cnv, "I", "IQ", "+964"), new C31966a(R.string.cnw, "I", "IE", "+353"), new C31966a(R.string.f9b, "I", "IM", "+44"), new C31966a(R.string.co1, "I", "IL", "+972"), new C31966a(R.string.co2, "I", "IT", "+39"), new C31966a(R.string.co4, "J", "JM", "+1 876"), new C31966a(R.string.co5, "J", "JP", "+81"), new C31966a(R.string.co_, "J", "JE", "+44"), new C31966a(R.string.cp9, "J", "JO", "+962"), new C31966a(R.string.cpg, "K", "KZ", "+7 6"), new C31966a(R.string.cpg, "K", "KZ", "+7 7"), new C31966a(R.string.cph, "K", "KE", "+254"), new C31966a(R.string.cs1, "K", "KI", "+686"), new C31966a(R.string.f9c, "K", "XK", "+383"), new C31966a(R.string.ct7, "K", "KW", "+965"), new C31966a(R.string.ct8, "K", "KG", "+996"), new C31966a(R.string.ctr, "L", "LA", "+856"), new C31966a(R.string.cty, "L", "LV", "+371"), new C31966a(R.string.cue, "L", "LB", "+961"), new C31966a(R.string.cug, "L", "LS", "+266"), new C31966a(R.string.cui, "L", "LR", "+231"), new C31966a(R.string.cul, "L", "LY", "+218"), new C31966a(R.string.cum, "L", "LI", "+423"), new C31966a(R.string.cvq, "L", "LT", "+370"), new C31966a(R.string.d02, "L", "LU", "+352"), new C31966a(R.string.f9d, "M", "MO", "+853"), new C31966a(R.string.d05, "M", "MG", "+261"), new C31966a(R.string.d0e, "M", "MW", "+265"), new C31966a(R.string.d0f, "M", "MY", "+60"), new C31966a(R.string.d0g, "M", "MV", "+960"), new C31966a(R.string.d0h, "M", "ML", "+223"), new C31966a(R.string.d0i, "M", "MT", "+356"), new C31966a(R.string.d0s, "M", "MH", "+692"), new C31966a(R.string.d0t, "M", "MQ", "+596"), new C31966a(R.string.d1j, "M", "MR", "+222"), new C31966a(R.string.d1k, "M", "MU", "+230"), new C31966a(R.string.d1q, "M", "YT", "+262"), new C31966a(R.string.d31, "M", "MX", "+52"), new C31966a(R.string.d36, "M", "FM", "+691"), new C31966a(R.string.fb_, "M", "MD", "+373"), new C31966a(R.string.d4c, "M", "MC", "+377"), new C31966a(R.string.d4e, "M", "MN", "+976"), new C31966a(R.string.d4f, "M", "ME", "+382"), new C31966a(R.string.d4g, "M", "MS", "+1 664"), new C31966a(R.string.d4o, "M", "MA", "+212"), new C31966a(R.string.d4w, "M", "MZ", "+258"), new C31966a(R.string.dc8, "M", "MM", "+95"), new C31966a(R.string.dcd, "N", "NA", "+264"), new C31966a(R.string.dcf, "N", "NR", "+674"), new C31966a(R.string.dci, "N", "NP", "+977"), new C31966a(R.string.dcj, "N", "NL", "+31"), new C31966a(R.string.dcs, "N", "NC", "+687"), new C31966a(R.string.df7, "N", "NZ", "+64"), new C31966a(R.string.dfg, "N", "NI", "+505"), new C31966a(R.string.dfl, "N", "NE", "+227"), new C31966a(R.string.dfm, "N", "NG", "+234"), new C31966a(R.string.dfn, "N", "NU", "+683"), new C31966a(R.string.dhh, "N", "NF", "+672"), new C31966a(R.string.d04, "N", "MK", "+389"), new C31966a(R.string.dhi, "N", "MP", "+1 670"), new C31966a(R.string.dhj, "N", "NO", "+47"), new C31966a(R.string.dkk, "O", "OM", "+968"), new C31966a(R.string.dmi, "P", "PK", "+92"), new C31966a(R.string.dmj, "P", "PW", "+680"), new C31966a(R.string.dmk, "P", "PS", "+970"), new C31966a(R.string.dml, "P", "PA", "+507"), new C31966a(R.string.dmm, "P", "PG", "+675"), new C31966a(R.string.dmn, "P", "PY", "+595"), new C31966a(R.string.dno, "P", "PE", "+51"), new C31966a(R.string.dny, "P", "PH", "+63"), new C31966a(R.string.dpd, "P", "PN", "+64"), new C31966a(R.string.eow, "P", "PL", "+48"), new C31966a(R.string.epw, "P", "PT", "+351"), new C31966a(R.string.eyl, "P", "PR", "+1 787"), new C31966a(R.string.eyl, "P", "PR", "+1 939"), new C31966a(R.string.f4b, "Q", "QA", "+974"), new C31966a(R.string.f9e, "R", "SURVEY", "+262"), new C31966a(R.string.fco, "R", "RO", "+40"), new C31966a(R.string.fcx, "R", "RU", "+7"), new C31966a(R.string.fcy, "R", "RW", "+250"), new C31966a(R.string.fda, "S", "WS", "+685"), new C31966a(R.string.fdb, "S", "SM", "+378"), new C31966a(R.string.fdc, "S", "SA", "+966"), new C31966a(R.string.fis, "S", "SN", "+221"), new C31966a(R.string.fiv, "S", "RS", "+381"), new C31966a(R.string.fpg, "S", "SC", "+248"), new C31966a(R.string.fxn, "S", "SL", "+232"), new C31966a(R.string.fy4, "S", "SG", "+65"), new C31966a(R.string.fy6, "S", "SX", "+1 721"), new C31966a(R.string.fyj, "S", "SK", "+421"), new C31966a(R.string.fyk, "S", "SI", "+386"), new C31966a(R.string.fz0, "S", "SB", "+677"), new C31966a(R.string.fz1, "S", "SO", "+252"), new C31966a(R.string.fzn, "S", "ZA", "+27"), new C31966a(R.string.fzo, "S", "GS", "+500"), new C31966a(R.string.fzp, "S", "KR", "+82"), new C31966a(R.string.fzr, "S", "SS", "+211"), new C31966a(R.string.fzt, "S", "ES", "+34"), new C31966a(R.string.g0r, "S", "LK", "+94"), new C31966a(R.string.g21, "S", "BL", "+590"), new C31966a(R.string.f9h, "S", "SH", "+290"), new C31966a(R.string.g23, "S", "KN", "+1 869"), new C31966a(R.string.f9f, "S", "LC", "+1 758"), new C31966a(R.string.g25, "S", "MF", "+590"), new C31966a(R.string.g26, "S", "PM", "+508"), new C31966a(R.string.f9i, "S", "VC", "+1 784"), new C31966a(R.string.g85, "S", "SD", "+249"), new C31966a(R.string.g8s, "S", "SR", "+597"), new C31966a(R.string.f9j, "S", "SJ", "+47 79"), new C31966a(R.string.g8v, "S", "SZ", "+268"), new C31966a(R.string.g8w, "S", "SE", "+46"), new C31966a(R.string.g9d, "S", "CH", "+41"), new C31966a(R.string.f9g, "S", "ST", "+239"), new C31966a(R.string.g_s, "T", "TW", "+886"), new C31966a(R.string.g_t, "T", "TJ", "+992"), new C31966a(R.string.g_w, "T", "TZ", "+255"), new C31966a(R.string.gbs, "T", "TH", "+66"), new C31966a(R.string.ben, "T", "TL", "+670"), new C31966a(R.string.gg8, "T", "TG", "+228"), new C31966a(R.string.gg9, "T", "TK", "+690"), new C31966a(R.string.gg_, "T", "TO", "+676"), new C31966a(R.string.ghb, "T", "TT", "+1 868"), new C31966a(R.string.gwq, "T", "TN", "+216"), new C31966a(R.string.gwr, "T", "TR", "+90"), new C31966a(R.string.gws, "T", "TM", "+993"), new C31966a(R.string.gwt, "T", "TC", "+1 649"), new C31966a(R.string.gx1, "T", "TV", "+688"), new C31966a(R.string.gyw, "U", "VI", "+1 340"), new C31966a(R.string.gz2, "U", "UG", "+256"), new C31966a(R.string.h0a, "U", "UA", "+380"), new C31966a(R.string.h15, "U", "AE", "+971"), new C31966a(R.string.h16, "U", "GB", "+44"), new C31966a(R.string.h17, "U", "US", "+1"), new C31966a(R.string.h4c, "U", "UY", "+598"), new C31966a(R.string.h5f, "U", "UZ", "+998"), new C31966a(R.string.h5w, "V", "VU", "+678"), new C31966a(R.string.h5y, "V", "VA", "+39 06 698"), new C31966a(R.string.h5y, "V", "VA", "+379"), new C31966a(R.string.h60, "V", "VE", "+58"), new C31966a(R.string.h_4, "V", "VN", "+84"), new C31966a(R.string.hae, "W", "WF", "+681"), new C31966a(R.string.f9k, "W", "EH", "+212"), new C31966a(R.string.hce, "Y", "YE", "+967"), new C31966a(R.string.hco, "Z", "ZM", "+260"), new C31966a(R.string.hcr, "Z", "ZW", "+263"));
        C89219l.m154716b(of, "");
        f76330h = of;
    }

    /* renamed from: a */
    public final int mo57951a() {
        try {
            return Integer.parseInt(C89361p.m154869a(C89361p.m154869a(this.f76335d, "+", "", false), " ", "", false));
        } catch (NumberFormatException unused) {
            return 86;
        }
    }

    /* renamed from: a */
    public final void mo57952a(String str) {
        C89219l.m154721d(str, "");
        this.f76333b = str;
    }

    /* renamed from: a */
    public static final void m66334a(Context context) {
        C31966a a;
        C89219l.m154721d(context, "");
        if (C31968b.m66339b()) {
            HashMap<String, List<PhoneCountryData>> map = C31968b.m66338a().getMap();
            C89219l.m154721d(context, "");
            ArrayList arrayList = new ArrayList();
            if (map != null && !map.isEmpty()) {
                for (String str : map.keySet()) {
                    List<PhoneCountryData> list = map.get(str);
                    if (list != null && !list.isEmpty()) {
                        for (PhoneCountryData phoneCountryData : list) {
                            if (!TextUtils.isEmpty(phoneCountryData.getDisplayname()) || !TextUtils.isEmpty(phoneCountryData.getKey())) {
                                C89219l.m154716b(str, "");
                                if (!(C32865l.m67464a(phoneCountryData, str, context) == null || (a = C32865l.m67464a(phoneCountryData, str, context)) == null)) {
                                    arrayList.add(a);
                                }
                            }
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    C89070n.m154530a((List) arrayList, (Comparator) new C32865l.C32866a());
                }
            }
            AbstractC27540z<C31966a> copyOf = AbstractC27540z.copyOf((Collection) arrayList);
            C89219l.m154716b(copyOf, "");
            C89219l.m154721d(copyOf, "");
            f76330h = copyOf;
        }
    }

    private /* synthetic */ C31966a(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, "");
    }

    public C31966a(int i, String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f76332a = i;
        this.f76333b = str;
        this.f76334c = str2;
        this.f76335d = str3;
        this.f76336e = str4;
    }
}
