package com.bytedance.android.livesdk.userinfowidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.AbstractC9170d;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public class UserInfoLikeHelper implements AbstractC9170d, AbstractC33974au {

    /* renamed from: a */
    private ObjectAnimator f26561a;

    /* renamed from: b */
    private ObjectAnimator f26562b;

    /* renamed from: c */
    private int f26563c;

    /* renamed from: d */
    private int f26564d;

    /* renamed from: e */
    private ObjectAnimator f26565e;

    /* renamed from: f */
    private View f26566f;

    static {
        Covode.recordClassIndex(12640);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f26561a.cancel();
        this.f26562b.cancel();
        ObjectAnimator objectAnimator = this.f26565e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f26566f.setAlpha(1.0f);
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10821a(AbstractC9168b bVar, int i) {
        if (i >= bVar.mo15282c()) {
            if (this.f26562b.isRunning()) {
                this.f26562b.cancel();
            }
            View view = this.f26566f;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.5f, view.getAlpha()), Keyframe.ofFloat(1.0f, 1.0f)));
            this.f26565e = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setStartDelay(200);
            this.f26565e.setDuration(200L);
            this.f26565e.start();
        }
    }

    public UserInfoLikeHelper(AbstractC1204m mVar, final ImageView imageView, TextView textView) {
        mVar.getLifecycle().mo4012a(this);
        this.f26566f = textView;
        textView.setAlpha(1.0f);
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (!(room == null || room.getOwner() == null)) {
            C6203g.m13462a(new RunnableC11050z(imageView, room));
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.5f), Keyframe.ofFloat(0.5f, 0.5f), Keyframe.ofFloat(1.0f, 0.0f)));
        this.f26561a = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(1000L);
        this.f26561a.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f26561a.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.userinfowidget.UserInfoLikeHelper.C110231 */

            static {
                Covode.recordClassIndex(12641);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                imageView.setScaleX(0.0f);
                imageView.setScaleY(0.0f);
                imageView.setAlpha(0.5f);
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
        this.f26562b = ofFloat;
        ofFloat.setDuration(200L);
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10822a(AbstractC9168b bVar, int i, int i2, float f, float f2, float f3, float f4) {
        if (i2 >= bVar.mo15284d()) {
            if (this.f26564d != i) {
                this.f26564d = i;
                if (this.f26562b.isRunning()) {
                    this.f26562b.cancel();
                    this.f26566f.setAlpha(0.0f);
                }
            }
        } else if (i2 >= bVar.mo15282c()) {
            if (this.f26563c != i) {
                this.f26563c = i;
                this.f26562b.start();
            }
        } else if (!this.f26561a.isRunning()) {
            this.f26561a.start();
        }
    }
}
