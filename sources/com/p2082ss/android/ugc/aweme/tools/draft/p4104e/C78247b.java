package com.p2082ss.android.ugc.aweme.tools.draft.p4104e;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.e.b */
public final class C78247b {

    /* renamed from: a */
    public static final C78247b f175746a = new C78247b();

    private C78247b() {
    }

    static {
        Covode.recordClassIndex(91362);
    }

    /* renamed from: a */
    public static final String m136733a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        return C63244g.m114602a().mo73295w().mo93763a() + simpleDateFormat.format(instance.getTime());
    }

    /* renamed from: a */
    public static final String m136734a(Context context, C43223c cVar) {
        C89219l.m154721d(cVar, "");
        long j = cVar.f100880C;
        if (context != null) {
            double d = (double) j;
            Double.isNaN(d);
            String string = context.getString(R.string.fn1, Double.valueOf(d / 1048576.0d));
            C89219l.m154716b(string, "");
            return string;
        }
        double d2 = (double) j;
        Double.isNaN(d2);
        String a = C1764a.m5928a("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1048576.0d)}, 1));
        C89219l.m154716b(a, "");
        return a;
    }
}
