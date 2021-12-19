package com.p2082ss.android.ugc.aweme.external.p2915a;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70645dp;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78901e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.a.f */
public final class C47104f implements IOpenPhotoNextService {
    static {
        Covode.recordClassIndex(55708);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.f$a */
    static final class RunnableC47105a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f109687a;

        /* renamed from: b */
        final /* synthetic */ boolean f109688b;

        /* renamed from: c */
        final /* synthetic */ Bundle f109689c;

        /* renamed from: d */
        final /* synthetic */ List f109690d;

        /* renamed from: e */
        final /* synthetic */ IPageToFinish f109691e;

        static {
            Covode.recordClassIndex(55709);
        }

        RunnableC47105a(ActivityC0945e eVar, boolean z, Bundle bundle, List list, IPageToFinish iPageToFinish) {
            this.f109687a = eVar;
            this.f109688b = z;
            this.f109689c = bundle;
            this.f109690d = list;
            this.f109691e = iPageToFinish;
        }

        public final void run() {
            C78901e eVar = new C78901e(this.f109687a, this.f109688b);
            Bundle bundle = this.f109689c;
            ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
            shortVideoContext.f155830o = bundle.getString("creation_id");
            shortVideoContext.f155831p = bundle.getString("shoot_way");
            shortVideoContext.f155833r = bundle.getString("shoot_from");
            shortVideoContext.f155837v = bundle.getString("enter_from");
            shortVideoContext.f155838w = bundle.getString("enter_method");
            shortVideoContext.f155839x = bundle.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
            shortVideoContext.f155803am = (UrlModel) bundle.getSerializable("send_to_user_head");
            shortVideoContext.f155840y = (C39078ad) bundle.getSerializable("open_platform_share_context");
            shortVideoContext.f155740A = 0;
            shortVideoContext.mo110005a(C69744c.m123266a());
            shortVideoContext.mo110000a(C63238c.f143588o.getVideoWidth());
            shortVideoContext.mo110015b(C63238c.f143588o.getVideoHeight());
            shortVideoContext.mo110006a(new C70650dt());
            shortVideoContext.mo110016b(0L);
            shortVideoContext.mo110019c(C65357b.m117043a() ? 1 : 0);
            shortVideoContext.mo110028e(C70645dp.m124866a().mo110180a());
            if (bundle.getParcelable("stitch_params") != null) {
                shortVideoContext.mo110009a((StitchParams) bundle.getParcelable("stitch_params"));
            } else {
                shortVideoContext.mo110035k();
            }
            C89219l.m154716b(shortVideoContext, "");
            if (C89219l.m154714a((Object) "system_upload", (Object) shortVideoContext.f155831p) || C89219l.m154714a((Object) "lv_sync", (Object) shortVideoContext.f155831p)) {
                C70005cr.m123611a().mo110453c();
            }
            eVar.mo122723a(shortVideoContext, this.f109690d, new C78901e.AbstractC78903b(this) {
                /* class com.p2082ss.android.ugc.aweme.external.p2915a.C47104f.RunnableC47105a.C471061 */

                /* renamed from: a */
                final /* synthetic */ RunnableC47105a f109692a;

                static {
                    Covode.recordClassIndex(55710);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f109692a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78901e.AbstractC78903b
                /* renamed from: a */
                public final void mo79422a(boolean z) {
                    this.f109692a.f109691e.onFinish(z);
                }
            }, true, Long.valueOf(System.currentTimeMillis()), true, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService
    public final void gotoNextPage(ActivityC0945e eVar, boolean z, Bundle bundle, List<String> list, IPageToFinish iPageToFinish) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(iPageToFinish, "");
        eVar.runOnUiThread(new RunnableC47105a(eVar, z, bundle, list, iPageToFinish));
    }
}
