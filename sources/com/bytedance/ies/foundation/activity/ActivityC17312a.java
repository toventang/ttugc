package com.bytedance.ies.foundation.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.C17317c;
import com.bytedance.ies.foundation.base.AbstractC17368c;
import com.bytedance.ies.foundation.base.AbstractC17370e;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.ies.powerpage.ActivityC17733a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33101v;
import com.p2082ss.android.ugc.aweme.activity.processor.C33072b;
import com.p2082ss.android.ugc.aweme.utils.C80456ft;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.ies.foundation.activity.a */
public class ActivityC17312a extends ActivityC17733a implements AbstractC17370e, AbstractC33101v {
    public static final C17313a Companion = new C17313a((byte) 0);
    public static final C17317c callback;
    public static AbstractC89171a<? extends List<? extends AbstractC17350d>> processGenerator;
    public static Class<? extends BaseActivityViewModel> viewModelClass = BaseActivityViewModel.class;
    private final /* synthetic */ C33072b $$delegate_0 = new C33072b();
    private SparseArray _$_findViewCache;
    private WeakReference<ActivityC17312a> activityRef;
    private final AbstractC89244h baseViewModel$delegate = C89250i.m154773a((AbstractC89171a) new C17314b(this));
    public final List<AbstractC17350d> innerProcessors;

    private final BaseActivityViewModel getBaseViewModel() {
        return (BaseActivityViewModel) this.baseViewModel$delegate.getValue();
    }

