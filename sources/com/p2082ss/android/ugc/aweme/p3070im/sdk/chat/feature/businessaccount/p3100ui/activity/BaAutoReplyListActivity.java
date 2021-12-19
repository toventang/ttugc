package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53870b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyEditActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3101a.C53879a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity */
public final class BaAutoReplyListActivity extends AbstractActivityC53959a implements View.OnClickListener, C53879a.AbstractC53881b {

    /* renamed from: d */
    public static final C53910a f123608d = new C53910a((byte) 0);

    /* renamed from: a */
    public final C53879a f123609a = new C53879a();

    /* renamed from: b */
    public List<C53870b> f123610b;

    /* renamed from: c */
    public final IBaAutoMessageService f123611c = BaAutoMessageServiceImpl.m99180d();

    /* renamed from: e */
    private HashMap f123612e;

    static {
        Covode.recordClassIndex(63574);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f123612e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f123612e == null) {
            this.f123612e = new HashMap();
        }
        View view = (View) this.f123612e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f123612e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity$a */
    public static final class C53910a {
        static {
            Covode.recordClassIndex(63575);
        }

        private C53910a() {
        }

        public /* synthetic */ C53910a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final List<C53870b> mo91059b() {
        List<C53870b> list = this.f123610b;
        if (list == null) {
            C89219l.m154710a("messages");
        }
        return list;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity", "onResume", true);
        super.onResume();
        AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C53912c(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity", "onResume", false);
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity$b */
    public static final class C53911b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ BaAutoReplyListActivity f123613a;

        static {
            Covode.recordClassIndex(63576);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        C53911b(BaAutoReplyListActivity baAutoReplyListActivity) {
            this.f123613a = baAutoReplyListActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f123613a.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3101a.C53879a.AbstractC53881b
    /* renamed from: a */
    public final void mo91040a(int i) {
        List<C53870b> list = this.f123610b;
        if (list == null) {
            C89219l.m154710a("messages");
        }
        BaAutoReplyEditActivity.C53882a.m99148a(this, "business_auto_reply", list.get(i).f123518a);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        List<C53870b> list = this.f123610b;
        if (list == null) {
            C89219l.m154710a("messages");
        }
        if (list.size() >= 4) {
            new C23144b(this).mo37640e(R.string.d1p).mo37637b();
        } else {
            BaAutoReplyEditActivity.C53882a.m99148a(this, "business_message_setting_page", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity$c */
    public static final class C53912c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f123614a;

        /* renamed from: b */
        int f123615b;

        /* renamed from: c */
        final /* synthetic */ BaAutoReplyListActivity f123616c;

        static {
            Covode.recordClassIndex(63577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53912c(BaAutoReplyListActivity baAutoReplyListActivity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123616c = baAutoReplyListActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53912c(this.f123616c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53912c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0094 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyListActivity.C53912c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
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
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyListActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m99151a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
