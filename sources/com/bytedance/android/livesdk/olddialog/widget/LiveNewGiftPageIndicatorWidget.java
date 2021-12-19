package com.bytedance.android.livesdk.olddialog.widget;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.olddialog.viewmodel.C10041a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

public class LiveNewGiftPageIndicatorWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    LinearLayout f24411a;

    /* renamed from: b */
    public C10041a f24412b;

    /* renamed from: c */
    int f24413c;

    /* renamed from: d */
    int f24414d;

    /* renamed from: e */
    ImageView f24415e;

    /* renamed from: f */
    ArrayList<ImageView> f24416f = new ArrayList<>();

    static {
        Covode.recordClassIndex(11604);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bg9;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.f24412b.f24390f.removeObservers(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f24411a = (LinearLayout) findViewById(R.id.cyp);
        this.f24412b.f24390f.observe(this, new C10058h(this));
    }
}
