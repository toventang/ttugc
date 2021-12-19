package com.bytedance.android.livesdk.i18n;

import android.content.Context;
import android.text.TextUtils;
import androidx.room.C1532i;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.i18n.p560db.AbstractC8990b;
import com.bytedance.android.livesdk.i18n.p560db.AbstractC8994e;
import com.bytedance.android.livesdk.i18n.p560db.C8989a;
import com.bytedance.android.livesdk.i18n.p560db.C8993d;
import com.bytedance.android.livesdk.i18n.p560db.I18nDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

public class I18nDbManager {
    private static volatile AbstractC8990b informationDao;
    private static volatile boolean isPrepared;
    private static volatile AbstractC8994e translationDao;
    private Map<String, String> cachedTranslationMap;
    private long cachedVersion;
    private AbstractC8975a dbCallback;
    private boolean isQuerying;
    private boolean isUpdating;
    private String locale;
    private AbstractC88412b queryDisposable;
    private AbstractC88412b updateDisposable;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.i18n.I18nDbManager$a */
    public interface AbstractC8975a {
        static {
            Covode.recordClassIndex(9868);
        }

        /* renamed from: a */
        void mo15211a(Exception exc);

        /* renamed from: a */
        void mo15212a(String str, C8976b bVar);

        /* renamed from: a */
        void mo15213a(String str, Exception exc);
    }

    static {
        Covode.recordClassIndex(9867);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.i18n.I18nDbManager$b */
    public static class C8976b {

        /* renamed from: a */
        String f22083a;

        /* renamed from: b */
        long f22084b;

        /* renamed from: c */
        Map<String, String> f22085c;

        static {
            Covode.recordClassIndex(9869);
        }

        C8976b() {
        }
    }

    private void updateCachedContentIfNeed() {
        long j = this.cachedVersion;
        if (j >= 0) {
            updateTranslations(j, this.cachedTranslationMap);
            this.cachedVersion = -1;
            this.cachedTranslationMap = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void destroy() {
        C3854a.m9453a(3, "i18n_translation", "I18nDbManager destroy");
        AbstractC88412b bVar = this.queryDisposable;
        if (bVar != null && !bVar.isDisposed()) {
            this.queryDisposable.dispose();
        }
        AbstractC88412b bVar2 = this.updateDisposable;
        if (bVar2 != null && !bVar2.isDisposed()) {
            this.updateDisposable.dispose();
        }
        this.dbCallback = null;
    }

    /* access modifiers changed from: package-private */
    public void queryTranslations() {
        C3854a.m9453a(3, "i18n_translation", "query translations");
        if (this.isQuerying) {
            C3854a.m9453a(3, "i18n_translation", "is querying, return");
            return;
        }
        this.isQuerying = true;
        this.queryDisposable = AbstractC88924h.m154136a((Callable) new CallableC8986c(this)).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143190a(new C8987d(this), new C8998e(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C8976b lambda$queryTranslations$0$I18nDbManager() {
        C8989a a = informationDao.mo15224a("locale");
        if (a == null) {
            throw new Exception("locale info not found in db");
        } else if (TextUtils.equals(this.locale, a.f22119b)) {
            C8976b bVar = new C8976b();
            bVar.f22083a = this.locale;
            C8989a a2 = informationDao.mo15224a("version");
            if (a2 != null) {
                bVar.f22084b = Long.valueOf(a2.f22119b).longValue();
                List<C8993d> a3 = translationDao.mo15226a();
                if (!a3.isEmpty()) {
                    C3854a.m9453a(3, "i18n_translation", a3.size() + " translations found in db, locale is " + this.locale + ", version is " + bVar.f22084b);
                    HashMap hashMap = new HashMap();
                    for (C8993d dVar : a3) {
                        if (!TextUtils.isEmpty(dVar.f22123a) && !TextUtils.isEmpty(dVar.f22124b)) {
                            hashMap.put(dVar.f22123a, dVar.f22124b);
                        }
                    }
                    bVar.f22085c = hashMap;
                    return bVar;
                }
                throw new Exception("translations not found for locale: " + this.locale);
            }
            throw new Exception("version info not found in db");
        } else {
            throw new Exception("locale in db is " + a.f22119b + ", but you are request for " + this.locale);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$updateTranslations$4$I18nDbManager(Boolean bool) {
        this.isUpdating = false;
        updateCachedContentIfNeed();
    }

    /* renamed from: com_bytedance_android_livesdk_i18n_I18nDbManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m17311xaa0bb8af(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$queryTranslations$1$I18nDbManager(C8976b bVar) {
        this.isQuerying = false;
        AbstractC8975a aVar = this.dbCallback;
        if (aVar != null) {
            aVar.mo15212a(this.locale, bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$queryTranslations$2$I18nDbManager(Throwable th) {
        this.isQuerying = false;
        AbstractC8975a aVar = this.dbCallback;
        if (aVar != null) {
            aVar.mo15213a(this.locale, new Exception(th));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$updateTranslations$5$I18nDbManager(Throwable th) {
        this.isUpdating = false;
        AbstractC8975a aVar = this.dbCallback;
        if (aVar != null) {
            aVar.mo15211a(new Exception(th));
        }
        updateCachedContentIfNeed();
    }

    public static void prepareInit(Context context) {
        MethodCollector.m26663i(11327);
        if (!isPrepared) {
            synchronized (I18nDbManager.class) {
                try {
                    if (!isPrepared) {
                        if (context != null) {
                            I18nDatabase i18nDatabase = (I18nDatabase) C1532i.m5166a(m17311xaa0bb8af(context), I18nDatabase.class, "i18n_live").mo5096a();
                            translationDao = i18nDatabase.mo15222i();
                            informationDao = i18nDatabase.mo15223j();
                            isPrepared = true;
                        } else {
                            return;
                        }
                    }
                    MethodCollector.m26664o(11327);
                } finally {
                    MethodCollector.m26664o(11327);
                }
            }
        } else {
            MethodCollector.m26664o(11327);
        }
    }

    I18nDbManager(String str, AbstractC8975a aVar) {
        this.locale = str;
        this.dbCallback = aVar;
        prepareInit(m17311xaa0bb8af(C3966y.m9669e()));
    }

    /* access modifiers changed from: package-private */
    public void updateTranslations(long j, Map<String, String> map) {
        C3854a.m9453a(3, "i18n_translation", "update translations in db");
        if (TextUtils.isEmpty(this.locale) || map == null || map.isEmpty()) {
            if (TextUtils.isEmpty(this.locale)) {
                C3854a.m9453a(6, "i18n_translation", "locale is empty, return");
            } else {
                C3854a.m9453a(6, "i18n_translation", "translation map is empty, return");
            }
        } else if (this.isUpdating) {
            this.cachedVersion = j;
            this.cachedTranslationMap = map;
            C3854a.m9453a(3, "i18n_translation", "is updating, saved as cache and return");
        } else {
            this.isUpdating = true;
            this.updateDisposable = AbstractC88924h.m154136a((Callable) new CallableC8999f(this, map, j)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143190a(new C9000g(this), new C9001h(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean lambda$updateTranslations$3$I18nDbManager(Map map, long j) {
        Set<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                arrayList.add(new C8993d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        translationDao.mo15228b();
        translationDao.mo15227a(arrayList);
        informationDao.mo15225a(new C8989a("locale", this.locale));
        informationDao.mo15225a(new C8989a("version", String.valueOf(j)));
        C3854a.m9453a(3, "i18n_translation", arrayList.size() + " translations saved in db, locale is " + this.locale + ", version is " + j);
        return true;
    }
}
