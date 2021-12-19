package com.bytedance.android.livesdk.like.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.AbstractC9170d;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;

public class LikeUserInfoAnimWidget extends LiveRecyclableWidget implements AbstractC9170d, AbstractC33974au {

    /* renamed from: e */
    private static final float f22369e;

    /* renamed from: a */
    public View f22370a;

    /* renamed from: b */
    public ProgressBar f22371b;

    /* renamed from: c */
    public LottieAnimationView f22372c;

    /* renamed from: d */
    public View f22373d;

    /* renamed from: f */
    private ValueAnimator f22374f;

    /* renamed from: g */
    private ObjectAnimator f22375g;

    /* renamed from: h */
    private ObjectAnimator f22376h;

    /* renamed from: i */
    private int f22377i;

    /* renamed from: j */
    private int f22378j;

    /* renamed from: k */
    private AnimatorSet f22379k;

    /* renamed from: l */
    private AnimatorSet f22380l;

    /* renamed from: m */
    private Keyframe[] f22381m;

    /* renamed from: n */
    private AnimatorSet f22382n;

    /* renamed from: o */
    private Keyframe[] f22383o;

    /* renamed from: p */
    private ImageView f22384p;

    /* renamed from: q */
    private TextView f22385q;

    /* renamed from: r */
    private AnimatorSet f22386r;

