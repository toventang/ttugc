package com.bytedance.android.livesdk.wishlist.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.wishlist.p665c.C11540a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class WishListNotSetView extends ConstraintLayout {
    static {
        Covode.recordClassIndex(13234);
    }

    public WishListNotSetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ WishListNotSetView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WishListNotSetView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5761);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bfl, this, true);
        Bitmap a = C11540a.m20372a(BitmapFactory.decodeResource(C3966y.m9655a(), 2131234292), C3966y.m9653a(6.0f));
        C89219l.m154716b(a, "");
        ((ImageView) findViewById(R.id.bku)).setImageBitmap(a);
        MethodCollector.m26664o(5761);
    }
}
