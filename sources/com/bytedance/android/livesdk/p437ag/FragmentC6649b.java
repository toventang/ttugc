package com.bytedance.android.livesdk.p437ag;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.C0569a;
import androidx.p025c.C0498h;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p437ag.C6668e;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6654b;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6655c;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p437ag.p440c.C6662e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.b */
public final class FragmentC6649b extends Fragment {

    /* renamed from: a */
    C0498h<C6652a> f16543a = new C0498h<>();

    /* renamed from: b */
    C0498h<C6652a> f16544b = new C0498h<>();

    static {
        Covode.recordClassIndex(7387);
    }

    /* renamed from: a */
    private static Intent m14135a() {
        return new Intent("android.settings.APPLICATION_SETTINGS");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.ag.b$a */
    public static class C6652a {

        /* renamed from: a */
        public String[] f16549a;

        /* renamed from: b */
        public String[] f16550b = new String[0];

        /* renamed from: c */
        AbstractC6654b f16551c;

        /* renamed from: d */
        Runnable f16552d;

        /* renamed from: e */
        Runnable f16553e;

        /* renamed from: f */
        private AbstractC6656d f16554f;

        /* renamed from: g */
        private AbstractC6654b f16555g;

        static {
            Covode.recordClassIndex(7390);
        }

        /* renamed from: a */
        public final void mo12800a() {
            this.f16554f.mo11014b(this.f16549a);
            C6668e.C6669a.f16562a.mo12810b(this.f16550b);
        }

        /* renamed from: a */
        public final void mo12802a(boolean z) {
            this.f16554f.mo11013a(this.f16549a);
            C6668e.C6669a.f16562a.mo12809a(this.f16549a);
            if (z) {
                this.f16553e.run();
                C6668e.C6669a.f16562a.mo12811c(this.f16550b);
            }
        }

        /* renamed from: a */
        public final void mo12801a(Activity activity, AbstractC6655c cVar) {
            this.f16555g.mo12804a(activity, cVar, this.f16549a);
        }

        C6652a(String[] strArr, Runnable runnable, AbstractC6656d dVar, AbstractC6654b bVar, Runnable runnable2, AbstractC6654b bVar2) {
            this.f16549a = strArr;
            this.f16552d = runnable;
            this.f16553e = runnable2;
            this.f16554f = dVar;
            this.f16551c = bVar;
            this.f16555g = bVar2;
        }
    }

    /* renamed from: a */
    static Intent m14136a(Context context) {
        return C6662e.C6663a.f16559a.mo12805a(context);
    }

    /* renamed from: b */
    private static Intent m14138b(Context context) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12794a(final C6652a aVar) {
        aVar.mo12801a(getActivity(), new AbstractC6655c() {
            /* class com.bytedance.android.livesdk.p437ag.FragmentC6649b.C66512 */

            static {
                Covode.recordClassIndex(7389);
            }

            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6655c
            /* renamed from: b */
            public final void mo12799b() {
                aVar.mo12800a();
            }

            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6655c
            /* renamed from: a */
            public final void mo12798a() {
                FragmentC6649b bVar = FragmentC6649b.this;
                C6652a aVar = aVar;
                int a = (C6642a.m14122a(aVar.f16549a) & -65536) >>> 16;
                try {
                    if (FragmentC6649b.m14137a(bVar.getActivity(), FragmentC6649b.m14136a(bVar.getActivity()))) {
                        bVar.startActivityForResult(FragmentC6649b.m14136a(bVar.getActivity()), a);
                        bVar.f16544b.mo2186b(a, aVar);
                        return;
                    }
                    bVar.mo12795a(aVar, a);
                } catch (Exception unused) {
                    bVar.mo12795a(aVar, a);
                    C3854a.m9453a(6, "PermissionFragment", "go to origin setting error");
                }
            }
        });
    }

    /* renamed from: a */
    static boolean m14137a(Context context, Intent intent) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.permission;
        if (TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m14139b(C6652a aVar, int i) {
        try {
            getActivity();
            startActivityForResult(m14135a(), i);
            this.f16544b.mo2186b(i, aVar);
        } catch (Exception unused) {
            C3854a.m9453a(6, "PermissionFragment", "go to origin setting error");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12795a(C6652a aVar, int i) {
        try {
            if (m14137a(getActivity(), m14138b(getActivity()))) {
                startActivityForResult(m14138b(getActivity()), i);
                this.f16544b.mo2186b(i, aVar);
                return;
            }
            m14139b(aVar, i);
        } catch (Exception unused) {
            m14139b(aVar, i);
            C3854a.m9453a(6, "PermissionFragment", "go to app info error");
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C6652a a = this.f16544b.mo2183a(i, null);
        this.f16544b.mo2185b(i);
        if (a != null && C6667d.m14177a((Context) getActivity(), a.f16549a)) {
            a.mo12802a(true);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C3854a.m9453a(3, "PermissionFragment", "onRequestPermissionsResult: requestCode = ".concat(String.valueOf(i)));
        super.onRequestPermissionsResult(i, strArr, iArr);
        C6652a a = this.f16543a.mo2183a(i, null);
        this.f16543a.mo2185b(i);
        if (a != null) {
            Activity activity = getActivity();
            if (iArr.length != 0) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (iArr[i2] != 0) {
                            break;
                        }
                        i2++;
                    } else if (!C6662e.C6663a.f16559a.mo12806a() || C6667d.m14177a((Context) activity, strArr)) {
                        a.mo12802a(true);
                        return;
                    }
                }
            }
            Activity activity2 = getActivity();
            if (strArr != null) {
                for (String str : strArr) {
                    if (C0569a.m2183a(activity2, str)) {
                        a.mo12800a();
                        return;
                    }
                }
            }
            if (!m14137a(getActivity(), m14136a(getActivity())) && !m14137a(getActivity(), m14138b(getActivity()))) {
                Activity activity3 = getActivity();
                getActivity();
                if (!m14137a(activity3, m14135a())) {
                    C3854a.m9453a(3, "PermissionFragment", "afterPermissionRequest: AppSettingIntent is not avaliable.");
                    a.mo12800a();
                    return;
                }
            }
            a.f16550b = C6667d.m14178a(getActivity(), a.f16549a);
            mo12794a(a);
        }
    }
}
