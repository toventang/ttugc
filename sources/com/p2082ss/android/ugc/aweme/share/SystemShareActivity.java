package com.p2082ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33796j;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34718e;
import com.p2082ss.android.ugc.aweme.common.AbstractC39091d;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.opensdkservice.HandleMediaListener;
import com.p2082ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.p2082ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl;
import com.p2082ss.android.ugc.aweme.openshare.C62723a;
import com.p2082ss.android.ugc.aweme.openshare.Share;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69492b;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69496c;
import com.p2082ss.android.ugc.aweme.tasks.LogLaunchModeTask;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.utils.C80479ge;
import com.p2082ss.android.ugc.aweme.utils.C80522ha;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity */
public final class SystemShareActivity extends ActivityC0218d {

    /* renamed from: a */
    public final String f153933a = "homepage_hot";

    /* renamed from: b */
    public C62723a f153934b;

    /* renamed from: c */
    public AbstractC39091d f153935c;

    /* renamed from: d */
    public Share.Request f153936d;

    /* renamed from: e */
    public C69496c f153937e;

    /* renamed from: f */
    public SystemShareActivity f153938f;

    /* renamed from: g */
    public final AbstractC1214u<C68959i> f153939g = new C68843m(this);

    /* renamed from: h */
    private C69492b f153940h;

    /* renamed from: i */
    private IOpenPlatformService f153941i;

    /* renamed from: j */
    private final String f153942j = "click_open_share";

    /* renamed from: k */
    private final String f153943k = "share";

    /* renamed from: l */
    private final AbstractC1214u<Boolean> f153944l = new C68845n(this);

    /* renamed from: m */
    private final AbstractC1214u<Share.Response> f153945m = new C68842l(this);

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$a */
    public enum EnumC68831a {
        IMAGE,
        VIDEO;

        static {
            Covode.recordClassIndex(81132);
        }
    }

