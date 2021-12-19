package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C6903bd;
import com.bytedance.android.livesdk.C6904be;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.olddialog.viewmodel.C10041a;
import com.bytedance.android.livesdk.olddialog.widget.C10049a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10640d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LiveNewGiftBottomWidget extends LiveWidget implements C10049a.AbstractC10051a, AbstractC33974au {

    /* renamed from: a */
    RecyclerView f24394a;

    /* renamed from: b */
    public C10041a f24395b;

    /* renamed from: c */
    public View f24396c;

    /* renamed from: d */
    public String f24397d;

    /* renamed from: e */
    public String f24398e = "";

    /* renamed from: f */
    private final String f24399f = "live_new_gift_bottom_widget";

    /* renamed from: g */
    private C10049a f24400g;

    /* renamed from: h */
    private TextView f24401h;

    /* renamed from: i */
    private View f24402i;

    /* renamed from: j */
    private View f24403j;

    /* renamed from: k */
    private View f24404k;

    /* renamed from: l */
    private long f24405l;

    /* renamed from: m */
    private List<GiftPage> f24406m;

    static {
        Covode.recordClassIndex(11600);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bg0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16867a() {
        View view = this.f24404k;
        if (view != null && view.getVisibility() == 0) {
            C6806c.m14603a((C6800c) AbstractC6804a.f17008cD, (Object) false);
            this.f24404k.setVisibility(8);
        }
        if (C10640d.C10641a.f25646a.mo17551a(C10640d.EnumC10643c.RECHARGE_DIALOG)) {
            this.dataChannel.mo28320c(C6904be.class, new C6903bd("click", 0, "normal", this.f24398e));
        }
    }

    /* renamed from: b */
    private void m18572b() {
        if (this.f24406m != null) {
            ArrayList arrayList = new ArrayList(8);
            for (GiftPage giftPage : this.f24406m) {
                if (giftPage.display) {
                    C10071u uVar = new C10071u();
                    uVar.f24478a = giftPage.pageName;
                    uVar.f24479b = giftPage.pageType;
                    uVar.f24480c = giftPage.pagePanelBanner;
                    arrayList.add(uVar);
                }
            }
            this.f24400g.mo16880a(arrayList);
            if (arrayList.size() <= 1) {
                this.f24394a.setVisibility(8);
                return;
            }
            this.f24394a.setVisibility(0);
            int a = this.f24400g.mo16879a();
            if (a > 0) {
                this.f24394a.postDelayed(new RunnableC10052b(this, a), 20);
            }
        }
    }

    /* renamed from: c */
    private void m18573c() {
        C10041a aVar = this.f24395b;
        if (aVar != null && aVar.f24386b != null && this.f24395b.f24386b.getValue() != null && this.f24395b.f24386b.getValue().intValue() == 5) {
            return;
        }
        if (!GiftManager.inst().hideBottomBar() && !HideChargeIconForUserSetting.INSTANCE.getValue()) {
            if (AbstractC6804a.f17008cD.mo13066a().booleanValue() && ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12380e().getValidUser()) {
                this.f24404k.setVisibility(0);
            }
            if (this.f24405l > 0) {
                this.f24403j.setVisibility(8);
                this.f24402i.setVisibility(0);
                return;
            }
            this.f24403j.setVisibility(0);
            this.f24402i.setVisibility(8);
        } else if (this.f24405l > 0) {
            this.f24403j.setVisibility(8);
            this.f24402i.setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f24401h = (TextView) findViewById(R.id.qc);
        this.f24403j = findViewById(R.id.csq);
        this.f24402i = findViewById(R.id.df_);
        this.f24396c = findViewById(R.id.cma);
        this.f24404k = findViewById(R.id.dfc);
        C10041a aVar = this.f24395b;
        if (!(aVar == null || aVar.f24386b == null || this.f24395b.f24386b.getValue() == null)) {
            if (this.f24395b.f24386b.getValue().intValue() == 5) {
                if (this.f24397d != null) {
                    this.f24396c.setVisibility(0);
                } else {
                    this.f24396c.setVisibility(8);
                }
                this.f24402i.setVisibility(8);
            } else {
                m18573c();
            }
            this.f24403j.setOnClickListener(new View$OnClickListenerC10053c(this));
            this.f24402i.setOnClickListener(new View$OnClickListenerC10054d(this));
            this.f24396c.setOnClickListener(new View$OnClickListenerC10055e(this));
            ((LiveTextView) findViewById(R.id.dfe)).setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            ((LiveTextView) findViewById(R.id.a7s)).setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            ImageView imageView = (ImageView) findViewById(R.id.l3);
            ImageView imageView2 = (ImageView) findViewById(R.id.l4);
            ImageView imageView3 = (ImageView) findViewById(R.id.l5);
            if (C3966y.m9672g()) {
                imageView.setBackground(C3966y.m9665c(2131234716));
                imageView2.setBackground(C3966y.m9665c(2131234716));
                imageView3.setBackground(C3966y.m9665c(2131234716));
            }
        }
        m18572b();
        mo16868a(((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b());
        ((AbstractC11181z) ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12364a().mo143274a(WidgetExtendsKt.autoDispose(this))).mo17950a(new C10056f(this), new C10057g(this));
        this.f24394a = (RecyclerView) findViewById(R.id.cs3);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        this.f24394a.setLayoutManager(linearLayoutManager);
        C10049a aVar2 = new C10049a();
        this.f24400g = aVar2;
        aVar2.f24448b = this.f24395b;
        this.f24400g.f24449c = this;
        this.f24400g.f24452f = this.dataChannel;
        this.f24394a.setAdapter(this.f24400g);
    }

    /* renamed from: a */
    public final void mo16869a(List<GiftPage> list) {
        this.f24406m = list;
        m18572b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16868a(long j) {
        long j2;
        TextView textView = this.f24401h;
        if (C11115u.m19743a().mo17915b().mo13165e()) {
            j2 = m18571b(j);
        } else {
            j2 = 0L;
        }
        textView.setText(String.valueOf(j2));
        this.f24405l = j;
        m18573c();
    }

    /* renamed from: b */
    private static String m18571b(long j) {
        if (j >= 10000 && j < 1000000) {
            double d = (double) j;
            Double.isNaN(d);
            return C1764a.m5929a(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d / 1000.0d)}) + "K";
        } else if (j >= 1000000) {
            double d2 = (double) j;
            Double.isNaN(d2);
            return C1764a.m5929a(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d2 / 1000000.0d)}) + "M";
        } else if (j >= 1000) {
            return new StringBuffer(String.valueOf(j)).insert(1, ',').toString();
        } else {
            return String.valueOf(j);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.widget.C10049a.AbstractC10051a
    /* renamed from: a */
    public final void mo16870a(boolean z) {
        if (z) {
            this.f24396c.setVisibility(8);
            m18573c();
            return;
        }
        this.f24402i.setVisibility(8);
        this.f24403j.setVisibility(8);
        if (this.f24397d != null) {
            this.f24396c.setVisibility(0);
        }
    }
}
