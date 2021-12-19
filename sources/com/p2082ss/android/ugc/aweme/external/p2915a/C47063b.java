package com.p2082ss.android.ugc.aweme.external.p2915a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.external.p2915a.C47092e;
import com.p2082ss.android.ugc.aweme.mediachoose.C59156b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70503u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.video.C88168aj;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.a.b */
public final class C47063b implements IAVInfoService {
    static {
        Covode.recordClassIndex(55667);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$d */
    static final class C47067d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVInfoService.IGetInfoCallback f109627a;

        static {
            Covode.recordClassIndex(55671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47067d(IAVInfoService.IGetInfoCallback iGetInfoCallback) {
            super(0);
            this.f109627a = iGetInfoCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f109627a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(-3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$f */
    static final class C47069f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVInfoService.IGetInfoCallback f109630a;

        static {
            Covode.recordClassIndex(55673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47069f(IAVInfoService.IGetInfoCallback iGetInfoCallback) {
            super(0);
            this.f109630a = iGetInfoCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f109630a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(-3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$h */
    static final class C47072h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVInfoService.IGetInfoCallback f109634a;

        static {
            Covode.recordClassIndex(55676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47072h(IAVInfoService.IGetInfoCallback iGetInfoCallback) {
            super(0);
            this.f109634a = iGetInfoCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f109634a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(null);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$i */
    static final class C47073i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f109635a;

        /* renamed from: b */
        final /* synthetic */ int[] f109636b;

        /* renamed from: c */
        final /* synthetic */ AbstractC85304ab f109637c;

        static {
            Covode.recordClassIndex(55677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47073i(String str, int[] iArr, AbstractC85304ab abVar) {
            super(0);
            this.f109635a = str;
            this.f109636b = iArr;
            this.f109637c = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            VEUtils.getVideoFrames(this.f109635a, this.f109636b, this.f109637c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$a */
    static final class C47064a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f109616a;

        /* renamed from: b */
        final /* synthetic */ String f109617b;

        /* renamed from: c */
        final /* synthetic */ boolean f109618c;

        /* renamed from: d */
        final /* synthetic */ int f109619d;

        /* renamed from: e */
        final /* synthetic */ int f109620e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89183m f109621f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89188r f109622g;

        static {
            Covode.recordClassIndex(55668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47064a(Context context, String str, boolean z, int i, int i2, AbstractC89183m mVar, AbstractC89188r rVar) {
            super(0);
            this.f109616a = context;
            this.f109617b = str;
            this.f109618c = z;
            this.f109619d = i;
            this.f109620e = i2;
            this.f109621f = mVar;
            this.f109622g = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            new C59156b(this.f109616a).isVideoLengthOrTypeSupportedAndShowErrToast(this.f109617b, this.f109618c, this.f109619d, this.f109620e, this.f109621f, this.f109622g);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$b */
    static final class C47065b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89188r f109623a;

        static {
            Covode.recordClassIndex(55669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47065b(AbstractC89188r rVar) {
            super(0);
            this.f109623a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f109623a.mo8774a("", 0L, -10086, "decompress failed");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$e */
    static final class C47068e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVInfoService.IGetInfoCallback f109628a;

        /* renamed from: b */
        final /* synthetic */ String f109629b;

        static {
            Covode.recordClassIndex(55672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47068e(IAVInfoService.IGetInfoCallback iGetInfoCallback, String str) {
            super(0);
            this.f109628a = iGetInfoCallback;
            this.f109629b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f109628a;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(Integer.valueOf(VEUtils.checkMp3File(this.f109629b)));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$g */
    static final class C47070g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43223c f109631a;

        /* renamed from: b */
        final /* synthetic */ IAVInfoService.IGetInfoCallback f109632b;

        static {
            Covode.recordClassIndex(55674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47070g(C43223c cVar, IAVInfoService.IGetInfoCallback iGetInfoCallback) {
            super(0);
            this.f109631a = cVar;
            this.f109632b = iGetInfoCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            new VideoCoverServiceImpl().getVideoCoverByCallback(this.f109631a, new IEffectService.OnVideoCoverCallback(this) {
                /* class com.p2082ss.android.ugc.aweme.external.p2915a.C47063b.C47070g.C470711 */

                /* renamed from: a */
                final /* synthetic */ C47070g f109633a;

                static {
                    Covode.recordClassIndex(55675);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f109633a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i) {
                    IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f109633a.f109632b;
                    if (iGetInfoCallback != null) {
                        iGetInfoCallback.finish(null);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    C89219l.m154721d(bitmap, "");
                    IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f109633a.f109632b;
                    if (iGetInfoCallback != null) {
                        iGetInfoCallback.finish(bitmap);
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$c */
    static final class C47066c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f109624a;

        /* renamed from: b */
        final /* synthetic */ IAVInfoService.IGetInfoCallback f109625b;

        /* renamed from: c */
        final /* synthetic */ Context f109626c;

        static {
            Covode.recordClassIndex(55670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47066c(String str, IAVInfoService.IGetInfoCallback iGetInfoCallback, Context context) {
            super(0);
            this.f109624a = str;
            this.f109625b = iGetInfoCallback;
            this.f109626c = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            if (C69823b.m123387a(this.f109624a)) {
                IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f109625b;
                if (iGetInfoCallback != null) {
                    iGetInfoCallback.finish(Integer.valueOf(VEUtils.checkMp3File(this.f109624a)));
                }
            } else {
                IAVInfoService.IGetInfoCallback iGetInfoCallback2 = this.f109625b;
                if (iGetInfoCallback2 != null) {
                    if (C69823b.m123388a(this.f109624a, this.f109626c)) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iGetInfoCallback2.finish(Integer.valueOf(i));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$k */
    static final class C47075k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVInfoService.IGetInfoCallback f109639a;

        /* renamed from: b */
        final /* synthetic */ String f109640b;

        /* renamed from: c */
        final /* synthetic */ boolean f109641c;

        static {
            Covode.recordClassIndex(55679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47075k(IAVInfoService.IGetInfoCallback iGetInfoCallback, String str, boolean z) {
            super(0);
            this.f109639a = iGetInfoCallback;
            this.f109640b = str;
            this.f109641c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f109639a;
            String str = this.f109640b;
            boolean z = this.f109641c;
            C89219l.m154721d(str, "");
            C63244g.m114602a().mo73293u();
            int[] iArr = new int[11];
            if (z) {
                VEUtils.VEVideoFileInfo a = C70503u.m124367a(str);
                if (a != null) {
                    iArr[0] = a.width;
                    iArr[1] = a.height;
                    iArr[2] = a.rotation;
                    iArr[3] = a.rotation;
                    iArr[4] = 0;
                    iArr[5] = 0;
                    iArr[6] = a.bitrate;
                    iArr[7] = a.fps;
                    iArr[8] = a.codec;
                    iArr[9] = a.keyFrameCount;
                    iArr[10] = a.maxDuration;
                }
            } else {
                C88168aj.m153237a(str);
            }
            iGetInfoCallback.finish(iArr);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final int[] photoInfo(String str) {
        int[] iArr;
        C89219l.m154721d(str, "");
        if (!C84902i.m145892a(str)) {
            iArr = new int[]{0, 0};
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C84896h.m145856a(str, options);
            iArr = new int[]{options.outWidth, options.outHeight};
        }
        C89219l.m154716b(iArr, "");
        return iArr;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(List<String> list, IAVInfoService.IGetInfoCallback<List<Integer>> iGetInfoCallback) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(Integer.valueOf(VEUtils.checkAudioFile(str)));
        }
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(arrayList);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoCover(C43223c cVar, IAVInfoService.IGetInfoCallback<Bitmap> iGetInfoCallback) {
        C89219l.m154721d(cVar, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = false;
        C47092e.C47093a a = aVar.mo79415a(new C47070g(cVar, iGetInfoCallback));
        a.f109673a = new C47072h(iGetInfoCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void mp3Legal(String str, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        C89219l.m154721d(str, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = false;
        C47092e.C47093a a = aVar.mo79415a(new C47068e(iGetInfoCallback, str));
        a.f109673a = new C47069f(iGetInfoCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(String str, int i, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        C89219l.m154721d(str, "");
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(Integer.valueOf(VEUtils.checkAudioFile(str)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoInfo(String str, boolean z, IAVInfoService.IGetInfoCallback<int[]> iGetInfoCallback) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iGetInfoCallback, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = false;
        aVar.mo79415a(new C47075k(iGetInfoCallback, str, z)).mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void mp3Legal(Context context, String str, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = false;
        C47092e.C47093a a = aVar.mo79415a(new C47066c(str, iGetInfoCallback, context));
        a.f109673a = new C47067d(iGetInfoCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoFrame(String str, int[] iArr, IAVInfoService.VEFrameAvailableListener vEFrameAvailableListener) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(vEFrameAvailableListener, "");
        C47074j jVar = new C47074j(vEFrameAvailableListener);
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = true;
        aVar.mo79415a(new C47073i(str, iArr, jVar)).mo79416a();
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$j */
    static final class C47074j implements AbstractC85304ab {

        /* renamed from: a */
        final /* synthetic */ IAVInfoService.VEFrameAvailableListener f109638a;

        static {
            Covode.recordClassIndex(55678);
        }

        C47074j(IAVInfoService.VEFrameAvailableListener vEFrameAvailableListener) {
            this.f109638a = vEFrameAvailableListener;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            return this.f109638a.processFrame(byteBuffer, i, i2, i3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(Context context, List<? extends MusicModel> list, IAVInfoService.IFilterMedia<Integer> iFilterMedia, IAVInfoService.IGetInfoCallback<List<MusicModel>> iGetInfoCallback) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(iFilterMedia, "");
        ArrayList arrayList = new ArrayList();
        for (MusicModel musicModel : list) {
            if (C69823b.m123388a(musicModel.getLocalPath(), context) && iFilterMedia.filter(Integer.valueOf(list.indexOf(musicModel)))) {
                arrayList.add(musicModel);
            }
        }
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(arrayList);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void importLegal(Context context, String str, boolean z, int i, int i2, AbstractC89183m<? super String, ? super Long, C89391z> mVar, AbstractC89188r<? super String, ? super Long, ? super Integer, ? super String, C89391z> rVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(rVar, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = true;
        C47092e.C47093a a = aVar.mo79415a(new C47064a(context, str, z, i, i2, mVar, rVar));
        a.f109673a = new C47065b(rVar);
        a.mo79416a();
    }
}
