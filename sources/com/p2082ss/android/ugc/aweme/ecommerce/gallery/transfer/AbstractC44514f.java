package com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.f */
public abstract class AbstractC44514f {

    /* renamed from: a */
    protected C44507e f103807a;

    /* renamed from: b */
    protected Context f103808b;

    static {
        Covode.recordClassIndex(52864);
    }

    /* renamed from: a */
    public abstract C44529c mo75510a(int i);

    /* renamed from: a */
    public abstract void mo75512a(C44529c cVar, int i);

    /* renamed from: b */
    public abstract void mo75513b(int i);

    /* renamed from: c */
    public abstract C44529c mo75514c(int i);

    AbstractC44514f(C44507e eVar) {
        this.f103807a = eVar;
        this.f103808b = eVar.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C44529c mo75547a(ImageView imageView) {
        C44503d transConfig = this.f103807a.getTransConfig();
        int[] iArr = {0, 0};
        if (!transConfig.f103760p && imageView != null) {
            iArr = new int[2];
            imageView.getLocationInWindow(iArr);
        }
        C44529c cVar = new C44529c(this.f103808b);
        cVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (transConfig.f103760p || imageView == null) {
            cVar.mo75598a(iArr[0], iArr[1] - C80534hh.m139609b(), 0, 0);
        } else {
            cVar.mo75598a(iArr[0], iArr[1] - C80534hh.m139609b(), imageView.getWidth(), imageView.getHeight());
        }
        cVar.setDuration(transConfig.f103748d);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cVar.setOnTransferListener(this.f103807a.getTransListener());
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75548a(String str, C44529c cVar, boolean z) {
        C44503d transConfig = this.f103807a.getTransConfig();
        if (transConfig.mo75517b().mo75485b(str)) {
            C44503d transConfig2 = this.f103807a.getTransConfig();
            Drawable a = transConfig2.mo75517b().mo75482a(str);
            if (a == null) {
                cVar.setImageDrawable(transConfig2.mo75515a(this.f103808b));
            } else {
                cVar.setImageDrawable(a);
            }
            if (z) {
                cVar.mo75599d();
            } else {
                cVar.mo75600e();
            }
        } else {
            cVar.setImageDrawable(transConfig.mo75515a(this.f103808b));
            if (z) {
                cVar.mo75599d();
            } else {
                cVar.mo75600e();
            }
        }
    }
}
