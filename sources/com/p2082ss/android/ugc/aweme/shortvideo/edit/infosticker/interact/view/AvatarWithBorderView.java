package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.imagepipeline.common.C24363d;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.AvatarWithBorderView */
public class AvatarWithBorderView extends CircleImageView {

    /* renamed from: b */
    private C24363d f159945b;

    static {
        Covode.recordClassIndex(83892);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.CircleImageView
    /* renamed from: a */
    public final void mo112852a() {
        super.mo112852a();
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.mo39985c(C13628n.m24520b(getContext(), 1.0f));
            ((C24246a) getHierarchy()).f57470a.f57504f = C0643b.m2378c(getContext(), R.color.l);
            ((C24246a) getHierarchy()).f57470a.mo39986d(C13628n.m24520b(getContext(), 1.0f));
        }
    }

    public void setResizeOptions(C24363d dVar) {
        this.f159945b = dVar;
    }

    public void setBorderColor(int i) {
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.f57504f = C0643b.m2378c(getContext(), i);
        }
    }

    public void setBorderWidth(int i) {
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.mo39985c(C13628n.m24520b(getContext(), (float) i));
        }
    }

    public void setBorderWidthPx(int i) {
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.mo39985c((float) i);
        }
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
