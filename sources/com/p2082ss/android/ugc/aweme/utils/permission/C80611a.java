package com.p2082ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.C0569a;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.permission.PermissionViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.a */
public final class C80611a {

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.a$a */
    public interface AbstractC80613a {
        static {
            Covode.recordClassIndex(93887);
        }

        /* renamed from: a */
        void mo79924a();

        /* renamed from: b */
        void mo79925b();
    }

    static {
        Covode.recordClassIndex(93885);
    }

    /* renamed from: a */
    public static boolean m139768a(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m139769b(Context context, String[] strArr) {
        List<String> a = m139765a(context, strArr);
        if (a == null || a.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<String> m139765a(Context context, String... strArr) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (C0643b.m2367a(context, str) == -1) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m139766a(Activity activity, int i, int[] iArr) {
        PermissionViewModel.C80610a aVar = ((PermissionViewModel) C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(PermissionViewModel.class)).f180258a;
        if (aVar != null && aVar.f180260b != -1 && i == aVar.f180260b && aVar.f180259a != null) {
            if (m139768a(iArr)) {
                aVar.f180259a.mo79924a();
            } else {
                aVar.f180259a.mo79925b();
            }
        }
    }

    /* renamed from: a */
    public static void m139767a(Activity activity, String[] strArr, AbstractC80613a aVar) {
        if (activity != null) {
            PermissionViewModel.C80610a aVar2 = new PermissionViewModel.C80610a();
            aVar2.f180259a = aVar;
            aVar2.f180260b = 1001;
            ((PermissionViewModel) C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(PermissionViewModel.class)).f180258a = aVar2;
            List<String> a = m139765a(activity, strArr);
            if (a == null || a.isEmpty()) {
                aVar.mo79924a();
            } else {
                C0569a.m2182a(activity, (String[]) a.toArray(new String[a.size()]), 1001);
            }
        }
    }
}
