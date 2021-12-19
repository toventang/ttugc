package com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.a */
public final class C38972a {

    /* renamed from: j */
    public static final C38973a f92055j = new C38973a((byte) 0);

    /* renamed from: a */
    public int f92056a;

    /* renamed from: b */
    public int f92057b;

    /* renamed from: c */
    public int f92058c;

    /* renamed from: d */
    public int f92059d;

    /* renamed from: e */
    public boolean f92060e;

    /* renamed from: f */
    public int f92061f;

    /* renamed from: g */
    public final Context f92062g;

    /* renamed from: h */
    public final CommonPopUpWebBottomSheetContainer f92063h;

    /* renamed from: i */
    public int f92064i;

    static {
        Covode.recordClassIndex(46563);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.a$a */
    public static final class C38973a {
        static {
            Covode.recordClassIndex(46564);
        }

        private C38973a() {
        }

        public /* synthetic */ C38973a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo67687a(int i) {
        this.f92056a = 0;
        this.f92057b = 0;
        this.f92060e = false;
        this.f92064i = i;
        if (i == 2) {
            this.f92056a = C34723i.m70924a(this.f92062g) - C34723i.m70927b();
        } else if (i == 3) {
            double a = (double) C34723i.m70924a(this.f92062g);
            Double.isNaN(a);
            this.f92056a = (int) (a * 0.7316341829085458d);
            this.f92057b = C34723i.m70924a(this.f92062g) - C34723i.m70927b();
        }
    }

    /* renamed from: a */
    public final void mo67688a(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        int i = this.f92064i;
        if (i == 2) {
            this.f92056a = C34723i.m70924a(this.f92062g) - C34723i.m70927b();
        } else if (i == 3) {
            C89219l.m154721d(motionEvent, "");
            if (!this.f92060e) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f92058c = (int) motionEvent.getX();
                    this.f92059d = (int) motionEvent.getY();
                } else if (action == 1 && Math.abs(motionEvent.getX() - ((float) this.f92058c)) < 100.0f && Math.abs(motionEvent.getY() - ((float) this.f92059d)) < 100.0f) {
                    this.f92063h.mo14580a();
                    this.f92060e = true;
                }
            }
        }
    }

    private C38972a(Context context, CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(commonPopUpWebBottomSheetContainer, "");
        this.f92062g = context;
        this.f92063h = commonPopUpWebBottomSheetContainer;
        this.f92064i = 2;
        mo67687a(2);
    }

    public /* synthetic */ C38972a(Context context, CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer, byte b) {
        this(context, commonPopUpWebBottomSheetContainer);
    }
}
