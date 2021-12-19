package com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3381d;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3379b.AbstractC57948a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.c */
public final class C57959c {

    /* renamed from: a */
    public static final C57959c f132130a = new C57959c();

    private C57959c() {
    }

    static {
        Covode.recordClassIndex(67983);
    }

    /* renamed from: b */
    private static Context m104747b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static Locale m104743a(Context context) {
        C89219l.m154721d(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        Locale locale = resources.getConfiguration().locale;
        C89219l.m154716b(locale, "");
        return locale;
    }

    /* renamed from: a */
    private static void m104745a(Configuration configuration, Locale locale) {
        int i = Build.VERSION.SDK_INT;
        configuration.setLocale(locale);
    }

    /* renamed from: a */
    public static boolean m104746a(Locale locale, Locale locale2) {
        C89219l.m154721d(locale, "");
        C89219l.m154721d(locale2, "");
        return C89219l.m154714a(locale, locale2);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.c$a */
    public static final class C57960a implements AbstractC18125a {

        /* renamed from: a */
        public WeakReference<Context> f132131a;

        /* renamed from: b */
        final /* synthetic */ Locale f132132b;

        /* renamed from: c */
        final /* synthetic */ AbstractC57948a f132133c;

        /* renamed from: d */
        final /* synthetic */ Context f132134d;

        static {
            Covode.recordClassIndex(67984);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28879a(String str, int i) {
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28880a(String str, boolean z) {
            Context context = this.f132131a.get();
            if (context != null) {
                C89219l.m154716b(context, "");
                if (!z) {
                    C57959c.m104744a(context, this.f132132b);
                    AbstractC57948a aVar = this.f132133c;
                    if (aVar != null) {
                        aVar.mo95294a();
                    }
                }
            }
        }

        public C57960a(Locale locale, AbstractC57948a aVar, Context context) {
            this.f132132b = locale;
            this.f132133c = aVar;
            this.f132134d = context;
            this.f132131a = new WeakReference<>(context);
        }
    }

    /* renamed from: b */
    private static void m104748b(Context context, Locale locale) {
        if (context != null) {
            Resources resources = context.getResources();
            C89219l.m154716b(resources, "");
            Configuration configuration = resources.getConfiguration();
            C89219l.m154716b(configuration, "");
            m104745a(configuration, locale);
            resources.updateConfiguration(configuration, null);
        }
    }

    /* renamed from: a */
    public static void m104744a(Context context, Locale locale) {
        m104748b(context, locale);
        if (!(context instanceof Application)) {
            m104748b(m104747b(context), locale);
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            Resources system = Resources.getSystem();
            C89219l.m154716b(system, "");
            Locale locale2 = system.getConfiguration().locale;
            C89219l.m154716b(locale2, "");
            country = locale2.getCountry();
        }
        C57958b.m104740a(context, "key_current_region", country);
        C57958b.m104740a(context, "pref_language_key", locale.getLanguage());
    }
}
