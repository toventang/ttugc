package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.c */
public final class DialogC76024c extends Dialog {

    /* renamed from: a */
    private View f170808a;

    static {
        Covode.recordClassIndex(88968);
    }

    public final void dismiss() {
        super.dismiss();
        View view = this.f170808a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void show() {
        super.show();
        View view = this.f170808a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC76024c(Context context) {
        super(context, R.style.gd);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ai5);
        this.f170808a = findViewById(R.id.cg3);
        Window window = getWindow();
        if (window != null) {
            C89219l.m154716b(window, "");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
            Paint paint = shapeDrawable.getPaint();
            C89219l.m154716b(paint, "");
            paint.setColor(0);
            window.setBackgroundDrawable(shapeDrawable);
        }
        setCanceledOnTouchOutside(false);
    }
}
