package com.p2082ss.android.ugc.aweme.tools.policysecurity;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.AbstractServiceC0617o;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.setting.C68718w;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C71799eg;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73849b;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3880a.C73836a;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import com.p2082ss.android.ugc.aweme.tools.extract.C78548j;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78100a;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78101b;
import com.p2082ss.android.ugc.aweme.tools.policysecurity.C79023a;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.ttuploader.TTVideoInfo;
import com.p2082ss.ttuploader.TTVideoUploader;
import com.p2082ss.ttuploader.TTVideoUploaderListener;
import com.p2082ss.ttuploader.UploadEventManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService */
public final class OriginalSoundUploadService extends AbstractServiceC0617o {

    /* renamed from: a */
    public static final C79017a f177604a = new C79017a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$AudioUploadApi */
    public interface AudioUploadApi {
        static {
            Covode.recordClassIndex(92183);
        }

        @AbstractC89731o(mo144285a = "/aweme/v2/aweme/audiotrack/update/")
        @AbstractC89721e
        C1731i<BaseResponse> uploadAudio(@AbstractC89719c(mo144273a = "aweme_id") String str, @AbstractC89719c(mo144273a = "audiotrack_uri") String str2);

        @AbstractC89731o(mo144285a = "/tiktok/v1/multi/audiotrack/update/")
        @AbstractC89721e
        C1731i<BaseResponse> uploadMultiAudio(@AbstractC89719c(mo144273a = "audio_requests") JSONArray jSONArray);
    }

    static {
        Covode.recordClassIndex(92182);
    }

    @Override // androidx.core.app.AbstractServiceC0583f
    public final int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$a */
    public static final class C79017a {
        static {
            Covode.recordClassIndex(92184);
        }

        private C79017a() {
        }

        public /* synthetic */ C79017a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static void m137846a(C79025b bVar, C79023a aVar) {
        MethodCollector.m26663i(6711);
        for (T t : bVar.f177631a) {
            String str = t.f177618a;
            C89219l.m154721d(str, "");
            aVar.getWritableDatabase().delete("OriginalSound", "aweme_id = ?", new String[]{str});
            m137848a(new File(t.f177620c));
            C63244g.m114602a().mo73287o().mo104792l().mo104817a("original_sound", "cleanup original sound, awemeId: " + t.f177618a);
        }
        MethodCollector.m26664o(6711);
    }

    /* renamed from: a */
    private static boolean m137848a(File file) {
        MethodCollector.m26663i(6863);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(6863);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(6863);
        return delete;
    }

