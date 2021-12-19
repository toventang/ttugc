package com.p2082ss.android.ugc.aweme.kids.setting.items.clearcache;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.bytedance.p1733u.AbstractC23430a;
import com.bytedance.p1733u.C23435d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.Divider;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity */
public final class KidsDiskClearActivity extends ActivityC17312a implements View.OnClickListener {

    /* renamed from: a */
    public static final C57831a f131881a = new C57831a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f131882b = C89250i.m154774a(EnumC89331m.NONE, new C57834d(this));

    /* renamed from: c */
    private final AbstractC89244h f131883c = C89250i.m154774a(EnumC89331m.NONE, new C57836f(this));

    /* renamed from: d */
    private final AbstractC89244h f131884d = C89250i.m154774a(EnumC89331m.NONE, new C57835e(this));

    /* renamed from: e */
    private final AbstractC89244h f131885e = C89250i.m154774a(EnumC89331m.NONE, new C57833c(this));

    /* renamed from: f */
    private final AbstractC89244h f131886f = C89250i.m154774a(EnumC89331m.NONE, new C57851n(this));

    /* renamed from: g */
    private DialogC57857a f131887g;

    /* renamed from: h */
    private HashMap f131888h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$o */
    public final /* synthetic */ class DialogInterface$OnClickListenerC57852o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89183m f131907a;

        static {
            Covode.recordClassIndex(67860);
        }

        DialogInterface$OnClickListenerC57852o(AbstractC89183m mVar) {
            this.f131907a = mVar;
        }

