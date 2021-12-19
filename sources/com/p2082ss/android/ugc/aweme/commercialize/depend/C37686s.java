package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.s */
public final class C37686s implements IHostStyleUIDepend {
    static {
        Covode.recordClassIndex(45119);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final View getContainerLoadingView(Context context) {
        C89219l.m154721d(context, "");
        return BulletService.m71938f().mo61849a(context);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final Dialog showDialog(DialogBuilder dialogBuilder) {
        C89219l.m154721d(dialogBuilder, "");
        Dialog c = new C17197a.C17200a(dialogBuilder.getContext()).mo27189a(dialogBuilder.getTitleResId()).mo27194b(dialogBuilder.getMessageResId()).mo27190a(dialogBuilder.getPositiveBtnTextResId(), dialogBuilder.getPositiveClickListener(), false).mo27195b(dialogBuilder.getNegativeBtnResId(), dialogBuilder.getNegativeClickListener(), false).mo27193a().mo27185c();
        c.setCanceledOnTouchOutside(dialogBuilder.getCancelOnTouchOutside());
        return c;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showToast(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        return null;
    }
}
