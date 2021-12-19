package com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42436r;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.utils.C80291cb;
import com.p2082ss.android.ugc.aweme.utils.C80381eh;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b */
public final class C34110b extends AbstractC34120c {

    /* renamed from: c */
    public static final C34111a f80650c = new C34111a((byte) 0);

    /* renamed from: a */
    final View f80651a;

    /* renamed from: b */
    public final AbstractC89171a<C89391z> f80652b;

    /* renamed from: f */
    private final AbstractC89244h f80653f = C89250i.m154773a((AbstractC89171a) new C34113c(this));

    /* renamed from: g */
    private final AbstractC89244h f80654g = C89250i.m154773a((AbstractC89171a) new C34115e(this));

    /* renamed from: h */
    private final AbstractC89244h f80655h = C89250i.m154773a((AbstractC89171a) new C34116f(this));

    /* renamed from: i */
    private final AbstractC89244h f80656i = C89250i.m154773a((AbstractC89171a) new C34117g(this));

    /* renamed from: j */
    private final AbstractC89244h f80657j = C89250i.m154773a((AbstractC89171a) new C34119i(this));

    /* renamed from: k */
    private final AbstractC89244h f80658k = C89250i.m154773a((AbstractC89171a) new C34118h(this));

    static {
        Covode.recordClassIndex(41044);
    }

    /* renamed from: b */
    private final boolean m69700b() {
        return ((Boolean) this.f80653f.getValue()).booleanValue();
    }

    /* renamed from: c */
    private final ViewGroup m69701c() {
        return (ViewGroup) this.f80654g.getValue();
    }

    /* renamed from: d */
    private final TextView m69702d() {
        return (TextView) this.f80657j.getValue();
    }

