package com.bytedance.ies.xbridge.p1343n.p1346c.p1347a;

import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.c.a.a */
public final class C18787a implements IHostStyleUIDepend {
    static {
        Covode.recordClassIndex(21483);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean hideLoading(C18742c cVar) {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showLoading(C18742c cVar) {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showDialog(DialogBuilder dialogBuilder) {
        C89219l.m154719c(dialogBuilder, "");
        C89219l.m154719c(dialogBuilder, "");
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showToast(ToastBuilder toastBuilder) {
        C89219l.m154719c(toastBuilder, "");
        Toast makeText = Toast.makeText(toastBuilder.getContext(), toastBuilder.getMessage(), 0);
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(makeText);
        }
        makeText.show();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
        C89219l.m154719c(actionSheetBuilder, "");
        C89219l.m154719c(showActionSheetListener, "");
        return IHostStyleUIDepend.C18460b.m34336a(actionSheetBuilder, showActionSheetListener);
    }
}
