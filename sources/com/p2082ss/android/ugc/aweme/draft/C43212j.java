package com.p2082ss.android.ugc.aweme.draft;

import android.text.format.DateFormat;
import com.bytedance.covode.number.Covode;
import java.util.Calendar;
import java.util.TimeZone;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.j */
public final class C43212j {

    /* renamed from: a */
    public static final C43212j f100704a = new C43212j();

    private C43212j() {
    }

    static {
        Covode.recordClassIndex(51399);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m86180a(long j, String str) {
        C89219l.m154721d(str, "");
        if (j <= 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(str));
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", instance).toString();
    }
}
