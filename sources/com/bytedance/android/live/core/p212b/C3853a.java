package com.bytedance.android.live.core.p212b;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.bytedance.ies.p1206f.C17309b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.b.a */
public final class C3853a {

    /* renamed from: a */
    private static Locale f10641a = new Locale("hi", "IN");

    /* renamed from: b */
    private static Locale f10642b = new Locale("te", "IN");

    /* renamed from: c */
    private static Locale f10643c = new Locale("ta", "IN");

    /* renamed from: d */
    private static Locale f10644d = new Locale("mr", "IN");

    /* renamed from: e */
    private static Locale f10645e = new Locale("bn", "IN");

    /* renamed from: f */
    private static Locale f10646f = new Locale("gu", "IN");

    /* renamed from: g */
    private static Locale f10647g = new Locale("kn", "IN");

    /* renamed from: h */
    private static Locale f10648h = new Locale("ml", "IN");

    /* renamed from: i */
    private static Locale f10649i = new Locale("pa", "IN");

    /* renamed from: j */
    private static Locale f10650j = new Locale("or", "IN");

    /* renamed from: k */
    private static Locale f10651k = new Locale("in", "ID");

    /* renamed from: l */
    private static Locale f10652l = new Locale("vi", "VN");

    /* renamed from: m */
    private static Locale f10653m = Locale.JAPAN;

    /* renamed from: n */
    private static Locale f10654n = Locale.KOREA;

    /* renamed from: o */
    private static Locale f10655o = new Locale("th", "TH");

    /* renamed from: p */
    private static Locale f10656p = new Locale("pt", "PT");

    /* renamed from: q */
    private static Locale f10657q = new Locale("ms");

    /* renamed from: r */
    private static Locale f10658r = Locale.FRANCE;

    /* renamed from: s */
    private static Locale f10659s = new Locale("ru", "RU");

    /* renamed from: t */
    private static Locale f10660t = new Locale("es");

    /* renamed from: u */
    private static Locale f10661u = new Locale(C15401f.f37600a);

    /* renamed from: v */
    private static HashSet<String> f10662v = new HashSet<>(Arrays.asList("en", "hi", "in", "vi", "ko", "ja", "th", "ta", "te", "mr", "ms", "pt", "bn", "fr", "ru", "es", C15401f.f37600a));

    /* renamed from: a */
    public static String m9448a() {
        return m9449a(C3966y.m9669e()).getLanguage();
    }

    /* renamed from: b */
    public static String m9451b() {
        String str;
        if (C6802e.f16868c) {
            String string = C34822d.m71158a(C3966y.m9669e(), "test_setting", 0).getString("pref_carrier", "US");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        try {
            str = ((TelephonyManager) m9447a(C3966y.m9669e(), "phone")).getSimCountryIso();
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.getDefault());
        }
        return str;
    }

    static {
        Covode.recordClassIndex(4382);
    }

    /* renamed from: a */
    private static Locale m9449a(Context context) {
        Locale b = m9452b(context);
        if (b != null) {
            return m9450a(b);
        }
        return Locale.getDefault();
    }

    /* renamed from: a */
    private static Locale m9450a(Locale locale) {
        if (TextUtils.isEmpty(locale.getCountry())) {
            return new Locale(locale.getLanguage(), Locale.getDefault().getCountry(), locale.getVariant());
        }
        return locale;
    }

    /* renamed from: b */
    private static Locale m9452b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Locale locale = (Locale) C4139e.C4140a.f11575b.mo46670a(C17309b.m32048a(context, C17309b.f41588b).mo27620a("sp_lanuage_last_select_tag", ""), Locale.class);
            if (!(locale instanceof Locale)) {
                return null;
            }
            return locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m9447a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12971);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(12971);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