    /* renamed from: a */
    public final SmartImageView mo60408a() {
        return (SmartImageView) this.f80655h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$a */
    static final class C34111a {
        static {
            Covode.recordClassIndex(41045);
        }

        private C34111a() {
        }

        public /* synthetic */ C34111a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$e */
    static final class C34115e extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ C34110b f80662a;

        static {
            Covode.recordClassIndex(41049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34115e(C34110b bVar) {
            super(0);
            this.f80662a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            return this.f80662a.f80651a.findViewById(R.id.bec);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$f */
    static final class C34116f extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ C34110b f80663a;

        static {
            Covode.recordClassIndex(41050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34116f(C34110b bVar) {
            super(0);
            this.f80663a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f80663a.f80651a.findViewById(R.id.bed);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$g */
    static final class C34117g extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C34110b f80664a;

        static {
            Covode.recordClassIndex(41051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34117g(C34110b bVar) {
            super(0);
            this.f80664a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f80664a.f80651a.findViewById(R.id.bee);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$h */
    static final class C34118h extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C34110b f80665a;

        static {
            Covode.recordClassIndex(41052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34118h(C34110b bVar) {
            super(0);
            this.f80665a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f80665a.f80651a.findViewById(R.id.bem);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$i */
    static final class C34119i extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C34110b f80666a;

        static {
            Covode.recordClassIndex(41053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34119i(C34110b bVar) {
            super(0);
            this.f80666a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f80666a.f80651a.findViewById(R.id.ben);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$c */
    static final class C34113c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C34110b f80660a;

        static {
            Covode.recordClassIndex(41047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34113c(C34110b bVar) {
            super(0);
            this.f80660a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Context context = this.f80660a.f80651a.getContext();
            C89219l.m154716b(context, "");
            return Boolean.valueOf(C23163i.m43663a(context));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$d */
    public static final class C34114d extends C80381eh {

        /* renamed from: a */
        final /* synthetic */ C34110b f80661a;

        static {
            Covode.recordClassIndex(41048);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34114d(C34110b bVar) {
            this.f80661a = bVar;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k, com.p2082ss.android.ugc.aweme.utils.C80381eh
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            SmartImageView a = this.f80661a.mo60408a();
            C89219l.m154716b(a, "");
            a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.b$b */
    static final class View$OnClickListenerC34112b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34110b f80659a;

        static {
            Covode.recordClassIndex(41046);
        }

        View$OnClickListenerC34112b(C34110b bVar) {
            this.f80659a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f80659a.f80652b.invoke();
        }
    }

    public C34110b(ViewStub viewStub, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(8053);
        this.f80652b = aVar;
        viewStub.setLayoutResource(R.layout.au_);
        View inflate = viewStub.inflate();
        C89219l.m154716b(inflate, "");
        this.f80651a = inflate;
        MethodCollector.m26664o(8053);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.AbstractC34120c, com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.AbstractC34121d
    /* renamed from: a */
    public final void mo60409a(C42411h hVar, C67568r rVar) {
        String str;
        String str2;
        long j;
        boolean z;
        float applyDimension;
        float applyDimension2;
        float applyDimension3;
        float f;
        float f2;
        float f3;
        float applyDimension4;
        String str3;
        String str4;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(rVar, "");
        super.mo60409a(hVar, rVar);
        C42436r rVar2 = this.f80668d;
        if (rVar2 == null || (str = rVar2.f98900d) == null || str.length() <= 0) {
            str = null;
        }
        C42436r rVar3 = this.f80668d;
        if (rVar3 != null) {
            Long.valueOf(rVar3.f98899c);
        }
        if (str == null) {
            C11279p.m20006a(m69701c());
            C11279p.m20006a(m69702d());
        } else {
            C11279p.m20017b(m69701c());
            C42436r rVar4 = this.f80668d;
            if (rVar4 != null) {
                str2 = rVar4.f98901e;
            } else {
                str2 = null;
            }
            if (C80537hk.m139613a(str2)) {
                C42436r rVar5 = this.f80668d;
                if (rVar5 == null || (str3 = rVar5.f98901e) == null) {
                    str3 = "";
                }
                C20766v a = C20761r.m39061a(str3).mo34179a("AbsCellViewHolder");
                a.f49092E = mo60408a();
                a.mo34181a(new C34114d(this));
                SmartImageView a2 = mo60408a();
                C89219l.m154716b(a2, "");
                a2.setVisibility(0);
            } else {
                SmartImageView a3 = mo60408a();
                C89219l.m154716b(a3, "");
                a3.setVisibility(8);
            }
            TextView textView = (TextView) this.f80656i.getValue();
            textView.setText(str);
            textView.setTextColor(C0643b.m2378c(this.f80651a.getContext(), R.color.a9));
            C42436r rVar6 = this.f80668d;
            if (rVar6 != null) {
                j = rVar6.f98899c;
                if (j > 0) {
                    z = true;
                }
                z = false;
            } else {
                j = 0;
                z = false;
            }
            ViewGroup c = m69701c();
            C89219l.m154716b(c, "");
            float f4 = 0.0f;
            if (z) {
                applyDimension = 0.0f;
            } else {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                applyDimension = TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics());
            }
            if (m69700b()) {
                applyDimension2 = applyDimension;
            } else {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                applyDimension2 = TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics());
            }
            if (m69700b()) {
                applyDimension3 = applyDimension;
            } else {
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                applyDimension3 = TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics());
            }
            if (m69700b()) {
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                f = TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics());
            } else {
                f = applyDimension;
            }
            if (m69700b()) {
                Resources system5 = Resources.getSystem();
                C89219l.m154709a((Object) system5, "");
                applyDimension = TypedValue.applyDimension(1, 2.0f, system5.getDisplayMetrics());
            }
            c.setBackground(C80291cb.m139200a(C0643b.m2378c(this.f80651a.getContext(), R.color.bh), applyDimension2, f, applyDimension, applyDimension3));
            TextView d = m69702d();
            if (!z) {
                C11279p.m20006a(d);
            } else {
                C11279p.m20017b(d);
                if (m69700b()) {
                    Resources system6 = Resources.getSystem();
                    C89219l.m154709a((Object) system6, "");
                    f2 = TypedValue.applyDimension(1, 2.0f, system6.getDisplayMetrics());
                } else {
                    f2 = 0.0f;
                }
                if (m69700b()) {
                    Resources system7 = Resources.getSystem();
                    C89219l.m154709a((Object) system7, "");
                    f3 = TypedValue.applyDimension(1, 2.0f, system7.getDisplayMetrics());
                } else {
                    f3 = 0.0f;
                }
                if (m69700b()) {
                    applyDimension4 = 0.0f;
                } else {
                    Resources system8 = Resources.getSystem();
                    C89219l.m154709a((Object) system8, "");
                    applyDimension4 = TypedValue.applyDimension(1, 2.0f, system8.getDisplayMetrics());
                }
                if (!m69700b()) {
                    Resources system9 = Resources.getSystem();
                    C89219l.m154709a((Object) system9, "");
                    f4 = TypedValue.applyDimension(1, 2.0f, system9.getDisplayMetrics());
                }
                d.setBackground(C80291cb.m139200a(C0643b.m2378c(this.f80651a.getContext(), R.color.g), f2, applyDimension4, f4, f3));
                String string = this.f80651a.getContext().getString(R.string.aac, C53437b.m98615a(j));
                C89219l.m154716b(string, "");
                d.setText(new C17191a.C17192a().mo27177a(string).f40973a);
                d.setTextColor(C0643b.m2378c(d.getContext(), R.color.c5));
            }
        }
        TextView textView2 = (TextView) this.f80658k.getValue();
        C89219l.m154716b(textView2, "");
        C42436r rVar7 = this.f80668d;
        if (rVar7 != null) {
            str4 = rVar7.f98898b;
        } else {
            str4 = null;
        }
        textView2.setText(str4);
        this.f80651a.setOnClickListener(new View$OnClickListenerC34112b(this));
    }
}
