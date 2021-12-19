package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a */
public final class C72422a extends AbstractC72425c {

    /* renamed from: a */
    private int f162347a = -1;

    static {
        Covode.recordClassIndex(85096);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: a */
    public final void mo114495a(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: a */
    public final void mo114498a(ArrayList<CutSameVideoImageExtraData> arrayList) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: b */
    public final CutSameVideoImageExtraData mo114499b() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: a */
    public final int mo114494a() {
        return getItemCount();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: b */
    public final void mo114689b(int i) {
        int i2 = this.f162352e;
        this.f162347a = i2;
        if (i2 >= 0 && i2 < getItemCount()) {
            notifyItemChanged(this.f162347a, "previewBorder");
        }
        this.f162352e = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72425c
    /* renamed from: c */
    public final Integer mo114690c(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        C89219l.m154721d(myMediaModel, "");
        this.f162347a = this.f162352e;
        this.f162352e = this.f162349b.indexOf(myMediaModel);
        int i = this.f162347a;
        if (i >= 0 && i < getItemCount()) {
            notifyItemChanged(this.f162347a, "previewBorder");
        }
        if (this.f162352e < 0 || this.f162352e >= getItemCount()) {
            return null;
        }
        notifyItemChanged(this.f162352e);
        return Integer.valueOf(this.f162352e);
    }
}
