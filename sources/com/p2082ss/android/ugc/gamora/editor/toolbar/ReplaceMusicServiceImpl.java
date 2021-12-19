package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.edit.EditMusicStruct;
import com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.p2082ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.gamora.editor.toolbar.ReplaceMusicApi;
import com.p2082ss.android.ugc.gamora.editor.toolbar.p4292a.C83132a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl */
public final class ReplaceMusicServiceImpl implements IReplaceMusicService {

    /* renamed from: a */
    private boolean f185734a;

    /* renamed from: b */
    private String f185735b = "";

    /* renamed from: c */
    private ReplaceMusicRequest f185736c = new ReplaceMusicRequest();

    static {
        Covode.recordClassIndex(97003);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean isInPublish() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean getClickPost() {
        return this.f185734a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final String getCover() {
        return this.f185735b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final ReplaceMusicRequest getReplaceMusicRequest() {
        return this.f185736c;
    }

    /* renamed from: a */
    public static IReplaceMusicService m143543a() {
        MethodCollector.m26663i(11535);
        Object a = C81908b.m141854a(IReplaceMusicService.class, false);
        if (a != null) {
            IReplaceMusicService iReplaceMusicService = (IReplaceMusicService) a;
            MethodCollector.m26664o(11535);
            return iReplaceMusicService;
        }
        if (C81908b.f183363eG == null) {
            synchronized (IReplaceMusicService.class) {
                try {
                    if (C81908b.f183363eG == null) {
                        C81908b.f183363eG = new ReplaceMusicServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11535);
                    throw th;
                }
            }
        }
        ReplaceMusicServiceImpl replaceMusicServiceImpl = (ReplaceMusicServiceImpl) C81908b.f183363eG;
        MethodCollector.m26664o(11535);
        return replaceMusicServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$a */
    static final class CallableC83122a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ReplaceMusicRequest f185737a;

        static {
            Covode.recordClassIndex(97004);
        }

        CallableC83122a(ReplaceMusicRequest replaceMusicRequest) {
            this.f185737a = replaceMusicRequest;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ReplaceMusicRequest replaceMusicRequest = this.f185737a;
            C89219l.m154721d(replaceMusicRequest, "");
            String b = C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(replaceMusicRequest.getEditMusicStruct());
            String itemID = replaceMusicRequest.getItemID();
            String originalVid = replaceMusicRequest.getOriginalVid();
            C89219l.m154716b(b, "");
            T t = ((ReplaceMusicApi.Api) C63244g.m114602a().mo73257C().createRetrofit(C63244g.m114602a().mo73257C().getApiHost(), true, ReplaceMusicApi.Api.class)).get(itemID, originalVid, b).execute().f52262b;
            C89219l.m154716b(t, "");
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$c */
    public static final class RunnableC83125c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f185744a;

        /* renamed from: b */
        final /* synthetic */ boolean f185745b;

        /* renamed from: c */
        final /* synthetic */ String f185746c;

        /* renamed from: d */
        final /* synthetic */ ReplaceMusicRequest f185747d;

        static {
            Covode.recordClassIndex(97007);
        }

        RunnableC83125c(ActivityC0945e eVar, boolean z, String str, ReplaceMusicRequest replaceMusicRequest) {
            this.f185744a = eVar;
            this.f185745b = z;
            this.f185746c = str;
            this.f185747d = replaceMusicRequest;
        }

        public final void run() {
            if (!this.f185744a.isFinishing()) {
                C84911q.m145922a("ReplaceMusicToolbarScene", "showWindow: " + this.f185745b + ' ');
                final C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = (T) new C83132a(this.f185744a, true, this.f185746c, null);
                if (!this.f185745b) {
                    if (this.f185747d != null) {
                        eVar.element = (T) new C83132a(this.f185744a, false, this.f185746c, this.f185747d);
                    } else {
                        return;
                    }
                }
                if (this.f185745b) {
                    new SafeHandler(this.f185744a).postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl.RunnableC83125c.RunnableC831261 */

                        static {
                            Covode.recordClassIndex(97008);
                        }

                        public final void run() {
                            if (eVar.element.isShowing()) {
                                eVar.element.dismiss();
                            }
                        }
                    }, 4000);
                }
                T t = eVar.element;
                if (!t.f185762b.isFinishing()) {
                    PullUpLayout pullUpLayout = t.f185761a;
                    if (pullUpLayout != null) {
                        pullUpLayout.mo27261a();
                    }
                    try {
                        Window window = t.f185762b.getWindow();
                        C89219l.m154716b(window, "");
                        View decorView = window.getDecorView();
                        int i = Build.VERSION.SDK_INT;
                        t.showAtLocation(decorView, 48, 0, -C13628n.m24525e(C40963b.m82473a()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setClickPost(boolean z) {
        this.f185734a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setCover(String str) {
        C89219l.m154721d(str, "");
        this.f185735b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest) {
        C89219l.m154721d(replaceMusicRequest, "");
        this.f185736c = replaceMusicRequest;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$b */
    static final class C83123b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ ReplaceMusicServiceImpl f185738a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f185739b;

        /* renamed from: c */
        final /* synthetic */ String f185740c;

        /* renamed from: d */
        final /* synthetic */ ReplaceMusicRequest f185741d;

        static {
            Covode.recordClassIndex(97005);
        }

        C83123b(ReplaceMusicServiceImpl replaceMusicServiceImpl, ActivityC0945e eVar, String str, ReplaceMusicRequest replaceMusicRequest) {
            this.f185738a = replaceMusicServiceImpl;
            this.f185739b = eVar;
            this.f185740c = str;
            this.f185741d = replaceMusicRequest;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(final C1731i iVar) {
            String str;
            C89219l.m154721d(iVar, "");
            if (iVar.mo5544c() || iVar.mo5539b()) {
                Exception e = iVar.mo5546e();
                String str2 = null;
                if (!(e instanceof C34485a)) {
                    e = null;
                }
                C34480a aVar = (C34480a) e;
                if (aVar != null && aVar.getErrorCode() == 3013002) {
                    Exception e2 = iVar.mo5546e();
                    if (!(e2 instanceof C34485a)) {
                        e2 = null;
                    }
                    C34485a aVar2 = (C34485a) e2;
                    if (aVar2 != null) {
                        str = aVar2.getErrorMsg();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        new SafeHandler(this.f185739b).post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl.C83123b.RunnableC831241 */

                            /* renamed from: a */
                            final /* synthetic */ C83123b f185742a;

                            static {
                                Covode.recordClassIndex(97006);
                            }

                            {
                                this.f185742a = r1;
                            }

                            public final void run() {
                                String str;
                                C23144b bVar = new C23144b(this.f185742a.f185739b);
                                Exception e = iVar.mo5546e();
                                if (!(e instanceof C34485a)) {
                                    e = null;
                                }
                                C34485a aVar = (C34485a) e;
                                if (aVar == null || (str = aVar.getErrorMsg()) == null) {
                                    str = "";
                                }
                                bVar.mo37635a(str).mo37637b();
                            }
                        });
                        C84911q.m145922a("ReplaceMusicToolbarScene", "error code 3013002");
                    }
                }
                StringBuilder sb = new StringBuilder("first network error ");
                Exception e3 = iVar.mo5546e();
                if (e3 != null) {
                    str2 = e3.toString();
                }
                C84911q.m145922a("ReplaceMusicToolbarScene", sb.append(str2).toString());
                this.f185738a.showWindow(false, this.f185740c, this.f185741d);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showWindow(JSONObject jSONObject, boolean z) {
        String str;
        EditMusicStruct editMusicStruct;
        C89219l.m154721d(jSONObject, "");
        try {
            String string = jSONObject.getString("item_id");
            String string2 = jSONObject.getString("original_vid");
            String string3 = jSONObject.getString("cover_url");
            EditMusicStruct editMusicStruct2 = (EditMusicStruct) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46670a(jSONObject.getString("new_music_info"), EditMusicStruct.class);
            ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();
            C89219l.m154716b(editMusicStruct2, "");
            replaceMusicRequest.setEditMusicStruct(editMusicStruct2);
            C89219l.m154716b(string, "");
            replaceMusicRequest.setItemID(string);
            C89219l.m154716b(string2, "");
            replaceMusicRequest.setOriginalVid(string2);
            C89219l.m154716b(string3, "");
            showWindow(z, string3, replaceMusicRequest);
            C84911q.m145922a("ReplaceMusicToolbarScene", "long link response ".concat(String.valueOf(jSONObject)));
            C33744d dVar = new C33744d();
            ReplaceMusicRequest replaceMusicRequest2 = getReplaceMusicRequest();
            String str2 = null;
            if (replaceMusicRequest2 != null) {
                str = replaceMusicRequest2.getItemID();
            } else {
                str = null;
            }
            dVar.mo59983a("group_id", str);
            ReplaceMusicRequest replaceMusicRequest3 = getReplaceMusicRequest();
            if (!(replaceMusicRequest3 == null || (editMusicStruct = replaceMusicRequest3.getEditMusicStruct()) == null)) {
                str2 = editMusicStruct.getMusicID();
            }
            dVar.mo59983a("replace_music_id", str2);
            dVar.mo59980a("replace_status", z ? 1 : 0);
            C39162r.m79460a("publish_replace_music_status", dVar.f79943a);
        } catch (Exception unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void doRequest(String str, ReplaceMusicRequest replaceMusicRequest, ActivityC0945e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(replaceMusicRequest, "");
        C89219l.m154721d(eVar, "");
        C1731i.m5640b(new CallableC83122a(replaceMusicRequest), C1731i.f5562a).mo5534a(new C83123b(this, eVar, str, replaceMusicRequest), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showWindow(boolean z, String str, ReplaceMusicRequest replaceMusicRequest) {
        C89219l.m154721d(str, "");
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        AbstractC63167ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
        C89219l.m154716b(applicationService, "");
        ActivityC0945e f = applicationService.mo93777f();
        if (f != null) {
            new SafeHandler(f).post(new RunnableC83125c(f, z, str, replaceMusicRequest));
        }
    }
}
