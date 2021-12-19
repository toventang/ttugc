package com.p2082ss.android.ugc.aweme.tools.extract.video;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.AbstractServiceC0617o;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.plugin.C63124a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65612d;
import com.p2082ss.android.ugc.aweme.setting.C68718w;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import com.p2082ss.android.ugc.aweme.tools.extract.C78548j;
import com.p2082ss.android.ugc.aweme.tools.extract.video.C78565a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import com.p2082ss.ttuploader.TTImageUploader;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService */
public class VideoFramesUploadService extends AbstractServiceC0617o {

    /* renamed from: a */
    static final String f176559a = VideoFramesUploadService.class.getSimpleName();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService$FramesUploadApi */
    public interface FramesUploadApi {
        static {
            Covode.recordClassIndex(91698);
        }

        @AbstractC89731o(mo144285a = "/aweme/v2/aweme/vframe/update/")
        @AbstractC89721e
        C1731i<BaseResponse> uploadFrame(@AbstractC89719c(mo144273a = "aweme_id") String str, @AbstractC89719c(mo144273a = "video_id") String str2, @AbstractC89719c(mo144273a = "vframe_uri") String str3);

        @AbstractC89731o(mo144285a = "/aweme/v2/aweme/vframe/update/")
        @AbstractC89721e
        C1731i<BaseResponse> uploadFrame(@AbstractC89719c(mo144273a = "aweme_id") String str, @AbstractC89719c(mo144273a = "video_id") String str2, @AbstractC89719c(mo144273a = "vframe_uri") String str3, @AbstractC89719c(mo144273a = "stickers") String str4);

        @AbstractC89731o(mo144285a = "/tiktok/v1/multi/vframe/update/")
        @AbstractC89721e
        C1731i<BaseResponse> uploadMultiFrame(@AbstractC89719c(mo144273a = "vframe_requests") JSONArray jSONArray);
    }

