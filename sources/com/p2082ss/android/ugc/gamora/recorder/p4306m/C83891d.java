package com.p2082ss.android.ugc.gamora.recorder.p4306m;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70629db;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.gamora.recorder.m.d */
public final class C83891d {

    /* renamed from: a */
    public static final C83891d f187263a = new C83891d();

    private C83891d() {
    }

    static {
        Covode.recordClassIndex(97782);
    }

    /* renamed from: a */
    public static final boolean m144282a() {
        if (C70629db.m124815a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m144284b() {
        if (C70629db.m124815a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m144285c() {
        if (C70629db.m124815a() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m144283a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!m144282a() && videoPublishEditModel.getOriginal() == 1 && videoPublishEditModel.mShootMode == 14) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.d$a */
    static final class C83892a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ boolean f187264a = true;

        /* renamed from: b */
        final /* synthetic */ TextView f187265b;

        /* renamed from: c */
        final /* synthetic */ int f187266c;

        /* renamed from: d */
        final /* synthetic */ int f187267d;

        static {
            Covode.recordClassIndex(97783);
        }

        C83892a(TextView textView, int i, int i2) {
            this.f187265b = textView;
            this.f187266c = i;
            this.f187267d = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z = this.f187264a;
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (!z) {
                animatedFraction = 1.0f - animatedFraction;
            }
            TextView textView = this.f187265b;
            int i = this.f187266c;
            int i2 = this.f187267d;
            float f = ((float) ((i >> 24) & 255)) / 255.0f;
            float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
            float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
            float pow3 = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
            textView.setShadowLayer(8.0f, 0.0f, 1.0f, (C89241a.m154730a((f + (((((float) ((i2 >> 24) & 255)) / 255.0f) - f) * animatedFraction)) * 255.0f) << 24) | (C89241a.m154730a(((float) Math.pow((double) (pow + ((((float) Math.pow((double) (((float) ((i2 >> 16) & 255)) / 255.0f), 2.2d)) - pow) * animatedFraction)), 0.45454545454545453d)) * 255.0f) << 16) | (C89241a.m154730a(((float) Math.pow((double) (pow2 + ((((float) Math.pow((double) (((float) ((i2 >> 8) & 255)) / 255.0f), 2.2d)) - pow2) * animatedFraction)), 0.45454545454545453d)) * 255.0f) << 8) | C89241a.m154730a(((float) Math.pow((double) (pow3 + (animatedFraction * (((float) Math.pow((double) (((float) (i2 & 255)) / 255.0f), 2.2d)) - pow3))), 0.45454545454545453d)) * 255.0f));
        }
    }

    /* renamed from: a */
    public static ObjectAnimator m144281a(TextView textView, int i, int i2) {
        C89219l.m154721d(textView, "");
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(200L);
        C89219l.m154716b(duration, "");
        duration.addUpdateListener(new C83892a(textView, i, i2));
        duration.setStartDelay(0);
        duration.start();
        return duration;
    }
}
