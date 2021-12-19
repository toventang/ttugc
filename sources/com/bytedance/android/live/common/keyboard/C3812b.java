package com.bytedance.android.live.common.keyboard;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3901aa;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.common.keyboard.b */
public final class C3812b extends C3811a {

    /* renamed from: d */
    public static final C3813a f10544d = new C3813a((byte) 0);

    static {
        Covode.recordClassIndex(4339);
    }

    /* renamed from: com.bytedance.android.live.common.keyboard.b$a */
    public static final class C3813a {
        static {
            Covode.recordClassIndex(4340);
        }

        private C3813a() {
        }

        public /* synthetic */ C3813a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.common.keyboard.C3811a
    /* renamed from: a */
    public final void mo9156a(Context context, int i) {
        int b;
        C89219l.m154721d(context, "");
        int size = View.MeasureSpec.getSize(i);
        if (!mo9158b(context, size)) {
            int b2 = C13628n.m24521b(context);
            if (C3901aa.m9530a(context) != 0) {
                b = C3901aa.m9530a(context);
                C3854a.m9453a(4, "KeyBoardObservable", "ScreenUtils.getNavigationBarHeight");
            } else {
                b = (int) C13628n.m24520b(context, 48.0f);
                C3854a.m9453a(4, "KeyBoardObservable", "UIUtils.dip2Px(context, NAVIGATION_BAR_DEFAULT_HEIGHT.toFloat()).toInt()");
            }
            int a = C3903ac.m9533a(context);
            C3854a.m9453a(4, "KeyBoardObservable", "sH: " + b2 + ", mH: " + size + ", nH: " + b + ", bH: " + a + ", kv: " + this.f10542c + ", last height:" + this.f10540a);
            if (Math.abs(b2 - size) > b + a + 1) {
                this.f10540a = size;
                if (!this.f10542c) {
                    this.f10542c = true;
                    mo9157a(this.f10542c, Math.abs(b2 - this.f10540a));
                }
            } else if (this.f10542c) {
                this.f10542c = false;
                mo9157a(this.f10542c, Math.abs(b2 - this.f10540a));
            }
        }
    }
}
