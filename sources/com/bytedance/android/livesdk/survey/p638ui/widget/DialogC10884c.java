package com.bytedance.android.livesdk.survey.p638ui.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.p060l.C1142o;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.p542g.DialogC8776b;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.android.livesdk.survey.C10795b;
import com.bytedance.android.livesdk.survey.C10800c;
import com.bytedance.android.livesdk.survey.C10801d;
import com.bytedance.android.livesdk.survey.p636a.C10788a;
import com.bytedance.android.livesdk.survey.p636a.C10790c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.widget.c */
public final class DialogC10884c extends DialogC8776b implements AbstractC10881a {

    /* renamed from: a */
    public final AbstractC89171a<DataChannel> f26142a = new C10886b(this);

    /* renamed from: b */
    public final DataChannel f26143b;

    /* renamed from: c */
    private LayoutInflater f26144c;

    /* renamed from: d */
    private boolean f26145d;

    /* renamed from: e */
    private View f26146e;

    /* renamed from: i */
    private ViewGroup f26147i;

    /* renamed from: j */
    private ImageView f26148j;

    /* renamed from: k */
    private ViewGroup f26149k;

    /* renamed from: l */
    private LiveTextView f26150l;

    /* renamed from: m */
    private LinearLayoutCompat f26151m;

    /* renamed from: n */
    private ViewGroup f26152n;

    /* renamed from: o */
    private LiveTextView f26153o;

    /* renamed from: p */
    private final AbstractC89183m<String, Long, C89391z> f26154p = new C10885a(this);

    /* renamed from: q */
    private final boolean f26155q;

