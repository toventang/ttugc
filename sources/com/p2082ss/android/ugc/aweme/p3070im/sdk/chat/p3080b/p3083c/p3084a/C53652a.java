package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.p3084a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a */
public final class C53652a {
    static {
        Covode.recordClassIndex(63232);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$b */
    public static final class C53654b extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f123104a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f123105b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f123106c;

        /* renamed from: d */
        final /* synthetic */ boolean f123107d;

        /* renamed from: e */
        final /* synthetic */ View.OnClickListener f123108e;

        /* renamed from: f */
        final /* synthetic */ boolean f123109f;

        /* renamed from: g */
        final /* synthetic */ View.OnClickListener f123110g;

        /* renamed from: h */
        final /* synthetic */ boolean f123111h = true;

        /* renamed from: i */
        final /* synthetic */ View.OnClickListener f123112i;

        /* renamed from: j */
        final /* synthetic */ boolean f123113j;

        /* renamed from: k */
        final /* synthetic */ View.OnClickListener f123114k;

        static {
            Covode.recordClassIndex(63234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53654b(boolean z, View.OnClickListener onClickListener, C89233z.C89238e eVar, boolean z2, View.OnClickListener onClickListener2, boolean z3, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, boolean z4, View.OnClickListener onClickListener5) {
            super(1);
            this.f123104a = z;
            this.f123105b = onClickListener;
            this.f123106c = eVar;
            this.f123107d = z2;
            this.f123108e = onClickListener2;
            this.f123109f = z3;
            this.f123110g = onClickListener3;
            this.f123112i = onClickListener4;
            this.f123113j = z4;
            this.f123114k = onClickListener5;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$b$a */
        static final class View$OnClickListenerC53655a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53654b f123115a;

            static {
                Covode.recordClassIndex(63235);
            }

            View$OnClickListenerC53655a(C53654b bVar) {
                this.f123115a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f123115a.f123105b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f123115a.f123106c.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$b$b */
        static final class View$OnClickListenerC53656b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53654b f123116a;

            static {
                Covode.recordClassIndex(63236);
            }

            View$OnClickListenerC53656b(C53654b bVar) {
                this.f123116a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f123116a.f123108e;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f123116a.f123106c.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$b$c */
        static final class View$OnClickListenerC53657c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53654b f123117a;

            static {
                Covode.recordClassIndex(63237);
            }

            View$OnClickListenerC53657c(C53654b bVar) {
                this.f123117a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f123117a.f123110g;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f123117a.f123106c.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$b$d */
        static final class View$OnClickListenerC53658d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53654b f123118a;

            static {
                Covode.recordClassIndex(63238);
            }

            View$OnClickListenerC53658d(C53654b bVar) {
                this.f123118a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f123118a.f123112i;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f123118a.f123106c.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$b$e */
        static final class View$OnClickListenerC53659e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53654b f123119a;

            static {
                Covode.recordClassIndex(63239);
            }

            View$OnClickListenerC53659e(C53654b bVar) {
                this.f123119a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View.OnClickListener onClickListener = this.f123119a.f123114k;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                T t = this.f123119a.f123106c.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (this.f123104a) {
                C23322d.C23324b bVar = new C23322d.C23324b();
                bVar.f55280a = R.raw.icon_doc_on_doc;
                if (C55052e.m100674e()) {
                    bVar.f55284e = R.attr.bc;
                } else {
                    bVar.f55281b = R.attr.aa;
                }
                bVar.f55282c = R.string.cd7;
                bVar.f55285f = new View$OnClickListenerC53655a(this);
                dVar2.mo38015a(bVar);
            }
            if (this.f123107d) {
                C23322d.C23324b bVar2 = new C23322d.C23324b();
                bVar2.f55280a = R.raw.icon_arrow_turn_up_left;
                if (C55052e.m100674e()) {
                    bVar2.f55284e = R.attr.bc;
                } else {
                    bVar2.f55281b = R.attr.aa;
                }
                bVar2.f55282c = R.string.cgh;
                bVar2.f55285f = new View$OnClickListenerC53656b(this);
                dVar2.mo38015a(bVar2);
            }
            if (this.f123109f) {
                C23322d.C23324b bVar3 = new C23322d.C23324b();
                bVar3.f55280a = R.raw.icon_arrow_turn_up_right;
                if (C55052e.m100674e()) {
                    bVar3.f55284e = R.attr.bc;
                } else {
                    bVar3.f55281b = R.attr.aa;
                }
                bVar3.f55282c = R.string.chn;
                bVar3.f55285f = new View$OnClickListenerC53657c(this);
                dVar2.mo38015a(bVar3);
            }
            if (this.f123111h) {
                C23322d.C23324b bVar4 = new C23322d.C23324b();
                bVar4.f55280a = R.raw.icon_trash_bin;
                if (C55052e.m100674e()) {
                    bVar4.f55284e = R.attr.av;
                    bVar4.f55281b = R.attr.av;
                } else {
                    bVar4.f55281b = R.attr.aa;
                }
                bVar4.f55282c = R.string.cd9;
                bVar4.f55285f = new View$OnClickListenerC53658d(this);
                dVar2.mo38015a(bVar4);
            }
            if (this.f123113j) {
                C23322d.C23324b bVar5 = new C23322d.C23324b();
                bVar5.f55280a = R.raw.icon_flag;
                if (C55052e.m100674e()) {
                    bVar5.f55284e = R.attr.av;
                    bVar5.f55281b = R.attr.av;
                } else {
                    bVar5.f55281b = R.attr.aa;
                }
                bVar5.f55282c = R.string.cgj;
                bVar5.f55285f = new View$OnClickListenerC53659e(this);
                dVar2.mo38015a(bVar5);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a$a */
    public static final class C53653a extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f123103a;

        static {
            Covode.recordClassIndex(63233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53653a(View view) {
            super(1);
            this.f123103a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54468g = C89241a.m154730a(TypedValue.applyDimension(1, 0.5f, system.getDisplayMetrics()));
            eVar2.f54462a = Integer.valueOf(C0643b.m2378c(this.f123103a.getContext(), R.color.b6));
            return C89391z.f203057a;
        }
    }
}
