package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3868d;

import android.app.Activity;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72903c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72920a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a */
public final class View$OnTouchListenerC72900a implements View.OnTouchListener, WeakHandler.IHandler {

    /* renamed from: a */
    public float f163571a;

    /* renamed from: b */
    public float f163572b;

    /* renamed from: c */
    public int f163573c;

    /* renamed from: d */
    public int f163574d;

    /* renamed from: e */
    public int f163575e;

    /* renamed from: f */
    public int f163576f;

    /* renamed from: g */
    public boolean f163577g;

    /* renamed from: h */
    public boolean f163578h;

    /* renamed from: i */
    public boolean f163579i;

    /* renamed from: j */
    public MotionEvent f163580j;

    /* renamed from: k */
    public MotionEvent f163581k;

    /* renamed from: l */
    public int f163582l = -1;

    /* renamed from: m */
    public WeakHandler f163583m = new WeakHandler(this);

    /* renamed from: n */
    public final Activity f163584n;

    /* renamed from: o */
    public List<C72903c> f163585o;

    /* renamed from: p */
    public C75391j f163586p;

    /* renamed from: q */
    public AbstractC72926g f163587q;

    /* renamed from: r */
    public final AbstractC72920a f163588r;

    static {
        Covode.recordClassIndex(85595);
    }

    /* renamed from: a */
    public final void mo115261a(List<C72903c> list) {
        C89219l.m154721d(list, "");
        this.f163585o = list;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Integer valueOf;
        long j;
        if (message != null && (valueOf = Integer.valueOf(message.what)) != null && valueOf.intValue() == 0) {
            AbstractC72920a aVar = this.f163588r;
            AbstractC72926g gVar = this.f163587q;
            if (gVar != null) {
                j = gVar.mo80204ay();
            } else {
                j = 0;
            }
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.MotionEvent");
            aVar.mo115307a(j, (MotionEvent) obj);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        WeakHandler weakHandler;
        Message obtainMessage;
        long j;
        long j2;
        WeakHandler weakHandler2;
        Integer num = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        }
        long j3 = 0;
        if (num != null) {
            if (num.intValue() == 0) {
                WeakHandler weakHandler3 = this.f163583m;
                if (!(weakHandler3 == null || !weakHandler3.hasMessages(0) || (weakHandler2 = this.f163583m) == null)) {
                    weakHandler2.removeMessages(0);
                }
                MotionEvent motionEvent2 = this.f163580j;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f163580j = MotionEvent.obtain(motionEvent);
                this.f163578h = true;
                this.f163577g = true;
                this.f163571a = motionEvent.getX();
                this.f163572b = motionEvent.getY();
                this.f163582l = -1;
                for (T t : this.f163585o) {
                    AbstractC72924e eVar = t.f163594d;
                    AbstractC72926g gVar = this.f163587q;
                    if (gVar != null) {
                        j2 = gVar.mo80204ay();
                    } else {
                        j2 = 0;
                    }
                    if (eVar.mo115224a(j2, t.f163594d.mo115226b(), motionEvent.getX(), motionEvent.getY())) {
                        this.f163582l = t.f163594d.mo115226b();
                        C75391j jVar = this.f163586p;
                        if (!(jVar == null || jVar.f169460o == null)) {
                            t.f163594d.mo115226b();
                        }
                        return true;
                    }
                }
                return false;
            } else if (num.intValue() == 2) {
                int x = (int) (motionEvent.getX() - this.f163571a);
                int y = (int) (motionEvent.getY() - this.f163572b);
                int i = (x * x) + (y * y);
                if (i > this.f163575e || Math.abs(x) >= this.f163574d) {
                    this.f163578h = false;
                    WeakHandler weakHandler4 = this.f163583m;
                    if (weakHandler4 != null) {
                        weakHandler4.removeMessages(0);
                    }
                }
                if (i > this.f163576f) {
                    this.f163577g = false;
                }
            } else if (num.intValue() == 1 && this.f163578h) {
                this.f163579i = false;
                MotionEvent motionEvent3 = this.f163580j;
                MotionEvent motionEvent4 = this.f163581k;
                if (!(motionEvent3 == null || motionEvent4 == null || motionEvent == null || !this.f163577g)) {
                    long eventTime = motionEvent.getEventTime() - motionEvent4.getEventTime();
                    if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                        int x2 = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                        int y2 = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                        if ((x2 * x2) + (y2 * y2) < this.f163576f) {
                            this.f163579i = true;
                            AbstractC72920a aVar = this.f163588r;
                            AbstractC72926g gVar2 = this.f163587q;
                            if (gVar2 != null) {
                                j = gVar2.mo80204ay();
                            } else {
                                j = 0;
                            }
                            aVar.mo115308b(j, this.f163580j);
                        }
                    }
                }
                if (!(this.f163579i || this.f163580j == null || motionEvent == null || !this.f163578h || (weakHandler = this.f163583m) == null || (obtainMessage = weakHandler.obtainMessage(0)) == null)) {
                    obtainMessage.obj = this.f163580j;
                    WeakHandler weakHandler5 = this.f163583m;
                    if (weakHandler5 != null) {
                        long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                        MotionEvent motionEvent5 = this.f163580j;
                        if (motionEvent5 != null) {
                            j3 = motionEvent5.getEventTime();
                        }
                        weakHandler5.sendMessageDelayed(obtainMessage, doubleTapTimeout + j3);
                    }
                }
                MotionEvent motionEvent6 = this.f163581k;
                if (motionEvent6 != null) {
                    motionEvent6.recycle();
                }
                this.f163581k = MotionEvent.obtain(motionEvent);
            }
        }
        return false;
    }

    public View$OnTouchListenerC72900a(Activity activity, List<C72903c> list, C75391j jVar, AbstractC72926g gVar, AbstractC72920a aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar, "");
        this.f163584n = activity;
        this.f163585o = list;
        this.f163586p = jVar;
        this.f163587q = gVar;
        this.f163588r = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(activity);
        C89219l.m154716b(viewConfiguration, "");
        this.f163573c = viewConfiguration.getScaledDoubleTapSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(activity);
        C89219l.m154716b(viewConfiguration2, "");
        int scaledTouchSlop = viewConfiguration2.getScaledTouchSlop() * 3;
        this.f163574d = scaledTouchSlop;
        this.f163575e = scaledTouchSlop * scaledTouchSlop;
        int i = this.f163573c;
        this.f163576f = i * i;
    }
}
