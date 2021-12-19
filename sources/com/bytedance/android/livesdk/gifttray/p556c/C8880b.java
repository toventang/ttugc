package com.bytedance.android.livesdk.gifttray.p556c;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.C4344t;
import com.bytedance.android.live.p379n.C5792x;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.p545c.p546a.p547a.C8795a;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.gifttray.p557d.C8900c;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSelfTrayDisplayStrategySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayExpSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.C9545bb;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.p514d.C8313a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.animation.AbstractC10652c;
import com.bytedance.android.livesdk.service.animation.C10646b;
import com.bytedance.android.livesdk.service.p625c.p628c.C10730c;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.android.livesdk.service.p625c.p634i.C10754a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gifttray.c.b */
public final class C8880b extends AbstractC8879a {

    /* renamed from: a */
    public HSImageView f21882a;

    /* renamed from: b */
    public TextView f21883b;

    /* renamed from: c */
    public ImageView f21884c;

    /* renamed from: d */
    public AnimatorSet f21885d;

    /* renamed from: e */
    public C8871a f21886e;

    /* renamed from: f */
    public AbstractC10652c f21887f;

    /* renamed from: g */
    public boolean f21888g;

    /* renamed from: h */
    public boolean f21889h;

    /* renamed from: i */
    public long f21890i = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: j */
    public final RunnableC8888h f21891j = new RunnableC8888h(this);

    /* renamed from: k */
    public final C10646b.AbstractC10650c f21892k = new C8889i(this);

    /* renamed from: l */
    private TextView f21893l;

    /* renamed from: m */
    private TextView f21894m;

    /* renamed from: n */
    private ImageView f21895n;

    /* renamed from: o */
    private ImageView f21896o;

    /* renamed from: p */
    private LiveTextView f21897p;

    /* renamed from: q */
    private boolean f21898q;

    /* renamed from: r */
    private DataChannel f21899r;

    /* renamed from: s */
    private final Context f21900s;

    static {
        Covode.recordClassIndex(9764);
    }

