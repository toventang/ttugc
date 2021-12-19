package com.p2082ss.android.ugc.aweme.shortvideo.p3875u;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.jni.EffectThumb;
import com.p2082ss.android.medialib.model.CoverInfo;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.u.b */
public final /* synthetic */ class CallableC73299b implements Callable {

    /* renamed from: a */
    private final boolean f164608a;

    /* renamed from: b */
    private final EditVideoSegment f164609b;

    /* renamed from: c */
    private final EffectThumb f164610c;

    /* renamed from: d */
    private final String f164611d;

    /* renamed from: e */
    private final IEffectService.OnVideoCoverCallback f164612e;

    static {
        Covode.recordClassIndex(86018);
    }

    CallableC73299b(boolean z, EditVideoSegment editVideoSegment, EffectThumb effectThumb, String str, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        this.f164608a = z;
        this.f164609b = editVideoSegment;
        this.f164610c = effectThumb;
        this.f164611d = str;
        this.f164612e = onVideoCoverCallback;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        Bitmap bitmap;
        MethodCollector.m26663i(11020);
        boolean z = this.f164608a;
        EditVideoSegment editVideoSegment = this.f164609b;
        EffectThumb effectThumb = this.f164610c;
        String str = this.f164611d;
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.f164612e;
        if (!z) {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(editVideoSegment.getVideoPath());
            if (videoFileInfo == null) {
                i = 0;
            } else {
                i = videoFileInfo.rotation;
            }
            if (editVideoSegment.getVideoCutInfo() != null) {
                i += editVideoSegment.getVideoCutInfo().getRotate();
            }
        } else {
            i = 0;
        }
        CoverInfo thumb = effectThumb.getThumb(0);
        if (thumb == null || thumb.getData() == null) {
            bitmap = null;
        } else {
            bitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Bitmap.Config.ARGB_8888);
            if (i > 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        }
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            C84891c.m145848a(bitmap, new File(str), 60, Bitmap.CompressFormat.PNG);
        }
        C40984s.m82525a(new RunnableC73301d(onVideoCoverCallback, bitmap));
        effectThumb.stopRender();
        MethodCollector.m26664o(11020);
        return null;
    }
}
