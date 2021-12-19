package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.ScaleGestureDetector;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dc */
public final class C7889dc extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a */
    public static final C7890a f19626a = new C7890a((byte) 0);

    /* renamed from: b */
    private final boolean f19627b;

    static {
        Covode.recordClassIndex(8684);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dc$a */
    public static final class C7890a {
        static {
            Covode.recordClassIndex(8685);
        }

        private C7890a() {
        }

        public /* synthetic */ C7890a(byte b) {
            this();
        }
    }

    public C7889dc(boolean z) {
        this.f19627b = z;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (scaleGestureDetector == null) {
            return false;
        }
        if (this.f19627b && ((double) scaleGestureDetector.getScaleFactor()) > 1.2d) {
            C6779a.m14563a().mo13053a(new C11756a(2));
            C6501b.C6502a.m13948a("screen_rotate").mo12639a().mo12651a(StringSet.type, "portrait_to_landscape").mo12655b();
            return true;
        } else if (this.f19627b || ((double) scaleGestureDetector.getScaleFactor()) >= 0.8d) {
            return false;
        } else {
            C6779a.m14563a().mo13053a(new C11756a(1));
            C6501b.C6502a.m13948a("screen_rotate").mo12639a().mo12651a(StringSet.type, "landscape_to_portrait").mo12655b();
            return true;
        }
    }
}
