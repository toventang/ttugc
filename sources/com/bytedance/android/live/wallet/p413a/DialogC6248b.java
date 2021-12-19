package com.bytedance.android.live.wallet.p413a;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6366h;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.AbstractC6303a;
import com.bytedance.android.live.wallet.model.AbstractC6377a;
import com.bytedance.android.live.wallet.p419f.p420a.C6350c;
import com.bytedance.android.live.wallet.p419f.p421b.AbstractC6357a;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.model.EnumC9534ar;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdk.wallet.C11317f;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.wallet.a.b */
public final class DialogC6248b extends DialogC6257d implements AbstractC6357a {

    /* renamed from: A */
    private final View.OnClickListener f15618A = new View$OnClickListenerC6256c(this);

    /* renamed from: a */
    C6350c f15619a;

    /* renamed from: b */
    LiveLoadingView f15620b;

    /* renamed from: c */
    View f15621c;

    /* renamed from: d */
    ImageView f15622d;

    /* renamed from: e */
    TextView f15623e;

    /* renamed from: f */
    TextView f15624f;

    /* renamed from: g */
    ImageView f15625g;

    /* renamed from: h */
    Activity f15626h;

    /* renamed from: i */
    public IWalletService.AbstractC6245a f15627i;

    /* renamed from: j */
    AbstractC6366h f15628j;

