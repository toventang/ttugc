package com.p2082ss.android.ugc.aweme.ecommerce.sku;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.DialogC44308d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.a */
public final class DialogC45382a extends DialogC44308d {
    static {
        Covode.recordClassIndex(53856);
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.DialogC44308d
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(48);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC45382a(Context context, int i) {
        super(context, i);
        C89219l.m154721d(context, "");
    }
}
