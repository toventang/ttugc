package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49681i;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72925f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.C72935f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73050o;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p */
public final class C73057p extends AbstractC72946a {

    /* renamed from: a */
    public C73028l f163946a;

    /* renamed from: l */
    public final C72935f f163947l;

    /* renamed from: m */
    public final AbstractC72925f f163948m;

    /* renamed from: n */
    private C73050o f163949n;

    static {
        Covode.recordClassIndex(85760);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p$b */
    public static final class C73059b implements C73050o.AbstractC73052b {

        /* renamed from: a */
        final /* synthetic */ C73057p f163951a;

        static {
            Covode.recordClassIndex(85762);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73050o.AbstractC73052b
        /* renamed from: a */
        public final void mo115482a() {
            AbstractC75400c cVar;
            C75391j jVar = this.f163951a.f163697k;
            if (jVar != null && (cVar = jVar.f169461p) != null) {
                cVar.mo80253b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73059b(C73057p pVar) {
            this.f163951a = pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p$d */
    public static final class C73062d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C73062d f163955a = new C73062d();

        static {
            Covode.recordClassIndex(85765);
        }

        C73062d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC81915c.m141874a(new C49681i());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p$a */
    public static final class RunnableC73058a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73057p f163950a;

        static {
            Covode.recordClassIndex(85761);
        }

        RunnableC73058a(C73057p pVar) {
            this.f163950a = pVar;
        }

        public final void run() {
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            C72935f fVar = this.f163950a.f163947l;
            C73028l lVar = this.f163950a.f163946a;
            if (lVar == null) {
                C89219l.m154715b();
            }
            FrameLayout pollView = lVar.getPollView();
            List<NormalTrackTimeStamp> a = C72890c.m128719a(this.f163950a.f163692f);
            if (!(a == null || (normalTrackTimeStamp = a.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            fVar.mo115326a(pollView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p$e */
    static final class RunnableC73063e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73057p f163956a;

        /* renamed from: b */
        final /* synthetic */ C73028l f163957b;

        /* renamed from: c */
        final /* synthetic */ C75391j f163958c;

        static {
            Covode.recordClassIndex(85766);
        }

        RunnableC73063e(C73057p pVar, C73028l lVar, C75391j jVar) {
            this.f163956a = pVar;
            this.f163957b = lVar;
            this.f163958c = jVar;
        }

        public final void run() {
            PollStruct pollStruct;
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            C73028l lVar = this.f163957b;
            InteractStickerStruct interactStickerStruct = this.f163956a.f163692f;
            if (interactStickerStruct != null) {
                pollStruct = interactStickerStruct.getPollStruct();
            } else {
                pollStruct = null;
            }
            boolean g = C80580in.m139694g(this.f163958c.f169448c);
            String str = this.f163958c.f169449d;
            if (str == null) {
                str = "";
            }
            lVar.mo115444a(pollStruct, g, str, this.f163958c.f169461p, this.f163956a.f163692f);
            C72935f fVar = this.f163956a.f163947l;
            FrameLayout pollView = this.f163957b.getPollView();
            List<NormalTrackTimeStamp> a = C72890c.m128719a(this.f163956a.f163692f);
            if (!(a == null || (normalTrackTimeStamp = a.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            fVar.mo115326a(pollView);
            this.f163957b.postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
        String str;
        String str2;
        String str3;
        String str4;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163697k;
        String str5 = null;
        if (jVar == null || (iVar4 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar4.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        C75391j jVar3 = this.f163697k;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f169430d;
        }
        C33744d a3 = a2.mo59983a("log_pb", str3);
        C75391j jVar4 = this.f163697k;
        if (!(jVar4 == null || (iVar = jVar4.f169463r) == null)) {
            str5 = iVar.f169427a;
        }
        C33744d a4 = a3.mo59983a("enter_from", str5);
        StickerAttrStruct b = C72890c.m128722b(this.f163692f);
        if (b == null || (str4 = b.getPollStickerId()) == null) {
            str4 = "";
        }
        C39162r.m79460a("poll_prop_click", a4.mo59983a("prop_id", str4).f79943a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(7842);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f163695i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f163695i, null, 0, 6);
        tuxTextView.setTextColor(C0643b.m2378c(this.f163695i, R.color.a9));
        tuxTextView.setTuxFont(61);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) C13628n.m24520b(this.f163695i, 1.0f);
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f163695i.getString(R.string.fhi));
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f163695i);
        autoRTLImageView.setImageResource(R.drawable.b6n);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.m26664o(7842);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
        String str;
        String str2;
        String str3;
        String str4;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163697k;
        String str5 = null;
        if (jVar == null || (iVar4 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar4.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        C75391j jVar3 = this.f163697k;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f169430d;
        }
        C33744d a3 = a2.mo59983a("log_pb", str3);
        C75391j jVar4 = this.f163697k;
        if (!(jVar4 == null || (iVar = jVar4.f169463r) == null)) {
            str5 = iVar.f169427a;
        }
        C33744d a4 = a3.mo59983a("enter_from", str5);
        StickerAttrStruct b = C72890c.m128722b(this.f163692f);
        if (b == null || (str4 = b.getPollStickerId()) == null) {
            str4 = "";
        }
        C39162r.m79460a("poll_prop_label_click", a4.mo59983a("prop_id", str4).f79943a);
        m128957c();
    }

    /* renamed from: c */
    private final void m128957c() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC75400c cVar;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163697k;
        PollStruct pollStruct = null;
        if (jVar == null || (iVar4 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar4.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        C75391j jVar3 = this.f163697k;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f169430d;
        }
        C33744d a3 = a2.mo59983a("log_pb", str3);
        C75391j jVar4 = this.f163697k;
        if (jVar4 == null || (iVar = jVar4.f169463r) == null) {
            str4 = null;
        } else {
            str4 = iVar.f169427a;
        }
        C33744d a4 = a3.mo59983a("enter_from", str4);
        StickerAttrStruct b = C72890c.m128722b(this.f163692f);
        if (b == null || (str5 = b.getPollStickerId()) == null) {
            str5 = "";
        }
        C39162r.m79460a("enter_poll_detail", a4.mo59983a("prop_id", str5).f79943a);
        if (this.f163949n == null) {
            InteractStickerStruct interactStickerStruct = this.f163692f;
            if (interactStickerStruct != null) {
                pollStruct = interactStickerStruct.getPollStruct();
            }
            this.f163949n = C73050o.C73051a.m128953a(pollStruct);
        }
        Context context = this.f163695i;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ((ActivityC0945e) context).getSupportFragmentManager().mo3560b();
        C73050o oVar = this.f163949n;
        if (oVar == null || !oVar.isAdded()) {
            C73050o oVar2 = this.f163949n;
            if (oVar2 == null || !oVar2.isVisible()) {
                C73050o oVar3 = this.f163949n;
                if (oVar3 == null || !oVar3.isRemoving()) {
                    C73050o oVar4 = this.f163949n;
                    if (oVar4 != null) {
                        oVar4.f163937e = this.f163948m;
                    }
                    C73050o oVar5 = this.f163949n;
                    if (oVar5 != null) {
                        Context context2 = this.f163695i;
                        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        AbstractC0952i supportFragmentManager = ((ActivityC0945e) context2).getSupportFragmentManager();
                        C89219l.m154716b(supportFragmentManager, "");
                        oVar5.show(supportFragmentManager, "VoteBottomSheetDialogFragment");
                    }
                    C73050o oVar6 = this.f163949n;
                    if (oVar6 != null) {
                        oVar6.f163936d = new C73059b(this);
                    }
                    C75391j jVar5 = this.f163697k;
                    if (jVar5 != null && (cVar = jVar5.f169461p) != null) {
                        cVar.mo80252a();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C73028l mo115223a() {
        PollStruct pollStruct;
        User user;
        String str;
        FrameLayout pollView;
        if (this.f163946a == null) {
            C73028l lVar = new C73028l(this.f163695i);
            this.f163946a = lVar;
            Objects.requireNonNull(lVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.FeedPollStickerView");
            lVar.setInteractStickerParams(this.f163697k);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            C73028l lVar2 = this.f163946a;
            if (lVar2 != null) {
                lVar2.setLayoutParams(layoutParams);
            }
            C73028l lVar3 = this.f163946a;
            if (!(lVar3 == null || (pollView = lVar3.getPollView()) == null)) {
                pollView.setVisibility(4);
            }
            C73028l lVar4 = this.f163946a;
            if (lVar4 != null) {
                lVar4.setPoints(this.f163947l.mo115327a());
            }
            C73028l lVar5 = this.f163946a;
            if (lVar5 != null) {
                lVar5.post(new RunnableC73058a(this));
            }
        }
        C73028l lVar6 = this.f163946a;
        if (lVar6 != null) {
            InteractStickerStruct interactStickerStruct = this.f163692f;
            AbstractC75400c cVar = null;
            if (interactStickerStruct != null) {
                pollStruct = interactStickerStruct.getPollStruct();
            } else {
                pollStruct = null;
            }
            C75391j jVar = this.f163697k;
            if (jVar != null) {
                user = jVar.f169448c;
            } else {
                user = null;
            }
            boolean g = C80580in.m139694g(user);
            C75391j jVar2 = this.f163697k;
            if (jVar2 == null || (str = jVar2.f169449d) == null) {
                str = "";
            }
            C75391j jVar3 = this.f163697k;
            if (jVar3 != null) {
                cVar = jVar3.f169461p;
            }
            lVar6.mo115444a(pollStruct, g, str, cVar, this.f163692f);
        }
        C73028l lVar7 = this.f163946a;
        if (lVar7 != null) {
            lVar7.postInvalidate();
        }
        return this.f163946a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115314a(InteractStickerStruct interactStickerStruct) {
        super.mo115314a(interactStickerStruct);
        mo115223a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p$c */
    public static final class C73060c extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73057p f163952a;

        static {
            Covode.recordClassIndex(85763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73060c(C73057p pVar) {
            super(1);
            this.f163952a = pVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p$c$a */
        public static final class View$OnClickListenerC73061a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C73060c f163953a;

            /* renamed from: b */
            final /* synthetic */ C23322d f163954b;

            static {
                Covode.recordClassIndex(85764);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f163953a.f163952a.mo115357n();
                this.f163953a.f163952a.mo115229f();
            }

            View$OnClickListenerC73061a(C73060c cVar, C23322d dVar) {
                this.f163953a = cVar;
                this.f163954b = dVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C23322d.C23323a aVar = new C23322d.C23323a();
            String string = dVar2.f55273b.getString(R.string.fhi);
            C89219l.m154716b(string, "");
            aVar.mo38016a(string);
            aVar.f55279f = new View$OnClickListenerC73061a(this, dVar2);
            dVar2.mo38014a(aVar);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f163947l.mo115236a(jVar);
        C73028l g = mo115223a();
        if (g != null) {
            g.post(new RunnableC73063e(this, g, jVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return this.f163947l.mo115224a(j, i, f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f163947l.mo115225a(j, i, f, f2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73057p(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar, AbstractC72925f fVar) {
        super(i, context, view, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        C89219l.m154721d(fVar, "");
        this.f163948m = fVar;
        this.f163947l = new C72935f(context, this, interactStickerStruct, jVar);
        if (jVar != null && jVar.f169450e) {
            m128957c();
        }
        AVExternalServiceImpl.m113114a().typeFaceService().prefetch(context);
    }
}
