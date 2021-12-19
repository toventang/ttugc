package com.p2082ss.android.ugc.aweme.notification.p3531i;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.i.i */
public class C62208i extends AbstractC34586a implements AbstractC15497d {

    /* renamed from: a */
    private final AbstractC89244h f141218a = C89250i.m154773a((AbstractC89171a) C62210b.f141221a);

    /* renamed from: b */
    private SparseArray f141219b;

    static {
        Covode.recordClassIndex(72962);
    }

    /* renamed from: a */
    public View mo99986a(int i) {
        if (this.f141219b == null) {
            this.f141219b = new SparseArray();
        }
        View view = (View) this.f141219b.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f141219b.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: n */
    public void mo99995n() {
        SparseArray sparseArray = this.f141219b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: o */
    public final Map<Class<? extends C62209a>, C62209a> mo100204o() {
        return (Map) this.f141218a.getValue();
    }

    /* renamed from: l */
    public List<C62209a> mo99993l() {
        return C89086z.INSTANCE;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.i$b */
    static final class C62210b extends AbstractC89220m implements AbstractC89171a<Map<Class<? extends C62209a>, C62209a>> {

        /* renamed from: a */
        public static final C62210b f141221a = new C62210b();

        static {
            Covode.recordClassIndex(72964);
        }

        C62210b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Class<? extends C62209a>, C62209a> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.i$a */
    public static class C62209a {

        /* renamed from: c */
        public C62208i f141220c;

        static {
            Covode.recordClassIndex(72963);
        }

        /* renamed from: a */
        public void mo100172a() {
        }

        /* renamed from: a */
        public void mo100173a(int i) {
        }

        /* renamed from: a */
        public void mo100174a(View view, Bundle bundle) {
            C89219l.m154721d(view, "");
        }

        /* renamed from: c */
        public void mo100176c() {
        }

        public void cg_() {
        }

        /* renamed from: d */
        public void mo100177d() {
        }

        /* renamed from: e */
        public void mo100178e() {
        }

        /* renamed from: f */
        public void mo100179f() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public final C62208i mo100206j() {
            C62208i iVar = this.f141220c;
            if (iVar == null) {
                C89219l.m154710a("fragment");
            }
            return iVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public final ActivityC0945e mo100207k() {
            C62208i iVar = this.f141220c;
            if (iVar == null) {
                C89219l.m154710a("fragment");
            }
            return iVar.getActivity();
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public final ActivityC0945e mo100208l() {
            ActivityC0945e k = mo100207k();
            if (k == null) {
                C89219l.m154715b();
            }
            return k;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
            if (r0 == null) goto L_0x0015;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T extends android.view.View> T mo100205c(int r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.notification.i.i r1 = r2.f141220c
                if (r1 != 0) goto L_0x0009
                java.lang.String r0 = "fragment"
                p4600h.p4611f.p4613b.C89219l.m154710a(r0)
            L_0x0009:
                android.view.View r0 = r1.getView()
                if (r0 == 0) goto L_0x0019
                android.view.View r0 = r0.findViewById(r3)
                if (r0 != 0) goto L_0x0018
            L_0x0015:
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0018:
                return r0
            L_0x0019:
                r0 = 0
                goto L_0x0015
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a.mo100205c(int):android.view.View");
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        mo100204o().clear();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next().mo100179f();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next().mo100172a();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onDestroyView() {
        super.onDestroyView();
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next().cg_();
        }
        mo99995n();
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next().mo100176c();
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public void mo25224b(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next().mo100178e();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends com.ss.android.ugc.aweme.notification.i.i$a> */
    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        for (T t : mo99993l()) {
            C89219l.m154721d(this, "");
            t.f141220c = this;
            mo100204o().put(t.getClass(), t);
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public void mo25223a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next().mo100177d();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next().mo100174a(view, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<T> it = mo100204o().values().iterator();
        while (it.hasNext()) {
            it.next().mo100173a(i);
        }
    }
}
