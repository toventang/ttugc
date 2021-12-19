package com.bytedance.ies.xelement.picker.view;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.picker.p1384a.C19326b;
import com.bytedance.ies.xelement.picker.p1384a.C19327c;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19339c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;

/* renamed from: com.bytedance.ies.xelement.picker.view.g */
public final class C19372g {

    /* renamed from: a */
    public View f45867a;

    /* renamed from: b */
    public WheelView f45868b;

    /* renamed from: c */
    public WheelView f45869c;

    /* renamed from: d */
    public WheelView f45870d;

    /* renamed from: e */
    public Calendar f45871e = m36158a(0, 0, 0);

    /* renamed from: f */
    Calendar f45872f = m36158a(23, 59, 59);

    /* renamed from: g */
    public Calendar f45873g = m36159b(Calendar.getInstance());

    /* renamed from: h */
    public AbstractC19339c f45874h;

    /* renamed from: i */
    private int f45875i;

    /* renamed from: j */
    private boolean[] f45876j;

    static {
        Covode.recordClassIndex(22161);
    }

    /* renamed from: b */
    public static Calendar m36159b(Calendar calendar) {
        calendar.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1);
        return calendar;
    }

    /* renamed from: c */
    private static Calendar m36160c(Calendar calendar) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(calendar.getTimeInMillis());
        return instance;
    }

    /* renamed from: a */
    public final void mo30888a(Calendar calendar) {
        int i;
        int i2;
        if (calendar.getTimeInMillis() < this.f45871e.getTimeInMillis()) {
            calendar = m36160c(this.f45871e);
        } else if (calendar.getTimeInMillis() > this.f45872f.getTimeInMillis()) {
            calendar = m36160c(this.f45872f);
        }
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        int i5 = calendar.get(13);
        int i6 = this.f45871e.get(11);
        int i7 = this.f45871e.get(12);
        int i8 = this.f45871e.get(13);
        int i9 = this.f45872f.get(11);
        int i10 = this.f45872f.get(12);
        int i11 = this.f45872f.get(13);
        if (i6 == i9) {
            this.f45868b.setAdapter(new C19326b(i6, i9));
            i2 = i3 - i6;
            this.f45869c.setAdapter(new C19326b(i7, i10));
            int i12 = i4 - i7;
            if (i7 == i10) {
                this.f45870d.setAdapter(new C19326b(i8, i11));
            } else if (i4 == i7) {
                this.f45870d.setAdapter(new C19326b(i8, 59));
            } else {
                if (i4 == i10) {
                    this.f45870d.setAdapter(new C19326b(0, i11));
                } else {
                    this.f45870d.setAdapter(new C19326b(0, 59));
                }
                i4 = i12;
            }
            i5 -= i8;
            i4 = i12;
        } else {
            if (i6 < i9) {
                this.f45868b.setAdapter(new C19326b(i6, i9));
                i = i3 - i6;
            } else {
                this.f45868b.setAdapter(new C19327c(i6, i9));
                i = i3 - i6;
                if (i < 0) {
                    i += 24;
                }
            }
            if (i3 == i6) {
                this.f45869c.setAdapter(new C19326b(i7, 59));
                int i13 = i4 - i7;
                if (i4 == i7) {
                    this.f45870d.setAdapter(new C19326b(i8, 59));
                    i5 -= i8;
                } else {
                    this.f45870d.setAdapter(new C19326b(0, 59));
                }
                i4 = i13;
            } else if (i3 == i9) {
                this.f45869c.setAdapter(new C19326b(0, i10));
                if (i4 == i10) {
                    this.f45870d.setAdapter(new C19326b(0, i11));
                } else {
                    this.f45870d.setAdapter(new C19326b(0, 59));
                }
            } else {
                this.f45869c.setAdapter(new C19326b(0, 59));
                this.f45870d.setAdapter(new C19326b(0, 59));
            }
            i2 = i;
        }
        this.f45873g = calendar;
        this.f45868b.setCurrentIndex(i2);
        this.f45869c.setCurrentIndex(i4);
        this.f45870d.setCurrentIndex(i5);
    }

    /* renamed from: a */
    private static Calendar m36158a(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, i, i2, i3);
        return instance;
    }

    public C19372g(View view, boolean[] zArr, int i, int i2, AbstractC19054a aVar) {
        int i3;
        int i4;
        int i5 = 0;
        this.f45867a = view;
        this.f45875i = i2;
        this.f45868b = (WheelView) view.findViewById(R.id.bfy);
        this.f45869c = (WheelView) view.findViewById(R.id.ck6);
        this.f45870d = (WheelView) view.findViewById(R.id.dt0);
        this.f45868b.setLocalizeAdapter(aVar);
        this.f45869c.setLocalizeAdapter(aVar);
        this.f45870d.setLocalizeAdapter(aVar);
        this.f45868b.setGravity(i);
        this.f45869c.setGravity(i);
        this.f45870d.setGravity(i);
        if (zArr.length == 3) {
            this.f45876j = zArr;
            WheelView wheelView = this.f45868b;
            if (zArr[0]) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            wheelView.setVisibility(i3);
            WheelView wheelView2 = this.f45869c;
            if (zArr[1]) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            wheelView2.setVisibility(i4);
            this.f45870d.setVisibility(!zArr[2] ? 8 : i5);
            this.f45868b.setTextSize((float) this.f45875i);
            this.f45869c.setTextSize((float) this.f45875i);
            this.f45870d.setTextSize((float) this.f45875i);
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }
}
