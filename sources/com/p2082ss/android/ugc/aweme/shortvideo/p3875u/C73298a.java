package com.p2082ss.android.ugc.aweme.shortvideo.p3875u;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.jni.EffectThumb;
import com.p2082ss.android.medialib.player.EffectConfig;
import com.p2082ss.android.ugc.aweme.effect.C46357g;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;
import p4600h.C89386u;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.u.a */
public final class C73298a {

    /* renamed from: a */
    private static final ExecutorService f164607a;

    static {
        Covode.recordClassIndex(86017);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95504b = "EffectVideoCover";
        a.f95505c = 3;
        f164607a = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static void m129355a(Bitmap bitmap, String str) {
        C1731i.m5640b(new CallableC73300c(str, bitmap), f164607a);
    }

    /* renamed from: a */
    public static void m129356a(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        m129357a(list, str, f, i, z, editPreviewInfo, null, onVideoCoverCallback);
    }

    /* renamed from: a */
    public static void m129357a(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, String str2, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        EffectThumb effectThumb = new EffectThumb();
        C89386u<EditVideoSegment, Long, long[]> a = C71413b.m126119a(editPreviewInfo, z, (long) i);
        EditVideoSegment first = a.getFirst();
        if (effectThumb.init(first.getVideoPath()) < 0) {
            if (onVideoCoverCallback != null) {
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
            }
            effectThumb.stopRender();
            return;
        }
        EffectConfig filter = C46357g.m89428a(list, first.getVideoCutInfo(), z, a.getThird()).setFilter(str);
        if (f != -1.0f) {
            filter.setFilterIntensity(f);
        }
        int width = first.getVideoFileInfo().getWidth();
        if (width <= 0 || width >= 256) {
            width = 256;
        }
        effectThumb.renderVideo(new long[]{a.getSecond().longValue()}, filter, width, width);
        C1731i.m5640b(new CallableC73299b(z, first, effectThumb, str2, onVideoCoverCallback), f164607a);
    }
}
