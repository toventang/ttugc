package com.bytedance.android.ecommerce.ocr.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class OcrTitleView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f8578a;

    /* renamed from: b */
    private ImageView f8579b;

    static {
        Covode.recordClassIndex(3311);
    }

    public void setFlashLightClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f8579b;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setTorch(boolean z) {
        int i;
        ImageView imageView = this.f8579b;
        if (z) {
            i = R.drawable.b34;
        } else {
            i = R.drawable.b33;
        }
        imageView.setBackgroundResource(i);
    }

    public OcrTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        MethodCollector.m26663i(4116);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b2z, this);
        this.f8578a = (ImageView) inflate.findViewById(R.id.esp);
        this.f8579b = (ImageView) inflate.findViewById(R.id.eyg);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.j_, R.attr.m9, R.attr.m_, R.attr.u5});
            if (obtainStyledAttributes.getBoolean(1, true) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                this.f8578a.setBackgroundResource(resourceId);
            }
            if (obtainStyledAttributes.getBoolean(2, true)) {
                this.f8579b.setBackgroundResource(R.drawable.b33);
            }
            obtainStyledAttributes.recycle();
        }
        this.f8578a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.ecommerce.ocr.view.OcrTitleView.View$OnClickListenerC28831 */

            static {
                Covode.recordClassIndex(3312);
            }

            public final void onClick(View view) {
                Context context = OcrTitleView.this.getContext();
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        });
        MethodCollector.m26664o(4116);
    }
}
