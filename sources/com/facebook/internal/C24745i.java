package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.FacebookActivity;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24786y;

/* renamed from: com.facebook.internal.i */
public final class C24745i {

    /* renamed from: com.facebook.internal.i$a */
    public interface AbstractC24746a {
        static {
            Covode.recordClassIndex(28899);
        }

        /* renamed from: a */
        Bundle mo40574a();

        /* renamed from: b */
        Bundle mo40575b();
    }

    static {
        Covode.recordClassIndex(28898);
    }

    /* renamed from: a */
    public static boolean m47380a(AbstractC24744h hVar) {
        if (m47382b(hVar).f58826b != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static C24786y.C24793f m47382b(AbstractC24744h hVar) {
        C24699ae.m47299a();
        String str = C24872m.f59041a;
        String action = hVar.getAction();
        return C24786y.m47468a(action, m47381a(str, action, hVar));
    }

    /* renamed from: a */
    public static void m47378a(C24667a aVar, C24798j jVar) {
        C24699ae.m47299a();
        C24699ae.m47306b(C24872m.f59047g, true);
        Intent intent = new Intent();
        C24699ae.m47299a();
        intent.setClass(C24872m.f59047g, FacebookActivity.class);
        intent.setAction(FacebookActivity.f56424a);
        C24786y.m47474a(intent, aVar.mo40497b().toString(), (String) null, C24786y.m47458a(), C24786y.m47467a(jVar));
        aVar.mo40496a(intent);
    }

    /* renamed from: a */
    private static int[] m47381a(String str, String str2, AbstractC24744h hVar) {
        C24768q.C24769a a = C24768q.m47423a(str, str2, hVar.name());
        if (a != null) {
            return a.f58775d;
        }
        return new int[]{hVar.getMinVersion()};
    }

    /* renamed from: a */
    public static void m47377a(C24667a aVar, AbstractC24746a aVar2, AbstractC24744h hVar) {
        Bundle b;
        C24699ae.m47299a();
        Context context = C24872m.f59047g;
        String action = hVar.getAction();
        C24786y.C24793f b2 = m47382b(hVar);
        int i = b2.f58826b;
        if (i != -1) {
            if (C24786y.m47475a(i)) {
                b = aVar2.mo40574a();
            } else {
                b = aVar2.mo40575b();
            }
            if (b == null) {
                b = new Bundle();
            }
            Intent a = C24786y.m47462a(context, aVar.mo40497b().toString(), action, b2, b);
            if (a != null) {
                aVar.mo40496a(a);
                return;
            }
            throw new C24798j("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new C24798j("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    /* renamed from: a */
    public static void m47379a(C24667a aVar, String str, Bundle bundle) {
        C24699ae.m47299a();
        C24699ae.m47306b(C24872m.f59047g, true);
        C24699ae.m47299a();
        C24699ae.m47300a(C24872m.f59047g, true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        C24786y.m47474a(intent, aVar.mo40497b().toString(), str, C24786y.m47458a(), bundle2);
        C24699ae.m47299a();
        intent.setClass(C24872m.f59047g, FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.mo40496a(intent);
    }
}
