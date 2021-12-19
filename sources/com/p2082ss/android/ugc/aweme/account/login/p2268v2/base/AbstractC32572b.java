package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1643f.C22374d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b */
public abstract class AbstractC32572b extends AbstractC34586a implements AbstractC32584f {

    /* renamed from: a */
    private final AbstractC89244h f77714a = C89250i.m154773a((AbstractC89171a) new C32580h(this));

    /* renamed from: b */
    private final AbstractC89244h f77715b = C89250i.m154773a((AbstractC89171a) new C32573a(this));

    /* renamed from: c */
    private final AbstractC89244h f77716c = C89250i.m154773a((AbstractC89171a) new C32574b(this));

    /* renamed from: d */
    private final AbstractC89244h f77717d = C89250i.m154773a((AbstractC89171a) new C32575c(this));

    /* renamed from: e */
    private final AbstractC89244h f77718e = C89250i.m154773a((AbstractC89171a) new C32576d(this));

    /* renamed from: j */
    private final AbstractC89244h f77719j = C89250i.m154773a((AbstractC89171a) new C32577e(this));

    /* renamed from: k */
    private final AbstractC89244h f77720k = C89250i.m154773a((AbstractC89171a) new C32578f(this));

    /* renamed from: l */
    private final AbstractC89244h f77721l = C89250i.m154773a((AbstractC89171a) new C32579g(this));

    /* renamed from: m */
    private HashMap f77722m;

    /* renamed from: t */
    public long f77723t = System.currentTimeMillis();

    /* renamed from: u */
    public ArrayList<AbstractC22288a<? extends C22289b>> f77724u;

    static {
        Covode.recordClassIndex(39344);
    }

    /* renamed from: A */
    public final EnumC32592i mo58458A() {
        return (EnumC32592i) this.f77721l.getValue();
    }

    /* renamed from: Z_ */
    public final EnumC32594j mo58460Z_() {
        return (EnumC32594j) this.f77714a.getValue();
    }

    /* renamed from: a */
    public abstract void mo57442a(int i, String str);

    public String ad_() {
        return "";
    }

    /* renamed from: b_ */
    public abstract void mo57470b_(int i);

