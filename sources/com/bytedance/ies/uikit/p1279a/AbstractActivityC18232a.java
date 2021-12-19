package com.bytedance.ies.uikit.p1279a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.p051h.p052a.C0998a;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.C18236d;
import com.bytedance.ies.uikit.p1280b.C18244b;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.bytedance.ies.uikit.p1283e.C18271b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.bytedance.ies.uikit.a.a */
public abstract class AbstractActivityC18232a extends ActivityC0218d {

    /* renamed from: c */
    private static volatile int f43425c;

    /* renamed from: e */
    private static Set<String> f43426e = new HashSet();

    /* renamed from: f */
    private static C13605d<AbstractActivityC18232a> f43427f = new C13605d<>();

    /* renamed from: k */
    public static int f43428k = 0;

    /* renamed from: a */
    private C13605d<AbstractC18241e> f43429a = new C13605d<>();

    /* renamed from: b */
    private BroadcastReceiver f43430b;

    /* renamed from: d */
    private String f43431d;

    /* renamed from: g */
    private boolean f43432g;

    /* renamed from: i */
    protected boolean f43433i;

    /* renamed from: j */
    public boolean f43434j;

    /* renamed from: t */
    public final boolean mo29093t() {
        return this.f43433i;
    }

    /* renamed from: u */
    public final boolean mo29094u() {
        if (!this.f43434j) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private int mo26871g() {
        return getResources().getColor(R.color.f0);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        super.onStart();
        f43428k++;
    }

    static {
        Covode.recordClassIndex(20891);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo26878n() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(mo26871g());
            return;
        }
        int i = Build.VERSION.SDK_INT;
        C18247a.m33947a(this, mo26871g());
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        super.onPause();
        this.f43433i = false;
        C18236d.AbstractC18237a a = C18236d.m33937a();
        if (a != null) {
            a.mo29098b(this);
        }
        if (!this.f43429a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f43429a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        super.onResume();
        this.f43433i = true;
        C18236d.AbstractC18237a a = C18236d.m33937a();
        if (a != null) {
            a.mo29097a(this);
        }
        if (!this.f43429a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f43429a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        super.onStop();
        f43428k--;
        this.f43433i = false;
        if (!this.f43429a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f43429a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C0998a.m3454a(this).mo3692a(this.f43430b);
        super.onDestroy();
        this.f43434j = true;
        if (!this.f43429a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f43429a.iterator();
            while (it.hasNext()) {
                AbstractC18241e next = it.next();
                if (next != null) {
                    next.mo29100a();
                }
            }
            this.f43429a.f33081a.clear();
        }
        try {
            f43426e.remove(this.f43431d);
        } catch (Throwable unused) {
        }
        Logger.debug();
    }

    @Override // androidx.appcompat.app.ActivityC0218d
    public void onSupportContentChanged() {
        View findViewById;
        super.onSupportContentChanged();
        if (!this.f43432g && (findViewById = findViewById(R.id.c0)) != null) {
            ViewParent parent = findViewById.getParent();
            if (FrameLayout.class.isInstance(parent)) {
                View findViewById2 = findViewById(16908290);
                if (FrameLayout.class.isInstance(findViewById2)) {
                    FrameLayout frameLayout = (FrameLayout) findViewById2;
                    if (frameLayout.getChildCount() == 1) {
                        View childAt = frameLayout.getChildAt(0);
                        frameLayout.removeAllViews();
                        FrameLayout frameLayout2 = (FrameLayout) parent;
                        frameLayout2.addView(childAt);
                        findViewById2.setId(-1);
                        frameLayout2.setId(16908290);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setContentView(View view) {
        if (C18271b.f43613a) {
            m33932a(view);
        } else {
            super.setContentView(view);
        }
        mo26878n();
    }

    /* renamed from: a */
    private void m33932a(View view) {
        C18244b bVar = new C18244b(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        bVar.setPadding(0, 0, 0, 0);
        bVar.setLayoutParams(layoutParams);
        super.setContentView(bVar, new ViewGroup.LayoutParams(-1, -1));
        bVar.addView(view, -1, -1);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
            this.f43431d = bundle.getString("abs_Activity_Key");
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putString("abs_Activity_Key", this.f43431d);
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
    }

    @Override // androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setContentView(int i) {
        if (C18271b.f43613a) {
            try {
                m33932a(LayoutInflater.from(this).inflate(i, (ViewGroup) null));
            } catch (InflateException unused) {
            }
            mo26878n();
        }
        super.setContentView(i);
        mo26878n();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || !bundle.containsKey("abs_Activity_Key")) {
            StringBuilder append = new StringBuilder().append(getClass().getCanonicalName()).append("@");
            int i = f43425c;
            f43425c = i + 1;
            this.f43431d = append.append(i).toString();
        } else {
            this.f43431d = bundle.getString("abs_Activity_Key");
        }
        this.f43430b = new BroadcastReceiver() {
            /* class com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a.C182331 */

            static {
                Covode.recordClassIndex(20892);
            }

            public final void onReceive(Context context, Intent intent) {
                if (!AbstractActivityC18232a.this.isFinishing()) {
                    AbstractActivityC18232a.this.finish();
                }
            }
        };
        C0998a.m3454a(this).mo3693a(this.f43430b, new IntentFilter("com.ss.android.common.app.action.exit_app"));
        try {
            f43427f.mo21864a(this);
            f43426e.add(this.f43431d);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        C18236d.AbstractC18238b bVar = C18236d.f43455c;
        if (bVar == null || !bVar.mo29099a()) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