    static {
        Covode.recordClassIndex(81131);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$f */
    public static final class CallableC68836f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153955a;

        /* renamed from: b */
        final /* synthetic */ Uri f153956b;

        static {
            Covode.recordClassIndex(81137);
        }

        CallableC68836f(SystemShareActivity systemShareActivity, Uri uri) {
            this.f153955a = systemShareActivity;
            this.f153956b = uri;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String a = C80479ge.f180067a.mo123759a(this.f153955a, this.f153956b);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$b */
    public static final class CallableC68832b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153947a;

        /* renamed from: b */
        final /* synthetic */ Uri f153948b;

        static {
            Covode.recordClassIndex(81133);
        }

        CallableC68832b(SystemShareActivity systemShareActivity, Uri uri) {
            this.f153947a = systemShareActivity;
            this.f153948b = uri;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C80479ge geVar = C80479ge.f180067a;
            SystemShareActivity systemShareActivity = this.f153947a;
            Uri uri = this.f153948b;
            C89219l.m154716b(uri, "");
            String a = geVar.mo123759a(systemShareActivity, uri);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$j */
    public static final class C68840j implements HandleMediaListener {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153962a;

        static {
            Covode.recordClassIndex(81141);
        }

        @Override // com.p2082ss.android.ugc.aweme.opensdkservice.HandleMediaListener
        public final void onArgsError() {
            SystemShareActivity systemShareActivity = this.f153962a;
            new C68865aj(systemShareActivity, systemShareActivity.f153935c).mo109440a("Params parsing error, media resource type difference you pass", 20002);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C68840j(SystemShareActivity systemShareActivity) {
            this.f153962a = systemShareActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.opensdkservice.HandleMediaListener
        public final void onGetImagePath(ArrayList<String> arrayList) {
            this.f153962a.mo109424a(arrayList, EnumC68831a.IMAGE);
        }

        @Override // com.p2082ss.android.ugc.aweme.opensdkservice.HandleMediaListener
        public final void onGetVideoPath(ArrayList<String> arrayList) {
            C89219l.m154721d(arrayList, "");
            this.f153962a.mo109424a(arrayList, EnumC68831a.VIDEO);
        }
    }

    /* renamed from: a */
    public final C62723a mo109423a() {
        C62723a aVar = this.f153934b;
        if (aVar == null) {
            C89219l.m154710a("shareDistictType");
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo109425b() {
        IOpenPlatformService b = OpenPlatformServiceImpl.m113101b();
        C89219l.m154716b(b, "");
        this.f153941i = b;
        if (b == null) {
            C89219l.m154710a("mOpenPlatformService");
        }
        b.mo100636a();
        m121483e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$h */
    public static final class CallableC68838h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153959a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f153960b;

        static {
            Covode.recordClassIndex(81139);
        }

        CallableC68838h(SystemShareActivity systemShareActivity, ArrayList arrayList) {
            this.f153959a = systemShareActivity;
            this.f153960b = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f153960b;
            if (arrayList2 == null) {
                C89219l.m154715b();
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                C80479ge geVar = C80479ge.f180067a;
                SystemShareActivity systemShareActivity = this.f153959a;
                String str = "";
                C89219l.m154716b(uri, str);
                String a = geVar.mo123759a(systemShareActivity, uri);
                if (a != null) {
                    str = a;
                }
                C51423a.m95787a("SystemShareActivity realPath = ".concat(String.valueOf(str)));
                arrayList.add(str);
            }
            return arrayList;
        }
    }

    /* renamed from: c */
    public final void mo109426c() {
        C62723a aVar = this.f153934b;
        if (aVar == null) {
            C89219l.m154710a("shareDistictType");
        }
        C69492b bVar = new C69492b(aVar);
        this.f153940h = bVar;
        bVar.f155249c.postValue(this.f153935c);
        String str = this.f153933a;
        Share.Request request = this.f153936d;
        if (request == null) {
            C89219l.m154710a("shareRequest");
        }
        Context b = m121481b(this);
        C89219l.m154716b(b, "");
        bVar.mo109738a(str, request, this, b);
        bVar.f155248b.observeForever(this.f153945m);
        bVar.f155250d.observeForever(this.f153944l);
    }

    public final void finish() {
        C1213t<C68959i> tVar;
        C1213t<Share.Response> tVar2;
        C1213t<Boolean> tVar3;
        super.finish();
        C69492b bVar = this.f153940h;
        if (!(bVar == null || (tVar3 = bVar.f155250d) == null)) {
            tVar3.removeObserver(this.f153944l);
        }
        C69492b bVar2 = this.f153940h;
        if (!(bVar2 == null || (tVar2 = bVar2.f155248b) == null)) {
            tVar2.removeObserver(this.f153945m);
        }
        C69496c cVar = this.f153937e;
        if (cVar != null && (tVar = cVar.f155265b) != null) {
            tVar.removeObserver(this.f153939g);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$d */
    public static final class CallableC68834d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153951a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f153952b;

        static {
            Covode.recordClassIndex(81135);
        }

        CallableC68834d(SystemShareActivity systemShareActivity, ArrayList arrayList) {
            this.f153951a = systemShareActivity;
            this.f153952b = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f153952b;
            if (arrayList2 == null) {
                C89219l.m154715b();
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Uri parse = Uri.parse(str);
                String str2 = "";
                C89219l.m154716b(parse, str2);
                if (C89361p.m154872a("content", parse.getScheme(), true)) {
                    String a = C80479ge.f180067a.mo123759a(this.f153951a, parse);
                    if (a != null) {
                        str2 = a;
                    }
                    arrayList.add(str2);
                } else {
                    C89219l.m154716b(str, str2);
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: d */
    private final void m121482d() {
        String str;
        String str2;
        try {
            Intent intent = getIntent();
            Uri uri = null;
            if (intent != null) {
                uri = intent.getData();
                str = m121480a(intent, "_aweme_open_sdk_params_client_key");
                if (str == null) {
                    str = "";
                }
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (uri != null) {
                    str2 = uri.getQueryParameter("gd_label");
                } else {
                    str2 = "";
                }
                if (booleanExtra || str2 != null) {
                    if (!TextUtils.isEmpty(str)) {
                        new C58221f.C58224c().mo95703b((AbstractC58264w) new LogLaunchModeTask(uri, str, this.f153942j)).mo95706a();
                    } else {
                        new C58221f.C58224c().mo95703b((AbstractC58264w) new LogLaunchModeTask(uri, str)).mo95706a();
                    }
                    C33796j a = C33796j.m69147a();
                    C89219l.m154716b(a, "");
                    a.f80041b = false;
                    return;
                }
            } else {
                str = "";
            }
            C39162r.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            if (!TextUtils.isEmpty(str)) {
                new C58221f.C58224c().mo95703b((AbstractC58264w) new LogLaunchModeTask(uri, str, this.f153942j)).mo95706a();
            } else {
                new C58221f.C58224c().mo95703b((AbstractC58264w) new LogLaunchModeTask(uri, str)).mo95706a();
            }
            C33796j a2 = C33796j.m69147a();
            C89219l.m154716b(a2, "");
            a2.f80041b = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private final void m121483e() {
        m121482d();
        this.f153934b = new C62723a();
        Intent intent = getIntent();
        C89219l.m154716b(intent, "");
        if (TextUtils.equals(intent.getAction(), "android.intent.action.SEND")) {
            C39078ad b = C80522ha.m139589b(getIntent());
            this.f153935c = b;
            if (b == null) {
                C80522ha.m139586a();
                return;
            }
            Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
            if (uri != null) {
                C51423a.m95787a("SystemShareActivity uri = ".concat(String.valueOf(uri)));
                C1731i.m5640b(new CallableC68836f(this, uri), C1731i.f5562a).mo5534a(new C68837g(this, uri), C1731i.f5564c, null);
                return;
            }
            return;
        }
        Intent intent2 = getIntent();
        C89219l.m154716b(intent2, "");
        if (TextUtils.equals(intent2.getAction(), "android.intent.action.SEND_MULTIPLE")) {
            C39078ad b2 = C80522ha.m139589b(getIntent());
            this.f153935c = b2;
            if (b2 == null) {
                C51423a.m95787a("SystemShareActivity shareBase is null, return");
                C80522ha.m139586a();
                return;
            }
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (C13603b.m24435a((Collection) parcelableArrayListExtra)) {
                C51423a.m95787a("SystemShareActivity uriList is null, return");
                C80522ha.m139586a();
                return;
            }
            C1731i.m5640b(new CallableC68838h(this, parcelableArrayListExtra), C1731i.f5562a).mo5534a(new C68839i(this), C1731i.f5564c, null);
            return;
        }
        IOpenPlatformService iOpenPlatformService = this.f153941i;
        if (iOpenPlatformService == null) {
            C89219l.m154710a("mOpenPlatformService");
        }
        Intent intent3 = getIntent();
        C89219l.m154716b(intent3, "");
        if (iOpenPlatformService.mo100641a(intent3)) {
            C39078ad a = C80522ha.m139583a(getIntent());
            this.f153935c = a;
            if (a != null) {
                Share.Request a2 = C80522ha.m139585a(a.getShareRequestBundle());
                C89219l.m154716b(a2, "");
                this.f153936d = a2;
                IOpenPlatformService iOpenPlatformService2 = this.f153941i;
                if (iOpenPlatformService2 == null) {
                    C89219l.m154710a("mOpenPlatformService");
                }
                Intent intent4 = getIntent();
                C89219l.m154716b(intent4, "");
                iOpenPlatformService2.mo100637a(intent4, new C68840j(this));
                return;
            }
            return;
        }
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$n */
    static final class C68845n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153967a;

        static {
            Covode.recordClassIndex(81146);
        }

        C68845n(SystemShareActivity systemShareActivity) {
            this.f153967a = systemShareActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f153967a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$g */
    public static final class C68837g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153957a;

        /* renamed from: b */
        final /* synthetic */ Uri f153958b;

        static {
            Covode.recordClassIndex(81138);
        }

        C68837g(SystemShareActivity systemShareActivity, Uri uri) {
            this.f153957a = systemShareActivity;
            this.f153958b = uri;
        }

        /* renamed from: a */
        private static Context m121488a(SystemShareActivity systemShareActivity) {
            Context applicationContext = systemShareActivity.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.util.List<java.lang.String> */
        /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.List<java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            StringBuilder sb = new StringBuilder("SystemShareActivity path = ");
            C89219l.m154716b(iVar, "");
            C51423a.m95787a(sb.append((String) iVar.mo5545d()).toString());
            Object d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            if (((CharSequence) d).length() == 0) {
                C22708a.m42800a("SystemShareActivity path is null, uri = " + this.f153958b);
            }
            if (!C80313cs.m139231a((String) iVar.mo5545d())) {
                C51423a.m95787a("SystemShareActivity path not exists, return");
                new C79459a(m121488a(this.f153957a)).mo123052a(this.f153957a.getString(R.string.fq_)).mo123053a();
                C80522ha.m139586a();
            } else {
                StringBuilder sb2 = new StringBuilder("SystemShareActivity intent.type = ");
                Intent intent = this.f153957a.getIntent();
                C89219l.m154716b(intent, "");
                C51423a.m95787a(sb2.append(intent.getType()).toString());
                Intent intent2 = this.f153957a.getIntent();
                C89219l.m154716b(intent2, "");
                if (C80522ha.m139588a(intent2.getType())) {
                    this.f153957a.mo109423a().f142191a = C62723a.f142184d;
                    List<String> list = this.f153957a.mo109423a().f142192b;
                    Object d2 = iVar.mo5545d();
                    C89219l.m154716b(d2, "");
                    list.add(d2);
                } else {
                    Intent intent3 = this.f153957a.getIntent();
                    C89219l.m154716b(intent3, "");
                    if (C80522ha.m139590b(intent3.getType())) {
                        this.f153957a.mo109423a().f142191a = C62723a.f142183c;
                        List<String> list2 = this.f153957a.mo109423a().f142192b;
                        Object d3 = iVar.mo5545d();
                        C89219l.m154716b(d3, "");
                        list2.add(d3);
                    } else {
                        C51423a.m95787a("SystemShareActivity can not handle intent.type, return");
                        new C79459a(m121488a(this.f153957a)).mo123052a(this.f153957a.getString(R.string.fq_)).mo123053a();
                        C80522ha.m139586a();
                    }
                }
                C34718e.m70911a("system_share");
                this.f153957a.f153937e = new C69496c(this.f153957a.mo109423a());
                C69496c cVar = this.f153957a.f153937e;
                if (cVar != null) {
                    cVar.f155264a.setValue(this.f153957a.f153935c);
                    cVar.mo109739a(this.f153957a.f153933a, SystemShareActivity.m121479a(this.f153957a));
                    cVar.f155265b.observeForever(this.f153957a.f153939g);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$i */
    public static final class C68839i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153961a;

        static {
            Covode.recordClassIndex(81140);
        }

        C68839i(SystemShareActivity systemShareActivity) {
            this.f153961a = systemShareActivity;
        }

        /* renamed from: a */
        private static Context m121489a(SystemShareActivity systemShareActivity) {
            Context applicationContext = systemShareActivity.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            boolean z;
            C89219l.m154716b(iVar, "");
            for (String str : (List) iVar.mo5545d()) {
                if (C80313cs.m139231a(str)) {
                    this.f153961a.mo109423a().f142192b.add(str);
                }
            }
            Intent intent = this.f153961a.getIntent();
            C89219l.m154716b(intent, "");
            if (C80522ha.m139588a(intent.getType())) {
                this.f153961a.mo109423a().f142191a = C62723a.f142186f;
            } else {
                Intent intent2 = this.f153961a.getIntent();
                C89219l.m154716b(intent2, "");
                if (C80522ha.m139590b(intent2.getType())) {
                    this.f153961a.mo109423a().f142191a = C62723a.f142185e;
                } else {
                    Intent intent3 = this.f153961a.getIntent();
                    C89219l.m154716b(intent3, "");
                    String type = intent3.getType();
                    if (type != null) {
                        z = type.startsWith("*/*");
                    } else {
                        z = false;
                    }
                    if (z) {
                        List list = (List) iVar.mo5545d();
                        int i = 0;
                        while (true) {
                            if (i >= list.size()) {
                                this.f153961a.mo109423a().f142191a = C62723a.f142185e;
                                break;
                            }
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(C80522ha.m139592c((String) list.get(i)));
                            if (TextUtils.isEmpty(mimeTypeFromExtension) || mimeTypeFromExtension.contains("image")) {
                                i++;
                            } else {
                                List list2 = (List) iVar.mo5545d();
                                for (int i2 = 0; i2 < list2.size(); i2++) {
                                    String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(C80522ha.m139592c((String) list2.get(i2)).toLowerCase());
                                    if (!(TextUtils.isEmpty(mimeTypeFromExtension2) || mimeTypeFromExtension2.contains("video"))) {
                                        new C79459a(m121489a(this.f153961a)).mo123052a(this.f153961a.getString(R.string.fqb)).mo123053a();
                                        C80522ha.m139586a();
                                        break;
                                    }
                                }
                                this.f153961a.mo109423a().f142191a = C62723a.f142186f;
                            }
                        }
                    } else {
                        new C79459a(m121489a(this.f153961a)).mo123052a(this.f153961a.getString(R.string.fqb)).mo123053a();
                        C80522ha.m139586a();
                    }
                    return C89391z.f203057a;
                }
            }
            C34718e.m70911a("system_share");
            this.f153961a.f153937e = new C69496c(this.f153961a.mo109423a());
            C69496c cVar = this.f153961a.f153937e;
            if (cVar != null) {
                cVar.f155264a.setValue(this.f153961a.f153935c);
                cVar.mo109739a(this.f153961a.f153933a, SystemShareActivity.m121479a(this.f153961a));
                cVar.f155265b.observeForever(this.f153961a.f153939g);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SystemShareActivity m121479a(SystemShareActivity systemShareActivity) {
        SystemShareActivity systemShareActivity2 = systemShareActivity.f153938f;
        if (systemShareActivity2 == null) {
            C89219l.m154710a("activity");
        }
        return systemShareActivity2;
    }

    /* renamed from: b */
    private static Context m121481b(SystemShareActivity systemShareActivity) {
        Context applicationContext = systemShareActivity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$c */
    public static final class C68833c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153949a;

        /* renamed from: b */
        final /* synthetic */ EnumC68831a f153950b;

        static {
            Covode.recordClassIndex(81134);
        }

        C68833c(SystemShareActivity systemShareActivity, EnumC68831a aVar) {
            this.f153949a = systemShareActivity;
            this.f153950b = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            int i;
            C62723a a = this.f153949a.mo109423a();
            if (this.f153950b == EnumC68831a.IMAGE) {
                i = C62723a.f142183c;
            } else {
                i = C62723a.f142184d;
            }
            a.f142191a = i;
            C62723a a2 = this.f153949a.mo109423a();
            String[] strArr = new String[1];
            C89219l.m154716b(iVar, "");
            Object d = iVar.mo5545d();
            if (d == null) {
                C89219l.m154715b();
            }
            strArr[0] = d;
            a2.mo100645a(C89070n.m154524c(strArr));
            this.f153949a.mo109426c();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$e */
    public static final class C68835e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153953a;

        /* renamed from: b */
        final /* synthetic */ EnumC68831a f153954b;

        static {
            Covode.recordClassIndex(81136);
        }

        C68835e(SystemShareActivity systemShareActivity, EnumC68831a aVar) {
            this.f153953a = systemShareActivity;
            this.f153954b = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            int i;
            C62723a a = this.f153953a.mo109423a();
            C89219l.m154716b(iVar, "");
            Object d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            a.mo100645a((List) d);
            C62723a a2 = this.f153953a.mo109423a();
            if (this.f153954b == EnumC68831a.IMAGE) {
                i = C62723a.f142185e;
            } else {
                i = C62723a.f142186f;
            }
            a2.f142191a = i;
            this.f153953a.mo109426c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$m */
    static final class C68843m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153965a;

        static {
            Covode.recordClassIndex(81144);
        }

        C68843m(SystemShareActivity systemShareActivity) {
            this.f153965a = systemShareActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            C68959i iVar = (C68959i) obj;
            if (!(iVar == null || (str = iVar.f154273c) == null || !(!C89361p.m154870a((CharSequence) str)))) {
                Context applicationContext = this.f153965a.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                new C79459a(applicationContext).mo123052a(str).mo123053a();
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.share.SystemShareActivity.C68843m.RunnableC688441 */

                /* renamed from: a */
                final /* synthetic */ C68843m f153966a;

                static {
                    Covode.recordClassIndex(81145);
                }

                {
                    this.f153966a = r1;
                }

                public final void run() {
                    this.f153966a.f153965a.finish();
                }
            }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$l */
    static final class C68842l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153964a;

        static {
            Covode.recordClassIndex(81143);
        }

        C68842l(SystemShareActivity systemShareActivity) {
            this.f153964a = systemShareActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Share.Response response = (Share.Response) obj;
            if (response != null) {
                SystemShareActivity systemShareActivity = this.f153964a;
                C68865aj ajVar = new C68865aj(systemShareActivity, systemShareActivity.f153935c);
                Share.Request request = this.f153964a.f153936d;
                if (request == null) {
                    C89219l.m154710a("shareRequest");
                }
                C33744d a = new C33744d().mo59983a("launch_from", ajVar.f154030a.mClientKey);
                String str = "";
                if (ajVar.f154030a.extras != null) {
                    str = ajVar.f154030a.extras.getString("style_id", str);
                }
                C39162r.m79460a("share_error_status", a.mo59983a("style_id", str).mo59980a("error_code", response.subErrorCode).f79943a);
                ajVar.mo109441a(request, response);
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f153938f = this;
        if (MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
            Bundle loginActivityBundle = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).getLoginActivityBundle();
            loginActivityBundle.putBoolean("is_disable_animation", true);
            IAccountService.C31274d dVar = new IAccountService.C31274d();
            dVar.f74960a = this;
            dVar.f74961b = this.f153943k;
            dVar.f74962c = this.f153942j;
            dVar.f74964e = new C68841k(this);
            dVar.f74963d = loginActivityBundle;
            C31575b.m65860b().showLoginAndRegisterView(dVar.mo57084a());
        } else {
            mo109425b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m121480a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo109424a(ArrayList<String> arrayList, EnumC68831a aVar) {
        int i;
        C89219l.m154721d(aVar, "");
        if (!C13603b.m24435a((Collection) arrayList)) {
            if (arrayList == null || arrayList.size() != 1) {
                C1731i.m5640b(new CallableC68834d(this, arrayList), C1731i.f5562a).mo5534a(new C68835e(this, aVar), C1731i.f5564c, null);
            } else {
                Uri parse = Uri.parse(arrayList.get(0));
                C89219l.m154716b(parse, "");
                if (C89361p.m154872a("content", parse.getScheme(), true)) {
                    C1731i.m5640b(new CallableC68832b(this, parse), C1731i.f5562a).mo5534a(new C68833c(this, aVar), C1731i.f5564c, null);
                } else {
                    C62723a aVar2 = this.f153934b;
                    if (aVar2 == null) {
                        C89219l.m154710a("shareDistictType");
                    }
                    if (aVar == EnumC68831a.IMAGE) {
                        i = C62723a.f142183c;
                    } else {
                        i = C62723a.f142184d;
                    }
                    aVar2.f142191a = i;
                    C62723a aVar3 = this.f153934b;
                    if (aVar3 == null) {
                        C89219l.m154710a("shareDistictType");
                    }
                    aVar3.mo100645a(arrayList);
                    mo109426c();
                }
            }
            C34718e.m70911a("system_share");
            return;
        }
        new C68865aj(this, this.f153935c).mo109440a("Params parsing error, media resource type difference you pass", 20002);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.SystemShareActivity$k */
    static final class C68841k implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ SystemShareActivity f153963a;

        static {
            Covode.recordClassIndex(81142);
        }

        C68841k(SystemShareActivity systemShareActivity) {
            this.f153963a = systemShareActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                this.f153963a.mo109425b();
            }
        }
    }
}
