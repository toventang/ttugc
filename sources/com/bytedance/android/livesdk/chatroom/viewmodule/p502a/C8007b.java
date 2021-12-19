package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.AbstractC6189w;
import com.bytedance.android.live.slot.C6160ac;
import com.bytedance.android.live.slot.C6165ah;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.b */
public final class C8007b implements AbstractView$OnClickListenerC5841f, IIconSlot.AbstractC6148a {

    /* renamed from: a */
    AbstractC1204m f19951a;

    /* renamed from: b */
    public Context f19952b;

    /* renamed from: c */
    AbstractC6189w f19953c;

    /* renamed from: d */
    public View f19954d;

    /* renamed from: e */
    public LottieAnimationView f19955e;

    /* renamed from: f */
    public View f19956f;

    /* renamed from: g */
    public View f19957g;

    /* renamed from: h */
    public TextView f19958h;

    /* renamed from: i */
    public ImageView f19959i;

    /* renamed from: j */
    long f19960j;

    /* renamed from: k */
    IIconSlot.SlotViewModel f19961k;

    /* renamed from: l */
    IIconSlot.EnumC6150c f19962l;

    /* renamed from: m */
    LiveTextView f19963m;

    /* renamed from: n */
    private ImageView f19964n;

    /* renamed from: o */
    private boolean f19965o;

