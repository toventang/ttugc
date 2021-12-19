package com.p2082ss.android.ugc.aweme.story.edit.model;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.story.base.p4021b.C76615b;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.video.VEPreviewParams;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p077b.C1731i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.model.a */
public final class C77148a {
    static {
        Covode.recordClassIndex(90156);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.a$d */
    public static final class C77153d implements AbstractC85304ab {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f173077a;

        static {
            Covode.recordClassIndex(90161);
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.model.a$d$a */
        static final class CallableC77154a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C77153d f173078a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f173079b;

            static {
                Covode.recordClassIndex(90162);
            }

            CallableC77154a(C77153d dVar, Bitmap bitmap) {
                this.f173078a = dVar;
                this.f173079b = bitmap;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f173078a.f173077a.invoke(this.f173079b);
                return C89391z.f203057a;
            }
        }

        C77153d(AbstractC89172b bVar) {
            this.f173077a = bVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            MethodCollector.m26663i(6716);
            if (byteBuffer == null) {
                this.f173077a.invoke(null);
                MethodCollector.m26664o(6716);
                return false;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            C1731i.m5640b(new CallableC77154a(this, createBitmap), C1731i.f5564c);
            MethodCollector.m26664o(6716);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.a$c */
    public static final class C77151c<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f173074a;

        static {
            Covode.recordClassIndex(90159);
        }

        C77151c(AbstractC89172b bVar) {
            this.f173074a = bVar;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            final Bitmap bitmap = (Bitmap) obj;
            C31098f.m64301a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.model.C77148a.C77151c.C771521 */

                /* renamed from: a */
                final /* synthetic */ C77151c f173075a;

                static {
                    Covode.recordClassIndex(90160);
                }

                {
                    this.f173075a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ C89391z invoke() {
                    this.f173075a.f173074a.invoke(bitmap);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: a */
    public static final String m134751a(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        return C76615b.m134199a(storyEditClipModel.getSessionId(), null);
    }

    /* renamed from: e */
    public static final boolean m134760e(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        if (storyEditClipModel.getSourceContentType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m134755b(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        return C71413b.m126113a(storyEditClipModel.getPreviewMediaInfo(), storyEditClipModel.isFastImport(), false, false);
    }

    /* renamed from: c */
    public static final int m134757c(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        return C71413b.m126123b(storyEditClipModel.getPreviewMediaInfo(), storyEditClipModel.isFastImport(), false, false);
    }

    /* renamed from: d */
    public static final boolean m134759d(StoryEditClipModel storyEditClipModel) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        C89219l.m154721d(storyEditClipModel, "");
        if (storyEditClipModel.getInfoStickerModel() == null || (infoStickerModel = storyEditClipModel.getInfoStickerModel()) == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m134761f(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        if (storyEditClipModel.getVoiceVolume() == 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m134763h(StoryEditClipModel storyEditClipModel) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        C89219l.m154721d(storyEditClipModel, "");
        if (storyEditClipModel.getInfoStickerModel() == null || (infoStickerModel = storyEditClipModel.getInfoStickerModel()) == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m134765j(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        ArrayList<EffectPointModel> effectList = storyEditClipModel.getEffectList();
        if (effectList == null || effectList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.a$a */
    static final class C77149a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f173070a;

        /* renamed from: b */
        final /* synthetic */ StoryEditModel f173071b;

        static {
            Covode.recordClassIndex(90157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77149a(StoryEditModel storyEditModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f173071b = storyEditModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C77149a(this.f173071b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C77149a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f173070a == 0) {
                C89382r.m154942a(obj);
                for (T t : this.f173071b.getClips()) {
                    C89219l.m154721d(t, "");
                    AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C77150b(t, null), 2);
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.a$b */
    public static final class C77150b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f173072a;

        /* renamed from: b */
        final /* synthetic */ StoryEditClipModel f173073b;

        static {
            Covode.recordClassIndex(90158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77150b(StoryEditClipModel storyEditClipModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f173073b = storyEditClipModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C77150b(this.f173073b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C77150b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f173072a == 0) {
                C89382r.m154942a(obj);
                C77148a.m134764i(this.f173073b);
                StoryEditClipModel storyEditClipModel = this.f173073b;
                C89219l.m154721d(storyEditClipModel, "");
                Iterator<T> it = storyEditClipModel.getCacheFileList().iterator();
                while (it.hasNext()) {
                    C84902i.m145896b((String) it.next());
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    public static final boolean m134756b(StoryEditModel storyEditModel) {
        C89219l.m154721d(storyEditModel, "");
        List<StoryEditClipModel> clips = storyEditModel.getClips();
        if ((clips instanceof Collection) && clips.isEmpty()) {
            return false;
        }
        Iterator<T> it = clips.iterator();
        while (it.hasNext()) {
            if (m134765j(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final void m134758c(StoryEditModel storyEditModel) {
        C89219l.m154721d(storyEditModel, "");
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C77149a(storyEditModel, null), 2);
    }

    /* renamed from: g */
    public static final String m134762g(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        return new StringBuilder().append(m134755b(storyEditClipModel)).append('*').append(m134757c(storyEditClipModel)).toString();
    }

    /* renamed from: i */
    public static final void m134764i(StoryEditClipModel storyEditClipModel) {
        C89219l.m154721d(storyEditClipModel, "");
        HashMap<String, String> stickerCacheDirMap = storyEditClipModel.getStickerCacheDirMap();
        if ((!stickerCacheDirMap.isEmpty()) && stickerCacheDirMap != null) {
            Collection<String> values = new HashMap(stickerCacheDirMap).values();
            C89219l.m154716b(values, "");
            for (String str : values) {
                C84902i.m145886a(new File(str));
            }
        }
    }

    /* renamed from: a */
    private static final String m134752a(String str) {
        Uri uri;
        boolean z;
        String str2 = null;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            uri = Uri.fromFile(new File(str));
        }
        return String.valueOf(uri);
    }

    /* renamed from: a */
    public static final boolean m134754a(StoryEditModel storyEditModel) {
        C89219l.m154721d(storyEditModel, "");
        List<StoryEditClipModel> clips = storyEditModel.getClips();
        if ((clips instanceof Collection) && clips.isEmpty()) {
            return false;
        }
        Iterator<T> it = clips.iterator();
        while (it.hasNext()) {
            if (m134763h(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final FilterBean m134749a(StoryEditClipModel storyEditClipModel, AbstractC50707o oVar) {
        FilterBean filterBean;
        C89219l.m154721d(storyEditClipModel, "");
        C89219l.m154721d(oVar, "");
        String mSelectedFilterId = storyEditClipModel.getMSelectedFilterId();
        if (mSelectedFilterId != null) {
            try {
                filterBean = C50691c.m94990b(oVar.mo86071f(), Integer.parseInt(mSelectedFilterId));
            } catch (NumberFormatException unused) {
                filterBean = null;
            }
            if (filterBean != null) {
                return filterBean;
            }
        }
        return C50691c.m94986a(oVar.mo86071f(), 0);
    }

    /* renamed from: a */
    public static final VEPreviewParams m134750a(StoryEditClipModel storyEditClipModel, AbstractC70977bq bqVar, int i) {
        List g;
        int size = storyEditClipModel.getPreviewMediaInfo().getVideoList().size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = "";
        }
        String[] strArr2 = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr2[i3] = "";
        }
        float[] fArr = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            fArr[i4] = 1.0f;
        }
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int[] iArr2 = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr2[i6] = 0;
        }
        int[] iArr3 = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr3[i7] = -1;
        }
        int i8 = 0;
        for (T t : storyEditClipModel.getPreviewMediaInfo().getVideoList()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            strArr[i8] = t2.getVideoPath();
            String audioPath = t2.getAudioPath();
            if (audioPath == null) {
                audioPath = "";
            }
            strArr2[i8] = audioPath;
            VideoCutInfo videoCutInfo = t2.getVideoCutInfo();
            if (videoCutInfo != null) {
                fArr[i8] = videoCutInfo.getSpeed();
                iArr[i8] = videoCutInfo.getRotate();
                iArr2[i8] = (int) videoCutInfo.getStart();
                iArr3[i8] = (int) videoCutInfo.getEnd();
            }
            if (storyEditClipModel.getSourceContentType() == 2) {
                iArr3[i8] = 5000;
            }
            i8 = i9;
        }
        if (storyEditClipModel.isFastImport() || (g = C89064i.m154506g(strArr2)) == null || g.isEmpty()) {
            strArr2 = null;
        }
        C77155b bVar = new C77155b(strArr, strArr2, fArr, iArr, iArr2, iArr3);
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        vEPreviewParams.mWorkspace = m134751a(storyEditClipModel);
        vEPreviewParams.mVideoPaths = bVar.f173080a;
        vEPreviewParams.mAudioPaths = bVar.f173081b;
        vEPreviewParams.mSpeedArray = bVar.f173082c;
        vEPreviewParams.mRotateArray = bVar.f173083d;
        vEPreviewParams.mVTrimIn = bVar.f173084e;
        vEPreviewParams.mVTrimOut = bVar.f173085f;
        vEPreviewParams.mVolume = storyEditClipModel.getVoiceVolume();
        vEPreviewParams.mMusicVolume = vEPreviewParams.getMusicVolume();
        vEPreviewParams.mPageType = 1;
        vEPreviewParams.mFps = i;
        vEPreviewParams.mCanvasWidth = bqVar.mo112106a();
        vEPreviewParams.mCanvasHeight = bqVar.mo112109b();
        vEPreviewParams.isFastImport = storyEditClipModel.isFastImport();
        vEPreviewParams.recordData = storyEditClipModel.getMultiEditVideoRecordData();
        vEPreviewParams.isStoryEditMode = true;
        vEPreviewParams.canvasVideoPreviewData = storyEditClipModel.getCanvasVideoData();
        return vEPreviewParams;
    }

    /* renamed from: a */
    public static final void m134753a(EditPreviewInfo editPreviewInfo, boolean z, StoryCoverExtractConfig storyCoverExtractConfig, AbstractC89172b<? super Bitmap, C89391z> bVar) {
        C89219l.m154721d(editPreviewInfo, "");
        C89219l.m154721d(storyCoverExtractConfig, "");
        C89219l.m154721d(bVar, "");
        if (z) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C89070n.m154516a(m134752a(editPreviewInfo.getVideoList().get(0).getVideoPath())));
            C84402a.m145176a(urlModel, storyCoverExtractConfig.getWidth(), storyCoverExtractConfig.getHeight(), new C77151c(bVar));
            return;
        }
        VEUtils.getVideoFrames(editPreviewInfo.getVideoList().get(0).getVideoPath(), new int[]{storyCoverExtractConfig.getTimestamp()}, -1, storyCoverExtractConfig.getHeight(), false, new C77153d(bVar));
    }
}
