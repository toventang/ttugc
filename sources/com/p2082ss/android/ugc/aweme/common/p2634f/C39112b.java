package com.p2082ss.android.ugc.aweme.common.p2634f;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18241e;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.ss.android.ugc.aweme.common.f.b */
public class C39112b extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: a */
    private C13605d<AbstractC18241e> f92308a = new C13605d<>();

    /* renamed from: ad */
    public boolean f92309ad;

    /* renamed from: ae */
    public boolean f92310ae;

    /* renamed from: af */
    public boolean f92311af;

    static {
        Covode.recordClassIndex(46728);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f92310ae = false;
        EventBus.m156962a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.f92308a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f92308a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f92310ae = false;
        this.f92311af = true;
        if (!this.f92308a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f92308a.iterator();
            while (it.hasNext()) {
                AbstractC18241e next = it.next();
                if (next != null) {
                    next.mo29100a();
                }
            }
            this.f92308a.f33081a.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f92309ad = true;
        if (!this.f92308a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f92308a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f92309ad = false;
        if (!this.f92308a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f92308a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        EventBus.m156962a().mo145393a(this);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f92309ad = false;
        this.f92310ae = false;
        this.f92311af = false;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getFragmentManager() != null && isAdded()) {
            try {
                dismiss();
            } catch (IllegalStateException unused) {
                dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f92310ae = true;
    }
}
