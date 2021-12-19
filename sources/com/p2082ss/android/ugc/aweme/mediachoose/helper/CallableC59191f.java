package com.p2082ss.android.ugc.aweme.mediachoose.helper;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59183a;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.f */
public final /* synthetic */ class CallableC59191f implements Callable {

    /* renamed from: a */
    private final C59187c f134705a;

    /* renamed from: b */
    private final int f134706b;

    /* renamed from: c */
    private final int f134707c;

    /* renamed from: d */
    private final int f134708d;

    static {
        Covode.recordClassIndex(69550);
    }

    CallableC59191f(C59187c cVar, int i, int i2, int i3) {
        this.f134705a = cVar;
        this.f134706b = i;
        this.f134707c = i2;
        this.f134708d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<MediaModel> a;
        C59187c cVar = this.f134705a;
        int i = this.f134706b;
        int i2 = this.f134707c;
        int i3 = this.f134708d;
        C84911q.m145922a("MediaManager", "start load media " + System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        if (1 == i) {
            arrayList.addAll(C59183a.m108683a(cVar.f134694b, true, i2, i3));
        } else if (4 == i) {
            arrayList.addAll(C59183a.m108680a(cVar.f134694b, i2, i3));
        } else if (3 == i) {
            arrayList.addAll(C59183a.m108683a(cVar.f134694b, false, i2, i3));
        } else if (2 == i) {
            Context context = cVar.f134694b;
            C89219l.m154721d(context, "");
            new ArrayList();
            int i4 = Build.VERSION.SDK_INT;
            String[] strArr = null;
            C59183a.C59185b a2 = C59183a.m108679a((C59183a.C59184a) null, i3, i2);
            String str = a2.f134691c;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            String str2 = "mime_type like ?";
            if (!z) {
                String str3 = a2.f134691c;
                str2 = str3 != null ? C59186b.m108689a(str3, str2) : null;
            }
            a2.f134691c = str2;
            a2.f134692d.add("%gif%");
            if (a2.f134692d.size() > 0) {
                Object[] array = a2.f134692d.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                strArr = (String[]) array;
            }
            if (i2 == -1) {
                if (C84896h.f189732b) {
                    a = C59183a.m108682a(context, a2.f134691c, strArr, a2.f134689a, -1, -1);
                } else {
                    a = C59183a.m108681a(context, a2.f134691c, strArr, a2.f134689a);
                }
            } else if (C84896h.f189732b) {
                a = C59183a.m108682a(context, a2.f134691c, strArr, a2.f134689a, i2, i3 * i2);
            } else {
                a = C59183a.m108681a(context, a2.f134691c, strArr, a2.f134689a + a2.f134690b);
            }
            arrayList.addAll(a);
        } else if (i == 0) {
            arrayList.addAll(C59183a.m108680a(cVar.f134694b, i2, i3));
            arrayList.addAll(C59183a.m108683a(cVar.f134694b, true, i2, i3));
            Collections.sort(arrayList);
        }
        C84911q.m145922a("MediaManager", "end load media " + System.currentTimeMillis());
        return arrayList;
    }
}