        public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154716b(this.f131907a.invoke(dialogInterface, Integer.valueOf(i)), "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$p */
    final /* synthetic */ class View$OnClickListenerC57853p implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f131908a;

        static {
            Covode.recordClassIndex(67861);
        }

        View$OnClickListenerC57853p(AbstractC89172b bVar) {
            this.f131908a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f131908a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(67838);
    }

    /* renamed from: e */
    private final DiskManagerItemView m104594e() {
        return (DiskManagerItemView) this.f131882b.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131888h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131888h == null) {
            this.f131888h = new HashMap();
        }
        View view = (View) this.f131888h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131888h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DiskManagerItemView mo95154a() {
        return (DiskManagerItemView) this.f131883c.getValue();
    }

    /* renamed from: b */
    public final DiskManagerItemView mo95156b() {
        return (DiskManagerItemView) this.f131884d.getValue();
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$a */
    public static final class C57831a {
        static {
            Covode.recordClassIndex(67839);
        }

        private C57831a() {
        }

        public /* synthetic */ C57831a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$b */
    public static final class C57832b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131889a;

        /* renamed from: b */
        final /* synthetic */ Bundle f131890b;

        static {
            Covode.recordClassIndex(67840);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        C57832b(KidsDiskClearActivity kidsDiskClearActivity, Bundle bundle) {
            this.f131889a = kidsDiskClearActivity;
            this.f131890b = bundle;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().draftService().enterDraftBoxActivity(this.f131889a, this.f131890b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$j */
    static final class C57847j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131905a;

        static {
            Covode.recordClassIndex(67855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57847j(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.f131905a = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f131905a.finish();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$c */
    static final class C57833c extends AbstractC89220m implements AbstractC89171a<Divider> {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131891a;

        static {
            Covode.recordClassIndex(67841);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57833c(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.f131891a = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Divider invoke() {
            return this.f131891a._$_findCachedViewById(R.id.fhu);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$d */
    static final class C57834d extends AbstractC89220m implements AbstractC89171a<DiskManagerItemView> {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131892a;

        static {
            Covode.recordClassIndex(67842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57834d(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.f131892a = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DiskManagerItemView invoke() {
            return this.f131892a._$_findCachedViewById(R.id.a5l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$e */
    static final class C57835e extends AbstractC89220m implements AbstractC89171a<DiskManagerItemView> {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131893a;

        static {
            Covode.recordClassIndex(67843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57835e(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.f131893a = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DiskManagerItemView invoke() {
            return this.f131893a._$_findCachedViewById(R.id.a5m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$f */
    static final class C57836f extends AbstractC89220m implements AbstractC89171a<DiskManagerItemView> {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131894a;

        static {
            Covode.recordClassIndex(67844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57836f(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.f131894a = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DiskManagerItemView invoke() {
            return this.f131894a._$_findCachedViewById(R.id.a5n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$n */
    static final class C57851n extends AbstractC89220m implements AbstractC89171a<Divider> {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131906a;

        static {
            Covode.recordClassIndex(67859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57851n(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.f131906a = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Divider invoke() {
            return this.f131906a._$_findCachedViewById(R.id.dj2);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        DialogC57857a aVar = this.f131887g;
        if (aVar == null || !aVar.isShowing()) {
            super.onBackPressed();
        }
    }

    /* renamed from: c */
    public final void mo95157c() {
        if (this.f131887g == null) {
            DialogC57857a aVar = new DialogC57857a(this);
            aVar.setCancelable(false);
            this.f131887g = aVar;
        }
        DialogC57857a aVar2 = this.f131887g;
        if (aVar2 != null) {
            aVar2.show();
        }
    }

    /* renamed from: d */
    public final void mo95158d() {
        DialogC57857a aVar;
        DialogC57857a aVar2 = this.f131887g;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f131887g) != null) {
            aVar.dismiss();
        }
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        int i;
        int i2;
        String str;
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onResume", true);
        super.onResume();
        m104594e().setLeftText(getString(R.string.fn5));
        m104594e().mo95150f();
        m104594e().mo95152h();
        mo95154a().setLeftText(getString(R.string.fni));
        mo95154a().mo95150f();
        mo95154a().mo95152h();
        mo95156b().setLeftText(getString(R.string.fn0));
        mo95156b().mo95150f();
        mo95156b().mo95152h();
        DiskManagerItemView e = m104594e();
        C89219l.m154716b(e, "");
        m104593a("DRAFT", e);
        DiskManagerItemView a = mo95154a();
        C89219l.m154716b(a, "");
        m104593a("CACHE", a);
        DiskManagerItemView b = mo95156b();
        C89219l.m154716b(b, "");
        m104593a("RESOURCE", b);
        int size = AVExternalServiceImpl.m113114a().draftService().draftList(false).size();
        DiskManagerItemView e2 = m104594e();
        C89219l.m154716b(e2, "");
        int i3 = 8;
        if (size <= 0) {
            i = 8;
        } else {
            i = 0;
        }
        e2.setVisibility(i);
        Divider divider = (Divider) this.f131885e.getValue();
        C89219l.m154716b(divider, "");
        DiskManagerItemView e3 = m104594e();
        C89219l.m154716b(e3, "");
        divider.setVisibility(e3.getVisibility());
        List<AbstractC23430a> b2 = C23435d.m44118b();
        if (b2 == null || ((b2 instanceof Collection) && b2.isEmpty())) {
            i2 = 0;
        } else {
            i2 = 0;
            for (T t : b2) {
                if (t != null) {
                    str = t.mo38198a();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) "RESOURCE") && (i2 = i2 + 1) < 0) {
                    C89070n.m154523b();
                }
            }
        }
        DiskManagerItemView b3 = mo95156b();
        C89219l.m154716b(b3, "");
        if (i2 > 0) {
            i3 = 0;
        }
        b3.setVisibility(i3);
        Divider divider2 = (Divider) this.f131886f.getValue();
        C89219l.m154716b(divider2, "");
        DiskManagerItemView b4 = mo95156b();
        C89219l.m154716b(b4, "");
        divider2.setVisibility(b4.getVisibility());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onResume", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$i */
    static final class C57845i extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57845i f131903a = new C57845i();

        static {
            Covode.recordClassIndex(67853);
        }

        C57845i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C578461.f131904a);
            return C89391z.f203057a;
        }
    }

    public final void exit(View view) {
        C89219l.m154721d(view, "");
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$k */
    static final /* synthetic */ class C57848k extends C89217j implements AbstractC89172b<View, C89391z> {
        static {
            Covode.recordClassIndex(67856);
        }

        C57848k(KidsDiskClearActivity kidsDiskClearActivity) {
            super(1, kidsDiskClearActivity, KidsDiskClearActivity.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            ((KidsDiskClearActivity) this.receiver).onClick(view2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$l */
    static final /* synthetic */ class C57849l extends C89217j implements AbstractC89172b<View, C89391z> {
        static {
            Covode.recordClassIndex(67857);
        }

        C57849l(KidsDiskClearActivity kidsDiskClearActivity) {
            super(1, kidsDiskClearActivity, KidsDiskClearActivity.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            ((KidsDiskClearActivity) this.receiver).onClick(view2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$m */
    static final /* synthetic */ class C57850m extends C89217j implements AbstractC89172b<View, C89391z> {
        static {
            Covode.recordClassIndex(67858);
        }

        C57850m(KidsDiskClearActivity kidsDiskClearActivity) {
            super(1, kidsDiskClearActivity, KidsDiskClearActivity.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            ((KidsDiskClearActivity) this.receiver).onClick(view2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$r */
    public static final class C57855r<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DiskManagerItemView f131911a;

        static {
            Covode.recordClassIndex(67863);
        }

        C57855r(DiskManagerItemView diskManagerItemView) {
            this.f131911a = diskManagerItemView;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f131911a.mo95153i();
            this.f131911a.mo95151g();
            this.f131911a.setLeftText((String) obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$s */
    public static final class C57856s<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131912a;

        /* renamed from: b */
        final /* synthetic */ DiskManagerItemView f131913b;

        /* renamed from: c */
        final /* synthetic */ String f131914c;

        static {
            Covode.recordClassIndex(67864);
        }

        C57856s(KidsDiskClearActivity kidsDiskClearActivity, DiskManagerItemView diskManagerItemView, String str) {
            this.f131912a = kidsDiskClearActivity;
            this.f131913b = diskManagerItemView;
            this.f131914c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f131913b.mo95151g();
            this.f131913b.setLeftText(this.f131912a.mo95155a(this.f131914c));
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        int id = view.getId();
        if (id == R.id.a5l) {
            if (!m104594e().mo95149e()) {
                IExternalService a = AVExternalServiceImpl.m113114a();
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_disk_manage_mode", true);
                a.asyncService("CleanDraft", new C57832b(this, bundle));
            }
        } else if (id == R.id.a5n) {
            if (!mo95154a().mo95149e()) {
                m104592a(R.string.fmw, new C57837g(this));
            }
        } else if (id == R.id.a5m && !mo95156b().mo95149e()) {
            m104592a(R.string.fmv, new C57841h(this));
        }
    }

    /* renamed from: a */
    public final String mo95155a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 63879010) {
            if (hashCode == 65307009 && str.equals("DRAFT")) {
                String string = getString(R.string.fn3, new Object[]{Float.valueOf(0.0f)});
                C89219l.m154716b(string, "");
                return string;
            }
        } else if (str.equals("CACHE")) {
            String string2 = getString(R.string.fnh, new Object[]{Float.valueOf(0.0f)});
            C89219l.m154716b(string2, "");
            return string2;
        }
        String string3 = getString(R.string.fmy, new Object[]{Float.valueOf(0.0f)});
        C89219l.m154716b(string3, "");
        return string3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$q */
    public static final class C57854q<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131909a;

        /* renamed from: b */
        final /* synthetic */ String f131910b;

        static {
            Covode.recordClassIndex(67862);
        }

        C57854q(KidsDiskClearActivity kidsDiskClearActivity, String str) {
            this.f131909a = kidsDiskClearActivity;
            this.f131910b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String string;
            String string2;
            String string3;
            C89219l.m154721d(obj, "");
            List<AbstractC23430a> b = C23435d.m44118b();
            if (b != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : b) {
                    T t2 = t;
                    if (C89219l.m154714a((Object) this.f131910b, (Object) (t2 != null ? t2.mo38198a() : null))) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (T t3 : arrayList2) {
                    C89219l.m154716b(t3, "");
                    long e = t3.mo38202e();
                    t3.getClass().getSimpleName();
                    File c = t3.mo38200c();
                    C89219l.m154716b(c, "");
                    c.getAbsolutePath();
                    arrayList3.add(Long.valueOf(e));
                }
                Long valueOf = Long.valueOf(C89070n.m154600t(arrayList3));
                if (valueOf != null) {
                    KidsDiskClearActivity kidsDiskClearActivity = this.f131909a;
                    String str = this.f131910b;
                    double longValue = (double) valueOf.longValue();
                    int hashCode = str.hashCode();
                    if (hashCode != 65307009) {
                        if (hashCode == 441562126 && str.equals("RESOURCE")) {
                            Double.isNaN(longValue);
                            double d = longValue / 1.073741824E9d;
                            if (d > 1.0d) {
                                string3 = kidsDiskClearActivity.getString(R.string.fmz, new Object[]{Double.valueOf(d)});
                            } else {
                                Double.isNaN(longValue);
                                string3 = kidsDiskClearActivity.getString(R.string.fmy, new Object[]{Double.valueOf(longValue / 1048576.0d)});
                            }
                            C89219l.m154716b(string3, "");
                            return string3;
                        }
                    } else if (str.equals("DRAFT")) {
                        Double.isNaN(longValue);
                        double d2 = longValue / 1.073741824E9d;
                        if (d2 > 1.0d) {
                            string = kidsDiskClearActivity.getString(R.string.fn4, new Object[]{Double.valueOf(d2)});
                        } else {
                            Double.isNaN(longValue);
                            string = kidsDiskClearActivity.getString(R.string.fn3, new Object[]{Double.valueOf(longValue / 1048576.0d)});
                        }
                        C89219l.m154716b(string, "");
                        return string;
                    }
                    Double.isNaN(longValue);
                    double d3 = longValue / 1048576.0d;
                    if (d3 < 30.0d) {
                        string2 = kidsDiskClearActivity.getString(R.string.fnh, new Object[]{Float.valueOf(0.0f)});
                    } else {
                        string2 = kidsDiskClearActivity.getString(R.string.fnh, new Object[]{Double.valueOf(d3)});
                    }
                    C89219l.m154716b(string2, "");
                    return string2;
                }
            }
            return this.f131909a.mo95155a(this.f131910b);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", true);
        activityConfiguration(C57845i.f131903a);
        super.onCreate(bundle);
        setContentView(R.layout.abt);
        int b = (int) C13628n.m24520b(this, 18.0f);
        int b2 = (int) C13628n.m24520b(this, 4.0f);
        DiskManagerItemView a = mo95154a();
        C89219l.m154716b(a, "");
        TextView tvwRight = a.getTvwRight();
        C89219l.m154716b(tvwRight, "");
        tvwRight.setTextSize(12.0f);
        DiskManagerItemView a2 = mo95154a();
        C89219l.m154716b(a2, "");
        TextView tvwRight2 = a2.getTvwRight();
        DiskManagerItemView a3 = mo95154a();
        C89219l.m154716b(a3, "");
        TextView tvwRight3 = a3.getTvwRight();
        C89219l.m154716b(tvwRight3, "");
        tvwRight2.setTextColor(C0643b.m2378c(tvwRight3.getContext(), R.color.bi));
        DiskManagerItemView a4 = mo95154a();
        C89219l.m154716b(a4, "");
        a4.getTvwRight().setBackgroundResource(R.drawable.b07);
        DiskManagerItemView a5 = mo95154a();
        C89219l.m154716b(a5, "");
        TextView tvwRight4 = a5.getTvwRight();
        if (tvwRight4 != null) {
            ((DmtTextView) tvwRight4).setFontType(C17303d.f41573g);
            DiskManagerItemView a6 = mo95154a();
            C89219l.m154716b(a6, "");
            a6.getTvwRight().setPadding(b, b2, b, b2);
            DiskManagerItemView b3 = mo95156b();
            C89219l.m154716b(b3, "");
            TextView tvwRight5 = b3.getTvwRight();
            C89219l.m154716b(tvwRight5, "");
            tvwRight5.setTextSize(12.0f);
            DiskManagerItemView b4 = mo95156b();
            C89219l.m154716b(b4, "");
            TextView tvwRight6 = b4.getTvwRight();
            DiskManagerItemView b5 = mo95156b();
            C89219l.m154716b(b5, "");
            TextView tvwRight7 = b5.getTvwRight();
            C89219l.m154716b(tvwRight7, "");
            tvwRight6.setTextColor(C0643b.m2378c(tvwRight7.getContext(), R.color.bi));
            DiskManagerItemView b6 = mo95156b();
            C89219l.m154716b(b6, "");
            b6.getTvwRight().setBackgroundResource(R.drawable.b07);
            DiskManagerItemView b7 = mo95156b();
            C89219l.m154716b(b7, "");
            TextView tvwRight8 = b7.getTvwRight();
            if (tvwRight8 != null) {
                ((DmtTextView) tvwRight8).setFontType(C17303d.f41573g);
                DiskManagerItemView b8 = mo95156b();
                C89219l.m154716b(b8, "");
                b8.getTvwRight().setPadding(b, b2, b, b2);
                TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.eiz);
                C23194g gVar = new C23194g();
                String string = getString(R.string.c0a);
                C89219l.m154716b(string, "");
                tuxNavBar.mo37725a(gVar.mo37753a(string));
                tuxNavBar.mo37724a((AbstractC23189c) new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C57847j(this)));
                tuxNavBar.mo37727a(true);
                findViewById(R.id.a5l).setOnClickListener(new View$OnClickListenerC57853p(new C57848k(this)));
                findViewById(R.id.a5n).setOnClickListener(new View$OnClickListenerC57853p(new C57849l(this)));
                findViewById(R.id.a5m).setOnClickListener(new View$OnClickListenerC57853p(new C57850m(this)));
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", false);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", false);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", false);
        throw nullPointerException2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$g */
    public static final class C57837g extends AbstractC89220m implements AbstractC89183m<Object, Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131895a;

        static {
            Covode.recordClassIndex(67845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57837g(KidsDiskClearActivity kidsDiskClearActivity) {
            super(2);
            this.f131895a = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(obj2, "");
            this.f131895a.mo95157c();
            AbstractC88979t.m154310b("").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C578381.f131896a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.C57837g.C578392 */

                /* renamed from: a */
                final /* synthetic */ C57837g f131897a;

                static {
                    Covode.recordClassIndex(67847);
                }

                {
                    this.f131897a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f131897a.f131895a.mo95158d();
                    this.f131897a.f131895a.mo95154a().setLeftText(this.f131897a.f131895a.getString(R.string.fnh, new Object[]{Float.valueOf(0.0f)}));
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.C57837g.C578403 */

                /* renamed from: a */
                final /* synthetic */ C57837g f131898a;

                static {
                    Covode.recordClassIndex(67848);
                }

                {
                    this.f131898a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f131898a.f131895a.mo95158d();
                    this.f131898a.f131895a.mo95154a().setLeftText(this.f131898a.f131895a.getString(R.string.fnh, new Object[]{Float.valueOf(0.0f)}));
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity$h */
    public static final class C57841h extends AbstractC89220m implements AbstractC89183m<Object, Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ KidsDiskClearActivity f131899a;

        static {
            Covode.recordClassIndex(67849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57841h(KidsDiskClearActivity kidsDiskClearActivity) {
            super(2);
            this.f131899a = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(obj2, "");
            this.f131899a.mo95157c();
            AbstractC88979t.m154310b("").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C578421.f131900a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.C57841h.C578432 */

                /* renamed from: a */
                final /* synthetic */ C57841h f131901a;

                static {
                    Covode.recordClassIndex(67851);
                }

                {
                    this.f131901a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f131901a.f131899a.mo95158d();
                    this.f131901a.f131899a.mo95156b().setLeftText(this.f131901a.f131899a.getString(R.string.fmy, new Object[]{Float.valueOf(0.0f)}));
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.C57841h.C578443 */

                /* renamed from: a */
                final /* synthetic */ C57841h f131902a;

                static {
                    Covode.recordClassIndex(67852);
                }

                {
                    this.f131902a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f131902a.f131899a.mo95158d();
                    this.f131902a.f131899a.mo95156b().setLeftText(this.f131902a.f131899a.getString(R.string.fmy, new Object[]{Float.valueOf(0.0f)}));
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m104593a(String str, DiskManagerItemView diskManagerItemView) {
        AbstractC88979t.m154310b(this).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C57854q(this, str)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C57855r(diskManagerItemView), new C57856s(this, diskManagerItemView, str));
    }

    /* renamed from: a */
    private final void m104592a(int i, AbstractC89183m<Object, Object, C89391z> mVar) {
        String string = getResources().getString(R.string.a8y);
        C89219l.m154716b(string, "");
        String string2 = getResources().getString(R.string.fmu);
        C89219l.m154716b(string2, "");
        try {
            new DialogC18267b.C18268a(this, 2).mo29151a(i).mo29154a(string2, new DialogInterface$OnClickListenerC57852o(mVar)).mo29158c(string).mo29150a().mo29157b().show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
