package com.p2082ss.android.ugc.aweme.profile.survey;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2716ct.C40760a;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.d */
public class C63883d {

    /* renamed from: a */
    static final boolean f144815a = false;

    /* renamed from: c */
    private static volatile C63883d f144816c;

    /* renamed from: b */
    public AbstractC63884a f144817b;

    /* renamed from: com.ss.android.ugc.aweme.profile.survey.d$a */
    public interface AbstractC63884a {
        static {
            Covode.recordClassIndex(75312);
        }

        /* renamed from: a */
        void mo103423a();

        /* renamed from: a */
        void mo103424a(C40760a aVar);
    }

    static {
        Covode.recordClassIndex(75311);
    }

    private C63883d() {
        if (f144816c != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    /* renamed from: a */
    public static C63883d m115581a() {
        MethodCollector.m26663i(8196);
        if (f144816c == null) {
            synchronized (C63883d.class) {
                try {
                    if (f144816c == null) {
                        f144816c = new C63883d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8196);
                    throw th;
                }
            }
        }
        C63883d dVar = f144816c;
        MethodCollector.m26664o(8196);
        return dVar;
    }

    /* renamed from: a */
    public static void m115582a(C63881b bVar) {
        C1731i<Object> a = SurveyApi.m115577a(bVar);
        if (a != null) {
            a.mo5532a(C63886f.f144819a);
        }
    }
}
