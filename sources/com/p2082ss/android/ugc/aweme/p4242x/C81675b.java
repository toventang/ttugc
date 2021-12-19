package com.p2082ss.android.ugc.aweme.p4242x;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45936a;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.p4242x.C81684c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.utils.C80212ag;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.x.b */
public final class C81675b {

    /* renamed from: a */
    static String f182629a;

    /* renamed from: b */
    static final String f182630b;

    /* renamed from: c */
    public static final C81675b f182631c = new C81675b();

    /* renamed from: com.ss.android.ugc.aweme.x.b$e */
    static final class C81680e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C81680e f182636a = new C81680e();

        static {
            Covode.recordClassIndex(95084);
        }

        C81680e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.x.b$h */
    public static final class C81683h extends AbstractC85556e {
        static {
            Covode.recordClassIndex(95087);
        }

        @Override // com.p2082ss.android.vesdk.runtime.AbstractC85556e
        /* renamed from: a */
        public final String mo56847a() {
            return C70638dj.f158102e;
        }

        C81683h(String str) {
            super(str);
        }
    }

    private C81675b() {
    }

    static {
        Covode.recordClassIndex(95079);
        StringBuilder sb = new StringBuilder();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        f182630b = sb.append(filesDir.getAbsolutePath()).append(File.separator).append("multi_edit").append(File.separator).toString();
    }

    /* renamed from: com.ss.android.ugc.aweme.x.b$f */
    public static final class C81681f implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC88405ad f182637a;

        static {
            Covode.recordClassIndex(95085);
        }

