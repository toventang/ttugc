package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e */
public final class C72867e {

    /* renamed from: a */
    public static final String f163497a = C63244g.m114602a().mo73279g().mo69470c().mo69479e("save-photo");

    /* renamed from: b */
    public static final C72867e f163498b = new C72867e();

    /* renamed from: c */
    private static final String f163499c = C63244g.m114602a().mo73279g().mo69470c().mo69475a("EffectCapturedPhoto");

    private C72867e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e$a */
    public static final class CallableC72868a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f163500a;

        static {
            Covode.recordClassIndex(85560);
        }

        CallableC72868a(String str) {
            this.f163500a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                C84902i.m145886a(new File(this.f163500a));
            } catch (Exception e) {
                C63244g.m114602a().mo73263I().mo101637a((Throwable) e);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m128685a() {
        File file = new File(f163497a);
        if (!file.exists()) {
            file.mkdirs();
        }
        String path = file.getPath();
        C89219l.m154716b(path, "");
        return path;
    }

    static {
        Covode.recordClassIndex(85559);
    }

    /* renamed from: b */
    public static final void m128688b(String str) {
        if (!TextUtils.isEmpty(str)) {
            m128690d(f163499c + str);
        }
    }

    /* renamed from: d */
    public static final void m128690d(String str) {
        if (!TextUtils.isEmpty(str)) {
            C1731i.m5640b(new CallableC72868a(str), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public static String m128686a(String str) {
        if (TextUtils.isEmpty(str)) {
            return f163499c;
        }
        return f163499c + File.separator + str;
    }

    /* renamed from: c */
    public static String m128689c(String str) {
        C89219l.m154721d(str, "");
        String path = new File(m128685a(), str + "_watermark.png").getPath();
        C89219l.m154716b(path, "");
        return path;
    }

    /* renamed from: a */
    public static void m128687a(HashSet<String> hashSet, C43223c cVar) {
        ArrayList<TimeSpeedModelExtension> a;
        C89219l.m154721d(hashSet, "");
        C89219l.m154721d(cVar, "");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = cVar.f100900W.f100817ax;
        if (C13617h.m24466b(multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.editCutSegments : null)) {
            a = cVar.f100900W.f100817ax.editCutSegments;
        } else {
            a = CameraComponentModel.m123137a(cVar.f100888K);
        }
        if (a != null) {
            for (T t : a) {
                SavePhotoStickerInfo savePhotoStickerInfo = t.getSavePhotoStickerInfo();
                if (!C84904k.m145909a(savePhotoStickerInfo != null ? savePhotoStickerInfo.getCapturedPhotoPaths() : null)) {
                    String stickerId = t.getStickerId();
                    C89219l.m154716b(stickerId, "");
                    String c = m128689c(stickerId);
                    if (!TextUtils.isEmpty(c)) {
                        hashSet.add(c);
                    }
                }
            }
        }
    }
}
