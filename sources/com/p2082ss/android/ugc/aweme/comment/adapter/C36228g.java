package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.os.Build;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.g */
public final /* synthetic */ class C36228g implements AbstractC1214u {

    /* renamed from: a */
    private final C36225f f85564a;

    static {
        Covode.recordClassIndex(43494);
    }

    C36228g(C36225f fVar) {
        this.f85564a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C36225f fVar = this.f85564a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f85550a.getLayoutParams();
        int b = (int) C13628n.m24520b(fVar.itemView.getContext(), ((Boolean) obj).booleanValue() ? 90.0f : 54.0f);
        if (C80471gb.m139483a(fVar.itemView.getContext())) {
            marginLayoutParams.rightMargin = b;
        } else {
            marginLayoutParams.leftMargin = b;
        }
        int i = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginStart(b);
        fVar.f85550a.invalidate();
    }
}
