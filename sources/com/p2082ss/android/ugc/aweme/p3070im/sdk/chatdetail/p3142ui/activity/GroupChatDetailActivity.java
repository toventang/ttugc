package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1213c.AbstractC17446a;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.p1400a.p1401a.C19464a;
import com.bytedance.p1399im.p1400a.p1401a.p1402a.C19470d;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.C23035c;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.friends.services.FollowService;
import com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54003a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54004b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53982a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54610b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54611c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.epoxy.GroupChatController;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a.C54614a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3143a.C54619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.C54822a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.activity.RelationSelectActivity;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity */
public final class GroupChatDetailActivity extends ActivityC17312a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final C54640a f125251b = new C54640a((byte) 0);

    /* renamed from: a */
    public C54004b f125252a;

    /* renamed from: c */
    private final AbstractC89244h f125253c = C89250i.m154773a((AbstractC89171a) C54675s.f125299a);

    /* renamed from: d */
    private final AbstractC89244h f125254d = C89250i.m154773a((AbstractC89171a) new C54681v(this));

    /* renamed from: e */
    private final AbstractC89244h f125255e = C89250i.m154773a((AbstractC89171a) new C54650h(this));

    /* renamed from: f */
    private HashMap f125256f;

    static {
        Covode.recordClassIndex(64354);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f125256f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f125256f == null) {
            this.f125256f = new HashMap();
        }
        View view = (View) this.f125256f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f125256f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo91701a() {
        return ((Boolean) this.f125253c.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final GroupChatDetailViewModel mo91702b() {
        return (GroupChatDetailViewModel) this.f125254d.getValue();
    }

    /* renamed from: c */
    public final GroupChatController mo91703c() {
        return (GroupChatController) this.f125255e.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new RunnableC90250g(GroupChatDetailActivity.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$a */
    public static final class C54640a {
        static {
            Covode.recordClassIndex(64355);
        }

        private C54640a() {
        }

        public /* synthetic */ C54640a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m100148a(Activity activity, C54004b bVar, int i) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bVar, "");
            Intent intent = new Intent(activity, GroupChatDetailActivity.class);
            intent.putExtra("key_session_info", bVar);
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$h */
    static final class C54650h extends AbstractC89220m implements AbstractC89171a<GroupChatController> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125268a;

        static {
            Covode.recordClassIndex(64365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54650h(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.f125268a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GroupChatController invoke() {
            return new GroupChatController(this.f125268a.mo91702b(), this.f125268a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$s */
    static final class C54675s extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C54675s f125299a = new C54675s();

        static {
            Covode.recordClassIndex(64390);
        }

        C54675s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C55052e.m100675f());
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        mo91702b().mo91834a(GroupChatDetailViewModel.C54765ae.f125519a);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: d */
    public final void mo91704d() {
        ArrayList arrayList;
        String str;
        List<C54006a> list;
        Bundle bundle = new Bundle();
        C89086z zVar = C89086z.INSTANCE;
        C54610b value = mo91702b().mo91836b().getValue();
        if (value == null || (list = value.f125177f) == null) {
            arrayList = C89086z.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                IMUser user = it.next().getUser();
                if (user != null) {
                    arrayList2.add(user);
                }
            }
            arrayList = arrayList2;
        }
        EnumC55388a aVar = EnumC55388a.ADD_MEMBER;
        C54004b bVar = this.f125252a;
        if (bVar == null || (str = bVar.getConversationId()) == null) {
            str = "";
        }
        bundle.putSerializable("member_select_config", new C55539b.C55555p(zVar, arrayList, aVar, str));
        RelationSelectActivity.C55896a.m101698a(this, bundle, 12333);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$v */
    static final class C54681v extends AbstractC89220m implements AbstractC89171a<GroupChatDetailViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125306a;

        static {
            Covode.recordClassIndex(64396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54681v(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.f125306a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GroupChatDetailViewModel invoke() {
            String str;
            AbstractC1174ac a;
            GroupChatDetailActivity groupChatDetailActivity = this.f125306a;
            C54004b bVar = groupChatDetailActivity.f125252a;
            Object obj = null;
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            C89219l.m154721d(groupChatDetailActivity, "");
            C89219l.m154721d(str, "");
            C1175ad a2 = C1181ae.m3881a(groupChatDetailActivity, new C54822a(str, AbstractC17427b.C17428a.m32308a(str)));
            String concat = "GroupChatDetailViewModel_".concat(String.valueOf(str));
            if (GroupChatDetailViewModel.class.equals(ScopeViewModel.class)) {
                a = a2.mo3984a(concat, GroupChatDetailViewModel.class);
            } else {
                a = a2.mo3984a(concat, GroupChatDetailViewModel.class);
                C1171ab.m3870a(a, a2);
            }
            C89219l.m154716b(a, "");
            GroupChatDetailViewModel groupChatDetailViewModel = (GroupChatDetailViewModel) a;
            C17419b.m32261a().mo27887a(AbstractC17446a.EnumC17447a.ENTER_CHAT_ROOM);
            C53982a.f123797d.mo91083a(groupChatDetailViewModel.f125507d, groupChatDetailViewModel.f125506c);
            C19464a a3 = C19464a.m36302a();
            long a4 = groupChatDetailViewModel.mo91831a();
            GroupChatDetailViewModel.C54816w wVar = new GroupChatDetailViewModel.C54816w(groupChatDetailViewModel);
            boolean z = C19483d.m36365a().mo31141b().f46235aQ;
            C19512f.m36450a("imsdk", "getNewestAuditList", (Throwable) null);
            new C19470d(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007e: INVOKE  
                  (wrap: com.bytedance.im.a.a.a.d : 0x0077: CONSTRUCTOR  (r8v0 com.bytedance.im.a.a.a.d) = 
                  (wrap: com.bytedance.im.a.a.a$1 : 0x0074: CONSTRUCTOR  (r0v10 com.bytedance.im.a.a.a$1) = 
                  (r2v5 'a3' com.bytedance.im.a.a.a)
                  (r1v5 'wVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$w)
                 call: com.bytedance.im.a.a.a.1.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                 call: com.bytedance.im.a.a.a.d.<init>(com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                  (0 long)
                  (r11v0 'a4' long)
                  (r13v0 'z' boolean)
                 type: VIRTUAL call: com.bytedance.im.a.a.a.d.a(long, long, boolean):void in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.v.invoke():com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0077: CONSTRUCTOR  (r8v0 com.bytedance.im.a.a.a.d) = 
                  (wrap: com.bytedance.im.a.a.a$1 : 0x0074: CONSTRUCTOR  (r0v10 com.bytedance.im.a.a.a$1) = 
                  (r2v5 'a3' com.bytedance.im.a.a.a)
                  (r1v5 'wVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$w)
                 call: com.bytedance.im.a.a.a.1.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                 call: com.bytedance.im.a.a.a.d.<init>(com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.v.invoke():com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 14 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: CONSTRUCTOR  (r0v10 com.bytedance.im.a.a.a$1) = 
                  (r2v5 'a3' com.bytedance.im.a.a.a)
                  (r1v5 'wVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$w)
                 call: com.bytedance.im.a.a.a.1.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.v.invoke():com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 20 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.a.a.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 26 more
                */
            /*
            // Method dump skipped, instructions count: 258
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54681v.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$e */
    static final class C54647e extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125263a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125264b;

        static {
            Covode.recordClassIndex(64362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54647e(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            super(1);
            this.f125263a = groupChatDetailActivity;
            this.f125264b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            this.f125263a.mo91702b();
            C54006a aVar = this.f125264b;
            C89219l.m154721d(aVar, "");
            C54881c.m100491a(aVar.getUid());
            C23226a.C23228b.m43787a(view2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$i */
    static final class C54651i extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C54651i f125269a = new C54651i();

        static {
            Covode.recordClassIndex(64366);
        }

        C54651i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C546521.f125270a);
            baseActivityViewModel2.config(C546532.f125271a);
            baseActivityViewModel2.config(C546543.f125272a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$u */
    static final class C54679u extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125304a;

        static {
            Covode.recordClassIndex(64394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54679u(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.f125304a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.c8o, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54679u.C546801 */

                /* renamed from: a */
                final /* synthetic */ C54679u f125305a;

                static {
                    Covode.recordClassIndex(64395);
                }

                {
                    this.f125305a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    SmartRouter.buildRoute(this.f125305a.f125304a, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/web-inapp/suicide/help?enter_from=dm_group_name_popup")).open();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$b */
    static final class C54641b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125257a;

        static {
            Covode.recordClassIndex(64356);
        }

        C54641b(GroupChatDetailActivity groupChatDetailActivity) {
            this.f125257a = groupChatDetailActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView recyclerView = (RecyclerView) this.f125257a._$_findCachedViewById(R.id.bj6);
            C89219l.m154716b(recyclerView, "");
            RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.mo4672d();
            }
            this.f125257a.mo91703c().setData(this.f125257a.mo91702b().f125508e, obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$g */
    static final class C54649g extends AbstractC89220m implements AbstractC89172b<IMUser, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125267a;

        static {
            Covode.recordClassIndex(64364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54649g(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.f125267a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            C89219l.m154721d(iMUser2, "");
            this.f125267a.mo91702b().mo91833a(iMUser2);
            this.f125267a.mo91702b().mo91843g();
            C54603a.m100105a("click_leave_admin", new C89378p[0]);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$j */
    static final class C54655j extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125273a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125274b;

        static {
            Covode.recordClassIndex(64370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54655j(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            super(1);
            this.f125273a = groupChatDetailActivity;
            this.f125274b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f125273a.getString(R.string.c6a);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54655j.C546561 */

                /* renamed from: a */
                final /* synthetic */ C54655j f125275a;

                static {
                    Covode.recordClassIndex(64371);
                }

                {
                    this.f125275a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f125275a.f125273a.mo91702b().mo91833a(this.f125275a.f125274b.getUser());
                    C54603a.m100105a("click_admin_pop", C89387v.m154943a("confirm", "result"));
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, C546572.f125276a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$k */
    static final class C54658k extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125277a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125278b;

        static {
            Covode.recordClassIndex(64373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54658k(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            super(1);
            this.f125277a = groupChatDetailActivity;
            this.f125278b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f125277a.getString(R.string.c6a);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54658k.C546591 */

                /* renamed from: a */
                final /* synthetic */ C54658k f125279a;

                static {
                    Covode.recordClassIndex(64374);
                }

                {
                    this.f125279a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f125279a.f125277a.mo91702b();
                    GroupChatDetailViewModel.m100378a(this.f125279a.f125278b);
                    C54603a.m100105a("click_block_pop", C89387v.m154943a("confirm", "result"));
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, C546602.f125280a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$m */
    static final class C54665m extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125285a;

        static {
            Covode.recordClassIndex(64380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54665m(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.f125285a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f125285a.getString(R.string.b4w);
            C89219l.m154716b(string, "");
            bVar2.mo37421c(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54665m.C546661 */

                /* renamed from: a */
                final /* synthetic */ C54665m f125286a;

                static {
                    Covode.recordClassIndex(64381);
                }

                {
                    this.f125286a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    GroupChatDetailViewModel b = this.f125286a.f125285a.mo91702b();
                    b.f125508e.mo27744b(new GroupChatDetailViewModel.C54792i(b));
                    C54603a.m100105a("click_end_pop_up", C89387v.m154943a("end", "result"));
                    return C89391z.f203057a;
                }
            });
            String string2 = this.f125285a.getString(R.string.a8y);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, C546672.f125287a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$n */
    static final class C54668n extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125288a;

        static {
            Covode.recordClassIndex(64383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54668n(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.f125288a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f125288a.getString(R.string.c5z);
            C89219l.m154716b(string, "");
            bVar2.mo37421c(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54668n.C546691 */

                /* renamed from: a */
                final /* synthetic */ C54668n f125289a;

                static {
                    Covode.recordClassIndex(64384);
                }

                {
                    this.f125289a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f125289a.f125288a.mo91702b().mo91843g();
                    C54603a.m100105a("click_leave_pop", C89387v.m154943a("leave", "result"));
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, C546702.f125290a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$o */
    static final class View$OnClickListenerC54671o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125291a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125292b;

        static {
            Covode.recordClassIndex(64386);
        }

        View$OnClickListenerC54671o(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            this.f125291a = groupChatDetailActivity;
            this.f125292b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GroupChatDetailViewModel b = this.f125291a.mo91702b();
            C54006a aVar = this.f125292b;
            C89219l.m154721d(aVar, "");
            IMUser user = aVar.getUser();
            if (user != null) {
                if (user.isBlock()) {
                    GroupChatDetailViewModel.m100378a(aVar);
                } else {
                    b.mo91837b(new GroupChatDetailViewModel.C54784ar(b, aVar));
                }
            }
            C54603a.m100105a("click_member_block", new C89378p[0]);
            C89219l.m154716b(view, "");
            C23226a.C23228b.m43787a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$q */
    static final class View$OnClickListenerC54673q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125295a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125296b;

        static {
            Covode.recordClassIndex(64388);
        }

        View$OnClickListenerC54673q(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            this.f125295a = groupChatDetailActivity;
            this.f125296b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GroupChatDetailViewModel b = this.f125295a.mo91702b();
            C54006a aVar = this.f125296b;
            C89219l.m154721d(aVar, "");
            C54603a.m100105a("click_member_admin", new C89378p[0]);
            if (b.mo91844h()) {
                b.mo91837b(GroupChatDetailViewModel.C54789f.f125551a);
            } else {
                b.mo91837b(new GroupChatDetailViewModel.C54790g(aVar));
            }
            C89219l.m154716b(view, "");
            C23226a.C23228b.m43787a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$r */
    static final class View$OnClickListenerC54674r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125297a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125298b;

        static {
            Covode.recordClassIndex(64389);
        }

        View$OnClickListenerC54674r(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            this.f125297a = groupChatDetailActivity;
            this.f125298b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GroupChatDetailViewModel b = this.f125297a.mo91702b();
            C54006a aVar = this.f125298b;
            C89219l.m154721d(aVar, "");
            b.mo91837b(new GroupChatDetailViewModel.C54768ah(aVar));
            C54603a.m100105a("click_member_remove", new C89378p[0]);
            C89219l.m154716b(view, "");
            C23226a.C23228b.m43787a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$t */
    static final class C54676t extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125300a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125301b;

        static {
            Covode.recordClassIndex(64391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54676t(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            super(1);
            this.f125300a = groupChatDetailActivity;
            this.f125301b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f125300a.getString(R.string.f_7);
            C89219l.m154716b(string, "");
            bVar2.mo37421c(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54676t.C546771 */

                /* renamed from: a */
                final /* synthetic */ C54676t f125302a;

                static {
                    Covode.recordClassIndex(64392);
                }

                {
                    this.f125302a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    GroupChatDetailViewModel b = this.f125302a.f125300a.mo91702b();
                    C54006a aVar2 = this.f125302a.f125301b;
                    C89219l.m154721d(aVar2, "");
                    b.f125508e.mo27746b(C89070n.m154516a(aVar2.getUid()), C89041ag.m154415a(), new GroupChatDetailViewModel.C54796k(b));
                    C54603a.m100105a("click_remove_pop", C89387v.m154943a("confirm", "result"));
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, C546782.f125303a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    static boolean m100143a(C54006a aVar) {
        int i;
        boolean z;
        IMUser user = aVar.getUser();
        if (user != null) {
            i = user.getFollowStatus();
        } else {
            i = 0;
        }
        boolean a = C80580in.m139679a(i);
        IMUser user2 = aVar.getUser();
        if (user2 == null || user2.getFollowStatus() != 4) {
            z = false;
        } else {
            z = true;
        }
        if (a || z) {
            return true;
        }
        return false;
    }

    @AbstractC90264r
    public final void onEvent(C56257j jVar) {
        C89219l.m154721d(jVar, "");
        new C23144b(this).mo37640e(R.string.c68).mo37636b(R.raw.icon_tick_fill_small).mo37638c(C0643b.m2378c(this, R.color.bf)).mo37637b();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$f */
    static final class C54648f extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125265a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125266b;

        static {
            Covode.recordClassIndex(64363);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54648f(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            super(1);
            this.f125265a = groupChatDetailActivity;
            this.f125266b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            View view2 = view;
            C89219l.m154721d(view2, "");
            GroupChatDetailViewModel b = this.f125265a.mo91702b();
            C54006a aVar = this.f125266b;
            C89219l.m154721d(aVar, "");
            IMUser user = aVar.getUser();
            if (user != null) {
                boolean isSecret = user.isSecret();
                if (user.getFollowerStatus() == 1) {
                    str = "single";
                } else {
                    str = "mutual";
                }
                LogHelper a = LogHelperImpl.m77303a();
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                a.mo66435a("member_list", "message", "other_places", "follow_button", uid, str, isSecret ? 1 : 0);
                FollowService.createIFollowServicebyMonsterPlugin(false).sendRequest(user.getUid(), user.getSecUid(), 1, new GroupChatDetailViewModel.C54812u(user, b));
            }
            C23226a.C23228b.m43787a(view2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$l */
    static final class C54661l extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125281a;

        static {
            Covode.recordClassIndex(64376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54661l(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.f125281a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f125281a.getString(R.string.c64);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54661l.C546621 */

                /* renamed from: a */
                final /* synthetic */ C54661l f125282a;

                static {
                    Covode.recordClassIndex(64377);
                }

                {
                    this.f125282a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    List<C54006a> list;
                    ActivityC0945e eVar;
                    Activity activity;
                    AbstractC0952i supportFragmentManager;
                    C89219l.m154721d(aVar, "");
                    GroupChatDetailActivity groupChatDetailActivity = this.f125282a.f125281a;
                    C54610b value = groupChatDetailActivity.mo91702b().mo91836b().getValue();
                    if (!(value == null || (list = value.f125177f) == null)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            IMUser user = it.next().getUser();
                            if (user != null) {
                                arrayList.add(user);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!C89219l.m154714a((Object) ((IMUser) obj).getUid(), (Object) C55197c.m100919b())) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        Context context = groupChatDetailActivity;
                        while (true) {
                            eVar = null;
                            if (context != null) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                break;
                            }
                        }
                        activity = null;
                        if (activity instanceof ActivityC0945e) {
                            eVar = activity;
                        }
                        ActivityC0945e eVar2 = eVar;
                        if (!(eVar2 == null || (supportFragmentManager = eVar2.getSupportFragmentManager()) == null)) {
                            new C23226a.C23227a().mo37817a(new C54614a(groupChatDetailActivity, arrayList3, new C54649g(groupChatDetailActivity))).mo37812a(0).mo37822b(false).f55057a.show(supportFragmentManager, "GroupChatDetailActivity");
                        }
                    }
                    C54603a.m100105a("click_leave_pop", C89387v.m154943a("choose_admin", "result"));
                    return C89391z.f203057a;
                }
            });
            String string2 = this.f125281a.getString(R.string.c5z);
            C89219l.m154716b(string2, "");
            bVar2.mo37421c(string2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54661l.C546632 */

                /* renamed from: a */
                final /* synthetic */ C54661l f125283a;

                static {
                    Covode.recordClassIndex(64378);
                }

                {
                    this.f125283a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f125283a.f125281a.mo91702b().mo91843g();
                    C54603a.m100105a("click_leave_pop", C89387v.m154943a("leave", "result"));
                    return C89391z.f203057a;
                }
            });
            String string3 = this.f125281a.getString(R.string.a8y);
            C89219l.m154716b(string3, "");
            bVar2.mo37419b(string3, C546643.f125284a);
            bVar2.f54513b = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$p */
    static final class View$OnClickListenerC54672p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125293a;

        /* renamed from: b */
        final /* synthetic */ C54006a f125294b;

        static {
            Covode.recordClassIndex(64387);
        }

        View$OnClickListenerC54672p(GroupChatDetailActivity groupChatDetailActivity, C54006a aVar) {
            this.f125293a = groupChatDetailActivity;
            this.f125294b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GroupChatDetailViewModel b = this.f125293a.mo91702b();
            C54006a aVar = this.f125294b;
            GroupChatDetailActivity groupChatDetailActivity = this.f125293a;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(groupChatDetailActivity, "");
            String valueOf = String.valueOf(C53688g.m98956a());
            String uid = aVar.getUid();
            String str = b.f125507d;
            String displayName = aVar.getDisplayName();
            String a = C53688g.m98961a(aVar.getUser());
            IMUser user = aVar.getUser();
            boolean z = true;
            if (user == null || !user.isBlock()) {
                z = false;
            }
            C53688g.m98963a(new C53688g.C53689a(valueOf, uid, str, a, Boolean.valueOf(z), "im_group_chat", 3, displayName, 32), groupChatDetailActivity, "6");
            C54603a.m100104a("group_chat_member", aVar.getUid(), "user");
            C89219l.m154716b(view, "");
            C23226a.C23228b.m43787a(view);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onCreate", true);
        activityConfiguration(C54651i.f125269a);
        super.onCreate(bundle);
        setContentView(R.layout.a47);
        C55076b.m100725d().setupStatusBar(this);
        Serializable serializableExtra = getIntent().getSerializableExtra("key_session_info");
        if (!(serializableExtra instanceof C54004b)) {
            serializableExtra = null;
        }
        this.f125252a = (C54004b) serializableExtra;
        mo91702b().mo91836b().observe(this, new C54641b(this));
        ((EpoxyRecyclerView) _$_findCachedViewById(R.id.bj6)).setController(mo91703c());
        mo91702b().mo91836b().observe(this, new C54642c(this));
        mo91702b().mo91838c().observe(this, new C54003a(new C54646d(this)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$c */
    static final class C54642c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125258a;

        static {
            Covode.recordClassIndex(64357);
        }

        C54642c(GroupChatDetailActivity groupChatDetailActivity) {
            this.f125258a = groupChatDetailActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C54610b bVar = (C54610b) obj;
            if (!bVar.f125175d.f125194c) {
                ((ImTextTitleBar) this.f125258a._$_findCachedViewById(R.id.bkn)).setRightTextVisibility(8);
                ((ImTextTitleBar) this.f125258a._$_findCachedViewById(R.id.bkn)).setOnTitlebarClickListener(new ImTextTitleBar.AbstractC55309a(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54642c.C546431 */

                    /* renamed from: a */
                    final /* synthetic */ C54642c f125259a;

                    static {
                        Covode.recordClassIndex(64358);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                    /* renamed from: a */
                    public final void mo91163a(int i) {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                    /* renamed from: b */
                    public final void mo91164b() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                    /* renamed from: c */
                    public final void mo91165c() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                    /* renamed from: a */
                    public final void mo91162a() {
                        this.f125259a.f125258a.finish();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f125259a = r1;
                    }
                });
                return;
            }
            ((ImTextTitleBar) this.f125258a._$_findCachedViewById(R.id.bkn)).setRightTextVisibility(0);
            ((ImTextTitleBar) this.f125258a._$_findCachedViewById(R.id.bkn)).setRightTuxFont(42);
            if (bVar.f125175d.f125195d) {
                ((ImTextTitleBar) this.f125258a._$_findCachedViewById(R.id.bkn)).setRightTextColor(C0643b.m2378c(this.f125258a, R.color.bz));
                ((ImTextTitleBar) this.f125258a._$_findCachedViewById(R.id.bkn)).setOnTitlebarClickListener(new ImTextTitleBar.AbstractC55309a(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54642c.C546442 */

                    /* renamed from: a */
                    final /* synthetic */ C54642c f125260a;

                    static {
                        Covode.recordClassIndex(64359);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                    /* renamed from: a */
                    public final void mo91163a(int i) {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                    /* renamed from: b */
                    public final void mo91164b() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                    /* renamed from: c */
                    public final void mo91165c() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                    /* renamed from: a */
                    public final void mo91162a() {
                        this.f125260a.f125258a.finish();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f125260a = r1;
                    }
                });
                return;
            }
            ((ImTextTitleBar) this.f125258a._$_findCachedViewById(R.id.bkn)).setRightTextColor(C0643b.m2378c(this.f125258a, R.color.bh));
            ((ImTextTitleBar) this.f125258a._$_findCachedViewById(R.id.bkn)).setOnTitlebarClickListener(new ImTextTitleBar.AbstractC55309a(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity.C54642c.C546453 */

                /* renamed from: a */
                final /* synthetic */ C54642c f125261a;

                static {
                    Covode.recordClassIndex(64360);
                }

                @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                /* renamed from: b */
                public final void mo91164b() {
                }

                @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                /* renamed from: c */
                public final void mo91165c() {
                }

                @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                /* renamed from: a */
                public final void mo91162a() {
                    this.f125261a.f125258a.finish();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f125261a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
                /* renamed from: a */
                public final void mo91163a(int i) {
                    this.f125261a.f125258a.mo91702b().mo91840d();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity$d */
    static final class C54646d extends AbstractC89220m implements AbstractC89172b<C54611c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f125262a;

        static {
            Covode.recordClassIndex(64361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54646d(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.f125262a = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C54611c cVar) {
            C23208a.C23209a eVar;
            C23208a.C23209a a;
            C23208a.C23209a eVar2;
            int i;
            C23208a.C23209a eVar3;
            C23208a.C23209a eVar4;
            C23208a.C23209a eVar5;
            C23208a.C23209a eVar6;
            C54611c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            if (cVar2.f125179a) {
                GroupChatDetailActivity groupChatDetailActivity = this.f125262a;
                C23028c.m43435a((C23023b) C23035c.m43448a(groupChatDetailActivity).mo37482a(false).mo37479a(R.string.c76).mo37483b(R.string.c78), new C54665m(groupChatDetailActivity)).mo37405a().mo37396b().show();
            }
            if (cVar2.f125180b) {
                GroupChatDetailActivity groupChatDetailActivity2 = this.f125262a;
                C23028c.m43435a((C23023b) C23035c.m43448a(groupChatDetailActivity2).mo37482a(false).mo37479a(R.string.c69).mo37483b(R.string.c6_), new C54668n(groupChatDetailActivity2)).mo37405a().mo37396b().show();
            }
            if (cVar2.f125191m) {
                GroupChatDetailActivity groupChatDetailActivity3 = this.f125262a;
                C23028c.m43435a((C23023b) C23035c.m43448a(groupChatDetailActivity3).mo37483b(R.string.c8n), new C54679u(groupChatDetailActivity3)).mo37405a().mo37396b().show();
            }
            if (cVar2.f125181c.length() > 0) {
                new C23144b(this.f125262a).mo37635a(cVar2.f125181c).mo37637b();
            }
            if (cVar2.f125182d) {
                this.f125262a.setResult(2097);
                this.f125262a.finish();
            }
            if (cVar2.f125183e) {
                GroupChatController c = this.f125262a.mo91703c();
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) this.f125262a._$_findCachedViewById(R.id.bj6);
                C89219l.m154716b(epoxyRecyclerView, "");
                c.scrollToRequestInfoModel(epoxyRecyclerView);
            }
            if (cVar2.f125184f) {
                GroupChatDetailActivity groupChatDetailActivity4 = this.f125262a;
                C23028c.m43435a((C23023b) C23035c.m43448a(groupChatDetailActivity4).mo37482a(false).mo37479a(R.string.c62).mo37483b(R.string.c75), new C54661l(groupChatDetailActivity4)).mo37405a().mo37396b().show();
            }
            String str = null;
            if (cVar2.f125185g != null) {
                GroupChatDetailActivity groupChatDetailActivity5 = this.f125262a;
                C54006a aVar = cVar2.f125185g;
                C23208a.C23209a[] aVarArr = new C23208a.C23209a[3];
                if (GroupChatDetailActivity.m100143a(aVar)) {
                    if (groupChatDetailActivity5.mo91701a()) {
                        eVar6 = new C23208a.C23213d().mo37801c(R.raw.icon_person);
                    } else {
                        eVar6 = new C23208a.C23214e();
                    }
                    a = eVar6.mo37785a(R.string.c8z).mo37787a(new C54647e(groupChatDetailActivity5, aVar));
                } else {
                    String string = groupChatDetailActivity5.mo91701a() ? groupChatDetailActivity5.getString(R.string.bxs) : "+ " + groupChatDetailActivity5.getString(R.string.bxs);
                    C89219l.m154716b(string, "");
                    String string2 = groupChatDetailActivity5.getString(R.string.bxt);
                    C89219l.m154716b(string2, "");
                    if (groupChatDetailActivity5.mo91701a()) {
                        eVar = new C23208a.C23213d().mo37801c(R.raw.icon_plus);
                    } else {
                        eVar = new C23208a.C23214e();
                    }
                    IMUser user = aVar.getUser();
                    if (user != null && user.getFollowerStatus() == 1) {
                        string = string2;
                    }
                    a = eVar.mo37788a(string).mo37789b(1).mo37787a(new C54648f(groupChatDetailActivity5, aVar));
                }
                aVarArr[0] = a;
                if (groupChatDetailActivity5.mo91701a()) {
                    eVar2 = new C23208a.C23213d().mo37801c(R.raw.icon_block);
                    if (GroupChatDetailActivity.m100143a(aVar)) {
                        eVar2 = (C23208a.C23213d) eVar2.mo37789b(1);
                    }
                } else {
                    eVar2 = new C23208a.C23214e();
                }
                IMUser user2 = aVar.getUser();
                if (user2 == null || !user2.isBlock()) {
                    i = R.string.ccf;
                } else {
                    i = R.string.ci8;
                }
                aVarArr[1] = eVar2.mo37785a(i).mo37786a(new View$OnClickListenerC54671o(groupChatDetailActivity5, aVar));
                if (groupChatDetailActivity5.mo91701a()) {
                    eVar3 = new C23208a.C23213d().mo37801c(R.raw.icon_flag);
                    if (GroupChatDetailActivity.m100143a(aVar)) {
                        eVar3 = (C23208a.C23213d) eVar3.mo37789b(1);
                    }
                } else {
                    eVar3 = new C23208a.C23214e();
                }
                aVarArr[2] = eVar3.mo37785a(R.string.cgj).mo37786a(new View$OnClickListenerC54672p(groupChatDetailActivity5, aVar));
                List<C23208a.C23209a> c2 = C89070n.m154524c(aVarArr);
                C54610b value = groupChatDetailActivity5.mo91702b().mo91836b().getValue();
                if (C55339a.m101152a(value != null ? value.f125177f : null)) {
                    C23208a.C23209a[] aVarArr2 = new C23208a.C23209a[2];
                    if (groupChatDetailActivity5.mo91701a()) {
                        eVar4 = new C23208a.C23213d().mo37801c(R.raw.icon_person);
                    } else {
                        eVar4 = new C23208a.C23214e();
                    }
                    aVarArr2[0] = eVar4.mo37785a(R.string.c5r).mo37786a(new View$OnClickListenerC54673q(groupChatDetailActivity5, aVar));
                    if (groupChatDetailActivity5.mo91701a()) {
                        eVar5 = new C23208a.C23213d().mo37801c(R.raw.icon_person_x_mark);
                    } else {
                        eVar5 = new C23208a.C23214e();
                    }
                    aVarArr2[1] = eVar5.mo37785a(R.string.c5s).mo37789b(1).mo37786a(new View$OnClickListenerC54674r(groupChatDetailActivity5, aVar));
                    c2.addAll(C89070n.m154522b(aVarArr2));
                }
                C23208a.C23211b a2 = new C23208a.C23211b().mo37792a(R.string.a8y);
                String nickName = aVar.getNickName();
                if (nickName == null) {
                    nickName = "";
                }
                C23208a.C23211b a3 = a2.mo37794a(nickName);
                if (groupChatDetailActivity5.mo91701a()) {
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) c2, 10));
                    for (C23208a.C23209a aVar2 : c2) {
                        Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.bytedance.tux.sheet.actionsheet.TuxActionSheet.IconAction");
                        arrayList.add(aVar2);
                    }
                    a3.mo37795a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) c2, 10));
                    for (C23208a.C23209a aVar3 : c2) {
                        Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.tux.sheet.actionsheet.TuxActionSheet.TextAction");
                        arrayList2.add(aVar3);
                    }
                    a3.mo37799b(arrayList2);
                }
                a3.mo37800b().show(groupChatDetailActivity5.getSupportFragmentManager(), "MEMBER_OPERATION_DIALOG");
            }
            if (cVar2.f125186h != null) {
                GroupChatDetailActivity groupChatDetailActivity6 = this.f125262a;
                C54006a aVar4 = cVar2.f125186h;
                C23023b a4 = C23035c.m43448a(groupChatDetailActivity6);
                Object[] objArr = new Object[1];
                IMUser user3 = aVar4.getUser();
                objArr[0] = user3 != null ? user3.getNickName() : null;
                C23028c.m43435a((C23023b) a4.mo37411b(groupChatDetailActivity6.getString(R.string.c82, objArr)).mo37483b(R.string.c83), new C54658k(groupChatDetailActivity6, aVar4)).mo37405a().mo37396b().show();
            }
            if (cVar2.f125187i != null) {
                GroupChatDetailActivity groupChatDetailActivity7 = this.f125262a;
                C54006a aVar5 = cVar2.f125187i;
                C23023b a5 = C23035c.m43448a(groupChatDetailActivity7);
                Object[] objArr2 = new Object[1];
                IMUser user4 = aVar5.getUser();
                objArr2[0] = user4 != null ? user4.getNickName() : null;
                C23028c.m43435a((C23023b) a5.mo37411b(groupChatDetailActivity7.getString(R.string.c8f, objArr2)).mo37483b(R.string.c8g), new C54655j(groupChatDetailActivity7, aVar5)).mo37405a().mo37396b().show();
            }
            C54006a aVar6 = cVar2.f125188j;
            if (aVar6 != null) {
                GroupChatDetailActivity groupChatDetailActivity8 = this.f125262a;
                C23023b a6 = C23035c.m43448a(groupChatDetailActivity8);
                Object[] objArr3 = new Object[1];
                IMUser user5 = aVar6.getUser();
                if (user5 != null) {
                    str = user5.getNickName();
                }
                objArr3[0] = str;
                C23028c.m43435a((C23023b) a6.mo37411b(groupChatDetailActivity8.getString(R.string.c8u, objArr3)).mo37483b(R.string.c8v), new C54676t(groupChatDetailActivity8, aVar6)).mo37405a().mo37396b().show();
            }
            Pair<Integer, String> pair = cVar2.f125190l;
            if (pair != null) {
                C23144b bVar = new C23144b(this.f125262a);
                Object obj = pair.first;
                C89219l.m154716b(obj, "");
                bVar.mo37636b(((Number) obj).intValue()).mo37638c(C0643b.m2378c(this.f125262a, R.color.bf)).mo37635a((CharSequence) pair.second).mo37637b();
            }
            if (cVar2.f125189k) {
                this.f125262a.mo91704d();
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 2095) {
            finish();
        } else if (i2 != 2098) {
            super.onActivityResult(i, i2, intent);
        } else {
            C54619b.C54620a.m100131a(mo91702b().f125507d, this);
        }
    }
}
