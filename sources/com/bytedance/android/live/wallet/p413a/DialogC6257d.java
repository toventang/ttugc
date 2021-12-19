package com.bytedance.android.live.wallet.p413a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.p025c.C0486b;
import com.C1764a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.AbstractC6377a;
import com.bytedance.android.live.wallet.model.C6382e;
import com.bytedance.android.live.wallet.model.C6383f;
import com.bytedance.android.livesdk.livesetting.other.PayMethodsDisabledAlertSetting;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.model.EnumC9534ar;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.wallet.a.d */
public class DialogC6257d extends AbstractDialogC6247a {

    /* renamed from: a */
    private final AbstractC6377a f15640a;

    /* renamed from: b */
    private final boolean f15641b;

    /* renamed from: c */
    private final C88411a f15642c;

    /* renamed from: d */
    private final Set<EnumC9534ar> f15643d;

    /* renamed from: e */
    private final EnumC9534ar[] f15644e;

    /* renamed from: f */
    private View.OnClickListener f15645f;

    /* renamed from: l */
    protected AbstractC6377a.AbstractC6378a f15646l = new AbstractC6377a.AbstractC6378a() {
        /* class com.bytedance.android.live.wallet.p413a.DialogC6257d.C62592 */

        static {
            Covode.recordClassIndex(6972);
        }

        @Override // com.bytedance.android.live.wallet.model.AbstractC6377a.AbstractC6378a
        /* renamed from: a */
        public final void mo12277a(AbstractC6377a aVar, boolean z) {
            if (z) {
                DialogC6257d.this.f15656v = null;
                DialogC6257d.this.mo12274f();
            } else if (!aVar.mo12268a()) {
                String value = PayMethodsDisabledAlertSetting.INSTANCE.getValue();
                if (!TextUtils.isEmpty(value)) {
                    DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(DialogC6257d.this.getContext());
                    aVar2.f22245b = value;
                    aVar2.mo15244a(17039370, DialogInterface$OnClickListenerC6265h.f15666a, false).mo15247a().show();
                }
            } else {
                DialogC6257d.this.f15656v = aVar.f15935q;
                DialogC6257d.this.mo12274f();
            }
        }
    };

    /* renamed from: m */
    protected String f15647m;

    /* renamed from: n */
    protected String f15648n;

    /* renamed from: o */
    protected TextView f15649o;

    /* renamed from: p */
    protected TextView f15650p;

    /* renamed from: q */
    protected TextView f15651q;

    /* renamed from: r */
    protected ProgressBar f15652r;

    /* renamed from: s */
    protected ViewGroup f15653s;

    /* renamed from: t */
    protected View f15654t;

    /* renamed from: u */
    protected ChargeDeal f15655u;

    /* renamed from: v */
    protected EnumC9534ar f15656v;

    /* renamed from: w */
    protected Context f15657w;

    /* renamed from: x */
    protected final Map<Long, AbstractC6377a> f15658x;

