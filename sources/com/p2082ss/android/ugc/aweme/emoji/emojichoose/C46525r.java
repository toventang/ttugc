package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.p037h.p038a.C0733d;
import androidx.fragment.app.AbstractC0939a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.r */
final /* synthetic */ class C46525r implements AbstractC0939a {

    /* renamed from: a */
    private final AbstractC46452f f108465a;

    static {
        Covode.recordClassIndex(55112);
    }

    C46525r(AbstractC46452f fVar) {
        this.f108465a = fVar;
    }

    @Override // androidx.fragment.app.AbstractC0939a
    /* renamed from: a */
    public final void mo3449a(View view, C0733d dVar) {
        AbstractC46452f fVar = this.f108465a;
        if (!TextUtils.isEmpty(fVar.mo78970e())) {
            view.setContentDescription(fVar.mo78970e());
        }
        dVar.mo2834a((CharSequence) TextView.class.getName());
    }
}
