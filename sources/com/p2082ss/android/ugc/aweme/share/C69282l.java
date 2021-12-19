package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39091d;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.p2082ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl;
import com.p2082ss.android.ugc.aweme.openshare.C62723a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.EditConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IEditService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ShareConfig;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.share.C69502x;
import com.p2082ss.android.ugc.aweme.share.ClientKeyScopesResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.l */
public final class C69282l {

    /* renamed from: a */
    public static final C69283a f154831a = new C69283a((byte) 0);

    /* renamed from: b */
    private final String f154832b = "hashtag";

    static {
        Covode.recordClassIndex(81612);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.l$a */
    public static final class C69283a {
        static {
            Covode.recordClassIndex(81613);
        }

        private C69283a() {
        }

        public /* synthetic */ C69283a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.l$g */
    public static final class C69289g implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f154842a;

        /* renamed from: b */
        final /* synthetic */ C69282l f154843b;

        /* renamed from: c */
        final /* synthetic */ Activity f154844c;

        /* renamed from: d */
        final /* synthetic */ AbstractC39091d f154845d;

        /* renamed from: e */
        final /* synthetic */ C62723a f154846e;

        /* renamed from: f */
        final /* synthetic */ ClientKeyScopesResponse f154847f;

        /* renamed from: g */
        final /* synthetic */ boolean f154848g;

        static {
            Covode.recordClassIndex(81619);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            try {
                if (!this.f154844c.isFinishing()) {
                    this.f154844c.finish();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            try {
                if (!this.f154844c.isFinishing()) {
                    this.f154844c.finish();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            if (this.f154846e.f142191a == C62723a.f142184d) {
                EditConfig.Builder onEnterEdit = new EditConfig.Builder().shootWay(C69282l.m122483a(this.f154845d.mClientKey)).musicOrigin(C69282l.m122486b(this.f154845d.mClientKey)).creationId(uuid).onEnterEdit(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.share.C69282l.C69289g.C692901 */

                    /* renamed from: a */
                    final /* synthetic */ C69289g f154849a;

                    static {
                        Covode.recordClassIndex(81620);
                    }

                    {
                        this.f154849a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f154849a.f154842a.resumeWith(C89379q.m157068constructorimpl(true));
                        return C89391z.f203057a;
                    }
                });
                if (this.f154847f.getData() != null) {
                    C69282l lVar = this.f154843b;
                    ClientKeyScopesResponse clientKeyScopesResponse = this.f154847f;
                    AbstractC39091d dVar = this.f154845d;
                    if (onEnterEdit == null) {
                        C89219l.m154710a("builder");
                    }
                    lVar.mo109592a(clientKeyScopesResponse, dVar, onEnterEdit);
                }
                OpenPlatformServiceImpl.m113101b().mo100640a("system_upload", "video", uuid, "upload");
                AbstractC39091d dVar2 = this.f154845d;
                Objects.requireNonNull(dVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
                ShareConfig shareConfig = new ShareConfig((C39078ad) dVar2, 2);
                shareConfig.setFile(this.f154846e.f142192b.get(0));
                shareConfig.setAppName(this.f154845d.mAppName);
                IEditService editService = asyncAVService.uiService().editService();
                Activity activity = this.f154844c;
                if (onEnterEdit == null) {
                    C89219l.m154710a("builder");
                }
                editService.startEdit(activity, onEnterEdit.build(), shareConfig);
            } else if (this.f154846e.f142191a == C62723a.f142186f) {
                EditConfig.Builder onEnterEdit2 = new EditConfig.Builder().shootWay(C69282l.m122483a(this.f154845d.mClientKey)).musicOrigin(C69282l.m122486b(this.f154845d.mClientKey)).creationId(uuid).onEnterEdit(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.share.C69282l.C69289g.C692912 */

                    /* renamed from: a */
                    final /* synthetic */ C69289g f154850a;

                    static {
                        Covode.recordClassIndex(81621);
                    }

                    {
                        this.f154850a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f154850a.f154842a.resumeWith(C89379q.m157068constructorimpl(true));
                        return C89391z.f203057a;
                    }
                });
                if (this.f154847f.getData() != null) {
                    C69282l lVar2 = this.f154843b;
                    ClientKeyScopesResponse clientKeyScopesResponse2 = this.f154847f;
                    AbstractC39091d dVar3 = this.f154845d;
                    if (onEnterEdit2 == null) {
                        C89219l.m154710a("builder");
                    }
                    lVar2.mo109592a(clientKeyScopesResponse2, dVar3, onEnterEdit2);
                }
                OpenPlatformServiceImpl.m113101b().mo100640a(C69282l.m122483a(this.f154845d.mClientKey), "video", uuid, "upload");
                AbstractC39091d dVar4 = this.f154845d;
                Objects.requireNonNull(dVar4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
                ShareConfig shareConfig2 = new ShareConfig((C39078ad) dVar4, 4);
                shareConfig2.setVideoList(this.f154846e.f142192b);
                shareConfig2.setAppName(this.f154845d.mAppName);
                IEditService editService2 = asyncAVService.uiService().editService();
                Activity activity2 = this.f154844c;
                if (onEnterEdit2 == null) {
                    C89219l.m154710a("builder");
                }
                editService2.startEdit(activity2, onEnterEdit2.build(), shareConfig2);
            } else if (this.f154846e.f142191a == C62723a.f142183c || this.f154846e.f142191a == C62723a.f142185e) {
                this.f154845d.mTargetSceneType = 1;
                Bundle shareRequestBundle = this.f154845d.getShareRequestBundle();
                shareRequestBundle.putString("creation_id", UUID.randomUUID().toString());
                shareRequestBundle.putString("shoot_way", C69282l.m122483a(this.f154845d.mClientKey));
                shareRequestBundle.putString("enter_from", "open_platform_share");
                if (this.f154848g) {
                    shareRequestBundle.putSerializable("open_platform_share_context", this.f154845d);
                }
                IOpenPhotoNextService openGotoNextService = AVExternalServiceImpl.m113114a().openGotoNextService();
                Activity activity3 = this.f154844c;
                Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                C89219l.m154716b(shareRequestBundle, "");
                openGotoNextService.gotoNextPage((ActivityC0945e) activity3, false, shareRequestBundle, this.f154846e.f142192b, new IPageToFinish(this) {
                    /* class com.p2082ss.android.ugc.aweme.share.C69282l.C69289g.C692923 */

                    /* renamed from: a */
                    final /* synthetic */ C69289g f154851a;

                    static {
                        Covode.recordClassIndex(81622);
                    }

                    {
                        this.f154851a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IPageToFinish
                    public final void onFinish(boolean z) {
                        if (!z) {
                            new C79459a(this.f154851a.f154844c).mo123050a(R.string.g1e).mo123053a();
                        }
                        this.f154851a.f154842a.resumeWith(C89379q.m157068constructorimpl(true));
                    }
                });
            }
        }

        C69289g(AbstractC89124d dVar, C69282l lVar, Activity activity, AbstractC39091d dVar2, C62723a aVar, ClientKeyScopesResponse clientKeyScopesResponse, boolean z) {
            this.f154842a = dVar;
            this.f154843b = lVar;
            this.f154844c = activity;
            this.f154845d = dVar2;
            this.f154846e = aVar;
            this.f154847f = clientKeyScopesResponse;
            this.f154848g = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.l$f */
    public static final class C69288f implements AbstractC63212bb.AbstractC63213a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f154841a;

        static {
            Covode.recordClassIndex(81618);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
        public final void onSuccess() {
            this.f154841a.resumeWith(C89379q.m157068constructorimpl(true));
        }

        C69288f(AbstractC89124d dVar) {
            this.f154841a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.l$b */
    public static final class C69284b implements AbstractC69359p {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f154833a;

        static {
            Covode.recordClassIndex(81614);
        }

        C69284b(AbstractC89124d dVar) {
            this.f154833a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69359p
        /* renamed from: a */
        public final void mo109594a(boolean z) {
            if (z) {
                C68959i iVar = new C68959i();
                iVar.f154271a = true;
                this.f154833a.resumeWith(C89379q.m157068constructorimpl(iVar));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69359p
        /* renamed from: a */
        public final void mo109593a(int i, String str) {
            C89219l.m154721d(str, "");
            C68959i iVar = new C68959i();
            iVar.f154271a = false;
            iVar.f154272b = i;
            iVar.mo109503a(str);
            this.f154833a.resumeWith(C89379q.m157068constructorimpl(iVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.l$c */
    public static final class C69285c implements AbstractC69359p {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f154834a;

        static {
            Covode.recordClassIndex(81615);
        }

        C69285c(AbstractC89124d dVar) {
            this.f154834a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69359p
        /* renamed from: a */
        public final void mo109594a(boolean z) {
            if (z) {
                C68959i iVar = new C68959i();
                iVar.f154271a = true;
                this.f154834a.resumeWith(C89379q.m157068constructorimpl(iVar));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69359p
        /* renamed from: a */
        public final void mo109593a(int i, String str) {
            C89219l.m154721d(str, "");
            C68959i iVar = new C68959i();
            iVar.f154271a = false;
            iVar.f154272b = i;
            iVar.mo109503a(str);
            this.f154834a.resumeWith(C89379q.m157068constructorimpl(iVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.l$d */
    public static final class C69286d implements AbstractC88406ae<ClientKeyScopesResponse> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f154835a;

        static {
            Covode.recordClassIndex(81616);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C69286d(AbstractC89124d dVar) {
            this.f154835a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(ClientKeyScopesResponse clientKeyScopesResponse) {
            C89219l.m154721d(clientKeyScopesResponse, "");
            this.f154835a.resumeWith(C89379q.m157068constructorimpl(clientKeyScopesResponse));
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f154835a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.l$e */
    public static final class C69287e implements AbstractC69359p {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f154836a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f154837b;

        /* renamed from: c */
        final /* synthetic */ C69282l f154838c;

        /* renamed from: d */
        final /* synthetic */ C69502x f154839d;

        /* renamed from: e */
        final /* synthetic */ boolean f154840e;

        static {
            Covode.recordClassIndex(81617);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69359p
        /* renamed from: a */
        public final void mo109594a(boolean z) {
            if (z) {
                C68959i iVar = new C68959i();
                iVar.f154271a = true;
                if (!this.f154836a.element) {
                    this.f154837b.resumeWith(C89379q.m157068constructorimpl(iVar));
                    this.f154836a.element = true;
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69359p
        /* renamed from: a */
        public final void mo109593a(int i, String str) {
            C68959i iVar;
            C89219l.m154721d(str, "");
            if (this.f154840e) {
                iVar = new C68959i();
                if (i == 20001) {
                    iVar.f154272b = 20001;
                    iVar.mo109503a("Unknown");
                } else if (i == -1 || i == -6) {
                    iVar.f154272b = 20007;
                    iVar.mo109503a("Video length doesn't meet requirements");
                } else if (i == -2) {
                    iVar.f154272b = 20012;
                    iVar.mo109503a("Video format is not supported");
                } else if (i == -4) {
                    iVar.f154272b = 20010;
                    iVar.mo109503a("Processing photo resources faild");
                } else if (i == -5) {
                    iVar.f154272b = 20011;
                    iVar.mo109503a("Video resolution doesn't meet requirements");
                } else {
                    iVar.f154272b = 22001;
                    iVar.mo109503a("Unsupported resolution");
                }
                iVar.f154271a = false;
            } else {
                iVar = new C68959i(false, str);
            }
            if (!this.f154836a.element) {
                this.f154837b.resumeWith(C89379q.m157068constructorimpl(iVar));
                this.f154836a.element = true;
            }
        }

        C69287e(C89233z.C89234a aVar, AbstractC89124d dVar, C69282l lVar, C69502x xVar, boolean z) {
            this.f154836a = aVar;
            this.f154837b = dVar;
            this.f154838c = lVar;
            this.f154839d = xVar;
            this.f154840e = z;
        }
    }

    /* renamed from: b */
    public static String m122486b(String str) {
        if (str == null) {
            return "original";
        }
        int hashCode = str.hashCode();
        if (hashCode != -475692960) {
            if (hashCode == 1382194030 && str.equals("aw7c4z4ej0o3efzd")) {
                return "lv_sync";
            }
            return "original";
        } else if (str.equals("aw889s25wozf8s7e")) {
            return "lv_sync";
        } else {
            return "original";
        }
    }

    /* renamed from: a */
    public static Object m122482a(AbstractC89124d<? super Boolean> dVar) {
        C89134h hVar = new C89134h(C89099b.m154605a(dVar));
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService().mo101685a(new C69288f(hVar));
        Object a = hVar.mo143576a();
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return a;
    }

    /* renamed from: a */
    public static String m122483a(String str) {
        if (str == null) {
            return "system_upload";
        }
        int hashCode = str.hashCode();
        if (hashCode != -475692960) {
            if (hashCode == 1382194030 && str.equals("aw7c4z4ej0o3efzd")) {
                return "lv_sync";
            }
            return "system_upload";
        } else if (str.equals("aw889s25wozf8s7e")) {
            return "lv_sync";
        } else {
            return "system_upload";
        }
    }

    /* renamed from: a */
    public static boolean m122484a(Activity activity) {
        C89219l.m154721d(activity, "");
        IExternalService a = AVExternalServiceImpl.m113114a();
        IAVPublishService publishService = a.publishService();
        if (publishService.isParallelPublishEnabled()) {
            if (!publishService.isPublishable()) {
                return true;
            }
            return false;
        } else if (!a.publishService().isPublishing() || !a.publishService().isPublishServiceRunning(activity)) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.l$h */
    public static final class C69293h implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f154852a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f154853b;

        static {
            Covode.recordClassIndex(81623);
        }

        C69293h(C89233z.C89234a aVar, AbstractC89124d dVar) {
            this.f154852a = aVar;
            this.f154853b = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            if (!this.f154852a.element) {
                if (strArr == null || iArr == null || iArr.length == 0 || iArr[0] != 0) {
                    this.f154853b.resumeWith(C89379q.m157068constructorimpl(false));
                } else {
                    this.f154853b.resumeWith(C89379q.m157068constructorimpl(true));
                }
                this.f154852a.element = true;
            }
        }
    }

    /* renamed from: a */
    public static Object m122481a(Activity activity, AbstractC89124d<? super Boolean> dVar) {
        C89134h hVar = new C89134h(C89099b.m154605a(dVar));
        if (C0643b.m2367a(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            hVar.resumeWith(C89379q.m157068constructorimpl(true));
        } else {
            C89233z.C89234a aVar = new C89233z.C89234a();
            aVar.element = false;
            C35444b.m72473a(activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C69293h(aVar, hVar));
        }
        Object a = hVar.mo143576a();
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return a;
    }

    /* renamed from: b */
    public static Object m122485b(C69502x xVar, boolean z, AbstractC89124d<? super C68959i> dVar) {
        boolean z2;
        boolean z3;
        C89134h hVar = new C89134h(C89099b.m154605a(dVar));
        if (z) {
            C69284b bVar = new C69284b(hVar);
            C89219l.m154721d(bVar, "");
            if (xVar.f155274a.f142191a == C62723a.f142183c) {
                if (C13603b.m24435a((Collection) xVar.f155274a.f142192b)) {
                    bVar.mo109593a(20010, "Processing photo resources faild");
                } else if (C69502x.m122717a(xVar.f155274a.f142192b.get(0))) {
                    bVar.mo109594a(true);
                } else {
                    bVar.mo109593a(20008, "Photo doesn't meet requirements");
                }
            } else if (xVar.f155274a.f142191a == C62723a.f142185e) {
                Iterator<T> it = xVar.f155274a.f142192b.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C80313cs.m139231a((String) next)) {
                        if (!C69502x.m122717a(next)) {
                            bVar.mo109593a(20008, "Photo doesn't meet requirements");
                            break;
                        }
                        if (i == xVar.f155274a.f142192b.size() - 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bVar.mo109594a(z3);
                        i++;
                    } else {
                        bVar.mo109593a(20010, "Processing photo resources faild");
                        break;
                    }
                }
            }
        } else {
            C69285c cVar = new C69285c(hVar);
            C89219l.m154721d(cVar, "");
            if (xVar.f155274a.f142191a == C62723a.f142183c) {
                if (C13603b.m24435a((Collection) xVar.f155274a.f142192b)) {
                    String string = xVar.f155275b.getString(R.string.fqc);
                    C89219l.m154716b(string, "");
                    cVar.mo109593a(20010, string);
                } else if (C69502x.m122717a(xVar.f155274a.f142192b.get(0))) {
                    cVar.mo109594a(true);
                } else {
                    String string2 = xVar.f155275b.getString(R.string.fqe);
                    C89219l.m154716b(string2, "");
                    cVar.mo109593a(20008, string2);
                }
            } else if (xVar.f155274a.f142191a == C62723a.f142185e) {
                Iterator<T> it2 = xVar.f155274a.f142192b.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (C80313cs.m139231a((String) next2)) {
                        if (!C69502x.m122717a(next2)) {
                            String string3 = xVar.f155275b.getString(R.string.fqe);
                            C89219l.m154716b(string3, "");
                            cVar.mo109593a(20008, string3);
                            break;
                        }
                        if (i2 == xVar.f155274a.f142192b.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cVar.mo109594a(z2);
                        i2++;
                    } else {
                        String string4 = xVar.f155275b.getString(R.string.fq_);
                        C89219l.m154716b(string4, "");
                        cVar.mo109593a(20010, string4);
                        break;
                    }
                }
            }
        }
        Object a = hVar.mo143576a();
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return a;
    }

    /* renamed from: a */
    public final Object mo109591a(C69502x xVar, boolean z, AbstractC89124d<? super C68959i> dVar) {
        C89134h hVar = new C89134h(C89099b.m154605a(dVar));
        C89233z.C89234a aVar = new C89233z.C89234a();
        int i = 0;
        aVar.element = false;
        C69287e eVar = new C69287e(aVar, hVar, this, xVar, z);
        C89219l.m154721d(eVar, "");
        IAVInfoService infoService = AVExternalServiceImpl.m113114a().abilityService().infoService();
        if (xVar.f155274a.f142191a == C62723a.f142184d) {
            if (C13603b.m24435a((Collection) xVar.f155274a.f142192b)) {
                String string = xVar.f155275b.getString(R.string.fq_);
                C89219l.m154716b(string, "");
                eVar.mo109593a(20010, string);
            } else if (C80313cs.m139231a(xVar.f155274a.f142192b.get(0))) {
                infoService.importLegal(xVar.f155275b, xVar.f155274a.f142192b.get(0), true, 3600000, 1000, new C69502x.C69504b(eVar), new C69502x.C69505c(eVar));
            } else {
                String string2 = xVar.f155275b.getString(R.string.fq_);
                C89219l.m154716b(string2, "");
                eVar.mo109593a(20010, string2);
            }
        } else if (xVar.f155274a.f142191a == C62723a.f142186f) {
            C89233z.C89234a aVar2 = new C89233z.C89234a();
            aVar2.element = false;
            Iterator<T> it = xVar.f155274a.f142192b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C80313cs.m139231a((String) next)) {
                    infoService.importLegal(xVar.f155275b, next, true, 3600000, 1000, new C69502x.C69506d(xVar, eVar, i), new C69502x.C69507e(aVar2, eVar));
                    if (aVar2.element) {
                        break;
                    }
                    i++;
                } else {
                    String string3 = xVar.f155275b.getString(R.string.fq_);
                    C89219l.m154716b(string3, "");
                    eVar.mo109593a(20010, string3);
                    break;
                }
            }
        }
        Object a = hVar.mo143576a();
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return a;
    }

    /* renamed from: a */
    public final void mo109592a(ClientKeyScopesResponse clientKeyScopesResponse, AbstractC39091d dVar, EditConfig.Builder builder) {
        List<ClientKeyScopesResponse.DataBean.ScopesBean> scopes;
        ClientKeyScopesResponse.DataBean data = clientKeyScopesResponse.getData();
        if (data != null && (scopes = data.getScopes()) != null) {
            Iterator<ClientKeyScopesResponse.DataBean.ScopesBean> it = scopes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ClientKeyScopesResponse.DataBean.ScopesBean next = it.next();
                C89219l.m154716b(next, "");
                if (TextUtils.equals(next.getName(), this.f154832b)) {
                    if (!C13603b.m24435a((Collection) dVar.mHashTags)) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList<String> arrayList2 = dVar.mHashTags;
                        C89219l.m154716b(arrayList2, "");
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            AVChallenge aVChallenge = new AVChallenge();
                            aVChallenge.challengeName = dVar.mHashTags.get(i);
                            arrayList.add(aVChallenge);
                        }
                        builder.challenges(arrayList);
                        return;
                    }
                }
            }
        }
        IOpenPlatformService b = OpenPlatformServiceImpl.m113101b();
        ClientKeyScopesResponse.DataBean data2 = clientKeyScopesResponse.getData();
        C89219l.m154716b(data2, "");
        String appName = data2.getAppName();
        C89219l.m154716b(appName, "");
        b.mo100639a(builder, appName);
    }

    /* renamed from: a */
    public final Object mo109590a(Activity activity, boolean z, C62723a aVar, AbstractC39091d dVar, ClientKeyScopesResponse clientKeyScopesResponse, AbstractC89124d<? super Boolean> dVar2) {
        C89134h hVar = new C89134h(C89099b.m154605a(dVar2));
        AVExternalServiceImpl.m113114a().asyncService(activity, m122483a(dVar.mClientKey), new C69289g(hVar, this, activity, dVar, aVar, clientKeyScopesResponse, z));
        Object a = hVar.mo143576a();
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar2, "");
        }
        return a;
    }
}
