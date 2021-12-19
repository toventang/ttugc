package com.bytedance.lynx.hybrid;

import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.p1515a.C21147a;
import com.bytedance.lynx.hybrid.p1515a.EnumC21149c;
import com.bytedance.lynx.hybrid.p1519e.C21187d;
import com.bytedance.lynx.hybrid.p1521g.C21192a;
import com.bytedance.lynx.hybrid.p1521g.C21194b;
import com.bytedance.lynx.hybrid.p1523i.C21202b;
import com.bytedance.lynx.hybrid.service.AbstractC21365f;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28818l;
import com.lynx.tasm.C28820n;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.component.AbstractC28735a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.l */
public final class C21217l implements AbstractC21195h {

    /* renamed from: a */
    EnumC21149c f50340a;

    /* renamed from: b */
    public C28818l f50341b;

    /* renamed from: c */
    public String f50342c;

    /* renamed from: d */
    public Integer f50343d;

    /* renamed from: e */
    public Integer f50344e;

    /* renamed from: f */
    public Integer f50345f;

    /* renamed from: g */
    public Integer f50346g;

    /* renamed from: h */
    public Float f50347h;

    /* renamed from: i */
    public AbstractC28735a f50348i;

    /* renamed from: j */
    public C21225n f50349j;

    /* renamed from: k */
    public TemplateData f50350k;

    /* renamed from: l */
    public boolean f50351l;

    /* renamed from: m */
    public AbstractC89172b<? super C28820n, C89391z> f50352m;

    /* renamed from: n */
    public AbstractC21365f f50353n;

    /* renamed from: o */
    public final Map<String, Object> f50354o;

    /* renamed from: p */
    public List<AbstractC28838o> f50355p;

    /* renamed from: q */
    public Map<String, C21194b> f50356q;

    /* renamed from: r */
    public List<C28463a> f50357r;

    /* renamed from: s */
    public C21192a f50358s;

    /* renamed from: t */
    public C21200i f50359t;

    /* renamed from: u */
    public String f50360u;

    /* renamed from: v */
    Uri f50361v;

    static {
        Covode.recordClassIndex(24833);
    }

    @Override // com.bytedance.lynx.hybrid.AbstractC21195h
    /* renamed from: a */
    public final EnumC21149c mo34744a() {
        return this.f50340a;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Map<String, C21194b> map = this.f50356q;
        int i6 = 0;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        List<C28463a> list = this.f50357r;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        C21192a aVar = this.f50358s;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        C21200i iVar = this.f50359t;
        if (iVar != null) {
            i4 = iVar.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str = this.f50360u;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        Uri uri = this.f50361v;
        if (uri != null) {
            i6 = uri.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        return "LynxKitInitParams(lynxModules=" + this.f50356q + ", lynxBehaviors=" + this.f50357r + ", initData=" + this.f50358s + ", asyncLayoutParam=" + this.f50359t + ", preloadFonts=" + this.f50360u + ", loadUri=" + this.f50361v + ")";
    }

    @Override // com.bytedance.lynx.hybrid.AbstractC21195h
    /* renamed from: a */
    public final void mo34745a(Map<String, ? extends Object> map) {
        if (map != null) {
            this.f50354o.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21217l)) {
            return false;
        }
        C21217l lVar = (C21217l) obj;
        if (!C89219l.m154714a(this.f50356q, lVar.f50356q) || !C89219l.m154714a(this.f50357r, lVar.f50357r) || !C89219l.m154714a(this.f50358s, lVar.f50358s) || !C89219l.m154714a(this.f50359t, lVar.f50359t) || !C89219l.m154714a((Object) this.f50360u, (Object) lVar.f50360u) || !C89219l.m154714a(this.f50361v, lVar.f50361v)) {
            return false;
        }
        return true;
    }

    private C21217l(Uri uri) {
        Locale locale;
        this.f50356q = null;
        this.f50357r = null;
        this.f50358s = null;
        this.f50359t = null;
        this.f50360u = null;
        this.f50361v = uri;
        this.f50340a = EnumC21149c.LYNX;
        C89378p[] pVarArr = new C89378p[8];
        C89219l.m154709a((Object) LynxEnv.m56706b(), "");
        pVarArr[0] = C89387v.m154943a("lynxSdkVersion", LynxEnv.m56707g());
        pVarArr[1] = C89387v.m154943a("screenWidth", Integer.valueOf(C21202b.m39908a((double) C21202b.m39912b(C21187d.m39885a()), C21187d.m39885a())));
        pVarArr[2] = C89387v.m154943a("screenHeight", Integer.valueOf(C21202b.m39908a((double) C21202b.m39910a(C21187d.m39885a()), C21187d.m39885a())));
        pVarArr[3] = C89387v.m154943a("statusBarHeight", Integer.valueOf(C21202b.m39908a((double) C21202b.m39913c(C21187d.m39885a()), C21187d.m39885a())));
        String str = Build.MODEL;
        C89219l.m154709a((Object) str, "");
        pVarArr[4] = C89387v.m154943a("deviceModel", str);
        pVarArr[5] = C89387v.m154943a("os", "Android");
        String str2 = Build.VERSION.RELEASE;
        C89219l.m154709a((Object) str2, "");
        pVarArr[6] = C89387v.m154943a("osVersion", str2);
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
            C89219l.m154709a((Object) locale, "");
        } else {
            locale = Locale.getDefault();
            C89219l.m154709a((Object) locale, "");
        }
        pVarArr[7] = C89387v.m154943a("language", locale.getLanguage() + "-" + locale.getCountry());
        Map<String, Object> b = C89041ag.m154427b(pVarArr);
        C21147a aVar = C21170d.C21171a.m39868a().f50223d;
        if (aVar != null) {
            b.putAll(aVar);
        }
        this.f50354o = b;
        this.f50355p = new ArrayList();
    }

    public /* synthetic */ C21217l(Uri uri, byte b) {
        this(uri);
    }
}
