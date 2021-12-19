package com.bytedance.tiktok.homepage.mainfragment;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22772b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71898d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.a */
public class C22764a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    AbstractC22772b f53764a;

    static {
        Covode.recordClassIndex(26657);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(351, new RunnableC90250g(C22764a.class, "onPublishStatusUpdate", C71900f.class, ThreadMode.POSTING, 0, true));
        hashMap.put(363, new RunnableC90250g(C22764a.class, "onHideUploadRecoverEvent", C71898d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public C22764a(AbstractC22772b bVar) {
        this.f53764a = bVar;
    }

    @AbstractC90264r
    public void onHideUploadRecoverEvent(C71898d dVar) {
        boolean z = dVar.f161086a;
        if (this.f53764a.af_()) {
            AVExternalServiceImpl.m113114a().publishService().hideUploadRecoverWindow(this.f53764a.getActivity(), z);
        }
    }

    @AbstractC90264r(mo145423b = true)
    public void onPublishStatusUpdate(C71900f fVar) {
        if (this.f53764a.af_()) {
            if (fVar.f161088b == 9 && fVar.f161092f && !fVar.f161097k && !fVar.f161098l) {
                mo37078a(fVar, fVar.f161093g, "publish status failed", fVar.f161091e);
            }
            if (fVar.f161088b == 10 && (fVar.f161090d instanceof Aweme)) {
                try {
                    Aweme aweme = (Aweme) fVar.f161090d;
                    long createTime = aweme.getCreateTime() - (Calendar.getInstance().getTimeInMillis() / 1000);
                    if (createTime < -120 || createTime > 10) {
                        C12290b.m22064a("aweme_publish_upload_create_time_error", new C33743c().mo59976a("server_create_time", String.valueOf(aweme.getCreateTime())).mo59976a("client_insert_time", String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000)).mo59976a("group_id", aweme.getAid()).mo59977a());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37078a(C71900f fVar, boolean z, String str, String str2) {
        String str3;
        IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
        if (fVar != null) {
            str3 = fVar.f161099m;
        } else {
            str3 = null;
        }
        if (!publishService.isParallelPublishEnabled()) {
            publishService.showUploadRecoverIfNeed(z, this.f53764a.getActivity(), str, str2, str3);
        } else if (fVar == null) {
            publishService.tryRestorePublish(this.f53764a.getActivity(), new C22765b(this, publishService, z, str, str2, str3));
        } else {
            publishService.showUploadRecoverIfNeed(z, this.f53764a.getActivity(), str, str2, str3);
        }
    }
}
