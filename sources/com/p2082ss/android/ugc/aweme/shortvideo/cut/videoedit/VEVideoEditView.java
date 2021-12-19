package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70087b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70088c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70089d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView */
public final class VEVideoEditView extends VideoEditView {

    /* renamed from: U */
    private final float f157581U;

    /* renamed from: b */
    public long f157582b;

    static {
        Covode.recordClassIndex(82961);
    }

    public VEVideoEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: d */
    public final boolean mo111107d() {
        return this.f157661v;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: f */
    public final void mo111109f() {
        this.f157644e.f157699x.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public final long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public final long getMultiSeekTime() {
        return getSingleSeekTime();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public final long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: k */
    public final void mo111120k() {
        super.mo111120k();
        m124395t();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: l */
    public final void mo111121l() {
        super.mo111121l();
        m124395t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView$b */
    public static final class RunnableC70509b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEVideoEditView f157584a;

        static {
            Covode.recordClassIndex(82963);
        }

        RunnableC70509b(VEVideoEditView vEVideoEditView) {
            this.f157584a = vEVideoEditView;
        }

        public final void run() {
            this.f157584a.mo111118i();
            this.f157584a.mo111119j();
        }
    }

    /* renamed from: t */
    private final void m124395t() {
        post(new RunnableC70509b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public final long getLeftSeekingValue() {
        return (long) ((this.f157591G + ((float) C70082m.f156702d)) * this.f157662w.f156738e);
    }

    /* renamed from: s */
    private final void m124394s() {
        this.f157647h.setOnTouchListener(null);
        this.f157646g.setOnTouchListener(null);
        this.f157657r.setOnTouchListener(null);
        this.f157659t = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public final long getPlayingPosition() {
        float f = this.f157591G;
        RTLLinearLayout rTLLinearLayout = this.f157657r;
        C89219l.m154716b(rTLLinearLayout, "");
        float startX = f + rTLLinearLayout.getStartX();
        RTLImageView rTLImageView = this.f157647h;
        C89219l.m154716b(rTLImageView, "");
        return (long) ((startX - rTLImageView.getStartX()) * this.f157662w.f156738e);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public final long getRightSeekingValue() {
        float f = this.f157591G;
        RTLImageView rTLImageView = this.f157646g;
        C89219l.m154716b(rTLImageView, "");
        float startX = f + rTLImageView.getStartX();
        RTLImageView rTLImageView2 = this.f157647h;
        C89219l.m154716b(rTLImageView2, "");
        return (long) ((startX - rTLImageView2.getStartX()) * this.f157662w.f156738e);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: h */
    public final void mo111117h() {
        super.mo111117h();
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f157645f;
        C89219l.m154716b(cutMultiVideoViewModel, "");
        cutMultiVideoViewModel.f156531c.observe(this.f157643d, new C70508a(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: e */
    public final void mo111108e() {
        C70087b bVar = this.f157662w;
        VideoEditViewModel videoEditViewModel = this.f157644e;
        C89219l.m154716b(videoEditViewModel, "");
        List<VideoSegment> k = videoEditViewModel.mo111232k();
        VideoEditViewModel videoEditViewModel2 = this.f157644e;
        C89219l.m154716b(videoEditViewModel2, "");
        bVar.mo110590a(k, videoEditViewModel2.mo111233l());
        C70520b bVar2 = this.f157588D;
        C70087b bVar3 = this.f157662w;
        C89219l.m154716b(bVar3, "");
        bVar2.mo111243a(bVar3.f156735b);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: n */
    public final void mo111123n() {
        super.mo111123n();
        if (!this.f157597M && this.f157661v) {
            if (this.f157647h != null) {
                this.f157647h.setImageDrawable(m124393e(true));
            }
            if (this.f157646g != null) {
                this.f157646g.setImageDrawable(m124393e(false));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final C0692e<Long, Long> getMultiVideoPlayBoundary() {
        long j = (long) ((this.f157591G + ((float) C70082m.f156702d)) * this.f157662w.f156738e);
        VideoEditViewModel videoEditViewModel = this.f157644e;
        C89219l.m154716b(videoEditViewModel, "");
        long a = m124392a(j, videoEditViewModel.mo111233l());
        VideoEditViewModel videoEditViewModel2 = this.f157644e;
        C89219l.m154716b(videoEditViewModel2, "");
        return new C0692e<>(Long.valueOf(a), Long.valueOf(m124392a((long) ((this.f157591G + ((float) C70082m.f156702d) + this.f157592H) * this.f157662w.f156738e), videoEditViewModel2.mo111233l())));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: i */
    public final void mo111118i() {
        View view;
        float f;
        float f2;
        float startX;
        if (this.f157654o != null) {
            int i = 0;
            RecyclerView.ViewHolder f3 = this.f157665z.mo4451f(0);
            if (this.f157594J == 1) {
                f3 = this.f157664y.mo4451f(0);
            }
            if (f3 != null) {
                view = f3.itemView;
            } else {
                view = null;
            }
            float f4 = 0.0f;
            if (view == null) {
                RTLImageView rTLImageView = this.f157647h;
                C89219l.m154716b(rTLImageView, "");
                startX = rTLImageView.getStartX();
                if (this.f157661v) {
                    f4 = this.f157581U;
                }
            } else {
                int[] iArr = new int[2];
                f3.itemView.getLocationOnScreen(iArr);
                if (iArr[0] < 0) {
                    RTLImageView rTLImageView2 = this.f157647h;
                    C89219l.m154716b(rTLImageView2, "");
                    startX = rTLImageView2.getStartX();
                    if (this.f157661v) {
                        f4 = this.f157581U;
                    }
                } else {
                    RTLImageView rTLImageView3 = this.f157647h;
                    C89219l.m154716b(rTLImageView3, "");
                    float startX2 = rTLImageView3.getStartX() - ((float) iArr[0]);
                    if (this.f157661v) {
                        f = this.f157581U;
                    } else {
                        f = 0.0f;
                    }
                    float f5 = startX2 + f;
                    if (f5 >= 0.0f) {
                        f4 = f5;
                    }
                    i = iArr[0];
                    f2 = f4;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) f2, this.f157600P);
                    layoutParams.topMargin = this.f157603S;
                    layoutParams.leftMargin = i;
                    int i2 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginStart(i);
                    View view2 = this.f157654o;
                    C89219l.m154716b(view2, "");
                    view2.setLayoutParams(layoutParams);
                }
            }
            f2 = startX + f4;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) f2, this.f157600P);
            layoutParams2.topMargin = this.f157603S;
            layoutParams2.leftMargin = i;
            int i22 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart(i);
            View view22 = this.f157654o;
            C89219l.m154716b(view22, "");
            view22.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: j */
    public final void mo111119j() {
        View view;
        float startX;
        float f;
        if (this.f157655p != null) {
            MVRecycleView mVRecycleView = this.f157665z;
            C70520b bVar = this.f157589E;
            C89219l.m154716b(bVar, "");
            RecyclerView.ViewHolder f2 = mVRecycleView.mo4451f(bVar.getItemCount() - 1);
            if (this.f157594J == 1) {
                MVRecycleView mVRecycleView2 = this.f157664y;
                C70520b bVar2 = this.f157588D;
                C89219l.m154716b(bVar2, "");
                f2 = mVRecycleView2.mo4451f(bVar2.getItemCount() - 1);
            }
            if (f2 != null) {
                view = f2.itemView;
            } else {
                view = null;
            }
            float f3 = 0.0f;
            if (view == null) {
                float f4 = (float) this.f157642c;
                RTLImageView rTLImageView = this.f157646g;
                C89219l.m154716b(rTLImageView, "");
                float startX2 = (f4 - rTLImageView.getStartX()) - ((float) C70082m.f156702d);
                if (this.f157661v) {
                    f = this.f157581U;
                } else {
                    f = 0.0f;
                }
                startX = startX2 + f;
            } else {
                int[] iArr = new int[2];
                f2.itemView.getLocationOnScreen(iArr);
                int i = iArr[0];
                View view2 = f2.itemView;
                C89219l.m154716b(view2, "");
                iArr[0] = i + view2.getWidth();
                float f5 = (float) iArr[0];
                RTLImageView rTLImageView2 = this.f157646g;
                C89219l.m154716b(rTLImageView2, "");
                startX = (f5 - rTLImageView2.getStartX()) - ((float) C70082m.f156702d);
                if (startX < 0.0f) {
                    startX = 0.0f;
                }
                float f6 = (float) this.f157642c;
                RTLImageView rTLImageView3 = this.f157646g;
                C89219l.m154716b(rTLImageView3, "");
                float startX3 = ((f6 - rTLImageView3.getStartX()) - startX) - ((float) C70082m.f156702d);
                if (this.f157661v) {
                    f3 = this.f157581U;
                }
                f3 += startX3;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) startX, this.f157600P);
            layoutParams.topMargin = this.f157603S;
            layoutParams.gravity = 5;
            int i2 = (int) f3;
            layoutParams.rightMargin = i2;
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd(i2);
            layoutParams.gravity = 8388613;
            View view3 = this.f157655p;
            C89219l.m154716b(view3, "");
            view3.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: m */
    public final void mo111122m() {
        this.f157644e.mo111213a(this.f157599O, this.f157595K);
        C70087b bVar = this.f157662w;
        VideoEditViewModel videoEditViewModel = this.f157644e;
        C89219l.m154716b(videoEditViewModel, "");
        VideoSegment videoSegment = videoEditViewModel.mo111232k().get(this.f157595K);
        C89219l.m154716b(videoSegment, "");
        bVar.mo110589a(videoSegment.mo110571a(true), this.f157599O.f156750d);
        VideoEditViewModel videoEditViewModel2 = this.f157644e;
        C89219l.m154716b(videoEditViewModel2, "");
        VideoSegment videoSegment2 = videoEditViewModel2.mo111232k().get(this.f157595K);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f157645f;
        C89219l.m154716b(videoSegment2, "");
        cutMultiVideoViewModel.mo110477a(videoSegment2.mo110571a(true));
        if (this.f157661v) {
            VideoEditViewModel videoEditViewModel3 = this.f157644e;
            videoEditViewModel3.f157699x.put(videoEditViewModel3.f157698w.getValue().getVideoSegmentList().get(this.f157595K).mo110571a(true), Integer.valueOf(getOverXScroll()));
            return;
        }
        this.f157644e.mo111209a(this.f157595K, getOverXScroll());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: a */
    public final void mo111102a(VideoSegment videoSegment) {
        C89219l.m154721d(videoSegment, "");
        super.mo111102a(videoSegment);
        m124395t();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView$a */
    static final class C70508a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ VEVideoEditView f157583a;

        static {
            Covode.recordClassIndex(82962);
        }

        C70508a(VEVideoEditView vEVideoEditView) {
            this.f157583a = vEVideoEditView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                this.f157583a.f157582b = l.longValue();
                VEVideoEditView vEVideoEditView = this.f157583a;
                vEVideoEditView.mo111100a(vEVideoEditView.f157582b);
            }
        }
    }

    /* renamed from: a */
    public final void mo111100a(long j) {
        RTLImageView rTLImageView = this.f157647h;
        C89219l.m154716b(rTLImageView, "");
        mo111130a((rTLImageView.getStartX() + (((float) j) / this.f157662w.f156738e)) - this.f157591G, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: a */
    public final boolean mo111106a(String str) {
        C89219l.m154721d(str, "");
        if (this.f157661v) {
            return true;
        }
        return super.mo111106a(str);
    }

    /* renamed from: e */
    private final Drawable m124393e(boolean z) {
        int c = C0643b.m2378c(this.f157643d, R.color.bh);
        int parseColor = Color.parseColor("#FFFFFF");
        float b = C30745b.m63132b(this.f157643d, 2.0f);
        if (C78099c.m136517a(this.f157643d)) {
            z = !z;
        }
        int i = 0;
        int i2 = 1;
        Drawable a = C84916a.m145948a(c, c, z ? new float[]{b, b, 0.0f, 0.0f, 0.0f, 0.0f, b, b} : new float[]{0.0f, 0.0f, b, b, b, b, 0.0f, 0.0f});
        if (this.f157661v) {
            Drawable[] drawableArr = new Drawable[1];
            do {
                drawableArr[i] = a;
                i++;
            } while (i <= 0);
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            if (z) {
                layerDrawable.setLayerInset(0, (int) this.f157581U, 0, 0, 0);
            } else {
                layerDrawable.setLayerInset(0, 0, 0, (int) this.f157581U, 0);
            }
            return layerDrawable;
        }
        Drawable[] drawableArr2 = new Drawable[4];
        int i3 = 0;
        loop1:
        while (true) {
            Drawable drawable = a;
            while (true) {
                C89219l.m154716b(drawable, "");
                drawableArr2[i3] = drawable;
                i3++;
                if (i3 >= 4) {
                    break loop1;
                } else if (i3 != 0) {
                    drawable = C84916a.m145947a(parseColor, parseColor, 0, 0);
                }
            }
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr2);
        int i4 = (int) (((float) this.f157601Q) / 3.0f);
        while (true) {
            float f = ((float) i2) * 2.0f;
            layerDrawable2.setLayerInset(i2, (int) ((((float) C70082m.f156702d) / 3.0f) * (((f - 2.0f) / 5.0f) + 1.0f)), i4, (int) ((((float) C70082m.f156702d) / 3.0f) * (((6.0f - f) / 5.0f) + 1.0f)), i4);
            if (i2 == 3) {
                return layerDrawable2;
            }
            i2++;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: a */
    public final void mo111101a(C0692e<Integer, Integer> eVar) {
        C89219l.m154721d(eVar, "");
        this.f157594J = 2;
        this.f157644e.mo111208a(2);
        F f = eVar.f2750a;
        if (f == null) {
            C89219l.m154715b();
        }
        this.f157596L = f.intValue();
        S s = eVar.f2751b;
        if (s == null) {
            C89219l.m154715b();
        }
        this.f157595K = s.intValue();
        VideoEditViewModel videoEditViewModel = this.f157644e;
        C89219l.m154716b(videoEditViewModel, "");
        VideoSegment videoSegment = videoEditViewModel.mo111232k().get(this.f157595K);
        if (this.f157599O == null) {
            this.f157599O = new C70089d(videoSegment);
        } else {
            this.f157599O.mo110594a(videoSegment);
        }
        long j = videoSegment.f156710b;
        if (this.f157661v) {
            C89219l.m154716b(videoSegment, "");
            j = videoSegment.mo110580e() - videoSegment.mo110578d();
            if (j <= 1000) {
                this.f157647h.setOnTouchListener(this);
                RTLImageView rTLImageView = this.f157647h;
                C89219l.m154716b(rTLImageView, "");
                rTLImageView.setTag("block");
                this.f157646g.setOnTouchListener(this);
                RTLImageView rTLImageView2 = this.f157646g;
                C89219l.m154716b(rTLImageView2, "");
                rTLImageView2.setTag("block");
                this.f157657r.setOnTouchListener(null);
                this.f157659t = true;
                j = 1000;
            } else {
                m124394s();
            }
        }
        VideoSegment c = this.f157644e.mo111221c(this.f157595K);
        C70087b bVar = this.f157662w;
        C89219l.m154716b(videoSegment, "");
        String a = videoSegment.mo110571a(true);
        C89219l.m154716b(c, "");
        bVar.mo110588a(j, a, c.mo110582f(), this.f157594J);
        setEditViewHeight(true);
        MVRecycleView mVRecycleView = this.f157664y;
        C89219l.m154716b(mVRecycleView, "");
        mVRecycleView.setVisibility(8);
        this.f157588D.mo111240a();
        MVRecycleView mVRecycleView2 = this.f157665z;
        C89219l.m154716b(mVRecycleView2, "");
        mVRecycleView2.setVisibility(0);
        this.f157665z.mo4413b(0);
        C70520b bVar2 = this.f157589E;
        C70087b bVar3 = this.f157662w;
        C89219l.m154716b(bVar3, "");
        bVar2.mo111244a(bVar3.f156735b, videoSegment);
        int b = this.f157644e.mo111216b(this.f157595K);
        if (this.f157661v) {
            VideoEditViewModel videoEditViewModel2 = this.f157644e;
            VideoSegment videoSegment2 = videoEditViewModel2.f157698w.getValue().getVideoSegmentList().get(this.f157595K);
            if (videoEditViewModel2.f157699x.containsKey(videoSegment2.mo110571a(true))) {
                b = videoEditViewModel2.f157699x.get(videoSegment2.mo110571a(true)).intValue();
            } else {
                b = 0;
            }
            VideoEditViewModel videoEditViewModel3 = this.f157644e;
            if (!videoEditViewModel3.f157699x.containsKey(videoEditViewModel3.f157698w.getValue().getVideoSegmentList().get(this.f157595K).mo110571a(true))) {
                b = (int) (((float) c.mo110578d()) / this.f157662w.f156738e);
            }
        }
        this.f157665z.mo4395a(b, 0);
        C70088c cVar = this.f157598N;
        if (cVar != null) {
            cVar.mo110592a(getStartSlideX(), getEndSlideX(), getOverXScroll());
        }
        float a2 = C70082m.m123737a(this.f157662w, c, b, this.f157604T);
        mo111129a(a2, C70082m.m123736a(this.f157643d, this.f157662w, a2, c, this.f157604T), 0);
        this.f157644e.mo111211a(eVar);
        m124395t();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111104a(List<? extends VideoSegment> list) {
        C89219l.m154721d(list, "");
        this.f157594J = 1;
        this.f157644e.mo111208a(1);
        if (this.f157599O != null) {
            this.f157599O.mo110593a();
        }
        if (this.f157598N != null) {
            this.f157598N.mo110591a();
        }
        for (VideoSegment videoSegment : list) {
            this.f157662w.mo110589a(videoSegment.mo110571a(true), videoSegment.mo110582f());
        }
        this.f157644e.mo111224c((List<VideoSegment>) list);
        C70087b bVar = this.f157662w;
        VideoEditViewModel videoEditViewModel = this.f157644e;
        C89219l.m154716b(videoEditViewModel, "");
        List<VideoSegment> k = videoEditViewModel.mo111232k();
        VideoEditViewModel videoEditViewModel2 = this.f157644e;
        C89219l.m154716b(videoEditViewModel2, "");
        bVar.mo110590a(k, videoEditViewModel2.mo111233l());
        mo111129a((float) this.f157604T, (float) ((this.f157642c - this.f157604T) - C70082m.f156702d), 0);
        MVRecycleView mVRecycleView = this.f157665z;
        C89219l.m154716b(mVRecycleView, "");
        mVRecycleView.setVisibility(8);
        this.f157589E.mo111240a();
        MVRecycleView mVRecycleView2 = this.f157664y;
        C89219l.m154716b(mVRecycleView2, "");
        mVRecycleView2.setVisibility(0);
        this.f157664y.mo4413b(0);
        C70520b bVar2 = this.f157588D;
        C70087b bVar3 = this.f157662w;
        C89219l.m154716b(bVar3, "");
        HashMap<String, Float> hashMap = bVar3.f156735b;
        bVar2.f157711f.addAll(list);
        bVar2.mo111243a(hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111105a(boolean z) {
        this.f157661v = z;
        mo111123n();
        if (z) {
            m124394s();
            MVRecycleView mVRecycleView = this.f157664y;
            C89219l.m154716b(mVRecycleView, "");
            mVRecycleView.setVisibility(8);
            return;
        }
        this.f157647h.setOnTouchListener(this);
        RTLImageView rTLImageView = this.f157647h;
        C89219l.m154716b(rTLImageView, "");
        rTLImageView.setTag("startSlide");
        this.f157646g.setOnTouchListener(this);
        RTLImageView rTLImageView2 = this.f157646g;
        C89219l.m154716b(rTLImageView2, "");
        rTLImageView2.setTag("endSlide");
        this.f157657r.setOnTouchListener(this);
        this.f157659t = true;
        MVRecycleView mVRecycleView2 = this.f157664y;
        C89219l.m154716b(mVRecycleView2, "");
        mVRecycleView2.setVisibility(0);
        m124395t();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(motionEvent, "");
        if (this.f157661v) {
            setEnabled(true);
        }
        return super.onTouch(view, motionEvent);
    }

    /* renamed from: a */
    private final long m124392a(long j, float f) {
        VideoEditViewModel videoEditViewModel = this.f157644e;
        C89219l.m154716b(videoEditViewModel, "");
        if (videoEditViewModel.mo111232k() != null) {
            VideoEditViewModel videoEditViewModel2 = this.f157644e;
            C89219l.m154716b(videoEditViewModel2, "");
            if (!videoEditViewModel2.mo111232k().isEmpty()) {
                VideoEditViewModel videoEditViewModel3 = this.f157644e;
                C89219l.m154716b(videoEditViewModel3, "");
                List<VideoSegment> k = videoEditViewModel3.mo111232k();
                C89219l.m154716b(k, "");
                long j2 = 0;
                for (T t : k) {
                    if (!t.f156717i) {
                        C89219l.m154716b(t, "");
                        float e = ((float) (t.mo110580e() - t.mo110578d())) / (t.mo110582f() * f);
                        float f2 = (float) j;
                        if (f2 <= e) {
                            return (long) ((((float) j2) + (f2 * t.mo110582f())) * f);
                        }
                        j2 += t.mo110580e() - t.mo110578d();
                        j = (long) (f2 - e);
                    }
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
    /* renamed from: a */
    public final void mo111103a(VideoSegment videoSegment, int i) {
        if (!this.f157661v) {
            setEditViewHeight(false);
            MVRecycleView mVRecycleView = this.f157664y;
            C89219l.m154716b(mVRecycleView, "");
            mVRecycleView.setVisibility(0);
        }
        MVRecycleView mVRecycleView2 = this.f157665z;
        C89219l.m154716b(mVRecycleView2, "");
        mVRecycleView2.setVisibility(8);
        this.f157589E.mo111240a();
        if (i == 2) {
            this.f157664y.mo4413b(0);
            C70520b bVar = this.f157588D;
            C70087b bVar2 = this.f157662w;
            C89219l.m154716b(bVar2, "");
            bVar.mo111243a(bVar2.f156735b);
            this.f157644e.mo111230i();
        } else if (i == 3) {
            this.f157664y.mo4413b(0);
            C70520b bVar3 = this.f157588D;
            C70087b bVar4 = this.f157662w;
            C89219l.m154716b(bVar4, "");
            bVar3.mo111242a(videoSegment, bVar4.f156735b);
            this.f157644e.mo111212a(videoSegment);
        } else if (i == 1) {
            this.f157644e.mo111229h();
        }
    }

    private /* synthetic */ VEVideoEditView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private VEVideoEditView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f157581U = C30745b.m63132b(context, 6.0f);
        setLoadThumbnailDirectly(true);
    }
}