        C81681f(AbstractC88405ad adVar) {
            this.f182637a = adVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
            this.f182637a.mo142931a(new C81684c(null, null));
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            this.f182637a.mo142931a(new C81684c(null, bitmap));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.x.b$c */
    static final class C81678c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C81678c f182634a = new C81678c();

        static {
            Covode.recordClassIndex(95082);
        }

        C81678c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap;
            C81684c cVar = (C81684c) obj;
            C89219l.m154721d(cVar, "");
            if (cVar.f182640a != null || (bitmap = cVar.f182641b) == null || bitmap.isRecycled()) {
                return cVar;
            }
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            File cacheDir = application.getCacheDir();
            C89219l.m154716b(cacheDir, "");
            File a = C89159j.m154651a(cacheDir, String.valueOf(System.currentTimeMillis()) + "_temp.jpg");
            C80212ag.m139040a(bitmap, a, 70, Bitmap.CompressFormat.JPEG);
            return C81684c.C81685a.m141549a(a.getPath());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.x.b$d */
    static final class C81679d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ WeakReference f182635a;

        static {
            Covode.recordClassIndex(95083);
        }

        C81679d(WeakReference weakReference) {
            this.f182635a = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C81684c cVar = (C81684c) obj;
            SmartImageView smartImageView = (SmartImageView) this.f182635a.get();
            if (smartImageView != null && cVar.f182640a != null) {
                if (!TextUtils.isEmpty(cVar.f182640a)) {
                    smartImageView.setImageURI(Uri.fromFile(new File(cVar.f182640a)).toString());
                }
                C20745e.C20746a aVar = new C20745e.C20746a();
                aVar.f48961e = C30745b.m63132b(smartImageView.getContext(), 8.0f);
                smartImageView.setCircleOptions(aVar.mo34169a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.x.b$b */
    static final class C81677b<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ WeakReference f182633a;

        static {
            Covode.recordClassIndex(95081);
        }

        C81677b(WeakReference weakReference) {
            this.f182633a = weakReference;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<C81684c> adVar) {
            int i;
            Integer valueOf;
            MethodCollector.m26663i(4590);
            C89219l.m154721d(adVar, "");
            int d = C71833a.m126855d();
            if (d == 0 || d == 3) {
                VERecordData a = VERecordData.m146578a((AbstractC85556e) new C81683h(""), false);
                C89219l.m154716b(a, "");
                VEUtils.getVideoFrames(a.f190794b.get(0).f190798a, new int[]{0}, new C81682g(adVar));
                MethodCollector.m26664o(4590);
                return;
            }
            WeakReference weakReference = this.f182633a;
            C43223c b = C63238c.f143565C.mo73276d().mo101833b();
            if (b == null) {
                adVar.mo142933b(new NullPointerException());
                MethodCollector.m26664o(4590);
                return;
            }
            new C70974bn("CheckPointServiceImpl");
            VideoPublishEditModel a2 = C70974bn.m125289a(b);
            C89219l.m154716b(a2, "");
            if (a2.isDuet()) {
                MultiEditVideoRecordData curMultiEditVideoRecordData = a2.getCurMultiEditVideoRecordData();
                C89219l.m154716b(curMultiEditVideoRecordData, "");
                VERecordData a3 = C71493a.m126273a(curMultiEditVideoRecordData);
                MultiEditVideoRecordData curMultiEditVideoRecordData2 = a2.getCurMultiEditVideoRecordData();
                C89219l.m154716b(curMultiEditVideoRecordData2, "");
                Pair<Integer, Integer> playInOutTime = curMultiEditVideoRecordData2.getPlayInOutTime();
                a3.mo130356a(((Number) playInOutTime.first).longValue() * 1000, 1000 * ((Number) playInOutTime.second).longValue());
                int i2 = (int) (a2.mVideoCoverStartTm * 1000.0f);
                if (a2.isUseTimeReverseEffect()) {
                    int intValue = ((Number) playInOutTime.second).intValue();
                    Object obj = playInOutTime.first;
                    C89219l.m154716b(obj, "");
                    i = (intValue - ((Number) obj).intValue()) - i2;
                } else {
                    i = i2;
                }
                SmartImageView smartImageView = (SmartImageView) weakReference.get();
                if (!(smartImageView == null || (valueOf = Integer.valueOf(smartImageView.getWidth())) == null)) {
                    VEUtils.getVideoThumb(a3, i, valueOf.intValue(), (int) (((float) valueOf.intValue()) / ((((float) a2.videoWidth()) * 1.0f) / ((float) a2.videoHeight()))), false, new C81676a(a2));
                    String str = a2.multiEditVideoRecordData.coverImagePath;
                    if (str != null) {
                        adVar.mo142931a(C81684c.C81685a.m141549a(str));
                        MethodCollector.m26664o(4590);
                        return;
                    }
                }
                adVar.mo142933b(new NullPointerException());
                MethodCollector.m26664o(4590);
            } else if (a2.isMvThemeVideoType()) {
                if (TextUtils.isEmpty(a2.mvCreateVideoData.videoCoverImgPath) || !C84902i.m145892a(a2.mvCreateVideoData.videoCoverImgPath)) {
                    a2.mvCreateVideoData.videoCoverImgPath = C63253l.f143623a.mo73308d().mo101651a().mo101653a();
                    Bitmap decodeFile = BitmapFactory.decodeFile(a2.mvCreateVideoData.selectMediaList.get(0));
                    if (decodeFile != null && (true ^ decodeFile.isRecycled())) {
                        C80212ag.m139040a(C45936a.m88694a(a2.getCoverPublishModel(), decodeFile), new File(a2.mvCreateVideoData.videoCoverImgPath), 70, Bitmap.CompressFormat.JPEG);
                    }
                }
                adVar.mo142931a(C81684c.C81685a.m141549a(a2.mvCreateVideoData.videoCoverImgPath));
                MethodCollector.m26664o(4590);
            } else {
                C43225d.m86327a(b, null, new C81681f(adVar));
                MethodCollector.m26664o(4590);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.x.b$a */
    static final class C81676a implements AbstractC85304ab {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f182632a;

        static {
            Covode.recordClassIndex(95080);
        }

        C81676a(VideoPublishEditModel videoPublishEditModel) {
            this.f182632a = videoPublishEditModel;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            MethodCollector.m26663i(6361);
            C89219l.m154721d(byteBuffer, "");
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            EffectTextModel effectTextModel = this.f182632a.getCoverPublishModel().getEffectTextModel();
            C89219l.m154716b(createBitmap, "");
            Bitmap mergeCoverText = effectTextModel.mergeCoverText(createBitmap);
            if (TextUtils.isEmpty(this.f182632a.multiEditVideoRecordData.coverImagePath)) {
                this.f182632a.multiEditVideoRecordData.coverImagePath = C71429d.m126154a();
            }
            C80212ag.m139040a(mergeCoverText, new File(this.f182632a.multiEditVideoRecordData.coverImagePath), 70, Bitmap.CompressFormat.JPEG);
            MethodCollector.m26664o(6361);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.x.b$g */
    static final class C81682g implements AbstractC85304ab {

        /* renamed from: a */
        final /* synthetic */ AbstractC88405ad f182638a;

        static {
            Covode.recordClassIndex(95086);
        }

        C81682g(AbstractC88405ad adVar) {
            this.f182638a = adVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            MethodCollector.m26663i(7843);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
            if (!C80720e.m139927b(C81675b.f182630b)) {
                new File(C81675b.f182630b).mkdirs();
            }
            C81675b.f182629a = C81675b.f182630b + System.currentTimeMillis() + "_cover_img.jpg";
            C80212ag.m139040a(createBitmap, new File(C81675b.f182629a), 70, Bitmap.CompressFormat.JPEG);
            C81684c.C81685a.m141549a(C81675b.f182629a);
            this.f182638a.mo142931a(C81684c.C81685a.m141549a(C81675b.f182629a));
            MethodCollector.m26664o(7843);
            return false;
        }
    }
}
