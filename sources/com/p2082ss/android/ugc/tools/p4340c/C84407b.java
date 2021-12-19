package com.p2082ss.android.ugc.tools.p4340c;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.c.b */
public final class C84407b {
    static {
        Covode.recordClassIndex(98372);
    }

    /* renamed from: a */
    private static void m145192a(SimpleDraweeView simpleDraweeView, C24636b[] bVarArr) {
        if (bVarArr == null) {
            C84402a.m145165a(simpleDraweeView, (int) R.drawable.bnp);
            return;
        }
        C24185e b = C24182c.m45843b();
        b.f57309m = simpleDraweeView.getController();
        b.f57306j = true;
        simpleDraweeView.setController(b.mo39823a(bVarArr).mo39827e());
    }

    /* renamed from: a */
    private static C24636b[] m145193a(String str, Bitmap.Config config) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        imageDecodeOptionsBuilder.mo40153a(1);
        imageDecodeOptionsBuilder.f57756e = false;
        C24361b bVar = new C24361b(imageDecodeOptionsBuilder);
        C24639c a = C24639c.m47149a(Uri.parse(str));
        a.f58555f = bVar;
        return new C24636b[]{a.mo40483a()};
    }

    /* renamed from: a */
    public static void m145190a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, Bitmap.Config config) {
        m145192a(simpleDraweeView, C84402a.m145180a(urlModel, (C24363d) null, EnumC24362c.MEDIUM, (AbstractC24641d) null, config));
    }

    /* renamed from: a */
    public static void m145191a(SimpleDraweeView simpleDraweeView, String str, Bitmap.Config config) {
        if (simpleDraweeView != null) {
            C24636b[] bVarArr = null;
            if (!TextUtils.isEmpty(str)) {
                bVarArr = m145193a(str, config);
            }
            m145192a(simpleDraweeView, bVarArr);
        }
    }
}
