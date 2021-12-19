package com.p2082ss.android.ugc.aweme.mix;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.a */
public abstract class AbstractActivityC59327a extends ActivityC17312a {

    /* renamed from: a */
    private SparseArray f135561a;

    static {
        Covode.recordClassIndex(69710);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f135561a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f135561a == null) {
            this.f135561a = new SparseArray();
        }
        View view = (View) this.f135561a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f135561a.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract Fragment mo96994a();

    /* renamed from: com.ss.android.ugc.aweme.mix.a$a */
    static final class C59328a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C59328a f135562a = new C59328a();

        static {
            Covode.recordClassIndex(69711);
        }

        C59328a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C593291.f135563a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        activityConfiguration(C59328a.f135562a);
        super.onCreate(bundle);
        setContentView(R.layout.akb);
        getSupportFragmentManager().mo3552a().mo3452a(R.anim.dq, R.anim.dx, 0, R.anim.dx).mo3470b(R.id.b82, mo96994a(), "TAG_CONTAINER").mo3473c();
    }
}