    /* renamed from: k */
    public final AbstractC6377a f15629k = new AbstractC6377a(C3966y.m9657a((int) R.string.gtv), EnumC9534ar.DIAMOND) {
        /* class com.bytedance.android.live.wallet.p413a.DialogC6248b.C62491 */

        static {
            Covode.recordClassIndex(6962);
        }

        @Override // com.bytedance.android.live.wallet.model.AbstractC6377a
        /* renamed from: a */
        public final boolean mo12268a() {
            if (((long) DialogC6248b.this.f15655u.f23072e) <= ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b()) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.android.live.wallet.model.AbstractC6377a
        /* renamed from: b */
        public final void mo12269b() {
            if (mo12268a()) {
                this.f15932n = C3966y.m9660a((int) R.string.gjy, Long.valueOf(((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b()));
            } else {
                this.f15932n = C3966y.m9657a((int) R.string.gjx);
            }
            this.f15923e.setText(this.f15932n);
            this.f15923e.setVisibility(0);
        }
    };

    /* renamed from: y */
    private String f15630y;

    /* renamed from: z */
    private AbstractC88412b f15631z;

    static {
        Covode.recordClassIndex(6961);
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: a */
    public final void mo12256a(int i) {
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: c */
    public final void mo12262c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.wallet.p413a.DialogC6257d
    /* renamed from: b */
    public final void mo12260b() {
        this.f15629k.mo12499a(this.f15653s);
    }

    public final void show() {
        if (this.f15628j != null && this.f15655u != null) {
            super.show();
        }
    }

    public final void dismiss() {
        super.dismiss();
        AbstractC88412b bVar = this.f15631z;
        if (bVar != null && !bVar.isDisposed()) {
            this.f15631z.dispose();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.b$7 */
    static /* synthetic */ class C62557 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15638a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 6968(0x1b38, float:9.764E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.model.ar[] r0 = com.bytedance.android.livesdk.model.EnumC9534ar.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.live.wallet.p413a.DialogC6248b.C62557.f15638a = r2
                com.bytedance.android.livesdk.model.ar r0 = com.bytedance.android.livesdk.model.EnumC9534ar.FIRE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.live.wallet.p413a.DialogC6248b.C62557.f15638a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.model.ar r0 = com.bytedance.android.livesdk.model.EnumC9534ar.TEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p413a.DialogC6248b.C62557.<clinit>():void");
        }
    }

    /* renamed from: d */
    public final void mo12263d() {
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        m13558b(false);
        this.f15625g.setImageResource(2131234547);
        this.f15624f.setText(R.string.gkg);
        this.f15623e.setText(R.string.gto);
        IWalletService.AbstractC6245a aVar = this.f15627i;
        if (aVar != null) {
            aVar.mo12251b(this, this.f15628j);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.wallet.p413a.DialogC6257d
    /* renamed from: a */
    public final void mo12255a() {
        if (this.f15655u != null) {
            this.f15649o.setText(C3966y.m9660a((int) R.string.gu0, Float.valueOf(((float) this.f15655u.f23070c) / 100.0f)));
            if (this.f15656v == null || this.f15656v == EnumC9534ar.DIAMOND) {
                this.f15650p.setText(String.valueOf(this.f15655u.f23072e));
                ImageView imageView = this.f15622d;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            this.f15650p.setText(new StringBuilder().append(C3966y.m9657a((int) R.string.gv3)).append(C11266h.m19968a("%.2f", Float.valueOf(((float) this.f15655u.f23069b) / 100.0f))));
            ImageView imageView2 = this.f15622d;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo12265e() {
        if (this.f15656v != null) {
            C6806c.m14603a(AbstractC6804a.f16949ay, this.f15656v.name());
            String str = "TEST";
            if (C62557.f15638a[this.f15656v.ordinal()] == 1) {
                str = "balance";
            }
            new HashMap().put("lable", str);
            HashMap hashMap = new HashMap();
            hashMap.put("lable", String.valueOf(this.f15655u.f23072e));
            C6501b.C6502a.m13948a("recharge_list").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
            if (!TextUtils.equals("balance", str)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("request_page", this.f15630y);
                hashMap2.put("charge_reason", this.f15647m);
                hashMap2.put("pay_method", str);
                C6501b.C6502a.m13948a("livesdk_recharge_pay").mo12652a((Map<String, String>) hashMap2).mo12639a().mo12655b();
            }
            if (this.f15655u != null && this.f15656v != null && this.f15656v == EnumC9534ar.DIAMOND) {
                m13557a(true);
            }
        }
    }

    /* renamed from: a */
    private void m13557a(boolean z) {
        if (z) {
            setCancelable(false);
            setCanceledOnTouchOutside(false);
            m13558b(true);
        } else {
            m13558b(false);
        }
        AbstractC6366h hVar = this.f15628j;
        if (hVar != null) {
            hVar.mo12385a().mo143271a(new C11191f()).mo143254a(new AbstractC88433f<C5832d<C11317f>>() {
                /* class com.bytedance.android.live.wallet.p413a.DialogC6248b.C62524 */

                static {
                    Covode.recordClassIndex(6965);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(C5832d<C11317f> dVar) {
                    if (((C11317f) dVar.data).f27070a == 0) {
                        DialogC6248b bVar = DialogC6248b.this;
                        if (bVar.f15627i != null) {
                            bVar.f15627i.mo12250a(bVar, bVar.f15628j);
                        }
                        bVar.dismiss();
                        return;
                    }
                    DialogC6248b.this.mo12263d();
                }
            }, new AbstractC88433f<Throwable>() {
                /* class com.bytedance.android.live.wallet.p413a.DialogC6248b.C62535 */

                static {
                    Covode.recordClassIndex(6966);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Throwable th) {
                    DialogC6248b.this.mo12263d();
                }
            });
        }
    }

    /* renamed from: b */
    private void m13558b(boolean z) {
        this.f15621c.setVisibility(0);
        if (z) {
            this.f15620b.setVisibility(0);
            this.f15623e.setVisibility(8);
            this.f15624f.setVisibility(8);
            this.f15625g.setVisibility(8);
            return;
        }
        this.f15620b.setVisibility(8);
        this.f15624f.setVisibility(0);
        this.f15625g.setVisibility(0);
        this.f15623e.setVisibility(0);
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: b */
    public final void mo12261b(int i) {
        C11115u.m19743a().mo17915b().mo13169i().mo116431a_(new AbstractC88406ae<AbstractC2994b>() {
            /* class com.bytedance.android.live.wallet.p413a.DialogC6248b.C62546 */

            static {
                Covode.recordClassIndex(6967);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* bridge */ /* synthetic */ void onSuccess(AbstractC2994b bVar) {
            }
        });
        m13558b(false);
        this.f15625g.setImageResource(2131234548);
        this.f15624f.setText(R.string.gid);
        this.f15623e.setText(R.string.guk);
        m13557a(false);
    }

    /* renamed from: a */
    public final void mo12258a(AbstractC6366h hVar) {
        String str;
        this.f15628j = hVar;
        if (hVar.mo12386b() == 10001) {
            str = "card_ticket";
        } else {
            str = "guard";
        }
        this.f15647m = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.wallet.p413a.DialogC6257d
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15620b = (LiveLoadingView) findViewById(R.id.ff0);
        this.f15621c = findViewById(R.id.ac_);
        this.f15623e = (TextView) findViewById(R.id.eu4);
        this.f15622d = (ImageView) findViewById(R.id.bv0);
        this.f15624f = (TextView) findViewById(R.id.eu5);
        this.f15625g = (ImageView) findViewById(R.id.bug);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15650p.getLayoutParams();
        marginLayoutParams.topMargin = C3966y.m9653a(34.0f);
        this.f15650p.setLayoutParams(marginLayoutParams);
        this.f15631z = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12364a().mo143289d(new AbstractC88433f<Long>() {
            /* class com.bytedance.android.live.wallet.p413a.DialogC6248b.C62502 */

            static {
                Covode.recordClassIndex(6963);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Long l) {
                if (DialogC6248b.this.f15629k != null) {
                    AbstractC6377a aVar = DialogC6248b.this.f15629k;
                    aVar.mo12500a(aVar.mo12268a());
                    aVar.mo12269b();
                }
            }
        });
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
        C6350c cVar = new C6350c(this.f15626h, new AbstractC6303a() {
            /* class com.bytedance.android.live.wallet.p413a.DialogC6248b.C62513 */

            static {
                Covode.recordClassIndex(6964);
            }
        }, this.f15647m);
        this.f15619a = cVar;
        cVar.mo12404a((AbstractC6357a) this);
        this.f15649o.setVisibility(8);
        this.f15654t.setOnClickListener(this.f15618A);
        this.f15658x.put(Long.valueOf(this.f15629k.f15928j), this.f15629k);
        this.f15629k.f15936r = this.f15646l;
        HashMap hashMap = new HashMap();
        if (this.f15655u != null) {
            hashMap.put("money", String.valueOf(this.f15655u.f23072e + this.f15655u.f23073f));
        }
        hashMap.put("request_page", this.f15630y);
        if (this.f15628j != null) {
            hashMap.put("charge_reason", this.f15647m);
        }
        C6501b.C6502a.m13948a("livesdk_check_out_show").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
    }

    /* renamed from: a */
    public final boolean mo12259a(String str) {
        try {
            mo12272a((ChargeDeal) C4139e.C4140a.f11575b.mo46670a(str, ChargeDeal.class));
            if (this.f15655u != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C3854a.m9458a("ConsumeDialog", e);
            return false;
        }
    }

    public DialogC6248b(Activity activity, String str) {
        super(activity, "", str);
        this.f15630y = str;
        this.f15626h = activity;
    }

    @Override // com.bytedance.android.live.wallet.p419f.p421b.AbstractC6359c
    /* renamed from: a */
    public final void mo12257a(int i, int i2, int i3, Exception exc) {
        this.f15621c.setVisibility(8);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ef2);
    }
}
