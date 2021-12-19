package com.bytedance.android.livesdk.function;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p037h.p039b.C0767b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.C6912bl;
import com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.event.C8453f;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.message.C9691bw;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9028av;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9098dj;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LiveRoomNotifyWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: h */
    private static final int f21578h = C3966y.m9653a(8.0f);

    /* renamed from: i */
    private static final int f21579i = C3966y.m9653a(14.0f);

    /* renamed from: a */
    public ImageView f21580a;

    /* renamed from: b */
    public TextView f21581b;

    /* renamed from: c */
    int f21582c;

    /* renamed from: d */
    public AnimatorSet f21583d;

    /* renamed from: e */
    public AnimatorSet f21584e;

    /* renamed from: f */
    public long f21585f = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: g */
    public C9691bw f21586g;

    /* renamed from: j */
    private ImageView f21587j;

    /* renamed from: k */
    private ImageView f21588k;

    /* renamed from: l */
    private AnimatorSet f21589l;

    /* renamed from: m */
    private final C88411a f21590m = new C88411a();

    /* renamed from: n */
    private boolean f21591n;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bbt;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        Covode.recordClassIndex(9620);
    }

    /* renamed from: b */
    private void m17067b() {
        AnimatorSet animatorSet = this.f21589l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f21583d;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f21584e;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        if (this.dataChannel != null) {
            this.dataChannel.mo28315b(C9028av.class, (Object) false);
        }
        getView().setAlpha(1.0f);
        hide();
        m17067b();
        this.f21589l = null;
        this.f21583d = null;
        this.f21584e = null;
        this.f21590m.mo142944a();
        this.f21586g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15026a() {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        if (this.f21589l == null || this.f21584e == null || this.f21583d == null) {
            if (C6229a.m13521a(this.context)) {
                ofFloat = ObjectAnimator.ofFloat(getView(), "translationX", (float) (-this.f21582c), 12.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(getView(), "translationX", (float) this.f21582c, -12.0f);
            }
            ofFloat.setInterpolator(C0767b.m2680a(0.01f, 0.34f, 0.07f, 1.12f));
            ofFloat.setDuration(1500L);
            if (C6229a.m13521a(this.context)) {
                ofFloat2 = ObjectAnimator.ofFloat(getView(), "translationX", 12.0f, 0.0f);
            } else {
                ofFloat2 = ObjectAnimator.ofFloat(getView(), "translationX", -12.0f, 0.0f);
            }
            ofFloat2.setInterpolator(C0767b.m2680a(0.01f, 0.34f, 0.07f, 1.12f));
            ofFloat2.setDuration(200L);
            if (C6229a.m13521a(this.context)) {
                ofFloat3 = ObjectAnimator.ofFloat(getView(), "translationX", 0.0f, (float) this.f21582c);
            } else {
                ofFloat3 = ObjectAnimator.ofFloat(getView(), "translationX", 0.0f, (float) (-this.f21582c));
            }
            ofFloat3.setInterpolator(C0767b.m2680a(0.4f, 0.0f, 0.68f, 0.06f));
            ofFloat3.setDuration(1000L);
            this.f21589l = new AnimatorSet();
            this.f21584e = new AnimatorSet();
            this.f21583d = new AnimatorSet();
            this.f21589l.playSequentially(ofFloat);
            this.f21584e.playSequentially(ofFloat2);
            this.f21583d.playSequentially(ofFloat3);
            this.f21589l.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.C87461 */

                static {
                    Covode.recordClassIndex(9621);
                }

                public final void onAnimationStart(Animator animator) {
                    LiveRoomNotifyWidget.this.show();
                }

                public final void onAnimationEnd(Animator animator) {
                    int i;
                    long j;
                    if (LiveRoomNotifyWidget.this.isViewValid()) {
                        if (LiveRoomNotifyWidget.this.f21584e != null) {
                            LiveRoomNotifyWidget.this.f21584e.start();
                        }
                        boolean z = false;
                        if (LiveRoomNotifyWidget.this.f21581b.getLayout() != null) {
                            i = ((int) LiveRoomNotifyWidget.this.f21581b.getLayout().getLineWidth(0)) - ((LiveRoomNotifyWidget.this.f21581b.getWidth() - LiveRoomNotifyWidget.this.f21581b.getPaddingLeft()) - LiveRoomNotifyWidget.this.f21581b.getPaddingRight());
                            if (i > 0) {
                                z = true;
                            }
                        } else {
                            i = 0;
                        }
                        LiveRoomNotifyWidget.this.f21585f -= 1700;
                        if (!z) {
                            View view = LiveRoomNotifyWidget.this.getView();
                            RunnableC8762g gVar = new RunnableC8762g(this);
                            if (LiveRoomNotifyWidget.this.f21585f > 0) {
                                j = LiveRoomNotifyWidget.this.f21585f;
                            } else {
                                j = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                            }
                            view.postDelayed(gVar, j);
                            return;
                        }
                        LiveRoomNotifyWidget.this.getView().postDelayed(new RunnableC8763h(this, i), 500);
                    }
                }
            });
            this.f21583d.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.C87482 */

                static {
                    Covode.recordClassIndex(9623);
                }

                public final void onAnimationEnd(Animator animator) {
                    LiveRoomNotifyWidget.this.hide();
                    LiveRoomNotifyWidget.this.f21586g = null;
                    EnumC7303c.INSTANCE.onMessageFinish();
                    if (LiveRoomNotifyWidget.this.dataChannel != null) {
                        LiveRoomNotifyWidget.this.dataChannel.mo28315b(C9028av.class, (Object) false);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        this.f21580a = (ImageView) findViewById(R.id.px);
        this.f21581b = (TextView) findViewById(R.id.cve);
        this.f21587j = (ImageView) findViewById(R.id.lb);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        int i;
        this.f21591n = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
        this.f21582c = C13628n.m24504a(this.context);
        this.dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C8756a(this)).mo28309a((AbstractC1204m) this, C9098dj.class, (AbstractC89172b) new C8757b(this));
        if (!C6912bl.f17297a) {
            mo15026a();
        }
        this.f21590m.mo142945a(C6779a.m14563a().mo13052a(C8453f.class).mo143289d(C8760e.f21615a));
        if (getView() != null) {
            if (this.f21591n) {
                i = f21578h;
            } else {
                i = f21579i;
            }
            getView().setPadding(i, 0, i, 0);
        }
        if (!((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue()) {
            this.f21590m.mo142945a(((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C8758c(this)));
        }
        this.contentView.setOnClickListener(new View$OnClickListenerC8759d(this));
    }

    /* renamed from: a */
    public final void mo15027a(C9691bw bwVar) {
        String str;
        if (bwVar != null) {
            if ((TextUtils.equals(bwVar.f23606k, "hourly_rank") || TextUtils.equals(bwVar.f23606k, "weekly_rank")) && this.dataChannel != null) {
                this.dataChannel.mo28315b(C9028av.class, (Object) true);
            }
            if (!TextUtils.equals(bwVar.f23606k, "weekly_rank") && TextUtils.isEmpty(bwVar.f23603h)) {
                findViewById(R.id.b_q).setVisibility(8);
                this.f21587j.setVisibility(8);
            } else if (TextUtils.equals(bwVar.f23606k, "gift_broadcast")) {
                findViewById(R.id.b_q).setVisibility(0);
                this.f21587j.setVisibility(8);
            } else {
                findViewById(R.id.b_q).setVisibility(8);
                this.f21587j.setVisibility(0);
            }
            this.f21588k = (ImageView) findViewById(R.id.ba4);
            if (TextUtils.equals(bwVar.f23606k, "gift_broadcast")) {
                this.f21588k.setVisibility(0);
                C3951p.m9630b(this.f21588k, bwVar.f23609n);
            } else {
                this.f21588k.setVisibility(8);
            }
            if (bwVar.mo12726a()) {
                C9698b bVar = bwVar.f28134O.f28144j;
                String str2 = bVar.f23646b;
                if (!TextUtils.isEmpty(bVar.f23645a)) {
                    str = C8983b.m17319a().mo15219a(bVar.f23645a);
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                this.f21581b.setText(C7557c.m15540a(str2, bVar, null));
            } else if (!(bwVar.f23604i == null || bwVar.f23604i.f23285c == null)) {
                this.f21581b.setText(bwVar.f23604i.f23285c.mo16594a());
            }
            if (bwVar.f23604i != null) {
                this.f21585f = bwVar.f23604i.f23286d * 1000;
            }
            m17067b();
            if (TextUtils.equals(bwVar.f23606k, "gift_broadcast")) {
                ((IGiftService) C6193a.m13435a(IGiftService.class)).monitorBroadcastMonitor(bwVar.f23607l, bwVar.f23608m);
            }
            AnimatorSet animatorSet = this.f21589l;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }
}
