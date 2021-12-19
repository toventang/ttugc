package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am */
public final class DialogC71047am extends Dialog {

    /* renamed from: a */
    private ImageView f159071a;

    static {
        Covode.recordClassIndex(83545);
    }

    public final void onBackPressed() {
    }

    public final void dismiss() {
        super.dismiss();
        m125457a(false);
    }

    public final void show() {
        super.show();
        m125457a(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC71047am(Context context) {
        super(context, R.style.gd);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    private final void m125457a(boolean z) {
        MethodCollector.m26663i(13823);
        if (z) {
            ImageView imageView = this.f159071a;
            if (imageView != null) {
                imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), R.anim.e6));
                MethodCollector.m26664o(13823);
                return;
            }
            MethodCollector.m26664o(13823);
            return;
        }
        ImageView imageView2 = this.f159071a;
        if (imageView2 != null) {
            imageView2.clearAnimation();
            MethodCollector.m26664o(13823);
            return;
        }
        MethodCollector.m26664o(13823);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ahz);
        this.f159071a = (ImageView) findViewById(R.id.bxi);
        Window window = getWindow();
        if (window == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(window, "");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(window2, "");
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        C89219l.m154716b(paint, "");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            C89219l.m154715b();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(false);
    }
}
