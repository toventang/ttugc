package com.p2082ss.android.ugc.aweme.feed;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.f */
public final class C49538f {

    /* renamed from: a */
    public final CountDownTimer f113922a;

    /* renamed from: b */
    public long f113923b = 4000;

    /* renamed from: c */
    public long f113924c = 1000;

    /* renamed from: d */
    public TextView f113925d;

    /* renamed from: e */
    public String f113926e;

    /* renamed from: f */
    public AbstractC89171a<C89391z> f113927f;

    static {
        Covode.recordClassIndex(58352);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.f$a */
    public static final class CountDownTimerC49539a extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C49538f f113928a;

        static {
            Covode.recordClassIndex(58353);
        }

        public final void onFinish() {
            this.f113928a.f113927f.invoke();
        }

        public final void onTick(long j) {
            C49538f fVar = this.f113928a;
            fVar.mo81266a(j / fVar.f113924c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC49539a(C49538f fVar, long j, long j2) {
            super(j, j2);
            this.f113928a = fVar;
        }
    }

    /* renamed from: a */
    public final void mo81265a() {
        this.f113923b = 4000;
        mo81266a(4);
        this.f113922a.cancel();
        this.f113922a.start();
    }

    /* renamed from: a */
    public final void mo81266a(long j) {
        TextView textView = this.f113925d;
        String a = C1764a.m5928a(this.f113926e, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        C89219l.m154716b(a, "");
        textView.setText(a);
    }

    public C49538f(TextView textView, String str, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f113925d = textView;
        this.f113926e = str;
        this.f113927f = aVar;
        this.f113922a = new CountDownTimerC49539a(this, this.f113923b, this.f113924c);
    }
}
