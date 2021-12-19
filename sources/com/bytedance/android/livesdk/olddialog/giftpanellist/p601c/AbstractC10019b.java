package com.bytedance.android.livesdk.olddialog.giftpanellist.p601c;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.dialogv2.p516b.C8347c;
import com.bytedance.android.livesdk.dialogv2.p516b.C8348d;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.android.livesdk.service.animation.p622a.C10645a;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView;
import com.bytedance.android.livesdk.service.p625c.p628c.C10725a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10730c;
import com.bytedance.android.livesdk.service.p625c.p632g.C10752a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.b */
public abstract class AbstractC10019b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private ImageView f24340a;

    /* renamed from: b */
    private LiveTextView f24341b;

    /* renamed from: f */
    protected ImageView f24342f;

    /* renamed from: g */
    protected LiveTextView f24343g;

    /* renamed from: h */
    protected HSImageView f24344h;

    /* renamed from: i */
    public DataChannel f24345i;

    /* renamed from: j */
    public AbstractC8812b f24346j;

    /* renamed from: k */
    AbstractC10022a f24347k;

    /* renamed from: l */
    LiveNewSendGiftAnimationView f24348l;

    /* renamed from: m */
    View f24349m;

    /* renamed from: n */
    protected View f24350n;

    /* renamed from: o */
    protected LiveTextView f24351o;

    /* renamed from: p */
    protected LiveTextView f24352p;

    /* renamed from: q */
    protected boolean f24353q;

    /* renamed from: r */
    protected int f24354r;

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.b$a */
    public interface AbstractC10022a {
        static {
            Covode.recordClassIndex(11576);
        }

        /* renamed from: a */
        AbstractC8812b mo16816a();

        /* renamed from: a */
        void mo16819a(AbstractC8812b bVar, AbstractC10019b bVar2);

        /* renamed from: a */
        void mo16820a(AbstractC10019b bVar);

        /* renamed from: a */
        void mo16821a(AbstractC10019b bVar, long j, AbstractC8812b bVar2);

        /* renamed from: a */
        void mo16822a(String str, String str2);

        /* renamed from: b */
        boolean mo16825b(long j);
    }

    static {
        Covode.recordClassIndex(11573);
    }

    /* renamed from: e */
    public boolean mo16841e() {
        return false;
    }

    /* renamed from: h */
    public void mo16851h() {
        this.f24348l.setVisibility(8);
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = this.f24348l;
        if (liveNewSendGiftAnimationView != null) {
            liveNewSendGiftAnimationView.mo17590a();
        }
        this.f24353q = false;
        if (this.f24347k.mo16816a() == this.f24346j) {
            mo16838b();
        }
    }

    /* renamed from: c */
    public void mo16839c() {
        ImageView imageView;
        this.f24350n.setVisibility(4);
        AbstractC8812b bVar = this.f24346j;
        if (bVar == null || bVar.f21695b == null || ((C9904t) this.f24346j.f21695b).f23995L == null || !((C9904t) this.f24346j.f21695b).f23995L.f24023b || (imageView = this.f24340a) == null) {
            ImageView imageView2 = this.f24340a;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        imageView.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16840d() {
        boolean z = false;
        try {
            z = C3941k.m9612a(Uri.parse(this.f24346j.mo14675c().getUrls().get(0)));
        } catch (Exception unused) {
        }
        C10725a.C10726a.C10727a.f25846a.mo17651a(this.f24346j.mo14676d(), z);
        C3941k.m9615b(this.f24344h, this.f24346j.mo14675c(), new C3951p.AbstractC3953a() {
            /* class com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b.C100212 */

            /* renamed from: b */
            private long f24357b;

            static {
                Covode.recordClassIndex(11575);
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9301a(ImageModel imageModel) {
                C10725a.C10726a.C10727a.f25846a.mo17650a(AbstractC10019b.this.f24346j.mo14676d());
                this.f24357b = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9303a(ImageModel imageModel, Exception exc) {
                if (AbstractC10019b.this.f24346j.f21694a == 1) {
                    C10752a.m19346a(AbstractC10019b.this.f24346j.mo14676d(), imageModel.getUri(), exc.getMessage());
                }
                try {
                    C10725a.C10726a.C10727a.f25846a.mo17654c(AbstractC10019b.this.f24346j.mo14676d());
                } catch (Exception unused) {
                }
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9302a(ImageModel imageModel, int i, int i2) {
                String str;
                if (AbstractC10019b.this.f24346j.f21694a == 1) {
                    C10752a.m19345a(AbstractC10019b.this.f24346j.mo14676d(), imageModel.getUri());
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f24357b;
                long d = AbstractC10019b.this.f24346j.mo14676d();
                if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                    str = "";
                } else {
                    str = imageModel.getUrls().get(0);
                }
                C10730c.m19322a(elapsedRealtime, d, str);
                try {
                    C10725a.C10726a.C10727a.f25846a.mo17653b(AbstractC10019b.this.f24346j.mo14676d());
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: b */
    public void mo16838b() {
        this.f24350n.setVisibility(0);
        ImageView imageView = this.f24340a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this instanceof C10031j) {
            return;
        }
        if (C11599a.C11601a.f27757a.f27752a) {
            this.f24351o.setVisibility(0);
            this.f24352p.setVisibility(4);
            this.f24341b.setVisibility(4);
            return;
        }
        AbstractC8812b bVar = this.f24346j;
        if (bVar == null || ((C9904t) bVar.f21695b).f23995L == null || !((C9904t) this.f24346j.f21695b).f23995L.f24023b) {
            this.f24352p.setVisibility(0);
            this.f24341b.setVisibility(4);
            this.f24351o.setVisibility(4);
            return;
        }
        this.f24341b.setVisibility(0);
        this.f24352p.setVisibility(4);
        this.f24351o.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo16850g() {
        this.f24342f = (ImageView) this.f24349m.findViewById(R.id.c86);
        this.f24343g = (LiveTextView) this.f24349m.findViewById(R.id.crv);
        this.f24344h = (HSImageView) this.f24349m.findViewById(R.id.cru);
        this.f24350n = this.f24349m.findViewById(R.id.eox);
        this.f24348l = (LiveNewSendGiftAnimationView) this.f24349m.findViewById(R.id.ba2);
        this.f24351o = (LiveTextView) this.f24349m.findViewById(R.id.bqu);
        LiveTextView liveTextView = (LiveTextView) this.f24349m.findViewById(R.id.brl);
        this.f24352p = liveTextView;
        liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41568b));
        this.f24343g.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        this.f24341b = (LiveTextView) this.f24349m.findViewById(R.id.brm);
        this.f24340a = (ImageView) this.f24349m.findViewById(R.id.eax);
    }

    public AbstractC10019b(View view) {
        super(view);
        this.f24349m = view;
        mo16850g();
    }

    /* renamed from: a */
    public void mo16837a(AbstractC10022a aVar) {
        this.f24349m.setOnClickListener(new View$OnClickListenerC10023c(this, aVar));
        this.f24349m.setOnTouchListener(new View$OnTouchListenerC10024d(this));
        this.f24347k = aVar;
    }

    /* renamed from: a */
    public void mo16847a(long j) {
        if (j == this.f24346j.mo14676d()) {
            AbstractC8812b bVar = this.f24346j;
            if ((bVar instanceof C8348d) || ((bVar instanceof C8347c) && !((C9904t) bVar.f21695b).mo16601a())) {
                this.f24348l.setVisibility(0);
                mo16839c();
                this.f24348l.mo17591a(new RunnableC10025e(this));
                this.f24353q = true;
            }
        }
    }

    /* renamed from: b */
    public void mo16849b(long j) {
        String concat;
        String concat2;
        if (j > 0 && !(this instanceof C10031j)) {
            int i = (int) (j / 1000);
            int i2 = i / 60;
            int i3 = i % 60;
            if (i2 >= 10) {
                concat = String.valueOf(i2);
            } else {
                concat = "0".concat(String.valueOf(i2));
            }
            if (i3 >= 10) {
                concat2 = String.valueOf(i3);
            } else {
                concat2 = "0".concat(String.valueOf(i3));
            }
            this.f24351o.setText(concat + " : " + concat2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo16848a(View view, MotionEvent motionEvent) {
        if (this.f24353q) {
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

    /* renamed from: a */
    public void mo16836a(AbstractC8812b bVar, int i) {
        ImageView imageView;
        this.f24346j = bVar;
        this.f24343g.setText(bVar.mo14673a());
        this.f24343g.setVisibility(0);
        this.f24344h.setVisibility(0);
        this.f24350n.setVisibility(4);
        this.f24352p.setVisibility(0);
        if (((C9904t) this.f24346j.f21695b).f23995L == null || !((C9904t) this.f24346j.f21695b).f23995L.f24023b || (imageView = this.f24340a) == null) {
            ImageView imageView2 = this.f24340a;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else {
            imageView.setVisibility(0);
        }
        AbstractC10022a aVar = this.f24347k;
        if (aVar != null && aVar.mo16816a() == this.f24346j) {
            this.f24350n.setVisibility(0);
            if (!(this instanceof C10031j)) {
                if (C11599a.C11601a.f27757a.f27752a) {
                    this.f24351o.setVisibility(0);
                    this.f24352p.setVisibility(4);
                    this.f24341b.setVisibility(4);
                } else if (((C9904t) this.f24346j.f21695b).f23995L == null || !((C9904t) this.f24346j.f21695b).f23995L.f24023b) {
                    this.f24352p.setVisibility(0);
                    this.f24341b.setVisibility(4);
                    this.f24351o.setVisibility(4);
                } else {
                    this.f24341b.setVisibility(0);
                    ImageView imageView3 = this.f24340a;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                    this.f24351o.setVisibility(4);
                    this.f24352p.setVisibility(4);
                }
            }
            this.f24343g.setVisibility(8);
            this.f24347k.mo16820a(this);
        }
        this.f24354r = i;
        if (this.f24346j.mo14678f() == null || TextUtils.isEmpty(this.f24346j.mo14678f().getUri())) {
            this.f24342f.setVisibility(8);
        } else {
            this.f24342f.setVisibility(0);
            C3951p.m9627a(this.f24342f, this.f24346j.mo14678f(), 0, new C3951p.AbstractC3953a() {
                /* class com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b.C100201 */

                static {
                    Covode.recordClassIndex(11574);
                }

                @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                /* renamed from: a */
                public final void mo9301a(ImageModel imageModel) {
                }

                @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                /* renamed from: a */
                public final void mo9303a(ImageModel imageModel, Exception exc) {
                }

                @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                /* renamed from: a */
                public final void mo9302a(ImageModel imageModel, int i, int i2) {
                    if (i != 0 && i2 != 0) {
                        ViewGroup.LayoutParams layoutParams = AbstractC10019b.this.f24342f.getLayoutParams();
                        layoutParams.width = (i * C3966y.m9653a(13.0f)) / i2;
                        AbstractC10019b.this.f24342f.setLayoutParams(layoutParams);
                    }
                }
            });
        }
        mo16840d();
    }
}
