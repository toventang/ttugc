package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2 */
public class DeepLinkActivityV2 extends ActivityC17312a {

    /* renamed from: e */
    public static final C40987a f95829e = new C40987a((byte) 0);

    /* renamed from: a */
    public C41035d f95830a;

    /* renamed from: b */
    public final C41022c f95831b = new C41022c();

    /* renamed from: c */
    public boolean f95832c;

    /* renamed from: d */
    public Intent f95833d;

    /* renamed from: f */
    private Uri f95834f;

    /* renamed from: g */
    private SparseArray f95835g;

    static {
        Covode.recordClassIndex(48841);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f95835g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f95835g == null) {
            this.f95835g = new SparseArray();
        }
        View view = (View) this.f95835g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f95835g.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2$a */
    public static final class C40987a {
        static {
            Covode.recordClassIndex(48842);
        }

        private C40987a() {
        }

        public /* synthetic */ C40987a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C41035d mo70168a() {
        C41035d dVar = this.f95830a;
        if (dVar == null) {
            C89219l.m154710a("deepLinkData");
        }
        return dVar;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C41050m.f95959a.mo70169a();
        Intent intent = this.f95833d;
        if (intent != null) {
            intent.getData();
            m82532a(this, intent);
            this.f95833d = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2$b */
    static final class C40988b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C40988b f95836a = new C40988b();

        static {
            Covode.recordClassIndex(48843);
        }

        C40988b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C409891.f95837a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final boolean m82533a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!C13627m.m24498a(action)) {
            if (action == null) {
                C89219l.m154715b();
            }
            if (C89361p.m154888a((CharSequence) action, "com.ss.android.sdk.", 0, false, 6) == 0) {
                String a = m82531a(intent, "open_url");
                if (!C13627m.m24498a(a)) {
                    try {
                        this.f95834f = Uri.parse(a);
                    } catch (Exception unused) {
                        return false;
                    }
                }
            }
        }
        if (this.f95834f == null) {
            this.f95834f = intent.getData();
        }
        Uri uri = this.f95834f;
        if (uri == null || uri.isOpaque()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m82531a(intent, "inner_from");
            String a = m82531a(intent, "inner_from");
            if (a != null) {
                int hashCode = a.hashCode();
                if (hashCode != -414536821) {
                    if (hashCode != -274828254) {
                        if (hashCode == 929166351 && a.equals("require_login")) {
                            C41039c.m82672b("LoginNode");
                            IDeepLinkService.C40991a.m82597a(C41050m.f95959a);
                            return;
                        }
                        return;
                    } else if (a.equals("switch_account")) {
                        C41039c.m82672b("MultiAccountNode");
                        IDeepLinkService.C40991a.m82597a(C41050m.f95959a);
                        return;
                    } else {
                        return;
                    }
                } else if (a.equals("new_user_journey")) {
                    C41039c.m82672b("NewUserJourneyNode");
                    IDeepLinkService.C40991a.m82597a(C41050m.f95959a);
                    return;
                } else {
                    return;
                }
            }
        }
        finish();
        this.f95833d = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0122, code lost:
        if (android.text.TextUtils.isEmpty(r0.getExternalRouteMap().get(r1)) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        if (r2 == null) goto L_0x0146;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0337  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 1413
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m82531a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m82532a(DeepLinkActivityV2 deepLinkActivityV2, Intent intent) {
        C84349a.m145093a(intent, deepLinkActivityV2);
        deepLinkActivityV2.startActivity(intent);
    }
}
