package com.bytedance.android.livesdk.olddialog;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.p218f.p219a.C3889a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10011a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10027g;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.wallet.C11315d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.C24296c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.olddialog.f */
final /* synthetic */ class C10002f implements AbstractC88433f {

    /* renamed from: a */
    private final C9991a f24299a;

    static {
        Covode.recordClassIndex(11556);
    }

    C10002f(C9991a aVar) {
        this.f24299a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C9991a aVar = this.f24299a;
        C11315d dVar = (C11315d) obj;
        if (dVar != null) {
            aVar.f24275e = dVar.f27066b;
            LiveNewGiftBottomWidget liveNewGiftBottomWidget = aVar.f24272b;
            int i = aVar.f24275e;
            File tTLiveGeckoResourceFile = ((IHostContext) C6193a.m13435a(IHostContext.class)).getTTLiveGeckoResourceFile("tiktok_live_basic_resource", "ttlive_recharge_anim.webp");
            if (tTLiveGeckoResourceFile != null) {
                HSImageView hSImageView = (HSImageView) liveNewGiftBottomWidget.findViewById(R.id.byv);
                hSImageView.setVisibility(0);
                C3889a a = C3889a.m9507a(hSImageView.getContext()).mo9250a(tTLiveGeckoResourceFile).mo9249a(ImageView.ScaleType.CENTER_CROP);
                a.f10759h = true;
                a.f10753b = new C24202c(i) {
                    /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftBottomWidget.C100431 */

                    /* renamed from: a */
                    final /* synthetic */ int f24407a;

                    static {
                        Covode.recordClassIndex(11601);
                    }

                    {
                        this.f24407a = r2;
                    }

                    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                        if (animatable instanceof C24290a) {
                            ((C24290a) animatable).mo40070a(new C24296c() {
                                /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftBottomWidget.C100431.C100441 */

                                static {
                                    Covode.recordClassIndex(11602);
                                }

                                @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
                                /* renamed from: b */
                                public final void mo9285b(C24290a aVar) {
                                    LiveNewGiftBottomWidget liveNewGiftBottomWidget = LiveNewGiftBottomWidget.this;
                                    String concat = "+".concat(String.valueOf(C100431.this.f24407a));
                                    TextView textView = (TextView) liveNewGiftBottomWidget.findViewById(R.id.gi);
                                    textView.setText(concat);
                                    textView.setVisibility(0);
                                    ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(400L);
                                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f).setDuration(350L);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.play(duration);
                                    animatorSet.play(duration2).after(700);
                                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -35.0f).setDuration(300L);
                                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(textView, "translationY", -35.0f, -40.0f).setDuration(700L);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    animatorSet2.play(duration3);
                                    animatorSet2.play(duration4).after(300);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    animatorSet3.playTogether(animatorSet, animatorSet2);
                                    animatorSet3.start();
                                }
                            });
                        }
                    }
                };
                a.mo9252a(hSImageView);
            }
            AbstractC10004a aVar2 = aVar.f24271a.f24422f;
            if (aVar2.f24301a instanceof C10027g) {
                ((C10027g) aVar2.f24301a).mo16855a();
            } else if (aVar2.f24301a instanceof C10011a) {
                ((C10011a) aVar2.f24301a).mo16842f();
            }
            C6501b.C6502a.m13948a("livesdk_recharge_success_anime").mo12639a().mo12655b();
        }
    }
}
