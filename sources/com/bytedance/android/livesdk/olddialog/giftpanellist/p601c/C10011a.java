package com.bytedance.android.livesdk.olddialog.giftpanellist.p601c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.MotionEvent;
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
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.view.LiveGiftCountDownView;
import com.bytedance.android.livesdk.service.animation.p622a.C10645a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10725a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.C24296c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a */
public final class C10011a extends AbstractC10019b {

    /* renamed from: a */
    public boolean f24319a;

    /* renamed from: b */
    public LiveGiftCountDownView f24320b;

    /* renamed from: c */
    public LottieAnimationView f24321c;

    /* renamed from: d */
    public LiveTextView f24322d;

    /* renamed from: e */
    public ImageView f24323e;

    /* renamed from: s */
    private LiveTextView f24324s;

    /* renamed from: t */
    private LiveTextView f24325t;

    /* renamed from: u */
    private View f24326u;

    /* renamed from: v */
    private final String f24327v = "firstgift/images";

    /* renamed from: w */
    private final String f24328w = "firstgift/data.json";

    static {
        Covode.recordClassIndex(11565);
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$a */
    static final class RunnableC10012a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10011a f24329a;

        static {
            Covode.recordClassIndex(11566);
        }

        RunnableC10012a(C10011a aVar) {
            this.f24329a = aVar;
        }

        public final void run() {
            C10645a.m19203c(this.f24329a.f24323e).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$f */
    public static final class RunnableC10018f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10011a f24339a;

        static {
            Covode.recordClassIndex(11572);
        }

        RunnableC10018f(C10011a aVar) {
            this.f24339a = aVar;
        }

        public final void run() {
            C10645a.m19203c(this.f24339a.f24323e).start();
        }
    }

    /* renamed from: a */
    public final void mo16835a() {
        C9904t g = C8729d.f21542u.mo15012g();
        long l = C8729d.f21542u.mo15016l();
        if (g != null) {
            m18505a((int) l, g.f24001f);
            m18506a(g);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: e */
    public final boolean mo16841e() {
        if (this.f24346j.f21695b instanceof C9904t) {
            T t = this.f24346j.f21695b;
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            ImageModel imageModel = ((C9904t) t).f24011p;
            if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo16842f() {
        if (!mo16841e()) {
            if (C8729d.f21542u.mo15011f()) {
                this.f24344h.postDelayed(new RunnableC10018f(this), 50);
                return;
            }
            LottieAnimationView lottieAnimationView = this.f24321c;
            if (lottieAnimationView != null) {
                lottieAnimationView.mo5826a();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: c */
    public final void mo16839c() {
        LiveTextView liveTextView;
        LiveGiftCountDownView liveGiftCountDownView;
        HSImageView hSImageView;
        super.mo16839c();
        ImageView imageView = this.f24323e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f24319a && C8729d.f21542u.mo15011f() && (hSImageView = this.f24344h) != null) {
            hSImageView.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f24343g;
        C89219l.m154716b(liveTextView2, "");
        liveTextView2.setVisibility(0);
        LiveTextView liveTextView3 = this.f24324s;
        if (liveTextView3 != null) {
            liveTextView3.setTextColor(C3966y.m9663b((int) R.color.xc));
        }
        if (C8729d.f21542u.mo15010e() && (liveGiftCountDownView = this.f24320b) != null) {
            liveGiftCountDownView.setVisibility(0);
        }
        if (!C8729d.f21542u.mo15011f() && (liveTextView = this.f24322d) != null) {
            liveTextView.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: b */
    public final void mo16838b() {
        LiveTextView liveTextView;
        LiveGiftCountDownView liveGiftCountDownView;
        ImageView imageView;
        super.mo16838b();
        if (this.f24319a && C8729d.f21542u.mo15011f() && (imageView = this.f24323e) != null) {
            imageView.setVisibility(0);
        }
        HSImageView hSImageView = this.f24344h;
        if (hSImageView != null) {
            hSImageView.setVisibility(8);
        }
        LiveTextView liveTextView2 = this.f24343g;
        C89219l.m154716b(liveTextView2, "");
        liveTextView2.setVisibility(8);
        LiveTextView liveTextView3 = this.f24324s;
        if (liveTextView3 != null) {
            liveTextView3.setTextColor(C3966y.m9663b((int) R.color.xd));
        }
        if (C8729d.f21542u.mo15010e() && (liveGiftCountDownView = this.f24320b) != null) {
            liveGiftCountDownView.setVisibility(8);
        }
        if (!C8729d.f21542u.mo15011f() && (liveTextView = this.f24322d) != null) {
            liveTextView.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: d */
    public final void mo16840d() {
        T t;
        ImageModel imageModel;
        if (this.f24319a) {
            super.mo16840d();
            AbstractC8812b bVar = this.f24346j;
            ImageModel imageModel2 = null;
            if (bVar != null) {
                t = bVar.f21695b;
            } else {
                t = null;
            }
            if (t instanceof C9904t) {
                T t2 = this.f24346j.f21695b;
                if (!(t2 instanceof C9904t)) {
                    t2 = null;
                }
                C9904t tVar = (C9904t) t2;
                if (tVar != null) {
                    imageModel2 = tVar.f24011p;
                }
                if (mo16841e()) {
                    if (tVar != null) {
                        long j = tVar.f23999d;
                        if (imageModel2 != null) {
                            boolean z = false;
                            try {
                                z = C3941k.m9612a(Uri.parse(imageModel2.mUrls.get(0)));
                            } catch (Exception unused) {
                            }
                            C3951p.m9626a(this.f24323e, imageModel2, -1, -1, true, 2131234646, new C10013b(j, z));
                        }
                    }
                } else if (!(tVar == null || (imageModel = tVar.f23997b) == null)) {
                    C3951p.m9630b(this.f24323e, imageModel);
                }
            }
            LiveTextView liveTextView = this.f24325t;
            if (liveTextView != null) {
                liveTextView.setText(C3966y.m9657a((int) R.string.ejx));
                return;
            }
            return;
        }
        C10725a aVar = C10725a.C10726a.C10727a.f25846a;
        AbstractC8812b bVar2 = this.f24346j;
        C89219l.m154716b(bVar2, "");
        aVar.mo17650a(bVar2.mo14676d());
        C10725a aVar2 = C10725a.C10726a.C10727a.f25846a;
        AbstractC8812b bVar3 = this.f24346j;
        C89219l.m154716b(bVar3, "");
        aVar2.mo17651a(bVar3.mo14676d(), true);
        try {
            C10725a aVar3 = C10725a.C10726a.C10727a.f25846a;
            AbstractC8812b bVar4 = this.f24346j;
            C89219l.m154716b(bVar4, "");
            aVar3.mo17653b(bVar4.mo14676d());
        } catch (Exception unused2) {
        }
        LiveTextView liveTextView2 = this.f24325t;
        if (liveTextView2 != null) {
            liveTextView2.setText(C3966y.m9657a((int) R.string.ear));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$e */
    public static final class C10016e extends C24202c<Object> {

        /* renamed from: a */
        final /* synthetic */ C10011a f24335a;

        static {
            Covode.recordClassIndex(11570);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10016e(C10011a aVar) {
            this.f24335a = aVar;
        }

        /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$e$a */
        public static final class C10017a extends C24296c {

            /* renamed from: a */
            final /* synthetic */ C10016e f24336a;

            /* renamed from: b */
            final /* synthetic */ int f24337b;

            /* renamed from: c */
            private int f24338c;

            static {
                Covode.recordClassIndex(11571);
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: b */
            public final void mo9285b(C24290a aVar) {
                C89219l.m154721d(aVar, "");
                View view = this.f24336a.f24335a.f24349m;
                C89219l.m154716b(view, "");
                view.setClickable(true);
                LiveGiftCountDownView liveGiftCountDownView = this.f24336a.f24335a.f24320b;
                if (liveGiftCountDownView != null) {
                    liveGiftCountDownView.setVisibility(8);
                }
                View view2 = this.f24336a.f24335a.f24350n;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                HSImageView hSImageView = this.f24336a.f24335a.f24344h;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                ImageView imageView = this.f24336a.f24335a.f24323e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView = this.f24336a.f24335a.f24321c;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView2 = this.f24336a.f24335a.f24321c;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.mo5835c();
                }
                LiveTextView liveTextView = this.f24336a.f24335a.f24343g;
                C89219l.m154716b(liveTextView, "");
                AbstractC8812b bVar = this.f24336a.f24335a.f24346j;
                C89219l.m154716b(bVar, "");
                liveTextView.setText(bVar.mo14673a());
                LiveTextView liveTextView2 = this.f24336a.f24335a.f24343g;
                if (liveTextView2 != null) {
                    liveTextView2.setVisibility(8);
                }
                LiveTextView liveTextView3 = this.f24336a.f24335a.f24322d;
                if (liveTextView3 != null) {
                    liveTextView3.setVisibility(8);
                }
                this.f24336a.f24335a.mo16835a();
            }

            C10017a(C10016e eVar, int i) {
                this.f24336a = eVar;
                this.f24337b = i;
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: a */
            public final void mo9284a(C24290a aVar, int i) {
                C89219l.m154721d(aVar, "");
                int i2 = this.f24338c;
                if ((i2 != 0 || this.f24337b > 1) && i2 <= i) {
                    this.f24338c = i;
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
            aVar.mo40070a(new C10017a(this, aVar.mo40072c()));
        }
    }

    /* renamed from: a */
    private final void m18506a(C9904t tVar) {
        C3951p.m9630b(this.f24344h, tVar.f23997b);
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$b */
    public static final class C10013b implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ long f24330a;

        /* renamed from: b */
        final /* synthetic */ boolean f24331b;

        static {
            Covode.recordClassIndex(11567);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            C10703a.C10704a.C10705a.f25783a.mo17631a(this.f24330a, 0);
        }

        C10013b(long j, boolean z) {
            this.f24330a = j;
            this.f24331b = z;
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
            C10703a.m19271a(this.f24330a, str);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            C10703a.C10704a.C10705a.f25783a.mo17632a(this.f24330a, this.f24331b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10011a(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$c */
    static final class View$OnClickListenerC10014c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10011a f24332a;

        /* renamed from: b */
        final /* synthetic */ AbstractC10019b.AbstractC10022a f24333b;

        static {
            Covode.recordClassIndex(11568);
        }

        View$OnClickListenerC10014c(C10011a aVar, AbstractC10019b.AbstractC10022a aVar2) {
            this.f24332a = aVar;
            this.f24333b = aVar2;
        }

        public final void onClick(View view) {
            AbstractC10019b.AbstractC10022a aVar = this.f24333b;
            if (aVar != null) {
                aVar.mo16819a(this.f24332a.f24346j, this.f24332a);
            }
            AbstractC10019b.AbstractC10022a aVar2 = this.f24332a.f24347k;
            if (aVar2 != null) {
                C10011a aVar3 = this.f24332a;
                AbstractC8812b bVar = aVar3.f24346j;
                C89219l.m154716b(bVar, "");
                aVar2.mo16821a(aVar3, bVar.mo14676d(), this.f24332a.f24346j);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: a */
    public final void mo16837a(AbstractC10019b.AbstractC10022a aVar) {
        this.f24349m.setOnClickListener(new View$OnClickListenerC10014c(this, aVar));
        this.f24349m.setOnTouchListener(new View$OnTouchListenerC10015d(this));
        this.f24347k = aVar;
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.a$d */
    static final class View$OnTouchListenerC10015d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C10011a f24334a;

        static {
            Covode.recordClassIndex(11569);
        }

        View$OnTouchListenerC10015d(C10011a aVar) {
            this.f24334a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            if (this.f24334a.f24353q) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                C10645a.m19201a(view).start();
            } else if (1 == motionEvent.getAction()) {
                C10645a.m19202b(view).start();
            } else if (3 == motionEvent.getAction()) {
                C10645a.m19202b(view).start();
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m18505a(int i, int i2) {
        if (!this.f24319a) {
            View view = this.f24326u;
            if (view != null) {
                view.setVisibility(8);
            }
            LiveTextView liveTextView = this.f24324s;
            if (liveTextView == null) {
                C89219l.m154715b();
            }
            liveTextView.setText(C3966y.m9657a((int) R.string.e7e));
            return;
        }
        View view2 = this.f24326u;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f24324s;
        if (liveTextView2 == null) {
            C89219l.m154715b();
        }
        liveTextView2.setText(m18507b(i, i2));
    }

    /* renamed from: b */
    private static SpannableString m18507b(int i, int i2) {
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

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: a */
    public final void mo16836a(AbstractC8812b<?> bVar, int i) {
        Context context;
        this.f24323e = (ImageView) this.f24349m.findViewById(R.id.b_w);
        this.f24324s = (LiveTextView) this.f24349m.findViewById(R.id.crt);
        this.f24344h = (HSImageView) this.f24349m.findViewById(R.id.cru);
        this.f24325t = (LiveTextView) this.f24349m.findViewById(R.id.brl);
        this.f24320b = (LiveGiftCountDownView) this.itemView.findViewById(R.id.ehr);
        LiveTextView liveTextView = this.f24343g;
        C89219l.m154716b(liveTextView, "");
        liveTextView.setVisibility(0);
        this.f24322d = (LiveTextView) this.f24349m.findViewById(R.id.c87);
        this.f24321c = (LottieAnimationView) this.f24349m.findViewById(R.id.b2r);
        LiveTextView liveTextView2 = this.f24324s;
        if (liveTextView2 != null) {
            liveTextView2.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
        LiveTextView liveTextView3 = this.f24322d;
        if (liveTextView3 != null) {
            liveTextView3.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
        this.f24326u = this.f24349m.findViewById(R.id.a7c);
        super.mo16836a(bVar, i);
        if (this.f24347k != null) {
            AbstractC10019b.AbstractC10022a aVar = this.f24347k;
            C89219l.m154716b(aVar, "");
            if (aVar.mo16816a() == this.f24346j) {
                HSImageView hSImageView = this.f24344h;
                C89219l.m154716b(hSImageView, "");
                hSImageView.setVisibility(8);
                ImageView imageView = this.f24323e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
            AbstractC10019b.AbstractC10022a aVar2 = this.f24347k;
            AbstractC8812b bVar2 = this.f24346j;
            C89219l.m154716b(bVar2, "");
            if (aVar2.mo16825b(bVar2.mo14676d()) && !mo16841e()) {
                this.f24344h.postDelayed(new RunnableC10012a(this), 50);
            }
        }
        ImageView imageView2 = this.f24342f;
        C89219l.m154716b(imageView2, "");
        imageView2.setVisibility(8);
        LiveGiftCountDownView liveGiftCountDownView = this.f24320b;
        if (liveGiftCountDownView != null) {
            liveGiftCountDownView.mo16862a();
        }
        if (this.f24319a) {
            C8729d.f21542u.mo15014j();
        }
        if (!this.f24319a) {
            LiveTextView liveTextView4 = this.f24322d;
            if (liveTextView4 != null) {
                liveTextView4.setText(C3966y.m9657a((int) R.string.e_w));
            }
            LiveTextView liveTextView5 = this.f24322d;
            if (liveTextView5 != null) {
                liveTextView5.setVisibility(0);
            }
            mo16835a();
            HSImageView hSImageView2 = this.f24344h;
            if (hSImageView2 != null) {
                hSImageView2.setVisibility(8);
            }
            ImageView imageView3 = this.f24323e;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            LiveTextView liveTextView6 = this.f24343g;
            C89219l.m154716b(liveTextView6, "");
            liveTextView6.setText(C3966y.m9657a((int) R.string.e7i));
            LiveTextView liveTextView7 = this.f24324s;
            if (liveTextView7 != null) {
                liveTextView7.setText(C3966y.m9657a((int) R.string.e7e));
            }
            View view = this.f24326u;
            if (view != null) {
                view.setVisibility(8);
            }
            LiveGiftCountDownView liveGiftCountDownView2 = this.f24320b;
            if (liveGiftCountDownView2 != null) {
                liveGiftCountDownView2.setVisibility(8);
            }
        } else if (C8729d.f21542u.mo15011f()) {
            LiveTextView liveTextView8 = this.f24322d;
            if (liveTextView8 != null) {
                liveTextView8.setText(C3966y.m9657a((int) R.string.e_w));
            }
            if (!C8729d.f21542u.f21550g || LiveFirstRechargeStyleSetting.INSTANCE.getValue()) {
                mo16835a();
                LiveTextView liveTextView9 = this.f24343g;
                C89219l.m154716b(liveTextView9, "");
                AbstractC8812b bVar3 = this.f24346j;
                C89219l.m154716b(bVar3, "");
                liveTextView9.setText(bVar3.mo14673a());
                LiveTextView liveTextView10 = this.f24322d;
                if (liveTextView10 != null) {
                    liveTextView10.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView = this.f24321c;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(8);
                }
                HSImageView hSImageView3 = this.f24344h;
                if (hSImageView3 != null) {
                    hSImageView3.setVisibility(8);
                }
                ImageView imageView4 = this.f24323e;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                }
                LiveGiftCountDownView liveGiftCountDownView3 = this.f24320b;
                if (liveGiftCountDownView3 != null) {
                    liveGiftCountDownView3.setVisibility(8);
                    return;
                }
                return;
            }
            C8729d.f21542u.f21550g = false;
            File tTLiveGeckoResourceFile = ((IHostContext) C6193a.m13435a(IHostContext.class)).getTTLiveGeckoResourceFile("tiktok_live_basic_resource", "ttlive_opened_pack.webp");
            if (tTLiveGeckoResourceFile == null || !tTLiveGeckoResourceFile.exists()) {
                View view2 = this.f24349m;
                C89219l.m154716b(view2, "");
                view2.setClickable(true);
                LiveGiftCountDownView liveGiftCountDownView4 = this.f24320b;
                if (liveGiftCountDownView4 != null) {
                    liveGiftCountDownView4.setVisibility(8);
                }
                View view3 = this.f24350n;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                HSImageView hSImageView4 = this.f24344h;
                if (hSImageView4 != null) {
                    hSImageView4.setVisibility(8);
                }
                ImageView imageView5 = this.f24323e;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView2 = this.f24321c;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView3 = this.f24321c;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.mo5835c();
                }
                LiveTextView liveTextView11 = this.f24343g;
                C89219l.m154716b(liveTextView11, "");
                AbstractC8812b bVar4 = this.f24346j;
                C89219l.m154716b(bVar4, "");
                liveTextView11.setText(bVar4.mo14673a());
                LiveTextView liveTextView12 = this.f24343g;
                if (liveTextView12 != null) {
                    liveTextView12.setVisibility(8);
                }
                LiveTextView liveTextView13 = this.f24322d;
                if (liveTextView13 != null) {
                    liveTextView13.setVisibility(8);
                }
                mo16835a();
                return;
            }
            View view4 = this.f24350n;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            LiveGiftCountDownView liveGiftCountDownView5 = this.f24320b;
            if (liveGiftCountDownView5 != null) {
                liveGiftCountDownView5.setVisibility(8);
            }
            HSImageView hSImageView5 = this.f24344h;
            if (hSImageView5 != null) {
                hSImageView5.setVisibility(8);
            }
            ImageView imageView6 = this.f24323e;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
            LiveTextView liveTextView14 = this.f24322d;
            if (liveTextView14 != null) {
                liveTextView14.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView4 = this.f24321c;
            if (lottieAnimationView4 != null) {
                lottieAnimationView4.setVisibility(0);
            }
            LottieAnimationView lottieAnimationView5 = this.f24321c;
            if (lottieAnimationView5 != null) {
                lottieAnimationView5.mo5833b(false);
            }
            View view5 = this.f24349m;
            C89219l.m154716b(view5, "");
            view5.setClickable(false);
            LiveTextView liveTextView15 = this.f24343g;
            C89219l.m154716b(liveTextView15, "");
            liveTextView15.setText(C3966y.m9657a((int) R.string.e7i));
            LiveTextView liveTextView16 = this.f24343g;
            if (liveTextView16 != null) {
                liveTextView16.setVisibility(0);
            }
            mo16835a();
            LottieAnimationView lottieAnimationView6 = this.f24321c;
            if (lottieAnimationView6 != null) {
                context = lottieAnimationView6.getContext();
            } else {
                context = null;
            }
            C3889a a = C3889a.m9507a(context).mo9250a(tTLiveGeckoResourceFile).mo9249a(ImageView.ScaleType.CENTER_CROP);
            a.f10759h = true;
            a.f10753b = new C10016e(this);
            C89219l.m154716b(a, "");
            a.mo9252a(this.f24321c);
        } else {
            LiveTextView liveTextView17 = this.f24322d;
            if (liveTextView17 != null) {
                liveTextView17.setText(C3966y.m9657a((int) R.string.e8y));
            }
            C9904t h = C8729d.m17036h();
            if (h != null) {
                m18505a(0, h.f24001f);
            }
            LiveTextView liveTextView18 = this.f24322d;
            if (liveTextView18 != null) {
                liveTextView18.setVisibility(0);
            }
            LiveGiftCountDownView liveGiftCountDownView6 = this.f24320b;
            if (liveGiftCountDownView6 != null) {
                liveGiftCountDownView6.setVisibility(8);
            }
            HSImageView hSImageView6 = this.f24344h;
            if (hSImageView6 != null) {
                hSImageView6.setVisibility(8);
            }
            ImageView imageView7 = this.f24323e;
            if (imageView7 != null) {
                imageView7.setVisibility(8);
            }
            LiveTextView liveTextView19 = this.f24343g;
            C89219l.m154716b(liveTextView19, "");
            AbstractC8812b bVar5 = this.f24346j;
            C89219l.m154716b(bVar5, "");
            liveTextView19.setText(bVar5.mo14673a());
            LottieAnimationView lottieAnimationView7 = this.f24321c;
            if (lottieAnimationView7 != null) {
                lottieAnimationView7.setImageAssetsFolder(this.f24327v);
            }
            LottieAnimationView lottieAnimationView8 = this.f24321c;
            if (lottieAnimationView8 != null) {
                lottieAnimationView8.setAnimation(this.f24328w);
            }
            LottieAnimationView lottieAnimationView9 = this.f24321c;
            if (lottieAnimationView9 != null) {
                lottieAnimationView9.mo5833b(false);
            }
            LottieAnimationView lottieAnimationView10 = this.f24321c;
            if (lottieAnimationView10 != null) {
                lottieAnimationView10.mo5826a();
            }
        }
    }
}
