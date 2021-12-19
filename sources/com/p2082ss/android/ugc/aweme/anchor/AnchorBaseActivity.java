package com.p2082ss.android.ugc.aweme.anchor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.p2082ss.android.ugc.aweme.AbstractC34830bh;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.C31294aa;
import com.p2082ss.android.ugc.aweme.C33418ae;
import com.p2082ss.android.ugc.aweme.C33421af;
import com.p2082ss.android.ugc.aweme.C33431ag;
import com.p2082ss.android.ugc.aweme.C33464ai;
import com.p2082ss.android.ugc.aweme.C33479ak;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.liveevent.C58812j;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorBaseActivity */
public class AnchorBaseActivity extends ActivityC17312a implements AbstractC34884bl {

    /* renamed from: a */
    private C33421af f79591a;

    /* renamed from: b */
    private C33431ag f79592b;

    /* renamed from: c */
    private C33464ai f79593c;

    /* renamed from: d */
    private String f79594d;

    /* renamed from: e */
    private String f79595e;

    /* renamed from: f */
    private SparseArray f79596f;

    static {
        Covode.recordClassIndex(40360);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f79596f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f79596f == null) {
            this.f79596f = new SparseArray();
        }
        View view = (View) this.f79596f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79596f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34884bl
    /* renamed from: a */
    public void mo59597a(C58812j jVar) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34884bl
    /* renamed from: c */
    public final void mo59600c() {
        finish();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34884bl
    /* renamed from: d */
    public final String mo59601d() {
        String str = this.f79594d;
        if (str == null) {
            C89219l.m154710a("shootWay");
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34884bl
    /* renamed from: e */
    public final String mo59602e() {
        String str = this.f79595e;
        if (str == null) {
            C89219l.m154710a("creationId");
        }
        return str;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.ce, R.anim.cf);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34884bl
    /* renamed from: a */
    public final void mo59596a() {
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        if (this.f79592b == null) {
            this.f79592b = new C33431ag();
        }
        C33431ag agVar = this.f79592b;
        if (agVar != null) {
            if (!agVar.isAdded()) {
                a.mo3453a(R.id.b7z, agVar);
            }
            C33464ai aiVar = this.f79593c;
            if (aiVar != null) {
                a.mo3474c(agVar);
                a.mo3471b(aiVar);
                a.mo3457a((String) null);
                a.mo3473c();
            }
        }
    }

    /* renamed from: f */
    public void mo59603f() {
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        if (this.f79593c == null) {
            this.f79593c = new C33464ai();
        }
        C33464ai aiVar = this.f79593c;
        if (aiVar != null) {
            a.mo3453a(R.id.b7z, aiVar);
            a.mo3473c();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        C33421af afVar;
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, "");
        if (supportFragmentManager.mo3564e() == 0) {
            super.onBackPressed();
            return;
        }
        C33421af afVar2 = this.f79591a;
        if (afVar2 == null || !afVar2.isVisible() || (afVar = this.f79591a) == null || !afVar.f79453d) {
            getSupportFragmentManager().mo3562c();
            return;
        }
        C33421af afVar3 = this.f79591a;
        if (afVar3 != null) {
            afVar3.mo59504a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34884bl
    /* renamed from: b */
    public final void mo59599b() {
        C33418ae aeVar;
        T t;
        Integer num;
        C89378p pVar;
        ArrayList<AnchorCell> arrayList;
        C33464ai aiVar = this.f79593c;
        if (aiVar != null && (aeVar = aiVar.f79516d) != null) {
            C33479ak akVar = (C33479ak) aeVar.f92286h;
            Iterator<T> it = akVar.f79546b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                Integer num2 = t.f79665a;
                if (num2 != null && num2.intValue() == 2) {
                    break;
                }
            }
            T t2 = t;
            if (!(t2 == null || (arrayList = t2.f79669e) == null)) {
                arrayList.clear();
            }
            int a = akVar.mo59561a();
            Iterator<Object> it2 = akVar.f79545a.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it2.next();
                if ((next instanceof C33542a) && (num = ((C33542a) next).f79665a) != null && num.intValue() == 1) {
                    break;
                }
                i++;
            }
            if (a > i) {
                C51423a.m95791b(3, null, "error module range, from=" + a + ", to=" + i);
                pVar = new C89378p(0, 0);
            } else {
                pVar = new C89378p(Integer.valueOf(a), Integer.valueOf(i));
            }
            akVar.f79545a.subList(((Number) pVar.getFirst()).intValue(), ((Number) pVar.getSecond()).intValue()).clear();
            ((AbstractC34830bh) aeVar.f92287i).mo59547b(((C33479ak) aeVar.f92286h).mo59561a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorBaseActivity$a */
    static final class C33502a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C33502a f79597a = new C33502a();

        static {
            Covode.recordClassIndex(40361);
        }

        C33502a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C335031.f79598a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34884bl
    /* renamed from: a */
    public final void mo59598a(ArrayList<AnchorCell> arrayList) {
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        if (this.f79591a == null) {
            this.f79591a = new C33421af();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("recently_add", arrayList);
            C33421af afVar = this.f79591a;
            if (afVar != null) {
                afVar.setArguments(bundle);
            }
        }
        C33421af afVar2 = this.f79591a;
        if (afVar2 != null) {
            if (!afVar2.isAdded()) {
                a.mo3453a(R.id.b7z, afVar2);
            }
            C33464ai aiVar = this.f79593c;
            if (aiVar != null) {
                a.mo3474c(afVar2);
                a.mo3471b(aiVar);
                a.mo3457a((String) null);
                a.mo3473c();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        int type;
        String str;
        String str2;
        String queryParameter;
        Integer e;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", true);
        activityConfiguration(C33502a.f79597a);
        super.onCreate(bundle);
        setContentView(R.layout.av);
        if (getIntent().getData() == null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("anchor_type");
            if (!(serializableExtra instanceof EnumC31359ab)) {
                serializableExtra = null;
            }
            EnumC31359ab abVar = (EnumC31359ab) serializableExtra;
            if (abVar == null) {
                abVar = EnumC31359ab.NO_TYPE;
            }
            C31294aa.C31295a.m65469a(abVar);
            String a = m68640a(getIntent(), "shoot_way");
            if (a == null) {
                a = "";
            }
            this.f79594d = a;
            String a2 = m68640a(getIntent(), "creation_id");
            if (a2 == null) {
                a2 = "";
            }
            this.f79595e = a2;
        } else {
            Uri data = getIntent().getData();
            if (data == null || (queryParameter = data.getQueryParameter("business_type")) == null || (e = C89361p.m154863e(queryParameter)) == null) {
                type = EnumC31359ab.COMMON_TYPE.getTYPE();
            } else {
                type = e.intValue();
            }
            EnumC31359ab abVar2 = EnumC31359ab.COMMON_TYPE;
            abVar2.setTYPE(type);
            C31294aa.C31295a.m65469a(abVar2);
            String a3 = m68640a(getIntent(), "shoot_way");
            if (a3 == null) {
                a3 = "";
            }
            this.f79594d = a3;
            if (a3.length() == 0) {
                if (data == null || (str2 = data.getQueryParameter("shoot_way")) == null) {
                    str2 = "";
                }
                this.f79594d = str2;
            }
            String a4 = m68640a(getIntent(), "creation_id");
            if (a4 == null) {
                a4 = "";
            }
            this.f79595e = a4;
            if (a4.length() == 0) {
                if (data == null || (str = data.getQueryParameter("creation_id")) == null) {
                    str = "";
                }
                this.f79595e = str;
            }
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.e7_);
        C89219l.m154716b(_$_findCachedViewById, "");
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById.getLayoutParams();
        layoutParams.height = C13628n.m24525e(this);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.e7_);
        C89219l.m154716b(_$_findCachedViewById2, "");
        _$_findCachedViewById2.setLayoutParams(layoutParams);
        mo59603f();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m68640a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
