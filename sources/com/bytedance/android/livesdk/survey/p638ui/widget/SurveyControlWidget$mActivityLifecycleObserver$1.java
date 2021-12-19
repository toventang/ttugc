package com.bytedance.android.livesdk.survey.p638ui.widget;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.livesdk.survey.p638ui.C10805a;
import com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$mActivityLifecycleObserver$1 */
public final class SurveyControlWidget$mActivityLifecycleObserver$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ SurveyControlWidget f26132a;

    static {
        Covode.recordClassIndex(12485);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onActivityStop();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onActivityStop() {
        AbstractC10819a aVar;
        AbstractC10819a aVar2;
        C10805a aVar3 = this.f26132a.f26114b;
        if (aVar3 != null && (aVar = aVar3.f26014d) != null) {
            if ((aVar.f26034f == AbstractC10819a.EnumC10820a.QUESTION || aVar.f26034f == AbstractC10819a.EnumC10820a.FEEDBACK) && (aVar2 = aVar3.f26014d) != null) {
                aVar2.mo17727g();
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    SurveyControlWidget$mActivityLifecycleObserver$1(SurveyControlWidget surveyControlWidget) {
        this.f26132a = surveyControlWidget;
    }
}
