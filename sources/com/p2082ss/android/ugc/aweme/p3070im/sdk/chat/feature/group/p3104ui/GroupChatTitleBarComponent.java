package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54431c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3135c.C54434a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55207e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent */
public final class GroupChatTitleBarComponent implements AbstractC33974au, AbstractC54431c {

    /* renamed from: a */
    public String f123898a;

    /* renamed from: b */
    public final GroupChatViewModel f123899b;

    /* renamed from: c */
    public final C54434a f123900c;

    /* renamed from: d */
    public final ImTextTitleBar f123901d;

    /* renamed from: e */
    private final AbstractC89244h f123902e = C89250i.m154773a((AbstractC89171a) C54060g.f123912a);

    /* renamed from: f */
    private final AbstractC89244h f123903f = C89250i.m154773a((AbstractC89171a) C54053a.f123904a);

    static {
        Covode.recordClassIndex(63727);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C22999a mo91158a() {
        return (C22999a) this.f123902e.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C22999a mo91160b() {
        return (C22999a) this.f123903f.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            setup();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent$a */
    static final class C54053a extends AbstractC89220m implements AbstractC89171a<C22999a> {

        /* renamed from: a */
        public static final C54053a f123904a = new C54053a();

        static {
            Covode.recordClassIndex(63728);
        }

        C54053a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22999a invoke() {
            return C23005c.m43393a(C540541.f123905a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent$e */
    public static final class C54058e implements ImTextTitleBar.AbstractC55309a {

        /* renamed from: a */
        final /* synthetic */ GroupChatTitleBarComponent f123909a;

        static {
            Covode.recordClassIndex(63733);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: b */
        public final void mo91164b() {
            this.f123909a.mo91159a(StringSet.name);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: c */
        public final void mo91165c() {
            this.f123909a.mo91159a(StringSet.name);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91162a() {
            this.f123909a.f123900c.mo64296c();
            this.f123909a.f123900c.requireActivity().finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54058e(GroupChatTitleBarComponent groupChatTitleBarComponent) {
            this.f123909a = groupChatTitleBarComponent;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index: 0
            	at java.base/java.util.Collections$EmptyList.get(Collections.java:4586)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91163a(int r4) {
            /*
                r3 = this;
                r0 = 2131755314(0x7f100132, float:1.9141504E38)
                if (r4 != r0) goto L_0x0029
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent r0 = r3.f123909a
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel r0 = r0.f123899b
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b r0 = r0.f123935e
                java.lang.String r0 = r0.getConversationId()
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g$a r2 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g.m98959a(r0)
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent r0 = r3.f123909a
                com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a r0 = r0.f123900c
                androidx.fragment.app.e r1 = r0.requireActivity()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                java.lang.String r0 = "entrance"
                com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g.m98963a(r2, r1, r0)
                com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3127a.C54354a.m99668b()
                return
            L_0x0029:
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent r1 = r3.f123909a
                java.lang.String r0 = "button"
                r1.mo91159a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.GroupChatTitleBarComponent.C54058e.mo91163a(int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent$f */
    public static final class C54059f implements AbstractC55207e {

        /* renamed from: a */
        final /* synthetic */ GroupChatTitleBarComponent f123910a;

        /* renamed from: b */
        final /* synthetic */ String f123911b;

        static {
            Covode.recordClassIndex(63734);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55207e
        /* renamed from: a */
        public final void mo90228a() {
            this.f123910a.f123898a = this.f123911b;
        }

        C54059f(GroupChatTitleBarComponent groupChatTitleBarComponent, String str) {
            this.f123910a = groupChatTitleBarComponent;
            this.f123911b = str;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
            this.f123910a.f123898a = null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            mo90228a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent$g */
    static final class C54060g extends AbstractC89220m implements AbstractC89171a<C22999a> {

        /* renamed from: a */
        public static final C54060g f123912a = new C54060g();

        static {
            Covode.recordClassIndex(63735);
        }

        C54060g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22999a invoke() {
            return C23005c.m43393a(C540611.f123913a);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void setup() {
        this.f123899b.f123931a.observe(this.f123900c.getViewLifecycleOwner(), new C54055b(this));
        this.f123899b.f123932b.observe(this.f123900c.getViewLifecycleOwner(), new C54056c(this));
        this.f123899b.f123933c.observe(this.f123900c.getViewLifecycleOwner(), new C54057d(this));
        this.f123901d.setLeftTitleVisible(true);
        ViewGroup.LayoutParams layoutParams = this.f123901d.getLayoutParams();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 56.0f, system.getDisplayMetrics()));
        this.f123901d.setOnTitlebarClickListener(new C54058e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent$b */
    public static final class C54055b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GroupChatTitleBarComponent f123906a;

        static {
            Covode.recordClassIndex(63730);
        }

        C54055b(GroupChatTitleBarComponent groupChatTitleBarComponent) {
            this.f123906a = groupChatTitleBarComponent;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Integer num = (Integer) obj;
            Boolean value = this.f123906a.f123899b.f123933c.getValue();
            if (value == null) {
                value = Boolean.valueOf(C55339a.m101153b(this.f123906a.f123899b.f123932b.getValue()));
            }
            C89219l.m154716b(value, "");
            boolean booleanValue = value.booleanValue();
            ImTextTitleBar imTextTitleBar = this.f123906a.f123901d;
            if (num.intValue() <= 0 || !booleanValue) {
                i = 8;
            } else {
                i = 0;
            }
            imTextTitleBar.setRightDotVisibility(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent$c */
    public static final class C54056c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GroupChatTitleBarComponent f123907a;

        static {
            Covode.recordClassIndex(63731);
        }

        C54056c(GroupChatTitleBarComponent groupChatTitleBarComponent) {
            this.f123907a = groupChatTitleBarComponent;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            C19638h hVar = (C19638h) obj;
            if (hVar != null) {
                GroupChatTitleBarComponent groupChatTitleBarComponent = this.f123907a;
                C19639i coreInfo = hVar.getCoreInfo();
                if (coreInfo != null) {
                    str = coreInfo.getIcon();
                } else {
                    str = null;
                }
                if (C80537hk.m139613a(str) && (!C89219l.m154714a((Object) groupChatTitleBarComponent.f123898a, (Object) str))) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(C89070n.m154524c(str));
                    ImTextTitleBar imTextTitleBar = groupChatTitleBarComponent.f123901d;
                    C55198a.m100930a(imTextTitleBar.f126433a, urlModel, new C54059f(groupChatTitleBarComponent, str));
                }
                groupChatTitleBarComponent.f123901d.setTitle(C55339a.m101156e(hVar));
                groupChatTitleBarComponent.f123901d.setHint(groupChatTitleBarComponent.f123900c.getResources().getQuantityString(R.plurals.cu, hVar.getMemberCount(), Integer.valueOf(hVar.getMemberCount())));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent$d */
    public static final class C54057d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GroupChatTitleBarComponent f123908a;

        static {
            Covode.recordClassIndex(63732);
        }

        C54057d(GroupChatTitleBarComponent groupChatTitleBarComponent) {
            this.f123908a = groupChatTitleBarComponent;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            GroupChatTitleBarComponent groupChatTitleBarComponent = this.f123908a;
            C89219l.m154716b(bool, "");
            boolean booleanValue = bool.booleanValue();
            if (!booleanValue) {
                groupChatTitleBarComponent.f123901d.getRightView().setOnTouchListener(null);
                groupChatTitleBarComponent.mo91158a().f54435e = Integer.valueOf((int) R.attr.bd);
                groupChatTitleBarComponent.mo91160b().f54435e = Integer.valueOf((int) R.attr.bd);
                if (C55052e.m100671b()) {
                    groupChatTitleBarComponent.f123901d.setRightIcons(groupChatTitleBarComponent.mo91160b(), groupChatTitleBarComponent.mo91158a());
                }
            } else if (booleanValue) {
                groupChatTitleBarComponent.mo91158a().f54435e = Integer.valueOf((int) R.attr.bc);
                groupChatTitleBarComponent.mo91160b().f54435e = Integer.valueOf((int) R.attr.bc);
                if (C55052e.m100671b()) {
                    groupChatTitleBarComponent.f123901d.setRightIcons(groupChatTitleBarComponent.mo91160b(), groupChatTitleBarComponent.mo91158a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91159a(String str) {
        boolean z;
        String str2;
        C19639i coreInfo;
        GroupChatViewModel groupChatViewModel = this.f123899b;
        ActivityC0945e requireActivity = this.f123900c.requireActivity();
        C89219l.m154716b(requireActivity, "");
        C89219l.m154721d(requireActivity, "");
        if (C55339a.m101153b(groupChatViewModel.mo91175a())) {
            C19638h a = groupChatViewModel.mo91175a();
            if (a == null || (coreInfo = a.getCoreInfo()) == null || coreInfo.getOwner() != C55197c.m100923e()) {
                z = false;
            } else {
                z = true;
            }
            String conversationId = groupChatViewModel.f123935e.getConversationId();
            C0484a aVar = new C0484a();
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            aVar.put("is_master", str2);
            aVar.put("enter_method", str);
            aVar.put("conversation_id", conversationId);
            C39162r.m79460a("enter_group_setting", aVar);
            GroupChatDetailActivity.C54640a.m100148a(requireActivity, groupChatViewModel.f123935e, 16);
        }
    }

    public GroupChatTitleBarComponent(GroupChatViewModel groupChatViewModel, C54434a aVar, ImTextTitleBar imTextTitleBar) {
        C89219l.m154721d(groupChatViewModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(imTextTitleBar, "");
        this.f123899b = groupChatViewModel;
        this.f123900c = aVar;
        this.f123901d = imTextTitleBar;
    }
}
