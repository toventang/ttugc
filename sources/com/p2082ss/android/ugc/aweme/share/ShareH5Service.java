package com.p2082ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ShareH5Service */
public interface ShareH5Service {

    /* renamed from: a */
    public static final C68827a f153925a = C68827a.f153926a;

    static {
        Covode.recordClassIndex(81121);
    }

    /* renamed from: a */
    BaseBridgeMethod mo109372a(C16248b bVar);

    /* renamed from: a */
    BaseCommonJavaMethod mo109373a(C18288a aVar);

    /* renamed from: a */
    String mo109374a();

    /* renamed from: a */
    Map<String, Object> mo109375a(AbstractC35125b bVar);

    /* renamed from: a */
    void mo109376a(AbstractC35125b bVar, SSWebView sSWebView);

    /* renamed from: a */
    void mo109377a(AbstractC35125b bVar, String str);

    /* renamed from: a */
    void mo109378a(AbstractC35125b bVar, boolean z);

    /* renamed from: a */
    void mo109379a(AbstractC40591g gVar, int i);

    /* renamed from: a */
    void mo109380a(AbstractC40591g gVar, SingleWebView singleWebView, int i);

    /* renamed from: a */
    void mo109381a(AbstractC40591g gVar, String str, int i);

    /* renamed from: a */
    boolean mo109382a(WeakReference<Context> weakReference, JSONObject jSONObject);

    /* renamed from: b */
    BaseBridgeMethod mo109383b(C16248b bVar);

    /* renamed from: b */
    BaseCommonJavaMethod mo109384b(C18288a aVar);

    /* renamed from: b */
    String mo109385b();

    /* renamed from: b */
    void mo109386b(AbstractC35125b bVar);

    /* renamed from: b */
    void mo109387b(AbstractC35125b bVar, SSWebView sSWebView);

    /* renamed from: b */
    void mo109388b(AbstractC35125b bVar, String str);

    /* renamed from: b */
    void mo109389b(AbstractC40591g gVar, SingleWebView singleWebView, int i);

    /* renamed from: c */
    BaseCommonJavaMethod mo109390c(C18288a aVar);

    /* renamed from: c */
    String mo109391c();

    /* renamed from: com.ss.android.ugc.aweme.share.ShareH5Service$a */
    public static final class C68827a {

        /* renamed from: a */
        static final /* synthetic */ C68827a f153926a = new C68827a();

        private C68827a() {
        }

        static {
            Covode.recordClassIndex(81122);
        }

        /* renamed from: a */
        public static ShareH5Service m121397a() {
            ShareH5Service d = ShareH5ServiceImpl.m121398d();
            C89219l.m154716b(d, "");
            return d;
        }
    }
}
