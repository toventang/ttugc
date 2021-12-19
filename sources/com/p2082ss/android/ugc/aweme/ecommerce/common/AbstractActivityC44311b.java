package com.p2082ss.android.ugc.aweme.ecommerce.common;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.b */
public abstract class AbstractActivityC44311b extends ActivityC17312a implements AbstractC34471f {

    /* renamed from: a */
    private SparseArray f103332a;

    /* renamed from: g */
    public AbstractC34467b f103333g;

    static {
        Covode.recordClassIndex(52625);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f103332a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f103332a == null) {
            this.f103332a = new SparseArray();
        }
        View view = (View) this.f103332a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103332a.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        C65691a.m117584a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f
    public void setActivityResultListener(AbstractC34467b bVar) {
        C89219l.m154721d(bVar, "");
        this.f103333g = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.b$a */
    static final class C44312a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C44312a f103334a = new C44312a();

        static {
            Covode.recordClassIndex(52626);
        }

        C44312a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C443131.f103335a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(C44312a.f103334a);
        C45544c.m88081a("rd_tiktokec_android_activity_create", new C44314b(this, bundle));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.b$b */
    static final class C44314b extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC44311b f103336a;

        /* renamed from: b */
        final /* synthetic */ Bundle f103337b;

        static {
            Covode.recordClassIndex(52628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44314b(AbstractActivityC44311b bVar, Bundle bundle) {
            super(1);
            this.f103336a = bVar;
            this.f103337b = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            int i;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (this.f103337b == null) {
                i = 1;
            } else {
                i = 0;
            }
            aVar2.mo76752b("is_bundle_null", Integer.valueOf(i));
            String simpleName = this.f103336a.getClass().getSimpleName();
            C89219l.m154716b(simpleName, "");
            aVar2.mo76752b("class_name", simpleName);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC34467b bVar = this.f103333g;
        if (bVar != null) {
            bVar.mo60905a(i, i2, intent);
        }
    }
}
