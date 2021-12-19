package com.p2082ss.android.ugc.aweme.commercialize.business;

import android.app.Activity;
import android.view.View;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16732j;
import com.p2082ss.android.sdk.activity.C30225a;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.business.C35123a;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38230ap;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness */
public final class DownloadBusiness extends BulletBusinessService.Business {

    /* renamed from: a */
    public String f88959a;

    /* renamed from: b */
    public int f88960b;

    /* renamed from: c */
    public int f88961c;

    /* renamed from: d */
    private final C38230ap f88962d = new C38230ap();

    /* renamed from: e */
    private final boolean f88963e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness$a */
    public static final class View$OnClickListenerC37633a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC37633a f88964a = new View$OnClickListenerC37633a();

        static {
            Covode.recordClassIndex(45056);
        }

        View$OnClickListenerC37633a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(45055);
    }

    /* renamed from: a */
    public final void mo65531a() {
        Activity a = this.f82870k.mo61971a();
        if (a != null) {
            int i = this.f88960b;
            if (i == 0) {
                i = R.id.dw;
            }
            a.findViewById(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: a */
    public final void mo65532a(SSWebView sSWebView) {
        FrameLayout frameLayout;
        int i;
        int i2;
        Activity a = this.f82870k.mo61971a();
        C35196j jVar = null;
        if (a != null) {
            int i3 = this.f88960b;
            if (i3 == 0) {
                i3 = R.id.dw;
            }
            frameLayout = (FrameLayout) a.findViewById(i3);
        } else {
            frameLayout = null;
        }
        boolean z = false;
        if (!this.f88963e) {
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        C16721b bVar = this.f82870k.f82900a;
        if (bVar instanceof C35196j) {
            jVar = bVar;
        }
        C35196j jVar2 = jVar;
        C38230ap apVar = this.f88962d;
        if (jVar2 != null) {
            apVar.f90319a = jVar2.f83100ao.mo26550b();
            apVar.f90321c = jVar2.mo62117h();
            apVar.f90322d = jVar2.mo62045c();
            apVar.f90323e = jVar2.f83095aj.mo26550b();
            apVar.f90325g = jVar2.f83093ah.mo26550b();
            apVar.f90324f = jVar2.f83094ai.mo26550b();
            if (jVar2.f83103ar.mo26550b() != null) {
                i = ((Integer) jVar2.f83103ar.mo26550b()).intValue();
            } else {
                i = 0;
            }
            apVar.f90326h = i;
            apVar.f90328j = jVar2.f83096ak.mo26550b();
            if (jVar2.f83104at.mo26550b() != null) {
                i2 = ((Integer) jVar2.f83104at.mo26550b()).intValue();
            } else {
                i2 = 0;
            }
            apVar.f90331m = i2;
            if (jVar2.f83106av.mo26550b() == Boolean.TRUE) {
                z = true;
            }
            apVar.f90332n = z;
            try {
                apVar.f90329k = new JSONObject(jVar2.f83107aw.mo26550b());
            } catch (Exception e) {
                e.printStackTrace();
            }
            apVar.f90330l = jVar2.f83102aq.mo26550b();
            apVar.f90327i = C38230ap.m77595a(apVar.f90326h);
            try {
                apVar.f90320b = Long.parseLong(apVar.f90319a);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (frameLayout != null) {
            frameLayout.setOnClickListener(View$OnClickListenerC37633a.f88964a);
        }
        if (sSWebView != null) {
            sSWebView.setDownloadListener(new C37634b(this, sSWebView, a, jVar2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness$b */
    public static final class C37634b implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ DownloadBusiness f88965a;

        /* renamed from: b */
        final /* synthetic */ SSWebView f88966b;

        /* renamed from: c */
        final /* synthetic */ Activity f88967c;

        /* renamed from: d */
        final /* synthetic */ C35196j f88968d;

        static {
            Covode.recordClassIndex(45057);
        }

        C37634b(DownloadBusiness downloadBusiness, SSWebView sSWebView, Activity activity, C35196j jVar) {
            this.f88965a = downloadBusiness;
            this.f88966b = sSWebView;
            this.f88967c = activity;
            this.f88968d = jVar;
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            long j2;
            String str5;
            C16722a aVar;
            C16732j jVar;
            Long l;
            String url = this.f88966b.getUrl();
            Activity activity = this.f88967c;
            C35196j jVar2 = this.f88968d;
            if (jVar2 == null || (jVar = jVar2.f83076Y) == null || (l = (Long) jVar.mo26550b()) == null) {
                j2 = 0;
            } else {
                j2 = l.longValue();
            }
            C35196j jVar3 = this.f88968d;
            Object obj = null;
            if (jVar3 != null) {
                str5 = jVar3.mo62045c();
            } else {
                str5 = null;
            }
            JSONObject a = C30225a.m61165a(activity, j2, str5, str, url, this.f88966b.getUrl());
            C35196j jVar4 = this.f88968d;
            if (!(jVar4 == null || (aVar = jVar4.f83099an) == null)) {
                obj = aVar.mo26550b();
            }
            if (!C89219l.m154714a(obj, (Object) true)) {
                C13627m.m24498a(str);
            }
            this.f88965a.f88959a = str;
            C30225a.m61164a(this.f88967c, str, str2, str3, str4, a);
        }
    }
}
