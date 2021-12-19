package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p3872a;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49681i;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50556u;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a */
public final class C72956a extends AbstractC72946a {

    /* renamed from: n */
    public static final C72957a f163713n = new C72957a((byte) 0);

    /* renamed from: a */
    public C72965c f163714a;

    /* renamed from: l */
    public final C72963b f163715l;

    /* renamed from: m */
    public final Aweme f163716m;

    static {
        Covode.recordClassIndex(85659);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a$a */
    public static final class C72957a {
        static {
            Covode.recordClassIndex(85660);
        }

        private C72957a() {
        }

        public /* synthetic */ C72957a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a$d */
    static final class C72961d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C72961d f163721a = new C72961d();

        static {
            Covode.recordClassIndex(85664);
        }

        C72961d() {
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
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a$b */
    public static final class RunnableC72958b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72956a f163717a;

        static {
            Covode.recordClassIndex(85661);
        }

        RunnableC72958b(C72956a aVar) {
            this.f163717a = aVar;
        }

        public final void run() {
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            C72963b bVar = this.f163717a.f163715l;
            C72965c cVar = this.f163717a.f163714a;
            if (cVar == null) {
                C89219l.m154715b();
            }
            ConstraintLayout realDuetStickerView = cVar.getRealDuetStickerView();
            List<NormalTrackTimeStamp> a = C72890c.m128719a(this.f163717a.f163692f);
            if (!(a == null || (normalTrackTimeStamp = a.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            bVar.mo115365a(realDuetStickerView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a$e */
    static final class RunnableC72962e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72956a f163722a;

        /* renamed from: b */
        final /* synthetic */ C72965c f163723b;

        static {
            Covode.recordClassIndex(85665);
        }

        RunnableC72962e(C72956a aVar, C72965c cVar) {
            this.f163722a = aVar;
            this.f163723b = cVar;
        }

        public final void run() {
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            C72963b bVar = this.f163722a.f163715l;
            ConstraintLayout realDuetStickerView = this.f163723b.getRealDuetStickerView();
            List<NormalTrackTimeStamp> a = C72890c.m128719a(this.f163722a.f163692f);
            if (!(a == null || (normalTrackTimeStamp = a.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            bVar.mo115365a(realDuetStickerView);
            this.f163723b.postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C72965c mo115223a() {
        String str;
        DuetStickerStruct duetStickerStruct;
        if (this.f163714a == null) {
            C72965c cVar = new C72965c(this.f163695i);
            this.f163714a = cVar;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.duet.FeedDuetStickerView");
            cVar.setInteractStickerParams(this.f163697k);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            C72965c cVar2 = this.f163714a;
            if (cVar2 != null) {
                cVar2.setLayoutParams(layoutParams);
            }
            C72965c cVar3 = this.f163714a;
            Objects.requireNonNull(cVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.duet.FeedDuetStickerView");
            cVar3.getRealDuetStickerView().setVisibility(4);
            C72965c cVar4 = this.f163714a;
            Objects.requireNonNull(cVar4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.duet.FeedDuetStickerView");
            InteractStickerStruct interactStickerStruct = this.f163692f;
            if (interactStickerStruct == null || (duetStickerStruct = interactStickerStruct.getDuetStickerStruct()) == null || (str = duetStickerStruct.getDuetString()) == null) {
                str = "DUET WITH ME";
            }
            cVar4.mo115368a(str);
            C72965c cVar5 = this.f163714a;
            if (cVar5 != null) {
                cVar5.post(new RunnableC72958b(this));
            }
        }
        C72965c cVar6 = this.f163714a;
        if (cVar6 != null) {
            cVar6.postInvalidate();
        }
        return this.f163714a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(8522);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f163695i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f163695i, null, 0, 6);
        tuxTextView.setTextColor(C0643b.m2378c(this.f163695i, R.color.a9));
        tuxTextView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) C13628n.m24520b(this.f163695i, 1.0f);
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f163695i.getResources().getString(R.string.be3));
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f163695i);
        autoRTLImageView.setImageResource(R.drawable.b6n);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.m26664o(8522);
        return linearLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
        String str;
        C75384i iVar;
        String str2;
        C75384i iVar2;
        String str3;
        Aweme aweme = this.f163716m;
        if (aweme != null) {
            String str4 = "";
            if (C37699a.m76218U(aweme)) {
                C33744d dVar = new C33744d();
                C75391j jVar = this.f163697k;
                if (!(jVar == null || (iVar2 = jVar.f169463r) == null || (str3 = iVar2.f169427a) == null)) {
                    str4 = str3;
                }
                C39162r.m79460a("dou_promote_layer_show", dVar.mo59983a("enter_from", str4).mo59983a("group_id", this.f163716m.getAid()).mo59983a("author_id", this.f163716m.getAuthorUid()).f79943a);
                new C23144b(this.f163696j).mo37640e(R.string.o7).mo37637b();
                return;
            }
            if (C56216k.m102133c()) {
                str = "click_more_duet";
            } else {
                str = str4;
            }
            Aweme aweme2 = this.f163716m;
            Context context = this.f163695i;
            C75391j jVar2 = this.f163697k;
            if (!(jVar2 == null || (iVar = jVar2.f169463r) == null || (str2 = iVar.f169427a) == null)) {
                str4 = str2;
            }
            C50556u.m94784a(aweme2, context, str, str4, true, 16);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115314a(InteractStickerStruct interactStickerStruct) {
        super.mo115314a(interactStickerStruct);
        mo115223a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a$c */
    static final class C72959c extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72956a f163718a;

        static {
            Covode.recordClassIndex(85662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72959c(C72956a aVar) {
            super(1);
            this.f163718a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a$c$a */
        public static final class View$OnClickListenerC72960a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C72959c f163719a;

            /* renamed from: b */
            final /* synthetic */ C23322d f163720b;

            static {
                Covode.recordClassIndex(85663);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f163719a.f163718a.mo115357n();
                this.f163719a.f163718a.mo115229f();
            }

            View$OnClickListenerC72960a(C72959c cVar, C23322d dVar) {
                this.f163719a = cVar;
                this.f163720b = dVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C23322d.C23323a aVar = new C23322d.C23323a();
            String string = dVar2.f55273b.getString(R.string.be3);
            C89219l.m154716b(string, "");
            aVar.mo38016a(string);
            aVar.f55279f = new View$OnClickListenerC72960a(this, dVar2);
            dVar2.mo38014a(aVar);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f163715l.mo115236a(jVar);
        C72965c c = mo115223a();
        if (c != null) {
            c.post(new RunnableC72962e(this, c));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return this.f163715l.mo115224a(j, i, f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        String str;
        C75384i iVar;
        C75384i iVar2;
        C89219l.m154721d(bVar, "");
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163697k;
        String str2 = null;
        if (jVar == null || (iVar2 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar2.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C33744d a2 = a.mo59983a("user_id", g.getCurUserId()).mo59983a("creation_id", "");
        C75391j jVar2 = this.f163697k;
        if (!(jVar2 == null || (iVar = jVar2.f169463r) == null)) {
            str2 = iVar.f169427a;
        }
        C39162r.m79460a("click_duet_sticker_popup", a2.mo59983a("enter_from", str2).mo59983a("content", "start_duet").f79943a);
        return this.f163715l.mo115225a(j, i, f, f2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72956a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar, Aweme aweme) {
        super(i, context, view, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163716m = aweme;
        this.f163715l = new C72963b(context, this, interactStickerStruct, jVar);
        AVExternalServiceImpl.m113114a().typeFaceService().prefetch(context);
    }
}
