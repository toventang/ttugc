package com.p2082ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.crossplatform.preload.C40716a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.c */
public final class C40737c extends CrossPlatformWebView {

    /* renamed from: j */
    public static final C40738a f95391j = new C40738a((byte) 0);

    /* renamed from: k */
    private boolean f95392k;

    /* renamed from: l */
    private Activity f95393l;

    /* renamed from: m */
    private boolean f95394m;

    /* renamed from: n */
    private boolean f95395n;

    /* renamed from: o */
    private final String f95396o;

    /* renamed from: p */
    private SparseArray f95397p;

    static {
        Covode.recordClassIndex(48589);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    /* renamed from: a */
    public final View mo69910a(int i) {
        if (this.f95397p == null) {
            this.f95397p = new SparseArray();
        }
        View view = (View) this.f95397p.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f95397p.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.c$a */
    public static final class C40738a {
        static {
            Covode.recordClassIndex(48590);
        }

        private C40738a() {
        }

        public /* synthetic */ C40738a(byte b) {
            this();
        }
    }

    public final boolean getMFromPreload() {
        return this.f95394m;
    }

    public final boolean getMLoadRnSuccess() {
        return this.f95395n;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    public final Activity getActivity() {
        Activity activity = super.getActivity();
        if (activity != null) {
            return activity;
        }
        return this.f95393l;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater cloneInContext = LayoutInflater.from(getContext()).cloneInContext(getContext());
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    public final void setMFromPreload(boolean z) {
        this.f95394m = z;
    }

    public final void setMLoadRnSuccess(boolean z) {
        this.f95395n = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView, com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    /* renamed from: d */
    public final void mo69928d(Activity activity) {
        MethodCollector.m26663i(6596);
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        if (C40716a.m82130a(this.f95396o) == this) {
            mo69916a("onDestroy");
            MethodCollector.m26664o(6596);
            return;
        }
        super.mo69928d(activity);
        MethodCollector.m26664o(6596);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    /* renamed from: a */
    public final void mo69917a(String str, Map<String, String> map) {
        super.mo69917a(str, map);
        this.f95395n = false;
        C40716a.m82131b(this.f95396o);
        Activity activity = this.f95393l;
        if (activity == null) {
            super.mo69928d(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    /* renamed from: a */
    public final void mo69920a(String str, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        if (!this.f95392k) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("container_launch_type", "preload");
            setAdditionalReportParams(linkedHashMap);
            super.mo69920a(str, z, z2);
            this.f95392k = true;
        }
    }
}
