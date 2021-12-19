package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45831g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.f */
public final class C71163f extends C45922g {

    /* renamed from: q */
    private int f159402q;

    /* renamed from: r */
    private int f159403r;

    /* renamed from: s */
    private float f159404s = 28.0f;

    /* renamed from: t */
    private int f159405t;

    /* renamed from: u */
    private VideoPublishEditModel f159406u;

    /* renamed from: v */
    private DuetEditStickerView f159407v;

    /* renamed from: w */
    private float f159408w;

    /* renamed from: x */
    private float f159409x;

    static {
        Covode.recordClassIndex(83669);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: o */
    public final boolean mo77372o() {
        return true;
    }

    public final DuetEditStickerView getDuetEditStickerView() {
        return this.f159407v;
    }

    public final float getLastHeight() {
        return this.f159409x;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final AbstractC45824b mo77336a() {
        return new C45831g(this, new C45922g.C45923a());
    }

    public final DuetStickerStruct getDuetStickerStruct() {
        DuetEditStickerView duetEditStickerView = this.f159407v;
        if (duetEditStickerView != null) {
            return duetEditStickerView.getDuetStruct();
        }
        return null;
    }

    /* renamed from: r */
    public final void mo112477r() {
        View view = this.f106955g;
        C89219l.m154716b(view, "");
        this.f159409x = (float) view.getMeasuredHeight();
    }

    public final void setLastHeight(float f) {
        this.f159409x = f;
    }

    /* renamed from: a */
    public final void mo112472a(DuetEditStickerView duetEditStickerView) {
        MethodCollector.m26663i(9043);
        if (duetEditStickerView == null) {
            MethodCollector.m26664o(9043);
            return;
        }
        this.f159407v = duetEditStickerView;
        View view = this.f106955g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f106955g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(duetEditStickerView);
                MethodCollector.m26664o(9043);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(9043);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(9043);
        throw nullPointerException2;
    }

    /* renamed from: a */
    public final void mo112473a(DuetStickerStruct duetStickerStruct) {
        boolean z;
        List<DuetStickerUserStruct> userList;
        MethodCollector.m26663i(9199);
        if (this.f159407v == null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            this.f159407v = new DuetEditStickerView(context, this.f159406u);
            ArrayList arrayList = new ArrayList();
            if (!(duetStickerStruct == null || (userList = duetStickerStruct.getUserList()) == null)) {
                Iterator<T> it = userList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo118710a());
                }
            }
            DuetEditStickerView duetEditStickerView = this.f159407v;
            if (duetEditStickerView != null) {
                if (duetStickerStruct != null) {
                    z = duetStickerStruct.getOpenMic();
                } else {
                    z = false;
                }
                if (!arrayList.isEmpty()) {
                    duetEditStickerView.f159274b.addAll(arrayList);
                }
                duetEditStickerView.f159275c = z;
            }
        }
        View view = this.f106955g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f106955g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(this.f159407v);
                MethodCollector.m26664o(9199);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(9199);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(9199);
        throw nullPointerException2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71163f(Context context, VideoPublishEditModel videoPublishEditModel) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(videoPublishEditModel, "");
        MethodCollector.m26663i(9350);
        this.f159406u = videoPublishEditModel;
        this.f106949a = context;
        this.f159403r = (int) C13628n.m24520b(context, 32.0f);
        int a = C13628n.m24504a(context) - this.f159403r;
        this.f159402q = a;
        this.f159405t = a;
        this.f159404s = C13628n.m24520b(context, 28.0f);
        this.f159408w = C13628n.m24520b(context, 96.0f);
        LayoutInflater.from(this.f106949a).inflate(R.layout.ahr, this);
        this.f106954f = (StickerHelpBoxView) findViewById(R.id.e8x);
        this.f106955g = findViewById(R.id.ade);
        MethodCollector.m26664o(9350);
    }
}
