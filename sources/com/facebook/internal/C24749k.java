package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.internal.DialogC24700af;

/* renamed from: com.facebook.internal.k */
public final class C24749k extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: a */
    public Dialog f58723a;

    static {
        Covode.recordClassIndex(28902);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f58723a;
        if (dialog instanceof DialogC24700af) {
            ((DialogC24700af) dialog).mo40518a();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f58723a == null) {
            mo40584a(null, null);
            this.mShowsDialog = false;
        }
        return this.f58723a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f58723a instanceof DialogC24700af) && isResumed()) {
            ((DialogC24700af) this.f58723a).mo40518a();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        DialogC24700af afVar;
        super.onCreate(bundle);
        if (this.f58723a == null) {
            ActivityC0945e activity = getActivity();
            Bundle b = C24786y.m47478b(activity.getIntent());
            if (!b.getBoolean("is_fallback", false)) {
                String string = b.getString("action");
                Bundle bundle2 = b.getBundle("params");
                if (C24693ad.m47261a(string)) {
                    activity.finish();
                    return;
                }
                DialogC24700af.C24705a aVar = new DialogC24700af.C24705a(activity, string, bundle2);
                aVar.f58658d = new DialogC24700af.AbstractC24707c() {
                    /* class com.facebook.internal.C24749k.C247501 */

                    static {
                        Covode.recordClassIndex(28903);
                    }

                    @Override // com.facebook.internal.DialogC24700af.AbstractC24707c
                    /* renamed from: a */
                    public final void mo40543a(Bundle bundle, C24798j jVar) {
                        C24749k.this.mo40584a(bundle, jVar);
                    }
                };
                afVar = aVar.mo40536a();
            } else {
                String string2 = b.getString("url");
                if (C24693ad.m47261a(string2)) {
                    activity.finish();
                    return;
                }
                C24699ae.m47299a();
                afVar = DialogC24757n.m47402a(activity, string2, C1764a.m5928a("fb%s://bridge/", new Object[]{C24872m.f59041a}));
                afVar.f58641c = new DialogC24700af.AbstractC24707c() {
                    /* class com.facebook.internal.C24749k.C247512 */

                    static {
                        Covode.recordClassIndex(28904);
                    }

                    @Override // com.facebook.internal.DialogC24700af.AbstractC24707c
                    /* renamed from: a */
                    public final void mo40543a(Bundle bundle, C24798j jVar) {
                        ActivityC0945e activity = C24749k.this.getActivity();
                        Intent intent = new Intent();
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        intent.putExtras(bundle);
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                };
            }
            this.f58723a = afVar;
        }
    }

    /* renamed from: a */
    public final void mo40584a(Bundle bundle, C24798j jVar) {
        int i;
        ActivityC0945e activity = getActivity();
        Intent a = C24786y.m47464a(activity.getIntent(), bundle, jVar);
        if (jVar == null) {
            i = -1;
        } else {
            i = 0;
        }
        activity.setResult(i, a);
        activity.finish();
    }
}
