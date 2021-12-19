package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.i18n.b */
public final class C8983b {

    /* renamed from: f */
    private static C8983b f22103f;

    /* renamed from: a */
    public String f22104a = "";

    /* renamed from: b */
    public long f22105b;

    /* renamed from: c */
    public Map<String, String> f22106c = new HashMap();

    /* renamed from: d */
    public I18nUpdateManager f22107d;

    /* renamed from: e */
    public I18nDbManager f22108e;

    /* renamed from: g */
    private I18nUpdateManager.AbstractC8981a f22109g = new I18nUpdateManager.AbstractC8981a() {
        /* class com.bytedance.android.livesdk.i18n.C8983b.C89841 */

        static {
            Covode.recordClassIndex(9879);
        }

        @Override // com.bytedance.android.livesdk.i18n.I18nUpdateManager.AbstractC8981a
        /* renamed from: a */
        public final void mo15218a(String str, long j, Map<String, String> map) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, C8983b.this.f22104a)) {
                if (TextUtils.isEmpty(str)) {
                    C3854a.m9453a(6, "i18n_translation", "locale is not matched on api result, locale in result is empty");
                } else {
                    C3854a.m9453a(6, "i18n_translation", "locale is not matched on api result, locale in result is ".concat(String.valueOf(str)));
                }
            } else if (j == C8983b.this.f22105b) {
                if (C8983b.this.f22106c != null && C8983b.this.f22106c.isEmpty()) {
                    C8983b.this.f22108e.queryTranslations();
                }
                C3854a.m9453a(3, "i18n_translation", "version from api is lower than or equals with version in memory");
            } else if (map == null || map.isEmpty()) {
                if (C8983b.this.f22106c != null && C8983b.this.f22106c.isEmpty()) {
                    C8983b.this.f22108e.queryTranslations();
                }
                C3854a.m9453a(3, "i18n_translation", "translations from api is empty, no need process");
            } else {
                C8983b.this.f22105b = j;
                C8983b.this.f22106c = map;
                C3854a.m9453a(3, "i18n_translation", "on api result, update translationMap in memory, version is " + C8983b.this.f22105b);
                C8983b.this.f22108e.updateTranslations(j, map);
            }
        }
    };

    /* renamed from: h */
    private I18nDbManager.AbstractC8975a f22110h = new I18nDbManager.AbstractC8975a() {
        /* class com.bytedance.android.livesdk.i18n.C8983b.C89852 */

        static {
            Covode.recordClassIndex(9880);
        }

        @Override // com.bytedance.android.livesdk.i18n.I18nDbManager.AbstractC8975a
        /* renamed from: a */
        public final void mo15211a(Exception exc) {
            C3854a.m9453a(6, "i18n_translation", exc.toString());
        }

        @Override // com.bytedance.android.livesdk.i18n.I18nDbManager.AbstractC8975a
        /* renamed from: a */
        public final void mo15213a(String str, Exception exc) {
            C3854a.m9453a(6, "i18n_translation", exc.toString());
            if (TextUtils.isEmpty(str) || !TextUtils.equals(C8983b.this.f22104a, str)) {
                if (TextUtils.isEmpty(str)) {
                    C3854a.m9453a(6, "i18n_translation", "on db query result, but locale from db is empty");
                } else {
                    C3854a.m9453a(3, "i18n_translation", "on db query result, but locale is not matched");
                }
            }
            C8983b.this.f22107d.mo15214a(C8983b.this.f22105b);
        }

        @Override // com.bytedance.android.livesdk.i18n.I18nDbManager.AbstractC8975a
        /* renamed from: a */
        public final void mo15212a(String str, I18nDbManager.C8976b bVar) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(C8983b.this.f22104a, str)) {
                if (TextUtils.isEmpty(str)) {
                    C3854a.m9453a(6, "i18n_translation", "on db query result, but locale from db is empty");
                } else {
                    C3854a.m9453a(3, "i18n_translation", "on db query result, but locale is not matched");
                }
                C8983b.this.f22107d.mo15214a(C8983b.this.f22105b);
            } else if (bVar.f22084b == C8983b.this.f22105b) {
                C3854a.m9453a(3, "i18n_translation", "version in db is lower than or equals with version in memory");
            } else if (bVar.f22085c == null || bVar.f22085c.isEmpty()) {
                C8983b.this.f22107d.mo15214a(C8983b.this.f22105b);
                C3854a.m9453a(3, "i18n_translation", "translations from db is empty, update from server");
            } else {
                C8983b.this.f22105b = bVar.f22084b;
                C8983b.this.f22106c = bVar.f22085c;
                C3854a.m9453a(3, "i18n_translation", "on db query result, update translationMap in memory, version is " + C8983b.this.f22105b);
                C8983b.this.f22107d.mo15214a(C8983b.this.f22105b);
            }
        }
    };

    static {
        Covode.recordClassIndex(9878);
    }

    /* renamed from: a */
    public static C8983b m17319a() {
        if (f22103f == null) {
            f22103f = new C8983b();
        }
        return f22103f;
    }

    private C8983b() {
    }

    /* renamed from: a */
    public final String mo15219a(String str) {
        if (this.f22106c.containsKey(str)) {
            return this.f22106c.get(str);
        }
        I18nUpdateManager i18nUpdateManager = this.f22107d;
        if (i18nUpdateManager == null) {
            return null;
        }
        i18nUpdateManager.mo15214a(this.f22105b);
        return null;
    }

    /* renamed from: a */
    public final void mo15220a(Locale locale) {
        C3854a.m9453a(3, "i18n_translation", "wanna switch locale");
        if (locale == null) {
            C3854a.m9453a(6, "i18n_translation", "new locale is empty, return");
            return;
        }
        String str = locale.getLanguage() + "_" + locale.getCountry().toLowerCase();
        C3854a.m9453a(3, "i18n_translation", "new locale is ".concat(String.valueOf(str)));
        if (TextUtils.equals(str, this.f22104a)) {
            C3854a.m9453a(3, "i18n_translation", "new locale is equals to current locale, return");
            return;
        }
        I18nUpdateManager i18nUpdateManager = this.f22107d;
        if (i18nUpdateManager != null) {
            C3854a.m9453a(3, "i18n_translation", "I18nUpdateManager destroy");
            i18nUpdateManager.f22089b.removeCallbacksAndMessages(null);
            if (i18nUpdateManager.f22095h != null && !i18nUpdateManager.f22095h.isDisposed()) {
                i18nUpdateManager.f22095h.dispose();
            }
            i18nUpdateManager.f22090c = null;
        }
        I18nDbManager i18nDbManager = this.f22108e;
        if (i18nDbManager != null) {
            i18nDbManager.destroy();
        }
        this.f22106c.clear();
        this.f22105b = 0;
        this.f22108e = new I18nDbManager(str, this.f22110h);
        this.f22107d = new I18nUpdateManager(str, this.f22109g);
        if (TextUtils.isEmpty(this.f22104a)) {
            C3854a.m9453a(3, "i18n_translation", "switch locale when app start, first query db");
            this.f22108e.queryTranslations();
        } else {
            C3854a.m9453a(3, "i18n_translation", "switch locale during app running, directly query api");
            this.f22107d.mo15214a(this.f22105b);
        }
        this.f22104a = str;
    }
}
