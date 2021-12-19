package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71166a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71167b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71168c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71182e;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.DatePicker */
public final class DatePicker extends LinearLayout {

    /* renamed from: a */
    Calendar f159422a;

    /* renamed from: b */
    public LiveCDNumberPicker f159423b;

    /* renamed from: c */
    public LiveCDNumberPicker f159424c;

    /* renamed from: d */
    public LiveCDNumberPicker f159425d;

    /* renamed from: e */
    final LayoutInflater f159426e;

    /* renamed from: f */
    AbstractC71173a f159427f;

    static {
        Covode.recordClassIndex(83677);
    }

    public final int getDayOfMonth() {
        Calendar calendar = this.f159422a;
        if (calendar == null) {
            C89219l.m154710a("mCalendar");
        }
        return calendar.get(5);
    }

    public final int getYear() {
        Calendar calendar = this.f159422a;
        if (calendar == null) {
            C89219l.m154710a("mCalendar");
        }
        return calendar.get(1);
    }

    public final int getMonth() {
        Calendar calendar = this.f159422a;
        if (calendar == null) {
            C89219l.m154710a("mCalendar");
        }
        return calendar.get(2) + 1;
    }

    /* renamed from: a */
    public final C71182e mo112486a() {
        C71182e eVar;
        LiveCDNumberPicker liveCDNumberPicker = this.f159423b;
        if (liveCDNumberPicker == null) {
            C89219l.m154710a("mMonthDayPicker");
        }
        int currentPosition = liveCDNumberPicker.getCurrentPosition();
        LiveCDNumberPicker liveCDNumberPicker2 = this.f159424c;
        if (liveCDNumberPicker2 == null) {
            C89219l.m154710a("mHoursPicker");
        }
        int currentPosition2 = liveCDNumberPicker2.getCurrentPosition();
        Calendar calendar = this.f159422a;
        if (calendar == null) {
            C89219l.m154710a("mCalendar");
        }
        C89219l.m154721d(calendar, "");
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        if (currentPosition == 0) {
            if (currentPosition2 > i) {
                i2 = 0;
            }
            eVar = new C71182e(i, 23, i2, 59);
        } else if (currentPosition != 30) {
            eVar = new C71182e(0, 23, 0, 59);
        } else {
            if (currentPosition2 < i) {
                i2 = 59;
            }
            eVar = new C71182e(0, i, 0, i2);
        }
        LiveCDNumberPicker liveCDNumberPicker3 = this.f159424c;
        if (liveCDNumberPicker3 == null) {
            C89219l.m154710a("mHoursPicker");
        }
        liveCDNumberPicker3.setMinValue(eVar.f159474a);
        LiveCDNumberPicker liveCDNumberPicker4 = this.f159424c;
        if (liveCDNumberPicker4 == null) {
            C89219l.m154710a("mHoursPicker");
        }
        liveCDNumberPicker4.setMaxValue(eVar.f159475b);
        LiveCDNumberPicker liveCDNumberPicker5 = this.f159424c;
        if (liveCDNumberPicker5 == null) {
            C89219l.m154710a("mHoursPicker");
        }
        if (liveCDNumberPicker5.getCurrentPosition() < eVar.f159474a) {
            LiveCDNumberPicker liveCDNumberPicker6 = this.f159424c;
            if (liveCDNumberPicker6 == null) {
                C89219l.m154710a("mHoursPicker");
            }
            liveCDNumberPicker6.mo112495a(eVar.f159474a);
        }
        LiveCDNumberPicker liveCDNumberPicker7 = this.f159424c;
        if (liveCDNumberPicker7 == null) {
            C89219l.m154710a("mHoursPicker");
        }
        if (liveCDNumberPicker7.getCurrentPosition() > eVar.f159475b) {
            LiveCDNumberPicker liveCDNumberPicker8 = this.f159424c;
            if (liveCDNumberPicker8 == null) {
                C89219l.m154710a("mHoursPicker");
            }
            liveCDNumberPicker8.mo112495a(eVar.f159475b);
        }
        LiveCDNumberPicker liveCDNumberPicker9 = this.f159424c;
        if (liveCDNumberPicker9 == null) {
            C89219l.m154710a("mHoursPicker");
        }
        liveCDNumberPicker9.requestLayout();
        LiveCDNumberPicker liveCDNumberPicker10 = this.f159425d;
        if (liveCDNumberPicker10 == null) {
            C89219l.m154710a("mMinutesPicker");
        }
        liveCDNumberPicker10.setMinValue(eVar.f159476c);
        LiveCDNumberPicker liveCDNumberPicker11 = this.f159425d;
        if (liveCDNumberPicker11 == null) {
            C89219l.m154710a("mMinutesPicker");
        }
        liveCDNumberPicker11.setMaxValue(eVar.f159477d);
        LiveCDNumberPicker liveCDNumberPicker12 = this.f159425d;
        if (liveCDNumberPicker12 == null) {
            C89219l.m154710a("mMinutesPicker");
        }
        if (liveCDNumberPicker12.getCurrentPosition() < eVar.f159476c) {
            LiveCDNumberPicker liveCDNumberPicker13 = this.f159425d;
            if (liveCDNumberPicker13 == null) {
                C89219l.m154710a("mMinutesPicker");
            }
            liveCDNumberPicker13.mo112495a(eVar.f159476c);
        }
        LiveCDNumberPicker liveCDNumberPicker14 = this.f159425d;
        if (liveCDNumberPicker14 == null) {
            C89219l.m154710a("mMinutesPicker");
        }
        if (liveCDNumberPicker14.getCurrentPosition() > eVar.f159477d) {
            LiveCDNumberPicker liveCDNumberPicker15 = this.f159425d;
            if (liveCDNumberPicker15 == null) {
                C89219l.m154710a("mMinutesPicker");
            }
            liveCDNumberPicker15.mo112495a(eVar.f159477d);
        }
        LiveCDNumberPicker liveCDNumberPicker16 = this.f159425d;
        if (liveCDNumberPicker16 == null) {
            C89219l.m154710a("mMinutesPicker");
        }
        liveCDNumberPicker16.requestLayout();
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.DatePicker$a */
    public static final class C71171a implements AbstractC71181f {

        /* renamed from: a */
        final /* synthetic */ DatePicker f159428a;

        static {
            Covode.recordClassIndex(83678);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71171a(DatePicker datePicker) {
            this.f159428a = datePicker;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.AbstractC71181f
        /* renamed from: a */
        public final void mo112493a(LiveCDNumberPicker liveCDNumberPicker, String str, String str2) {
            C71167b bVar;
            C89219l.m154721d(liveCDNumberPicker, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f159428a.mo112486a();
            DatePicker datePicker = this.f159428a;
            LiveCDNumberPicker liveCDNumberPicker2 = datePicker.f159423b;
            if (liveCDNumberPicker2 == null) {
                C89219l.m154710a("mMonthDayPicker");
            }
            int currentPosition = liveCDNumberPicker2.getCurrentPosition();
            LiveCDNumberPicker liveCDNumberPicker3 = this.f159428a.f159424c;
            if (liveCDNumberPicker3 == null) {
                C89219l.m154710a("mHoursPicker");
            }
            int currentPosition2 = liveCDNumberPicker3.getCurrentPosition();
            LiveCDNumberPicker liveCDNumberPicker4 = this.f159428a.f159425d;
            if (liveCDNumberPicker4 == null) {
                C89219l.m154710a("mMinutesPicker");
            }
            int currentPosition3 = liveCDNumberPicker4.getCurrentPosition();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(System.currentTimeMillis());
            C89219l.m154721d(gregorianCalendar, "");
            float f = (((((((float) currentPosition) * 24.0f) * 60.0f) * 60.0f) + ((((float) currentPosition2) * 60.0f) * 60.0f)) + (((float) currentPosition3) * 60.0f)) - ((((((float) gregorianCalendar.get(11)) * 60.0f) * 60.0f) + (((float) gregorianCalendar.get(12)) * 60.0f)) + ((float) gregorianCalendar.get(13)));
            if (f > 0.0f) {
                int i = (int) (f / 86400.0f);
                float f2 = (float) ((int) (f - (((((float) i) * 24.0f) * 60.0f) * 60.0f)));
                int i2 = (int) (f2 / 3600.0f);
                float f3 = (float) ((int) (f2 - ((((float) i2) * 60.0f) * 60.0f)));
                int i3 = (int) (f3 / 60.0f);
                int i4 = (int) (f3 - (((float) i3) * 60.0f));
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                gregorianCalendar2.setTimeInMillis(gregorianCalendar.getTimeInMillis());
                gregorianCalendar2.add(5, i);
                gregorianCalendar2.add(11, i2);
                gregorianCalendar2.add(12, i3);
                gregorianCalendar2.add(13, i4);
                bVar = new C71167b(String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(i4), C71168c.m125749a(gregorianCalendar2.getTimeInMillis()));
            } else {
                bVar = new C71167b("0", "0", "0", "0", C71168c.m125749a(gregorianCalendar.getTimeInMillis()));
            }
            AbstractC71173a aVar = datePicker.f159427f;
            if (aVar != null) {
                aVar.mo112522a(bVar.f159414a, bVar.f159415b, bVar.f159416c, bVar.f159417d, bVar.f159418e);
            }
        }
    }

    public final void setDateChangedListener(AbstractC71173a aVar) {
        C89219l.m154721d(aVar, "");
        this.f159427f = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo112487a(LiveCDNumberPicker liveCDNumberPicker) {
        liveCDNumberPicker.setOnValueChangedListener(new C71171a(this));
    }

    public final void setSelectTimeMiles(long j) {
        Calendar calendar = this.f159422a;
        if (calendar == null) {
            C89219l.m154710a("mCalendar");
        }
        long timeInMillis = j - calendar.getTimeInMillis();
        Calendar calendar2 = this.f159422a;
        if (calendar2 == null) {
            C89219l.m154710a("mCalendar");
        }
        C89219l.m154721d(calendar2, "");
        float f = (float) timeInMillis;
        int i = (int) (f / 8.64E7f);
        float f2 = (float) ((int) (f - (((float) i) * 8.64E7f)));
        int i2 = (int) (f2 / 3600000.0f);
        int i3 = calendar2.get(12);
        float f3 = (float) (i3 + ((int) (((float) ((int) (f2 - (((float) i2) * 3600000.0f)))) / 60000.0f)));
        float f4 = (float) (((int) (f3 / 60.0f)) + i2 + calendar2.get(11));
        int i4 = (int) (f4 % 24.0f);
        C71166a aVar = new C71166a(i + ((int) (f4 / 24.0f)), i4, (int) (f3 % 60.0f));
        LiveCDNumberPicker liveCDNumberPicker = this.f159423b;
        if (liveCDNumberPicker == null) {
            C89219l.m154710a("mMonthDayPicker");
        }
        liveCDNumberPicker.mo112495a(aVar.f159411a);
        LiveCDNumberPicker liveCDNumberPicker2 = this.f159424c;
        if (liveCDNumberPicker2 == null) {
            C89219l.m154710a("mHoursPicker");
        }
        liveCDNumberPicker2.mo112495a(aVar.f159412b);
        LiveCDNumberPicker liveCDNumberPicker3 = this.f159425d;
        if (liveCDNumberPicker3 == null) {
            C89219l.m154710a("mMinutesPicker");
        }
        liveCDNumberPicker3.mo112495a(aVar.f159413c);
        mo112486a();
    }

    /* renamed from: a */
    static void m125754a(int i, LiveCDNumberPicker liveCDNumberPicker) {
        liveCDNumberPicker.setMinValue(0);
        liveCDNumberPicker.setMaxValue(i);
        liveCDNumberPicker.setPickerItemCount(5);
        liveCDNumberPicker.setWrapSelectorWheel(false);
        liveCDNumberPicker.setSelectedTextColor(R.color.a2);
        liveCDNumberPicker.setUnselectedTextColor(R.color.bk);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12957);
        Object a = m125753a(context, "layout_inflater");
        if (a != null) {
            this.f159426e = (LayoutInflater) a;
            MethodCollector.m26664o(12957);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.m26664o(12957);
        throw nullPointerException;
    }

    /* renamed from: a */
    private static Object m125753a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13046);
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
                    MethodCollector.m26664o(13046);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
