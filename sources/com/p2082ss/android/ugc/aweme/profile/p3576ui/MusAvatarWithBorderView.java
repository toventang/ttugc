package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView */
public class MusAvatarWithBorderView extends AvatarImageView {
    static {
        Covode.recordClassIndex(75379);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: d */
    public final void mo103511d() {
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).mo39959a(((C24246a) getHierarchy()).f57470a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView, com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView, com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView, com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView
    /* renamed from: a */
    public final void mo61253a() {
        super.mo61253a();
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.mo39985c(C13628n.m24520b(getContext(), 1.0f));
            ((C24246a) getHierarchy()).f57470a.f57504f = C0643b.m2378c(getContext(), R.color.j);
            ((C24246a) getHierarchy()).f57470a.mo39986d(C13628n.m24520b(getContext(), 1.0f));
        }
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

    public MusAvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