    /* renamed from: a */
    public static void m137847a(String str) {
        C78507ab.m137074a(null, 16, str);
        C63244g.m114602a();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$c */
    static final class C79019c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ OriginalSoundUploadService f177610a;

        /* renamed from: b */
        final /* synthetic */ C79023a f177611b;

        /* renamed from: c */
        final /* synthetic */ C65614f f177612c;

        static {
            Covode.recordClassIndex(92186);
        }

        C79019c(OriginalSoundUploadService originalSoundUploadService, C79023a aVar, C65614f fVar) {
            this.f177610a = originalSoundUploadService;
            this.f177611b = aVar;
            this.f177612c = fVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c() || iVar.mo5539b()) {
                Exception e = iVar.mo5546e();
                C89219l.m154716b(e, "");
                throw e;
            }
            C79023a aVar = this.f177611b;
            Object d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            C79025b bVar = (C79025b) d;
            C89219l.m154721d(bVar, "");
            Iterator<T> it = bVar.f177631a.iterator();
            while (it.hasNext()) {
                aVar.mo122849a((OriginalSoundUploadTask) it.next());
            }
            Object d2 = iVar.mo5545d();
            C89219l.m154716b(d2, "");
            return OriginalSoundUploadService.m137842a((C79025b) d2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$d */
    static final class C79020d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C79025b f177613a;

        /* renamed from: b */
        final /* synthetic */ OriginalSoundUploadService f177614b;

        /* renamed from: c */
        final /* synthetic */ C79023a f177615c;

        /* renamed from: d */
        final /* synthetic */ C65614f f177616d;

        static {
            Covode.recordClassIndex(92187);
        }

        C79020d(C79025b bVar, OriginalSoundUploadService originalSoundUploadService, C79023a aVar, C65614f fVar) {
            this.f177613a = bVar;
            this.f177614b = originalSoundUploadService;
            this.f177615c = aVar;
            this.f177616d = fVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5544c() && !iVar.mo5539b()) {
                OriginalSoundUploadService.m137846a(this.f177613a, this.f177615c);
            } else if (iVar.mo5544c()) {
                if ((iVar.mo5546e() instanceof IllegalStateException) && iVar.mo5546e().getMessage() != null) {
                    String message = iVar.mo5546e().getMessage();
                    if (message == null) {
                        C89219l.m154715b();
                    }
                    if (C89361p.m154874b(message, "file error", false)) {
                        OriginalSoundUploadService.m137846a(this.f177613a, this.f177615c);
                    }
                }
                Exception e = iVar.mo5546e();
                C89219l.m154716b(e, "");
                throw e;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static void m137849b(C79025b bVar) {
        for (T t : bVar.f177631a) {
            C78548j jVar = new C78548j();
            jVar.f176534a = t.f177618a;
            jVar.f176538e = Boolean.valueOf(t.f177627j);
            jVar.f176537d = Boolean.valueOf(t.f177625h);
            jVar.f176535b = t.f177624g;
            jVar.f176536c = Integer.valueOf(t.f177626i);
            boolean z = true;
            if (t.f177628k <= 1) {
                z = false;
            }
            jVar.f176541h = Boolean.valueOf(z);
            jVar.f176540g = 0;
            jVar.f176539f = -4002;
            C78507ab.m137082c(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$e */
    static final class C79021e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C79025b f177617a;

        static {
            Covode.recordClassIndex(92188);
        }

        C79021e(C79025b bVar) {
            this.f177617a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c()) {
                for (T t : this.f177617a.f177631a) {
                    Exception e = iVar.mo5546e();
                    C89219l.m154716b(e, "");
                    C34611o.m70671b("aweme_movie_publish_log", "upload_audio", C78100a.m136518a(C89041ag.m154421a(C89387v.m154943a("success", "0"), C89387v.m154943a("success_mid", t.f177619b), C89387v.m154943a("aweme_id", t.f177618a), C89387v.m154943a("errorDesc", C78101b.m136519a(e)))));
                }
            } else {
                for (T t2 : this.f177617a.f177631a) {
                    C34611o.m70671b("aweme_movie_publish_log", "upload_audio", C78100a.m136518a(C89041ag.m154421a(C89387v.m154943a("success", "1"), C89387v.m154943a("success_mid", t2.f177619b), C89387v.m154943a("aweme_id", t2.f177618a))));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static C1731i<BaseResponse> m137842a(C79025b bVar) {
        IRetrofitFactory a = RetrofitFactory.m33635a();
        AVApi b = AVApiImpl.m123134b();
        C89219l.m154716b(b, "");
        AudioUploadApi audioUploadApi = (AudioUploadApi) a.mo28816a(b.mo109850a()).mo28858a(AudioUploadApi.class);
        if (bVar.f177631a.size() > 1) {
            C89219l.m154721d(bVar, "");
            JSONArray jSONArray = new JSONArray();
            for (T t : bVar.f177631a) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("aweme_id", t.f177618a);
                jSONObject.put("audiotrack_uri", t.f177623f);
                jSONArray.put(jSONObject);
            }
            C1731i<BaseResponse> uploadMultiAudio = audioUploadApi.uploadMultiAudio(jSONArray);
            uploadMultiAudio.mo5547f();
            for (OriginalSoundUploadTask originalSoundUploadTask : bVar.f177631a) {
                if (!uploadMultiAudio.mo5535a()) {
                    String stackTraceString = Log.getStackTraceString(uploadMultiAudio.mo5546e());
                    C89219l.m154716b(stackTraceString, "");
                    m137844a(originalSoundUploadTask, stackTraceString, -3003, 0);
                } else if (uploadMultiAudio.mo5545d().error_code != 0) {
                    String baseResponse = uploadMultiAudio.mo5545d().toString();
                    C89219l.m154716b(baseResponse, "");
                    m137844a(originalSoundUploadTask, baseResponse, -3003, 0);
                } else {
                    m137844a(originalSoundUploadTask, "", 0, 1);
                }
            }
            return uploadMultiAudio;
        }
        OriginalSoundUploadTask originalSoundUploadTask2 = bVar.f177631a.get(0);
        String str = originalSoundUploadTask2.f177618a;
        String str2 = originalSoundUploadTask2.f177623f;
        if (str2 == null) {
            C89219l.m154715b();
        }
        C1731i<BaseResponse> uploadAudio = audioUploadApi.uploadAudio(str, str2);
        uploadAudio.mo5547f();
        if (!uploadAudio.mo5535a()) {
            String stackTraceString2 = Log.getStackTraceString(uploadAudio.mo5546e());
            C89219l.m154716b(stackTraceString2, "");
            m137844a(originalSoundUploadTask2, stackTraceString2, -3003, 0);
        } else if (uploadAudio.mo5545d().error_code != 0) {
            String baseResponse2 = uploadAudio.mo5545d().toString();
            C89219l.m154716b(baseResponse2, "");
            m137844a(originalSoundUploadTask2, baseResponse2, -3003, 0);
        } else {
            m137844a(originalSoundUploadTask2, "", 0, 1);
        }
        return uploadAudio;
    }

    @Override // androidx.core.app.AbstractServiceC0583f
    public final void onHandleWork(Intent intent) {
        C89219l.m154721d(intent, "");
        Context applicationContext = getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        C79023a a = C79023a.C79024a.m137854a(applicationContext);
        String sdkV4AuthKey = C63244g.m114602a().mo73277e().getSdkV4AuthKey("");
        if (!TextUtils.isEmpty(sdkV4AuthKey)) {
            C65611c cVar = (C65611c) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46670a(sdkV4AuthKey, C65611c.class);
            C89219l.m154716b(cVar, "");
            C65614f fVar = cVar.f147851a;
            if (fVar != null) {
                C89219l.m154716b(fVar, "");
                ArrayList<OriginalSoundUploadTask> a2 = a.mo122848a();
                C89219l.m154721d(a2, "");
                ArrayList<C79025b> arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (T t : a2) {
                    String str = t.f177622e;
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str, obj);
                    }
                    ((List) obj).add(t);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List<OriginalSoundUploadTask> list = (List) entry.getValue();
                    if (str2 == null || str2.length() == 0) {
                        for (OriginalSoundUploadTask originalSoundUploadTask : list) {
                            arrayList.add(new C79025b().mo122854a(originalSoundUploadTask));
                        }
                    } else {
                        C79025b bVar = new C79025b();
                        for (OriginalSoundUploadTask originalSoundUploadTask2 : list) {
                            bVar.mo122854a(originalSoundUploadTask2);
                        }
                        arrayList.add(bVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (System.currentTimeMillis() - ((OriginalSoundUploadTask) C89070n.m154579f((List) ((C79025b) obj2).f177631a)).f177621d > 21600000) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList<C79025b> arrayList3 = arrayList2;
                arrayList.removeAll(arrayList3);
                for (C79025b bVar2 : arrayList3) {
                    m137846a(bVar2, a);
                    m137849b(bVar2);
                }
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("original_sound", "pending task count: " + arrayList.size());
                for (C79025b bVar3 : arrayList) {
                    if (C68718w.m121151a()) {
                        a.mo122851b(bVar3);
                    }
                    m137843a(bVar3, fVar).mo5537b(new C79019c(this, a, fVar)).mo5532a(new C79020d(bVar3, this, a, fVar)).mo5532a(new C79021e(bVar3)).mo5547f();
                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("original_sound", "original sound upload success.");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$b */
    public static final class C79018b implements TTVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ OriginalSoundUploadService f177605a;

        /* renamed from: b */
        final /* synthetic */ C65614f f177606b;

        /* renamed from: c */
        final /* synthetic */ OriginalSoundUploadTask f177607c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f177608d;

        /* renamed from: e */
        final /* synthetic */ C1743j f177609e;

        static {
            Covode.recordClassIndex(92185);
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final String getStringFromExtern(int i) {
            return null;
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onUploadVideoStage(int i, long j) {
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final int videoUploadCheckNetState(int i, int i2) {
            return C73849b.m129923a(this.f177606b, "OriginalSoundUpload");
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onLog(int i, int i2, String str) {
            C73836a.m129899a(i, str);
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            Long l;
            Long l2;
            long j2;
            if (i == 0) {
                OriginalSoundUploadTask originalSoundUploadTask = this.f177607c;
                if (tTVideoInfo == null) {
                    C89219l.m154715b();
                }
                originalSoundUploadTask.f177623f = tTVideoInfo.mVideoId;
                this.f177608d.element.close();
                this.f177609e.mo5557b(this.f177607c);
            } else if (i == 2) {
                JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
                StringBuilder sb = new StringBuilder("upload failed. error code is ");
                String str = null;
                if (tTVideoInfo != null) {
                    l = Long.valueOf(tTVideoInfo.mErrcode);
                } else {
                    l = null;
                }
                OriginalSoundUploadService.m137847a(sb.append(l).append(" video id = ").append(this.f177607c.f177623f).toString());
                this.f177608d.element.close();
                this.f177609e.mo5556b((Exception) new IllegalArgumentException("upload failed " + j + '.'));
                OriginalSoundUploadTask originalSoundUploadTask2 = this.f177607c;
                StringBuilder sb2 = new StringBuilder("upload errcode: ");
                if (tTVideoInfo != null) {
                    l2 = Long.valueOf(tTVideoInfo.mErrcode);
                } else {
                    l2 = null;
                }
                StringBuilder append = sb2.append(l2).append(" extra : ");
                if (tTVideoInfo != null) {
                    str = tTVideoInfo.mExtra;
                }
                String sb3 = append.append(str).append(" events: ").append(popAllEvents).append(' ').toString();
                if (tTVideoInfo != null) {
                    j2 = tTVideoInfo.mErrcode;
                } else {
                    j2 = 0;
                }
                OriginalSoundUploadService.m137845a(originalSoundUploadTask2, sb3, Long.valueOf(j2));
            }
        }

        C79018b(OriginalSoundUploadService originalSoundUploadService, C65614f fVar, OriginalSoundUploadTask originalSoundUploadTask, C89233z.C89238e eVar, C1743j jVar) {
            this.f177605a = originalSoundUploadService;
            this.f177606b = fVar;
            this.f177607c = originalSoundUploadTask;
            this.f177608d = eVar;
            this.f177609e = jVar;
        }
    }

    /* renamed from: a */
    private final C1731i<OriginalSoundUploadTask> m137841a(OriginalSoundUploadTask originalSoundUploadTask, C65614f fVar) {
        if (originalSoundUploadTask.f177623f != null) {
            C1731i<OriginalSoundUploadTask> a = C1731i.m5633a(originalSoundUploadTask);
            C89219l.m154716b(a, "");
            return a;
        }
        int checkAudioFile = VEUtils.checkAudioFile(originalSoundUploadTask.f177620c);
        if (checkAudioFile != 0) {
            m137847a("file error, " + originalSoundUploadTask.f177620c + " checkResult = " + checkAudioFile + " video id = " + originalSoundUploadTask.f177623f);
            C1731i<OriginalSoundUploadTask> a2 = C1731i.m5632a((Exception) new IllegalStateException("file error, " + originalSoundUploadTask.f177620c + " checkResult = " + checkAudioFile));
            C89219l.m154716b(a2, "");
            return a2;
        }
        C1743j jVar = new C1743j();
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        try {
            C63253l.f143623a.mo73329y().mo101687a("ttvideouploader");
            eVar.element = (T) new TTVideoUploader();
            eVar.element.setListener(new C79018b(this, fVar, originalSoundUploadTask, eVar, jVar));
            eVar.element.setMaxFailTime(fVar.f147893h);
            eVar.element.setEnableLogCallBack(fVar.f147906u);
            eVar.element.setSliceSize(fVar.f147891f);
            eVar.element.setFileUploadDomain(fVar.f147887b);
            eVar.element.setVideoUploadDomain(fVar.f147888c);
            eVar.element.setSliceTimeout(fVar.f147889d);
            eVar.element.setPathName(originalSoundUploadTask.f177620c);
            int i = fVar.f147895j;
            C71799eg.f160907a.mo113452a(eVar.element, i);
            eVar.element.setFileRetryCount(1);
            eVar.element.setUserKey(fVar.f147886a);
            eVar.element.setAuthorization(fVar.f147894i);
            eVar.element.setSocketNum(1);
            eVar.element.start();
        } catch (Exception e) {
            m137847a("exception, video id = " + originalSoundUploadTask.f177623f);
            T t = eVar.element;
            if (t != null) {
                t.close();
            }
            String stackTraceString = Log.getStackTraceString(e);
            C89219l.m154716b(stackTraceString, "");
            m137845a(originalSoundUploadTask, stackTraceString, 0L);
            jVar.mo5556b(e);
        }
        C1731i<TResult> iVar = jVar.f5610a;
        C89219l.m154716b(iVar, "");
        return iVar;
    }

    /* renamed from: a */
    private final C1731i<C79025b> m137843a(C79025b bVar, C65614f fVar) {
        for (T t : bVar.f177631a) {
            try {
                C1731i<OriginalSoundUploadTask> a = m137841a((OriginalSoundUploadTask) t, fVar);
                a.mo5547f();
                if (a.mo5544c() || a.mo5539b()) {
                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("original_sound", "upload failed for awemeId: " + t.f177618a + ", reason: " + Log.getStackTraceString(a.mo5546e()));
                } else {
                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("original_sound", "upload uri: " + t.f177623f + ", awemeId: " + t.f177618a + " success");
                }
            } catch (Exception e) {
                String str = "upload interrupted for awemeId: " + t.f177618a + ", reason: " + Log.getStackTraceString(e);
                m137847a(str);
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("original_sound", str);
            }
        }
        C1731i<C79025b> a2 = C1731i.m5633a(bVar);
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: a */
    public static void m137845a(OriginalSoundUploadTask originalSoundUploadTask, String str, Long l) {
        long j;
        C78548j jVar = new C78548j();
        jVar.f176534a = originalSoundUploadTask.f177618a;
        jVar.f176538e = Boolean.valueOf(originalSoundUploadTask.f177627j);
        jVar.f176537d = Boolean.valueOf(originalSoundUploadTask.f177625h);
        jVar.f176535b = originalSoundUploadTask.f177624g;
        jVar.f176536c = Integer.valueOf(originalSoundUploadTask.f177626i);
        boolean z = true;
        if (originalSoundUploadTask.f177628k <= 1) {
            z = false;
        }
        jVar.f176541h = Boolean.valueOf(z);
        jVar.f176540g = 0;
        jVar.mo122480a(str);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        jVar.f176542i = j;
        jVar.f176539f = -3001;
        C78507ab.m137081b(jVar);
    }

    /* renamed from: a */
    private static void m137844a(OriginalSoundUploadTask originalSoundUploadTask, String str, int i, int i2) {
        C78548j jVar = new C78548j();
        jVar.f176534a = originalSoundUploadTask.f177618a;
        jVar.f176538e = Boolean.valueOf(originalSoundUploadTask.f177627j);
        jVar.f176537d = Boolean.valueOf(originalSoundUploadTask.f177625h);
        jVar.f176535b = originalSoundUploadTask.f177624g;
        jVar.f176536c = Integer.valueOf(originalSoundUploadTask.f177626i);
        boolean z = true;
        if (originalSoundUploadTask.f177628k <= 1) {
            z = false;
        }
        jVar.f176541h = Boolean.valueOf(z);
        jVar.f176540g = i2;
        jVar.mo122480a(str);
        jVar.f176539f = Integer.valueOf(i);
        C78507ab.m137081b(jVar);
    }
}
