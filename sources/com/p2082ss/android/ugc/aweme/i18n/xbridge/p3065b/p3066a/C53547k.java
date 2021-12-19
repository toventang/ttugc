package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.k */
public final class C53547k implements IHostStyleUIDepend {
    static {
        Covode.recordClassIndex(63123);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.k$b */
    static final class C53551b extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogBuilder f122913a;

        static {
            Covode.recordClassIndex(63127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53551b(DialogBuilder dialogBuilder) {
            super(1);
            this.f122913a = dialogBuilder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            DialogInterface.OnCancelListener cancelListener;
            C23013a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f54577j == null && (cancelListener = this.f122913a.getCancelListener()) != null) {
                cancelListener.onCancel(aVar2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.k$a */
    static final class C53548a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f122909a;

        /* renamed from: b */
        final /* synthetic */ DialogBuilder f122910b;

        static {
            Covode.recordClassIndex(63124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53548a(String str, DialogBuilder dialogBuilder) {
            super(1);
            this.f122909a = str;
            this.f122910b = dialogBuilder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String str = this.f122909a;
            if (str == null) {
                str = "confirm";
            }
            bVar2.mo37417a(str, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a.C53547k.C53548a.C535491 */

                /* renamed from: a */
                final /* synthetic */ C53548a f122911a;

                static {
                    Covode.recordClassIndex(63125);
                }

                {
                    this.f122911a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    DialogInterface.OnClickListener positiveClickListener = this.f122911a.f122910b.getPositiveClickListener();
                    if (positiveClickListener != null) {
                        positiveClickListener.onClick(aVar2.mo37414a(), -1);
                    }
                    return C89391z.f203057a;
                }
            });
            if (!(this.f122910b.getNegativeBtnText() == null || this.f122910b.getNegativeClickListener() == null)) {
                String negativeBtnText = this.f122910b.getNegativeBtnText();
                if (negativeBtnText == null) {
                    negativeBtnText = "cancel";
                }
                bVar2.mo37419b(negativeBtnText, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a.C53547k.C53548a.C535502 */

                    /* renamed from: a */
                    final /* synthetic */ C53548a f122912a;

                    static {
                        Covode.recordClassIndex(63126);
                    }

                    {
                        this.f122912a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        C23024a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        DialogInterface.OnClickListener negativeClickListener = this.f122912a.f122910b.getNegativeClickListener();
                        if (negativeClickListener != null) {
                            negativeClickListener.onClick(aVar2.mo37414a(), -2);
                        }
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean hideLoading(C18742c cVar) {
        Context context;
        Activity a;
        if (cVar == null || (context = (Context) cVar.mo29769a(Context.class)) == null || (a = C18806a.m34902a(context)) == null || !(a instanceof BulletContainerActivity)) {
            return false;
        }
        if (!a.isFinishing()) {
            ((AbstractActivityC17000a) a).mo26877m();
        }
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showLoading(C18742c cVar) {
        Context context;
        Activity a;
        if (cVar == null || (context = (Context) cVar.mo29769a(Context.class)) == null || (a = C18806a.m34902a(context)) == null || !(a instanceof BulletContainerActivity)) {
            return false;
        }
        if (!a.isFinishing()) {
            ((AbstractActivityC17000a) a).mo26876l();
        }
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showDialog(DialogBuilder dialogBuilder) {
        C89219l.m154721d(dialogBuilder, "");
        Activity a = C18806a.m34902a(dialogBuilder.getContext());
        if (a == null) {
            return false;
        }
        ((C23023b) C23028c.m43435a(new C23023b(a).mo37411b(dialogBuilder.getTitle()).mo37413d(dialogBuilder.getMessage()), new C53548a(dialogBuilder.getPositiveBtnText(), dialogBuilder)).mo37482a(dialogBuilder.getCancelOnTouchOutside()).mo37481a(new C53551b(dialogBuilder))).mo37405a().mo37396b().show();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showToast(ToastBuilder toastBuilder) {
        long j;
        String str = "";
        C89219l.m154721d(toastBuilder, str);
        Activity a = C18806a.m34902a(toastBuilder.getContext());
        if (!(a instanceof Activity)) {
            return false;
        }
        C23144b bVar = new C23144b(a);
        String message = toastBuilder.getMessage();
        if (message != null) {
            str = message;
        }
        C23144b a2 = bVar.mo37635a(str);
        Integer duration = toastBuilder.getDuration();
        if (duration != null) {
            j = (long) duration.intValue();
        } else {
            j = 3000;
        }
        a2.mo37634a(j).mo37637b();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
        C89219l.m154721d(actionSheetBuilder, "");
        C89219l.m154721d(showActionSheetListener, "");
        return IHostStyleUIDepend.C18460b.m34336a(actionSheetBuilder, showActionSheetListener);
    }
}
