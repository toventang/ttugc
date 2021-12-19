package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71169d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.C71203a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tools.view.widget.AVTextView;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a */
public final class C71211a extends AbstractC71078c {

    /* renamed from: D */
    public static final C71212a f159569D = new C71212a((byte) 0);

    /* renamed from: A */
    public boolean f159570A;

    /* renamed from: B */
    public CountDownStickerStruct f159571B;

    /* renamed from: C */
    final AbstractC72510a f159572C;

    /* renamed from: a */
    public String f159573a;

    /* renamed from: b */
    public String f159574b;

    /* renamed from: c */
    public LiveCDEditStickerLayout f159575c;

    static {
        Covode.recordClassIndex(83723);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: f */
    public final int mo112287f() {
        return R.string.axu;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$a */
    public static final class C71212a {
        static {
            Covode.recordClassIndex(83724);
        }

        private C71212a() {
        }

        public /* synthetic */ C71212a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$g */
    public static final class C71219g extends C27895a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83731);
        }

        C71219g() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$b */
    static final class RunnableC71213b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71211a f159576a;

        static {
            Covode.recordClassIndex(83725);
        }

        RunnableC71213b(C71211a aVar) {
            this.f159576a = aVar;
        }

        public final void run() {
            this.f159576a.f159182l.mo77345b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final boolean mo112283b() {
        if (this.f159571B != null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private final void m125832s() {
        this.f159570A = true;
        this.f159572C.mo114805a((AbstractC72510a) false, false, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$e */
    static final class RunnableC71217e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71211a f159581a;

        /* renamed from: b */
        final /* synthetic */ LiveCDEditStickerView f159582b;

        /* renamed from: c */
        final /* synthetic */ C71203a f159583c;

        static {
            Covode.recordClassIndex(83729);
        }

        RunnableC71217e(C71211a aVar, LiveCDEditStickerView liveCDEditStickerView, C71203a aVar2) {
            this.f159581a = aVar;
            this.f159582b = liveCDEditStickerView;
            this.f159583c = aVar2;
        }

        public final void run() {
            AVTextView aVTextView;
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159581a.f159575c;
            if (!(liveCDEditStickerLayout == null || (aVTextView = liveCDEditStickerLayout.f159493d) == null)) {
                aVTextView.setVisibility(8);
            }
            LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f159581a.f159575c;
            if (liveCDEditStickerLayout2 != null) {
                liveCDEditStickerLayout2.mo112533a(this.f159582b, this.f159583c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$f */
    static final class RunnableC71218f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71211a f159584a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f159585b;

        static {
            Covode.recordClassIndex(83730);
        }

        RunnableC71218f(C71211a aVar, InteractStickerStruct interactStickerStruct) {
            this.f159584a = aVar;
            this.f159585b = interactStickerStruct;
        }

        public final void run() {
            C71211a.super.mo112310a((C71211a) this.f159585b);
            C45922g gVar = this.f159584a.f159182l;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$h */
    static final class RunnableC71220h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71211a f159586a;

        static {
            Covode.recordClassIndex(83732);
        }

        RunnableC71220h(C71211a aVar) {
            this.f159586a = aVar;
        }

        public final void run() {
            AVTextView aVTextView;
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159586a.f159575c;
            if (!(liveCDEditStickerLayout == null || (aVTextView = liveCDEditStickerLayout.f159493d) == null)) {
                aVTextView.setVisibility(0);
            }
            LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f159586a.f159575c;
            if (liveCDEditStickerLayout2 != null) {
                liveCDEditStickerLayout2.mo112533a((LiveCDEditStickerView) null, new C71203a((byte) 0));
            }
        }
    }

    /* renamed from: t */
    private static String m125833t() {
        return "pi_start" + UUID.randomUUID().toString() + "pi_end";
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: c */
    public final InteractStickerStruct mo112284c() {
        InteractStickerStruct d = super.mo112317d(10);
        if (d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("livecd_sticker_id", this.f159573a);
        hashMap.put("livecd_sticker_tab_id", this.f159574b);
        d.setAttr(C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(hashMap));
        d.setIndex(3);
        d.setCountDownStickerStruct(this.f159571B);
        return d;
    }

    /* renamed from: q */
    public final void mo112446q() {
        if (this.f159571B != null) {
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159575c;
            if (liveCDEditStickerLayout == null) {
                C89219l.m154715b();
            }
            new C79459a(liveCDEditStickerLayout.getContext()).mo123050a(R.string.auz).mo123053a();
            return;
        }
        m125832s();
        LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f159575c;
        if (liveCDEditStickerLayout2 != null) {
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            liveCDEditStickerLayout2.mo112530a(height, (float) frameLayout2.getTop());
        }
        LiveCDEditStickerLayout liveCDEditStickerLayout3 = this.f159575c;
        if (liveCDEditStickerLayout3 != null) {
            liveCDEditStickerLayout3.post(new RunnableC71220h(this));
        }
    }

    /* renamed from: r */
    public final void mo112447r() {
        m125832s();
        LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159575c;
        if (liveCDEditStickerLayout != null) {
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            liveCDEditStickerLayout.mo112530a(height, (float) frameLayout2.getTop());
        }
        mo112324n();
        if (this.f159182l instanceof C71221b) {
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
            LiveCDEditStickerView baseView = ((C71221b) gVar).getBaseView();
            C45922g gVar2 = this.f159182l;
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
            ((C71221b) gVar2).mo112607s();
            C71203a aVar = new C71203a((byte) 0);
            aVar.f159561f = 0;
            C45922g gVar3 = this.f159182l;
            C89219l.m154716b(gVar3, "");
            aVar.f159558c = AbstractC71078c.m125575b(gVar3.getRotateAngle());
            C45922g gVar4 = this.f159182l;
            C89219l.m154716b(gVar4, "");
            View contentView = gVar4.getContentView();
            C89219l.m154716b(contentView, "");
            aVar.f159556a = contentView.getScaleX();
            C45922g gVar5 = this.f159182l;
            C89219l.m154716b(gVar5, "");
            View contentView2 = gVar5.getContentView();
            C89219l.m154716b(contentView2, "");
            aVar.f159557b = contentView2.getScaleY();
            C45922g gVar6 = this.f159182l;
            C89219l.m154716b(gVar6, "");
            View contentView3 = gVar6.getContentView();
            C89219l.m154716b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout3 = this.f159174d;
            C89219l.m154716b(frameLayout3, "");
            aVar.f159559d = x + frameLayout3.getX();
            C45922g gVar7 = this.f159182l;
            C89219l.m154716b(gVar7, "");
            View contentView4 = gVar7.getContentView();
            C89219l.m154716b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout4 = this.f159174d;
            C89219l.m154716b(frameLayout4, "");
            aVar.f159560e = y + frameLayout4.getY();
            LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f159575c;
            if (liveCDEditStickerLayout2 != null) {
                liveCDEditStickerLayout2.post(new RunnableC71217e(this, baseView, aVar));
            }
        }
    }

    public C71211a(AbstractC72510a aVar) {
        C89219l.m154721d(aVar, "");
        this.f159572C = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final C45922g mo112275a(Context context) {
        C89219l.m154721d(context, "");
        C71221b bVar = new C71221b(context);
        bVar.setLockMode(true);
        bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$d */
    public static final class C71216d extends AbstractC89220m implements AbstractC89172b<LiveCDEditStickerView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71211a f159579a;

        /* renamed from: b */
        final /* synthetic */ LiveCDEditStickerLayout f159580b;

        static {
            Covode.recordClassIndex(83728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71216d(C71211a aVar, LiveCDEditStickerLayout liveCDEditStickerLayout) {
            super(1);
            this.f159579a = aVar;
            this.f159580b = liveCDEditStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(LiveCDEditStickerView liveCDEditStickerView) {
            if (this.f159579a.f159182l == null || !(this.f159579a.f159182l instanceof C71221b)) {
                LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159579a.f159575c;
                if (liveCDEditStickerLayout != null) {
                    liveCDEditStickerLayout.mo112537b();
                }
            } else {
                C45922g gVar = this.f159579a.f159182l;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
                this.f159580b.f159498i.f159560e += ((C71221b) gVar).mo112606r();
                LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f159579a.f159575c;
                if (liveCDEditStickerLayout2 != null) {
                    liveCDEditStickerLayout2.mo112537b();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final boolean mo112282a(C45922g gVar) {
        C71169d dVar;
        C89219l.m154721d(gVar, "");
        if (gVar instanceof C71221b) {
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159575c;
            if (!(liveCDEditStickerLayout == null || (dVar = liveCDEditStickerLayout.f159510u) == null)) {
                dVar.mo112485b(false);
            }
            super.mo112282a(gVar);
            this.f159571B = null;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112310a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            mo112280a(true);
            this.f159571B = interactStickerStruct.getCountDownStickerStruct();
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
            ((C71221b) gVar).mo112603a(this.f159571B);
            if (this.f159184n != null) {
                this.f159184n.mo112344f();
            }
            C45922g gVar2 = this.f159182l;
            C89219l.m154716b(gVar2, "");
            gVar2.setVisibility(4);
            HashMap hashMap = (HashMap) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46671a(interactStickerStruct.getAttr(), new C71219g().type);
            this.f159573a = (String) hashMap.get("livecd_sticker_id");
            if (hashMap.containsKey("livecd_sticker_tab_id")) {
                this.f159574b = (String) hashMap.get("livecd_sticker_tab_id");
            }
        }
        if (this.f159182l != null) {
            this.f159182l.postDelayed(new RunnableC71218f(this, interactStickerStruct), 300);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112279a(String str) {
        C89219l.m154721d(str, "");
        if (C13627m.m24498a(str)) {
            return;
        }
        if (!C89361p.m154908a((CharSequence) str, (CharSequence) "pi_start", false) || !C89361p.m154908a((CharSequence) str, (CharSequence) "pi_end", false)) {
            String str2 = File.separator;
            C89219l.m154716b(str2, "");
            if (C89361p.m154876c(str, str2, false)) {
                super.mo112279a(str + m125833t());
            } else {
                super.mo112279a(str + m125833t());
            }
        } else {
            super.mo112279a(new C89350l("pi_start(.*?)pi_end").replace(str, m125833t()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$c */
    public static final class C71214c extends AbstractC89220m implements AbstractC89183m<LiveCDEditStickerView, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71211a f159577a;

        static {
            Covode.recordClassIndex(83726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71214c(C71211a aVar) {
            super(2);
            this.f159577a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(LiveCDEditStickerView liveCDEditStickerView, Boolean bool) {
            CountDownStickerStruct countDownStickerStruct;
            LiveCDEditStickerView liveCDEditStickerView2 = liveCDEditStickerView;
            boolean booleanValue = bool.booleanValue();
            C71211a aVar = this.f159577a;
            aVar.f159570A = false;
            aVar.f159572C.mo114805a((AbstractC72510a) true, false, true);
            if (!booleanValue) {
                C71211a aVar2 = this.f159577a;
                if (aVar2.f159182l == null) {
                    aVar2.mo112280a(false);
                }
                if (aVar2.f159182l instanceof C71221b) {
                    if (liveCDEditStickerView2 != null) {
                        countDownStickerStruct = liveCDEditStickerView2.getLiveCDStruct();
                    } else {
                        countDownStickerStruct = null;
                    }
                    aVar2.f159571B = countDownStickerStruct;
                    C45922g gVar = aVar2.f159182l;
                    Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
                    ((C71221b) gVar).mo112602a(liveCDEditStickerView2);
                    aVar2.f159182l.post(new RunnableC71213b(aVar2));
                }
                if (this.f159577a.f159182l != null && (this.f159577a.f159182l instanceof C71221b)) {
                    this.f159577a.f159182l.post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.C71211a.C71214c.RunnableC712151 */

                        /* renamed from: a */
                        final /* synthetic */ C71214c f159578a;

                        static {
                            Covode.recordClassIndex(83727);
                        }

                        {
                            this.f159578a = r1;
                        }

                        public final void run() {
                            this.f159578a.f159577a.f159182l.mo77351e();
                        }
                    });
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112306a(AbstractC31071f fVar, AbstractC72510a aVar) {
        LiveCDEditStickerLayout liveCDEditStickerLayout;
        super.mo112306a(fVar, aVar);
        if (fVar != null) {
            float f = (float) fVar.mo56330b().height;
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            if (f > C13628n.m24520b(frameLayout.getContext(), 214.0f)) {
                LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f159575c;
                if (liveCDEditStickerLayout2 != null) {
                    liveCDEditStickerLayout2.setMaxLine(3);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            if (f > C13628n.m24520b(frameLayout2.getContext(), 194.0f)) {
                LiveCDEditStickerLayout liveCDEditStickerLayout3 = this.f159575c;
                if (liveCDEditStickerLayout3 != null) {
                    liveCDEditStickerLayout3.setMaxLine(2);
                    return;
                }
                return;
            }
            FrameLayout frameLayout3 = this.f159174d;
            C89219l.m154716b(frameLayout3, "");
            if (f > C13628n.m24520b(frameLayout3.getContext(), 184.0f) && (liveCDEditStickerLayout = this.f159575c) != null) {
                liveCDEditStickerLayout.setMaxLine(1);
            }
        }
    }
}
