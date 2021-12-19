package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.analytics.C2592b;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.a */
public abstract class AbstractActivityC32568a extends ActivityC17312a {

    /* renamed from: a */
    private Fragment f77711a;

    /* renamed from: b */
    private HashMap f77712b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.a$c */
    final /* synthetic */ class C32571c implements AbstractC1214u {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f77713a;

        static {
            Covode.recordClassIndex(39343);
        }

        C32571c(AbstractC89172b bVar) {
            this.f77713a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89219l.m154716b(this.f77713a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(39340);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f77712b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f77712b == null) {
            this.f77712b = new HashMap();
        }
        View view = (View) this.f77712b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f77712b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57417a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo57418b(Bundle bundle);

    /* renamed from: c */
    private final void mo58017c() {
        if (isActive()) {
            getSupportFragmentManager().mo3562c();
        }
    }

    /* renamed from: a */
    public void mo58015a() {
        setContentView(R.layout.gr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AbstractC32572b mo58454d() {
        return (AbstractC32572b) getSupportFragmentManager().mo3549a(R.id.b82);
    }

    /* renamed from: e */
    public final String mo58455e() {
        String a = m67028a(getIntent(), "enter_from");
        if (a == null) {
            return "";
        }
        return a;
    }

    /* renamed from: f */
    public final String mo58456f() {
        String a = m67028a(getIntent(), "enter_method");
        if (a == null) {
            return "";
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo58457g() {
        String a = m67028a(getIntent(), "enter_type");
        if (a == null) {
            return "";
        }
        return a;
    }

    /* renamed from: b */
    public void mo58016b() {
        getWindow().setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this, R.color.l)));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        AbstractC32572b d = mo58454d();
        if (d == null || !d.mo57458q()) {
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            if (supportFragmentManager.mo3564e() == 1) {
                finish();
            } else {
                mo58017c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.a$a */
    static final /* synthetic */ class C32569a extends C89217j implements AbstractC89172b<Bundle, C89391z> {
        static {
            Covode.recordClassIndex(39341);
        }

        C32569a(AbstractActivityC32568a aVar) {
            super(1, aVar, AbstractActivityC32568a.class, "handleActionTransition", "handleActionTransition(Landroid/os/Bundle;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bundle bundle) {
            ((AbstractActivityC32568a) this.receiver).mo57417a(bundle);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.a$b */
    static final /* synthetic */ class C32570b extends C89217j implements AbstractC89172b<Bundle, C89391z> {
        static {
            Covode.recordClassIndex(39342);
        }

        C32570b(AbstractActivityC32568a aVar) {
            super(1, aVar, AbstractActivityC32568a.class, "handleSuccess", "handleSuccess(Landroid/os/Bundle;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bundle bundle) {
            ((AbstractActivityC32568a) this.receiver).mo57418b(bundle);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo58016b();
        mo58015a();
        ((ActionResultModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a.observe(this, new C32571c(new C32569a(this)));
        ((ActionResultModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77691b.observe(this, new C32571c(new C32570b(this)));
    }

    /* renamed from: a */
    private static String m67028a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f77711a;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m67029a(AbstractActivityC32568a aVar, AbstractC32572b bVar, Bundle bundle) {
        String str = "";
        C89219l.m154721d(bVar, str);
        C89219l.m154721d(bundle, str);
        AbstractC0952i supportFragmentManager = aVar.getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, str);
        int e = supportFragmentManager.mo3564e();
        if (bundle.getBoolean("finish_before_jump", false)) {
            e--;
            bundle.putBoolean("finish_before_jump", false);
            aVar.mo58017c();
        }
        aVar.f77711a = bVar;
        bVar.setArguments(bundle);
        AbstractC0976n a = aVar.getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a, str);
        if (e > 0 && bundle.getBoolean("open_page_without_animation", false)) {
            a.mo3452a(R.anim.dq, R.anim.a8, R.anim.f205073do, R.anim.a9);
        }
        String ad_ = bVar.ad_();
        if (TextUtils.isEmpty(ad_)) {
            int i = bundle.getInt("current_page", -10);
            if (i != -10) {
                str = String.valueOf(i);
            }
            ad_ = str;
        }
        a.mo3470b(R.id.b82, bVar, ad_);
        if (C89219l.m154714a((Object) true, (Object) true)) {
            a.mo3457a((String) null);
        }
        a.mo3473c();
        if (bVar instanceof AbstractC32613a) {
            C2592b.m7537a((AbstractC2597b) bVar);
        }
    }
}
