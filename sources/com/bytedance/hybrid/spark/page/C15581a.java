package com.bytedance.hybrid.spark.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.hybrid.spark.p1107a.AbstractC15511g;
import com.bytedance.hybrid.spark.p1111e.C15573c;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.page.a */
public final class C15581a extends Fragment implements AbstractC15511g {

    /* renamed from: b */
    public static final C15582a f37996b = new C15582a((byte) 0);

    /* renamed from: a */
    public C15593c f37997a;

    /* renamed from: c */
    private SparkContext f37998c;

    /* renamed from: d */
    private AbstractC15507c f37999d;

    /* renamed from: e */
    private HashMap f38000e;

    static {
        Covode.recordClassIndex(17845);
    }

    /* renamed from: com.bytedance.hybrid.spark.page.a$a */
    public static final class C15582a {
        static {
            Covode.recordClassIndex(17846);
        }

        private C15582a() {
        }

        public /* synthetic */ C15582a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo25365a() {
        C15593c cVar = this.f37997a;
        if (cVar != null) {
            return cVar.mo25375d();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f38000e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15511g
    /* renamed from: b */
    public final void mo25252b() {
        C15573c.m28691a("SparkFragment", "refresh", this.f37998c);
        C15593c cVar = this.f37997a;
        if (cVar != null) {
            cVar.mo25374c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        C15593c cVar = this.f37997a;
        if (cVar != null) {
            SparkContext sparkContext = cVar.f38023b;
            if (!(sparkContext == null || (str = sparkContext.f50280f) == null)) {
                SparkContext.f37776d.remove(str);
            }
            AbstractC21154h hVar = cVar.f38022a;
            if (hVar != null) {
                hVar.destroy();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154719c(view, "");
        super.onViewCreated(view, bundle);
        C15593c cVar = this.f37997a;
        if (cVar != null) {
            cVar.mo25374c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SparkContext sparkContext;
        C15593c cVar;
        C89219l.m154719c(layoutInflater, "");
        Bundle arguments = getArguments();
        AbstractC15507c cVar2 = null;
        if (arguments != null) {
            sparkContext = (SparkContext) arguments.getParcelable("sparkContext");
        } else {
            sparkContext = null;
        }
        this.f37998c = sparkContext;
        C15573c.m28691a("SparkFragment", "onCreateView", sparkContext);
        Context context = getContext();
        if (context != null) {
            C89219l.m154709a((Object) context, "");
            cVar = new C15593c(context, (byte) 0);
        } else {
            cVar = null;
        }
        this.f37997a = cVar;
        SparkContext sparkContext2 = this.f37998c;
        if (!(sparkContext2 == null || cVar == null)) {
            cVar.mo25371a(sparkContext2);
        }
        SparkContext sparkContext3 = this.f37998c;
        if (sparkContext3 != null) {
            cVar2 = (AbstractC15507c) sparkContext3.mo34746a(AbstractC15507c.class);
        }
        this.f37999d = cVar2;
        return this.f37997a;
    }
}
