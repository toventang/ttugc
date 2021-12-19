package com.bytedance.tux.extension.player.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public class TuxPlayerStateView extends AppCompatImageView {

    /* renamed from: a */
    private Drawable f54697a;

    /* renamed from: b */
    private Drawable f54698b;

    static {
        Covode.recordClassIndex(27038);
    }

    /* renamed from: a */
    public final void mo37577a() {
        setImageDrawable(this.f54697a);
    }

    /* renamed from: b */
    public final void mo37578b() {
        setImageDrawable(this.f54698b);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TuxPlayerStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154719c(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxPlayerStateView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap1, R.attr.aqn});
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            this.f54697a = obtainStyledAttributes.getDrawable(0);
            this.f54698b = obtainStyledAttributes.getDrawable(1);
            setImageDrawable(this.f54697a);
            obtainStyledAttributes.recycle();
        }
    }
}
