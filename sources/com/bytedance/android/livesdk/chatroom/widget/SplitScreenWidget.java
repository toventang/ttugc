package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.C10889t;
import com.bytedance.android.livesdk.chatroom.C7298b;
import com.bytedance.android.livesdk.chatroom.p488c.C7396m;
import com.bytedance.android.livesdk.chatroom.p488c.C7397n;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.C88411a;

public class SplitScreenWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    C7298b f20243a;

    /* renamed from: b */
    private ValueAnimator f20244b;

    /* renamed from: c */
    private final C88411a f20245c = new C88411a();

    static {
        Covode.recordClassIndex(8984);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        ValueAnimator valueAnimator = this.f20244b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f20245c.mo142944a();
        this.f20243a = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (this.dataChannel != null) {
            this.f20243a = (C7298b) this.dataChannel.mo28318b(C10889t.class);
            if (C7298b.m15199a(this.dataChannel)) {
                mo14389a(true, false);
            }
        }
        this.f20245c.mo142945a(C6779a.m14563a().mo13052a(C7396m.class).mo143289d(new C8197w(this)));
        this.f20245c.mo142945a(C6779a.m14563a().mo13052a(C7401r.class).mo143289d(new C8198x(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14389a(boolean z, boolean z2) {
        float f;
        int i;
        int i2;
        int d = C3966y.m9667d(R.dimen.wo);
        C7298b bVar = this.f20243a;
        if (bVar != null) {
            View view = bVar.f18138c;
            View view2 = this.f20243a.f18143h;
            if (z2) {
                C7573e.m15563a(getContext(), view, z, view.getWidth());
                ValueAnimator valueAnimator = this.f20244b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (z) {
                    i2 = 0;
                } else {
                    i2 = d;
                }
                if (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    i2 = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).rightMargin;
                }
                if (!z) {
                    d = 0;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(i2, d);
                Math.abs(i2 - d);
                ValueAnimator duration = ofInt.setDuration(200L);
                this.f20244b = duration;
                duration.addUpdateListener(new C8199y(view2));
                this.f20244b.start();
            } else {
                if (z) {
                    f = 0.0f;
                } else {
                    f = (float) d;
                }
                view.setTranslationX(f);
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
                if (!z) {
                    d = 0;
                }
                C13628n.m24512a(view2, -3, d, -3);
            }
        }
        C6779a.m14563a().mo13053a(new C7397n(z, z2));
    }
}
