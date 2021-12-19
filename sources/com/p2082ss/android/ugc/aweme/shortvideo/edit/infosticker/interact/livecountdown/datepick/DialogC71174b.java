package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogC0240h;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b */
public final class DialogC71174b extends DialogC0240h {

    /* renamed from: a */
    public AbstractC71175a f159462a;

    /* renamed from: b */
    public long f159463b;

    /* renamed from: c */
    public final long f159464c;

    /* renamed from: d */
    private final AbstractC89244h f159465d = C89250i.m154773a((AbstractC89171a) new C71176b(this));

    /* renamed from: e */
    private View f159466e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b$a */
    public interface AbstractC71175a {
        static {
            Covode.recordClassIndex(83683);
        }

        /* renamed from: a */
        void mo112524a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(83682);
    }

    /* renamed from: b */
    public final DatePicker mo9590b() {
        return (DatePicker) this.f159465d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b$b */
    static final class C71176b extends AbstractC89220m implements AbstractC89171a<DatePicker> {

        /* renamed from: a */
        final /* synthetic */ DialogC71174b f159467a;

        static {
            Covode.recordClassIndex(83684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71176b(DialogC71174b bVar) {
            super(0);
            this.f159467a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DatePicker invoke() {
            return this.f159467a.findViewById(R.id.ahl);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r1 >= ((float) r0.getHeight())) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            int r0 = r5.getAction()
            r3 = 1
            if (r0 != r3) goto L_0x004f
            float r0 = r5.getX()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
            float r0 = r5.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
            float r1 = r5.getX()
            android.view.View r0 = r4.f159466e
            java.lang.String r2 = "content"
            if (r0 != 0) goto L_0x002a
            p4600h.p4611f.p4613b.C89219l.m154710a(r2)
        L_0x002a:
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            float r1 = r5.getY()
            android.view.View r0 = r4.f159466e
            if (r0 != 0) goto L_0x003e
            p4600h.p4611f.p4613b.C89219l.m154710a(r2)
        L_0x003e:
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
        L_0x0047:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.b$a r0 = r4.f159462a
            if (r0 == 0) goto L_0x004e
            r0.mo112524a(r5)
        L_0x004e:
            return r3
        L_0x004f:
            boolean r0 = super.dispatchTouchEvent(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.DialogC71174b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ez);
        View findViewById = findViewById(R.id.dnb);
        if (findViewById == null) {
            C89219l.m154715b();
        }
        this.f159466e = findViewById;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        if (this.f159463b == 0) {
            this.f159463b = System.currentTimeMillis();
        }
        DatePicker b = mo9590b();
        if (b != null) {
            long j = this.f159464c;
            C1764a.m5927a(b.f159426e, R.layout.ey, b, true);
            if (C78099c.m136517a(b.getContext())) {
                View findViewById2 = b.findViewById(R.id.cdz);
                C89219l.m154716b(findViewById2, "");
                findViewById2.setVisibility(8);
                View findViewById3 = b.findViewById(R.id.ce0);
                C89219l.m154716b(findViewById3, "");
                findViewById3.setVisibility(0);
                View findViewById4 = b.findViewById(R.id.cla);
                Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b.f159423b = (LiveCDNumberPicker) findViewById4;
                View findViewById5 = b.findViewById(R.id.bg1);
                Objects.requireNonNull(findViewById5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b.f159424c = (LiveCDNumberPicker) findViewById5;
                View findViewById6 = b.findViewById(R.id.ckd);
                Objects.requireNonNull(findViewById6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b.f159425d = (LiveCDNumberPicker) findViewById6;
            } else {
                View findViewById7 = b.findViewById(R.id.cdz);
                C89219l.m154716b(findViewById7, "");
                findViewById7.setVisibility(0);
                View findViewById8 = b.findViewById(R.id.ce0);
                C89219l.m154716b(findViewById8, "");
                findViewById8.setVisibility(8);
                View findViewById9 = b.findViewById(R.id.cl_);
                Objects.requireNonNull(findViewById9, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b.f159423b = (LiveCDNumberPicker) findViewById9;
                View findViewById10 = b.findViewById(R.id.bg0);
                Objects.requireNonNull(findViewById10, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b.f159424c = (LiveCDNumberPicker) findViewById10;
                View findViewById11 = b.findViewById(R.id.ckc);
                Objects.requireNonNull(findViewById11, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker");
                b.f159425d = (LiveCDNumberPicker) findViewById11;
            }
            b.f159422a = new GregorianCalendar();
            Calendar calendar = b.f159422a;
            if (calendar == null) {
                C89219l.m154710a("mCalendar");
            }
            calendar.setTimeInMillis(j);
            LiveCDNumberPicker liveCDNumberPicker = b.f159423b;
            if (liveCDNumberPicker == null) {
                C89219l.m154710a("mMonthDayPicker");
            }
            Context context = b.getContext();
            C89219l.m154716b(context, "");
            Calendar calendar2 = b.f159422a;
            if (calendar2 == null) {
                C89219l.m154710a("mCalendar");
            }
            C71179e eVar = new C71179e(context, calendar2);
            liveCDNumberPicker.f159439c = eVar;
            if (liveCDNumberPicker.f159439c == null) {
                liveCDNumberPicker.mo112494a();
                liveCDNumberPicker.invalidate();
            } else {
                liveCDNumberPicker.f159437a = eVar.mo112528b();
                liveCDNumberPicker.f159438b = eVar.mo112526a();
                liveCDNumberPicker.mo112494a();
                liveCDNumberPicker.invalidate();
                AbstractC71178d dVar = liveCDNumberPicker.f159439c;
                if (dVar != null) {
                    dVar.f159469a = liveCDNumberPicker;
                }
            }
            LiveCDNumberPicker liveCDNumberPicker2 = b.f159423b;
            if (liveCDNumberPicker2 == null) {
                C89219l.m154710a("mMonthDayPicker");
            }
            liveCDNumberPicker2.setTextAlign(Paint.Align.CENTER);
            LiveCDNumberPicker liveCDNumberPicker3 = b.f159423b;
            if (liveCDNumberPicker3 == null) {
                C89219l.m154710a("mMonthDayPicker");
            }
            Context context2 = b.getContext();
            C89219l.m154716b(context2, "");
            liveCDNumberPicker3.setMaxWidth((int) ((((float) C84912r.m145931a(b.getContext())) / 2.0f) - C84912r.m145930a(context2, 80.0f)));
            LiveCDNumberPicker liveCDNumberPicker4 = b.f159424c;
            if (liveCDNumberPicker4 == null) {
                C89219l.m154710a("mHoursPicker");
            }
            liveCDNumberPicker4.setTextAlign(Paint.Align.LEFT);
            LiveCDNumberPicker liveCDNumberPicker5 = b.f159425d;
            if (liveCDNumberPicker5 == null) {
                C89219l.m154710a("mMinutesPicker");
            }
            liveCDNumberPicker5.setTextAlign(Paint.Align.LEFT);
            LiveCDNumberPicker liveCDNumberPicker6 = b.f159423b;
            if (liveCDNumberPicker6 == null) {
                C89219l.m154710a("mMonthDayPicker");
            }
            DatePicker.m125754a(30, liveCDNumberPicker6);
            LiveCDNumberPicker liveCDNumberPicker7 = b.f159424c;
            if (liveCDNumberPicker7 == null) {
                C89219l.m154710a("mHoursPicker");
            }
            DatePicker.m125754a(23, liveCDNumberPicker7);
            LiveCDNumberPicker liveCDNumberPicker8 = b.f159425d;
            if (liveCDNumberPicker8 == null) {
                C89219l.m154710a("mMinutesPicker");
            }
            DatePicker.m125754a(59, liveCDNumberPicker8);
            LiveCDNumberPicker liveCDNumberPicker9 = b.f159423b;
            if (liveCDNumberPicker9 == null) {
                C89219l.m154710a("mMonthDayPicker");
            }
            b.mo112487a(liveCDNumberPicker9);
            LiveCDNumberPicker liveCDNumberPicker10 = b.f159424c;
            if (liveCDNumberPicker10 == null) {
                C89219l.m154710a("mHoursPicker");
            }
            b.mo112487a(liveCDNumberPicker10);
            LiveCDNumberPicker liveCDNumberPicker11 = b.f159425d;
            if (liveCDNumberPicker11 == null) {
                C89219l.m154710a("mMinutesPicker");
            }
            b.mo112487a(liveCDNumberPicker11);
        }
        DatePicker b2 = mo9590b();
        if (b2 != null) {
            b2.setSelectTimeMiles(this.f159463b);
        }
    }

    public DialogC71174b(Context context, long j) {
        super(context, R.style.f5);
        this.f159464c = j;
    }
}
