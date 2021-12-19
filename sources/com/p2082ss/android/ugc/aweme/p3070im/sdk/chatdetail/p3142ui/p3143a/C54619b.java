package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55372b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55373c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.GroupShareChannelDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.view.AbstractC55381a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.view.GroupShareCardView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.viewmodel.C55387a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.viewmodel.GroupSharePackage;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.viewmodel.GroupShareViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b */
public final class C54619b extends AbstractC34586a {

    /* renamed from: c */
    public static final C54620a f125210c = new C54620a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f125211a = C89250i.m154773a((AbstractC89171a) new C54621b(this));

    /* renamed from: b */
    public String f125212b;

    /* renamed from: d */
    private final AbstractC89244h f125213d = C89250i.m154773a((AbstractC89171a) new C54625e(this));

    /* renamed from: e */
    private HashMap f125214e;

    static {
        Covode.recordClassIndex(64332);
    }

    /* renamed from: a */
    public final View mo91686a(int i) {
        if (this.f125214e == null) {
            this.f125214e = new HashMap();
        }
        View view = (View) this.f125214e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f125214e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final GroupShareViewModel mo91687a() {
        return (GroupShareViewModel) this.f125213d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$a */
    public static final class C54620a {
        static {
            Covode.recordClassIndex(64333);
        }

        private C54620a() {
        }

        public /* synthetic */ C54620a(byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v4, types: [androidx.fragment.app.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m100131a(java.lang.String r4, androidx.appcompat.app.ActivityC0218d r5) {
            /*
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
                if (r5 != 0) goto L_0x0014
                android.app.Activity r5 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55075a.m100721a()
                boolean r0 = r5 instanceof androidx.appcompat.app.ActivityC0218d
                if (r0 != 0) goto L_0x0010
                r5 = 0
            L_0x0010:
                androidx.fragment.app.e r5 = (androidx.fragment.app.ActivityC0945e) r5
                if (r5 == 0) goto L_0x001a
            L_0x0014:
                androidx.fragment.app.i r3 = r5.getSupportFragmentManager()
                if (r3 != 0) goto L_0x001b
            L_0x001a:
                return
            L_0x001b:
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b r2 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b
                r2.<init>()
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r0 = "conversation_id"
                r1.putString(r0, r4)
                r2.setArguments(r1)
                com.bytedance.tux.sheet.sheet.a$a r0 = new com.bytedance.tux.sheet.sheet.a$a
                r0.<init>()
                com.bytedance.tux.sheet.sheet.a$a r1 = r0.mo37817a(r2)
                r0 = 1
                com.bytedance.tux.sheet.sheet.a$a r0 = r1.mo37819a(r0)
                com.bytedance.tux.sheet.sheet.a r1 = r0.f55057a
                java.lang.String r0 = "shareGroupInvite"
                r1.show(r3, r0)
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a.C54619b.C54620a.m100131a(java.lang.String, androidx.appcompat.app.d):void");
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f125214e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$b */
    static final class C54621b extends AbstractC89220m implements AbstractC89171a<GroupShareChannelDelegate> {

        /* renamed from: a */
        final /* synthetic */ C54619b f125215a;

        static {
            Covode.recordClassIndex(64334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54621b(C54619b bVar) {
            super(0);
            this.f125215a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GroupShareChannelDelegate invoke() {
            PowerList powerList = (PowerList) this.f125215a.mo91686a(R.id.dxj);
            C89219l.m154716b(powerList, "");
            return new GroupShareChannelDelegate(powerList);
        }
    }

    /* renamed from: b */
    public final void mo91688b() {
        TuxDualBallView tuxDualBallView = (TuxDualBallView) mo91686a(R.id.cff);
        tuxDualBallView.setVisibility(0);
        tuxDualBallView.mo37884b();
        TuxStatusView tuxStatusView = (TuxStatusView) mo91686a(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$e */
    static final class C54625e extends AbstractC89220m implements AbstractC89171a<GroupShareViewModel> {

        /* renamed from: a */
        final /* synthetic */ C54619b f125221a;

        static {
            Covode.recordClassIndex(64338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54625e(C54619b bVar) {
            super(0);
            this.f125221a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GroupShareViewModel invoke() {
            C54619b bVar = this.f125221a;
            String str = bVar.f125212b;
            if (str == null) {
                C89219l.m154710a("conversationId");
            }
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str, "");
            AbstractC1174ac a = C1181ae.m3879a(bVar, new C55387a(str)).mo3983a(GroupShareViewModel.class);
            C89219l.m154716b(a, "");
            GroupShareViewModel groupShareViewModel = (GroupShareViewModel) a;
            groupShareViewModel.f126631b.observe(this.f125221a, new C54626a(this));
            groupShareViewModel.f126632c.observe(this.f125221a, new C54627b(this));
            groupShareViewModel.f126633d.observe(this.f125221a, new C54628c(this));
            return groupShareViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$e$c */
        static final class C54628c<T> implements AbstractC1214u {

            /* renamed from: a */
            final /* synthetic */ C54625e f125224a;

            static {
                Covode.recordClassIndex(64341);
            }

            C54628c(C54625e eVar) {
                this.f125224a = eVar;
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(java.lang.Object r2) {
                /*
                    r1 = this;
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154716b(r2, r0)
                    boolean r0 = r2.booleanValue()
                    if (r0 == 0) goto L_0x0014
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$e r0 = r1.f125224a
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b r0 = r0.f125221a
                    com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                L_0x0014:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a.C54619b.C54625e.C54628c.onChanged(java.lang.Object):void");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$e$a */
        static final class C54626a<T> implements AbstractC1214u {

            /* renamed from: a */
            final /* synthetic */ C54625e f125222a;

            static {
                Covode.recordClassIndex(64339);
            }

            C54626a(C54625e eVar) {
                this.f125222a = eVar;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                String str;
                String str2;
                String str3;
                C55372b bVar = (C55372b) obj;
                C54619b bVar2 = this.f125222a.f125221a;
                C55373c cVar = null;
                r7 = null;
                String str4 = null;
                if (bVar != null) {
                    if (bVar.f126607e == null) {
                        AbstractC55381a aVar = (AbstractC55381a) bVar2.mo91686a(R.id.bc5);
                        C55371a aVar2 = bVar.f126606d;
                        if (aVar2 != null) {
                            str2 = aVar2.getAvatarUrl();
                        } else {
                            str2 = null;
                        }
                        C55371a aVar3 = bVar.f126606d;
                        if (aVar3 != null) {
                            str3 = aVar3.getName();
                        } else {
                            str3 = null;
                        }
                        Long l = bVar.f126605c;
                        if (l != null) {
                            String format = new SimpleDateFormat("MM/dd/yyyy", Locale.US).format(new Date(l.longValue() * 1000));
                            Context context = bVar2.getContext();
                            if (context != null) {
                                str4 = context.getString(R.string.c89, format);
                            }
                        }
                        aVar.mo92445a(str2, str3, str4);
                        return;
                    }
                    cVar = bVar.f126607e;
                }
                Context context2 = bVar2.getContext();
                if (context2 != null) {
                    C89219l.m154716b(context2, "");
                    TuxDualBallView tuxDualBallView = (TuxDualBallView) bVar2.mo91686a(R.id.cff);
                    tuxDualBallView.mo37885c();
                    tuxDualBallView.setVisibility(8);
                    TuxStatusView.C23263c cVar2 = new TuxStatusView.C23263c();
                    if (cVar == null || (str = cVar.f126610c) == null) {
                        String string = context2.getString(R.string.c8w);
                        C89219l.m154716b(string, "");
                        cVar2.mo37878a((CharSequence) string);
                        cVar2.f55132j = new C54622c(bVar2, cVar2, context2);
                    } else {
                        cVar2.mo37878a((CharSequence) str);
                    }
                    ((TuxStatusView) bVar2.mo91686a(R.id.e7i)).setStatus(cVar2);
                    TuxStatusView tuxStatusView = (TuxStatusView) bVar2.mo91686a(R.id.e7i);
                    C89219l.m154716b(tuxStatusView, "");
                    tuxStatusView.setVisibility(0);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$e$b */
        static final class C54627b<T> implements AbstractC1214u {

            /* renamed from: a */
            final /* synthetic */ C54625e f125223a;

            static {
                Covode.recordClassIndex(64340);
            }

            C54627b(C54625e eVar) {
                this.f125223a = eVar;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                C69684e eVar = (C69684e) obj;
                GroupShareChannelDelegate groupShareChannelDelegate = (GroupShareChannelDelegate) this.f125223a.f125221a.f125211a.getValue();
                C89219l.m154716b(eVar, "");
                C89219l.m154721d(eVar, "");
                SharePackage sharePackage = eVar.f155557i;
                Objects.requireNonNull(sharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupSharePackage");
                GroupSharePackage groupSharePackage = (GroupSharePackage) sharePackage;
                Iterator<T> it = eVar.f155549a.iterator();
                while (it.hasNext()) {
                    groupShareChannelDelegate.f126611a.getState().mo28132a(new GroupShareChannelDelegate.C55377a(it.next(), groupSharePackage));
                }
                C54619b bVar = this.f125223a.f125221a;
                TuxDualBallView tuxDualBallView = (TuxDualBallView) bVar.mo91686a(R.id.cff);
                tuxDualBallView.mo37885c();
                tuxDualBallView.setVisibility(8);
                Context context = bVar.getContext();
                if (context != null) {
                    C89219l.m154716b(context, "");
                    ((ConstraintLayout) bVar.mo91686a(R.id.bca)).setBackgroundColor(C0643b.m2378c(context, R.color.v));
                    TuxTextView tuxTextView = (TuxTextView) bVar.mo91686a(R.id.ebd);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setVisibility(0);
                    GroupShareCardView groupShareCardView = (GroupShareCardView) bVar.mo91686a(R.id.bc5);
                    C89219l.m154716b(groupShareCardView, "");
                    groupShareCardView.setVisibility(0);
                    PowerList powerList = (PowerList) bVar.mo91686a(R.id.dxj);
                    C89219l.m154716b(powerList, "");
                    powerList.setVisibility(0);
                    View a = bVar.mo91686a(R.id.dvt);
                    C89219l.m154716b(a, "");
                    a.setVisibility(0);
                    TuxTextView tuxTextView2 = (TuxTextView) bVar.mo91686a(R.id.a18);
                    tuxTextView2.setVisibility(0);
                    tuxTextView2.setOnClickListener(new View$OnClickListenerC54624d(bVar));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$d */
    static final class View$OnClickListenerC54624d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54619b f125220a;

        static {
            Covode.recordClassIndex(64337);
        }

        View$OnClickListenerC54624d(C54619b bVar) {
            this.f125220a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125220a.mo91687a().mo92456b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$c */
    static final class C54622c extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54619b f125216a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView.C23263c f125217b;

        /* renamed from: c */
        final /* synthetic */ Context f125218c;

        static {
            Covode.recordClassIndex(64335);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54622c(C54619b bVar, TuxStatusView.C23263c cVar, Context context) {
            super(1);
            this.f125216a = bVar;
            this.f125217b = cVar;
            this.f125218c = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setText(this.f125218c.getString(R.string.cj0));
            tuxButton2.setButtonVariant(1);
            tuxButton2.setButtonStartIcon(2131232835);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a.C54619b.C54622c.View$OnClickListenerC546231 */

                /* renamed from: a */
                final /* synthetic */ C54622c f125219a;

                static {
                    Covode.recordClassIndex(64336);
                }

                {
                    this.f125219a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (!C55232u.m101003a(view, 500)) {
                        this.f125219a.f125216a.mo91688b();
                        this.f125219a.f125216a.mo91687a().mo92455a();
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        String string = arguments.getString("conversation_id");
        if (string == null) {
            C89219l.m154715b();
        }
        this.f125212b = string;
        mo91687a().mo92455a();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (C55339a.m101154c(mo91687a().f126630a)) {
            TuxTextView tuxTextView = (TuxTextView) mo91686a(R.id.ebd);
            C89219l.m154716b(tuxTextView, "");
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.c6p);
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        mo91688b();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a4w, viewGroup, false);
    }
}
