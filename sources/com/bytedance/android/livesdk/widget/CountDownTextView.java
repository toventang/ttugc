package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

public final class CountDownTextView extends LiveTextView {

    /* renamed from: a */
    public AbstractC88412b f27174a;

    /* renamed from: b */
    public AbstractC11345a f27175b;

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$a */
    public static abstract class AbstractC11345a {
        static {
            Covode.recordClassIndex(12990);
        }

        /* renamed from: a */
        public void mo16859a(TextView textView) {
            C89219l.m154721d(textView, "");
        }
    }

    static {
        Covode.recordClassIndex(12989);
    }

    public CountDownTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        AbstractC88412b bVar;
        super.onDetachedFromWindow();
        AbstractC88412b bVar2 = this.f27174a;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f27174a) != null) {
            bVar.dispose();
        }
    }

    public final void setCountDownListener(AbstractC11345a aVar) {
        C89219l.m154721d(aVar, "");
        this.f27175b = aVar;
    }

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$c */
    public static final class C11347c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C11347c f27180a = new C11347c();

        static {
            Covode.recordClassIndex(12992);
        }

        C11347c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9459b(((Throwable) obj).toString());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$b */
    public static final class C11346b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CountDownTextView f27176a;

        /* renamed from: b */
        final /* synthetic */ int f27177b = R.string.gnv;

        /* renamed from: c */
        final /* synthetic */ long f27178c;

        /* renamed from: d */
        final /* synthetic */ long f27179d;

        static {
            Covode.recordClassIndex(12991);
        }

        public C11346b(CountDownTextView countDownTextView, long j) {
            this.f27176a = countDownTextView;
            this.f27178c = j;
            this.f27179d = 0;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC11345a aVar;
            Long l = (Long) obj;
            if (!(l == null || l.longValue() != 0 || this.f27176a.f27175b == null)) {
                C89219l.m154721d(this.f27176a, "");
            }
            CountDownTextView countDownTextView = this.f27176a;
            Resources resources = countDownTextView.getResources();
            int i = this.f27177b;
            long j = this.f27178c;
            C89219l.m154716b(l, "");
            countDownTextView.setText(resources.getString(i, C11225an.m19879a(j - l.longValue())));
            if (this.f27176a.f27175b != null) {
                CountDownTextView countDownTextView2 = this.f27176a;
                l.longValue();
                C89219l.m154721d(countDownTextView2, "");
            }
            if (l.longValue() == this.f27178c - this.f27179d && (aVar = this.f27176a.f27175b) != null) {
                aVar.mo16859a(this.f27176a);
            }
        }
    }

    private /* synthetic */ CountDownTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CountDownTextView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
