package com.bytedance.android.livesdk.dialogv2.widget;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.C6909bi;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.model.C9914v;
import com.bytedance.android.livesdk.olddialog.widget.C10071u;
import com.bytedance.android.livesdk.olddialog.widget.C10072v;
import com.bytedance.android.livesdk.service.p624b.C10696a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.widget.a */
public final class C8406a extends RecyclerView.AbstractC1350a<C10072v> {

    /* renamed from: a */
    public LiveGiftDialogViewModel f20785a;

    /* renamed from: b */
    public AbstractC8407a f20786b;

    /* renamed from: c */
    View f20787c;

    /* renamed from: d */
    int f20788d;

    /* renamed from: e */
    DataChannel f20789e;

    /* renamed from: f */
    private List<? extends C10071u> f20790f = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.a$a */
    public interface AbstractC8407a {
        static {
            Covode.recordClassIndex(9250);
        }

        /* renamed from: a */
        void mo14703a(boolean z);
    }

    static {
        Covode.recordClassIndex(9249);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C10072v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m16613a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<? extends C10071u> list = this.f20790f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo14724a() {
        List<? extends C10071u> list = this.f20790f;
        if (!(list == null || list.size() == 0)) {
            List<? extends C10071u> list2 = this.f20790f;
            if (list2 == null) {
                C89219l.m154715b();
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                List<? extends C10071u> list3 = this.f20790f;
                if (list3 == null) {
                    C89219l.m154715b();
                }
                if (((C10071u) list3.get(i)).f24479b == this.f20788d) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo14726a(List<? extends C10071u> list) {
        int i;
        C1213t<Integer> tVar;
        Integer value;
        this.f20790f = list;
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20785a;
        if (liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f20705a) == null || (value = tVar.getValue()) == null) {
            i = 0;
        } else {
            i = value.intValue();
        }
        this.f20788d = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        C10071u uVar;
        List<? extends C10071u> list = this.f20790f;
        if (list == null || (uVar = (C10071u) list.get(i)) == null) {
            return 0;
        }
        return uVar.f24479b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14725a(int i) {
        C1213t<Integer> tVar;
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20785a;
        if (!(liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f20705a) == null)) {
            tVar.setValue(Integer.valueOf(i));
        }
        this.f20788d = i;
        if (i == 5) {
            AbstractC8407a aVar = this.f20786b;
            if (aVar != null) {
                aVar.mo14703a(false);
            }
        } else {
            AbstractC8407a aVar2 = this.f20786b;
            if (aVar2 != null) {
                aVar2.mo14703a(true);
            }
        }
        List<? extends C10071u> list = this.f20790f;
        if (list != null) {
            for (C10071u uVar : list) {
                if (uVar.f24479b == i) {
                    String str = uVar.f24478a;
                    C89219l.m154716b(str, "");
                    C10715e.m19283b(str);
                    return;
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.a$b */
    static final class View$OnClickListenerC8408b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8406a f20791a;

        /* renamed from: b */
        final /* synthetic */ C10072v f20792b;

        static {
            Covode.recordClassIndex(9251);
        }

        View$OnClickListenerC8408b(C8406a aVar, C10072v vVar) {
            this.f20791a = aVar;
            this.f20792b = vVar;
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C8406a aVar = this.f20791a;
            C9914v vVar = this.f20792b.f24481a;
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            if (intValue != aVar.f20788d) {
                if (aVar.f20787c != null && (aVar.f20787c instanceof TextView)) {
                    View view2 = aVar.f20787c;
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) view2).setTextColor(Color.parseColor("#88FFFFFF"));
                }
                aVar.f20787c = view;
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(Color.parseColor("#E6FFFFFF"));
                }
                if (vVar == null || !vVar.mo16616a()) {
                    DataChannel dataChannel = aVar.f20789e;
                    if (dataChannel != null) {
                        C10696a.EnumC10697a aVar2 = C10696a.EnumC10697a.TAB_EMPTY_EVENT;
                        C9914v vVar2 = C9914v.f24032d;
                        C89219l.m154716b(vVar2, "");
                        dataChannel.mo28320c(C6909bi.class, new C10696a(aVar2, vVar2));
                    }
                } else {
                    DataChannel dataChannel2 = aVar.f20789e;
                    if (dataChannel2 != null) {
                        dataChannel2.mo28320c(C6909bi.class, new C10696a(C10696a.EnumC10697a.TAB_EVENT, vVar));
                    }
                }
                C8374a.C8375a.C8376a.f20718a.f20713g = intValue;
                aVar.mo14725a(intValue);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m16613a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4432);
        C89219l.m154721d(viewGroup, "");
        LiveTextView liveTextView = new LiveTextView(viewGroup.getContext());
        liveTextView.setTextSize(14.0f);
        liveTextView.setGravity(17);
        liveTextView.setTag(Integer.valueOf(i));
        RecyclerView.C1367j jVar = new RecyclerView.C1367j(-2, -2);
        jVar.rightMargin = C3966y.m9653a(16.0f);
        liveTextView.setLayoutParams(jVar);
        C10072v vVar = new C10072v(liveTextView);
        try {
            if (vVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(vVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) vVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(vVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = vVar.getClass().getName();
        MethodCollector.m26664o(4432);
        return vVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r0 == null) goto L_0x0076;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.bytedance.android.livesdk.olddialog.widget.C10072v r7, int r8) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.widget.C8406a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
