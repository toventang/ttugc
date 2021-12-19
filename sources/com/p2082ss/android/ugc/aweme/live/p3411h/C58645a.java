package com.p2082ss.android.ugc.aweme.live.p3411h;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.h.a */
public final class C58645a {

    /* renamed from: a */
    public Activity f133545a;

    /* renamed from: b */
    public HSImageView f133546b;

    /* renamed from: c */
    public boolean f133547c = true;

    /* renamed from: d */
    public boolean f133548d = true;

    /* renamed from: e */
    public View f133549e;

    /* renamed from: f */
    public LiveLoadingView f133550f;

    /* renamed from: g */
    public long f133551g;

    /* renamed from: h */
    private ViewStub f133552h;

    static {
        Covode.recordClassIndex(68945);
    }

    /* renamed from: a */
    public final void mo96096a() {
        this.f133547c = false;
        C13628n.m24510a(this.f133550f, 8);
        if (!this.f133548d && !this.f133547c) {
            C13628n.m24510a(this.f133549e, 8);
        }
        m107773c();
    }

    /* renamed from: b */
    public final void mo96097b() {
        this.f133548d = false;
        C13628n.m24510a(this.f133546b, 8);
        if (!this.f133548d && !this.f133547c) {
            C13628n.m24510a(this.f133549e, 8);
        }
    }

    /* renamed from: c */
    private void m107773c() {
        if (this.f133551g > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", String.valueOf(this.f133551g));
            C6501b.C6502a.m13948a("livesdk_pre_loading_duration").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
            this.f133551g = 0;
        }
    }

    public C58645a(Activity activity) {
        MethodCollector.m26663i(305);
        this.f133545a = activity;
        if (activity != null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.cfj);
            this.f133552h = viewStub;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                this.f133549e = inflate;
                if (inflate != null) {
                    this.f133546b = (HSImageView) inflate.findViewById(R.id.c_u);
                    this.f133550f = (LiveLoadingView) this.f133549e.findViewById(R.id.cbf);
                }
            }
        }
        MethodCollector.m26664o(305);
    }
}
