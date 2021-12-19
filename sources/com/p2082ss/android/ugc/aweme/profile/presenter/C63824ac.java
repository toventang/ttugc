package com.p2082ss.android.ugc.aweme.profile.presenter;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ac */
public final class C63824ac extends C39088c<AbstractC39085b<C63827ad>, AbstractC63858v> {

    /* renamed from: a */
    public final String f144685a = (C29736b.f70924e + "/aweme/v1/user/uniqueid/");

    static {
        Covode.recordClassIndex(75248);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.ac$a */
    public static final class C63825a extends AbstractC39085b<C63827ad> {

        /* renamed from: a */
        final /* synthetic */ C63824ac f144686a;

        static {
            Covode.recordClassIndex(75249);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.presenter.ac$a$a */
        static final class CallableC63826a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ Uri.Builder f144687a;

            static {
                Covode.recordClassIndex(75250);
            }

            CallableC63826a(Uri.Builder builder) {
                this.f144687a = builder;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C63873h.f144797a.apiExecuteGetJSONObject(this.f144687a.toString(), C63827ad.class, "", true, null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63825a(C63824ac acVar) {
            this.f144686a = acVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
        public final boolean checkParams(Object... objArr) {
            C89219l.m154721d(objArr, "");
            if (objArr.length == 1) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
        public final boolean sendRequest(Object... objArr) {
            C89219l.m154721d(objArr, "");
            if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                return false;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            Uri.Builder buildUpon = Uri.parse(this.f144686a.f144685a).buildUpon();
            buildUpon.appendQueryParameter("id", (String) obj);
            C34608n.m70658a().mo61083a(this.mHandler, new CallableC63826a(buildUpon), 0);
            return true;
        }
    }

    public C63824ac() {
        mo67838a(new C63825a(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        String str;
        T t;
        T t2;
        super.mo57528c();
        AbstractC39085b bVar = this.f92286h;
        String str2 = null;
        if (bVar == null || (t2 = bVar.mData) == null) {
            str = null;
        } else {
            str = t2.f144688a;
        }
        AbstractC39085b bVar2 = this.f92286h;
        if (!(bVar2 == null || (t = bVar2.mData) == null)) {
            str2 = t.f144689b;
        }
        if (str != null && str2 != null) {
            ((AbstractC63858v) this.f92287i).mo103334a(str, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        super.mo57526a_(exc);
        ((AbstractC63858v) this.f92287i).mo103335d();
    }
}
