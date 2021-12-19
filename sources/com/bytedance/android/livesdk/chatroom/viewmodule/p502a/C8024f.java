package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.AbstractC6189w;
import com.bytedance.android.live.slot.C6165ah;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.f */
public final class C8024f implements AbstractView$OnClickListenerC5841f, IIconSlot.AbstractC6148a {

    /* renamed from: a */
    AbstractC1204m f19996a;

    /* renamed from: b */
    public Context f19997b;

    /* renamed from: c */
    AbstractC6189w f19998c;

    /* renamed from: d */
    public View f19999d;

    /* renamed from: e */
    public View f20000e;

    /* renamed from: f */
    public TextView f20001f;

    /* renamed from: g */
    public ImageView f20002g;

    /* renamed from: h */
    long f20003h;

    /* renamed from: i */
    IIconSlot.SlotViewModel f20004i;

    /* renamed from: j */
    IIconSlot.EnumC6150c f20005j;

    /* renamed from: k */
    LiveTextView f20006k;

    /* renamed from: l */
    private ImageView f20007l;

    /* renamed from: m */
    private boolean f20008m;

    static {
        Covode.recordClassIndex(8831);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    public final void onClick(View view) {
    }

    /* renamed from: a */
    public final void mo14309a() {
        this.f20002g.setVisibility(8);
        this.f20001f.setVisibility(8);
        this.f20000e.setVisibility(8);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8828a(IIconSlot.EnumC6150c cVar) {
        this.f20005j = cVar;
    }

    public C8024f(Context context, AbstractC1204m mVar) {
        this.f19997b = context;
        this.f19996a = mVar;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8830a(C6165ah ahVar, IIconSlot.SlotViewModel slotViewModel) {
        mo8829a(ahVar.f15398b, slotViewModel);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        IIconSlot.SlotViewModel slotViewModel = this.f20004i;
        if (slotViewModel != null) {
            slotViewModel.mo12057a(this.f19996a);
        }
        AbstractC6189w wVar = this.f19998c;
        if (wVar != null) {
            wVar.onDestroy();
            this.f19996a.getLifecycle().mo4013b(this.f19998c);
        }
    }

    /* renamed from: a */
    public final void mo14310a(Drawable drawable, Drawable drawable2) {
        if (!this.f20008m || drawable2 == null) {
            this.f20007l.setImageDrawable(drawable);
        } else {
            this.f20007l.setImageDrawable(drawable2);
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        this.f20008m = Boolean.TRUE.equals(dataChannel.mo28318b(C9114dz.class));
        this.f19999d = view;
        this.f20007l = (ImageView) view.findViewById(R.id.ekf);
        this.f20001f = (TextView) view.findViewById(R.id.ek_);
        this.f20002g = (ImageView) view.findViewById(R.id.ek9);
        this.f20000e = view.findViewById(R.id.ekc);
        this.f19999d.setVisibility(8);
        if (this.f20008m) {
            this.f20006k = (LiveTextView) view.findViewById(R.id.ekj);
        }
        C6203g.m13467b(new RunnableC8033g(this, dataChannel), null);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8829a(final AbstractC6157ab abVar, final IIconSlot.SlotViewModel slotViewModel) {
        this.f20004i = slotViewModel;
        if (slotViewModel != null && this.f19999d != null) {
            slotViewModel.f15350a.setValue(true);
            slotViewModel.f15351b.observe(this.f19996a, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f.C80251 */

                static {
                    Covode.recordClassIndex(8832);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    int i;
                    View view = C8024f.this.f19999d;
                    if (Boolean.TRUE.equals(bool)) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    view.setVisibility(i);
                    if (Boolean.TRUE.equals(bool)) {
                        abVar.mo12073a("during_live");
                    }
                }
            });
            slotViewModel.f15357h.observe(this.f19996a, new AbstractC1214u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f.C80262 */

                static {
                    Covode.recordClassIndex(8833);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    int i;
                    Drawable drawable2 = drawable;
                    C8024f.this.mo14309a();
                    ImageView imageView = C8024f.this.f20002g;
                    if (drawable2 == null) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                    C8024f.this.f20002g.setImageDrawable(drawable2);
                }
            });
            slotViewModel.f15353d.observe(this.f19996a, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f.C80273 */

                static {
                    Covode.recordClassIndex(8834);
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
                        C8024f.this.mo14309a();
                        View view = C8024f.this.f20000e;
                        if (!bool2.booleanValue()) {
                            i = 8;
                        }
                        view.setVisibility(i);
                    }
                }
            });
            slotViewModel.f15352c.observe(this.f19996a, new AbstractC1214u<String>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f.C80284 */

                static {
                    Covode.recordClassIndex(8835);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(String str) {
                    int i;
                    String str2 = str;
                    if (slotViewModel.f15357h.getValue() == null) {
                        C8024f.this.mo14309a();
                        TextView textView = C8024f.this.f20001f;
                        if (TextUtils.isEmpty(str2)) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        textView.setVisibility(i);
                        C8024f.this.f20001f.setText(str2);
                    }
                }
            });
            slotViewModel.f15354e.observe(this.f19996a, new AbstractC1214u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f.C80295 */

                static {
                    Covode.recordClassIndex(8836);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    C8024f.this.mo14310a(drawable, slotViewModel.f15355f.getValue());
                }
            });
            slotViewModel.f15355f.observe(this.f19996a, new AbstractC1214u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f.C80306 */

                static {
                    Covode.recordClassIndex(8837);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    C8024f.this.mo14310a(slotViewModel.f15354e.getValue(), drawable);
                }
            });
            if (this.f20008m) {
                slotViewModel.f15358i.observe(this.f19996a, new C8034h(this));
            }
            slotViewModel.f15360k.observe(this.f19996a, new AbstractC1214u<String>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f.C80317 */

                static {
                    Covode.recordClassIndex(8838);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(String str) {
                    String str2 = str;
                    if (Boolean.TRUE.equals(slotViewModel.f15351b.getValue())) {
                        C8024f fVar = C8024f.this;
                        long j = slotViewModel.f15362m;
                        C4097j.m9928a(fVar.f20003h);
                        fVar.f20003h = C4097j.m9923a(fVar.f19999d, str2, j);
                    }
                }
            });
            this.f19999d.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.p502a.C8024f.View$OnClickListenerC80328 */

                static {
                    Covode.recordClassIndex(8839);
                }

                public final void onClick(View view) {
                    IIconSlot iIconSlot = (IIconSlot) abVar.mo12079f();
                    if (iIconSlot != null) {
                        AbstractC6162ae a = iIconSlot.mo12055a();
                        if (a != null) {
                            a.mo12082a(C8024f.this.f19999d, "during_live");
                        } else if (!TextUtils.isEmpty(null)) {
                            ((IHostAction) C6193a.m13435a(IHostAction.class)).openLiveBrowser((String) null, slotViewModel.f15358i.getValue(), C8024f.this.f19997b);
                        }
                    }
                }
            });
        }
    }
}
