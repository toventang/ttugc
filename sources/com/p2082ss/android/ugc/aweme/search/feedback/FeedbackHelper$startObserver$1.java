package com.p2082ss.android.ugc.aweme.search.feedback;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.survey.C67748a;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.feedback.FeedbackHelper$startObserver$1 */
public final class FeedbackHelper$startObserver$1 implements AbstractC80379eg {

    /* renamed from: a */
    final /* synthetic */ ActivityC0945e f151073a;

    static {
        Covode.recordClassIndex(79069);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        AbstractC80379eg.C80380a.onCreate(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC80379eg.C80380a.onDestroy(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        AbstractC80379eg.C80380a.onPause(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC80379eg.C80380a.onStart(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        AbstractC80379eg.C80380a.onStop(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    public final void onResume() {
        C67469ad adVar;
        String str;
        int i;
        if (C67434a.f151075b) {
            C67434a.f151075b = false;
            ActivityC0945e eVar = this.f151073a;
            if (eVar != null) {
                AbstractC67567q a = C67486am.m119565a(eVar.hashCode());
                String str2 = null;
                if (a != null) {
                    adVar = a.mo106431c();
                } else {
                    adVar = null;
                }
                C67748a aVar = new C67748a();
                if (adVar != null) {
                    str = adVar.f151151a;
                } else {
                    str = null;
                }
                C67540c a2 = aVar.mo106480a(str);
                int i2 = -1;
                if (a != null) {
                    i = a.mo106426a();
                } else {
                    i = -1;
                }
                C67540c f = a2.mo106486f(C67458j.m119528a(i));
                if (adVar != null) {
                    str2 = adVar.f151152b;
                }
                C67511b o = f.mo106482b(str2).mo106459o(C67458j.m119529a(eVar));
                C89219l.m154721d("close", "");
                o.mo96786a("button_type", "close");
                Integer num = C67434a.f151074a;
                if (num != null) {
                    i2 = num.intValue();
                }
                o.mo96785a("is_from_survey_card", i2);
                o.mo96792f();
            }
        }
    }

    FeedbackHelper$startObserver$1(ActivityC0945e eVar) {
        this.f151073a = eVar;
    }
}
