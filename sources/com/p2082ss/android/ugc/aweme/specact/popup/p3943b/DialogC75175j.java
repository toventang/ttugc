package com.p2082ss.android.ugc.aweme.specact.popup.p3943b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75153e;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.b.j */
public final class DialogC75175j extends DialogC81459o {

    /* renamed from: f */
    public static final C75178a f169031f = new C75178a((byte) 0);

    /* renamed from: a */
    ImageView f169032a;

    /* renamed from: b */
    TextView f169033b;

    /* renamed from: c */
    RotateAnimation f169034c;

    /* renamed from: d */
    public final Activity f169035d;

    /* renamed from: e */
    public final C75153e f169036e;

    static {
        Covode.recordClassIndex(88051);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.j$a */
    public static final class C75178a {
        static {
            Covode.recordClassIndex(88054);
        }

        private C75178a() {
        }

        public /* synthetic */ C75178a(byte b) {
            this();
        }
    }

    public final void show() {
        super.show();
        C75124i iVar = this.f169036e.f168991n;
        C89219l.m154721d(iVar, "");
        C39162r.m79460a("referral_dialog_pop_show", C75142a.m131894b(iVar, null).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.j$c */
    static final class View$OnClickListenerC75180c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC75175j f169040a;

        static {
            Covode.recordClassIndex(88056);
        }

        View$OnClickListenerC75180c(DialogC75175j jVar) {
            this.f169040a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DialogC75175j jVar = this.f169040a;
            C89219l.m154716b(view, "");
            jVar.mo118334a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.j$d */
    static final class View$OnClickListenerC75181d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC75175j f169041a;

        static {
            Covode.recordClassIndex(88057);
        }

        View$OnClickListenerC75181d(DialogC75175j jVar) {
            this.f169041a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DialogC75175j jVar = this.f169041a;
            C89219l.m154716b(view, "");
            jVar.mo118334a(view);
        }
    }

    /* renamed from: a */
    public final void mo118334a(View view) {
        if (!C58001a.m104815a(view, 1200)) {
            String str = "ok";
            if (this.f169036e.f168990m != null) {
                C75124i iVar = this.f169036e.f168991n;
                Boolean bool = this.f169036e.f168990m;
                if (bool == null) {
                    C89219l.m154715b();
                }
                if (!bool.booleanValue()) {
                    str = "add_to_calendar";
                }
                C75142a.m131893a(iVar, str);
            } else {
                C75142a.m131893a(this.f169036e.f168991n, str);
            }
            AbstractC89183m<? super DialogC75175j, ? super C75153e, C89391z> mVar = this.f169036e.f168989l;
            if (mVar != null) {
                mVar.invoke(this, this.f169036e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.j$b */
    public static final class C75179b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C75179b f169039a = new C75179b();

        static {
            Covode.recordClassIndex(88055);
        }

        C75179b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_calendar;
            aVar2.f54435e = Integer.valueOf((int) R.attr.m);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final Drawable m131911a(C75153e.EnumC75158d dVar) {
        int i = C75182k.f169043b[dVar.ordinal()];
        if (i == 1) {
            return C0643b.m2369a(getContext(), 2131233858);
        }
        if (i == 2) {
            return C0643b.m2369a(getContext(), 2131233860);
        }
        if (i == 3) {
            C22999a a = C23005c.m43393a(C75179b.f169039a);
            Context context = getContext();
            C89219l.m154716b(context, "");
            return a.mo37368a(context);
        }
        throw new C89376n();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0447, code lost:
        if (r0 == null) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x051d, code lost:
        if (r0 == null) goto L_0x051f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogC75175j(android.app.Activity r14, com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75153e r15) {
        /*
        // Method dump skipped, instructions count: 1324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.popup.p3943b.DialogC75175j.<init>(android.app.Activity, com.ss.android.ugc.aweme.specact.popup.b.e):void");
    }
}
