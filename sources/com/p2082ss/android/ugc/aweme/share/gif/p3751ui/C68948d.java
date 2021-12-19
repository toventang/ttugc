package com.p2082ss.android.ugc.aweme.share.gif.p3751ui;

import android.content.Intent;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileOutputStream;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.d */
final /* synthetic */ class C68948d implements IAVTransformService.ITransformCallback {

    /* renamed from: a */
    private final VideoShare2GifEditActivity f154252a;

    /* renamed from: b */
    private final ProgressDialogC74145d f154253b;

    static {
        Covode.recordClassIndex(81260);
    }

    C68948d(VideoShare2GifEditActivity videoShare2GifEditActivity, ProgressDialogC74145d dVar) {
        this.f154252a = videoShare2GifEditActivity;
        this.f154253b = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback
    public final void finish(Object obj) {
        MethodCollector.m26663i(6311);
        VideoShare2GifEditActivity videoShare2GifEditActivity = this.f154252a;
        ProgressDialogC74145d dVar = this.f154253b;
        videoShare2GifEditActivity.f154240a = true;
        dVar.dismiss();
        if (((Boolean) obj).booleanValue()) {
            File file = new File(videoShare2GifEditActivity.f154241b.f154196e);
            C89219l.m154721d(file, "");
            C89219l.m154721d(videoShare2GifEditActivity, "");
            try {
                ParcelFileDescriptor openFileDescriptor = C17867d.m33078a().getContentResolver().openFileDescriptor(C1757e.m5903a(videoShare2GifEditActivity, file.getName(), "image/gif", Environment.DIRECTORY_PICTURES + "/tiktok/"), "w");
                if (openFileDescriptor != null) {
                    C1756d.m5893a(file, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                }
            } catch (Throwable unused) {
            }
            VideoShare2GifEditContext videoShare2GifEditContext = videoShare2GifEditActivity.f154241b;
            Intent intent = new Intent(videoShare2GifEditActivity, VideoShare2GifPreviewActivity.class);
            intent.putExtra("extra_data", videoShare2GifEditContext);
            videoShare2GifEditActivity.startActivityForResult(intent, 1);
            MethodCollector.m26664o(6311);
            return;
        }
        videoShare2GifEditActivity.f154241b.f154196e = null;
        new C79459a(videoShare2GifEditActivity).mo123052a(videoShare2GifEditActivity.getString(R.string.c3e)).mo123053a();
        MethodCollector.m26664o(6311);
    }
}
