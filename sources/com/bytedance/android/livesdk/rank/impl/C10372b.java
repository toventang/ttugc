package com.bytedance.android.livesdk.rank.impl;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.adminsetting.AbstractC2915b;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9090db;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.b */
public final class C10372b extends AbstractC11293v {

    /* renamed from: a */
    public static final String f25061a = C10372b.class.getSimpleName();

    /* renamed from: b */
    public static final C10373a f25062b = new C10373a((byte) 0);

    /* renamed from: c */
    private HashMap f25063c;

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f25063c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f25063c == null) {
            this.f25063c = new HashMap();
        }
        View view = (View) this.f25063c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25063c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.b$a */
    public static final class C10373a {
        static {
            Covode.recordClassIndex(11947);
        }

        private C10373a() {
        }

        public /* synthetic */ C10373a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(11946);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b74);
        bVar.f27021h = -1;
        bVar.f27022i = -2;
        bVar.f27015b = R.style.a2c;
        bVar.f27020g = 80;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.b$b */
    static final class View$OnClickListenerC10374b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10372b f25064a;

        static {
            Covode.recordClassIndex(11948);
        }

        View$OnClickListenerC10374b(C10372b bVar) {
            this.f25064a = bVar;
        }

        public final void onClick(View view) {
            this.f25064a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.b$c */
    static final class View$OnClickListenerC10375c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10372b f25065a;

        static {
            Covode.recordClassIndex(11949);
        }

        View$OnClickListenerC10375c(C10372b bVar) {
            this.f25065a = bVar;
        }

        public final void onClick(View view) {
            Boolean bool;
            AbstractC0952i childFragmentManager;
            AbstractC11293v adminSettingDialog;
            DataChannel dataChannel = this.f25065a.f27010p;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.mo28318b(C9119ed.class);
            } else {
                bool = null;
            }
            if (C11279p.m20012a(bool)) {
                DataChannel dataChannel2 = this.f25065a.f27010p;
                if (dataChannel2 != null) {
                    dataChannel2.mo28311a(C9090db.class, "pop_window");
                }
                Fragment parentFragment = this.f25065a.getParentFragment();
                if (!(parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null || (adminSettingDialog = ((AbstractC2915b) C6193a.m13435a(AbstractC2915b.class)).getAdminSettingDialog()) == null)) {
                    C89219l.m154716b(childFragmentManager, "");
                    adminSettingDialog.show(childFragmentManager, "LiveAdminSettingDialog");
                }
            } else {
                ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).openShareSettingsDialog(this.f25065a.getActivity(), "pop_window");
            }
            this.f25065a.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.mo28318b(C9076co.class);
        } else {
            bool = null;
        }
        if (C11279p.m20019b(bool)) {
            dismiss();
            return;
        }
        ((LiveButton) mo8166a_(R.id.cvz)).setOnClickListener(new View$OnClickListenerC10374b(this));
        ((LiveTextView) mo8166a_(R.id.dwx)).setOnClickListener(new View$OnClickListenerC10375c(this));
    }
}
