package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p2082ss.android.ugc.aweme.shortvideo.View$OnClickListenerC70004cq;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ag */
public final class C73454ag extends View$OnClickListenerC70004cq {

    /* renamed from: f */
    ImageView f165002f;

    /* renamed from: g */
    Bitmap f165003g;

    /* renamed from: h */
    private TextView f165004h;

    static {
        Covode.recordClassIndex(86191);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bitmap bitmap = this.f165003g;
        if (bitmap != null && !bitmap.isRecycled()) {
            bundle.putParcelable("cover_data", this.f165003g);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.shortvideo.View$OnClickListenerC70004cq
    public final void onViewCreated(View view, Bundle bundle) {
        this.f165002f = (ImageView) view.findViewById(R.id.ry);
        this.f156471a = (CircularProgressView) view.findViewById(R.id.bxi);
        this.f156471a.setIndeterminate(false);
        this.f156472b = (TextView) view.findViewById(R.id.d_3);
        C1731i.m5640b(new CallableC73455ah(this, bundle), C1731i.f5562a).mo5534a(new C73456ai(this), C1731i.f5564c, null);
        this.f165004h = (TextView) view.findViewById(R.id.eru);
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.shortvideo.View$OnClickListenerC70004cq
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.a1d, viewGroup, false);
    }
}
