package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.google.android.material.internal.CheckableImageButton;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C70563d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71433b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b */
public class C71497b implements AbstractC71496a {

    /* renamed from: a */
    protected View f160212a;

    /* renamed from: b */
    protected AbstractC70516a f160213b;

    /* renamed from: c */
    protected View f160214c;

    /* renamed from: d */
    protected View f160215d;

    /* renamed from: e */
    protected View f160216e;

    /* renamed from: f */
    protected View f160217f;

    /* renamed from: g */
    public AbstractC71433b f160218g;

    /* renamed from: h */
    protected CheckableImageButton f160219h;

    /* renamed from: i */
    protected ImageView f160220i;

    /* renamed from: j */
    protected ActivityC0945e f160221j;

    /* renamed from: k */
    private View f160222k;

    /* renamed from: l */
    private View f160223l;

    static {
        Covode.recordClassIndex(84038);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public void mo113190a(int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public void mo113193a(ActivityC0945e eVar, int i, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public void mo113196a(ActivityC0945e eVar, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public void mo113197a(VideoSegment videoSegment) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public void mo113199a(List<? extends VideoSegment> list) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public void mo113201a(boolean z, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public void mo113202b(C0692e<Float, Float> eVar) {
        C89219l.m154721d(eVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public void mo113203b(ActivityC0945e eVar, int i, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public void mo113204b(VideoSegment videoSegment) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: c */
    public void mo113208c(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: f */
    public void mo113211f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: g */
    public void mo113212g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: h */
    public void mo113213h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: i */
    public void mo113214i() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: j */
    public void mo113215j() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: k */
    public void mo113216k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113200a(boolean z) {
        View view = this.f160222k;
        if (view == null) {
            C89219l.m154710a("playView");
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final AbstractC70516a mo113189a() {
        AbstractC70516a aVar = this.f160213b;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: e */
    public final boolean mo113210e() {
        AbstractC70516a aVar = this.f160213b;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        return aVar.mo111148g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final AbstractC70516a mo113217l() {
        AbstractC70516a aVar = this.f160213b;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final View mo113218m() {
        View view = this.f160214c;
        if (view == null) {
            C89219l.m154710a("cancleView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final View mo113219n() {
        View view = this.f160215d;
        if (view == null) {
            C89219l.m154710a("saveView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final View mo113220o() {
        View view = this.f160217f;
        if (view == null) {
            C89219l.m154710a("iRephotographLayout");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final CheckableImageButton mo113221p() {
        CheckableImageButton checkableImageButton = this.f160219h;
        if (checkableImageButton == null) {
            C89219l.m154710a("speedView");
        }
        return checkableImageButton;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final ImageView mo113222q() {
        ImageView imageView = this.f160220i;
        if (imageView == null) {
            C89219l.m154710a("rotateView");
        }
        return imageView;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public final boolean mo113206b() {
        View view = this.f160222k;
        if (view == null) {
            C89219l.m154710a("playView");
        }
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: d */
    public final C0692e<Float, Float> mo113209d() {
        AbstractC70516a aVar = this.f160213b;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        C0692e<Float, Float> slideX = aVar.getSlideX();
        C89219l.m154716b(slideX, "");
        return slideX;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: c */
    public final void mo113207c() {
        View view = this.f160212a;
        if (view == null) {
            C89219l.m154710a("tvTime");
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        ActivityC0945e eVar = this.f160221j;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        AbstractC70516a aVar = this.f160213b;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        textView.setText(C70563d.m124627a(eVar, aVar.getSelectedTime(), false));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113192a(C0692e<Float, Float> eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC70516a aVar = this.f160213b;
        if (aVar == null) {
            C89219l.m154710a("videoEditView");
        }
        aVar.mo111132a(eVar, (List<VideoSegment>) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public void mo113191a(View.OnClickListener onClickListener) {
        View view = this.f160214c;
        if (view == null) {
            C89219l.m154710a("cancleView");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.f160215d;
        if (view2 == null) {
            C89219l.m154710a("saveView");
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f160223l;
        if (view3 == null) {
            C89219l.m154710a("videoControlView");
        }
        view3.setOnClickListener(onClickListener);
        View view4 = this.f160217f;
        if (view4 == null) {
            C89219l.m154710a("iRephotographLayout");
        }
        view4.setOnClickListener(onClickListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public final void mo113205b(boolean z) {
        int i;
        View view = this.f160216e;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (z) {
            AbstractC70516a aVar = this.f160213b;
            if (aVar == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar.mo111127a();
        }
        mo113200a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113198a(AbstractC71433b bVar) {
        C89219l.m154721d(bVar, "");
        this.f160218g = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public void mo113194a(ActivityC0945e eVar, View view, boolean z) {
        if (eVar != null && view != null) {
            this.f160221j = eVar;
            this.f160216e = view;
            View findViewById = view.findViewById(R.id.err);
            C89219l.m154716b(findViewById, "");
            this.f160212a = findViewById;
            View findViewById2 = view.findViewById(R.id.et8);
            C89219l.m154716b(findViewById2, "");
            this.f160214c = findViewById2;
            View findViewById3 = view.findViewById(R.id.f2x);
            C89219l.m154716b(findViewById3, "");
            this.f160215d = findViewById3;
            View findViewById4 = view.findViewById(R.id.dht);
            C89219l.m154716b(findViewById4, "");
            this.f160217f = findViewById4;
            View findViewById5 = view.findViewById(R.id.bs2);
            C89219l.m154716b(findViewById5, "");
            this.f160222k = findViewById5;
            View findViewById6 = view.findViewById(R.id.ae8);
            C89219l.m154716b(findViewById6, "");
            this.f160223l = findViewById6;
            View findViewById7 = view.findViewById(R.id.bs_);
            C89219l.m154716b(findViewById7, "");
            this.f160219h = (CheckableImageButton) findViewById7;
            View findViewById8 = view.findViewById(R.id.bs8);
            C89219l.m154716b(findViewById8, "");
            this.f160220i = (ImageView) findViewById8;
            View findViewById9 = view.findViewById(R.id.fbq);
            C89219l.m154716b(findViewById9, "");
            AbstractC70516a aVar = (AbstractC70516a) findViewById9;
            this.f160213b = aVar;
            if (aVar == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar.setVisibility(0);
            AbstractC70516a aVar2 = this.f160213b;
            if (aVar2 == null) {
                C89219l.m154710a("videoEditView");
            }
            aVar2.f157702a = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113195a(androidx.fragment.app.ActivityC0945e r11, com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel r12, java.util.List<? extends com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel> r13, boolean r14, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70542w r15) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            r5 = r11
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r1 = r10.f160213b
            java.lang.String r3 = "videoEditView"
            if (r1 != 0) goto L_0x000f
            p4600h.p4611f.p4613b.C89219l.m154710a(r3)
        L_0x000f:
            r0 = 1
            r1.setExtractFramesInRoughMode(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r4 = r10.f160213b
            if (r4 != 0) goto L_0x001a
            p4600h.p4611f.p4613b.C89219l.m154710a(r3)
        L_0x001a:
            r7 = 0
            if (r13 != 0) goto L_0x001f
            h.a.z r13 = p4600h.p4601a.C89086z.INSTANCE
        L_0x001f:
            r1 = 0
            r0 = 6
            r2 = 0
            java.util.ArrayList r8 = com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70528i.m124563a(r13, r1, r2, r0)
            r6 = r12
            r9 = r14
            r4.mo111138a(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r1 = r10.f160213b
            if (r1 != 0) goto L_0x0032
            p4600h.p4611f.p4613b.C89219l.m154710a(r3)
        L_0x0032:
            r0 = r9 ^ 1
            r1.setEditViewHeight(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r1 = r10.f160213b
            if (r1 != 0) goto L_0x003e
            p4600h.p4611f.p4613b.C89219l.m154710a(r3)
        L_0x003e:
            boolean r0 = r1 instanceof com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
            if (r0 != 0) goto L_0x004a
        L_0x0042:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView r2 = (com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView) r2
            if (r2 == 0) goto L_0x0049
            r2.setViewConfig(r15)
        L_0x0049:
            return
        L_0x004a:
            r2 = r1
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b.mo113195a(androidx.fragment.app.e, com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel, java.util.List, boolean, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.w):void");
    }
}
