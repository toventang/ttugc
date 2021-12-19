package com.p2082ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.r */
public final class C69470r extends AbstractC69426a {

    /* renamed from: i */
    private final int f155187i = 0;

    static {
        Covode.recordClassIndex(81808);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69426a
    public final int getLayoutResId() {
        if (this.f155187i == 0) {
            return R.layout.azh;
        }
        return R.layout.ayj;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.AbstractC69426a
    /* renamed from: a */
    public final void mo109674a() {
        mo109676a(44, 30);
        mo109681b();
        setSyncTitle((TextView) findViewById(R.id.edt));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69470r(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }
}
