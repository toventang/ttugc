package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.content.Context;
import android.graphics.PointF;
import android.os.SystemClock;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45887e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C71106d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b */
public final class C71101b extends AbstractC71078c {

    /* renamed from: A */
    public static final C71102a f159237A = new C71102a((byte) 0);

    /* renamed from: B */
    private EditDonationStickerViewModel f159238B;

    /* renamed from: a */
    public C71105c f159239a;

    /* renamed from: b */
    public String f159240b;

    /* renamed from: c */
    public boolean f159241c;

    static {
        Covode.recordClassIndex(83603);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: f */
    public final int mo112287f() {
        return R.string.axi;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b$a */
    public static final class C71102a {
        static {
            Covode.recordClassIndex(83604);
        }

        private C71102a() {
        }

        public /* synthetic */ C71102a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final boolean mo112283b() {
        if (this.f159239a != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: d */
    public final void mo112285d() {
        this.f159239a = null;
        super.mo112285d();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b$c */
    static final class RunnableC71104c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71101b f159243a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f159244b;

        static {
            Covode.recordClassIndex(83606);
        }

        RunnableC71104c(C71101b bVar, InteractStickerStruct interactStickerStruct) {
            this.f159243a = bVar;
            this.f159244b = interactStickerStruct;
        }

        public final void run() {
            C71101b.super.mo112310a((C71101b) this.f159244b);
            C45922g gVar = this.f159243a.f159182l;
            C89219l.m154716b(gVar, "");
            gVar.setVisibility(0);
        }
    }

    /* renamed from: q */
    private static String m125670q() {
        return "pi_start" + UUID.randomUUID().toString() + "pi_end";
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: g */
    public final boolean mo112288g() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.f159238B;
        if (editDonationStickerViewModel == null) {
            C89219l.m154710a("donationStickerViewModel");
        }
        Context context = this.f159190t;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return ((EditDonationStickerState) editDonationStickerViewModel.mo33676a((ActivityC0945e) context)).getInTimeEditView();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: c */
    public final InteractStickerStruct mo112284c() {
        float f;
        String str;
        String str2;
        AbstractC82771b bVar;
        String addTime;
        AbstractC82771b bVar2;
        AbstractC82771b bVar3;
        C71106d dVar = null;
        if (!mo112283b() || this.f159182l == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(6);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        C45922g gVar = this.f159182l;
        String str3 = "";
        C89219l.m154716b(gVar, str3);
        normalTrackTimeStamp.setRotation(AbstractC71078c.m125575b(gVar.getRotateAngle()));
        C45922g gVar2 = this.f159182l;
        C89219l.m154716b(gVar2, str3);
        normalTrackTimeStamp.setScale(Float.valueOf(gVar2.getScale()));
        PointF a = mo112303a(this.f159182l.getCenterViewPoint());
        normalTrackTimeStamp.setX(a.x);
        normalTrackTimeStamp.setY(a.y);
        C45922g gVar3 = this.f159182l;
        if (!(gVar3 instanceof C71106d)) {
            gVar3 = null;
        }
        C71106d dVar2 = (C71106d) gVar3;
        float f2 = 0.0f;
        if (dVar2 != null) {
            f = dVar2.getStartTime();
        } else {
            f = 0.0f;
        }
        normalTrackTimeStamp.setStartTime(f);
        C45922g gVar4 = this.f159182l;
        if (gVar4 instanceof C71106d) {
            dVar = gVar4;
        }
        C71106d dVar3 = dVar;
        if (dVar3 != null) {
            f2 = dVar3.getEndTime();
        }
        normalTrackTimeStamp.setEndTime(f2);
        C45922g gVar5 = this.f159182l;
        C89219l.m154716b(gVar5, str3);
        float contentViewWidth = (float) gVar5.getContentViewWidth();
        C45922g gVar6 = this.f159182l;
        C89219l.m154716b(gVar6, str3);
        PointF a2 = mo112303a(new PointF(contentViewWidth, (float) gVar6.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a2.x);
        normalTrackTimeStamp.setHeight(a2.y);
        linkedList.add(normalTrackTimeStamp);
        C45887e.m88531a(interactStickerStruct, linkedList);
        C89378p[] pVarArr = new C89378p[3];
        C71105c cVar = this.f159239a;
        if (cVar == null || (bVar3 = cVar.f159245a) == null || (str = bVar3.getName()) == null) {
            str = str3;
        }
        pVarArr[0] = C89387v.m154943a("donation_name", str);
        C71105c cVar2 = this.f159239a;
        if (cVar2 == null || (bVar2 = cVar2.f159245a) == null || (str2 = bVar2.getDonateLink()) == null) {
            str2 = str3;
        }
        pVarArr[1] = C89387v.m154943a("donation_url", str2);
        C71105c cVar3 = this.f159239a;
        if (!(cVar3 == null || (bVar = cVar3.f159245a) == null || (addTime = bVar.getAddTime()) == null)) {
            str3 = addTime;
        }
        pVarArr[2] = C89387v.m154943a("add_anchor_time", str3);
        interactStickerStruct.setAttr(C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(C89041ag.m154428c(pVarArr)));
        return interactStickerStruct;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final boolean mo112282a(C45922g gVar) {
        if (!(gVar instanceof C71106d)) {
            return false;
        }
        this.f159239a = null;
        return super.mo112282a(gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final C45922g mo112275a(Context context) {
        C89219l.m154721d(context, "");
        C71106d dVar = new C71106d(context, (byte) 0);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        dVar.setController(this);
        dVar.setLockMode(true);
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b$b */
    public static final class C71103b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71101b f159242a;

        static {
            Covode.recordClassIndex(83605);
        }

        public C71103b(C71101b bVar) {
            this.f159242a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5545d() == null) {
                return null;
            }
            C45922g gVar = this.f159242a.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView");
            C71105c a = C71105c.m125682a(((C71106d) gVar).f159249q.mo112346a());
            Object d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            return new C71100a(a, (C45859b) d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112310a(InteractStickerStruct interactStickerStruct) {
        if (this.f159182l != null) {
            this.f159182l.postDelayed(new RunnableC71104c(this, interactStickerStruct), 300);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112279a(String str) {
        if (!C13627m.m24498a(str)) {
            if (str == null) {
                C89219l.m154715b();
            }
            if (!C89361p.m154908a((CharSequence) str, (CharSequence) "pi_start", false) || !C89361p.m154908a((CharSequence) str, (CharSequence) "pi_end", false)) {
                String str2 = File.separator;
                C89219l.m154716b(str2, "");
                if (C89361p.m154876c(str, str2, false)) {
                    super.mo112279a(str + m125670q());
                } else {
                    super.mo112279a(str + m125670q());
                }
            } else {
                super.mo112279a(new C89350l("pi_start(.*?)pi_end").replace(str, m125670q()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112276a(Context context, FrameLayout frameLayout) {
        super.mo112276a(context, frameLayout);
        Context context2 = this.f159190t;
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) context2).mo33800a(EditDonationStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f159238B = (EditDonationStickerViewModel) a;
        this.f159241c = false;
    }

    /* renamed from: a */
    public final void mo112371a(C71105c cVar, boolean z, boolean z2) {
        AbstractC82771b bVar;
        C89219l.m154721d(cVar, "");
        AbstractC82771b bVar2 = cVar.f159245a;
        C71106d dVar = null;
        if ((bVar2 == null || bVar2.getAddTime() == null) && (bVar = cVar.f159245a) != null) {
            bVar.setAddTime(String.valueOf(SystemClock.elapsedRealtime()));
        }
        this.f159239a = cVar;
        mo112280a(z2);
        C45922g gVar = this.f159182l;
        if (gVar instanceof C71106d) {
            dVar = gVar;
        }
        C71106d dVar2 = dVar;
        if (dVar2 != null) {
            C89219l.m154721d(cVar, "");
            dVar2.setVisibility(4);
            dVar2.f159249q.setDonationStickerData(cVar);
            if (z) {
                dVar2.post(new C71106d.RunnableC71108b(dVar2));
            }
        }
        if (this.f159184n != null) {
            this.f159184n.mo112344f();
        }
    }
}