    @Override // com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(i, findViewById);
        return findViewById;
    }

    public void buildCommonIntent() {
    }

    public void dismissCustomToast() {
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        m32059x143265d0(this);
    }

    @Override // com.bytedance.common.utility.AbstractC13615f
    public void showCustomLongToast(int i, String str) {
        this.$$delegate_0.showCustomLongToast(i, str);
    }

    public void showCustomToast(int i, String str) {
        this.$$delegate_0.mo58855b(str);
    }

    @Override // com.bytedance.common.utility.AbstractC13615f
    public void showCustomToast(int i, String str, int i2, int i3) {
        this.$$delegate_0.showCustomToast(i, str, i2, i3);
    }

    public void showCustomToast(String str) {
        this.$$delegate_0.mo58854a(str);
    }

    /* renamed from: com.bytedance.ies.foundation.activity.a$a */
    public static final class C17313a {
        static {
            Covode.recordClassIndex(19798);
        }

        private C17313a() {
        }

        public /* synthetic */ C17313a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m32060a(AbstractC17315b bVar) {
            C89219l.m154721d(bVar, "");
            C17317c cVar = ActivityC17312a.callback;
            C89219l.m154721d(bVar, "");
            cVar.f41603a.add(bVar);
        }
    }

    /* renamed from: com.bytedance.ies.foundation.activity.a$b */
    static final class C17314b extends AbstractC89220m implements AbstractC89171a<BaseActivityViewModel> {

        /* renamed from: a */
        final /* synthetic */ ActivityC17312a f41602a;

        static {
            Covode.recordClassIndex(19799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17314b(ActivityC17312a aVar) {
            super(0);
            this.f41602a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BaseActivityViewModel invoke() {
            return this.f41602a.getViewModel();
        }
    }

    @Override // com.bytedance.ies.foundation.base.AbstractC17370e
    public BaseViewModel provideBaseViewModel() {
        return getBaseViewModel();
    }

    public final BaseActivityViewModel getViewModel() {
        return (BaseActivityViewModel) m32058xee89a535(this).mo3983a(viewModelClass);
    }

    public void BaseActivity__onPause$___twin___() {
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17344u.f41636a, 6);
        super.onPause();
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17337n.f41629a, 6);
    }

    public void finish() {
        super.finish();
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17318a.f41604a, 6);
    }

    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent != null && (!SmartRouter.isSmartIntent(intent))) {
            intent = SmartRouter.smartIntent(intent);
            setIntent(intent);
        }
        C89219l.m154716b(intent, "");
        return intent;
    }

    public final boolean isActive() {
        AbstractC1196i.EnumC1199b bVar;
        AbstractC1196i lifecycle = getLifecycle();
        if (lifecycle != null) {
            bVar = lifecycle.mo4011a();
        } else {
            bVar = null;
        }
        if (bVar == AbstractC1196i.EnumC1199b.RESUMED) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17343t.f41635a, 6);
        super.onDestroy();
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17336m.f41628a, 6);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17345v.f41637a, 6);
        super.onResume();
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17338o.f41630a, 6);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17347x.f41639a, 6);
        super.onStart();
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17340q.f41632a, 6);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17348y.f41640a, 6);
        super.onStop();
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17341r.f41633a, 6);
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public void onSupportContentChanged() {
        super.onSupportContentChanged();
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, C17317c.C17321ac.f41608a, 6);
    }

    static {
        Covode.recordClassIndex(19797);
        C17317c cVar = new C17317c();
        callback = cVar;
        Context a = C17867d.m33078a();
        if (!(a instanceof Application)) {
            a = null;
        }
        Application application = (Application) a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    public ActivityC17312a() {
        List<AbstractC17350d> list;
        AbstractC89171a<? extends List<? extends AbstractC17350d>> aVar = processGenerator;
        if (aVar != null) {
            list = (List) aVar.invoke();
        } else {
            list = null;
        }
        this.innerProcessors = list;
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public Resources getResources() {
        T t = (T) super.getResources();
        C17317c cVar = callback;
        C89219l.m154716b(t, "");
        C89219l.m154721d(this, "");
        C89219l.m154721d(t, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = t;
        Resources resources = (Resources) cVar.mo27678a(this, false, eVar.element, new C17317c.C17325b(eVar));
        return resources == null ? t : resources;
    }

    /* renamed from: com_bytedance_ies_foundation_activity_BaseActivity_androidx_lifecycle_VScopeLancet_of */
    public static C1175ad m32058xee89a535(ActivityC0945e eVar) {
        return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
    }

    /* renamed from: com_bytedance_ies_foundation_activity_BaseActivity_com_ss_android_ugc_aweme_lancet_CommonUILancet_onBaseAcitivtyPause */
    public static void m32059x143265d0(ActivityC17312a aVar) {
        aVar.BaseActivity__onPause$___twin___();
        C80456ft.f180032a = aVar.getClass();
    }

    public final void activityConfiguration(AbstractC89172b<? super BaseActivityViewModel, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        bVar.invoke(getViewModel());
    }

    public void setActivityRef(WeakReference<ActivityC17312a> weakReference) {
        C89219l.m154721d(weakReference, "");
        C33072b bVar = this.$$delegate_0;
        C89219l.m154721d(weakReference, "");
        bVar.f78632a = weakReference;
    }

    @Override // android.view.ContextThemeWrapper, androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        C89219l.m154721d(configuration, "");
        super.onConfigurationChanged(configuration);
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C89219l.m154721d(configuration, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17349z(configuration), 6);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onRestoreInstanceState(bundle);
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C89219l.m154721d(bundle, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17320ab(bundle), 6);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17322ad(z), 6);
    }

    @Override // androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17323ae(this, i), 6);
    }

    public void attachBaseContext(Context context) {
        Iterator<AbstractC17315b> it = callback.f41603a.iterator();
        while (it.hasNext()) {
            context = it.next().mo27644a(context);
        }
        super.attachBaseContext(context);
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        Iterator<AbstractC17315b> it2 = cVar.f41603a.iterator();
        while (it2.hasNext()) {
            it2.next().mo27649a((Activity) this);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        this.activityRef = new WeakReference<>(this);
        BaseActivityViewModel baseViewModel = getBaseViewModel();
        if (!baseViewModel.initialized) {
            buildCommonIntent();
            baseViewModel.init();
        }
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, true, null, new C17317c.C17342s(bundle), 4);
        super.onCreate(bundle);
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17335l(bundle), 6);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C89219l.m154721d(bundle, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17346w(bundle), 6);
        super.onSaveInstanceState(bundle);
        C89219l.m154721d(this, "");
        C89219l.m154721d(bundle, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17339p(bundle), 6);
    }

    @Override // androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17324af(this, view), 6);
    }

    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17329f(i, intent), 6);
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        Boolean bool = (Boolean) C17317c.m32099a(cVar, this, false, false, new C17317c.C17319aa(i, keyEvent), 2);
        if (bool == null || !bool.booleanValue()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C17317c cVar = callback;
        C89219l.m154721d(this, "");
        C17317c.m32099a(cVar, this, false, null, new C17317c.C17330g(i, i2, intent), 6);
    }

    public void showCustomToast(String str, int i, int i2) {
        this.$$delegate_0.mo58854a(str);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C89219l.m154721d(this, "");
        Iterator<AbstractC17368c> it = getViewModel().getProcessors().iterator();
        while (it.hasNext()) {
            it.next();
            C89219l.m154721d(this, "");
            C89219l.m154721d(this, "");
        }
        super.startActivityForResult(intent, i, bundle);
    }
}
