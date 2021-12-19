package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50550r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.f */
public final class C50537f extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: e */
    public static final C50538a f116804e = new C50538a((byte) 0);

    /* renamed from: a */
    public int f116805a;

    /* renamed from: b */
    public int f116806b = C34723i.m70930c(this.f116808d);

    /* renamed from: c */
    public C50550r.AbstractC50552a f116807c;

    /* renamed from: d */
    public Context f116808d;

    static {
        Covode.recordClassIndex(59684);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.x.f$a */
    public static final class C50538a {
        static {
            Covode.recordClassIndex(59685);
        }

        private C50538a() {
        }

        public /* synthetic */ C50538a(byte b) {
            this();
        }
    }

    public C50537f(C50550r.AbstractC50552a aVar, Context context) {
        C89219l.m154721d(context, "");
        this.f116807c = aVar;
        this.f116808d = context;
        this.f116805a = C34723i.m70933f(context) - (C34723i.m70932e(this.f116808d) * 2);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        float y = motionEvent2.getY() - motionEvent.getY();
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(x) > Math.abs(y)) {
            if (Math.abs(x) <= 100.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            if (x > 0.0f) {
                C50550r.AbstractC50552a aVar = this.f116807c;
                if (aVar == null) {
                    return false;
                }
                aVar.mo84858a(4);
                return false;
            }
            C50550r.AbstractC50552a aVar2 = this.f116807c;
            if (aVar2 == null) {
                return false;
            }
            aVar2.mo84858a(3);
            return false;
        } else if (Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f) {
            return false;
        } else {
            if (y > 0.0f) {
                C50550r.AbstractC50552a aVar3 = this.f116807c;
                if (aVar3 == null) {
                    return false;
                }
                aVar3.mo84858a(2);
                return false;
            }
            C50550r.AbstractC50552a aVar4 = this.f116807c;
            if (aVar4 == null) {
                return false;
            }
            aVar4.mo84858a(1);
            return false;
        }
    }
}
