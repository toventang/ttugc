package com.p2082ss.android.ugc.aweme.commercialize.adsetting;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.b */
public abstract class AbstractC37603b extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: a */
    private HashMap f88891a;

    static {
        Covode.recordClassIndex(45021);
    }

    /* renamed from: a */
    public View mo65503a(int i) {
        if (this.f88891a == null) {
            this.f88891a = new HashMap();
        }
        View view = (View) this.f88891a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f88891a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo65504a() {
        HashMap hashMap = this.f88891a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo65504a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.fg);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.wy, viewGroup, false);
    }
}
