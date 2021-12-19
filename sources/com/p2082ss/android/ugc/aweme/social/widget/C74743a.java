package com.p2082ss.android.ugc.aweme.social.widget;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.social.widget.a */
public final class C74743a implements AbstractC1183ag, AbstractC1204m {

    /* renamed from: a */
    public final Context f168002a;

    /* renamed from: b */
    public final String f168003b;

    /* renamed from: c */
    public final Map<String, String> f168004c;

    /* renamed from: d */
    private final AbstractC1196i f168005d;

    /* renamed from: e */
    private final C1182af f168006e;

    static {
        Covode.recordClassIndex(87586);
    }

    public C74743a() {
        this(null, null, null, null, 15);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f168005d;
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public final C1182af getViewModelStore() {
        return this.f168006e;
    }

    /* renamed from: a */
    public final Context mo117794a() {
        Context context = this.f168002a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r3.getLifecycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r2.f168005d = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r4 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = r4.getViewModelStore();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r3 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r0 = r3.getViewModelStore();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r2.f168006e = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r4 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        throw new java.lang.IllegalStateException("Social Context need ViewModel store!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        throw new java.lang.IllegalStateException("Social Context need Lifecycle!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r0 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r2.f168002a = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r4 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r0 = r4.getLifecycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C74743a(androidx.fragment.app.ActivityC0945e r3, androidx.fragment.app.Fragment r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            r2.<init>()
            r2.f168003b = r5
            r2.f168004c = r6
            if (r3 != 0) goto L_0x0041
            if (r4 == 0) goto L_0x0056
        L_0x0013:
            androidx.fragment.app.e r0 = r4.getActivity()
            if (r0 == 0) goto L_0x0044
        L_0x0019:
            r2.f168002a = r0
            r0 = 0
            if (r4 == 0) goto L_0x0024
            androidx.lifecycle.i r0 = r4.getLifecycle()
            if (r0 != 0) goto L_0x002c
        L_0x0024:
            if (r3 == 0) goto L_0x004e
            androidx.lifecycle.i r0 = r3.getLifecycle()
            if (r0 == 0) goto L_0x004e
        L_0x002c:
            r2.f168005d = r0
            if (r4 == 0) goto L_0x0036
            androidx.lifecycle.af r0 = r4.getViewModelStore()
            if (r0 != 0) goto L_0x003e
        L_0x0036:
            if (r3 == 0) goto L_0x0046
            androidx.lifecycle.af r0 = r3.getViewModelStore()
            if (r0 == 0) goto L_0x0046
        L_0x003e:
            r2.f168006e = r0
            return
        L_0x0041:
            if (r4 == 0) goto L_0x0044
            goto L_0x0013
        L_0x0044:
            r0 = r3
            goto L_0x0019
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Social Context need ViewModel store!"
            r1.<init>(r0)
            throw r1
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Social Context need Lifecycle!"
            r1.<init>(r0)
            throw r1
        L_0x0056:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Social Context init params error!"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.C74743a.<init>(androidx.fragment.app.e, androidx.fragment.app.Fragment, java.lang.String, java.util.Map):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C74743a(ActivityC0945e eVar, Fragment fragment, String str, Map map, int i) {
        this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : fragment, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? C89041ag.m154415a() : map);
    }
}
