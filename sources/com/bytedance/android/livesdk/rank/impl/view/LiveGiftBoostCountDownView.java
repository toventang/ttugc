package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.rank.api.p606a.C10333b;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveGiftBoostCountDownView extends LiveTextView {

    /* renamed from: a */
    public long f25497a;

    /* renamed from: b */
    private C88411a f25498b = new C88411a();

    static {
        Covode.recordClassIndex(12146);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25498b.mo142944a();
    }

    public final void setTimer(long j) {
        this.f25497a = j;
        if (j > C11200a.m19851a()) {
            this.f25498b.mo142945a(AbstractC88979t.m154284a(1, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C10567a(this)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.LiveGiftBoostCountDownView$a */
    public static final class C10567a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBoostCountDownView f25499a;

        static {
            Covode.recordClassIndex(12147);
        }

        C10567a(LiveGiftBoostCountDownView liveGiftBoostCountDownView) {
            this.f25499a = liveGiftBoostCountDownView;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long a = this.f25499a.f25497a - C11200a.m19851a();
            long j = 0;
            if (a < 0) {
                C6779a.m14563a().mo13053a(new C10333b());
            }
            long j2 = a / 1000;
            if (j2 >= 0) {
                j = j2;
            }
            long j3 = j % 60;
            long j4 = j / 60;
            StringBuffer stringBuffer = new StringBuffer();
            if (j4 > 99) {
                j4 = 99;
            }
            if (String.valueOf(j4).length() < 2) {
                stringBuffer.append("0");
            }
            stringBuffer.append(j4);
            stringBuffer.append(":");
            if (String.valueOf(j3).length() < 2) {
                stringBuffer.append("0");
            }
            stringBuffer.append(j3);
            this.f25499a.setText(stringBuffer.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveGiftBoostCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }
}