    /* renamed from: c */
    public View mo57434c(int i) {
        if (this.f77722m == null) {
            this.f77722m = new HashMap();
        }
        View view = (View) this.f77722m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77722m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h */
    public void mo57438h() {
        HashMap hashMap = this.f77722m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: q */
    public abstract boolean mo57458q();

    /* renamed from: v */
    public final EnumC32594j mo58465v() {
        return (EnumC32594j) this.f77715b.getValue();
    }

    /* renamed from: w */
    public final String mo58466w() {
        return (String) this.f77716c.getValue();
    }

    /* renamed from: x */
    public final String mo58467x() {
        return (String) this.f77717d.getValue();
    }

    /* renamed from: y */
    public final String mo58468y() {
        return (String) this.f77718e.getValue();
    }

    /* renamed from: z */
    public final AbstractC22329e mo58469z() {
        return (AbstractC22329e) this.f77720k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final Bundle ae_() {
        return getArguments();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$f */
    static final class C32578f extends AbstractC89220m implements AbstractC89171a<AbstractC22329e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77730a;

        static {
            Covode.recordClassIndex(39350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32578f(AbstractC32572b bVar) {
            super(0);
            this.f77730a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC22329e invoke() {
            return C22374d.m42169a(this.f77730a.getContext());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String aa_() {
        String w = mo58466w();
        C89219l.m154716b(w, "");
        return w;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String ab_() {
        String x = mo58467x();
        C89219l.m154716b(x, "");
        return x;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String ac_() {
        String y = mo58468y();
        C89219l.m154716b(y, "");
        return y;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onDestroyView() {
        mo58459B();
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f77723t = System.currentTimeMillis();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$a */
    static final class C32573a extends AbstractC89220m implements AbstractC89171a<EnumC32594j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77725a;

        static {
            Covode.recordClassIndex(39345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32573a(AbstractC32572b bVar) {
            super(0);
            this.f77725a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EnumC32594j invoke() {
            int value;
            Bundle arguments = this.f77725a.getArguments();
            if (arguments != null) {
                value = arguments.getInt("child_page", EnumC32594j.NONE.getValue());
            } else {
                value = EnumC32594j.NONE.getValue();
            }
            return EnumC32594j.C32595a.m67087a(value);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$b */
    static final class C32574b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77726a;

        static {
            Covode.recordClassIndex(39346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32574b(AbstractC32572b bVar) {
            super(0);
            this.f77726a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f77726a.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$c */
    static final class C32575c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77727a;

        static {
            Covode.recordClassIndex(39347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32575c(AbstractC32572b bVar) {
            super(0);
            this.f77727a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f77727a.getArguments();
            if (arguments == null || (string = arguments.getString("enter_method")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$d */
    static final class C32576d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77728a;

        static {
            Covode.recordClassIndex(39348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32576d(AbstractC32572b bVar) {
            super(0);
            this.f77728a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f77728a.getArguments();
            if (arguments == null || (string = arguments.getString("enter_type")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$e */
    static final class C32577e extends AbstractC89220m implements AbstractC89171a<EnumC32594j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77729a;

        static {
            Covode.recordClassIndex(39349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32577e(AbstractC32572b bVar) {
            super(0);
            this.f77729a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EnumC32594j invoke() {
            int value;
            Bundle arguments = this.f77729a.getArguments();
            if (arguments != null) {
                value = arguments.getInt("previous_page", EnumC32594j.NONE.getValue());
            } else {
                value = EnumC32594j.NONE.getValue();
            }
            return EnumC32594j.C32595a.m67087a(value);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$h */
    static final class C32580h extends AbstractC89220m implements AbstractC89171a<EnumC32594j> {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77732a;

        static {
            Covode.recordClassIndex(39352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32580h(AbstractC32572b bVar) {
            super(0);
            this.f77732a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EnumC32594j invoke() {
            int value;
            Bundle arguments = this.f77732a.getArguments();
            if (arguments != null) {
                value = arguments.getInt("current_page", EnumC32594j.NONE.getValue());
            } else {
                value = EnumC32594j.NONE.getValue();
            }
            return EnumC32594j.C32595a.m67087a(value);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$g */
    static final class C32579g extends AbstractC89220m implements AbstractC89171a<EnumC32592i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77731a;

        static {
            Covode.recordClassIndex(39351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32579g(AbstractC32572b bVar) {
            super(0);
            this.f77731a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EnumC32592i invoke() {
            int value;
            Bundle arguments = this.f77731a.getArguments();
            if (arguments != null) {
                value = arguments.getInt("current_scene", EnumC32592i.NONE.getValue());
            } else {
                value = EnumC32592i.NONE.getValue();
            }
            EnumC32592i iVar = EnumC32592i.VALUES_MAP.get(Integer.valueOf(value));
            if (iVar == null) {
                return EnumC32592i.SIGN_UP;
            }
            return iVar;
        }
    }

    /* renamed from: B */
    public final void mo58459B() {
        if (!C13603b.m24435a((Collection) this.f77724u)) {
            ArrayList<AbstractC22288a<? extends C22289b>> arrayList = this.f77724u;
            if (arrayList == null) {
                C89219l.m154715b();
            }
            for (int size = arrayList.size() - 1; size <= 0; size++) {
                ArrayList<AbstractC22288a<? extends C22289b>> arrayList2 = this.f77724u;
                if (arrayList2 == null) {
                    C89219l.m154715b();
                }
                AbstractC22288a<? extends C22289b> aVar = arrayList2.get(size);
                C89219l.m154716b(aVar, "");
                AbstractC22288a<? extends C22289b> aVar2 = aVar;
                if (!aVar2.f52711a) {
                    aVar2.mo36604a();
                }
                ArrayList<AbstractC22288a<? extends C22289b>> arrayList3 = this.f77724u;
                if (arrayList3 == null) {
                    C89219l.m154715b();
                }
                arrayList3.remove(size);
            }
        }
    }

    /* renamed from: a */
    public final void mo58461a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a.postValue(bundle);
        }
    }

    /* renamed from: b */
    public final void mo58463b(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77691b.postValue(bundle);
        }
    }

    /* renamed from: a */
    public final void mo58462a(IBinder iBinder) {
        Object obj;
        C89219l.m154721d(iBinder, "");
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            obj = m67039a(activity, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }

    /* renamed from: b */
    public final <T extends C22289b> void mo58464b(AbstractC22288a<T> aVar) {
        C89219l.m154721d(aVar, "");
        if (this.f77724u == null) {
            this.f77724u = new ArrayList<>();
        }
        ArrayList<AbstractC22288a<? extends C22289b>> arrayList = this.f77724u;
        if (arrayList == null) {
            C89219l.m154715b();
        }
        arrayList.add(aVar);
    }

    /* renamed from: a */
    private static Object m67039a(ActivityC0945e eVar, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return eVar.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return eVar.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = eVar.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
