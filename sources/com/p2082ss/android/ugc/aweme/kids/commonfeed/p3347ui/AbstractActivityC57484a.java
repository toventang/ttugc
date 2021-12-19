package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57348c;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.a */
public abstract class AbstractActivityC57484a extends ActivityC17312a {

    /* renamed from: a */
    private AbstractC57401a f131111a;

    /* renamed from: b */
    private C57487b f131112b;

    /* renamed from: c */
    private HashMap f131113c;

    static {
        Covode.recordClassIndex(67419);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131113c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f131113c == null) {
            this.f131113c = new HashMap();
        }
        View view = (View) this.f131113c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131113c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract AbstractC57401a mo94736a();

    /* renamed from: b */
    public abstract String mo94737b();

    /* renamed from: c */
    public abstract String mo94738c();

    /* renamed from: d */
    public abstract String mo94739d();

    /* renamed from: e */
    public String mo94740e() {
        return null;
    }

    /* renamed from: f */
    public String mo94741f() {
        return null;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        super.onPause();
        C57487b bVar = this.f131112b;
        if (bVar != null) {
            bVar.f131117a.mo94674f();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        super.onResume();
        C57487b bVar = this.f131112b;
        if (bVar != null) {
            bVar.mo94742a();
        }
        C57487b bVar2 = this.f131112b;
        if (bVar2 != null) {
            View view = bVar2.f131123k;
            if (view == null) {
                C89219l.m154710a("bottomSpaceView");
            }
            view.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.a$a */
    static final class C57485a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57485a f131114a = new C57485a();

        static {
            Covode.recordClassIndex(67420);
        }

        C57485a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C574861.f131115a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        activityConfiguration(C57485a.f131114a);
        super.onCreate(bundle);
        setContentView(R.layout.acm);
        this.f131111a = mo94736a();
        Fragment a = getSupportFragmentManager().mo3551a(mo94737b());
        if (!(a instanceof C57487b)) {
            a = null;
        }
        C57487b bVar = (C57487b) a;
        this.f131112b = bVar;
        if (bVar == null) {
            String d = mo94739d();
            String c = mo94738c();
            String e = mo94740e();
            AbstractC57401a aVar = this.f131111a;
            if (aVar == null) {
                C89219l.m154710a("feedDelegate");
            }
            String f = mo94741f();
            C89219l.m154721d(d, "");
            C89219l.m154721d(c, "");
            C89219l.m154721d(aVar, "");
            Bundle bundle2 = new Bundle();
            bundle2.putString("enter_from", c);
            if (e != null) {
                bundle2.putString("current_id", e);
            }
            bundle2.putString("title", d);
            C57487b bVar2 = new C57487b();
            bVar2.f131118b = aVar;
            bVar2.f131119c = f;
            bVar2.setArguments(bundle2);
            AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
            C89219l.m154716b(a2, "");
            a2.mo3470b(R.id.b82, bVar2, mo94737b());
            a2.mo3474c(bVar2).mo3467b();
            this.f131112b = bVar2;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            z = true;
        } else {
            z = false;
        }
        AbstractC81915c.m141874a(new C57348c(z));
        return true;
    }
}