    static {
        Covode.recordClassIndex(12489);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: b */
    public final void mo17750b() {
        hide();
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.c$b */
    static final class C10886b extends AbstractC89220m implements AbstractC89171a<DataChannel> {

        /* renamed from: a */
        final /* synthetic */ DialogC10884c f26157a;

        static {
            Covode.recordClassIndex(12491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10886b(DialogC10884c cVar) {
            super(0);
            this.f26157a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DataChannel invoke() {
            return this.f26157a.f26143b.mo28319c(C10801d.class);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: a */
    public final void mo17748a() {
        if (!C89219l.m154714a(this.f26143b.mo28318b(C9074cm.class), (Object) true)) {
            show();
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: c */
    public final void mo17751c() {
        ViewGroup viewGroup = this.f26147i;
        if (viewGroup == null) {
            C89219l.m154710a("mContent");
        }
        C1142o.m3795a(viewGroup, null);
        ViewGroup viewGroup2 = this.f26149k;
        if (viewGroup2 == null) {
            C89219l.m154710a("mQuestionContainer");
        }
        viewGroup2.setVisibility(0);
        ViewGroup viewGroup3 = this.f26152n;
        if (viewGroup3 == null) {
            C89219l.m154710a("mFeedbackContainer");
        }
        viewGroup3.setVisibility(4);
        ImageView imageView = this.f26148j;
        if (imageView == null) {
            C89219l.m154710a("mCloseButton");
        }
        imageView.setVisibility(0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: d */
    public final void mo17752d() {
        ViewGroup viewGroup = this.f26147i;
        if (viewGroup == null) {
            C89219l.m154710a("mContent");
        }
        C1142o.m3795a(viewGroup, null);
        ViewGroup viewGroup2 = this.f26149k;
        if (viewGroup2 == null) {
            C89219l.m154710a("mQuestionContainer");
        }
        viewGroup2.setVisibility(4);
        ViewGroup viewGroup3 = this.f26152n;
        if (viewGroup3 == null) {
            C89219l.m154710a("mFeedbackContainer");
        }
        viewGroup3.setVisibility(0);
        ImageView imageView = this.f26148j;
        if (imageView == null) {
            C89219l.m154710a("mCloseButton");
        }
        imageView.setVisibility(4);
    }

    /* renamed from: e */
    private final void m19489e() {
        if (!this.f26145d) {
            this.f26145d = true;
            LayoutInflater from = LayoutInflater.from(getContext());
            this.f26144c = from;
            View view = null;
            if (from == null || (view = C1764a.m5927a(from, R.layout.b7i, null, false)) == null) {
                C89219l.m154715b();
            }
            this.f26146e = view;
            if (view == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById = view.findViewById(R.id.ecl);
            C89219l.m154716b(findViewById, "");
            this.f26147i = (ViewGroup) findViewById;
            View view2 = this.f26146e;
            if (view2 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById2 = view2.findViewById(R.id.eck);
            C89219l.m154716b(findViewById2, "");
            this.f26148j = (ImageView) findViewById2;
            View view3 = this.f26146e;
            if (view3 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById3 = view3.findViewById(R.id.eco);
            C89219l.m154716b(findViewById3, "");
            this.f26149k = (ViewGroup) findViewById3;
            View view4 = this.f26146e;
            if (view4 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById4 = view4.findViewById(R.id.ecp);
            C89219l.m154716b(findViewById4, "");
            this.f26150l = (LiveTextView) findViewById4;
            View view5 = this.f26146e;
            if (view5 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById5 = view5.findViewById(R.id.ecj);
            C89219l.m154716b(findViewById5, "");
            this.f26151m = (LinearLayoutCompat) findViewById5;
            View view6 = this.f26146e;
            if (view6 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById6 = view6.findViewById(R.id.ecm);
            C89219l.m154716b(findViewById6, "");
            this.f26152n = (ViewGroup) findViewById6;
            View view7 = this.f26146e;
            if (view7 == null) {
                C89219l.m154710a("mRootView");
            }
            View findViewById7 = view7.findViewById(R.id.ecn);
            C89219l.m154716b(findViewById7, "");
            this.f26153o = (LiveTextView) findViewById7;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.c$c */
    static final class View$OnClickListenerC10887c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC10884c f26158a;

        static {
            Covode.recordClassIndex(12492);
        }

        View$OnClickListenerC10887c(DialogC10884c cVar) {
            this.f26158a = cVar;
        }

        public final void onClick(View view) {
            this.f26158a.f26142a.invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.c$d */
    static final class DialogInterface$OnDismissListenerC10888d implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ DialogC10884c f26159a;

        static {
            Covode.recordClassIndex(12493);
        }

        DialogInterface$OnDismissListenerC10888d(DialogC10884c cVar) {
            this.f26159a = cVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f26159a.f26142a.invoke();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m19489e();
        View view = this.f26146e;
        if (view == null) {
            C89219l.m154710a("mRootView");
        }
        setContentView(view);
        hide();
        ImageView imageView = this.f26148j;
        if (imageView == null) {
            C89219l.m154710a("mCloseButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC10887c(this));
        setOnDismissListener(new DialogInterface$OnDismissListenerC10888d(this));
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: a */
    public final void mo17749a(C10788a aVar) {
        float f;
        C89219l.m154721d(aVar, "");
        C10790c cVar = aVar.f25978b.get(0);
        LiveTextView liveTextView = this.f26150l;
        if (liveTextView == null) {
            C89219l.m154710a("mTitle");
        }
        liveTextView.setText(cVar.f25984b);
        LinearLayoutCompat linearLayoutCompat = this.f26151m;
        if (linearLayoutCompat == null) {
            C89219l.m154710a("mChooseContainer");
        }
        C10790c cVar2 = aVar.f25978b.get(0);
        C89219l.m154716b(cVar2, "");
        C10790c cVar3 = cVar2;
        if (this.f26155q) {
            f = 8.0f;
        } else {
            f = 12.0f;
        }
        C10882b.m19488a(linearLayoutCompat, cVar3, R.layout.bde, 0, f, this.f26154p);
        LiveTextView liveTextView2 = this.f26153o;
        if (liveTextView2 == null) {
            C89219l.m154710a("mFeedbackTip");
        }
        liveTextView2.setText(aVar.f25979c);
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.c$a */
    static final class C10885a extends AbstractC89220m implements AbstractC89183m<String, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC10884c f26156a;

        static {
            Covode.recordClassIndex(12490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10885a(DialogC10884c cVar) {
            super(2);
            this.f26156a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Long l) {
            String str2 = str;
            long longValue = l.longValue();
            C89219l.m154721d(str2, "");
            this.f26156a.f26143b.mo28320c(C10800c.class, new C10795b(str2, longValue));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC10884c(Context context, DataChannel dataChannel, boolean z) {
        super(context, z);
        C89219l.m154721d(context, "");
        C89219l.m154721d(dataChannel, "");
        this.f26143b = dataChannel;
        this.f26155q = z;
        m19489e();
    }
}
