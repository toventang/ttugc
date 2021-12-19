package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.C14042ab;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C69745a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.AbstractC78498e;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78488a;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78489b;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78497d;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78500f;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78502h;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78503i;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78505j;
import com.p2082ss.android.ugc.aweme.tools.extract.p4117b.C78521a;
import com.p2082ss.android.ugc.aweme.tools.extract.p4117b.C78523b;
import com.p2082ss.android.ugc.aweme.tools.extract.p4117b.C78524c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.ab */
public final class C78507ab {

    /* renamed from: a */
    public static C78505j f176423a;

    /* renamed from: b */
    public static final C78507ab f176424b = new C78507ab();

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.ab$a */
    public interface AbstractC78508a {
        static {
            Covode.recordClassIndex(91640);
        }

        /* renamed from: a */
        void mo110352a(String str);
    }

    private C78507ab() {
    }

    /* renamed from: a */
    public static final void m137078a(Object obj, int i, int i2, String str) {
        if (str == null) {
            str = "";
        }
        String str2 = str + ", " + m137072a();
        C89219l.m154716b(str2, "");
        C69840ar a = new C69840ar().mo110187a("frame_type", Integer.valueOf(i)).mo110189a("extra_msg", str2).mo110187a("status_code", Integer.valueOf(i2));
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            a.mo110189a("content_type", C71817eu.m126792c(videoPublishEditModel)).mo110187a("aweme_type", Integer.valueOf(C71817eu.m126796g(videoPublishEditModel))).mo110189a("enter_from", videoPublishEditModel.enterFrom);
        }
        if (i2 == 0) {
            C40982q.m82520a("av_extra_video_frame", 0, a.mo110191a());
            C39162r.m79461a("av_extra_video_frame", a.mo110191a());
            return;
        }
        C40982q.m82520a("av_extra_video_frame", i2, a.mo110191a());
        C39162r.m79461a("av_extra_video_frame", a.mo110191a());
        C84911q.m145922a("saveVideoFrames", str2);
    }

    /* renamed from: a */
    public static void m137080a(Object obj, AbstractC78508a aVar, boolean z, int i, String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        C78505j jVar = f176423a;
        if (jVar != null) {
            sb.append("video_type:").append(jVar.getVideoType()).append(",");
            sb.append("video_origin:").append(jVar.getVideoOrigin()).append(",");
            sb.append(str);
            if (z2) {
                m137078a(obj, jVar.getVideoType(), i, sb.toString());
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                m137074a((VideoPublishEditModel) obj, i, sb.toString());
            }
        }
        if (z && aVar != null) {
            aVar.mo110352a(sb.toString());
        }
    }

    static {
        Covode.recordClassIndex(91639);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.ab$b */
    public static final class CallableC78509b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C89378p f176425a;

        /* renamed from: b */
        final /* synthetic */ Object f176426b;

        /* renamed from: c */
        final /* synthetic */ AbstractC78508a f176427c;

        /* renamed from: d */
        final /* synthetic */ boolean f176428d = false;

        static {
            Covode.recordClassIndex(91641);
        }

        public CallableC78509b(C89378p pVar, Object obj, AbstractC78508a aVar, boolean z) {
            this.f176425a = pVar;
            this.f176426b = obj;
            this.f176427c = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int intValue = ((Number) this.f176425a.getFirst()).intValue();
            if (intValue != -1) {
                C78507ab.m137080a(this.f176426b, this.f176427c, this.f176428d, intValue, (String) this.f176425a.getSecond(), false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m137072a() {
        List<C78595z> uploadFrameInfoList;
        StringBuilder sb = new StringBuilder("{");
        C78505j jVar = f176423a;
        if (!(jVar == null || (uploadFrameInfoList = jVar.getUploadFrameInfoList()) == null || !(!uploadFrameInfoList.isEmpty()))) {
            for (T t : uploadFrameInfoList) {
                sb.append("d:" + t.f176634c);
                sb.append(", s:" + t.f176635d);
                sb.append(";");
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.ab$d */
    public static final class CallableC78511d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Object f176432a;

        /* renamed from: b */
        final /* synthetic */ C69831ai f176433b;

        static {
            Covode.recordClassIndex(91643);
        }

        public CallableC78511d(Object obj, C69831ai aiVar) {
            this.f176432a = obj;
            this.f176433b = aiVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<FrameItem> list;
            int i;
            boolean z;
            int i2;
            String str;
            Object obj = this.f176432a;
            C69831ai aiVar = this.f176433b;
            C89219l.m154721d(obj, "");
            C89219l.m154721d(aiVar, "");
            if (obj instanceof VideoPublishEditModel) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
                String str2 = null;
                if (!C84902i.m145892a(extractFramesModel != null ? extractFramesModel.getExtractFramesDir() : null)) {
                    StringBuilder sb = new StringBuilder("extract frame dir:");
                    if (extractFramesModel != null) {
                        str2 = extractFramesModel.getExtractFramesDir();
                    }
                    return C89387v.m154943a(8, sb.append(str2).toString());
                }
                if (extractFramesModel == null || (list = extractFramesModel.getAllFrames()) == null) {
                    list = C89086z.INSTANCE;
                }
                int size = list.size();
                if (size == 0) {
                    return C89387v.m154943a(9, "frame count == 0");
                }
                for (T t : list) {
                    if (!C80720e.m139927b(t.getPath())) {
                        return C89387v.m154943a(18, "frame file not exist path:" + t.getPath());
                    }
                }
                int b = C78503i.m137066b(videoPublishEditModel);
                C89219l.m154721d(videoPublishEditModel, "");
                C89219l.m154721d(aiVar, "");
                boolean z2 = false;
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                C69745a a = createIAVServiceProxybyMonsterPlugin.getAVConverter().mo93912a(aiVar);
                C69840ar a2 = new C69840ar().mo110189a("aweme_id", a != null ? a.aid : null).mo110187a("match_factors", Integer.valueOf(C78594y.m137206a(videoPublishEditModel).f176443a));
                String cameraIds = videoPublishEditModel.getCameraIds();
                if (cameraIds == null || cameraIds.length() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                C69840ar a3 = a2.mo110187a("origin", Integer.valueOf(i ^ 1)).mo110185a("is_draft", Boolean.valueOf(videoPublishEditModel.mIsFromDraft));
                if (videoPublishEditModel.mRestoreType == 2) {
                    z = true;
                } else {
                    z = false;
                }
                C69840ar a4 = a3.mo110185a("is_backup", Boolean.valueOf(z)).mo110187a("video_type", Integer.valueOf(C71817eu.m126796g(videoPublishEditModel)));
                if (b > size) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i3 = b - size;
                C69840ar a5 = a4.mo110187a("status", Integer.valueOf(i2)).mo110187a("missing_count", Integer.valueOf(i3));
                float f = ((float) i3) / ((float) b);
                C40982q.m82520a("av_video_audit_missing", 1, a5.mo110186a("missing_rate", Float.valueOf(f)).mo110191a());
                if (i3 >= 3) {
                    C78521a aVar = new C78521a();
                    C78523b bVar = aVar.f176452c;
                    if (a != null) {
                        str2 = a.aid;
                    }
                    bVar.f176463a = str2;
                    aVar.f176453d.f176463a = String.valueOf(C78594y.m137206a(videoPublishEditModel).f176443a);
                    aVar.f176454e.f176463a = String.valueOf(videoPublishEditModel.mIsFromDraft);
                    C78523b bVar2 = aVar.f176455f;
                    String cameraIds2 = videoPublishEditModel.getCameraIds();
                    if (cameraIds2 == null || cameraIds2.length() == 0) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    bVar2.f176463a = str;
                    C78523b bVar3 = aVar.f176456g;
                    if (videoPublishEditModel.mRestoreType == 2) {
                        z2 = true;
                    }
                    bVar3.f176463a = String.valueOf(z2);
                    aVar.f176461l.f176463a = String.valueOf(i3);
                    aVar.f176462m.f176463a = String.valueOf(f);
                    aVar.f176460k.f176463a = "missing count: " + i3 + " missing rate: " + f;
                    String a6 = C14042ab.m25488a(new Throwable("VideoAuditMissing"));
                    C89219l.m154716b(a6, "");
                    C78524c.m137095a(aVar, a6, "VideoAuditMiss", "creative_tools_audit_error");
                }
                C78503i.C78504a a7 = C78503i.m137064a(videoPublishEditModel, size);
                if (a7.f176407a != -2) {
                    return new C89378p(Integer.valueOf(a7.f176407a), a7.f176409c);
                }
                int i4 = a7.f176408b;
                ArrayList<AbstractC78498e> arrayList = new ArrayList();
                arrayList.add(new C78502h());
                if (videoPublishEditModel.canvasVideoData != null) {
                    arrayList.add(C78488a.f176395a);
                }
                if (videoPublishEditModel.isMvThemeVideoType()) {
                    arrayList.add(new C78500f());
                }
                arrayList.add(new C78497d());
                for (AbstractC78498e eVar : arrayList) {
                    C89378p<Integer, String> a8 = eVar.mo122413a(videoPublishEditModel, i4);
                    if (a8.getFirst().intValue() != -2) {
                        return a8;
                    }
                }
                return C89387v.m154943a(-1, "");
            }
            throw new IllegalArgumentException("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.ab$c */
    public static final class C78510c implements C78489b.AbstractC78491b {

        /* renamed from: a */
        final /* synthetic */ Object f176429a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78508a f176430b;

        /* renamed from: c */
        final /* synthetic */ boolean f176431c = false;

        static {
            Covode.recordClassIndex(91642);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78489b.AbstractC78491b
        /* renamed from: a */
        public final void mo122415a(boolean z) {
            if (!z) {
                C78507ab.m137080a(this.f176429a, this.f176430b, this.f176431c, 10, "", true);
            }
        }

        public C78510c(Object obj, AbstractC78508a aVar, boolean z) {
            this.f176429a = obj;
            this.f176430b = aVar;
        }
    }

    /* renamed from: c */
    public static final void m137082c(C78548j jVar) {
        C89219l.m154721d(jVar, "");
        C78521a a = C78521a.C78522a.m137094a(jVar);
        String a2 = C14042ab.m25488a(new Throwable("AuditOutdated"));
        C89219l.m154716b(a2, "");
        C78524c.m137095a(a, a2, "AuditOutdated", "creative_tools_audit_outdated_error");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.ab$e */
    public static final class C78512e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Object f176434a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78508a f176435b;

        /* renamed from: c */
        final /* synthetic */ boolean f176436c = false;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f176437d;

        static {
            Covode.recordClassIndex(91644);
        }

        public C78512e(Object obj, AbstractC78508a aVar, boolean z, AbstractC89171a aVar2) {
            this.f176434a = obj;
            this.f176435b = aVar;
            this.f176437d = aVar2;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89378p pVar;
            Integer num;
            int intValue;
            String str;
            C89378p pVar2;
            if (!(iVar == null || (pVar = (C89378p) iVar.mo5545d()) == null || (num = (Integer) pVar.getFirst()) == null || (intValue = num.intValue()) == -1)) {
                Object obj = this.f176434a;
                AbstractC78508a aVar = this.f176435b;
                boolean z = this.f176436c;
                if (iVar == null || (pVar2 = (C89378p) iVar.mo5545d()) == null || (str = (String) pVar2.getSecond()) == null) {
                    str = "";
                }
                C78507ab.m137080a(obj, aVar, z, intValue, str, true);
            }
            this.f176437d.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static final void m137081b(C78548j jVar) {
        int i;
        Integer num;
        C89219l.m154721d(jVar, "");
        jVar.mo122479a();
        if (jVar.f176539f == null || ((num = jVar.f176539f) != null && num.intValue() == 0)) {
            i = 1;
        } else {
            i = 0;
        }
        C40982q.m82520a("av_audio_audit", i, jVar.mo122479a());
        if (jVar.f176540g == 0) {
            C78521a a = C78521a.C78522a.m137094a(jVar);
            String a2 = C14042ab.m25488a(new Throwable("AudioAuditError"));
            C89219l.m154716b(a2, "");
            C78524c.m137095a(a, a2, "AudioAudit", "creative_tools_audit_error");
        }
    }

    /* renamed from: a */
    public static final void m137077a(C78548j jVar) {
        int i;
        Integer num;
        C89219l.m154721d(jVar, "");
        jVar.mo122479a();
        if (jVar.f176539f == null || ((num = jVar.f176539f) != null && num.intValue() == 0)) {
            i = 1;
        } else {
            i = 0;
        }
        C40982q.m82520a("av_video_audit", i, jVar.mo122479a());
        if (jVar.f176540g == 0) {
            C78521a a = C78521a.C78522a.m137094a(jVar);
            String a2 = C14042ab.m25488a(new Throwable("VideoAuditError"));
            C89219l.m154716b(a2, "");
            C78524c.m137095a(a, a2, "VideoAudit", "creative_tools_audit_error");
        }
    }

    /* renamed from: a */
    public static final void m137074a(VideoPublishEditModel videoPublishEditModel, int i, String str) {
        String str2;
        Integer num;
        if (str == null) {
            str = "";
        }
        String str3 = str + ", " + m137072a();
        C89219l.m154716b(str3, "");
        C69840ar a = new C69840ar().mo110189a("extra_msg", str3);
        String str4 = null;
        if (videoPublishEditModel != null) {
            str2 = C71817eu.m126792c(videoPublishEditModel);
        } else {
            str2 = null;
        }
        C69840ar a2 = a.mo110189a("content_type", str2);
        if (videoPublishEditModel != null) {
            num = Integer.valueOf(C71817eu.m126796g(videoPublishEditModel));
        } else {
            num = null;
        }
        C69840ar a3 = a2.mo110187a("aweme_type", num);
        if (videoPublishEditModel != null) {
            str4 = videoPublishEditModel.enterFrom;
        }
        C69840ar a4 = a3.mo110189a("enter_from", str4).mo110187a("status_code", Integer.valueOf(i));
        C40982q.m82520a("av_extra_audio_frame", i, a4.mo110191a());
        C39162r.m79461a("av_extra_audio_frame", a4.mo110191a());
    }

    /* renamed from: a */
    public static final void m137073a(C69831ai aiVar, Object obj, Integer num, Boolean bool, String str) {
        String str2;
        int i;
        boolean z;
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(obj, "");
        C89219l.m154721d(str, "");
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            C89219l.m154721d(aiVar, "");
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(str, "");
            int i2 = 0;
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            C69745a a = createIAVServiceProxybyMonsterPlugin.getAVConverter().mo93912a(aiVar);
            C78548j jVar = new C78548j();
            if (a != null) {
                str2 = a.aid;
            } else {
                str2 = null;
            }
            jVar.f176534a = str2;
            jVar.f176535b = C78594y.m137206a(videoPublishEditModel).f176443a;
            String cameraIds = videoPublishEditModel.getCameraIds();
            if (cameraIds == null || cameraIds.length() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jVar.f176536c = i;
            jVar.f176537d = Boolean.valueOf(videoPublishEditModel.mIsFromDraft);
            if (videoPublishEditModel.mRestoreType == 2) {
                z = true;
            } else {
                z = false;
            }
            jVar.f176538e = Boolean.valueOf(z);
            jVar.f176539f = num;
            if (num == null || num.intValue() == 0) {
                i2 = 1;
            }
            jVar.f176540g = i2;
            jVar.f176541h = bool;
            jVar.mo122480a(str);
            m137077a(jVar);
        }
    }

    /* renamed from: a */
    public static void m137075a(VideoPublishEditModel videoPublishEditModel, C69831ai aiVar, Integer num, Boolean bool, String str) {
        String str2;
        int i;
        boolean z;
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(str, "");
        int i2 = 0;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        C69745a a = createIAVServiceProxybyMonsterPlugin.getAVConverter().mo93912a(aiVar);
        C78548j jVar = new C78548j();
        if (a != null) {
            str2 = a.aid;
        } else {
            str2 = null;
        }
        jVar.f176534a = str2;
        jVar.f176535b = C78559r.m137157a(videoPublishEditModel).f176447a;
        String cameraIds = videoPublishEditModel.getCameraIds();
        if (cameraIds == null || cameraIds.length() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        jVar.f176536c = i;
        jVar.f176537d = Boolean.valueOf(videoPublishEditModel.mIsFromDraft);
        if (videoPublishEditModel.mRestoreType == 2) {
            z = true;
        } else {
            z = false;
        }
        jVar.f176538e = Boolean.valueOf(z);
        jVar.f176539f = num;
        if (num == null || num.intValue() == 0) {
            i2 = 1;
        }
        jVar.f176540g = i2;
        jVar.f176541h = bool;
        jVar.mo122480a(str);
        m137081b(jVar);
    }
}
