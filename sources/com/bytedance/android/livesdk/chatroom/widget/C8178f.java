package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.p488c.C7376ai;
import com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a;
import com.bytedance.android.livesdk.live.model.DefaultDonationStickerPosition;
import com.bytedance.android.livesdk.livesetting.decoration.DefaultDonationStickerPositionSetting;
import com.bytedance.android.livesdk.model.C9533aq;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.f */
public final class C8178f extends AbstractC8170a {
    static {
        Covode.recordClassIndex(9001);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    /* renamed from: d */
    public final void mo14400d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    /* renamed from: c */
    public final View mo14399c() {
        return C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b7q, this, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14414a(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        super.mo14396a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14415a(C9533aq aqVar) {
        String str;
        if (!TextUtils.isEmpty(aqVar.f23149e)) {
            C6779a.m14563a().mo13053a(new C7376ai(aqVar.f23149e));
            HashMap hashMap = new HashMap();
            if (this.f20274h) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_anchor", str);
            hashMap.put("position", "donation_sticker");
            hashMap.put("NGO_name", aqVar.f23145a);
            C6501b.C6502a.m13948a("livesdk_donation_icon_click").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    /* renamed from: a */
    public final void mo14396a(boolean z) {
        if (z) {
            super.mo14396a(true);
            return;
        }
        DialogC9148b.C9149a b = new DialogC9148b.C9149a(getContext()).mo15243a(R.string.efv).mo15248b(R.string.dzc).mo15244a(R.string.efu, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC8180h(this), false).mo15249b(R.string.gi8, DialogInterface$OnClickListenerC8181i.f20306a, false);
        b.f22249f = DialogInterface$OnDismissListenerC8182j.f20307a;
        b.f22250g = DialogInterface$OnShowListenerC8183k.f20308a;
        b.mo15247a().show();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    /* renamed from: b */
    public final void mo14398b(View view) {
        C9533aq a;
        int i;
        float f;
        ImageView imageView = (ImageView) view.findViewById(R.id.e8i);
        TextView textView = (TextView) view.findViewById(R.id.e8k);
        if (this.f20273g != null && (a = this.f20273g.mo16523a()) != null) {
            textView.setText(a.f23145a);
            if (a.f23147c != null) {
                C3951p.m9621a(imageView, a.f23147c.mo7782a());
            }
            int d = C3966y.m9667d(R.dimen.yd);
            view.measure(View.MeasureSpec.makeMeasureSpec(d, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20279m, Integer.MIN_VALUE));
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = d;
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            DefaultDonationStickerPosition value = DefaultDonationStickerPositionSetting.INSTANCE.getValue();
            float xRatio = value.getXRatio();
            float yRatio = value.getYRatio();
            float f2 = 1.0f;
            if (xRatio < 0.0f || xRatio > 1.0f) {
                xRatio = DefaultDonationStickerPosition.getDEFAULT_POSITION();
            }
            if (yRatio < 0.0f || yRatio > 1.0f) {
                yRatio = DefaultDonationStickerPosition.getDEFAULT_POSITION();
            }
            if (C6229a.m13521a(getContext())) {
                xRatio = 1.0f - xRatio;
            }
            int i2 = d / 2;
            int i3 = ((int) (((float) measuredWidth) * xRatio)) - i2;
            int i4 = measuredHeight / 2;
            int i5 = ((int) (((float) measuredHeight2) * yRatio)) - i4;
            if (this.f20273g != null) {
                if (this.f20273g.f23167i != -1 || this.f20273g.f23168j != -1) {
                    if (this.f20273g.f23169k > 0) {
                        f = ((float) this.f20278l) / ((float) this.f20273g.f23169k);
                    } else {
                        f = 1.0f;
                    }
                    if (this.f20273g.f23170l > 0) {
                        f2 = ((float) this.f20279m) / ((float) this.f20273g.f23170l);
                    }
                    i3 = ((int) (((float) this.f20273g.f23167i) * f)) - i2;
                    i = (int) (((float) this.f20273g.f23168j) * f2);
                } else if (this.f20273g.f23173o != null && this.f20273g.f23173o.size() > 1) {
                    double d2 = (double) measuredWidth;
                    double doubleValue = this.f20273g.f23173o.get(0).doubleValue();
                    Double.isNaN(d2);
                    i3 = ((int) (d2 * doubleValue)) - i2;
                    double d3 = (double) measuredHeight2;
                    double doubleValue2 = this.f20273g.f23173o.get(1).doubleValue();
                    Double.isNaN(d3);
                    i = (int) (d3 * doubleValue2);
                }
                i5 = i - i4;
            }
            if (i3 < this.f20277k[2]) {
                i3 = this.f20277k[2];
            } else if (i3 + d > this.f20277k[3]) {
                i3 = this.f20277k[3] - d;
            }
            if (i5 < this.f20277k[0]) {
                i5 = this.f20277k[0];
            } else if (i5 + measuredHeight > this.f20277k[1]) {
                i5 = this.f20277k[1] - measuredHeight;
            }
            view.setX((float) i3);
            view.setY((float) i5);
            if (this.f20273g != null) {
                this.f20273g.f23167i = i3 + i2;
                this.f20273g.f23168j = i5 + i4;
            }
            if (this.f20274h && this.f20275i != null) {
                this.f20275i.mo14280d();
            }
            view.setOnClickListener(new View$OnClickListenerC8179g(this, a));
        }
    }

    public C8178f(Context context, C9537au auVar, boolean z, int[] iArr, AbstractC8170a.AbstractC8172a aVar, boolean z2) {
        super(context, auVar, z, iArr, aVar, z2);
    }
}
