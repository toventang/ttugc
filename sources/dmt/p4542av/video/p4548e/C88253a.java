package dmt.p4542av.video.p4548e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.e.a */
public final class C88253a {
    static {
        Covode.recordClassIndex(104288);
    }

    /* renamed from: a */
    private static final void m153363a() {
        C80322d.m139251a("tools_performance_permission", new C84425b().mo129406a("scene", "permission_request").f188764a);
    }

    /* renamed from: a */
    public static final String m153362a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 463403621) {
            if (hashCode != 1365911975) {
                if (hashCode == 1831139720 && str.equals("android.permission.RECORD_AUDIO")) {
                    return "mic";
                }
                return "";
            } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                return "storage";
            } else {
                return "";
            }
        } else if (str.equals("android.permission.CAMERA")) {
            return "camera";
        } else {
            return "";
        }
    }

    /* renamed from: a */
    public static final void m153364a(Context context) {
        boolean z;
        boolean z2;
        C89219l.m154721d(context, "");
        boolean z3 = true;
        if (C63238c.f143566D.mo73307c().mo101674c(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C63238c.f143566D.mo73307c().mo101673b(context) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C63238c.f143566D.mo73307c().mo101757a(context) != 0) {
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!z2) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!z3) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        for (String str : (String[]) array) {
            C39162r.m79460a("permission_toast_show", new C84425b().mo129406a("permission_type", m153362a(str)).mo129406a("enter_from", "video_shoot_page").f188764a);
        }
        m153363a();
    }
}
