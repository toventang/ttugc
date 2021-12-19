package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aa */
public class C31294aa extends Fragment {

    /* renamed from: b */
    public static EnumC31359ab f75003b = EnumC31359ab.NO_TYPE;

    /* renamed from: c */
    public static final C31295a f75004c = new C31295a((byte) 0);

    /* renamed from: a */
    public AbstractC34884bl f75005a;

    /* renamed from: d */
    private SparseArray f75006d;

    /* renamed from: a */
    public View mo57294a(int i) {
        if (this.f75006d == null) {
            this.f75006d = new SparseArray();
        }
        View view = (View) this.f75006d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75006d.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo57295a() {
        SparseArray sparseArray = this.f75006d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57295a();
    }

    /* renamed from: com.ss.android.ugc.aweme.aa$a */
    public static final class C31295a {
        static {
            Covode.recordClassIndex(37994);
        }

        private C31295a() {
        }

        public /* synthetic */ C31295a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m65469a(EnumC31359ab abVar) {
            C89219l.m154721d(abVar, "");
            C31294aa.f75003b = abVar;
        }
    }

    static {
        Covode.recordClassIndex(37993);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (!(activity instanceof AbstractC34884bl)) {
                activity = null;
            }
            this.f75005a = (AbstractC34884bl) activity;
        }
    }
}
