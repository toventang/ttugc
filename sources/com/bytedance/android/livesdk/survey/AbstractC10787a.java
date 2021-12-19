package com.bytedance.android.livesdk.survey;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.survey.p638ui.widget.SurveyCardWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* renamed from: com.bytedance.android.livesdk.survey.a */
public interface AbstractC10787a extends AbstractC2953a {
    static {
        Covode.recordClassIndex(12388);
    }

    SurveyCardWidget getSurveyCardWidget();

    LiveWidget getSurveyControlWidget();

    void leavePlay();

    void release();

    boolean tryShowHoldingSurveyFromSlide();
}
