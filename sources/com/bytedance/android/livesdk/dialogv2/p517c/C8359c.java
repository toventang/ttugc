package com.bytedance.android.livesdk.dialogv2.p517c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p219a.C3889a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.olddialog.giftpanellist.view.LiveGiftCountDownView;
import com.bytedance.android.livesdk.service.animation.p622a.C10645a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10725a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10730c;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.C24296c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.c.c */
public final class C8359c extends C8350a {

    /* renamed from: l */
    public LiveTextView f20671l;

    /* renamed from: m */
    public boolean f20672m;

    /* renamed from: n */
    public LiveGiftCountDownView f20673n;

    /* renamed from: o */
    public LottieAnimationView f20674o;

    /* renamed from: p */
    public LiveTextView f20675p;

    /* renamed from: q */
    public ImageView f20676q;

    /* renamed from: r */
    private LiveTextView f20677r;

    /* renamed from: s */
    private View f20678s;

    /* renamed from: t */
    private final String f20679t = "firstgift/images";

    /* renamed from: u */
    private final String f20680u = "firstgift/data.json";

    static {
        Covode.recordClassIndex(9197);
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: h */
    public final void mo14689h() {
        super.mo14689h();
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.c$a */
    static final class RunnableC8360a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8359c f20681a;

        static {
            Covode.recordClassIndex(9198);
        }

        RunnableC8360a(C8359c cVar) {
            this.f20681a = cVar;
        }

        public final void run() {
            C10645a.m19203c(this.f20681a.f20676q).start();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.c$e */
    public static final class RunnableC8365e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8359c f20691a;

        static {
            Covode.recordClassIndex(9203);
        }

        public RunnableC8365e(C8359c cVar) {
            this.f20691a = cVar;
        }

        public final void run() {
            C10645a.m19203c(this.f20691a.f20676q).start();
        }
    }

    /* renamed from: i */
    public final void mo14693i() {
        C9904t g = C8729d.f21542u.mo15012g();
        long l = C8729d.f21542u.mo15016l();
        if (g != null) {
            m16555a((int) l, g.f24001f);
            m16556a(g);
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: e */
    public final boolean mo14686e() {
        T t;
        AbstractC8812b<? extends C9543b> bVar = this.f20654g;
        T t2 = null;
        if (bVar != null) {
            t = bVar.f21695b;
        } else {
            t = null;
        }
        if (t instanceof C9904t) {
            AbstractC8812b<? extends C9543b> bVar2 = this.f20654g;
            if (bVar2 != null) {
                t2 = bVar2.f21695b;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            ImageModel imageModel = ((C9904t) t2).f24011p;
            if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: f */
    public final void mo14687f() {
        LiveTextView liveTextView;
        LiveGiftCountDownView liveGiftCountDownView;
        HSImageView hSImageView;
        super.mo14687f();
        ImageView imageView = this.f20676q;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f20672m && C8729d.f21542u.mo15011f() && (hSImageView = this.f20650c) != null) {
            hSImageView.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f20649b;
        if (liveTextView2 != null) {
            liveTextView2.setVisibility(0);
        }
        LiveTextView liveTextView3 = this.f20671l;
        if (liveTextView3 != null) {
            liveTextView3.setTextColor(C3966y.m9663b((int) R.color.xc));
        }
        if (C8729d.f21542u.mo15010e() && (liveGiftCountDownView = this.f20673n) != null) {
            liveGiftCountDownView.setVisibility(0);
        }
        if (!C8729d.f21542u.mo15011f() && (liveTextView = this.f20675p) != null) {
            liveTextView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: d */
    public final void mo14685d() {
        long j;
        long j2;
        T t;
        T t2;
        ImageModel imageModel;
        ImageView imageView;
        if (this.f20672m) {
            super.mo14685d();
            AbstractC8812b<? extends C9543b> bVar = this.f20654g;
            ImageModel imageModel2 = null;
            if (bVar != null) {
                t = bVar.f21695b;
            } else {
                t = null;
            }
            if (t instanceof C9904t) {
                AbstractC8812b<? extends C9543b> bVar2 = this.f20654g;
                if (bVar2 != null) {
                    t2 = bVar2.f21695b;
                } else {
                    t2 = null;
                }
                if (!(t2 instanceof C9904t)) {
                    t2 = null;
                }
                C9904t tVar = (C9904t) t2;
                if (tVar != null) {
                    imageModel2 = tVar.f24011p;
                }
                if (mo14686e()) {
                    if (tVar != null) {
                        long j3 = tVar.f23999d;
                        if (imageModel2 != null) {
                            boolean z = false;
                            try {
                                z = C3941k.m9612a(Uri.parse(imageModel2.mUrls.get(0)));
                            } catch (Exception unused) {
                            }
                            C3951p.m9626a(this.f20676q, imageModel2, -1, -1, true, 2131234646, new C8362c(j3, z));
                        }
                    }
                } else if (!(tVar == null || (imageModel = tVar.f23997b) == null || (imageView = this.f20676q) == null)) {
                    C3951p.m9627a(imageView, imageModel, 2131234646, new C8361b(this, imageModel));
                }
            }
            LiveTextView liveTextView = this.f20677r;
            if (liveTextView != null) {
                liveTextView.setText(C3966y.m9657a((int) R.string.ejx));
                return;
            }
            return;
        }
        C10725a aVar = C10725a.C10726a.C10727a.f25846a;
        AbstractC8812b<? extends C9543b> bVar3 = this.f20654g;
        long j4 = 0;
        if (bVar3 != null) {
            j = bVar3.mo14676d();
        } else {
            j = 0;
        }
        aVar.mo17650a(j);
        C10725a aVar2 = C10725a.C10726a.C10727a.f25846a;
        AbstractC8812b<? extends C9543b> bVar4 = this.f20654g;
        if (bVar4 != null) {
            j2 = bVar4.mo14676d();
        } else {
            j2 = 0;
        }
        aVar2.mo17651a(j2, true);
        try {
            C10725a aVar3 = C10725a.C10726a.C10727a.f25846a;
            AbstractC8812b<? extends C9543b> bVar5 = this.f20654g;
            if (bVar5 != null) {
                j4 = bVar5.mo14676d();
            }
            aVar3.mo17653b(j4);
        } catch (Exception unused2) {
        }
        LiveTextView liveTextView2 = this.f20677r;
        if (liveTextView2 != null) {
            liveTextView2.setText(C3966y.m9657a((int) R.string.ear));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: g */
    public final void mo14688g() {
        int i;
        LiveGiftCountDownView liveGiftCountDownView;
        ImageView imageView;
        super.mo14688g();
        if (this.f20672m && C8729d.f21542u.mo15011f() && (imageView = this.f20676q) != null) {
            imageView.setVisibility(0);
        }
        HSImageView hSImageView = this.f20650c;
        if (hSImageView != null) {
            hSImageView.setVisibility(8);
        }
        LiveTextView liveTextView = this.f20649b;
        if (liveTextView != null) {
            liveTextView.setVisibility(8);
        }
        LiveTextView liveTextView2 = this.f20671l;
        if (liveTextView2 != null) {
            liveTextView2.setTextColor(C3966y.m9663b((int) R.color.xd));
        }
        if (C8729d.f21542u.mo15010e() && (liveGiftCountDownView = this.f20673n) != null) {
            liveGiftCountDownView.setVisibility(8);
        }
        if (!C8729d.f21542u.mo15011f()) {
            LiveTextView liveTextView3 = this.f20675p;
            if (liveTextView3 != null) {
                liveTextView3.setVisibility(0);
            }
            C9904t g = C8729d.f21542u.mo15012g();
            long l = C8729d.f21542u.mo15016l();
            if (C8729d.f21542u.mo15017m() == C8729d.EnumC8731b.StyleShowDiamond) {
                LiveTextView liveTextView4 = this.f20671l;
                if (liveTextView4 != null) {
                    int i2 = (int) l;
                    if (g != null) {
                        i = g.f24001f;
                    } else {
                        i = 0;
                    }
                    liveTextView4.setText(m16558c(i2, i));
                }
                View view = this.f20678s;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.c$d */
    public static final class C8363d extends C24202c<Object> {

        /* renamed from: a */
        final /* synthetic */ C8359c f20687a;

        static {
            Covode.recordClassIndex(9201);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8363d(C8359c cVar) {
            this.f20687a = cVar;
        }

        /* renamed from: com.bytedance.android.livesdk.dialogv2.c.c$d$a */
        public static final class C8364a extends C24296c {

            /* renamed from: a */
            final /* synthetic */ C8363d f20688a;

            /* renamed from: b */
            final /* synthetic */ int f20689b;

            /* renamed from: c */
            private int f20690c;

            static {
                Covode.recordClassIndex(9202);
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: b */
            public final void mo9285b(C24290a aVar) {
                String str;
                C89219l.m154721d(aVar, "");
                View view = this.f20688a.f20687a.itemView;
                C89219l.m154716b(view, "");
                view.setClickable(true);
                LiveGiftCountDownView liveGiftCountDownView = this.f20688a.f20687a.f20673n;
                if (liveGiftCountDownView != null) {
                    liveGiftCountDownView.setVisibility(8);
                }
                View view2 = this.f20688a.f20687a.f20652e;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                HSImageView hSImageView = this.f20688a.f20687a.f20650c;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                ImageView imageView = this.f20688a.f20687a.f20676q;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView = this.f20688a.f20687a.f20674o;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView2 = this.f20688a.f20687a.f20674o;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.mo5835c();
                }
                LiveTextView liveTextView = this.f20688a.f20687a.f20649b;
                if (liveTextView != null) {
                    AbstractC8812b<? extends C9543b> bVar = this.f20688a.f20687a.f20654g;
                    if (bVar != null) {
                        str = bVar.mo14673a();
                    } else {
                        str = null;
                    }
                    liveTextView.setText(str);
                }
                LiveTextView liveTextView2 = this.f20688a.f20687a.f20649b;
                if (liveTextView2 != null) {
                    liveTextView2.setVisibility(8);
                }
                LiveTextView liveTextView3 = this.f20688a.f20687a.f20675p;
                if (liveTextView3 != null) {
                    liveTextView3.setVisibility(8);
                }
                LiveTextView liveTextView4 = this.f20688a.f20687a.f20671l;
                if (liveTextView4 != null) {
                    liveTextView4.setVisibility(0);
                }
                this.f20688a.f20687a.mo14693i();
            }

            C8364a(C8363d dVar, int i) {
                this.f20688a = dVar;
                this.f20689b = i;
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: a */
            public final void mo9284a(C24290a aVar, int i) {
                C89219l.m154721d(aVar, "");
                int i2 = this.f20690c;
                if ((i2 != 0 || this.f20689b > 1) && i2 <= i) {
                    this.f20690c = i;
                } else {
                    aVar.stop();
                }
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C89219l.m154721d(str, "");
            Objects.requireNonNull(animatable, "null cannot be cast to non-null type com.facebook.fresco.animation.drawable.AnimatedDrawable2");
            C24290a aVar = (C24290a) animatable;
            aVar.mo40070a(new C8364a(this, aVar.mo40072c()));
        }
    }

    /* renamed from: a */
    private final void m16556a(C9904t tVar) {
        C3951p.m9630b(this.f20650c, tVar.f23997b);
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.c$c */
    public static final class C8362c implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ long f20685a;

        /* renamed from: b */
        final /* synthetic */ boolean f20686b;

        static {
            Covode.recordClassIndex(9200);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            C10703a.C10704a.C10705a.f25783a.mo17631a(this.f20685a, 0);
        }

        C8362c(long j, boolean z) {
            this.f20685a = j;
            this.f20686b = z;
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            String str;
            if (exc.getMessage() != null) {
                str = exc.getMessage();
                if (str == null) {
                    return;
                }
            } else {
                str = "Download Error";
            }
            C10703a.m19271a(this.f20685a, str);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            C10703a.C10704a.C10705a.f25783a.mo17632a(this.f20685a, this.f20686b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.c$b */
    public static final class C8361b implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ C8359c f20682a;

        /* renamed from: b */
        final /* synthetic */ ImageModel f20683b;

        /* renamed from: c */
        private long f20684c;

        static {
            Covode.recordClassIndex(9199);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            long j;
            C89219l.m154721d(imageModel, "");
            C10725a aVar = C10725a.C10726a.C10727a.f25846a;
            AbstractC8812b<? extends C9543b> bVar = this.f20682a.f20654g;
            if (bVar != null) {
                j = bVar.mo14676d();
            } else {
                j = 0;
            }
            aVar.mo17650a(j);
            this.f20684c = SystemClock.elapsedRealtime();
        }

        C8361b(C8359c cVar, ImageModel imageModel) {
            this.f20682a = cVar;
            this.f20683b = imageModel;
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            long j;
            C89219l.m154721d(imageModel, "");
            C89219l.m154721d(exc, "");
            AbstractC8812b<? extends C9543b> bVar = this.f20682a.f20654g;
            long j2 = 0;
            if (bVar != null && bVar.f21694a == 1) {
                AbstractC8812b<? extends C9543b> bVar2 = this.f20682a.f20654g;
                if (bVar2 != null) {
                    j = bVar2.mo14676d();
                } else {
                    j = 0;
                }
                C10752a.m19346a(j, imageModel.getUri(), exc.getMessage());
            }
            try {
                C10725a aVar = C10725a.C10726a.C10727a.f25846a;
                AbstractC8812b<? extends C9543b> bVar3 = this.f20682a.f20654g;
                if (bVar3 != null) {
                    j2 = bVar3.mo14676d();
                }
                aVar.mo17654c(j2);
            } catch (Exception unused) {
            }
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            long j;
            String str;
            long j2;
            C89219l.m154721d(imageModel, "");
            AbstractC8812b<? extends C9543b> bVar = this.f20682a.f20654g;
            long j3 = 0;
            if (bVar != null && bVar.f21694a == 1) {
                AbstractC8812b<? extends C9543b> bVar2 = this.f20682a.f20654g;
                if (bVar2 != null) {
                    j2 = bVar2.mo14676d();
                } else {
                    j2 = 0;
                }
                C10752a.m19345a(j2, imageModel.getUri());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f20684c;
            AbstractC8812b<? extends C9543b> bVar3 = this.f20682a.f20654g;
            if (bVar3 != null) {
                j = bVar3.mo14676d();
            } else {
                j = 0;
            }
            if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                str = "";
            } else {
                str = imageModel.getUrls().get(0);
            }
            C89219l.m154716b(str, "");
            C10730c.m19322a(elapsedRealtime, j, str);
            try {
                C10725a aVar = C10725a.C10726a.C10727a.f25846a;
                AbstractC8812b<? extends C9543b> bVar4 = this.f20682a.f20654g;
                if (bVar4 != null) {
                    j3 = bVar4.mo14676d();
                }
                aVar.mo17653b(j3);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8359c(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: a */
    private final void m16555a(int i, int i2) {
        if (!this.f20672m) {
            View view = this.f20678s;
            if (view != null) {
                view.setVisibility(8);
            }
            LiveTextView liveTextView = this.f20671l;
            if (liveTextView != null) {
                liveTextView.setText(C3966y.m9657a((int) R.string.e7e));
                return;
            }
            return;
        }
        View view2 = this.f20678s;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f20671l;
        if (liveTextView2 != null) {
            liveTextView2.setText(m16557b(i, i2));
        }
    }

    /* renamed from: b */
    private static SpannableString m16557b(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(" ");
        sb.append(" ");
        sb.append(i);
        sb.append(" ");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new StrikethroughSpan(), String.valueOf(i2).length() + 1, String.valueOf(i2).length() + String.valueOf(i).length() + 3, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#99999E")), String.valueOf(i2).length() + 1, String.valueOf(i2).length() + String.valueOf(i).length() + 3, 33);
        return spannableString;
    }

    /* renamed from: c */
    private static SpannableString m16558c(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(" ");
        sb.append(" ");
        sb.append(i);
        sb.append(" ");
        sb.append(" ");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new StrikethroughSpan(), String.valueOf(i2).length() + 1, String.valueOf(i2).length() + String.valueOf(i).length() + 3, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#99999E")), String.valueOf(i2).length() + 1, String.valueOf(i2).length() + String.valueOf(i).length() + 3, 33);
        return spannableString;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: a */
    public final void mo14681a(AbstractC8812b<? extends C9543b> bVar, int i, DataChannel dataChannel) {
        int i2;
        this.f20676q = (ImageView) this.itemView.findViewById(R.id.b_w);
        this.f20671l = (LiveTextView) this.itemView.findViewById(R.id.crt);
        this.f20650c = (HSImageView) this.itemView.findViewById(R.id.cru);
        this.f20677r = (LiveTextView) this.itemView.findViewById(R.id.brl);
        this.f20673n = (LiveGiftCountDownView) this.itemView.findViewById(R.id.ehr);
        LiveTextView liveTextView = this.f20649b;
        if (liveTextView != null) {
            liveTextView.setVisibility(0);
        }
        this.f20675p = (LiveTextView) this.itemView.findViewById(R.id.c87);
        this.f20674o = (LottieAnimationView) this.itemView.findViewById(R.id.b2r);
        LiveTextView liveTextView2 = this.f20671l;
        if (liveTextView2 != null) {
            liveTextView2.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
        LiveTextView liveTextView3 = this.f20675p;
        if (liveTextView3 != null) {
            liveTextView3.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
        this.f20678s = this.itemView.findViewById(R.id.a7c);
        super.mo14681a(bVar, i, dataChannel);
        if (C8374a.C8375a.C8376a.f20718a.f20713g == this.f20651d) {
            long j = C8374a.C8375a.C8376a.f20718a.f20712f;
            AbstractC8812b<? extends C9543b> bVar2 = this.f20654g;
            if (bVar2 != null && j == bVar2.mo14676d()) {
                HSImageView hSImageView = this.f20650c;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                ImageView imageView = this.f20676q;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (!mo14686e() && C8374a.C8375a.C8376a.f20718a.f20714h) {
                    C8374a.C8375a.C8376a.f20718a.f20714h = false;
                    HSImageView hSImageView2 = this.f20650c;
                    if (hSImageView2 != null) {
                        hSImageView2.postDelayed(new RunnableC8360a(this), 50);
                    }
                }
            }
        }
        ImageView imageView2 = this.f20648a;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        LiveGiftCountDownView liveGiftCountDownView = this.f20673n;
        if (liveGiftCountDownView != null) {
            liveGiftCountDownView.mo16862a();
        }
        if (this.f20672m) {
            C8729d.f21542u.mo15014j();
        }
        if (this.f20672m) {
            String str = null;
            Context context = null;
            String str2 = null;
            String str3 = null;
            if (C8729d.f21542u.mo15011f()) {
                LiveTextView liveTextView4 = this.f20675p;
                if (liveTextView4 != null) {
                    liveTextView4.setText(C3966y.m9657a((int) R.string.e_w));
                }
                if (!C8729d.f21542u.f21550g || LiveFirstRechargeStyleSetting.INSTANCE.getValue()) {
                    mo14693i();
                    LiveTextView liveTextView5 = this.f20649b;
                    if (liveTextView5 != null) {
                        AbstractC8812b<? extends C9543b> bVar3 = this.f20654g;
                        if (bVar3 != null) {
                            str3 = bVar3.mo14673a();
                        }
                        liveTextView5.setText(str3);
                    }
                    LiveTextView liveTextView6 = this.f20675p;
                    if (liveTextView6 != null) {
                        liveTextView6.setVisibility(8);
                    }
                    LottieAnimationView lottieAnimationView = this.f20674o;
                    if (lottieAnimationView != null) {
                        lottieAnimationView.setVisibility(8);
                    }
                    HSImageView hSImageView3 = this.f20650c;
                    if (hSImageView3 != null) {
                        hSImageView3.setVisibility(8);
                    }
                    ImageView imageView3 = this.f20676q;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    LiveGiftCountDownView liveGiftCountDownView2 = this.f20673n;
                    if (liveGiftCountDownView2 != null) {
                        liveGiftCountDownView2.setVisibility(8);
                        return;
                    }
                    return;
                }
                C8729d.f21542u.f21550g = false;
                File tTLiveGeckoResourceFile = ((IHostContext) C6193a.m13435a(IHostContext.class)).getTTLiveGeckoResourceFile("tiktok_live_basic_resource", "ttlive_opened_pack.webp");
                if (tTLiveGeckoResourceFile == null || !tTLiveGeckoResourceFile.exists()) {
                    View view = this.itemView;
                    C89219l.m154716b(view, "");
                    view.setClickable(true);
                    LiveGiftCountDownView liveGiftCountDownView3 = this.f20673n;
                    if (liveGiftCountDownView3 != null) {
                        liveGiftCountDownView3.setVisibility(8);
                    }
                    View view2 = this.f20652e;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    HSImageView hSImageView4 = this.f20650c;
                    if (hSImageView4 != null) {
                        hSImageView4.setVisibility(8);
                    }
                    ImageView imageView4 = this.f20676q;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                    }
                    LottieAnimationView lottieAnimationView2 = this.f20674o;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setVisibility(8);
                    }
                    LottieAnimationView lottieAnimationView3 = this.f20674o;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.mo5835c();
                    }
                    LiveTextView liveTextView7 = this.f20649b;
                    if (liveTextView7 != null) {
                        AbstractC8812b<? extends C9543b> bVar4 = this.f20654g;
                        if (bVar4 != null) {
                            str2 = bVar4.mo14673a();
                        }
                        liveTextView7.setText(str2);
                    }
                    LiveTextView liveTextView8 = this.f20649b;
                    if (liveTextView8 != null) {
                        liveTextView8.setVisibility(8);
                    }
                    LiveTextView liveTextView9 = this.f20675p;
                    if (liveTextView9 != null) {
                        liveTextView9.setVisibility(8);
                    }
                    mo14693i();
                    return;
                }
                View view3 = this.f20652e;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                LiveGiftCountDownView liveGiftCountDownView4 = this.f20673n;
                if (liveGiftCountDownView4 != null) {
                    liveGiftCountDownView4.setVisibility(8);
                }
                HSImageView hSImageView5 = this.f20650c;
                if (hSImageView5 != null) {
                    hSImageView5.setVisibility(8);
                }
                ImageView imageView5 = this.f20676q;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
                LiveTextView liveTextView10 = this.f20675p;
                if (liveTextView10 != null) {
                    liveTextView10.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView4 = this.f20674o;
                if (lottieAnimationView4 != null) {
                    lottieAnimationView4.setVisibility(0);
                }
                LiveTextView liveTextView11 = this.f20671l;
                if (liveTextView11 != null) {
                    liveTextView11.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView5 = this.f20674o;
                if (lottieAnimationView5 != null) {
                    lottieAnimationView5.mo5833b(false);
                }
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                view4.setClickable(false);
                LiveTextView liveTextView12 = this.f20649b;
                if (liveTextView12 != null) {
                    liveTextView12.setText(C3966y.m9657a((int) R.string.e7i));
                }
                LiveTextView liveTextView13 = this.f20649b;
                if (liveTextView13 != null) {
                    liveTextView13.setVisibility(0);
                }
                mo14693i();
                LottieAnimationView lottieAnimationView6 = this.f20674o;
                if (lottieAnimationView6 != null) {
                    context = lottieAnimationView6.getContext();
                }
                C3889a a = C3889a.m9507a(context).mo9250a(tTLiveGeckoResourceFile).mo9249a(ImageView.ScaleType.CENTER_CROP);
                a.f10759h = true;
                a.f10753b = new C8363d(this);
                C89219l.m154716b(a, "");
                a.mo9252a(this.f20674o);
                return;
            }
            LiveTextView liveTextView14 = this.f20675p;
            if (liveTextView14 != null) {
                liveTextView14.setText(C3966y.m9657a((int) R.string.e8y));
            }
            C9904t h = C8729d.m17036h();
            if (h != null) {
                m16555a(0, h.f24001f);
            }
            LiveTextView liveTextView15 = this.f20675p;
            if (liveTextView15 != null) {
                liveTextView15.setVisibility(0);
            }
            LiveGiftCountDownView liveGiftCountDownView5 = this.f20673n;
            if (liveGiftCountDownView5 != null) {
                liveGiftCountDownView5.setVisibility(8);
            }
            HSImageView hSImageView6 = this.f20650c;
            if (hSImageView6 != null) {
                hSImageView6.setVisibility(8);
            }
            ImageView imageView6 = this.f20676q;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            LiveTextView liveTextView16 = this.f20649b;
            if (liveTextView16 != null) {
                AbstractC8812b<? extends C9543b> bVar5 = this.f20654g;
                if (bVar5 != null) {
                    str = bVar5.mo14673a();
                }
                liveTextView16.setText(str);
            }
            LottieAnimationView lottieAnimationView7 = this.f20674o;
            if (lottieAnimationView7 != null) {
                lottieAnimationView7.setImageAssetsFolder(this.f20679t);
            }
            LottieAnimationView lottieAnimationView8 = this.f20674o;
            if (lottieAnimationView8 != null) {
                lottieAnimationView8.setAnimation(this.f20680u);
            }
            LottieAnimationView lottieAnimationView9 = this.f20674o;
            if (lottieAnimationView9 != null) {
                lottieAnimationView9.mo5833b(false);
            }
            LottieAnimationView lottieAnimationView10 = this.f20674o;
            if (lottieAnimationView10 != null) {
                lottieAnimationView10.mo5826a();
                return;
            }
            return;
        }
        LiveTextView liveTextView17 = this.f20675p;
        if (liveTextView17 != null) {
            liveTextView17.setText(C3966y.m9657a((int) R.string.e_w));
        }
        LiveTextView liveTextView18 = this.f20675p;
        if (liveTextView18 != null) {
            liveTextView18.setVisibility(0);
        }
        mo14693i();
        HSImageView hSImageView7 = this.f20650c;
        if (hSImageView7 != null) {
            hSImageView7.setVisibility(8);
        }
        ImageView imageView7 = this.f20676q;
        if (imageView7 != null) {
            imageView7.setVisibility(8);
        }
        LiveTextView liveTextView19 = this.f20649b;
        if (liveTextView19 != null) {
            liveTextView19.setText(C3966y.m9657a((int) R.string.e7i));
        }
        if (C8729d.f21542u.mo15017m() == C8729d.EnumC8731b.StyleShowDiamond) {
            C9904t g = C8729d.f21542u.mo15012g();
            long l = C8729d.f21542u.mo15016l();
            LiveTextView liveTextView20 = this.f20671l;
            if (liveTextView20 != null) {
                int i3 = (int) l;
                if (g != null) {
                    i2 = g.f24001f;
                } else {
                    i2 = 0;
                }
                liveTextView20.setText(m16558c(i3, i2));
            }
            LiveTextView liveTextView21 = this.f20649b;
            if (liveTextView21 != null) {
                liveTextView21.setText(C3966y.m9657a((int) R.string.e7e));
            }
            View view5 = this.f20678s;
            if (view5 != null) {
                view5.setVisibility(0);
            }
        } else {
            View view6 = this.f20678s;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            LiveTextView liveTextView22 = this.f20671l;
            if (liveTextView22 != null) {
                liveTextView22.setText(C3966y.m9657a((int) R.string.e7e));
            }
        }
        LiveGiftCountDownView liveGiftCountDownView6 = this.f20673n;
        if (liveGiftCountDownView6 != null) {
            liveGiftCountDownView6.setVisibility(8);
        }
    }
}
