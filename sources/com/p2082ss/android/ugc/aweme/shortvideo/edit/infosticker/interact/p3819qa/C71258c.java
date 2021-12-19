package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.qasticker.C65863a;
import com.p2082ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.EditPageQaStickerViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.c */
public final class C71258c extends C45922g {

    /* renamed from: q */
    public EditTextStickerViewModel f159706q;

    /* renamed from: r */
    public EditPageQaStickerViewModel f159707r;

    /* renamed from: s */
    private QaStickerView f159708s;

    static {
        Covode.recordClassIndex(83774);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: o */
    public final boolean mo77372o() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: p */
    public final boolean mo77376p() {
        return true;
    }

    public final QaStickerView getQaStickerView() {
        return this.f159708s;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final AbstractC45824b mo77336a() {
        return new C71260d(this, new C71259a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.c$a */
    public static final class C71259a extends C45922g.C45923a {

        /* renamed from: b */
        final /* synthetic */ C71258c f159709b;

        static {
            Covode.recordClassIndex(83775);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k, com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g.C45923a
        /* renamed from: f */
        public final void mo77196f() {
            String str;
            QaStruct qaStruct;
            QaStickerView qaStickerView = this.f159709b.getQaStickerView();
            if (qaStickerView == null || (qaStruct = qaStickerView.getQaStruct()) == null || (str = qaStruct.getQuestionContent()) == null) {
                str = "";
            }
            EditTextStickerViewModel editTextStickerViewModel = this.f159709b.f159706q;
            if (editTextStickerViewModel == null) {
                C89219l.m154710a("editTextStickerViewModel");
            }
            C89219l.m154721d(str, "");
            editTextStickerViewModel.mo33689c(new EditTextStickerViewModel.C46013d(str));
            EditPageQaStickerViewModel editPageQaStickerViewModel = this.f159709b.f159707r;
            if (editPageQaStickerViewModel == null) {
                C89219l.m154710a("editQaStickerViewModel");
            }
            editPageQaStickerViewModel.mo128053k().mo128071d().mo112285d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71259a(C71258c cVar) {
            super();
            this.f159709b = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: j */
    public final void mo77367j() {
        QaStruct qaStruct;
        QaStruct qaStruct2;
        QaStickerView qaStickerView = this.f159708s;
        long j = 0;
        if (qaStickerView == null || (qaStruct2 = qaStickerView.getQaStruct()) == null || qaStruct2.getQuestionId() == 0) {
            super.mo77367j();
            EditPageQaStickerViewModel editPageQaStickerViewModel = this.f159707r;
            if (editPageQaStickerViewModel == null) {
                C89219l.m154710a("editQaStickerViewModel");
            }
            QaStickerView qaStickerView2 = this.f159708s;
            if (!(qaStickerView2 == null || (qaStruct = qaStickerView2.getQaStruct()) == null)) {
                j = qaStruct.getQuestionId();
            }
            String valueOf = String.valueOf(j);
            C89219l.m154721d(valueOf, "");
            C65863a aVar = editPageQaStickerViewModel.f185407b;
            C89219l.m154721d(valueOf, "");
            C39162r.m79460a("prop_more_click", aVar.mo105008a().mo129406a("user_id", C63244g.m114602a().mo73255A().mo93904c()).mo129406a("question_id", valueOf).f188764a);
        }
    }

    public final void setQaStickerView(QaStickerView qaStickerView) {
        this.f159708s = qaStickerView;
    }

    /* renamed from: a */
    public final void mo112663a(QaStickerView qaStickerView) {
        MethodCollector.m26663i(10284);
        if (qaStickerView == null) {
            MethodCollector.m26664o(10284);
            return;
        }
        this.f159708s = qaStickerView;
        View view = this.f106955g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f106955g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(qaStickerView);
                MethodCollector.m26664o(10284);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(10284);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(10284);
        throw nullPointerException2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C71258c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10437);
        LayoutInflater.from(getContext()).inflate(R.layout.ai2, this);
        this.f106954f = (StickerHelpBoxView) findViewById(R.id.e8x);
        this.f106955g = findViewById(R.id.ade);
        Context context2 = getContext();
        if (context2 != null) {
            JediViewModel a = C20531t.m38716a((ActivityC0945e) context2).mo33800a(EditTextStickerViewModel.class);
            C89219l.m154716b(a, "");
            this.f159706q = (EditTextStickerViewModel) a;
            Context context3 = getContext();
            if (context3 != null) {
                JediViewModel a2 = C20531t.m38716a((ActivityC0945e) context3).mo33800a(EditPageQaStickerViewModel.class);
                C89219l.m154716b(a2, "");
                this.f159707r = (EditPageQaStickerViewModel) a2;
                MethodCollector.m26664o(10437);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.m26664o(10437);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(10437);
        throw nullPointerException2;
    }

    /* renamed from: a */
    public final void mo112664a(QaStruct qaStruct) {
        MethodCollector.m26663i(10434);
        if (this.f159708s == null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            QaStickerView qaStickerView = new QaStickerView(context, (AttributeSet) null, 6);
            this.f159708s = qaStickerView;
            if (qaStruct != null) {
                qaStickerView.mo105009a(qaStruct);
            }
        }
        View view = this.f106955g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f106955g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(this.f159708s);
                MethodCollector.m26664o(10434);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(10434);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(10434);
        throw nullPointerException2;
    }

    public /* synthetic */ C71258c(Context context, byte b) {
        this(context);
    }
}