    /* renamed from: s */
    private Property<View, Integer> f22387s;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        float f;
        Covode.recordClassIndex(10097);
        if (C6229a.m13521a(C3966y.m9669e())) {
            f = -18.0f;
        } else {
            f = 18.0f;
        }
        f22369e = f;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        if (((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue()) {
            return R.layout.bae;
        }
        return R.layout.baf;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        AbstractC9168b likeHelper;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null && (likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(room.getId())) != null && likeHelper.mo15295n() && likeHelper.mo15293l()) {
            likeHelper.mo15280b(this);
        }
        AnimatorSet animatorSet = this.f22386r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f22374f.cancel();
        this.f22375g.cancel();
        this.f22376h.cancel();
        this.f22379k.cancel();
        this.f22380l.cancel();
        this.f22372c.mo5836d();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        AbstractC9168b likeHelper;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null && (likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(room.getId())) != null && likeHelper.mo15295n() && likeHelper.mo15293l()) {
            likeHelper.mo15271a(this);
        }
        this.f22373d.setVisibility(8);
        if (!(room == null || room.getOwner() == null)) {
            C7577g.m15570a(this.f22384p, room.getOwner().getAvatarThumb(), 2131234441);
            this.f22384p.setOnClickListener(new View$OnClickListenerC9237a(room));
        }
        this.f22370a.setScaleX(0.0f);
        this.f22370a.setScaleY(0.0f);
        this.f22370a.setRotation(0.0f);
        this.f22371b.setAlpha(0.0f);
        this.f22371b.setProgress(0);
        this.f22372c.setVisibility(4);
        this.f22377i = 0;
        this.f22378j = 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f22370a = findViewById(R.id.bep);
        this.f22371b = (ProgressBar) findViewById(R.id.d_3);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.zk);
        this.f22372c = lottieAnimationView;
        lottieAnimationView.setImageAssetsFolder("like/bubble/images");
        this.f22372c.mo5828a(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget.C91901 */

            static {
                Covode.recordClassIndex(10098);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LikeUserInfoAnimWidget.this.f22372c.setVisibility(4);
            }
        });
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1200);
        this.f22374f = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget.C91912 */

            static {
                Covode.recordClassIndex(10099);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float f2 = 0.0f;
                if (intValue >= 0) {
                    if (intValue < 200) {
                        LikeUserInfoAnimWidget.this.f22371b.setAlpha(0.0f);
                        LikeUserInfoAnimWidget.this.f22370a.setScaleX(f2);
                        LikeUserInfoAnimWidget.this.f22370a.setScaleY(f2);
                    } else if (intValue >= 200 && intValue < 400) {
                        LikeUserInfoAnimWidget.this.f22371b.setAlpha((((float) intValue) * 0.005f) - 1.0f);
                        if (intValue >= 200 || intValue >= 450) {
                            if (intValue < 450 && intValue < 600) {
                                f = -0.0012666667f;
                            } else if (intValue >= 600 || intValue > 1200) {
                                f2 = 1.0f;
                                LikeUserInfoAnimWidget.this.f22370a.setScaleX(f2);
                                LikeUserInfoAnimWidget.this.f22370a.setScaleY(f2);
                            } else {
                                f = 6.6666704E-5f;
                            }
                            f2 = (((float) (intValue - 600)) * f) + 0.96f;
                            LikeUserInfoAnimWidget.this.f22370a.setScaleX(f2);
                            LikeUserInfoAnimWidget.this.f22370a.setScaleY(f2);
                        }
                        f2 = 0.0046f * ((float) (intValue - 200));
                        LikeUserInfoAnimWidget.this.f22370a.setScaleX(f2);
                        LikeUserInfoAnimWidget.this.f22370a.setScaleY(f2);
                    }
                }
                LikeUserInfoAnimWidget.this.f22371b.setAlpha(1.0f);
                if (intValue >= 200) {
                }
                if (intValue < 450) {
                }
                if (intValue >= 600) {
                }
                f2 = 1.0f;
                LikeUserInfoAnimWidget.this.f22370a.setScaleX(f2);
                LikeUserInfoAnimWidget.this.f22370a.setScaleY(f2);
            }
        });
        this.f22374f.setDuration(1200L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22370a, "rotation", 0.0f, f22369e, 0.0f);
        this.f22375g = ofFloat;
        ofFloat.setDuration(200L);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f22370a, PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.6f, 1.7f), Keyframe.ofFloat(1.0f, 1.5f)), PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.6f, 1.7f), Keyframe.ofFloat(1.0f, 1.5f)));
        this.f22376h = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(200L);
        this.f22381m = new Keyframe[]{Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.375f, 1.15f), Keyframe.ofFloat(1.0f, 0.0f)};
        AnimatorSet animatorSet = new AnimatorSet();
        this.f22380l = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofPropertyValuesHolder(this.f22371b, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, this.f22370a.getAlpha()), Keyframe.ofFloat(0.5f, 0.0f))));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22379k = animatorSet2;
        animatorSet2.setDuration(400L);
        this.f22383o = new Keyframe[]{Keyframe.ofFloat(0.0f, 1.5f), Keyframe.ofFloat(0.375f, 1.7f), Keyframe.ofFloat(1.0f, 0.0f)};
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f22382n = animatorSet3;
        animatorSet3.setDuration(400L);
        this.f22373d = findViewById(R.id.ed8);
        this.f22384p = (ImageView) findViewById(R.id.ed7);
        this.f22385q = (TextView) findViewById(R.id.ed9);
        this.f22387s = new Property<View, Integer>(Integer.class, "width") {
            /* class com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget.C91923 */

            static {
                Covode.recordClassIndex(10100);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // android.util.Property
            public final /* synthetic */ Integer get(View view) {
                return Integer.valueOf(view.getLayoutParams().width);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // android.util.Property
            public final /* synthetic */ void set(View view, Integer num) {
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.width = num.intValue();
                view2.setLayoutParams(layoutParams);
            }
        };
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10821a(AbstractC9168b bVar, int i) {
        ObjectAnimator ofPropertyValuesHolder;
        ObjectAnimator ofPropertyValuesHolder2;
        ObjectAnimator ofPropertyValuesHolder3;
        ObjectAnimator ofPropertyValuesHolder4;
        if (bVar.mo15296o()) {
            if (i >= bVar.mo15284d()) {
                if (this.f22376h.isRunning()) {
                    this.f22376h.cancel();
                    View view = this.f22370a;
                    ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, view.getScaleX()), Keyframe.ofFloat(1.0f, 0.0f)));
                    View view2 = this.f22370a;
                    ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, view2.getScaleY()), Keyframe.ofFloat(1.0f, 0.0f)));
                } else {
                    ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this.f22370a, PropertyValuesHolder.ofKeyframe("scaleX", this.f22383o));
                    ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this.f22370a, PropertyValuesHolder.ofKeyframe("scaleY", this.f22383o));
                }
                this.f22382n.playTogether(ofPropertyValuesHolder3, ofPropertyValuesHolder4, this.f22380l);
                this.f22382n.start();
                AnimatorSet animatorSet = this.f22386r;
                if (animatorSet != null) {
                    animatorSet.cancel();
                } else {
                    this.f22386r = new AnimatorSet();
                }
                TextView textView = this.f22385q;
                textView.setText(textView.getContext().getString(R.string.ek2, C11266h.m19966a(i)));
                this.f22373d.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(this.f22373d, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.15384616f, 1.0f)), PropertyValuesHolder.ofKeyframe(this.f22387s, Keyframe.ofInt(0.0f, C3966y.m9653a(36.0f)), Keyframe.ofInt(0.07692308f, C3966y.m9653a(36.0f)), Keyframe.ofInt(1.0f, this.f22373d.getMeasuredWidth())));
                ofPropertyValuesHolder5.setInterpolator(new DecelerateInterpolator());
                ofPropertyValuesHolder5.setDuration(1300L);
                ViewGroup.LayoutParams layoutParams = this.f22385q.getLayoutParams();
                layoutParams.width = this.f22373d.getMeasuredWidth();
                this.f22385q.setLayoutParams(layoutParams);
                ObjectAnimator ofPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(this.f22373d, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f)), PropertyValuesHolder.ofKeyframe(this.f22387s, Keyframe.ofInt(0.0f, this.f22373d.getMeasuredWidth()), Keyframe.ofInt(1.0f, C3966y.m9653a(36.0f))));
                ofPropertyValuesHolder6.setInterpolator(new DecelerateInterpolator());
                ofPropertyValuesHolder6.setDuration(1000L);
                ofPropertyValuesHolder6.setStartDelay(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                this.f22386r.playSequentially(ofPropertyValuesHolder5, ofPropertyValuesHolder6);
                this.f22386r.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget.C91934 */

                    static {
                        Covode.recordClassIndex(10101);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        LikeUserInfoAnimWidget.this.f22373d.setVisibility(8);
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        LikeUserInfoAnimWidget.this.f22373d.setVisibility(0);
                    }
                });
                this.f22386r.start();
            } else if (i >= bVar.mo15282c()) {
                if (this.f22374f.isRunning()) {
                    this.f22374f.cancel();
                    View view3 = this.f22370a;
                    ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view3, PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(0.0f, view3.getScaleX()), Keyframe.ofFloat(1.0f, 0.0f)));
                    View view4 = this.f22370a;
                    ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view4, PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(0.0f, view4.getScaleY()), Keyframe.ofFloat(1.0f, 0.0f)));
                } else {
                    ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f22370a, PropertyValuesHolder.ofKeyframe("scaleX", this.f22381m));
                    ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f22370a, PropertyValuesHolder.ofKeyframe("scaleY", this.f22381m));
                }
                this.f22379k.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2, this.f22380l);
                this.f22379k.start();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10822a(AbstractC9168b bVar, int i, int i2, float f, float f2, float f3, float f4) {
        if (bVar.mo15296o()) {
            if (i2 >= bVar.mo15284d()) {
                if (this.f22378j != i) {
                    this.f22378j = i;
                    if (this.f22374f.isRunning()) {
                        this.f22371b.setProgress(100);
                        this.f22371b.setAlpha(1.0f);
                        this.f22374f.cancel();
                    }
                    this.f22376h.start();
                }
                this.f22375g.start();
                if (!this.f22372c.f5900b.mo6025g()) {
                    this.f22372c.setVisibility(0);
                    if (i2 == bVar.mo15284d()) {
                        this.f22372c.setAnimation("like/bubble/full_progress_bubbles.json");
                    } else {
                        this.f22372c.setAnimation("like/bubble/like_after_full_progress_bubbles.json");
                    }
                    this.f22372c.mo5826a();
                }
            } else if (i2 >= bVar.mo15282c()) {
                if (this.f22377i != i) {
                    this.f22377i = i;
                    this.f22374f.start();
                }
                this.f22375g.start();
                this.f22371b.setProgress((int) ((100.0f / ((float) (bVar.mo15284d() - bVar.mo15282c()))) * ((float) (i2 - bVar.mo15282c()))));
            }
        }
    }
}
