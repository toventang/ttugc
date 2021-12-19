package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: com.ss.android.ugc.aweme.views.a */
public class C81429a extends SimpleDraweeView {
    static {
        Covode.recordClassIndex(94798);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void setController(AbstractC24255a aVar) {
        super.setController(aVar);
    }

    /* renamed from: a */
    public final void mo125081a(boolean z) {
        try {
            AbstractC24255a controller = getController();
            if (controller != null) {
                Animatable i = controller.mo39821i();
                if (i != null) {
                    if (z) {
                        i.start();
                    } else {
                        i.stop();
                    }
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        if (i == 0 && getVisibility() == 0) {
            z = true;
        }
        mo125081a(z);
    }

    public C81429a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        mo125081a(z);
    }
}
