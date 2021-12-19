package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46720aw;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.qrcode.C66417l;
import com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.e */
public final class C22777e extends AbstractC22773c {

    /* renamed from: a */
    public ImageView f53791a;

    /* renamed from: b */
    private AbstractC22772b f53792b;

    static {
        Covode.recordClassIndex(26673);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: c */
    public final int mo37087c() {
        return 8388629;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final boolean mo37085a() {
        return C66417l.C66418a.f149322a.mo105336a().booleanValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: b */
    public final View mo37086b() {
        MethodCollector.m26663i(14167);
        if (C46720aw.m90103b()) {
            ImageView b = HomePageUIFrameServiceImpl.m108627e().mo89384b(this.f53792b.getActivity());
            this.f53791a = b;
            ViewGroup viewGroup = (ViewGroup) b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f53791a);
            }
        } else {
            this.f53791a = HomePageUIFrameServiceImpl.m108627e().mo89392d(this.f53792b.getActivity());
        }
        ImageView imageView = this.f53791a;
        MethodCollector.m26664o(14167);
        return imageView;
    }

    public C22777e(AbstractC22772b bVar) {
        this.f53792b = bVar;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final void mo37084a(View view) {
        C39162r.m79460a("qr_code_scan_enter", new C33744d().mo59983a("enter_from", "homepage_hot").f79943a);
        ActivityC0945e activity = this.f53792b.getActivity();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - QRCodePermissionActivity.f149372c >= 1000) {
            QRCodePermissionActivity.f149372c = currentTimeMillis;
            Intent intent = new Intent(activity, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", false);
            QRCodePermissionActivity.m118194a(activity, intent);
        }
    }
}
