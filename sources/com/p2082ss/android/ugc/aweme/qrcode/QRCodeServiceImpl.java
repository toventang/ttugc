package com.p2082ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.qrcode.p3656e.C66405g;
import com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.QRCodeServiceImpl */
public final class QRCodeServiceImpl implements IQRCodeService {
    static {
        Covode.recordClassIndex(77888);
    }

    /* renamed from: a */
    public static IQRCodeService m118047a() {
        MethodCollector.m26663i(1288);
        Object a = C81908b.m141854a(IQRCodeService.class, false);
        if (a != null) {
            IQRCodeService iQRCodeService = (IQRCodeService) a;
            MethodCollector.m26664o(1288);
            return iQRCodeService;
        }
        if (C81908b.f183332dc == null) {
            synchronized (IQRCodeService.class) {
                try {
                    if (C81908b.f183332dc == null) {
                        C81908b.f183332dc = new QRCodeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1288);
                    throw th;
                }
            }
        }
        QRCodeServiceImpl qRCodeServiceImpl = (QRCodeServiceImpl) C81908b.f183332dc;
        MethodCollector.m26664o(1288);
        return qRCodeServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.IQRCodeService
    /* renamed from: a */
    public final int mo105288a(String str) {
        return C66375c.m118064a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.IQRCodeService
    /* renamed from: a */
    public final void mo105290a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            context.sendBroadcast(intent);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.IQRCodeService
    /* renamed from: a */
    public final void mo105291a(Context context, boolean z, boolean z2) {
        C89219l.m154721d(context, "");
        QRCodePermissionActivity.m118195a(context, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.IQRCodeService
    /* renamed from: a */
    public final C66372b mo105289a(View view, String str, boolean z) {
        String str2;
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        if (!z) {
            return new C66372b(C66405g.m118107a(view, str, view.getContext()), null, z);
        }
        String g = C73955am.m130077g(view.getContext());
        Bitmap a = C66405g.m118106a(view);
        if (a != null) {
            view.setDrawingCacheEnabled(false);
            if (BitmapUtils.saveBitmapToSD(a, g, str)) {
                str2 = g + "/" + str;
                return new C66372b(null, str2, z);
            }
        }
        str2 = null;
        return new C66372b(null, str2, z);
    }
}
