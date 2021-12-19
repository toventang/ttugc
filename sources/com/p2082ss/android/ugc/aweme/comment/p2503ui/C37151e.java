package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.e */
final /* synthetic */ class C37151e implements AbstractC1214u {

    /* renamed from: a */
    private final C37035b f87541a;

    static {
        Covode.recordClassIndex(44505);
    }

    C37151e(C37035b bVar) {
        this.f87541a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C37035b bVar = this.f87541a;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            bVar.f87233d.setEnabled(true);
        } else {
            bVar.f87233d.setEnabled(false);
        }
    }
}
