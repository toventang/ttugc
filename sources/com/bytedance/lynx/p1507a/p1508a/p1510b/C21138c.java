package com.bytedance.lynx.p1507a.p1508a.p1510b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.hybrid.p1522h.C21197b;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.a.a.b.c */
public class C21138c extends C21197b {

    /* renamed from: a */
    private String f50154a;

    /* renamed from: b */
    private String f50155b;

    /* renamed from: c */
    private boolean f50156c;

    /* renamed from: d */
    private C21142a f50157d;

    /* renamed from: e */
    private C21142a f50158e;

    /* renamed from: f */
    private boolean f50159f;

    /* renamed from: g */
    private boolean f50160g;

    /* renamed from: h */
    private boolean f50161h;

    static {
        Covode.recordClassIndex(24754);
    }

    public C21138c() {
        this(null, 1, null);
    }

    public final boolean getBlockBackPress() {
        return this.f50160g;
    }

    public final C21142a getContainerBgColor() {
        return this.f50158e;
    }

    public final boolean getDisableBackPress() {
        return this.f50159f;
    }

    public final boolean getDisableHardwareAccelerate() {
        return this.f50161h;
    }

    public final String getFallbackUrl() {
        return this.f50155b;
    }

    public final boolean getHideLoading() {
        return this.f50156c;
    }

    public final C21142a getLoadingBgColor() {
        return this.f50157d;
    }

    public final String getUrl() {
        return this.f50154a;
    }

    public final void setBlockBackPress(boolean z) {
        this.f50160g = z;
    }

    public final void setContainerBgColor(C21142a aVar) {
        this.f50158e = aVar;
    }

    public final void setDisableBackPress(boolean z) {
        this.f50159f = z;
    }

    public final void setDisableHardwareAccelerate(boolean z) {
        this.f50161h = z;
    }

    public final void setHideLoading(boolean z) {
        this.f50156c = z;
    }

    public final void setLoadingBgColor(C21142a aVar) {
        this.f50157d = aVar;
    }

    public final void setFallbackUrl(String str) {
        C89219l.m154719c(str, "");
        this.f50155b = str;
    }

    public final void setUrl(String str) {
        C89219l.m154719c(str, "");
        this.f50154a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21138c(EnumC21149c cVar) {
        super(cVar);
        C89219l.m154719c(cVar, "");
        this.f50154a = "";
        this.f50155b = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21138c(EnumC21149c cVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? EnumC21149c.UNKNOWN : cVar);
    }
}
