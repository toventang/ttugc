package com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.C15531c;
import com.bytedance.hybrid.spark.SparkContext;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.b */
public final class C66421b {

    /* renamed from: a */
    AbstractC66422a f149323a;

    /* renamed from: b */
    C66436i f149324b;

    /* renamed from: c */
    private QrCodeScanService f149325c = QrCodeScanImpl.m118122b();

    /* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.b$a */
    public interface AbstractC66422a {
        static {
            Covode.recordClassIndex(77956);
        }
    }

    static {
        Covode.recordClassIndex(77955);
    }

    public C66421b(AbstractC66422a aVar) {
        this.f149323a = aVar;
    }

    /* renamed from: a */
    public final void mo105347a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            String a = this.f149325c.mo105337a(str);
            if (context != null) {
                QrCodeScanImpl.m118122b();
                if (TextUtils.equals(Uri.parse(a).getQueryParameter("use_spark"), "1")) {
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.mo25238a(a);
                    C15531c.C15532a.m28665a(context, sparkContext).mo25316a();
                    return;
                }
                Intent intent = new Intent(context, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                bundle.putBoolean("show_not_official_content_warning", false);
                bundle.putBoolean("hide_nav_bar", false);
                bundle.putBoolean("use_webview_title", true);
                bundle.putBoolean("safeTemplate", true);
                intent.putExtra("hide_more", false);
                intent.putExtra("enter_from", "qr_code");
                intent.putExtra("need_sec_link", true);
                intent.putExtra("sec_link_scene", "qrcode");
                intent.putExtra("need_detect_2_jump", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(a));
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
            }
        }
    }
}
