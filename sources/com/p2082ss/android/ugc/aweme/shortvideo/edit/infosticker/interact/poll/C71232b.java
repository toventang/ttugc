package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b */
public final class C71232b extends AbstractC71078c {

    /* renamed from: A */
    public PollingStickerLayout f159635A;

    /* renamed from: B */
    public boolean f159636B;

    /* renamed from: C */
    final AbstractC72510a f159637C;

    /* renamed from: D */
    final VideoPublishEditModel f159638D;

    /* renamed from: E */
    private final String f159639E = "poll_sticker_id";

    /* renamed from: F */
    private final String f159640F = "poll_sticker_tab_id";

    /* renamed from: G */
    private final String f159641G = "pi_start";

    /* renamed from: H */
    private final String f159642H = "pi_end";

    /* renamed from: I */
    private final String f159643I = ("pi_start" + "(.*?)" + "pi_end");

    /* renamed from: J */
    private final int f159644J = 160;

    /* renamed from: K */
    private final int f159645K = 170;

    /* renamed from: L */
    private final int f159646L = BuildConfig.VERSION_CODE;

    /* renamed from: M */
    private final int f159647M = 24;

    /* renamed from: a */
    PollStruct f159648a;

    /* renamed from: b */
    public String f159649b;

    /* renamed from: c */
    public String f159650c;

    static {
        Covode.recordClassIndex(83747);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: f */
    public final int mo112287f() {
        return R.string.axu;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b$f */
    public static final class C71239f extends C27895a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83754);
        }

