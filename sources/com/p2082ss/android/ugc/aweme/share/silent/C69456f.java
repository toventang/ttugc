package com.p2082ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.f */
public final class C69456f extends C69461j {
    static {
        Covode.recordClassIndex(81794);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.share.silent.C69461j
    /* renamed from: a */
    public final void mo109708a(View view) {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.share.silent.C69461j
    public final int getLayoutResId() {
        return R.layout.ayu;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69456f(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.C69461j
    public final void setSilentShareChannelDrawable(Context context) {
        this.f155173k = 32;
        this.f155174l = 20;
        super.setSilentShareChannelDrawable(context);
    }
}