    static {
        Covode.recordClassIndex(8814);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    public final void onClick(View view) {
    }

    /* renamed from: a */
    public final void mo14301a() {
        this.f19959i.setVisibility(8);
        this.f19958h.setVisibility(8);
        this.f19957g.setVisibility(8);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8828a(IIconSlot.EnumC6150c cVar) {
        this.f19962l = cVar;
    }

    public C8007b(Context context, AbstractC1204m mVar) {
        this.f19952b = context;
        this.f19951a = mVar;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8830a(C6165ah ahVar, IIconSlot.SlotViewModel slotViewModel) {
        mo8829a(ahVar.f15398b, slotViewModel);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        IIconSlot.SlotViewModel slotViewModel = this.f19961k;
        if (slotViewModel != null) {
            slotViewModel.mo12057a(this.f19951a);
        }
        AbstractC6189w wVar = this.f19953c;
        if (wVar != null) {
            wVar.onDestroy();
            this.f19951a.getLifecycle().mo4013b(this.f19953c);
        }
    }

    /* renamed from: a */
    public final void mo14302a(Drawable drawable, Drawable drawable2) {
        if (!this.f19965o || drawable2 == null) {
            this.f19964n.setImageDrawable(drawable);
        } else {
            this.f19964n.setImageDrawable(drawable2);
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        this.f19965o = Boolean.TRUE.equals(dataChannel.mo28318b(C9114dz.class));
        this.f19956f = view;
        this.f19964n = (ImageView) view.findViewById(R.id.ekf);
        this.f19958h = (TextView) view.findViewById(R.id.ek_);
        this.f19959i = (ImageView) view.findViewById(R.id.ek9);
        this.f19957g = view.findViewById(R.id.ekc);
        this.f19955e = (LottieAnimationView) view.findViewById(R.id.eka);
        this.f19954d = view.findViewById(R.id.ekb);
        this.f19956f.setVisibility(8);
        if (this.f19965o) {
            this.f19963m = (LiveTextView) view.findViewById(R.id.ekj);
        }
        C6203g.m13467b(new RunnableC8018c(this, dataChannel), null);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8829a(final AbstractC6157ab abVar, final IIconSlot.SlotViewModel slotViewModel) {
        final IIconSlot iIconSlot = (IIconSlot) abVar.mo12079f();
        this.f19961k = slotViewModel;
        if (slotViewModel != null && this.f19956f != null) {
            slotViewModel.f15350a.setValue(true);
            slotViewModel.f15351b.observe(this.f19951a, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80081 */

                static {
                    Covode.recordClassIndex(8815);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    int i;
                    String str;
                    View view = C8007b.this.f19956f;
                    if (Boolean.TRUE.equals(bool)) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    view.setVisibility(i);
                    if (Boolean.TRUE.equals(bool)) {
                        abVar.mo12073a("during_live");
                    }
                    if (Boolean.TRUE.equals(bool)) {
                        str = abVar.mo12080g();
                    } else {
                        str = "";
                    }
                    C6160ac.m13403b(str);
                }
            });
            slotViewModel.f15357h.observe(this.f19951a, new AbstractC1214u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80092 */

                static {
                    Covode.recordClassIndex(8816);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    int i;
                    Drawable drawable2 = drawable;
                    C8007b.this.mo14301a();
                    ImageView imageView = C8007b.this.f19959i;
                    if (drawable2 == null) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                    C8007b.this.f19959i.setImageDrawable(drawable2);
                }
            });
            slotViewModel.f15353d.observe(this.f19951a, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80103 */

                static {
                    Covode.recordClassIndex(8817);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    Boolean bool2 = bool;
                    int i = 0;
                    if (bool2 == null) {
                        bool2 = false;
                    }
                    if (slotViewModel.f15357h.getValue() == null && TextUtils.isEmpty(slotViewModel.f15352c.getValue())) {
                        C8007b.this.mo14301a();
                        View view = C8007b.this.f19957g;
                        if (!bool2.booleanValue()) {
                            i = 8;
                        }
                        view.setVisibility(i);
                    }
                }
            });
            slotViewModel.f15352c.observe(this.f19951a, new AbstractC1214u<String>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80114 */

                static {
                    Covode.recordClassIndex(8818);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(String str) {
                    int i;
                    String str2 = str;
                    if (slotViewModel.f15357h.getValue() == null) {
                        C8007b.this.mo14301a();
                        TextView textView = C8007b.this.f19958h;
                        if (TextUtils.isEmpty(str2)) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        textView.setVisibility(i);
                        C8007b.this.f19958h.setText(str2);
                    }
                }
            });
            slotViewModel.f15354e.observe(this.f19951a, new AbstractC1214u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80125 */

                static {
                    Covode.recordClassIndex(8819);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    C8007b.this.mo14302a(drawable, slotViewModel.f15355f.getValue());
                }
            });
            slotViewModel.f15355f.observe(this.f19951a, new AbstractC1214u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80136 */

                static {
                    Covode.recordClassIndex(8820);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    C8007b.this.mo14302a(slotViewModel.f15354e.getValue(), drawable);
                }
            });
            if (this.f19965o) {
                slotViewModel.f15358i.observe(this.f19951a, new C8019d(this));
            }
            slotViewModel.f15360k.observe(this.f19951a, new AbstractC1214u<String>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80147 */

                static {
                    Covode.recordClassIndex(8821);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(String str) {
                    String str2 = str;
                    if (Boolean.TRUE.equals(slotViewModel.f15351b.getValue())) {
                        C8007b bVar = C8007b.this;
                        long j = slotViewModel.f15362m;
                        C4097j.m9928a(bVar.f19960j);
                        bVar.f19960j = C4097j.m9923a(bVar.f19956f, str2, j);
                    }
                }
            });
            slotViewModel.f15361l.observe(this.f19951a, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80158 */

                static {
                    Covode.recordClassIndex(8822);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    if (!Boolean.TRUE.equals(slotViewModel.f15351b.getValue()) || TextUtils.isEmpty(slotViewModel.f15364o)) {
                        C8007b.this.f19955e.mo5836d();
                        C8007b.this.f19955e.setVisibility(8);
                        C8007b.this.f19954d.setVisibility(0);
                    } else if (Boolean.FALSE.equals(bool)) {
                        C8007b.this.f19955e.mo5836d();
                        C8007b.this.f19955e.setVisibility(8);
                        C8007b.this.f19954d.setVisibility(0);
                    } else {
                        C8007b.this.f19955e.setVisibility(0);
                        C8007b.this.f19954d.setVisibility(8);
                        C8007b.this.f19955e.setImageAssetsFolder(slotViewModel.f15363n);
                        C8007b.this.f19955e.setAnimation(slotViewModel.f15364o);
                        C8007b.this.f19955e.mo5828a(iIconSlot.mo12056b());
                        C8007b.this.f19955e.mo5828a(new AnimatorListenerAdapter() {
                            /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.C80158.C80161 */

                            static {
                                Covode.recordClassIndex(8823);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                            }
                        });
                        C8007b.this.f19955e.mo5826a();
                    }
                }
            });
            this.f19956f.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8007b.View$OnClickListenerC80179 */

                static {
                    Covode.recordClassIndex(8824);
                }

                public final void onClick(View view) {
                    AbstractC6162ae a = iIconSlot.mo12055a();
                    if (a != null) {
                        a.mo12082a(C8007b.this.f19956f, "during_live");
                    } else if (!TextUtils.isEmpty(null)) {
                        ((IHostAction) C6193a.m13435a(IHostAction.class)).openLiveBrowser((String) null, slotViewModel.f15358i.getValue(), C8007b.this.f19952b);
                    }
                }
            });
        }
    }
}
