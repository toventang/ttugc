package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.c */
public final class C71241c extends C45922g {

    /* renamed from: q */
    float f159662q;

    /* renamed from: r */
    private int f159663r;

    /* renamed from: s */
    private int f159664s;

    /* renamed from: t */
    private float f159665t = 28.0f;

    /* renamed from: u */
    private int f159666u;

    /* renamed from: v */
    private PollingStickerView f159667v;

    /* renamed from: w */
    private float f159668w;

    static {
        Covode.recordClassIndex(83756);
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

    public final PollingStickerView getBaseView() {
        return this.f159667v;
    }

    /* renamed from: r */
    public final void mo112653r() {
        this.f159662q = (float) this.f106955g.getMeasuredHeight();
    }

    /* renamed from: a */
    public final void mo112649a(PollingStickerView pollingStickerView) {
        MethodCollector.m26663i(11863);
        if (pollingStickerView == null) {
            MethodCollector.m26664o(11863);
            return;
        }
        this.f159667v = pollingStickerView;
        ((ViewGroup) this.f106955g).removeAllViews();
        ((ViewGroup) this.f106955g).addView(pollingStickerView);
        MethodCollector.m26664o(11863);
    }

    /* renamed from: b */
    public final float mo112651b(PollingStickerView pollingStickerView) {
        float height = (this.f159662q - ((float) this.f159667v.getHeight())) * this.f106950b;
        if (height >= 0.0f || !C13627m.m24498a(pollingStickerView.getPollStruct().getQuestion())) {
            return height / 2.0f;
        }
        return height;
    }

    public C71241c(Context context) {
        super(context);
        MethodCollector.m26663i(11696);
        this.f106949a = context;
        this.f159664s = (int) C13628n.m24520b(context, 32.0f);
        int a = C13628n.m24504a(context) - this.f159664s;
        this.f159663r = a;
        this.f159666u = a;
        this.f159665t = C13628n.m24520b(context, 28.0f);
        this.f159668w = C13628n.m24520b(context, 96.0f);
        LayoutInflater.from(this.f106949a).inflate(R.layout.ai1, this);
        this.f106954f = (StickerHelpBoxView) findViewById(R.id.e8x);
        this.f106955g = findViewById(R.id.ade);
        MethodCollector.m26664o(11696);
    }

    /* renamed from: a */
    public final void mo112650a(PollStruct pollStruct) {
        MethodCollector.m26663i(12011);
        if (this.f159667v == null) {
            PollingStickerView pollingStickerView = new PollingStickerView(getContext());
            this.f159667v = pollingStickerView;
            pollingStickerView.setTouchEnable(true);
            this.f159667v.setEditEnable(false);
            if (pollStruct != null && !C13603b.m24435a((Collection) pollStruct.getOptions())) {
                this.f159667v.mo112626a(pollStruct);
            }
            this.f159667v.mo112624a();
        }
        ((ViewGroup) this.f106955g).removeAllViews();
        ((ViewGroup) this.f106955g).addView(this.f159667v);
        MethodCollector.m26664o(12011);
    }
}
