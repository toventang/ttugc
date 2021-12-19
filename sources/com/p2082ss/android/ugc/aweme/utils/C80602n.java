package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.model.AppWidgetStruct;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.utils.n */
public final class C80602n {

    /* renamed from: a */
    static AppWidgetStruct f180229a;

    /* renamed from: b */
    public static final C80602n f180230b = new C80602n();

    /* renamed from: c */
    private static final AbstractC89244h f180231c = C89250i.m154773a((AbstractC89171a) C80603a.f180232a);

    /* renamed from: a */
    static Keva m139746a() {
        return (Keva) f180231c.getValue();
    }

    private C80602n() {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.n$a */
    static final class C80603a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C80603a f180232a = new C80603a();

        static {
            Covode.recordClassIndex(93876);
        }

        C80603a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("keva_repo_app_widget");
        }
    }

    static {
        Covode.recordClassIndex(93875);
    }

    /* renamed from: b */
    public final AppWidgetStruct mo123801b() {
        MethodCollector.m26663i(2389);
        AppWidgetStruct appWidgetStruct = null;
        if (C58195d.m105110c()) {
            if (f180229a == null) {
                synchronized (this) {
                    try {
                        if (f180229a == null) {
                            try {
                                appWidgetStruct = (AppWidgetStruct) new C27910f().mo46670a(m139746a().getString("keva_key_cache_data", ""), AppWidgetStruct.class);
                            } catch (Throwable unused) {
                            }
                            f180229a = appWidgetStruct;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(2389);
                        throw th;
                    }
                }
            }
            AppWidgetStruct appWidgetStruct2 = f180229a;
            MethodCollector.m26664o(2389);
            return appWidgetStruct2;
        }
        try {
            appWidgetStruct = (AppWidgetStruct) new C27910f().mo46670a(m139746a().getString("keva_key_cache_data", ""), AppWidgetStruct.class);
        } catch (Throwable unused2) {
        }
        MethodCollector.m26664o(2389);
        return appWidgetStruct;
    }
}
