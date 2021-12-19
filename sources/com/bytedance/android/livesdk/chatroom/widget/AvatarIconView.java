package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class AvatarIconView extends FrameLayout {

    /* renamed from: a */
    private ImageView f20136a;

    /* renamed from: b */
    private ImageView f20137b;

    /* renamed from: c */
    private ImageView f20138c;

    /* renamed from: d */
    private int f20139d;

    /* renamed from: e */
    private int f20140e;

    /* renamed from: f */
    private int f20141f;

    static {
        Covode.recordClassIndex(8931);
    }

    public void setAvatar(int i) {
        C3951p.m9620a(this.f20136a, i, -1, -1);
    }

    public void setAvatar(ImageModel imageModel) {
        if (imageModel != null) {
            ImageView imageView = this.f20136a;
            int i = this.f20139d;
            C7577g.m15571a(imageView, imageModel, i, i, 2131234742);
        }
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (imageModel != null) {
            this.f20137b.setVisibility(0);
            ImageView imageView = this.f20137b;
            int i = this.f20140e;
            C3951p.m9623a(imageView, imageModel, i, i);
            return;
        }
        this.f20137b.setVisibility(8);
    }

    public void setIcon(ImageModel imageModel) {
        if (imageModel != null) {
            this.f20138c.setVisibility(0);
            ImageView imageView = this.f20138c;
            int i = this.f20141f;
            C3951p.m9632b(imageView, imageModel, i, i, -1, null);
            return;
        }
        this.f20138c.setVisibility(4);
    }

    public AvatarIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AvatarIconView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10360);
        this.f20139d = (int) C13628n.m24520b(context, 100.0f);
        this.f20141f = (int) C13628n.m24520b(context, 42.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.amz, R.attr.an0, R.attr.an2});
            this.f20139d = obtainStyledAttributes.getDimensionPixelSize(1, this.f20139d);
            this.f20140e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f20141f = obtainStyledAttributes.getDimensionPixelSize(2, this.f20141f);
            obtainStyledAttributes.recycle();
        }
        this.f20136a = new ImageView(context);
        int i = this.f20139d;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.f20136a.setLayoutParams(layoutParams);
        addView(this.f20136a);
        this.f20137b = new ImageView(context);
        int i2 = this.f20140e;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        this.f20137b.setLayoutParams(layoutParams2);
        addView(this.f20137b);
        this.f20138c = new ImageView(context);
        int i3 = this.f20141f;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams3.bottomMargin = (int) C13628n.m24520b(context, 3.0f);
        layoutParams3.rightMargin = (int) C13628n.m24520b(context, 2.0f);
        layoutParams3.gravity = 8388693;
        this.f20138c.setLayoutParams(layoutParams3);
        addView(this.f20138c);
        this.f20138c.setVisibility(4);
        MethodCollector.m26664o(10360);
    }
}