    private final int getLayoutResource() {
        setClipChildren(false);
        return R.layout.bdz;
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    /* renamed from: b */
    public final void mo15141b() {
        this.f21898q = true;
        if (this.f21887f != null) {
            this.f21887f = null;
        }
        removeCallbacks(this.f21891j);
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$h */
    public static final class RunnableC8888h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8880b f21912a;

        static {
            Covode.recordClassIndex(9772);
        }

        public final void run() {
            if (!this.f21912a.f21888g) {
                this.f21912a.f21888g = true;
                this.f21912a.f21892k.mo15156c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC8888h(C8880b bVar) {
            this.f21912a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$i */
    public static final class C8889i implements C10646b.AbstractC10650c {

        /* renamed from: a */
        public long f21913a;

        /* renamed from: b */
        public int f21914b;

        /* renamed from: c */
        final /* synthetic */ C8880b f21915c;

        static {
            Covode.recordClassIndex(9773);
        }

        @Override // com.bytedance.android.livesdk.service.animation.C10646b.AbstractC10650c
        /* renamed from: d */
        public final void mo15157d() {
            AbstractC10652c cVar;
            this.f21914b = 0;
            if (this.f21915c.f21887f != null && (cVar = this.f21915c.f21887f) != null) {
                cVar.mo15134c();
            }
        }

        @Override // com.bytedance.android.livesdk.service.animation.C10646b.AbstractC10650c
        /* renamed from: a */
        public final void mo15154a() {
            this.f21915c.f21889h = false;
            if (this.f21915c.f21883b != null) {
                TextView textView = this.f21915c.f21883b;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                C8880b bVar = this.f21915c;
                bVar.f21885d = C10646b.m19204a(bVar.f21883b, this);
                AnimatorSet animatorSet = this.f21915c.f21885d;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                this.f21913a = System.currentTimeMillis();
            }
        }

        @Override // com.bytedance.android.livesdk.service.animation.C10646b.AbstractC10650c
        /* renamed from: b */
        public final void mo15155b() {
            long j;
            AbstractC10652c cVar;
            C8871a aVar;
            C8871a aVar2;
            C8871a aVar3;
            this.f21914b++;
            C8871a aVar4 = this.f21915c.f21886e;
            if ((aVar4 == null || !aVar4.f21833A || (LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() > 1 && (LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() < 2 || (aVar3 = this.f21915c.f21886e) == null || aVar3.f21842g))) && (((aVar = this.f21915c.f21886e) == null || aVar.f21833A || ((LiveGiftTrayExpSetting.INSTANCE.getValue() != 2 || (aVar2 = this.f21915c.f21886e) == null || aVar2.f21841f) && LiveGiftTrayExpSetting.INSTANCE.getValue() != 3)) && this.f21915c.f21889h)) {
                j = 0;
            } else {
                j = this.f21915c.f21890i;
            }
            C8880b bVar = this.f21915c;
            bVar.postDelayed(bVar.f21891j, j);
            if (this.f21915c.f21887f != null && (cVar = this.f21915c.f21887f) != null) {
                cVar.mo15132a();
            }
        }

        @Override // com.bytedance.android.livesdk.service.animation.C10646b.AbstractC10650c
        /* renamed from: c */
        public final void mo15156c() {
            Long l;
            int i;
            User user;
            AbstractC10652c cVar;
            if (!(this.f21915c.f21887f == null || (cVar = this.f21915c.f21887f) == null)) {
                cVar.mo15133b();
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f21913a;
            C10731d dVar = C10731d.C10732a.C10733a.f25859a;
            int mIndex = this.f21915c.getMIndex();
            C8871a aVar = this.f21915c.f21886e;
            if (aVar == null || (user = aVar.f21861z) == null) {
                l = null;
            } else {
                l = Long.valueOf(user.getId());
            }
            C8871a aVar2 = this.f21915c.f21886e;
            if (aVar2 != null) {
                i = aVar2.f21839d;
            } else {
                i = 0;
            }
            dVar.mo17656a(mIndex, l, Integer.valueOf(i), Long.valueOf(currentTimeMillis), Integer.valueOf(this.f21914b));
            C8880b bVar = this.f21915c;
            bVar.f21885d = C10646b.m19206b(bVar, this);
            AnimatorSet animatorSet = this.f21915c.f21885d;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8889i(C8880b bVar) {
            this.f21915c = bVar;
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    /* renamed from: a */
    public final void mo15136a() {
        Integer num;
        if (!this.f21898q) {
            removeCallbacks(this.f21891j);
            C8871a aVar = this.f21886e;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f21840e);
            } else {
                num = null;
            }
            m17213b(String.valueOf(num));
            this.f21889h = true;
            TextView textView = this.f21883b;
            if (textView != null) {
                AnimatorSet a = C10646b.m19204a(textView, this.f21892k);
                this.f21885d = a;
                if (a != null) {
                    a.start();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$c */
    static final class View$OnClickListenerC8883c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8880b f21905a;

        static {
            Covode.recordClassIndex(9767);
        }

        View$OnClickListenerC8883c(C8880b bVar) {
            this.f21905a = bVar;
        }

        public final void onClick(View view) {
            this.f21905a.mo15147a("gift");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$d */
    static final class View$OnClickListenerC8884d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8880b f21906a;

        static {
            Covode.recordClassIndex(9768);
        }

        View$OnClickListenerC8884d(C8880b bVar) {
            this.f21906a = bVar;
        }

        public final void onClick(View view) {
            this.f21906a.mo15147a("others");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$e */
    static final class View$OnClickListenerC8885e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8880b f21907a;

        static {
            Covode.recordClassIndex(9769);
        }

        View$OnClickListenerC8885e(C8880b bVar) {
            this.f21907a = bVar;
        }

        public final void onClick(View view) {
            this.f21907a.mo15147a("others");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$f */
    static final class View$OnClickListenerC8886f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8880b f21908a;

        static {
            Covode.recordClassIndex(9770);
        }

        View$OnClickListenerC8886f(C8880b bVar) {
            this.f21908a = bVar;
        }

        public final void onClick(View view) {
            this.f21908a.mo15147a("others");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$g */
    public static final class C8887g implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ C8880b f21909a;

        /* renamed from: b */
        final /* synthetic */ C8871a f21910b;

        /* renamed from: c */
        private long f21911c;

        static {
            Covode.recordClassIndex(9771);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            C89219l.m154721d(imageModel, "");
            this.f21911c = SystemClock.elapsedRealtime();
        }

        C8887g(C8880b bVar, C8871a aVar) {
            this.f21909a = bVar;
            this.f21910b = aVar;
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            C89219l.m154721d(imageModel, "");
            C89219l.m154721d(exc, "");
            ImageModel imageModel2 = this.f21910b.f21858w;
            if (imageModel2 != null) {
                C8880b bVar = this.f21909a;
                bVar.mo15146a(bVar.f21882a, imageModel2);
            }
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            long j;
            String str;
            C9904t tVar;
            C89219l.m154721d(imageModel, "");
            C10731d.C10732a.C10733a.f25859a.mo17657a(this.f21909a.getMIndex(), true);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f21911c;
            C9895y yVar = this.f21910b.f21835C;
            if (yVar == null || (tVar = yVar.f23945t) == null) {
                j = 0;
            } else {
                j = tVar.f23999d;
            }
            if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                str = "";
            } else {
                str = imageModel.getUrls().get(0);
            }
            C89219l.m154716b(str, "");
            C10730c.m19322a(elapsedRealtime, j, str);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$b */
    static final class View$OnClickListenerC8882b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8880b f21903a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f21904b;

        static {
            Covode.recordClassIndex(9766);
        }

        View$OnClickListenerC8882b(C8880b bVar, DataChannel dataChannel) {
            this.f21903a = bVar;
            this.f21904b = dataChannel;
        }

        public final void onClick(View view) {
            User user;
            C10754a.m19352a("portrait");
            DataChannel dataChannel = this.f21904b;
            if (dataChannel != null) {
                C8871a aVar = this.f21903a.f21886e;
                if (aVar != null) {
                    user = aVar.f21861z;
                } else {
                    user = null;
                }
                dataChannel.mo28320c(C5792x.class, new UserProfileEvent(user));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8880b(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        this.f21900s = context;
    }

    /* renamed from: b */
    private final void m17213b(String str) {
        int i;
        C8871a aVar = this.f21886e;
        int i2 = 0;
        if (aVar != null) {
            i = aVar.f21840e;
        } else {
            i = 0;
        }
        C8871a aVar2 = this.f21886e;
        if (aVar2 != null) {
            i2 = aVar2.f21834B;
        }
        Drawable b = C8900c.m17249b(i * i2);
        View findViewById = findViewById(R.id.qz);
        if (findViewById != null) {
            findViewById.setBackground(b);
        }
        String str2 = str + ' ';
        TextView textView = this.f21883b;
        if (textView != null) {
            textView.setText(str2);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.c.b$a */
    public static final class C8881a implements AbstractC11803e.AbstractC11805b {

        /* renamed from: a */
        final /* synthetic */ C8880b f21901a;

        /* renamed from: b */
        final /* synthetic */ ImageView f21902b;

        static {
            Covode.recordClassIndex(9765);
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
        /* renamed from: a */
        public final void mo8986a(Bitmap bitmap) {
            Bitmap a;
            if (bitmap != null) {
                if (C89219l.m154714a(this.f21902b, this.f21901a.f21882a)) {
                    a = C8795a.m17103b(bitmap);
                } else {
                    a = C8795a.m17102a(bitmap);
                }
                if (a != null && !a.isRecycled()) {
                    ImageView imageView = this.f21902b;
                    if (imageView != null) {
                        imageView.setImageBitmap(a);
                    }
                    if (this.f21902b == this.f21901a.f21884c) {
                        C10731d.C10732a.C10733a.f25859a.mo17655a(this.f21901a.getMIndex());
                    } else if (this.f21902b == this.f21901a.f21882a) {
                        C10731d.C10732a.C10733a.f25859a.mo17657a(this.f21901a.getMIndex(), false);
                    }
                    this.f21901a.invalidate();
                }
            }
        }

        C8881a(C8880b bVar, ImageView imageView) {
            this.f21901a = bVar;
            this.f21902b = imageView;
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    /* renamed from: a */
    public final void mo15138a(AbstractC10652c cVar) {
        int i;
        if (!this.f21898q) {
            this.f21887f = cVar;
            C10646b.AbstractC10650c cVar2 = this.f21892k;
            boolean g = C3966y.m9672g();
            float x = getX();
            if (g) {
                i = -1;
            } else {
                i = 1;
            }
            float f = (float) i;
            float f2 = f * 75.0f;
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationX", x * f, f2).setDuration(200L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "translationX", f2, 0.0f).setDuration(50L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this, "translationX", 0.0f, 0.0f).setDuration(50L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2, duration3);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.addListener(new C10646b.C10648a(C10646b.EnumC10649b.entry, cVar2));
            this.f21885d = animatorSet;
            animatorSet.start();
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    /* renamed from: a */
    public final void mo15140a(DataChannel dataChannel) {
        this.f21899r = dataChannel;
        C1764a.m5927a(LayoutInflater.from(this.f21900s), getLayoutResource(), this, true);
        TextView textView = (TextView) findViewById(R.id.a8d);
        this.f21883b = textView;
        if (textView != null) {
            textView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41568b), 2);
        }
        LiveTextView liveTextView = (LiveTextView) findViewById(R.id.eni);
        this.f21897p = liveTextView;
        if (liveTextView != null) {
            liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41568b), 2);
        }
        this.f21884c = (ImageView) findViewById(R.id.f_f);
        this.f21882a = (HSImageView) findViewById(R.id.ba7);
        this.f21893l = (TextView) findViewById(R.id.dvq);
        this.f21894m = (TextView) findViewById(R.id.dvj);
        this.f21895n = (ImageView) findViewById(R.id.f_a);
        this.f21896o = (ImageView) findViewById(R.id.bfm);
        invalidate();
        findViewById(R.id.ob).setOnClickListener(new View$OnClickListenerC8882b(this, dataChannel));
        HSImageView hSImageView = this.f21882a;
        if (hSImageView != null) {
            hSImageView.setOnClickListener(new View$OnClickListenerC8883c(this));
        }
        TextView textView2 = this.f21893l;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC8884d(this));
        }
        TextView textView3 = this.f21894m;
        if (textView3 != null) {
            textView3.setOnClickListener(new View$OnClickListenerC8885e(this));
        }
        TextView textView4 = this.f21883b;
        if (textView4 != null) {
            textView4.setOnClickListener(new View$OnClickListenerC8886f(this));
        }
        TextView textView5 = this.f21883b;
        if (textView5 != null) {
            textView5.setVisibility(4);
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    public final void setGiftMessage(C8871a aVar) {
        C9545bb userHonor;
        ImageModel n;
        ImageModel avatarThumb;
        ImageModel imageModel;
        ImageModel imageModel2;
        GiftTrayInfo giftTrayInfo;
        HSImageView hSImageView;
        GiftTrayInfo giftTrayInfo2;
        ImageModel imageModel3;
        List<String> list;
        C89219l.m154721d(aVar, "");
        C10731d.C10732a.C10733a.f25859a.mo17658a(new C10731d.C10732a.C10735b(aVar.f21860y), getMIndex());
        this.f21886e = aVar;
        int i = 0;
        this.f21890i = C8900c.m17247a(aVar.f21834B);
        TextView textView = this.f21893l;
        if (textView != null) {
            textView.setText(aVar.f21857v);
        }
        TextView textView2 = this.f21894m;
        if (textView2 != null) {
            textView2.setText(aVar.f21859x);
        }
        C9895y yVar = aVar.f21835C;
        if (!(yVar == null || (giftTrayInfo2 = yVar.f23946u) == null || (imageModel3 = giftTrayInfo2.mDynamicImg) == null || (list = imageModel3.mUrls) == null)) {
            i = list.size();
        }
        Integer num = null;
        if (i > 0) {
            if (C6229a.m13521a(getContext()) && (hSImageView = this.f21882a) != null) {
                hSImageView.setScaleX(-1.0f);
            }
            HSImageView hSImageView2 = this.f21882a;
            C9895y yVar2 = aVar.f21835C;
            if (yVar2 == null || (giftTrayInfo = yVar2.f23946u) == null) {
                imageModel2 = null;
            } else {
                imageModel2 = giftTrayInfo.mDynamicImg;
            }
            C3951p.m9626a(hSImageView2, imageModel2, -1, -1, true, 2131234646, new C8887g(this, aVar));
        } else {
            ImageModel imageModel4 = aVar.f21858w;
            if (imageModel4 != null) {
                mo15146a(this.f21882a, imageModel4);
            }
        }
        if (aVar.f21838c == C8871a.EnumC8872a.TRAY_ONLY && (imageModel = aVar.f21858w) != null) {
            mo15146a(this.f21882a, imageModel);
        }
        User user = aVar.f21861z;
        if (!(user == null || (avatarThumb = user.getAvatarThumb()) == null)) {
            mo15146a(this.f21884c, avatarThumb);
        }
        User user2 = aVar.f21861z;
        if (!(user2 == null || (userHonor = user2.getUserHonor()) == null || (n = userHonor.mo16484n()) == null)) {
            mo15146a(this.f21896o, n);
        }
        ImageModel b = C8313a.m16464b(aVar.f21861z);
        if (b != null) {
            mo15146a(this.f21895n, b);
        }
        C8871a aVar2 = this.f21886e;
        if (aVar2 != null) {
            num = Integer.valueOf(aVar2.f21840e);
        }
        m17213b(String.valueOf(num));
    }

    /* renamed from: a */
    public final void mo15147a(String str) {
        Long l;
        long j;
        Room room;
        C8871a aVar = this.f21886e;
        User user = null;
        if (aVar != null) {
            l = Long.valueOf(aVar.f21860y);
        } else {
            l = null;
        }
        C8803g gVar = new C8803g();
        gVar.f21680b = "gift_panel";
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        gVar.f21683e = j;
        DataChannel dataChannel = this.f21899r;
        if (!(dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null)) {
            user = room.getOwner();
        }
        gVar.f21679a = user;
        DataChannel dataChannel2 = this.f21899r;
        if (dataChannel2 != null) {
            dataChannel2.mo28320c(C4344t.class, gVar);
        }
        C10754a.m19352a(str);
    }

    /* renamed from: a */
    public final void mo15146a(ImageView imageView, ImageModel imageModel) {
        ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a(imageModel, new C8881a(this, imageView));
    }
}
