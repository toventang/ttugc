package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.live.C2907a;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* renamed from: com.bytedance.android.live.core.widget.a */
public class C4031a extends C2907a {

    /* renamed from: a */
    public boolean f11062a;

    /* renamed from: b */
    public boolean f11063b;

    /* renamed from: c */
    public boolean f11064c;

    /* renamed from: d */
    public DialogInterface.OnDismissListener f11065d;

    /* renamed from: e */
    private C13605d<Object> f11066e = new C13605d<>();

    static {
        Covode.recordClassIndex(4572);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f11063b = false;
    }

    /* renamed from: j_ */
    public String mo9425j_() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.f11066e.f33081a.isEmpty()) {
            Iterator<Object> it = this.f11066e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f11063b = false;
        this.f11064c = true;
        if (!this.f11066e.f33081a.isEmpty()) {
            Iterator<Object> it = this.f11066e.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f11066e.f33081a.clear();
        }
        C6905bf.m14776a().mo13208c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f11062a = true;
        if (!this.f11066e.f33081a.isEmpty()) {
            Iterator<Object> it = this.f11066e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f11062a = false;
        if (!this.f11066e.f33081a.isEmpty()) {
            Iterator<Object> it = this.f11066e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        try {
            dismiss();
        } catch (IllegalStateException unused) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f11065d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11062a = false;
        this.f11063b = false;
        this.f11064c = false;
        C6905bf.m14776a().mo13207b();
    }

    /* renamed from: a */
    public static void m9839a(ActivityC0945e eVar, DialogInterface$OnCancelListenerC0944d dVar) {
        m9840a(eVar, dVar, dVar.getClass().getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11063b = true;
        getDialog().setOnKeyListener(new DialogInterface$OnKeyListenerC4045b(this));
    }

    /* renamed from: a */
    private static void m9840a(ActivityC0945e eVar, DialogInterface$OnCancelListenerC0944d dVar, String str) {
        if (eVar != null && dVar != null) {
            dVar.show(eVar.getSupportFragmentManager(), str);
        }
    }
}
