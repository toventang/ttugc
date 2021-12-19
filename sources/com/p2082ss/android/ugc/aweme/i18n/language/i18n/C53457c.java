package com.p2082ss.android.ugc.aweme.i18n.language.i18n;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18119c;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.i18n.c */
public final class C53457c {
    static {
        Covode.recordClassIndex(63027);
    }

    /* renamed from: a */
    private static boolean m98655a() {
        boolean z;
        IPluginService d = AabPluginServiceImpl.m114069d();
        if (d != null) {
            z = d.mo28892b();
        } else {
            z = false;
        }
        if (!C17867d.f42589m || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Locale m98651a(Context context) {
        return context.getResources().getConfiguration().locale;
    }

    /* renamed from: b */
    public static Context m98656b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m98659d(context);
        }
        return context;
    }

    /* renamed from: c */
    private static Context m98658c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: d */
    private static Context m98659d(Context context) {
        Resources resources = context.getResources();
        Locale a = C53438a.m98619a((String) null, (String) null, context);
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(a);
        configuration.setLocales(new LocaleList(a));
        try {
            if (SettingServiceImpl.m120782v().mo108866b(context)) {
                configuration.screenLayout = (configuration.screenLayout & -193) | 128;
            }
        } catch (Throwable unused) {
        }
        return context.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    private static void m98654a(Configuration configuration, Locale locale) {
        int i = Build.VERSION.SDK_INT;
        configuration.setLocale(locale);
    }

    /* renamed from: b */
    private static void m98657b(Context context, Locale locale) {
        if (context != null) {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            m98654a(configuration, locale);
            resources.updateConfiguration(configuration, null);
        }
    }

    /* renamed from: a */
    public static void m98652a(Context context, Locale locale) {
        m98657b(context, locale);
        if (!(context instanceof Application)) {
            m98657b(m98658c(context), locale);
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            country = Resources.getSystem().getConfiguration().locale.getCountry();
        }
        C53438a.m98621a(context, "key_current_region", country);
        C53438a.m98621a(context, "pref_language_key", locale.getLanguage());
    }

    /* renamed from: a */
    public static void m98653a(Context context, Locale locale, boolean z, AbstractC53459d dVar) {
        if (locale.equals(context.getResources().getConfiguration().locale)) {
            if (dVar != null) {
                dVar.mo90025a();
            }
        } else if (!z || !m98655a()) {
            m98652a(context, locale);
            if (dVar != null) {
                dVar.mo90025a();
            }
        } else {
            IPluginService d = AabPluginServiceImpl.m114069d();
            if (d != null) {
                C18119c.C18120a aVar = new C18119c.C18120a();
                aVar.f43156g = new Locale(locale.getLanguage());
                aVar.f43153d = new AbstractC18125a(context, locale, dVar) {
                    /* class com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c.C534581 */

                    /* renamed from: a */
                    WeakReference<Context> f122694a;

                    /* renamed from: b */
                    final /* synthetic */ Context f122695b;

                    /* renamed from: c */
                    final /* synthetic */ Locale f122696c;

                    /* renamed from: d */
                    final /* synthetic */ AbstractC53459d f122697d;

                    static {
                        Covode.recordClassIndex(63028);
                    }

                    @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
                    /* renamed from: a */
                    public final void mo28879a(String str, int i) {
                    }

                    @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
                    /* renamed from: a */
                    public final void mo28880a(String str, boolean z) {
                        Context context = this.f122694a.get();
                        if (context != null && !z) {
                            C53457c.m98652a(context, this.f122696c);
                            AbstractC53459d dVar = this.f122697d;
                            if (dVar != null) {
                                dVar.mo90025a();
                            }
                        }
                    }

                    {
                        this.f122695b = r2;
                        this.f122696c = r3;
                        this.f122697d = r4;
                        this.f122694a = new WeakReference<>(r2);
                    }
                };
                d.mo28889a(aVar.mo28877a());
            }
        }
    }
}
