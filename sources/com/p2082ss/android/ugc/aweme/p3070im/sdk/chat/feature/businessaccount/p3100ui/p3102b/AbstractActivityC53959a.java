package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89582cd;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a */
public abstract class AbstractActivityC53959a extends ActivityC17312a implements AbstractC89516am {

    /* renamed from: a */
    private AbstractC89568bz f123714a;

    /* renamed from: b */
    private HashMap f123715b;

    static {
        Covode.recordClassIndex(63626);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f123715b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f123715b == null) {
            this.f123715b = new HashMap();
        }
        View view = (View) this.f123715b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f123715b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // kotlinx.coroutines.AbstractC89516am
    /* renamed from: a */
    public final AbstractC89127f mo20678a() {
        AbstractC89507ah ahVar = C89546bf.f203267b;
        AbstractC89568bz bzVar = this.f123714a;
        if (bzVar == null) {
            C89219l.m154710a("job");
        }
        return ahVar.plus(bzVar);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        super.onDestroy();
        AbstractC89568bz bzVar = this.f123714a;
        if (bzVar == null) {
            C89219l.m154710a("job");
        }
        bzVar.mo143985a((CancellationException) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a$a */
    public static final class C53960a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C53960a f123716a = new C53960a();

        static {
            Covode.recordClassIndex(63627);
        }

        C53960a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C539611.f123717a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        activityConfiguration(C53960a.f123716a);
        super.onCreate(bundle);
        this.f123714a = C89582cd.m155517a(null);
    }
}
