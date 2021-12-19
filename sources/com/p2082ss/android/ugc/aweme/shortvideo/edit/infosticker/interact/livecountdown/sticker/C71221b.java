package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView;
import com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.b */
public final class C71221b extends C45922g {

    /* renamed from: q */
    private int f159587q;

    /* renamed from: r */
    private int f159588r;

    /* renamed from: s */
    private float f159589s = 28.0f;

    /* renamed from: t */
    private int f159590t;

    /* renamed from: u */
    private LiveCDEditStickerView f159591u;

    /* renamed from: v */
    private float f159592v;

    /* renamed from: w */
    private float f159593w;

    static {
        Covode.recordClassIndex(83733);
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

    public final LiveCDEditStickerView getBaseView() {
        return this.f159591u;
    }

    public final float getLastHeight() {
        return this.f159593w;
    }

    /* renamed from: s */
    public final void mo112607s() {
        View view = this.f106955g;
        C89219l.m154716b(view, "");
        this.f159593w = (float) view.getMeasuredHeight();
    }

    /* renamed from: r */
    public final float mo112606r() {
        float f = this.f159593w;
        LiveCDEditStickerView liveCDEditStickerView = this.f159591u;
        if (liveCDEditStickerView == null) {
            C89219l.m154715b();
        }
        float height = (f - ((float) liveCDEditStickerView.getHeight())) * this.f106950b;
        if (height < 0.0f) {
            return height;
        }
        return height / 2.0f;
    }

    public final void setLastHeight(float f) {
        this.f159593w = f;
    }

    /* renamed from: a */
    public final void mo112602a(LiveCDEditStickerView liveCDEditStickerView) {
        MethodCollector.m26663i(13644);
        if (liveCDEditStickerView == null) {
            MethodCollector.m26664o(13644);
            return;
        }
        this.f159591u = liveCDEditStickerView;
        View view = this.f106955g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f106955g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(liveCDEditStickerView);
                MethodCollector.m26664o(13644);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(13644);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(13644);
        throw nullPointerException2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71221b(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13717);
        this.f106949a = context;
        this.f159588r = (int) C13628n.m24520b(context, 32.0f);
        int a = C13628n.m24504a(context) - this.f159588r;
        this.f159587q = a;
        this.f159590t = a;
        this.f159589s = C13628n.m24520b(context, 28.0f);
        this.f159592v = C13628n.m24520b(context, 96.0f);
        LayoutInflater.from(this.f106949a).inflate(R.layout.ahw, this);
        this.f106954f = (StickerHelpBoxView) findViewById(R.id.e8x);
        this.f106955g = findViewById(R.id.ade);
        MethodCollector.m26664o(13717);
    }

    /* renamed from: a */
    public final void mo112603a(CountDownStickerStruct countDownStickerStruct) {
        MethodCollector.m26663i(13712);
        if (this.f159591u == null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            LiveCDEditStickerView liveCDEditStickerView = new LiveCDEditStickerView(context);
            this.f159591u = liveCDEditStickerView;
            liveCDEditStickerView.setTouchEnable(true);
            LiveCDEditStickerView liveCDEditStickerView2 = this.f159591u;
            if (liveCDEditStickerView2 == null) {
                C89219l.m154715b();
            }
            liveCDEditStickerView2.setEditEnable(false);
            if (countDownStickerStruct != null) {
                LiveCDEditStickerView liveCDEditStickerView3 = this.f159591u;
                if (liveCDEditStickerView3 == null) {
                    C89219l.m154715b();
                }
                liveCDEditStickerView3.mo112563a(countDownStickerStruct);
            }
            if (this.f159591u == null) {
                C89219l.m154715b();
            }
        }
        View view = this.f106955g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f106955g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(this.f159591u);
                MethodCollector.m26664o(13712);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(13712);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(13712);
        throw nullPointerException2;
    }
}