        C71239f() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final boolean mo112283b() {
        if (this.f159648a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b$a */
    static final class RunnableC71233a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71232b f159651a;

        static {
            Covode.recordClassIndex(83748);
        }

        RunnableC71233a(C71232b bVar) {
            this.f159651a = bVar;
        }

        public final void run() {
            C45922g gVar = this.f159651a.f159182l;
            if (gVar != null) {
                gVar.mo77345b();
            }
        }
    }

    /* renamed from: s */
    private final void m125866s() {
        this.f159636B = true;
        this.f159637C.mo114805a((AbstractC72510a) false, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b$d */
    public static final class RunnableC71237d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71232b f159656a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f159657b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f159658c;

        static {
            Covode.recordClassIndex(83752);
        }

        RunnableC71237d(C71232b bVar, C89233z.C89238e eVar, C89233z.C89238e eVar2) {
            this.f159656a = bVar;
            this.f159657b = eVar;
            this.f159658c = eVar2;
        }

        public final void run() {
            PollingStickerLayout pollingStickerLayout = this.f159656a.f159635A;
            if (pollingStickerLayout != null) {
                pollingStickerLayout.mo112613a((PollingStickerView) this.f159657b.element, (C71231a) this.f159658c.element);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b$e */
    static final class RunnableC71238e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71232b f159659a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f159660b;

        static {
            Covode.recordClassIndex(83753);
        }

        RunnableC71238e(C71232b bVar, InteractStickerStruct interactStickerStruct) {
            this.f159659a = bVar;
            this.f159660b = interactStickerStruct;
        }

        public final void run() {
            C71232b.super.mo112310a((C71232b) this.f159660b);
            C45922g gVar = this.f159659a.f159182l;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b$g */
    static final class RunnableC71240g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71232b f159661a;

        static {
            Covode.recordClassIndex(83755);
        }

        RunnableC71240g(C71232b bVar) {
            this.f159661a = bVar;
        }

        public final void run() {
            PollingStickerLayout pollingStickerLayout = this.f159661a.f159635A;
            if (pollingStickerLayout != null) {
                pollingStickerLayout.mo112613a((PollingStickerView) null, new C71231a((byte) 0));
            }
        }
    }

    /* renamed from: t */
    private final String m125867t() {
        return this.f159641G + UUID.randomUUID().toString() + this.f159642H;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: c */
    public final InteractStickerStruct mo112284c() {
        InteractStickerStruct d = super.mo112317d(3);
        if (d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.f159639E, this.f159649b);
        hashMap.put(this.f159640F, this.f159650c);
        d.setAttr(C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(hashMap));
        d.setPollStruct(this.f159648a);
        d.setIndex(1);
        return d;
    }

    /* renamed from: q */
    public final void mo112446q() {
        if (this.f159648a != null) {
            mo112447r();
            return;
        }
        m125866s();
        PollingStickerLayout pollingStickerLayout = this.f159635A;
        if (pollingStickerLayout != null) {
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            pollingStickerLayout.mo112612a(height, (float) frameLayout2.getTop());
        }
        PollingStickerLayout pollingStickerLayout2 = this.f159635A;
        if (pollingStickerLayout2 != null) {
            pollingStickerLayout2.post(new RunnableC71240g(this));
        }
    }

    /* renamed from: r */
    public final void mo112447r() {
        m125866s();
        PollingStickerLayout pollingStickerLayout = this.f159635A;
        if (pollingStickerLayout != null) {
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            pollingStickerLayout.mo112612a(height, (float) frameLayout2.getTop());
        }
        mo112324n();
        if (this.f159182l instanceof C71241c) {
            C89233z.C89238e eVar = new C89233z.C89238e();
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            eVar.element = (T) ((C71241c) gVar).getBaseView();
            C45922g gVar2 = this.f159182l;
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            ((C71241c) gVar2).mo112653r();
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = (T) new C71231a((byte) 0);
            eVar2.element.f159634f = eVar.element.getLastTouchedIndex();
            C45922g gVar3 = this.f159182l;
            C89219l.m154716b(gVar3, "");
            eVar2.element.f159631c = AbstractC71078c.m125575b(gVar3.getRotateAngle());
            C45922g gVar4 = this.f159182l;
            C89219l.m154716b(gVar4, "");
            View contentView = gVar4.getContentView();
            C89219l.m154716b(contentView, "");
            eVar2.element.f159629a = contentView.getScaleX();
            C45922g gVar5 = this.f159182l;
            C89219l.m154716b(gVar5, "");
            View contentView2 = gVar5.getContentView();
            C89219l.m154716b(contentView2, "");
            eVar2.element.f159630b = contentView2.getScaleY();
            C45922g gVar6 = this.f159182l;
            C89219l.m154716b(gVar6, "");
            View contentView3 = gVar6.getContentView();
            C89219l.m154716b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout3 = this.f159174d;
            C89219l.m154716b(frameLayout3, "");
            eVar2.element.f159632d = x + frameLayout3.getX();
            C45922g gVar7 = this.f159182l;
            C89219l.m154716b(gVar7, "");
            View contentView4 = gVar7.getContentView();
            C89219l.m154716b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout4 = this.f159174d;
            C89219l.m154716b(frameLayout4, "");
            eVar2.element.f159633e = y + frameLayout4.getY();
            PollingStickerLayout pollingStickerLayout2 = this.f159635A;
            if (pollingStickerLayout2 != null) {
                pollingStickerLayout2.post(new RunnableC71237d(this, eVar, eVar2));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final C45922g mo112275a(Context context) {
        C89219l.m154721d(context, "");
        C71241c cVar = new C71241c(context);
        cVar.setLockMode(true);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final boolean mo112282a(C45922g gVar) {
        C89219l.m154721d(gVar, "");
        if (!(gVar instanceof C71241c)) {
            return false;
        }
        super.mo112282a(gVar);
        this.f159648a = null;
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b$c */
    public static final class C71236c extends AbstractC89220m implements AbstractC89172b<PollingStickerView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71232b f159654a;

        /* renamed from: b */
        final /* synthetic */ PollingStickerLayout f159655b;

        static {
            Covode.recordClassIndex(83751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71236c(C71232b bVar, PollingStickerLayout pollingStickerLayout) {
            super(1);
            this.f159654a = bVar;
            this.f159655b = pollingStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(PollingStickerView pollingStickerView) {
            PollingStickerView pollingStickerView2 = pollingStickerView;
            if (this.f159654a.f159182l == null || !(this.f159654a.f159182l instanceof C71241c)) {
                PollingStickerLayout pollingStickerLayout = this.f159654a.f159635A;
                if (pollingStickerLayout != null) {
                    pollingStickerLayout.mo112611a();
                }
            } else {
                C45922g gVar = this.f159654a.f159182l;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
                float b = ((C71241c) gVar).mo112651b(pollingStickerView2);
                PollingStickerLayout pollingStickerLayout2 = this.f159655b;
                if (pollingStickerLayout2 != null) {
                    pollingStickerLayout2.f159602g.f159633e += b;
                }
                PollingStickerLayout pollingStickerLayout3 = this.f159654a.f159635A;
                if (pollingStickerLayout3 != null) {
                    pollingStickerLayout3.mo112611a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b$b */
    public static final class C71234b extends AbstractC89220m implements AbstractC89172b<PollingStickerView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71232b f159652a;

        static {
            Covode.recordClassIndex(83749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71234b(C71232b bVar) {
            super(1);
            this.f159652a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(PollingStickerView pollingStickerView) {
            PollStruct pollStruct;
            PollingStickerView pollingStickerView2 = pollingStickerView;
            C71232b bVar = this.f159652a;
            bVar.f159636B = false;
            bVar.f159637C.mo114805a((AbstractC72510a) true, false, true);
            VideoPublishEditModel videoPublishEditModel = bVar.f159638D;
            C89219l.m154721d(videoPublishEditModel, "");
            C39162r.m79460a("poll_edit_complete", new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("content_type", C70968bl.m125249a(videoPublishEditModel)).mo129406a("content_source", C70968bl.m125262b(videoPublishEditModel)).mo129406a("enter_from", "video_edit_page").mo129406a("prop_id", bVar.f159649b).f188764a);
            C71232b bVar2 = this.f159652a;
            if (bVar2.f159182l == null) {
                bVar2.mo112280a(false);
            }
            if (bVar2.f159182l instanceof C71241c) {
                if (pollingStickerView2 != null) {
                    pollStruct = pollingStickerView2.getPollStruct();
                } else {
                    pollStruct = null;
                }
                bVar2.f159648a = pollStruct;
                if (pollingStickerView2 != null) {
                    pollingStickerView2.mo112624a();
                }
                C45922g gVar = bVar2.f159182l;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
                ((C71241c) gVar).mo112649a(pollingStickerView2);
                C45922g gVar2 = bVar2.f159182l;
                if (gVar2 != null) {
                    gVar2.post(new RunnableC71233a(bVar2));
                }
            }
            if (this.f159652a.f159182l != null && (this.f159652a.f159182l instanceof C71241c)) {
                this.f159652a.f159182l.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.C71232b.C71234b.RunnableC712351 */

                    /* renamed from: a */
                    final /* synthetic */ C71234b f159653a;

                    static {
                        Covode.recordClassIndex(83750);
                    }

                    {
                        this.f159653a = r1;
                    }

                    public final void run() {
                        this.f159653a.f159652a.f159182l.mo77351e();
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112310a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f159648a = interactStickerStruct.getPollStruct();
            mo112280a(true);
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            ((C71241c) gVar).mo112650a(this.f159648a);
            if (this.f159184n != null) {
                this.f159184n.mo112344f();
            }
            C45922g gVar2 = this.f159182l;
            C89219l.m154716b(gVar2, "");
            gVar2.setVisibility(4);
            HashMap hashMap = (HashMap) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46671a(interactStickerStruct.getAttr(), new C71239f().type);
            this.f159649b = (String) hashMap.get(this.f159639E);
            if (hashMap.containsKey(this.f159640F)) {
                this.f159650c = (String) hashMap.get(this.f159640F);
            }
        }
        if (this.f159182l != null) {
            this.f159182l.postDelayed(new RunnableC71238e(this, interactStickerStruct), 300);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112279a(String str) {
        C89219l.m154721d(str, "");
        if (C13627m.m24498a(str)) {
            return;
        }
        if (!C89361p.m154908a((CharSequence) str, (CharSequence) this.f159641G, false) || !C89361p.m154908a((CharSequence) str, (CharSequence) this.f159642H, false)) {
            String str2 = File.separator;
            C89219l.m154716b(str2, "");
            if (C89361p.m154876c(str, str2, false)) {
                super.mo112279a(str + m125867t());
            } else {
                super.mo112279a(str + m125867t());
            }
        } else {
            super.mo112279a(new C89350l(this.f159643I).replace(str, m125867t()));
        }
    }

    public C71232b(AbstractC72510a aVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f159637C = aVar;
        this.f159638D = videoPublishEditModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112306a(AbstractC31071f fVar, AbstractC72510a aVar) {
        PollingStickerLayout pollingStickerLayout;
        super.mo112306a(fVar, aVar);
        if (fVar != null) {
            float f = (float) fVar.mo56330b().height;
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            if (f > C13628n.m24520b(frameLayout.getContext(), (float) (this.f159646L + this.f159647M))) {
                PollingStickerLayout pollingStickerLayout2 = this.f159635A;
                if (pollingStickerLayout2 != null) {
                    pollingStickerLayout2.setMaxLine(3);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            if (f > C13628n.m24520b(frameLayout2.getContext(), (float) (this.f159645K + this.f159647M))) {
                PollingStickerLayout pollingStickerLayout3 = this.f159635A;
                if (pollingStickerLayout3 != null) {
                    pollingStickerLayout3.setMaxLine(2);
                    return;
                }
                return;
            }
            FrameLayout frameLayout3 = this.f159174d;
            C89219l.m154716b(frameLayout3, "");
            if (f > C13628n.m24520b(frameLayout3.getContext(), (float) (this.f159644J + this.f159647M)) && (pollingStickerLayout = this.f159635A) != null) {
                pollingStickerLayout.setMaxLine(1);
            }
        }
    }
}
