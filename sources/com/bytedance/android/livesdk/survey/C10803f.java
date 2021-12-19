package com.bytedance.android.livesdk.survey;

import com.bytedance.android.livesdk.survey.p636a.C10788a;
import com.bytedance.android.livesdk.survey.p636a.C10791d;
import com.bytedance.android.livesdk.survey.p638ui.C10805a;
import com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a;
import com.bytedance.android.livesdk.survey.p638ui.widget.SurveyCardWidget;
import com.bytedance.android.livesdk.survey.p638ui.widget.SurveyControlWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.f */
public class C10803f implements AbstractC10787a {
    private SurveyCardWidget mSurveyCardWidget;
    private SurveyControlWidget mSurveyControlWidget;

    static {
        Covode.recordClassIndex(12405);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.survey.AbstractC10787a
    public void release() {
        this.mSurveyCardWidget = null;
        this.mSurveyControlWidget = null;
    }

    @Override // com.bytedance.android.livesdk.survey.AbstractC10787a
    public SurveyCardWidget getSurveyCardWidget() {
        if (this.mSurveyCardWidget == null) {
            this.mSurveyCardWidget = new SurveyCardWidget();
        }
        SurveyCardWidget surveyCardWidget = this.mSurveyCardWidget;
        if (surveyCardWidget == null) {
            C89219l.m154715b();
        }
        return surveyCardWidget;
    }

    @Override // com.bytedance.android.livesdk.survey.AbstractC10787a
    public LiveWidget getSurveyControlWidget() {
        if (this.mSurveyControlWidget == null) {
            this.mSurveyControlWidget = new SurveyControlWidget();
        }
        SurveyControlWidget surveyControlWidget = this.mSurveyControlWidget;
        if (surveyControlWidget == null) {
            C89219l.m154715b();
        }
        return surveyControlWidget;
    }

    @Override // com.bytedance.android.livesdk.survey.AbstractC10787a
    public void leavePlay() {
        C10805a aVar;
        SurveyControlWidget surveyControlWidget = this.mSurveyControlWidget;
        if (surveyControlWidget != null && (aVar = surveyControlWidget.f26114b) != null) {
            aVar.mo17714a(aVar.mo17713a(), C10805a.C10806a.EnumC10807a.CANCEL, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.AbstractC10787a
    public boolean tryShowHoldingSurveyFromSlide() {
        C10805a aVar;
        C10788a aVar2;
        C10791d dVar;
        AbstractC10819a aVar3;
        SurveyControlWidget surveyControlWidget = this.mSurveyControlWidget;
        if (surveyControlWidget == null || (aVar = surveyControlWidget.f26114b) == null || (aVar2 = aVar.f26013c) == null || (dVar = aVar2.f25980d) == null || !dVar.mo17702a() || (aVar3 = aVar.f26014d) == null) {
            return false;
        }
        return aVar3.mo17726f();
    }
}
