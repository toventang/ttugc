package com.p2082ss.android.ugc.aweme.account.common.widget.datepicker;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker */
public class DatePicker extends LinearLayout implements NumberPicker.AbstractC31602b {

    /* renamed from: a */
    public AbstractC31600a f75562a;

    /* renamed from: b */
    private NumberPicker f75563b = ((NumberPicker) findViewById(R.id.fk0));

    /* renamed from: c */
    private NumberPicker f75564c = ((NumberPicker) findViewById(R.id.clb));

    /* renamed from: d */
    private NumberPicker f75565d = ((NumberPicker) findViewById(R.id.aho));

    /* renamed from: e */
    private LinearLayout f75566e = ((LinearLayout) findViewById(R.id.cz3));

    /* renamed from: f */
    private Calendar f75567f;

    /* renamed from: g */
    private Calendar f75568g;

    /* renamed from: h */
    private final LayoutInflater f75569h;

    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker$a */
    public interface AbstractC31600a {
        static {
            Covode.recordClassIndex(38328);
        }

        /* renamed from: a */
        void mo57429a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar, int i4);
    }

    static {
        Covode.recordClassIndex(38327);
    }

    public int getDayOfMonth() {
        return this.f75567f.get(5);
    }

    public int getYear() {
        return this.f75567f.get(1);
    }

    public int getMonth() {
        return this.f75567f.get(2) + 1;
    }

    /* renamed from: a */
    private void m65897a() {
        MethodCollector.m26663i(11722);
        String pattern = ((SimpleDateFormat) DateFormat.getDateInstance(3, new Locale(((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a(), C58071d.m104907a()))).toPattern();
        this.f75566e.removeAllViews();
        char[] a = m65898a(pattern);
        int i = 0;
        do {
            char c = a[i];
            if (c == 'M') {
                this.f75566e.addView(this.f75564c);
            } else if (c == 'd') {
                this.f75566e.addView(this.f75565d);
            } else if (c == 'y') {
                this.f75566e.addView(this.f75563b);
            }
            i++;
        } while (i < 3);
        MethodCollector.m26664o(11722);
    }

    public void setNonRecurrentForYear(boolean z) {
        this.f75563b.setNonRecurrent(z);
    }

    public void setStartYear(int i) {
        this.f75563b.mo57626a(i);
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f75563b.setSoundEffectsEnabled(z);
        this.f75564c.setSoundEffectsEnabled(z);
        this.f75565d.setSoundEffectsEnabled(z);
    }

    /* renamed from: a */
    public final DatePicker mo57617a(Date date) {
        if (this.f75567f == null) {
            this.f75567f = Calendar.getInstance();
        }
        this.f75567f.setTime(date);
        this.f75565d.mo57629b(this.f75567f.getActualMaximum(5));
        this.f75563b.mo57630c(this.f75567f.get(1));
        this.f75564c.mo57630c(this.f75567f.get(2) + 1);
        this.f75565d.mo57630c(this.f75567f.get(5));
        return this;
    }

    public void setUpperBoundDate(Calendar calendar) {
        this.f75568g = calendar;
        if (calendar != null) {
            this.f75563b.mo57629b(calendar.get(1));
            if (this.f75567f.get(1) == this.f75568g.get(1)) {
                this.f75564c.mo57629b(this.f75568g.get(2) + 1);
                if (this.f75567f.get(2) == this.f75568g.get(2)) {
                    this.f75565d.mo57629b(this.f75568g.get(5));
                }
            }
        }
    }

    /* renamed from: a */
    private static char[] m65898a(String str) {
        char[] cArr = new char[3];
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != 'd') {
                if (charAt == 'L' || charAt == 'M') {
                    if (!z2) {
                        cArr[i] = 'M';
                        i++;
                        z2 = true;
                    } else if (charAt != 'y') {
                    }
                } else if (charAt != 'y') {
                }
                if (!z3) {
                    cArr[i] = 'y';
                    i++;
                    z3 = true;
                }
            } else if (!z) {
                cArr[i] = 'd';
                i++;
                z = true;
            }
        }
        if (!z) {
            cArr[i] = 'd';
            i++;
        }
        if (!z2) {
            cArr[i] = 'M';
            i++;
        }
        if (!z3) {
            cArr[i] = 'y';
        }
        return cArr;
    }

    /* renamed from: a */
    private static Object m65896a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11560);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11560);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11558);
        LayoutInflater layoutInflater = (LayoutInflater) m65896a(context, "layout_inflater");
        this.f75569h = layoutInflater;
        C1764a.m5927a(layoutInflater, R.layout.ft, this, true);
        this.f75563b.mo57627a(this);
        this.f75564c.mo57627a(this);
        this.f75565d.mo57627a(this);
        m65897a();
        String upperCase = C58071d.m104907a().toUpperCase(Locale.US);
        if (!"CN".equals(upperCase) && !"TW".equals(upperCase)) {
            this.f75564c.mo57628a(getResources().getStringArray(R.array.a8));
        }
        Calendar instance = Calendar.getInstance();
        this.f75567f = instance;
        mo57617a(instance.getTime());
        MethodCollector.m26664o(11558);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker.AbstractC31602b
    /* renamed from: a */
    public final void mo57618a(NumberPicker numberPicker, int i) {
        int i2;
        if (numberPicker == this.f75563b) {
            int i3 = this.f75567f.get(5);
            int i4 = this.f75567f.get(2);
            Calendar calendar = this.f75568g;
            if (calendar == null || i != calendar.get(1)) {
                this.f75564c.mo57629b(this.f75567f.getActualMaximum(2) + 1);
            } else {
                if (i4 > this.f75568g.get(2)) {
                    i4 = this.f75568g.get(2);
                }
                this.f75564c.mo57629b(this.f75568g.get(2) + 1);
            }
            this.f75567f.set(i, i4, 1);
            int actualMaximum = this.f75567f.getActualMaximum(5);
            Calendar calendar2 = this.f75568g;
            if (calendar2 != null && i == calendar2.get(1) && i4 == this.f75568g.get(2)) {
                actualMaximum = this.f75568g.get(5);
            }
            if (i3 > actualMaximum) {
                i3 = actualMaximum;
            }
            this.f75567f.set(5, i3);
            this.f75565d.mo57629b(actualMaximum);
            i2 = 1;
        } else if (numberPicker == this.f75564c) {
            int i5 = this.f75567f.get(5);
            Calendar calendar3 = this.f75567f;
            int i6 = i - 1;
            calendar3.set(calendar3.get(1), i6, 1);
            int actualMaximum2 = this.f75567f.getActualMaximum(5);
            if (this.f75568g != null && this.f75567f.get(1) == this.f75568g.get(1) && i6 == this.f75568g.get(2)) {
                actualMaximum2 = this.f75568g.get(5);
            }
            if (i5 > actualMaximum2) {
                i5 = actualMaximum2;
            }
            this.f75567f.set(5, i5);
            this.f75565d.mo57629b(actualMaximum2);
            i2 = 2;
        } else if (numberPicker == this.f75565d) {
            this.f75567f.set(5, i);
            i2 = 3;
        } else {
            i2 = 0;
        }
        AbstractC31600a aVar = this.f75562a;
        if (aVar != null) {
            aVar.mo57429a(this, getYear(), getMonth(), getDayOfMonth(), this.f75567f, i2);
        }
    }
}
