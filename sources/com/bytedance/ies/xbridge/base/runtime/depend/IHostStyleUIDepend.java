package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import p4600h.p4611f.p4613b.C89219l;

public interface IHostStyleUIDepend {
    public static final C18459a Companion = C18459a.f44093a;

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend$b */
    public static final class C18460b {
        static {
            Covode.recordClassIndex(21147);
        }

        /* renamed from: a */
        public static Boolean m34336a(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
            C89219l.m154719c(actionSheetBuilder, "");
            C89219l.m154719c(showActionSheetListener, "");
            return null;
        }
    }

    static {
        Covode.recordClassIndex(21145);
    }

    Boolean hideLoading(C18742c cVar);

    Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener);

    Boolean showDialog(DialogBuilder dialogBuilder);

    Boolean showLoading(C18742c cVar);

    Boolean showToast(ToastBuilder toastBuilder);

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend$a */
    public static final class C18459a {

        /* renamed from: a */
        static final /* synthetic */ C18459a f44093a = new C18459a();

        private C18459a() {
        }

        static {
            Covode.recordClassIndex(21146);
        }
    }
}
