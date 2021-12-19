package com.bytedance.android.livesdk.survey.p638ui.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.p060l.C1142o;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9134p;
import com.bytedance.android.livesdk.survey.C10795b;
import com.bytedance.android.livesdk.survey.C10800c;
import com.bytedance.android.livesdk.survey.C10801d;
import com.bytedance.android.livesdk.survey.p636a.C10788a;
import com.bytedance.android.livesdk.survey.p636a.C10790c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget */
public final class SurveyCardWidget extends LiveRecyclableWidget implements AbstractC10881a, AbstractC33974au {

    /* renamed from: a */
    public final AbstractC89171a<DataChannel> f26095a = new C10870b(this);

    /* renamed from: b */
    public boolean f26096b;

    /* renamed from: c */
    public boolean f26097c;

    /* renamed from: d */
    public float f26098d;

    /* renamed from: e */
    private ImageView f26099e;

    /* renamed from: f */
    private ViewGroup f26100f;

    /* renamed from: g */
    private LiveTextView f26101g;

    /* renamed from: h */
    private LinearLayoutCompat f26102h;

    /* renamed from: i */
    private ViewGroup f26103i;

    /* renamed from: j */
    private LiveTextView f26104j;

    /* renamed from: k */
    private final AbstractC89183m<String, Long, C89391z> f26105k = new C10869a(this);

    /* renamed from: l */
    private boolean f26106l = true;

    /* renamed from: m */
    private C10788a f26107m;