    static {
        Covode.recordClassIndex(6970);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12260b() {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15642c.mo142944a();
    }

    /* renamed from: com.bytedance.android.live.wallet.a.d$4 */
    static /* synthetic */ class C62614 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15662a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 6974(0x1b3e, float:9.773E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.model.ar[] r0 = com.bytedance.android.livesdk.model.EnumC9534ar.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.live.wallet.p413a.DialogC6257d.C62614.f15662a = r2
                com.bytedance.android.livesdk.model.ar r0 = com.bytedance.android.livesdk.model.EnumC9534ar.FIRE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.live.wallet.p413a.DialogC6257d.C62614.f15662a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.model.ar r0 = com.bytedance.android.livesdk.model.EnumC9534ar.TEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p413a.DialogC6257d.C62614.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo12275g() {
        MethodCollector.m26663i(10669);
        this.f15652r.setVisibility(0);
        this.f15651q.setVisibility(8);
        this.f15654t.setEnabled(false);
        this.f15653s.removeAllViews();
        this.f15642c.mo142945a(((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).fetchOptionList().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C6263f(this), new C6264g(this)));
        MethodCollector.m26664o(10669);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12255a() {
        this.f15649o.setText(C3966y.m9660a((int) R.string.gu0, Float.valueOf(((float) this.f15655u.f23070c) / 100.0f)));
        this.f15650p.setText(new StringBuilder().append(C3966y.m9657a((int) R.string.gv3)).append(C11266h.m19968a("%.2f", Float.valueOf(((float) this.f15655u.f23069b) / 100.0f))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo12274f() {
        if (this.f15656v == null) {
            this.f15654t.setEnabled(false);
            for (AbstractC6377a aVar : this.f15658x.values()) {
                if (aVar.f15926h != null) {
                    aVar.f15926h.setChecked(false);
                }
            }
        } else {
            Iterator<AbstractC6377a> it = this.f15658x.values().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC6377a next = it.next();
                if (next.f15926h != null) {
                    CheckBox checkBox = next.f15926h;
                    if (next.f15935q != this.f15656v) {
                        z = false;
                    }
                    checkBox.setChecked(z);
                }
            }
            this.f15654t.setEnabled(true);
        }
        mo12255a();
    }

    /* renamed from: a */
    public final void mo12272a(ChargeDeal chargeDeal) {
        this.f15655u = chargeDeal;
        if (this.f15649o != null) {
            mo12274f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12273a(Throwable th) {
        C3854a.m9455a(6, "PayDialog", th.getStackTrace());
        this.f15652r.setVisibility(8);
        this.f15651q.setVisibility(0);
        this.f15654t.setEnabled(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12271a(C5831c cVar) {
        this.f15652r.setVisibility(8);
        this.f15651q.setVisibility(8);
        mo12260b();
        for (C6382e eVar : cVar.f14684b) {
            AbstractC6377a aVar = this.f15658x.get(Long.valueOf(eVar.f15948a));
            if (aVar != null) {
                if (eVar.f15951d) {
                    aVar.f15933o = eVar.f15949b;
                    aVar.f15934p = eVar.f15950c;
                    aVar.mo12499a(this.f15653s);
                } else {
                    this.f15658x.remove(Long.valueOf(eVar.f15948a));
                }
            }
        }
        String a = AbstractC6804a.f16949ay.mo13066a();
        if (C13627m.m24498a(a)) {
            this.f15656v = null;
        } else if (EnumC9534ar.valueOf(a) != EnumC9534ar.FIRE || this.f15640a.mo12268a()) {
            EnumC9534ar valueOf = EnumC9534ar.valueOf(a);
            this.f15656v = valueOf;
            if (this.f15643d.contains(valueOf)) {
                this.f15656v = null;
                EnumC9534ar[] arVarArr = this.f15644e;
                int length = arVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    EnumC9534ar arVar = arVarArr[i];
                    if (!this.f15643d.contains(arVar)) {
                        this.f15656v = arVar;
                        break;
                    }
                    i++;
                }
            }
        } else {
            this.f15656v = null;
        }
        mo12274f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b6t);
        Window window = getWindow();
        boolean z = true;
        try {
            if (getContext().getResources().getConfiguration().orientation != 1) {
                z = false;
            }
        } catch (Exception e) {
            C3854a.m9458a("PayDialog", e);
        }
        if (window != null) {
            if (z) {
                getWindow().setLayout(-1, -2);
                getWindow().setGravity(80);
            } else {
                getWindow().setLayout(-2, -1);
                getWindow().setWindowAnimations(R.style.a3e);
                getWindow().setGravity(21);
            }
        }
        this.f15643d.clear();
        this.f15649o = (TextView) findViewById(R.id.f1g);
        this.f15650p = (TextView) findViewById(R.id.f26);
        this.f15652r = (ProgressBar) findViewById(R.id.d_c);
        this.f15653s = (ViewGroup) findViewById(R.id.cdx);
        TextView textView = (TextView) findViewById(R.id.ez6);
        this.f15651q = textView;
        textView.setOnClickListener(new View$OnClickListenerC6262e(this));
        View findViewById = findViewById(R.id.yi);
        this.f15654t = findViewById;
        findViewById.setOnClickListener(this.f15645f);
        if (this.f15655u != null) {
            mo12255a();
        }
        if (!this.f15641b) {
            this.f15658x.remove(Long.valueOf(this.f15640a.f15928j));
        }
        mo12275g();
    }

    public DialogC6257d(Context context, String str, String str2) {
        super(context);
        C62581 r3 = new AbstractC6377a(C3966y.m9657a((int) R.string.gty), EnumC9534ar.FIRE) {
            /* class com.bytedance.android.live.wallet.p413a.DialogC6257d.C62581 */

            static {
                Covode.recordClassIndex(6971);
            }

            @Override // com.bytedance.android.live.wallet.model.AbstractC6377a
            /* renamed from: a */
            public final boolean mo12268a() {
                if (DialogC6257d.this.f15655u.f23072e <= 0) {
                    return true;
                }
                return false;
            }

            @Override // com.bytedance.android.live.wallet.model.AbstractC6377a
            /* renamed from: b */
            public final void mo12269b() {
                String a = C3966y.m9657a((int) R.string.gts);
                StringBuilder sb = new StringBuilder(C1764a.m5929a(Locale.US, a, new Object[]{0}));
                if (DialogC6257d.this.f15655u.f23072e > 0) {
                    sb.append(DialogC6257d.this.f15657w.getString(R.string.gtz));
                }
                this.f15932n = sb.toString();
                this.f15923e.setText(this.f15932n);
                this.f15923e.setVisibility(0);
            }
        };
        this.f15640a = r3;
        HashMap hashMap = new HashMap();
        this.f15658x = hashMap;
        this.f15642c = new C88411a();
        this.f15643d = new C0486b();
        this.f15644e = new EnumC9534ar[0];
        this.f15645f = new View.OnClickListener() {
            /* class com.bytedance.android.live.wallet.p413a.DialogC6257d.View$OnClickListenerC62603 */

            static {
                Covode.recordClassIndex(6973);
            }

            public final void onClick(View view) {
                String str;
                if (DialogC6257d.this.f15656v != null) {
                    C6779a.m14563a().mo13053a(new C6383f(DialogC6257d.this.f15655u, DialogC6257d.this.f15656v));
                    C6806c.m14603a(AbstractC6804a.f16949ay, DialogC6257d.this.f15656v.name());
                    if (C62614.f15662a[DialogC6257d.this.f15656v.ordinal()] != 1) {
                        str = "TEST";
                    } else {
                        str = "balance";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("request_page", DialogC6257d.this.f15648n);
                    hashMap.put("charge_reason", DialogC6257d.this.f15647m);
                    hashMap.put("pay_method", str);
                    C6501b.C6502a.m13948a("livesdk_recharge_pay").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
                }
            }
        };
        this.f15657w = context;
        this.f15641b = false;
        this.f15647m = str;
        this.f15648n = str2;
        r3.f15936r = this.f15646l;
        hashMap.put(Long.valueOf(r3.f15928j), r3);
    }
}
