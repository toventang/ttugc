package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73009k;
import com.p2082ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f */
public final class C72975f extends FrameLayout {

    /* renamed from: d */
    public static final C72976a f163752d = new C72976a((byte) 0);

    /* renamed from: a */
    CountDownStickerStruct f163753a;

    /* renamed from: b */
    C73009k f163754b;

    /* renamed from: c */
    ScheduledFuture<?> f163755c;

    /* renamed from: e */
    private TextView f163756e;

    /* renamed from: f */
    private TextView f163757f;

    /* renamed from: g */
    private LinearLayout f163758g;

    /* renamed from: h */
    private TextView f163759h;

    /* renamed from: i */
    private TextView f163760i;

    /* renamed from: j */
    private TextView f163761j;

    /* renamed from: k */
    private CountDownStickerItemView f163762k;

    /* renamed from: l */
    private CountDownStickerItemView f163763l;

    /* renamed from: m */
    private CountDownStickerItemView f163764m;

    /* renamed from: n */
    private Aweme f163765n;

    /* renamed from: o */
    private ScheduledExecutorService f163766o;

    static {
        Covode.recordClassIndex(85678);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f$a */
    public static final class C72976a {
        static {
            Covode.recordClassIndex(85679);
        }

        private C72976a() {
        }

        public /* synthetic */ C72976a(byte b) {
            this();
        }

        /* renamed from: a */
        public static long m128882a(CountDownStickerStruct countDownStickerStruct) {
            long j = 0;
            if (countDownStickerStruct == null || countDownStickerStruct.getMillSecond() - System.currentTimeMillis() <= 0) {
                return -1;
            }
            if (countDownStickerStruct != null) {
                j = countDownStickerStruct.getMillSecond() - System.currentTimeMillis();
            }
            return j / 1000;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f$a$a */
        public static final class C72977a {

            /* renamed from: a */
            public final int f163767a;

            /* renamed from: b */
            public final int f163768b;

            /* renamed from: c */
            public final int f163769c;

            /* renamed from: d */
            public final int f163770d;

            static {
                Covode.recordClassIndex(85680);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C72977a)) {
                    return false;
                }
                C72977a aVar = (C72977a) obj;
                return this.f163767a == aVar.f163767a && this.f163768b == aVar.f163768b && this.f163769c == aVar.f163769c && this.f163770d == aVar.f163770d;
            }

            public final int hashCode() {
                return (((((this.f163767a * 31) + this.f163768b) * 31) + this.f163769c) * 31) + this.f163770d;
            }

            public final String toString() {
                return "TimeData(day=" + this.f163767a + ", hour=" + this.f163768b + ", minute=" + this.f163769c + ", second=" + this.f163770d + ")";
            }

            public C72977a(int i, int i2, int i3, int i4) {
                this.f163767a = i;
                this.f163768b = i2;
                this.f163769c = i3;
                this.f163770d = i4;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f$b */
    public static abstract class AbstractC72978b {
        static {
            Covode.recordClassIndex(85681);
        }

        private AbstractC72978b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f$b$a */
        public static final class C72979a extends AbstractC72978b {

            /* renamed from: a */
            public static final C72979a f163771a = new C72979a();

            private C72979a() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85682);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f$b$b */
        public static final class C72980b extends AbstractC72978b {

            /* renamed from: a */
            public static final C72980b f163772a = new C72980b();

            private C72980b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(85683);
            }
        }

        public /* synthetic */ AbstractC72978b(byte b) {
            this();
        }
    }

    public final LinearLayout getStickerView() {
        return this.f163758g;
    }

    /* access modifiers changed from: package-private */
    public final long getCurrentTimeStamp() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ScheduledFuture<?> scheduledFuture = this.f163755c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f$c */
    public static final class RunnableC72981c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72975f f163773a;

        static {
            Covode.recordClassIndex(85684);
        }

        RunnableC72981c(C72975f fVar) {
            this.f163773a = fVar;
        }

        public final void run() {
            Activity a = C34470e.m70451a(this.f163773a.getContext());
            if (a != null) {
                a.runOnUiThread(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72975f.RunnableC72981c.RunnableC729821 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC72981c f163774a;

                    static {
                        Covode.recordClassIndex(85685);
                    }

                    {
                        this.f163774a = r1;
                    }

                    public final void run() {
                        long j;
                        C73009k kVar;
                        C72975f fVar = this.f163774a.f163773a;
                        CountDownStickerStruct countDownStickerStruct = fVar.f163753a;
                        if (countDownStickerStruct != null) {
                            j = countDownStickerStruct.getMillSecond();
                        } else {
                            j = 0;
                        }
                        if (j > fVar.getCurrentTimeStamp()) {
                            fVar.mo115389a();
                            return;
                        }
                        C73009k kVar2 = fVar.f163754b;
                        if (!(kVar2 == null || !kVar2.isVisible() || (kVar = fVar.f163754b) == null)) {
                            kVar.mo115431a((C73009k.AbstractC73011b) C73009k.AbstractC73011b.C73017f.f163866a, false);
                        }
                        ScheduledFuture<?> scheduledFuture = fVar.f163755c;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo115389a() {
        Long l;
        CountDownStickerStruct countDownStickerStruct = this.f163753a;
        if (countDownStickerStruct != null) {
            l = Long.valueOf(countDownStickerStruct.getMillSecond());
        } else {
            l = null;
        }
        C72976a.C72977a a = m128879a(l);
        if (a.f163767a > 0) {
            m128880a(AbstractC72978b.C72979a.f163771a);
            CountDownStickerItemView countDownStickerItemView = this.f163762k;
            if (countDownStickerItemView != null) {
                countDownStickerItemView.mo115334a(a.f163767a / 10, a.f163767a % 10);
            }
            CountDownStickerItemView countDownStickerItemView2 = this.f163763l;
            if (countDownStickerItemView2 != null) {
                countDownStickerItemView2.mo115334a(a.f163768b / 10, a.f163768b % 10);
            }
            CountDownStickerItemView countDownStickerItemView3 = this.f163764m;
            if (countDownStickerItemView3 != null) {
                countDownStickerItemView3.mo115334a(a.f163769c / 10, a.f163769c % 10);
                return;
            }
            return;
        }
        m128880a(AbstractC72978b.C72980b.f163772a);
        CountDownStickerItemView countDownStickerItemView4 = this.f163762k;
        if (countDownStickerItemView4 != null) {
            countDownStickerItemView4.mo115334a(a.f163768b / 10, a.f163768b % 10);
        }
        CountDownStickerItemView countDownStickerItemView5 = this.f163763l;
        if (countDownStickerItemView5 != null) {
            countDownStickerItemView5.mo115334a(a.f163769c / 10, a.f163769c % 10);
        }
        CountDownStickerItemView countDownStickerItemView6 = this.f163764m;
        if (countDownStickerItemView6 != null) {
            countDownStickerItemView6.mo115334a(a.f163770d / 10, a.f163770d % 10);
        }
    }

    public final void setFeedCountdownStickerDialogFragment(C73009k kVar) {
        this.f163754b = kVar;
    }

    public final void setStickerView(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f163758g = linearLayout;
    }

    /* renamed from: a */
    private static C72976a.C72977a m128879a(Long l) {
        long j;
        if (l != null) {
            j = l.longValue() - System.currentTimeMillis();
        } else {
            j = 0;
        }
        long j2 = j % 86400000;
        long j3 = j2 % 3600000;
        return new C72976a.C72977a((int) (j / 86400000), (int) (j2 / 3600000), (int) (j3 / 60000), (int) ((j3 % 60000) / 1000));
    }

    /* renamed from: a */
    private final void m128880a(AbstractC72978b bVar) {
        if (C89219l.m154714a(bVar, AbstractC72978b.C72979a.f163771a)) {
            TextView textView = this.f163759h;
            if (textView != null) {
                textView.setText(getResources().getText(R.string.aum));
            }
            TextView textView2 = this.f163760i;
            if (textView2 != null) {
                textView2.setText(getResources().getText(R.string.auw));
            }
            TextView textView3 = this.f163761j;
            if (textView3 != null) {
                textView3.setText(getResources().getText(R.string.auy));
            }
        } else if (C89219l.m154714a(bVar, AbstractC72978b.C72980b.f163772a)) {
            TextView textView4 = this.f163759h;
            if (textView4 != null) {
                textView4.setText(getResources().getText(R.string.auw));
            }
            TextView textView5 = this.f163760i;
            if (textView5 != null) {
                textView5.setText(getResources().getText(R.string.auy));
            }
            TextView textView6 = this.f163761j;
            if (textView6 != null) {
                textView6.setText(getResources().getText(R.string.av3));
            }
        }
    }

    public final void setCountDownStickerStruct(CountDownStickerStruct countDownStickerStruct) {
        this.f163753a = countDownStickerStruct;
        if (countDownStickerStruct == null) {
            this.f163753a = new CountDownStickerStruct(null, 0, 0, null, null, null, null, 127, null);
            Calendar instance = Calendar.getInstance(TimeZone.getDefault());
            C89219l.m154716b(instance, "");
            instance.set(2020, 11, 6, 19, 1, 1);
            CountDownStickerStruct countDownStickerStruct2 = this.f163753a;
            if (countDownStickerStruct2 != null) {
                countDownStickerStruct2.setExpiredTime(Long.valueOf(instance.getTimeInMillis() / 1000));
            }
            CountDownStickerStruct countDownStickerStruct3 = this.f163753a;
            if (countDownStickerStruct3 != null) {
                countDownStickerStruct3.setSubscribe(false);
            }
            CountDownStickerStruct countDownStickerStruct4 = this.f163753a;
            if (countDownStickerStruct4 != null) {
                countDownStickerStruct4.setSubscribeNum(500);
            }
            CountDownStickerStruct countDownStickerStruct5 = this.f163753a;
            if (countDownStickerStruct5 != null) {
                countDownStickerStruct5.setTitle("");
            }
            CountDownStickerStruct countDownStickerStruct6 = this.f163753a;
            if (countDownStickerStruct6 != null) {
                countDownStickerStruct6.setTextAlreadyExpired("");
            }
        }
    }

    public final void setData(CountDownStickerStruct countDownStickerStruct) {
        long j;
        ScheduledFuture<?> scheduledFuture;
        if (countDownStickerStruct != null) {
            this.f163753a = countDownStickerStruct;
            TextView textView = this.f163757f;
            if (textView != null) {
                textView.setText(countDownStickerStruct.getTitle());
            }
            long currentTimeStamp = getCurrentTimeStamp();
            CountDownStickerStruct countDownStickerStruct2 = this.f163753a;
            if (countDownStickerStruct2 != null) {
                j = countDownStickerStruct2.getMillSecond();
            } else {
                j = 0;
            }
            if (currentTimeStamp <= j) {
                mo115389a();
                if (this.f163766o == null) {
                    this.f163766o = C40780g.m82247d();
                }
                ScheduledExecutorService scheduledExecutorService = this.f163766o;
                if (scheduledExecutorService != null) {
                    scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(new RunnableC72981c(this), 0, 1, TimeUnit.SECONDS);
                } else {
                    scheduledFuture = null;
                }
                this.f163755c = scheduledFuture;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72975f(Context context, Aweme aweme) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6960);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bie, this, false);
        if (a != null) {
            LinearLayout linearLayout = (LinearLayout) a;
            this.f163758g = linearLayout;
            this.f163756e = (TextView) linearLayout.findViewById(R.id.euo);
            this.f163757f = (TextView) this.f163758g.findViewById(R.id.ez5);
            this.f163759h = (TextView) this.f163758g.findViewById(R.id.c85);
            this.f163760i = (TextView) this.f163758g.findViewById(R.id.ck5);
            this.f163761j = (TextView) this.f163758g.findViewById(R.id.dkb);
            this.f163762k = (CountDownStickerItemView) this.f163758g.findViewById(R.id.af4);
            this.f163763l = (CountDownStickerItemView) this.f163758g.findViewById(R.id.af5);
            this.f163764m = (CountDownStickerItemView) this.f163758g.findViewById(R.id.af6);
            TuxTextView tuxTextView = (TuxTextView) this.f163758g.findViewById(R.id.f2r);
            if (tuxTextView != null) {
                tuxTextView.mo37697a(37.0f);
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.f163758g.findViewById(R.id.eya);
            if (tuxTextView2 != null) {
                tuxTextView2.mo37697a(37.0f);
            }
            addView(this.f163758g);
            this.f163765n = aweme;
            MethodCollector.m26664o(6960);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.m26664o(6960);
        throw nullPointerException;
    }
}
