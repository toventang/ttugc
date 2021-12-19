package com.bytedance.tux.input;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22988k;
import com.bytedance.tux.p1708b.p1709a.C22973a;
import com.bytedance.tux.p1711d.C23012b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public class TuxEditText extends AppCompatEditText {

    /* renamed from: a */
    private final C22988k<TextView> f54859a;

    static {
        Covode.recordClassIndex(27104);
    }

    public TuxEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setTuxFont(int i) {
        this.f54859a.mo37304a(this, R.attr.ap2, i);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.dispatchWindowFocusChanged(z);
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        } else {
            super.dispatchWindowFocusChanged(z);
        }
    }

    private /* synthetic */ TuxEditText(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.onFocusChanged(z, i, rect);
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        } else {
            super.onFocusChanged(z, i, rect);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxEditText(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.bs);
        C89219l.m154719c(context, "");
        this.f54859a = new C22988k<>(new C22973a());
        setTuxFont(C23012b.f54478a.mo37393a(this, attributeSet, R.attr.bs));
    }
}
