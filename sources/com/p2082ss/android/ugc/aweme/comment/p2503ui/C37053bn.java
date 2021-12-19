package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f;
import java.util.Collection;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bn */
final /* synthetic */ class C37053bn implements AbstractC89172b {

    /* renamed from: a */
    private final C37048bj f87308a;

    static {
        Covode.recordClassIndex(44407);
    }

    C37053bn(C37048bj bjVar) {
        this.f87308a = bjVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C37048bj bjVar = this.f87308a;
        Boolean bool = (Boolean) obj;
        if (C13603b.m24435a((Collection) bjVar.f87284b)) {
            return null;
        }
        for (Fragment fragment : bjVar.f87284b) {
            if (fragment instanceof AbstractC36420f) {
                ((AbstractC36420f) fragment).mo63721b(bool.booleanValue());
            }
        }
        return null;
    }
}
