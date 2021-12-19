package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Iterator;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.az */
public final class C73974az {

    /* renamed from: a */
    public static final C73974az f166067a = new C73974az();

    private C73974az() {
    }

    static {
        Covode.recordClassIndex(86724);
    }

    /* renamed from: a */
    public static final boolean m130104a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        try {
            Reflect.m24529on(eVar.getSupportFragmentManager()).call("dispatchCreate");
            return true;
        } catch (Exception e) {
            C73991bj.m130128a("tryRedispatchActivityCreate failed, reason: " + Log.getStackTraceString(e));
            return false;
        }
    }

    /* renamed from: a */
    private static Object m130102a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m130103a(Bundle bundle, Exception exc) {
        String message;
        Class<?> cls;
        Class<?> cls2;
        C89219l.m154721d(exc, "");
        if (!SettingsManager.m29616a().mo25400a("studio_fix_publish_page_state_restore_crash", true) || bundle == null || !(exc instanceof RuntimeException) || (message = exc.getMessage()) == null || !C89361p.m154908a((CharSequence) message, (CharSequence) "Unmarshalling unknown type code", false)) {
            return false;
        }
        try {
            Set<String> keySet = bundle.keySet();
            C89219l.m154716b(keySet, "");
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                Object a = m130102a(bundle, (String) it.next());
                String str = null;
                if (!C89219l.m154714a((Object) ((a == null || (cls2 = a.getClass()) == null) ? null : cls2.getName()), (Object) "androidx.fragment.app.FragmentManagerState")) {
                    if (!(a == null || (cls = a.getClass()) == null)) {
                        str = cls.getName();
                    }
                    if (!C89219l.m154714a((Object) str, (Object) "android.app.FragmentManagerState")) {
                    }
                }
                Object obj = Reflect.m24529on(a).field("mActive", new Class[0]).get();
                C89219l.m154716b(obj, "");
                for (Object obj2 : (Object[]) obj) {
                    Bundle bundle2 = (Bundle) Reflect.m24529on(obj2).field("mSavedFragmentState", new Class[0]).get();
                    if (bundle2 != null) {
                        bundle2.remove("android:view_state");
                    }
                }
            }
            return true;
        } catch (Exception e) {
            C73991bj.m130128a("tryFixViewStateRestoreCrash failed, reason: " + Log.getStackTraceString(e));
            return false;
        }
    }
}
