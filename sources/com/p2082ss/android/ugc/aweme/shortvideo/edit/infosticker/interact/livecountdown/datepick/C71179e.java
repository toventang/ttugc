package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.e */
public final class C71179e extends AbstractC71178d {

    /* renamed from: c */
    public static final C71180a f159470c = new C71180a((byte) 0);

    /* renamed from: b */
    public final Context f159471b;

    /* renamed from: d */
    private final List<String> f159472d;

    /* renamed from: e */
    private final Calendar f159473e;

    static {
        Covode.recordClassIndex(83687);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.AbstractC71178d
    /* renamed from: a */
    public final int mo112525a(String str) {
        C89219l.m154721d(str, "");
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.e$a */
    public static final class C71180a {
        static {
            Covode.recordClassIndex(83688);
        }

        private C71180a() {
        }

        public /* synthetic */ C71180a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.AbstractC71178d
    /* renamed from: b */
    public final Integer mo112528b() {
        return 30;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.AbstractC71178d
    /* renamed from: a */
    public final Integer mo112526a() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.AbstractC71178d
    /* renamed from: a */
    public final String mo112527a(int i) {
        if (i > 30 || i < 0) {
            return "";
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.f159473e.getTimeInMillis());
        gregorianCalendar.add(5, i);
        if (this.f159473e.get(1) == gregorianCalendar.get(1) && this.f159473e.get(2) == gregorianCalendar.get(2) && this.f159473e.get(5) == gregorianCalendar.get(5)) {
            String string = this.f159471b.getResources().getString(R.string.avg);
            C89219l.m154716b(string, "");
            return string;
        }
        int i2 = gregorianCalendar.get(5);
        if (C78099c.m136517a(this.f159471b)) {
            return i2 + ' ' + this.f159472d.get(gregorianCalendar.get(2));
        }
        return this.f159472d.get(gregorianCalendar.get(2)) + ' ' + i2;
    }

    public C71179e(Context context, Calendar calendar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(calendar, "");
        this.f159471b = context;
        this.f159473e = calendar;
        this.f159472d = C89070n.m154522b(context.getResources().getString(R.string.av9), context.getResources().getString(R.string.av8), context.getResources().getString(R.string.avb), context.getResources().getString(R.string.av5), context.getResources().getString(R.string.avc), context.getResources().getString(R.string.ava), context.getResources().getString(R.string.av_), context.getResources().getString(R.string.av6), context.getResources().getString(R.string.avf), context.getResources().getString(R.string.ave), context.getResources().getString(R.string.avd), context.getResources().getString(R.string.av7));
    }
}
