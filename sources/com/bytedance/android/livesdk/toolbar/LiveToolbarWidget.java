package com.bytedance.android.livesdk.toolbar;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4328d;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p385p.EnumC5852o;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.livesetting.other.LiveTurntableUrlSetting;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LiveToolbarWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: c */
    private static final int f26172c = C3966y.m9653a(8.0f);

    /* renamed from: d */
    private static final int f26173d = C3966y.m9653a(4.0f);

    /* renamed from: a */
    protected boolean f26174a;

    /* renamed from: b */
    protected EnumC5854q f26175b;

    /* renamed from: e */
    private List<EnumC5847l> f26176e = new ArrayList();

    /* renamed from: f */
    private LinearLayout f26177f;

    /* renamed from: g */
    private boolean f26178g;

    /* renamed from: h */
    private boolean f26179h;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17763c() {
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bek;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LinearLayout mo17761a() {
        return (LinearLayout) getView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17762b() {
        EnumC5852o.RIGHT.createHolder(this.dataChannel, this.f26177f, this.f26176e, this.f26175b);
    }

    static {
        Covode.recordClassIndex(12499);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f26176e.clear();
        ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).toolbarManager().mo11609a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        this.f26178g = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f26179h = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
        this.f26177f = mo17761a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        int i = 0;
        C0792v.m2759b((View) this.f26177f, 0);
        this.f26178g = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f26179h = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
        boolean equals = Boolean.TRUE.equals(this.dataChannel.mo28318b(C9114dz.class));
        this.f26174a = equals;
        if (equals) {
            this.f26175b = EnumC5854q.ICON_WITH_TEXT;
            mo17763c();
        } else {
            this.f26175b = EnumC5854q.ICON;
        }
        this.dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C10917f(this)).mo28313b((AbstractC1204m) this, C4328d.class, (AbstractC89172b) new C10918g(this));
        if (TextUtils.isEmpty(LiveTurntableUrlSetting.INSTANCE.getValue())) {
            ((IGiftService) C6193a.m13435a(IGiftService.class)).onTurnTableUrlEmpty("The value in LiveConfigSettingKeys is empty");
        }
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof List)) {
            this.f26176e = (List) objArr[0];
        }
        mo17762b();
        if (this.context != null && !this.f26178g && getView() != null && (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (this.f26179h || !C6229a.m13521a(this.context)) {
                marginLayoutParams.rightMargin = f26172c;
                if (this.f26174a) {
                    i = f26173d;
                }
                marginLayoutParams.leftMargin = i;
            } else {
                marginLayoutParams.leftMargin = f26172c;
                if (this.f26174a) {
                    i = f26173d;
                }
                marginLayoutParams.rightMargin = i;
            }
            getView().setLayoutParams(marginLayoutParams);
        }
    }
}
