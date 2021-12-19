package com.bytedance.bddatefmt;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

public class BDDateFormat {

    /* renamed from: a */
    public static final C13146a f31986a = new C13146a((byte) 0);

    /* renamed from: b */
    private final String f31987b;

    static {
        Covode.recordClassIndex(15091);
    }

    private final native String nFormat(long j, String str, String str2);

    private final native String nFormatRelative(int i, int i2, String str);

    /* access modifiers changed from: package-private */
    public final native String nFormatAbbr(int i, int i2, String str);

    /* renamed from: com.bytedance.bddatefmt.BDDateFormat$a */
    public static final class C13146a {
        static {
            Covode.recordClassIndex(15092);
        }

        private C13146a() {
        }

        public /* synthetic */ C13146a(byte b) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ String m23657a(int i, EnumC13147a aVar) {
            MethodCollector.m26663i(7935);
            Locale locale = Locale.getDefault();
            C89219l.m154709a((Object) locale, "");
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(locale, "");
            BDDateFormat bDDateFormat = new BDDateFormat();
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(locale, "");
            String nFormatAbbr = bDDateFormat.nFormatAbbr(i, aVar.ordinal(), BDDateFormat.m23654a(locale));
            MethodCollector.m26664o(7935);
            return nFormatAbbr;
        }
    }

    public BDDateFormat() {
        this("");
    }

    public BDDateFormat(String str) {
        C89219l.m154719c(str, "");
        this.f31987b = str;
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38962a("rex");
        C58032m.m104852a(uptimeMillis, "rex");
    }

    /* renamed from: a */
    static String m23654a(Locale locale) {
        C89219l.m154721d(locale, "");
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (C89219l.m154714a((Object) language, (Object) "zh") && (country == null || country.length() == 0)) {
            return language + "-Hans-CN";
        }
        String b = m23655b(locale);
        if ((b instanceof String) && b != null) {
            return b;
        }
        return "";
    }

    /* renamed from: b */
    private static String m23655b(Locale locale) {
        C89219l.m154719c(locale, "");
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (C89219l.m154714a((Object) language, (Object) "zh")) {
            if (C89219l.m154714a((Object) country, (Object) "TW") || C89219l.m154714a((Object) country, (Object) "HK") || C89219l.m154714a((Object) country, (Object) "MO")) {
                return language + "-Hant-" + country;
            }
            if (C89219l.m154714a((Object) country, (Object) "CN") || C89219l.m154714a((Object) country, (Object) "SG")) {
                return language + "-Hans-" + country;
            }
        }
        return language + '-' + country;
    }

    /* renamed from: a */
    public static /* synthetic */ String m23653a(BDDateFormat bDDateFormat, long j) {
        Locale locale = Locale.getDefault();
        C89219l.m154709a((Object) locale, "");
        return bDDateFormat.mo21223a(j, locale);
    }

    /* renamed from: a */
    public final String mo21223a(long j, Locale locale) {
        MethodCollector.m26663i(8090);
        C89219l.m154719c(locale, "");
        String nFormat = nFormat(j, m23654a(locale), this.f31987b);
        MethodCollector.m26664o(8090);
        return nFormat;
    }
}