    static {
        Covode.recordClassIndex(12471);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgt;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget$b */
    static final class C10870b extends AbstractC89220m implements AbstractC89171a<DataChannel> {

        /* renamed from: a */
        final /* synthetic */ SurveyCardWidget f26109a;

        static {
            Covode.recordClassIndex(12473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10870b(SurveyCardWidget surveyCardWidget) {
            super(0);
            this.f26109a = surveyCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DataChannel invoke() {
            DataChannel dataChannel = this.f26109a.dataChannel;
            if (dataChannel != null) {
                return dataChannel.mo28319c(C10801d.class);
            }
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: a */
    public final void mo17748a() {
        this.f26106l = false;
        show();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: b */
    public final void mo17750b() {
        this.f26106l = true;
        hide();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: c */
    public final void mo17751c() {
        View view = this.contentView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C1142o.m3794a((ViewGroup) view);
        ViewGroup viewGroup = this.f26100f;
        if (viewGroup == null) {
            C89219l.m154710a("mQuestionContainer");
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = this.f26103i;
        if (viewGroup2 == null) {
            C89219l.m154710a("mFeedbackContainer");
        }
        viewGroup2.setVisibility(4);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: d */
    public final void mo17752d() {
        View view = this.contentView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C1142o.m3794a((ViewGroup) view);
        ViewGroup viewGroup = this.f26100f;
        if (viewGroup == null) {
            C89219l.m154710a("mQuestionContainer");
        }
        viewGroup.setVisibility(4);
        ViewGroup viewGroup2 = this.f26103i;
        if (viewGroup2 == null) {
            C89219l.m154710a("mFeedbackContainer");
        }
        viewGroup2.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo17753e() {
        ViewGroup.LayoutParams layoutParams;
        if (getView() != null && this.isViewValid && this.context != null) {
            View view = getView();
            Object obj = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    obj = dataChannel.mo28318b(C9076co.class);
                }
                if (!C89219l.m154714a(obj, (Object) false)) {
                    layoutParams2.bottomMargin = C3966y.m9653a(this.f26098d);
                    View view2 = getView();
                    if (view2 != null) {
                        view2.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget$e */
    static final class View$OnClickListenerC10873e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SurveyCardWidget f26112a;

        static {
            Covode.recordClassIndex(12476);
        }

        View$OnClickListenerC10873e(SurveyCardWidget surveyCardWidget) {
            this.f26112a = surveyCardWidget;
        }

        public final void onClick(View view) {
            this.f26112a.f26095a.invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget$c */
    static final class C10871c extends AbstractC89220m implements AbstractC89172b<C4419h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SurveyCardWidget f26110a;

        static {
            Covode.recordClassIndex(12474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10871c(SurveyCardWidget surveyCardWidget) {
            super(1);
            this.f26110a = surveyCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C4419h hVar) {
            float f;
            C4419h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (this.f26110a.f26096b != hVar2.f12018a) {
                this.f26110a.f26096b = hVar2.f12018a;
                SurveyCardWidget surveyCardWidget = this.f26110a;
                float f2 = surveyCardWidget.f26098d;
                if (hVar2.f12018a) {
                    f = 48.0f;
                } else {
                    f = -48.0f;
                }
                surveyCardWidget.f26098d = f2 + f;
                this.f26110a.mo17753e();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget$d */
    static final class C10872d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SurveyCardWidget f26111a;

        static {
            Covode.recordClassIndex(12475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10872d(SurveyCardWidget surveyCardWidget) {
            super(1);
            this.f26111a = surveyCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            float f;
            boolean booleanValue = bool.booleanValue();
            if (this.f26111a.f26097c != booleanValue) {
                this.f26111a.f26097c = booleanValue;
                SurveyCardWidget surveyCardWidget = this.f26111a;
                float f2 = surveyCardWidget.f26098d;
                if (booleanValue) {
                    f = 80.0f;
                } else {
                    f = -80.0f;
                }
                surveyCardWidget.f26098d = f2 + f;
                this.f26111a.mo17753e();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: a */
    public final void mo17749a(C10788a aVar) {
        C89219l.m154721d(aVar, "");
        this.f26107m = aVar;
        C10790c cVar = aVar.f25978b.get(0);
        LiveTextView liveTextView = this.f26101g;
        if (liveTextView == null) {
            C89219l.m154710a("mTitle");
        }
        liveTextView.setText(cVar.f25984b);
        LinearLayoutCompat linearLayoutCompat = this.f26102h;
        if (linearLayoutCompat == null) {
            C89219l.m154710a("mChooseContainer");
        }
        C10790c cVar2 = aVar.f25978b.get(0);
        C89219l.m154716b(cVar2, "");
        C10882b.m19488a(linearLayoutCompat, cVar2, R.layout.bdd, 24, 8.0f, this.f26105k);
        LiveTextView liveTextView2 = this.f26104j;
        if (liveTextView2 == null) {
            C89219l.m154710a("mFeedbackTip");
        }
        liveTextView2.setText(aVar.f25979c);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById = findViewById(R.id.ecb);
        C89219l.m154716b(findViewById, "");
        this.f26099e = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.ecg);
        C89219l.m154716b(findViewById2, "");
        this.f26100f = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(R.id.eci);
        C89219l.m154716b(findViewById3, "");
        this.f26101g = (LiveTextView) findViewById3;
        View findViewById4 = findViewById(R.id.eca);
        C89219l.m154716b(findViewById4, "");
        this.f26102h = (LinearLayoutCompat) findViewById4;
        View findViewById5 = findViewById(R.id.ecd);
        C89219l.m154716b(findViewById5, "");
        this.f26103i = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(R.id.ecf);
        C89219l.m154716b(findViewById6, "");
        this.f26104j = (LiveTextView) findViewById6;
        this.f26098d = 52.0f;
        mo17753e();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28314b(C4437h.class, (AbstractC89172b) new C10871c(this)).mo28314b(C9134p.class, (AbstractC89172b) new C10872d(this));
        }
        ImageView imageView = this.f26099e;
        if (imageView == null) {
            C89219l.m154710a("mCloseButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC10873e(this));
        if (this.f26106l) {
            hide();
        } else {
            show();
        }
        C10788a aVar = this.f26107m;
        if (aVar != null) {
            mo17749a(aVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget$a */
    static final class C10869a extends AbstractC89220m implements AbstractC89183m<String, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SurveyCardWidget f26108a;

        static {
            Covode.recordClassIndex(12472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10869a(SurveyCardWidget surveyCardWidget) {
            super(2);
            this.f26108a = surveyCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Long l) {
            String str2 = str;
            long longValue = l.longValue();
            C89219l.m154721d(str2, "");
            DataChannel dataChannel = this.f26108a.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28320c(C10800c.class, new C10795b(str2, longValue));
            }
            return C89391z.f203057a;
        }
    }
}
