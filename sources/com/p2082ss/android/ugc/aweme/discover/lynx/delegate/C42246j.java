package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16370a;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16387b;
import com.bytedance.ies.bullet.kit.lynx.p1153b.C16389b;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42018g;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.AbstractC42191c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.EnumC42198c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2781c.AbstractC42199a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2782d.C42210a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2782d.C42212b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2782d.C42213c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.C42261b;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42289d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.hybridkit.bridge.C53411c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j */
public final class C42246j extends AbstractC42218b implements AbstractC16370a, AbstractC17046h.AbstractC17048b, AbstractC42191c {

    /* renamed from: h */
    public static final C42247a f98425h = new C42247a((byte) 0);

    /* renamed from: a */
    public boolean f98426a;

    /* renamed from: c */
    public boolean f98427c;

    /* renamed from: d */
    public int f98428d = -1;

    /* renamed from: e */
    public int f98429e = -1;

    /* renamed from: f */
    public C42212b f98430f;

    /* renamed from: g */
    public int f98431g;

    /* renamed from: i */
    private final C42257l f98432i = new C42257l();

    /* renamed from: j */
    private String f98433j;

    static {
        Covode.recordClassIndex(50188);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$a */
    public static final class C42247a {
        static {
            Covode.recordClassIndex(50189);
        }

        private C42247a() {
        }

        public /* synthetic */ C42247a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m84556a(String str) {
            boolean z;
            if (str == null || C89361p.m154870a((CharSequence) str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("bundle");
                if (queryParameter == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(queryParameter, "");
                return C89361p.m154869a(queryParameter, "/template.js", "", false);
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$b */
    public static final class C42248b implements AbstractC17018b {
        static {
            Covode.recordClassIndex(50190);
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b
        /* renamed from: p */
        public final boolean mo26883p() {
            return true;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b
        /* renamed from: q */
        public final boolean mo26884q() {
            return true;
        }

        C42248b() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r11, (java.lang.Object) (r13 != null ? r13.getRawData() : null)) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r5 != 2) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71437a(com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.C42261b r9, java.lang.String r10, java.lang.String r11, com.lynx.tasm.TemplateData r12, com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d r13, com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.EnumC42198c r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42246j.mo71437a(com.ss.android.ugc.aweme.discover.lynx.e.b, java.lang.String, java.lang.String, com.lynx.tasm.TemplateData, com.ss.android.ugc.aweme.discover.mixfeed.d, com.ss.android.ugc.aweme.discover.lynx.b.c, boolean):void");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: a */
    public final void mo25957a(AbstractC16387b bVar, JSONObject jSONObject) {
        LynxView lynxView;
        C89219l.m154721d(bVar, "");
        bVar.mo25780p_();
        C42186b bVar2 = this.f98388b;
        if (bVar2 != null && (lynxView = bVar2.f98322d) != null) {
            lynxView.post(new RunnableC42253g(this));
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: a */
    public final void mo25956a(AbstractC16387b bVar, String str) {
        C89219l.m154721d(bVar, "");
        bVar.mo25780p_();
    }

    /* renamed from: d */
    public final void mo71438d() {
        C42212b bVar = this.f98430f;
        if (bVar != null) {
            bVar.mo71410a(this.f98388b, this.f98426a, this.f98428d, this.f98431g, this.f98427c);
        }
        this.f98430f = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$f */
    static final class RunnableC42252f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42246j f98447a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f98448b;

        static {
            Covode.recordClassIndex(50194);
        }

        RunnableC42252f(C42246j jVar, C89233z.C89238e eVar) {
            this.f98447a = jVar;
            this.f98448b = eVar;
        }

        public final void run() {
            new C42210a().mo106452c("schema", this.f98448b.element.getSchema()).mo106452c("status", String.valueOf(this.f98447a.f98428d)).mo96792f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$g */
    static final class RunnableC42253g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42246j f98449a;

        static {
            Covode.recordClassIndex(50195);
        }

        RunnableC42253g(C42246j jVar) {
            this.f98449a = jVar;
        }

        public final void run() {
            String str;
            LynxView lynxView;
            LynxView lynxView2;
            LynxView lynxView3;
            C42186b bVar = this.f98449a.f98388b;
            if (!(bVar == null || (lynxView3 = bVar.f98322d) == null)) {
                Integer.valueOf(lynxView3.getHeight());
            }
            C42186b bVar2 = this.f98449a.f98388b;
            if (!(bVar2 == null || (lynxView2 = bVar2.f98322d) == null)) {
                Integer.valueOf(lynxView2.getWidth());
            }
            C42186b bVar3 = this.f98449a.f98388b;
            int i = 0;
            if (bVar3 == null || (lynxView = bVar3.f98322d) == null || lynxView.getHeight() == 0) {
                C42213c a = new C42213c().mo71412a("template_height_error");
                C42345d dVar = this.f98449a.f98388b.f98326h;
                if (dVar != null) {
                    str = dVar.getSchema();
                } else {
                    str = null;
                }
                C42213c e = a.mo71415b(str).mo71417d(String.valueOf(this.f98449a.f98388b.f98325g)).mo71418e(String.valueOf(this.f98449a.f98426a ? 1 : 0));
                if (this.f98449a.f98428d == 1) {
                    i = 1;
                }
                e.mo71420g(String.valueOf(i)).mo96792f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$h */
    static final class RunnableC42254h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42186b f98450a;

        /* renamed from: b */
        final /* synthetic */ C42246j f98451b;

        /* renamed from: c */
        final /* synthetic */ AbstractC16208i f98452c;

        /* renamed from: d */
        final /* synthetic */ View f98453d;

        static {
            Covode.recordClassIndex(50196);
        }

        RunnableC42254h(C42186b bVar, C42246j jVar, AbstractC16208i iVar, View view) {
            this.f98450a = bVar;
            this.f98451b = jVar;
            this.f98452c = iVar;
            this.f98453d = view;
        }

        public final void run() {
            String str;
            LynxView lynxView;
            LynxView lynxView2;
            LynxView lynxView3;
            C42186b bVar = this.f98451b.f98388b;
            if (!(bVar == null || (lynxView3 = bVar.f98322d) == null)) {
                Integer.valueOf(lynxView3.getHeight());
            }
            C42186b bVar2 = this.f98451b.f98388b;
            if (!(bVar2 == null || (lynxView2 = bVar2.f98322d) == null)) {
                Integer.valueOf(lynxView2.getWidth());
            }
            C42186b bVar3 = this.f98451b.f98388b;
            int i = 0;
            if (bVar3 == null || (lynxView = bVar3.f98322d) == null || lynxView.getHeight() == 0) {
                C42213c a = new C42213c().mo71412a("template_height_error");
                C42345d dVar = this.f98451b.f98388b.f98326h;
                if (dVar != null) {
                    str = dVar.getSchema();
                } else {
                    str = null;
                }
                C42213c e = a.mo71415b(str).mo71417d(String.valueOf(this.f98451b.f98388b.f98325g)).mo71418e(String.valueOf(this.f98451b.f98426a ? 1 : 0));
                if (this.f98451b.f98428d == 1) {
                    i = 1;
                }
                e.mo71420g(String.valueOf(i)).mo96792f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$i */
    static final class RunnableC42255i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42246j f98454a;

        static {
            Covode.recordClassIndex(50197);
        }

        RunnableC42255i(C42246j jVar) {
            this.f98454a = jVar;
        }

        public final void run() {
            String str;
            LynxView lynxView;
            LynxView lynxView2;
            LynxView lynxView3;
            C42186b bVar = this.f98454a.f98388b;
            if (!(bVar == null || (lynxView3 = bVar.f98322d) == null)) {
                Integer.valueOf(lynxView3.getHeight());
            }
            C42186b bVar2 = this.f98454a.f98388b;
            if (!(bVar2 == null || (lynxView2 = bVar2.f98322d) == null)) {
                Integer.valueOf(lynxView2.getWidth());
            }
            C42186b bVar3 = this.f98454a.f98388b;
            int i = 0;
            if (bVar3 == null || (lynxView = bVar3.f98322d) == null || lynxView.getHeight() == 0) {
                C42213c a = new C42213c().mo71412a("template_height_error");
                C42345d dVar = this.f98454a.f98388b.f98326h;
                if (dVar != null) {
                    str = dVar.getSchema();
                } else {
                    str = null;
                }
                C42213c e = a.mo71415b(str).mo71417d(String.valueOf(this.f98454a.f98388b.f98325g)).mo71418e(String.valueOf(this.f98454a.f98426a ? 1 : 0));
                if (this.f98454a.f98428d == 1) {
                    i = 1;
                }
                e.mo71420g(String.valueOf(i)).mo96792f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e3, code lost:
        if (r4 == 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f6, code lost:
        if (r3 == null) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0195  */
    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71429a() {
        /*
        // Method dump skipped, instructions count: 900
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42246j.mo71429a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$d */
    static final class C42250d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f98443a;

        /* renamed from: b */
        final /* synthetic */ String f98444b;

        static {
            Covode.recordClassIndex(50192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42250d(C89233z.C89234a aVar, String str) {
            super(1);
            this.f98443a = aVar;
            this.f98444b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f98443a.element = bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: a */
    public final void mo25953a(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo25780p_();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: b */
    public final void mo25958b(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo25780p_();
        bVar.mo25773h();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: c */
    public final void mo25959c(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo25780p_();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: d */
    public final void mo25960d(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo25780p_();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42246j(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        bVar.mo71385a().mo71391a(this);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: e */
    public final void mo25961e(AbstractC16387b bVar) {
        LynxView lynxView;
        C89219l.m154721d(bVar, "");
        bVar.mo25780p_();
        bVar.mo25773h();
        C42186b bVar2 = this.f98388b;
        if (bVar2 != null && (lynxView = bVar2.f98322d) != null) {
            lynxView.post(new RunnableC42255i(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$e */
    public static final class C42251e extends AbstractC15507c {

        /* renamed from: a */
        final /* synthetic */ C42246j f98445a;

        /* renamed from: b */
        final /* synthetic */ C42345d f98446b;

        static {
            Covode.recordClassIndex(50193);
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25381a(AbstractC21154h hVar) {
            C89219l.m154721d(hVar, "");
            this.f98446b.getSchema();
            this.f98445a.f98388b.f98335q = C42289d.C42290a.m84653a(hVar);
            this.f98445a.f98388b.f98322d = (LynxView) hVar.mo34724a();
            this.f98445a.mo71438d();
            C89219l.m154721d(hVar, "");
            C16248b bVar = C53411c.C53412a.m98548a().get(hVar);
            if (bVar != null) {
                this.f98445a.f98388b.mo71385a().mo71390a(bVar);
            }
        }

        C42251e(C42246j jVar, C42345d dVar) {
            this.f98445a = jVar;
            this.f98446b = dVar;
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo34719a(AbstractC21154h hVar, String str, String str2) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(str, "");
            super.mo34719a(hVar, str, str2);
            if (this.f98445a.f98430f != null) {
                C42186b bVar = this.f98445a.f98388b;
                if (str2 == null) {
                    str2 = "";
                }
                C42212b.m84488a(bVar, str2, this.f98445a.f98428d, this.f98445a.f98431g);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.AbstractC42191c
    /* renamed from: a */
    public final void mo71389a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo25831b(AbstractC42018g.class, this.f98388b.f98331m.getValue());
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: f */
    public final void mo25962f(AbstractC16387b bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        bVar.mo25780p_();
        bVar.mo25773h();
        this.f98388b.mo71388c();
        AbstractC42199a aVar = this.f98388b.f98332n;
        if (aVar != null) {
            Integer num = this.f98388b.f98325g;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            aVar.mo71393a(i, this.f98388b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$c */
    public static final class C42249c extends AbstractC16370a.AbstractC16371a {

        /* renamed from: a */
        final /* synthetic */ C42246j f98434a;

        /* renamed from: b */
        final /* synthetic */ String f98435b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f98436c;

        /* renamed from: d */
        final /* synthetic */ C42261b f98437d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f98438e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89238e f98439f;

        /* renamed from: g */
        final /* synthetic */ C42345d f98440g;

        /* renamed from: h */
        final /* synthetic */ C89233z.C89238e f98441h;

        /* renamed from: i */
        final /* synthetic */ C89233z.C89234a f98442i;

        static {
            Covode.recordClassIndex(50191);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
        /* renamed from: b */
        public final void mo25958b(AbstractC16387b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo25958b(bVar);
            T t = this.f98436c.element;
            if (t != null) {
                this.f98434a.f98426a = true;
                this.f98437d.mo71457a(t.f82936a);
                this.f98438e.element = (T) t.f82937b.mo25832c(String.class);
                this.f98439f.element = (T) t.f82937b.mo25832c(TemplateData.class);
            }
            this.f98434a.mo71437a(this.f98437d, this.f98435b, this.f98438e.element, this.f98439f.element, this.f98440g, this.f98441h.element, this.f98442i.element);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
        /* renamed from: a */
        public final void mo25956a(AbstractC16387b bVar, String str) {
            C89219l.m154721d(bVar, "");
            super.mo25956a(bVar, str);
            this.f98434a.mo71437a(this.f98437d, this.f98435b, this.f98438e.element, this.f98439f.element, this.f98440g, EnumC42198c.FAILED, this.f98442i.element);
        }

        C42249c(C42246j jVar, String str, C89233z.C89238e eVar, C42261b bVar, C89233z.C89238e eVar2, C89233z.C89238e eVar3, C42345d dVar, C89233z.C89238e eVar4, C89233z.C89234a aVar) {
            this.f98434a = jVar;
            this.f98435b = str;
            this.f98436c = eVar;
            this.f98437d = bVar;
            this.f98438e = eVar2;
            this.f98439f = eVar3;
            this.f98440g = dVar;
            this.f98441h = eVar4;
            this.f98442i = aVar;
        }
    }

    /* renamed from: a */
    private final TemplateData m84536a(TemplateData templateData) {
        JSONObject jSONObject = new JSONObject();
        C42186b bVar = this.f98388b;
        Map<String, ? extends Object> map = bVar.f98327i;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("reactId", bVar.f98321c);
        jSONObject.put("sessionid", this.f98429e);
        jSONObject.put("screenWidth", C13628n.m24504a(bVar.f98319a));
        jSONObject.put("isPreload", false);
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            templateData.mo48812a(next, jSONObject.get(next));
        }
        return templateData;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        String str = "";
        C89219l.m154721d(uri, str);
        C89219l.m154721d(th, str);
        if (this.f98430f != null) {
            C42186b bVar = this.f98388b;
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            C42212b.m84488a(bVar, str, this.f98428d, this.f98431g);
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: a */
    public final void mo25955a(AbstractC16387b bVar, C16389b bVar2) {
        String str;
        C89219l.m154721d(bVar, "");
        C42213c a = new C42213c().mo71412a("load_error");
        C42345d dVar = this.f98388b.f98326h;
        String str2 = null;
        if (dVar != null) {
            str = dVar.getSchema();
        } else {
            str = null;
        }
        C42213c e = a.mo71415b(str).mo71417d(String.valueOf(this.f98388b.f98325g)).mo71418e(String.valueOf(this.f98426a ? 1 : 0));
        int i = 1;
        if (this.f98428d != 1) {
            i = 0;
        }
        C42213c g = e.mo71420g(String.valueOf(i));
        if (bVar2 != null) {
            str2 = bVar2.f39378c;
        }
        g.mo71416c(str2).mo96792f();
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C42186b bVar;
        LynxView lynxView;
        AbstractC1196i lifecycle;
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        C42186b bVar2 = this.f98388b;
        bVar2.f98320b = iVar;
        bVar2.f98321c = iVar.mo25762a().f39033a;
        int i = 0;
        if (bVar2.f98326h != null) {
            if (view instanceof WebView) {
                bVar2.f98324f = true;
            } else if (view instanceof LynxView) {
                bVar2.f98324f = false;
                LynxView lynxView2 = (LynxView) view;
                bVar2.f98322d = lynxView2;
                ActivityC0945e eVar = bVar2.f98319a;
                if (!(eVar == null || (lifecycle = eVar.getLifecycle()) == null)) {
                    lifecycle.mo4012a(new LynxViewReleaseObserver(lynxView2));
                }
                LynxView lynxView3 = bVar2.f98322d;
                if (lynxView3 != null) {
                    lynxView3.onEnterForeground();
                }
                if (!(!this.f98426a || (bVar = this.f98388b) == null || (lynxView = bVar.f98322d) == null)) {
                    lynxView.post(new RunnableC42254h(bVar2, this, iVar, view));
                }
            }
        }
        this.f98388b.mo71388c();
        AbstractC42199a aVar = this.f98388b.f98332n;
        if (aVar != null) {
            Integer num = this.f98388b.f98325g;
            if (num != null) {
                i = num.intValue();
            }
            aVar.mo71393a(i, this.f98388b);
        }
        mo71438d();
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        double d;
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
        iVar.mo25780p_();
        String scheme = uri.getScheme();
        if (scheme == null) {
            return;
        }
        if (C89219l.m154714a((Object) scheme, (Object) "https") || C89219l.m154714a((Object) scheme, (Object) "http")) {
            C42186b bVar = this.f98388b;
            C42345d dVar = bVar.f98326h;
            double d2 = 0.0d;
            if (dVar != null) {
                d = (double) dVar.getHeight();
            } else {
                d = 0.0d;
            }
            bVar.f98336r.getLayoutParams().height = C34728n.m70946a(d);
            C42345d dVar2 = bVar.f98326h;
            if (dVar2 != null) {
                d2 = (double) dVar2.getWidth();
            }
            bVar.f98336r.getLayoutParams().width = C34728n.m70946a(d2);
            C51423a.m95784a(3, null, "uri:".concat(String.valueOf(uri)));
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a
    /* renamed from: a */
    public final void mo25954a(AbstractC16387b bVar, Context context, AbstractC89183m<Object, ? super Throwable, C89391z> mVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        bVar.mo25780p_();
    }
}
