package com.p2082ss.android.ugc.aweme.draft.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45936a;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.effect.EffectListModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.IInternalAVService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71419h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.tools.C78103d;
import com.p2082ss.android.ugc.tools.utils.C84879a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.draft.model.d */
public final class C43225d {
    static {
        Covode.recordClassIndex(51427);
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.d$c */
    public static final class C43228c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ C43223c f100931a;

        /* renamed from: b */
        final /* synthetic */ IEffectService.OnVideoCoverCallback f100932b;

        static {
            Covode.recordClassIndex(51430);
        }

        /* renamed from: com.ss.android.ugc.aweme.draft.model.d$c$a */
        static final class CallableC43229a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C43228c f100933a;

            /* renamed from: b */
            final /* synthetic */ int f100934b;

            static {
                Covode.recordClassIndex(51431);
            }

            CallableC43229a(C43228c cVar, int i) {
                this.f100933a = cVar;
                this.f100934b = i;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f100933a.f100932b.onGetVideoCoverFailed(this.f100934b);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.draft.model.d$c$b */
        static final class CallableC43230b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C43228c f100935a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f100936b;

            static {
                Covode.recordClassIndex(51432);
            }

            CallableC43230b(C43228c cVar, Bitmap bitmap) {
                this.f100935a = cVar;
                this.f100936b = bitmap;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f100935a.f100932b.onGetVideoCoverSuccess(this.f100936b);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
            C1731i.m5640b(new CallableC43229a(this, i), C1731i.f5564c);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            C1731i.m5640b(new CallableC43230b(this, C45936a.m88694a(this.f100931a.f100900W.f100785aR, bitmap)), C1731i.f5564c);
        }

        C43228c(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
            this.f100931a = cVar;
            this.f100932b = onVideoCoverCallback;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.d$b */
    public static final class C43227b implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ C43223c f100929a;

        /* renamed from: b */
        final /* synthetic */ IEffectService.OnVideoCoverCallback f100930b;

        static {
            Covode.recordClassIndex(51429);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
            C43225d.m86331b(this.f100929a, this.f100930b);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            this.f100930b.onGetVideoCoverSuccess(bitmap);
        }

        C43227b(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
            this.f100929a = cVar;
            this.f100930b = onVideoCoverCallback;
        }
    }

    /* renamed from: h */
    public static final EditPreviewInfo m86338h(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        return m86323a(cVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.draft.model.d$a */
    public static final class C43226a extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C43226a f100928a = new C43226a();

        static {
            Covode.recordClassIndex(51428);
        }

        C43226a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return Boolean.valueOf(!C89361p.m154870a((CharSequence) str2));
        }
    }

    /* renamed from: a */
    public static final String m86324a(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        String str = cVar.f100900W.f100824bD;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("session id is needed for story draft");
    }

    /* renamed from: b */
    public static final String m86329b(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C69905c cVar2 = cVar.f100906f;
        if (cVar2 == null) {
            return "";
        }
        if (cVar2.isLocalMusic()) {
            return String.valueOf(cVar2.getLocalMusicId());
        }
        String musicId = cVar2.getMusicId();
        C89219l.m154716b(musicId, "");
        return musicId;
    }

    /* renamed from: c */
    public static final String m86332c(C43223c cVar) {
        String str;
        C89219l.m154721d(cVar, "");
        try {
            if (cVar.f100882E == null) {
                str = "";
            } else {
                str = C63244g.m114602a().mo73261G().mo46674b(cVar.f100882E);
            }
            C89219l.m154716b(str, "");
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    private static final void m86340j(C43223c cVar) {
        InfoStickerModel j = cVar.mo73694j();
        if (!(j == null || C13603b.m24435a((Collection) j.stickers))) {
            for (StickerItemModel stickerItemModel : j.stickers) {
                if (stickerItemModel.isPin) {
                    C84902i.m145896b(stickerItemModel.pinAlgorithmFile);
                }
            }
        }
    }

    /* renamed from: l */
    private static final C43233g m86342l(C43223c cVar) {
        C43233g gVar = cVar.f100900W.f100806am;
        if (!(gVar == null || cVar.f100900W.f100807an == null)) {
            List<DraftVideoSegment> list = cVar.f100900W.f100807an;
            if (list == null) {
                C89219l.m154715b();
            }
            if (!list.isEmpty() && !C84902i.m145892a(gVar.f100942c.get(0).f100724h)) {
                List<DraftVideoSegment> list2 = cVar.f100900W.f100807an;
                if (list2 == null) {
                    list2 = C89086z.INSTANCE;
                }
                gVar.mo73750a(list2);
                C43213k.m86181a("draftOpt==>getDraftPreviewConfigure,using copy video videoSegment");
            }
        }
        return gVar;
    }

    /* renamed from: d */
    public static final String m86334d(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar.f100903c != null) {
            PhotoMovieContext photoMovieContext = cVar.f100903c;
            if (photoMovieContext == null) {
                C89219l.m154715b();
            }
            String str = photoMovieContext.mFinalVideoTmpPath;
            C89219l.m154716b(str, "");
            return str;
        }
        EditPreviewInfo h = m86338h(cVar);
        if (h == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = h.getVideoList().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getVideoPath()).append(",");
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        if (sb2 == null) {
            return "";
        }
        return sb2;
    }

    /* renamed from: e */
    public static final String m86335e(C43223c cVar) {
        String str;
        C89219l.m154721d(cVar, "");
        if (cVar.f100903c != null) {
            PhotoMovieContext photoMovieContext = cVar.f100903c;
            if (photoMovieContext == null) {
                C89219l.m154715b();
            }
            str = photoMovieContext.mFinalVideoTmpPath;
        } else {
            List<EditVideoSegment> i = m86339i(cVar);
            if (i == null || i.isEmpty()) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = i.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().getVideoPath()).append(",");
                }
                str = sb.toString();
            }
        }
        C89219l.m154716b(str, "");
        return str;
    }

