package com.bytedance.android.livesdk.gifttray.p556c;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.C4337m;
import com.bytedance.android.live.gift.C4344t;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.C6900ba;
import com.bytedance.android.livesdk.gift.p545c.p546a.p547a.C8795a;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.gifttray.p557d.C8900c;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.p514d.C8313a;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.animation.AbstractC10652c;
import com.bytedance.android.livesdk.service.animation.C10646b;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.android.livesdk.service.p625c.p634i.C10754a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gifttray.c.c */
public final class C8890c extends AbstractC8879a {

    /* renamed from: a */
    public AnimatorSet f21916a;

    /* renamed from: b */
    public DataChannel f21917b;

    /* renamed from: c */
    public C8871a f21918c;

    /* renamed from: d */
    public ImageView f21919d;

    /* renamed from: e */
    public ImageView f21920e;

    /* renamed from: f */
    public boolean f21921f;

    /* renamed from: g */
    public Long f21922g = Long.valueOf((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT);

    /* renamed from: h */
    public final C10646b.AbstractC10650c f21923h = new C10646b.AbstractC10650c() {
        /* class com.bytedance.android.livesdk.gifttray.p556c.C8890c.C88911 */

        /* renamed from: a */
        long f21930a;

        static {
            Covode.recordClassIndex(9775);
        }

        @Override // com.bytedance.android.livesdk.service.animation.C10646b.AbstractC10650c
        /* renamed from: b */
        public final void mo15155b() {
        }

        @Override // com.bytedance.android.livesdk.service.animation.C10646b.AbstractC10650c
        /* renamed from: c */
        public final void mo15156c() {
        }

        @Override // com.bytedance.android.livesdk.service.animation.C10646b.AbstractC10650c
        /* renamed from: a */
        public final void mo15154a() {
            this.f21930a = System.currentTimeMillis();
            C8890c.this.postDelayed(new RunnableC8897h(this), C8890c.this.f21922g.longValue());
        }

        @Override // com.bytedance.android.livesdk.service.animation.C10646b.AbstractC10650c
        /* renamed from: d */
        public final void mo15157d() {
            if (C8890c.this.f21917b != null) {
                C8890c.this.f21917b.mo28320c(C4337m.class, true);
                Boolean bool = (Boolean) C8890c.this.f21917b.mo28318b(C9076co.class);
                if (bool != null) {
                    if (C8890c.this.f21921f || !bool.booleanValue()) {
                        C8890c.this.f21917b.mo28320c(C4337m.class, true);
                        C8890c.this.f21917b.mo28319c(C6900ba.class);
                    }
                }
            }
        }
    };

    /* renamed from: i */
    private final Context f21924i;

    /* renamed from: j */
    private ImageView f21925j;

    /* renamed from: k */
    private ImageView f21926k;

    /* renamed from: l */
    private LiveTextView f21927l;

    /* renamed from: m */
    private LiveTextView f21928m;

    /* renamed from: n */
    private AbstractC10652c f21929n;

    static {
        Covode.recordClassIndex(9774);
    }

    private int getLayoutResource() {
        return R.layout.bem;
    }

    public C8890c(Context context) {
        super(context);
        this.f21924i = context;
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    /* renamed from: a */
    public final void mo15138a(AbstractC10652c cVar) {
        this.f21929n = cVar;
        AnimatorSet a = C10646b.m19205a(this, C3966y.m9672g(), this.f21923h);
        this.f21916a = a;
        a.start();
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    public final void setGiftMessage(C8871a aVar) {
        this.f21918c = aVar;
        setUI(C6229a.m13521a(getContext()));
        this.f21922g = Long.valueOf(C8900c.m17247a(this.f21918c.f21834B));
        findViewById(R.id.qy).setBackground(C8900c.m17249b(this.f21918c.f21834B));
    }

    private void setUI(boolean z) {
        CharSequence charSequence;
        LiveTextView liveTextView = this.f21927l;
        if (liveTextView != null) {
            liveTextView.setText(this.f21918c.f21857v);
            LiveTextView liveTextView2 = this.f21928m;
            if (TextUtils.isEmpty(this.f21918c.f21859x)) {
                charSequence = "";
            } else {
                charSequence = this.f21918c.f21859x;
            }
            liveTextView2.setText(charSequence);
            C10731d.C10732a.C10733a.f25859a.mo17658a(new C10731d.C10732a.C10735b(this.f21918c.f21860y), 99);
            if (!(this.f21918c.f21861z == null || this.f21918c.f21861z.getAvatarThumb() == null)) {
                m17228a(this.f21919d, this.f21918c.f21861z.getAvatarThumb());
            }
            if (!(this.f21918c.f21861z == null || this.f21918c.f21861z.getUserHonor() == null)) {
                m17228a(this.f21926k, this.f21918c.f21861z.getUserHonor().mo16484n());
            }
            ImageModel b = C8313a.m16464b(this.f21918c.f21861z);
            if (b != null) {
                m17228a(this.f21925j, b);
            }
            if (this.f21918c.f21858w != null) {
                m17229a(this.f21920e, this.f21918c.f21858w, false);
            }
            if (z) {
                getRootView().setPadding(0, 0, C3966y.m9653a(16.0f), 0);
            }
            invalidate();
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    /* renamed from: a */
    public final void mo15140a(DataChannel dataChannel) {
        MethodCollector.m26663i(3232);
        this.f21917b = dataChannel;
        LayoutInflater.from(this.f21924i).inflate(getLayoutResource(), this);
        this.f21919d = (ImageView) findViewById(R.id.f_e);
        this.f21925j = (ImageView) findViewById(R.id.f_a);
        this.f21926k = (ImageView) findViewById(R.id.bfm);
        this.f21920e = (ImageView) findViewById(R.id.ba7);
        this.f21927l = (LiveTextView) findViewById(R.id.fa4);
        this.f21928m = (LiveTextView) findViewById(R.id.b_u);
        this.f21920e.setOnClickListener(new View$OnClickListenerC8893d(this));
        this.f21927l.setOnClickListener(new View$OnClickListenerC8894e(this));
        this.f21928m.setOnClickListener(new View$OnClickListenerC8895f(this));
        findViewById(R.id.ob).setOnClickListener(new View$OnClickListenerC8896g(this, dataChannel));
        MethodCollector.m26664o(3232);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15158a(String str) {
        User user;
        long j = this.f21918c.f21860y;
        C8803g gVar = new C8803g();
        gVar.f21680b = "gift_panel";
        gVar.f21683e = j;
        Room room = (Room) this.f21917b.mo28318b(C9093de.class);
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        gVar.f21679a = user;
        this.f21917b.mo28320c(C4344t.class, gVar);
        C10754a.m19352a(str);
    }

    /* renamed from: a */
    private void m17228a(ImageView imageView, ImageModel imageModel) {
        boolean z;
        if (this.f21920e != imageView) {
            z = true;
        } else {
            z = false;
        }
        m17229a(imageView, imageModel, z);
    }

    @Override // com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a
    /* renamed from: a */
    public final void mo15139a(AbstractC10652c cVar, Boolean bool) {
        this.f21929n = cVar;
        this.f21921f = bool.booleanValue();
        AnimatorSet a = C10646b.m19205a(this, C3966y.m9672g(), this.f21923h);
        this.f21916a = a;
        a.start();
    }

    /* renamed from: a */
    private void m17229a(final ImageView imageView, ImageModel imageModel, final boolean z) {
        ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a(imageModel, new AbstractC11803e.AbstractC11805b() {
            /* class com.bytedance.android.livesdk.gifttray.p556c.C8890c.C88922 */

            static {
                Covode.recordClassIndex(9776);
            }

            @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
            /* renamed from: a */
            public final void mo8986a(Bitmap bitmap) {
                Bitmap b;
                if (bitmap != null) {
                    if (z) {
                        b = C8795a.m17102a(bitmap);
                    } else {
                        b = C8795a.m17103b(bitmap);
                    }
                    if (b != null && !b.isRecycled()) {
                        imageView.setImageBitmap(b);
                        if (imageView == C8890c.this.f21919d) {
                            C10731d.C10732a.C10733a.f25859a.mo17655a(99);
                        } else if (imageView == C8890c.this.f21920e) {
                            C10731d.C10732a.C10733a.f25859a.mo17657a(99, false);
                        }
                        C8890c.this.invalidate();
                    }
                }
            }
        });
    }
}
