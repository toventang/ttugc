package com.p2082ss.android.ugc.aweme.profile.survey;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.p2716ct.C40760a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.SurveyApi */
public final class SurveyApi {

    /* renamed from: a */
    private static final boolean f144810a = false;

    /* renamed from: b */
    private static final SurveyRetrofit f144811b = ((SurveyRetrofit) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(SurveyRetrofit.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.survey.SurveyApi$SurveyRetrofit */
    interface SurveyRetrofit {
        static {
            Covode.recordClassIndex(75307);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/survey/get/")
        C1731i<C40760a> getSurveyData();

        @AbstractC89722f(mo144276a = "/aweme/v1/survey/record/")
        C1731i<Object> recordAnswer(@AbstractC89736t(mo144292a = "action_type") int i, @AbstractC89736t(mo144292a = "dialog_id") int i2, @AbstractC89736t(mo144292a = "original_id") int i3);
    }

    /* renamed from: a */
    public static C1731i<C40760a> m115576a() {
        try {
            return f144811b.getSurveyData();
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(75306);
    }

    /* renamed from: a */
    static C1731i<Object> m115577a(C63881b bVar) {
        try {
            return f144811b.recordAnswer(bVar.f144812a, bVar.f144813b, bVar.f144814c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
