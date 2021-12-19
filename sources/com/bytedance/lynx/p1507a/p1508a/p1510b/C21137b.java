package com.bytedance.lynx.p1507a.p1508a.p1510b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.p1507a.p1508a.p1509a.C21133a;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.a.a.b.b */
public final class C21137b extends C21138c {

    /* renamed from: a */
    private String f50138a;

    /* renamed from: b */
    private int f50139b;

    /* renamed from: c */
    private int f50140c;

    /* renamed from: d */
    private int f50141d;

    /* renamed from: e */
    private boolean f50142e;

    /* renamed from: f */
    private C21142a f50143f;

    /* renamed from: g */
    private boolean f50144g;

    /* renamed from: h */
    private boolean f50145h;

    /* renamed from: i */
    private String f50146i;

    /* renamed from: j */
    private boolean f50147j;

    /* renamed from: k */
    private int f50148k;

    /* renamed from: l */
    private int f50149l;

    /* renamed from: m */
    private int f50150m;

    /* renamed from: n */
    private int f50151n;

    /* renamed from: o */
    private int f50152o;

    /* renamed from: p */
    private boolean f50153p;

    static {
        Covode.recordClassIndex(24753);
    }

    public C21137b() {
        this(null, 1, null);
    }

    public final String getAnimation() {
        return this.f50146i;
    }

    public final boolean getDisableMaskClose() {
        return this.f50144g;
    }

    public final boolean getDragBack() {
        return this.f50153p;
    }

    public final boolean getDragByGesture() {
        return this.f50147j;
    }

    public final int getDragDownCloseThreshold() {
        return this.f50151n;
    }

    public final int getDragDownThreshold() {
        return this.f50150m;
    }

    public final int getDragHeight() {
        return this.f50148k;
    }

    public final int getDragUpThreshold() {
        return this.f50149l;
    }

    public final String getGravity() {
        return this.f50138a;
    }

    public final int getHeight() {
        return this.f50140c;
    }

    public final C21142a getMaskBgColor() {
        return this.f50143f;
    }

    public final int getPeekDownCloseThreshold() {
        return this.f50152o;
    }

    public final boolean getPullDownClose() {
        return this.f50145h;
    }

    public final int getRadius() {
        return this.f50141d;
    }

    public final boolean getShowMask() {
        return this.f50142e;
    }

    public final int getWidth() {
        return this.f50139b;
    }

    public final void setDisableMaskClose(boolean z) {
        this.f50144g = z;
    }

    public final void setDragBack(boolean z) {
        this.f50153p = z;
    }

    public final void setDragByGesture(boolean z) {
        this.f50147j = z;
    }

    public final void setDragDownCloseThreshold(int i) {
        this.f50151n = i;
    }

    public final void setDragDownThreshold(int i) {
        this.f50150m = i;
    }

    public final void setDragHeight(int i) {
        this.f50148k = i;
    }

    public final void setDragUpThreshold(int i) {
        this.f50149l = i;
    }

    public final void setHeight(int i) {
        this.f50140c = i;
    }

    public final void setMaskBgColor(C21142a aVar) {
        this.f50143f = aVar;
    }

    public final void setPeekDownCloseThreshold(int i) {
        this.f50152o = i;
    }

    public final void setPullDownClose(boolean z) {
        this.f50145h = z;
    }

    public final void setRadius(int i) {
        this.f50141d = i;
    }

    public final void setShowMask(boolean z) {
        this.f50142e = z;
    }

    public final void setWidth(int i) {
        this.f50139b = i;
    }

    public final void setAnimation(String str) {
        C89219l.m154719c(str, "");
        this.f50146i = str;
    }

    public final void setGravity(String str) {
        C89219l.m154719c(str, "");
        this.f50138a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21137b(EnumC21149c cVar) {
        super(cVar);
        C89219l.m154719c(cVar, "");
        this.f50138a = "bottom";
        this.f50139b = C21133a.C21134a.C21135a.f50124a;
        this.f50140c = C21133a.C21134a.C21135a.f50125b;
        this.f50141d = 8;
        this.f50146i = "auto";
        this.f50148k = -1;
        this.f50149l = C21133a.C21134a.C21135a.f50126c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21137b(EnumC21149c cVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? EnumC21149c.UNKNOWN : cVar);
    }
}
