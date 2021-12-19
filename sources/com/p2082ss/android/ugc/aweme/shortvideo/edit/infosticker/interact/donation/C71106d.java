package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3859a.C72837b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d */
public final class C71106d extends C45922g {

    /* renamed from: q */
    public final DonationStickerView f159249q;

    /* renamed from: r */
    private final int f159250r;

    /* renamed from: s */
    private final EditDonationStickerViewModel f159251s;

    static {
        Covode.recordClassIndex(83608);
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

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    public final View getDrawView() {
        return this.f159249q;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d$a */
    public static final class RunnableC71107a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71106d f159252a;

        static {
            Covode.recordClassIndex(83609);
        }

        public RunnableC71107a(C71106d dVar) {
            this.f159252a = dVar;
        }

        public final void run() {
            this.f159252a.mo77345b();
        }
    }

    /* renamed from: r */
    public final void mo112378r() {
        this.f159249q.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d$b */
    public static final class RunnableC71108b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71106d f159253a;

        static {
            Covode.recordClassIndex(83610);
        }

        RunnableC71108b(C71106d dVar) {
            this.f159253a = dVar;
        }

        public final void run() {
            this.f159253a.mo77351e();
            this.f159253a.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final AbstractC45824b mo77336a() {
        return new C72837b(this, new C45922g.C45923a());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: d */
    public final boolean mo77350d() {
        if (this.f159249q.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final float getEndTime() {
        return (float) this.f159249q.mo65018b(0);
    }

    public final float getStartTime() {
        return (float) this.f159249q.mo65014a(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: i */
    public final boolean mo77366i() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.f159251s;
        Context context = this.f106949a;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return ((EditDonationStickerState) editDonationStickerViewModel.mo33676a((ActivityC0945e) context)).getInTimeEditView();
    }

    public final void setAlpha(float f) {
        this.f159249q.setAlpha(f);
    }

    public final void setPlayPosition(long j) {
        this.f159249q.setPlayPosition(j);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: b */
    public final boolean mo77347b(MotionEvent motionEvent) {
        boolean b = super.mo77347b(motionEvent);
        this.f159249q.setTouching(false);
        return b;
    }

    public final void setController(C71101b bVar) {
        C89219l.m154721d(bVar, "");
        this.f159249q.setStickerController(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final boolean mo77341a(MotionEvent motionEvent) {
        boolean a = super.mo77341a(motionEvent);
        if (a) {
            this.f159249q.setTouching(true);
        }
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C71106d(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13724);
        this.f159250r = (int) C13628n.m24520b(context, 32.0f);
        this.f106949a = context;
        Context context2 = this.f106949a;
        if (context2 != null) {
            JediViewModel a = C20531t.m38716a((ActivityC0945e) context2).mo33800a(EditDonationStickerViewModel.class);
            C89219l.m154716b(a, "");
            this.f159251s = (EditDonationStickerViewModel) a;
            LayoutInflater.from(context).inflate(R.layout.as2, this);
            this.f106954f = (StickerHelpBoxView) findViewById(R.id.e8x);
            this.f106955g = findViewById(R.id.ade);
            View findViewById = findViewById(R.id.anj);
            C89219l.m154716b(findViewById, "");
            this.f159249q = (DonationStickerView) findViewById;
            setVisibility(8);
            this.f106962n = 0.8f;
            MethodCollector.m26664o(13724);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(13724);
        throw nullPointerException;
    }

    public /* synthetic */ C71106d(Context context, byte b) {
        this(context);
    }
}
