package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a */
public final class C37975a {

    /* renamed from: j */
    public static final C37976a f89711j = new C37976a((byte) 0);

    /* renamed from: a */
    public int f89712a;

    /* renamed from: b */
    public int f89713b;

    /* renamed from: c */
    public int f89714c;

    /* renamed from: d */
    public int f89715d;

    /* renamed from: e */
    public boolean f89716e;

    /* renamed from: f */
    public int f89717f;

    /* renamed from: g */
    public final Context f89718g;

    /* renamed from: h */
    public final AdPopUpWebBottomSheetContainer f89719h;

    /* renamed from: i */
    public int f89720i;

    static {
        Covode.recordClassIndex(45435);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a$a */
    public static final class C37976a {
        static {
            Covode.recordClassIndex(45436);
        }

        private C37976a() {
        }

        public /* synthetic */ C37976a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo66196a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getWebviewType() == 1 && this.f89720i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo66197b(AwemeRawAd awemeRawAd) {
        int i;
        if (awemeRawAd != null && awemeRawAd.getProfileWithWebview() == 1 && ((i = this.f89717f) == 7 || i == 8 || this.f89720i == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo66194a(int i) {
        this.f89712a = 0;
        this.f89713b = 0;
        this.f89716e = false;
        this.f89720i = i;
        if (i == 2) {
            this.f89712a = C34723i.m70924a(this.f89718g) - C34723i.m70927b();
        } else if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    this.f89712a = (int) C13628n.m24520b(this.f89718g, 64.0f);
                    this.f89713b = C34723i.m70924a(this.f89718g) - C34723i.m70927b();
                    return;
                } else if (i != 6) {
                    return;
                }
            }
            this.f89712a = (int) C13628n.m24520b(this.f89718g, 64.0f);
            this.f89713b = C34723i.m70924a(this.f89718g) - C34723i.m70927b();
        } else {
            double a = (double) C34723i.m70924a(this.f89718g);
            Double.isNaN(a);
            this.f89712a = (int) (a * 0.7316341829085458d);
            this.f89713b = C34723i.m70924a(this.f89718g) - C34723i.m70927b();
        }
    }

    /* renamed from: a */
    public final void mo66195a(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        int i = this.f89720i;
        if (i == 2) {
            this.f89712a = C34723i.m70924a(this.f89718g) - C34723i.m70927b();
        } else if (i == 3 || i == 5) {
            C89219l.m154721d(motionEvent, "");
            if (!this.f89716e) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f89714c = (int) motionEvent.getX();
                    this.f89715d = (int) motionEvent.getY();
                } else if (action == 1 && Math.abs(motionEvent.getX() - ((float) this.f89714c)) < 100.0f && Math.abs(motionEvent.getY() - ((float) this.f89715d)) < 100.0f) {
                    this.f89719h.mo14580a();
                    this.f89716e = true;
                }
            }
        }
    }

    private C37975a(Context context, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(adPopUpWebBottomSheetContainer, "");
        this.f89718g = context;
        this.f89719h = adPopUpWebBottomSheetContainer;
        this.f89720i = 2;
        mo66194a(2);
    }

    public /* synthetic */ C37975a(Context context, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, byte b) {
        this(context, adPopUpWebBottomSheetContainer);
    }
}
