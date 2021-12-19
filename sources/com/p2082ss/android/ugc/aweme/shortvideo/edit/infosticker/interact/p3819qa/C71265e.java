package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.qasticker.C65863a;
import com.p2082ss.android.ugc.aweme.qasticker.C65864b;
import com.p2082ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3819qa.QaStickerEditLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.HashMap;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e */
public final class C71265e extends AbstractC71078c {

    /* renamed from: A */
    public String f159715A;

    /* renamed from: B */
    public AbstractC89171a<C89391z> f159716B;

    /* renamed from: C */
    final AbstractC72510a f159717C;

    /* renamed from: D */
    public final VideoPublishEditModel f159718D;

    /* renamed from: E */
    public final C65863a f159719E;

    /* renamed from: a */
    public QaStruct f159720a;

    /* renamed from: b */
    public QaStickerEditLayout f159721b;

    /* renamed from: c */
    public String f159722c;

    static {
        Covode.recordClassIndex(83781);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: f */
    public final int mo112287f() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e$e */
    public static final class C71271e extends C27895a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83787);
        }

        C71271e() {
        }
    }

    /* renamed from: s */
    private final void m125905s() {
        this.f159717C.mo114805a((AbstractC72510a) false, false, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final boolean mo112283b() {
        if (this.f159720a != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: d */
    public final void mo112285d() {
        this.f159720a = null;
        super.mo112285d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e$f */
    public static final class RunnableC71272f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71265e f159729a;

        /* renamed from: b */
        final /* synthetic */ QaStickerView f159730b;

        /* renamed from: c */
        final /* synthetic */ QaStickerEditLayout.C71244a f159731c;

        static {
            Covode.recordClassIndex(83788);
        }

        RunnableC71272f(C71265e eVar, QaStickerView qaStickerView, QaStickerEditLayout.C71244a aVar) {
            this.f159729a = eVar;
            this.f159730b = qaStickerView;
            this.f159731c = aVar;
        }

        public final void run() {
            QaStickerEditLayout qaStickerEditLayout = this.f159729a.f159721b;
            if (qaStickerEditLayout != null) {
                qaStickerEditLayout.mo112655a(this.f159730b, this.f159731c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e$b */
    static final class RunnableC71268b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71265e f159725a;

        static {
            Covode.recordClassIndex(83784);
        }

        RunnableC71268b(C71265e eVar) {
            this.f159725a = eVar;
        }

        public final void run() {
            QaStickerEditLayout qaStickerEditLayout = this.f159725a.f159721b;
            if (qaStickerEditLayout != null) {
                qaStickerEditLayout.mo112655a((QaStickerView) null, new QaStickerEditLayout.C71244a(0.0f, 0.0f, 0.0f, 0.0f, 31));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e$d */
    static final class RunnableC71270d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71265e f159727a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f159728b;

        static {
            Covode.recordClassIndex(83786);
        }

        RunnableC71270d(C71265e eVar, InteractStickerStruct interactStickerStruct) {
            this.f159727a = eVar;
            this.f159728b = interactStickerStruct;
        }

        public final void run() {
            C71265e.super.mo112310a((C71265e) this.f159728b);
            C45922g gVar = this.f159727a.f159182l;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
        }
    }

    /* renamed from: q */
    public final void mo112446q() {
        if (this.f159720a != null) {
            mo112447r();
            return;
        }
        m125905s();
        QaStickerEditLayout qaStickerEditLayout = this.f159721b;
        if (qaStickerEditLayout != null) {
            qaStickerEditLayout.post(new RunnableC71268b(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: c */
    public final InteractStickerStruct mo112284c() {
        InteractStickerStruct d = super.mo112317d(17);
        if (d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qa_sticker_id", this.f159722c);
        hashMap.put("qa_sticker_tab_id", this.f159715A);
        d.setAttr(C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(hashMap));
        d.setQaStruct(this.f159720a);
        d.setIndex(12);
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e$a */
    public static final class RunnableC71266a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71265e f159723a;

        static {
            Covode.recordClassIndex(83782);
        }

        RunnableC71266a(C71265e eVar) {
            this.f159723a = eVar;
        }

        public final void run() {
            Context context;
            long j;
            C45922g gVar = this.f159723a.f159182l;
            if (gVar != null) {
                gVar.mo77345b();
            }
            AbstractC89171a<C89391z> aVar = this.f159723a.f159716B;
            if (aVar == null) {
                C89219l.m154710a("disableQuickPublish");
            }
            aVar.invoke();
            if (!TextUtils.equals(this.f159723a.f159718D.shootEnterMethod, "ask_textual_question")) {
                C712671 r3 = C712671.f159724a;
                C45922g gVar2 = this.f159723a.f159182l;
                if (gVar2 != null) {
                    context = gVar2.getContext();
                } else {
                    context = null;
                }
                QaStruct qaStruct = this.f159723a.f159720a;
                if (qaStruct != null) {
                    j = qaStruct.getQuestionId();
                } else {
                    j = 0;
                }
                C65864b.m117795a(r3, context, Long.valueOf(j));
            }
        }
    }

    /* renamed from: r */
    public final void mo112447r() {
        m125905s();
        mo112324n();
        if (this.f159182l instanceof C71258c) {
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            QaStickerView qaStickerView = ((C71258c) gVar).getQaStickerView();
            QaStickerEditLayout.C71244a aVar = new QaStickerEditLayout.C71244a(0.0f, 0.0f, 0.0f, 0.0f, 31);
            C45922g gVar2 = this.f159182l;
            C89219l.m154716b(gVar2, "");
            aVar.f159692c = AbstractC71078c.m125575b(gVar2.getRotateAngle());
            C45922g gVar3 = this.f159182l;
            C89219l.m154716b(gVar3, "");
            View contentView = gVar3.getContentView();
            C89219l.m154716b(contentView, "");
            aVar.f159690a = contentView.getScaleX();
            C45922g gVar4 = this.f159182l;
            C89219l.m154716b(gVar4, "");
            View contentView2 = gVar4.getContentView();
            C89219l.m154716b(contentView2, "");
            aVar.f159691b = contentView2.getScaleY();
            C45922g gVar5 = this.f159182l;
            C89219l.m154716b(gVar5, "");
            View contentView3 = gVar5.getContentView();
            C89219l.m154716b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            aVar.f159693d = x + frameLayout.getX();
            C45922g gVar6 = this.f159182l;
            C89219l.m154716b(gVar6, "");
            View contentView4 = gVar6.getContentView();
            C89219l.m154716b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            aVar.f159694e = y + frameLayout2.getY();
            QaStickerEditLayout qaStickerEditLayout = this.f159721b;
            if (qaStickerEditLayout != null) {
                qaStickerEditLayout.post(new RunnableC71272f(this, qaStickerView, aVar));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final boolean mo112282a(C45922g gVar) {
        super.mo112282a(gVar);
        this.f159720a = null;
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final C45922g mo112275a(Context context) {
        C89219l.m154721d(context, "");
        C71258c cVar = new C71258c(context, (byte) 0);
        cVar.setLockMode(true);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return cVar;
    }

    /* renamed from: a */
    public final void mo112671a(QaStickerView qaStickerView) {
        QaStruct qaStruct;
        if (this.f159182l == null) {
            mo112280a(false);
        }
        if (this.f159182l instanceof C71258c) {
            if (qaStickerView != null) {
                qaStruct = qaStickerView.getQaStruct();
            } else {
                qaStruct = null;
            }
            this.f159720a = qaStruct;
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            ((C71258c) gVar).mo112663a(qaStickerView);
            C45922g gVar2 = this.f159182l;
            if (gVar2 != null) {
                gVar2.post(new RunnableC71266a(this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112310a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f159720a = interactStickerStruct.getQaStruct();
            mo112280a(true);
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            ((C71258c) gVar).mo112664a(this.f159720a);
            if (this.f159184n != null) {
                this.f159184n.mo112344f();
            }
            C45922g gVar2 = this.f159182l;
            C89219l.m154716b(gVar2, "");
            gVar2.setVisibility(4);
            HashMap hashMap = (HashMap) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46671a(interactStickerStruct.getAttr(), new C71271e().type);
            this.f159722c = (String) hashMap.get("qa_sticker_id");
            if (hashMap.containsKey("qa_sticker_tab_id")) {
                this.f159715A = (String) hashMap.get("qa_sticker_tab_id");
            }
        }
        if (this.f159182l != null) {
            this.f159182l.postDelayed(new RunnableC71270d(this, interactStickerStruct), 300);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.e$c */
    public static final class C71269c extends AbstractC89220m implements AbstractC89172b<QaStickerView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71265e f159726a;

        static {
            Covode.recordClassIndex(83785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71269c(C71265e eVar) {
            super(1);
            this.f159726a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(QaStickerView qaStickerView) {
            String str;
            String qaEditTextContent;
            QaStickerView qaStickerView2 = qaStickerView;
            this.f159726a.f159717C.mo114805a((AbstractC72510a) true, false, true);
            if (qaStickerView2 == null || (qaEditTextContent = qaStickerView2.getQaEditTextContent()) == null) {
                str = null;
            } else {
                Objects.requireNonNull(qaEditTextContent, "null cannot be cast to non-null type kotlin.CharSequence");
                str = C89361p.m154910b((CharSequence) qaEditTextContent).toString();
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            C39162r.m79460a("question_complete", this.f159726a.f159719E.mo105008a().mo129403a("text_added", !isEmpty ? 1 : 0).mo129406a("enter_method", "click_main_panel").f188764a);
            if (!isEmpty) {
                if (qaStickerView2 != null) {
                    TuxEditText tuxEditText = qaStickerView2.f148420h;
                    if (tuxEditText == null) {
                        C89219l.m154710a("questionEditText");
                    }
                    tuxEditText.setVisibility(8);
                    TuxTextView tuxTextView = qaStickerView2.f148421i;
                    if (tuxTextView == null) {
                        C89219l.m154710a("questionText");
                    }
                    tuxTextView.setVisibility(0);
                    TuxEditText tuxEditText2 = qaStickerView2.f148420h;
                    if (tuxEditText2 == null) {
                        C89219l.m154710a("questionEditText");
                    }
                    SpannableString spannableString = new SpannableString(String.valueOf(tuxEditText2.getText()));
                    QaStickerView.C65868a.m117801a(spannableString);
                    TuxTextView tuxTextView2 = qaStickerView2.f148421i;
                    if (tuxTextView2 == null) {
                        C89219l.m154710a("questionText");
                    }
                    tuxTextView2.setText(spannableString);
                }
                this.f159726a.mo112671a(qaStickerView2);
            } else {
                this.f159726a.mo112285d();
            }
            return C89391z.f203057a;
        }
    }

    public C71265e(AbstractC72510a aVar, VideoPublishEditModel videoPublishEditModel, C65863a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar2, "");
        this.f159717C = aVar;
        this.f159718D = videoPublishEditModel;
        this.f159719E = aVar2;
    }
}
