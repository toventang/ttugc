package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c */
public final class C71128c extends AbstractC71078c {

    /* renamed from: A */
    public DuetEditStickerLayout f159329A;

    /* renamed from: B */
    public boolean f159330B;

    /* renamed from: C */
    final AbstractC72510a f159331C;

    /* renamed from: D */
    public final VideoPublishEditModel f159332D;

    /* renamed from: E */
    private final String f159333E = "duet_sticker_id";

    /* renamed from: F */
    private final String f159334F = "duet_sticker_tab_id";

    /* renamed from: G */
    private final String f159335G = "pi_start";

    /* renamed from: H */
    private final String f159336H = "pi_end";

    /* renamed from: I */
    private final String f159337I = ("pi_start" + "(.*?)" + "pi_end");

    /* renamed from: a */
    DuetStickerStruct f159338a;

    /* renamed from: b */
    public String f159339b;

    /* renamed from: c */
    public String f159340c;

    static {
        Covode.recordClassIndex(83634);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: f */
    public final int mo112287f() {
        return R.string.be4;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c$e */
    public static final class C71134e extends C27895a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83640);
        }

        C71134e() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final boolean mo112283b() {
        if (this.f159338a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c$a */
    static final class RunnableC71129a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71128c f159341a;

        static {
            Covode.recordClassIndex(83635);
        }

        RunnableC71129a(C71128c cVar) {
            this.f159341a = cVar;
        }

        public final void run() {
            C45922g gVar = this.f159341a.f159182l;
            if (gVar != null) {
                gVar.mo77345b();
            }
        }
    }

    /* renamed from: s */
    private final void m125713s() {
        this.f159330B = true;
        this.f159331C.mo114805a((AbstractC72510a) false, false, false);
        m125711a(this.f159332D);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c$c */
    static final class RunnableC71132c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71128c f159344a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f159345b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f159346c;

        static {
            Covode.recordClassIndex(83638);
        }

        RunnableC71132c(C71128c cVar, C89233z.C89238e eVar, C89233z.C89238e eVar2) {
            this.f159344a = cVar;
            this.f159345b = eVar;
            this.f159346c = eVar2;
        }

        public final void run() {
            DuetEditStickerLayout duetEditStickerLayout = this.f159344a.f159329A;
            if (duetEditStickerLayout != null) {
                duetEditStickerLayout.mo112385a(this.f159345b.element, this.f159346c.element);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c$d */
    static final class RunnableC71133d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71128c f159347a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f159348b;

        static {
            Covode.recordClassIndex(83639);
        }

        RunnableC71133d(C71128c cVar, InteractStickerStruct interactStickerStruct) {
            this.f159347a = cVar;
            this.f159348b = interactStickerStruct;
        }

        public final void run() {
            C71128c.super.mo112310a((C71128c) this.f159348b);
            C45922g gVar = this.f159347a.f159182l;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c$f */
    static final class RunnableC71135f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71128c f159349a;

        static {
            Covode.recordClassIndex(83641);
        }

        RunnableC71135f(C71128c cVar) {
            this.f159349a = cVar;
        }

        public final void run() {
            DuetEditStickerLayout duetEditStickerLayout = this.f159349a.f159329A;
            if (duetEditStickerLayout != null) {
                duetEditStickerLayout.mo112385a((DuetEditStickerView) null, new C71117a((byte) 0));
            }
        }
    }

    /* renamed from: t */
    private final String m125714t() {
        return this.f159335G + UUID.randomUUID().toString() + this.f159336H;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: c */
    public final InteractStickerStruct mo112284c() {
        InteractStickerStruct d = super.mo112317d(16);
        if (d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.f159333E, this.f159339b);
        hashMap.put(this.f159334F, this.f159340c);
        d.setAttr(C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(hashMap));
        d.setDuetStickerStruct(this.f159338a);
        d.setIndex(16);
        return d;
    }

    /* renamed from: q */
    public final void mo112446q() {
        if (this.f159338a != null) {
            DuetEditStickerLayout duetEditStickerLayout = this.f159329A;
            if (duetEditStickerLayout != null) {
                new C23144b(duetEditStickerLayout).mo37640e(R.string.be9).mo37637b();
                return;
            }
            return;
        }
        m125713s();
        DuetEditStickerLayout duetEditStickerLayout2 = this.f159329A;
        if (duetEditStickerLayout2 != null) {
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            duetEditStickerLayout2.mo112384a(height, (float) frameLayout2.getTop());
        }
        DuetEditStickerLayout duetEditStickerLayout3 = this.f159329A;
        if (duetEditStickerLayout3 != null) {
            duetEditStickerLayout3.post(new RunnableC71135f(this));
        }
    }

    /* renamed from: r */
    public final void mo112447r() {
        m125713s();
        DuetEditStickerLayout duetEditStickerLayout = this.f159329A;
        if (duetEditStickerLayout != null) {
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            duetEditStickerLayout.mo112384a(height, (float) frameLayout2.getTop());
        }
        mo112324n();
        if (this.f159182l instanceof C71163f) {
            C89233z.C89238e eVar = new C89233z.C89238e();
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerView");
            eVar.element = (T) ((C71163f) gVar).getDuetEditStickerView();
            C45922g gVar2 = this.f159182l;
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerView");
            ((C71163f) gVar2).mo112477r();
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = (T) new C71117a((byte) 0);
            C45922g gVar3 = this.f159182l;
            C89219l.m154716b(gVar3, "");
            eVar2.element.f159287c = AbstractC71078c.m125575b(gVar3.getRotateAngle());
            C45922g gVar4 = this.f159182l;
            C89219l.m154716b(gVar4, "");
            View contentView = gVar4.getContentView();
            C89219l.m154716b(contentView, "");
            eVar2.element.f159285a = contentView.getScaleX();
            C45922g gVar5 = this.f159182l;
            C89219l.m154716b(gVar5, "");
            View contentView2 = gVar5.getContentView();
            C89219l.m154716b(contentView2, "");
            eVar2.element.f159286b = contentView2.getScaleY();
            C45922g gVar6 = this.f159182l;
            C89219l.m154716b(gVar6, "");
            View contentView3 = gVar6.getContentView();
            C89219l.m154716b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout3 = this.f159174d;
            C89219l.m154716b(frameLayout3, "");
            eVar2.element.f159288d = x + frameLayout3.getX();
            C45922g gVar7 = this.f159182l;
            C89219l.m154716b(gVar7, "");
            View contentView4 = gVar7.getContentView();
            C89219l.m154716b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout4 = this.f159174d;
            C89219l.m154716b(frameLayout4, "");
            eVar2.element.f159289e = y + frameLayout4.getY();
            DuetEditStickerLayout duetEditStickerLayout2 = this.f159329A;
            if (duetEditStickerLayout2 != null) {
                duetEditStickerLayout2.post(new RunnableC71132c(this, eVar, eVar2));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final C45922g mo112275a(Context context) {
        C89219l.m154721d(context, "");
        C71163f fVar = new C71163f(context, this.f159332D);
        fVar.setLockMode(true);
        fVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final boolean mo112282a(C45922g gVar) {
        C89219l.m154721d(gVar, "");
        if (!(gVar instanceof C71163f)) {
            return false;
        }
        super.mo112282a(gVar);
        this.f159338a = null;
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c$b */
    public static final class C71130b extends AbstractC89220m implements AbstractC89172b<DuetEditStickerView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71128c f159342a;

        static {
            Covode.recordClassIndex(83636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71130b(C71128c cVar) {
            super(1);
            this.f159342a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DuetEditStickerView duetEditStickerView) {
            DuetStickerStruct duetStickerStruct;
            float f;
            DuetEditStickerView duetEditStickerView2 = duetEditStickerView;
            C71128c cVar = this.f159342a;
            cVar.f159330B = false;
            cVar.f159331C.mo114805a((AbstractC72510a) true, false, true);
            C71128c cVar2 = this.f159342a;
            if (cVar2.f159182l == null) {
                cVar2.mo112280a(false);
                C45922g gVar = cVar2.f159182l;
                if (gVar != null) {
                    if (duetEditStickerView2 != null) {
                        f = duetEditStickerView2.getScaleValue();
                    } else {
                        f = 1.0f;
                    }
                    gVar.mo77337a(f);
                }
            }
            if (cVar2.f159182l instanceof C71163f) {
                if (duetEditStickerView2 != null) {
                    duetStickerStruct = duetEditStickerView2.getDuetStruct();
                } else {
                    duetStickerStruct = null;
                }
                cVar2.f159338a = duetStickerStruct;
                C45922g gVar2 = cVar2.f159182l;
                Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerView");
                ((C71163f) gVar2).mo112472a(duetEditStickerView2);
                C45922g gVar3 = cVar2.f159182l;
                if (gVar3 != null) {
                    gVar3.post(new RunnableC71129a(cVar2));
                }
            }
            if (this.f159342a.f159182l != null && (this.f159342a.f159182l instanceof C71163f)) {
                this.f159342a.f159182l.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.C71128c.C71130b.RunnableC711311 */

                    /* renamed from: a */
                    final /* synthetic */ C71130b f159343a;

                    static {
                        Covode.recordClassIndex(83637);
                    }

                    {
                        this.f159343a = r1;
                    }

                    public final void run() {
                        C45922g gVar = this.f159343a.f159342a.f159182l;
                        if (gVar != null) {
                            gVar.mo77351e();
                        }
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m125711a(VideoPublishEditModel videoPublishEditModel) {
        String str;
        C89219l.m154721d(videoPublishEditModel, "");
        C84425b a = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId);
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        if (e != null) {
            str = e.mo58660c();
        } else {
            str = null;
        }
        C39162r.m79460a("enter_duet_sticker_settings", a.mo129406a("user_id", str).mo129406a("content_source", C70968bl.m125262b(videoPublishEditModel)).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_entrance", videoPublishEditModel.mShootWay).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112310a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f159338a = interactStickerStruct.getDuetStickerStruct();
            mo112280a(true);
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerView");
            ((C71163f) gVar).mo112473a(this.f159338a);
            if (this.f159184n != null) {
                this.f159184n.mo112344f();
            }
            C45922g gVar2 = this.f159182l;
            C89219l.m154716b(gVar2, "");
            gVar2.setVisibility(4);
            HashMap hashMap = (HashMap) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46671a(interactStickerStruct.getAttr(), new C71134e().type);
            this.f159339b = (String) hashMap.get(this.f159333E);
            if (hashMap.containsKey(this.f159334F)) {
                this.f159340c = (String) hashMap.get(this.f159334F);
            }
        }
        if (this.f159182l != null) {
            this.f159182l.postDelayed(new RunnableC71133d(this, interactStickerStruct), 300);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112279a(String str) {
        C89219l.m154721d(str, "");
        if (C13627m.m24498a(str)) {
            return;
        }
        if (!C89361p.m154908a((CharSequence) str, (CharSequence) this.f159335G, false) || !C89361p.m154908a((CharSequence) str, (CharSequence) this.f159336H, false)) {
            String str2 = File.separator;
            C89219l.m154716b(str2, "");
            if (C89361p.m154876c(str, str2, false)) {
                super.mo112279a(str + m125714t());
            } else {
                super.mo112279a(str + m125714t());
            }
        } else {
            super.mo112279a(new C89350l(this.f159337I).replace(str, m125714t()));
        }
    }

    public C71128c(AbstractC72510a aVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f159331C = aVar;
        this.f159332D = videoPublishEditModel;
    }
}
