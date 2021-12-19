package com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.content.Context;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.example.p1811a.AbstractC23831a;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58444q;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWebViewClientHookCallback */
public final class InitWebViewClientHookCallback implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68675);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return C58444q.f133061a;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C23833c.f56367a = C58427a.f133034a;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWebViewClientHookCallback$a */
    static final class C58427a implements AbstractC23831a {

        /* renamed from: a */
        public static final C58427a f133034a = new C58427a();

        static {
            Covode.recordClassIndex(68676);
        }

        C58427a() {
        }

        @Override // com.example.p1811a.AbstractC23831a
        /* renamed from: a */
        public final boolean mo39294a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            String str2;
            String str3;
            String str4;
            C33743c cVar = new C33743c();
            if (renderProcessGoneDetail.didCrash()) {
                str = "crash";
            } else {
                str = "system kill";
            }
            cVar.mo59976a("exit_type", str);
            cVar.mo59974a("renderer_priority", Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            cVar.mo59976a("WebView", webView.getClass().getCanonicalName());
            if (webView.getOriginalUrl() != null) {
                str2 = webView.getOriginalUrl();
            } else {
                str2 = "original_url is null";
            }
            cVar.mo59976a("original_url", str2);
            if (webView.getUrl() != null) {
                str3 = webView.getUrl();
            } else {
                str3 = "url is null";
            }
            cVar.mo59976a("url", str3);
            if (webView.getTitle() != null) {
                str4 = webView.getTitle();
            } else {
                str4 = "title is null";
            }
            cVar.mo59976a("title", str4);
            boolean didCrash = renderProcessGoneDetail.didCrash();
            C12290b.m22060a("aweme_webview_render_exception", didCrash ? 1 : 0, cVar.mo59977a());
            return true;
        }
    }
}
