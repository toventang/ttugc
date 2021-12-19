package com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.DialogC0240h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.a */
public abstract class AbstractDialogC38837a extends DialogC0240h {
    static {
        Covode.recordClassIndex(46391);
    }

    public AbstractDialogC38837a(Context context) {
        super(context, R.style.a);
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xg);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
    }
}
