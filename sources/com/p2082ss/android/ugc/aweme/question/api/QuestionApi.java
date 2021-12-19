package com.p2082ss.android.ugc.aweme.question.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.question.api.QuestionApi */
public final class QuestionApi {

    /* renamed from: a */
    private static final RealApi f149492a = ((RealApi) RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(RealApi.class));

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.question.api.QuestionApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(78042);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/forum/question/detail/")
        C1731i<C66500a> queryQuestionDetail(@AbstractC22018z(mo35807a = "question_id") long j);

        @AbstractC22000h(mo35789a = "/tiktok/v1/forum/question/status/")
        C1731i<C66500a> queryQuestionValidation(@AbstractC22018z(mo35807a = "question_id") long j);

        @AbstractC22000h(mo35789a = "/tiktok/v1/forum/question/videos/")
        C1731i<C66501b> queryQuestionVideos(@AbstractC22018z(mo35807a = "question_id") long j, @AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2);

        @AbstractC22000h(mo35789a = "/tiktok/v1/forum/question/videos/")
        C1731i<C66501b> queryQuestionVideos(@AbstractC22018z(mo35807a = "question_id") long j, @AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2, @AbstractC22018z(mo35807a = "aweme_ids_str") String str);
    }

    static {
        Covode.recordClassIndex(78041);
    }

    /* renamed from: a */
    public static C66500a m118249a(long j) {
        C1731i<C66500a> queryQuestionDetail = f149492a.queryQuestionDetail(j);
        try {
            queryQuestionDetail.mo5547f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (queryQuestionDetail.mo5544c()) {
            try {
                throw queryQuestionDetail.mo5546e();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return queryQuestionDetail.mo5545d();
    }

    /* renamed from: b */
    public static C66500a m118251b(long j) {
        C1731i<C66500a> queryQuestionValidation = f149492a.queryQuestionValidation(j);
        try {
            queryQuestionValidation.mo5547f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (queryQuestionValidation.mo5544c()) {
            try {
                throw queryQuestionValidation.mo5546e();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return queryQuestionValidation.mo5545d();
    }

    /* renamed from: a */
    public static C66501b m118250a(long j, int i, int i2, String str) {
        C1731i<C66501b> iVar;
        if (str == null || str.isEmpty()) {
            iVar = f149492a.queryQuestionVideos(j, i, i2);
        } else {
            iVar = f149492a.queryQuestionVideos(j, i, i2, str);
        }
        try {
            iVar.mo5547f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (iVar.mo5544c()) {
            try {
                throw iVar.mo5546e();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return iVar.mo5545d();
    }
}
