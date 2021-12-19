package com.bytedance.android.livesdk.p604qa;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.ay */
public final class C10237ay extends AbstractC11293v {

    /* renamed from: a */
    private HashMap f24770a;

    static {
        Covode.recordClassIndex(11803);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f24770a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f24770a == null) {
            this.f24770a = new HashMap();
        }
        View view = (View) this.f24770a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f24770a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.bcs);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.a2c;
        bVar.f27020g = 80;
        bVar.f27022i = -2;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ay$b */
    static final class View$OnClickListenerC10239b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10237ay f24772a;

        static {
            Covode.recordClassIndex(11805);
        }

        View$OnClickListenerC10239b(C10237ay ayVar) {
            this.f24772a = ayVar;
        }

        public final void onClick(View view) {
            this.f24772a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ay$a */
    static final class C10238a extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10237ay f24771a;

        static {
            Covode.recordClassIndex(11804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10238a(C10237ay ayVar) {
            super(1);
            this.f24771a = ayVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f24771a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C3018a.class, (AbstractC89172b) new C10238a(this));
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f27010p;
        if (!(dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9119ed.class)) == null || bool.booleanValue())) {
            LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.title);
            if (liveTextView != null) {
                liveTextView.setText(R.string.eh_);
            }
            LiveTextView liveTextView2 = (LiveTextView) mo8166a_(R.id.acq);
            if (liveTextView2 != null) {
                liveTextView2.setText(R.string.eh7);
            }
        }
        LiveButton liveButton = (LiveButton) mo8166a_(R.id.axy);
        if (liveButton != null) {
            liveButton.setOnClickListener(new View$OnClickListenerC10239b(this));
        }
    }
}
