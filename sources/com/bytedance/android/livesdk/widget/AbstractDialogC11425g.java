package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.widget.g */
public abstract class AbstractDialogC11425g extends Dialog {

    /* renamed from: i */
    protected boolean f27387i;

    static {
        Covode.recordClassIndex(13081);
    }

    /* renamed from: b */
    public abstract int mo8350b();

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27387i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27387i = false;
    }

    public AbstractDialogC11425g(Context context) {
        super(context, R.style.a2q);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(mo8350b(), (ViewGroup) null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
    }
}
