package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.C4334j;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p603q.C10146j;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.widgets.giftwidget.p661a.C11441a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.a */
public final class C11443a extends AbstractC11293v {

    /* renamed from: a */
    public C10146j.AbstractC10147a f27457a;

    /* renamed from: b */
    public boolean f27458b;

    /* renamed from: c */
    private final C88411a f27459c = new C88411a();

    /* renamed from: d */
    private HashMap f27460d;

    static {
        Covode.recordClassIndex(13102);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f27460d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f27460d == null) {
            this.f27460d = new HashMap();
        }
        View view = (View) this.f27460d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f27460d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.f27458b) {
            C10146j.m18652a(false);
        }
        this.f27459c.mo142944a();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        int i;
        int i2;
        if (this.f27010p != null) {
            DataChannel dataChannel = this.f27010p;
            if (dataChannel == null) {
                C89219l.m154715b();
            }
            Object b = dataChannel.mo28318b(C9076co.class);
            if (b == null) {
                C89219l.m154715b();
            }
            if (!((Boolean) b).booleanValue()) {
                i2 = R.layout.b5j;
                i = 5;
                AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(i2);
                bVar.f27015b = R.style.a2v;
                bVar.f27025l = 48;
                bVar.f27020g = i;
                return bVar;
            }
        }
        i2 = R.layout.b5i;
        i = 17;
        AbstractC11293v.C11295b bVar2 = new AbstractC11293v.C11295b(i2);
        bVar2.f27015b = R.style.a2v;
        bVar2.f27025l = 48;
        bVar2.f27020g = i;
        return bVar2;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean z;
        Window window;
        super.onStart();
        if (this.f27010p != null) {
            DataChannel dataChannel = this.f27010p;
            if (dataChannel == null) {
                C89219l.m154715b();
            }
            Object b = dataChannel.mo28318b(C9076co.class);
            if (b == null) {
                C89219l.m154715b();
            }
            boolean booleanValue = ((Boolean) b).booleanValue();
            if (!booleanValue || !C3931d.m9571a(getContext())) {
                z = false;
            } else {
                z = true;
            }
            Dialog dialog = getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                if (!booleanValue || !C3931d.m9571a(getContext())) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
                if (z) {
                    window.setLayout(-1, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = C3966y.m9664c();
                    attributes.height = C3966y.m9662b() - C3966y.m9666d();
                    window.setAttributes(attributes);
                } else {
                    window.setLayout(-1, -1);
                }
            }
            C6779a.m14563a().mo13053a(new C4334j());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.a$a */
    static final class View$OnClickListenerC11444a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11443a f27461a;

        static {
            Covode.recordClassIndex(13103);
        }

        View$OnClickListenerC11444a(C11443a aVar) {
            this.f27461a = aVar;
        }

        public final void onClick(View view) {
            this.f27461a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.a$c */
    static final class View$OnClickListenerC11446c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11443a f27464a;

        static {
            Covode.recordClassIndex(13105);
        }

        View$OnClickListenerC11446c(C11443a aVar) {
            this.f27464a = aVar;
        }

        public final void onClick(View view) {
            this.f27464a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.a$d */
    static final class C11447d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C11443a f27465a;

        static {
            Covode.recordClassIndex(13106);
        }

        C11447d(C11443a aVar) {
            this.f27465a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f27465a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.a$b */
    static final class View$OnClickListenerC11445b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9904t f27462a;

        /* renamed from: b */
        final /* synthetic */ C11443a f27463b;

        static {
            Covode.recordClassIndex(13104);
        }

        View$OnClickListenerC11445b(C9904t tVar, C11443a aVar) {
            this.f27462a = tVar;
            this.f27463b = aVar;
        }

        public final void onClick(View view) {
            C10146j.AbstractC10147a aVar = this.f27463b.f27457a;
            if (aVar != null) {
                aVar.mo16988a();
            }
            this.f27463b.f27458b = true;
            C10146j.m18652a(true);
            this.f27463b.dismissAllowingStateLoss();
            long j = this.f27462a.f23999d;
            C6805b<Set<String>> bVar = AbstractC6804a.f16894W;
            C89219l.m154716b(bVar, "");
            Set<String> a = bVar.mo13066a();
            if (a == null) {
                a = new HashSet<>();
            }
            a.add(String.valueOf(j));
            C6805b<Set<String>> bVar2 = AbstractC6804a.f16894W;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a(bVar2, a);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        String str;
        Room room;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        GiftManager inst = GiftManager.inst();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room.getId();
        }
        C9904t fastGift = inst.getFastGift(j);
        if (fastGift != null) {
            C3951p.m9630b((ImageView) mo8166a_(R.id.azd), fastGift.f23997b);
            LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.aze);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(fastGift.f23996a);
            LiveTextView liveTextView2 = (LiveTextView) mo8166a_(R.id.bag);
            C89219l.m154716b(liveTextView2, "");
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.ehk, Integer.valueOf(fastGift.f24001f));
            } else {
                str = null;
            }
            liveTextView2.setText(str);
            ((ImageView) mo8166a_(R.id.a0y)).setOnClickListener(new View$OnClickListenerC11444a(this));
            ((LiveTextView) mo8166a_(R.id.bag)).setOnClickListener(new View$OnClickListenerC11445b(fastGift, this));
        }
        ((ConstraintLayout) mo8166a_(R.id.am6)).setOnClickListener(new View$OnClickListenerC11446c(this));
        this.f27459c.mo142945a(C6779a.m14563a().mo13052a(C11441a.class).mo143289d(new C11447d(this)));
    }
}
