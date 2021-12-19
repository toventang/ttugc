package com.bytedance.android.live.broadcast.widget;

import android.widget.TextView;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.broadcast.widget.o */
final /* synthetic */ class C3796o implements AbstractC89172b {

    /* renamed from: a */
    private final StickerTipWidget f10530a;

    static {
        Covode.recordClassIndex(4322);
    }

    C3796o(StickerTipWidget stickerTipWidget) {
        this.f10530a = stickerTipWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        StickerTipWidget stickerTipWidget = this.f10530a;
        String str = (String) obj;
        if (stickerTipWidget.f10417a != null && !stickerTipWidget.f10417a.isDisposed()) {
            stickerTipWidget.f10417a.dispose();
        }
        if (C13627m.m24498a(str)) {
            stickerTipWidget.getView().setVisibility(4);
        } else {
            stickerTipWidget.show();
            ((TextView) stickerTipWidget.getView()).setText(str);
            stickerTipWidget.f10417a = AbstractC88979t.m154307b(3, TimeUnit.SECONDS).mo143271a(stickerTipWidget.getAutoUnbindTransformer()).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3794m(stickerTipWidget), C3795n.f10529a);
        }
        return C89391z.f203057a;
    }
}