    /* JADX DEBUG: Type inference failed for r0v18. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment>, java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> */
    /* renamed from: i */
    public static final List<EditVideoSegment> m86339i(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar.f100900W.f100809ap != null) {
            return cVar.f100900W.f100809ap;
        }
        if (cVar.f100900W.f100807an == null) {
            return null;
        }
        List<DraftVideoSegment> list = cVar.f100900W.f100807an;
        if (list == null) {
            C89219l.m154715b();
        }
        if (!(!list.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<DraftVideoSegment> list2 = cVar.f100900W.f100807an;
        if (list2 != null) {
            for (DraftVideoSegment draftVideoSegment : list2) {
                arrayList.add(C71413b.m126115a(draftVideoSegment));
            }
        }
        cVar.mo73679f(arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public static final void m86337g(C43223c cVar) {
        String str;
        String str2 = "";
        C89219l.m154721d(cVar, str2);
        if (cVar.f100903c != null) {
            PhotoMovieContext photoMovieContext = cVar.f100903c;
            if (photoMovieContext != null) {
                str = photoMovieContext.mFinalVideoTmpPath;
            } else {
                str = null;
            }
            C84902i.m145896b(str);
        } else {
            C71413b.m126121a(C63244g.m114602a().mo73275c().mo101848b(cVar));
            List<EditVideoSegment> i = m86339i(cVar);
            if (i != null && (!i.isEmpty())) {
                for (EditVideoSegment editVideoSegment : i) {
                    C84902i.m145896b(editVideoSegment.getVideoPath());
                    C84902i.m145896b(editVideoSegment.getAudioPath());
                    C43213k.m86181a("[removeRelatedFiles]: segment.videoPath = " + editVideoSegment.getVideoPath());
                }
            }
        }
        if (cVar.f100900W.f100803aj != null && !TextUtils.isEmpty(cVar.f100900W.f100803aj.getAudioUrl())) {
            C84902i.m145896b(cVar.f100900W.f100803aj.getAudioUrl());
            AudioRecorderParam audioRecorderParam = cVar.f100900W.f100803aj;
            C89219l.m154716b(audioRecorderParam, str2);
            C89219l.m154721d(audioRecorderParam, str2);
            if (C89361p.m154876c(audioRecorderParam.getAudioUrl(), "df", false)) {
                String audioUrl = audioRecorderParam.getAudioUrl();
                Objects.requireNonNull(audioUrl, "null cannot be cast to non-null type java.lang.String");
                String substring = audioUrl.substring(0, audioRecorderParam.getAudioUrl().length() - 2);
                C89219l.m154716b(substring, str2);
                str2 = substring;
            }
            C84902i.m145896b(str2);
        }
        m86340j(cVar);
        C84902i.m145899c(cVar.f100900W.f100768aA);
        C84902i.m145896b(cVar.f100900W.f100768aA);
        if (cVar.mo73675e()) {
            C84902i.m145899c(C70638dj.f158103f + "duet/" + cVar.mo73676f());
        }
    }

    /* renamed from: k */
    private static HashSet<String> m86341k(C43223c cVar) {
        boolean z;
        C89219l.m154721d(cVar, "");
        HashSet<String> hashSet = new HashSet<>();
        EditPreviewInfo a = m86323a(cVar, false);
        if (a != null) {
            String draftDir = a.getDraftDir();
            if (draftDir.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && draftDir != null) {
                hashSet.add(draftDir);
            }
            for (T t : a.getVideoList()) {
                String videoPath = t.getVideoPath();
                if (C84902i.m145892a(videoPath) && videoPath != null) {
                    hashSet.add(videoPath);
                    String b = C13607d.m24442b(videoPath);
                    if ((b == null || b.length() == 0) && b != null) {
                        hashSet.add(b);
                    }
                }
                String audioPath = t.getAudioPath();
                if (!(audioPath == null || audioPath.length() == 0 || audioPath == null)) {
                    hashSet.add(audioPath);
                }
            }
            String[] reverseVideoArray = a.getReverseVideoArray();
            if (reverseVideoArray != null) {
                for (String str : reverseVideoArray) {
                    if (str.length() > 0 && str != null) {
                        hashSet.add(str);
                    }
                }
            }
            String[] reverseAudioArray = a.getReverseAudioArray();
            if (reverseAudioArray != null) {
                for (String str2 : reverseAudioArray) {
                    if (str2.length() > 0 && str2 != null) {
                        hashSet.add(str2);
                    }
                }
            }
            String[] tempVideoArray = a.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String str3 : tempVideoArray) {
                    if (str3.length() > 0 && str3 != null) {
                        hashSet.add(str3);
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public static final Set<String> m86336f(C43223c cVar) {
        EffectTextModel effectTextModel;
        StickerItemModel textSticker;
        String str;
        List<StickerItemModel> list;
        CoverPublishModel coverPublishModel;
        EffectTextModel effectTextModel2;
        StickerItemModel textSticker2;
        String str2;
        PhotoMovieContext photoMovieContext;
        String str3;
        String str4;
        ArrayList<MvNetFileBean> arrayList;
        String str5;
        String str6;
        ArrayList<String> arrayList2;
        List<Object> f;
        ArrayList<EffectPointModel> effectPointModels;
        List<EffectPointModel> f2;
        String str7;
        C89219l.m154721d(cVar, "");
        C43236j jVar = new C43236j(C43226a.f100928a);
        String calculateDraftDir = AVServiceImpl.m113116a().draftService().calculateDraftDir(cVar);
        if (calculateDraftDir != null) {
            C89219l.m154716b(calculateDraftDir, "");
            Boolean.valueOf(jVar.add(calculateDraftDir));
        }
        String str8 = cVar.f100900W.f100759S;
        if (str8 != null) {
            Boolean.valueOf(jVar.add(str8));
        }
        if (cVar.f100913m != 0) {
            IInternalAVService a = AVServiceImpl.m113116a();
            C89219l.m154716b(a, "");
            FilterBean filter = a.getFilterService().getFilter(cVar.f100913m);
            C89219l.m154716b(filter, "");
            String filterFolder = filter.getFilterFolder();
            if (filterFolder != null) {
                Boolean.valueOf(jVar.add(filterFolder));
            }
        }
        String str9 = cVar.f100900W.f100796ac;
        if (str9 != null) {
            C89219l.m154716b(str9, "");
            Boolean.valueOf(jVar.add(str9));
        }
        C43235i q = cVar.mo73722q();
        if (!(q == null || (str7 = q.f100951d) == null)) {
            Boolean.valueOf(jVar.add(str7));
        }
        String str10 = cVar.f100908h;
        if (str10 != null && str10.length() > 0) {
            Boolean.valueOf(jVar.add(str10));
        }
        EffectListModel effectListModel = cVar.f100882E;
        if (!(effectListModel == null || (effectPointModels = effectListModel.getEffectPointModels()) == null || (f2 = C89070n.m154580f((Iterable) effectPointModels)) == null)) {
            for (EffectPointModel effectPointModel : f2) {
                String resDir = effectPointModel.getResDir();
                if (resDir != null) {
                    jVar.add(resDir);
                }
            }
        }
        String str11 = cVar.f100900W.f100760T;
        if (str11 != null) {
            Boolean.valueOf(jVar.add(str11));
        }
        C61288d dVar = cVar.f100900W.f100753M;
        if (!(dVar == null || (arrayList2 = dVar.selectMediaList) == null || (f = C89070n.m154580f((Iterable) arrayList2)) == null)) {
            for (Object obj : f) {
                jVar.add(obj);
            }
        }
        C61288d dVar2 = cVar.f100900W.f100753M;
        if (!(dVar2 == null || (str6 = dVar2.videoCoverImgPath) == null)) {
            Boolean.valueOf(jVar.add(str6));
        }
        C61288d dVar3 = cVar.f100900W.f100753M;
        if (!(dVar3 == null || (str5 = dVar3.mvResUnzipPath) == null || str5.length() == 0)) {
            String absolutePath = new File(dVar3.mvResUnzipPath).getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            Boolean.valueOf(jVar.add(absolutePath));
        }
        C61288d dVar4 = cVar.f100900W.f100753M;
        if (!(dVar4 == null || (arrayList = dVar4.newMaskFileData) == null)) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                jVar.add(it.next().getFilePath());
            }
        }
        PhotoMovieContext photoMovieContext2 = cVar.f100903c;
        if (!(photoMovieContext2 == null || (str4 = photoMovieContext2.mFinalVideoTmpPath) == null || str4.length() == 0)) {
            String str12 = photoMovieContext2.mFinalVideoTmpPath;
            C89219l.m154716b(str12, "");
            Boolean.valueOf(jVar.add(str12));
        }
        PhotoMovieContext photoMovieContext3 = cVar.f100903c;
        if (!(photoMovieContext3 == null || (str3 = photoMovieContext3.mMusicPath) == null)) {
            Boolean.valueOf(jVar.add(str3));
        }
        PhotoMovieContext photoMovieContext4 = cVar.f100903c;
        if (!(photoMovieContext4 == null || photoMovieContext4.mFilterPath == null || (photoMovieContext = cVar.f100903c) == null)) {
            jVar.add(C63244g.m114602a().mo73290r().mo86005c().mo86023d(photoMovieContext.mFilterId));
        }
        PhotoMovieContext photoMovieContext5 = cVar.f100903c;
        if (!(photoMovieContext5 == null || (coverPublishModel = photoMovieContext5.getCoverPublishModel()) == null || (effectTextModel2 = coverPublishModel.getEffectTextModel()) == null || (textSticker2 = effectTextModel2.getTextSticker()) == null || (str2 = textSticker2.path) == null || str2.length() <= 0)) {
            Boolean.valueOf(jVar.add(str2));
        }
        jVar.addAll(m86341k(cVar));
        InfoStickerModel j = cVar.mo73694j();
        if (!(j == null || (list = j.stickers) == null)) {
            for (T t : list) {
                if (t != null) {
                    String str13 = t.path;
                    if (str13 != null && str13.length() > 0) {
                        Boolean.valueOf(jVar.add(str13));
                    }
                    if (t.isTextSticker()) {
                        SimpleTextStickerData simpleTextStickerData = (SimpleTextStickerData) C63244g.m114602a().mo73261G().mo46670a(t.extra, SimpleTextStickerData.class);
                        if (simpleTextStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(simpleTextStickerData.getAudioTrackFilePath())) {
                            String audioTrackFilePath = simpleTextStickerData.getAudioTrackFilePath();
                            if (audioTrackFilePath == null) {
                                C89219l.m154715b();
                            }
                            jVar.add(audioTrackFilePath);
                        }
                    }
                }
            }
        }
        CoverPublishModel coverPublishModel2 = cVar.f100900W.f100785aR;
        if (!(coverPublishModel2 == null || (effectTextModel = coverPublishModel2.getEffectTextModel()) == null || (textSticker = effectTextModel.getTextSticker()) == null || (str = textSticker.path) == null || str.length() <= 0)) {
            Boolean.valueOf(jVar.add(str));
        }
        C72867e.m128687a(jVar, cVar);
        return jVar;
    }

    /* renamed from: a */
    public static final void m86328a(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(onVideoCoverCallback, "");
        m86327a(cVar, null, onVideoCoverCallback);
    }

    /* renamed from: a */
    private static final Bitmap m86322a(C43237k kVar, String str) {
        MethodCollector.m26663i(2402);
        if (C43238l.m86347a(kVar)) {
            Bitmap a = C78103d.m136526a(str, kVar.f100957a, kVar.f100958b);
            MethodCollector.m26664o(2402);
            return a;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        MethodCollector.m26664o(2402);
        return decodeFile;
    }

    /* renamed from: a */
    public static final void m86325a(C43223c cVar, int i) {
        C89219l.m154721d(cVar, "");
        cVar.f100913m = i;
        IInternalAVService a = AVServiceImpl.m113116a();
        C89219l.m154716b(a, "");
        FilterBean filter = a.getFilterService().getFilter(i);
        C89219l.m154716b(filter, "");
        cVar.mo73731s(filter.getFilterFolder());
    }

    /* renamed from: c */
    private static final void m86333c(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        MethodCollector.m26663i(25);
        String o = cVar.mo73714o();
        if (o == null || !C84902i.m145892a(o)) {
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
            MethodCollector.m26664o(25);
            return;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(cVar.mo73714o());
        if (decodeFile == null || !(!decodeFile.isRecycled())) {
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
            MethodCollector.m26664o(25);
            return;
        }
        onVideoCoverCallback.onGetVideoCoverSuccess(C45936a.m88694a(cVar.f100900W.f100785aR, decodeFile));
        MethodCollector.m26664o(25);
    }

    /* renamed from: a */
    public static final void m86326a(C43223c cVar, AudioRecorderParam audioRecorderParam) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(audioRecorderParam, "");
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom(audioRecorderParam);
        audioRecorderParam2.setAudioUrl(C84879a.m145811a(audioRecorderParam2));
        audioRecorderParam2.setExtraUrl("");
        cVar.f100900W.f100803aj = audioRecorderParam2;
    }

    /* renamed from: b */
    public static final void m86331b(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        float s;
        ArrayList arrayList = new ArrayList();
        EffectListModel effectListModel = cVar.f100882E;
        if (effectListModel != null) {
            ArrayList<EffectPointModel> effectPointModels = effectListModel.getEffectPointModels();
            C89219l.m154716b(effectPointModels, "");
            arrayList.addAll(effectPointModels);
        }
        boolean equals = TextUtils.equals(String.valueOf(cVar.f100915o), "1");
        IEffectService effectService = AVServiceImpl.m113116a().effectService();
        IInternalAVService a = AVServiceImpl.m113116a();
        C89219l.m154716b(a, "");
        FilterBean filter = a.getFilterService().getFilter(cVar.f100913m);
        C89219l.m154716b(filter, "");
        String filterFolder = filter.getFilterFolder();
        if (filterFolder == null) {
            C89219l.m154715b();
        }
        if (cVar.mo73729s() == -1.0f) {
            s = 0.8f;
        } else {
            s = cVar.mo73729s();
        }
        effectService.getVideoCoverByCallback(arrayList, filterFolder, s, (int) (cVar.f100896S * 1000.0f), equals, m86338h(cVar), new C43228c(cVar, onVideoCoverCallback));
    }

    /* renamed from: a */
    public static final EditPreviewInfo m86323a(C43223c cVar, boolean z) {
        VideoFileInfo videoFileInfo;
        C89219l.m154721d(cVar, "");
        C43213k.m86181a("[getPreviewInfo]: creation id = " + cVar.mo73676f() + " is fast import = " + cVar.f100900W.f100757Q);
        if (cVar.f100900W.f100808ao != null) {
            EditPreviewInfo editPreviewInfo = cVar.f100900W.f100808ao;
            if (editPreviewInfo != null) {
                if (editPreviewInfo.getPreviewWidth() <= 0 && cVar.f100900W.f100762V > 0) {
                    editPreviewInfo.setPreviewWidth(cVar.f100900W.f100762V);
                }
                if (editPreviewInfo.getPreviewHeight() <= 0 && cVar.f100900W.f100763W > 0) {
                    editPreviewInfo.setPreviewHeight(cVar.f100900W.f100763W);
                }
                if (cVar.f100916p == 1 && !cVar.f100900W.f100823bC) {
                    cVar.f100900W.f100823bC = true;
                    List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
                    int i = 0;
                    for (T t : videoList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C89070n.m154520a();
                        }
                        T t2 = t;
                        long duration = t2.getVideoFileInfo().getDuration();
                        long j = duration / 1000;
                        videoList.set(i, EditVideoSegment.copy$default(t2, null, null, VideoFileInfo.copy$default(t2.getVideoFileInfo(), 0, 0, j, 0, 0, 0, 0, 0, 251, null), null, 11, null));
                        C43213k.m86181a("[getPreviewInfo]:fix video length in draft,old:" + duration + ",new:" + j);
                        i = i2;
                    }
                }
            }
            List<EditVideoSegment> i3 = m86339i(cVar);
            C43213k.m86181a("[getPreviewInfo]: previewVideoListCopy = ".concat(String.valueOf(i3)));
            if (i3 != null && !i3.isEmpty()) {
                int size = i3.size();
                if (editPreviewInfo == null) {
                    C89219l.m154715b();
                }
                if (size < editPreviewInfo.getVideoList().size()) {
                    C43213k.m86181a("[getPreviewInfo]: copySize < previewInfo!!.videoList.size");
                    return editPreviewInfo;
                }
                int size2 = editPreviewInfo.getVideoList().size();
                for (int i4 = 0; i4 < size2; i4++) {
                    EditVideoSegment editVideoSegment = editPreviewInfo.getVideoList().get(i4);
                    boolean a = C84902i.m145892a(editVideoSegment.getVideoPath());
                    C43213k.m86181a("[getPreviewInfo]: videoPath = " + editVideoSegment.getVideoPath() + " is exist = " + a);
                    if (!a) {
                        editPreviewInfo.getVideoList().set(i4, i3.get(i4));
                    }
                }
            }
            cVar.mo73632a(editPreviewInfo);
            return editPreviewInfo;
        }
        C43233g l = m86342l(cVar);
        EditPreviewInfo editPreviewInfo2 = null;
        if (l != null) {
            editPreviewInfo2 = C71413b.m126114a(l);
        } else if (cVar.f100907g != null) {
            String str = cVar.f100907g;
            C89219l.m154716b(str, "");
            String str2 = cVar.f100909i;
            if (z) {
                videoFileInfo = C71413b.m126117a(cVar.f100907g);
            } else {
                videoFileInfo = new VideoFileInfo(0, 0, 0, 0, 0, 0, 0, 0, 240, null);
            }
            editPreviewInfo2 = new C71419h(0, 0, null, 31).mo113031a(new EditVideoSegment(str, str2, videoFileInfo));
            if (!TextUtils.isEmpty(cVar.f100917q)) {
                String str3 = cVar.f100917q;
                C89219l.m154716b(str3, "");
                editPreviewInfo2.setReverseVideoArray(new String[]{str3});
            }
        }
        cVar.mo73632a(editPreviewInfo2);
        return editPreviewInfo2;
    }

    /* renamed from: b */
    private static final void m86330b(C43223c cVar, C43237k kVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        if (!C84902i.m145892a(cVar.mo73718p())) {
            C84911q.m145926b("multi edit video cover img path not exist:" + cVar.mo73718p());
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
            return;
        }
        String p = cVar.mo73718p();
        if (p != null && C84902i.m145892a(p)) {
            String p2 = cVar.mo73718p();
            C89219l.m154716b(p2, "");
            Bitmap a = m86322a(kVar, p2);
            if (a == null || !(!a.isRecycled())) {
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
            } else {
                onVideoCoverCallback.onGetVideoCoverSuccess(C45936a.m88694a(cVar.f100900W.f100785aR, a));
            }
        }
    }

    /* renamed from: a */
    public static final void m86327a(C43223c cVar, C43237k kVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(onVideoCoverCallback, "");
        C43227b bVar = new C43227b(cVar, onVideoCoverCallback);
        String str = cVar.f100900W.f100760T;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && new File(cVar.f100900W.f100760T).exists()) {
            String str2 = cVar.f100900W.f100760T;
            C89219l.m154716b(str2, "");
            Bitmap a = m86322a(kVar, str2);
            if (a == null || !(!a.isRecycled())) {
                bVar.onGetVideoCoverFailed(-1);
            } else {
                bVar.onGetVideoCoverSuccess(a);
            }
        } else if (cVar.f100895R == 2) {
            bVar.onGetVideoCoverFailed(-1);
        } else if (cVar.mo73701k()) {
            m86333c(cVar, bVar);
        } else if (cVar.mo73713n()) {
            m86330b(cVar, kVar, bVar);
        } else {
            m86331b(cVar, onVideoCoverCallback);
        }
    }
}
