package com.bytedance.lynx.p1507a.p1508a.p1510b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.a.a.b.a */
public final class C21136a extends C21138c {

    /* renamed from: a */
    private String f50127a;

    /* renamed from: b */
    private C21142a f50128b;

    /* renamed from: c */
    private boolean f50129c;

    /* renamed from: d */
    private C21142a f50130d;

    /* renamed from: e */
    private boolean f50131e;

    /* renamed from: f */
    private C21142a f50132f;

    /* renamed from: g */
    private String f50133g;

    /* renamed from: h */
    private boolean f50134h;

    /* renamed from: i */
    private String f50135i;

    /* renamed from: j */
    private boolean f50136j;

    /* renamed from: k */
    private boolean f50137k;

    static {
        Covode.recordClassIndex(24752);
    }

    public C21136a() {
        this(null, 1, null);
    }

    public final boolean getHideNavBar() {
        return this.f50129c;
    }

    public final boolean getHideStatusBar() {
        return this.f50131e;
    }

    public final C21142a getNavBarColor() {
        return this.f50130d;
    }

    public final String getNavBtnType() {
        return this.f50135i;
    }

    public final boolean getShowCloseAll() {
        return this.f50136j;
    }

    public final C21142a getStatusBgColor() {
        return this.f50132f;
    }

    public final String getStatusFontMode() {
        return this.f50133g;
    }

    public final String getTitle() {
        return this.f50127a;
    }

    public final C21142a getTitleColor() {
        return this.f50128b;
    }

    public final boolean getTransStatusBar() {
        return this.f50134h;
    }

    public final boolean getUseWebTitle() {
        return this.f50137k;
    }

    public final void setHideNavBar(boolean z) {
        this.f50129c = z;
    }

    public final void setHideStatusBar(boolean z) {
        this.f50131e = z;
    }

    public final void setNavBarColor(C21142a aVar) {
        this.f50130d = aVar;
    }

    public final void setNavBtnType(String str) {
        this.f50135i = str;
    }

    public final void setShowCloseAll(boolean z) {
        this.f50136j = z;
    }

    public final void setStatusBgColor(C21142a aVar) {
        this.f50132f = aVar;
    }

    public final void setStatusFontMode(String str) {
        this.f50133g = str;
    }

    public final void setTitleColor(C21142a aVar) {
        this.f50128b = aVar;
    }

    public final void setTransStatusBar(boolean z) {
        this.f50134h = z;
    }

    public final void setUseWebTitle(boolean z) {
        this.f50137k = z;
    }

    public final void setTitle(String str) {
        C89219l.m154719c(str, "");
        this.f50127a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21136a(EnumC21149c cVar) {
        super(cVar);
        C89219l.m154719c(cVar, "");
        this.f50127a = "";
        this.f50137k = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21136a(EnumC21149c cVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? EnumC21149c.UNKNOWN : cVar);
    }
}