    @Override // androidx.core.app.AbstractServiceC0583f
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo122490a(C1731i iVar) {
        if (iVar.mo5544c()) {
            m137169a(15, "failed total: " + iVar.mo5546e().getMessage());
            iVar.mo5546e().printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    private static void m137173a(C78580o oVar, String str, int i) {
        C78548j jVar = new C78548j();
        jVar.f176534a = oVar.f176586a;
        jVar.f176538e = Boolean.valueOf(oVar.f176596k);
        jVar.f176537d = Boolean.valueOf(oVar.f176594i);
        jVar.f176535b = oVar.f176593h;
        jVar.f176536c = Integer.valueOf(oVar.f176595j);
        boolean z = true;
        if (oVar.f176597l <= 1) {
            z = false;
        }
        jVar.f176541h = Boolean.valueOf(z);
        jVar.mo122480a(str);
        jVar.f176540g = 0;
        jVar.f176539f = Integer.valueOf(i);
        C78507ab.m137077a(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1731i<C78582p> mo122489a(C78582p pVar, C65612d dVar) {
        for (C78580o oVar : pVar.f176610a) {
            try {
                C1731i<C78580o> a = m137166a(oVar, dVar);
                a.mo5547f();
                if (a.mo5544c() || a.mo5539b()) {
                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "upload failed for awemeId: " + oVar.f176586a + ", reason: " + Log.getStackTraceString(a.mo5546e()));
                } else {
                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "upload uri: " + oVar.f176588c + ", awemeId: " + oVar.f176586a + " success");
                }
            } catch (InterruptedException e) {
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "upload interrupted for awemeId: " + oVar.f176586a + ", reason: " + Log.getStackTraceString(e));
            }
        }
        return C1731i.m5633a(pVar);
    }

    /* renamed from: a */
    static boolean m137175a() {
        return C63244g.m114602a().mo73255A() != null && C63244g.m114602a().mo73255A().mo93901a();
    }

    static {
        Covode.recordClassIndex(91697);
    }

    /* renamed from: a */
    private static void m137170a(C78580o oVar) {
        boolean z;
        C78548j jVar = new C78548j();
        jVar.f176534a = oVar.f176586a;
        jVar.f176538e = Boolean.valueOf(oVar.f176596k);
        jVar.f176537d = Boolean.valueOf(oVar.f176594i);
        jVar.f176535b = oVar.f176593h;
        jVar.f176536c = Integer.valueOf(oVar.f176595j);
        if (oVar.f176597l > 1) {
            z = true;
        } else {
            z = false;
        }
        jVar.f176541h = Boolean.valueOf(z);
        jVar.f176540g = 1;
        C78507ab.m137077a(jVar);
    }

    /* renamed from: b */
    private static void m137177b(C78582p pVar) {
        for (C78580o oVar : pVar.f176610a) {
            C78548j jVar = new C78548j();
            jVar.f176534a = oVar.f176586a;
            jVar.f176538e = Boolean.valueOf(oVar.f176596k);
            jVar.f176537d = Boolean.valueOf(oVar.f176594i);
            jVar.f176535b = oVar.f176593h;
            jVar.f176536c = Integer.valueOf(oVar.f176595j);
            boolean z = true;
            if (oVar.f176597l <= 1) {
                z = false;
            }
            jVar.f176541h = Boolean.valueOf(z);
            jVar.f176540g = 0;
            jVar.f176539f = -4001;
            C78507ab.m137082c(jVar);
        }
    }

    /* renamed from: a */
    static C1731i<BaseResponse> m137167a(C78582p pVar) {
        C1731i<BaseResponse> uploadFrame;
        try {
            FramesUploadApi framesUploadApi = (FramesUploadApi) RetrofitFactory.m33635a().mo28816a(AVApiImpl.m123134b().mo109850a()).mo28858a(FramesUploadApi.class);
            if (pVar.f176610a.isEmpty()) {
                return C1731i.m5632a((Exception) new IllegalStateException("VideoFramesUploadModel is empty"));
            }
            if (pVar.f176610a.size() > 1) {
                C1731i<BaseResponse> uploadMultiFrame = framesUploadApi.uploadMultiFrame(C78578m.m137188a(pVar));
                uploadMultiFrame.mo5547f();
                for (C78580o oVar : pVar.f176610a) {
                    if (!uploadMultiFrame.mo5535a()) {
                        m137173a(oVar, "task fail with exception : " + Log.getStackTraceString(uploadMultiFrame.mo5546e()), -3003);
                    } else if (uploadMultiFrame.mo5545d().status_code == 0) {
                        m137170a(oVar);
                    } else {
                        m137173a(oVar, "response: " + uploadMultiFrame.mo5545d().toString(), -3003);
                    }
                }
                return uploadMultiFrame;
            }
            C78580o oVar2 = pVar.f176610a.get(0);
            if (oVar2.f176590e == null || oVar2.f176590e.getStickerIds() == null) {
                uploadFrame = framesUploadApi.uploadFrame(oVar2.f176586a, oVar2.f176587b, oVar2.f176588c);
            } else {
                uploadFrame = framesUploadApi.uploadFrame(oVar2.f176586a, oVar2.f176587b, oVar2.f176588c, oVar2.f176590e.getStickerIds());
            }
            uploadFrame.mo5547f();
            if (!uploadFrame.mo5535a()) {
                m137173a(oVar2, "task fail with exception : " + Log.getStackTraceString(uploadFrame.mo5546e()), -3002);
            } else if (uploadFrame.mo5545d().status_code == 0) {
                m137170a(oVar2);
            } else {
                m137173a(oVar2, "response: " + uploadFrame.mo5545d().toString(), -3002);
            }
            return uploadFrame;
        } catch (Exception e) {
            return C1731i.m5632a(e);
        }
    }

    @Override // androidx.core.app.AbstractServiceC0583f
    public void onHandleWork(Intent intent) {
        String str;
        if (!C63238c.f143594u.mo93901a()) {
            Context applicationContext = getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C78579n a = C78579n.m137189a(applicationContext);
            if (intent != null) {
                str = m137168a(intent, "authkey");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                C65611c cVar = null;
                try {
                    cVar = (C65611c) new C27917g().mo46682b().mo46670a(str, C65611c.class);
                } catch (Exception unused) {
                }
                if (!(cVar == null || cVar.f147854d == null)) {
                    List<C78580o> a2 = a.mo122498a();
                    C89219l.m154721d(a2, "");
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (T t : a2) {
                        String str2 = t.f176592g;
                        Object obj = linkedHashMap.get(str2);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(str2, obj);
                        }
                        ((List) obj).add(t);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        List<C78580o> list = (List) entry.getValue();
                        if (str3 == null || str3.length() == 0) {
                            for (C78580o oVar : list) {
                                arrayList.add(new C78582p().mo122505a(oVar));
                            }
                        } else {
                            C78582p pVar = new C78582p();
                            for (C78580o oVar2 : list) {
                                pVar.mo122505a(oVar2);
                            }
                            arrayList.add(pVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "task is empty");
                        return;
                    }
                    if (C68718w.m121151a()) {
                        a.mo122501a(arrayList);
                    }
                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "pending task count: " + arrayList.size());
                    for (C78582p pVar2 : arrayList) {
                        if (!pVar2.f176610a.isEmpty()) {
                            if (System.currentTimeMillis() - pVar2.f176610a.get(0).f176591f > 21600000) {
                                m137177b(pVar2);
                                m137174a(pVar2, a);
                            } else {
                                try {
                                    m137176b(pVar2, a).mo5537b(new C78583q(this, a, pVar2, cVar)).mo5537b(new C78584r(this, a)).mo5532a(new C78585s(this, pVar2, a)).mo5532a(new C78586t(this)).mo5547f();
                                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "upload extract frame success.");
                                } catch (InterruptedException e) {
                                    m137169a(15, "failed interrupt: " + e.getMessage());
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static String m137168a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m137174a(C78582p pVar, C78579n nVar) {
        for (C78580o oVar : pVar.f176610a) {
            m137172a(oVar, nVar);
        }
    }

    /* renamed from: a */
    static void m137169a(int i, String str) {
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "msg = ".concat(String.valueOf(str)));
        C78507ab.m137078a((Object) null, -1, i, str);
        C63244g.m114602a();
    }

    /* renamed from: a */
    private C1731i<C78580o> m137166a(C78580o oVar, C65612d dVar) {
        if (m137175a()) {
            return C1731i.m5632a((Exception) new IllegalStateException("stop task manually for specified case"));
        }
        if (!TextUtils.isEmpty(oVar.f176588c)) {
            C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "skip upload");
            return C1731i.m5633a(oVar);
        }
        C1743j jVar = new C1743j();
        try {
            TTImageUploader a = C63124a.m114067a();
            a.setListener(new C78587u(this, a, oVar, jVar));
            C78565a.C78566a.m137180a(a, dVar);
            a.setSliceSize(dVar.f147860f);
            a.setFileUploadDomain(dVar.f147856b);
            a.setImageUploadDomain(dVar.f147857c);
            if (dVar.f147861g != 0) {
                a.setSliceTimeout(dVar.f147861g);
            } else {
                a.setSliceTimeout(SettingsManager.m29616a().mo25394a("client_video_frame_uploader_timeout", 60));
            }
            a.setSliceReTryCount(dVar.f147862h);
            int i = 1;
            a.setFilePath(1, new String[]{oVar.f176589d});
            if (dVar.f147858d > 0) {
                i = dVar.f147858d;
            }
            a.setFileRetryCount(i);
            a.setUserKey(dVar.f147855a);
            a.setEnableHttps(dVar.f147864j);
            a.setAuthorization(dVar.f147863i);
            try {
                a.start();
                return jVar.f5610a;
            } catch (Exception e) {
                m137169a(15, "upload zip file exception step 1 video id = " + oVar.f176587b + ", msg: " + Log.getStackTraceString(e));
                a.close();
                m137171a(oVar, 0, Log.getStackTraceString(e));
                throw e;
            }
        } catch (Throwable th) {
            m137169a(15, "upload zip file exception step 2 video id = " + oVar.f176587b + ", msg: " + Log.getStackTraceString(th));
            m137171a(oVar, 0, Log.getStackTraceString(th));
            jVar.mo5556b(new Exception(th));
        }
    }

    /* renamed from: b */
    private C1731i<C78582p> m137176b(C78582p pVar, C78579n nVar) {
        C1731i iVar;
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "ready to package zip");
        Iterator<C78580o> it = pVar.f176610a.iterator();
        while (it.hasNext()) {
            C78580o next = it.next();
            if (next == null) {
                try {
                    m137169a(14, "model == null");
                    iVar = C1731i.m5632a((Exception) new IllegalStateException("the upload model is null"));
                } catch (InterruptedException e) {
                    C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "zip interrupted for awemeId: " + next.f176586a + ", reason: " + Log.getStackTraceString(e));
                }
            } else {
                if (TextUtils.isEmpty(next.f176589d) || !new File(next.f176589d).exists()) {
                    ExtractFramesModel extractFramesModel = next.f176590e;
                    if (extractFramesModel == null) {
                        iVar = C1731i.m5632a((Exception) new IllegalStateException("the upload frameModel is null"));
                    } else {
                        List<FrameItem> allFrames = next.f176590e.getAllFrames();
                        if (allFrames.isEmpty()) {
                            iVar = C1731i.m5632a((Exception) new IllegalStateException("the upload frames is empty"));
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (FrameItem frameItem : allFrames) {
                                if (!C80720e.m139927b(frameItem.getPath())) {
                                    m137169a(14, "extract file does not exist, video id = " + next.f176587b + ", dir:" + frameItem.getPath());
                                } else if (!arrayList.contains(frameItem.getPath())) {
                                    arrayList.add(frameItem.getPath());
                                }
                            }
                            next.f176589d = C84915u.m145940a(extractFramesModel.getExtractFramesDir(), arrayList);
                            if (next.f176589d == null || !C80720e.m139927b(next.f176589d)) {
                                m137169a(14, "upload zipPath is empty video id = " + next.f176587b + " , zipPath: " + next.f176589d);
                                iVar = C1731i.m5632a((Exception) new IllegalStateException("the upload zipPath is empty"));
                            } else {
                                long length = new File(next.f176589d).length();
                                if (length < 100) {
                                    m137169a(15, "upload zip size == " + length + " video id = " + next.f176587b);
                                }
                            }
                        }
                    }
                }
                iVar = C1731i.m5633a(next);
            }
            iVar.mo5547f();
            if (iVar.mo5544c() || iVar.mo5539b()) {
                it.remove();
                m137172a(next, nVar);
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "zip failed for awemeId: " + next.f176586a + ", reason: " + Log.getStackTraceString(iVar.mo5546e()));
                C78548j jVar = new C78548j();
                jVar.f176534a = next.f176586a;
                jVar.f176538e = Boolean.valueOf(next.f176596k);
                jVar.f176537d = Boolean.valueOf(next.f176594i);
                jVar.f176535b = next.f176593h;
                jVar.f176536c = Integer.valueOf(next.f176595j);
                boolean z = true;
                if (next.f176597l <= 1) {
                    z = false;
                }
                jVar.f176541h = Boolean.valueOf(z);
                jVar.f176540g = 0;
                jVar.mo122480a(Log.getStackTraceString(iVar.mo5546e()));
                jVar.f176539f = -2001;
                C78507ab.m137077a(jVar);
            } else {
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "zip path: " + next.f176589d + ", awemeId: " + next.f176586a + " success");
            }
        }
        return C1731i.m5633a(pVar);
    }

    /* renamed from: a */
    private static void m137172a(C78580o oVar, C78579n nVar) {
        nVar.mo122500a(oVar.f176586a);
        if (oVar.f176590e != null) {
            C80720e.m139938e(oVar.f176590e.getExtractFramesDir());
            C80720e.m139931c(oVar.f176590e.getExtractFramesDir());
        }
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "cleanup frame, awemeId: " + oVar.f176586a);
    }

    /* renamed from: a */
    static void m137171a(C78580o oVar, long j, String str) {
        C78548j jVar = new C78548j();
        jVar.f176534a = oVar.f176586a;
        jVar.f176538e = Boolean.valueOf(oVar.f176596k);
        jVar.f176537d = Boolean.valueOf(oVar.f176594i);
        jVar.f176535b = oVar.f176593h;
        jVar.f176536c = Integer.valueOf(oVar.f176595j);
        boolean z = true;
        if (oVar.f176597l <= 1) {
            z = false;
        }
        jVar.f176541h = Boolean.valueOf(z);
        jVar.f176542i = j;
        jVar.f176540g = 0;
        jVar.mo122480a(str);
        jVar.f176539f = -3001;
        C78507ab.m137077a(jVar);
    }
}
