package com.p084a.p085a.p086a.p087a;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.view.SimpleDraweeView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.a.a.a.a.a */
public final class C1766a {

    /* renamed from: a */
    public Drawable f5661a;

    /* renamed from: b */
    public Drawable f5662b;

    /* renamed from: c */
    public C24229q.AbstractC24231b f5663c;

    /* renamed from: d */
    public C24229q.AbstractC24231b f5664d;

    /* renamed from: e */
    public float f5665e;

    /* renamed from: f */
    public boolean f5666f;

    /* renamed from: g */
    public boolean f5667g = true;

    /* renamed from: h */
    public boolean f5668h = true;

    /* renamed from: i */
    public boolean f5669i = true;

    /* renamed from: j */
    public boolean f5670j = true;

    static {
        Covode.recordClassIndex(1936);
    }

    public C1766a() {
        C24229q.AbstractC24231b bVar = C24229q.AbstractC24231b.f57457g;
        C89219l.m154709a((Object) bVar, "");
        this.f5663c = bVar;
        C24229q.AbstractC24231b bVar2 = C24229q.AbstractC24231b.f57457g;
        C89219l.m154709a((Object) bVar2, "");
        this.f5664d = bVar2;
    }

    /* renamed from: a */
    private static C24250e m5933a(SimpleDraweeView simpleDraweeView) {
        C24246a aVar = (C24246a) simpleDraweeView.getHierarchy();
        C89219l.m154709a((Object) aVar, "");
        C24250e eVar = aVar.f57470a;
        if (eVar != null) {
            return eVar;
        }
        C24250e eVar2 = new C24250e();
        C24246a aVar2 = (C24246a) simpleDraweeView.getHierarchy();
        C89219l.m154709a((Object) aVar2, "");
        aVar2.mo39959a(eVar2);
        return eVar2;
    }

    /* renamed from: a */
    private static C24229q.AbstractC24231b m5932a(String str) {
        switch (str.hashCode()) {
            case -1928367066:
                if (str.equals("fitBottomStart")) {
                    C24229q.AbstractC24231b bVar = C24229q.AbstractC24231b.f57460j;
                    C89219l.m154709a((Object) bVar, "");
                    return bVar;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    C24229q.AbstractC24231b bVar2 = C24229q.AbstractC24231b.f57456f;
                    C89219l.m154709a((Object) bVar2, "");
                    return bVar2;
                }
                break;
            case -1274298614:
                if (str.equals("fitEnd")) {
                    C24229q.AbstractC24231b bVar3 = C24229q.AbstractC24231b.f57455e;
                    C89219l.m154709a((Object) bVar3, "");
                    return bVar3;
                }
                break;
            case -522179887:
                if (str.equals("fitStart")) {
                    C24229q.AbstractC24231b bVar4 = C24229q.AbstractC24231b.f57453c;
                    C89219l.m154709a((Object) bVar4, "");
                    return bVar4;
                }
                break;
            case -340708175:
                if (str.equals("centerInside")) {
                    C24229q.AbstractC24231b bVar5 = C24229q.AbstractC24231b.f57457g;
                    C89219l.m154709a((Object) bVar5, "");
                    return bVar5;
                }
                break;
            case 97441490:
                if (str.equals("fitXY")) {
                    C24229q.AbstractC24231b bVar6 = C24229q.AbstractC24231b.f57452b;
                    C89219l.m154709a((Object) bVar6, "");
                    return bVar6;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    C24229q.AbstractC24231b bVar7 = C24229q.AbstractC24231b.f57454d;
                    C89219l.m154709a((Object) bVar7, "");
                    return bVar7;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    C24229q.AbstractC24231b bVar8 = C24229q.AbstractC24231b.f57458h;
                    C89219l.m154709a((Object) bVar8, "");
                    return bVar8;
                }
                break;
            case 1628133256:
                if (str.equals("focusCrop")) {
                    C24229q.AbstractC24231b bVar9 = C24229q.AbstractC24231b.f57459i;
                    C89219l.m154709a((Object) bVar9, "");
                    return bVar9;
                }
                break;
        }
        throw new IllegalArgumentException("fresco unsupported scale attr ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public final void mo5575a(SimpleDraweeView simpleDraweeView, ViewGroup.LayoutParams layoutParams) {
        float f;
        float f2;
        float f3;
        C89219l.m154719c(simpleDraweeView, "");
        C89219l.m154719c(layoutParams, "");
        Drawable drawable = this.f5661a;
        if (drawable != null) {
            ((C24246a) simpleDraweeView.getHierarchy()).mo39957a(drawable, this.f5663c);
        }
        if (this.f5662b != null) {
            ((C24246a) simpleDraweeView.getHierarchy()).mo39964b(this.f5662b, this.f5664d);
        }
        if (this.f5666f) {
            float f4 = 0.0f;
            if (this.f5667g) {
                f = this.f5665e;
            } else {
                f = 0.0f;
            }
            if (this.f5668h) {
                f2 = this.f5665e;
            } else {
                f2 = 0.0f;
            }
            if (this.f5669i) {
                f3 = this.f5665e;
            } else {
                f3 = 0.0f;
            }
            if (this.f5670j) {
                f4 = this.f5665e;
            }
            m5933a(simpleDraweeView).mo39979a(f, f2, f4, f3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        if (r1.equals("roundBottomStart") != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        r5.f5666f = true;
        r0 = r7.f5673a;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r5.f5669i = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009a, code lost:
        if (r1.equals("roundBottomRight") != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r1.equals("roundTopStart") != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
        if (r1.equals("roundTopRight") != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
        if (r1.equals("roundTopLeft") != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        r5.f5666f = true;
        r0 = r7.f5673a;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r5.f5667g = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r1.equals("roundBottomLeft") != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        if (r1.equals("roundBottomEnd") != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0170, code lost:
        r5.f5666f = true;
        r0 = r7.f5673a;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r5.f5670j = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0196, code lost:
        if (r1.equals("roundTopEnd") != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0198, code lost:
        r5.f5666f = true;
        r0 = r7.f5673a;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r5.f5668h = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a5, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5576a(java.lang.String r6, com.p084a.p088b.p089a.C1863a r7, com.facebook.drawee.view.SimpleDraweeView r8, android.view.ViewGroup.LayoutParams r9) {
        /*
        // Method dump skipped, instructions count: 610
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p084a.p085a.p086a.p087a.C1766a.mo5576a(java.lang.String, com.a.b.a.a, com.facebook.drawee.view.SimpleDraweeView, android.view.ViewGroup$LayoutParams):boolean");
    }
}
