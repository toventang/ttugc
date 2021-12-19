package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxLoadingHUD;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.an */
public final class DialogC71048an extends Dialog {

    /* renamed from: a */
    public TuxLoadingHUD f159072a;

    static {
        Covode.recordClassIndex(83546);
    }

    public final void onBackPressed() {
    }

    public final void show() {
        TuxLoadingHUD tuxLoadingHUD = this.f159072a;
        if (tuxLoadingHUD != null) {
            tuxLoadingHUD.setVisibility(0);
        }
        super.show();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC71048an(Context context) {
        super(context, R.style.gd);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ai0);
        TuxLoadingHUD tuxLoadingHUD = (TuxLoadingHUD) findViewById(R.id.d22);
        this.f159072a = tuxLoadingHUD;
        if (tuxLoadingHUD != null) {
            tuxLoadingHUD.setMessage(R.string.axh);
        }
        TuxLoadingHUD tuxLoadingHUD2 = this.f159072a;
        if (tuxLoadingHUD2 != null) {
            tuxLoadingHUD2.setVisibility(0);
        }
        setCanceledOnTouchOutside(false);
    }
}
